// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/provider/v1beta2/genesis.proto

package com.akash.provider.v1beta2;

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
    internal_static_akash_provider_v1beta2_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_provider_v1beta2_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$akash/provider/v1beta2/genesis.proto\022\026" +
      "akash.provider.v1beta2\032\024gogoproto/gogo.p" +
      "roto\032%akash/provider/v1beta2/provider.pr" +
      "oto\"u\n\014GenesisState\022e\n\tproviders\030\001 \003(\0132 " +
      ".akash.provider.v1beta2.ProviderB%\310\336\037\000\352\336" +
      "\037\tproviders\362\336\037\020yaml:\"providers\"R\tprovide" +
      "rsB\341\001\n\032com.akash.provider.v1beta2B\014Genes" +
      "isProtoP\001Z;github.com/akash-network/akas" +
      "h-api/go/node/provider/v1beta2\242\002\003APX\252\002\026A" +
      "kash.Provider.V1beta2\312\002\026Akash\\Provider\\V" +
      "1beta2\342\002\"Akash\\Provider\\V1beta2\\GPBMetad" +
      "ata\352\002\030Akash::Provider::V1beta2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.provider.v1beta2.ProviderProto.getDescriptor(),
        });
    internal_static_akash_provider_v1beta2_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_provider_v1beta2_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_provider_v1beta2_GenesisState_descriptor,
        new java.lang.String[] { "Providers", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.provider.v1beta2.ProviderProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
