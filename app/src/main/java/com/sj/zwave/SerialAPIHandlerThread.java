package com.sj.zwave;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.ssj.zwave.callbacks.SerialAPI_Callbacks;
import com.ssj.zwave.callbacks.ZW_cbFunc;
import com.ssj.zwave.serialapi.ZW_Basis_API;
import com.ssj.zwave.commandclass.ZW_ClassCommand;
import com.ssj.zwave.commandclass.ZW_ClassCommand_Const;
import com.ssj.zwave.serialapi.SerialAPI;
import com.ssj.zwave.serialapi.ZW_controller_Api;
import com.ssj.zwave.serialapi.ZW_transport_Api;

public class SerialAPIHandlerThread extends HandlerThread implements Handler.Callback {
    private String TAG = "SERIAL_API";

    public static final int SET_DEFAULT = 0;
    public static final int SERIALAPI_INIT = 1;
    public static final int SET_ASSOCIATION = 3;
    public static final int ADD_NODE_TO_NETWORK = 5;
    public static final int RM_NODE_FROM_NETWORK = 6;
    public static final int RM_ASSOCIATION = 7;
    public static final int PARAM50 = 9;
    public static final int PARAM51 = 10;
    public static final int ON = 11;
    public static final int OFF = 12;

    private String SerialPort = "/dev/ttyACM0";
    private SerialAPI serialAPI;
    static Handler handler;


    public byte newNodeID;
    ZW_Basis_API.LEARNINFO nodeInfo = new ZW_Basis_API.LEARNINFO();  //NIF
    MainFragment mainFragment = new MainFragment();

