// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/claim/params.proto

package com.stafihub.stafihub.claim;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_claim_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_claim_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033stafihub/claim/params.proto\022\027stafihub." +
      "stafihub.claim\032\024gogoproto/gogo.proto\"\016\n\006" +
      "Params:\004\230\240\037\000B\324\001\n\033com.stafihub.stafihub.c" +
      "laimB\013ParamsProtoP\001Z*github.com/stafihub" +
      "/stafihub/x/claim/types\242\002\003SSC\252\002\027Stafihub" +
      ".Stafihub.Claim\312\002\027Stafihub\\Stafihub\\Clai" +
      "m\342\002#Stafihub\\Stafihub\\Claim\\GPBMetadata\352" +
      "\002\031Stafihub::Stafihub::Claimb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_stafihub_stafihub_claim_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stafihub_stafihub_claim_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_claim_Params_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
