package com.ssj.zwave.commandclass;

import javolution.io.Union;

public class ZW_FRAME_COLLECTION_MACRO extends Union {

    private static final int MAX_UNION_BUFFER_SIZE = 256;

    public ZW_FRAME_COLLECTION_MACRO() {
        ZW_Common.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmTypeSupportedGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmTypeSupportedReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmTypeSupportedReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmTypeSupportedReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AlarmTypeSupportedReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSupportedGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSupportedReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSupportedReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSupportedReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSupportedReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EventSupportedGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EventSupportedReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EventSupportedReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EventSupportedReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EventSupportedReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationGetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationReport1byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationReport2byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationReport3byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationReport4byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSupportedGetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSupportedReport1byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSupportedReport2byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSupportedReport3byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NotificationSupportedReport4byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EventSupportedGetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EventSupportedReport1byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EventSupportedReport2byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EventSupportedReport3byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EventSupportedReport4byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplicationBusyFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplicationRejectedRequestFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandConfigurationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandConfigurationReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandConfigurationReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandConfigurationReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandConfigurationReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandConfigurationSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandConfigurationSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandConfigurationSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandConfigurationSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandRecordsSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandRecordsSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupingsGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupingsReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationRemove1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationRemove2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationRemove3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationRemove4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupingsGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupingsReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationRemove1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationRemove2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationRemove3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationRemove4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationSet1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationSet2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationSet3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationSet4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationSpecificGroupGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationSpecificGroupReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvContentBrowseMdByLetterGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvContentBrowseMdByLetterReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvContentBrowseMdChildCountGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvContentBrowseMdChildCountReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvContentBrowseMdGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvContentBrowseMdReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvMatchItemToRendererMdGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvMatchItemToRendererMdReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvContentSearchMdGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvContentSearchMdReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvRendererStatusGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvRendererStatusReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvTaggingMdGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AvTaggingMdReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BasicTariffInfoGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BasicTariffInfoReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BasicWindowCoveringStartLevelChangeFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BasicWindowCoveringStopLevelChangeFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BasicGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BasicReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BasicSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BatteryGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BatteryReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmLogGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmLogReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmLogSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmStatusGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmStatusReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmStatusSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmTempGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmTempReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmTempReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmTempReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmTempReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmTempSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmTempSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmTempSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanAlarmTempSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanBoostTimeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanBoostTimeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanBoostTimeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanDefaultSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanMinSpeedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanMinSpeedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanMinSpeedSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanModeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanModeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanModeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSetupGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSetupReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSetupReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSetupReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSetupReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSetupSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSetupSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSetupSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSetupSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSpeedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSpeedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanSpeedSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStartTempGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStartTempReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStartTempReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStartTempReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStartTempReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStartTempSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStartTempSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStartTempSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStartTempSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStateGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStateReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStateSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStatusGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStatusReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStatusReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStatusReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStatusReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTempGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTempReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTempReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTempReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTempReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTempSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTempSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTempSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTempSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTimeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTimeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ChimneyFanStopTimeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleChangedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleChangedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleOverrideGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleOverrideReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleOverrideSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ClockGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ClockReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ClockSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationBulkGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_ConfigurationBulkReport1byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ConfigurationBulkReport2byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ConfigurationBulkReport3byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ConfigurationBulkReport4byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationBulkReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationBulkReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationBulkReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationBulkReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_ConfigurationBulkSet1byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ConfigurationBulkSet2byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ConfigurationBulkSet3byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ConfigurationBulkSet4byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationBulkSet1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationBulkSet2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationBulkSet3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationBulkSet4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationSet1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationSet2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationSet3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ConfigurationSet4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CtrlReplicationTransferGroupFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CtrlReplicationTransferGroupName1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CtrlReplicationTransferGroupName2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CtrlReplicationTransferGroupName3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CtrlReplicationTransferGroupName4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CtrlReplicationTransferSceneFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CtrlReplicationTransferSceneName1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CtrlReplicationTransferSceneName2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CtrlReplicationTransferSceneName3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CtrlReplicationTransferSceneName4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListRemoveFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_DcpListSetVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpEventStatusGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpEventStatusReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_DcpListReportVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DcpListReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockLoggingRecordsSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockLoggingRecordsSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RecordGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RecordReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RecordReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RecordReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RecordReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockConfigurationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockConfigurationReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockConfigurationSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockOperationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockOperationReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockOperationSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockConfigurationGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockConfigurationReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockConfigurationSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockOperationGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockOperationReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DoorLockOperationSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EnergyProductionGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EnergyProductionReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EnergyProductionReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EnergyProductionReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_EnergyProductionReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareMdGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareMdReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdRequestGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdRequestReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdStatusReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareMdGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareMdReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdRequestGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdRequestReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdStatusReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareMdGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_FirmwareMdReportV3VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareMdReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareMdReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareMdReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareMdReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdRequestGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdRequestReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FirmwareUpdateMdStatusReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GeographicLocationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GeographicLocationReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GeographicLocationSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GroupingNameGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GroupingNameReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GroupingNameSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HailFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlBypassGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlBypassReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlBypassSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlModeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlModeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlModeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlModeSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlModeSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlModeSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlModeSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlModeSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlVentilationRateGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlVentilationRateReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvControlVentilationRateSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvStatusGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvStatusReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvStatusReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvStatusReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvStatusReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvStatusSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvStatusSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvStatusSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvStatusSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_HrvStatusSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IndicatorGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IndicatorReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IndicatorSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpConfigurationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpConfigurationReleaseFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpConfigurationRenewFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpConfigurationReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpConfigurationSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LanguageGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LanguageReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LanguageSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LockGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LockReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LockSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ManufacturerSpecificGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ManufacturerSpecificReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ManufacturerSpecificGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ManufacturerSpecificReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DeviceSpecificGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DeviceSpecificReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DeviceSpecificReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DeviceSpecificReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DeviceSpecificReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterPulseGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterPulseReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_MeterTblStatusReportVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusDateGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusDepthGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblCurrentDataGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_MeterTblCurrentDataReportVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblCurrentDataReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblCurrentDataReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblCurrentDataReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblCurrentDataReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblHistoricalDataGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_MeterTblHistoricalDataReportVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblHistoricalDataReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblHistoricalDataReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblHistoricalDataReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblHistoricalDataReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableCapabilityGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableIdGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableIdReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableIdReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableIdReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableIdReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_MeterTblStatusReportV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusDateGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusDepthGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusSupportedGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblStatusSupportedReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblCurrentDataGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_MeterTblCurrentDataReportV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblCurrentDataReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblCurrentDataReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblCurrentDataReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblCurrentDataReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblHistoricalDataGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_MeterTblHistoricalDataReportV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblHistoricalDataReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblHistoricalDataReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblHistoricalDataReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblHistoricalDataReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableCapabilityGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableIdGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableIdReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableIdReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableIdReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTableIdReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblTablePointAdmNoReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblPushConfigurationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblPushConfigurationReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterTblPushConfigurationSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterResetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterSupportedGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterSupportedReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterResetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterSupportedGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterSupportedReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterGetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport1byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport2byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport3byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterReport4byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterResetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterSupportedGetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterSupportedReport1byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterSupportedReport2byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterSupportedReport3byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MeterSupportedReport4byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MoveToPositionGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MoveToPositionReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MoveToPositionSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationGroupingsGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationGroupingsReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationRemove1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationRemove2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationRemove3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationRemove4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationSet1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationSet2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationSet3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelAssociationSet4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelCapabilityGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelCapabilityReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelCapabilityReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelCapabilityReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelCapabilityReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointFindV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_MultiChannelEndPointFindReportV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointFindReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointFindReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointFindReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointFindReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelCapabilityGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelCapabilityReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelCapabilityReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelCapabilityReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelCapabilityReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointFindV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_MultiChannelEndPointFindReportV3VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointFindReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointFindReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointFindReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointFindReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiChannelEndPointReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationGroupingsGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationGroupingsReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationRemove1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationRemove2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationRemove3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationRemove4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceAssociationSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_MultiInstanceReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeInfoCachedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeInfoCachedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeInfoCachedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeInfoCachedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeInfoCachedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeListGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeListReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeListReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeListReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeListReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LearnModeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LearnModeSetStatusFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeInformationSendFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NetworkUpdateRequestFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NetworkUpdateRequestStatusFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DefaultSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DefaultSetCompleteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FailedNodeRemoveFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FailedNodeRemoveStatusFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeAddFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeAddStatus1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeAddStatus2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeAddStatus3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeAddStatus4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeRemoveFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeRemoveStatusFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FailedNodeReplaceFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_FailedNodeReplaceStatusFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeNeighborUpdateRequestFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeNeighborUpdateStatusFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ReturnRouteAssignFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ReturnRouteAssignCompleteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ReturnRouteDeleteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ReturnRouteDeleteCompleteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeNamingNodeLocationReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeNamingNodeLocationSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeNamingNodeLocationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeNamingNodeNameGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeNamingNodeNameReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NodeNamingNodeNameSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_PowerlevelGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_PowerlevelReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_PowerlevelSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_PowerlevelTestNodeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_PowerlevelTestNodeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_PowerlevelTestNodeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CmdEncapsulation1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CmdEncapsulation2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CmdEncapsulation3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CmdEncapsulation4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_PrepaymentBalanceGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_PrepaymentBalanceReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_PrepaymentSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_PrepaymentSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietaryGet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietaryGet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietaryGet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietaryGet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietaryReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietaryReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietaryReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietaryReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietarySet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietarySet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietarySet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProprietarySet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionEcGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionEcReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionEcSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionSupportedGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionSupportedReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionTimeoutGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionTimeoutReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ProtectionTimeoutSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblRemove1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblRemove2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblRemove3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblRemove4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblActiveRateGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblActiveRateReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblCurrentDataGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_RateTblCurrentDataReportVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblCurrentDataReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblCurrentDataReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblCurrentDataReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblCurrentDataReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblHistoricalDataGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_RateTblHistoricalDataReportVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblHistoricalDataReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblHistoricalDataReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblHistoricalDataReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblHistoricalDataReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RateTblSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RemoteAssociationActivateFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RemoteAssociationConfigurationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RemoteAssociationConfigurationReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_RemoteAssociationConfigurationSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SceneActivationSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SceneActuatorConfGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SceneActuatorConfReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SceneActuatorConfSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SceneControllerConfGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SceneControllerConfReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SceneControllerConfSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockEnableAllSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockEnableSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockWeekDayGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockWeekDayReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockWeekDaySetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockYearDayGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockYearDayReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockYearDaySetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryTypeSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryTypeSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockEnableAllSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockEnableSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockTimeOffsetGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockTimeOffsetReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockTimeOffsetSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockWeekDayGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockWeekDayReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockWeekDaySetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockYearDayGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockYearDayReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockYearDaySetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryTypeSupportedGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryTypeSupportedReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockEnableAllSetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockEnableSetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockTimeOffsetGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockTimeOffsetReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockTimeOffsetSetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockWeekDayGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockWeekDayReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockWeekDaySetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockYearDayGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockYearDayReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockYearDaySetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryTypeSupportedGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryTypeSupportedReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockDailyRepeatingGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockDailyRepeatingReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleEntryLockDailyRepeatingSetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenAttributesGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenAttributesReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenAttributesGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenAttributesReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenMdGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_ScreenMdReport1byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ScreenMdReport2byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ScreenMdReport3byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ScreenMdReport4byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenMdReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenMdReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenMdReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenMdReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenMdGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_ScreenMdReport1byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ScreenMdReport2byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ScreenMdReport3byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_ScreenMdReport4byteV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenMdReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenMdReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenMdReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScreenMdReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelModeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelModeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelModeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelModeSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelModeSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandClassSecurityPanelZoneSensorInstalledReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneSensorTypeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneSensorTypeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneSensorInstalledGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneSensorStateGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneSensorStateReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneNumberSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneStateGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneStateReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneTypeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityPanelZoneTypeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NetworkKeySet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NetworkKeySet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NetworkKeySet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NetworkKeySet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_NetworkKeyVerifyFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityCommandsSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityCommandsSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityCommandsSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityCommandsSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityCommandsSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityMessageEncapsulation1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityMessageEncapsulation2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityMessageEncapsulation3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityMessageEncapsulation4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityMessageEncapsulationNonceGet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityMessageEncapsulationNonceGet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityMessageEncapsulationNonceGet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityMessageEncapsulationNonceGet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityNonceGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecurityNonceReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecuritySchemeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecuritySchemeInheritFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SecuritySchemeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorBinaryGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorBinaryReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorBinaryGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorBinaryReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorBinarySupportedGetSensorV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorBinarySupportedSensorReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorBinarySupportedSensorReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorBinarySupportedSensorReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorBinarySupportedSensorReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorTriggerLevelGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorTriggerLevelReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorTriggerLevelReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorTriggerLevelReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorTriggerLevelReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorTriggerLevelSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorTriggerLevelSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorTriggerLevelSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorTriggerLevelSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelGetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport1byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport2byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport3byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport4byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelGetV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport1byteV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport2byteV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport3byteV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport4byteV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedGetSensorV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport1byteV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport2byteV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport3byteV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport4byteV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedGetScaleV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedScaleReportV5Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelGetV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport1byteV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport2byteV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport3byteV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport4byteV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedGetSensorV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport1byteV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport2byteV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport3byteV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport4byteV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedGetScaleV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedScaleReportV6Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelGetV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport1byteV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport2byteV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport3byteV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelReport4byteV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedGetSensorV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport1byteV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport2byteV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport3byteV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedSensorReport4byteV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedGetScaleV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorMultilevelSupportedScaleReportV7Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SensorAlarmSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_SimpleAvControlSetVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SimpleAvControlSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchAllGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchAllOffFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchAllOnFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchAllReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchAllSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchBinaryGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchBinaryReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchBinarySetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelStartLevelChangeFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelStopLevelChangeFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelStartLevelChangeV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelStopLevelChangeV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelSetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelStartLevelChangeV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelStopLevelChangeV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelSupportedGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchMultilevelSupportedReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchToggleBinarySetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchToggleBinaryGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchToggleBinaryReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchToggleMultilevelSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchToggleMultilevelGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchToggleMultilevelReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchToggleMultilevelStartLevelChangeFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchToggleMultilevelStopLevelChangeFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblRemove1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblRemove2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblRemove3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblRemove4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblSupplierSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblSupplierSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblSupplierSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblSupplierSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblCostGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblCostReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblSupplierGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblSupplierReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblSupplierReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblSupplierReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TariffTblSupplierReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeReportV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeGetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeReportV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedGetV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport1byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport2byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport3byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanModeSupportedReport4byteV4Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanStateGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanStateReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanStateGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatFanStateReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingStatusReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingModeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingModeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingModeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingRelayStatusGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingRelayStatusReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingSetpointGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingSetpointReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingSetpointReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingSetpointReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingSetpointReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingSetpointSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingSetpointSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingSetpointSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingSetpointSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingStatusGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingStatusSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatHeatingTimedOffSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSet1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSet2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSet3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSet4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatModeSupportedReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateLoggingSupportedGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingLoggingSupportedReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingLoggingSupportedReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingLoggingSupportedReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingLoggingSupportedReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateLoggingGet1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateLoggingGet2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateLoggingGet3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateLoggingGet4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_ThermostatOperatingStateLoggingReportV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateLoggingReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateLoggingReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateLoggingReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatOperatingStateLoggingReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetbackGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetbackReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetbackSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSet4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointSupportedReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointCapabilitiesGetV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointCapabilitiesReport1byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointCapabilitiesReport2byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointCapabilitiesReport3byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ThermostatSetpointCapabilitiesReport4byteV3Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TimeParametersGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TimeParametersReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TimeParametersSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DateGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DateReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TimeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TimeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DateGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DateReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TimeGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TimeOffsetGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TimeOffsetReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TimeOffsetSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_TimeReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFirstFragment1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFirstFragment2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFirstFragment3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFirstFragment4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentCompleteFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_CommandFragmentRequestVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentRequest1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentRequest2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentRequest3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentRequest4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentWaitFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandSubsequentFragment1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandSubsequentFragment2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandSubsequentFragment3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandSubsequentFragment4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFirstFragment1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFirstFragment2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFirstFragment3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFirstFragment4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentCompleteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_CommandFragmentRequestV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentRequest1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentRequest2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentRequest3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentRequest4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandFragmentWaitV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandSubsequentFragment1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandSubsequentFragment2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandSubsequentFragment3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandSubsequentFragment4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_UserCodeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_UserCodeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_UserCodeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_UsersNumberGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_UsersNumberReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionCommandClassGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionCommandClassReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionCommandClassGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionCommandClassReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_VersionReportV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_VersionReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpIntervalGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpIntervalReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpIntervalSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpNoMoreInformationFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpNotificationFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpIntervalCapabilitiesGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpIntervalCapabilitiesReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpIntervalGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpIntervalReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpIntervalSetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpNoMoreInformationV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_WakeUpNotificationV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LowpanFirstFragment1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LowpanFirstFragment2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LowpanFirstFragment3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LowpanFirstFragment4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LowpanSubsequentFragment1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LowpanSubsequentFragment2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LowpanSubsequentFragment3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_LowpanSubsequentFragment4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandZipPacket1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandZipPacket2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandZipPacket3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandZipPacket4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandZipPacket1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandZipPacket2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandZipPacket3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandZipPacket4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandCommandClassNotSupportedFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_SwitchColorSetVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorStartLevelChangeFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorStopLevelChangeFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSupportedGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSupportedReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        VG_SwitchColorSetV2VGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSet1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSet2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSet3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorSet4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorStartLevelChangeV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_SwitchColorStopLevelChangeV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_ScheduleSupportedReportVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_CommandScheduleSet1byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_CommandScheduleSet2byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_CommandScheduleSet3byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_CommandScheduleSet4byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandScheduleSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandScheduleSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandScheduleSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandScheduleSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandScheduleGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_CommandScheduleReport1byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_CommandScheduleReport2byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_CommandScheduleReport3byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        VG_CommandScheduleReport4byteVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandScheduleReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandScheduleReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandScheduleReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandScheduleReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleRemoveFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleStateSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleStateGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ScheduleStateReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ControllerChangeFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ControllerChangeStatus1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ControllerChangeStatus2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ControllerChangeStatus3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ControllerChangeStatus4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ZipNodeSolicitationFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ZipInvNodeSolicitationFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ZipNodeAdvertisementFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupNameGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupNameReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupNameReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupNameReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupNameReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupInfoGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        VG_AssociationGroupInfoReportVGroup.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupInfoReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupInfoReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupInfoReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupInfoReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupCommandListGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupCommandListReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupCommandListReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupCommandListReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AssociationGroupCommandListReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DeviceResetLocallyNotificationFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CentralSceneSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CentralSceneSupportedReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CentralSceneNotificationFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationRemove1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationRemove2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationRemove3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_IpAssociationRemove4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftSet1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftSet2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftSet3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftSet4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftReport1byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftReport2byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftReport3byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_AntitheftReport4byteV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ZwaveplusInfoGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ZwaveplusInfoReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ZwaveplusInfoGetV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ZwaveplusInfoReportV2Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayModeSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayModeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayModeReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayPeerSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayPeerSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayPeerSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayPeerSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayPeerGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayPeerReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayPeerReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayPeerReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayPeerReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayLockSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_UnsolicitedDestinationSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_UnsolicitedDestinationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_UnsolicitedDestinationReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandApplicationNodeInfoSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandApplicationNodeInfoSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandApplicationNodeInfoSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandApplicationNodeInfoSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandApplicationNodeInfoGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandApplicationNodeInfoReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandApplicationNodeInfoReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandApplicationNodeInfoReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_CommandApplicationNodeInfoReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayConfigurationSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayConfigurationStatusFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayConfigurationGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_GatewayConfigurationReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceTypeGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceTypeReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceTypeReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceTypeReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceTypeReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceProgramSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceProgramSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceProgramSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceProgramSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceProgramSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceSet1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceSet2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceSet3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceSet4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_ApplianceReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DmxAddressSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DmxAddressGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DmxAddressReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DmxCapabilityGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DmxCapabilityReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_DmxData40Frame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorReportFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorSignalSupportedGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorSignalSupportedReport1byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorSignalSupportedReport2byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorSignalSupportedReport3byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorSignalSupportedReport4byteFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorSignalSetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorSignalGetFrame.setByteBuffer(this.getByteBuffer(), 0);
        ZW_BarrierOperatorSignalReportFrame.setByteBuffer(this.getByteBuffer(), 0);
    }

    public final Unsigned8[] buffer = array(new Unsigned8[MAX_UNION_BUFFER_SIZE]);