    private myCbFunc cbFunc = new myCbFunc();
    private SerialAPI_Callbacks serialAPICallbacks = new SerialAPI_Callbacks(){
        @Override
        public void ApplicationCommandHandler(ZW_Basis_API.AppCmdHandlerParameter parameter) {
            super.ApplicationCommandHandler(parameter);
            switch (parameter.getRxStatus()){
                case ZW_transport_Api.RECEIVE_STATUS_ROUTED_BUSY:
                    Log.d(TAG, "RECEIVE_STATUS_ROUTED_BUSY");
                    break;
                case ZW_transport_Api.RECEIVE_STATUS_LOW_POWER:
                    Log.d(TAG, "RECEIVE_STATUS_LOW_POWER");
                    break;
                case ZW_transport_Api.RECEIVE_STATUS_TYPE_SINGLE:
                    Log.d(TAG, "form node" + parameter.getSourceNode());
                    Log.d(TAG, " class 0x" + Integer.toHexString(parameter.getpCmd().ZW_Common.cmdClass.get())
                            + " size " + String.valueOf(parameter.getCmdLength()));
                    Log.d(TAG, "Sensor status " + Integer.toHexString(serialAPI.getpData()[8] & 0xff )); //

                    Log.d(TAG, "RECEIVE_STATUS_TYPE_SINGLE");
                    break;
                case ZW_transport_Api.RECEIVE_STATUS_TYPE_BROAD:
                    Log.d(TAG, "RECEIVE_STATUS_TYPE_BROAD");
                    break;
                case ZW_transport_Api.RECEIVE_STATUS_TYPE_MULTI: {
                    Log.d(TAG, "form node" + parameter.getSourceNode());
                    Log.d(TAG, " class 0x" + Integer.toHexString(parameter.getpCmd().ZW_Common.cmdClass.get())
                            + " size " + String.valueOf(parameter.getCmdLength()));
                    Log.d(TAG, "Sensor status " + Integer.toHexString(serialAPI.getpData()[8] & 0xff )); //
                    Log.d(TAG, "RECEIVE_STATUS_TYPE_MULTI");
                    break;
                }
                default:
                    break;
            }
            /*Log.d(TAG, "ApplicationCommandHandler node " + String.valueOf(parameter.getSourceNode())
                    + " class 0x" + Integer.toHexString(parameter.getpCmd().ZW_Common.cmdClass.get())
                    + " size " + String.valueOf(parameter.getCmdLength()));*/
        }
        @Override
        public void ApplicationCommandHandler_Bridge(ZW_Basis_API.AppCmdHandlerParameter parameter) {
            super.ApplicationCommandHandler_Bridge(parameter);
            switch (parameter.getRxStatus()){
                case ZW_transport_Api.RECEIVE_STATUS_ROUTED_BUSY:
                    Log.d(TAG, "RECEIVE_STATUS_ROUTED_BUSY");
                    break;
                case ZW_transport_Api.RECEIVE_STATUS_LOW_POWER:
                    Log.d(TAG, "RECEIVE_STATUS_LOW_POWER");
                    break;
                case ZW_transport_Api.RECEIVE_STATUS_TYPE_SINGLE:
                    Log.d(TAG, "form node" + parameter.getSourceNode());
                    Log.d(TAG, " class 0x" + Integer.toHexString(parameter.getpCmd().ZW_Common.cmdClass.get())
                            + " size " + String.valueOf(parameter.getCmdLength()));
                    //Log.d(TAG, "Sensor status " + Integer.toHexString(serialAPI.getpData()[9] & 0xff )); //
                    Log.d(TAG, "Sensor status " + Integer.toHexString(parameter.getpCmd().ZW_SensorBinaryReportFrame.sensorValue.get()));
                    switch (parameter.getpCmd().ZW_Common.cmdClass.get()){
                        case ZW_ClassCommand_Const.COMMAND_CLASS_ALARM:
                            Log.d(TAG, "cmd class " + Integer.toHexString(parameter.getpCmd().ZW_AlarmReportFrame.cmdClass.get()));
                            Log.d(TAG, "cmd " + Integer.toHexString(parameter.getpCmd().ZW_AlarmReportFrame.cmd.get()));
                            Log.d(TAG, "alarmLevel " + Integer.toHexString(parameter.getpCmd().ZW_AlarmReportFrame.alarmLevel.get()));
                            Log.d(TAG, "alarmType " + Integer.toHexString(parameter.getpCmd().ZW_AlarmReportFrame.alarmType.get()));
                            break;
                        case ZW_ClassCommand_Const.COMMAND_CLASS_SENSOR_BINARY:
                            Log.d(TAG, "sensorValue " + Integer.toHexString(parameter.getpCmd().ZW_SensorBinaryReportFrame.sensorValue.get()));
                            Log.d(TAG, "cmd class " + Integer.toHexString(parameter.getpCmd().ZW_SensorBinaryReportFrame.cmdClass.get()));
                            Log.d(TAG, "cmd " + Integer.toHexString(parameter.getpCmd().ZW_SensorBinaryReportFrame.cmd.get()));
                            break;
                        default:
                            break;
                     }
                    Log.d(TAG, "RECEIVE_STATUS_TYPE_SINGLE");
                    break;
                case ZW_transport_Api.RECEIVE_STATUS_TYPE_BROAD:
                    Log.d(TAG, "RECEIVE_STATUS_TYPE_BROAD");
                    break;
                case ZW_transport_Api.RECEIVE_STATUS_TYPE_MULTI: {
                    Log.d(TAG, "form node" + parameter.getSourceNode());
                    Log.d(TAG, " class 0x" + Integer.toHexString(parameter.getpCmd().ZW_Common.cmdClass.get())
                            + " size " + String.valueOf(parameter.getCmdLength()));
                    Log.d(TAG, "Sensor status " + Integer.toHexString(serialAPI.getpData()[9] & 0xff )); //
                    Log.d(TAG, "RECEIVE_STATUS_TYPE_MULTI");
                    break;
                }
                default:
                    break;
            }
        }

        @Override
        public void ApplicationControllerUpdate(ZW_Basis_API.AppControllerUpdateParameter parameter) {
            switch (parameter.getbStatus()){
                case ZW_controller_Api.UPDATE_STATE_NEW_ID_ASSIGNED:
                    Log.d(TAG, "Got node info from node " + String.valueOf(parameter.getbNodeID()));
                    break;
                case ZW_controller_Api.UPDATE_STATE_DELETE_DONE:
                    Log.d(TAG, "delete node info from node" + String.valueOf(parameter.getbNodeID()));
                    break;
                case (byte)ZW_controller_Api.UPDATE_STATE_NODE_INFO_RECEIVED:
                    break;
                case ZW_controller_Api.UPDATE_STATE_SUC_ID:
                    break;
                default:
                    break;
            }
        }

        @Override
        public void ApplicationNodeInformation(ZW_Basis_API.AppNodeInfoParameter parameter) {
            super.ApplicationNodeInformation(parameter);
            Log.d(TAG, "ApplicationNodeInformation");
	        /* this is a listening node and it supports optional CommandClasses */
            parameter.setDeviceOptionsMask((byte) (ZW_Basis_API.APPLICATION_NODEINFO_LISTENING
                    | ZW_Basis_API.APPLICATION_NODEINFO_OPTIONAL_FUNCTIONALITY));

            ZW_Basis_API.APPL_NODE_TYPE nodeType = new ZW_Basis_API.APPL_NODE_TYPE();
            nodeType.generic.set((short) 0x01); /* Generic device type */
            nodeType.specific.set((short) 0x02); /* Specific class */
            parameter.setNodeType(nodeType);

            byte MyClasses[] = {ZW_ClassCommand.COMMAND_CLASS_NO_OPERATION};
            parameter.setNodeParm(MyClasses);
            parameter.setParmLength((byte)MyClasses.length);
        }
    };

