// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omniflix/alloc/v1beta1/genesis.proto

package com.omniflix.alloc.v1beta1;

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
    internal_static_omniflix_alloc_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_omniflix_alloc_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$omniflix/alloc/v1beta1/genesis.proto\022\026" +
      "omniflix.alloc.v1beta1\032\024gogoproto/gogo.p" +
      "roto\032#omniflix/alloc/v1beta1/params.prot" +
      "o\"L\n\014GenesisState\022<\n\006params\030\001 \001(\0132\036.omni" +
      "flix.alloc.v1beta1.ParamsB\004\310\336\037\000R\006paramsB" +
      "\323\001\n\032com.omniflix.alloc.v1beta1B\014GenesisP" +
      "rotoP\001Z-github.com/OmniFlix/omniflixhub/" +
      "x/alloc/types\242\002\003OAX\252\002\026Omniflix.Alloc.V1b" +
      "eta1\312\002\026Omniflix\\Alloc\\V1beta1\342\002\"Omniflix" +
      "\\Alloc\\V1beta1\\GPBMetadata\352\002\030Omniflix::A" +
      "lloc::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.omniflix.alloc.v1beta1.ParamsProto.getDescriptor(),
        });
    internal_static_omniflix_alloc_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_omniflix_alloc_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_omniflix_alloc_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.omniflix.alloc.v1beta1.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
