// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/stakers/v1beta1/genesis.proto

package com.kyve.stakers.v1beta1;

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
    internal_static_kyve_stakers_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kyve_stakers_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"kyve/stakers/v1beta1/genesis.proto\022\024ky" +
      "ve.stakers.v1beta1\032\024gogoproto/gogo.proto" +
      "\032!kyve/stakers/v1beta1/params.proto\032\"kyv" +
      "e/stakers/v1beta1/stakers.proto\"\333\004\n\014Gene" +
      "sisState\022:\n\006params\030\001 \001(\0132\034.kyve.stakers." +
      "v1beta1.ParamsB\004\310\336\037\000R\006params\022C\n\013staker_l" +
      "ist\030\002 \003(\0132\034.kyve.stakers.v1beta1.StakerB" +
      "\004\310\336\037\000R\nstakerList\022O\n\017valaccount_list\030\003 \003" +
      "(\0132 .kyve.stakers.v1beta1.ValaccountB\004\310\336" +
      "\037\000R\016valaccountList\022m\n\031commission_change_" +
      "entries\030\004 \003(\0132+.kyve.stakers.v1beta1.Com" +
      "missionChangeEntryB\004\310\336\037\000R\027commissionChan" +
      "geEntries\022\\\n\026queue_state_commission\030\005 \001(" +
      "\0132 .kyve.stakers.v1beta1.QueueStateB\004\310\336\037" +
      "\000R\024queueStateCommission\022X\n\022leave_pool_en" +
      "tries\030\006 \003(\0132$.kyve.stakers.v1beta1.Leave" +
      "PoolEntryB\004\310\336\037\000R\020leavePoolEntries\022R\n\021que" +
      "ue_state_leave\030\007 \001(\0132 .kyve.stakers.v1be" +
      "ta1.QueueStateB\004\310\336\037\000R\017queueStateLeaveB\310\001" +
      "\n\030com.kyve.stakers.v1beta1B\014GenesisProto" +
      "P\001Z,github.com/KYVENetwork/chain/x/stake" +
      "rs/types\242\002\003KSX\252\002\024Kyve.Stakers.V1beta1\312\002\024" +
      "Kyve\\Stakers\\V1beta1\342\002 Kyve\\Stakers\\V1be" +
      "ta1\\GPBMetadata\352\002\026Kyve::Stakers::V1beta1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.kyve.stakers.v1beta1.ParamsProto.getDescriptor(),
          com.kyve.stakers.v1beta1.StakersProto.getDescriptor(),
        });
    internal_static_kyve_stakers_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kyve_stakers_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kyve_stakers_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "StakerList", "ValaccountList", "CommissionChangeEntries", "QueueStateCommission", "LeavePoolEntries", "QueueStateLeave", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.kyve.stakers.v1beta1.ParamsProto.getDescriptor();
    com.kyve.stakers.v1beta1.StakersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