    public SerialAPIHandlerThread() {
        super("");
    }

    public void setSerialPort(String serialPort) {
        SerialPort = serialPort;
    }

    public String getSerialPort() {
        return SerialPort;
    }

    public class myCbFunc extends ZW_cbFunc {

        @Override
        public void cbFuncAddNodeToNetwork(ZW_Basis_API.LEARN_INFO info) {
            Log.d(TAG, "AddNodeStatusUpdate status=" +
                    info.bStatus.get() + " info len= " + info.bLen.get());
            switch (info.bStatus.get()) {
                case (short)ZW_controller_Api.ADD_NODE_STATUS_LEARN_READY:
                    break;
                case (short)ZW_controller_Api.ADD_NODE_STATUS_NODE_FOUND:
                    break;
                case (short)ZW_controller_Api.ADD_NODE_STATUS_ADDING_SLAVE:
                    Log.d(TAG, "included a slave type node " + info.bSource.get());
                case (short)ZW_controller_Api.ADD_NODE_STATUS_ADDING_CONTROLLER:
                    if (info.bLen.get() != 0) {
                        newNodeID = (byte)info.bSource.get();
                        Log.d(TAG, "Node added with node id " + String.valueOf(info.bSource.get()));
                    }
                    break;
                case (short)ZW_controller_Api.ADD_NODE_STATUS_PROTOCOL_DONE:
                    serialAPI.ZW_AddNodeToNetwork((byte) ZW_controller_Api.ADD_NODE_STOP, null);
                    break;
                case (short)ZW_controller_Api.ADD_NODE_STATUS_DONE:
                case (short)ZW_controller_Api.ADD_NODE_STATUS_FAILED:
                    Log.d(TAG, "inclusion was not successful. New node is not ready for operation");
                    serialAPI.ZW_AddNodeToNetwork((byte) ZW_controller_Api.ADD_NODE_STOP, null);
                case (short)ZW_controller_Api.ADD_NODE_STATUS_NOT_PRIMARY:
                    break;
                default:
                    break;
            }
        }

