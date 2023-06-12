// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/records/genesis.proto

package com.stride.records;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_records_UserRedemptionRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_records_UserRedemptionRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_records_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_records_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_records_RecordsPacketData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_records_RecordsPacketData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_records_NoData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_records_NoData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_records_DepositRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_records_DepositRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_records_HostZoneUnbonding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_records_HostZoneUnbonding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_records_EpochUnbondingRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_records_EpochUnbondingRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_records_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_records_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034stride/records/genesis.proto\022\016stride.r" +
      "ecords\032\024gogoproto/gogo.proto\"\247\002\n\024UserRed" +
      "emptionRecord\022\016\n\002id\030\001 \001(\tR\002id\022\026\n\006sender\030" +
      "\002 \001(\tR\006sender\022\032\n\010receiver\030\003 \001(\tR\010receive" +
      "r\022F\n\006amount\030\004 \001(\tB.\310\336\037\000\332\336\037&github.com/co" +
      "smos/cosmos-sdk/types.IntR\006amount\022\024\n\005den" +
      "om\030\005 \001(\tR\005denom\022 \n\014host_zone_id\030\006 \001(\tR\nh" +
      "ostZoneId\022!\n\014epoch_number\030\007 \001(\004R\013epochNu" +
      "mber\022(\n\020claim_is_pending\030\010 \001(\010R\016claimIsP" +
      "ending\"\016\n\006Params:\004\230\240\037\000\"P\n\021RecordsPacketD" +
      "ata\0221\n\007no_data\030\001 \001(\0132\026.stride.records.No" +
      "DataH\000R\006noDataB\010\n\006packet\"\010\n\006NoData\"\347\003\n\rD" +
      "epositRecord\022\016\n\002id\030\001 \001(\004R\002id\022F\n\006amount\030\002" +
      " \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosmos-s" +
      "dk/types.IntR\006amount\022\024\n\005denom\030\003 \001(\tR\005den" +
      "om\022 \n\014host_zone_id\030\004 \001(\tR\nhostZoneId\022<\n\006" +
      "status\030\006 \001(\0162$.stride.records.DepositRec" +
      "ord.StatusR\006status\0220\n\024deposit_epoch_numb" +
      "er\030\007 \001(\004R\022depositEpochNumber\022<\n\006source\030\010" +
      " \001(\0162$.stride.records.DepositRecord.Sour" +
      "ceR\006source\"h\n\006Status\022\022\n\016TRANSFER_QUEUE\020\000" +
      "\022\030\n\024TRANSFER_IN_PROGRESS\020\002\022\024\n\020DELEGATION" +
      "_QUEUE\020\001\022\032\n\026DELEGATION_IN_PROGRESS\020\003\"(\n\006" +
      "Source\022\n\n\006STRIDE\020\000\022\022\n\016WITHDRAWAL_ICA\020\001J\004" +
      "\010\005\020\006\"\245\004\n\021HostZoneUnbonding\022V\n\017st_token_a" +
      "mount\030\001 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/c" +
      "osmos-sdk/types.IntR\rstTokenAmount\022^\n\023na" +
      "tive_token_amount\030\002 \001(\tB.\310\336\037\000\332\336\037&github." +
      "com/cosmos/cosmos-sdk/types.IntR\021nativeT" +
      "okenAmount\022\024\n\005denom\030\003 \001(\tR\005denom\022 \n\014host" +
      "_zone_id\030\004 \001(\tR\nhostZoneId\022%\n\016unbonding_" +
      "time\030\005 \001(\004R\runbondingTime\022@\n\006status\030\006 \001(" +
      "\0162(.stride.records.HostZoneUnbonding.Sta" +
      "tusR\006status\0226\n\027user_redemption_records\030\007" +
      " \003(\tR\025userRedemptionRecords\"\177\n\006Status\022\023\n" +
      "\017UNBONDING_QUEUE\020\000\022\031\n\025UNBONDING_IN_PROGR" +
      "ESS\020\003\022\027\n\023EXIT_TRANSFER_QUEUE\020\001\022\035\n\031EXIT_T" +
      "RANSFER_IN_PROGRESS\020\004\022\r\n\tCLAIMABLE\020\002\"\224\001\n" +
      "\024EpochUnbondingRecord\022!\n\014epoch_number\030\001 " +
      "\001(\004R\013epochNumber\022S\n\024host_zone_unbondings" +
      "\030\003 \003(\0132!.stride.records.HostZoneUnbondin" +
      "gR\022hostZoneUnbondingsJ\004\010\002\020\003\"\373\003\n\014GenesisS" +
      "tate\0224\n\006params\030\001 \001(\0132\026.stride.records.Pa" +
      "ramsB\004\310\336\037\000R\006params\022\027\n\007port_id\030\002 \001(\tR\006por" +
      "tId\022i\n\033user_redemption_record_list\030\003 \003(\013" +
      "2$.stride.records.UserRedemptionRecordB\004" +
      "\310\336\037\000R\030userRedemptionRecordList\022?\n\034user_r" +
      "edemption_record_count\030\004 \001(\004R\031userRedemp" +
      "tionRecordCount\022i\n\033epoch_unbonding_recor" +
      "d_list\030\005 \003(\0132$.stride.records.EpochUnbon" +
      "dingRecordB\004\310\336\037\000R\030epochUnbondingRecordLi" +
      "st\022S\n\023deposit_record_list\030\007 \003(\0132\035.stride" +
      ".records.DepositRecordB\004\310\336\037\000R\021depositRec" +
      "ordList\0220\n\024deposit_record_count\030\010 \001(\004R\022d" +
      "epositRecordCount2\005\n\003MsgB\255\001\n\022com.stride." +
      "recordsB\014GenesisProtoP\001Z0github.com/Stri" +
      "de-Labs/stride/v9/x/records/types\242\002\003SRX\252" +
      "\002\016Stride.Records\312\002\016Stride\\Records\342\002\032Stri" +
      "de\\Records\\GPBMetadata\352\002\017Stride::Records" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_stride_records_UserRedemptionRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stride_records_UserRedemptionRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_records_UserRedemptionRecord_descriptor,
        new java.lang.String[] { "Id", "Sender", "Receiver", "Amount", "Denom", "HostZoneId", "EpochNumber", "ClaimIsPending", });
    internal_static_stride_records_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stride_records_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_records_Params_descriptor,
        new java.lang.String[] { });
    internal_static_stride_records_RecordsPacketData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_stride_records_RecordsPacketData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_records_RecordsPacketData_descriptor,
        new java.lang.String[] { "NoData", "Packet", });
    internal_static_stride_records_NoData_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_stride_records_NoData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_records_NoData_descriptor,
        new java.lang.String[] { });
    internal_static_stride_records_DepositRecord_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_stride_records_DepositRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_records_DepositRecord_descriptor,
        new java.lang.String[] { "Id", "Amount", "Denom", "HostZoneId", "Status", "DepositEpochNumber", "Source", });
    internal_static_stride_records_HostZoneUnbonding_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_stride_records_HostZoneUnbonding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_records_HostZoneUnbonding_descriptor,
        new java.lang.String[] { "StTokenAmount", "NativeTokenAmount", "Denom", "HostZoneId", "UnbondingTime", "Status", "UserRedemptionRecords", });
    internal_static_stride_records_EpochUnbondingRecord_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_stride_records_EpochUnbondingRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_records_EpochUnbondingRecord_descriptor,
        new java.lang.String[] { "EpochNumber", "HostZoneUnbondings", });
    internal_static_stride_records_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_stride_records_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_records_GenesisState_descriptor,
        new java.lang.String[] { "Params", "PortId", "UserRedemptionRecordList", "UserRedemptionRecordCount", "EpochUnbondingRecordList", "DepositRecordList", "DepositRecordCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