    /************************************************************/
    /* ZW_FRAME_COLLECTION_MACRO0 */
    /************************************************************/
    public final ZW_ClassCommand.ZW_COMMON_FRAME ZW_Common = new ZW_ClassCommand.ZW_COMMON_FRAME();
    /* Command class Alarm */
    public final ZW_ClassCommand.ZW_ALARM_GET_FRAME ZW_AlarmGetFrame
            = new ZW_ClassCommand.ZW_ALARM_GET_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_REPORT_FRAME ZW_AlarmReportFrame
            = new ZW_ClassCommand.ZW_ALARM_REPORT_FRAME();
    /* Command class Alarm V2 */
    public final ZW_ClassCommand.ZW_ALARM_GET_V2_FRAME ZW_AlarmGetV2Frame
            = new ZW_ClassCommand.ZW_ALARM_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_REPORT_1BYTE_V2_FRAME ZW_AlarmReport1byteV2Frame
            = new ZW_ClassCommand.ZW_ALARM_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_REPORT_2BYTE_V2_FRAME ZW_AlarmReport2byteV2Frame
            = new ZW_ClassCommand.ZW_ALARM_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_REPORT_3BYTE_V2_FRAME ZW_AlarmReport3byteV2Frame
            = new ZW_ClassCommand.ZW_ALARM_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_REPORT_4BYTE_V2_FRAME ZW_AlarmReport4byteV2Frame
            = new ZW_ClassCommand.ZW_ALARM_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_SET_V2_FRAME ZW_AlarmSetV2Frame
            = new ZW_ClassCommand.ZW_ALARM_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_TYPE_SUPPORTED_GET_V2_FRAME ZW_AlarmTypeSupportedGetV2Frame
            = new ZW_ClassCommand.ZW_ALARM_TYPE_SUPPORTED_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_TYPE_SUPPORTED_REPORT_1BYTE_V2_FRAME ZW_AlarmTypeSupportedReport1byteV2Frame
            = new ZW_ClassCommand.ZW_ALARM_TYPE_SUPPORTED_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_TYPE_SUPPORTED_REPORT_2BYTE_V2_FRAME ZW_AlarmTypeSupportedReport2byteV2Frame
            = new ZW_ClassCommand.ZW_ALARM_TYPE_SUPPORTED_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_TYPE_SUPPORTED_REPORT_3BYTE_V2_FRAME ZW_AlarmTypeSupportedReport3byteV2Frame
            = new ZW_ClassCommand.ZW_ALARM_TYPE_SUPPORTED_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ALARM_TYPE_SUPPORTED_REPORT_4BYTE_V2_FRAME ZW_AlarmTypeSupportedReport4byteV2Frame
            = new ZW_ClassCommand.ZW_ALARM_TYPE_SUPPORTED_REPORT_4BYTE_V2_FRAME();
    /* Command class Notification V3 */
    public final ZW_ClassCommand.ZW_NOTIFICATION_GET_V3_FRAME ZW_NotificationGetV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_REPORT_1BYTE_V3_FRAME ZW_NotificationReport1byteV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_REPORT_2BYTE_V3_FRAME ZW_NotificationReport2byteV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_REPORT_3BYTE_V3_FRAME ZW_NotificationReport3byteV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_REPORT_4BYTE_V3_FRAME ZW_NotificationReport4byteV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_REPORT_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SET_V3_FRAME ZW_NotificationSetV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SET_V3_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_GET_V3_FRAME ZW_NotificationSupportedGetV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_1BYTE_V3_FRAME ZW_NotificationSupportedReport1byteV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_2BYTE_V3_FRAME ZW_NotificationSupportedReport2byteV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_3BYTE_V3_FRAME ZW_NotificationSupportedReport3byteV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_4BYTE_V3_FRAME ZW_NotificationSupportedReport4byteV3Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_EVENT_SUPPORTED_GET_V3_FRAME ZW_EventSupportedGetV3Frame
            = new ZW_ClassCommand.ZW_EVENT_SUPPORTED_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_1BYTE_V3_FRAME ZW_EventSupportedReport1byteV3Frame
            = new ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_2BYTE_V3_FRAME ZW_EventSupportedReport2byteV3Frame
            = new ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_3BYTE_V3_FRAME ZW_EventSupportedReport3byteV3Frame
            = new ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_4BYTE_V3_FRAME ZW_EventSupportedReport4byteV3Frame
            = new ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_4BYTE_V3_FRAME();
    /* Command class Notification V4 */
    public final ZW_ClassCommand.ZW_NOTIFICATION_GET_V4_FRAME ZW_NotificationGetV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_GET_V4_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_REPORT_1BYTE_V4_FRAME ZW_NotificationReport1byteV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_REPORT_1BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_REPORT_2BYTE_V4_FRAME ZW_NotificationReport2byteV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_REPORT_2BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_REPORT_3BYTE_V4_FRAME ZW_NotificationReport3byteV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_REPORT_3BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_REPORT_4BYTE_V4_FRAME ZW_NotificationReport4byteV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_REPORT_4BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SET_V4_FRAME ZW_NotificationSetV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SET_V4_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_GET_V4_FRAME ZW_NotificationSupportedGetV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_GET_V4_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_1BYTE_V4_FRAME ZW_NotificationSupportedReport1byteV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_1BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_2BYTE_V4_FRAME ZW_NotificationSupportedReport2byteV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_2BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_3BYTE_V4_FRAME ZW_NotificationSupportedReport3byteV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_3BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_4BYTE_V4_FRAME ZW_NotificationSupportedReport4byteV4Frame
            = new ZW_ClassCommand.ZW_NOTIFICATION_SUPPORTED_REPORT_4BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_EVENT_SUPPORTED_GET_V4_FRAME ZW_EventSupportedGetV4Frame
            = new ZW_ClassCommand.ZW_EVENT_SUPPORTED_GET_V4_FRAME();
    public final ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_1BYTE_V4_FRAME ZW_EventSupportedReport1byteV4Frame
            = new ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_1BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_2BYTE_V4_FRAME ZW_EventSupportedReport2byteV4Frame
            = new ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_2BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_3BYTE_V4_FRAME ZW_EventSupportedReport3byteV4Frame
            = new ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_3BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_4BYTE_V4_FRAME ZW_EventSupportedReport4byteV4Frame
            = new ZW_ClassCommand.ZW_EVENT_SUPPORTED_REPORT_4BYTE_V4_FRAME();
    /* Command class Application Status */
    public final ZW_ClassCommand.ZW_APPLICATION_BUSY_FRAME ZW_ApplicationBusyFrame
            = new ZW_ClassCommand.ZW_APPLICATION_BUSY_FRAME();
    public final ZW_ClassCommand.ZW_APPLICATION_REJECTED_REQUEST_FRAME ZW_ApplicationRejectedRequestFrame
            = new ZW_ClassCommand.ZW_APPLICATION_REJECTED_REQUEST_FRAME();
    /* Command class Association Command Configuration */
    public final ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_GET_FRAME ZW_CommandConfigurationGetFrame
            = new ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_REPORT_1BYTE_FRAME ZW_CommandConfigurationReport1byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_REPORT_2BYTE_FRAME ZW_CommandConfigurationReport2byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_REPORT_3BYTE_FRAME ZW_CommandConfigurationReport3byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_REPORT_4BYTE_FRAME ZW_CommandConfigurationReport4byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_SET_1BYTE_FRAME ZW_CommandConfigurationSet1byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_SET_2BYTE_FRAME ZW_CommandConfigurationSet2byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_SET_3BYTE_FRAME ZW_CommandConfigurationSet3byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_SET_4BYTE_FRAME ZW_CommandConfigurationSet4byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_CONFIGURATION_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_RECORDS_SUPPORTED_GET_FRAME ZW_CommandRecordsSupportedGetFrame
            = new ZW_ClassCommand.ZW_COMMAND_RECORDS_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_RECORDS_SUPPORTED_REPORT_FRAME ZW_CommandRecordsSupportedReportFrame
            = new ZW_ClassCommand.ZW_COMMAND_RECORDS_SUPPORTED_REPORT_FRAME();
    /* Command class Association */
    public final ZW_ClassCommand.ZW_ASSOCIATION_GET_FRAME ZW_AssociationGetFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUPINGS_GET_FRAME ZW_AssociationGroupingsGetFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUPINGS_GET_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUPINGS_REPORT_FRAME ZW_AssociationGroupingsReportFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUPINGS_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_1BYTE_FRAME ZW_AssociationRemove1byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_2BYTE_FRAME ZW_AssociationRemove2byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_3BYTE_FRAME ZW_AssociationRemove3byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_4BYTE_FRAME ZW_AssociationRemove4byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REPORT_1BYTE_FRAME ZW_AssociationReport1byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REPORT_2BYTE_FRAME ZW_AssociationReport2byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REPORT_3BYTE_FRAME ZW_AssociationReport3byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REPORT_4BYTE_FRAME ZW_AssociationReport4byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_SET_1BYTE_FRAME ZW_AssociationSet1byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_SET_2BYTE_FRAME ZW_AssociationSet2byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_SET_3BYTE_FRAME ZW_AssociationSet3byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_SET_4BYTE_FRAME ZW_AssociationSet4byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_SET_4BYTE_FRAME();
    /* Command class Association V2 */
    public final ZW_ClassCommand.ZW_ASSOCIATION_GET_V2_FRAME ZW_AssociationGetV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUPINGS_GET_V2_FRAME ZW_AssociationGroupingsGetV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUPINGS_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUPINGS_REPORT_V2_FRAME ZW_AssociationGroupingsReportV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUPINGS_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_1BYTE_V2_FRAME ZW_AssociationRemove1byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_2BYTE_V2_FRAME ZW_AssociationRemove2byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_3BYTE_V2_FRAME ZW_AssociationRemove3byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_4BYTE_V2_FRAME ZW_AssociationRemove4byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REMOVE_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REPORT_1BYTE_V2_FRAME ZW_AssociationReport1byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REPORT_2BYTE_V2_FRAME ZW_AssociationReport2byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REPORT_3BYTE_V2_FRAME ZW_AssociationReport3byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_REPORT_4BYTE_V2_FRAME ZW_AssociationReport4byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_SET_1BYTE_V2_FRAME ZW_AssociationSet1byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_SET_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_SET_2BYTE_V2_FRAME ZW_AssociationSet2byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_SET_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_SET_3BYTE_V2_FRAME ZW_AssociationSet3byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_SET_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_SET_4BYTE_V2_FRAME ZW_AssociationSet4byteV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_SET_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_SPECIFIC_GROUP_GET_V2_FRAME ZW_AssociationSpecificGroupGetV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_SPECIFIC_GROUP_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_SPECIFIC_GROUP_REPORT_V2_FRAME ZW_AssociationSpecificGroupReportV2Frame
            = new ZW_ClassCommand.ZW_ASSOCIATION_SPECIFIC_GROUP_REPORT_V2_FRAME();
    /* Command class Av Content Directory Md */
    public final ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_BY_LETTER_GET_FRAME ZW_AvContentBrowseMdByLetterGetFrame
            = new ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_BY_LETTER_GET_FRAME();
    public final ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_BY_LETTER_REPORT_FRAME ZW_AvContentBrowseMdByLetterReportFrame
            = new ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_BY_LETTER_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_CHILD_COUNT_GET_FRAME ZW_AvContentBrowseMdChildCountGetFrame
            = new ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_CHILD_COUNT_GET_FRAME();
    public final ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_CHILD_COUNT_REPORT_FRAME ZW_AvContentBrowseMdChildCountReportFrame
            = new ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_CHILD_COUNT_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_GET_FRAME ZW_AvContentBrowseMdGetFrame
            = new ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_GET_FRAME();
    public final ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_REPORT_FRAME ZW_AvContentBrowseMdReportFrame
            = new ZW_ClassCommand.ZW_AV_CONTENT_BROWSE_MD_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_AV_MATCH_ITEM_TO_RENDERER_MD_GET_FRAME ZW_AvMatchItemToRendererMdGetFrame
            = new ZW_ClassCommand.ZW_AV_MATCH_ITEM_TO_RENDERER_MD_GET_FRAME();
    public final ZW_ClassCommand.ZW_AV_MATCH_ITEM_TO_RENDERER_MD_REPORT_FRAME ZW_AvMatchItemToRendererMdReportFrame
            = new ZW_ClassCommand.ZW_AV_MATCH_ITEM_TO_RENDERER_MD_REPORT_FRAME();
    /* Command class Av Content Search Md */
    public final ZW_ClassCommand.ZW_AV_CONTENT_SEARCH_MD_GET_FRAME ZW_AvContentSearchMdGetFrame
            = new ZW_ClassCommand.ZW_AV_CONTENT_SEARCH_MD_GET_FRAME();
    public final ZW_ClassCommand.ZW_AV_CONTENT_SEARCH_MD_REPORT_FRAME ZW_AvContentSearchMdReportFrame
            = new ZW_ClassCommand.ZW_AV_CONTENT_SEARCH_MD_REPORT_FRAME();
    /* Command class Av Renderer Status */
    public final ZW_ClassCommand.ZW_AV_RENDERER_STATUS_GET_FRAME ZW_AvRendererStatusGetFrame
            = new ZW_ClassCommand.ZW_AV_RENDERER_STATUS_GET_FRAME();
    public final ZW_ClassCommand.ZW_AV_RENDERER_STATUS_REPORT_FRAME ZW_AvRendererStatusReportFrame
            = new ZW_ClassCommand.ZW_AV_RENDERER_STATUS_REPORT_FRAME();
    /* Command class Av Tagging Md */
    public final ZW_ClassCommand.ZW_AV_TAGGING_MD_GET_FRAME ZW_AvTaggingMdGetFrame
            = new ZW_ClassCommand.ZW_AV_TAGGING_MD_GET_FRAME();
    public final ZW_ClassCommand.ZW_AV_TAGGING_MD_REPORT_FRAME ZW_AvTaggingMdReportFrame
            = new ZW_ClassCommand.ZW_AV_TAGGING_MD_REPORT_FRAME();
    /* Command class Basic Tariff Info */
    public final ZW_ClassCommand.ZW_BASIC_TARIFF_INFO_GET_FRAME ZW_BasicTariffInfoGetFrame
            = new ZW_ClassCommand.ZW_BASIC_TARIFF_INFO_GET_FRAME();
    public final ZW_ClassCommand.ZW_BASIC_TARIFF_INFO_REPORT_FRAME ZW_BasicTariffInfoReportFrame
            = new ZW_ClassCommand.ZW_BASIC_TARIFF_INFO_REPORT_FRAME();
    /* Command class Basic Window Covering */
    public final ZW_ClassCommand.ZW_BASIC_WINDOW_COVERING_START_LEVEL_CHANGE_FRAME ZW_BasicWindowCoveringStartLevelChangeFrame
            = new ZW_ClassCommand.ZW_BASIC_WINDOW_COVERING_START_LEVEL_CHANGE_FRAME();
    public final ZW_ClassCommand.ZW_BASIC_WINDOW_COVERING_STOP_LEVEL_CHANGE_FRAME ZW_BasicWindowCoveringStopLevelChangeFrame
            = new ZW_ClassCommand.ZW_BASIC_WINDOW_COVERING_STOP_LEVEL_CHANGE_FRAME();
    /* Command class Basic */
    public final ZW_ClassCommand.ZW_BASIC_GET_FRAME ZW_BasicGetFrame
            = new ZW_ClassCommand.ZW_BASIC_GET_FRAME();
    public final ZW_ClassCommand.ZW_BASIC_REPORT_FRAME ZW_BasicReportFrame
            = new ZW_ClassCommand.ZW_BASIC_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_BASIC_SET_FRAME ZW_BasicSetFrame
            = new ZW_ClassCommand.ZW_BASIC_SET_FRAME();
    /* Command class Battery */
    public final ZW_ClassCommand.ZW_BATTERY_GET_FRAME ZW_BatteryGetFrame
            = new ZW_ClassCommand.ZW_BATTERY_GET_FRAME();
    public final ZW_ClassCommand.ZW_BATTERY_REPORT_FRAME ZW_BatteryReportFrame
            = new ZW_ClassCommand.ZW_BATTERY_REPORT_FRAME();
    /* Command class Chimney Fan */
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_LOG_GET_FRAME ZW_ChimneyFanAlarmLogGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_LOG_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_LOG_REPORT_FRAME ZW_ChimneyFanAlarmLogReportFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_LOG_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_LOG_SET_FRAME ZW_ChimneyFanAlarmLogSetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_LOG_SET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_STATUS_GET_FRAME ZW_ChimneyFanAlarmStatusGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_STATUS_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_STATUS_REPORT_FRAME ZW_ChimneyFanAlarmStatusReportFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_STATUS_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_STATUS_SET_FRAME ZW_ChimneyFanAlarmStatusSetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_STATUS_SET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_GET_FRAME ZW_ChimneyFanAlarmTempGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_1BYTE_FRAME ZW_ChimneyFanAlarmTempReport1byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_2BYTE_FRAME ZW_ChimneyFanAlarmTempReport2byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_3BYTE_FRAME ZW_ChimneyFanAlarmTempReport3byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_4BYTE_FRAME ZW_ChimneyFanAlarmTempReport4byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_SET_1BYTE_FRAME ZW_ChimneyFanAlarmTempSet1byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_SET_2BYTE_FRAME ZW_ChimneyFanAlarmTempSet2byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_SET_3BYTE_FRAME ZW_ChimneyFanAlarmTempSet3byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_SET_4BYTE_FRAME ZW_ChimneyFanAlarmTempSet4byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_ALARM_TEMP_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_BOOST_TIME_GET_FRAME ZW_ChimneyFanBoostTimeGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_BOOST_TIME_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_BOOST_TIME_REPORT_FRAME ZW_ChimneyFanBoostTimeReportFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_BOOST_TIME_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_BOOST_TIME_SET_FRAME ZW_ChimneyFanBoostTimeSetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_BOOST_TIME_SET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_DEFAULT_SET_FRAME ZW_ChimneyFanDefaultSetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_DEFAULT_SET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_MIN_SPEED_GET_FRAME ZW_ChimneyFanMinSpeedGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_MIN_SPEED_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_MIN_SPEED_REPORT_FRAME ZW_ChimneyFanMinSpeedReportFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_MIN_SPEED_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_MIN_SPEED_SET_FRAME ZW_ChimneyFanMinSpeedSetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_MIN_SPEED_SET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_MODE_GET_FRAME ZW_ChimneyFanModeGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_MODE_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_MODE_REPORT_FRAME ZW_ChimneyFanModeReportFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_MODE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_MODE_SET_FRAME ZW_ChimneyFanModeSetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_MODE_SET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_GET_FRAME ZW_ChimneyFanSetupGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_REPORT_1BYTE_FRAME ZW_ChimneyFanSetupReport1byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_REPORT_2BYTE_FRAME ZW_ChimneyFanSetupReport2byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_REPORT_3BYTE_FRAME ZW_ChimneyFanSetupReport3byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_REPORT_4BYTE_FRAME ZW_ChimneyFanSetupReport4byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_SET_1BYTE_FRAME ZW_ChimneyFanSetupSet1byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_SET_2BYTE_FRAME ZW_ChimneyFanSetupSet2byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_SET_3BYTE_FRAME ZW_ChimneyFanSetupSet3byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_SET_4BYTE_FRAME ZW_ChimneyFanSetupSet4byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SETUP_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SPEED_GET_FRAME ZW_ChimneyFanSpeedGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SPEED_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SPEED_REPORT_FRAME ZW_ChimneyFanSpeedReportFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SPEED_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_SPEED_SET_FRAME ZW_ChimneyFanSpeedSetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_SPEED_SET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_GET_FRAME ZW_ChimneyFanStartTempGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_REPORT_1BYTE_FRAME ZW_ChimneyFanStartTempReport1byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_REPORT_2BYTE_FRAME ZW_ChimneyFanStartTempReport2byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_REPORT_3BYTE_FRAME ZW_ChimneyFanStartTempReport3byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_REPORT_4BYTE_FRAME ZW_ChimneyFanStartTempReport4byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_SET_1BYTE_FRAME ZW_ChimneyFanStartTempSet1byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_SET_2BYTE_FRAME ZW_ChimneyFanStartTempSet2byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_SET_3BYTE_FRAME ZW_ChimneyFanStartTempSet3byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_SET_4BYTE_FRAME ZW_ChimneyFanStartTempSet4byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_START_TEMP_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STATE_GET_FRAME ZW_ChimneyFanStateGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STATE_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STATE_REPORT_FRAME ZW_ChimneyFanStateReportFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STATE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STATE_SET_FRAME ZW_ChimneyFanStateSetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STATE_SET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STATUS_GET_FRAME ZW_ChimneyFanStatusGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STATUS_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STATUS_REPORT_1BYTE_FRAME ZW_ChimneyFanStatusReport1byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STATUS_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STATUS_REPORT_2BYTE_FRAME ZW_ChimneyFanStatusReport2byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STATUS_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STATUS_REPORT_3BYTE_FRAME ZW_ChimneyFanStatusReport3byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STATUS_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STATUS_REPORT_4BYTE_FRAME ZW_ChimneyFanStatusReport4byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STATUS_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_GET_FRAME ZW_ChimneyFanStopTempGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_1BYTE_FRAME ZW_ChimneyFanStopTempReport1byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_2BYTE_FRAME ZW_ChimneyFanStopTempReport2byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_3BYTE_FRAME ZW_ChimneyFanStopTempReport3byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_4BYTE_FRAME ZW_ChimneyFanStopTempReport4byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_SET_1BYTE_FRAME ZW_ChimneyFanStopTempSet1byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_SET_2BYTE_FRAME ZW_ChimneyFanStopTempSet2byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_SET_3BYTE_FRAME ZW_ChimneyFanStopTempSet3byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_SET_4BYTE_FRAME ZW_ChimneyFanStopTempSet4byteFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TEMP_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TIME_GET_FRAME ZW_ChimneyFanStopTimeGetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TIME_GET_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TIME_REPORT_FRAME ZW_ChimneyFanStopTimeReportFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TIME_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TIME_SET_FRAME ZW_ChimneyFanStopTimeSetFrame
            = new ZW_ClassCommand.ZW_CHIMNEY_FAN_STOP_TIME_SET_FRAME();
    /* Command class Climate Control Schedule */
    public final ZW_ClassCommand.ZW_SCHEDULE_CHANGED_GET_FRAME ZW_ScheduleChangedGetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_CHANGED_GET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_CHANGED_REPORT_FRAME ZW_ScheduleChangedReportFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_CHANGED_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_GET_FRAME ZW_ScheduleGetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_GET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_OVERRIDE_GET_FRAME ZW_ScheduleOverrideGetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_OVERRIDE_GET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_OVERRIDE_REPORT_FRAME ZW_ScheduleOverrideReportFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_OVERRIDE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_OVERRIDE_SET_FRAME ZW_ScheduleOverrideSetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_OVERRIDE_SET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_REPORT_FRAME ZW_ScheduleReportFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_SET_FRAME ZW_ScheduleSetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_SET_FRAME();
    /* Command class Clock */
    public final ZW_ClassCommand.ZW_CLOCK_GET_FRAME ZW_ClockGetFrame
            = new ZW_ClassCommand.ZW_CLOCK_GET_FRAME();
    public final ZW_ClassCommand.ZW_CLOCK_REPORT_FRAME ZW_ClockReportFrame
            = new ZW_ClassCommand.ZW_CLOCK_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_CLOCK_SET_FRAME ZW_ClockSetFrame
            = new ZW_ClassCommand.ZW_CLOCK_SET_FRAME();
    /* Command class Configuration */
    public final ZW_ClassCommand.ZW_CONFIGURATION_GET_FRAME ZW_ConfigurationGetFrame
            = new ZW_ClassCommand.ZW_CONFIGURATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_REPORT_1BYTE_FRAME ZW_ConfigurationReport1byteFrame
            = new ZW_ClassCommand.ZW_CONFIGURATION_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_REPORT_2BYTE_FRAME ZW_ConfigurationReport2byteFrame
            = new ZW_ClassCommand.ZW_CONFIGURATION_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_REPORT_3BYTE_FRAME ZW_ConfigurationReport3byteFrame
            = new ZW_ClassCommand.ZW_CONFIGURATION_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_REPORT_4BYTE_FRAME ZW_ConfigurationReport4byteFrame
            = new ZW_ClassCommand.ZW_CONFIGURATION_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_SET_1BYTE_FRAME ZW_ConfigurationSet1byteFrame
            = new ZW_ClassCommand.ZW_CONFIGURATION_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_SET_2BYTE_FRAME ZW_ConfigurationSet2byteFrame
            = new ZW_ClassCommand.ZW_CONFIGURATION_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_SET_3BYTE_FRAME ZW_ConfigurationSet3byteFrame
            = new ZW_ClassCommand.ZW_CONFIGURATION_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_SET_4BYTE_FRAME ZW_ConfigurationSet4byteFrame
            = new ZW_ClassCommand.ZW_CONFIGURATION_SET_4BYTE_FRAME();
    /* Command class Configuration V2 */
    public final ZW_ClassCommand.ZW_CONFIGURATION_BULK_GET_V2_FRAME ZW_ConfigurationBulkGetV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_BULK_GET_V2_FRAME();
    public final ZW_ClassCommand.VG_CONFIGURATION_BULK_REPORT_1BYTE_V2_VG VG_ConfigurationBulkReport1byteV2VGroup
            = new ZW_ClassCommand.VG_CONFIGURATION_BULK_REPORT_1BYTE_V2_VG();
    public final ZW_ClassCommand.VG_CONFIGURATION_BULK_REPORT_2BYTE_V2_VG VG_ConfigurationBulkReport2byteV2VGroup
            = new ZW_ClassCommand.VG_CONFIGURATION_BULK_REPORT_2BYTE_V2_VG();
    public final ZW_ClassCommand.VG_CONFIGURATION_BULK_REPORT_3BYTE_V2_VG VG_ConfigurationBulkReport3byteV2VGroup
            = new ZW_ClassCommand.VG_CONFIGURATION_BULK_REPORT_3BYTE_V2_VG();
    public final ZW_ClassCommand.VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG VG_ConfigurationBulkReport4byteV2VGroup
            = new ZW_ClassCommand.VG_CONFIGURATION_BULK_REPORT_4BYTE_V2_VG();
    public final ZW_ClassCommand.ZW_CONFIGURATION_BULK_REPORT_1BYTE_V2_FRAME ZW_ConfigurationBulkReport1byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_BULK_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_BULK_REPORT_2BYTE_V2_FRAME ZW_ConfigurationBulkReport2byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_BULK_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_BULK_REPORT_3BYTE_V2_FRAME ZW_ConfigurationBulkReport3byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_BULK_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_BULK_REPORT_4BYTE_V2_FRAME ZW_ConfigurationBulkReport4byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_BULK_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.VG_CONFIGURATION_BULK_SET_1BYTE_V2_VG VG_ConfigurationBulkSet1byteV2VGroup
            = new ZW_ClassCommand.VG_CONFIGURATION_BULK_SET_1BYTE_V2_VG();
    public final ZW_ClassCommand.VG_CONFIGURATION_BULK_SET_2BYTE_V2_VG VG_ConfigurationBulkSet2byteV2VGroup
            = new ZW_ClassCommand.VG_CONFIGURATION_BULK_SET_2BYTE_V2_VG();
    public final ZW_ClassCommand.VG_CONFIGURATION_BULK_SET_3BYTE_V2_VG VG_ConfigurationBulkSet3byteV2VGroup
            = new ZW_ClassCommand.VG_CONFIGURATION_BULK_SET_3BYTE_V2_VG();
    public final ZW_ClassCommand.VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG VG_ConfigurationBulkSet4byteV2VGroup
            = new ZW_ClassCommand.VG_CONFIGURATION_BULK_SET_4BYTE_V2_VG();
    public final ZW_ClassCommand.ZW_CONFIGURATION_BULK_SET_1BYTE_V2_FRAME ZW_ConfigurationBulkSet1byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_BULK_SET_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_BULK_SET_2BYTE_V2_FRAME ZW_ConfigurationBulkSet2byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_BULK_SET_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_BULK_SET_3BYTE_V2_FRAME ZW_ConfigurationBulkSet3byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_BULK_SET_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_BULK_SET_4BYTE_V2_FRAME ZW_ConfigurationBulkSet4byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_BULK_SET_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_GET_V2_FRAME ZW_ConfigurationGetV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_REPORT_1BYTE_V2_FRAME ZW_ConfigurationReport1byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_REPORT_2BYTE_V2_FRAME ZW_ConfigurationReport2byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_REPORT_3BYTE_V2_FRAME ZW_ConfigurationReport3byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_REPORT_4BYTE_V2_FRAME ZW_ConfigurationReport4byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_SET_1BYTE_V2_FRAME ZW_ConfigurationSet1byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_SET_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_SET_2BYTE_V2_FRAME ZW_ConfigurationSet2byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_SET_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_SET_3BYTE_V2_FRAME ZW_ConfigurationSet3byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_SET_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_CONFIGURATION_SET_4BYTE_V2_FRAME ZW_ConfigurationSet4byteV2Frame
            = new ZW_ClassCommand.ZW_CONFIGURATION_SET_4BYTE_V2_FRAME();
    /* Command class Controller Replication */
    public final ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_GROUP_FRAME ZW_CtrlReplicationTransferGroupFrame
            = new ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_GROUP_FRAME();
    public final ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_1BYTE_FRAME ZW_CtrlReplicationTransferGroupName1byteFrame
            = new ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_2BYTE_FRAME ZW_CtrlReplicationTransferGroupName2byteFrame
            = new ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_3BYTE_FRAME ZW_CtrlReplicationTransferGroupName3byteFrame
            = new ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_4BYTE_FRAME ZW_CtrlReplicationTransferGroupName4byteFrame
            = new ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_GROUP_NAME_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_SCENE_FRAME ZW_CtrlReplicationTransferSceneFrame
            = new ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_SCENE_FRAME();
    public final ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_1BYTE_FRAME ZW_CtrlReplicationTransferSceneName1byteFrame
            = new ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_2BYTE_FRAME ZW_CtrlReplicationTransferSceneName2byteFrame
            = new ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_3BYTE_FRAME ZW_CtrlReplicationTransferSceneName3byteFrame
            = new ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_4BYTE_FRAME ZW_CtrlReplicationTransferSceneName4byteFrame
            = new ZW_ClassCommand.ZW_CTRL_REPLICATION_TRANSFER_SCENE_NAME_4BYTE_FRAME();
    /* Command class Dcp Config */
    public final ZW_ClassCommand.ZW_DCP_LIST_REMOVE_FRAME ZW_DcpListRemoveFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_REMOVE_FRAME();
    public final ZW_ClassCommand.VG_DCP_LIST_SET_VG VG_DcpListSetVGroup
            = new ZW_ClassCommand.VG_DCP_LIST_SET_VG();
    public final ZW_ClassCommand.ZW_DCP_LIST_SET_1BYTE_FRAME ZW_DcpListSet1byteFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_DCP_LIST_SET_2BYTE_FRAME ZW_DcpListSet2byteFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_DCP_LIST_SET_3BYTE_FRAME ZW_DcpListSet3byteFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_DCP_LIST_SET_4BYTE_FRAME ZW_DcpListSet4byteFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_DCP_LIST_SUPPORTED_GET_FRAME ZW_DcpListSupportedGetFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_DCP_LIST_SUPPORTED_REPORT_FRAME ZW_DcpListSupportedReportFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_SUPPORTED_REPORT_FRAME();
    /* Command class Dcp Monitor */
    public final ZW_ClassCommand.ZW_DCP_EVENT_STATUS_GET_FRAME ZW_DcpEventStatusGetFrame
            = new ZW_ClassCommand.ZW_DCP_EVENT_STATUS_GET_FRAME();
    public final ZW_ClassCommand.ZW_DCP_EVENT_STATUS_REPORT_FRAME ZW_DcpEventStatusReportFrame
            = new ZW_ClassCommand.ZW_DCP_EVENT_STATUS_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_DCP_LIST_GET_FRAME ZW_DcpListGetFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_GET_FRAME();
    public final ZW_ClassCommand.VG_DCP_LIST_REPORT_VG VG_DcpListReportVGroup
            = new ZW_ClassCommand.VG_DCP_LIST_REPORT_VG();
    public final ZW_ClassCommand.ZW_DCP_LIST_REPORT_1BYTE_FRAME ZW_DcpListReport1byteFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_DCP_LIST_REPORT_2BYTE_FRAME ZW_DcpListReport2byteFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_DCP_LIST_REPORT_3BYTE_FRAME ZW_DcpListReport3byteFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_DCP_LIST_REPORT_4BYTE_FRAME ZW_DcpListReport4byteFrame
            = new ZW_ClassCommand.ZW_DCP_LIST_REPORT_4BYTE_FRAME();
    /* Command class Door Lock Logging */
    public final ZW_ClassCommand.ZW_DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET_FRAME ZW_DoorLockLoggingRecordsSupportedGetFrame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT_FRAME ZW_DoorLockLoggingRecordsSupportedReportFrame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_LOGGING_RECORDS_SUPPORTED_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_RECORD_GET_FRAME ZW_RecordGetFrame
            = new ZW_ClassCommand.ZW_RECORD_GET_FRAME();
    public final ZW_ClassCommand.ZW_RECORD_REPORT_1BYTE_FRAME ZW_RecordReport1byteFrame
            = new ZW_ClassCommand.ZW_RECORD_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RECORD_REPORT_2BYTE_FRAME ZW_RecordReport2byteFrame
            = new ZW_ClassCommand.ZW_RECORD_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RECORD_REPORT_3BYTE_FRAME ZW_RecordReport3byteFrame
            = new ZW_ClassCommand.ZW_RECORD_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RECORD_REPORT_4BYTE_FRAME ZW_RecordReport4byteFrame
            = new ZW_ClassCommand.ZW_RECORD_REPORT_4BYTE_FRAME();
    /* Command class Door Lock */
    public final ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_GET_FRAME ZW_DoorLockConfigurationGetFrame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_REPORT_FRAME ZW_DoorLockConfigurationReportFrame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_SET_FRAME ZW_DoorLockConfigurationSetFrame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_SET_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_GET_FRAME ZW_DoorLockOperationGetFrame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_REPORT_FRAME ZW_DoorLockOperationReportFrame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_SET_FRAME ZW_DoorLockOperationSetFrame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_SET_FRAME();
    /* Command class Door Lock V2 */
    public final ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_GET_V2_FRAME ZW_DoorLockConfigurationGetV2Frame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_REPORT_V2_FRAME ZW_DoorLockConfigurationReportV2Frame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_SET_V2_FRAME ZW_DoorLockConfigurationSetV2Frame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_CONFIGURATION_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_GET_V2_FRAME ZW_DoorLockOperationGetV2Frame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_REPORT_V2_FRAME ZW_DoorLockOperationReportV2Frame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_SET_V2_FRAME ZW_DoorLockOperationSetV2Frame
            = new ZW_ClassCommand.ZW_DOOR_LOCK_OPERATION_SET_V2_FRAME();
    /* Command class Energy Production */
    public final ZW_ClassCommand.ZW_ENERGY_PRODUCTION_GET_FRAME ZW_EnergyProductionGetFrame
            = new ZW_ClassCommand.ZW_ENERGY_PRODUCTION_GET_FRAME();
    public final ZW_ClassCommand.ZW_ENERGY_PRODUCTION_REPORT_1BYTE_FRAME ZW_EnergyProductionReport1byteFrame
            = new ZW_ClassCommand.ZW_ENERGY_PRODUCTION_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ENERGY_PRODUCTION_REPORT_2BYTE_FRAME ZW_EnergyProductionReport2byteFrame
            = new ZW_ClassCommand.ZW_ENERGY_PRODUCTION_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ENERGY_PRODUCTION_REPORT_3BYTE_FRAME ZW_EnergyProductionReport3byteFrame
            = new ZW_ClassCommand.ZW_ENERGY_PRODUCTION_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ENERGY_PRODUCTION_REPORT_4BYTE_FRAME ZW_EnergyProductionReport4byteFrame
            = new ZW_ClassCommand.ZW_ENERGY_PRODUCTION_REPORT_4BYTE_FRAME();
    /* Command class Firmware Update Md */
    public final ZW_ClassCommand.ZW_FIRMWARE_MD_GET_FRAME ZW_FirmwareMdGetFrame
            = new ZW_ClassCommand.ZW_FIRMWARE_MD_GET_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_FRAME ZW_FirmwareMdReportFrame
            = new ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_GET_FRAME ZW_FirmwareUpdateMdGetFrame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_GET_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_1BYTE_FRAME ZW_FirmwareUpdateMdReport1byteFrame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_2BYTE_FRAME ZW_FirmwareUpdateMdReport2byteFrame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_3BYTE_FRAME ZW_FirmwareUpdateMdReport3byteFrame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_4BYTE_FRAME ZW_FirmwareUpdateMdReport4byteFrame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_GET_FRAME ZW_FirmwareUpdateMdRequestGetFrame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_GET_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_REPORT_FRAME ZW_FirmwareUpdateMdRequestReportFrame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_STATUS_REPORT_FRAME ZW_FirmwareUpdateMdStatusReportFrame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_STATUS_REPORT_FRAME();
    /* Command class Firmware Update Md V2 */
    public final ZW_ClassCommand.ZW_FIRMWARE_MD_GET_V2_FRAME ZW_FirmwareMdGetV2Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_MD_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_V2_FRAME ZW_FirmwareMdReportV2Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_GET_V2_FRAME ZW_FirmwareUpdateMdGetV2Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_1BYTE_V2_FRAME ZW_FirmwareUpdateMdReport1byteV2Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_2BYTE_V2_FRAME ZW_FirmwareUpdateMdReport2byteV2Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_3BYTE_V2_FRAME ZW_FirmwareUpdateMdReport3byteV2Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_4BYTE_V2_FRAME ZW_FirmwareUpdateMdReport4byteV2Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_GET_V2_FRAME ZW_FirmwareUpdateMdRequestGetV2Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_REPORT_V2_FRAME ZW_FirmwareUpdateMdRequestReportV2Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_STATUS_REPORT_V2_FRAME ZW_FirmwareUpdateMdStatusReportV2Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_STATUS_REPORT_V2_FRAME();
    /* Command class Firmware Update Md V3 */
    public final ZW_ClassCommand.ZW_FIRMWARE_MD_GET_V3_FRAME ZW_FirmwareMdGetV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_MD_GET_V3_FRAME();
    public final ZW_ClassCommand.VG_FIRMWARE_MD_REPORT_V3_VG VG_FirmwareMdReportV3VGroup
            = new ZW_ClassCommand.VG_FIRMWARE_MD_REPORT_V3_VG();
    public final ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_1BYTE_V3_FRAME ZW_FirmwareMdReport1byteV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_2BYTE_V3_FRAME ZW_FirmwareMdReport2byteV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_3BYTE_V3_FRAME ZW_FirmwareMdReport3byteV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_4BYTE_V3_FRAME ZW_FirmwareMdReport4byteV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_MD_REPORT_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_GET_V3_FRAME ZW_FirmwareUpdateMdGetV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_1BYTE_V3_FRAME ZW_FirmwareUpdateMdReport1byteV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_2BYTE_V3_FRAME ZW_FirmwareUpdateMdReport2byteV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_3BYTE_V3_FRAME ZW_FirmwareUpdateMdReport3byteV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_4BYTE_V3_FRAME ZW_FirmwareUpdateMdReport4byteV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REPORT_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_GET_V3_FRAME ZW_FirmwareUpdateMdRequestGetV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_REPORT_V3_FRAME ZW_FirmwareUpdateMdRequestReportV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_REQUEST_REPORT_V3_FRAME();
    public final ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_STATUS_REPORT_V3_FRAME ZW_FirmwareUpdateMdStatusReportV3Frame
            = new ZW_ClassCommand.ZW_FIRMWARE_UPDATE_MD_STATUS_REPORT_V3_FRAME();
    /* Command class Geographic Location */
    public final ZW_ClassCommand.ZW_GEOGRAPHIC_LOCATION_GET_FRAME ZW_GeographicLocationGetFrame
            = new ZW_ClassCommand.ZW_GEOGRAPHIC_LOCATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_GEOGRAPHIC_LOCATION_REPORT_FRAME ZW_GeographicLocationReportFrame
            = new ZW_ClassCommand.ZW_GEOGRAPHIC_LOCATION_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_GEOGRAPHIC_LOCATION_SET_FRAME ZW_GeographicLocationSetFrame
            = new ZW_ClassCommand.ZW_GEOGRAPHIC_LOCATION_SET_FRAME();
    /* Command class Grouping Name */
    public final ZW_ClassCommand.ZW_GROUPING_NAME_GET_FRAME ZW_GroupingNameGetFrame
            = new ZW_ClassCommand.ZW_GROUPING_NAME_GET_FRAME();
    public final ZW_ClassCommand.ZW_GROUPING_NAME_REPORT_FRAME ZW_GroupingNameReportFrame
            = new ZW_ClassCommand.ZW_GROUPING_NAME_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_GROUPING_NAME_SET_FRAME ZW_GroupingNameSetFrame
            = new ZW_ClassCommand.ZW_GROUPING_NAME_SET_FRAME();
    /* Command class Hail */
    public final ZW_ClassCommand.ZW_HAIL_FRAME ZW_HailFrame = new ZW_ClassCommand.ZW_HAIL_FRAME();
    /* Command class Hrv Control */
    public final ZW_ClassCommand.ZW_HRV_CONTROL_BYPASS_GET_FRAME ZW_HrvControlBypassGetFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_BYPASS_GET_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_BYPASS_REPORT_FRAME ZW_HrvControlBypassReportFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_BYPASS_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_BYPASS_SET_FRAME ZW_HrvControlBypassSetFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_BYPASS_SET_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_MODE_GET_FRAME ZW_HrvControlModeGetFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_MODE_GET_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_MODE_REPORT_FRAME ZW_HrvControlModeReportFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_MODE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SET_FRAME ZW_HrvControlModeSetFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SET_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SUPPORTED_GET_FRAME ZW_HrvControlModeSupportedGetFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_1BYTE_FRAME ZW_HrvControlModeSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_2BYTE_FRAME ZW_HrvControlModeSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_3BYTE_FRAME ZW_HrvControlModeSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_4BYTE_FRAME ZW_HrvControlModeSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_MODE_SUPPORTED_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_VENTILATION_RATE_GET_FRAME ZW_HrvControlVentilationRateGetFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_VENTILATION_RATE_GET_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_VENTILATION_RATE_REPORT_FRAME ZW_HrvControlVentilationRateReportFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_VENTILATION_RATE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_HRV_CONTROL_VENTILATION_RATE_SET_FRAME ZW_HrvControlVentilationRateSetFrame
            = new ZW_ClassCommand.ZW_HRV_CONTROL_VENTILATION_RATE_SET_FRAME();
    /* Command class Hrv Status */
    public final ZW_ClassCommand.ZW_HRV_STATUS_GET_FRAME ZW_HrvStatusGetFrame
            = new ZW_ClassCommand.ZW_HRV_STATUS_GET_FRAME();
    public final ZW_ClassCommand.ZW_HRV_STATUS_REPORT_1BYTE_FRAME ZW_HrvStatusReport1byteFrame
            = new ZW_ClassCommand.ZW_HRV_STATUS_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_STATUS_REPORT_2BYTE_FRAME ZW_HrvStatusReport2byteFrame
            = new ZW_ClassCommand.ZW_HRV_STATUS_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_STATUS_REPORT_3BYTE_FRAME ZW_HrvStatusReport3byteFrame
            = new ZW_ClassCommand.ZW_HRV_STATUS_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_STATUS_REPORT_4BYTE_FRAME ZW_HrvStatusReport4byteFrame
            = new ZW_ClassCommand.ZW_HRV_STATUS_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_STATUS_SUPPORTED_GET_FRAME ZW_HrvStatusSupportedGetFrame
            = new ZW_ClassCommand.ZW_HRV_STATUS_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_HRV_STATUS_SUPPORTED_REPORT_1BYTE_FRAME ZW_HrvStatusSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_HRV_STATUS_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_STATUS_SUPPORTED_REPORT_2BYTE_FRAME ZW_HrvStatusSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_HRV_STATUS_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_STATUS_SUPPORTED_REPORT_3BYTE_FRAME ZW_HrvStatusSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_HRV_STATUS_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_HRV_STATUS_SUPPORTED_REPORT_4BYTE_FRAME ZW_HrvStatusSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_HRV_STATUS_SUPPORTED_REPORT_4BYTE_FRAME();
    /* Command class Indicator */
    public final ZW_ClassCommand.ZW_INDICATOR_GET_FRAME ZW_IndicatorGetFrame
            = new ZW_ClassCommand.ZW_INDICATOR_GET_FRAME();
    public final ZW_ClassCommand.ZW_INDICATOR_REPORT_FRAME ZW_IndicatorReportFrame
            = new ZW_ClassCommand.ZW_INDICATOR_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_INDICATOR_SET_FRAME ZW_IndicatorSetFrame
            = new ZW_ClassCommand.ZW_INDICATOR_SET_FRAME();
    /* Command class Ip Configuration */
    public final ZW_ClassCommand.ZW_IP_CONFIGURATION_GET_FRAME ZW_IpConfigurationGetFrame
            = new ZW_ClassCommand.ZW_IP_CONFIGURATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_IP_CONFIGURATION_RELEASE_FRAME ZW_IpConfigurationReleaseFrame
            = new ZW_ClassCommand.ZW_IP_CONFIGURATION_RELEASE_FRAME();
    public final ZW_ClassCommand.ZW_IP_CONFIGURATION_RENEW_FRAME ZW_IpConfigurationRenewFrame
            = new ZW_ClassCommand.ZW_IP_CONFIGURATION_RENEW_FRAME();
    public final ZW_ClassCommand.ZW_IP_CONFIGURATION_REPORT_FRAME ZW_IpConfigurationReportFrame
            = new ZW_ClassCommand.ZW_IP_CONFIGURATION_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_IP_CONFIGURATION_SET_FRAME ZW_IpConfigurationSetFrame
            = new ZW_ClassCommand.ZW_IP_CONFIGURATION_SET_FRAME();
    /* Command class Language */
    public final ZW_ClassCommand.ZW_LANGUAGE_GET_FRAME ZW_LanguageGetFrame
            = new ZW_ClassCommand.ZW_LANGUAGE_GET_FRAME();
    public final ZW_ClassCommand.ZW_LANGUAGE_REPORT_FRAME ZW_LanguageReportFrame
            = new ZW_ClassCommand.ZW_LANGUAGE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_LANGUAGE_SET_FRAME ZW_LanguageSetFrame
            = new ZW_ClassCommand.ZW_LANGUAGE_SET_FRAME();
    /* Command class Lock */
    public final ZW_ClassCommand.ZW_LOCK_GET_FRAME ZW_LockGetFrame
            = new ZW_ClassCommand.ZW_LOCK_GET_FRAME();
    public final ZW_ClassCommand.ZW_LOCK_REPORT_FRAME ZW_LockReportFrame
            = new ZW_ClassCommand.ZW_LOCK_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_LOCK_SET_FRAME ZW_LockSetFrame
            = new ZW_ClassCommand.ZW_LOCK_SET_FRAME();
    /* Command class Manufacturer Specific */
    public final ZW_ClassCommand.ZW_MANUFACTURER_SPECIFIC_GET_FRAME ZW_ManufacturerSpecificGetFrame
            = new ZW_ClassCommand.ZW_MANUFACTURER_SPECIFIC_GET_FRAME();
    public final ZW_ClassCommand.ZW_MANUFACTURER_SPECIFIC_REPORT_FRAME ZW_ManufacturerSpecificReportFrame
            = new ZW_ClassCommand.ZW_MANUFACTURER_SPECIFIC_REPORT_FRAME();
    /* Command class Manufacturer Specific V2 */
    public final ZW_ClassCommand.ZW_MANUFACTURER_SPECIFIC_GET_V2_FRAME ZW_ManufacturerSpecificGetV2Frame
            = new ZW_ClassCommand.ZW_MANUFACTURER_SPECIFIC_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_MANUFACTURER_SPECIFIC_REPORT_V2_FRAME ZW_ManufacturerSpecificReportV2Frame
            = new ZW_ClassCommand.ZW_MANUFACTURER_SPECIFIC_REPORT_V2_FRAME();