        @Override
        public void cbFuncRemoveNodeFromNetwork(ZW_Basis_API.LEARN_INFO info) {
            Log.d(TAG, "Remove Node Status Update " + String.valueOf(info.bStatus.get()));
            switch (info.bStatus.get()){
                case (short)ZW_controller_Api.ADD_NODE_STATUS_LEARN_READY:
                    Log.d(TAG, "Z-Wave protocol is ready to remove a node.");
                    break;
                case (short)ZW_controller_Api.REMOVE_NODE_STATUS_NODE_FOUND:
                    Log.d(TAG, "Z-Wave protocol detected node");
                    break;
                case (short)ZW_controller_Api.REMOVE_NODE_STATUS_DONE:
                    break;
                case (short)ZW_controller_Api.REMOVE_NODE_STATUS_FAILED:
                    Log.d(TAG, "removed was not successful");
                    break;
                case (short)ZW_controller_Api.REMOVE_NODE_STATUS_REMOVING_SLAVE:
                    Log.d(TAG, "removed a slave type node " + String.valueOf(info.bSource.get()));
                    break;
                case (short)ZW_controller_Api.REMOVE_NODE_STATUS_REMOVING_CONTROLLER:
                    Log.d(TAG, "removed a controller type node " + String.valueOf(info.bSource.get()));
                    break;
                default:
                    break;
            }
        }

        @Override
        public void cbFuncZWSetDefault() {
            Log.d(TAG, "SetDefaultComplete");
        }

        @Override
        public void cbFuncZWSendData(byte data, ZW_Basis_API.TX_STATUS_TYPE status_type) {
            super.cbFuncZWSendData(data, status_type);
            Log.d(TAG, "send data complete");
        }
    }

    private void SetAssociation(byte nodeid, byte groupID){
        byte[] sendBuf = new byte[255];
        int idx = 0;

        sendBuf[idx++] = (byte) ZW_ClassCommand_Const.COMMAND_CLASS_ASSOCIATION;
        sendBuf[idx++] = ZW_ClassCommand_Const.ASSOCIATION_SET; //ASSOCIATION_SET;
        sendBuf[idx++] = groupID;
        sendBuf[idx++] = 1;
        if (groupID == 2)
            sendBuf[idx++] = 3;
        serialAPI.ZW_SendData(nodeid, sendBuf, (byte) idx,
                (byte) ZW_transport_Api.TRANSMIT_OPTION_ACK, cbFunc);
    }
    private void RemoveAssociation(byte nodeid, byte groupID){
        byte[] sendBuf = new byte[255];
        int idx = 0;

        sendBuf[idx++] = (byte) ZW_ClassCommand_Const.COMMAND_CLASS_ASSOCIATION;
        sendBuf[idx++] = ZW_ClassCommand_Const.ASSOCIATION_REMOVE;
        sendBuf[idx++] = groupID;
        sendBuf[idx++] = 1;
        if (groupID == 2)
            sendBuf[idx++] = 3;
        serialAPI.ZW_SendData(nodeid, sendBuf, (byte) idx,
                (byte) ZW_transport_Api.TRANSMIT_OPTION_ACK, cbFunc);
    }

    public void sendMessage(Message msg) {
        if(handler == null)
            handler = new Handler(getLooper(), this);
        handler.sendMessage(msg);
    }

