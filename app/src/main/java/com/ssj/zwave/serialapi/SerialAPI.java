package com.ssj.zwave.serialapi;

import android.util.Log;

import com.ssj.zwave.callbacks.ZW_cbFunc;
import com.ssj.zwave.commandclass.ZW_ClassCommand;
import com.ssj.zwave.callbacks.SerialAPI_Callbacks;
import com.ssj.zwave.natives.SerialAPI_Native;
import com.sj.zwave.BuildConfig;
import java.util.Arrays;
import javolution.io.Struct;

/**
 * This class implement many Serial APIs and you can call those api to complete some
 * function that you want to.
 */
public class SerialAPI extends ZW_ClassCommand {

    /****************************************************************************/
    /*                     EXPORTED TYPES and DEFINITIONS                       */
    /****************************************************************************/

    /* Flags used in ZW_Func_ID.FUNC_ID_SERIAL_API_GET_INIT_DATA functionality */
    
    public static final int BUF_SIZE = (74 + 64);
    public static final byte IDX_CMD = (byte) 2;
    public static final byte IDX_DATA = (byte) 3;

    private class T_CON_TYPE {
        public static final int conIdle = 0;                    // returned if nothing special has happened
        public static final int conFrameReceived = 1;           // returned when a valid frame has been received
        public static final int conFrameSent = 2;               // returned if frame was ACKed by the other end
        public static final int conFrameErr = 3;                // returned if frame has error in Checksum
        public static final int conRxTimeout = 4;               // returned if Rx timeout has happened
        public static final int conTxTimeout = 5;               // returned if Tx timeout (waiting for ACK) ahs happened
        public static final int conTxErr = 6;                   // We got a NAK after sending
        public static final int conTxWait = 7;                  // We got a CAN while sending
    }

    private class SerialAPICpabilities extends Struct {
        public final Unsigned8 appl_version = new Unsigned8();
        public final Unsigned8 appl_revision = new Unsigned8();
        public final Unsigned8 manufactor_id1 = new Unsigned8();
        public final Unsigned8 manufactor_id2 = new Unsigned8();
        public final Unsigned8 product_type1 = new Unsigned8();
        public final Unsigned8 product_type2 = new Unsigned8();
        public final Unsigned8 product_id1 = new Unsigned8();
        public final Unsigned8 product_id2 = new Unsigned8();
        public final Unsigned8[] supported_bitmask = array(new Unsigned8[29]);
        public final Unsigned8[] nodelist = array(new Unsigned8[29]);
        public final Unsigned8 chipType = new Unsigned8();
        public final Unsigned8 chipVersion = new Unsigned8();

        public void setData(byte[] data, int offset, int length) {
            System.arraycopy(data, offset, this.getByteBuffer().array(), 0, length);
        }
    }

    SerialAPICpabilities capabilities = new SerialAPICpabilities();

    private SerialAPI_Callbacks callbacks;

    private ZW_cbFunc cbFuncZWSendData;
    private ZW_cbFunc cbFuncZWSendTestFrame;
    private ZW_cbFunc cbFuncZWSendDataBridge;
    private ZW_cbFunc cbFuncZWSendDataMulti;
    private ZW_cbFunc cbFuncZWSendNodeInformation;
    private ZW_cbFunc cbFuncMemoryPutBuffer;
    private ZW_cbFunc cbFuncZWSetDefault;
    private ZW_cbFunc cbFuncZWNewController;
    private ZW_cbFunc cbFuncRemoveNodeFromNetwork;
    private ZW_cbFunc cbFuncAddNodeToNetwork;
    private ZW_cbFunc cbFuncZWControllerChange;
    private ZW_cbFunc cbFuncZWReplicationSendData;
    private ZW_cbFunc cbFuncZWAssignReturnRoute;
    private ZW_cbFunc cbFuncZWAssignSUCReturnRoute;
    private ZW_cbFunc cbFuncZWDeleteSUCReturnRoute;
    private ZW_cbFunc cbFuncZWDeleteReturnRoute;
    private ZW_cbFunc cbFuncZWSetLearnMode;
    private ZW_cbFunc cbFuncZWSetSlaveLearnMode;
    private ZW_cbFunc cbFuncZWRequestNodeNodeNeighborUpdate;
    private ZW_cbFunc cbFuncZWSetSUCNodeID;
    private ZW_cbFunc cbFuncZWRequestNetworkUpdate;
    private ZW_cbFunc cbFuncZWRemoveFailedNode;
    private ZW_cbFunc cbFuncZWReplaceFailedNode;

    private byte[] buffer = new byte[BUF_SIZE];
    private byte[] pCmd = new byte[BUF_SIZE];
    private byte idx;
    private byte byLen;
    private volatile byte[] pData = new byte[BUF_SIZE]; //volatile
    private byte[] ppData = new byte[BUF_SIZE]; //volatile
    ZW_Basis_API.LEARN_INFO learnNodeInfo = new ZW_Basis_API.LEARN_INFO();

    private String TAG = "SERIAL_API";
    private Thread readThread;
    private byte byCompletedFunc;

    private boolean suspended = false;
    SerialAPI_Native serialAPINative;

    private String[] zw_lib_names = {
            "Unknown",
            "Static controller",
            "Bridge controller library",
            "Portable controller library",
            "Enhanced slave library",
            "Slave library",
            "Installer library",
    };

    public SerialAPI() {
        serialAPINative = new SerialAPI_Native(this);
    }

    public byte[] getpData(){
        return pData;
    }

    private boolean SupportsCommand(byte cmd){
        return ((cmd == ZW_Func_ID.FUNC_ID_SERIAL_API_GET_CAPABILITIES)
                || (capabilities.supported_bitmask[(cmd-1)>>3].get() & (1<<((cmd-1) & 0x07))) != 0);
    }

    private String byteArray2String(byte[] data, int offset) {
        byte[] str = new byte[data.length - offset];
        int i;
        byte tmp;

        for (i = 0; i < data.length - offset; i++) {
            tmp = data[i + offset];
            str[i] = tmp;
        }
        return new String(str);
    }

    private int getResponseRet(int ret) {
        return ((ret & 0xff00) >> 8);
    }

    private byte getResponseReplyLen(int ret) {
        return (byte) (ret & 0xff);
    }

    /**
     * serial port polling loop
     * this thread should be called continuously
     * all callbacks are called in this thread loop
     * */
    public void ReadThreadStart() {
        if (readThread == null) {
            readThread = new Thread() {
                public void run() {
                    while (true) {
                        SerialAPI_Poll();
                        callbacks.ApplicationPoll();
                        while (suspended) {
                            try{
                                readThread.sleep(0, 0);
                            }
                            catch (Exception e){
                                e.printStackTrace();
                            }
                        }
                    }
                }
            };
            readThread.start();
        }
    }

    public synchronized void ReadThreadSuspend() {
        suspended = true;
    }

    public synchronized void ReadThreadResume() {
        suspended = false;
    }

    /* Check if the received frame will overflow pCmd buffer */
    private boolean DetectBufferOverflow(int len) { /* IN  length of frame */
        if (len > pCmd.length) {
            Log.d(TAG, "Buffer overflow, dropping SerialAPI frame");
            return true;
        }
        return false;
    }

    private void setLearnInfoPcmd(ZW_Basis_API.LEARN_INFO info, byte[] pcmd) {
        int i;
        int length = info.getByteBuffer().array().length;
        length = (length > pcmd.length) ? pcmd.length : length;

        for (i = 0; i < length; i++)
            info.pCmd[i].set(pcmd[i]);
    }

