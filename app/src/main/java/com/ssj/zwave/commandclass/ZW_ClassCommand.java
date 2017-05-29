package com.ssj.zwave.commandclass;

import javolution.io.Struct;

public class ZW_ClassCommand extends ZW_ClassCommand_Const {
    /************************************************************/
    /* Structs and unions that can be used by the application   */
    /* to construct the frames to be sent                       */
    /************************************************************/

    /************************************************************/
    /* Common for all command classes                           */
    /************************************************************/
    public static class ZW_COMMON_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Get command class structs */
    /************************************************************/
    public static class ZW_ALARM_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 alarmType = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Report command class structs */
    /************************************************************/
    public static class ZW_ALARM_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 alarmType = new Unsigned8();
        public final Unsigned8 alarmLevel = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Get V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 alarmType = new Unsigned8();
        public final Unsigned8 zwaveAlarmType = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 alarmType = new Unsigned8();
        public final Unsigned8 alarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 zwaveAlarmStatus = new Unsigned8();
        public final Unsigned8 zwaveAlarmType = new Unsigned8();
        public final Unsigned8 zwaveAlarmEvent = new Unsigned8();
        public final Unsigned8 numberOfEventParameters = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 alarmType = new Unsigned8();
        public final Unsigned8 alarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 zwaveAlarmStatus = new Unsigned8();
        public final Unsigned8 zwaveAlarmType = new Unsigned8();
        public final Unsigned8 zwaveAlarmEvent = new Unsigned8();
        public final Unsigned8 numberOfEventParameters = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 eventParameter2 = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 alarmType = new Unsigned8();
        public final Unsigned8 alarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 zwaveAlarmStatus = new Unsigned8();
        public final Unsigned8 zwaveAlarmType = new Unsigned8();
        public final Unsigned8 zwaveAlarmEvent = new Unsigned8();
        public final Unsigned8 numberOfEventParameters = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 eventParameter2 = new Unsigned8();
        public final Unsigned8 eventParameter3 = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 alarmType = new Unsigned8();
        public final Unsigned8 alarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 zwaveAlarmStatus = new Unsigned8();
        public final Unsigned8 zwaveAlarmType = new Unsigned8();
        public final Unsigned8 zwaveAlarmEvent = new Unsigned8();
        public final Unsigned8 numberOfEventParameters = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 eventParameter2 = new Unsigned8();
        public final Unsigned8 eventParameter3 = new Unsigned8();
        public final Unsigned8 eventParameter4 = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Set V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zwaveAlarmType = new Unsigned8();
        public final Unsigned8 zwaveAlarmStatus = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Type Supported Get V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_TYPE_SUPPORTED_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Type Supported Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_TYPE_SUPPORTED_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Type Supported Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_TYPE_SUPPORTED_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Type Supported Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_TYPE_SUPPORTED_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
    /* Alarm Type Supported Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_ALARM_TYPE_SUPPORTED_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
    /* Notification Get V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 v1AlarmType = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 mevent = new Unsigned8();
    }

    /************************************************************/
    /* Notification Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 v1AlarmType = new Unsigned8();
        public final Unsigned8 v1AlarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 notificationStatus = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 mevent = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
    }

    /************************************************************/
    /* Notification Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 v1AlarmType = new Unsigned8();
        public final Unsigned8 v1AlarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 notificationStatus = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 mevent = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 eventParameter2 = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
    }

    /************************************************************/
    /* Notification Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 v1AlarmType = new Unsigned8();
        public final Unsigned8 v1AlarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 notificationStatus = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 mevent = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 eventParameter2 = new Unsigned8();
        public final Unsigned8 eventParameter3 = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
    }

    /************************************************************/
    /* Notification Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 v1AlarmType = new Unsigned8();
        public final Unsigned8 v1AlarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 notificationStatus = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 mevent = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 eventParameter2 = new Unsigned8();
        public final Unsigned8 eventParameter3 = new Unsigned8();
        public final Unsigned8 eventParameter4 = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
    }

    /************************************************************/
    /* Notification Set V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 notificationStatus = new Unsigned8();
    }

    /************************************************************/
    /* Notification Supported Get V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SUPPORTED_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Notification Supported Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SUPPORTED_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
    /* Notification Supported Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SUPPORTED_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
    /* Notification Supported Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SUPPORTED_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
    /* Notification Supported Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SUPPORTED_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
    /* Event Supported Get V3 command class structs */
    /************************************************************/
    public static class ZW_EVENT_SUPPORTED_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
    }

    /************************************************************/
    /* Event Supported Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_EVENT_SUPPORTED_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
    /* Event Supported Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_EVENT_SUPPORTED_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
    /* Event Supported Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_EVENT_SUPPORTED_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
    /* Event Supported Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_EVENT_SUPPORTED_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
    /* Notification Get V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_GET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 v1AlarmType = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 mevent = new Unsigned8();
    }

    /************************************************************/
    /* Notification Report 1byte V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_REPORT_1BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 v1AlarmType = new Unsigned8();
        public final Unsigned8 v1AlarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 notificationStatus = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 mevent = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
    }

    /************************************************************/
    /* Notification Report 2byte V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_REPORT_2BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 v1AlarmType = new Unsigned8();
        public final Unsigned8 v1AlarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 notificationStatus = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 mevent = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 eventParameter2 = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
    }

    /************************************************************/
    /* Notification Report 3byte V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_REPORT_3BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 v1AlarmType = new Unsigned8();
        public final Unsigned8 v1AlarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 notificationStatus = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 mevent = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 eventParameter2 = new Unsigned8();
        public final Unsigned8 eventParameter3 = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
    }

    /************************************************************/
    /* Notification Report 4byte V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_REPORT_4BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 v1AlarmType = new Unsigned8();
        public final Unsigned8 v1AlarmLevel = new Unsigned8();
        public final Unsigned8 zensorNetSourceNodeId = new Unsigned8();
        public final Unsigned8 notificationStatus = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 mevent = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 eventParameter1 = new Unsigned8();
        public final Unsigned8 eventParameter2 = new Unsigned8();
        public final Unsigned8 eventParameter3 = new Unsigned8();
        public final Unsigned8 eventParameter4 = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
    }

    /************************************************************/
    /* Notification Set V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 notificationStatus = new Unsigned8();
    }

    /************************************************************/
    /* Notification Supported Get V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SUPPORTED_GET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Notification Supported Report 1byte V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SUPPORTED_REPORT_1BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
    /* Notification Supported Report 2byte V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SUPPORTED_REPORT_2BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
    /* Notification Supported Report 3byte V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SUPPORTED_REPORT_3BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
    /* Notification Supported Report 4byte V4 command class structs */
    /************************************************************/
    public static class ZW_NOTIFICATION_SUPPORTED_REPORT_4BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
    /* Event Supported Get V4 command class structs */
    /************************************************************/
    public static class ZW_EVENT_SUPPORTED_GET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
    }

    /************************************************************/
    /* Event Supported Report 1byte V4 command class structs */
    /************************************************************/
    public static class ZW_EVENT_SUPPORTED_REPORT_1BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
    /* Event Supported Report 2byte V4 command class structs */
    /************************************************************/
    public static class ZW_EVENT_SUPPORTED_REPORT_2BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
    /* Event Supported Report 3byte V4 command class structs */
    /************************************************************/
    public static class ZW_EVENT_SUPPORTED_REPORT_3BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
    /* Event Supported Report 4byte V4 command class structs */
    /************************************************************/
    public static class ZW_EVENT_SUPPORTED_REPORT_4BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 notificationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
    /* Application Busy command class structs */
    /************************************************************/
    public static class ZW_APPLICATION_BUSY_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 waitTime = new Unsigned8();
    }

    /************************************************************/
    /* Application Rejected Request command class structs */
    /************************************************************/
    public static class ZW_APPLICATION_REJECTED_REQUEST_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
    /* Command Configuration Get command class structs */
    /************************************************************/
    public static class ZW_COMMAND_CONFIGURATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
    /* Command Configuration Report 1byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_CONFIGURATION_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandLength = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
    }

    /************************************************************/
    /* Command Configuration Report 2byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_CONFIGURATION_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandLength = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
    }

    /************************************************************/
    /* Command Configuration Report 3byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_CONFIGURATION_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandLength = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
        public final Unsigned8 commandByte3 = new Unsigned8();
    }

    /************************************************************/
    /* Command Configuration Report 4byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_CONFIGURATION_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandLength = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
        public final Unsigned8 commandByte3 = new Unsigned8();
        public final Unsigned8 commandByte4 = new Unsigned8();
    }

    /************************************************************/
    /* Command Configuration Set 1byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_CONFIGURATION_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 commandLength = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
    }

    /************************************************************/
    /* Command Configuration Set 2byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_CONFIGURATION_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 commandLength = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
    }

    /************************************************************/
    /* Command Configuration Set 3byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_CONFIGURATION_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 commandLength = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
        public final Unsigned8 commandByte3 = new Unsigned8();
    }

    /************************************************************/
    /* Command Configuration Set 4byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_CONFIGURATION_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 commandLength = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
        public final Unsigned8 commandByte3 = new Unsigned8();
        public final Unsigned8 commandByte4 = new Unsigned8();
    }

    /************************************************************/
    /* Command Records Supported Get command class structs */
    /************************************************************/
    public static class ZW_COMMAND_RECORDS_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Command Records Supported Report command class structs */
    /************************************************************/
    public static class ZW_COMMAND_RECORDS_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 freeCommandRecords1 = new Unsigned8();
        public final Unsigned8 freeCommandRecords2 = new Unsigned8();
        public final Unsigned8 maxCommandRecords1 = new Unsigned8();
        public final Unsigned8 maxCommandRecords2 = new Unsigned8();
    }

    /************************************************************/
    /* Association Get command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
    }

    /************************************************************/
    /* Association Groupings Get command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUPINGS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Association Groupings Report command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUPINGS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedGroupings = new Unsigned8();
    }

    /************************************************************/
    /* Association Remove 1byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REMOVE_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
    }

    /************************************************************/
    /* Association Remove 2byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REMOVE_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
    }

    /************************************************************/
    /* Association Remove 3byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REMOVE_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
    }

    /************************************************************/
    /* Association Remove 4byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REMOVE_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 nodeId4 = new Unsigned8();
    }

    /************************************************************/
    /* Association Report 1byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeid1 = new Unsigned8();
    }

    /************************************************************/
    /* Association Report 2byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeid1 = new Unsigned8();
        public final Unsigned8 nodeid2 = new Unsigned8();
    }

    /************************************************************/
    /* Association Report 3byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeid1 = new Unsigned8();
        public final Unsigned8 nodeid2 = new Unsigned8();
        public final Unsigned8 nodeid3 = new Unsigned8();
    }

    /************************************************************/
    /* Association Report 4byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeid1 = new Unsigned8();
        public final Unsigned8 nodeid2 = new Unsigned8();
        public final Unsigned8 nodeid3 = new Unsigned8();
        public final Unsigned8 nodeid4 = new Unsigned8();
    }

    /************************************************************/
    /* Association Set 1byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
    }

    /************************************************************/
    /* Association Set 2byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
    }

    /************************************************************/
    /* Association Set 3byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
    }

    /************************************************************/
    /* Association Set 4byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 nodeId4 = new Unsigned8();
    }

    /************************************************************/
    /* Association Get V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
    }

    /************************************************************/
    /* Association Groupings Get V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUPINGS_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Association Groupings Report V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUPINGS_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedGroupings = new Unsigned8();
    }

    /************************************************************/
    /* Association Remove 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REMOVE_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
    }

    /************************************************************/
    /* Association Remove 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REMOVE_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
    }

    /************************************************************/
    /* Association Remove 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REMOVE_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
    }

    /************************************************************/
    /* Association Remove 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REMOVE_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 nodeId4 = new Unsigned8();
    }

    /************************************************************/
    /* Association Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeid1 = new Unsigned8();
    }

    /************************************************************/
    /* Association Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeid1 = new Unsigned8();
        public final Unsigned8 nodeid2 = new Unsigned8();
    }

    /************************************************************/
    /* Association Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeid1 = new Unsigned8();
        public final Unsigned8 nodeid2 = new Unsigned8();
        public final Unsigned8 nodeid3 = new Unsigned8();
    }

    /************************************************************/
    /* Association Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeid1 = new Unsigned8();
        public final Unsigned8 nodeid2 = new Unsigned8();
        public final Unsigned8 nodeid3 = new Unsigned8();
        public final Unsigned8 nodeid4 = new Unsigned8();
    }

    /************************************************************/
    /* Association Set 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_SET_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
    }

    /************************************************************/
    /* Association Set 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_SET_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
    }

    /************************************************************/
    /* Association Set 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_SET_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
    }

    /************************************************************/
    /* Association Set 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_SET_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 nodeId4 = new Unsigned8();
    }

    /************************************************************/
    /* Association Specific Group Get V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_SPECIFIC_GROUP_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Association Specific Group Report V2 command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_SPECIFIC_GROUP_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 group = new Unsigned8();
    }

    /************************************************************/
    /* Av Content Browse Md By Letter Get command class structs */
    /************************************************************/
    public static class ZW_AV_CONTENT_BROWSE_MD_BY_LETTER_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Content Browse Md By Letter Report command class structs */
    /************************************************************/
    public static class ZW_AV_CONTENT_BROWSE_MD_BY_LETTER_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Content Browse Md Child Count Get command class structs */
    /************************************************************/
    public static class ZW_AV_CONTENT_BROWSE_MD_CHILD_COUNT_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Content Browse Md Child Count Report command class structs */
    /************************************************************/
    public static class ZW_AV_CONTENT_BROWSE_MD_CHILD_COUNT_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Content Browse Md Get command class structs */
    /************************************************************/
    public static class ZW_AV_CONTENT_BROWSE_MD_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Content Browse Md Report command class structs */
    /************************************************************/
    public static class ZW_AV_CONTENT_BROWSE_MD_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Match Item To Renderer Md Get command class structs */
    /************************************************************/
    public static class ZW_AV_MATCH_ITEM_TO_RENDERER_MD_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Match Item To Renderer Md Report command class structs */
    /************************************************************/
    public static class ZW_AV_MATCH_ITEM_TO_RENDERER_MD_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Content Search Md Get command class structs */
    /************************************************************/
    public static class ZW_AV_CONTENT_SEARCH_MD_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Content Search Md Report command class structs */
    /************************************************************/
    public static class ZW_AV_CONTENT_SEARCH_MD_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Renderer Status Get command class structs */
    /************************************************************/
    public static class ZW_AV_RENDERER_STATUS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Renderer Status Report command class structs */
    /************************************************************/
    public static class ZW_AV_RENDERER_STATUS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Tagging Md Get command class structs */
    /************************************************************/
    public static class ZW_AV_TAGGING_MD_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Av Tagging Md Report command class structs */
    /************************************************************/
    public static class ZW_AV_TAGGING_MD_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Basic Tariff Info Get command class structs */
    /************************************************************/
    public static class ZW_BASIC_TARIFF_INFO_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Basic Tariff Info Report command class structs */
    /************************************************************/
    public static class ZW_BASIC_TARIFF_INFO_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 e1RateConsumptionRegister1 = new Unsigned8();
        public final Unsigned8 e1RateConsumptionRegister2 = new Unsigned8();
        public final Unsigned8 e1RateConsumptionRegister3 = new Unsigned8();
        public final Unsigned8 e1RateConsumptionRegister4 = new Unsigned8();
        public final Unsigned8 e1TimeForNextRateHours = new Unsigned8();
        public final Unsigned8 e1TimeForNextRateMinutes = new Unsigned8();
        public final Unsigned8 e1TimeForNextRateSeconds = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 e2RateConsumptionRegister1 = new Unsigned8();
        public final Unsigned8 e2RateConsumptionRegister2 = new Unsigned8();
        public final Unsigned8 e2RateConsumptionRegister3 = new Unsigned8();
        public final Unsigned8 e2RateConsumptionRegister4 = new Unsigned8();
    }

    /************************************************************/
    /* Basic Window Covering Start Level Change command class structs */
    /************************************************************/
    public static class ZW_BASIC_WINDOW_COVERING_START_LEVEL_CHANGE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
    /* Basic Window Covering Stop Level Change command class structs */
    /************************************************************/
    public static class ZW_BASIC_WINDOW_COVERING_STOP_LEVEL_CHANGE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Basic Get command class structs */
    /************************************************************/
    public static class ZW_BASIC_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Basic Report command class structs */
    /************************************************************/
    public static class ZW_BASIC_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
    /* Basic Set command class structs */
    /************************************************************/
    public static class ZW_BASIC_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
    /* Battery Get command class structs */
    /************************************************************/
    public static class ZW_BATTERY_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Battery Report command class structs */
    /************************************************************/
    public static class ZW_BATTERY_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 batteryLevel = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Log Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_LOG_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Log Report command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_LOG_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 alarmEvent1 = new Unsigned8();
        public final Unsigned8 alarmEvent2 = new Unsigned8();
        public final Unsigned8 alarmEvent3 = new Unsigned8();
        public final Unsigned8 alarmEvent4 = new Unsigned8();
        public final Unsigned8 alarmEvent5 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Log Set command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_LOG_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 message = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Status Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_STATUS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Status Report command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_STATUS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 alarmStatus = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Status Set command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_STATUS_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 message = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Temp Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_TEMP_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Temp Report 1byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Temp Report 2byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Temp Report 3byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Temp Report 4byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Temp Set 1byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_TEMP_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Temp Set 2byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_TEMP_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Temp Set 3byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_TEMP_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Alarm Temp Set 4byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_ALARM_TEMP_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Boost Time Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_BOOST_TIME_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Boost Time Report command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_BOOST_TIME_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 time = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Boost Time Set command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_BOOST_TIME_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 time = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Default Set command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_DEFAULT_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Min Speed Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_MIN_SPEED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Min Speed Report command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_MIN_SPEED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 minSpeed = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Min Speed Set command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_MIN_SPEED_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 minSpeed = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Mode Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_MODE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Mode Report command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_MODE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Mode Set command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_MODE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Setup Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SETUP_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Setup Report 1byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SETUP_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 boostTime = new Unsigned8();
        public final Unsigned8 stopTime = new Unsigned8();
        public final Unsigned8 minSpeed = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startTemperature1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 stopTemperature1 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue1 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Setup Report 2byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SETUP_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 boostTime = new Unsigned8();
        public final Unsigned8 stopTime = new Unsigned8();
        public final Unsigned8 minSpeed = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startTemperature1 = new Unsigned8();
        public final Unsigned8 startTemperature2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 stopTemperature1 = new Unsigned8();
        public final Unsigned8 stopTemperature2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue1 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue2 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Setup Report 3byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SETUP_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 boostTime = new Unsigned8();
        public final Unsigned8 stopTime = new Unsigned8();
        public final Unsigned8 minSpeed = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startTemperature1 = new Unsigned8();
        public final Unsigned8 startTemperature2 = new Unsigned8();
        public final Unsigned8 startTemperature3 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 stopTemperature1 = new Unsigned8();
        public final Unsigned8 stopTemperature2 = new Unsigned8();
        public final Unsigned8 stopTemperature3 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue1 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue2 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue3 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Setup Report 4byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SETUP_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 boostTime = new Unsigned8();
        public final Unsigned8 stopTime = new Unsigned8();
        public final Unsigned8 minSpeed = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startTemperature1 = new Unsigned8();
        public final Unsigned8 startTemperature2 = new Unsigned8();
        public final Unsigned8 startTemperature3 = new Unsigned8();
        public final Unsigned8 startTemperature4 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 stopTemperature1 = new Unsigned8();
        public final Unsigned8 stopTemperature2 = new Unsigned8();
        public final Unsigned8 stopTemperature3 = new Unsigned8();
        public final Unsigned8 stopTemperature4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue1 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue2 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue3 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue4 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Setup Set 1byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SETUP_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 boostTime = new Unsigned8();
        public final Unsigned8 stopTime = new Unsigned8();
        public final Unsigned8 minSpeed = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startTemperature1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 stopTemperature1 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue1 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Setup Set 2byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SETUP_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 boostTime = new Unsigned8();
        public final Unsigned8 stopTime = new Unsigned8();
        public final Unsigned8 minSpeed = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startTemperature1 = new Unsigned8();
        public final Unsigned8 startTemperature2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 stopTemperature1 = new Unsigned8();
        public final Unsigned8 stopTemperature2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue1 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue2 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Setup Set 3byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SETUP_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 boostTime = new Unsigned8();
        public final Unsigned8 stopTime = new Unsigned8();
        public final Unsigned8 minSpeed = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startTemperature1 = new Unsigned8();
        public final Unsigned8 startTemperature2 = new Unsigned8();
        public final Unsigned8 startTemperature3 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 stopTemperature1 = new Unsigned8();
        public final Unsigned8 stopTemperature2 = new Unsigned8();
        public final Unsigned8 stopTemperature3 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue1 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue2 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue3 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Setup Set 4byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SETUP_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 boostTime = new Unsigned8();
        public final Unsigned8 stopTime = new Unsigned8();
        public final Unsigned8 minSpeed = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startTemperature1 = new Unsigned8();
        public final Unsigned8 startTemperature2 = new Unsigned8();
        public final Unsigned8 startTemperature3 = new Unsigned8();
        public final Unsigned8 startTemperature4 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 stopTemperature1 = new Unsigned8();
        public final Unsigned8 stopTemperature2 = new Unsigned8();
        public final Unsigned8 stopTemperature3 = new Unsigned8();
        public final Unsigned8 stopTemperature4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue1 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue2 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue3 = new Unsigned8();
        public final Unsigned8 alarmTemperatureValue4 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Speed Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SPEED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Speed Report command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SPEED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 speed = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Speed Set command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_SPEED_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 speed = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Start Temp Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_START_TEMP_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Start Temp Report 1byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_START_TEMP_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Start Temp Report 2byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_START_TEMP_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Start Temp Report 3byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_START_TEMP_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Start Temp Report 4byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_START_TEMP_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Start Temp Set 1byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_START_TEMP_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Start Temp Set 2byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_START_TEMP_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Start Temp Set 3byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_START_TEMP_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Start Temp Set 4byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_START_TEMP_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan State Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STATE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan State Report command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STATE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 state = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan State Set command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STATE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 state = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Status Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STATUS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Status Report 1byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STATUS_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 state = new Unsigned8();
        public final Unsigned8 speed = new Unsigned8();
        public final Unsigned8 alarmStatus = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Status Report 2byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STATUS_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 state = new Unsigned8();
        public final Unsigned8 speed = new Unsigned8();
        public final Unsigned8 alarmStatus = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Status Report 3byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STATUS_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 state = new Unsigned8();
        public final Unsigned8 speed = new Unsigned8();
        public final Unsigned8 alarmStatus = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Status Report 4byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STATUS_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 state = new Unsigned8();
        public final Unsigned8 speed = new Unsigned8();
        public final Unsigned8 alarmStatus = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Temp Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TEMP_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Temp Report 1byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Temp Report 2byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Temp Report 3byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Temp Report 4byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Temp Set 1byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TEMP_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Temp Set 2byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TEMP_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Temp Set 3byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TEMP_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Temp Set 4byte command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TEMP_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Time Get command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TIME_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Time Report command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TIME_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 time = new Unsigned8();
    }

    /************************************************************/
    /* Chimney Fan Stop Time Set command class structs */
    /************************************************************/
    public static class ZW_CHIMNEY_FAN_STOP_TIME_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 time = new Unsigned8();
    }

    /************************************************************/
    /* Schedule Changed Get command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_CHANGED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Schedule Changed Report command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_CHANGED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 changecounter = new Unsigned8();
    }

    /************************************************************/
    /* Schedule Get command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
    /* Schedule Override Get command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_OVERRIDE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Schedule Override Report command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_OVERRIDE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 overrideState = new Unsigned8();
    }

    /************************************************************/
    /* Schedule Override Set command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_OVERRIDE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 overrideState = new Unsigned8();
    }

    /************************************************************/
    /* Schedule Report command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 switchpoint01 = new Unsigned8();
        public final Unsigned8 switchpoint02 = new Unsigned8();
        public final Unsigned8 switchpoint03 = new Unsigned8();
        public final Unsigned8 switchpoint11 = new Unsigned8();
        public final Unsigned8 switchpoint12 = new Unsigned8();
        public final Unsigned8 switchpoint13 = new Unsigned8();
        public final Unsigned8 switchpoint21 = new Unsigned8();
        public final Unsigned8 switchpoint22 = new Unsigned8();
        public final Unsigned8 switchpoint23 = new Unsigned8();
        public final Unsigned8 switchpoint31 = new Unsigned8();
        public final Unsigned8 switchpoint32 = new Unsigned8();
        public final Unsigned8 switchpoint33 = new Unsigned8();
        public final Unsigned8 switchpoint41 = new Unsigned8();
        public final Unsigned8 switchpoint42 = new Unsigned8();
        public final Unsigned8 switchpoint43 = new Unsigned8();
        public final Unsigned8 switchpoint51 = new Unsigned8();
        public final Unsigned8 switchpoint52 = new Unsigned8();
        public final Unsigned8 switchpoint53 = new Unsigned8();
        public final Unsigned8 switchpoint61 = new Unsigned8();
        public final Unsigned8 switchpoint62 = new Unsigned8();
        public final Unsigned8 switchpoint63 = new Unsigned8();
        public final Unsigned8 switchpoint71 = new Unsigned8();
        public final Unsigned8 switchpoint72 = new Unsigned8();
        public final Unsigned8 switchpoint73 = new Unsigned8();
        public final Unsigned8 switchpoint81 = new Unsigned8();
        public final Unsigned8 switchpoint82 = new Unsigned8();
        public final Unsigned8 switchpoint83 = new Unsigned8();
    }

    /************************************************************/
    /* Schedule Set command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 switchpoint01 = new Unsigned8();
        public final Unsigned8 switchpoint02 = new Unsigned8();
        public final Unsigned8 switchpoint03 = new Unsigned8();
        public final Unsigned8 switchpoint11 = new Unsigned8();
        public final Unsigned8 switchpoint12 = new Unsigned8();
        public final Unsigned8 switchpoint13 = new Unsigned8();
        public final Unsigned8 switchpoint21 = new Unsigned8();
        public final Unsigned8 switchpoint22 = new Unsigned8();
        public final Unsigned8 switchpoint23 = new Unsigned8();
        public final Unsigned8 switchpoint31 = new Unsigned8();
        public final Unsigned8 switchpoint32 = new Unsigned8();
        public final Unsigned8 switchpoint33 = new Unsigned8();
        public final Unsigned8 switchpoint41 = new Unsigned8();
        public final Unsigned8 switchpoint42 = new Unsigned8();
        public final Unsigned8 switchpoint43 = new Unsigned8();
        public final Unsigned8 switchpoint51 = new Unsigned8();
        public final Unsigned8 switchpoint52 = new Unsigned8();
        public final Unsigned8 switchpoint53 = new Unsigned8();
        public final Unsigned8 switchpoint61 = new Unsigned8();
        public final Unsigned8 switchpoint62 = new Unsigned8();
        public final Unsigned8 switchpoint63 = new Unsigned8();
        public final Unsigned8 switchpoint71 = new Unsigned8();
        public final Unsigned8 switchpoint72 = new Unsigned8();
        public final Unsigned8 switchpoint73 = new Unsigned8();
        public final Unsigned8 switchpoint81 = new Unsigned8();
        public final Unsigned8 switchpoint82 = new Unsigned8();
        public final Unsigned8 switchpoint83 = new Unsigned8();
    }

    /************************************************************/
    /* Clock Get command class structs */
    /************************************************************/
    public static class ZW_CLOCK_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Clock Report command class structs */
    /************************************************************/
    public static class ZW_CLOCK_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 minute = new Unsigned8();
    }

    /************************************************************/
    /* Clock Set command class structs */
    /************************************************************/
    public static class ZW_CLOCK_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 minute = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Get command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Report 1byte command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Report 2byte command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Report 3byte command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
        public final Unsigned8 configurationValue3 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Report 4byte command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
        public final Unsigned8 configurationValue3 = new Unsigned8();
        public final Unsigned8 configurationValue4 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Set 1byte command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Set 2byte command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Set 3byte command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
        public final Unsigned8 configurationValue3 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Set 4byte command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
        public final Unsigned8 configurationValue3 = new Unsigned8();
        public final Unsigned8 configurationValue4 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Bulk Get V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_BULK_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterOffset1 = new Unsigned8();
        public final Unsigned8 parameterOffset2 = new Unsigned8();
        public final Unsigned8 numberOfParameters = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Bulk Report V2 variant group structs */
    /************************************************************/
    public static class VG_CONFIGURATION_BULK_REPORT_1BYTE_V2_VG extends Struct {
        public final Unsigned8 parameter1 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Bulk Report V2 variant group structs */
    /************************************************************/
    public static class VG_CONFIGURATION_BULK_REPORT_2BYTE_V2_VG extends Struct {
        public final Unsigned8 parameter1 = new Unsigned8();
        public final Unsigned8 parameter2 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Bulk Report V2 variant group structs */
    /************************************************************/
    public static class VG_CONFIGURATION_BULK_REPORT_3BYTE_V2_VG extends Struct {
        public final Unsigned8 parameter1 = new Unsigned8();
        public final Unsigned8 parameter2 = new Unsigned8();
        public final Unsigned8 parameter3 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Bulk Report V2 variant group structs */
    /************************************************************/
    public static class VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG extends Struct {
        public final Unsigned8 parameter1 = new Unsigned8();
        public final Unsigned8 parameter2 = new Unsigned8();
        public final Unsigned8 parameter3 = new Unsigned8();
        public final Unsigned8 parameter4 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Bulk Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_BULK_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterOffset1 = new Unsigned8();
        public final Unsigned8 parameterOffset2 = new Unsigned8();
        public final Unsigned8 numberOfParameters = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG variantgroup1
                = new VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
    }

    /************************************************************/
    /* Configuration Bulk Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_BULK_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterOffset1 = new Unsigned8();
        public final Unsigned8 parameterOffset2 = new Unsigned8();
        public final Unsigned8 numberOfParameters = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG variantgroup1
                = new VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG variantgroup2
                = new VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
    }

    /************************************************************/
    /* Configuration Bulk Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_BULK_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterOffset1 = new Unsigned8();
        public final Unsigned8 parameterOffset2 = new Unsigned8();
        public final Unsigned8 numberOfParameters = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG variantgroup1
                = new VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG variantgroup2
                = new VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG variantgroup3
                = new VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
    }

    /************************************************************/
    /* Configuration Bulk Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_BULK_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterOffset1 = new Unsigned8();
        public final Unsigned8 parameterOffset2 = new Unsigned8();
        public final Unsigned8 numberOfParameters = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG variantgroup1
                = new VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG variantgroup2
                = new VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG variantgroup3
                = new VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG variantgroup4
                = new VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
    }

    /************************************************************/
    /* Configuration Bulk Set V2 variant group structs */
    /************************************************************/
    public static class VG_CONFIGURATION_BULK_SET_1BYTE_V2_VG extends Struct {
        public final Unsigned8 parameter1 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Bulk Set V2 variant group structs */
    /************************************************************/
    public static class VG_CONFIGURATION_BULK_SET_2BYTE_V2_VG extends Struct {
        public final Unsigned8 parameter1 = new Unsigned8();
        public final Unsigned8 parameter2 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Bulk Set V2 variant group structs */
    /************************************************************/
    public static class VG_CONFIGURATION_BULK_SET_3BYTE_V2_VG extends Struct {
        public final Unsigned8 parameter1 = new Unsigned8();
        public final Unsigned8 parameter2 = new Unsigned8();
        public final Unsigned8 parameter3 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Bulk Set V2 variant group structs */
    /************************************************************/
    public static class VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG extends Struct {
        public final Unsigned8 parameter1 = new Unsigned8();
        public final Unsigned8 parameter2 = new Unsigned8();
        public final Unsigned8 parameter3 = new Unsigned8();
        public final Unsigned8 parameter4 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Bulk Set 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_BULK_SET_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterOffset1 = new Unsigned8();
        public final Unsigned8 parameterOffset2 = new Unsigned8();
        public final Unsigned8 numberOfParameters = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG variantgroup1
                = new VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
    }

    /************************************************************/
    /* Configuration Bulk Set 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_BULK_SET_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterOffset1 = new Unsigned8();
        public final Unsigned8 parameterOffset2 = new Unsigned8();
        public final Unsigned8 numberOfParameters = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG variantgroup1
                = new VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG variantgroup2
                = new VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
    }

    /************************************************************/
    /* Configuration Bulk Set 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_BULK_SET_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterOffset1 = new Unsigned8();
        public final Unsigned8 parameterOffset2 = new Unsigned8();
        public final Unsigned8 numberOfParameters = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG variantgroup1
                = new VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG variantgroup2
                = new VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG variantgroup3
                = new VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
    }

    /************************************************************/
    /* Configuration Bulk Set 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_BULK_SET_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterOffset1 = new Unsigned8();
        public final Unsigned8 parameterOffset2 = new Unsigned8();
        public final Unsigned8 numberOfParameters = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG variantgroup1
                = new VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG variantgroup2
                = new VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG variantgroup3
                = new VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
        VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG variantgroup4
                = new VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
    }

    /************************************************************/
    /* Configuration Get V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
        public final Unsigned8 configurationValue3 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
        public final Unsigned8 configurationValue3 = new Unsigned8();
        public final Unsigned8 configurationValue4 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Set 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_SET_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Set 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_SET_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Set 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_SET_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
        public final Unsigned8 configurationValue3 = new Unsigned8();
    }

    /************************************************************/
    /* Configuration Set 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_CONFIGURATION_SET_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 configurationValue1 = new Unsigned8();
        public final Unsigned8 configurationValue2 = new Unsigned8();
        public final Unsigned8 configurationValue3 = new Unsigned8();
        public final Unsigned8 configurationValue4 = new Unsigned8();
    }

    /************************************************************/
    /* Ctrl Replication Transfer Group command class structs */
    /************************************************************/
    public static class ZW_CTRL_REPLICATION_TRANSFER_GROUP_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 groupId = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
    /* Ctrl Replication Transfer Group Name 1byte command class structs */
    /************************************************************/
    public static class ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 groupId = new Unsigned8();
        public final Unsigned8 groupName1 = new Unsigned8();
    }

    /************************************************************/
    /* Ctrl Replication Transfer Group Name 2byte command class structs */
    /************************************************************/
    public static class ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 groupId = new Unsigned8();
        public final Unsigned8 groupName1 = new Unsigned8();
        public final Unsigned8 groupName2 = new Unsigned8();
    }

    /************************************************************/
    /* Ctrl Replication Transfer Group Name 3byte command class structs */
    /************************************************************/
    public static class ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 groupId = new Unsigned8();
        public final Unsigned8 groupName1 = new Unsigned8();
        public final Unsigned8 groupName2 = new Unsigned8();
        public final Unsigned8 groupName3 = new Unsigned8();
    }

    /************************************************************/
    /* Ctrl Replication Transfer Group Name 4byte command class structs */
    /************************************************************/
    public static class ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 groupId = new Unsigned8();
        public final Unsigned8 groupName1 = new Unsigned8();
        public final Unsigned8 groupName2 = new Unsigned8();
        public final Unsigned8 groupName3 = new Unsigned8();
        public final Unsigned8 groupName4 = new Unsigned8();
    }

    /************************************************************/
    /* Ctrl Replication Transfer Scene command class structs */
    /************************************************************/
    public static class ZW_CTRL_REPLICATION_TRANSFER_SCENE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
    /* Ctrl Replication Transfer Scene Name 1byte command class structs */
    /************************************************************/
    public static class ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
        public final Unsigned8 sceneName1 = new Unsigned8();
    }

    /************************************************************/
    /* Ctrl Replication Transfer Scene Name 2byte command class structs */
    /************************************************************/
    public static class ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
        public final Unsigned8 sceneName1 = new Unsigned8();
        public final Unsigned8 sceneName2 = new Unsigned8();
    }

    /************************************************************/
    /* Ctrl Replication Transfer Scene Name 3byte command class structs */
    /************************************************************/
    public static class ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
        public final Unsigned8 sceneName1 = new Unsigned8();
        public final Unsigned8 sceneName2 = new Unsigned8();
        public final Unsigned8 sceneName3 = new Unsigned8();
    }

    /************************************************************/
    /* Ctrl Replication Transfer Scene Name 4byte command class structs */
    /************************************************************/
    public static class ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
        public final Unsigned8 sceneName1 = new Unsigned8();
        public final Unsigned8 sceneName2 = new Unsigned8();
        public final Unsigned8 sceneName3 = new Unsigned8();
        public final Unsigned8 sceneName4 = new Unsigned8();
    }

    /************************************************************/
    /* Crc 16 Encap 1byte command class structs */
    /************************************************************/
    public static class ZW_CRC_16_ENCAP_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 commandClass = new Unsigned8();
        public final Unsigned8 command = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Crc 16 Encap 2byte command class structs */
    /************************************************************/
    public static class ZW_CRC_16_ENCAP_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 commandClass = new Unsigned8();
        public final Unsigned8 command = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Crc 16 Encap 3byte command class structs */
    /************************************************************/
    public static class ZW_CRC_16_ENCAP_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 commandClass = new Unsigned8();
        public final Unsigned8 command = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Crc 16 Encap 4byte command class structs */
    /************************************************************/
    public static class ZW_CRC_16_ENCAP_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 commandClass = new Unsigned8();
        public final Unsigned8 command = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 data4 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Remove command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_REMOVE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Set variant group structs */
    /************************************************************/
    public static class VG_DCP_LIST_SET_VG extends Struct {
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Set 1byte command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_DCP_LIST_SET_VG variantgroup1 = new VG_DCP_LIST_SET_VG();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 durationHourTime = new Unsigned8();
        public final Unsigned8 durationMinuteTime = new Unsigned8();
        public final Unsigned8 durationSecondTime = new Unsigned8();
        public final Unsigned8 eventPriority = new Unsigned8();
        public final Unsigned8 loadShedding = new Unsigned8();
        public final Unsigned8 startAssociationGroup = new Unsigned8();
        public final Unsigned8 stopAssociationGroup = new Unsigned8();
        public final Unsigned8 randomizationInterval = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Set 2byte command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_DCP_LIST_SET_VG variantgroup1 = new VG_DCP_LIST_SET_VG();
        VG_DCP_LIST_SET_VG variantgroup2 = new VG_DCP_LIST_SET_VG();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 durationHourTime = new Unsigned8();
        public final Unsigned8 durationMinuteTime = new Unsigned8();
        public final Unsigned8 durationSecondTime = new Unsigned8();
        public final Unsigned8 eventPriority = new Unsigned8();
        public final Unsigned8 loadShedding = new Unsigned8();
        public final Unsigned8 startAssociationGroup = new Unsigned8();
        public final Unsigned8 stopAssociationGroup = new Unsigned8();
        public final Unsigned8 randomizationInterval = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Set 3byte command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_DCP_LIST_SET_VG variantgroup1 = new VG_DCP_LIST_SET_VG();
        VG_DCP_LIST_SET_VG variantgroup2 = new VG_DCP_LIST_SET_VG();
        VG_DCP_LIST_SET_VG variantgroup3 = new VG_DCP_LIST_SET_VG();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 durationHourTime = new Unsigned8();
        public final Unsigned8 durationMinuteTime = new Unsigned8();
        public final Unsigned8 durationSecondTime = new Unsigned8();
        public final Unsigned8 eventPriority = new Unsigned8();
        public final Unsigned8 loadShedding = new Unsigned8();
        public final Unsigned8 startAssociationGroup = new Unsigned8();
        public final Unsigned8 stopAssociationGroup = new Unsigned8();
        public final Unsigned8 randomizationInterval = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Set 4byte command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_DCP_LIST_SET_VG variantgroup1 = new VG_DCP_LIST_SET_VG();
        VG_DCP_LIST_SET_VG variantgroup2 = new VG_DCP_LIST_SET_VG();
        VG_DCP_LIST_SET_VG variantgroup3 = new VG_DCP_LIST_SET_VG();
        VG_DCP_LIST_SET_VG variantgroup4 = new VG_DCP_LIST_SET_VG();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 durationHourTime = new Unsigned8();
        public final Unsigned8 durationMinuteTime = new Unsigned8();
        public final Unsigned8 durationSecondTime = new Unsigned8();
        public final Unsigned8 eventPriority = new Unsigned8();
        public final Unsigned8 loadShedding = new Unsigned8();
        public final Unsigned8 startAssociationGroup = new Unsigned8();
        public final Unsigned8 stopAssociationGroup = new Unsigned8();
        public final Unsigned8 randomizationInterval = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Supported Get command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Supported Report command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 dcpListSize = new Unsigned8();
        public final Unsigned8 freeDcpListEntries = new Unsigned8();
    }

    /************************************************************/
    /* Dcp Event Status Get command class structs */
    /************************************************************/
    public static class ZW_DCP_EVENT_STATUS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
    }

    /************************************************************/
    /* Dcp Event Status Report command class structs */
    /************************************************************/
    public static class ZW_DCP_EVENT_STATUS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 eventStatus = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Get command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Report variant group structs */
    /************************************************************/
    public static class VG_DCP_LIST_REPORT_VG extends Struct {
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Report 1byte command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 dcpId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_DCP_LIST_REPORT_VG variantgroup1 = new VG_DCP_LIST_REPORT_VG();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 durationHourTime = new Unsigned8();
        public final Unsigned8 durationMinuteTime = new Unsigned8();
        public final Unsigned8 durationSecondTime = new Unsigned8();
        public final Unsigned8 eventPriority = new Unsigned8();
        public final Unsigned8 loadShedding = new Unsigned8();
        public final Unsigned8 startAssociationGroup = new Unsigned8();
        public final Unsigned8 stopAssociationGroup = new Unsigned8();
        public final Unsigned8 randomizationInterval = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Report 2byte command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 dcpId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_DCP_LIST_REPORT_VG variantgroup1 = new VG_DCP_LIST_REPORT_VG();
        VG_DCP_LIST_REPORT_VG variantgroup2 = new VG_DCP_LIST_REPORT_VG();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 durationHourTime = new Unsigned8();
        public final Unsigned8 durationMinuteTime = new Unsigned8();
        public final Unsigned8 durationSecondTime = new Unsigned8();
        public final Unsigned8 eventPriority = new Unsigned8();
        public final Unsigned8 loadShedding = new Unsigned8();
        public final Unsigned8 startAssociationGroup = new Unsigned8();
        public final Unsigned8 stopAssociationGroup = new Unsigned8();
        public final Unsigned8 randomizationInterval = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Report 3byte command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 dcpId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_DCP_LIST_REPORT_VG variantgroup1 = new VG_DCP_LIST_REPORT_VG();
        VG_DCP_LIST_REPORT_VG variantgroup2 = new VG_DCP_LIST_REPORT_VG();
        VG_DCP_LIST_REPORT_VG variantgroup3 = new VG_DCP_LIST_REPORT_VG();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 durationHourTime = new Unsigned8();
        public final Unsigned8 durationMinuteTime = new Unsigned8();
        public final Unsigned8 durationSecondTime = new Unsigned8();
        public final Unsigned8 eventPriority = new Unsigned8();
        public final Unsigned8 loadShedding = new Unsigned8();
        public final Unsigned8 startAssociationGroup = new Unsigned8();
        public final Unsigned8 stopAssociationGroup = new Unsigned8();
        public final Unsigned8 randomizationInterval = new Unsigned8();
    }

    /************************************************************/
    /* Dcp List Report 4byte command class structs */
    /************************************************************/
    public static class ZW_DCP_LIST_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 dcpId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_DCP_LIST_REPORT_VG variantgroup1 = new VG_DCP_LIST_REPORT_VG();
        VG_DCP_LIST_REPORT_VG variantgroup2 = new VG_DCP_LIST_REPORT_VG();
        VG_DCP_LIST_REPORT_VG variantgroup3 = new VG_DCP_LIST_REPORT_VG();
        VG_DCP_LIST_REPORT_VG variantgroup4 = new VG_DCP_LIST_REPORT_VG();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 durationHourTime = new Unsigned8();
        public final Unsigned8 durationMinuteTime = new Unsigned8();
        public final Unsigned8 durationSecondTime = new Unsigned8();
        public final Unsigned8 eventPriority = new Unsigned8();
        public final Unsigned8 loadShedding = new Unsigned8();
        public final Unsigned8 startAssociationGroup = new Unsigned8();
        public final Unsigned8 stopAssociationGroup = new Unsigned8();
        public final Unsigned8 randomizationInterval = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Logging Records Supported Get command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Logging Records Supported Report command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 maxRecordsStored = new Unsigned8();
    }

    /************************************************************/
    /* Record Get command class structs */
    /************************************************************/
    public static class ZW_RECORD_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 recordNumber = new Unsigned8();
    }

    /************************************************************/
    /* Record Report 1byte command class structs */
    /************************************************************/
    public static class ZW_RECORD_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 recordNumber = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 eventType = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 userCodeLength = new Unsigned8();
        public final Unsigned8 userCode1 = new Unsigned8();
    }

    /************************************************************/
    /* Record Report 2byte command class structs */
    /************************************************************/
    public static class ZW_RECORD_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 recordNumber = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 eventType = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 userCodeLength = new Unsigned8();
        public final Unsigned8 userCode1 = new Unsigned8();
        public final Unsigned8 userCode2 = new Unsigned8();
    }

    /************************************************************/
    /* Record Report 3byte command class structs */
    /************************************************************/
    public static class ZW_RECORD_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 recordNumber = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 eventType = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 userCodeLength = new Unsigned8();
        public final Unsigned8 userCode1 = new Unsigned8();
        public final Unsigned8 userCode2 = new Unsigned8();
        public final Unsigned8 userCode3 = new Unsigned8();
    }

    /************************************************************/
    /* Record Report 4byte command class structs */
    /************************************************************/
    public static class ZW_RECORD_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 recordNumber = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 eventType = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 userCodeLength = new Unsigned8();
        public final Unsigned8 userCode1 = new Unsigned8();
        public final Unsigned8 userCode2 = new Unsigned8();
        public final Unsigned8 userCode3 = new Unsigned8();
        public final Unsigned8 userCode4 = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Configuration Get command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_CONFIGURATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Configuration Report command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_CONFIGURATION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 operationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 lockTimeoutMinutes = new Unsigned8();
        public final Unsigned8 lockTimeoutSeconds = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Configuration Set command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_CONFIGURATION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 operationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 lockTimeoutMinutes = new Unsigned8();
        public final Unsigned8 lockTimeoutSeconds = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Operation Get command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_OPERATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Operation Report command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_OPERATION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 doorLockMode = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 doorCondition = new Unsigned8();
        public final Unsigned8 lockTimeoutMinutes = new Unsigned8();
        public final Unsigned8 lockTimeoutSeconds = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Operation Set command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_OPERATION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 doorLockMode = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Configuration Get V2 command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_CONFIGURATION_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Configuration Report V2 command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_CONFIGURATION_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 operationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 lockTimeoutMinutes = new Unsigned8();
        public final Unsigned8 lockTimeoutSeconds = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Configuration Set V2 command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_CONFIGURATION_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 operationType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 lockTimeoutMinutes = new Unsigned8();
        public final Unsigned8 lockTimeoutSeconds = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Operation Get V2 command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_OPERATION_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Operation Report V2 command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_OPERATION_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 doorLockMode = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 doorCondition = new Unsigned8();
        public final Unsigned8 lockTimeoutMinutes = new Unsigned8();
        public final Unsigned8 lockTimeoutSeconds = new Unsigned8();
    }

    /************************************************************/
    /* Door Lock Operation Set V2 command class structs */
    /************************************************************/
    public static class ZW_DOOR_LOCK_OPERATION_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 doorLockMode = new Unsigned8();
    }

    /************************************************************/
    /* Energy Production Get command class structs */
    /************************************************************/
    public static class ZW_ENERGY_PRODUCTION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
    }

    /************************************************************/
    /* Energy Production Report 1byte command class structs */
    /************************************************************/
    public static class ZW_ENERGY_PRODUCTION_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
    /* Energy Production Report 2byte command class structs */
    /************************************************************/
    public static class ZW_ENERGY_PRODUCTION_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
    /* Energy Production Report 3byte command class structs */
    /************************************************************/
    public static class ZW_ENERGY_PRODUCTION_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
    /* Energy Production Report 4byte command class structs */
    /************************************************************/
    public static class ZW_ENERGY_PRODUCTION_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameterNumber = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Md Get command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_MD_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Md Report command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_MD_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 firmwareId1 = new Unsigned8();
        public final Unsigned8 firmwareId2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Get command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfReports = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Report 1byte command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Report 2byte command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Report 3byte command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Report 4byte command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 data4 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Request Get command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REQUEST_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 firmwareId1 = new Unsigned8();
        public final Unsigned8 firmwareId2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Request Report command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REQUEST_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Status Report command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_STATUS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Md Get V2 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_MD_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Md Report V2 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_MD_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 firmwareId1 = new Unsigned8();
        public final Unsigned8 firmwareId2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Get V2 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfReports = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 data4 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Request Get V2 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REQUEST_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 firmwareId1 = new Unsigned8();
        public final Unsigned8 firmwareId2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
    /* Firmware Update Md Request Report V2 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REQUEST_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Update Md Status Report V2 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_STATUS_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Md Get V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_MD_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Md Report V3 variant group structs */
    /************************************************************/
    public static class VG_FIRMWARE_MD_REPORT_V3_VG extends Struct {
        public final Unsigned8 firmwareId1 = new Unsigned8();
        public final Unsigned8 firmwareId2 = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Md Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_MD_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 firmware0Id1 = new Unsigned8();
        public final Unsigned8 firmware0Id2 = new Unsigned8();
        public final Unsigned8 firmware0Checksum1 = new Unsigned8();
        public final Unsigned8 firmware0Checksum2 = new Unsigned8();
        public final Unsigned8 firmwareUpgradable = new Unsigned8();
        public final Unsigned8 numberOfFirmwareTargets = new Unsigned8();
        public final Unsigned8 maxFragmentSize1 = new Unsigned8();
        public final Unsigned8 maxFragmentSize2 = new Unsigned8();
        VG_FIRMWARE_MD_REPORT_V3_VG variantgroup1 = new VG_FIRMWARE_MD_REPORT_V3_VG();
    }

    /************************************************************/
	/* Firmware Md Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_MD_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 firmware0Id1 = new Unsigned8();
        public final Unsigned8 firmware0Id2 = new Unsigned8();
        public final Unsigned8 firmware0Checksum1 = new Unsigned8();
        public final Unsigned8 firmware0Checksum2 = new Unsigned8();
        public final Unsigned8 firmwareUpgradable = new Unsigned8();
        public final Unsigned8 numberOfFirmwareTargets = new Unsigned8();
        public final Unsigned8 maxFragmentSize1 = new Unsigned8();
        public final Unsigned8 maxFragmentSize2 = new Unsigned8();
        VG_FIRMWARE_MD_REPORT_V3_VG variantgroup1 = new VG_FIRMWARE_MD_REPORT_V3_VG();
        VG_FIRMWARE_MD_REPORT_V3_VG variantgroup2 = new VG_FIRMWARE_MD_REPORT_V3_VG();
    }

    /************************************************************/
	/* Firmware Md Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_MD_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 firmware0Id1 = new Unsigned8();
        public final Unsigned8 firmware0Id2 = new Unsigned8();
        public final Unsigned8 firmware0Checksum1 = new Unsigned8();
        public final Unsigned8 firmware0Checksum2 = new Unsigned8();
        public final Unsigned8 firmwareUpgradable = new Unsigned8();
        public final Unsigned8 numberOfFirmwareTargets = new Unsigned8();
        public final Unsigned8 maxFragmentSize1 = new Unsigned8();
        public final Unsigned8 maxFragmentSize2 = new Unsigned8();
        VG_FIRMWARE_MD_REPORT_V3_VG variantgroup1 = new VG_FIRMWARE_MD_REPORT_V3_VG();
        VG_FIRMWARE_MD_REPORT_V3_VG variantgroup2 = new VG_FIRMWARE_MD_REPORT_V3_VG();
        VG_FIRMWARE_MD_REPORT_V3_VG variantgroup3 = new VG_FIRMWARE_MD_REPORT_V3_VG();
    }

    /************************************************************/
	/* Firmware Md Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_MD_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 firmware0Id1 = new Unsigned8();
        public final Unsigned8 firmware0Id2 = new Unsigned8();
        public final Unsigned8 firmware0Checksum1 = new Unsigned8();
        public final Unsigned8 firmware0Checksum2 = new Unsigned8();
        public final Unsigned8 firmwareUpgradable = new Unsigned8();
        public final Unsigned8 numberOfFirmwareTargets = new Unsigned8();
        public final Unsigned8 maxFragmentSize1 = new Unsigned8();
        public final Unsigned8 maxFragmentSize2 = new Unsigned8();
        VG_FIRMWARE_MD_REPORT_V3_VG variantgroup1 = new VG_FIRMWARE_MD_REPORT_V3_VG();
        VG_FIRMWARE_MD_REPORT_V3_VG variantgroup2 = new VG_FIRMWARE_MD_REPORT_V3_VG();
        VG_FIRMWARE_MD_REPORT_V3_VG variantgroup3 = new VG_FIRMWARE_MD_REPORT_V3_VG();
        VG_FIRMWARE_MD_REPORT_V3_VG variantgroup4 = new VG_FIRMWARE_MD_REPORT_V3_VG();
    }

    /************************************************************/
	/* Firmware Update Md Get V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfReports = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Update Md Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Update Md Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Update Md Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Update Md Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 reportNumber2 = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 data4 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Update Md Request Get V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REQUEST_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 firmwareId1 = new Unsigned8();
        public final Unsigned8 firmwareId2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
        public final Unsigned8 firmwareTarget = new Unsigned8();
        public final Unsigned8 fragmentSize1 = new Unsigned8();
        public final Unsigned8 fragmentSize2 = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Update Md Request Report V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_REQUEST_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Firmware Update Md Status Report V3 command class structs */
    /************************************************************/
    public static class ZW_FIRMWARE_UPDATE_MD_STATUS_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 waittime1 = new Unsigned8();
        public final Unsigned8 waittime2 = new Unsigned8();
    }

    /************************************************************/
	/* Geographic Location Get command class structs */
    /************************************************************/
    public static class ZW_GEOGRAPHIC_LOCATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Geographic Location Report command class structs */
    /************************************************************/
    public static class ZW_GEOGRAPHIC_LOCATION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 longitudeDegrees = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 latitudeDegrees = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
    }

    /************************************************************/
	/* Geographic Location Set command class structs */
    /************************************************************/
    public static class ZW_GEOGRAPHIC_LOCATION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 longitudeDegrees = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 latitudeDegrees = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
    }

    /************************************************************/
	/* Grouping Name Get command class structs */
    /************************************************************/
    public static class ZW_GROUPING_NAME_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* Grouping Name Report command class structs */
    /************************************************************/
    public static class ZW_GROUPING_NAME_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 groupingName1 = new Unsigned8();
        public final Unsigned8 groupingName2 = new Unsigned8();
        public final Unsigned8 groupingName3 = new Unsigned8();
        public final Unsigned8 groupingName4 = new Unsigned8();
        public final Unsigned8 groupingName5 = new Unsigned8();
        public final Unsigned8 groupingName6 = new Unsigned8();
        public final Unsigned8 groupingName7 = new Unsigned8();
        public final Unsigned8 groupingName8 = new Unsigned8();
        public final Unsigned8 groupingName9 = new Unsigned8();
        public final Unsigned8 groupingName10 = new Unsigned8();
        public final Unsigned8 groupingName11 = new Unsigned8();
        public final Unsigned8 groupingName12 = new Unsigned8();
        public final Unsigned8 groupingName13 = new Unsigned8();
        public final Unsigned8 groupingName14 = new Unsigned8();
        public final Unsigned8 groupingName15 = new Unsigned8();
        public final Unsigned8 groupingName16 = new Unsigned8();
    }

    /************************************************************/
	/* Grouping Name Set command class structs */
    /************************************************************/
    public static class ZW_GROUPING_NAME_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 groupingName1 = new Unsigned8();
        public final Unsigned8 groupingName2 = new Unsigned8();
        public final Unsigned8 groupingName3 = new Unsigned8();
        public final Unsigned8 groupingName4 = new Unsigned8();
        public final Unsigned8 groupingName5 = new Unsigned8();
        public final Unsigned8 groupingName6 = new Unsigned8();
        public final Unsigned8 groupingName7 = new Unsigned8();
        public final Unsigned8 groupingName8 = new Unsigned8();
        public final Unsigned8 groupingName9 = new Unsigned8();
        public final Unsigned8 groupingName10 = new Unsigned8();
        public final Unsigned8 groupingName11 = new Unsigned8();
        public final Unsigned8 groupingName12 = new Unsigned8();
        public final Unsigned8 groupingName13 = new Unsigned8();
        public final Unsigned8 groupingName14 = new Unsigned8();
        public final Unsigned8 groupingName15 = new Unsigned8();
        public final Unsigned8 groupingName16 = new Unsigned8();
    }

    /************************************************************/
	/* Hail command class structs */
    /************************************************************/
    public static class ZW_HAIL_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Bypass Get command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_BYPASS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Bypass Report command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_BYPASS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bypass = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Bypass Set command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_BYPASS_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bypass = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Mode Get command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_MODE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Mode Report command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_MODE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Mode Set command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_MODE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Mode Supported Get command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_MODE_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Mode Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Mode Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Mode Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Mode Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Ventilation Rate Get command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_VENTILATION_RATE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Ventilation Rate Report command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_VENTILATION_RATE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 ventilationRate = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Control Ventilation Rate Set command class structs */
    /************************************************************/
    public static class ZW_HRV_CONTROL_VENTILATION_RATE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 ventilationRate = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Status Get command class structs */
    /************************************************************/
    public static class ZW_HRV_STATUS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 statusParameter = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Status Report 1byte command class structs */
    /************************************************************/
    public static class ZW_HRV_STATUS_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 statusParameter = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Status Report 2byte command class structs */
    /************************************************************/
    public static class ZW_HRV_STATUS_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 statusParameter = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Status Report 3byte command class structs */
    /************************************************************/
    public static class ZW_HRV_STATUS_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 statusParameter = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Status Report 4byte command class structs */
    /************************************************************/
    public static class ZW_HRV_STATUS_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 statusParameter = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Status Supported Get command class structs */
    /************************************************************/
    public static class ZW_HRV_STATUS_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Status Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_HRV_STATUS_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Status Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_HRV_STATUS_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Status Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_HRV_STATUS_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Hrv Status Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_HRV_STATUS_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Indicator Get command class structs */
    /************************************************************/
    public static class ZW_INDICATOR_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Indicator Report command class structs */
    /************************************************************/
    public static class ZW_INDICATOR_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Indicator Set command class structs */
    /************************************************************/
    public static class ZW_INDICATOR_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Ip Configuration Get command class structs */
    /************************************************************/
    public static class ZW_IP_CONFIGURATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Ip Configuration Release command class structs */
    /************************************************************/
    public static class ZW_IP_CONFIGURATION_RELEASE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Ip Configuration Renew command class structs */
    /************************************************************/
    public static class ZW_IP_CONFIGURATION_RENEW_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Ip Configuration Report command class structs */
    /************************************************************/
    public static class ZW_IP_CONFIGURATION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 ipAddress1 = new Unsigned8();
        public final Unsigned8 ipAddress2 = new Unsigned8();
        public final Unsigned8 ipAddress3 = new Unsigned8();
        public final Unsigned8 ipAddress4 = new Unsigned8();
        public final Unsigned8 subnetMask1 = new Unsigned8();
        public final Unsigned8 subnetMask2 = new Unsigned8();
        public final Unsigned8 subnetMask3 = new Unsigned8();
        public final Unsigned8 subnetMask4 = new Unsigned8();
        public final Unsigned8 gateway1 = new Unsigned8();
        public final Unsigned8 gateway2 = new Unsigned8();
        public final Unsigned8 gateway3 = new Unsigned8();
        public final Unsigned8 gateway4 = new Unsigned8();
        public final Unsigned8 dns11 = new Unsigned8();
        public final Unsigned8 dns12 = new Unsigned8();
        public final Unsigned8 dns13 = new Unsigned8();
        public final Unsigned8 dns14 = new Unsigned8();
        public final Unsigned8 dns21 = new Unsigned8();
        public final Unsigned8 dns22 = new Unsigned8();
        public final Unsigned8 dns23 = new Unsigned8();
        public final Unsigned8 dns24 = new Unsigned8();
        public final Unsigned8 leasetime1 = new Unsigned8();
        public final Unsigned8 leasetime2 = new Unsigned8();
        public final Unsigned8 leasetime3 = new Unsigned8();
        public final Unsigned8 leasetime4 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Configuration Set command class structs */
    /************************************************************/
    public static class ZW_IP_CONFIGURATION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 ipAddress1 = new Unsigned8();
        public final Unsigned8 ipAddress2 = new Unsigned8();
        public final Unsigned8 ipAddress3 = new Unsigned8();
        public final Unsigned8 ipAddress4 = new Unsigned8();
        public final Unsigned8 subnetMask1 = new Unsigned8();
        public final Unsigned8 subnetMask2 = new Unsigned8();
        public final Unsigned8 subnetMask3 = new Unsigned8();
        public final Unsigned8 subnetMask4 = new Unsigned8();
        public final Unsigned8 gateway1 = new Unsigned8();
        public final Unsigned8 gateway2 = new Unsigned8();
        public final Unsigned8 gateway3 = new Unsigned8();
        public final Unsigned8 gateway4 = new Unsigned8();
        public final Unsigned8 dns11 = new Unsigned8();
        public final Unsigned8 dns12 = new Unsigned8();
        public final Unsigned8 dns13 = new Unsigned8();
        public final Unsigned8 dns14 = new Unsigned8();
        public final Unsigned8 dns21 = new Unsigned8();
        public final Unsigned8 dns22 = new Unsigned8();
        public final Unsigned8 dns23 = new Unsigned8();
        public final Unsigned8 dns24 = new Unsigned8();
    }

    /************************************************************/
	/* Language Get command class structs */
    /************************************************************/
    public static class ZW_LANGUAGE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Language Report command class structs */
    /************************************************************/
    public static class ZW_LANGUAGE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 language1 = new Unsigned8();
        public final Unsigned8 language2 = new Unsigned8();
        public final Unsigned8 language3 = new Unsigned8();
        public final Unsigned8 country1 = new Unsigned8();
        public final Unsigned8 country2 = new Unsigned8();
    }

    /************************************************************/
	/* Language Set command class structs */
    /************************************************************/
    public static class ZW_LANGUAGE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 language1 = new Unsigned8();
        public final Unsigned8 language2 = new Unsigned8();
        public final Unsigned8 language3 = new Unsigned8();
        public final Unsigned8 country1 = new Unsigned8();
        public final Unsigned8 country2 = new Unsigned8();
    }

    /************************************************************/
	/* Lock Get command class structs */
    /************************************************************/
    public static class ZW_LOCK_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Lock Report command class structs */
    /************************************************************/
    public static class ZW_LOCK_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 lockState = new Unsigned8();
    }

    /************************************************************/
	/* Lock Set command class structs */
    /************************************************************/
    public static class ZW_LOCK_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 lockState = new Unsigned8();
    }

    /************************************************************/
	/* Manufacturer Specific Get command class structs */
    /************************************************************/
    public static class ZW_MANUFACTURER_SPECIFIC_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Manufacturer Specific Report command class structs */
    /************************************************************/
    public static class ZW_MANUFACTURER_SPECIFIC_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 productTypeId1 = new Unsigned8();
        public final Unsigned8 productTypeId2 = new Unsigned8();
        public final Unsigned8 productId1 = new Unsigned8();
        public final Unsigned8 productId2 = new Unsigned8();
    }

    /************************************************************/
	/* Manufacturer Specific Get V2 command class structs */
    /************************************************************/
    public static class ZW_MANUFACTURER_SPECIFIC_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Manufacturer Specific Report V2 command class structs */
    /************************************************************/
    public static class ZW_MANUFACTURER_SPECIFIC_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 productTypeId1 = new Unsigned8();
        public final Unsigned8 productTypeId2 = new Unsigned8();
        public final Unsigned8 productId1 = new Unsigned8();
        public final Unsigned8 productId2 = new Unsigned8();
    }

    /************************************************************/
	/* Device Specific Get V2 command class structs */
    /************************************************************/
    public static class ZW_DEVICE_SPECIFIC_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Device Specific Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_DEVICE_SPECIFIC_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 deviceIdData1 = new Unsigned8();
    }

    /************************************************************/
	/* Device Specific Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_DEVICE_SPECIFIC_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 deviceIdData1 = new Unsigned8();
        public final Unsigned8 deviceIdData2 = new Unsigned8();
    }

    /************************************************************/
	/* Device Specific Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_DEVICE_SPECIFIC_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 deviceIdData1 = new Unsigned8();
        public final Unsigned8 deviceIdData2 = new Unsigned8();
        public final Unsigned8 deviceIdData3 = new Unsigned8();
    }

    /************************************************************/
	/* Device Specific Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_DEVICE_SPECIFIC_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 deviceIdData1 = new Unsigned8();
        public final Unsigned8 deviceIdData2 = new Unsigned8();
        public final Unsigned8 deviceIdData3 = new Unsigned8();
        public final Unsigned8 deviceIdData4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Pulse Get command class structs */
    /************************************************************/
    public static class ZW_METER_PULSE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Pulse Report command class structs */
    /************************************************************/
    public static class ZW_METER_PULSE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 pulseCount1 = new Unsigned8();
        public final Unsigned8 pulseCount2 = new Unsigned8();
        public final Unsigned8 pulseCount3 = new Unsigned8();
        public final Unsigned8 pulseCount4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Set 1byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Set 2byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Set 3byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter2 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Set 4byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter2 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter3 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Status Report variant group structs */
    /************************************************************/
    public static class VG_METER_TBL_STATUS_REPORT_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Status Report 1byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 currentOperatingStatus1 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus2 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus3 = new Unsigned8();
        VG_METER_TBL_STATUS_REPORT_VG variantgroup1 = new VG_METER_TBL_STATUS_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Status Report 2byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 currentOperatingStatus1 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus2 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus3 = new Unsigned8();
        VG_METER_TBL_STATUS_REPORT_VG variantgroup1 = new VG_METER_TBL_STATUS_REPORT_VG();
        VG_METER_TBL_STATUS_REPORT_VG variantgroup2 = new VG_METER_TBL_STATUS_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Status Report 3byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 currentOperatingStatus1 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus2 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus3 = new Unsigned8();
        VG_METER_TBL_STATUS_REPORT_VG variantgroup1 = new VG_METER_TBL_STATUS_REPORT_VG();
        VG_METER_TBL_STATUS_REPORT_VG variantgroup2 = new VG_METER_TBL_STATUS_REPORT_VG();
        VG_METER_TBL_STATUS_REPORT_VG variantgroup3 = new VG_METER_TBL_STATUS_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Status Report 4byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 currentOperatingStatus1 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus2 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus3 = new Unsigned8();
        VG_METER_TBL_STATUS_REPORT_VG variantgroup1 = new VG_METER_TBL_STATUS_REPORT_VG();
        VG_METER_TBL_STATUS_REPORT_VG variantgroup2 = new VG_METER_TBL_STATUS_REPORT_VG();
        VG_METER_TBL_STATUS_REPORT_VG variantgroup3 = new VG_METER_TBL_STATUS_REPORT_VG();
        VG_METER_TBL_STATUS_REPORT_VG variantgroup4 = new VG_METER_TBL_STATUS_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Status Date Get command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_DATE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 maximumReports = new Unsigned8();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 stopYear1 = new Unsigned8();
        public final Unsigned8 stopYear2 = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHourLocalTime = new Unsigned8();
        public final Unsigned8 stopMinuteLocalTime = new Unsigned8();
        public final Unsigned8 stopSecondLocalTime = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Status Depth Get command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_DEPTH_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 statusEventLogDepth = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Status Supported Get command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Status Supported Report command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedOperatingStatus1 = new Unsigned8();
        public final Unsigned8 supportedOperatingStatus2 = new Unsigned8();
        public final Unsigned8 supportedOperatingStatus3 = new Unsigned8();
        public final Unsigned8 statusEventLogDepth = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Current Data Get command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_CURRENT_DATA_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 datasetRequested1 = new Unsigned8();
        public final Unsigned8 datasetRequested2 = new Unsigned8();
        public final Unsigned8 datasetRequested3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Current Data Report variant group structs */
    /************************************************************/
    public static class VG_METER_TBL_CURRENT_DATA_REPORT_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 currentValue1 = new Unsigned8();
        public final Unsigned8 currentValue2 = new Unsigned8();
        public final Unsigned8 currentValue3 = new Unsigned8();
        public final Unsigned8 currentValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Current Data Report 1byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_CURRENT_DATA_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_CURRENT_DATA_REPORT_VG variantgroup1
                = new VG_METER_TBL_CURRENT_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Current Data Report 2byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_CURRENT_DATA_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_CURRENT_DATA_REPORT_VG variantgroup1
                = new VG_METER_TBL_CURRENT_DATA_REPORT_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_VG variantgroup2
                = new VG_METER_TBL_CURRENT_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Current Data Report 3byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_CURRENT_DATA_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_CURRENT_DATA_REPORT_VG variantgroup1
                = new VG_METER_TBL_CURRENT_DATA_REPORT_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_VG variantgroup2
                = new VG_METER_TBL_CURRENT_DATA_REPORT_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_VG variantgroup3
                = new VG_METER_TBL_CURRENT_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Current Data Report 4byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_CURRENT_DATA_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_CURRENT_DATA_REPORT_VG variantgroup1
                = new VG_METER_TBL_CURRENT_DATA_REPORT_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_VG variantgroup2
                = new VG_METER_TBL_CURRENT_DATA_REPORT_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_VG variantgroup3
                = new VG_METER_TBL_CURRENT_DATA_REPORT_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_VG variantgroup4
                = new VG_METER_TBL_CURRENT_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Get command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_HISTORICAL_DATA_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 maximumReports = new Unsigned8();
        public final Unsigned8 historicalDatasetRequested1 = new Unsigned8();
        public final Unsigned8 historicalDatasetRequested2 = new Unsigned8();
        public final Unsigned8 historicalDatasetRequested3 = new Unsigned8();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 stopYear1 = new Unsigned8();
        public final Unsigned8 stopYear2 = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHourLocalTime = new Unsigned8();
        public final Unsigned8 stopMinuteLocalTime = new Unsigned8();
        public final Unsigned8 stopSecondLocalTime = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Report variant group structs */
    /************************************************************/
    public static class VG_METER_TBL_HISTORICAL_DATA_REPORT_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 historicalValue1 = new Unsigned8();
        public final Unsigned8 historicalValue2 = new Unsigned8();
        public final Unsigned8 historicalValue3 = new Unsigned8();
        public final Unsigned8 historicalValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Report 1byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_HISTORICAL_DATA_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_VG variantgroup1
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Report 2byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_HISTORICAL_DATA_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_VG variantgroup1
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_VG variantgroup2
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Report 3byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_HISTORICAL_DATA_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_VG variantgroup1
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_VG variantgroup2
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_VG variantgroup3
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Report 4byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_HISTORICAL_DATA_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_VG variantgroup1
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_VG variantgroup2
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_VG variantgroup3
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_VG variantgroup4
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Meter Tbl Report command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 datasetSupported1 = new Unsigned8();
        public final Unsigned8 datasetSupported2 = new Unsigned8();
        public final Unsigned8 datasetSupported3 = new Unsigned8();
        public final Unsigned8 datasetHistorySupported1 = new Unsigned8();
        public final Unsigned8 datasetHistorySupported2 = new Unsigned8();
        public final Unsigned8 datasetHistorySupported3 = new Unsigned8();
        public final Unsigned8 dataHistorySupported1 = new Unsigned8();
        public final Unsigned8 dataHistorySupported2 = new Unsigned8();
        public final Unsigned8 dataHistorySupported3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Capability Get command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_CAPABILITY_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Id Get command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_ID_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Id Report 1byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_ID_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Id Report 2byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_ID_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Id Report 3byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_ID_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter2 = new Unsigned8();
        public final Unsigned8 meterIdCharacter3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Id Report 4byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_ID_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter2 = new Unsigned8();
        public final Unsigned8 meterIdCharacter3 = new Unsigned8();
        public final Unsigned8 meterIdCharacter4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Get command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Report 1byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Report 2byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Report 3byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter2 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Report 4byte command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter2 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter3 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Status Report V2 variant group structs */
    /************************************************************/
    public static class VG_METER_TBL_STATUS_REPORT_V2_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Status Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 currentOperatingStatus1 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus2 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus3 = new Unsigned8();
        VG_METER_TBL_STATUS_REPORT_V2_VG variantgroup1 = new VG_METER_TBL_STATUS_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Status Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 currentOperatingStatus1 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus2 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus3 = new Unsigned8();
        VG_METER_TBL_STATUS_REPORT_V2_VG variantgroup1 = new VG_METER_TBL_STATUS_REPORT_V2_VG();
        VG_METER_TBL_STATUS_REPORT_V2_VG variantgroup2 = new VG_METER_TBL_STATUS_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Status Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 currentOperatingStatus1 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus2 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus3 = new Unsigned8();
        VG_METER_TBL_STATUS_REPORT_V2_VG variantgroup1 = new VG_METER_TBL_STATUS_REPORT_V2_VG();
        VG_METER_TBL_STATUS_REPORT_V2_VG variantgroup2 = new VG_METER_TBL_STATUS_REPORT_V2_VG();
        VG_METER_TBL_STATUS_REPORT_V2_VG variantgroup3 = new VG_METER_TBL_STATUS_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Status Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 currentOperatingStatus1 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus2 = new Unsigned8();
        public final Unsigned8 currentOperatingStatus3 = new Unsigned8();
        VG_METER_TBL_STATUS_REPORT_V2_VG variantgroup1 = new VG_METER_TBL_STATUS_REPORT_V2_VG();
        VG_METER_TBL_STATUS_REPORT_V2_VG variantgroup2 = new VG_METER_TBL_STATUS_REPORT_V2_VG();
        VG_METER_TBL_STATUS_REPORT_V2_VG variantgroup3 = new VG_METER_TBL_STATUS_REPORT_V2_VG();
        VG_METER_TBL_STATUS_REPORT_V2_VG variantgroup4 = new VG_METER_TBL_STATUS_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Status Date Get V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_DATE_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 maximumReports = new Unsigned8();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 stopYear1 = new Unsigned8();
        public final Unsigned8 stopYear2 = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHourLocalTime = new Unsigned8();
        public final Unsigned8 stopMinuteLocalTime = new Unsigned8();
        public final Unsigned8 stopSecondLocalTime = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Status Depth Get V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_DEPTH_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 statusEventLogDepth = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Status Supported Get V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_SUPPORTED_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Status Supported Report V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_STATUS_SUPPORTED_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedOperatingStatus1 = new Unsigned8();
        public final Unsigned8 supportedOperatingStatus2 = new Unsigned8();
        public final Unsigned8 supportedOperatingStatus3 = new Unsigned8();
        public final Unsigned8 statusEventLogDepth = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Current Data Get V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_CURRENT_DATA_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 datasetRequested1 = new Unsigned8();
        public final Unsigned8 datasetRequested2 = new Unsigned8();
        public final Unsigned8 datasetRequested3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Current Data Report V2 variant group structs */
    /************************************************************/
    public static class VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 currentValue1 = new Unsigned8();
        public final Unsigned8 currentValue2 = new Unsigned8();
        public final Unsigned8 currentValue3 = new Unsigned8();
        public final Unsigned8 currentValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Current Data Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_CURRENT_DATA_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG variantgroup1
                = new VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Current Data Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_CURRENT_DATA_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG variantgroup1
                = new VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG variantgroup2
                = new VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Current Data Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_CURRENT_DATA_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG variantgroup1
                = new VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG variantgroup2
                = new VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG variantgroup3
                = new VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Current Data Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_CURRENT_DATA_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG variantgroup1
                = new VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG variantgroup2
                = new VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG variantgroup3
                = new VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
        VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG variantgroup4
                = new VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Get V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_HISTORICAL_DATA_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 maximumReports = new Unsigned8();
        public final Unsigned8 historicalDatasetRequested1 = new Unsigned8();
        public final Unsigned8 historicalDatasetRequested2 = new Unsigned8();
        public final Unsigned8 historicalDatasetRequested3 = new Unsigned8();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 stopYear1 = new Unsigned8();
        public final Unsigned8 stopYear2 = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHourLocalTime = new Unsigned8();
        public final Unsigned8 stopMinuteLocalTime = new Unsigned8();
        public final Unsigned8 stopSecondLocalTime = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Report V2 variant group structs */
    /************************************************************/
    public static class VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 historicalValue1 = new Unsigned8();
        public final Unsigned8 historicalValue2 = new Unsigned8();
        public final Unsigned8 historicalValue3 = new Unsigned8();
        public final Unsigned8 historicalValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_HISTORICAL_DATA_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG variantgroup1
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_HISTORICAL_DATA_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG variantgroup1
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG variantgroup2
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_HISTORICAL_DATA_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG variantgroup1
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG variantgroup2
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG variantgroup3
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Historical Data Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_HISTORICAL_DATA_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG variantgroup1
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG variantgroup2
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG variantgroup3
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
        VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG variantgroup4
                = new VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
    }

    /************************************************************/
	/* Meter Tbl Report V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 datasetSupported1 = new Unsigned8();
        public final Unsigned8 datasetSupported2 = new Unsigned8();
        public final Unsigned8 datasetSupported3 = new Unsigned8();
        public final Unsigned8 datasetHistorySupported1 = new Unsigned8();
        public final Unsigned8 datasetHistorySupported2 = new Unsigned8();
        public final Unsigned8 datasetHistorySupported3 = new Unsigned8();
        public final Unsigned8 dataHistorySupported1 = new Unsigned8();
        public final Unsigned8 dataHistorySupported2 = new Unsigned8();
        public final Unsigned8 dataHistorySupported3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Capability Get V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_CAPABILITY_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Id Get V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_ID_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Id Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_ID_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Id Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_ID_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Id Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_ID_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter2 = new Unsigned8();
        public final Unsigned8 meterIdCharacter3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Id Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_ID_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter1 = new Unsigned8();
        public final Unsigned8 meterIdCharacter2 = new Unsigned8();
        public final Unsigned8 meterIdCharacter3 = new Unsigned8();
        public final Unsigned8 meterIdCharacter4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Get V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter2 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Table Point Adm No Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter1 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter2 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter3 = new Unsigned8();
        public final Unsigned8 meterPointAdmNumberCharacter4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Push Configuration Get command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_PUSH_CONFIGURATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Push Configuration Report command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_PUSH_CONFIGURATION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 pushDataset1 = new Unsigned8();
        public final Unsigned8 pushDataset2 = new Unsigned8();
        public final Unsigned8 pushDataset3 = new Unsigned8();
        public final Unsigned8 intervalMonths = new Unsigned8();
        public final Unsigned8 intervalDays = new Unsigned8();
        public final Unsigned8 intervalHours = new Unsigned8();
        public final Unsigned8 intervalMinutes = new Unsigned8();
        public final Unsigned8 pushNodeId = new Unsigned8();
    }

    /************************************************************/
	/* Meter Tbl Push Configuration Set command class structs */
    /************************************************************/
    public static class ZW_METER_TBL_PUSH_CONFIGURATION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 pushDataset1 = new Unsigned8();
        public final Unsigned8 pushDataset2 = new Unsigned8();
        public final Unsigned8 pushDataset3 = new Unsigned8();
        public final Unsigned8 intervalMonths = new Unsigned8();
        public final Unsigned8 intervalDays = new Unsigned8();
        public final Unsigned8 intervalHours = new Unsigned8();
        public final Unsigned8 intervalMinutes = new Unsigned8();
        public final Unsigned8 pushNodeId = new Unsigned8();
    }

    /************************************************************/
	/* Meter Get command class structs */
    /************************************************************/
    public static class ZW_METER_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 1byte command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 meterType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 2byte command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 meterType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 3byte command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 meterType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 meterValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 4byte command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 meterType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 meterValue3 = new Unsigned8();
        public final Unsigned8 meterValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Get V2 command class structs */
    /************************************************************/
    public static class ZW_METER_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
        public final Unsigned8 previousMeterValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 meterValue3 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
        public final Unsigned8 previousMeterValue2 = new Unsigned8();
        public final Unsigned8 previousMeterValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 meterValue3 = new Unsigned8();
        public final Unsigned8 meterValue4 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
        public final Unsigned8 previousMeterValue2 = new Unsigned8();
        public final Unsigned8 previousMeterValue3 = new Unsigned8();
        public final Unsigned8 previousMeterValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Reset V2 command class structs */
    /************************************************************/
    public static class ZW_METER_RESET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Supported Get V2 command class structs */
    /************************************************************/
    public static class ZW_METER_SUPPORTED_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Supported Report V2 command class structs */
    /************************************************************/
    public static class ZW_METER_SUPPORTED_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Get V3 command class structs */
    /************************************************************/
    public static class ZW_METER_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
        public final Unsigned8 previousMeterValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 meterValue3 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
        public final Unsigned8 previousMeterValue2 = new Unsigned8();
        public final Unsigned8 previousMeterValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 meterValue3 = new Unsigned8();
        public final Unsigned8 meterValue4 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
        public final Unsigned8 previousMeterValue2 = new Unsigned8();
        public final Unsigned8 previousMeterValue3 = new Unsigned8();
        public final Unsigned8 previousMeterValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Reset V3 command class structs */
    /************************************************************/
    public static class ZW_METER_RESET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Supported Get V3 command class structs */
    /************************************************************/
    public static class ZW_METER_SUPPORTED_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Supported Report V3 command class structs */
    /************************************************************/
    public static class ZW_METER_SUPPORTED_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 scaleSupported = new Unsigned8();
    }

    /************************************************************/
	/* Meter Get V4 command class structs */
    /************************************************************/
    public static class ZW_METER_GET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 scale2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 1byte V4 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_1BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
        public final Unsigned8 scale2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 2byte V4 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_2BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
        public final Unsigned8 previousMeterValue2 = new Unsigned8();
        public final Unsigned8 scale2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 3byte V4 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_3BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 meterValue3 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
        public final Unsigned8 previousMeterValue2 = new Unsigned8();
        public final Unsigned8 previousMeterValue3 = new Unsigned8();
        public final Unsigned8 scale2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Report 4byte V4 command class structs */
    /************************************************************/
    public static class ZW_METER_REPORT_4BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 meterValue1 = new Unsigned8();
        public final Unsigned8 meterValue2 = new Unsigned8();
        public final Unsigned8 meterValue3 = new Unsigned8();
        public final Unsigned8 meterValue4 = new Unsigned8();
        public final Unsigned8 deltaTime1 = new Unsigned8();
        public final Unsigned8 deltaTime2 = new Unsigned8();
        public final Unsigned8 previousMeterValue1 = new Unsigned8();
        public final Unsigned8 previousMeterValue2 = new Unsigned8();
        public final Unsigned8 previousMeterValue3 = new Unsigned8();
        public final Unsigned8 previousMeterValue4 = new Unsigned8();
        public final Unsigned8 scale2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Reset V4 command class structs */
    /************************************************************/
    public static class ZW_METER_RESET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Supported Get V4 command class structs */
    /************************************************************/
    public static class ZW_METER_SUPPORTED_GET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Meter Supported Report 1byte V4 command class structs */
    /************************************************************/
    public static class ZW_METER_SUPPORTED_REPORT_1BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfScaleSupportedBytesToFollow = new Unsigned8();
        public final Unsigned8 scaleSupported1 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Supported Report 2byte V4 command class structs */
    /************************************************************/
    public static class ZW_METER_SUPPORTED_REPORT_2BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfScaleSupportedBytesToFollow = new Unsigned8();
        public final Unsigned8 scaleSupported1 = new Unsigned8();
        public final Unsigned8 scaleSupported2 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Supported Report 3byte V4 command class structs */
    /************************************************************/
    public static class ZW_METER_SUPPORTED_REPORT_3BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfScaleSupportedBytesToFollow = new Unsigned8();
        public final Unsigned8 scaleSupported1 = new Unsigned8();
        public final Unsigned8 scaleSupported2 = new Unsigned8();
        public final Unsigned8 scaleSupported3 = new Unsigned8();
    }

    /************************************************************/
	/* Meter Supported Report 4byte V4 command class structs */
    /************************************************************/
    public static class ZW_METER_SUPPORTED_REPORT_4BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfScaleSupportedBytesToFollow = new Unsigned8();
        public final Unsigned8 scaleSupported1 = new Unsigned8();
        public final Unsigned8 scaleSupported2 = new Unsigned8();
        public final Unsigned8 scaleSupported3 = new Unsigned8();
        public final Unsigned8 scaleSupported4 = new Unsigned8();
    }

    /************************************************************/
	/* Move To Position Get command class structs */
    /************************************************************/
    public static class ZW_MOVE_TO_POSITION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Move To Position Report command class structs */
    /************************************************************/
    public static class ZW_MOVE_TO_POSITION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Move To Position Set command class structs */
    /************************************************************/
    public static class ZW_MOVE_TO_POSITION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Association Get V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Association Groupings Get V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_GROUPINGS_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Association Groupings Report V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_GROUPINGS_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedGroupings = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Association Remove V2 variant group structs */
    /************************************************************/
    public static class VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG extends Struct {
        public final Unsigned8 multiChannelNodeId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Association Remove 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Remove 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Remove 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG variantgroup3
                = new VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Remove 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 nodeId4 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG variantgroup3
                = new VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG variantgroup4
                = new VG_MULTI_CHANNEL_ASSOCIATION_REMOVE_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Report V2 variant group structs */
    /************************************************************/
    public static class VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG extends Struct {
        public final Unsigned8 multiChannelNodeId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Association Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG variantgroup3
                = new VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 nodeId4 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG variantgroup3
                = new VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG variantgroup4
                = new VG_MULTI_CHANNEL_ASSOCIATION_REPORT_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Set V2 variant group structs */
    /************************************************************/
    public static class VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG extends Struct {
        public final Unsigned8 multiChannelNodeId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Association Set 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_SET_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Set 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_SET_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Set 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_SET_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG variantgroup3
                = new VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Association Set 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_ASSOCIATION_SET_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 nodeId4 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG variantgroup3
                = new VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG();
        VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG variantgroup4
                = new VG_MULTI_CHANNEL_ASSOCIATION_SET_V2_VG();
    }

    /************************************************************/
	/* Multi Channel Capability Get V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_CAPABILITY_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Capability Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_CAPABILITY_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Capability Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_CAPABILITY_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Capability Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_CAPABILITY_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
        public final Unsigned8 commandClass3 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Capability Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_CAPABILITY_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
        public final Unsigned8 commandClass3 = new Unsigned8();
        public final Unsigned8 commandClass4 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel End Point Find V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_FIND_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel End Point Find Report V2 variant group structs */
    /************************************************************/
    public static class VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel End Point Find Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
    }

    /************************************************************/
	/* Multi Channel End Point Find Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
    }

    /************************************************************/
	/* Multi Channel End Point Find Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG variantgroup3
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
    }

    /************************************************************/
	/* Multi Channel End Point Find Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG variantgroup1
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG variantgroup2
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG variantgroup3
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG variantgroup4
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
    }

    /************************************************************/
	/* Multi Channel End Point Get V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel End Point Report V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Get V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 commandClass = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Report V2 command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 commandClass = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Capability Get V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_CAPABILITY_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Capability Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_CAPABILITY_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Capability Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_CAPABILITY_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Capability Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_CAPABILITY_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
        public final Unsigned8 commandClass3 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel Capability Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_CAPABILITY_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
        public final Unsigned8 commandClass3 = new Unsigned8();
        public final Unsigned8 commandClass4 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel End Point Find V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_FIND_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel End Point Find Report V3 variant group structs */
    /************************************************************/
    public static class VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel End Point Find Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG variantgroup1
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
    }

    /************************************************************/
	/* Multi Channel End Point Find Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG variantgroup1
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG variantgroup2
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
    }

    /************************************************************/
	/* Multi Channel End Point Find Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG variantgroup1
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG variantgroup2
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG variantgroup3
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
    }

    /************************************************************/
	/* Multi Channel End Point Find Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG variantgroup1
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG variantgroup2
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG variantgroup3
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
        VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG variantgroup4
                = new VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
    }

    /************************************************************/
	/* Multi Channel End Point Get V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Multi Channel End Point Report V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_CHANNEL_END_POINT_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Get V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 commandClass = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Report V3 command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 commandClass = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Association Get command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Association Groupings Get command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_GROUPINGS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Association Groupings Report command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_GROUPINGS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedGroupings = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Association Remove variant group structs */
    /************************************************************/
    public static class VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG extends Struct {
        public final Unsigned8 multiInstanceNodeId = new Unsigned8();
        public final Unsigned8 instance = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Association Remove 1byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG();
    }

    /************************************************************/
	/* Multi Instance Association Remove 2byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG variantgroup2
                = new VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG();
    }

    /************************************************************/
	/* Multi Instance Association Remove 3byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG variantgroup2
                = new VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG variantgroup3
                = new VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG();
    }

    /************************************************************/
	/* Multi Instance Association Remove 4byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 nodeId4 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG variantgroup2
                = new VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG variantgroup3
                = new VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG variantgroup4
                = new VG_MULTI_INSTANCE_ASSOCIATION_REMOVE_VG();
    }

    /************************************************************/
	/* Multi Instance Association Report variant group structs */
    /************************************************************/
    public static class VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG extends Struct {
        public final Unsigned8 multiInstanceNodeId = new Unsigned8();
        public final Unsigned8 instance = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Association Report 1byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG();
    }

    /************************************************************/
	/* Multi Instance Association Report 2byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG variantgroup2
                = new VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG();
    }

    /************************************************************/
	/* Multi Instance Association Report 3byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG variantgroup2
                = new VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG variantgroup3
                = new VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG();
    }

    /************************************************************/
	/* Multi Instance Association Report 4byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 maxNodesSupported = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 nodeId4 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG variantgroup2
                = new VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG variantgroup3
                = new VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG variantgroup4
                = new VG_MULTI_INSTANCE_ASSOCIATION_REPORT_VG();
    }

    /************************************************************/
	/* Multi Instance Association Set variant group structs */
    /************************************************************/
    public static class VG_MULTI_INSTANCE_ASSOCIATION_SET_VG extends Struct {
        public final Unsigned8 multiInstanceNodeId = new Unsigned8();
        public final Unsigned8 instance = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Association Set 1byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_SET_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_SET_VG();
    }

    /************************************************************/
	/* Multi Instance Association Set 2byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_SET_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_SET_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_SET_VG variantgroup2
                = new VG_MULTI_INSTANCE_ASSOCIATION_SET_VG();
    }

    /************************************************************/
	/* Multi Instance Association Set 3byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_SET_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_SET_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_SET_VG variantgroup2
                = new VG_MULTI_INSTANCE_ASSOCIATION_SET_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_SET_VG variantgroup3
                = new VG_MULTI_INSTANCE_ASSOCIATION_SET_VG();
    }

    /************************************************************/
	/* Multi Instance Association Set 4byte command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_ASSOCIATION_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 nodeId1 = new Unsigned8();
        public final Unsigned8 nodeId2 = new Unsigned8();
        public final Unsigned8 nodeId3 = new Unsigned8();
        public final Unsigned8 nodeId4 = new Unsigned8();
        public final Unsigned8 marker = new Unsigned8();
        VG_MULTI_INSTANCE_ASSOCIATION_SET_VG variantgroup1
                = new VG_MULTI_INSTANCE_ASSOCIATION_SET_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_SET_VG variantgroup2
                = new VG_MULTI_INSTANCE_ASSOCIATION_SET_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_SET_VG variantgroup3
                = new VG_MULTI_INSTANCE_ASSOCIATION_SET_VG();
        VG_MULTI_INSTANCE_ASSOCIATION_SET_VG variantgroup4
                = new VG_MULTI_INSTANCE_ASSOCIATION_SET_VG();
    }

    /************************************************************/
	/* Multi Instance Get command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 commandClass = new Unsigned8();
    }

    /************************************************************/
	/* Multi Instance Report command class structs */
    /************************************************************/
    public static class ZW_MULTI_INSTANCE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 commandClass = new Unsigned8();
        public final Unsigned8 instances = new Unsigned8();
    }

    /************************************************************/
	/* Node Info Cached Get command class structs */
    /************************************************************/
    public static class ZW_NODE_INFO_CACHED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Node Info Cached Report 1byte command class structs */
    /************************************************************/
    public static class ZW_NODE_INFO_CACHED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
    }

    /************************************************************/
	/* Node Info Cached Report 2byte command class structs */
    /************************************************************/
    public static class ZW_NODE_INFO_CACHED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass2 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass2 = new Unsigned8();
    }

    /************************************************************/
	/* Node Info Cached Report 3byte command class structs */
    /************************************************************/
    public static class ZW_NODE_INFO_CACHED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass2 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass3 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass3 = new Unsigned8();
    }

    /************************************************************/
	/* Node Info Cached Report 4byte command class structs */
    /************************************************************/
    public static class ZW_NODE_INFO_CACHED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass2 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass3 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass4 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass3 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass4 = new Unsigned8();
    }

    /************************************************************/
	/* Node List Get command class structs */
    /************************************************************/
    public static class ZW_NODE_LIST_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
    }

    /************************************************************/
	/* Node List Report 1byte command class structs */
    /************************************************************/
    public static class ZW_NODE_LIST_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 nodeListControllerId = new Unsigned8();
        public final Unsigned8 nodeListData1 = new Unsigned8();
    }

    /************************************************************/
	/* Node List Report 2byte command class structs */
    /************************************************************/
    public static class ZW_NODE_LIST_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 nodeListControllerId = new Unsigned8();
        public final Unsigned8 nodeListData1 = new Unsigned8();
        public final Unsigned8 nodeListData2 = new Unsigned8();
    }

    /************************************************************/
	/* Node List Report 3byte command class structs */
    /************************************************************/
    public static class ZW_NODE_LIST_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 nodeListControllerId = new Unsigned8();
        public final Unsigned8 nodeListData1 = new Unsigned8();
        public final Unsigned8 nodeListData2 = new Unsigned8();
        public final Unsigned8 nodeListData3 = new Unsigned8();
    }

    /************************************************************/
	/* Node List Report 4byte command class structs */
    /************************************************************/
    public static class ZW_NODE_LIST_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 nodeListControllerId = new Unsigned8();
        public final Unsigned8 nodeListData1 = new Unsigned8();
        public final Unsigned8 nodeListData2 = new Unsigned8();
        public final Unsigned8 nodeListData3 = new Unsigned8();
        public final Unsigned8 nodeListData4 = new Unsigned8();
    }

    /************************************************************/
	/* Learn Mode Set command class structs */
    /************************************************************/
    public static class ZW_LEARN_MODE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Learn Mode Set Status command class structs */
    /************************************************************/
    public static class ZW_LEARN_MODE_SET_STATUS_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 newNodeId = new Unsigned8();
    }

    /************************************************************/
	/* Node Information Send command class structs */
    /************************************************************/
    public static class ZW_NODE_INFORMATION_SEND_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 destinationNodeId = new Unsigned8();
        public final Unsigned8 txOptions = new Unsigned8();
    }

    /************************************************************/
	/* Network Update Request command class structs */
    /************************************************************/
    public static class ZW_NETWORK_UPDATE_REQUEST_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
    }

    /************************************************************/
	/* Network Update Request Status command class structs */
    /************************************************************/
    public static class ZW_NETWORK_UPDATE_REQUEST_STATUS_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Default Set command class structs */
    /************************************************************/
    public static class ZW_DEFAULT_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
    }

    /************************************************************/
	/* Default Set Complete command class structs */
    /************************************************************/
    public static class ZW_DEFAULT_SET_COMPLETE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Failed Node Remove command class structs */
    /************************************************************/
    public static class ZW_FAILED_NODE_REMOVE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Failed Node Remove Status command class structs */
    /************************************************************/
    public static class ZW_FAILED_NODE_REMOVE_STATUS_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Node Add command class structs */
    /************************************************************/
    public static class ZW_NODE_ADD_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 txOptions = new Unsigned8();
    }

    /************************************************************/
	/* Node Add Status 1byte command class structs */
    /************************************************************/
    public static class ZW_NODE_ADD_STATUS_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 newNodeId = new Unsigned8();
        public final Unsigned8 nodeInfoLength = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
    }

    /************************************************************/
	/* Node Add Status 2byte command class structs */
    /************************************************************/
    public static class ZW_NODE_ADD_STATUS_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 newNodeId = new Unsigned8();
        public final Unsigned8 nodeInfoLength = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
    }

    /************************************************************/
	/* Node Add Status 3byte command class structs */
    /************************************************************/
    public static class ZW_NODE_ADD_STATUS_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 newNodeId = new Unsigned8();
        public final Unsigned8 nodeInfoLength = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
        public final Unsigned8 commandClass3 = new Unsigned8();
    }

    /************************************************************/
	/* Node Add Status 4byte command class structs */
    /************************************************************/
    public static class ZW_NODE_ADD_STATUS_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 newNodeId = new Unsigned8();
        public final Unsigned8 nodeInfoLength = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
        public final Unsigned8 commandClass3 = new Unsigned8();
        public final Unsigned8 commandClass4 = new Unsigned8();
    }

    /************************************************************/
	/* Node Remove command class structs */
    /************************************************************/
    public static class ZW_NODE_REMOVE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Node Remove Status command class structs */
    /************************************************************/
    public static class ZW_NODE_REMOVE_STATUS_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 nodeid = new Unsigned8();
    }

    /************************************************************/
	/* Failed Node Replace command class structs */
    /************************************************************/
    public static class ZW_FAILED_NODE_REPLACE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 txOptions = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Failed Node Replace Status command class structs */
    /************************************************************/
    public static class ZW_FAILED_NODE_REPLACE_STATUS_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Node Neighbor Update Request command class structs */
    /************************************************************/
    public static class ZW_NODE_NEIGHBOR_UPDATE_REQUEST_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Node Neighbor Update Status command class structs */
    /************************************************************/
    public static class ZW_NODE_NEIGHBOR_UPDATE_STATUS_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Return Route Assign command class structs */
    /************************************************************/
    public static class ZW_RETURN_ROUTE_ASSIGN_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 sourceNodeId = new Unsigned8();
        public final Unsigned8 destinationNodeId = new Unsigned8();
    }

    /************************************************************/
	/* Return Route Assign Complete command class structs */
    /************************************************************/
    public static class ZW_RETURN_ROUTE_ASSIGN_COMPLETE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Return Route Delete command class structs */
    /************************************************************/
    public static class ZW_RETURN_ROUTE_DELETE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Return Route Delete Complete command class structs */
    /************************************************************/
    public static class ZW_RETURN_ROUTE_DELETE_COMPLETE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Node Naming Node Location Report command class structs */
    /************************************************************/
    public static class ZW_NODE_NAMING_NODE_LOCATION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 nodeLocationChar1 = new Unsigned8();
        public final Unsigned8 nodeLocationChar2 = new Unsigned8();
        public final Unsigned8 nodeLocationChar3 = new Unsigned8();
        public final Unsigned8 nodeLocationChar4 = new Unsigned8();
        public final Unsigned8 nodeLocationChar5 = new Unsigned8();
        public final Unsigned8 nodeLocationChar6 = new Unsigned8();
        public final Unsigned8 nodeLocationChar7 = new Unsigned8();
        public final Unsigned8 nodeLocationChar8 = new Unsigned8();
        public final Unsigned8 nodeLocationChar9 = new Unsigned8();
        public final Unsigned8 nodeLocationChar10 = new Unsigned8();
        public final Unsigned8 nodeLocationChar11 = new Unsigned8();
        public final Unsigned8 nodeLocationChar12 = new Unsigned8();
        public final Unsigned8 nodeLocationChar13 = new Unsigned8();
        public final Unsigned8 nodeLocationChar14 = new Unsigned8();
        public final Unsigned8 nodeLocationChar15 = new Unsigned8();
        public final Unsigned8 nodeLocationChar16 = new Unsigned8();
    }

    /************************************************************/
	/* Node Naming Node Location Set command class structs */
    /************************************************************/
    public static class ZW_NODE_NAMING_NODE_LOCATION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 nodeLocationChar1 = new Unsigned8();
        public final Unsigned8 nodeLocationChar2 = new Unsigned8();
        public final Unsigned8 nodeLocationChar3 = new Unsigned8();
        public final Unsigned8 nodeLocationChar4 = new Unsigned8();
        public final Unsigned8 nodeLocationChar5 = new Unsigned8();
        public final Unsigned8 nodeLocationChar6 = new Unsigned8();
        public final Unsigned8 nodeLocationChar7 = new Unsigned8();
        public final Unsigned8 nodeLocationChar8 = new Unsigned8();
        public final Unsigned8 nodeLocationChar9 = new Unsigned8();
        public final Unsigned8 nodeLocationChar10 = new Unsigned8();
        public final Unsigned8 nodeLocationChar11 = new Unsigned8();
        public final Unsigned8 nodeLocationChar12 = new Unsigned8();
        public final Unsigned8 nodeLocationChar13 = new Unsigned8();
        public final Unsigned8 nodeLocationChar14 = new Unsigned8();
        public final Unsigned8 nodeLocationChar15 = new Unsigned8();
        public final Unsigned8 nodeLocationChar16 = new Unsigned8();
    }

    /************************************************************/
	/* Node Naming Node Location Get command class structs */
    /************************************************************/
    public static class ZW_NODE_NAMING_NODE_LOCATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Node Naming Node Name Get command class structs */
    /************************************************************/
    public static class ZW_NODE_NAMING_NODE_NAME_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Node Naming Node Name Report command class structs */
    /************************************************************/
    public static class ZW_NODE_NAMING_NODE_NAME_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 nodeNameChar1 = new Unsigned8();
        public final Unsigned8 nodeNameChar2 = new Unsigned8();
        public final Unsigned8 nodeNameChar3 = new Unsigned8();
        public final Unsigned8 nodeNameChar4 = new Unsigned8();
        public final Unsigned8 nodeNameChar5 = new Unsigned8();
        public final Unsigned8 nodeNameChar6 = new Unsigned8();
        public final Unsigned8 nodeNameChar7 = new Unsigned8();
        public final Unsigned8 nodeNameChar8 = new Unsigned8();
        public final Unsigned8 nodeNameChar9 = new Unsigned8();
        public final Unsigned8 nodeNameChar10 = new Unsigned8();
        public final Unsigned8 nodeNameChar11 = new Unsigned8();
        public final Unsigned8 nodeNameChar12 = new Unsigned8();
        public final Unsigned8 nodeNameChar13 = new Unsigned8();
        public final Unsigned8 nodeNameChar14 = new Unsigned8();
        public final Unsigned8 nodeNameChar15 = new Unsigned8();
        public final Unsigned8 nodeNameChar16 = new Unsigned8();
    }

    /************************************************************/
	/* Node Naming Node Name Set command class structs */
    /************************************************************/
    public static class ZW_NODE_NAMING_NODE_NAME_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 nodeNameChar1 = new Unsigned8();
        public final Unsigned8 nodeNameChar2 = new Unsigned8();
        public final Unsigned8 nodeNameChar3 = new Unsigned8();
        public final Unsigned8 nodeNameChar4 = new Unsigned8();
        public final Unsigned8 nodeNameChar5 = new Unsigned8();
        public final Unsigned8 nodeNameChar6 = new Unsigned8();
        public final Unsigned8 nodeNameChar7 = new Unsigned8();
        public final Unsigned8 nodeNameChar8 = new Unsigned8();
        public final Unsigned8 nodeNameChar9 = new Unsigned8();
        public final Unsigned8 nodeNameChar10 = new Unsigned8();
        public final Unsigned8 nodeNameChar11 = new Unsigned8();
        public final Unsigned8 nodeNameChar12 = new Unsigned8();
        public final Unsigned8 nodeNameChar13 = new Unsigned8();
        public final Unsigned8 nodeNameChar14 = new Unsigned8();
        public final Unsigned8 nodeNameChar15 = new Unsigned8();
        public final Unsigned8 nodeNameChar16 = new Unsigned8();
    }

    /************************************************************/
	/* Powerlevel Get command class structs */
    /************************************************************/
    public static class ZW_POWERLEVEL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Powerlevel Report command class structs */
    /************************************************************/
    public static class ZW_POWERLEVEL_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 powerLevel = new Unsigned8();
        public final Unsigned8 timeout = new Unsigned8();
    }

    /************************************************************/
	/* Powerlevel Set command class structs */
    /************************************************************/
    public static class ZW_POWERLEVEL_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 powerLevel = new Unsigned8();
        public final Unsigned8 timeout = new Unsigned8();
    }

    /************************************************************/
	/* Powerlevel Test Node Get command class structs */
    /************************************************************/
    public static class ZW_POWERLEVEL_TEST_NODE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Powerlevel Test Node Report command class structs */
    /************************************************************/
    public static class ZW_POWERLEVEL_TEST_NODE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 testNodeid = new Unsigned8();
        public final Unsigned8 statusOfOperation = new Unsigned8();
        public final Unsigned8 testFrameCount1 = new Unsigned8();
        public final Unsigned8 testFrameCount2 = new Unsigned8();
    }

    /************************************************************/
	/* Powerlevel Test Node Set command class structs */
    /************************************************************/
    public static class ZW_POWERLEVEL_TEST_NODE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 testNodeid = new Unsigned8();
        public final Unsigned8 powerLevel = new Unsigned8();
        public final Unsigned8 testFrameCount1 = new Unsigned8();
        public final Unsigned8 testFrameCount2 = new Unsigned8();
    }

    /************************************************************/
	/* Cmd Encapsulation 1byte command class structs */
    /************************************************************/
    public static class ZW_CMD_ENCAPSULATION_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
    }

    /************************************************************/
	/* Cmd Encapsulation 2byte command class structs */
    /************************************************************/
    public static class ZW_CMD_ENCAPSULATION_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
    }

    /************************************************************/
	/* Cmd Encapsulation 3byte command class structs */
    /************************************************************/
    public static class ZW_CMD_ENCAPSULATION_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
    }

    /************************************************************/
	/* Cmd Encapsulation 4byte command class structs */
    /************************************************************/
    public static class ZW_CMD_ENCAPSULATION_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 data4 = new Unsigned8();
    }

    /************************************************************/
	/* Prepayment Balance Get command class structs */
    /************************************************************/
    public static class ZW_PREPAYMENT_BALANCE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Prepayment Balance Report command class structs */
    /************************************************************/
    public static class ZW_PREPAYMENT_BALANCE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 balanceValue1 = new Unsigned8();
        public final Unsigned8 balanceValue2 = new Unsigned8();
        public final Unsigned8 balanceValue3 = new Unsigned8();
        public final Unsigned8 balanceValue4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 debt1 = new Unsigned8();
        public final Unsigned8 debt2 = new Unsigned8();
        public final Unsigned8 debt3 = new Unsigned8();
        public final Unsigned8 debt4 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 emerCredit1 = new Unsigned8();
        public final Unsigned8 emerCredit2 = new Unsigned8();
        public final Unsigned8 emerCredit3 = new Unsigned8();
        public final Unsigned8 emerCredit4 = new Unsigned8();
        public final Unsigned8 currency1 = new Unsigned8();
        public final Unsigned8 currency2 = new Unsigned8();
        public final Unsigned8 currency3 = new Unsigned8();
        public final Unsigned8 debtRecoveryPercentage = new Unsigned8();
    }

    /************************************************************/
	/* Prepayment Supported Get command class structs */
    /************************************************************/
    public static class ZW_PREPAYMENT_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Prepayment Supported Report command class structs */
    /************************************************************/
    public static class ZW_PREPAYMENT_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Get 1byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_GET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Get 2byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_GET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Get 3byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_GET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Get 4byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_GET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 data4 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Report 1byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Report 2byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Report 3byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Report 4byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 data4 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Set 1byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Set 2byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Set 3byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
    }

    /************************************************************/
	/* Proprietary Set 4byte command class structs */
    /************************************************************/
    public static class ZW_PROPRIETARY_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 data1 = new Unsigned8();
        public final Unsigned8 data2 = new Unsigned8();
        public final Unsigned8 data3 = new Unsigned8();
        public final Unsigned8 data4 = new Unsigned8();
    }

    /************************************************************/
	/* Protection Get command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Protection Report command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 protectionState = new Unsigned8();
    }

    /************************************************************/
	/* Protection Set command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 protectionState = new Unsigned8();
    }

    /************************************************************/
	/* Protection Ec Get V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_EC_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Protection Ec Report V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_EC_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Protection Ec Set V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_EC_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Protection Get V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Protection Report V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
    }

    /************************************************************/
	/* Protection Set V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
    }

    /************************************************************/
	/* Protection Supported Get V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_SUPPORTED_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Protection Supported Report V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_SUPPORTED_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 localProtectionState1 = new Unsigned8();
        public final Unsigned8 localProtectionState2 = new Unsigned8();
        public final Unsigned8 rfProtectionState1 = new Unsigned8();
        public final Unsigned8 rfProtectionState2 = new Unsigned8();
    }

    /************************************************************/
	/* Protection Timeout Get V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_TIMEOUT_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Protection Timeout Report V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_TIMEOUT_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 timeout = new Unsigned8();
    }

    /************************************************************/
	/* Protection Timeout Set V2 command class structs */
    /************************************************************/
    public static class ZW_PROTECTION_TIMEOUT_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 timeout = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Remove 1byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_REMOVE_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId1 = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Remove 2byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_REMOVE_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId2 = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Remove 3byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_REMOVE_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId2 = new Unsigned8();
        public final Unsigned8 rateParameterSetId3 = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Remove 4byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_REMOVE_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId2 = new Unsigned8();
        public final Unsigned8 rateParameterSetId3 = new Unsigned8();
        public final Unsigned8 rateParameterSetId4 = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Set 1byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateCharacter1 = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 durationMinute1 = new Unsigned8();
        public final Unsigned8 durationMinute2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue1 = new Unsigned8();
        public final Unsigned8 minConsumptionValue2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue3 = new Unsigned8();
        public final Unsigned8 minConsumptionValue4 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue1 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue2 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue3 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxDemandValue1 = new Unsigned8();
        public final Unsigned8 maxDemandValue2 = new Unsigned8();
        public final Unsigned8 maxDemandValue3 = new Unsigned8();
        public final Unsigned8 maxDemandValue4 = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Set 2byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateCharacter1 = new Unsigned8();
        public final Unsigned8 rateCharacter2 = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 durationMinute1 = new Unsigned8();
        public final Unsigned8 durationMinute2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue1 = new Unsigned8();
        public final Unsigned8 minConsumptionValue2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue3 = new Unsigned8();
        public final Unsigned8 minConsumptionValue4 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue1 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue2 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue3 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxDemandValue1 = new Unsigned8();
        public final Unsigned8 maxDemandValue2 = new Unsigned8();
        public final Unsigned8 maxDemandValue3 = new Unsigned8();
        public final Unsigned8 maxDemandValue4 = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Set 3byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateCharacter1 = new Unsigned8();
        public final Unsigned8 rateCharacter2 = new Unsigned8();
        public final Unsigned8 rateCharacter3 = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 durationMinute1 = new Unsigned8();
        public final Unsigned8 durationMinute2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue1 = new Unsigned8();
        public final Unsigned8 minConsumptionValue2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue3 = new Unsigned8();
        public final Unsigned8 minConsumptionValue4 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue1 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue2 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue3 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxDemandValue1 = new Unsigned8();
        public final Unsigned8 maxDemandValue2 = new Unsigned8();
        public final Unsigned8 maxDemandValue3 = new Unsigned8();
        public final Unsigned8 maxDemandValue4 = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Set 4byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateCharacter1 = new Unsigned8();
        public final Unsigned8 rateCharacter2 = new Unsigned8();
        public final Unsigned8 rateCharacter3 = new Unsigned8();
        public final Unsigned8 rateCharacter4 = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 durationMinute1 = new Unsigned8();
        public final Unsigned8 durationMinute2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue1 = new Unsigned8();
        public final Unsigned8 minConsumptionValue2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue3 = new Unsigned8();
        public final Unsigned8 minConsumptionValue4 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue1 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue2 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue3 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxDemandValue1 = new Unsigned8();
        public final Unsigned8 maxDemandValue2 = new Unsigned8();
        public final Unsigned8 maxDemandValue3 = new Unsigned8();
        public final Unsigned8 maxDemandValue4 = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Active Rate Get command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_ACTIVE_RATE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Active Rate Report command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_ACTIVE_RATE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Current Data Get command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_CURRENT_DATA_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 datasetRequested1 = new Unsigned8();
        public final Unsigned8 datasetRequested2 = new Unsigned8();
        public final Unsigned8 datasetRequested3 = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Current Data Report variant group structs */
    /************************************************************/
    public static class VG_RATE_TBL_CURRENT_DATA_REPORT_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 currentValue1 = new Unsigned8();
        public final Unsigned8 currentValue2 = new Unsigned8();
        public final Unsigned8 currentValue3 = new Unsigned8();
        public final Unsigned8 currentValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Current Data Report 1byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_CURRENT_DATA_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_RATE_TBL_CURRENT_DATA_REPORT_VG variantgroup1
                = new VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Rate Tbl Current Data Report 2byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_CURRENT_DATA_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_RATE_TBL_CURRENT_DATA_REPORT_VG variantgroup1
                = new VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
        VG_RATE_TBL_CURRENT_DATA_REPORT_VG variantgroup2
                = new VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Rate Tbl Current Data Report 3byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_CURRENT_DATA_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_RATE_TBL_CURRENT_DATA_REPORT_VG variantgroup1
                = new VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
        VG_RATE_TBL_CURRENT_DATA_REPORT_VG variantgroup2
                = new VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
        VG_RATE_TBL_CURRENT_DATA_REPORT_VG variantgroup3
                = new VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Rate Tbl Current Data Report 4byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_CURRENT_DATA_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_RATE_TBL_CURRENT_DATA_REPORT_VG variantgroup1
                = new VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
        VG_RATE_TBL_CURRENT_DATA_REPORT_VG variantgroup2
                = new VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
        VG_RATE_TBL_CURRENT_DATA_REPORT_VG variantgroup3
                = new VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
        VG_RATE_TBL_CURRENT_DATA_REPORT_VG variantgroup4
                = new VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Rate Tbl Get command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Historical Data Get command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_HISTORICAL_DATA_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 maximumReports = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 datasetRequested1 = new Unsigned8();
        public final Unsigned8 datasetRequested2 = new Unsigned8();
        public final Unsigned8 datasetRequested3 = new Unsigned8();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 startSecondLocalTime = new Unsigned8();
        public final Unsigned8 stopYear1 = new Unsigned8();
        public final Unsigned8 stopYear2 = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHourLocalTime = new Unsigned8();
        public final Unsigned8 stopMinuteLocalTime = new Unsigned8();
        public final Unsigned8 stopSecondLocalTime = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Historical Data Report variant group structs */
    /************************************************************/
    public static class VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 historicalValue1 = new Unsigned8();
        public final Unsigned8 historicalValue2 = new Unsigned8();
        public final Unsigned8 historicalValue3 = new Unsigned8();
        public final Unsigned8 historicalValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Historical Data Report 1byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_HISTORICAL_DATA_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG variantgroup1
                = new VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Rate Tbl Historical Data Report 2byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_HISTORICAL_DATA_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG variantgroup1
                = new VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG variantgroup2
                = new VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Rate Tbl Historical Data Report 3byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_HISTORICAL_DATA_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG variantgroup1
                = new VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG variantgroup2
                = new VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG variantgroup3
                = new VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Rate Tbl Historical Data Report 4byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_HISTORICAL_DATA_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 dataset1 = new Unsigned8();
        public final Unsigned8 dataset2 = new Unsigned8();
        public final Unsigned8 dataset3 = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG variantgroup1
                = new VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG variantgroup2
                = new VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG variantgroup3
                = new VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
        VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG variantgroup4
                = new VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
    }

    /************************************************************/
	/* Rate Tbl Report 1byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateCharacter1 = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 durationMinute1 = new Unsigned8();
        public final Unsigned8 durationMinute2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue1 = new Unsigned8();
        public final Unsigned8 minConsumptionValue2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue3 = new Unsigned8();
        public final Unsigned8 minConsumptionValue4 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue1 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue2 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue3 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxDemandValue1 = new Unsigned8();
        public final Unsigned8 maxDemandValue2 = new Unsigned8();
        public final Unsigned8 maxDemandValue3 = new Unsigned8();
        public final Unsigned8 maxDemandValue4 = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Report 2byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateCharacter1 = new Unsigned8();
        public final Unsigned8 rateCharacter2 = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 durationMinute1 = new Unsigned8();
        public final Unsigned8 durationMinute2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue1 = new Unsigned8();
        public final Unsigned8 minConsumptionValue2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue3 = new Unsigned8();
        public final Unsigned8 minConsumptionValue4 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue1 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue2 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue3 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxDemandValue1 = new Unsigned8();
        public final Unsigned8 maxDemandValue2 = new Unsigned8();
        public final Unsigned8 maxDemandValue3 = new Unsigned8();
        public final Unsigned8 maxDemandValue4 = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Report 3byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateCharacter1 = new Unsigned8();
        public final Unsigned8 rateCharacter2 = new Unsigned8();
        public final Unsigned8 rateCharacter3 = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 durationMinute1 = new Unsigned8();
        public final Unsigned8 durationMinute2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue1 = new Unsigned8();
        public final Unsigned8 minConsumptionValue2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue3 = new Unsigned8();
        public final Unsigned8 minConsumptionValue4 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue1 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue2 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue3 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxDemandValue1 = new Unsigned8();
        public final Unsigned8 maxDemandValue2 = new Unsigned8();
        public final Unsigned8 maxDemandValue3 = new Unsigned8();
        public final Unsigned8 maxDemandValue4 = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Report 4byte command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateCharacter1 = new Unsigned8();
        public final Unsigned8 rateCharacter2 = new Unsigned8();
        public final Unsigned8 rateCharacter3 = new Unsigned8();
        public final Unsigned8 rateCharacter4 = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 durationMinute1 = new Unsigned8();
        public final Unsigned8 durationMinute2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue1 = new Unsigned8();
        public final Unsigned8 minConsumptionValue2 = new Unsigned8();
        public final Unsigned8 minConsumptionValue3 = new Unsigned8();
        public final Unsigned8 minConsumptionValue4 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue1 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue2 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue3 = new Unsigned8();
        public final Unsigned8 maxConsumptionValue4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxDemandValue1 = new Unsigned8();
        public final Unsigned8 maxDemandValue2 = new Unsigned8();
        public final Unsigned8 maxDemandValue3 = new Unsigned8();
        public final Unsigned8 maxDemandValue4 = new Unsigned8();
        public final Unsigned8 dcpRateId = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Supported Get command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Rate Tbl Supported Report command class structs */
    /************************************************************/
    public static class ZW_RATE_TBL_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 ratesSupported = new Unsigned8();
        public final Unsigned8 parameterSetSupportedBitMask1 = new Unsigned8();
        public final Unsigned8 parameterSetSupportedBitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Remote Association Activate command class structs */
    /************************************************************/
    public static class ZW_REMOTE_ASSOCIATION_ACTIVATE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* Remote Association Configuration Get command class structs */
    /************************************************************/
    public static class ZW_REMOTE_ASSOCIATION_CONFIGURATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 localGroupingIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* Remote Association Configuration Report command class structs */
    /************************************************************/
    public static class ZW_REMOTE_ASSOCIATION_CONFIGURATION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 localGroupingIdentifier = new Unsigned8();
        public final Unsigned8 remoteNodeid = new Unsigned8();
        public final Unsigned8 remoteGroupingIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* Remote Association Configuration Set command class structs */
    /************************************************************/
    public static class ZW_REMOTE_ASSOCIATION_CONFIGURATION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 localGroupingIdentifier = new Unsigned8();
        public final Unsigned8 remoteNodeid = new Unsigned8();
        public final Unsigned8 remoteGroupingIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* Scene Activation Set command class structs */
    /************************************************************/
    public static class ZW_SCENE_ACTIVATION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
        public final Unsigned8 dimmingDuration = new Unsigned8();
    }

    /************************************************************/
	/* Scene Actuator Conf Get command class structs */
    /************************************************************/
    public static class ZW_SCENE_ACTUATOR_CONF_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
    }

    /************************************************************/
	/* Scene Actuator Conf Report command class structs */
    /************************************************************/
    public static class ZW_SCENE_ACTUATOR_CONF_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 dimmingDuration = new Unsigned8();
    }

    /************************************************************/
	/* Scene Actuator Conf Set command class structs */
    /************************************************************/
    public static class ZW_SCENE_ACTUATOR_CONF_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
        public final Unsigned8 dimmingDuration = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Scene Controller Conf Get command class structs */
    /************************************************************/
    public static class ZW_SCENE_CONTROLLER_CONF_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupId = new Unsigned8();
    }

    /************************************************************/
	/* Scene Controller Conf Report command class structs */
    /************************************************************/
    public static class ZW_SCENE_CONTROLLER_CONF_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupId = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
        public final Unsigned8 dimmingDuration = new Unsigned8();
    }

    /************************************************************/
	/* Scene Controller Conf Set command class structs */
    /************************************************************/
    public static class ZW_SCENE_CONTROLLER_CONF_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupId = new Unsigned8();
        public final Unsigned8 sceneId = new Unsigned8();
        public final Unsigned8 dimmingDuration = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Enable All Set command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 enabled = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Enable Set command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_ENABLE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 enabled = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Week Day Get command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Week Day Report command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 dayOfWeek = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Week Day Set command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setAction = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 dayOfWeek = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Year Day Get command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Year Day Report command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopYear = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Year Day Set command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setAction = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopYear = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Type Supported Get command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Type Supported Report command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfSlotsWeekDay = new Unsigned8();
        public final Unsigned8 numberOfSlotsYearDay = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Enable All Set V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 enabled = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Enable Set V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_ENABLE_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 enabled = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Time Offset Get V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Time Offset Report V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 minuteTzo = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Time Offset Set V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 minuteTzo = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Week Day Get V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Week Day Report V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 dayOfWeek = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Week Day Set V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setAction = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 dayOfWeek = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Year Day Get V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Year Day Report V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopYear = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Year Day Set V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setAction = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopYear = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Type Supported Get V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Type Supported Report V2 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfSlotsWeekDay = new Unsigned8();
        public final Unsigned8 numberOfSlotsYearDay = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Enable All Set V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 enabled = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Enable Set V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_ENABLE_SET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 enabled = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Time Offset Get V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Time Offset Report V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 minuteTzo = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Time Offset Set V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 minuteTzo = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Week Day Get V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Week Day Report V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 dayOfWeek = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Week Day Set V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setAction = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 dayOfWeek = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Year Day Get V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Year Day Report V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopYear = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Year Day Set V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setAction = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 stopYear = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHour = new Unsigned8();
        public final Unsigned8 stopMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Type Supported Get V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Type Supported Report V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfSlotsWeekDay = new Unsigned8();
        public final Unsigned8 numberOfSlotsYearDay = new Unsigned8();
        public final Unsigned8 numberOfSlotsDailyRepeating = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Daily Repeating Get V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Daily Repeating Report V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 weekDayBitmask = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 durationHour = new Unsigned8();
        public final Unsigned8 durationMinute = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Entry Lock Daily Repeating Set V3 command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_SET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setAction = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 scheduleSlotId = new Unsigned8();
        public final Unsigned8 weekDayBitmask = new Unsigned8();
        public final Unsigned8 startHour = new Unsigned8();
        public final Unsigned8 startMinute = new Unsigned8();
        public final Unsigned8 durationHour = new Unsigned8();
        public final Unsigned8 durationMinute = new Unsigned8();
    }

    /************************************************************/
	/* Screen Attributes Get command class structs */
    /************************************************************/
    public static class ZW_SCREEN_ATTRIBUTES_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Screen Attributes Report command class structs */
    /************************************************************/
    public static class ZW_SCREEN_ATTRIBUTES_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 numberOfCharactersPerLine = new Unsigned8();
        public final Unsigned8 sizeOfLineBuffer = new Unsigned8();
        public final Unsigned8 numericalPresentationOfACharacter = new Unsigned8();
    }

    /************************************************************/
	/* Screen Attributes Get V2 command class structs */
    /************************************************************/
    public static class ZW_SCREEN_ATTRIBUTES_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Screen Attributes Report V2 command class structs */
    /************************************************************/
    public static class ZW_SCREEN_ATTRIBUTES_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 numberOfCharactersPerLine = new Unsigned8();
        public final Unsigned8 sizeOfLineBuffer = new Unsigned8();
        public final Unsigned8 numericalPresentationOfACharacter = new Unsigned8();
        public final Unsigned8 screenTimeout = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Get command class structs */
    /************************************************************/
    public static class ZW_SCREEN_MD_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfReports = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report variant group structs */
    /************************************************************/
    public static class VG_SCREEN_MD_REPORT_1BYTE_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 characterPosition = new Unsigned8();
        public final Unsigned8 numberOfCharacters = new Unsigned8();
        public final Unsigned8 character1 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report variant group structs */
    /************************************************************/
    public static class VG_SCREEN_MD_REPORT_2BYTE_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 characterPosition = new Unsigned8();
        public final Unsigned8 numberOfCharacters = new Unsigned8();
        public final Unsigned8 character1 = new Unsigned8();
        public final Unsigned8 character2 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report variant group structs */
    /************************************************************/
    public static class VG_SCREEN_MD_REPORT_3BYTE_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 characterPosition = new Unsigned8();
        public final Unsigned8 numberOfCharacters = new Unsigned8();
        public final Unsigned8 character1 = new Unsigned8();
        public final Unsigned8 character2 = new Unsigned8();
        public final Unsigned8 character3 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report variant group structs */
    /************************************************************/
    public static class VG_SCREEN_MD_REPORT_4BYTE_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 characterPosition = new Unsigned8();
        public final Unsigned8 numberOfCharacters = new Unsigned8();
        public final Unsigned8 character1 = new Unsigned8();
        public final Unsigned8 character2 = new Unsigned8();
        public final Unsigned8 character3 = new Unsigned8();
        public final Unsigned8 character4 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report 1byte command class structs */
    /************************************************************/
    public static class ZW_SCREEN_MD_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SCREEN_MD_REPORT_4BYTE_VG variantgroup1 = new VG_SCREEN_MD_REPORT_4BYTE_VG();
    }

    /************************************************************/
	/* Screen Md Report 2byte command class structs */
    /************************************************************/
    public static class ZW_SCREEN_MD_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SCREEN_MD_REPORT_4BYTE_VG variantgroup1 = new VG_SCREEN_MD_REPORT_4BYTE_VG();
        VG_SCREEN_MD_REPORT_4BYTE_VG variantgroup2 = new VG_SCREEN_MD_REPORT_4BYTE_VG();
    }

    /************************************************************/
	/* Screen Md Report 3byte command class structs */
    /************************************************************/
    public static class ZW_SCREEN_MD_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SCREEN_MD_REPORT_4BYTE_VG variantgroup1 = new VG_SCREEN_MD_REPORT_4BYTE_VG();
        VG_SCREEN_MD_REPORT_4BYTE_VG variantgroup2 = new VG_SCREEN_MD_REPORT_4BYTE_VG();
        VG_SCREEN_MD_REPORT_4BYTE_VG variantgroup3 = new VG_SCREEN_MD_REPORT_4BYTE_VG();
    }

    /************************************************************/
	/* Screen Md Report 4byte command class structs */
    /************************************************************/
    public static class ZW_SCREEN_MD_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SCREEN_MD_REPORT_4BYTE_VG variantgroup1 = new VG_SCREEN_MD_REPORT_4BYTE_VG();
        VG_SCREEN_MD_REPORT_4BYTE_VG variantgroup2 = new VG_SCREEN_MD_REPORT_4BYTE_VG();
        VG_SCREEN_MD_REPORT_4BYTE_VG variantgroup3 = new VG_SCREEN_MD_REPORT_4BYTE_VG();
        VG_SCREEN_MD_REPORT_4BYTE_VG variantgroup4 = new VG_SCREEN_MD_REPORT_4BYTE_VG();
    }

    /************************************************************/
	/* Screen Md Get V2 command class structs */
    /************************************************************/
    public static class ZW_SCREEN_MD_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfReports = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report V2 variant group structs */
    /************************************************************/
    public static class VG_SCREEN_MD_REPORT_1BYTE_V2_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 characterPosition = new Unsigned8();
        public final Unsigned8 numberOfCharacters = new Unsigned8();
        public final Unsigned8 character1 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report V2 variant group structs */
    /************************************************************/
    public static class VG_SCREEN_MD_REPORT_2BYTE_V2_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 characterPosition = new Unsigned8();
        public final Unsigned8 numberOfCharacters = new Unsigned8();
        public final Unsigned8 character1 = new Unsigned8();
        public final Unsigned8 character2 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report V2 variant group structs */
    /************************************************************/
    public static class VG_SCREEN_MD_REPORT_3BYTE_V2_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 characterPosition = new Unsigned8();
        public final Unsigned8 numberOfCharacters = new Unsigned8();
        public final Unsigned8 character1 = new Unsigned8();
        public final Unsigned8 character2 = new Unsigned8();
        public final Unsigned8 character3 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report V2 variant group structs */
    /************************************************************/
    public static class VG_SCREEN_MD_REPORT_4BYTE_V2_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 characterPosition = new Unsigned8();
        public final Unsigned8 numberOfCharacters = new Unsigned8();
        public final Unsigned8 character1 = new Unsigned8();
        public final Unsigned8 character2 = new Unsigned8();
        public final Unsigned8 character3 = new Unsigned8();
        public final Unsigned8 character4 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_SCREEN_MD_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SCREEN_MD_REPORT_4BYTE_V2_VG variantgroup1 = new VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_SCREEN_MD_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SCREEN_MD_REPORT_4BYTE_V2_VG variantgroup1 = new VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
        VG_SCREEN_MD_REPORT_4BYTE_V2_VG variantgroup2 = new VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_SCREEN_MD_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SCREEN_MD_REPORT_4BYTE_V2_VG variantgroup1 = new VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
        VG_SCREEN_MD_REPORT_4BYTE_V2_VG variantgroup2 = new VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
        VG_SCREEN_MD_REPORT_4BYTE_V2_VG variantgroup3 = new VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Screen Md Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_SCREEN_MD_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SCREEN_MD_REPORT_4BYTE_V2_VG variantgroup1 = new VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
        VG_SCREEN_MD_REPORT_4BYTE_V2_VG variantgroup2 = new VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
        VG_SCREEN_MD_REPORT_4BYTE_V2_VG variantgroup3 = new VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
        VG_SCREEN_MD_REPORT_4BYTE_V2_VG variantgroup4 = new VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Mode Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_MODE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Mode Report command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_MODE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Mode Set command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_MODE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Mode Supported Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_MODE_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Mode Supported Report command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_MODE_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedModeBitMask1 = new Unsigned8();
        public final Unsigned8 supportedModeBitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone Sensor Installed Report command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_SENSOR_INSTALLED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zoneNumber = new Unsigned8();
        public final Unsigned8 numberOfSensors = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone Sensor Type Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_SENSOR_TYPE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zoneNumber = new Unsigned8();
        public final Unsigned8 sensorNumber = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone Sensor Type Report command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_SENSOR_TYPE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zoneNumber = new Unsigned8();
        public final Unsigned8 sensorNumber = new Unsigned8();
        public final Unsigned8 zwaveAlarmType = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone Sensor Installed Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_SENSOR_INSTALLED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zoneNumber = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone Sensor State Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_SENSOR_STATE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zoneNumber = new Unsigned8();
        public final Unsigned8 sensorNumber = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone Sensor State Report command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_SENSOR_STATE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zoneNumber = new Unsigned8();
        public final Unsigned8 sensorNumber = new Unsigned8();
        public final Unsigned8 zwaveAlarmType = new Unsigned8();
        public final Unsigned8 zwaveAlarmEvent = new Unsigned8();
        public final Unsigned8 eventParameters = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone Number Supported Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_NUMBER_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone State Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_STATE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zoneNumber = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone State Report command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_STATE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zoneNumber = new Unsigned8();
        public final Unsigned8 zoneState = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone Supported Report command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 parameters1 = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone Type Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_TYPE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zoneNumber = new Unsigned8();
    }

    /************************************************************/
	/* Security Panel Zone Type Report command class structs */
    /************************************************************/
    public static class ZW_SECURITY_PANEL_ZONE_TYPE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zoneNumber = new Unsigned8();
        public final Unsigned8 zoneType = new Unsigned8();
    }

    /************************************************************/
	/* Network Key Set 1byte command class structs */
    /************************************************************/
    public static class ZW_NETWORK_KEY_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 networkKeyByte1 = new Unsigned8();
    }

    /************************************************************/
	/* Network Key Set 2byte command class structs */
    /************************************************************/
    public static class ZW_NETWORK_KEY_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 networkKeyByte1 = new Unsigned8();
        public final Unsigned8 networkKeyByte2 = new Unsigned8();
    }

    /************************************************************/
	/* Network Key Set 3byte command class structs */
    /************************************************************/
    public static class ZW_NETWORK_KEY_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 networkKeyByte1 = new Unsigned8();
        public final Unsigned8 networkKeyByte2 = new Unsigned8();
        public final Unsigned8 networkKeyByte3 = new Unsigned8();
    }

    /************************************************************/
	/* Network Key Set 4byte command class structs */
    /************************************************************/
    public static class ZW_NETWORK_KEY_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 networkKeyByte1 = new Unsigned8();
        public final Unsigned8 networkKeyByte2 = new Unsigned8();
        public final Unsigned8 networkKeyByte3 = new Unsigned8();
        public final Unsigned8 networkKeyByte4 = new Unsigned8();
    }

    /************************************************************/
	/* Network Key Verify command class structs */
    /************************************************************/
    public static class ZW_NETWORK_KEY_VERIFY_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Security Commands Supported Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_COMMANDS_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Security Commands Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 commandClassSupport1 = new Unsigned8();
        public final Unsigned8 commandClassMark = new Unsigned8();
        public final Unsigned8 commandClassControl1 = new Unsigned8();
    }

    /************************************************************/
	/* Security Commands Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 commandClassSupport1 = new Unsigned8();
        public final Unsigned8 commandClassSupport2 = new Unsigned8();
        public final Unsigned8 commandClassMark = new Unsigned8();
        public final Unsigned8 commandClassControl1 = new Unsigned8();
        public final Unsigned8 commandClassControl2 = new Unsigned8();
    }

    /************************************************************/
	/* Security Commands Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 commandClassSupport1 = new Unsigned8();
        public final Unsigned8 commandClassSupport2 = new Unsigned8();
        public final Unsigned8 commandClassSupport3 = new Unsigned8();
        public final Unsigned8 commandClassMark = new Unsigned8();
        public final Unsigned8 commandClassControl1 = new Unsigned8();
        public final Unsigned8 commandClassControl2 = new Unsigned8();
        public final Unsigned8 commandClassControl3 = new Unsigned8();
    }

    /************************************************************/
	/* Security Commands Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 commandClassSupport1 = new Unsigned8();
        public final Unsigned8 commandClassSupport2 = new Unsigned8();
        public final Unsigned8 commandClassSupport3 = new Unsigned8();
        public final Unsigned8 commandClassSupport4 = new Unsigned8();
        public final Unsigned8 commandClassMark = new Unsigned8();
        public final Unsigned8 commandClassControl1 = new Unsigned8();
        public final Unsigned8 commandClassControl2 = new Unsigned8();
        public final Unsigned8 commandClassControl3 = new Unsigned8();
        public final Unsigned8 commandClassControl4 = new Unsigned8();
    }

    /************************************************************/
	/* Security Message Encapsulation 1byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_MESSAGE_ENCAPSULATION_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 initializationVectorByte1 = new Unsigned8();
        public final Unsigned8 initializationVectorByte2 = new Unsigned8();
        public final Unsigned8 initializationVectorByte3 = new Unsigned8();
        public final Unsigned8 initializationVectorByte4 = new Unsigned8();
        public final Unsigned8 initializationVectorByte5 = new Unsigned8();
        public final Unsigned8 initializationVectorByte6 = new Unsigned8();
        public final Unsigned8 initializationVectorByte7 = new Unsigned8();
        public final Unsigned8 initializationVectorByte8 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 receiversNonceIdentifier = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte1 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte2 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte3 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte4 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte5 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte6 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte7 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte8 = new Unsigned8();
    }

    /************************************************************/
	/* Security Message Encapsulation 2byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_MESSAGE_ENCAPSULATION_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 initializationVectorByte1 = new Unsigned8();
        public final Unsigned8 initializationVectorByte2 = new Unsigned8();
        public final Unsigned8 initializationVectorByte3 = new Unsigned8();
        public final Unsigned8 initializationVectorByte4 = new Unsigned8();
        public final Unsigned8 initializationVectorByte5 = new Unsigned8();
        public final Unsigned8 initializationVectorByte6 = new Unsigned8();
        public final Unsigned8 initializationVectorByte7 = new Unsigned8();
        public final Unsigned8 initializationVectorByte8 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
        public final Unsigned8 receiversNonceIdentifier = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte1 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte2 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte3 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte4 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte5 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte6 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte7 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte8 = new Unsigned8();
    }

    /************************************************************/
	/* Security Message Encapsulation 3byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_MESSAGE_ENCAPSULATION_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 initializationVectorByte1 = new Unsigned8();
        public final Unsigned8 initializationVectorByte2 = new Unsigned8();
        public final Unsigned8 initializationVectorByte3 = new Unsigned8();
        public final Unsigned8 initializationVectorByte4 = new Unsigned8();
        public final Unsigned8 initializationVectorByte5 = new Unsigned8();
        public final Unsigned8 initializationVectorByte6 = new Unsigned8();
        public final Unsigned8 initializationVectorByte7 = new Unsigned8();
        public final Unsigned8 initializationVectorByte8 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
        public final Unsigned8 commandByte3 = new Unsigned8();
        public final Unsigned8 receiversNonceIdentifier = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte1 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte2 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte3 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte4 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte5 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte6 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte7 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte8 = new Unsigned8();
    }

    /************************************************************/
	/* Security Message Encapsulation 4byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_MESSAGE_ENCAPSULATION_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 initializationVectorByte1 = new Unsigned8();
        public final Unsigned8 initializationVectorByte2 = new Unsigned8();
        public final Unsigned8 initializationVectorByte3 = new Unsigned8();
        public final Unsigned8 initializationVectorByte4 = new Unsigned8();
        public final Unsigned8 initializationVectorByte5 = new Unsigned8();
        public final Unsigned8 initializationVectorByte6 = new Unsigned8();
        public final Unsigned8 initializationVectorByte7 = new Unsigned8();
        public final Unsigned8 initializationVectorByte8 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
        public final Unsigned8 commandByte3 = new Unsigned8();
        public final Unsigned8 commandByte4 = new Unsigned8();
        public final Unsigned8 receiversNonceIdentifier = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte1 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte2 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte3 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte4 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte5 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte6 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte7 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte8 = new Unsigned8();
    }

    /************************************************************/
	/* Security Message Encapsulation Nonce Get 1byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 initializationVectorByte1 = new Unsigned8();
        public final Unsigned8 initializationVectorByte2 = new Unsigned8();
        public final Unsigned8 initializationVectorByte3 = new Unsigned8();
        public final Unsigned8 initializationVectorByte4 = new Unsigned8();
        public final Unsigned8 initializationVectorByte5 = new Unsigned8();
        public final Unsigned8 initializationVectorByte6 = new Unsigned8();
        public final Unsigned8 initializationVectorByte7 = new Unsigned8();
        public final Unsigned8 initializationVectorByte8 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 receiversNonceIdentifier = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte1 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte2 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte3 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte4 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte5 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte6 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte7 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte8 = new Unsigned8();
    }

    /************************************************************/
	/* Security Message Encapsulation Nonce Get 2byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 initializationVectorByte1 = new Unsigned8();
        public final Unsigned8 initializationVectorByte2 = new Unsigned8();
        public final Unsigned8 initializationVectorByte3 = new Unsigned8();
        public final Unsigned8 initializationVectorByte4 = new Unsigned8();
        public final Unsigned8 initializationVectorByte5 = new Unsigned8();
        public final Unsigned8 initializationVectorByte6 = new Unsigned8();
        public final Unsigned8 initializationVectorByte7 = new Unsigned8();
        public final Unsigned8 initializationVectorByte8 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
        public final Unsigned8 receiversNonceIdentifier = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte1 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte2 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte3 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte4 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte5 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte6 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte7 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte8 = new Unsigned8();
    }

    /************************************************************/
	/* Security Message Encapsulation Nonce Get 3byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 initializationVectorByte1 = new Unsigned8();
        public final Unsigned8 initializationVectorByte2 = new Unsigned8();
        public final Unsigned8 initializationVectorByte3 = new Unsigned8();
        public final Unsigned8 initializationVectorByte4 = new Unsigned8();
        public final Unsigned8 initializationVectorByte5 = new Unsigned8();
        public final Unsigned8 initializationVectorByte6 = new Unsigned8();
        public final Unsigned8 initializationVectorByte7 = new Unsigned8();
        public final Unsigned8 initializationVectorByte8 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
        public final Unsigned8 commandByte3 = new Unsigned8();
        public final Unsigned8 receiversNonceIdentifier = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte1 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte2 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte3 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte4 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte5 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte6 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte7 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte8 = new Unsigned8();
    }

    /************************************************************/
	/* Security Message Encapsulation Nonce Get 4byte command class structs */
    /************************************************************/
    public static class ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 initializationVectorByte1 = new Unsigned8();
        public final Unsigned8 initializationVectorByte2 = new Unsigned8();
        public final Unsigned8 initializationVectorByte3 = new Unsigned8();
        public final Unsigned8 initializationVectorByte4 = new Unsigned8();
        public final Unsigned8 initializationVectorByte5 = new Unsigned8();
        public final Unsigned8 initializationVectorByte6 = new Unsigned8();
        public final Unsigned8 initializationVectorByte7 = new Unsigned8();
        public final Unsigned8 initializationVectorByte8 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 commandClassIdentifier = new Unsigned8();
        public final Unsigned8 commandIdentifier = new Unsigned8();
        public final Unsigned8 commandByte1 = new Unsigned8();
        public final Unsigned8 commandByte2 = new Unsigned8();
        public final Unsigned8 commandByte3 = new Unsigned8();
        public final Unsigned8 commandByte4 = new Unsigned8();
        public final Unsigned8 receiversNonceIdentifier = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte1 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte2 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte3 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte4 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte5 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte6 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte7 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte8 = new Unsigned8();
    }

    /************************************************************/
	/* Security Nonce Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_NONCE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Security Nonce Report command class structs */
    /************************************************************/
    public static class ZW_SECURITY_NONCE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nonceByte1 = new Unsigned8();
        public final Unsigned8 nonceByte2 = new Unsigned8();
        public final Unsigned8 nonceByte3 = new Unsigned8();
        public final Unsigned8 nonceByte4 = new Unsigned8();
        public final Unsigned8 nonceByte5 = new Unsigned8();
        public final Unsigned8 nonceByte6 = new Unsigned8();
        public final Unsigned8 nonceByte7 = new Unsigned8();
        public final Unsigned8 nonceByte8 = new Unsigned8();
    }

    /************************************************************/
	/* Security Scheme Get command class structs */
    /************************************************************/
    public static class ZW_SECURITY_SCHEME_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedSecuritySchemes = new Unsigned8();
    }

    /************************************************************/
	/* Security Scheme Inherit command class structs */
    /************************************************************/
    public static class ZW_SECURITY_SCHEME_INHERIT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedSecuritySchemes = new Unsigned8();
    }

    /************************************************************/
	/* Security Scheme Report command class structs */
    /************************************************************/
    public static class ZW_SECURITY_SCHEME_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedSecuritySchemes = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Get command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Report command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sourceNodeId = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 sensorState = new Unsigned8();
        public final Unsigned8 seconds1 = new Unsigned8();
        public final Unsigned8 seconds2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Supported Get command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfBitMasks = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfBitMasks = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfBitMasks = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfBitMasks = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Binary Get command class structs */
    /************************************************************/
    public static class ZW_SENSOR_BINARY_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Binary Report command class structs */
    /************************************************************/
    public static class ZW_SENSOR_BINARY_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorValue = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Binary Get V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_BINARY_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Binary Report V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_BINARY_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorValue = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Binary Supported Get Sensor V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_BINARY_SUPPORTED_GET_SENSOR_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Binary Supported Sensor Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Binary Supported Sensor Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Binary Supported Sensor Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Binary Supported Sensor Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Trigger Level Get command class structs */
    /************************************************************/
    public static class ZW_SENSOR_TRIGGER_LEVEL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Trigger Level Report 1byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_TRIGGER_LEVEL_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 triggerValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Trigger Level Report 2byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_TRIGGER_LEVEL_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 triggerValue1 = new Unsigned8();
        public final Unsigned8 triggerValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Trigger Level Report 3byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_TRIGGER_LEVEL_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 triggerValue1 = new Unsigned8();
        public final Unsigned8 triggerValue2 = new Unsigned8();
        public final Unsigned8 triggerValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Trigger Level Report 4byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_TRIGGER_LEVEL_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 triggerValue1 = new Unsigned8();
        public final Unsigned8 triggerValue2 = new Unsigned8();
        public final Unsigned8 triggerValue3 = new Unsigned8();
        public final Unsigned8 triggerValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Trigger Level Set 1byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_TRIGGER_LEVEL_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 triggerValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Trigger Level Set 2byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_TRIGGER_LEVEL_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 triggerValue1 = new Unsigned8();
        public final Unsigned8 triggerValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Trigger Level Set 3byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_TRIGGER_LEVEL_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 triggerValue1 = new Unsigned8();
        public final Unsigned8 triggerValue2 = new Unsigned8();
        public final Unsigned8 triggerValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Trigger Level Set 4byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_TRIGGER_LEVEL_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 triggerValue1 = new Unsigned8();
        public final Unsigned8 triggerValue2 = new Unsigned8();
        public final Unsigned8 triggerValue3 = new Unsigned8();
        public final Unsigned8 triggerValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Get command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 1byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 2byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 3byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 4byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
        public final Unsigned8 sensorValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Get V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
        public final Unsigned8 sensorValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Get V3 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
        public final Unsigned8 sensorValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Get V4 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_GET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 1byte V4 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 2byte V4 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 3byte V4 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 4byte V4 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
        public final Unsigned8 sensorValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Get V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_GET_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 1byte V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 2byte V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 3byte V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 4byte V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
        public final Unsigned8 sensorValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Get Sensor V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 1byte V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_1BYTE_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 2byte V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_2BYTE_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 3byte V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_3BYTE_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 4byte V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_4BYTE_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Get Scale V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Scale Report V5 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V5_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Get V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_GET_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 1byte V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 2byte V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 3byte V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 4byte V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
        public final Unsigned8 sensorValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Get Sensor V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 1byte V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_1BYTE_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 2byte V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_2BYTE_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 3byte V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_3BYTE_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 4byte V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_4BYTE_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Get Scale V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Scale Report V6 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V6_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Get V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_GET_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 1byte V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 2byte V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 3byte V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Report 4byte V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 sensorValue1 = new Unsigned8();
        public final Unsigned8 sensorValue2 = new Unsigned8();
        public final Unsigned8 sensorValue3 = new Unsigned8();
        public final Unsigned8 sensorValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Get Sensor V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 1byte V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_1BYTE_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 2byte V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_2BYTE_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 3byte V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_3BYTE_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Sensor Report 4byte V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_4BYTE_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Get Scale V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Multilevel Supported Scale Report V7 command class structs */
    /************************************************************/
    public static class ZW_SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V7_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sensorType = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Set 1byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 seconds1 = new Unsigned8();
        public final Unsigned8 seconds2 = new Unsigned8();
        public final Unsigned8 numberOfBitMasks = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Set 2byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 seconds1 = new Unsigned8();
        public final Unsigned8 seconds2 = new Unsigned8();
        public final Unsigned8 numberOfBitMasks = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Set 3byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 seconds1 = new Unsigned8();
        public final Unsigned8 seconds2 = new Unsigned8();
        public final Unsigned8 numberOfBitMasks = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Sensor Alarm Set 4byte command class structs */
    /************************************************************/
    public static class ZW_SENSOR_ALARM_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 seconds1 = new Unsigned8();
        public final Unsigned8 seconds2 = new Unsigned8();
        public final Unsigned8 numberOfBitMasks = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Simple Av Control Get command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Simple Av Control Report command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfReports = new Unsigned8();
    }

    /************************************************************/
	/* Simple Av Control Set variant group structs */
    /************************************************************/
    public static class VG_SIMPLE_AV_CONTROL_SET_VG extends Struct {
        public final Unsigned8 command1 = new Unsigned8();
        public final Unsigned8 command2 = new Unsigned8();
    }

    /************************************************************/
	/* Simple Av Control Set 1byte command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 itemId1 = new Unsigned8();
        public final Unsigned8 itemId2 = new Unsigned8();
        VG_SIMPLE_AV_CONTROL_SET_VG variantgroup1 = new VG_SIMPLE_AV_CONTROL_SET_VG();
    }

    /************************************************************/
	/* Simple Av Control Set 2byte command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 itemId1 = new Unsigned8();
        public final Unsigned8 itemId2 = new Unsigned8();
        VG_SIMPLE_AV_CONTROL_SET_VG variantgroup1 = new VG_SIMPLE_AV_CONTROL_SET_VG();
        VG_SIMPLE_AV_CONTROL_SET_VG variantgroup2 = new VG_SIMPLE_AV_CONTROL_SET_VG();
    }

    /************************************************************/
	/* Simple Av Control Set 3byte command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 itemId1 = new Unsigned8();
        public final Unsigned8 itemId2 = new Unsigned8();
        VG_SIMPLE_AV_CONTROL_SET_VG variantgroup1 = new VG_SIMPLE_AV_CONTROL_SET_VG();
        VG_SIMPLE_AV_CONTROL_SET_VG variantgroup2 = new VG_SIMPLE_AV_CONTROL_SET_VG();
        VG_SIMPLE_AV_CONTROL_SET_VG variantgroup3 = new VG_SIMPLE_AV_CONTROL_SET_VG();
    }

    /************************************************************/
	/* Simple Av Control Set 4byte command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 itemId1 = new Unsigned8();
        public final Unsigned8 itemId2 = new Unsigned8();
        VG_SIMPLE_AV_CONTROL_SET_VG variantgroup1 = new VG_SIMPLE_AV_CONTROL_SET_VG();
        VG_SIMPLE_AV_CONTROL_SET_VG variantgroup2 = new VG_SIMPLE_AV_CONTROL_SET_VG();
        VG_SIMPLE_AV_CONTROL_SET_VG variantgroup3 = new VG_SIMPLE_AV_CONTROL_SET_VG();
        VG_SIMPLE_AV_CONTROL_SET_VG variantgroup4 = new VG_SIMPLE_AV_CONTROL_SET_VG();
    }

    /************************************************************/
	/* Simple Av Control Supported Get command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportNo = new Unsigned8();
    }

    /************************************************************/
	/* Simple Av Control Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportNo = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Simple Av Control Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportNo = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Simple Av Control Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportNo = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Simple Av Control Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportNo = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Switch All Get command class structs */
    /************************************************************/
    public static class ZW_SWITCH_ALL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch All Off command class structs */
    /************************************************************/
    public static class ZW_SWITCH_ALL_OFF_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch All On command class structs */
    /************************************************************/
    public static class ZW_SWITCH_ALL_ON_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch All Report command class structs */
    /************************************************************/
    public static class ZW_SWITCH_ALL_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Switch All Set command class structs */
    /************************************************************/
    public static class ZW_SWITCH_ALL_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Switch Binary Get command class structs */
    /************************************************************/
    public static class ZW_SWITCH_BINARY_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Binary Report command class structs */
    /************************************************************/
    public static class ZW_SWITCH_BINARY_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Binary Set command class structs */
    /************************************************************/
    public static class ZW_SWITCH_BINARY_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 switchValue = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Get command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Report command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Set command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Start Level Change command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_START_LEVEL_CHANGE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 startLevel = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Stop Level Change command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Get V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Report V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Set V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
        public final Unsigned8 dimmingDuration = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Start Level Change V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_START_LEVEL_CHANGE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startLevel = new Unsigned8();
        public final Unsigned8 dimmingDuration = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Stop Level Change V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Get V3 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Report V3 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Set V3 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_SET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
        public final Unsigned8 dimmingDuration = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Start Level Change V3 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_START_LEVEL_CHANGE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startLevel = new Unsigned8();
        public final Unsigned8 dimmingDuration = new Unsigned8();
        public final Unsigned8 stepSize = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Stop Level Change V3 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Supported Get V3 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_SUPPORTED_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Multilevel Supported Report V3 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_MULTILEVEL_SUPPORTED_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Switch Toggle Binary Set command class structs */
    /************************************************************/
    public static class ZW_SWITCH_TOGGLE_BINARY_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Toggle Binary Get command class structs */
    /************************************************************/
    public static class ZW_SWITCH_TOGGLE_BINARY_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Toggle Binary Report command class structs */
    /************************************************************/
    public static class ZW_SWITCH_TOGGLE_BINARY_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Toggle Multilevel Set command class structs */
    /************************************************************/
    public static class ZW_SWITCH_TOGGLE_MULTILEVEL_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Toggle Multilevel Get command class structs */
    /************************************************************/
    public static class ZW_SWITCH_TOGGLE_MULTILEVEL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Toggle Multilevel Report command class structs */
    /************************************************************/
    public static class ZW_SWITCH_TOGGLE_MULTILEVEL_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Toggle Multilevel Start Level Change command class structs */
    /************************************************************/
    public static class ZW_SWITCH_TOGGLE_MULTILEVEL_START_LEVEL_CHANGE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 startLevel = new Unsigned8();
    }

    /************************************************************/
	/* Switch Toggle Multilevel Stop Level Change command class structs */
    /************************************************************/
    public static class ZW_SWITCH_TOGGLE_MULTILEVEL_STOP_LEVEL_CHANGE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Remove 1byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_REMOVE_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId1 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Remove 2byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_REMOVE_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId2 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Remove 3byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_REMOVE_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId2 = new Unsigned8();
        public final Unsigned8 rateParameterSetId3 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Remove 4byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_REMOVE_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId1 = new Unsigned8();
        public final Unsigned8 rateParameterSetId2 = new Unsigned8();
        public final Unsigned8 rateParameterSetId3 = new Unsigned8();
        public final Unsigned8 rateParameterSetId4 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Set command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 tariffValue1 = new Unsigned8();
        public final Unsigned8 tariffValue2 = new Unsigned8();
        public final Unsigned8 tariffValue3 = new Unsigned8();
        public final Unsigned8 tariffValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Supplier Set 1byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_SUPPLIER_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 currency1 = new Unsigned8();
        public final Unsigned8 currency2 = new Unsigned8();
        public final Unsigned8 currency3 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 standingChargeValue1 = new Unsigned8();
        public final Unsigned8 standingChargeValue2 = new Unsigned8();
        public final Unsigned8 standingChargeValue3 = new Unsigned8();
        public final Unsigned8 standingChargeValue4 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 supplierCharacter1 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Supplier Set 2byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_SUPPLIER_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 currency1 = new Unsigned8();
        public final Unsigned8 currency2 = new Unsigned8();
        public final Unsigned8 currency3 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 standingChargeValue1 = new Unsigned8();
        public final Unsigned8 standingChargeValue2 = new Unsigned8();
        public final Unsigned8 standingChargeValue3 = new Unsigned8();
        public final Unsigned8 standingChargeValue4 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 supplierCharacter1 = new Unsigned8();
        public final Unsigned8 supplierCharacter2 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Supplier Set 3byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_SUPPLIER_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 currency1 = new Unsigned8();
        public final Unsigned8 currency2 = new Unsigned8();
        public final Unsigned8 currency3 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 standingChargeValue1 = new Unsigned8();
        public final Unsigned8 standingChargeValue2 = new Unsigned8();
        public final Unsigned8 standingChargeValue3 = new Unsigned8();
        public final Unsigned8 standingChargeValue4 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 supplierCharacter1 = new Unsigned8();
        public final Unsigned8 supplierCharacter2 = new Unsigned8();
        public final Unsigned8 supplierCharacter3 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Supplier Set 4byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_SUPPLIER_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 currency1 = new Unsigned8();
        public final Unsigned8 currency2 = new Unsigned8();
        public final Unsigned8 currency3 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 standingChargeValue1 = new Unsigned8();
        public final Unsigned8 standingChargeValue2 = new Unsigned8();
        public final Unsigned8 standingChargeValue3 = new Unsigned8();
        public final Unsigned8 standingChargeValue4 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 supplierCharacter1 = new Unsigned8();
        public final Unsigned8 supplierCharacter2 = new Unsigned8();
        public final Unsigned8 supplierCharacter3 = new Unsigned8();
        public final Unsigned8 supplierCharacter4 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Cost Get command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_COST_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 stopYear1 = new Unsigned8();
        public final Unsigned8 stopYear2 = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHourLocalTime = new Unsigned8();
        public final Unsigned8 stopMinuteLocalTime = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Cost Report command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_COST_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 startYear1 = new Unsigned8();
        public final Unsigned8 startYear2 = new Unsigned8();
        public final Unsigned8 startMonth = new Unsigned8();
        public final Unsigned8 startDay = new Unsigned8();
        public final Unsigned8 startHourLocalTime = new Unsigned8();
        public final Unsigned8 startMinuteLocalTime = new Unsigned8();
        public final Unsigned8 stopYear1 = new Unsigned8();
        public final Unsigned8 stopYear2 = new Unsigned8();
        public final Unsigned8 stopMonth = new Unsigned8();
        public final Unsigned8 stopDay = new Unsigned8();
        public final Unsigned8 stopHourLocalTime = new Unsigned8();
        public final Unsigned8 stopMinuteLocalTime = new Unsigned8();
        public final Unsigned8 currency1 = new Unsigned8();
        public final Unsigned8 currency2 = new Unsigned8();
        public final Unsigned8 currency3 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 costValue1 = new Unsigned8();
        public final Unsigned8 costValue2 = new Unsigned8();
        public final Unsigned8 costValue3 = new Unsigned8();
        public final Unsigned8 costValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Get command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Report command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 rateParameterSetId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 tariffValue1 = new Unsigned8();
        public final Unsigned8 tariffValue2 = new Unsigned8();
        public final Unsigned8 tariffValue3 = new Unsigned8();
        public final Unsigned8 tariffValue4 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Supplier Get command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_SUPPLIER_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Supplier Report 1byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_SUPPLIER_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 currency1 = new Unsigned8();
        public final Unsigned8 currency2 = new Unsigned8();
        public final Unsigned8 currency3 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 standingChargeValue1 = new Unsigned8();
        public final Unsigned8 standingChargeValue2 = new Unsigned8();
        public final Unsigned8 standingChargeValue3 = new Unsigned8();
        public final Unsigned8 standingChargeValue4 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 supplierCharacter1 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Supplier Report 2byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_SUPPLIER_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 currency1 = new Unsigned8();
        public final Unsigned8 currency2 = new Unsigned8();
        public final Unsigned8 currency3 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 standingChargeValue1 = new Unsigned8();
        public final Unsigned8 standingChargeValue2 = new Unsigned8();
        public final Unsigned8 standingChargeValue3 = new Unsigned8();
        public final Unsigned8 standingChargeValue4 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 supplierCharacter1 = new Unsigned8();
        public final Unsigned8 supplierCharacter2 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Supplier Report 3byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_SUPPLIER_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 currency1 = new Unsigned8();
        public final Unsigned8 currency2 = new Unsigned8();
        public final Unsigned8 currency3 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 standingChargeValue1 = new Unsigned8();
        public final Unsigned8 standingChargeValue2 = new Unsigned8();
        public final Unsigned8 standingChargeValue3 = new Unsigned8();
        public final Unsigned8 standingChargeValue4 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 supplierCharacter1 = new Unsigned8();
        public final Unsigned8 supplierCharacter2 = new Unsigned8();
        public final Unsigned8 supplierCharacter3 = new Unsigned8();
    }

    /************************************************************/
	/* Tariff Tbl Supplier Report 4byte command class structs */
    /************************************************************/
    public static class ZW_TARIFF_TBL_SUPPLIER_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
        public final Unsigned8 currency1 = new Unsigned8();
        public final Unsigned8 currency2 = new Unsigned8();
        public final Unsigned8 currency3 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 standingChargeValue1 = new Unsigned8();
        public final Unsigned8 standingChargeValue2 = new Unsigned8();
        public final Unsigned8 standingChargeValue3 = new Unsigned8();
        public final Unsigned8 standingChargeValue4 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 supplierCharacter1 = new Unsigned8();
        public final Unsigned8 supplierCharacter2 = new Unsigned8();
        public final Unsigned8 supplierCharacter3 = new Unsigned8();
        public final Unsigned8 supplierCharacter4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Report command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Set command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Get V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Report V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Set V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Get V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Get V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Report V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_REPORT_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Set V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Get V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Get V4 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_GET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Report V4 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_REPORT_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Set V4 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Get V4 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 1byte V4 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 2byte V4 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 3byte V4 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan Mode Supported Report 4byte V4 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_V4_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan State Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_STATE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan State Report command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_STATE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan State Get V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_STATE_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Fan State Report V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_FAN_STATE_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Status Report command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_STATUS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Mode Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_MODE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Mode Report command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_MODE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Mode Set command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_MODE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Relay Status Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_RELAY_STATUS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Relay Status Report command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_RELAY_STATUS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 relayStatus = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Setpoint Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_SETPOINT_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setpointNr = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Setpoint Report 1byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setpointNr = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Setpoint Report 2byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setpointNr = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Setpoint Report 3byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setpointNr = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Setpoint Report 4byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setpointNr = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Setpoint Set 1byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_SETPOINT_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setpointNr = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Setpoint Set 2byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_SETPOINT_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setpointNr = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Setpoint Set 3byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_SETPOINT_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setpointNr = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Setpoint Set 4byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_SETPOINT_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 setpointNr = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Status Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_STATUS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Status Set command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_STATUS_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Heating Timed Off Set command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_HEATING_TIMED_OFF_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 minutes = new Unsigned8();
        public final Unsigned8 hours = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Report command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Set command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Get V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Report V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Set V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Get V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Get V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
        public final Unsigned8 manufacturerData3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
        public final Unsigned8 manufacturerData3 = new Unsigned8();
        public final Unsigned8 manufacturerData4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Set 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SET_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Set 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SET_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Set 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SET_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
        public final Unsigned8 manufacturerData3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Set 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SET_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
        public final Unsigned8 manufacturerData3 = new Unsigned8();
        public final Unsigned8 manufacturerData4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Get V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Mode Supported Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Report command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Get V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Report V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Logging Supported Get V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating Logging Supported Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating Logging Supported Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating Logging Supported Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating Logging Supported Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Logging Get 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Logging Get 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Logging Get 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Logging Get 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Logging Report V2 variant group structs */
    /************************************************************/
    public static class VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG extends Struct {
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 usageTodayHours = new Unsigned8();
        public final Unsigned8 usageTodayMinutes = new Unsigned8();
        public final Unsigned8 usageYesterdayHours = new Unsigned8();
        public final Unsigned8 usageYesterdayMinutes = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Operating State Logging Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG variantgroup1
                = new VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
    }

    /************************************************************/
	/* Thermostat Operating State Logging Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG variantgroup1
                = new VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
        VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG variantgroup2
                = new VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
    }

    /************************************************************/
	/* Thermostat Operating State Logging Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG variantgroup1
                = new VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
        VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG variantgroup2
                = new VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
        VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG variantgroup3
                = new VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
    }

    /************************************************************/
	/* Thermostat Operating State Logging Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG variantgroup1
                = new VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
        VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG variantgroup2
                = new VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
        VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG variantgroup3
                = new VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
        VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG variantgroup4
                = new VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
    }

    /************************************************************/
	/* Thermostat Setback Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETBACK_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setback Report command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETBACK_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 setbackState = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setback Set command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETBACK_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 setbackState = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 1byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 2byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 3byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 4byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 1byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 2byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 3byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 4byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Get command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Get V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Get V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Get V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Set 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SET_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 value1 = new Unsigned8();
        public final Unsigned8 value2 = new Unsigned8();
        public final Unsigned8 value3 = new Unsigned8();
        public final Unsigned8 value4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Get V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Supported Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Capabilities Get V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_CAPABILITIES_GET_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Capabilities Report 1byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_1BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minValue1 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxvalue1 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Capabilities Report 2byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_2BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minValue1 = new Unsigned8();
        public final Unsigned8 minValue2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxvalue1 = new Unsigned8();
        public final Unsigned8 maxvalue2 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Capabilities Report 3byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_3BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minValue1 = new Unsigned8();
        public final Unsigned8 minValue2 = new Unsigned8();
        public final Unsigned8 minValue3 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxvalue1 = new Unsigned8();
        public final Unsigned8 maxvalue2 = new Unsigned8();
        public final Unsigned8 maxvalue3 = new Unsigned8();
    }

    /************************************************************/
	/* Thermostat Setpoint Capabilities Report 4byte V3 command class structs */
    /************************************************************/
    public static class ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_4BYTE_V3_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 minValue1 = new Unsigned8();
        public final Unsigned8 minValue2 = new Unsigned8();
        public final Unsigned8 minValue3 = new Unsigned8();
        public final Unsigned8 minValue4 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 maxvalue1 = new Unsigned8();
        public final Unsigned8 maxvalue2 = new Unsigned8();
        public final Unsigned8 maxvalue3 = new Unsigned8();
        public final Unsigned8 maxvalue4 = new Unsigned8();
    }

    /************************************************************/
	/* Time Parameters Get command class structs */
    /************************************************************/
    public static class ZW_TIME_PARAMETERS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Time Parameters Report command class structs */
    /************************************************************/
    public static class ZW_TIME_PARAMETERS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourUtc = new Unsigned8();
        public final Unsigned8 minuteUtc = new Unsigned8();
        public final Unsigned8 secondUtc = new Unsigned8();
    }

    /************************************************************/
	/* Time Parameters Set command class structs */
    /************************************************************/
    public static class ZW_TIME_PARAMETERS_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
        public final Unsigned8 hourUtc = new Unsigned8();
        public final Unsigned8 minuteUtc = new Unsigned8();
        public final Unsigned8 secondUtc = new Unsigned8();
    }

    /************************************************************/
	/* Date Get command class structs */
    /************************************************************/
    public static class ZW_DATE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Date Report command class structs */
    /************************************************************/
    public static class ZW_DATE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
    }

    /************************************************************/
	/* Time Get command class structs */
    /************************************************************/
    public static class ZW_TIME_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Time Report command class structs */
    /************************************************************/
    public static class ZW_TIME_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
    }

    /************************************************************/
	/* Date Get V2 command class structs */
    /************************************************************/
    public static class ZW_DATE_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Date Report V2 command class structs */
    /************************************************************/
    public static class ZW_DATE_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 year1 = new Unsigned8();
        public final Unsigned8 year2 = new Unsigned8();
        public final Unsigned8 month = new Unsigned8();
        public final Unsigned8 day = new Unsigned8();
    }

    /************************************************************/
	/* Time Get V2 command class structs */
    /************************************************************/
    public static class ZW_TIME_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Time Offset Get V2 command class structs */
    /************************************************************/
    public static class ZW_TIME_OFFSET_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Time Offset Report V2 command class structs */
    /************************************************************/
    public static class ZW_TIME_OFFSET_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 minuteTzo = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 monthStartDst = new Unsigned8();
        public final Unsigned8 dayStartDst = new Unsigned8();
        public final Unsigned8 hourStartDst = new Unsigned8();
        public final Unsigned8 monthEndDst = new Unsigned8();
        public final Unsigned8 dayEndDst = new Unsigned8();
        public final Unsigned8 hourEndDst = new Unsigned8();
    }

    /************************************************************/
	/* Time Offset Set V2 command class structs */
    /************************************************************/
    public static class ZW_TIME_OFFSET_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 level = new Unsigned8();
        public final Unsigned8 minuteTzo = new Unsigned8();
        public final Unsigned8 level2 = new Unsigned8();
        public final Unsigned8 monthStartDst = new Unsigned8();
        public final Unsigned8 dayStartDst = new Unsigned8();
        public final Unsigned8 hourStartDst = new Unsigned8();
        public final Unsigned8 monthEndDst = new Unsigned8();
        public final Unsigned8 dayEndDst = new Unsigned8();
        public final Unsigned8 hourEndDst = new Unsigned8();
    }

    /************************************************************/
	/* Time Report V2 command class structs */
    /************************************************************/
    public static class ZW_TIME_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 hourLocalTime = new Unsigned8();
        public final Unsigned8 minuteLocalTime = new Unsigned8();
        public final Unsigned8 secondLocalTime = new Unsigned8();
    }

    /************************************************************/
	/* Command First Fragment 1byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FIRST_FRAGMENT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command First Fragment 2byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FIRST_FRAGMENT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command First Fragment 3byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FIRST_FRAGMENT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command First Fragment 4byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FIRST_FRAGMENT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
        public final Unsigned8 payload4 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Fragment Complete command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_COMPLETE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Fragment Request variant group structs */
    /************************************************************/
    public static class VG_COMMAND_FRAGMENT_REQUEST_VG extends Struct {
        public final Unsigned8 datagramOffset1 = new Unsigned8();
        public final Unsigned8 datagramOffset2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Fragment Request 1byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_REQUEST_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfOffsets = new Unsigned8();
        VG_COMMAND_FRAGMENT_REQUEST_VG variantgroup1 = new VG_COMMAND_FRAGMENT_REQUEST_VG();
    }

    /************************************************************/
	/* Command Fragment Request 2byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_REQUEST_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfOffsets = new Unsigned8();
        VG_COMMAND_FRAGMENT_REQUEST_VG variantgroup1 = new VG_COMMAND_FRAGMENT_REQUEST_VG();
        VG_COMMAND_FRAGMENT_REQUEST_VG variantgroup2 = new VG_COMMAND_FRAGMENT_REQUEST_VG();
    }

    /************************************************************/
	/* Command Fragment Request 3byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_REQUEST_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfOffsets = new Unsigned8();
        VG_COMMAND_FRAGMENT_REQUEST_VG variantgroup1 = new VG_COMMAND_FRAGMENT_REQUEST_VG();
        VG_COMMAND_FRAGMENT_REQUEST_VG variantgroup2 = new VG_COMMAND_FRAGMENT_REQUEST_VG();
        VG_COMMAND_FRAGMENT_REQUEST_VG variantgroup3 = new VG_COMMAND_FRAGMENT_REQUEST_VG();
    }

    /************************************************************/
	/* Command Fragment Request 4byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_REQUEST_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfOffsets = new Unsigned8();
        VG_COMMAND_FRAGMENT_REQUEST_VG variantgroup1 = new VG_COMMAND_FRAGMENT_REQUEST_VG();
        VG_COMMAND_FRAGMENT_REQUEST_VG variantgroup2 = new VG_COMMAND_FRAGMENT_REQUEST_VG();
        VG_COMMAND_FRAGMENT_REQUEST_VG variantgroup3 = new VG_COMMAND_FRAGMENT_REQUEST_VG();
        VG_COMMAND_FRAGMENT_REQUEST_VG variantgroup4 = new VG_COMMAND_FRAGMENT_REQUEST_VG();
    }

    /************************************************************/
	/* Command Fragment Wait command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_WAIT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 pendingFragments = new Unsigned8();
    }

    /************************************************************/
	/* Command Subsequent Fragment 1byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SUBSEQUENT_FRAGMENT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 datagramOffset2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Subsequent Fragment 2byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SUBSEQUENT_FRAGMENT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 datagramOffset2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Subsequent Fragment 3byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SUBSEQUENT_FRAGMENT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 datagramOffset2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Subsequent Fragment 4byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SUBSEQUENT_FRAGMENT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 datagramOffset2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
        public final Unsigned8 payload4 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command First Fragment 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FIRST_FRAGMENT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command First Fragment 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FIRST_FRAGMENT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command First Fragment 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FIRST_FRAGMENT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command First Fragment 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FIRST_FRAGMENT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
        public final Unsigned8 payload4 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Fragment Complete V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_COMPLETE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Fragment Request V2 variant group structs */
    /************************************************************/
    public static class VG_COMMAND_FRAGMENT_REQUEST_V2_VG extends Struct {
        public final Unsigned8 datagramOffset1 = new Unsigned8();
        public final Unsigned8 datagramOffset2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Fragment Request 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_REQUEST_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfOffsets = new Unsigned8();
        VG_COMMAND_FRAGMENT_REQUEST_V2_VG variantgroup1 = new VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
    }

    /************************************************************/
	/* Command Fragment Request 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_REQUEST_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfOffsets = new Unsigned8();
        VG_COMMAND_FRAGMENT_REQUEST_V2_VG variantgroup1 = new VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
        VG_COMMAND_FRAGMENT_REQUEST_V2_VG variantgroup2 = new VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
    }

    /************************************************************/
	/* Command Fragment Request 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_REQUEST_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfOffsets = new Unsigned8();
        VG_COMMAND_FRAGMENT_REQUEST_V2_VG variantgroup1 = new VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
        VG_COMMAND_FRAGMENT_REQUEST_V2_VG variantgroup2 = new VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
        VG_COMMAND_FRAGMENT_REQUEST_V2_VG variantgroup3 = new VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
    }

    /************************************************************/
	/* Command Fragment Request 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_REQUEST_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 numberOfOffsets = new Unsigned8();
        VG_COMMAND_FRAGMENT_REQUEST_V2_VG variantgroup1 = new VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
        VG_COMMAND_FRAGMENT_REQUEST_V2_VG variantgroup2 = new VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
        VG_COMMAND_FRAGMENT_REQUEST_V2_VG variantgroup3 = new VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
        VG_COMMAND_FRAGMENT_REQUEST_V2_VG variantgroup4 = new VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
    }

    /************************************************************/
	/* Command Fragment Wait V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_FRAGMENT_WAIT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_reserved = new Unsigned8();
        public final Unsigned8 pendingFragments = new Unsigned8();
    }

    /************************************************************/
	/* Command Subsequent Fragment 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SUBSEQUENT_FRAGMENT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 datagramOffset2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Subsequent Fragment 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SUBSEQUENT_FRAGMENT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 datagramOffset2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Subsequent Fragment 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SUBSEQUENT_FRAGMENT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 datagramOffset2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Subsequent Fragment 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SUBSEQUENT_FRAGMENT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 datagramOffset2 = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
        public final Unsigned8 payload4 = new Unsigned8();
        public final Unsigned8 checksum1 = new Unsigned8();
        public final Unsigned8 checksum2 = new Unsigned8();
    }

    /************************************************************/
	/* User Code Get command class structs */
    /************************************************************/
    public static class ZW_USER_CODE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* User Code Report command class structs */
    /************************************************************/
    public static class ZW_USER_CODE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 userIdStatus = new Unsigned8();
        public final Unsigned8 userCode1 = new Unsigned8();
        public final Unsigned8 userCode2 = new Unsigned8();
        public final Unsigned8 userCode3 = new Unsigned8();
        public final Unsigned8 userCode4 = new Unsigned8();
        public final Unsigned8 userCode5 = new Unsigned8();
        public final Unsigned8 userCode6 = new Unsigned8();
        public final Unsigned8 userCode7 = new Unsigned8();
        public final Unsigned8 userCode8 = new Unsigned8();
        public final Unsigned8 userCode9 = new Unsigned8();
        public final Unsigned8 userCode10 = new Unsigned8();
    }

    /************************************************************/
	/* User Code Set command class structs */
    /************************************************************/
    public static class ZW_USER_CODE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 userIdStatus = new Unsigned8();
        public final Unsigned8 userCode1 = new Unsigned8();
        public final Unsigned8 userCode2 = new Unsigned8();
        public final Unsigned8 userCode3 = new Unsigned8();
        public final Unsigned8 userCode4 = new Unsigned8();
        public final Unsigned8 userCode5 = new Unsigned8();
        public final Unsigned8 userCode6 = new Unsigned8();
        public final Unsigned8 userCode7 = new Unsigned8();
        public final Unsigned8 userCode8 = new Unsigned8();
        public final Unsigned8 userCode9 = new Unsigned8();
        public final Unsigned8 userCode10 = new Unsigned8();
    }

    /************************************************************/
	/* Users Number Get command class structs */
    /************************************************************/
    public static class ZW_USERS_NUMBER_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Users Number Report command class structs */
    /************************************************************/
    public static class ZW_USERS_NUMBER_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedUsers = new Unsigned8();
    }

    /************************************************************/
	/* Version Command Class Get command class structs */
    /************************************************************/
    public static class ZW_VERSION_COMMAND_CLASS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 requestedCommandClass = new Unsigned8();
    }

    /************************************************************/
	/* Version Command Class Report command class structs */
    /************************************************************/
    public static class ZW_VERSION_COMMAND_CLASS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 requestedCommandClass = new Unsigned8();
        public final Unsigned8 commandClassVersion = new Unsigned8();
    }

    /************************************************************/
	/* Version Get command class structs */
    /************************************************************/
    public static class ZW_VERSION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Version Report command class structs */
    /************************************************************/
    public static class ZW_VERSION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zWaveLibraryType = new Unsigned8();
        public final Unsigned8 zWaveProtocolVersion = new Unsigned8();
        public final Unsigned8 zWaveProtocolSubVersion = new Unsigned8();
        public final Unsigned8 applicationVersion = new Unsigned8();
        public final Unsigned8 applicationSubVersion = new Unsigned8();
    }

    /************************************************************/
	/* Version Command Class Get V2 command class structs */
    /************************************************************/
    public static class ZW_VERSION_COMMAND_CLASS_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 requestedCommandClass = new Unsigned8();
    }

    /************************************************************/
	/* Version Command Class Report V2 command class structs */
    /************************************************************/
    public static class ZW_VERSION_COMMAND_CLASS_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 requestedCommandClass = new Unsigned8();
        public final Unsigned8 commandClassVersion = new Unsigned8();
    }

    /************************************************************/
	/* Version Get V2 command class structs */
    /************************************************************/
    public static class ZW_VERSION_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Version Report V2 variant group structs */
    /************************************************************/
    public static class VG_VERSION_REPORT_V2_VG extends Struct {
        public final Unsigned8 firmwareVersion = new Unsigned8();
        public final Unsigned8 firmwareSubVersion = new Unsigned8();
    }

    /************************************************************/
	/* Version Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_VERSION_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zWaveLibraryType = new Unsigned8();
        public final Unsigned8 zWaveProtocolVersion = new Unsigned8();
        public final Unsigned8 zWaveProtocolSubVersion = new Unsigned8();
        public final Unsigned8 firmware0Version = new Unsigned8();
        public final Unsigned8 firmware0SubVersion = new Unsigned8();
        public final Unsigned8 hardwareVersion = new Unsigned8();
        public final Unsigned8 numberOfFirmwareTargets = new Unsigned8();
        VG_VERSION_REPORT_V2_VG variantgroup1 = new VG_VERSION_REPORT_V2_VG();
    }

    /************************************************************/
	/* Version Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_VERSION_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zWaveLibraryType = new Unsigned8();
        public final Unsigned8 zWaveProtocolVersion = new Unsigned8();
        public final Unsigned8 zWaveProtocolSubVersion = new Unsigned8();
        public final Unsigned8 firmware0Version = new Unsigned8();
        public final Unsigned8 firmware0SubVersion = new Unsigned8();
        public final Unsigned8 hardwareVersion = new Unsigned8();
        public final Unsigned8 numberOfFirmwareTargets = new Unsigned8();
        VG_VERSION_REPORT_V2_VG variantgroup1 = new VG_VERSION_REPORT_V2_VG();
        VG_VERSION_REPORT_V2_VG variantgroup2 = new VG_VERSION_REPORT_V2_VG();
    }

    /************************************************************/
	/* Version Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_VERSION_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zWaveLibraryType = new Unsigned8();
        public final Unsigned8 zWaveProtocolVersion = new Unsigned8();
        public final Unsigned8 zWaveProtocolSubVersion = new Unsigned8();
        public final Unsigned8 firmware0Version = new Unsigned8();
        public final Unsigned8 firmware0SubVersion = new Unsigned8();
        public final Unsigned8 hardwareVersion = new Unsigned8();
        public final Unsigned8 numberOfFirmwareTargets = new Unsigned8();
        VG_VERSION_REPORT_V2_VG variantgroup1 = new VG_VERSION_REPORT_V2_VG();
        VG_VERSION_REPORT_V2_VG variantgroup2 = new VG_VERSION_REPORT_V2_VG();
        VG_VERSION_REPORT_V2_VG variantgroup3 = new VG_VERSION_REPORT_V2_VG();
    }

    /************************************************************/
	/* Version Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_VERSION_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zWaveLibraryType = new Unsigned8();
        public final Unsigned8 zWaveProtocolVersion = new Unsigned8();
        public final Unsigned8 zWaveProtocolSubVersion = new Unsigned8();
        public final Unsigned8 firmware0Version = new Unsigned8();
        public final Unsigned8 firmware0SubVersion = new Unsigned8();
        public final Unsigned8 hardwareVersion = new Unsigned8();
        public final Unsigned8 numberOfFirmwareTargets = new Unsigned8();
        VG_VERSION_REPORT_V2_VG variantgroup1 = new VG_VERSION_REPORT_V2_VG();
        VG_VERSION_REPORT_V2_VG variantgroup2 = new VG_VERSION_REPORT_V2_VG();
        VG_VERSION_REPORT_V2_VG variantgroup3 = new VG_VERSION_REPORT_V2_VG();
        VG_VERSION_REPORT_V2_VG variantgroup4 = new VG_VERSION_REPORT_V2_VG();
    }

    /************************************************************/
	/* Wake Up Interval Get command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_INTERVAL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up Interval Report command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_INTERVAL_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seconds1 = new Unsigned8();
        public final Unsigned8 seconds2 = new Unsigned8();
        public final Unsigned8 seconds3 = new Unsigned8();
        public final Unsigned8 nodeid = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up Interval Set command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_INTERVAL_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seconds1 = new Unsigned8();
        public final Unsigned8 seconds2 = new Unsigned8();
        public final Unsigned8 seconds3 = new Unsigned8();
        public final Unsigned8 nodeid = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up No More Information command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_NO_MORE_INFORMATION_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up Notification command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_NOTIFICATION_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up Interval Capabilities Get V2 command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_INTERVAL_CAPABILITIES_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up Interval Capabilities Report V2 command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_INTERVAL_CAPABILITIES_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 minimumWakeUpIntervalSeconds1 = new Unsigned8();
        public final Unsigned8 minimumWakeUpIntervalSeconds2 = new Unsigned8();
        public final Unsigned8 minimumWakeUpIntervalSeconds3 = new Unsigned8();
        public final Unsigned8 maximumWakeUpIntervalSeconds1 = new Unsigned8();
        public final Unsigned8 maximumWakeUpIntervalSeconds2 = new Unsigned8();
        public final Unsigned8 maximumWakeUpIntervalSeconds3 = new Unsigned8();
        public final Unsigned8 defaultWakeUpIntervalSeconds1 = new Unsigned8();
        public final Unsigned8 defaultWakeUpIntervalSeconds2 = new Unsigned8();
        public final Unsigned8 defaultWakeUpIntervalSeconds3 = new Unsigned8();
        public final Unsigned8 wakeUpIntervalStepSeconds1 = new Unsigned8();
        public final Unsigned8 wakeUpIntervalStepSeconds2 = new Unsigned8();
        public final Unsigned8 wakeUpIntervalStepSeconds3 = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up Interval Get V2 command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_INTERVAL_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up Interval Report V2 command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_INTERVAL_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seconds1 = new Unsigned8();
        public final Unsigned8 seconds2 = new Unsigned8();
        public final Unsigned8 seconds3 = new Unsigned8();
        public final Unsigned8 nodeid = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up Interval Set V2 command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_INTERVAL_SET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seconds1 = new Unsigned8();
        public final Unsigned8 seconds2 = new Unsigned8();
        public final Unsigned8 seconds3 = new Unsigned8();
        public final Unsigned8 nodeid = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up No More Information V2 command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_NO_MORE_INFORMATION_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Wake Up Notification V2 command class structs */
    /************************************************************/
    public static class ZW_WAKE_UP_NOTIFICATION_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Lowpan First Fragment 1byte command class structs */
    /************************************************************/
    public static class ZW_LOWPAN_FIRST_FRAGMENT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 datagramTag = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
    }

    /************************************************************/
	/* Lowpan First Fragment 2byte command class structs */
    /************************************************************/
    public static class ZW_LOWPAN_FIRST_FRAGMENT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 datagramTag = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
    }

    /************************************************************/
	/* Lowpan First Fragment 3byte command class structs */
    /************************************************************/
    public static class ZW_LOWPAN_FIRST_FRAGMENT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 datagramTag = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
    }

    /************************************************************/
	/* Lowpan First Fragment 4byte command class structs */
    /************************************************************/
    public static class ZW_LOWPAN_FIRST_FRAGMENT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 datagramTag = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
        public final Unsigned8 payload4 = new Unsigned8();
    }

    /************************************************************/
	/* Lowpan Subsequent Fragment 1byte command class structs */
    /************************************************************/
    public static class ZW_LOWPAN_SUBSEQUENT_FRAGMENT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 datagramTag = new Unsigned8();
        public final Unsigned8 datagramOffset = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
    }

    /************************************************************/
	/* Lowpan Subsequent Fragment 2byte command class structs */
    /************************************************************/
    public static class ZW_LOWPAN_SUBSEQUENT_FRAGMENT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 datagramTag = new Unsigned8();
        public final Unsigned8 datagramOffset = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
    }

    /************************************************************/
	/* Lowpan Subsequent Fragment 3byte command class structs */
    /************************************************************/
    public static class ZW_LOWPAN_SUBSEQUENT_FRAGMENT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 datagramTag = new Unsigned8();
        public final Unsigned8 datagramOffset = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
    }

    /************************************************************/
	/* Lowpan Subsequent Fragment 4byte command class structs */
    /************************************************************/
    public static class ZW_LOWPAN_SUBSEQUENT_FRAGMENT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd_datagramSize1 = new Unsigned8();
        public final Unsigned8 datagramSize2 = new Unsigned8();
        public final Unsigned8 datagramTag = new Unsigned8();
        public final Unsigned8 datagramOffset = new Unsigned8();
        public final Unsigned8 payload1 = new Unsigned8();
        public final Unsigned8 payload2 = new Unsigned8();
        public final Unsigned8 payload3 = new Unsigned8();
        public final Unsigned8 payload4 = new Unsigned8();
    }

    /************************************************************/
	/* Command Zip Packet 1byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_ZIP_PACKET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 headerExtension1 = new Unsigned8();
        public final Unsigned8 zWaveCommand1 = new Unsigned8();
    }

    /************************************************************/
	/* Command Zip Packet 2byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_ZIP_PACKET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 headerExtension1 = new Unsigned8();
        public final Unsigned8 headerExtension2 = new Unsigned8();
        public final Unsigned8 zWaveCommand1 = new Unsigned8();
        public final Unsigned8 zWaveCommand2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Zip Packet 3byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_ZIP_PACKET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 headerExtension1 = new Unsigned8();
        public final Unsigned8 headerExtension2 = new Unsigned8();
        public final Unsigned8 headerExtension3 = new Unsigned8();
        public final Unsigned8 zWaveCommand1 = new Unsigned8();
        public final Unsigned8 zWaveCommand2 = new Unsigned8();
        public final Unsigned8 zWaveCommand3 = new Unsigned8();
    }

    /************************************************************/
	/* Command Zip Packet 4byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_ZIP_PACKET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 headerExtension1 = new Unsigned8();
        public final Unsigned8 headerExtension2 = new Unsigned8();
        public final Unsigned8 headerExtension3 = new Unsigned8();
        public final Unsigned8 headerExtension4 = new Unsigned8();
        public final Unsigned8 zWaveCommand1 = new Unsigned8();
        public final Unsigned8 zWaveCommand2 = new Unsigned8();
        public final Unsigned8 zWaveCommand3 = new Unsigned8();
        public final Unsigned8 zWaveCommand4 = new Unsigned8();
    }

    /************************************************************/
	/* Command Zip Packet 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_ZIP_PACKET_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 headerExtension1 = new Unsigned8();
        public final Unsigned8 zWaveCommand1 = new Unsigned8();
    }

    /************************************************************/
	/* Command Zip Packet 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_ZIP_PACKET_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 headerExtension1 = new Unsigned8();
        public final Unsigned8 headerExtension2 = new Unsigned8();
        public final Unsigned8 zWaveCommand1 = new Unsigned8();
        public final Unsigned8 zWaveCommand2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Zip Packet 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_ZIP_PACKET_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 headerExtension1 = new Unsigned8();
        public final Unsigned8 headerExtension2 = new Unsigned8();
        public final Unsigned8 headerExtension3 = new Unsigned8();
        public final Unsigned8 zWaveCommand1 = new Unsigned8();
        public final Unsigned8 zWaveCommand2 = new Unsigned8();
        public final Unsigned8 zWaveCommand3 = new Unsigned8();
    }

    /************************************************************/
	/* Command Zip Packet 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_COMMAND_ZIP_PACKET_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 headerExtension1 = new Unsigned8();
        public final Unsigned8 headerExtension2 = new Unsigned8();
        public final Unsigned8 headerExtension3 = new Unsigned8();
        public final Unsigned8 headerExtension4 = new Unsigned8();
        public final Unsigned8 zWaveCommand1 = new Unsigned8();
        public final Unsigned8 zWaveCommand2 = new Unsigned8();
        public final Unsigned8 zWaveCommand3 = new Unsigned8();
        public final Unsigned8 zWaveCommand4 = new Unsigned8();
    }

    /************************************************************/
	/* Command Command Class Not Supported command class structs */
    /************************************************************/
    public static class ZW_COMMAND_COMMAND_CLASS_NOT_SUPPORTED_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 offendingCommandClass = new Unsigned8();
        public final Unsigned8 offendingCommand = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Supported Get command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Supported Report command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 colorComponentMask1 = new Unsigned8();
        public final Unsigned8 colorComponentMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Get command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 colorComponentId = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Report command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 colorComponentId = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Set variant group structs */
    /************************************************************/
    public static class VG_SWITCH_COLOR_SET_VG extends Struct {
        public final Unsigned8 colorComponentId = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Set 1byte command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SWITCH_COLOR_SET_VG variantgroup1 = new VG_SWITCH_COLOR_SET_VG();
    }

    /************************************************************/
	/* Switch Color Set 2byte command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SWITCH_COLOR_SET_VG variantgroup1 = new VG_SWITCH_COLOR_SET_VG();
        VG_SWITCH_COLOR_SET_VG variantgroup2 = new VG_SWITCH_COLOR_SET_VG();
    }

    /************************************************************/
	/* Switch Color Set 3byte command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SWITCH_COLOR_SET_VG variantgroup1 = new VG_SWITCH_COLOR_SET_VG();
        VG_SWITCH_COLOR_SET_VG variantgroup2 = new VG_SWITCH_COLOR_SET_VG();
        VG_SWITCH_COLOR_SET_VG variantgroup3 = new VG_SWITCH_COLOR_SET_VG();
    }

    /************************************************************/
	/* Switch Color Set 4byte command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SWITCH_COLOR_SET_VG variantgroup1 = new VG_SWITCH_COLOR_SET_VG();
        VG_SWITCH_COLOR_SET_VG variantgroup2 = new VG_SWITCH_COLOR_SET_VG();
        VG_SWITCH_COLOR_SET_VG variantgroup3 = new VG_SWITCH_COLOR_SET_VG();
        VG_SWITCH_COLOR_SET_VG variantgroup4 = new VG_SWITCH_COLOR_SET_VG();
    }

    /************************************************************/
	/* Switch Color Start Level Change command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_START_LEVEL_CHANGE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 colorComponentId = new Unsigned8();
        public final Unsigned8 startLevel = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Stop Level Change command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_STOP_LEVEL_CHANGE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 colorComponentId = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Supported Get V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SUPPORTED_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Supported Report V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SUPPORTED_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 colorComponentMask1 = new Unsigned8();
        public final Unsigned8 colorComponentMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Get V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 colorComponentId = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Report V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 colorComponentId = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Set V2 variant group structs */
    /************************************************************/
    public static class VG_SWITCH_COLOR_SET_V2_VG extends Struct {
        public final Unsigned8 colorComponentId = new Unsigned8();
        public final Unsigned8 value = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Set 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SET_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SWITCH_COLOR_SET_V2_VG variantgroup1 = new VG_SWITCH_COLOR_SET_V2_VG();
        public final Unsigned8 duration = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Set 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SET_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SWITCH_COLOR_SET_V2_VG variantgroup1 = new VG_SWITCH_COLOR_SET_V2_VG();
        VG_SWITCH_COLOR_SET_V2_VG variantgroup2 = new VG_SWITCH_COLOR_SET_V2_VG();
        public final Unsigned8 duration = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Set 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SET_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SWITCH_COLOR_SET_V2_VG variantgroup1 = new VG_SWITCH_COLOR_SET_V2_VG();
        VG_SWITCH_COLOR_SET_V2_VG variantgroup2 = new VG_SWITCH_COLOR_SET_V2_VG();
        VG_SWITCH_COLOR_SET_V2_VG variantgroup3 = new VG_SWITCH_COLOR_SET_V2_VG();
        public final Unsigned8 duration = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Set 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_SET_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        VG_SWITCH_COLOR_SET_V2_VG variantgroup1 = new VG_SWITCH_COLOR_SET_V2_VG();
        VG_SWITCH_COLOR_SET_V2_VG variantgroup2 = new VG_SWITCH_COLOR_SET_V2_VG();
        VG_SWITCH_COLOR_SET_V2_VG variantgroup3 = new VG_SWITCH_COLOR_SET_V2_VG();
        VG_SWITCH_COLOR_SET_V2_VG variantgroup4 = new VG_SWITCH_COLOR_SET_V2_VG();
        public final Unsigned8 duration = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Start Level Change V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_START_LEVEL_CHANGE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 colorComponentId = new Unsigned8();
        public final Unsigned8 startLevel = new Unsigned8();
    }

    /************************************************************/
	/* Switch Color Stop Level Change V2 command class structs */
    /************************************************************/
    public static class ZW_SWITCH_COLOR_STOP_LEVEL_CHANGE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 colorComponentId = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Supported Get command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Supported Report variant group structs */
    /************************************************************/
    public static class VG_SCHEDULE_SUPPORTED_REPORT_VG extends Struct {
        public final Unsigned8 supportedCc = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfSupportedScheduleId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 numberOfSupportedCc = new Unsigned8();
        VG_SCHEDULE_SUPPORTED_REPORT_VG variantgroup1 = new VG_SCHEDULE_SUPPORTED_REPORT_VG();
        public final Unsigned8 properties3 = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfSupportedScheduleId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 numberOfSupportedCc = new Unsigned8();
        VG_SCHEDULE_SUPPORTED_REPORT_VG variantgroup1 = new VG_SCHEDULE_SUPPORTED_REPORT_VG();
        VG_SCHEDULE_SUPPORTED_REPORT_VG variantgroup2 = new VG_SCHEDULE_SUPPORTED_REPORT_VG();
        public final Unsigned8 properties3 = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfSupportedScheduleId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 numberOfSupportedCc = new Unsigned8();
        VG_SCHEDULE_SUPPORTED_REPORT_VG variantgroup1 = new VG_SCHEDULE_SUPPORTED_REPORT_VG();
        VG_SCHEDULE_SUPPORTED_REPORT_VG variantgroup2 = new VG_SCHEDULE_SUPPORTED_REPORT_VG();
        VG_SCHEDULE_SUPPORTED_REPORT_VG variantgroup3 = new VG_SCHEDULE_SUPPORTED_REPORT_VG();
        public final Unsigned8 properties3 = new Unsigned8();
    }

    /************************************************************/
	/* Schedule Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfSupportedScheduleId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 numberOfSupportedCc = new Unsigned8();
        VG_SCHEDULE_SUPPORTED_REPORT_VG variantgroup1 = new VG_SCHEDULE_SUPPORTED_REPORT_VG();
        VG_SCHEDULE_SUPPORTED_REPORT_VG variantgroup2 = new VG_SCHEDULE_SUPPORTED_REPORT_VG();
        VG_SCHEDULE_SUPPORTED_REPORT_VG variantgroup3 = new VG_SCHEDULE_SUPPORTED_REPORT_VG();
        VG_SCHEDULE_SUPPORTED_REPORT_VG variantgroup4 = new VG_SCHEDULE_SUPPORTED_REPORT_VG();
        public final Unsigned8 properties3 = new Unsigned8();
    }

    /************************************************************/
	/* Command Schedule Set variant group structs */
    /************************************************************/
    public static class VG_COMMAND_SCHEDULE_SET_1BYTE_VG extends Struct {
        public final Unsigned8 cmdLength = new Unsigned8();
        public final Unsigned8 cmdByte1 = new Unsigned8();
    }

    /************************************************************/
	/* Command Schedule Set variant group structs */
    /************************************************************/
    public static class VG_COMMAND_SCHEDULE_SET_2BYTE_VG extends Struct {
        public final Unsigned8 cmdLength = new Unsigned8();
        public final Unsigned8 cmdByte1 = new Unsigned8();
        public final Unsigned8 cmdByte2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Schedule Set variant group structs */
    /************************************************************/
    public static class VG_COMMAND_SCHEDULE_SET_3BYTE_VG extends Struct {
        public final Unsigned8 cmdLength = new Unsigned8();
        public final Unsigned8 cmdByte1 = new Unsigned8();
        public final Unsigned8 cmdByte2 = new Unsigned8();
        public final Unsigned8 cmdByte3 = new Unsigned8();
    }

    /************************************************************/
	/* Command Schedule Set variant group structs */
    /************************************************************/
    public static class VG_COMMAND_SCHEDULE_SET_4BYTE_VG extends Struct {
        public final Unsigned8 cmdLength = new Unsigned8();
        public final Unsigned8 cmdByte1 = new Unsigned8();
        public final Unsigned8 cmdByte2 = new Unsigned8();
        public final Unsigned8 cmdByte3 = new Unsigned8();
        public final Unsigned8 cmdByte4 = new Unsigned8();
    }

    /************************************************************/
	/* Command Schedule Set 1byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SCHEDULE_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 properties5 = new Unsigned8();
        public final Unsigned8 durationByte1 = new Unsigned8();
        public final Unsigned8 durationByte2 = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 numberOfCmdToFollow = new Unsigned8();
        VG_COMMAND_SCHEDULE_SET_4BYTE_VG variantgroup1 = new VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
    }

    /************************************************************/
	/* Command Schedule Set 2byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SCHEDULE_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 properties5 = new Unsigned8();
        public final Unsigned8 durationByte1 = new Unsigned8();
        public final Unsigned8 durationByte2 = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 numberOfCmdToFollow = new Unsigned8();
        VG_COMMAND_SCHEDULE_SET_4BYTE_VG variantgroup1 = new VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
        VG_COMMAND_SCHEDULE_SET_4BYTE_VG variantgroup2 = new VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
    }

    /************************************************************/
	/* Command Schedule Set 3byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SCHEDULE_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 properties5 = new Unsigned8();
        public final Unsigned8 durationByte1 = new Unsigned8();
        public final Unsigned8 durationByte2 = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 numberOfCmdToFollow = new Unsigned8();
        VG_COMMAND_SCHEDULE_SET_4BYTE_VG variantgroup1 = new VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
        VG_COMMAND_SCHEDULE_SET_4BYTE_VG variantgroup2 = new VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
        VG_COMMAND_SCHEDULE_SET_4BYTE_VG variantgroup3 = new VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
    }

    /************************************************************/
	/* Command Schedule Set 4byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SCHEDULE_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 properties5 = new Unsigned8();
        public final Unsigned8 durationByte1 = new Unsigned8();
        public final Unsigned8 durationByte2 = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 numberOfCmdToFollow = new Unsigned8();
        VG_COMMAND_SCHEDULE_SET_4BYTE_VG variantgroup1 = new VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
        VG_COMMAND_SCHEDULE_SET_4BYTE_VG variantgroup2 = new VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
        VG_COMMAND_SCHEDULE_SET_4BYTE_VG variantgroup3 = new VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
        VG_COMMAND_SCHEDULE_SET_4BYTE_VG variantgroup4 = new VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
    }

    /************************************************************/
	/* Command Schedule Get command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SCHEDULE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
    }

    /************************************************************/
	/* Command Schedule Report variant group structs */
    /************************************************************/
    public static class VG_COMMAND_SCHEDULE_REPORT_1BYTE_VG extends Struct {
        public final Unsigned8 cmdLength = new Unsigned8();
        public final Unsigned8 cmdByte1 = new Unsigned8();
    }

    /************************************************************/
	/* Command Schedule Report variant group structs */
    /************************************************************/
    public static class VG_COMMAND_SCHEDULE_REPORT_2BYTE_VG extends Struct {
        public final Unsigned8 cmdLength = new Unsigned8();
        public final Unsigned8 cmdByte1 = new Unsigned8();
        public final Unsigned8 cmdByte2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Schedule Report variant group structs */
    /************************************************************/
    public static class VG_COMMAND_SCHEDULE_REPORT_3BYTE_VG extends Struct {
        public final Unsigned8 cmdLength = new Unsigned8();
        public final Unsigned8 cmdByte1 = new Unsigned8();
        public final Unsigned8 cmdByte2 = new Unsigned8();
        public final Unsigned8 cmdByte3 = new Unsigned8();
    }

    /************************************************************/
	/* Command Schedule Report variant group structs */
    /************************************************************/
    public static class VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG extends Struct {
        public final Unsigned8 cmdLength = new Unsigned8();
        public final Unsigned8 cmdByte1 = new Unsigned8();
        public final Unsigned8 cmdByte2 = new Unsigned8();
        public final Unsigned8 cmdByte3 = new Unsigned8();
        public final Unsigned8 cmdByte4 = new Unsigned8();
    }

    /************************************************************/
	/* Command Schedule Report 1byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SCHEDULE_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 properties5 = new Unsigned8();
        public final Unsigned8 durationByte1 = new Unsigned8();
        public final Unsigned8 durationByte2 = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 numberOfCmdToFollow = new Unsigned8();
        VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG variantgroup1
                = new VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
    }

    /************************************************************/
	/* Command Schedule Report 2byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SCHEDULE_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 properties5 = new Unsigned8();
        public final Unsigned8 durationByte1 = new Unsigned8();
        public final Unsigned8 durationByte2 = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 numberOfCmdToFollow = new Unsigned8();
        VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG variantgroup1
                = new VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
        VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG variantgroup2
                = new VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
    }

    /************************************************************/
	/* Command Schedule Report 3byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SCHEDULE_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 properties5 = new Unsigned8();
        public final Unsigned8 durationByte1 = new Unsigned8();
        public final Unsigned8 durationByte2 = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 numberOfCmdToFollow = new Unsigned8();
        public final VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG variantgroup1
                = new VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
        public final VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG variantgroup2
                = new VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
        public final VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG variantgroup3
                = new VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
    }

    /************************************************************/
	/* Command Schedule Report 4byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_SCHEDULE_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
        public final Unsigned8 userIdentifier = new Unsigned8();
        public final Unsigned8 startYear = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
        public final Unsigned8 properties4 = new Unsigned8();
        public final Unsigned8 properties5 = new Unsigned8();
        public final Unsigned8 durationByte1 = new Unsigned8();
        public final Unsigned8 durationByte2 = new Unsigned8();
        public final Unsigned8 reportsToFollow = new Unsigned8();
        public final Unsigned8 numberOfCmdToFollow = new Unsigned8();
        public final VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG variantgroup1
                = new VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
        public final VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG variantgroup2
                = new VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
        public final VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG variantgroup3
                = new VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
        public final VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG variantgroup4
                = new VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
    }

    /************************************************************/
	/* Schedule Remove command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_REMOVE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
    }

    /************************************************************/
	/* Schedule State Set command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_STATE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 scheduleId = new Unsigned8();
        public final Unsigned8 scheduleState = new Unsigned8();
    }

    /************************************************************/
	/* Schedule State Get command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_STATE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Schedule State Report command class structs */
    /************************************************************/
    public static class ZW_SCHEDULE_STATE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfSupportedScheduleId = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 properties3 = new Unsigned8();
    }

    /************************************************************/
	/* Controller Change command class structs */
    /************************************************************/
    public static class ZW_CONTROLLER_CHANGE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 txOptions = new Unsigned8();
    }

    /************************************************************/
	/* Controller Change Status 1byte command class structs */
    /************************************************************/
    public static class ZW_CONTROLLER_CHANGE_STATUS_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 newNodeId = new Unsigned8();
        public final Unsigned8 nodeInfoLength = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
    }

    /************************************************************/
	/* Controller Change Status 2byte command class structs */
    /************************************************************/
    public static class ZW_CONTROLLER_CHANGE_STATUS_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 newNodeId = new Unsigned8();
        public final Unsigned8 nodeInfoLength = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
    }

    /************************************************************/
	/* Controller Change Status 3byte command class structs */
    /************************************************************/
    public static class ZW_CONTROLLER_CHANGE_STATUS_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 newNodeId = new Unsigned8();
        public final Unsigned8 nodeInfoLength = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
        public final Unsigned8 commandClass3 = new Unsigned8();
    }

    /************************************************************/
	/* Controller Change Status 4byte command class structs */
    /************************************************************/
    public static class ZW_CONTROLLER_CHANGE_STATUS_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 seqNo = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 newNodeId = new Unsigned8();
        public final Unsigned8 nodeInfoLength = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public final Unsigned8 basicDeviceClass = new Unsigned8();
        public final Unsigned8 genericDeviceClass = new Unsigned8();
        public final Unsigned8 specificDeviceClass = new Unsigned8();
        public final Unsigned8 commandClass1 = new Unsigned8();
        public final Unsigned8 commandClass2 = new Unsigned8();
        public final Unsigned8 commandClass3 = new Unsigned8();
        public final Unsigned8 commandClass4 = new Unsigned8();
    }

    /************************************************************/
	/* Zip Node Solicitation command class structs */
    /************************************************************/
    public static class ZW_ZIP_NODE_SOLICITATION_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
    }

    /************************************************************/
	/* Zip Inv Node Solicitation command class structs */
    /************************************************************/
    public static class ZW_ZIP_INV_NODE_SOLICITATION_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
    }

    /************************************************************/
	/* Zip Node Advertisement command class structs */
    /************************************************************/
    public static class ZW_ZIP_NODE_ADVERTISEMENT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 nodeId = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 homeId1 = new Unsigned8();
        public final Unsigned8 homeId2 = new Unsigned8();
        public final Unsigned8 homeId3 = new Unsigned8();
        public final Unsigned8 homeId4 = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Name Get command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_NAME_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Name Report 1byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_NAME_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 lengthOfName = new Unsigned8();
        public final Unsigned8 name1 = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Name Report 2byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_NAME_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 lengthOfName = new Unsigned8();
        public final Unsigned8 name1 = new Unsigned8();
        public final Unsigned8 name2 = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Name Report 3byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_NAME_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 lengthOfName = new Unsigned8();
        public final Unsigned8 name1 = new Unsigned8();
        public final Unsigned8 name2 = new Unsigned8();
        public final Unsigned8 name3 = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Name Report 4byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_NAME_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 lengthOfName = new Unsigned8();
        public final Unsigned8 name1 = new Unsigned8();
        public final Unsigned8 name2 = new Unsigned8();
        public final Unsigned8 name3 = new Unsigned8();
        public final Unsigned8 name4 = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Info Get command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_INFO_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Info Report variant group structs */
    /************************************************************/
    public static class VG_ASSOCIATION_GROUP_INFO_REPORT_VG extends Struct {
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
        public final Unsigned8 profile1 = new Unsigned8();
        public final Unsigned8 profile2 = new Unsigned8();
        public final Unsigned8 reserved = new Unsigned8();
        public final Unsigned8 eventCode1 = new Unsigned8();
        public final Unsigned8 eventCode2 = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Info Report 1byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_INFO_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final VG_ASSOCIATION_GROUP_INFO_REPORT_VG variantgroup1
                = new VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
    }

    /************************************************************/
	/* Association Group Info Report 2byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_INFO_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final VG_ASSOCIATION_GROUP_INFO_REPORT_VG variantgroup1
                = new VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
        public final VG_ASSOCIATION_GROUP_INFO_REPORT_VG variantgroup2
                = new VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
    }

    /************************************************************/
	/* Association Group Info Report 3byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_INFO_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final VG_ASSOCIATION_GROUP_INFO_REPORT_VG variantgroup1
                = new VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
        public final VG_ASSOCIATION_GROUP_INFO_REPORT_VG variantgroup2
                = new VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
        public final VG_ASSOCIATION_GROUP_INFO_REPORT_VG variantgroup3
                = new VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
    }

    /************************************************************/
	/* Association Group Info Report 4byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_INFO_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final VG_ASSOCIATION_GROUP_INFO_REPORT_VG variantgroup1
                = new VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
        public final VG_ASSOCIATION_GROUP_INFO_REPORT_VG variantgroup2
                = new VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
        public final VG_ASSOCIATION_GROUP_INFO_REPORT_VG variantgroup3
                = new VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
        public final VG_ASSOCIATION_GROUP_INFO_REPORT_VG variantgroup4
                = new VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
    }

    /************************************************************/
	/* Association Group Command List Get command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_COMMAND_LIST_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Command List Report 1byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 listLength = new Unsigned8();
        public final Unsigned8 command1 = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Command List Report 2byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 listLength = new Unsigned8();
        public final Unsigned8 command1 = new Unsigned8();
        public final Unsigned8 command2 = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Command List Report 3byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 listLength = new Unsigned8();
        public final Unsigned8 command1 = new Unsigned8();
        public final Unsigned8 command2 = new Unsigned8();
        public final Unsigned8 command3 = new Unsigned8();
    }

    /************************************************************/
	/* Association Group Command List Report 4byte command class structs */
    /************************************************************/
    public static class ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 listLength = new Unsigned8();
        public final Unsigned8 command1 = new Unsigned8();
        public final Unsigned8 command2 = new Unsigned8();
        public final Unsigned8 command3 = new Unsigned8();
        public final Unsigned8 command4 = new Unsigned8();
    }

    /************************************************************/
	/* Device Reset Locally Notification command class structs */
    /************************************************************/
    public static class ZW_DEVICE_RESET_LOCALLY_NOTIFICATION_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Central Scene Supported Get command class structs */
    /************************************************************/
    public static class ZW_CENTRAL_SCENE_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Central Scene Supported Report command class structs */
    /************************************************************/
    public static class ZW_CENTRAL_SCENE_SUPPORTED_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 supportedScenes = new Unsigned8();
    }

    /************************************************************/
	/* Central Scene Notification command class structs */
    /************************************************************/
    public static class ZW_CENTRAL_SCENE_NOTIFICATION_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 sequenceNumber = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 sceneNumber = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Set 1byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Set 2byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
        public final Unsigned8 resourceName2 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Set 3byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
        public final Unsigned8 resourceName2 = new Unsigned8();
        public final Unsigned8 resourceName3 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Set 4byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
        public final Unsigned8 resourceName2 = new Unsigned8();
        public final Unsigned8 resourceName3 = new Unsigned8();
        public final Unsigned8 resourceName4 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Get command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 index = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Report 1byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 index = new Unsigned8();
        public final Unsigned8 actualNodes = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Report 2byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 index = new Unsigned8();
        public final Unsigned8 actualNodes = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
        public final Unsigned8 resourceName2 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Report 3byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 index = new Unsigned8();
        public final Unsigned8 actualNodes = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
        public final Unsigned8 resourceName2 = new Unsigned8();
        public final Unsigned8 resourceName3 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Report 4byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 index = new Unsigned8();
        public final Unsigned8 actualNodes = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
        public final Unsigned8 resourceName2 = new Unsigned8();
        public final Unsigned8 resourceName3 = new Unsigned8();
        public final Unsigned8 resourceName4 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Remove 1byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_REMOVE_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Remove 2byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_REMOVE_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
        public final Unsigned8 resourceName2 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Remove 3byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_REMOVE_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
        public final Unsigned8 resourceName2 = new Unsigned8();
        public final Unsigned8 resourceName3 = new Unsigned8();
    }

    /************************************************************/
	/* Ip Association Remove 4byte command class structs */
    /************************************************************/
    public static class ZW_IP_ASSOCIATION_REMOVE_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 groupingIdentifier = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 endpoint = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 resourceName1 = new Unsigned8();
        public final Unsigned8 resourceName2 = new Unsigned8();
        public final Unsigned8 resourceName3 = new Unsigned8();
        public final Unsigned8 resourceName4 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Set 1byte command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 magicCode1 = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Set 2byte command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 magicCode1 = new Unsigned8();
        public final Unsigned8 magicCode2 = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Set 3byte command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 magicCode1 = new Unsigned8();
        public final Unsigned8 magicCode2 = new Unsigned8();
        public final Unsigned8 magicCode3 = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte3 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Set 4byte command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 magicCode1 = new Unsigned8();
        public final Unsigned8 magicCode2 = new Unsigned8();
        public final Unsigned8 magicCode3 = new Unsigned8();
        public final Unsigned8 magicCode4 = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte3 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte4 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Get command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Report 1byte command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 antiTheftProtectionStatus = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Report 2byte command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 antiTheftProtectionStatus = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Report 3byte command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 antiTheftProtectionStatus = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte3 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Report 4byte command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 antiTheftProtectionStatus = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte3 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte4 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Set 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_SET_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 magicCode1 = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Set 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_SET_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 magicCode1 = new Unsigned8();
        public final Unsigned8 magicCode2 = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Set 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_SET_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 magicCode1 = new Unsigned8();
        public final Unsigned8 magicCode2 = new Unsigned8();
        public final Unsigned8 magicCode3 = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte3 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Set 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_SET_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 magicCode1 = new Unsigned8();
        public final Unsigned8 magicCode2 = new Unsigned8();
        public final Unsigned8 magicCode3 = new Unsigned8();
        public final Unsigned8 magicCode4 = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte3 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte4 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Get V2 command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Report 1byte V2 command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_REPORT_1BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 antiTheftProtectionStatus = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Report 2byte V2 command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_REPORT_2BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 antiTheftProtectionStatus = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Report 3byte V2 command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_REPORT_3BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 antiTheftProtectionStatus = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte3 = new Unsigned8();
    }

    /************************************************************/
	/* Antitheft Report 4byte V2 command class structs */
    /************************************************************/
    public static class ZW_ANTITHEFT_REPORT_4BYTE_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 antiTheftProtectionStatus = new Unsigned8();
        public final Unsigned8 manufacturerId1 = new Unsigned8();
        public final Unsigned8 manufacturerId2 = new Unsigned8();
        public final Unsigned8 antiTheftHintNumberBytes = new Unsigned8();
        public final Unsigned8 antiTheftHintByte1 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte2 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte3 = new Unsigned8();
        public final Unsigned8 antiTheftHintByte4 = new Unsigned8();
    }

    /************************************************************/
	/* Zwaveplus Info Get command class structs */
    /************************************************************/
    public static class ZW_ZWAVEPLUS_INFO_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Zwaveplus Info Report command class structs */
    /************************************************************/
    public static class ZW_ZWAVEPLUS_INFO_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zWaveVersion = new Unsigned8();
        public final Unsigned8 roleType = new Unsigned8();
        public final Unsigned8 nodeType = new Unsigned8();
    }

    /************************************************************/
	/* Zwaveplus Info Get V2 command class structs */
    /************************************************************/
    public static class ZW_ZWAVEPLUS_INFO_GET_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Zwaveplus Info Report V2 command class structs */
    /************************************************************/
    public static class ZW_ZWAVEPLUS_INFO_REPORT_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 zWaveVersion = new Unsigned8();
        public final Unsigned8 roleType = new Unsigned8();
        public final Unsigned8 nodeType = new Unsigned8();
        public final Unsigned8 installerIconType1 = new Unsigned8();
        public final Unsigned8 installerIconType2 = new Unsigned8();
        public final Unsigned8 userIconType1 = new Unsigned8();
        public final Unsigned8 userIconType2 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Mode Set command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_MODE_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Mode Get command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_MODE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Mode Report command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_MODE_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 mode = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Peer Set 1byte command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_PEER_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 peerProfile = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 port1 = new Unsigned8();
        public final Unsigned8 port2 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 peerName1 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Peer Set 2byte command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_PEER_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 peerProfile = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 port1 = new Unsigned8();
        public final Unsigned8 port2 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 peerName1 = new Unsigned8();
        public final Unsigned8 peerName2 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Peer Set 3byte command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_PEER_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 peerProfile = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 port1 = new Unsigned8();
        public final Unsigned8 port2 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 peerName1 = new Unsigned8();
        public final Unsigned8 peerName2 = new Unsigned8();
        public final Unsigned8 peerName3 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Peer Set 4byte command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_PEER_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 peerProfile = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 port1 = new Unsigned8();
        public final Unsigned8 port2 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 peerName1 = new Unsigned8();
        public final Unsigned8 peerName2 = new Unsigned8();
        public final Unsigned8 peerName3 = new Unsigned8();
        public final Unsigned8 peerName4 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Peer Get command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_PEER_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 peerProfile = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Peer Report 1byte command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_PEER_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 peerProfile = new Unsigned8();
        public final Unsigned8 peerCount = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 port1 = new Unsigned8();
        public final Unsigned8 port2 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 peerName1 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Peer Report 2byte command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_PEER_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 peerProfile = new Unsigned8();
        public final Unsigned8 peerCount = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 port1 = new Unsigned8();
        public final Unsigned8 port2 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 peerName1 = new Unsigned8();
        public final Unsigned8 peerName2 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Peer Report 3byte command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_PEER_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 peerProfile = new Unsigned8();
        public final Unsigned8 peerCount = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 port1 = new Unsigned8();
        public final Unsigned8 port2 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 peerName1 = new Unsigned8();
        public final Unsigned8 peerName2 = new Unsigned8();
        public final Unsigned8 peerName3 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Peer Report 4byte command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_PEER_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 peerProfile = new Unsigned8();
        public final Unsigned8 peerCount = new Unsigned8();
        public final Unsigned8 ipv6Address1 = new Unsigned8();
        public final Unsigned8 ipv6Address2 = new Unsigned8();
        public final Unsigned8 ipv6Address3 = new Unsigned8();
        public final Unsigned8 ipv6Address4 = new Unsigned8();
        public final Unsigned8 ipv6Address5 = new Unsigned8();
        public final Unsigned8 ipv6Address6 = new Unsigned8();
        public final Unsigned8 ipv6Address7 = new Unsigned8();
        public final Unsigned8 ipv6Address8 = new Unsigned8();
        public final Unsigned8 ipv6Address9 = new Unsigned8();
        public final Unsigned8 ipv6Address10 = new Unsigned8();
        public final Unsigned8 ipv6Address11 = new Unsigned8();
        public final Unsigned8 ipv6Address12 = new Unsigned8();
        public final Unsigned8 ipv6Address13 = new Unsigned8();
        public final Unsigned8 ipv6Address14 = new Unsigned8();
        public final Unsigned8 ipv6Address15 = new Unsigned8();
        public final Unsigned8 ipv6Address16 = new Unsigned8();
        public final Unsigned8 port1 = new Unsigned8();
        public final Unsigned8 port2 = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 peerName1 = new Unsigned8();
        public final Unsigned8 peerName2 = new Unsigned8();
        public final Unsigned8 peerName3 = new Unsigned8();
        public final Unsigned8 peerName4 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Lock Set command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_LOCK_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
    }

    /************************************************************/
	/* Unsolicited Destination Set command class structs */
    /************************************************************/
    public static class ZW_UNSOLICITED_DESTINATION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination1 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination2 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination3 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination4 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination5 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination6 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination7 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination8 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination9 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination10 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination11 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination12 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination13 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination14 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination15 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination16 = new Unsigned8();
        public final Unsigned8 unsolicitedDestinationPort1 = new Unsigned8();
        public final Unsigned8 unsolicitedDestinationPort2 = new Unsigned8();
    }

    /************************************************************/
	/* Unsolicited Destination Get command class structs */
    /************************************************************/
    public static class ZW_UNSOLICITED_DESTINATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Unsolicited Destination Report command class structs */
    /************************************************************/
    public static class ZW_UNSOLICITED_DESTINATION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination1 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination2 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination3 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination4 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination5 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination6 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination7 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination8 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination9 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination10 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination11 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination12 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination13 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination14 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination15 = new Unsigned8();
        public final Unsigned8 unsolicitedIpv6Destination16 = new Unsigned8();
        public final Unsigned8 unsolicitedDestinationPort1 = new Unsigned8();
        public final Unsigned8 unsolicitedDestinationPort2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Application Node Info Set 1byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_APPLICATION_NODE_INFO_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
    }

    /************************************************************/
	/* Command Application Node Info Set 2byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_APPLICATION_NODE_INFO_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass2 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Application Node Info Set 3byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_APPLICATION_NODE_INFO_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass2 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass3 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass3 = new Unsigned8();
    }

    /************************************************************/
	/* Command Application Node Info Set 4byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_APPLICATION_NODE_INFO_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass2 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass3 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass4 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass3 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass4 = new Unsigned8();
    }

    /************************************************************/
	/* Command Application Node Info Get command class structs */
    /************************************************************/
    public static class ZW_COMMAND_APPLICATION_NODE_INFO_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Command Application Node Info Report 1byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
    }

    /************************************************************/
	/* Command Application Node Info Report 2byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass2 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass2 = new Unsigned8();
    }

    /************************************************************/
	/* Command Application Node Info Report 3byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass2 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass3 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass3 = new Unsigned8();
    }

    /************************************************************/
	/* Command Application Node Info Report 4byte command class structs */
    /************************************************************/
    public static class ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass1 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass2 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass3 = new Unsigned8();
        public final Unsigned8 nonSecureCommandClass4 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark1 = new Unsigned8();
        public final Unsigned8 securityScheme0Mark2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass1 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass2 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass3 = new Unsigned8();
        public final Unsigned8 securityScheme0CommandClass4 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Configuration Set command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_CONFIGURATION_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 lanIpv6Address1 = new Unsigned8();
        public final Unsigned8 lanIpv6Address2 = new Unsigned8();
        public final Unsigned8 lanIpv6Address3 = new Unsigned8();
        public final Unsigned8 lanIpv6Address4 = new Unsigned8();
        public final Unsigned8 lanIpv6Address5 = new Unsigned8();
        public final Unsigned8 lanIpv6Address6 = new Unsigned8();
        public final Unsigned8 lanIpv6Address7 = new Unsigned8();
        public final Unsigned8 lanIpv6Address8 = new Unsigned8();
        public final Unsigned8 lanIpv6Address9 = new Unsigned8();
        public final Unsigned8 lanIpv6Address10 = new Unsigned8();
        public final Unsigned8 lanIpv6Address11 = new Unsigned8();
        public final Unsigned8 lanIpv6Address12 = new Unsigned8();
        public final Unsigned8 lanIpv6Address13 = new Unsigned8();
        public final Unsigned8 lanIpv6Address14 = new Unsigned8();
        public final Unsigned8 lanIpv6Address15 = new Unsigned8();
        public final Unsigned8 lanIpv6Address16 = new Unsigned8();
        public final Unsigned8 lanIpv6PrefixLength = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix1 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix2 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix3 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix4 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix5 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix6 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix7 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix8 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix9 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix10 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix11 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix12 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix13 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix14 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix15 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix16 = new Unsigned8();
        public final Unsigned8 portalIpv6PrefixLength = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address1 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address2 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address3 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address4 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address5 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address6 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address7 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address8 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address9 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address10 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address11 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address12 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address13 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address14 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address15 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address16 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix1 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix2 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix3 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix4 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix5 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix6 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix7 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix8 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix9 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix10 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix11 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix12 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix13 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix14 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix15 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix16 = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Configuration Status command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_CONFIGURATION_STATUS_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 status = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Configuration Get command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_CONFIGURATION_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Gateway Configuration Report command class structs */
    /************************************************************/
    public static class ZW_GATEWAY_CONFIGURATION_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 lanIpv6Address1 = new Unsigned8();
        public final Unsigned8 lanIpv6Address2 = new Unsigned8();
        public final Unsigned8 lanIpv6Address3 = new Unsigned8();
        public final Unsigned8 lanIpv6Address4 = new Unsigned8();
        public final Unsigned8 lanIpv6Address5 = new Unsigned8();
        public final Unsigned8 lanIpv6Address6 = new Unsigned8();
        public final Unsigned8 lanIpv6Address7 = new Unsigned8();
        public final Unsigned8 lanIpv6Address8 = new Unsigned8();
        public final Unsigned8 lanIpv6Address9 = new Unsigned8();
        public final Unsigned8 lanIpv6Address10 = new Unsigned8();
        public final Unsigned8 lanIpv6Address11 = new Unsigned8();
        public final Unsigned8 lanIpv6Address12 = new Unsigned8();
        public final Unsigned8 lanIpv6Address13 = new Unsigned8();
        public final Unsigned8 lanIpv6Address14 = new Unsigned8();
        public final Unsigned8 lanIpv6Address15 = new Unsigned8();
        public final Unsigned8 lanIpv6Address16 = new Unsigned8();
        public final Unsigned8 lanIpv6PrefixLength = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix1 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix2 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix3 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix4 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix5 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix6 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix7 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix8 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix9 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix10 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix11 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix12 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix13 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix14 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix15 = new Unsigned8();
        public final Unsigned8 portalIpv6Prefix16 = new Unsigned8();
        public final Unsigned8 portalIpv6PrefixLength = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address1 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address2 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address3 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address4 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address5 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address6 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address7 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address8 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address9 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address10 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address11 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address12 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address13 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address14 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address15 = new Unsigned8();
        public final Unsigned8 defaultGatewayIpv6Address16 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix1 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix2 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix3 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix4 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix5 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix6 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix7 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix8 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix9 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix10 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix11 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix12 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix13 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix14 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix15 = new Unsigned8();
        public final Unsigned8 panIpv6Prefix16 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Type Get command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_TYPE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Type Report 1byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_TYPE_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceModeSupportedBitmask1 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Type Report 2byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_TYPE_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceModeSupportedBitmask1 = new Unsigned8();
        public final Unsigned8 applianceModeSupportedBitmask2 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Type Report 3byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_TYPE_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceModeSupportedBitmask1 = new Unsigned8();
        public final Unsigned8 applianceModeSupportedBitmask2 = new Unsigned8();
        public final Unsigned8 applianceModeSupportedBitmask3 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Type Report 4byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_TYPE_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceModeSupportedBitmask1 = new Unsigned8();
        public final Unsigned8 applianceModeSupportedBitmask2 = new Unsigned8();
        public final Unsigned8 applianceModeSupportedBitmask3 = new Unsigned8();
        public final Unsigned8 applianceModeSupportedBitmask4 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Program Supported Get command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_PROGRAM_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Program Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Program Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Program Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Program Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Set 1byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_SET_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceProgram = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Set 2byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_SET_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceProgram = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Set 3byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_SET_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceProgram = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
        public final Unsigned8 manufacturerData3 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Set 4byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_SET_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceProgram = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
        public final Unsigned8 manufacturerData3 = new Unsigned8();
        public final Unsigned8 manufacturerData4 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Get command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Report 1byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceProgram = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Report 2byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceProgram = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Report 3byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceProgram = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
        public final Unsigned8 manufacturerData3 = new Unsigned8();
    }

    /************************************************************/
	/* Appliance Report 4byte command class structs */
    /************************************************************/
    public static class ZW_APPLIANCE_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 applianceProgram = new Unsigned8();
        public final Unsigned8 manufacturerData1 = new Unsigned8();
        public final Unsigned8 manufacturerData2 = new Unsigned8();
        public final Unsigned8 manufacturerData3 = new Unsigned8();
        public final Unsigned8 manufacturerData4 = new Unsigned8();
    }

    /************************************************************/
	/* Dmx Address Set command class structs */
    /************************************************************/
    public static class ZW_DMX_ADDRESS_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 channelId = new Unsigned8();
    }

    /************************************************************/
	/* Dmx Address Get command class structs */
    /************************************************************/
    public static class ZW_DMX_ADDRESS_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Dmx Address Report command class structs */
    /************************************************************/
    public static class ZW_DMX_ADDRESS_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 channelId = new Unsigned8();
    }

    /************************************************************/
	/* Dmx Capability Get command class structs */
    /************************************************************/
    public static class ZW_DMX_CAPABILITY_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 channelId = new Unsigned8();
    }

    /************************************************************/
	/* Dmx Capability Report command class structs */
    /************************************************************/
    public static class ZW_DMX_CAPABILITY_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 channelId = new Unsigned8();
        public final Unsigned8 propertyId1 = new Unsigned8();
        public final Unsigned8 propertyId2 = new Unsigned8();
        public final Unsigned8 deviceChannels = new Unsigned8();
        public final Unsigned8 maxChannels = new Unsigned8();
    }

    /************************************************************/
	/* Dmx Data 40 command class structs */
    /************************************************************/
    public static class ZW_DMX_DATA_40_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 source = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 dmxChannel1 = new Unsigned8();
        public final Unsigned8 dmxChannel2 = new Unsigned8();
        public final Unsigned8 dmxChannel3 = new Unsigned8();
        public final Unsigned8 dmxChannel4 = new Unsigned8();
        public final Unsigned8 dmxChannel5 = new Unsigned8();
        public final Unsigned8 dmxChannel6 = new Unsigned8();
        public final Unsigned8 dmxChannel7 = new Unsigned8();
        public final Unsigned8 dmxChannel8 = new Unsigned8();
        public final Unsigned8 dmxChannel9 = new Unsigned8();
        public final Unsigned8 dmxChannel10 = new Unsigned8();
        public final Unsigned8 dmxChannel11 = new Unsigned8();
        public final Unsigned8 dmxChannel12 = new Unsigned8();
        public final Unsigned8 dmxChannel13 = new Unsigned8();
        public final Unsigned8 dmxChannel14 = new Unsigned8();
        public final Unsigned8 dmxChannel15 = new Unsigned8();
        public final Unsigned8 dmxChannel16 = new Unsigned8();
        public final Unsigned8 dmxChannel17 = new Unsigned8();
        public final Unsigned8 dmxChannel18 = new Unsigned8();
        public final Unsigned8 dmxChannel19 = new Unsigned8();
        public final Unsigned8 dmxChannel20 = new Unsigned8();
        public final Unsigned8 dmxChannel21 = new Unsigned8();
        public final Unsigned8 dmxChannel22 = new Unsigned8();
        public final Unsigned8 dmxChannel23 = new Unsigned8();
        public final Unsigned8 dmxChannel24 = new Unsigned8();
        public final Unsigned8 dmxChannel25 = new Unsigned8();
        public final Unsigned8 dmxChannel26 = new Unsigned8();
        public final Unsigned8 dmxChannel27 = new Unsigned8();
        public final Unsigned8 dmxChannel28 = new Unsigned8();
        public final Unsigned8 dmxChannel29 = new Unsigned8();
        public final Unsigned8 dmxChannel30 = new Unsigned8();
        public final Unsigned8 dmxChannel31 = new Unsigned8();
        public final Unsigned8 dmxChannel32 = new Unsigned8();
        public final Unsigned8 dmxChannel33 = new Unsigned8();
        public final Unsigned8 dmxChannel34 = new Unsigned8();
        public final Unsigned8 dmxChannel35 = new Unsigned8();
        public final Unsigned8 dmxChannel36 = new Unsigned8();
        public final Unsigned8 dmxChannel37 = new Unsigned8();
        public final Unsigned8 dmxChannel38 = new Unsigned8();
        public final Unsigned8 dmxChannel39 = new Unsigned8();
        public final Unsigned8 dmxChannel40 = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Set command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 requestedBarrierState = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Get command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Report command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 barrierState = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Signal Supported Get command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Signal Supported Report 1byte command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_1BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Signal Supported Report 2byte command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_2BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Signal Supported Report 3byte command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_3BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Signal Supported Report 4byte command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_4BYTE_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 bitMask1 = new Unsigned8();
        public final Unsigned8 bitMask2 = new Unsigned8();
        public final Unsigned8 bitMask3 = new Unsigned8();
        public final Unsigned8 bitMask4 = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Signal Set command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_SIGNAL_SET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 subsystemType = new Unsigned8();
        public final Unsigned8 subsystemState = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Signal Get command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_SIGNAL_GET_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 subsystemType = new Unsigned8();
    }

    /************************************************************/
	/* Barrier Operator Signal Report command class structs */
    /************************************************************/
    public static class ZW_BARRIER_OPERATOR_SIGNAL_REPORT_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 subsystemType = new Unsigned8();
        public final Unsigned8 subsystemState = new Unsigned8();
    }

    /**********************************************************************/
    /* Command class structs use to encapsulating other commands          */
    /* Do not define these commands in ZW_FRAME_COLLECTION_MACRO          */
    /* Do not include commands defined in ZW_FRAME_COLLECTION_MACRO below */
    /**********************************************************************/
    public static class ALL_EXCEPT_ENCAP extends ZW_FRAME_COLLECTION_MACRO {
        public ALL_EXCEPT_ENCAP() {
            /* FIXME: If add a struct into this class, please note ByteBuffer */
        }
        /*
        FIXME
        ZW_FRAME_COLLECTION_MACRO0
        ZW_FRAME_COLLECTION_MACRO1
        ZW_FRAME_COLLECTION_MACRO2
        ZW_FRAME_COLLECTION_MACRO3

        Above MACROs externd frome ZW_FRAME_COLLECTION_MACRO
        ZW_FRAME_COLLECTION_MACRO is a Union Struct
        */

        public ALL_EXCEPT_ENCAP(byte[] data) {
            /* FIXME: If add a struct into this class, please note ByteBuffer */
            setData(data);
        }

        public void setData(byte[] data) {
            int length = this.getByteBuffer().array().length;
            length = (length > data.length)?data.length:length;
            System.arraycopy(data, 0, this.getByteBuffer().array(), 0, length);
        }
    }

    public static class ZW_MULTI_COMMAND_ENCAP_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 numberOfCommands = new Unsigned8();
        public final Unsigned8 commandLength = new Unsigned8();
        public ALL_EXCEPT_ENCAP encapFrame;
    }

    public static class ZW_COMPOSITE_CMD_ENCAP_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 endPointMask1 = new Unsigned8();
        public final Unsigned8 endPointMask2 = new Unsigned8();
        public ALL_EXCEPT_ENCAP encapFrame;
    }

    public static class ZW_COMPOSITE_REPLY_ENCAP_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 endPoint = new Unsigned8();
        public ALL_EXCEPT_ENCAP encapFrame;
    }

    public static class ZW_MULTI_INSTANCE_CMD_ENCAP_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 instance = new Unsigned8();
        public ALL_EXCEPT_ENCAP encapFrame;
    }

    public static class ZW_MULTI_CHANNEL_CMD_ENCAP_V2_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 properties1 = new Unsigned8();
        public final Unsigned8 properties2 = new Unsigned8();
        public ALL_EXCEPT_ENCAP encapFrame;
    }

    public static class ZW_SECURITY_MESSAGE_ENCAP_FRAME extends Struct {
        public final Unsigned8 cmdClass = new Unsigned8();
        public final Unsigned8 cmd = new Unsigned8();
        public final Unsigned8 initVectorByte1 = new Unsigned8();
        public final Unsigned8 initVectorByte2 = new Unsigned8();
        public final Unsigned8 initVectorByte3 = new Unsigned8();
        public final Unsigned8 initVectorByte4 = new Unsigned8();
        public final Unsigned8 initVectorByte5 = new Unsigned8();
        public final Unsigned8 initVectorByte6 = new Unsigned8();
        public final Unsigned8 initVectorByte7 = new Unsigned8();
        public final Unsigned8 initVectorByte8 = new Unsigned8();
        public final Unsigned8[] securityEncapMessage = array(new Unsigned8[29]);
        public final Unsigned8 receiverNonceIdent = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte1 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte2 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte3 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte4 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte5 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte6 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte7 = new Unsigned8();
        public final Unsigned8 messageAuthenticationCodeByte8 = new Unsigned8();
    }

    /************************************************************/
    /* Union of all command classes                             */
    /************************************************************/
    public static class ZW_APPLICATION_TX_BUFFER extends ZW_FRAME_COLLECTION_MACRO {
        public ZW_APPLICATION_TX_BUFFER() {
            ZW_MultiCommandEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_CompositeCmdEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_CompositeReplyEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_MultiInstanceCmdEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_MultiChannelCmdEncapV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        }

        public ZW_APPLICATION_TX_BUFFER(byte[] data) {
            setData(data);
            ZW_MultiCommandEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_CompositeCmdEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_CompositeReplyEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_MultiInstanceCmdEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_MultiChannelCmdEncapV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        }

        public void setData(byte[] data) {
            int length = this.getByteBuffer().array().length;
            length = (length > data.length)?data.length:length;
            System.arraycopy(data, 0, this.getByteBuffer().array(), 0, length);
        }

        public final ZW_MULTI_COMMAND_ENCAP_FRAME ZW_MultiCommandEncapFrame
                = new ZW_MULTI_COMMAND_ENCAP_FRAME();
        public final ZW_COMPOSITE_CMD_ENCAP_FRAME ZW_CompositeCmdEncapFrame
                = new ZW_COMPOSITE_CMD_ENCAP_FRAME();
        public final ZW_COMPOSITE_REPLY_ENCAP_FRAME ZW_CompositeReplyEncapFrame
                = new ZW_COMPOSITE_REPLY_ENCAP_FRAME();
        public final ZW_MULTI_INSTANCE_CMD_ENCAP_FRAME ZW_MultiInstanceCmdEncapFrame
                = new ZW_MULTI_INSTANCE_CMD_ENCAP_FRAME();
        public final ZW_MULTI_CHANNEL_CMD_ENCAP_V2_FRAME ZW_MultiChannelCmdEncapV2Frame
                = new ZW_MULTI_CHANNEL_CMD_ENCAP_V2_FRAME();
        /*
        FIXME
        ZW_FRAME_COLLECTION_MACRO0
        ZW_FRAME_COLLECTION_MACRO1
        ZW_FRAME_COLLECTION_MACRO2
        ZW_FRAME_COLLECTION_MACRO3

        Above MACROs externd frome ZW_FRAME_COLLECTION_MACRO
        ZW_FRAME_COLLECTION_MACRO is a Union Struct
        */
    }

    /************************************************************/
    /* Union of all command classes with room for a full        */
    /* meta data frame                                          */
    /************************************************************/
    public static class ZW_APPLICATION_META_TX_BUFFER extends ZW_FRAME_COLLECTION_MACRO {

        public ZW_APPLICATION_META_TX_BUFFER() {
            ZW_MultiCommandEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_CompositeCmdEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_CompositeReplyEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_MultiInstanceCmdEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_MultiChannelCmdEncapV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        }

        public ZW_APPLICATION_META_TX_BUFFER(byte[] data) {
            setData(data);
            ZW_MultiCommandEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_CompositeCmdEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_CompositeReplyEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_MultiInstanceCmdEncapFrame.setByteBuffer(this.getByteBuffer(), 0);
            ZW_MultiChannelCmdEncapV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        }

        public void setData(byte[] data) {
            int length = this.getByteBuffer().array().length;
            length = (length > data.length)?data.length:length;
            System.arraycopy(data, 0, this.getByteBuffer().array(), 0, length);
        }

        public final ZW_MULTI_COMMAND_ENCAP_FRAME ZW_MultiCommandEncapFrame
                = new ZW_MULTI_COMMAND_ENCAP_FRAME();
        public final ZW_COMPOSITE_CMD_ENCAP_FRAME ZW_CompositeCmdEncapFrame
                = new ZW_COMPOSITE_CMD_ENCAP_FRAME();
        public final ZW_COMPOSITE_REPLY_ENCAP_FRAME ZW_CompositeReplyEncapFrame
                = new ZW_COMPOSITE_REPLY_ENCAP_FRAME();
        public final ZW_MULTI_INSTANCE_CMD_ENCAP_FRAME ZW_MultiInstanceCmdEncapFrame
                = new ZW_MULTI_INSTANCE_CMD_ENCAP_FRAME();
        public final ZW_MULTI_CHANNEL_CMD_ENCAP_V2_FRAME ZW_MultiChannelCmdEncapV2Frame
                = new ZW_MULTI_CHANNEL_CMD_ENCAP_V2_FRAME();
        /*
        FIXME
        ZW_FRAME_COLLECTION_MACRO0
        ZW_FRAME_COLLECTION_MACRO1
        ZW_FRAME_COLLECTION_MACRO2
        ZW_FRAME_COLLECTION_MACRO3

        Above MACROs externd frome ZW_FRAME_COLLECTION_MACRO
        ZW_FRAME_COLLECTION_MACRO is a Union Struct
        */
        public final Unsigned8[] bPadding = array(new Unsigned8[META_DATA_MAX_DATA_SIZE]);
    }
}
