// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/gov/v1beta3/genesis.proto

package com.akash.gov.v1beta3;

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
    internal_static_akash_gov_v1beta3_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_gov_v1beta3_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037akash/gov/v1beta3/genesis.proto\022\021akash" +
      ".gov.v1beta3\032\024gogoproto/gogo.proto\032\036akas" +
      "h/gov/v1beta3/params.proto\"\210\001\n\014GenesisSt" +
      "ate\022x\n\016deposit_params\030\001 \001(\0132 .akash.gov." +
      "v1beta3.DepositParamsB/\310\336\037\000\352\336\037\016deposit_p" +
      "arams\362\336\037\025yaml:\"deposit_params\"R\rdepositP" +
      "aramsB\303\001\n\025com.akash.gov.v1beta3B\014Genesis" +
      "ProtoP\001Z6github.com/akash-network/akash-" +
      "api/go/node/gov/v1beta3\242\002\003AGX\252\002\021Akash.Go" +
      "v.V1beta3\312\002\021Akash\\Gov\\V1beta3\342\002\035Akash\\Go" +
      "v\\V1beta3\\GPBMetadata\352\002\023Akash::Gov::V1be" +
      "ta3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.gov.v1beta3.ParamsProto.getDescriptor(),
        });
    internal_static_akash_gov_v1beta3_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_gov_v1beta3_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_gov_v1beta3_GenesisState_descriptor,
        new java.lang.String[] { "DepositParams", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.gov.v1beta3.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
