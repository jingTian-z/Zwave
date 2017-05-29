package com.ssj.zwave.serialapi;

import com.ssj.zwave.commandclass.ZW_ClassCommand;

import javolution.io.Struct;

public class ZW_Basis_API {

    /* ZW_LIBRARY_TYPEs one of these defines are returned when requesting */
    /* Library type */
    public static final byte ZW_LIB_CONTROLLER_STATIC = 0x01;
    public static final byte ZW_LIB_CONTROLLER        = 0x02;
    public static final byte ZW_LIB_SLAVE_ENHANCED    = 0x03;
    public static final byte ZW_LIB_SLAVE             = 0x04;
    public static final byte ZW_LIB_INSTALLER         = 0x05;
    public static final byte ZW_LIB_SLAVE_ROUTING     = 0x06;
    public static final byte ZW_LIB_CONTROLLER_BRIDGE = 0x07;
    public static final byte ZW_LIB_DUT               = 0x08;
    public static final byte ZW_LIB_AVREMOTE          = 0x0A;
    public static final byte ZW_LIB_AVDEVICE          = 0x0B;

    /* Callback states from ZW_AddNodeToNetwork */
    public static final byte ADD_NODE_STATUS_LEARN_READY          = 1;
    public static final byte ADD_NODE_STATUS_NODE_FOUND           = 2;
    public static final byte ADD_NODE_STATUS_ADDING_SLAVE         = 3;
    public static final byte ADD_NODE_STATUS_ADDING_CONTROLLER    = 4;
    public static final byte ADD_NODE_STATUS_PROTOCOL_DONE        = 5;
    public static final byte ADD_NODE_STATUS_DONE                 = 6;
    public static final byte ADD_NODE_STATUS_FAILED               = 7;
    public static final byte ADD_NODE_STATUS_SECURITY_FAILED      = 9;
    public static final byte ADD_NODE_STATUS_NOT_PRIMARY          = 0x23;

    /*============================================================================
    **    Defines for ApplicationNodeInformation field deviceOptionMask
    **--------------------------------------------------------------------------*/
    public static final byte APPLICATION_NODEINFO_NOT_LISTENING            = 0x00;
    public static final byte APPLICATION_NODEINFO_LISTENING                = 0x01;
    public static final byte APPLICATION_NODEINFO_OPTIONAL_FUNCTIONALITY   = 0x02;
    public static final byte APPLICATION_FREQ_LISTENING_MODE_1000ms        = 0x10;
    public static final byte APPLICATION_FREQ_LISTENING_MODE_250ms         = 0x20;

    /* Node type structure used in ApplicationNodeInformation */
    public static class APPL_NODE_TYPE extends Struct {
        public final Unsigned8 generic = new Unsigned8();
        public final Unsigned8 specific = new Unsigned8();
    }


    public static class NODE_TYPE extends Struct {
        public final Unsigned8 basic = new Unsigned8();
        public final Unsigned8 generic = new Unsigned8();
        public final Unsigned8 specific = new Unsigned8();
    }

    public static class LEARNINFO extends Struct {
        public final Unsigned8 capability = new Unsigned8();
        public final Unsigned8 security = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public NODE_TYPE nodeType = new NODE_TYPE();
    }

    /* Max hops in route */
    private static final int MAX_REPEATERS = 4;

    private static class Rssi_Pair extends Struct {
        public final Unsigned8 incoming = new Unsigned8();
        public final Unsigned8 outgoing = new Unsigned8();
    };

    public static class TX_STATUS_TYPE extends Struct {
        /* Repeaters in route, zero for direct range */
        public final Unsigned8  bRepeaters = new Unsigned8();
        /* rssi_values per hop for direct and routed frames.
         * Contains repeaters + 1 value pairs. Each pair contains an
         * incoming and an outgoing rssi value. */
        public final Rssi_Pair[] rssi_values = new Rssi_Pair[MAX_REPEATERS + 1];
    }

    /* Learn node state information passed by the call back function */
    public static class LEARN_INFO extends Struct {
        public final Unsigned8 bStatus = new Unsigned8();               /* Status of learn mode */
        public final Unsigned8 bSource = new Unsigned8();               /* Node id of the node that send node info */
        public final Unsigned8[] pCmd = array(new Unsigned8[SerialAPI.BUF_SIZE]); /* Pointer to Application Node information */
        public final Unsigned8 bLen = new Unsigned8();                  /* Node info length */
    }