    /**
     * this method is called by SerialAPI_Poll in JNI
     * all callback methods can be executed by the received data frame
     * */
    private void Dispatch() {
        int i;
        ZW_cbFunc f;
        ZW_cbFunc funcLearnInfo = null;

        if (pData[1] == 1)
            return;

        if (pData[0] == 0)
            return;

        Log.d(TAG, "Z-wave->Host:");
        Log.d(TAG, "****  the received command is 0x" + Integer.toHexString(pData[IDX_CMD] & 0xff) + "   ****");

        String str = "";
        for (int k = 0; k < pData[0]; k++){
            str += Integer.toHexString(pData[k] & 0xff) + " ";
        }
        Log.d(TAG, str);

        switch (pData[IDX_CMD]) {
            case ZW_Func_ID.FUNC_ID_ZW_APPLICATION_CONTROLLER_UPDATE: {
                {
                    if (DetectBufferOverflow(IDX_DATA + 2))
                        break;
                    for (i = 0; i < pData[IDX_DATA + 2]; i++)
                        pCmd[i] = pData[IDX_DATA + 3 + i];

                    ZW_Basis_API.AppControllerUpdateParameter parameter
                            = new ZW_Basis_API.AppControllerUpdateParameter();
                    parameter.setbStatus(pData[IDX_DATA]);
                    parameter.setbNodeID(pData[IDX_DATA + 1]);
                    parameter.setpCmd(pCmd);
                    parameter.setbLen(pData[IDX_DATA + 2]);
                    callbacks.ApplicationControllerUpdate(parameter);
                }
            }
            break;

            case ZW_Func_ID.FUNC_ID_APPLICATION_COMMAND_HANDLER: {
                if (DetectBufferOverflow(IDX_DATA + 2))
                    break;

                for (i = 0; i < pData[IDX_DATA + 2]; i++) {
                    pCmd[i] = pData[IDX_DATA + 3 + i];

                }

                ZW_Basis_API.AppCmdHandlerParameter parameter
                        = new ZW_Basis_API.AppCmdHandlerParameter();
                parameter.setRxStatus(pData[IDX_DATA]);
                parameter.setDestNode((byte) 0);
                parameter.setSourceNode(pData[IDX_DATA + 1]);
                parameter.setpCmd(new ZW_APPLICATION_TX_BUFFER(pCmd));
                parameter.setCmdLength(pData[IDX_DATA + 2]);

                callbacks.ApplicationCommandHandler(parameter);
            }
            break;

            case ZW_Func_ID.FUNC_ID_PROMISCUOUS_APPLICATION_COMMAND_HANDLER: {
                if (DetectBufferOverflow(IDX_DATA + 2))
                    break;

                for (i = 0; i < pData[IDX_DATA + 2]; i++)
                    pCmd[i] = pData[IDX_DATA + 3 + i];

                ZW_Basis_API.AppCmdHandlerParameter parameter
                        = new ZW_Basis_API.AppCmdHandlerParameter();
                parameter.setRxStatus(pData[IDX_DATA]);
                parameter.setDestNode(pData[byLen - 1]);
                parameter.setSourceNode(pData[IDX_DATA + 1]);
                parameter.setpCmd(new ZW_APPLICATION_TX_BUFFER(pCmd));
                parameter.setCmdLength(pData[IDX_DATA + 2]);

                callbacks.ApplicationCommandHandler(parameter);
            }
            break;

            case ZW_Func_ID.FUNC_ID_APPLICATION_COMMAND_HANDLER_BRIDGE: {
                if (DetectBufferOverflow(IDX_DATA + 3))
                    break;

                for (i = 0; i < pData[IDX_DATA + 3]; i++) {
                    pCmd[i] = pData[IDX_DATA + 4 + i];
                }

                ZW_Basis_API.AppCmdHandlerParameter parameter
                        = new ZW_Basis_API.AppCmdHandlerParameter();
                parameter.setRxStatus(pData[IDX_DATA]);
                parameter.setDestNode(pData[IDX_DATA + 1]);
                parameter.setSourceNode(pData[IDX_DATA + 2]);
                parameter.setpCmd(new ZW_APPLICATION_TX_BUFFER(pCmd));
                parameter.setCmdLength(pData[IDX_DATA + 3]);
                callbacks.ApplicationCommandHandler_Bridge(parameter);
            }
            break;

            // The rest are callback functions

            case ZW_Func_ID.FUNC_ID_ZW_SEND_NODE_INFORMATION:
                if (cbFuncZWSendNodeInformation != null) {
                    cbFuncZWSendNodeInformation.cbFuncZWSendNodeInformation(pData[IDX_DATA + 1]);
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_SEND_DATA: {
                if (cbFuncZWSendData != null) {
                    f = cbFuncZWSendData;
                    cbFuncZWSendData = null;
                    f.cbFuncZWSendData(pData[IDX_DATA + 1], null);    //TODO add repeaters
                }
            }
            break;

            case ZW_Func_ID.FUNC_ID_ZW_SEND_TEST_FRAME: {
                if (cbFuncZWSendTestFrame != null) {
                    f = cbFuncZWSendTestFrame;
                    cbFuncZWSendTestFrame = null;
                    f.cbFuncZWSendTestFrame(pData[IDX_DATA + 1]);
                }
            }
            break;

            case ZW_Func_ID.FUNC_ID_ZW_SEND_DATA_BRIDGE: {
                if (cbFuncZWSendDataBridge != null) {
                    f = cbFuncZWSendDataBridge;
                    cbFuncZWSendDataBridge = null;
                    f.cbFuncZWSendDataBridge(pData[IDX_DATA + 1], null);    //TODO add repeaters
                }
            }
            break;

            case ZW_Func_ID.FUNC_ID_ZW_SEND_DATA_MULTI:
                if (cbFuncZWSendDataMulti != null) {
                    cbFuncZWSendDataMulti.cbFuncZWSendDataMulti(pData[IDX_DATA + 1]);
                }
                break;
            case ZW_Func_ID.FUNC_ID_MEMORY_PUT_BUFFER:
                if (cbFuncMemoryPutBuffer != null) {
                    cbFuncMemoryPutBuffer.cbFuncMemoryPutBuffer();
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_SET_DEFAULT:
                if (cbFuncZWSetDefault != null) {
                    cbFuncZWSetDefault.cbFuncZWSetDefault();
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_CONTROLLER_CHANGE:
            case ZW_Func_ID.FUNC_ID_ZW_CREATE_NEW_PRIMARY:
            case ZW_Func_ID.FUNC_ID_ZW_REMOVE_NODE_FROM_NETWORK:
            case ZW_Func_ID.FUNC_ID_ZW_ADD_NODE_TO_NETWORK:
                switch (pData[IDX_CMD]) {
                    case ZW_Func_ID.FUNC_ID_ZW_CONTROLLER_CHANGE:
                        funcLearnInfo = cbFuncZWControllerChange;
                        break;
                    case ZW_Func_ID.FUNC_ID_ZW_CREATE_NEW_PRIMARY:
                        funcLearnInfo = cbFuncZWNewController;
                        break;
                    case ZW_Func_ID.FUNC_ID_ZW_REMOVE_NODE_FROM_NETWORK:
                        funcLearnInfo = cbFuncRemoveNodeFromNetwork;
                        break;
                    case ZW_Func_ID.FUNC_ID_ZW_ADD_NODE_TO_NETWORK:
                        funcLearnInfo = cbFuncAddNodeToNetwork;
                        break;
                }

                if (funcLearnInfo != null) {
                    Arrays.fill(learnNodeInfo.getByteBuffer().array(), (byte) 0);
                    learnNodeInfo.bStatus.set(pData[IDX_DATA + 1]);

                    if ((learnNodeInfo.bStatus.get() == ZW_Basis_API.ADD_NODE_STATUS_ADDING_SLAVE) ||
                            (learnNodeInfo.bStatus.get() == ZW_Basis_API.ADD_NODE_STATUS_ADDING_CONTROLLER)) {
                        learnNodeInfo.bSource.set(pData[IDX_DATA + 2]);
                        learnNodeInfo.bLen.set(pData[IDX_DATA + 3]);
                        setLearnInfoPcmd(learnNodeInfo, pCmd);
                        if (DetectBufferOverflow(learnNodeInfo.bLen.get()))
                            break;
                        System.arraycopy(pData, IDX_DATA + 4, pCmd, 0, learnNodeInfo.bLen.get());
                    }

                    switch (pData[IDX_CMD]) {
                        case ZW_Func_ID.FUNC_ID_ZW_CONTROLLER_CHANGE:
                            funcLearnInfo.cbFuncZWControllerChange(learnNodeInfo);
                            break;
                        case ZW_Func_ID.FUNC_ID_ZW_CREATE_NEW_PRIMARY:
                            funcLearnInfo.cbFuncZWNewController(learnNodeInfo);
                            break;
                        case ZW_Func_ID.FUNC_ID_ZW_REMOVE_NODE_FROM_NETWORK:
                            funcLearnInfo.cbFuncRemoveNodeFromNetwork(learnNodeInfo);
                            break;
                        case ZW_Func_ID.FUNC_ID_ZW_ADD_NODE_TO_NETWORK:
                            funcLearnInfo.cbFuncAddNodeToNetwork(learnNodeInfo);
                            break;
                    }
                }

                break;

            case ZW_Func_ID.FUNC_ID_ZW_REPLICATION_SEND_DATA:
                if (cbFuncZWReplicationSendData != null) {
                    cbFuncZWReplicationSendData.cbFuncZWReplicationSendData(pData[IDX_DATA + 1]);
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_ASSIGN_RETURN_ROUTE:
                if (cbFuncZWAssignReturnRoute != null) {
                    cbFuncZWAssignReturnRoute.cbFuncZWAssignReturnRoute(pData[IDX_DATA + 1]);
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_DELETE_RETURN_ROUTE:
                if (cbFuncZWDeleteReturnRoute != null) {
                    cbFuncZWDeleteReturnRoute.cbFuncZWDeleteReturnRoute(pData[IDX_DATA + 1]);
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_ASSIGN_SUC_RETURN_ROUTE:
                if (cbFuncZWAssignSUCReturnRoute != null) {
                    cbFuncZWAssignSUCReturnRoute.cbFuncZWDeleteReturnRoute(pData[IDX_DATA + 1]);
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_DELETE_SUC_RETURN_ROUTE:
                if (cbFuncZWDeleteSUCReturnRoute != null) {
                    cbFuncZWDeleteSUCReturnRoute.cbFuncZWDeleteReturnRoute(pData[IDX_DATA + 1]);
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_SET_LEARN_MODE:
                if (cbFuncZWSetLearnMode != null) {
                    learnNodeInfo.bStatus.set(pData[IDX_DATA + 1]);
                    learnNodeInfo.bSource.set(pData[IDX_DATA + 2]);

                    if (DetectBufferOverflow(IDX_DATA + 3))
                        break;
                    for (i = 0; i < pData[IDX_DATA + 3]; i++) {
                        pCmd[i] = pData[IDX_DATA + 4 + i];
                    }
                    setLearnInfoPcmd(learnNodeInfo, pCmd);
                    learnNodeInfo.bLen.set(pData[IDX_DATA + 3]);
                    cbFuncZWSetLearnMode.cbFuncZWSetLearnMode(learnNodeInfo);
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_SET_SLAVE_LEARN_MODE:
                if (cbFuncZWSetSlaveLearnMode != null) {
                    cbFuncZWSetSlaveLearnMode.cbFuncZWSetSlaveLearnMode(pData[IDX_DATA + 1], pData[IDX_DATA + 2],
                            pData[IDX_DATA + 3]);
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_SET_SUC_NODE_ID:
                if (cbFuncZWSetSUCNodeID != null) {
                    cbFuncZWSetSUCNodeID.cbFuncZWSetSUCNodeID(pData[IDX_DATA + 1]);
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_REQUEST_NODE_NEIGHBOR_UPDATE:
                if (cbFuncZWRequestNodeNodeNeighborUpdate != null) {
                    cbFuncZWRequestNodeNodeNeighborUpdate.cbFuncZWRequestNodeNodeNeighborUpdate(pData[IDX_DATA + 1]);
                }
                break;

            case ZW_Func_ID.FUNC_ID_ZW_REQUEST_NETWORK_UPDATE:
                if (cbFuncZWRequestNetworkUpdate != null) {
                    cbFuncZWRequestNetworkUpdate.cbFuncZWRequestNetworkUpdate(pData[IDX_DATA + 1]);
                }
                break;
            case ZW_Func_ID.FUNC_ID_ZW_REMOVE_FAILED_NODE_ID:
                if (cbFuncZWRemoveFailedNode != null) {
                    cbFuncZWRemoveFailedNode.cbFuncZWRemoveFailedNode(pData[IDX_DATA + 1]);
                }
                break;
            case ZW_Func_ID.FUNC_ID_ZW_REPLACE_FAILED_NODE:
                if (cbFuncZWReplaceFailedNode != null) {
                    cbFuncZWReplaceFailedNode.cbFuncZWReplaceFailedNode(pData[IDX_DATA + 1]);
                }
                break;

            default:
                Log.e(TAG, "Unknown SerialAPI FUNC_ID: " + String.valueOf(pData[IDX_CMD]));
                break;
        }
        //System.arraycopy(pData, 0, ppData, 0, pData.length);
    }

    /**
     * SerialAPI
     * Initialize callbacks and transmission variables.
     * param[in] serial_port Name of the serial port to use, on Linux ie. "/dev/ttyS1"
     * param[in] _callbacks Callback to be used by the serial API.
     * return = TRUE if initialization was successful
     */
    public boolean SerialAPI_Init(String serial_port, SerialAPI_Callbacks _callbacks) {
        byte[] buf = new byte[14];
        byte type;
        int i = 0;
        if (!serialAPINative.ConInit(serial_port))
            return false;

        cbFuncZWSendData = null;
        cbFuncZWSendTestFrame = null;
        cbFuncZWSendDataBridge = null;
        cbFuncZWSendDataMulti = null;
        cbFuncZWSendNodeInformation = null;
        cbFuncMemoryPutBuffer = null;
        cbFuncZWSetDefault = null;
        cbFuncZWNewController = null;
        cbFuncAddNodeToNetwork = null;
        cbFuncRemoveNodeFromNetwork = null;
        cbFuncZWControllerChange = null;
        cbFuncZWReplicationSendData = null;
        cbFuncZWAssignReturnRoute = null;
        cbFuncZWAssignSUCReturnRoute = null;
        cbFuncZWDeleteSUCReturnRoute = null;
        cbFuncZWDeleteReturnRoute = null;
        cbFuncZWSetLearnMode = null;
        cbFuncZWRequestNodeNodeNeighborUpdate = null;
        cbFuncZWSetSUCNodeID = null;
        cbFuncZWRequestNetworkUpdate = null;

        callbacks = _callbacks;

        /*Get Capabilities of serial API */

        byLen = 0;
        int retval = serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_SERIAL_API_GET_CAPABILITIES, null, (byte) 0, buffer);
        if (getResponseRet(retval) == 0) {
            Log.d(TAG, "SendFrameWithResponse(ZW_Func_ID.FUNC_ID_SERIAL_API_GET_CAPABILITIES,...) failed in SerialAPI_Init()");
            return false;
        }
        byLen = getResponseReplyLen(retval);

        Log.d(TAG, "Serial API version     : " + String.valueOf(buffer[IDX_DATA]) + "." +
                String.valueOf(buffer[IDX_DATA + 1]));

        type = ZW_Version(buf);
        if (type < zw_lib_names.length) {
            //Log.d(TAG, "Z-Wave library version : " + byteArray2String(buf, 7));
            Log.d(TAG, "Z-Wave library type    : " + zw_lib_names[type]);
        } else {
            Log.d(TAG, "Z-WAVE type = " + String.valueOf(type));
        }
        /*if (type != ZW_Basis_API.ZW_LIB_CONTROLLER_BRIDGE) {
            Log.e(TAG, "Z-Wave dongle MUST be a Bridge library");
            return false;
        }*/

        callbacks.ApplicationInitHW((byte) 0);
        callbacks.ApplicationInitSW();

        ZW_Basis_API.AppNodeInfoParameter parameter = new ZW_Basis_API.AppNodeInfoParameter();
        callbacks.ApplicationNodeInformation(parameter);
        SerialAPI_ApplicationNodeInformation(parameter.getDeviceOptionsMask(), parameter.getNodeType(),
                parameter.getNodeParm(), parameter.getParmLength());

        return true;
    }

    /**
     * DeInit the serialAPI and close com ports.
     */
    public void SerialAPI_Destroy() {
        serialAPINative.ConDestroy();
    }

    /**
     * Set ApplicationNodeInformation data to be used in subsequent
     * calls to \ref ZW_SendNodeInformation.
     * param[in] listening   = true : if this node is always on air
     * param[in] nodeType    Device type
     * param[in] nodeParm    Device parameter buffer
     * param[in] parmLength  Number of Device parameter bytes
     */
    public void SerialAPI_ApplicationNodeInformation(byte listening, ZW_Basis_API.APPL_NODE_TYPE nodeType, byte[] nodeParm, byte parmLength) {
        int i;
        idx = 0;
        buffer[idx++] = listening;
        buffer[idx++] = (byte) nodeType.generic.get();
        buffer[idx++] = (byte) nodeType.specific.get();
        buffer[idx++] = parmLength;

        for (i = 0; i != parmLength; i++) {
            buffer[idx++] = nodeParm[i];
        }
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_SERIAL_API_APPL_NODE_INFORMATION, buffer, idx);
    }

    /**
     * Get the Z-Wave library basis version.
     * @param   pBuf copied to. Buffer must be at least 14 bytes long.
     * @return the API library version
     */
    public byte ZW_Version(byte[] pBuf) {
        int retVal, type;

        idx = 0;
        byLen = 0;
        retVal = serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_GET_VERSION, null, (byte) 0, buffer);
        type = getResponseRet(retVal);
        byLen = getResponseReplyLen(retVal);
        if (type == T_CON_TYPE.conFrameReceived) {
            System.arraycopy(buffer, IDX_DATA, pBuf, 0, 12);
            return buffer[IDX_DATA + 12];
        }
        return 0;
    }

    /**
     * this method set the Controller back to the factory default state.
     * Erase all Nodes routing information and assigned HomeID/nodeID from memory.
     * @param completedFunc function completed call back method.
     * */
    public void ZW_SetDefault(ZW_cbFunc completedFunc) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte) 0 : 0x03);
        buffer[idx++] = byCompletedFunc;
        cbFuncZWSetDefault = completedFunc;
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_SET_DEFAULT, buffer, idx);
    }

    public boolean SerialAPI_Poll() {
        return serialAPINative.SerialAPIPoll(pData, this);
    }

    /* version[0] is major, version[1] is minor */
    public void Get_SerialAPI_AppVersion(byte[] version) {
        version[0] = (byte)capabilities.appl_version.get();
        version[1] = (byte)capabilities.appl_revision.get();
    }

    /**
     * Initialize the Z-Wave RF chip.
     * @param mode
     * = 1 : Set the RF chip in receive mode and starts the data sampling.
     * = 0 : Set the RF chip in power down mode.
     * @return operation successful or not
     */
    public byte ZW_SetRFReceiveMode(byte mode) {
        byLen = 0;
        idx = 0;
        buffer[idx++] = mode;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_SET_RF_RECEIVE_MODE, buffer, idx, buffer);

        return buffer[IDX_DATA];
    }

    /**
    * Set the powerlevel used in RF transmitting.
    * Valid powerlevel values are :
    *
    *       normalPower : Max power possible
    *       minus2dBm    - normalPower - 2dBm
    *       minus4dBm    - normalPower - 4dBm
    *       minus6dBm    - normalPower - 6dBm
    *       minus8dBm    - normalPower - 8dBm
    *       minus10dBm   - normalPower - 10dBm
    *       minus12dBm   - normalPower - 12dBm
    *       minus14dBm   - normalPower - 14dBm
    *       minus16dBm   - normalPower - 16dBm
    *       minus18dBm   - normalPower - 18dBm
    **/
    public byte ZW_RFPowerLevelSet(byte powerLevel) {
        idx = 0;
        byLen = 0;
        buffer[idx++] = powerLevel;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_RF_POWER_LEVEL_SET, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Create and transmit a node information broadcast frame
     * @param destNode
     * @param txOptions Transmit option flags.
     * @param completedFunc Transmit completed call back function
     *
     * @return
     * retval FALSE if transmitter queue overflow
     */
    public byte ZW_SendNodeInformation(byte destNode, byte txOptions, ZW_cbFunc completedFunc) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte) 0 : 0x03);
        buffer[idx++] = destNode;
        buffer[idx++] = txOptions;
        buffer[idx++] = byCompletedFunc;
        cbFuncZWSendNodeInformation = completedFunc;
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_SEND_NODE_INFORMATION, buffer, idx);
        return 0;
    }




