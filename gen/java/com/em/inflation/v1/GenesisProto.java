// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/inflation/v1/genesis.proto

package com.em.inflation.v1;

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
    internal_static_em_inflation_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_inflation_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035em/inflation/v1/genesis.proto\022\017em.infl" +
      "ation.v1\032\024gogoproto/gogo.proto\032\036cosmos/b" +
      "ase/v1beta1/coin.proto\032\037em/inflation/v1/" +
      "inflation.proto\"p\n\014GenesisState\022`\n\006asset" +
      "s\030\001 \001(\0132\037.em.inflation.v1.InflationState" +
      "B\'\310\336\037\000\342\336\037\016InflationState\362\336\037\ryaml:\"assets" +
      "\"R\006assetsB\261\001\n\023com.em.inflation.v1B\014Genes" +
      "isProtoP\001Z.github.com/e-money/em-ledger/" +
      "x/inflation/types\242\002\003EIX\252\002\017Em.Inflation.V" +
      "1\312\002\017Em\\Inflation\\V1\342\002\033Em\\Inflation\\V1\\GP" +
      "BMetadata\352\002\021Em::Inflation::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.em.inflation.v1.InflationProto.getDescriptor(),
        });
    internal_static_em_inflation_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_em_inflation_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_inflation_v1_GenesisState_descriptor,
        new java.lang.String[] { "Assets", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.em.inflation.v1.InflationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