    public static class AppCmdHandlerParameter {
        private byte rxStatus;
        private byte destNode;
        private byte sourceNode;
        private ZW_ClassCommand.ZW_APPLICATION_TX_BUFFER pCmd;
        private byte cmdLength;

        public byte getRxStatus() {
            return rxStatus;
        }

        public void setRxStatus(byte rxStatus) {
            this.rxStatus = rxStatus;
        }

        public byte getDestNode() {
            return destNode;
        }

        public void setDestNode(byte destNode) {
            this.destNode = destNode;
        }

        public byte getSourceNode() {
            return sourceNode;
        }

        public void setSourceNode(byte sourceNode) {
            this.sourceNode = sourceNode;
        }

        public byte getCmdLength() {
            return cmdLength;
        }

        public void setCmdLength(byte cmdLength) {
            this.cmdLength = cmdLength;
        }

        public ZW_ClassCommand.ZW_APPLICATION_TX_BUFFER getpCmd() {
            return pCmd;
        }

        public void setpCmd(ZW_ClassCommand.ZW_APPLICATION_TX_BUFFER pCmd) {
            this.pCmd = pCmd;
        }
    }

    public static class AppNodeInfoParameter {
        private byte deviceOptionsMask;
        private ZW_Basis_API.APPL_NODE_TYPE nodeType;
        private byte[] nodeParm;
        private byte parmLength;

        public byte getDeviceOptionsMask() {
            return deviceOptionsMask;
        }

        public APPL_NODE_TYPE getNodeType() {
            return nodeType;
        }

        public byte getParmLength() {
            return parmLength;
        }

        public byte[] getNodeParm() {
            return nodeParm;
        }

        public void setDeviceOptionsMask(byte deviceOptionsMask) {
            this.deviceOptionsMask = deviceOptionsMask;
        }

        public void setNodeParm(byte[] nodeParm) {
            this.nodeParm = nodeParm;
        }

        public void setNodeType(APPL_NODE_TYPE nodeType) {
            this.nodeType = nodeType;
        }

        public void setParmLength(byte parmLength) {
            this.parmLength = parmLength;
        }
    }

    public static class AppControllerUpdateParameter {
        private byte bStatus;
        private byte bNodeID;
        private byte[] pCmd;
        private byte bLen;

        public byte getbLen() {
            return bLen;
        }

        public byte getbNodeID() {
            return bNodeID;
        }

        public byte getbStatus() {
            return bStatus;
        }

        public byte[] getpCmd() {
            return pCmd;
        }

        public void setbLen(byte bLen) {
            this.bLen = bLen;
        }

        public void setbNodeID(byte bNodeID) {
            this.bNodeID = bNodeID;
        }

        public void setbStatus(byte bStatus) {
            this.bStatus = bStatus;
        }

        public void setpCmd(byte[] pCmd) {
            this.pCmd = pCmd;
        }
    }

    public static class InitData {
        private byte version;
        private byte capabilities;
        private byte nodesListLen;
        private byte nodesList[];
        private byte chip_type;
        private byte chip_version;

        public byte getCapabilities() {
            return capabilities;
        }

        public byte getChip_type() {
            return chip_type;
        }

        public byte getChip_version() {
            return chip_version;
        }

        public byte getNodesListLen() {
            return nodesListLen;
        }

        public byte getVersion() {
            return version;
        }

        public byte[] getNodesList() {
            return nodesList;
        }

        public void setCapabilities(byte capabilities) {
            this.capabilities = capabilities;
        }

        public void setChip_type(byte chip_type) {
            this.chip_type = chip_type;
        }

        public void setChip_version(byte chip_version) {
            this.chip_version = chip_version;
        }

        public void setNodesListLen(byte nodesListLen) {
            this.nodesListLen = nodesListLen;
        }

        public void setNodesList(byte[] nodesList) {
            this.nodesList = nodesList;
        }

        public void setVersion(byte version) {
            this.version = version;
        }
    }
}
