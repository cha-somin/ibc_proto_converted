// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/incentives/v1/genesis.proto

package com.incentives.v1;

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
    internal_static_incentives_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_incentives_v1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_incentives_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_incentives_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%sommelier/incentives/v1/genesis.proto\022" +
      "\rincentives.v1\032\024gogoproto/gogo.proto\032\036co" +
      "smos/base/v1beta1/coin.proto\"C\n\014GenesisS" +
      "tate\0223\n\006params\030\001 \001(\0132\025.incentives.v1.Par" +
      "amsB\004\310\336\037\000R\006params\"\231\001\n\006Params\022U\n\026distribu" +
      "tion_per_block\030\001 \001(\0132\031.cosmos.base.v1bet" +
      "a1.CoinB\004\310\336\037\000R\024distributionPerBlock\0228\n\030i" +
      "ncentives_cutoff_height\030\002 \001(\004R\026incentive" +
      "sCutoffHeightB\252\001\n\021com.incentives.v1B\014Gen" +
      "esisProtoP\001Z2github.com/peggyjv/sommelie" +
      "r/v4/x/incentives/types\242\002\003IXX\252\002\rIncentiv" +
      "es.V1\312\002\rIncentives\\V1\342\002\031Incentives\\V1\\GP" +
      "BMetadata\352\002\016Incentives::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_incentives_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_incentives_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_incentives_v1_GenesisState_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_incentives_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_incentives_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_incentives_v1_Params_descriptor,
        new java.lang.String[] { "DistributionPerBlock", "IncentivesCutoffHeight", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
