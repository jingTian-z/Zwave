package com.ssj.zwave.serialapi;


public class ZW_controller_Api {
    public final static int MAX_REPEATERS = 4;

    /****************************************************************************/
/*                     EXPORTED TYPES and DEFINITIONS                       */
/****************************************************************************/

    /* Mode parameters to ZW_AddNodeToNetwork */
    public static final int ADD_NODE_ANY = 1;
    public static final int ADD_NODE_CONTROLLER = 2;
    public static final int ADD_NODE_SLAVE = 3;
    public static final int ADD_NODE_EXISTING = 4;
    public static final int ADD_NODE_STOP = 5;
    public static final int ADD_NODE_STOP_FAILED = 6;
    //public static final int ADD_NODE_STATUS_SECURITY_FAILED  = 9;

    public static final int ADD_NODE_MODE_MASK = 0x0F;
    public static final int ADD_NODE_OPTION_NORMAL_POWER = 0x80;
    public static final int ADD_NODE_OPTION_NETWORK_WIDE = 0x40;

    /* Callback states from ZW_AddNodeToNetwork */
    public static final int ADD_NODE_STATUS_LEARN_READY = 1;
    public static final int ADD_NODE_STATUS_NODE_FOUND = 2;
    public static final int ADD_NODE_STATUS_ADDING_SLAVE = 3;
    public static final int ADD_NODE_STATUS_ADDING_CONTROLLER = 4;
    public static final int ADD_NODE_STATUS_PROTOCOL_DONE = 5;
    public static final int ADD_NODE_STATUS_DONE = 6;
    public static final int ADD_NODE_STATUS_FAILED = 7;
    public static final int ADD_NODE_STATUS_SECURITY_FAILED = 9;
    public static final int ADD_NODE_STATUS_NOT_PRIMARY = 0x23;

    /* Mode parameters to ZW_RemoveNodeFromNetwork/ZW_RemoveNodeIDFromNetwork */
    public static final int REMOVE_NODE_ANY = ADD_NODE_ANY;
    public static final int REMOVE_NODE_CONTROLLER = ADD_NODE_CONTROLLER;
    public static final int REMOVE_NODE_SLAVE = ADD_NODE_SLAVE;
    public static final int REMOVE_NODE_STOP = ADD_NODE_STOP;

    public static final int REMOVE_NODE_MODE_MASK = ADD_NODE_MODE_MASK;
    public static final int REMOVE_NODE_OPTION_NORMAL_POWER = ADD_NODE_OPTION_NORMAL_POWER;
    public static final int REMOVE_NODE_OPTION_NETWORK_WIDE = ADD_NODE_OPTION_NETWORK_WIDE;

    /* Node paramter to ZW_RemoveNodeIDFromNetwork */
    public static final int REMOVE_NODE_ID_ANY = 0;

    /* Callback states from ZW_RemoveNodeFromNetwork/ZW_RemoveNodeIDFromNetwork */
    public static final int REMOVE_NODE_STATUS_LEARN_READY = ADD_NODE_STATUS_LEARN_READY;
    public static final int REMOVE_NODE_STATUS_NODE_FOUND = ADD_NODE_STATUS_NODE_FOUND;
    public static final int REMOVE_NODE_STATUS_REMOVING_SLAVE = ADD_NODE_STATUS_ADDING_SLAVE;
    public static final int REMOVE_NODE_STATUS_REMOVING_CONTROLLER = ADD_NODE_STATUS_ADDING_CONTROLLER;
    public static final int REMOVE_NODE_STATUS_DONE = ADD_NODE_STATUS_DONE;
    public static final int REMOVE_NODE_STATUS_FAILED = ADD_NODE_STATUS_FAILED;

    /* Mode parameters to ZW_CreateNewPrimary */
    public static final int CREATE_PRIMARY_START = ADD_NODE_CONTROLLER;
    public static final int CREATE_PRIMARY_STOP = ADD_NODE_STOP;
    public static final int CREATE_PRIMARY_STOP_FAILED = ADD_NODE_STOP_FAILED;

    /* Mode parameters to ZW_ControllerChange */
    public static final int CONTROLLER_CHANGE_START = ADD_NODE_CONTROLLER;
    public static final int CONTROLLER_CHANGE_STOP = ADD_NODE_STOP;
    public static final int CONTROLLER_CHANGE_STOP_FAILED = ADD_NODE_STOP_FAILED;