    /************************************************************/
    /* ZW_FRAME_COLLECTION_MACRO1 */
    /************************************************************/
    public final ZW_ClassCommand.ZW_DEVICE_SPECIFIC_GET_V2_FRAME ZW_DeviceSpecificGetV2Frame
            = new ZW_ClassCommand.ZW_DEVICE_SPECIFIC_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_DEVICE_SPECIFIC_REPORT_1BYTE_V2_FRAME ZW_DeviceSpecificReport1byteV2Frame
            = new ZW_ClassCommand.ZW_DEVICE_SPECIFIC_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_DEVICE_SPECIFIC_REPORT_2BYTE_V2_FRAME ZW_DeviceSpecificReport2byteV2Frame
            = new ZW_ClassCommand.ZW_DEVICE_SPECIFIC_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_DEVICE_SPECIFIC_REPORT_3BYTE_V2_FRAME ZW_DeviceSpecificReport3byteV2Frame
            = new ZW_ClassCommand.ZW_DEVICE_SPECIFIC_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_DEVICE_SPECIFIC_REPORT_4BYTE_V2_FRAME ZW_DeviceSpecificReport4byteV2Frame
            = new ZW_ClassCommand.ZW_DEVICE_SPECIFIC_REPORT_4BYTE_V2_FRAME();
    /* Command class Meter Pulse */
    public final ZW_ClassCommand.ZW_METER_PULSE_GET_FRAME ZW_MeterPulseGetFrame
            = new ZW_ClassCommand.ZW_METER_PULSE_GET_FRAME();
    public final ZW_ClassCommand.ZW_METER_PULSE_REPORT_FRAME ZW_MeterPulseReportFrame
            = new ZW_ClassCommand.ZW_METER_PULSE_REPORT_FRAME();
    /* Command class Meter Tbl Config */
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_1BYTE_FRAME ZW_MeterTblTablePointAdmNoSet1byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_2BYTE_FRAME ZW_MeterTblTablePointAdmNoSet2byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_3BYTE_FRAME ZW_MeterTblTablePointAdmNoSet3byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_4BYTE_FRAME ZW_MeterTblTablePointAdmNoSet4byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_SET_4BYTE_FRAME();
    /* Command class Meter Tbl Monitor */
    public final ZW_ClassCommand.VG_METER_TBL_STATUS_REPORT_VG VG_MeterTblStatusReportVGroup
            = new ZW_ClassCommand.VG_METER_TBL_STATUS_REPORT_VG();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_1BYTE_FRAME ZW_MeterTblStatusReport1byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_2BYTE_FRAME ZW_MeterTblStatusReport2byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_3BYTE_FRAME ZW_MeterTblStatusReport3byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_4BYTE_FRAME ZW_MeterTblStatusReport4byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_DATE_GET_FRAME ZW_MeterTblStatusDateGetFrame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_DATE_GET_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_DEPTH_GET_FRAME ZW_MeterTblStatusDepthGetFrame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_DEPTH_GET_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_SUPPORTED_GET_FRAME ZW_MeterTblStatusSupportedGetFrame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_SUPPORTED_REPORT_FRAME ZW_MeterTblStatusSupportedReportFrame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_SUPPORTED_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_GET_FRAME ZW_MeterTblCurrentDataGetFrame
            = new ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_GET_FRAME();
    public final ZW_ClassCommand.VG_METER_TBL_CURRENT_DATA_REPORT_VG VG_MeterTblCurrentDataReportVGroup
            = new ZW_ClassCommand.VG_METER_TBL_CURRENT_DATA_REPORT_VG();
    public final ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_1BYTE_FRAME ZW_MeterTblCurrentDataReport1byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_2BYTE_FRAME ZW_MeterTblCurrentDataReport2byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_3BYTE_FRAME ZW_MeterTblCurrentDataReport3byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_4BYTE_FRAME ZW_MeterTblCurrentDataReport4byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_GET_FRAME ZW_MeterTblHistoricalDataGetFrame
            = new ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_GET_FRAME();
    public final ZW_ClassCommand.VG_METER_TBL_HISTORICAL_DATA_REPORT_VG VG_MeterTblHistoricalDataReportVGroup
            = new ZW_ClassCommand.VG_METER_TBL_HISTORICAL_DATA_REPORT_VG();
    public final ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_1BYTE_FRAME ZW_MeterTblHistoricalDataReport1byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_2BYTE_FRAME ZW_MeterTblHistoricalDataReport2byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_3BYTE_FRAME ZW_MeterTblHistoricalDataReport3byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_4BYTE_FRAME ZW_MeterTblHistoricalDataReport4byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_REPORT_FRAME ZW_MeterTblReportFrame
            = new ZW_ClassCommand.ZW_METER_TBL_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_CAPABILITY_GET_FRAME ZW_MeterTblTableCapabilityGetFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_CAPABILITY_GET_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_GET_FRAME ZW_MeterTblTableIdGetFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_GET_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_1BYTE_FRAME ZW_MeterTblTableIdReport1byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_2BYTE_FRAME ZW_MeterTblTableIdReport2byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_3BYTE_FRAME ZW_MeterTblTableIdReport3byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_4BYTE_FRAME ZW_MeterTblTableIdReport4byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_GET_FRAME ZW_MeterTblTablePointAdmNoGetFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_GET_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_1BYTE_FRAME ZW_MeterTblTablePointAdmNoReport1byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_2BYTE_FRAME ZW_MeterTblTablePointAdmNoReport2byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_3BYTE_FRAME ZW_MeterTblTablePointAdmNoReport3byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_4BYTE_FRAME ZW_MeterTblTablePointAdmNoReport4byteFrame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_4BYTE_FRAME();
    /* Command class Meter Tbl Monitor V2 */
    public final ZW_ClassCommand.VG_METER_TBL_STATUS_REPORT_V2_VG VG_MeterTblStatusReportV2VGroup
            = new ZW_ClassCommand.VG_METER_TBL_STATUS_REPORT_V2_VG();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_1BYTE_V2_FRAME ZW_MeterTblStatusReport1byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_2BYTE_V2_FRAME ZW_MeterTblStatusReport2byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_3BYTE_V2_FRAME ZW_MeterTblStatusReport3byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_4BYTE_V2_FRAME ZW_MeterTblStatusReport4byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_DATE_GET_V2_FRAME ZW_MeterTblStatusDateGetV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_DATE_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_DEPTH_GET_V2_FRAME ZW_MeterTblStatusDepthGetV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_DEPTH_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_SUPPORTED_GET_V2_FRAME ZW_MeterTblStatusSupportedGetV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_SUPPORTED_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_STATUS_SUPPORTED_REPORT_V2_FRAME ZW_MeterTblStatusSupportedReportV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_STATUS_SUPPORTED_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_GET_V2_FRAME ZW_MeterTblCurrentDataGetV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_GET_V2_FRAME();
    public final ZW_ClassCommand.VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG VG_MeterTblCurrentDataReportV2VGroup
            = new ZW_ClassCommand.VG_METER_TBL_CURRENT_DATA_REPORT_V2_VG();
    public final ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_1BYTE_V2_FRAME ZW_MeterTblCurrentDataReport1byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_2BYTE_V2_FRAME ZW_MeterTblCurrentDataReport2byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_3BYTE_V2_FRAME ZW_MeterTblCurrentDataReport3byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_4BYTE_V2_FRAME ZW_MeterTblCurrentDataReport4byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_CURRENT_DATA_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_GET_V2_FRAME ZW_MeterTblHistoricalDataGetV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_GET_V2_FRAME();
    public final ZW_ClassCommand.VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG VG_MeterTblHistoricalDataReportV2VGroup
            = new ZW_ClassCommand.VG_METER_TBL_HISTORICAL_DATA_REPORT_V2_VG();
    public final ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_1BYTE_V2_FRAME ZW_MeterTblHistoricalDataReport1byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_2BYTE_V2_FRAME ZW_MeterTblHistoricalDataReport2byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_3BYTE_V2_FRAME ZW_MeterTblHistoricalDataReport3byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_4BYTE_V2_FRAME ZW_MeterTblHistoricalDataReport4byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_HISTORICAL_DATA_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_REPORT_V2_FRAME ZW_MeterTblReportV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_CAPABILITY_GET_V2_FRAME ZW_MeterTblTableCapabilityGetV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_CAPABILITY_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_GET_V2_FRAME ZW_MeterTblTableIdGetV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_1BYTE_V2_FRAME ZW_MeterTblTableIdReport1byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_2BYTE_V2_FRAME ZW_MeterTblTableIdReport2byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_3BYTE_V2_FRAME ZW_MeterTblTableIdReport3byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_4BYTE_V2_FRAME ZW_MeterTblTableIdReport4byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_ID_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_GET_V2_FRAME ZW_MeterTblTablePointAdmNoGetV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_1BYTE_V2_FRAME ZW_MeterTblTablePointAdmNoReport1byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_2BYTE_V2_FRAME ZW_MeterTblTablePointAdmNoReport2byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_3BYTE_V2_FRAME ZW_MeterTblTablePointAdmNoReport3byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_4BYTE_V2_FRAME ZW_MeterTblTablePointAdmNoReport4byteV2Frame
            = new ZW_ClassCommand.ZW_METER_TBL_TABLE_POINT_ADM_NO_REPORT_4BYTE_V2_FRAME();
    /* Command class Meter Tbl Push */
    public final ZW_ClassCommand.ZW_METER_TBL_PUSH_CONFIGURATION_GET_FRAME ZW_MeterTblPushConfigurationGetFrame
            = new ZW_ClassCommand.ZW_METER_TBL_PUSH_CONFIGURATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_PUSH_CONFIGURATION_REPORT_FRAME ZW_MeterTblPushConfigurationReportFrame
            = new ZW_ClassCommand.ZW_METER_TBL_PUSH_CONFIGURATION_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_METER_TBL_PUSH_CONFIGURATION_SET_FRAME ZW_MeterTblPushConfigurationSetFrame
            = new ZW_ClassCommand.ZW_METER_TBL_PUSH_CONFIGURATION_SET_FRAME();
    /* Command class Meter */
    public final ZW_ClassCommand.ZW_METER_GET_FRAME ZW_MeterGetFrame
            = new ZW_ClassCommand.ZW_METER_GET_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_1BYTE_FRAME ZW_MeterReport1byteFrame
            = new ZW_ClassCommand.ZW_METER_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_2BYTE_FRAME ZW_MeterReport2byteFrame
            = new ZW_ClassCommand.ZW_METER_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_3BYTE_FRAME ZW_MeterReport3byteFrame
            = new ZW_ClassCommand.ZW_METER_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_4BYTE_FRAME ZW_MeterReport4byteFrame
            = new ZW_ClassCommand.ZW_METER_REPORT_4BYTE_FRAME();
    /* Command class Meter V2 */
    public final ZW_ClassCommand.ZW_METER_GET_V2_FRAME ZW_MeterGetV2Frame
            = new ZW_ClassCommand.ZW_METER_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_1BYTE_V2_FRAME ZW_MeterReport1byteV2Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_2BYTE_V2_FRAME ZW_MeterReport2byteV2Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_3BYTE_V2_FRAME ZW_MeterReport3byteV2Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_4BYTE_V2_FRAME ZW_MeterReport4byteV2Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_RESET_V2_FRAME ZW_MeterResetV2Frame
            = new ZW_ClassCommand.ZW_METER_RESET_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_SUPPORTED_GET_V2_FRAME ZW_MeterSupportedGetV2Frame
            = new ZW_ClassCommand.ZW_METER_SUPPORTED_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_V2_FRAME ZW_MeterSupportedReportV2Frame
            = new ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_V2_FRAME();
    /* Command class Meter V3 */
    public final ZW_ClassCommand.ZW_METER_GET_V3_FRAME ZW_MeterGetV3Frame
            = new ZW_ClassCommand.ZW_METER_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_1BYTE_V3_FRAME ZW_MeterReport1byteV3Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_2BYTE_V3_FRAME ZW_MeterReport2byteV3Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_3BYTE_V3_FRAME ZW_MeterReport3byteV3Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_4BYTE_V3_FRAME ZW_MeterReport4byteV3Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_METER_RESET_V3_FRAME ZW_MeterResetV3Frame
            = new ZW_ClassCommand.ZW_METER_RESET_V3_FRAME();
    public final ZW_ClassCommand.ZW_METER_SUPPORTED_GET_V3_FRAME ZW_MeterSupportedGetV3Frame
            = new ZW_ClassCommand.ZW_METER_SUPPORTED_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_V3_FRAME ZW_MeterSupportedReportV3Frame
            = new ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_V3_FRAME();
    /* Command class Meter V4 */
    public final ZW_ClassCommand.ZW_METER_GET_V4_FRAME ZW_MeterGetV4Frame
            = new ZW_ClassCommand.ZW_METER_GET_V4_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_1BYTE_V4_FRAME ZW_MeterReport1byteV4Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_1BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_2BYTE_V4_FRAME ZW_MeterReport2byteV4Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_2BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_3BYTE_V4_FRAME ZW_MeterReport3byteV4Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_3BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_METER_REPORT_4BYTE_V4_FRAME ZW_MeterReport4byteV4Frame
            = new ZW_ClassCommand.ZW_METER_REPORT_4BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_METER_RESET_V4_FRAME ZW_MeterResetV4Frame
            = new ZW_ClassCommand.ZW_METER_RESET_V4_FRAME();
    public final ZW_ClassCommand.ZW_METER_SUPPORTED_GET_V4_FRAME ZW_MeterSupportedGetV4Frame
            = new ZW_ClassCommand.ZW_METER_SUPPORTED_GET_V4_FRAME();
    public final ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_1BYTE_V4_FRAME ZW_MeterSupportedReport1byteV4Frame
            = new ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_1BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_2BYTE_V4_FRAME ZW_MeterSupportedReport2byteV4Frame
            = new ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_2BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_3BYTE_V4_FRAME ZW_MeterSupportedReport3byteV4Frame
            = new ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_3BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_4BYTE_V4_FRAME ZW_MeterSupportedReport4byteV4Frame
            = new ZW_ClassCommand.ZW_METER_SUPPORTED_REPORT_4BYTE_V4_FRAME();
    /* Command class Mtp Window Covering */
    public final ZW_ClassCommand.ZW_MOVE_TO_POSITION_GET_FRAME ZW_MoveToPositionGetFrame
            = new ZW_ClassCommand.ZW_MOVE_TO_POSITION_GET_FRAME();
    public final ZW_ClassCommand.ZW_MOVE_TO_POSITION_REPORT_FRAME ZW_MoveToPositionReportFrame
            = new ZW_ClassCommand.ZW_MOVE_TO_POSITION_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_MOVE_TO_POSITION_SET_FRAME ZW_MoveToPositionSetFrame
            = new ZW_ClassCommand.ZW_MOVE_TO_POSITION_SET_FRAME();
    /* Command class Multi Channel Association V2 */
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_GET_V2_FRAME ZW_MultiChannelAssociationGetV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_GROUPINGS_GET_V2_FRAME ZW_MultiChannelAssociationGroupingsGetV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_GROUPINGS_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_GROUPINGS_REPORT_V2_FRAME ZW_MultiChannelAssociationGroupingsReportV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_GROUPINGS_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_1BYTE_V2_FRAME ZW_MultiChannelAssociationRemove1byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_2BYTE_V2_FRAME ZW_MultiChannelAssociationRemove2byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_3BYTE_V2_FRAME ZW_MultiChannelAssociationRemove3byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_4BYTE_V2_FRAME ZW_MultiChannelAssociationRemove4byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REMOVE_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_1BYTE_V2_FRAME ZW_MultiChannelAssociationReport1byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_2BYTE_V2_FRAME ZW_MultiChannelAssociationReport2byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_3BYTE_V2_FRAME ZW_MultiChannelAssociationReport3byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_4BYTE_V2_FRAME ZW_MultiChannelAssociationReport4byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_SET_1BYTE_V2_FRAME ZW_MultiChannelAssociationSet1byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_SET_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_SET_2BYTE_V2_FRAME ZW_MultiChannelAssociationSet2byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_SET_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_SET_3BYTE_V2_FRAME ZW_MultiChannelAssociationSet3byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_SET_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_SET_4BYTE_V2_FRAME ZW_MultiChannelAssociationSet4byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_ASSOCIATION_SET_4BYTE_V2_FRAME();
    /* Command class Multi Channel V2 */
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_GET_V2_FRAME ZW_MultiChannelCapabilityGetV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_1BYTE_V2_FRAME ZW_MultiChannelCapabilityReport1byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_2BYTE_V2_FRAME ZW_MultiChannelCapabilityReport2byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_3BYTE_V2_FRAME ZW_MultiChannelCapabilityReport3byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_4BYTE_V2_FRAME ZW_MultiChannelCapabilityReport4byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_V2_FRAME ZW_MultiChannelEndPointFindV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_V2_FRAME();
    public final ZW_ClassCommand.VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG VG_MultiChannelEndPointFindReportV2VGroup
            = new ZW_ClassCommand.VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V2_VG();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_1BYTE_V2_FRAME ZW_MultiChannelEndPointFindReport1byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_2BYTE_V2_FRAME ZW_MultiChannelEndPointFindReport2byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_3BYTE_V2_FRAME ZW_MultiChannelEndPointFindReport3byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_4BYTE_V2_FRAME ZW_MultiChannelEndPointFindReport4byteV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_GET_V2_FRAME ZW_MultiChannelEndPointGetV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_REPORT_V2_FRAME ZW_MultiChannelEndPointReportV2Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_GET_V2_FRAME ZW_MultiInstanceGetV2Frame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_REPORT_V2_FRAME ZW_MultiInstanceReportV2Frame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_REPORT_V2_FRAME();
    /* Command class Multi Channel V3 */
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_GET_V3_FRAME ZW_MultiChannelCapabilityGetV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_1BYTE_V3_FRAME ZW_MultiChannelCapabilityReport1byteV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_2BYTE_V3_FRAME ZW_MultiChannelCapabilityReport2byteV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_3BYTE_V3_FRAME ZW_MultiChannelCapabilityReport3byteV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_4BYTE_V3_FRAME ZW_MultiChannelCapabilityReport4byteV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_CAPABILITY_REPORT_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_V3_FRAME ZW_MultiChannelEndPointFindV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_V3_FRAME();
    public final ZW_ClassCommand.VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG VG_MultiChannelEndPointFindReportV3VGroup
            = new ZW_ClassCommand.VG_MULTI_CHANNEL_END_POINT_FIND_REPORT_V3_VG();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_1BYTE_V3_FRAME ZW_MultiChannelEndPointFindReport1byteV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_2BYTE_V3_FRAME ZW_MultiChannelEndPointFindReport2byteV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_3BYTE_V3_FRAME ZW_MultiChannelEndPointFindReport3byteV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_4BYTE_V3_FRAME ZW_MultiChannelEndPointFindReport4byteV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_FIND_REPORT_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_GET_V3_FRAME ZW_MultiChannelEndPointGetV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_REPORT_V3_FRAME ZW_MultiChannelEndPointReportV3Frame
            = new ZW_ClassCommand.ZW_MULTI_CHANNEL_END_POINT_REPORT_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_GET_V3_FRAME ZW_MultiInstanceGetV3Frame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_REPORT_V3_FRAME ZW_MultiInstanceReportV3Frame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_REPORT_V3_FRAME();
    /* Command class Multi Instance Association */
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_GET_FRAME ZW_MultiInstanceAssociationGetFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_GROUPINGS_GET_FRAME ZW_MultiInstanceAssociationGroupingsGetFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_GROUPINGS_GET_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_GROUPINGS_REPORT_FRAME ZW_MultiInstanceAssociationGroupingsReportFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_GROUPINGS_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_1BYTE_FRAME ZW_MultiInstanceAssociationRemove1byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_2BYTE_FRAME ZW_MultiInstanceAssociationRemove2byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_3BYTE_FRAME ZW_MultiInstanceAssociationRemove3byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_4BYTE_FRAME ZW_MultiInstanceAssociationRemove4byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REMOVE_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_1BYTE_FRAME ZW_MultiInstanceAssociationReport1byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_2BYTE_FRAME ZW_MultiInstanceAssociationReport2byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_3BYTE_FRAME ZW_MultiInstanceAssociationReport3byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_4BYTE_FRAME ZW_MultiInstanceAssociationReport4byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_SET_1BYTE_FRAME ZW_MultiInstanceAssociationSet1byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_SET_2BYTE_FRAME ZW_MultiInstanceAssociationSet2byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_SET_3BYTE_FRAME ZW_MultiInstanceAssociationSet3byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_SET_4BYTE_FRAME ZW_MultiInstanceAssociationSet4byteFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_ASSOCIATION_SET_4BYTE_FRAME();
    /* Command class Multi Instance */
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_GET_FRAME ZW_MultiInstanceGetFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_GET_FRAME();
    public final ZW_ClassCommand.ZW_MULTI_INSTANCE_REPORT_FRAME ZW_MultiInstanceReportFrame
            = new ZW_ClassCommand.ZW_MULTI_INSTANCE_REPORT_FRAME();
    /* Command class Network Management Proxy */
    public final ZW_ClassCommand.ZW_NODE_INFO_CACHED_GET_FRAME ZW_NodeInfoCachedGetFrame
            = new ZW_ClassCommand.ZW_NODE_INFO_CACHED_GET_FRAME();
    public final ZW_ClassCommand.ZW_NODE_INFO_CACHED_REPORT_1BYTE_FRAME ZW_NodeInfoCachedReport1byteFrame
            = new ZW_ClassCommand.ZW_NODE_INFO_CACHED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_INFO_CACHED_REPORT_2BYTE_FRAME ZW_NodeInfoCachedReport2byteFrame
            = new ZW_ClassCommand.ZW_NODE_INFO_CACHED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_INFO_CACHED_REPORT_3BYTE_FRAME ZW_NodeInfoCachedReport3byteFrame
            = new ZW_ClassCommand.ZW_NODE_INFO_CACHED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_INFO_CACHED_REPORT_4BYTE_FRAME ZW_NodeInfoCachedReport4byteFrame
            = new ZW_ClassCommand.ZW_NODE_INFO_CACHED_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_LIST_GET_FRAME ZW_NodeListGetFrame
            = new ZW_ClassCommand.ZW_NODE_LIST_GET_FRAME();
    public final ZW_ClassCommand.ZW_NODE_LIST_REPORT_1BYTE_FRAME ZW_NodeListReport1byteFrame
            = new ZW_ClassCommand.ZW_NODE_LIST_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_LIST_REPORT_2BYTE_FRAME ZW_NodeListReport2byteFrame
            = new ZW_ClassCommand.ZW_NODE_LIST_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_LIST_REPORT_3BYTE_FRAME ZW_NodeListReport3byteFrame
            = new ZW_ClassCommand.ZW_NODE_LIST_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_LIST_REPORT_4BYTE_FRAME ZW_NodeListReport4byteFrame
            = new ZW_ClassCommand.ZW_NODE_LIST_REPORT_4BYTE_FRAME();
    /* Command class Network Management Basic */
    public final ZW_ClassCommand.ZW_LEARN_MODE_SET_FRAME ZW_LearnModeSetFrame
            = new ZW_ClassCommand.ZW_LEARN_MODE_SET_FRAME();
    public final ZW_ClassCommand.ZW_LEARN_MODE_SET_STATUS_FRAME ZW_LearnModeSetStatusFrame
            = new ZW_ClassCommand.ZW_LEARN_MODE_SET_STATUS_FRAME();
    public final ZW_ClassCommand.ZW_NODE_INFORMATION_SEND_FRAME ZW_NodeInformationSendFrame
            = new ZW_ClassCommand.ZW_NODE_INFORMATION_SEND_FRAME();
    public final ZW_ClassCommand.ZW_NETWORK_UPDATE_REQUEST_FRAME ZW_NetworkUpdateRequestFrame
            = new ZW_ClassCommand.ZW_NETWORK_UPDATE_REQUEST_FRAME();
    public final ZW_ClassCommand.ZW_NETWORK_UPDATE_REQUEST_STATUS_FRAME ZW_NetworkUpdateRequestStatusFrame
            = new ZW_ClassCommand.ZW_NETWORK_UPDATE_REQUEST_STATUS_FRAME();
    public final ZW_ClassCommand.ZW_DEFAULT_SET_FRAME ZW_DefaultSetFrame
            = new ZW_ClassCommand.ZW_DEFAULT_SET_FRAME();
    public final ZW_ClassCommand.ZW_DEFAULT_SET_COMPLETE_FRAME ZW_DefaultSetCompleteFrame
            = new ZW_ClassCommand.ZW_DEFAULT_SET_COMPLETE_FRAME();
    /* Command class Network Management Inclusion */
    public final ZW_ClassCommand.ZW_FAILED_NODE_REMOVE_FRAME ZW_FailedNodeRemoveFrame
            = new ZW_ClassCommand.ZW_FAILED_NODE_REMOVE_FRAME();
    public final ZW_ClassCommand.ZW_FAILED_NODE_REMOVE_STATUS_FRAME ZW_FailedNodeRemoveStatusFrame
            = new ZW_ClassCommand.ZW_FAILED_NODE_REMOVE_STATUS_FRAME();
    public final ZW_ClassCommand.ZW_NODE_ADD_FRAME ZW_NodeAddFrame
            = new ZW_ClassCommand.ZW_NODE_ADD_FRAME();
    public final ZW_ClassCommand.ZW_NODE_ADD_STATUS_1BYTE_FRAME ZW_NodeAddStatus1byteFrame
            = new ZW_ClassCommand.ZW_NODE_ADD_STATUS_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_ADD_STATUS_2BYTE_FRAME ZW_NodeAddStatus2byteFrame
            = new ZW_ClassCommand.ZW_NODE_ADD_STATUS_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_ADD_STATUS_3BYTE_FRAME ZW_NodeAddStatus3byteFrame
            = new ZW_ClassCommand.ZW_NODE_ADD_STATUS_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_ADD_STATUS_4BYTE_FRAME ZW_NodeAddStatus4byteFrame
            = new ZW_ClassCommand.ZW_NODE_ADD_STATUS_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_REMOVE_FRAME ZW_NodeRemoveFrame
            = new ZW_ClassCommand.ZW_NODE_REMOVE_FRAME();
    public final ZW_ClassCommand.ZW_NODE_REMOVE_STATUS_FRAME ZW_NodeRemoveStatusFrame
            = new ZW_ClassCommand.ZW_NODE_REMOVE_STATUS_FRAME();
    public final ZW_ClassCommand.ZW_FAILED_NODE_REPLACE_FRAME ZW_FailedNodeReplaceFrame
            = new ZW_ClassCommand.ZW_FAILED_NODE_REPLACE_FRAME();
    public final ZW_ClassCommand.ZW_FAILED_NODE_REPLACE_STATUS_FRAME ZW_FailedNodeReplaceStatusFrame
            = new ZW_ClassCommand.ZW_FAILED_NODE_REPLACE_STATUS_FRAME();
    public final ZW_ClassCommand.ZW_NODE_NEIGHBOR_UPDATE_REQUEST_FRAME ZW_NodeNeighborUpdateRequestFrame
            = new ZW_ClassCommand.ZW_NODE_NEIGHBOR_UPDATE_REQUEST_FRAME();
    public final ZW_ClassCommand.ZW_NODE_NEIGHBOR_UPDATE_STATUS_FRAME ZW_NodeNeighborUpdateStatusFrame
            = new ZW_ClassCommand.ZW_NODE_NEIGHBOR_UPDATE_STATUS_FRAME();
    public final ZW_ClassCommand.ZW_RETURN_ROUTE_ASSIGN_FRAME ZW_ReturnRouteAssignFrame
            = new ZW_ClassCommand.ZW_RETURN_ROUTE_ASSIGN_FRAME();
    public final ZW_ClassCommand.ZW_RETURN_ROUTE_ASSIGN_COMPLETE_FRAME ZW_ReturnRouteAssignCompleteFrame
            = new ZW_ClassCommand.ZW_RETURN_ROUTE_ASSIGN_COMPLETE_FRAME();
    public final ZW_ClassCommand.ZW_RETURN_ROUTE_DELETE_FRAME ZW_ReturnRouteDeleteFrame
            = new ZW_ClassCommand.ZW_RETURN_ROUTE_DELETE_FRAME();
    public final ZW_ClassCommand.ZW_RETURN_ROUTE_DELETE_COMPLETE_FRAME ZW_ReturnRouteDeleteCompleteFrame
            = new ZW_ClassCommand.ZW_RETURN_ROUTE_DELETE_COMPLETE_FRAME();
    /* Command class Node Naming */
    public final ZW_ClassCommand.ZW_NODE_NAMING_NODE_LOCATION_REPORT_FRAME ZW_NodeNamingNodeLocationReportFrame
            = new ZW_ClassCommand.ZW_NODE_NAMING_NODE_LOCATION_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_NODE_NAMING_NODE_LOCATION_SET_FRAME ZW_NodeNamingNodeLocationSetFrame
            = new ZW_ClassCommand.ZW_NODE_NAMING_NODE_LOCATION_SET_FRAME();
    public final ZW_ClassCommand.ZW_NODE_NAMING_NODE_LOCATION_GET_FRAME ZW_NodeNamingNodeLocationGetFrame
            = new ZW_ClassCommand.ZW_NODE_NAMING_NODE_LOCATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_NODE_NAMING_NODE_NAME_GET_FRAME ZW_NodeNamingNodeNameGetFrame
            = new ZW_ClassCommand.ZW_NODE_NAMING_NODE_NAME_GET_FRAME();
    public final ZW_ClassCommand.ZW_NODE_NAMING_NODE_NAME_REPORT_FRAME ZW_NodeNamingNodeNameReportFrame
            = new ZW_ClassCommand.ZW_NODE_NAMING_NODE_NAME_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_NODE_NAMING_NODE_NAME_SET_FRAME ZW_NodeNamingNodeNameSetFrame
            = new ZW_ClassCommand.ZW_NODE_NAMING_NODE_NAME_SET_FRAME();
    /* Command class Powerlevel */
    public final ZW_ClassCommand.ZW_POWERLEVEL_GET_FRAME ZW_PowerlevelGetFrame
            = new ZW_ClassCommand.ZW_POWERLEVEL_GET_FRAME();
    public final ZW_ClassCommand.ZW_POWERLEVEL_REPORT_FRAME ZW_PowerlevelReportFrame
            = new ZW_ClassCommand.ZW_POWERLEVEL_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_POWERLEVEL_SET_FRAME ZW_PowerlevelSetFrame
            = new ZW_ClassCommand.ZW_POWERLEVEL_SET_FRAME();
    public final ZW_ClassCommand.ZW_POWERLEVEL_TEST_NODE_GET_FRAME ZW_PowerlevelTestNodeGetFrame
            = new ZW_ClassCommand.ZW_POWERLEVEL_TEST_NODE_GET_FRAME();
    public final ZW_ClassCommand.ZW_POWERLEVEL_TEST_NODE_REPORT_FRAME ZW_PowerlevelTestNodeReportFrame
            = new ZW_ClassCommand.ZW_POWERLEVEL_TEST_NODE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_POWERLEVEL_TEST_NODE_SET_FRAME ZW_PowerlevelTestNodeSetFrame
            = new ZW_ClassCommand.ZW_POWERLEVEL_TEST_NODE_SET_FRAME();
    /* Command class Prepayment Encapsulation */
    public final ZW_ClassCommand.ZW_CMD_ENCAPSULATION_1BYTE_FRAME ZW_CmdEncapsulation1byteFrame
            = new ZW_ClassCommand.ZW_CMD_ENCAPSULATION_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CMD_ENCAPSULATION_2BYTE_FRAME ZW_CmdEncapsulation2byteFrame
            = new ZW_ClassCommand.ZW_CMD_ENCAPSULATION_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CMD_ENCAPSULATION_3BYTE_FRAME ZW_CmdEncapsulation3byteFrame
            = new ZW_ClassCommand.ZW_CMD_ENCAPSULATION_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CMD_ENCAPSULATION_4BYTE_FRAME ZW_CmdEncapsulation4byteFrame
            = new ZW_ClassCommand.ZW_CMD_ENCAPSULATION_4BYTE_FRAME();
    /* Command class Prepayment */
    public final ZW_ClassCommand.ZW_PREPAYMENT_BALANCE_GET_FRAME ZW_PrepaymentBalanceGetFrame
            = new ZW_ClassCommand.ZW_PREPAYMENT_BALANCE_GET_FRAME();
    public final ZW_ClassCommand.ZW_PREPAYMENT_BALANCE_REPORT_FRAME ZW_PrepaymentBalanceReportFrame
            = new ZW_ClassCommand.ZW_PREPAYMENT_BALANCE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_PREPAYMENT_SUPPORTED_GET_FRAME ZW_PrepaymentSupportedGetFrame
            = new ZW_ClassCommand.ZW_PREPAYMENT_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_PREPAYMENT_SUPPORTED_REPORT_FRAME ZW_PrepaymentSupportedReportFrame
            = new ZW_ClassCommand.ZW_PREPAYMENT_SUPPORTED_REPORT_FRAME();
    /* Command class Proprietary */
    public final ZW_ClassCommand.ZW_PROPRIETARY_GET_1BYTE_FRAME ZW_ProprietaryGet1byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_GET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_GET_2BYTE_FRAME ZW_ProprietaryGet2byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_GET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_GET_3BYTE_FRAME ZW_ProprietaryGet3byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_GET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_GET_4BYTE_FRAME ZW_ProprietaryGet4byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_GET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_REPORT_1BYTE_FRAME ZW_ProprietaryReport1byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_REPORT_2BYTE_FRAME ZW_ProprietaryReport2byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_REPORT_3BYTE_FRAME ZW_ProprietaryReport3byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_REPORT_4BYTE_FRAME ZW_ProprietaryReport4byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_SET_1BYTE_FRAME ZW_ProprietarySet1byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_SET_2BYTE_FRAME ZW_ProprietarySet2byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_SET_3BYTE_FRAME ZW_ProprietarySet3byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_PROPRIETARY_SET_4BYTE_FRAME ZW_ProprietarySet4byteFrame
            = new ZW_ClassCommand.ZW_PROPRIETARY_SET_4BYTE_FRAME();
    /* Command class Protection */
    public final ZW_ClassCommand.ZW_PROTECTION_GET_FRAME ZW_ProtectionGetFrame
            = new ZW_ClassCommand.ZW_PROTECTION_GET_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_REPORT_FRAME ZW_ProtectionReportFrame
            = new ZW_ClassCommand.ZW_PROTECTION_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_SET_FRAME ZW_ProtectionSetFrame
            = new ZW_ClassCommand.ZW_PROTECTION_SET_FRAME();
    /* Command class Protection V2 */
    public final ZW_ClassCommand.ZW_PROTECTION_EC_GET_V2_FRAME ZW_ProtectionEcGetV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_EC_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_EC_REPORT_V2_FRAME ZW_ProtectionEcReportV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_EC_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_EC_SET_V2_FRAME ZW_ProtectionEcSetV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_EC_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_GET_V2_FRAME ZW_ProtectionGetV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_REPORT_V2_FRAME ZW_ProtectionReportV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_SET_V2_FRAME ZW_ProtectionSetV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_SUPPORTED_GET_V2_FRAME ZW_ProtectionSupportedGetV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_SUPPORTED_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_SUPPORTED_REPORT_V2_FRAME ZW_ProtectionSupportedReportV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_SUPPORTED_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_TIMEOUT_GET_V2_FRAME ZW_ProtectionTimeoutGetV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_TIMEOUT_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_TIMEOUT_REPORT_V2_FRAME ZW_ProtectionTimeoutReportV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_TIMEOUT_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_PROTECTION_TIMEOUT_SET_V2_FRAME ZW_ProtectionTimeoutSetV2Frame
            = new ZW_ClassCommand.ZW_PROTECTION_TIMEOUT_SET_V2_FRAME();
    /* Command class Rate Tbl Config */
    public final ZW_ClassCommand.ZW_RATE_TBL_REMOVE_1BYTE_FRAME ZW_RateTblRemove1byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_REMOVE_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_REMOVE_2BYTE_FRAME ZW_RateTblRemove2byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_REMOVE_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_REMOVE_3BYTE_FRAME ZW_RateTblRemove3byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_REMOVE_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_REMOVE_4BYTE_FRAME ZW_RateTblRemove4byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_REMOVE_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_SET_1BYTE_FRAME ZW_RateTblSet1byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_SET_2BYTE_FRAME ZW_RateTblSet2byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_SET_3BYTE_FRAME ZW_RateTblSet3byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_SET_4BYTE_FRAME ZW_RateTblSet4byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_SET_4BYTE_FRAME();
    /* Command class Rate Tbl Monitor */
    public final ZW_ClassCommand.ZW_RATE_TBL_ACTIVE_RATE_GET_FRAME ZW_RateTblActiveRateGetFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_ACTIVE_RATE_GET_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_ACTIVE_RATE_REPORT_FRAME ZW_RateTblActiveRateReportFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_ACTIVE_RATE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_CURRENT_DATA_GET_FRAME ZW_RateTblCurrentDataGetFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_CURRENT_DATA_GET_FRAME();
    public final ZW_ClassCommand.VG_RATE_TBL_CURRENT_DATA_REPORT_VG VG_RateTblCurrentDataReportVGroup
            = new ZW_ClassCommand.VG_RATE_TBL_CURRENT_DATA_REPORT_VG();
    public final ZW_ClassCommand.ZW_RATE_TBL_CURRENT_DATA_REPORT_1BYTE_FRAME ZW_RateTblCurrentDataReport1byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_CURRENT_DATA_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_CURRENT_DATA_REPORT_2BYTE_FRAME ZW_RateTblCurrentDataReport2byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_CURRENT_DATA_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_CURRENT_DATA_REPORT_3BYTE_FRAME ZW_RateTblCurrentDataReport3byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_CURRENT_DATA_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_CURRENT_DATA_REPORT_4BYTE_FRAME ZW_RateTblCurrentDataReport4byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_CURRENT_DATA_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_GET_FRAME ZW_RateTblGetFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_GET_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_HISTORICAL_DATA_GET_FRAME ZW_RateTblHistoricalDataGetFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_HISTORICAL_DATA_GET_FRAME();
    public final ZW_ClassCommand.VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG VG_RateTblHistoricalDataReportVGroup
            = new ZW_ClassCommand.VG_RATE_TBL_HISTORICAL_DATA_REPORT_VG();
    public final ZW_ClassCommand.ZW_RATE_TBL_HISTORICAL_DATA_REPORT_1BYTE_FRAME ZW_RateTblHistoricalDataReport1byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_HISTORICAL_DATA_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_HISTORICAL_DATA_REPORT_2BYTE_FRAME ZW_RateTblHistoricalDataReport2byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_HISTORICAL_DATA_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_HISTORICAL_DATA_REPORT_3BYTE_FRAME ZW_RateTblHistoricalDataReport3byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_HISTORICAL_DATA_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_HISTORICAL_DATA_REPORT_4BYTE_FRAME ZW_RateTblHistoricalDataReport4byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_HISTORICAL_DATA_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_REPORT_1BYTE_FRAME ZW_RateTblReport1byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_REPORT_2BYTE_FRAME ZW_RateTblReport2byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_REPORT_3BYTE_FRAME ZW_RateTblReport3byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_REPORT_4BYTE_FRAME ZW_RateTblReport4byteFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_SUPPORTED_GET_FRAME ZW_RateTblSupportedGetFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_RATE_TBL_SUPPORTED_REPORT_FRAME ZW_RateTblSupportedReportFrame
            = new ZW_ClassCommand.ZW_RATE_TBL_SUPPORTED_REPORT_FRAME();
    /* Command class Remote Association Activate */
    public final ZW_ClassCommand.ZW_REMOTE_ASSOCIATION_ACTIVATE_FRAME ZW_RemoteAssociationActivateFrame
            = new ZW_ClassCommand.ZW_REMOTE_ASSOCIATION_ACTIVATE_FRAME();
    /* Command class Remote Association */
    public final ZW_ClassCommand.ZW_REMOTE_ASSOCIATION_CONFIGURATION_GET_FRAME ZW_RemoteAssociationConfigurationGetFrame
            = new ZW_ClassCommand.ZW_REMOTE_ASSOCIATION_CONFIGURATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_REMOTE_ASSOCIATION_CONFIGURATION_REPORT_FRAME ZW_RemoteAssociationConfigurationReportFrame
            = new ZW_ClassCommand.ZW_REMOTE_ASSOCIATION_CONFIGURATION_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_REMOTE_ASSOCIATION_CONFIGURATION_SET_FRAME ZW_RemoteAssociationConfigurationSetFrame
            = new ZW_ClassCommand.ZW_REMOTE_ASSOCIATION_CONFIGURATION_SET_FRAME();
    /* Command class Scene Activation */
    public final ZW_ClassCommand.ZW_SCENE_ACTIVATION_SET_FRAME ZW_SceneActivationSetFrame
            = new ZW_ClassCommand.ZW_SCENE_ACTIVATION_SET_FRAME();
    /* Command class Scene Actuator Conf */
    public final ZW_ClassCommand.ZW_SCENE_ACTUATOR_CONF_GET_FRAME ZW_SceneActuatorConfGetFrame
            = new ZW_ClassCommand.ZW_SCENE_ACTUATOR_CONF_GET_FRAME();
    public final ZW_ClassCommand.ZW_SCENE_ACTUATOR_CONF_REPORT_FRAME ZW_SceneActuatorConfReportFrame
            = new ZW_ClassCommand.ZW_SCENE_ACTUATOR_CONF_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SCENE_ACTUATOR_CONF_SET_FRAME ZW_SceneActuatorConfSetFrame
            = new ZW_ClassCommand.ZW_SCENE_ACTUATOR_CONF_SET_FRAME();
    /* Command class Scene Controller Conf */
    public final ZW_ClassCommand.ZW_SCENE_CONTROLLER_CONF_GET_FRAME ZW_SceneControllerConfGetFrame
            = new ZW_ClassCommand.ZW_SCENE_CONTROLLER_CONF_GET_FRAME();
    public final ZW_ClassCommand.ZW_SCENE_CONTROLLER_CONF_REPORT_FRAME ZW_SceneControllerConfReportFrame
            = new ZW_ClassCommand.ZW_SCENE_CONTROLLER_CONF_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SCENE_CONTROLLER_CONF_SET_FRAME ZW_SceneControllerConfSetFrame
            = new ZW_ClassCommand.ZW_SCENE_CONTROLLER_CONF_SET_FRAME();
    /* Command class Schedule Entry Lock */
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_FRAME ZW_ScheduleEntryLockEnableAllSetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_SET_FRAME ZW_ScheduleEntryLockEnableSetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_SET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_FRAME ZW_ScheduleEntryLockWeekDayGetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_FRAME ZW_ScheduleEntryLockWeekDayReportFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_FRAME ZW_ScheduleEntryLockWeekDaySetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_FRAME ZW_ScheduleEntryLockYearDayGetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_FRAME ZW_ScheduleEntryLockYearDayReportFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_FRAME ZW_ScheduleEntryLockYearDaySetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_FRAME ZW_ScheduleEntryTypeSupportedGetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_FRAME ZW_ScheduleEntryTypeSupportedReportFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_FRAME();
    /* Command class Schedule Entry Lock V2 */
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_V2_FRAME ZW_ScheduleEntryLockEnableAllSetV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_SET_V2_FRAME ZW_ScheduleEntryLockEnableSetV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_GET_V2_FRAME ZW_ScheduleEntryLockTimeOffsetGetV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_V2_FRAME ZW_ScheduleEntryLockTimeOffsetReportV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_V2_FRAME ZW_ScheduleEntryLockTimeOffsetSetV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_V2_FRAME ZW_ScheduleEntryLockWeekDayGetV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_V2_FRAME ZW_ScheduleEntryLockWeekDayReportV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_V2_FRAME ZW_ScheduleEntryLockWeekDaySetV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_V2_FRAME ZW_ScheduleEntryLockYearDayGetV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_V2_FRAME ZW_ScheduleEntryLockYearDayReportV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_V2_FRAME ZW_ScheduleEntryLockYearDaySetV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_V2_FRAME ZW_ScheduleEntryTypeSupportedGetV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_V2_FRAME ZW_ScheduleEntryTypeSupportedReportV2Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_V2_FRAME();
    /* Command class Schedule Entry Lock V3 */
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_V3_FRAME ZW_ScheduleEntryLockEnableAllSetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_ALL_SET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_SET_V3_FRAME ZW_ScheduleEntryLockEnableSetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_ENABLE_SET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_GET_V3_FRAME ZW_ScheduleEntryLockTimeOffsetGetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_V3_FRAME ZW_ScheduleEntryLockTimeOffsetReportV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_REPORT_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_V3_FRAME ZW_ScheduleEntryLockTimeOffsetSetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_TIME_OFFSET_SET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_V3_FRAME ZW_ScheduleEntryLockWeekDayGetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_V3_FRAME ZW_ScheduleEntryLockWeekDayReportV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_REPORT_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_V3_FRAME ZW_ScheduleEntryLockWeekDaySetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_WEEK_DAY_SET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_V3_FRAME ZW_ScheduleEntryLockYearDayGetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_V3_FRAME ZW_ScheduleEntryLockYearDayReportV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_REPORT_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_V3_FRAME ZW_ScheduleEntryLockYearDaySetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_YEAR_DAY_SET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_V3_FRAME ZW_ScheduleEntryTypeSupportedGetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_V3_FRAME ZW_ScheduleEntryTypeSupportedReportV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_TYPE_SUPPORTED_REPORT_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_GET_V3_FRAME ZW_ScheduleEntryLockDailyRepeatingGetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_REPORT_V3_FRAME ZW_ScheduleEntryLockDailyRepeatingReportV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_REPORT_V3_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_SET_V3_FRAME ZW_ScheduleEntryLockDailyRepeatingSetV3Frame
            = new ZW_ClassCommand.ZW_SCHEDULE_ENTRY_LOCK_DAILY_REPEATING_SET_V3_FRAME();
    /* Command class Screen Attributes */
    public final ZW_ClassCommand.ZW_SCREEN_ATTRIBUTES_GET_FRAME ZW_ScreenAttributesGetFrame
            = new ZW_ClassCommand.ZW_SCREEN_ATTRIBUTES_GET_FRAME();
    public final ZW_ClassCommand.ZW_SCREEN_ATTRIBUTES_REPORT_FRAME ZW_ScreenAttributesReportFrame
            = new ZW_ClassCommand.ZW_SCREEN_ATTRIBUTES_REPORT_FRAME();
    /* Command class Screen Attributes V2 */
    public final ZW_ClassCommand.ZW_SCREEN_ATTRIBUTES_GET_V2_FRAME ZW_ScreenAttributesGetV2Frame
            = new ZW_ClassCommand.ZW_SCREEN_ATTRIBUTES_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCREEN_ATTRIBUTES_REPORT_V2_FRAME ZW_ScreenAttributesReportV2Frame
            = new ZW_ClassCommand.ZW_SCREEN_ATTRIBUTES_REPORT_V2_FRAME();
    /* Command class Screen Md */
    public final ZW_ClassCommand.ZW_SCREEN_MD_GET_FRAME ZW_ScreenMdGetFrame
            = new ZW_ClassCommand.ZW_SCREEN_MD_GET_FRAME();
    public final ZW_ClassCommand.VG_SCREEN_MD_REPORT_1BYTE_VG VG_ScreenMdReport1byteVGroup
            = new ZW_ClassCommand.VG_SCREEN_MD_REPORT_1BYTE_VG();
    public final ZW_ClassCommand.VG_SCREEN_MD_REPORT_2BYTE_VG VG_ScreenMdReport2byteVGroup
            = new ZW_ClassCommand.VG_SCREEN_MD_REPORT_2BYTE_VG();
    public final ZW_ClassCommand.VG_SCREEN_MD_REPORT_3BYTE_VG VG_ScreenMdReport3byteVGroup
            = new ZW_ClassCommand.VG_SCREEN_MD_REPORT_3BYTE_VG();
    public final ZW_ClassCommand.VG_SCREEN_MD_REPORT_4BYTE_VG VG_ScreenMdReport4byteVGroup
            = new ZW_ClassCommand.VG_SCREEN_MD_REPORT_4BYTE_VG();
    public final ZW_ClassCommand.ZW_SCREEN_MD_REPORT_1BYTE_FRAME ZW_ScreenMdReport1byteFrame
            = new ZW_ClassCommand.ZW_SCREEN_MD_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SCREEN_MD_REPORT_2BYTE_FRAME ZW_ScreenMdReport2byteFrame
            = new ZW_ClassCommand.ZW_SCREEN_MD_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SCREEN_MD_REPORT_3BYTE_FRAME ZW_ScreenMdReport3byteFrame
            = new ZW_ClassCommand.ZW_SCREEN_MD_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SCREEN_MD_REPORT_4BYTE_FRAME ZW_ScreenMdReport4byteFrame
            = new ZW_ClassCommand.ZW_SCREEN_MD_REPORT_4BYTE_FRAME();
    /* Command class Screen Md V2 */
    public final ZW_ClassCommand.ZW_SCREEN_MD_GET_V2_FRAME ZW_ScreenMdGetV2Frame
            = new ZW_ClassCommand.ZW_SCREEN_MD_GET_V2_FRAME();
    public final ZW_ClassCommand.VG_SCREEN_MD_REPORT_1BYTE_V2_VG VG_ScreenMdReport1byteV2VGroup
            = new ZW_ClassCommand.VG_SCREEN_MD_REPORT_1BYTE_V2_VG();
    public final ZW_ClassCommand.VG_SCREEN_MD_REPORT_2BYTE_V2_VG VG_ScreenMdReport2byteV2VGroup
            = new ZW_ClassCommand.VG_SCREEN_MD_REPORT_2BYTE_V2_VG();
    public final ZW_ClassCommand.VG_SCREEN_MD_REPORT_3BYTE_V2_VG VG_ScreenMdReport3byteV2VGroup
            = new ZW_ClassCommand.VG_SCREEN_MD_REPORT_3BYTE_V2_VG();
    public final ZW_ClassCommand.VG_SCREEN_MD_REPORT_4BYTE_V2_VG VG_ScreenMdReport4byteV2VGroup
            = new ZW_ClassCommand.VG_SCREEN_MD_REPORT_4BYTE_V2_VG();
    public final ZW_ClassCommand.ZW_SCREEN_MD_REPORT_1BYTE_V2_FRAME ZW_ScreenMdReport1byteV2Frame
            = new ZW_ClassCommand.ZW_SCREEN_MD_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCREEN_MD_REPORT_2BYTE_V2_FRAME ZW_ScreenMdReport2byteV2Frame
            = new ZW_ClassCommand.ZW_SCREEN_MD_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCREEN_MD_REPORT_3BYTE_V2_FRAME ZW_ScreenMdReport3byteV2Frame
            = new ZW_ClassCommand.ZW_SCREEN_MD_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SCREEN_MD_REPORT_4BYTE_V2_FRAME ZW_ScreenMdReport4byteV2Frame
            = new ZW_ClassCommand.ZW_SCREEN_MD_REPORT_4BYTE_V2_FRAME();
    /* Command class Security Panel Mode */
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_MODE_GET_FRAME ZW_SecurityPanelModeGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_MODE_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_MODE_REPORT_FRAME ZW_SecurityPanelModeReportFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_MODE_REPORT_FRAME();