    /**
     *    Transmit data buffer to a single ZW-node or all ZW-nodes (broadcast).
     *

     * @param nodeID        Destination node ID (0xFF == broadcast)
     * @param pData         Data buffer pointer
     * @param dataLength    Data buffer length
     * @param txOptions     Transmit option flags
     *          TRANSMIT_OPTION_LOW_POWER     transmit at low output power level
     *                                        (1/3 of normal RF range).
     *          TRANSMIT_OPTION_ACK           the multicast frame will be followed
     *                                        by a  singlecast frame to each of
     *                                        the destination nodes
     *                                        and request acknowledge from each
     *                                        destination node.
     *          TRANSMIT_OPTION_AUTO_ROUTE    request retransmission via repeater
     *                                        nodes at normal output power level).
     * @param completedFunc Transmit completed call back function
     * @param txStatus      IN Transmit status
     * @param txOptions:
     * @retval 0 if transmitter queue overflow
     **/
    private int senddata_txnr = 0;
    public byte ZW_SendData(byte nodeID, byte[] pData, byte dataLength, byte txOptions, ZW_cbFunc completedFunc) {
        byte i;
        int retval;

        if ((dataLength + 2) > buffer.length) {
            Log.d(TAG, "ZW_SendData: Frame is too long");
            return -1;
        }
        idx = 0;
        byLen = 0;
        byCompletedFunc = (byte)(completedFunc == null ? 0 : (1 + (senddata_txnr & 0xf7)));
        buffer[idx++] = nodeID;
        buffer[idx++] = dataLength;
        for (i = 0; i < dataLength; i++) {
            buffer[idx++] = pData[i];
        }
        buffer[idx++] = txOptions;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc
        cbFuncZWSendData = completedFunc;

        retval = serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_SEND_DATA, buffer, idx, buffer);