    /* Mode parameters to ZW_SetLearnMode */
    public static final int ZW_SET_LEARN_MODE_DISABLE = 0x00;
    public static final int ZW_SET_LEARN_MODE_CLASSIC = 0x01;
    public static final int ZW_SET_LEARN_MODE_NWI = 0x02;
    public static final int ZW_SET_LEARN_MODE_NWE = 0x03;

    /* Callback states from ZW_SetLearnMode */
    public static final int LEARN_MODE_STARTED = ADD_NODE_STATUS_LEARN_READY;
    public static final int LEARN_MODE_DONE = ADD_NODE_STATUS_DONE;
    public static final int LEARN_MODE_FAILED = ADD_NODE_STATUS_FAILED;

    /* Callback states from ZW_REQUEST_NODE_NEIGHBOR_UPDATE */
    public static final int REQUEST_NEIGHBOR_UPDATE_STARTED = 0x21;
    public static final int REQUEST_NEIGHBOR_UPDATE_DONE = 0x22;
    public static final int REQUEST_NEIGHBOR_UPDATE_FAILED = 0x23;

    /* ApplicationcControllerUpdate status */
    public static final int UPDATE_STATE_NODE_INFO_RECEIVED = 0x84;
    public static final int UPDATE_STATE_NODE_INFO_REQ_DONE = 0x82;
    public static final int UPDATE_STATE_NODE_INFO_REQ_FAILED = 0x81;
    public static final int UPDATE_STATE_ROUTING_PENDING = 0x80;
    public static final int UPDATE_STATE_NEW_ID_ASSIGNED = 0x40;
    public static final int UPDATE_STATE_DELETE_DONE = 0x20;
    public static final int UPDATE_STATE_SUC_ID = 0x10;

    /* ZW_GetNeighborCount special return values */
    public static final int NEIGHBORS_ID_INVALID = 0xFE;
    public static final int NEIGHBORS_COUNT_FAILED = 0xFF;  /* Could not access routing info try again later */

    /* ZW_RemoveFailedNode and ZW_ReplaceFailedNode return value definitions */
    public static final int  NOT_PRIMARY_CONTROLLER = 1;   /* The removing process was */
                                                  /* aborted because the controller */
                                                  /* is not the primary one */

    public static final int  NO_CALLBACK_FUNCTION = 2;   /* The removing process was */
                                                  /* aborted because no call back */
                                                  /* function is used */
    public static final int  FAILED_NODE_NOT_FOUND = 3;   /* The removing process aborted */
                                                  /* because the node was node */
                                                  /* found */
    public static final int  FAILED_NODE_REMOVE_PROCESS_BUSY = 4;   /* The removing process is busy */
    public static final int  FAILED_NODE_REMOVE_FAIL = 5;   /* The removing process could not */
                                                  /* be started */

    public static final int ZW_FAILED_NODE_REMOVE_STARTED = 0;   /* The removing/replacing failed node process started */
    public static final int ZW_NOT_PRIMARY_CONTROLLER = (1 << NOT_PRIMARY_CONTROLLER);
    public static final int ZW_NO_CALLBACK_FUNCTION = (1 << NO_CALLBACK_FUNCTION);
    public static final int ZW_FAILED_NODE_NOT_FOUND = (1 << FAILED_NODE_NOT_FOUND);
    public static final int ZW_FAILED_NODE_REMOVE_PROCESS_BUSY = (1 << FAILED_NODE_REMOVE_PROCESS_BUSY);
    public static final int ZW_FAILED_NODE_REMOVE_FAIL = (1 << FAILED_NODE_REMOVE_FAIL);

    /* ZW_RemoveFailedNode and ZW_ReplaceFailedNode callback status definitions */
    public static final int ZW_NODE_OK = 0;   /* The node is working properly (removed from the failed nodes list ) */

    /* ZW_RemoveFailedNode callback status definitions */
    public static final int ZW_FAILED_NODE_REMOVED = 1;   /* The failed node was removed from the failed nodes list */
    public static final int ZW_FAILED_NODE_NOT_REMOVED = 2;   /* The failed node was not removed from the failing nodes list */

    /* ZW_ReplaceFailedNode callback status definitions */
    public static final int ZW_FAILED_NODE_REPLACE = 3;   /* The failed node are ready to be replaced and controller */
                                                  /* is ready to add new node with nodeID of the failed node */
    public static final int ZW_FAILED_NODE_REPLACE_DONE = 4;   /* The failed node has been replaced */
    public static final int ZW_FAILED_NODE_REPLACE_FAILED = 5;   /* The failed node has not been replaced */