    /************************************************************/
    /* ZW_FRAME_COLLECTION_MACRO2*/
    /************************************************************/
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_MODE_SET_FRAME ZW_SecurityPanelModeSetFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_MODE_SET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_MODE_SUPPORTED_GET_FRAME ZW_SecurityPanelModeSupportedGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_MODE_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_MODE_SUPPORTED_REPORT_FRAME ZW_SecurityPanelModeSupportedReportFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_MODE_SUPPORTED_REPORT_FRAME();
    /* Command class Security Panel Zone Sensor */
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_INSTALLED_REPORT_FRAME ZW_CommandClassSecurityPanelZoneSensorInstalledReportFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_INSTALLED_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_TYPE_GET_FRAME ZW_SecurityPanelZoneSensorTypeGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_TYPE_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_TYPE_REPORT_FRAME ZW_SecurityPanelZoneSensorTypeReportFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_TYPE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_INSTALLED_GET_FRAME ZW_SecurityPanelZoneSensorInstalledGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_INSTALLED_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_STATE_GET_FRAME ZW_SecurityPanelZoneSensorStateGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_STATE_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_STATE_REPORT_FRAME ZW_SecurityPanelZoneSensorStateReportFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SENSOR_STATE_REPORT_FRAME();
    /* Command class Security Panel Zone */
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_NUMBER_SUPPORTED_GET_FRAME ZW_SecurityPanelZoneNumberSupportedGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_NUMBER_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_STATE_GET_FRAME ZW_SecurityPanelZoneStateGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_STATE_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_STATE_REPORT_FRAME ZW_SecurityPanelZoneStateReportFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_STATE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SUPPORTED_REPORT_FRAME ZW_SecurityPanelZoneSupportedReportFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_SUPPORTED_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_TYPE_GET_FRAME ZW_SecurityPanelZoneTypeGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_TYPE_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_TYPE_REPORT_FRAME ZW_SecurityPanelZoneTypeReportFrame
            = new ZW_ClassCommand.ZW_SECURITY_PANEL_ZONE_TYPE_REPORT_FRAME();
    /* Command class Security */
    public final ZW_ClassCommand.ZW_NETWORK_KEY_SET_1BYTE_FRAME ZW_NetworkKeySet1byteFrame
            = new ZW_ClassCommand.ZW_NETWORK_KEY_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NETWORK_KEY_SET_2BYTE_FRAME ZW_NetworkKeySet2byteFrame
            = new ZW_ClassCommand.ZW_NETWORK_KEY_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NETWORK_KEY_SET_3BYTE_FRAME ZW_NetworkKeySet3byteFrame
            = new ZW_ClassCommand.ZW_NETWORK_KEY_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NETWORK_KEY_SET_4BYTE_FRAME ZW_NetworkKeySet4byteFrame
            = new ZW_ClassCommand.ZW_NETWORK_KEY_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_NETWORK_KEY_VERIFY_FRAME ZW_NetworkKeyVerifyFrame
            = new ZW_ClassCommand.ZW_NETWORK_KEY_VERIFY_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_COMMANDS_SUPPORTED_GET_FRAME ZW_SecurityCommandsSupportedGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_COMMANDS_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_1BYTE_FRAME ZW_SecurityCommandsSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_2BYTE_FRAME ZW_SecurityCommandsSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_3BYTE_FRAME ZW_SecurityCommandsSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_4BYTE_FRAME ZW_SecurityCommandsSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_COMMANDS_SUPPORTED_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_1BYTE_FRAME ZW_SecurityMessageEncapsulation1byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_2BYTE_FRAME ZW_SecurityMessageEncapsulation2byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_3BYTE_FRAME ZW_SecurityMessageEncapsulation3byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_4BYTE_FRAME ZW_SecurityMessageEncapsulation4byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_1BYTE_FRAME ZW_SecurityMessageEncapsulationNonceGet1byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_2BYTE_FRAME ZW_SecurityMessageEncapsulationNonceGet2byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_3BYTE_FRAME ZW_SecurityMessageEncapsulationNonceGet3byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_4BYTE_FRAME ZW_SecurityMessageEncapsulationNonceGet4byteFrame
            = new ZW_ClassCommand.ZW_SECURITY_MESSAGE_ENCAPSULATION_NONCE_GET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_NONCE_GET_FRAME ZW_SecurityNonceGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_NONCE_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_NONCE_REPORT_FRAME ZW_SecurityNonceReportFrame
            = new ZW_ClassCommand.ZW_SECURITY_NONCE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_SCHEME_GET_FRAME ZW_SecuritySchemeGetFrame
            = new ZW_ClassCommand.ZW_SECURITY_SCHEME_GET_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_SCHEME_INHERIT_FRAME ZW_SecuritySchemeInheritFrame
            = new ZW_ClassCommand.ZW_SECURITY_SCHEME_INHERIT_FRAME();
    public final ZW_ClassCommand.ZW_SECURITY_SCHEME_REPORT_FRAME ZW_SecuritySchemeReportFrame
            = new ZW_ClassCommand.ZW_SECURITY_SCHEME_REPORT_FRAME();
    /* Command class Sensor Alarm */
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_GET_FRAME ZW_SensorAlarmGetFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_GET_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_REPORT_FRAME ZW_SensorAlarmReportFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_SUPPORTED_GET_FRAME ZW_SensorAlarmSupportedGetFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_SUPPORTED_REPORT_1BYTE_FRAME ZW_SensorAlarmSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_SUPPORTED_REPORT_2BYTE_FRAME ZW_SensorAlarmSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_SUPPORTED_REPORT_3BYTE_FRAME ZW_SensorAlarmSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_SUPPORTED_REPORT_4BYTE_FRAME ZW_SensorAlarmSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_SUPPORTED_REPORT_4BYTE_FRAME();
    /* Command class Sensor Binary */
    public final ZW_ClassCommand.ZW_SENSOR_BINARY_GET_FRAME ZW_SensorBinaryGetFrame
            = new ZW_ClassCommand.ZW_SENSOR_BINARY_GET_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_BINARY_REPORT_FRAME ZW_SensorBinaryReportFrame
            = new ZW_ClassCommand.ZW_SENSOR_BINARY_REPORT_FRAME();
    /* Command class Sensor Binary V2 */
    public final ZW_ClassCommand.ZW_SENSOR_BINARY_GET_V2_FRAME ZW_SensorBinaryGetV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_BINARY_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_BINARY_REPORT_V2_FRAME ZW_SensorBinaryReportV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_BINARY_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_BINARY_SUPPORTED_GET_SENSOR_V2_FRAME ZW_SensorBinarySupportedGetSensorV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_BINARY_SUPPORTED_GET_SENSOR_V2_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_1BYTE_V2_FRAME ZW_SensorBinarySupportedSensorReport1byteV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_2BYTE_V2_FRAME ZW_SensorBinarySupportedSensorReport2byteV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_3BYTE_V2_FRAME ZW_SensorBinarySupportedSensorReport3byteV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_4BYTE_V2_FRAME ZW_SensorBinarySupportedSensorReport4byteV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_BINARY_SUPPORTED_SENSOR_REPORT_4BYTE_V2_FRAME();
    /* Command class Sensor Configuration */
    public final ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_GET_FRAME ZW_SensorTriggerLevelGetFrame
            = new ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_GET_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_REPORT_1BYTE_FRAME ZW_SensorTriggerLevelReport1byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_REPORT_2BYTE_FRAME ZW_SensorTriggerLevelReport2byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_REPORT_3BYTE_FRAME ZW_SensorTriggerLevelReport3byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_REPORT_4BYTE_FRAME ZW_SensorTriggerLevelReport4byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_SET_1BYTE_FRAME ZW_SensorTriggerLevelSet1byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_SET_2BYTE_FRAME ZW_SensorTriggerLevelSet2byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_SET_3BYTE_FRAME ZW_SensorTriggerLevelSet3byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_SET_4BYTE_FRAME ZW_SensorTriggerLevelSet4byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_TRIGGER_LEVEL_SET_4BYTE_FRAME();
    /* Command class Sensor Multilevel */
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_FRAME ZW_SensorMultilevelGetFrame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_FRAME ZW_SensorMultilevelReport1byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_FRAME ZW_SensorMultilevelReport2byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_FRAME ZW_SensorMultilevelReport3byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_FRAME ZW_SensorMultilevelReport4byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_FRAME();
    /* Command class Sensor Multilevel V2 */
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V2_FRAME ZW_SensorMultilevelGetV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V2_FRAME ZW_SensorMultilevelReport1byteV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V2_FRAME ZW_SensorMultilevelReport2byteV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V2_FRAME ZW_SensorMultilevelReport3byteV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V2_FRAME ZW_SensorMultilevelReport4byteV2Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V2_FRAME();
    /* Command class Sensor Multilevel V3 */
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V3_FRAME ZW_SensorMultilevelGetV3Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V3_FRAME ZW_SensorMultilevelReport1byteV3Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V3_FRAME ZW_SensorMultilevelReport2byteV3Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V3_FRAME ZW_SensorMultilevelReport3byteV3Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V3_FRAME ZW_SensorMultilevelReport4byteV3Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V3_FRAME();
    /* Command class Sensor Multilevel V4 */
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V4_FRAME ZW_SensorMultilevelGetV4Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V4_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V4_FRAME ZW_SensorMultilevelReport1byteV4Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V4_FRAME ZW_SensorMultilevelReport2byteV4Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V4_FRAME ZW_SensorMultilevelReport3byteV4Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V4_FRAME ZW_SensorMultilevelReport4byteV4Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V4_FRAME();
    /* Command class Sensor Multilevel V5 */
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V5_FRAME ZW_SensorMultilevelGetV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V5_FRAME ZW_SensorMultilevelReport1byteV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V5_FRAME ZW_SensorMultilevelReport2byteV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V5_FRAME ZW_SensorMultilevelReport3byteV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V5_FRAME ZW_SensorMultilevelReport4byteV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V5_FRAME ZW_SensorMultilevelSupportedGetSensorV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_1BYTE_V5_FRAME ZW_SensorMultilevelSupportedSensorReport1byteV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_1BYTE_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_2BYTE_V5_FRAME ZW_SensorMultilevelSupportedSensorReport2byteV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_2BYTE_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_3BYTE_V5_FRAME ZW_SensorMultilevelSupportedSensorReport3byteV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_3BYTE_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_4BYTE_V5_FRAME ZW_SensorMultilevelSupportedSensorReport4byteV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_4BYTE_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V5_FRAME ZW_SensorMultilevelSupportedGetScaleV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V5_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V5_FRAME ZW_SensorMultilevelSupportedScaleReportV5Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V5_FRAME();
    /* Command class Sensor Multilevel V6 */
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V6_FRAME ZW_SensorMultilevelGetV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V6_FRAME ZW_SensorMultilevelReport1byteV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V6_FRAME ZW_SensorMultilevelReport2byteV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V6_FRAME ZW_SensorMultilevelReport3byteV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V6_FRAME ZW_SensorMultilevelReport4byteV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V6_FRAME ZW_SensorMultilevelSupportedGetSensorV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_1BYTE_V6_FRAME ZW_SensorMultilevelSupportedSensorReport1byteV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_1BYTE_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_2BYTE_V6_FRAME ZW_SensorMultilevelSupportedSensorReport2byteV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_2BYTE_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_3BYTE_V6_FRAME ZW_SensorMultilevelSupportedSensorReport3byteV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_3BYTE_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_4BYTE_V6_FRAME ZW_SensorMultilevelSupportedSensorReport4byteV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_4BYTE_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V6_FRAME ZW_SensorMultilevelSupportedGetScaleV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V6_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V6_FRAME ZW_SensorMultilevelSupportedScaleReportV6Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V6_FRAME();
    /* Command class Sensor Multilevel V7 */
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V7_FRAME ZW_SensorMultilevelGetV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_GET_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V7_FRAME ZW_SensorMultilevelReport1byteV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_1BYTE_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V7_FRAME ZW_SensorMultilevelReport2byteV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_2BYTE_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V7_FRAME ZW_SensorMultilevelReport3byteV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_3BYTE_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V7_FRAME ZW_SensorMultilevelReport4byteV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_REPORT_4BYTE_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V7_FRAME ZW_SensorMultilevelSupportedGetSensorV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SENSOR_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_1BYTE_V7_FRAME ZW_SensorMultilevelSupportedSensorReport1byteV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_1BYTE_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_2BYTE_V7_FRAME ZW_SensorMultilevelSupportedSensorReport2byteV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_2BYTE_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_3BYTE_V7_FRAME ZW_SensorMultilevelSupportedSensorReport3byteV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_3BYTE_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_4BYTE_V7_FRAME ZW_SensorMultilevelSupportedSensorReport4byteV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SENSOR_REPORT_4BYTE_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V7_FRAME ZW_SensorMultilevelSupportedGetScaleV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_GET_SCALE_V7_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V7_FRAME ZW_SensorMultilevelSupportedScaleReportV7Frame
            = new ZW_ClassCommand.ZW_SENSOR_MULTILEVEL_SUPPORTED_SCALE_REPORT_V7_FRAME();
    /* Command class Silence Alarm */
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_SET_1BYTE_FRAME ZW_SensorAlarmSet1byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_SET_2BYTE_FRAME ZW_SensorAlarmSet2byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_SET_3BYTE_FRAME ZW_SensorAlarmSet3byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SENSOR_ALARM_SET_4BYTE_FRAME ZW_SensorAlarmSet4byteFrame
            = new ZW_ClassCommand.ZW_SENSOR_ALARM_SET_4BYTE_FRAME();
    /* Command class Simple Av Control */
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_GET_FRAME ZW_SimpleAvControlGetFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_GET_FRAME();
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_REPORT_FRAME ZW_SimpleAvControlReportFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_REPORT_FRAME();
    public final ZW_ClassCommand.VG_SIMPLE_AV_CONTROL_SET_VG VG_SimpleAvControlSetVGroup
            = new ZW_ClassCommand.VG_SIMPLE_AV_CONTROL_SET_VG();
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SET_1BYTE_FRAME ZW_SimpleAvControlSet1byteFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SET_2BYTE_FRAME ZW_SimpleAvControlSet2byteFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SET_3BYTE_FRAME ZW_SimpleAvControlSet3byteFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SET_4BYTE_FRAME ZW_SimpleAvControlSet4byteFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SUPPORTED_GET_FRAME ZW_SimpleAvControlSupportedGetFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_1BYTE_FRAME ZW_SimpleAvControlSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_2BYTE_FRAME ZW_SimpleAvControlSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_3BYTE_FRAME ZW_SimpleAvControlSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_4BYTE_FRAME ZW_SimpleAvControlSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_SIMPLE_AV_CONTROL_SUPPORTED_REPORT_4BYTE_FRAME();
    /* Command class Switch All */
    public final ZW_ClassCommand.ZW_SWITCH_ALL_GET_FRAME ZW_SwitchAllGetFrame
            = new ZW_ClassCommand.ZW_SWITCH_ALL_GET_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_ALL_OFF_FRAME ZW_SwitchAllOffFrame
            = new ZW_ClassCommand.ZW_SWITCH_ALL_OFF_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_ALL_ON_FRAME ZW_SwitchAllOnFrame
            = new ZW_ClassCommand.ZW_SWITCH_ALL_ON_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_ALL_REPORT_FRAME ZW_SwitchAllReportFrame
            = new ZW_ClassCommand.ZW_SWITCH_ALL_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_ALL_SET_FRAME ZW_SwitchAllSetFrame
            = new ZW_ClassCommand.ZW_SWITCH_ALL_SET_FRAME();
    /* Command class Switch Binary */
    public final ZW_ClassCommand.ZW_SWITCH_BINARY_GET_FRAME ZW_SwitchBinaryGetFrame
            = new ZW_ClassCommand.ZW_SWITCH_BINARY_GET_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_BINARY_REPORT_FRAME ZW_SwitchBinaryReportFrame
            = new ZW_ClassCommand.ZW_SWITCH_BINARY_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_BINARY_SET_FRAME ZW_SwitchBinarySetFrame
            = new ZW_ClassCommand.ZW_SWITCH_BINARY_SET_FRAME();
    /* Command class Switch Multilevel */
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_GET_FRAME ZW_SwitchMultilevelGetFrame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_GET_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_REPORT_FRAME ZW_SwitchMultilevelReportFrame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_SET_FRAME ZW_SwitchMultilevelSetFrame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_SET_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_START_LEVEL_CHANGE_FRAME ZW_SwitchMultilevelStartLevelChangeFrame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_START_LEVEL_CHANGE_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_FRAME ZW_SwitchMultilevelStopLevelChangeFrame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_FRAME();
    /* Command class Switch Multilevel V2 */
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_GET_V2_FRAME ZW_SwitchMultilevelGetV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_REPORT_V2_FRAME ZW_SwitchMultilevelReportV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_SET_V2_FRAME ZW_SwitchMultilevelSetV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_START_LEVEL_CHANGE_V2_FRAME ZW_SwitchMultilevelStartLevelChangeV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_START_LEVEL_CHANGE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_V2_FRAME ZW_SwitchMultilevelStopLevelChangeV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_V2_FRAME();
    /* Command class Switch Multilevel V3 */
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_GET_V3_FRAME ZW_SwitchMultilevelGetV3Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_REPORT_V3_FRAME ZW_SwitchMultilevelReportV3Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_REPORT_V3_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_SET_V3_FRAME ZW_SwitchMultilevelSetV3Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_SET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_START_LEVEL_CHANGE_V3_FRAME ZW_SwitchMultilevelStartLevelChangeV3Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_START_LEVEL_CHANGE_V3_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_V3_FRAME ZW_SwitchMultilevelStopLevelChangeV3Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_STOP_LEVEL_CHANGE_V3_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_SUPPORTED_GET_V3_FRAME ZW_SwitchMultilevelSupportedGetV3Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_SUPPORTED_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_SUPPORTED_REPORT_V3_FRAME ZW_SwitchMultilevelSupportedReportV3Frame
            = new ZW_ClassCommand.ZW_SWITCH_MULTILEVEL_SUPPORTED_REPORT_V3_FRAME();
    /* Command class Switch Toggle Binary */
    public final ZW_ClassCommand.ZW_SWITCH_TOGGLE_BINARY_SET_FRAME ZW_SwitchToggleBinarySetFrame
            = new ZW_ClassCommand.ZW_SWITCH_TOGGLE_BINARY_SET_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_TOGGLE_BINARY_GET_FRAME ZW_SwitchToggleBinaryGetFrame
            = new ZW_ClassCommand.ZW_SWITCH_TOGGLE_BINARY_GET_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_TOGGLE_BINARY_REPORT_FRAME ZW_SwitchToggleBinaryReportFrame
            = new ZW_ClassCommand.ZW_SWITCH_TOGGLE_BINARY_REPORT_FRAME();
    /* Command class Switch Toggle Multilevel */
    public final ZW_ClassCommand.ZW_SWITCH_TOGGLE_MULTILEVEL_SET_FRAME ZW_SwitchToggleMultilevelSetFrame
            = new ZW_ClassCommand.ZW_SWITCH_TOGGLE_MULTILEVEL_SET_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_TOGGLE_MULTILEVEL_GET_FRAME ZW_SwitchToggleMultilevelGetFrame
            = new ZW_ClassCommand.ZW_SWITCH_TOGGLE_MULTILEVEL_GET_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_TOGGLE_MULTILEVEL_REPORT_FRAME ZW_SwitchToggleMultilevelReportFrame
            = new ZW_ClassCommand.ZW_SWITCH_TOGGLE_MULTILEVEL_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_TOGGLE_MULTILEVEL_START_LEVEL_CHANGE_FRAME ZW_SwitchToggleMultilevelStartLevelChangeFrame
            = new ZW_ClassCommand.ZW_SWITCH_TOGGLE_MULTILEVEL_START_LEVEL_CHANGE_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_TOGGLE_MULTILEVEL_STOP_LEVEL_CHANGE_FRAME ZW_SwitchToggleMultilevelStopLevelChangeFrame
            = new ZW_ClassCommand.ZW_SWITCH_TOGGLE_MULTILEVEL_STOP_LEVEL_CHANGE_FRAME();
    /* Command class Tariff Config */
    public final ZW_ClassCommand.ZW_TARIFF_TBL_REMOVE_1BYTE_FRAME ZW_TariffTblRemove1byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_REMOVE_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_REMOVE_2BYTE_FRAME ZW_TariffTblRemove2byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_REMOVE_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_REMOVE_3BYTE_FRAME ZW_TariffTblRemove3byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_REMOVE_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_REMOVE_4BYTE_FRAME ZW_TariffTblRemove4byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_REMOVE_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_SET_FRAME ZW_TariffTblSetFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_SET_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_SET_1BYTE_FRAME ZW_TariffTblSupplierSet1byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_SET_2BYTE_FRAME ZW_TariffTblSupplierSet2byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_SET_3BYTE_FRAME ZW_TariffTblSupplierSet3byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_SET_4BYTE_FRAME ZW_TariffTblSupplierSet4byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_SET_4BYTE_FRAME();
    /* Command class Tariff Tbl Monitor */
    public final ZW_ClassCommand.ZW_TARIFF_TBL_COST_GET_FRAME ZW_TariffTblCostGetFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_COST_GET_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_COST_REPORT_FRAME ZW_TariffTblCostReportFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_COST_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_GET_FRAME ZW_TariffTblGetFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_GET_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_REPORT_FRAME ZW_TariffTblReportFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_GET_FRAME ZW_TariffTblSupplierGetFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_GET_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_REPORT_1BYTE_FRAME ZW_TariffTblSupplierReport1byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_REPORT_2BYTE_FRAME ZW_TariffTblSupplierReport2byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_REPORT_3BYTE_FRAME ZW_TariffTblSupplierReport3byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_REPORT_4BYTE_FRAME ZW_TariffTblSupplierReport4byteFrame
            = new ZW_ClassCommand.ZW_TARIFF_TBL_SUPPLIER_REPORT_4BYTE_FRAME();
    /* Command class Thermostat Fan Mode */
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_GET_FRAME ZW_ThermostatFanModeGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_REPORT_FRAME ZW_ThermostatFanModeReportFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SET_FRAME ZW_ThermostatFanModeSetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_FRAME ZW_ThermostatFanModeSupportedGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_FRAME ZW_ThermostatFanModeSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_FRAME ZW_ThermostatFanModeSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_FRAME ZW_ThermostatFanModeSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_FRAME ZW_ThermostatFanModeSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_FRAME();
    /* Command class Thermostat Fan Mode V2 */
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_GET_V2_FRAME ZW_ThermostatFanModeGetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_REPORT_V2_FRAME ZW_ThermostatFanModeReportV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SET_V2_FRAME ZW_ThermostatFanModeSetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_V2_FRAME ZW_ThermostatFanModeSupportedGetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_V2_FRAME ZW_ThermostatFanModeSupportedReport1byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_V2_FRAME ZW_ThermostatFanModeSupportedReport2byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_V2_FRAME ZW_ThermostatFanModeSupportedReport3byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_V2_FRAME ZW_ThermostatFanModeSupportedReport4byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_V2_FRAME();
    /* Command class Thermostat Fan Mode V3 */
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_GET_V3_FRAME ZW_ThermostatFanModeGetV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_REPORT_V3_FRAME ZW_ThermostatFanModeReportV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_REPORT_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SET_V3_FRAME ZW_ThermostatFanModeSetV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SET_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_V3_FRAME ZW_ThermostatFanModeSupportedGetV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_V3_FRAME ZW_ThermostatFanModeSupportedReport1byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_V3_FRAME ZW_ThermostatFanModeSupportedReport2byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_V3_FRAME ZW_ThermostatFanModeSupportedReport3byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_V3_FRAME ZW_ThermostatFanModeSupportedReport4byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_V3_FRAME();
    /* Command class Thermostat Fan Mode V4 */
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_GET_V4_FRAME ZW_ThermostatFanModeGetV4Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_GET_V4_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_REPORT_V4_FRAME ZW_ThermostatFanModeReportV4Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_REPORT_V4_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SET_V4_FRAME ZW_ThermostatFanModeSetV4Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SET_V4_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_V4_FRAME ZW_ThermostatFanModeSupportedGetV4Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_GET_V4_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_V4_FRAME ZW_ThermostatFanModeSupportedReport1byteV4Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_1BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_V4_FRAME ZW_ThermostatFanModeSupportedReport2byteV4Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_2BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_V4_FRAME ZW_ThermostatFanModeSupportedReport3byteV4Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_3BYTE_V4_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_V4_FRAME ZW_ThermostatFanModeSupportedReport4byteV4Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_MODE_SUPPORTED_REPORT_4BYTE_V4_FRAME();
    /* Command class Thermostat Fan State */
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_STATE_GET_FRAME ZW_ThermostatFanStateGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_STATE_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_STATE_REPORT_FRAME ZW_ThermostatFanStateReportFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_STATE_REPORT_FRAME();
    /* Command class Thermostat Fan State V2 */
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_STATE_GET_V2_FRAME ZW_ThermostatFanStateGetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_STATE_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_FAN_STATE_REPORT_V2_FRAME ZW_ThermostatFanStateReportV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_FAN_STATE_REPORT_V2_FRAME();
    /* Command class Thermostat Heating */
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_STATUS_REPORT_FRAME ZW_ThermostatHeatingStatusReportFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_STATUS_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_MODE_GET_FRAME ZW_ThermostatHeatingModeGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_MODE_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_MODE_REPORT_FRAME ZW_ThermostatHeatingModeReportFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_MODE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_MODE_SET_FRAME ZW_ThermostatHeatingModeSetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_MODE_SET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_RELAY_STATUS_GET_FRAME ZW_ThermostatHeatingRelayStatusGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_RELAY_STATUS_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_RELAY_STATUS_REPORT_FRAME ZW_ThermostatHeatingRelayStatusReportFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_RELAY_STATUS_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_GET_FRAME ZW_ThermostatHeatingSetpointGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_1BYTE_FRAME ZW_ThermostatHeatingSetpointReport1byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_2BYTE_FRAME ZW_ThermostatHeatingSetpointReport2byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_3BYTE_FRAME ZW_ThermostatHeatingSetpointReport3byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_4BYTE_FRAME ZW_ThermostatHeatingSetpointReport4byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_SET_1BYTE_FRAME ZW_ThermostatHeatingSetpointSet1byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_SET_2BYTE_FRAME ZW_ThermostatHeatingSetpointSet2byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_SET_3BYTE_FRAME ZW_ThermostatHeatingSetpointSet3byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_SET_4BYTE_FRAME ZW_ThermostatHeatingSetpointSet4byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_SETPOINT_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_STATUS_GET_FRAME ZW_ThermostatHeatingStatusGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_STATUS_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_STATUS_SET_FRAME ZW_ThermostatHeatingStatusSetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_STATUS_SET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_HEATING_TIMED_OFF_SET_FRAME ZW_ThermostatHeatingTimedOffSetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_HEATING_TIMED_OFF_SET_FRAME();
    /* Command class Thermostat Mode */
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_GET_FRAME ZW_ThermostatModeGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_FRAME ZW_ThermostatModeReportFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_FRAME ZW_ThermostatModeSetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_GET_FRAME ZW_ThermostatModeSupportedGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_1BYTE_FRAME ZW_ThermostatModeSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_2BYTE_FRAME ZW_ThermostatModeSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_3BYTE_FRAME ZW_ThermostatModeSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_4BYTE_FRAME ZW_ThermostatModeSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_4BYTE_FRAME();
    /* Command class Thermostat Mode V2 */
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_GET_V2_FRAME ZW_ThermostatModeGetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_V2_FRAME ZW_ThermostatModeReportV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_V2_FRAME ZW_ThermostatModeSetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_GET_V2_FRAME ZW_ThermostatModeSupportedGetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_1BYTE_V2_FRAME ZW_ThermostatModeSupportedReport1byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_2BYTE_V2_FRAME ZW_ThermostatModeSupportedReport2byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_3BYTE_V2_FRAME ZW_ThermostatModeSupportedReport3byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_4BYTE_V2_FRAME ZW_ThermostatModeSupportedReport4byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_4BYTE_V2_FRAME();
    /* Command class Thermostat Mode V3 */
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_GET_V3_FRAME ZW_ThermostatModeGetV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_1BYTE_V3_FRAME ZW_ThermostatModeReport1byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_2BYTE_V3_FRAME ZW_ThermostatModeReport2byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_3BYTE_V3_FRAME ZW_ThermostatModeReport3byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_4BYTE_V3_FRAME ZW_ThermostatModeReport4byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_REPORT_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_1BYTE_V3_FRAME ZW_ThermostatModeSet1byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_2BYTE_V3_FRAME ZW_ThermostatModeSet2byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_3BYTE_V3_FRAME ZW_ThermostatModeSet3byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_4BYTE_V3_FRAME ZW_ThermostatModeSet4byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SET_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_GET_V3_FRAME ZW_ThermostatModeSupportedGetV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_1BYTE_V3_FRAME ZW_ThermostatModeSupportedReport1byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_2BYTE_V3_FRAME ZW_ThermostatModeSupportedReport2byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_3BYTE_V3_FRAME ZW_ThermostatModeSupportedReport3byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_4BYTE_V3_FRAME ZW_ThermostatModeSupportedReport4byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_MODE_SUPPORTED_REPORT_4BYTE_V3_FRAME();
    /* Command class Thermostat Operating State */
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_GET_FRAME ZW_ThermostatOperatingStateGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_REPORT_FRAME ZW_ThermostatOperatingStateReportFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_REPORT_FRAME();
    /* Command class Thermostat Operating State V2 */
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_GET_V2_FRAME ZW_ThermostatOperatingStateGetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_REPORT_V2_FRAME ZW_ThermostatOperatingStateReportV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET_V2_FRAME ZW_ThermostatOperatingStateLoggingSupportedGetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_1BYTE_V2_FRAME ZW_ThermostatOperatingLoggingSupportedReport1byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_2BYTE_V2_FRAME ZW_ThermostatOperatingLoggingSupportedReport2byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_3BYTE_V2_FRAME ZW_ThermostatOperatingLoggingSupportedReport3byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_4BYTE_V2_FRAME ZW_ThermostatOperatingLoggingSupportedReport4byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_1BYTE_V2_FRAME ZW_ThermostatOperatingStateLoggingGet1byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_2BYTE_V2_FRAME ZW_ThermostatOperatingStateLoggingGet2byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_3BYTE_V2_FRAME ZW_ThermostatOperatingStateLoggingGet3byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_4BYTE_V2_FRAME ZW_ThermostatOperatingStateLoggingGet4byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_GET_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG VG_ThermostatOperatingStateLoggingReportV2VGroup
            = new ZW_ClassCommand.VG_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_V2_VG();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_1BYTE_V2_FRAME ZW_ThermostatOperatingStateLoggingReport1byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_2BYTE_V2_FRAME ZW_ThermostatOperatingStateLoggingReport2byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_3BYTE_V2_FRAME ZW_ThermostatOperatingStateLoggingReport3byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_4BYTE_V2_FRAME ZW_ThermostatOperatingStateLoggingReport4byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_OPERATING_STATE_LOGGING_REPORT_4BYTE_V2_FRAME();
    /* Command class Thermostat Setback */
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETBACK_GET_FRAME ZW_ThermostatSetbackGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETBACK_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETBACK_REPORT_FRAME ZW_ThermostatSetbackReportFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETBACK_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETBACK_SET_FRAME ZW_ThermostatSetbackSetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETBACK_SET_FRAME();
    /* Command class Thermostat Setpoint */
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_GET_FRAME ZW_ThermostatSetpointGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_1BYTE_FRAME ZW_ThermostatSetpointReport1byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_2BYTE_FRAME ZW_ThermostatSetpointReport2byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_3BYTE_FRAME ZW_ThermostatSetpointReport3byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_4BYTE_FRAME ZW_ThermostatSetpointReport4byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_1BYTE_FRAME ZW_ThermostatSetpointSet1byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_2BYTE_FRAME ZW_ThermostatSetpointSet2byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_3BYTE_FRAME ZW_ThermostatSetpointSet3byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_4BYTE_FRAME ZW_ThermostatSetpointSet4byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_GET_FRAME ZW_ThermostatSetpointSupportedGetFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_1BYTE_FRAME ZW_ThermostatSetpointSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_2BYTE_FRAME ZW_ThermostatSetpointSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_3BYTE_FRAME ZW_ThermostatSetpointSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_4BYTE_FRAME ZW_ThermostatSetpointSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_4BYTE_FRAME();
    /* Command class Thermostat Setpoint V2 */
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_GET_V2_FRAME ZW_ThermostatSetpointGetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_1BYTE_V2_FRAME ZW_ThermostatSetpointReport1byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_2BYTE_V2_FRAME ZW_ThermostatSetpointReport2byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_3BYTE_V2_FRAME ZW_ThermostatSetpointReport3byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_4BYTE_V2_FRAME ZW_ThermostatSetpointReport4byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_1BYTE_V2_FRAME ZW_ThermostatSetpointSet1byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_2BYTE_V2_FRAME ZW_ThermostatSetpointSet2byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_3BYTE_V2_FRAME ZW_ThermostatSetpointSet3byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_4BYTE_V2_FRAME ZW_ThermostatSetpointSet4byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_GET_V2_FRAME ZW_ThermostatSetpointSupportedGetV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_1BYTE_V2_FRAME ZW_ThermostatSetpointSupportedReport1byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_2BYTE_V2_FRAME ZW_ThermostatSetpointSupportedReport2byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_3BYTE_V2_FRAME ZW_ThermostatSetpointSupportedReport3byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_4BYTE_V2_FRAME ZW_ThermostatSetpointSupportedReport4byteV2Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_4BYTE_V2_FRAME();
    /* Command class Thermostat Setpoint V3 */
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_GET_V3_FRAME ZW_ThermostatSetpointGetV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_1BYTE_V3_FRAME ZW_ThermostatSetpointReport1byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_2BYTE_V3_FRAME ZW_ThermostatSetpointReport2byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_3BYTE_V3_FRAME ZW_ThermostatSetpointReport3byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_4BYTE_V3_FRAME ZW_ThermostatSetpointReport4byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_REPORT_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_1BYTE_V3_FRAME ZW_ThermostatSetpointSet1byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_2BYTE_V3_FRAME ZW_ThermostatSetpointSet2byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_3BYTE_V3_FRAME ZW_ThermostatSetpointSet3byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_4BYTE_V3_FRAME ZW_ThermostatSetpointSet4byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SET_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_GET_V3_FRAME ZW_ThermostatSetpointSupportedGetV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_1BYTE_V3_FRAME ZW_ThermostatSetpointSupportedReport1byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_2BYTE_V3_FRAME ZW_ThermostatSetpointSupportedReport2byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_3BYTE_V3_FRAME ZW_ThermostatSetpointSupportedReport3byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_4BYTE_V3_FRAME ZW_ThermostatSetpointSupportedReport4byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_SUPPORTED_REPORT_4BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_CAPABILITIES_GET_V3_FRAME ZW_ThermostatSetpointCapabilitiesGetV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_CAPABILITIES_GET_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_1BYTE_V3_FRAME ZW_ThermostatSetpointCapabilitiesReport1byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_1BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_2BYTE_V3_FRAME ZW_ThermostatSetpointCapabilitiesReport2byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_2BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_3BYTE_V3_FRAME ZW_ThermostatSetpointCapabilitiesReport3byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_3BYTE_V3_FRAME();
    public final ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_4BYTE_V3_FRAME ZW_ThermostatSetpointCapabilitiesReport4byteV3Frame
            = new ZW_ClassCommand.ZW_THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_4BYTE_V3_FRAME();
    /* Command class Time Parameters */
    public final ZW_ClassCommand.ZW_TIME_PARAMETERS_GET_FRAME ZW_TimeParametersGetFrame
            = new ZW_ClassCommand.ZW_TIME_PARAMETERS_GET_FRAME();
    public final ZW_ClassCommand.ZW_TIME_PARAMETERS_REPORT_FRAME ZW_TimeParametersReportFrame
            = new ZW_ClassCommand.ZW_TIME_PARAMETERS_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_TIME_PARAMETERS_SET_FRAME ZW_TimeParametersSetFrame
            = new ZW_ClassCommand.ZW_TIME_PARAMETERS_SET_FRAME();
    /* Command class Time */
    public final ZW_ClassCommand.ZW_DATE_GET_FRAME ZW_DateGetFrame
            = new ZW_ClassCommand.ZW_DATE_GET_FRAME();
    public final ZW_ClassCommand.ZW_DATE_REPORT_FRAME ZW_DateReportFrame
            = new ZW_ClassCommand.ZW_DATE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_TIME_GET_FRAME ZW_TimeGetFrame
            = new ZW_ClassCommand.ZW_TIME_GET_FRAME();
    public final ZW_ClassCommand.ZW_TIME_REPORT_FRAME ZW_TimeReportFrame
            = new ZW_ClassCommand.ZW_TIME_REPORT_FRAME();
    /* Command class Time V2 */
    public final ZW_ClassCommand.ZW_DATE_GET_V2_FRAME ZW_DateGetV2Frame
            = new ZW_ClassCommand.ZW_DATE_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_DATE_REPORT_V2_FRAME ZW_DateReportV2Frame
            = new ZW_ClassCommand.ZW_DATE_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_TIME_GET_V2_FRAME ZW_TimeGetV2Frame
            = new ZW_ClassCommand.ZW_TIME_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_TIME_OFFSET_GET_V2_FRAME ZW_TimeOffsetGetV2Frame
            = new ZW_ClassCommand.ZW_TIME_OFFSET_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_TIME_OFFSET_REPORT_V2_FRAME ZW_TimeOffsetReportV2Frame
            = new ZW_ClassCommand.ZW_TIME_OFFSET_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_TIME_OFFSET_SET_V2_FRAME ZW_TimeOffsetSetV2Frame
            = new ZW_ClassCommand.ZW_TIME_OFFSET_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_TIME_REPORT_V2_FRAME ZW_TimeReportV2Frame
            = new ZW_ClassCommand.ZW_TIME_REPORT_V2_FRAME();
    /* Command class Transport Service */
    public final ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_1BYTE_FRAME ZW_CommandFirstFragment1byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_2BYTE_FRAME ZW_CommandFirstFragment2byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_3BYTE_FRAME ZW_CommandFirstFragment3byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_3BYTE_FRAME();

