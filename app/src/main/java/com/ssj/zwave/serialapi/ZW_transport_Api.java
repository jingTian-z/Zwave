package com.ssj.zwave.serialapi;

public class ZW_transport_Api {

        /* Max number of nodes in a Z-wave system */
    public static final int ZW_MAX_NODES = 232;

    /************************************************************/
    /* Node Information frame*/
    /************************************************************/
    public static final int NODEPARM_MAX = 35;        /* max. number of parameters */

    /* Transmit frame option flags */
    public static final int TRANSMIT_OPTION_ACK = 0x01;  /* request acknowledge from destination node */
    public static final int TRANSMIT_OPTION_LOW_POWER = 0x02;  /* transmit at low output power level (1/3 of normal RF range) */
    /*            #ifdef ZW_SLAVE
    public static final int TRANSMIT_OPTION_RETURN_ROUTE = 0x04;  *//* request transmission via return route *//*
                #endif*/
    public static final int TRANSMIT_OPTION_AUTO_ROUTE = 0x04;  /* request retransmission via repeater nodes */
    /* do not use response route - Even if available */
    public static final int TRANSMIT_OPTION_NO_ROUTE = 0x10;
    /* Use explore frame if needed */
    public static final int TRANSMIT_OPTION_EXPLORE = 0x20;

    /* Transmit frame option flag which are valid when sending explore frames  */
    public static final int TRANSMIT_EXPLORE_OPTION_ACK = TRANSMIT_OPTION_ACK;
    public static final int TRANSMIT_EXPLORE_OPTION_LOW_POWER = TRANSMIT_OPTION_LOW_POWER;

    /* Received frame status flags */
    /**
     *  \defgroup RECEIVE_STATUS Status codes for receiving frames.
     * \addtogroup RECEIVE_STATUS
     * @{
     */

    /**
     * A response route is locked by the application
     */
    public static final int RECEIVE_STATUS_ROUTED_BUSY = 0x01;
    /**
     * Received at low output power level, this must
     * have the same value as TRANSMIT_OPTION_LOW_POWER
     */
    public static final int RECEIVE_STATUS_LOW_POWER = 0x02;
    /**
     * Mask for masking out the received frametype bits
     */
    public static final int RECEIVE_STATUS_TYPE_MASK = 0x0C;
    /**
     * Received frame is singlecast frame (rxOptions == xxxx00xx)
     */
    public static final int RECEIVE_STATUS_TYPE_SINGLE = 0x00;
    /**
     * Received frame is broadcast frame  (rxOptions == xxxx01xx)
     */
    public static final int RECEIVE_STATUS_TYPE_BROAD = 0x04;
    /**
     * Received frame is multicast frame (rxOptions == xxxx10xx)
     * Only TYPE_BROAD can be active at the same time as TYPE_EXPLORE
     */
    public static final int RECEIVE_STATUS_TYPE_MULTI = 0x08;
    /**
     * Received frame is an explore frame (rxOptions == xxx1xxxx)
     * Only TYPE_BROAD can be active at the same time as TYPE_EXPLORE
     */
    public static final int RECEIVE_STATUS_TYPE_EXPLORE = 0x10;
    /**
     * Received frame is not send to me (useful only in promiscuous mode)
     */
    public static final int RECEIVE_STATUS_FOREIGN_FRAME = 0x40;

    /**
     * @}
     */

    /* Predefined Node ID's */
    public static final int NODE_BROADCAST = 0xFF;    /* broadcast */
    public static final int ZW_TEST_NOT_A_NODEID = 0x00;    /* */

    /* Transmit complete codes */
    public static final int TRANSMIT_COMPLETE_OK = 0x00;
    public static final int TRANSMIT_COMPLETE_NO_ACK = 0x01;  /* retransmission error */
    public static final int TRANSMIT_COMPLETE_FAIL = 0x02;  /* transmit error */
    public static final int TRANSMIT_ROUTING_NOT_IDLE = 0x03;  /* transmit error */
    public static final int TRANSMIT_UNINIT = 0xff;  /* Uninitialized */

    public static final int ZW_MAX_CACHED_RETURN_ROUTE_DESTINATIONS = 5;

    public static final int ZW_RF_TEST_SIGNAL_CARRIER = 0x00;
    public static final int ZW_RF_TEST_SIGNAL_CARRIER_MODULATED = 0x01;
}