    /* ZW_RequestNetworkUpdate callback values*/
    public static final int ZW_SUC_UPDATE_DONE = 0x00;
    public static final int ZW_SUC_UPDATE_ABORT = 0x01;
    public static final int ZW_SUC_UPDATE_WAIT = 0x02;

    public static final int ZW_SUC_UPDATE_DISABLED = 0x03;
    public static final int ZW_SUC_UPDATE_OVERFLOW = 0x04;

    public static final int ZW_SUC_SET_SUCCEEDED = 0x05;
    public static final int ZW_SUC_SET_FAILED = 0x06;

    /* SUC capabilities used in ZW_SetSUCNodeID */
    public static final int ZW_SUC_FUNC_NODEID_SERVER = 0x01;

    /* Defines for ZW_GetControllerCapabilities */
    public static final int CONTROLLER_IS_SECONDARY = 0x01;
    public static final int CONTROLLER_ON_OTHER_NETWORK = 0x02;
    public static final int CONTROLLER_NODEID_SERVER_PRESENT = 0x04;
    public static final int CONTROLLER_IS_REAL_PRIMARY = 0x08;
    public static final int CONTROLLER_IS_SUC = 0x10;
    public static final int NO_NODES_INCUDED = 0x20;

    /* Z-Wave RF speed definitions */
    public static final int ZW_RF_SPEED_NONE = 0x0000;
    public static final int ZW_RF_SPEED_9600 = 0x0001;
    public static final int ZW_RF_SPEED_40K = 0x0002;
    public static final int ZW_RF_SPEED_100K = 0x0003;
    public static final int ZW_RF_SPEED_MASK = 0x0007;

    /* ZW_GetRoutingInfo() options */
    public static final int GET_ROUTING_INFO_REMOVE_BAD = 0x80;
    public static final int GET_ROUTING_INFO_REMOVE_NON_REPS = 0x40;
    public static final int ZW_GET_ROUTING_INFO_ANY = ZW_RF_SPEED_NONE;
    public static final int ZW_GET_ROUTING_INFO_9600 = ZW_RF_SPEED_9600;
    public static final int ZW_GET_ROUTING_INFO_40K = ZW_RF_SPEED_40K;
    public static final int ZW_GET_ROUTING_INFO_100K = ZW_RF_SPEED_100K;
    public static final int ZW_GET_ROUTING_INFO_SPEED_MASK = ZW_RF_SPEED_MASK;

    /* Listening bit in the NODEINFO capability byte */
    public static final int NODEINFO_LISTENING_SUPPORT = 0x80;
    /* Routing bit in the NODEINFO capability byte */
    public static final int NODEINFO_ROUTING_SUPPORT = 0x40;

    /* Optional functionality bit in the NODEINFO security byte*/
    public static final int NODEINFO_OPTIONAL_FUNC_SUPPORT = 0x80;

    /* TO#1924 fix */
    /* Beam wakeup mode type bits in the NODEINFO security byte */
    public static final int NODEINFO_ZWAVE_SENSOR_MODE_WAKEUP_1000 = 0x40;
    public static final int NODEINFO_ZWAVE_SENSOR_MODE_WAKEUP_250 = 0x20;


        /* ZW_GetLastWorkingRoute and ZW_SetLastWorkingRoute Route structure definitions */
    public static final int ROUTECACHE_LINE_CONF_SIZE = 1;
    public static final int ROUTECACHE_LINE_SIZE = (MAX_REPEATERS + ROUTECACHE_LINE_CONF_SIZE);

    /* LastWorkingRoute index definitions */
    public static final int ROUTECACHE_LINE_REPEATER_0_INDEX = 0;
    public static final int ROUTECACHE_LINE_REPEATER_1_INDEX = 1;
    public static final int ROUTECACHE_LINE_REPEATER_2_INDEX = 2;
    public static final int ROUTECACHE_LINE_REPEATER_3_INDEX = 3;
    public static final int ROUTECACHE_LINE_CONF_INDEX = 4;

    /* ZW_GetLastWorkingRoute and ZW_SetLastWorkingRoute speed definitions */
    public static final int ZW_LAST_WORKING_ROUTE_SPEED_9600 = ZW_RF_SPEED_9600;
    public static final int ZW_LAST_WORKING_ROUTE_SPEED_40K = ZW_RF_SPEED_40K;
    public static final int ZW_LAST_WORKING_ROUTE_SPEED_100K = ZW_RF_SPEED_100K;
}
