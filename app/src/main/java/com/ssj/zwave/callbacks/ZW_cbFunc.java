package com.ssj.zwave.callbacks;

import com.ssj.zwave.serialapi.ZW_Basis_API;

/**
 * This class define some callback method that should be override
 * when you call some serial api completed. And this class should be Extended
 * by your class.
 *
 *
 */
public class ZW_cbFunc {
    public void cbFuncZWSendData(byte data, ZW_Basis_API.TX_STATUS_TYPE status_type){}
    public void cbFuncZWSendTestFrame(byte data){};
    public void cbFuncZWSendDataBridge(byte data, ZW_Basis_API.TX_STATUS_TYPE status_type){}
    public void cbFuncZWSendDataMulti(byte txStatus){}
    public void cbFuncZWSendNodeInformation(byte txStatus){}
    public void cbFuncMemoryPutBuffer(){}
    public void cbFuncZWSetDefault(){}
    public void cbFuncZWNewController(ZW_Basis_API.LEARN_INFO info){}
    public void cbFuncRemoveNodeFromNetwork(ZW_Basis_API.LEARN_INFO info){}
    public void cbFuncAddNodeToNetwork(ZW_Basis_API.LEARN_INFO info){}
    public void cbFuncZWControllerChange(ZW_Basis_API.LEARN_INFO info) {}

    public void cbFuncZWReplicationSendData(byte txStatus){}
    public void cbFuncZWAssignReturnRoute(byte bStatus){}
    public void cbFuncZWAssignSUCReturnRoute(byte bStatus){}
    public void cbFuncZWDeleteSUCReturnRoute(byte bStatus){}
    public void cbFuncZWDeleteReturnRoute(byte bStatus){}
    public void cbFuncZWSetLearnMode(ZW_Basis_API.LEARN_INFO info){}
    public void cbFuncZWSetSlaveLearnMode(byte bStatus, byte orgID, byte newID){}
    public void cbFuncZWRequestNodeNodeNeighborUpdate(byte bStatus){}
    public void cbFuncZWSetSUCNodeID(byte bSstatus){}
    public void cbFuncZWRequestNetworkUpdate(byte txStatus){}
    public void cbFuncZWRemoveFailedNode(byte txStatus){}
    public void cbFuncZWReplaceFailedNode(byte txStatus){}
}