    /************************************************************/
    /* ZW_FRAME_COLLECTION_MACRO3 */
    /************************************************************/
    public final ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_4BYTE_FRAME ZW_CommandFirstFragment4byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_COMPLETE_FRAME ZW_CommandFragmentCompleteFrame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_COMPLETE_FRAME();
    public final ZW_ClassCommand.VG_COMMAND_FRAGMENT_REQUEST_VG VG_CommandFragmentRequestVGroup
            = new ZW_ClassCommand.VG_COMMAND_FRAGMENT_REQUEST_VG();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_1BYTE_FRAME ZW_CommandFragmentRequest1byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_2BYTE_FRAME ZW_CommandFragmentRequest2byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_3BYTE_FRAME ZW_CommandFragmentRequest3byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_4BYTE_FRAME ZW_CommandFragmentRequest4byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_WAIT_FRAME ZW_CommandFragmentWaitFrame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_WAIT_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_1BYTE_FRAME ZW_CommandSubsequentFragment1byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_2BYTE_FRAME ZW_CommandSubsequentFragment2byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_3BYTE_FRAME ZW_CommandSubsequentFragment3byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_4BYTE_FRAME ZW_CommandSubsequentFragment4byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_4BYTE_FRAME();
    /* Command class Transport Service V2 */
    public final ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_1BYTE_V2_FRAME ZW_CommandFirstFragment1byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_2BYTE_V2_FRAME ZW_CommandFirstFragment2byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_3BYTE_V2_FRAME ZW_CommandFirstFragment3byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_4BYTE_V2_FRAME ZW_CommandFirstFragment4byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_FIRST_FRAGMENT_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_COMPLETE_V2_FRAME ZW_CommandFragmentCompleteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_COMPLETE_V2_FRAME();
    public final ZW_ClassCommand.VG_COMMAND_FRAGMENT_REQUEST_V2_VG VG_CommandFragmentRequestV2VGroup
            = new ZW_ClassCommand.VG_COMMAND_FRAGMENT_REQUEST_V2_VG();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_1BYTE_V2_FRAME ZW_CommandFragmentRequest1byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_2BYTE_V2_FRAME ZW_CommandFragmentRequest2byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_3BYTE_V2_FRAME ZW_CommandFragmentRequest3byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_4BYTE_V2_FRAME ZW_CommandFragmentRequest4byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_REQUEST_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_FRAGMENT_WAIT_V2_FRAME ZW_CommandFragmentWaitV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_FRAGMENT_WAIT_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_1BYTE_V2_FRAME ZW_CommandSubsequentFragment1byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_2BYTE_V2_FRAME ZW_CommandSubsequentFragment2byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_3BYTE_V2_FRAME ZW_CommandSubsequentFragment3byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_4BYTE_V2_FRAME ZW_CommandSubsequentFragment4byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_SUBSEQUENT_FRAGMENT_4BYTE_V2_FRAME();
    /* Command class User Code */
    public final ZW_ClassCommand.ZW_USER_CODE_GET_FRAME ZW_UserCodeGetFrame
            = new ZW_ClassCommand.ZW_USER_CODE_GET_FRAME();
    public final ZW_ClassCommand.ZW_USER_CODE_REPORT_FRAME ZW_UserCodeReportFrame
            = new ZW_ClassCommand.ZW_USER_CODE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_USER_CODE_SET_FRAME ZW_UserCodeSetFrame
            = new ZW_ClassCommand.ZW_USER_CODE_SET_FRAME();
    public final ZW_ClassCommand.ZW_USERS_NUMBER_GET_FRAME ZW_UsersNumberGetFrame
            = new ZW_ClassCommand.ZW_USERS_NUMBER_GET_FRAME();
    public final ZW_ClassCommand.ZW_USERS_NUMBER_REPORT_FRAME ZW_UsersNumberReportFrame
            = new ZW_ClassCommand.ZW_USERS_NUMBER_REPORT_FRAME();
    /* Command class Version */
    public final ZW_ClassCommand.ZW_VERSION_COMMAND_CLASS_GET_FRAME ZW_VersionCommandClassGetFrame
            = new ZW_ClassCommand.ZW_VERSION_COMMAND_CLASS_GET_FRAME();
    public final ZW_ClassCommand.ZW_VERSION_COMMAND_CLASS_REPORT_FRAME ZW_VersionCommandClassReportFrame
            = new ZW_ClassCommand.ZW_VERSION_COMMAND_CLASS_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_VERSION_GET_FRAME ZW_VersionGetFrame
            = new ZW_ClassCommand.ZW_VERSION_GET_FRAME();
    public final ZW_ClassCommand.ZW_VERSION_REPORT_FRAME ZW_VersionReportFrame
            = new ZW_ClassCommand.ZW_VERSION_REPORT_FRAME();
    /* Command class Version V2 */
    public final ZW_ClassCommand.ZW_VERSION_COMMAND_CLASS_GET_V2_FRAME ZW_VersionCommandClassGetV2Frame
            = new ZW_ClassCommand.ZW_VERSION_COMMAND_CLASS_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_VERSION_COMMAND_CLASS_REPORT_V2_FRAME ZW_VersionCommandClassReportV2Frame
            = new ZW_ClassCommand.ZW_VERSION_COMMAND_CLASS_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_VERSION_GET_V2_FRAME ZW_VersionGetV2Frame
            = new ZW_ClassCommand.ZW_VERSION_GET_V2_FRAME();
    public final ZW_ClassCommand.VG_VERSION_REPORT_V2_VG VG_VersionReportV2VGroup
            = new ZW_ClassCommand.VG_VERSION_REPORT_V2_VG();
    public final ZW_ClassCommand.ZW_VERSION_REPORT_1BYTE_V2_FRAME ZW_VersionReport1byteV2Frame
            = new ZW_ClassCommand.ZW_VERSION_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_VERSION_REPORT_2BYTE_V2_FRAME ZW_VersionReport2byteV2Frame
            = new ZW_ClassCommand.ZW_VERSION_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_VERSION_REPORT_3BYTE_V2_FRAME ZW_VersionReport3byteV2Frame
            = new ZW_ClassCommand.ZW_VERSION_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_VERSION_REPORT_4BYTE_V2_FRAME ZW_VersionReport4byteV2Frame
            = new ZW_ClassCommand.ZW_VERSION_REPORT_4BYTE_V2_FRAME();
    /* Command class Wake Up */
    public final ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_GET_FRAME ZW_WakeUpIntervalGetFrame
            = new ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_GET_FRAME();
    public final ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_REPORT_FRAME ZW_WakeUpIntervalReportFrame
            = new ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_SET_FRAME ZW_WakeUpIntervalSetFrame
            = new ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_SET_FRAME();
    public final ZW_ClassCommand.ZW_WAKE_UP_NO_MORE_INFORMATION_FRAME ZW_WakeUpNoMoreInformationFrame
            = new ZW_ClassCommand.ZW_WAKE_UP_NO_MORE_INFORMATION_FRAME();
    public final ZW_ClassCommand.ZW_WAKE_UP_NOTIFICATION_FRAME ZW_WakeUpNotificationFrame
            = new ZW_ClassCommand.ZW_WAKE_UP_NOTIFICATION_FRAME();
    /* Command class Wake Up V2 */
    public final ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_CAPABILITIES_GET_V2_FRAME ZW_WakeUpIntervalCapabilitiesGetV2Frame
            = new ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_CAPABILITIES_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_CAPABILITIES_REPORT_V2_FRAME ZW_WakeUpIntervalCapabilitiesReportV2Frame
            = new ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_CAPABILITIES_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_GET_V2_FRAME ZW_WakeUpIntervalGetV2Frame
            = new ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_REPORT_V2_FRAME ZW_WakeUpIntervalReportV2Frame
            = new ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_SET_V2_FRAME ZW_WakeUpIntervalSetV2Frame
            = new ZW_ClassCommand.ZW_WAKE_UP_INTERVAL_SET_V2_FRAME();
    public final ZW_ClassCommand.ZW_WAKE_UP_NO_MORE_INFORMATION_V2_FRAME ZW_WakeUpNoMoreInformationV2Frame
            = new ZW_ClassCommand.ZW_WAKE_UP_NO_MORE_INFORMATION_V2_FRAME();
    public final ZW_ClassCommand.ZW_WAKE_UP_NOTIFICATION_V2_FRAME ZW_WakeUpNotificationV2Frame
            = new ZW_ClassCommand.ZW_WAKE_UP_NOTIFICATION_V2_FRAME();
    /* Command class Zip 6lowpan */
    public final ZW_ClassCommand.ZW_LOWPAN_FIRST_FRAGMENT_1BYTE_FRAME ZW_LowpanFirstFragment1byteFrame
            = new ZW_ClassCommand.ZW_LOWPAN_FIRST_FRAGMENT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_LOWPAN_FIRST_FRAGMENT_2BYTE_FRAME ZW_LowpanFirstFragment2byteFrame
            = new ZW_ClassCommand.ZW_LOWPAN_FIRST_FRAGMENT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_LOWPAN_FIRST_FRAGMENT_3BYTE_FRAME ZW_LowpanFirstFragment3byteFrame
            = new ZW_ClassCommand.ZW_LOWPAN_FIRST_FRAGMENT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_LOWPAN_FIRST_FRAGMENT_4BYTE_FRAME ZW_LowpanFirstFragment4byteFrame
            = new ZW_ClassCommand.ZW_LOWPAN_FIRST_FRAGMENT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_LOWPAN_SUBSEQUENT_FRAGMENT_1BYTE_FRAME ZW_LowpanSubsequentFragment1byteFrame
            = new ZW_ClassCommand.ZW_LOWPAN_SUBSEQUENT_FRAGMENT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_LOWPAN_SUBSEQUENT_FRAGMENT_2BYTE_FRAME ZW_LowpanSubsequentFragment2byteFrame
            = new ZW_ClassCommand.ZW_LOWPAN_SUBSEQUENT_FRAGMENT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_LOWPAN_SUBSEQUENT_FRAGMENT_3BYTE_FRAME ZW_LowpanSubsequentFragment3byteFrame
            = new ZW_ClassCommand.ZW_LOWPAN_SUBSEQUENT_FRAGMENT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_LOWPAN_SUBSEQUENT_FRAGMENT_4BYTE_FRAME ZW_LowpanSubsequentFragment4byteFrame
            = new ZW_ClassCommand.ZW_LOWPAN_SUBSEQUENT_FRAGMENT_4BYTE_FRAME();
    /* Command class Zip */
    public final ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_1BYTE_FRAME ZW_CommandZipPacket1byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_2BYTE_FRAME ZW_CommandZipPacket2byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_3BYTE_FRAME ZW_CommandZipPacket3byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_4BYTE_FRAME ZW_CommandZipPacket4byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_4BYTE_FRAME();
    /* Command class Zip V2 */
    public final ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_1BYTE_V2_FRAME ZW_CommandZipPacket1byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_2BYTE_V2_FRAME ZW_CommandZipPacket2byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_3BYTE_V2_FRAME ZW_CommandZipPacket3byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_4BYTE_V2_FRAME ZW_CommandZipPacket4byteV2Frame
            = new ZW_ClassCommand.ZW_COMMAND_ZIP_PACKET_4BYTE_V2_FRAME();
    /* Command class Application Capability */
    public final ZW_ClassCommand.ZW_COMMAND_COMMAND_CLASS_NOT_SUPPORTED_FRAME ZW_CommandCommandClassNotSupportedFrame
            = new ZW_ClassCommand.ZW_COMMAND_COMMAND_CLASS_NOT_SUPPORTED_FRAME();
    /* Command class Switch Color */
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SUPPORTED_GET_FRAME ZW_SwitchColorSupportedGetFrame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SUPPORTED_REPORT_FRAME ZW_SwitchColorSupportedReportFrame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SUPPORTED_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_GET_FRAME ZW_SwitchColorGetFrame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_GET_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_REPORT_FRAME ZW_SwitchColorReportFrame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_REPORT_FRAME();
    public final ZW_ClassCommand.VG_SWITCH_COLOR_SET_VG VG_SwitchColorSetVGroup
            = new ZW_ClassCommand.VG_SWITCH_COLOR_SET_VG();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SET_1BYTE_FRAME ZW_SwitchColorSet1byteFrame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SET_2BYTE_FRAME ZW_SwitchColorSet2byteFrame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SET_3BYTE_FRAME ZW_SwitchColorSet3byteFrame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SET_4BYTE_FRAME ZW_SwitchColorSet4byteFrame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_START_LEVEL_CHANGE_FRAME ZW_SwitchColorStartLevelChangeFrame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_START_LEVEL_CHANGE_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_STOP_LEVEL_CHANGE_FRAME ZW_SwitchColorStopLevelChangeFrame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_STOP_LEVEL_CHANGE_FRAME();
    /* Command class Switch Color V2 */
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SUPPORTED_GET_V2_FRAME ZW_SwitchColorSupportedGetV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SUPPORTED_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SUPPORTED_REPORT_V2_FRAME ZW_SwitchColorSupportedReportV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SUPPORTED_REPORT_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_GET_V2_FRAME ZW_SwitchColorGetV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_REPORT_V2_FRAME ZW_SwitchColorReportV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_REPORT_V2_FRAME();
    public final ZW_ClassCommand.VG_SWITCH_COLOR_SET_V2_VG VG_SwitchColorSetV2VGroup
            = new ZW_ClassCommand.VG_SWITCH_COLOR_SET_V2_VG();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SET_1BYTE_V2_FRAME ZW_SwitchColorSet1byteV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SET_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SET_2BYTE_V2_FRAME ZW_SwitchColorSet2byteV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SET_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SET_3BYTE_V2_FRAME ZW_SwitchColorSet3byteV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SET_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_SET_4BYTE_V2_FRAME ZW_SwitchColorSet4byteV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_SET_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_START_LEVEL_CHANGE_V2_FRAME ZW_SwitchColorStartLevelChangeV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_START_LEVEL_CHANGE_V2_FRAME();
    public final ZW_ClassCommand.ZW_SWITCH_COLOR_STOP_LEVEL_CHANGE_V2_FRAME ZW_SwitchColorStopLevelChangeV2Frame
            = new ZW_ClassCommand.ZW_SWITCH_COLOR_STOP_LEVEL_CHANGE_V2_FRAME();
    /* Command class Schedule */
    public final ZW_ClassCommand.ZW_SCHEDULE_SUPPORTED_GET_FRAME ZW_ScheduleSupportedGetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.VG_SCHEDULE_SUPPORTED_REPORT_VG VG_ScheduleSupportedReportVGroup
            = new ZW_ClassCommand.VG_SCHEDULE_SUPPORTED_REPORT_VG();
    public final ZW_ClassCommand.ZW_SCHEDULE_SUPPORTED_REPORT_1BYTE_FRAME ZW_ScheduleSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_SUPPORTED_REPORT_2BYTE_FRAME ZW_ScheduleSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_SUPPORTED_REPORT_3BYTE_FRAME ZW_ScheduleSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_SUPPORTED_REPORT_4BYTE_FRAME ZW_ScheduleSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_SUPPORTED_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.VG_COMMAND_SCHEDULE_SET_1BYTE_VG VG_CommandScheduleSet1byteVGroup
            = new ZW_ClassCommand.VG_COMMAND_SCHEDULE_SET_1BYTE_VG();
    public final ZW_ClassCommand.VG_COMMAND_SCHEDULE_SET_2BYTE_VG VG_CommandScheduleSet2byteVGroup
            = new ZW_ClassCommand.VG_COMMAND_SCHEDULE_SET_2BYTE_VG();
    public final ZW_ClassCommand.VG_COMMAND_SCHEDULE_SET_3BYTE_VG VG_CommandScheduleSet3byteVGroup
            = new ZW_ClassCommand.VG_COMMAND_SCHEDULE_SET_3BYTE_VG();
    public final ZW_ClassCommand.VG_COMMAND_SCHEDULE_SET_4BYTE_VG VG_CommandScheduleSet4byteVGroup
            = new ZW_ClassCommand.VG_COMMAND_SCHEDULE_SET_4BYTE_VG();
    public final ZW_ClassCommand.ZW_COMMAND_SCHEDULE_SET_1BYTE_FRAME ZW_CommandScheduleSet1byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SCHEDULE_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SCHEDULE_SET_2BYTE_FRAME ZW_CommandScheduleSet2byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SCHEDULE_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SCHEDULE_SET_3BYTE_FRAME ZW_CommandScheduleSet3byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SCHEDULE_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SCHEDULE_SET_4BYTE_FRAME ZW_CommandScheduleSet4byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SCHEDULE_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SCHEDULE_GET_FRAME ZW_CommandScheduleGetFrame
            = new ZW_ClassCommand.ZW_COMMAND_SCHEDULE_GET_FRAME();
    public final ZW_ClassCommand.VG_COMMAND_SCHEDULE_REPORT_1BYTE_VG VG_CommandScheduleReport1byteVGroup
            = new ZW_ClassCommand.VG_COMMAND_SCHEDULE_REPORT_1BYTE_VG();
    public final ZW_ClassCommand.VG_COMMAND_SCHEDULE_REPORT_2BYTE_VG VG_CommandScheduleReport2byteVGroup
            = new ZW_ClassCommand.VG_COMMAND_SCHEDULE_REPORT_2BYTE_VG();
    public final ZW_ClassCommand.VG_COMMAND_SCHEDULE_REPORT_3BYTE_VG VG_CommandScheduleReport3byteVGroup
            = new ZW_ClassCommand.VG_COMMAND_SCHEDULE_REPORT_3BYTE_VG();
    public final ZW_ClassCommand.VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG VG_CommandScheduleReport4byteVGroup
            = new ZW_ClassCommand.VG_COMMAND_SCHEDULE_REPORT_4BYTE_VG();
    public final ZW_ClassCommand.ZW_COMMAND_SCHEDULE_REPORT_1BYTE_FRAME ZW_CommandScheduleReport1byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SCHEDULE_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SCHEDULE_REPORT_2BYTE_FRAME ZW_CommandScheduleReport2byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SCHEDULE_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SCHEDULE_REPORT_3BYTE_FRAME ZW_CommandScheduleReport3byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SCHEDULE_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_SCHEDULE_REPORT_4BYTE_FRAME ZW_CommandScheduleReport4byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_SCHEDULE_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_REMOVE_FRAME ZW_ScheduleRemoveFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_REMOVE_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_STATE_SET_FRAME ZW_ScheduleStateSetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_STATE_SET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_STATE_GET_FRAME ZW_ScheduleStateGetFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_STATE_GET_FRAME();
    public final ZW_ClassCommand.ZW_SCHEDULE_STATE_REPORT_FRAME ZW_ScheduleStateReportFrame
            = new ZW_ClassCommand.ZW_SCHEDULE_STATE_REPORT_FRAME();
    /* Command class Network Management Primary */
    public final ZW_ClassCommand.ZW_CONTROLLER_CHANGE_FRAME ZW_ControllerChangeFrame
            = new ZW_ClassCommand.ZW_CONTROLLER_CHANGE_FRAME();
    public final ZW_ClassCommand.ZW_CONTROLLER_CHANGE_STATUS_1BYTE_FRAME ZW_ControllerChangeStatus1byteFrame
            = new ZW_ClassCommand.ZW_CONTROLLER_CHANGE_STATUS_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CONTROLLER_CHANGE_STATUS_2BYTE_FRAME ZW_ControllerChangeStatus2byteFrame
            = new ZW_ClassCommand.ZW_CONTROLLER_CHANGE_STATUS_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CONTROLLER_CHANGE_STATUS_3BYTE_FRAME ZW_ControllerChangeStatus3byteFrame
            = new ZW_ClassCommand.ZW_CONTROLLER_CHANGE_STATUS_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_CONTROLLER_CHANGE_STATUS_4BYTE_FRAME ZW_ControllerChangeStatus4byteFrame
            = new ZW_ClassCommand.ZW_CONTROLLER_CHANGE_STATUS_4BYTE_FRAME();
    /* Command class Zip Nd */
    public final ZW_ClassCommand.ZW_ZIP_NODE_SOLICITATION_FRAME ZW_ZipNodeSolicitationFrame
            = new ZW_ClassCommand.ZW_ZIP_NODE_SOLICITATION_FRAME();
    public final ZW_ClassCommand.ZW_ZIP_INV_NODE_SOLICITATION_FRAME ZW_ZipInvNodeSolicitationFrame
            = new ZW_ClassCommand.ZW_ZIP_INV_NODE_SOLICITATION_FRAME();
    public final ZW_ClassCommand.ZW_ZIP_NODE_ADVERTISEMENT_FRAME ZW_ZipNodeAdvertisementFrame
            = new ZW_ClassCommand.ZW_ZIP_NODE_ADVERTISEMENT_FRAME();
    /* Command class Association Grp Info */
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_NAME_GET_FRAME ZW_AssociationGroupNameGetFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_NAME_GET_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_NAME_REPORT_1BYTE_FRAME ZW_AssociationGroupNameReport1byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_NAME_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_NAME_REPORT_2BYTE_FRAME ZW_AssociationGroupNameReport2byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_NAME_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_NAME_REPORT_3BYTE_FRAME ZW_AssociationGroupNameReport3byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_NAME_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_NAME_REPORT_4BYTE_FRAME ZW_AssociationGroupNameReport4byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_NAME_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_INFO_GET_FRAME ZW_AssociationGroupInfoGetFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_INFO_GET_FRAME();
    public final ZW_ClassCommand.VG_ASSOCIATION_GROUP_INFO_REPORT_VG VG_AssociationGroupInfoReportVGroup
            = new ZW_ClassCommand.VG_ASSOCIATION_GROUP_INFO_REPORT_VG();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_INFO_REPORT_1BYTE_FRAME ZW_AssociationGroupInfoReport1byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_INFO_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_INFO_REPORT_2BYTE_FRAME ZW_AssociationGroupInfoReport2byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_INFO_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_INFO_REPORT_3BYTE_FRAME ZW_AssociationGroupInfoReport3byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_INFO_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_INFO_REPORT_4BYTE_FRAME ZW_AssociationGroupInfoReport4byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_INFO_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_COMMAND_LIST_GET_FRAME ZW_AssociationGroupCommandListGetFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_COMMAND_LIST_GET_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_1BYTE_FRAME ZW_AssociationGroupCommandListReport1byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_2BYTE_FRAME ZW_AssociationGroupCommandListReport2byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_3BYTE_FRAME ZW_AssociationGroupCommandListReport3byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_4BYTE_FRAME ZW_AssociationGroupCommandListReport4byteFrame
            = new ZW_ClassCommand.ZW_ASSOCIATION_GROUP_COMMAND_LIST_REPORT_4BYTE_FRAME();
    /* Command class Device Reset Locally */
    public final ZW_ClassCommand.ZW_DEVICE_RESET_LOCALLY_NOTIFICATION_FRAME ZW_DeviceResetLocallyNotificationFrame
            = new ZW_ClassCommand.ZW_DEVICE_RESET_LOCALLY_NOTIFICATION_FRAME();
    /* Command class Central Scene */
    public final ZW_ClassCommand.ZW_CENTRAL_SCENE_SUPPORTED_GET_FRAME ZW_CentralSceneSupportedGetFrame
            = new ZW_ClassCommand.ZW_CENTRAL_SCENE_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_CENTRAL_SCENE_SUPPORTED_REPORT_FRAME ZW_CentralSceneSupportedReportFrame
            = new ZW_ClassCommand.ZW_CENTRAL_SCENE_SUPPORTED_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_CENTRAL_SCENE_NOTIFICATION_FRAME ZW_CentralSceneNotificationFrame
            = new ZW_ClassCommand.ZW_CENTRAL_SCENE_NOTIFICATION_FRAME();
    /* Command class Ip Association */
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_SET_1BYTE_FRAME ZW_IpAssociationSet1byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_SET_2BYTE_FRAME ZW_IpAssociationSet2byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_SET_3BYTE_FRAME ZW_IpAssociationSet3byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_SET_4BYTE_FRAME ZW_IpAssociationSet4byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_GET_FRAME ZW_IpAssociationGetFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_REPORT_1BYTE_FRAME ZW_IpAssociationReport1byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_REPORT_2BYTE_FRAME ZW_IpAssociationReport2byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_REPORT_3BYTE_FRAME ZW_IpAssociationReport3byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_REPORT_4BYTE_FRAME ZW_IpAssociationReport4byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_REMOVE_1BYTE_FRAME ZW_IpAssociationRemove1byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_REMOVE_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_REMOVE_2BYTE_FRAME ZW_IpAssociationRemove2byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_REMOVE_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_REMOVE_3BYTE_FRAME ZW_IpAssociationRemove3byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_REMOVE_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_IP_ASSOCIATION_REMOVE_4BYTE_FRAME ZW_IpAssociationRemove4byteFrame
            = new ZW_ClassCommand.ZW_IP_ASSOCIATION_REMOVE_4BYTE_FRAME();
    /* Command class Antitheft */
    public final ZW_ClassCommand.ZW_ANTITHEFT_SET_1BYTE_FRAME ZW_AntitheftSet1byteFrame
            = new ZW_ClassCommand.ZW_ANTITHEFT_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_SET_2BYTE_FRAME ZW_AntitheftSet2byteFrame
            = new ZW_ClassCommand.ZW_ANTITHEFT_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_SET_3BYTE_FRAME ZW_AntitheftSet3byteFrame
            = new ZW_ClassCommand.ZW_ANTITHEFT_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_SET_4BYTE_FRAME ZW_AntitheftSet4byteFrame
            = new ZW_ClassCommand.ZW_ANTITHEFT_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_GET_FRAME ZW_AntitheftGetFrame
            = new ZW_ClassCommand.ZW_ANTITHEFT_GET_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_REPORT_1BYTE_FRAME ZW_AntitheftReport1byteFrame
            = new ZW_ClassCommand.ZW_ANTITHEFT_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_REPORT_2BYTE_FRAME ZW_AntitheftReport2byteFrame
            = new ZW_ClassCommand.ZW_ANTITHEFT_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_REPORT_3BYTE_FRAME ZW_AntitheftReport3byteFrame
            = new ZW_ClassCommand.ZW_ANTITHEFT_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_REPORT_4BYTE_FRAME ZW_AntitheftReport4byteFrame
            = new ZW_ClassCommand.ZW_ANTITHEFT_REPORT_4BYTE_FRAME();
    /* Command class Antitheft V2 */
    public final ZW_ClassCommand.ZW_ANTITHEFT_SET_1BYTE_V2_FRAME ZW_AntitheftSet1byteV2Frame
            = new ZW_ClassCommand.ZW_ANTITHEFT_SET_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_SET_2BYTE_V2_FRAME ZW_AntitheftSet2byteV2Frame
            = new ZW_ClassCommand.ZW_ANTITHEFT_SET_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_SET_3BYTE_V2_FRAME ZW_AntitheftSet3byteV2Frame
            = new ZW_ClassCommand.ZW_ANTITHEFT_SET_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_SET_4BYTE_V2_FRAME ZW_AntitheftSet4byteV2Frame
            = new ZW_ClassCommand.ZW_ANTITHEFT_SET_4BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_GET_V2_FRAME ZW_AntitheftGetV2Frame
            = new ZW_ClassCommand.ZW_ANTITHEFT_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_REPORT_1BYTE_V2_FRAME ZW_AntitheftReport1byteV2Frame
            = new ZW_ClassCommand.ZW_ANTITHEFT_REPORT_1BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_REPORT_2BYTE_V2_FRAME ZW_AntitheftReport2byteV2Frame
            = new ZW_ClassCommand.ZW_ANTITHEFT_REPORT_2BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_REPORT_3BYTE_V2_FRAME ZW_AntitheftReport3byteV2Frame
            = new ZW_ClassCommand.ZW_ANTITHEFT_REPORT_3BYTE_V2_FRAME();
    public final ZW_ClassCommand.ZW_ANTITHEFT_REPORT_4BYTE_V2_FRAME ZW_AntitheftReport4byteV2Frame
            = new ZW_ClassCommand.ZW_ANTITHEFT_REPORT_4BYTE_V2_FRAME();
    /* Command class Zwaveplus Info */
    public final ZW_ClassCommand.ZW_ZWAVEPLUS_INFO_GET_FRAME ZW_ZwaveplusInfoGetFrame
            = new ZW_ClassCommand.ZW_ZWAVEPLUS_INFO_GET_FRAME();
    public final ZW_ClassCommand.ZW_ZWAVEPLUS_INFO_REPORT_FRAME ZW_ZwaveplusInfoReportFrame
            = new ZW_ClassCommand.ZW_ZWAVEPLUS_INFO_REPORT_FRAME();
    /* Command class Zwaveplus Info V2 */
    public final ZW_ClassCommand.ZW_ZWAVEPLUS_INFO_GET_V2_FRAME ZW_ZwaveplusInfoGetV2Frame
            = new ZW_ClassCommand.ZW_ZWAVEPLUS_INFO_GET_V2_FRAME();
    public final ZW_ClassCommand.ZW_ZWAVEPLUS_INFO_REPORT_V2_FRAME ZW_ZwaveplusInfoReportV2Frame
            = new ZW_ClassCommand.ZW_ZWAVEPLUS_INFO_REPORT_V2_FRAME();
    /* Command class Zip Gateway */
    public final ZW_ClassCommand.ZW_GATEWAY_MODE_SET_FRAME ZW_GatewayModeSetFrame
            = new ZW_ClassCommand.ZW_GATEWAY_MODE_SET_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_MODE_GET_FRAME ZW_GatewayModeGetFrame
            = new ZW_ClassCommand.ZW_GATEWAY_MODE_GET_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_MODE_REPORT_FRAME ZW_GatewayModeReportFrame
            = new ZW_ClassCommand.ZW_GATEWAY_MODE_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_PEER_SET_1BYTE_FRAME ZW_GatewayPeerSet1byteFrame
            = new ZW_ClassCommand.ZW_GATEWAY_PEER_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_PEER_SET_2BYTE_FRAME ZW_GatewayPeerSet2byteFrame
            = new ZW_ClassCommand.ZW_GATEWAY_PEER_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_PEER_SET_3BYTE_FRAME ZW_GatewayPeerSet3byteFrame
            = new ZW_ClassCommand.ZW_GATEWAY_PEER_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_PEER_SET_4BYTE_FRAME ZW_GatewayPeerSet4byteFrame
            = new ZW_ClassCommand.ZW_GATEWAY_PEER_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_PEER_GET_FRAME ZW_GatewayPeerGetFrame
            = new ZW_ClassCommand.ZW_GATEWAY_PEER_GET_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_PEER_REPORT_1BYTE_FRAME ZW_GatewayPeerReport1byteFrame
            = new ZW_ClassCommand.ZW_GATEWAY_PEER_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_PEER_REPORT_2BYTE_FRAME ZW_GatewayPeerReport2byteFrame
            = new ZW_ClassCommand.ZW_GATEWAY_PEER_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_PEER_REPORT_3BYTE_FRAME ZW_GatewayPeerReport3byteFrame
            = new ZW_ClassCommand.ZW_GATEWAY_PEER_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_PEER_REPORT_4BYTE_FRAME ZW_GatewayPeerReport4byteFrame
            = new ZW_ClassCommand.ZW_GATEWAY_PEER_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_LOCK_SET_FRAME ZW_GatewayLockSetFrame
            = new ZW_ClassCommand.ZW_GATEWAY_LOCK_SET_FRAME();
    public final ZW_ClassCommand.ZW_UNSOLICITED_DESTINATION_SET_FRAME ZW_UnsolicitedDestinationSetFrame
            = new ZW_ClassCommand.ZW_UNSOLICITED_DESTINATION_SET_FRAME();
    public final ZW_ClassCommand.ZW_UNSOLICITED_DESTINATION_GET_FRAME ZW_UnsolicitedDestinationGetFrame
            = new ZW_ClassCommand.ZW_UNSOLICITED_DESTINATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_UNSOLICITED_DESTINATION_REPORT_FRAME ZW_UnsolicitedDestinationReportFrame
            = new ZW_ClassCommand.ZW_UNSOLICITED_DESTINATION_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_SET_1BYTE_FRAME ZW_CommandApplicationNodeInfoSet1byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_SET_2BYTE_FRAME ZW_CommandApplicationNodeInfoSet2byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_SET_3BYTE_FRAME ZW_CommandApplicationNodeInfoSet3byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_SET_4BYTE_FRAME ZW_CommandApplicationNodeInfoSet4byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_GET_FRAME ZW_CommandApplicationNodeInfoGetFrame
            = new ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_GET_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_1BYTE_FRAME ZW_CommandApplicationNodeInfoReport1byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_2BYTE_FRAME ZW_CommandApplicationNodeInfoReport2byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_3BYTE_FRAME ZW_CommandApplicationNodeInfoReport3byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_4BYTE_FRAME ZW_CommandApplicationNodeInfoReport4byteFrame
            = new ZW_ClassCommand.ZW_COMMAND_APPLICATION_NODE_INFO_REPORT_4BYTE_FRAME();
    /* Command class Zip Portal */
    public final ZW_ClassCommand.ZW_GATEWAY_CONFIGURATION_SET_FRAME ZW_GatewayConfigurationSetFrame
            = new ZW_ClassCommand.ZW_GATEWAY_CONFIGURATION_SET_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_CONFIGURATION_STATUS_FRAME ZW_GatewayConfigurationStatusFrame
            = new ZW_ClassCommand.ZW_GATEWAY_CONFIGURATION_STATUS_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_CONFIGURATION_GET_FRAME ZW_GatewayConfigurationGetFrame
            = new ZW_ClassCommand.ZW_GATEWAY_CONFIGURATION_GET_FRAME();
    public final ZW_ClassCommand.ZW_GATEWAY_CONFIGURATION_REPORT_FRAME ZW_GatewayConfigurationReportFrame
            = new ZW_ClassCommand.ZW_GATEWAY_CONFIGURATION_REPORT_FRAME();
    /* Command class Appliance */
    public final ZW_ClassCommand.ZW_APPLIANCE_TYPE_GET_FRAME ZW_ApplianceTypeGetFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_TYPE_GET_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_TYPE_REPORT_1BYTE_FRAME ZW_ApplianceTypeReport1byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_TYPE_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_TYPE_REPORT_2BYTE_FRAME ZW_ApplianceTypeReport2byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_TYPE_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_TYPE_REPORT_3BYTE_FRAME ZW_ApplianceTypeReport3byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_TYPE_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_TYPE_REPORT_4BYTE_FRAME ZW_ApplianceTypeReport4byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_TYPE_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_PROGRAM_SUPPORTED_GET_FRAME ZW_ApplianceProgramSupportedGetFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_PROGRAM_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_1BYTE_FRAME ZW_ApplianceProgramSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_2BYTE_FRAME ZW_ApplianceProgramSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_3BYTE_FRAME ZW_ApplianceProgramSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_4BYTE_FRAME ZW_ApplianceProgramSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_PROGRAM_SUPPORTED_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_SET_1BYTE_FRAME ZW_ApplianceSet1byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_SET_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_SET_2BYTE_FRAME ZW_ApplianceSet2byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_SET_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_SET_3BYTE_FRAME ZW_ApplianceSet3byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_SET_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_SET_4BYTE_FRAME ZW_ApplianceSet4byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_SET_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_GET_FRAME ZW_ApplianceGetFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_GET_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_REPORT_1BYTE_FRAME ZW_ApplianceReport1byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_REPORT_2BYTE_FRAME ZW_ApplianceReport2byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_REPORT_3BYTE_FRAME ZW_ApplianceReport3byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_APPLIANCE_REPORT_4BYTE_FRAME ZW_ApplianceReport4byteFrame
            = new ZW_ClassCommand.ZW_APPLIANCE_REPORT_4BYTE_FRAME();
    /* Command class Dmx */
    public final ZW_ClassCommand.ZW_DMX_ADDRESS_SET_FRAME ZW_DmxAddressSetFrame
            = new ZW_ClassCommand.ZW_DMX_ADDRESS_SET_FRAME();
    public final ZW_ClassCommand.ZW_DMX_ADDRESS_GET_FRAME ZW_DmxAddressGetFrame
            = new ZW_ClassCommand.ZW_DMX_ADDRESS_GET_FRAME();
    public final ZW_ClassCommand.ZW_DMX_ADDRESS_REPORT_FRAME ZW_DmxAddressReportFrame
            = new ZW_ClassCommand.ZW_DMX_ADDRESS_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_DMX_CAPABILITY_GET_FRAME ZW_DmxCapabilityGetFrame
            = new ZW_ClassCommand.ZW_DMX_CAPABILITY_GET_FRAME();
    public final ZW_ClassCommand.ZW_DMX_CAPABILITY_REPORT_FRAME ZW_DmxCapabilityReportFrame
            = new ZW_ClassCommand.ZW_DMX_CAPABILITY_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_DMX_DATA_40_FRAME ZW_DmxData40Frame
            = new ZW_ClassCommand.ZW_DMX_DATA_40_FRAME();
    /* Command class Barrier Operator */
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_SET_FRAME ZW_BarrierOperatorSetFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_SET_FRAME();
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_GET_FRAME ZW_BarrierOperatorGetFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_GET_FRAME();
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_REPORT_FRAME ZW_BarrierOperatorReportFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_REPORT_FRAME();
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET_FRAME ZW_BarrierOperatorSignalSupportedGetFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_GET_FRAME();
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_1BYTE_FRAME ZW_BarrierOperatorSignalSupportedReport1byteFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_1BYTE_FRAME();
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_2BYTE_FRAME ZW_BarrierOperatorSignalSupportedReport2byteFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_2BYTE_FRAME();
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_3BYTE_FRAME ZW_BarrierOperatorSignalSupportedReport3byteFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_3BYTE_FRAME();
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_4BYTE_FRAME ZW_BarrierOperatorSignalSupportedReport4byteFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SUPPORTED_REPORT_4BYTE_FRAME();
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SET_FRAME ZW_BarrierOperatorSignalSetFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_SET_FRAME();
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_GET_FRAME ZW_BarrierOperatorSignalGetFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_GET_FRAME();
    public final ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_REPORT_FRAME ZW_BarrierOperatorSignalReportFrame
            = new ZW_ClassCommand.ZW_BARRIER_OPERATOR_SIGNAL_REPORT_FRAME();
}