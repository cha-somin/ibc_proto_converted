// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/inflation/v1beta2/genesis.proto

package com.akash.inflation.v1beta2;

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
    internal_static_akash_inflation_v1beta2_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_inflation_v1beta2_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%akash/inflation/v1beta2/genesis.proto\022" +
      "\027akash.inflation.v1beta2\032\024gogoproto/gogo" +
      ".proto\032$akash/inflation/v1beta2/params.p" +
      "roto\"h\n\014GenesisState\022X\n\006params\030\001 \001(\0132\037.a" +
      "kash.inflation.v1beta2.ParamsB\037\310\336\037\000\352\336\037\006p" +
      "arams\362\336\037\ryaml:\"params\"R\006paramsB\355\001\n\033com.a" +
      "kash.inflation.v1beta2B\014GenesisProtoP\001ZB" +
      "github.com/akash-network/akash-api/go/no" +
      "de/inflation/types/v1beta2\242\002\003AIX\252\002\027Akash" +
      ".Inflation.V1beta2\312\002\027Akash\\Inflation\\V1b" +
      "eta2\342\002#Akash\\Inflation\\V1beta2\\GPBMetada" +
      "ta\352\002\031Akash::Inflation::V1beta2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.inflation.v1beta2.ParamsProto.getDescriptor(),
        });
    internal_static_akash_inflation_v1beta2_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_inflation_v1beta2_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_inflation_v1beta2_GenesisState_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.inflation.v1beta2.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
