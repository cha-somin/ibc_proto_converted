// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/incentives/v1/genesis.proto

package com.evmos.incentives.v1;

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
    internal_static_evmos_incentives_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_incentives_v1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_incentives_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_incentives_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!evmos/incentives/v1/genesis.proto\022\023evm" +
      "os.incentives.v1\032$evmos/incentives/v1/in" +
      "centives.proto\032\024gogoproto/gogo.proto\"\323\001\n" +
      "\014GenesisState\0229\n\006params\030\001 \001(\0132\033.evmos.in" +
      "centives.v1.ParamsB\004\310\336\037\000R\006params\022D\n\nince" +
      "ntives\030\002 \003(\0132\036.evmos.incentives.v1.Incen" +
      "tiveB\004\310\336\037\000R\nincentives\022B\n\ngas_meters\030\003 \003" +
      "(\0132\035.evmos.incentives.v1.GasMeterB\004\310\336\037\000R" +
      "\tgasMeters\"\245\002\n\006Params\022+\n\021enable_incentiv" +
      "es\030\001 \001(\010R\020enableIncentives\022Y\n\020allocation" +
      "_limit\030\002 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/" +
      "cosmos-sdk/types.DecR\017allocationLimit\022>\n" +
      "\033incentives_epoch_identifier\030\003 \001(\tR\031ince" +
      "ntivesEpochIdentifier\022S\n\rreward_scaler\030\004" +
      " \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosmos-s" +
      "dk/types.DecR\014rewardScalerB\304\001\n\027com.evmos" +
      ".incentives.v1B\014GenesisProtoP\001Z-github.c" +
      "om/evmos/evmos/v13/x/incentives/types\242\002\003" +
      "EIX\252\002\023Evmos.Incentives.V1\312\002\023Evmos\\Incent" +
      "ives\\V1\342\002\037Evmos\\Incentives\\V1\\GPBMetadat" +
      "a\352\002\025Evmos::Incentives::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.evmos.incentives.v1.IncentivesProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_evmos_incentives_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_evmos_incentives_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_incentives_v1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "Incentives", "GasMeters", });
    internal_static_evmos_incentives_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_evmos_incentives_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_incentives_v1_Params_descriptor,
        new java.lang.String[] { "EnableIncentives", "AllocationLimit", "IncentivesEpochIdentifier", "RewardScaler", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.evmos.incentives.v1.IncentivesProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
