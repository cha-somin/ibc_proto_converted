// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/provider/v1/provider.proto

package com.sentinel.provider.v1;

public final class ProviderProto {
  private ProviderProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_provider_v1_Provider_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_provider_v1_Provider_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#sentinel/provider/v1/provider.proto\022\024s" +
      "entinel.provider.v1\032\024gogoproto/gogo.prot" +
      "o\"\220\001\n\010Provider\022\030\n\007address\030\001 \001(\tR\007address" +
      "\022\022\n\004name\030\002 \001(\tR\004name\022\032\n\010identity\030\003 \001(\tR\010" +
      "identity\022\030\n\007website\030\004 \001(\tR\007website\022 \n\013de" +
      "scription\030\005 \001(\tR\013descriptionB\340\001\n\030com.sen" +
      "tinel.provider.v1B\rProviderProtoP\001Z;gith" +
      "ub.com/sentinel-official/hub/x/provider/" +
      "legacy/v1/types\242\002\003SPX\252\002\024Sentinel.Provide" +
      "r.V1\312\002\024Sentinel\\Provider\\V1\342\002 Sentinel\\P" +
      "rovider\\V1\\GPBMetadata\352\002\026Sentinel::Provi" +
      "der::V1\310\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_sentinel_provider_v1_Provider_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_provider_v1_Provider_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_provider_v1_Provider_descriptor,
        new java.lang.String[] { "Address", "Name", "Identity", "Website", "Description", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