        String str = "";
            for (int k = 0; k < buffer[0]; k++){
            str += Integer.toHexString(buffer[k] & 0xff) + " ";
        }

        if (getResponseRet(retval) != T_CON_TYPE.conFrameReceived) {
            buffer[IDX_DATA] = 0x00;
            Log.e(TAG, "Fail");
        } else senddata_txnr++;

        if (buffer[IDX_DATA] != 1) {
            Log.e(TAG, "SendData fail");
            cbFuncZWSendData = null;
        }

        return buffer[IDX_DATA];
    }

    /**
     * Send a test frame directly to nodeID without any routing
     * @param nodeID IN Node ID on the node ID (1..232) the test frame should be transmitted to.
     * @param powerLevel IN Powerlevel to use in RF
     * transmission, valid values:
     * normalPower Max power possible
     * minus1dB Normal power - 1dB (mapped to minus2dB )
     * minus2dB Normal power - 2dB
     * minus3dB Normal power - 3dB (mapped to minus4dB)
     * minus4dB Normal power - 4dB
     * minus5dB Normal power - 5dB (mapped to minus6dB)
     * minus6dB Normal power - 6dB
     * minus7dB Normal power - 7dB (mapped to minus8dB)
     * minus8dB Normal power - 8dB
     * minus9dB Normal power - 9dB (mapped to minus10dB)
     * @param completedFunc Call back function called when done
     **/
    public byte ZW_SendTestFrame(byte nodeID, byte powerLevel, ZW_cbFunc completedFunc) {

        byCompletedFunc = (completedFunc == null ? (byte) 0 : 4);
        cbFuncZWSendTestFrame = completedFunc;
        idx = 0;
        byLen = 0;
        buffer[idx++] = nodeID;
        buffer[idx++] = powerLevel;
        buffer[idx++] = byCompletedFunc;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_SEND_TEST_FRAME, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     **    Transmit data buffer to a single ZW-node or all ZW-nodes (broadcast)
     **    from a virtual node.
     **

     ** @param srcNodeID        Destination node ID (0xFF == broadcast)
     ** @param dstNodeID        Vurtual source node ID
     ** @param pData         Data buffer pointer
     ** @param dataLength    Data buffer length
     ** @param txOptions     Transmit option flags
     **          TRANSMIT_OPTION_LOW_POWER     transmit at low output power level
     **                                        (1/3 of normal RF range).
     **          TRANSMIT_OPTION_ACK           the multicast frame will be followed
     **                                        by a  singlecast frame to each of
     **                                        the destination nodes
     **                                        and request acknowledge from each
     **                                        destination node.
     **          TRANSMIT_OPTION_AUTO_ROUTE    request retransmission via repeater
     **                                        nodes at normal output power level).
     ** @param completedFunc Transmit completed call back function
     ** @retval 0 if transmitter queue overflow
     **/
    private int senddata_bridge_txnr = 0;
    public byte ZW_SendData_Bridge(byte srcNodeID,  /*IN  Virtual source node ID */
                                   byte destNodeID, /*IN  Destination node ID (0xFF == broadcast) */
                                   byte[] pData,    /*IN  Data buffer pointer           */
                                   byte dataLength, /*IN  Data buffer length            */
                                   byte txOptions,  /*IN  Transmit option flags         */
                                   ZW_cbFunc completedFunc) {
        int i;

        if ((dataLength + 2) > buffer.length) {
            Log.d(TAG, "ZW_SendData: Frame is too long");
            return 0;
        }

        idx = 0;
        byLen = 0;
        byCompletedFunc = (completedFunc == null ? (byte) 0 : (byte) (1 + (senddata_bridge_txnr & 0xf7)));

        buffer[idx++] = srcNodeID;
        buffer[idx++] = destNodeID;
        buffer[idx++] = dataLength;
        for (i = 0; i < dataLength; i++) {
            buffer[idx++] = pData[i];
        }
        buffer[idx++] = txOptions;
        buffer[idx++] = 0;
        buffer[idx++] = 0;
        buffer[idx++] = 0;
        buffer[idx++] = 0;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc
        cbFuncZWSendDataBridge = completedFunc;

        if (getResponseRet(serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_SEND_DATA_BRIDGE, buffer, idx, buffer))
                != T_CON_TYPE.conFrameReceived) {
            buffer[IDX_DATA] = 0;
            Log.d(TAG, "Fial");
        } else
            senddata_bridge_txnr++;

        if (buffer[IDX_DATA] != 1) {
            Log.d(TAG, "SendData fail\n");
            cbFuncZWSendDataBridge = null;
        }

        return buffer[IDX_DATA];
    }

    /**
     * Abort the ongoing transmit started with ZW_SendData() or ZW_SendDataMulti(). If an ongoing
     * transmission is aborted, the callback function from the send call will return with the status
     * TRANSMIT_COMPLETE_NO_ACK.
     */
    public void ZW_SendDataAbort(){
        byLen = 0;
        buffer = null;
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_SEND_DATA_ABORT, buffer, (byte) 0);
    }

    /**
     * Copy the Home-ID and Node-ID to the specified RAM addresses.
     * @param pHomeID
     * @param pNodeID
     * */
    public void MemoryGetID(byte[] pHomeID, byte[] pNodeID) {
        idx = 0;
        byLen = 0;
        byte[] temp = new byte[0];
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_MEMORY_GET_ID, temp, (byte) 0, buffer);

        pHomeID[0] = buffer[IDX_DATA];
        pHomeID[1] = buffer[IDX_DATA + 1];
        pHomeID[2] = buffer[IDX_DATA + 2];
        pHomeID[3] = buffer[IDX_DATA + 3];
        pNodeID[0] = buffer[IDX_DATA + 4];

        /*System.out.println("homeID four byte");
        for(int j = 0; j < 4; j++){
            System.out.println(Integer.toHexString(buffer[IDX_DATA + j]));
            System.out.println(buffer[IDX_DATA + j]);
        }*/

        if (pNodeID[0] < 1 || pNodeID[0] > ZW_Func_ID.ZW_MAX_NODES) {
            Log.e(TAG, "Module returns a bad node ID! Resetting module " + String.valueOf(pNodeID[0]));
            ZW_SetDefault(null);
            pNodeID[0] = 1;
        }
    }

    /**
     *  Read one byte from the EEPROM
     *  @param offset Application area offset
     *  retval Data from the application area of the external NVM
     */
    public byte MemoryGetByte(int offset) {
        idx = 0;
        buffer[idx++] = (byte)((offset) >> 8);
        buffer[idx++] = (byte)((offset) & 0xFF);
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_MEMORY_GET_BYTE, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Write one byte to the application area of the NVM.
     * @param offset Address of declared far variable
     * @param bData Data to store
     * */
    public byte MemoryPutByte(int offset, byte bData) {
        idx = 0;
        buffer[idx++] = (byte)((offset) >> 8);
        buffer[idx++] = (byte)((offset) & 0xFF);
        buffer[idx++] = bData;
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_MEMORY_PUT_BYTE, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Read number of bytes from the EEPROM to a RAM buffer.
     * @param offset   Application area offset
     * @param buf   Buffer pointer
     * @param length   Number of bytes to read
     */
    public void MemoryGetBuffer(short offset, byte[] buf, byte length) {
        int i;

        if (SupportsCommand(ZW_Func_ID.FUNC_ID_MEMORY_GET_BUFFER)) {
            idx = 0;
            buffer[idx++] = (byte)((offset) >> 8);
            buffer[idx++] = (byte)((offset) & 0xFF);
            buffer[idx++] = length;  // Number of bytes to read

            byLen = 0;
            serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_MEMORY_GET_BUFFER, buffer, idx, buffer);

            for (i = 0; i < length; i++) {
                buf[i] = buffer[IDX_DATA + i];
            }
        } else {
            for (i = 0; i < length; i++) {
                buf[i] = MemoryGetByte((byte)(offset + i));
            }
        }
    }

    /**
     * Copy number of bytes from a RAM buffer to the EEPROM.
     * @param offset   Application area offset
     * @param buf   Buffer pointer
     * @param length   Number of bytes to write
     * @param func     Write completed function pointer
     * return 0 if the buffer put queue is full
     */
    public boolean MemoryPutBuffer(int offset, byte buf[], int length, ZW_cbFunc func) {
        int i;

        if (SupportsCommand(ZW_Func_ID.FUNC_ID_MEMORY_PUT_BUFFER)) {
            idx = 0;
            byCompletedFunc = (byte)(func == null ? 0 : 0x03);
            buffer[idx++] = (byte)((offset) >> 8);
            buffer[idx++] = (byte)((offset) & 0xFF);

            if (length > BUF_SIZE - 8)
                length = BUF_SIZE - 8;

            buffer[idx++] = (byte)((length) >> 8);

            buffer[idx++] = (byte)((length) & 0xFF);

            for (i = 0; i < length; i++) {
                buffer[idx++] = buf[i];
            }

            buffer[idx++] = byCompletedFunc;
            cbFuncMemoryPutBuffer = func;
            byLen = 0;
            serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_MEMORY_PUT_BUFFER, buffer, idx, buffer);
            return (buffer[IDX_DATA] > 0);
        } else {
            for (i = 0; i < length; i++) {
                MemoryPutByte(offset + i, buf[i]);
                if (func != null)
                    func.cbFuncMemoryPutBuffer();
            }
            return true;
        }
    }

    public byte nvm_close() {
        idx = 0;
        buffer[idx++] = 0x03;

        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_NVM_BACKUP_RESTORE, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    public byte nvm_open() {
        int len;
        idx = 0;
        buffer[idx++] = 0x00;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_NVM_BACKUP_RESTORE, buffer, idx, buffer);
        len = buffer[IDX_DATA + 2] << 8;
        len = len | buffer[IDX_DATA + 3];
        len += 1;
        Log.d(TAG, "open says size is: " + String.valueOf(len) + " bytes");
        return buffer[IDX_DATA];
    }

    public byte nvm_backup(int offset, byte[] buf, byte length, byte[] length_read) {
        int i;

        idx = 0;
        buffer[idx++] = 0x01; /* read */

        buffer[idx++] = length;

        buffer[idx++] = (byte)((offset) >> 8);
        buffer[idx++] = (byte)((offset) & 0xFF);

        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_NVM_BACKUP_RESTORE, buffer, idx, buffer);

        length_read[0] = buffer[IDX_DATA + 1];
        if (buffer[IDX_DATA] != 0) {
            if (buffer[IDX_DATA] == 0xff) {
                return 2;
            }
            return 1;
        } else {
            for (i = 0; i < length_read[0]; i++) {
                buf[i] = buffer[IDX_DATA + 4 + i];
            }
        }
        return 0;
    }

    public byte nvm_restore(int offset, byte[] buf, byte length, byte[] length_written) {
        int i;

        idx = 0;
        buffer[idx++] = 0x02; /* write */

        buffer[idx++] = length;

        buffer[idx++] = (byte)((offset) >> 8);
        buffer[idx++] = (byte)((offset) & 0xFF);

        for (i = 0; i < length; i++) {
            buffer[idx++] = buf[i];
        }

        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_NVM_BACKUP_RESTORE, buffer, idx, buffer);
        length_written[0] = buffer[IDX_DATA + 1];
        if (buffer[IDX_DATA] != 0) {
            if (buffer[IDX_DATA] == 0xff) {
                return 2;
            }
            Log.e(TAG, "SendFrameWithResponse failed in nvm_backup");
            return 1;
        }
        return 0;
    }

    public byte ZW_MemoryPutBuffer(short offset, byte[] buf, short length) {
        int i;

        if (SupportsCommand(ZW_Func_ID.FUNC_ID_MEMORY_PUT_BUFFER)) {
            idx = 0;

            buffer[idx++] = (byte)((offset) >> 8);
            buffer[idx++] = (byte)((offset) & 0xFF);

            if (length > BUF_SIZE - 8)
                length = BUF_SIZE - 8;

            buffer[idx++] = (byte)((offset) >> 8);
            buffer[idx++] = (byte)((offset) & 0xFF);

            for (i = 0; i < length; i++) {
                buffer[idx++] = buf[i];
            }
            buffer[idx++] = byCompletedFunc;

            byLen = 0;
            serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_MEMORY_PUT_BUFFER, buffer, idx, buffer);
            return buffer[IDX_DATA];
        } else {
            for (i = 0; i < length; i++) {
                MemoryPutByte((short)(offset + i), buf[i]);
            }
            return 1;
        }
    }

    /**
     * Lock a response route for a specific node.
     * param bNodeID
     **/
    public void ZW_LockRoute(byte bNodeID) {
        idx = 0;
        buffer[idx++] = bNodeID;
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_LOCK_ROUTE_RESPONSE, buffer, idx);
    }

    public void ZW_GetRoutingInfo_old(byte bNodeID, byte[] buf, byte bRemoveBad, byte bRemoveNonReps) {
        int i;
        idx = 0;

        buffer[idx++] = bNodeID;
        buffer[idx++] = bRemoveBad;
        buffer[idx++] = bRemoveNonReps;
        byLen = 0;

        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_GET_ROUTING_TABLE_LINE, buffer, idx, buffer);

        for (i = 0; i < 29; i++) {
            buf[i] = buffer[IDX_DATA + i];
        }
    }

    /**
     * Reset TX Counter.
     **/
    public void ZW_ResetTXCounter() {
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_RESET_TX_COUNTER, null, (byte) 0);
    }

    /**
     * return The number of frames transmitted since the TX Counter last was reset
     **/
    public byte ZW_GetTXCounter() {
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_GET_TX_COUNTER, null, (byte) 0, buffer);
        return buffer[IDX_DATA];
    }

    /**
     *    Start neighbor discovery for bNodeID, if any other nodes present.
    **/
    public byte ZW_RequestNodeNeighborUpdate(byte bNodeID, ZW_cbFunc completedFunc) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = bNodeID;
        buffer[idx++] = byCompletedFunc;
        cbFuncZWRequestNodeNodeNeighborUpdate = completedFunc;
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_REQUEST_NODE_NEIGHBOR_UPDATE, buffer, idx);
        return 0;
    }

    /**
     * Copy the Node's current protocol information from the non-volatile memory.
     * @param[in] bNodeID     Node ID
     * @param[out] nodeInfo   Node info buffer
     **/

    public void ZW_GetNodeProtocolInfo(byte bNodeID, ZW_Basis_API.LEARNINFO nodeInfo) {
        idx = 0;
        buffer[idx++] = bNodeID;
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_GET_NODE_PROTOCOL_INFO, buffer, idx, buffer);

        nodeInfo.capability.set(buffer[IDX_DATA]);
        nodeInfo.security.set(buffer[IDX_DATA + 1]);
        nodeInfo.reserved.set(buffer[IDX_DATA + 2]);

        nodeInfo.nodeType.basic.set(buffer[IDX_DATA + 3]);
        nodeInfo.nodeType.generic.set(buffer[IDX_DATA + 4]);
        nodeInfo.nodeType.specific.set(buffer[IDX_DATA + 5]);

    }

    public void ZW_GetVirtualNodes(byte[] pNodeMask) {
        idx = 0;
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_GET_VIRTUAL_NODES, buffer, idx, buffer);
        System.arraycopy(buffer, IDX_DATA, pNodeMask, 0, ZW_Func_ID.ZW_MAX_NODES / 8);
    }

    /**
     *    Transfer the role as primary controller to another controller
     *    The modes are:
     *    CONTROLLER_CHANGE_START          Start the creation of a new primary
     *    CONTROLLER_CHANGE_STOP           Stop the creation of a new primary
     *    CONTROLLER_CHANGE_STOP_FAILED    Report that the replication failed
     *    ADD_NODE_OPTION_HIGH_POWER       Set this flag in bMode for High Power exchange.
    **--------------------------------------------------------------------------*/
    public void ZW_ControllerChange(byte bMode, ZW_cbFunc completedFunc) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = bMode;
        buffer[idx++] = byCompletedFunc;
        cbFuncZWControllerChange = completedFunc;
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_CONTROLLER_CHANGE, buffer, idx);
    }

    /**
     *    Create a new primary controller
     *    The modes are:
     *    CREATE_PRIMARY_START          Start the creation of a new primary
     *    CREATE_PRIMARY_STOP           Stop the creation of a new primary
     *    CREATE_PRIMARY_STOP_FAILED    Report that the replication failed
     *    ADD_NODE_OPTION_HIGH_POWER    Set this flag in bMode for High Power inclusion.

    **--------------------------------------------------------------------------*/
    public void ZW_CreateNewPrimaryCtrl(byte bMode, ZW_cbFunc completedFunc) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = bMode;
        buffer[idx++] = byCompletedFunc;
        cbFuncZWNewController = completedFunc;
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_NEW_CONTROLLER, buffer, idx);
    }

    /**
     *
     *    Add any type of node to the network
     *    The modes are:
     *    ADD_NODE_ANY            Add any node to the network
     *    ADD_NODE_CONTROLLER     Add a controller to the network
     *    ADD_NODE_SLAVE          Add a slaev node to the network
     *    ADD_NODE_STOP           Stop learn mode without reporting an error.
     *    ADD_NODE_STOP_FAILED    Stop learn mode and report an error to the
     *                            new controller.
     *    ADD_NODE_OPTION_HIGH_POWER    Set this flag in bMode for High Power inclusion.
     *    Side effects:
     *
    **--------------------------------------------------------------------------*/
    public void ZW_AddNodeToNetwork(byte bMode, ZW_cbFunc completedFunc) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = bMode;
        buffer[idx++] = byCompletedFunc;
        cbFuncAddNodeToNetwork = completedFunc;
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_ADD_NODE_TO_NETWORK, buffer, idx);
    }

    /**
     *    Remove any type of node from the network
     *    The modes are:
     *    REMOVE_NODE_ANY            Remove any node from the network
     *    REMOVE_NODE_CONTROLLER     Remove a controller from the network
     *    REMOVE_NODE_SLAVE          Remove a slaev node from the network
     *    REMOVE_NODE_STOP           Stop learn mode without reporting an error.
     *    ADD_NODE_OPTION_HIGH_POWER    Set this flag in bMode for High Power exclusion.
     *    Side effects:
     *
    **--------------------------------------------------------------------------*/
    public void ZW_RemoveNodeFromNetwork(byte bMode, ZW_cbFunc completedFunc) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = bMode;
        buffer[idx++] = byCompletedFunc;
        cbFuncRemoveNodeFromNetwork = completedFunc;
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_REMOVE_NODE_FROM_NETWORK, buffer, idx);
    }

    /**
     *
     *    remove a node from the failed node list, if it already exist.
     *    A call back function should be provided otherwise the function will return
     *    without removing the node.
     *    If the removing process started successfully then the function will return
     *    ZW_FAILED_NODE_REMOVE_STARTED        The removing process started
     *
     *    If the removing process can not be started then the API function will return
     *    on or more of the following flags
     *    ZW_NOT_PRIMARY_CONTROLLER             The removing process was aborted because the controller is not the primaray one
     *    ZW_NO_CALLBACK_FUNCTION              The removing process was aborted because no call back function is used
     *    ZW_FAILED_NODE_NOT_FOUND             The removing process aborted because the node was node found
     *    ZW_FAILED_NODE_REMOVE_PROCESS_BUSY   The removing process is busy
     *
     *    The call back function parameter value is:
     *
     *    ZW_NODE_OK                     The node is working proppely (removed from the failed nodes list )
     *    ZW_FAILED_NODE_REMOVED         The failed node was removed from the failed nodes list
     *    ZW_FAILED_NODE_NOT_REMOVED     The failed node was not
     *    Side effects:
    **/
    public byte ZW_RemoveFailedNode(byte NodeID, ZW_cbFunc completedFunc) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = NodeID;
        buffer[idx++] = byCompletedFunc;
        cbFuncZWRemoveFailedNode = completedFunc;

        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_REMOVE_FAILED_NODE_ID, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    public byte ZW_ReplaceFailedNode(byte NodeID, byte bNormalPower,ZW_cbFunc completedFunc){
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = NodeID;
        buffer[idx++] = byCompletedFunc;
        cbFuncZWReplaceFailedNode = completedFunc;

        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_REPLACE_FAILED_NODE, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     *
     * Assign static return routes within a Routing Slave node.
     * Calculate the shortest transport routes from the Routing Slave node
     * to the route destination node and
     * transmit the return routes to the Routing Slave node.
     * @param bSrcNodeID
     * @param bDstNodeID
     * @param completedFunc
     *
    **/
    public byte ZW_AssignReturnRoute(byte bSrcNodeID, byte bDstNodeID, ZW_cbFunc completedFunc) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = bSrcNodeID;
        buffer[idx++] = bDstNodeID;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc
        cbFuncZWAssignReturnRoute = completedFunc;

        byLen = 0;
        //SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_ASSIGN_RETURN_ROUTE, buffer, idx, buffer, &byLen);
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_ASSIGN_RETURN_ROUTE, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Delete static return routes within a Routing Slave node.
     * Transmit "NULL" routes to the Routing Slave node.
     * @param nodeID          Routing Slave
     * @param completedFunc   Completion handler
     **/
    public byte ZW_DeleteReturnRoute(byte nodeID, ZW_cbFunc completedFunc) {
        byte byCompletedFunc;

        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = nodeID;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc

        cbFuncZWDeleteReturnRoute = completedFunc;

        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_DELETE_RETURN_ROUTE, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Assign static return routes within a Routing Slave node.
     * Calculate the shortest transport routes to a Routing Slave node
     * from the Static Update Controller (SUC) Node and
     * transmit the return routes to the Routing Slave node.
     * @param bSrcNodeID     Routing Slave Node ID
     * @param completedFunc  Completion handler
     **/

    public byte ZW_AssignSUCReturnRoute(byte bSrcNodeID, ZW_cbFunc completedFunc) {
        byte byCompletedFunc;

        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = bSrcNodeID;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc
        cbFuncZWAssignSUCReturnRoute = completedFunc;

        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_ASSIGN_SUC_RETURN_ROUTE, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Delete the ( Static Update Controller -SUC-) static return routes
     * within a Routing Slave node.
     * Transmit "NULL" routes to the Routing Slave node.
     * @param nodeID         Routing Slave
     * @param completedFunc  Completion handler
     **/

    public byte ZW_DeleteSUCReturnRoute(byte nodeID, ZW_cbFunc completedFunc) {
        byte byCompletedFunc;

        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = nodeID;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc
        cbFuncZWDeleteSUCReturnRoute = completedFunc;

        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_DELETE_SUC_RETURN_ROUTE, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Get the currently registered SUC node ID.
     * return SUC node ID, ZERO if no SUC available
     */
    public byte ZW_GetSUCNodeID()
    {
        idx = 0;
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_GET_SUC_NODE_ID, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Function description
     * This function enable /disable a specified static controller
     * of functioning as the Static Update Controller
     * @param nodeID the node ID of the static controller to be a SUC
     * @param SUCState 1 enable SUC, 0 disable.
     * @param bTxOption 1 if to use low power transmission, 0 for normal Tx power
     * @param bCapabilities  The capabilities of the new SUC
     * @param completedFunc
    **/
    public byte ZW_SetSUCNodeID(byte nodeID,
                                byte SUCState,
                                byte bTxOption,
                                byte bCapabilities,
                                ZW_cbFunc completedFunc) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = nodeID;
        buffer[idx++] = SUCState;   /* Do we want to enable or disable?? */
        buffer[idx++] = bTxOption;
        buffer[idx++] = bCapabilities;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc

        cbFuncZWSetSUCNodeID = completedFunc;
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_SET_SUC_NODE_ID, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
    **    Enable/Disable home/node ID learn mode.
    **    When learn mode is enabled, received "Assign ID's Command" are handled:
    **    If the current stored ID's are zero, the received ID's will be stored.
    **    If the received ID's are zero the stored ID's will be set to zero.
    **
    **    The learnFunc is called when the received assign command has been handled.
    **
    **/
    public void ZW_SetLearnMode(byte mode, ZW_cbFunc completedFunc ) {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = mode;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc
        cbFuncZWSetLearnMode = completedFunc;
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_SET_LEARN_MODE, buffer, idx);
    }


    public byte ZW_SetSlaveLearnMode(byte node, byte mode, ZW_cbFunc completedFunc){
        int retVal;
        idx = 0;

        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = node;
        buffer[idx++] = mode;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc
        cbFuncZWSetSlaveLearnMode = completedFunc;
        retVal = serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_SET_SLAVE_LEARN_MODE, buffer, idx, buffer);
        if(getResponseRet(retVal) == T_CON_TYPE.conFrameReceived){
            return buffer[IDX_DATA];
        }
        return 0;
    }

    /**
     * Set ApplicationNodeInformation data to be used in subsequent
     * calls to \ref ZW_SendSlaveNodeInformation.
     * This takes effect for all virtual nodes, regardless of dstNode value.
     * @param dstNode     Virtual node id. This value is IGNORED.
     * @param listening   = TRUE : if this node is always on air
     * @param nodeType    Device type
     * @param nodeParm    Device parameter buffer
     * @param parmLength  Number of Device parameter bytes
     */
    public void SerialAPI_ApplicationSlaveNodeInformation(byte dstNode, byte listening,
                                                          ZW_Basis_API.APPL_NODE_TYPE nodeType, byte[] nodeParm,
                                                          byte parmLength) {
        int i;
        idx = 0;
        buffer[idx++] = dstNode;
        buffer[idx++] = listening;
        buffer[idx++] = (byte)nodeType.generic.get();
        buffer[idx++] = (byte)nodeType.specific.get();
        buffer[idx++] = parmLength;

        for (i = 0; i != parmLength; i++) {
            buffer[idx++] = nodeParm[i];
        }
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_SERIAL_API_APPL_SLAVE_NODE_INFORMATION, buffer, idx);
    }

    /**
     * Get Serial API initialization data from remote side (Enhanced Z-Wave module).
     * param[out]   ver            Remote sides Serial API version
     * param[out]   capabilities   Capabilities flag (GET_INIT_DATA_FLAG_xxx)
     *   Capabilities flag:
     *      Bit 0: 0 = Controller API; 1 = Slave API
     *      Bit 1: 0 = Timer functions not supported; 1 = Timer functions supported.
     *      Bit 2: 0 = Primary Controller; 1 = Secondary Controller
     *      Bit 3: 0 = Not SUC; 1 = This node is SUC (static controller only)
     *      Bit 3-7: Reserved
     *   Timer functions are: TimerStart, TimerRestart and TimerCancel.
     * param[out]   len            Number of bytes in nodesList
     * param[out]   nodesList      Bitmask list with nodes known by Z-Wave module
     */
    public boolean SerialAPI_GetInitData(ZW_Basis_API.InitData data) {
        int p = 0;
        int i;
        idx = 0;
        byLen = 0;
        byte nodesList[] = new byte[29];

        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_SERIAL_API_GET_INIT_DATA, null, (byte) 0, buffer);

        data.setVersion(buffer[IDX_DATA + p]);
        p++;

        //controller api eller slave api
        data.setCapabilities(buffer[IDX_DATA + p]);
        p++;

        data.setNodesListLen(buffer[IDX_DATA + p]);
        p++;

        for (i = 0; i < 29; i++) {
            nodesList[i] = buffer[IDX_DATA + p];
            p++;
        }
        data.setNodesList(nodesList);

        data.setChip_type(buffer[IDX_DATA + p]);
        p++;
        data.setChip_version(buffer[IDX_DATA + p]);
        // Bit 2 tells if it is Primary Controller (FALSE) or Secondary Controller (TRUE).
        return (((data.getCapabilities()) & ZW_Func_ID.GET_INIT_DATA_FLAG_SECONDARY_CTRL) != 0);
    }

    /**
     * Enable the SUC functionality in a controller.
     * @param state
     *   = 1 : Enable SUC \n
     *   = 0 : Disable SUC \n
     * @param capabilities
     *   = ZW_SUC_FUNC_BASIC_SUC : Only enables the basic SUC functionality \n
     *   = ZW_SUC_FUNC_NODEID_SERVER : Enable the node ID server functionality to become a SIS. \n
     * return
     *   = 1 : The SUC functionality was enabled/disabled \n
     *   = 0 : Attempting to disable a running SUC, not allowed \n
     */
    public byte ZW_EnableSUC(byte state, byte capabilities)
    {
        idx = 0;
        idx++;
        buffer[idx++] = state;
        buffer[idx++] = capabilities;
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_ENABLE_SUC, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Function description.
     * Request a node to send it's node information.
     * Function return TRUE if the request is send, else it return FALSE.
     * FUNC is a callback function, which is called with the status of the
     * Request nodeinformation frame transmission.
     * if a node sends its node info, ApplicationControllerUpdate will be called
     * with UPDATE_STATE_NODE_INFO_RECEIVED as status together with the received node information.
     *
     **/
    public byte ZW_RequestNodeInfo(byte nodeID) {
        idx = 0;
        byLen = 0;
        buffer[idx++] = nodeID;
        idx++;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_REQUEST_NODE_INFO, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Used when the controller is replication mode.
     * It sends the payload and expects the receiver to respond with a command complete message.
     * @param nodeID         Destination node ID
     * @param pData          Data buffer pointer
     * @param dataLength     Data buffer length
     * @param txOptions      Transmit option flags
     * @param completedFunc  Transmit completed call back function
     * return 0 if transmitter queue overflow
     */

    byte ZW_ReplicationSend(byte nodeID, byte[] pData, byte dataLength, byte txOptions, ZW_cbFunc completedFunc) {
        int i;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        idx = 0;
        buffer[idx++] = nodeID;
        buffer[idx++] = dataLength;

        for (i = 0; i < dataLength; i++)
            buffer[idx++] = pData[i];

        buffer[idx++] = txOptions;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc
        byLen = 0;
        cbFuncZWReplicationSendData = completedFunc;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_REPLICATION_SEND_DATA, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Get capabilities of a controller.
     * return
     *   = CONTROLLER_IS_SECONDARY :
     *      If bit is set then the controller is a secondary controller \n
     *   = CONTROLLER_ON_OTHER_NETWORK :
     *      If this bit is set then this controller is not using its build-in home ID \n
     *   = CONTROLLER_IS_SUC :
     *      If this bit is set then this controller is a SUC \n
     *   = CONTROLLER_NODEID_SERVER_PRESENT :
     *      If this bit is set then there is a SUC ID server (SIS)
     *      in the network and this controller can therefore
     *      include/exclude nodes in the network (inclusion controller). \n
     */
    byte ZW_GetControllerCapabilities() {
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_GET_CONTROLLER_CAPABILITIES, null, (byte)0, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * Used to request network topology updates from the SUC/SIS node. The update is done on protocol level
     * and any changes are notified to the application by calling the ApplicationControllerUpdate).
     * Secondary controllers can only use this call when a SUC is present in the network. All controllers can
     * use this call in case a SUC ID Server (SIS) is available.
     * Routing Slaves can only use this call, when a SUC is present in the network. In case the Routing Slave
     * has called ZW_RequestNewRouteDestinations prior to ZW_RequestNetWorkUpdate, then Return
     * Routes for the destinations specified by the application in ZW_RequestNewRouteDestinations will be
     * updated along with the SUC Return Route.
     * note
     * The SUC can only handle one network update at a time, so care should be taken not to have all
     * the controllers in the network ask for updates at the same time.
     * warning
     * This API call will generate a lot of network activity that will use bandwidth and stress the
     * SUC in the network. Therefore, network updates should be requested as seldom as possible and never
     * more often that once every hour from a controller.

     * return
     * 1 If the updating process is started.
     * 0 If the requesting controller is the SUC node or the SUC node is unknown.
     * @param completedFunc Transmit complete call back.
     * ZW_SUC_UPDATE_DONE The update process succeeded.
     * ZW_SUC_UPDATE_ABORT The update process aborted because of
     * an error.
     * ZW_SUC_UPDATE_WAIT The SUC node is busy.
     * ZW_SUC_UPDATE_DISABLED The SUC functionality is disabled.
     * ZW_SUC_UPDATE_OVERFLOW The controller requested an update after more than 64 changes have occurred in
     * the network. The update information is then out of date in respect to that
     * controller. In this situation the controller have to make a replication
     * before trying to request any new network updates.
     * Timeout: 35s
     * Exption recovery: Resume normal operation, no recovery needed
     **/
    public byte ZW_RequestNetWorkUpdate(ZW_cbFunc completedFunc)
    {
        idx = 0;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        buffer[idx++] = byCompletedFunc;
        cbFuncZWRequestNetworkUpdate = completedFunc;
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_REQUEST_NETWORK_UPDATE, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * This function sends out an explorer frame requesting inclusion into a network. If the inclusion request is
     * accepted by a controller in network wide inclusion mode then the application on this node will get notified
     * through the callback from the ZW_SetLearnMode() function. Once a callback is received from
     * ZW_SetLearnMode() saying that the inclusion process has started the application should not make
     * further calls to this function.
     * return
     *  1 Inclusion request queued for transmission
     * return
     *  0 Node is not in learn mode
     *  note Recommend not to call this function more than once every 4 seconds.
     *  serialapi{
     *  HOST->ZW: REQ|0x5E
     *  ZW->HOST: RES|0x5E|retVal
     *  }
     */
    public byte ZW_ExploreRequestInclusion() {
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_EXPLORE_REQUEST_INCLUSION, null, (byte)0, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * ingroup BASIS
     * macro{ZW_GET_PROTOCOL_STATUS()}
     * Report the status of the protocol.
     * The function return a mask telling which protocol function is currently running
     * return
     * Zero Protocol is idle.
     * return
     * ZW_PROTOCOL_STATUS_ROUTING Protocol is analyzing the routing table.
     * return
     * ZW_PROTOCOL_STATUS_SUC  SUC sends pending updates.
     * serialapi
     * HOST->ZW: REQ | 0xBF
     * ZW->HOST: RES | 0xBF | retVal
     */
    public byte ZW_GetProtocolStatus()
    {
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_GET_PROTOCOL_STATUS, null, (byte)0, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * ingroup ZWCMD
     * Get the Z Wave library type.
     * return
     *   = ZW_LIB_CONTROLLER_STATIC	Static controller library
     *   = ZW_LIB_CONTROLLER_BRIDGE	Bridge controller library
     *   = ZW_LIB_CONTROLLER	        Portable controller library
     *   = ZW_LIB_SLAVE_ENHANCED	    Enhanced slave library
     *   = ZW_LIB_SLAVE_ROUTING	    Routing slave library
     *   = ZW_LIB_SLAVE	            Slave library
     *   = ZW_LIB_INSTALLER	        Installer library
     */
    public byte ZW_Type_Library() {
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_TYPE_LIBRARY, null, (byte) 0, buffer);

        return buffer[IDX_DATA];
    }

    /**
     * Sends command completed to sending controller. Called in replication mode when a command from the
     * sender has been processed and indicates that the controller is ready for next packet.
     */
    public void ZW_ReplicationReceiveComplete() {
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_REPLICATION_COMMAND_COMPLETE, null, (byte) 0);
    }

    /**
     * Reset the by Soft
     */
    public void ZW_SoftReset() {
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_REPLICATION_COMMAND_COMPLETE, null, (byte) 0);
    }

    /**
     * Get the current power level used in RF transmitting.
     * note
     * This function should only be used in an install/test link situation.
     * @return
     * The power level currently in effect during RF transmissions
     * sa ZW_RFPowerLevelSet
     *
     * serial api
     * HOST->ZW: REQ | 0xBA
     * ZW->HOST: RES | 0xBA | powerlevel
     *
     */
    public byte ZW_RFPowerLevelGet() {
        idx = 0;
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_RF_POWER_LEVEL_GET, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * ingroup ZWCMD
     * Transmit data buffer to a list of Z-Wave Nodes (multicast frame).
     * param[in] pNodeIDList    List of destination node ID's
     * param[in] numberNodes    Number of Nodes
     * param[in] pData          Data buffer pointer
     * param[in] dataLength     Data buffer length
     * param[in] txOptions      Transmit option flags
     * param[in] completedFunc  Transmit completed call back function
     * @return 1 if transmitter queue overflow
     */
    public byte ZW_SendDataMulti(byte[] pNodeIDList, byte numberNodes, byte[] pData, byte dataLength,
                                 byte txOptions, ZW_cbFunc completedFunc)
    {
        int i;
        byte byCompletedFunc;
        byCompletedFunc = (completedFunc == null ? (byte)0 : 0x03);
        idx = 0;

        numberNodes = (numberNodes <= (byte)ZW_Func_ID.ZW_MAX_NODES) ? numberNodes : (byte)ZW_Func_ID.ZW_MAX_NODES;
        buffer[idx++] = numberNodes;

        for (i = 0; i < numberNodes; i++) {
            buffer[idx++] = pNodeIDList[i];
        }

        buffer[idx++] = dataLength;

        for (i = 0; i < dataLength; i++) {
            buffer[idx++] = pData[i];
        }

        buffer[idx++] = txOptions;
        buffer[idx++] = byCompletedFunc;    // Func id for CompletedFunc
        byLen = 0;
        cbFuncZWSendDataMulti = completedFunc;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_SEND_DATA_MULTI, buffer, idx, buffer);
        return buffer[IDX_DATA];
    }

    /**
     * ingroup BASIS
     * The API call generates a random word using the ZW0201/ZW0301 builtin random number
     * generator (RNG). If RF needs to be in Receive then ZW_SetRFReceiveMode should be called afterwards.
     * @return
     * 1 If possible to generate random number.
     * 0  If not possible e.g. RF not powered down.
     * param[in,out] randomWord Pointer to word variable, which should receive the random word.
     * param[in] bResetRadio  If TRUE the RF radio is reinitialized after generating the random word.
     *
     * note
     * The ZW0201/ZW0301 RNG is based on the RF transceiver, which must be in powerdown
     * state (see ZW_SetRFReceiveMode) to assure proper operation of the RNG. Remember
     * to call ZW_GetRandomWord with bResetRadio = TRUE when the last random word is to
     * be generated. This is needed for the RF to be reinitialized, so that it can be
     * used to transmit and receive again.
     * *
     * macro{ZW_GET_RANDOM_WORD(randomWord\,bResetRadio)}
     * serialapi{
     * HOST -> ZW: REQ | 0x1C | noRandomBytes
     * ZW -> HOST: RES | 0x1C | randomGenerationSuccess | noRandomBytesGenerated | randombytes[]
     * }
     * note
     * The Serial API function 0x1C makes use of the ZW_GetRandomWord to generate a specified number of random bytes and takes care of the handling of the RF:
     * - Set the RF in powerdown prior to calling the ZW_GetRandomWord the first time, if not possible then return result to HOST.
     * - Call ZW_GetRandomWord until enough random bytes generated or ZW_GetRandomWord returns FALSE.
     * - Call ZW_GetRandomWord with bResetRadio = TRUE to reinitialize the radio.
     * - Call ZW_SetRFReceiveMode with TRUE if the serialAPI hardware is a listening device or with FALSE if it is a non-listening device.
     * - Return result to HOST.
     *
     * param[in]  noRandomBytes to generate
     * param[out] randomGenerationSuccess  TRUE if random bytes could be generated
     * param[out] noRandomBytesGenerated   Number of random numbers generated
     * param[out] randombytes[] Array of generated random bytes
     *
     */
    public boolean ZW_GetRandomWord(byte[] randomWord, byte bResetRadio)
    {
        int i;
        idx = 0;

        /*  bLine | bRemoveBad | bRemoveNonReps | funcID */
        buffer[idx++] = 0x8;
        byLen = 0;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_GET_RANDOM, buffer, idx, buffer);
        for (i = 0; i < 0x8; i++) {
            randomWord[i] = buffer[IDX_DATA + i + 2];
        }

        return true;
    }

    /**
     * The Serial API function 0x1C makes use of the ZW_GetRandomWord to generate a specified number
     * of random bytes and takes care of the handling of the RF:
     *  - Set the RF in powerdown prior to calling the ZW_GetRandomWord the first time, if not
     *    possible then return result to HOST.
     *  - Call ZW_GetRandomWord until enough random bytes generated or ZW_GetRandomWord
     *    returns FALSE.
     *  - Call ZW_GetRandomWord with bResetRadio = TRUE to reinitialize the radio.
     *  - Call ZW_SetRFReceiveMode with TRUE if the serialAPI hardware is a listening device or with
     *    FALSE if it is a non-listening device.
     *  - Return result to HOST.
     *
     *  @param count Number of random bytes needed. Returned Range 1...32 random bytes are supported.
     *  @param randomBytes  Destination buffer.
     *
     */
    boolean SerialAPI_GetRandom(byte count, byte randomBytes[]) {
        idx = 0;
        buffer[idx++] = count;
        byLen = 0;

        if(BuildConfig.DEBUG && !(count <= 32)) {
            throw new AssertionError();
        }

        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_GET_RANDOM, buffer, idx, buffer);

        if (buffer[IDX_DATA] == 0)
            return false;

        System.arraycopy(buffer, IDX_DATA + 2, randomBytes, 0, buffer[IDX_DATA + 1]);
        return true;
    }

    public void ZW_GetBasic(byte[] pData) {
        int i;
        idx = 0;
        byLen = 0;

        byte[] temp = new byte[0];
        serialAPINative.SendFrameWithResponse((byte) BASIC_GET, temp, (byte) 0, buffer);
        for (i = 0; i < 29; i++) {
            pData[i] = buffer[IDX_DATA + i + 3];
        }
    }

    /**
     * This function is used to request whether the controller is a primary controller or a
     * secondary controller in the network.
     * @return
     * TRUE when the controller is a primary controller in the network.
     * FALSE when the controller is a secondary controller in the network.
     */
    public boolean ZW_IsPrimaryCtrl() {
        return ((ZW_GetControllerCapabilities() & 0x01) == 0);
    }

    /**
     * This function may be used to disable the 500 Series Z-Wave SoC built in watchdog.
     * */
    public void ZW_WatchDogDisable() {
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_WATCHDOG_DISABLE, null, (byte) 0);
    }

    /**
     * This function may be used to enable the 500 Series Z-Wave SoC built-in watchdog.
     * */
    public void ZW_WatchDogEnable() {
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_ZW_WATCHDOG_ENABLE, null, (byte) 0);
    }

    /**
     * Use this function to set the maximum number of source routing attempts before the explorer
     * frame mechanism kicks in. Default value with respect to maximum number of source routing attempts is five.
     * Remember to enable the explorer frame mechanism by setting the transmit option flag
     * TRANSMIT_OP TION_EXPLORE in the send data calls.
     * @param maxRouteTries Maximum number of source routing attempts
     */
    public void ZW_SetRoutingMAX(byte maxRouteTries) {
        idx = 0;
        byLen = 0;
        buffer[idx++] = maxRouteTries;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_SET_ROUTING_MAX, buffer, idx, buffer);
    }


    /* Enable Auto Programming over serial interface */
    public void ZW_AutoProgrammingEnable() {
        serialAPINative.SendFrame(ZW_Func_ID.FUNC_ID_AUTO_PROGRAMMING, null, (byte) 0);
    }

    /**
     *  Use this API call to get the Last Working Route (LWR) for a destination node if any exist.
     *  The LWR is the last successful route used between sender and destination node. The LWR is
     *  stored in NVM.
     *  @param bNodeID IN The Node ID (1...232) specifies the destination node whom the LWR is wanted from.
     *  @param pLastWorkingRoute Pointer to a 5-byte array where the wanted LWR will be written.
     *  The 5-byte array contains in the first 4 byte the max 4 repeaters (index 0 -3) and
     *  1 routespeed byte (index 4) used in the LWR. The LWR which pLastWorkingRoute
     *  points to is valid if function return value equals
     *  TRUE. The first repeater byte (starting from index 0) equaling zero indicates no more
     *  repeaters in route. If the repeater at index 0 is zero then the LWR is direct. The routespeed
     *  byte (index 4) can be either ZW_LAST_WORKING_ROUTE_SPEED_9600,ZW_LAST_WORKING_ROUTE_SPEED_40K
     *  or ZW_LAST_WORKING_ROUTE_SPEED_100K
     *  @return
     *      1 A LWR exists for bNodeID and the found route placed in the 5-byte array pointed out by
     *      pLastWorkingRoute.
     *      0 No LWR found for bNodeID.
     *  Serial API
     *  HOST->ZW: REQ | 0x92 | bNodeID
     *  ZW->HOST: RES | 0x92 | bNodeID | retVal | repeater0 | repeater1 | repeater2 | repeater3 | routespeed
     */
    public byte ZW_GetLastWorkingRoute(byte bNodeID, byte[] pLastWorkingRoute) {
        idx = 0;
        byLen = 0;

        buffer[idx++] = bNodeID;
        serialAPINative.SendFrameWithResponse(ZW_Func_ID.FUNC_ID_ZW_GET_LAST_WORKING_ROUTE, buffer, idx, buffer);

        if(BuildConfig.DEBUG && !(bNodeID == buffer[IDX_DATA])) {
            throw new AssertionError();
        }

        System.arraycopy(buffer, IDX_DATA + 2, pLastWorkingRoute, 0, 5);

        return buffer[IDX_DATA + 1];
    }

    /**
     * Use this API call to set the Last Working Route (LWR) for a destination node. The LWR is the last
     * successful route used between sender and destination node. The LWR is stored in NVM.
     *
     * return BOOL TRUE The LWR for bNodeID was successfully set to the specified5-byte
     * LWR pointed out by pLastWorkingRoute. FALSE The specified bNodeID was not valid and no LWR was set.
     *
     * @param bNodeID The Node ID (1...232) - specifies the destination node for whom the LWR is to be set.
     * @param pLastWorkingRoute 5-byte array containing the new LWR to be set.
     * The 5-byte array contains 4 repeater node bytes (index 0 - 3) and 1 routespeed byte (index 4).
     * The first repeater byte (starting from index 0) equaling zero indicates no more repeaters in route.
     * If the repeater at index 0 is zero then the LWR is direct. The routespeed byte (index 4) can be either
     * ZW_LAST_WORKING_ROUTE_SPEED_9600,
     * ZW_LAST_WORKING_ROUTE_SPEED_40K or ZW_LAST_WORKING_ROUTE_SPEED_100K
     * @return
     *  1 The LWR for bNodeID was successfully set to the specified 5-byte LWR pointed out by pLastWorkingRoute.
     *  0 The specified bNodeID was not valid and no LWR was set.
     * Serial API
     * HOST->ZW: REQ | 0x93 | bNodeID | repeater0 | repeater1 | repeater2 | repeater3 | routespeed
     * ZW->HOST: RES | 0x93 | bNodeID | retVal
     */
    public byte ZW_SetLastWorkingRoute(byte bNodeID, byte[] pLastWorkingRoute) {
        idx = 0;
        buffer[idx++] = bNodeID;
        buffer[idx++] = pLastWorkingRoute[0];
        buffer[idx++] = pLastWorkingRoute[1];
        buffer[idx++] = pLastWorkingRoute[2];
        buffer[idx++] = pLastWorkingRoute[3];
        buffer[idx++] = pLastWorkingRoute[4];
        serialAPINative.SendFrameWithResponse(
                ZW_Func_ID.FUNC_ID_ZW_SET_LAST_WORKING_ROUTE,
                buffer, idx, buffer);
        return buffer[IDX_DATA];
    }
}
