// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/global/v1beta1/genesis.proto

package com.kyve.global.v1beta1;

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
    internal_static_kyve_global_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kyve_global_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!kyve/global/v1beta1/genesis.proto\022\023kyv" +
      "e.global.v1beta1\032\024gogoproto/gogo.proto\032 " +
      "kyve/global/v1beta1/global.proto\"I\n\014Gene" +
      "sisState\0229\n\006params\030\001 \001(\0132\033.kyve.global.v" +
      "1beta1.ParamsB\004\310\336\037\000R\006paramsB\304\001\n\027com.kyve" +
      ".global.v1beta1B\014GenesisProtoP\001Z+github." +
      "com/KYVENetwork/chain/x/global/types\242\002\003K" +
      "GX\252\002\023Kyve.Global.V1beta1\312\002\024Kyve\\Global_\\" +
      "V1beta1\342\002 Kyve\\Global_\\V1beta1\\GPBMetada" +
      "ta\352\002\025Kyve::Global::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.kyve.global.v1beta1.GlobalProto.getDescriptor(),
        });
    internal_static_kyve_global_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kyve_global_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kyve_global_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.kyve.global.v1beta1.GlobalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
