package com.ssj.zwave.callbacks;

import com.ssj.zwave.serialapi.ZW_Basis_API;

/**
 * When call SerialAPI_Init method and Initialize the Serial API,
 * some methods of those maybe called.
 * The Z-Wave library requires the functions mentioned here implemented within the Application layer.
 */
public class SerialAPI_Callbacks {
    public void ApplicationCommandHandler(ZW_Basis_API.AppCmdHandlerParameter parameter) {}

    public void ApplicationNodeInformation(ZW_Basis_API.AppNodeInfoParameter parameter) {
        parameter.setDeviceOptionsMask((byte)0);
        parameter.setNodeType(new ZW_Basis_API.APPL_NODE_TYPE());
        parameter.setNodeParm(new byte[4]);
        parameter.setParmLength((byte)0);
    }

    public void ApplicationControllerUpdate(ZW_Basis_API.AppControllerUpdateParameter parameter){};

    public boolean ApplicationInitHW (byte bWakeupReason){return true;}

    public boolean ApplicationInitSW(){ return true;}

    public void ApplicationPoll(){}

    public void ApplicationTestPoll(){}

    public void ApplicationCommandHandler_Bridge(ZW_Basis_API.AppCmdHandlerParameter parameter) {}
}