    @Override
    public boolean handleMessage (Message msg){
        byte[] sendBuf = new byte[64];
        // process incoming messages here
        if(msg.what != SERIALAPI_INIT) {
            if (serialAPI == null) {
                Log.d(TAG, "SerialAPI need init");
                return false;
            }
        }

        switch (msg.what) {
            case SERIALAPI_INIT:
                if(serialAPI == null) {
                    serialAPI = new SerialAPI();
                    setSerialPort(msg.getData().getString("SerialPort"));
                    if(!serialAPI.SerialAPI_Init(SerialPort, serialAPICallbacks)) {
                        Log.e(TAG, "ERROR on Serial API Init");
                        serialAPI = null;
                        break;
                    }
                    if (serialAPI.ZW_IsPrimaryCtrl()) {
                        Log.d(TAG, "this is a primray controller");
                    } else {
                        Log.d(TAG, "this is a  secondry controller");
                    }

                } else {
                    Log.d(TAG, "Serial API has been init");
                }
                serialAPI.ReadThreadStart();
                break;
            case SET_DEFAULT:
                serialAPI.ZW_SetDefault(cbFunc);
                break;
            case SET_ASSOCIATION:
                serialAPI.ZW_GetNodeProtocolInfo((byte) msg.arg1, nodeInfo);
                if (nodeInfo.nodeType.generic.get() == 0){
                    Log.d(TAG, "The node signed by this nodeID is not exist");
                    break;
                }
                SetAssociation((byte) 2, (byte) msg.arg1);
                Log.d(TAG, "SetAssociation" + String.valueOf(msg.arg1) + " nodeID " + 2);
                break;
            case RM_ASSOCIATION:
                serialAPI.ZW_GetNodeProtocolInfo((byte) msg.arg1, nodeInfo);
                if (nodeInfo.nodeType.generic.get() == 0){
                    Log.d(TAG, "The node signed by this nodeID is not exist");
                    break;
                }
                RemoveAssociation((byte) 2, (byte) msg.arg1);
                Log.d(TAG, "Remove Association" + String.valueOf(msg.arg1) + " nodeID " + 2);
                break;
            case ADD_NODE_TO_NETWORK:
                serialAPI.ZW_AddNodeToNetwork((byte) (ZW_controller_Api.ADD_NODE_ANY |
                        ZW_controller_Api.ADD_NODE_OPTION_NETWORK_WIDE), cbFunc);
                break;
            case RM_NODE_FROM_NETWORK:
                serialAPI.ZW_RemoveNodeFromNetwork((byte) ZW_controller_Api.REMOVE_NODE_ANY, cbFunc);
                break;
            case PARAM50:
                sendBuf[0] = ZW_ClassCommand_Const.COMMAND_CLASS_CONFIGURATION;
                sendBuf[1] = ZW_ClassCommand_Const.CONFIGURATION_SET;
                sendBuf[2] = 0x32;
                sendBuf[3] = 0x02;
                sendBuf[4] = 0x00;
                sendBuf[5] = 0x0a;
                serialAPI.ZW_SendData((byte) 0x02, sendBuf, (byte) 6,
                        (byte) ZW_transport_Api.TRANSMIT_OPTION_ACK, cbFunc);
                break;
            case PARAM51:
                sendBuf[0] = ZW_ClassCommand_Const.COMMAND_CLASS_CONFIGURATION;
                sendBuf[1] = ZW_ClassCommand_Const.CONFIGURATION_SET;
                sendBuf[2] = 0x33;
                sendBuf[3] = 0x02;
                sendBuf[4] = 0x00;
                sendBuf[5] = 0x14;
                serialAPI.ZW_SendData((byte)0x02, sendBuf, (byte)6,
                        (byte) ZW_transport_Api.TRANSMIT_OPTION_ACK, cbFunc);
                break;
            case ON:
                sendBuf[0] = ZW_ClassCommand_Const.COMMAND_CLASS_BASIC;
                sendBuf[1] = ZW_ClassCommand_Const.BASIC_SET;
                sendBuf[2] = (byte)0xFF;
                serialAPI.ZW_SendData((byte)0x02, sendBuf, (byte)3,
                        (byte) ZW_transport_Api.TRANSMIT_OPTION_ACK, cbFunc);
                break;
            case OFF:
                sendBuf[0] = ZW_ClassCommand_Const.COMMAND_CLASS_BASIC;
                sendBuf[1] = ZW_ClassCommand_Const.BASIC_SET;
                sendBuf[2] = (byte)0x00;
                serialAPI.ZW_SendData((byte) 0x02, sendBuf, (byte) 3,
                        (byte) ZW_transport_Api.TRANSMIT_OPTION_ACK, cbFunc);
                break;
            default:
                break;
        }
        return true;
    }
}
