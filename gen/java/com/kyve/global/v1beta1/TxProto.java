// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/global/v1beta1/tx.proto

package com.kyve.global.v1beta1;

public final class TxProto {
  private TxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kyve_global_v1beta1_MsgUpdateParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kyve_global_v1beta1_MsgUpdateParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kyve_global_v1beta1_MsgUpdateParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kyve_global_v1beta1_MsgUpdateParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034kyve/global/v1beta1/tx.proto\022\023kyve.glo" +
      "bal.v1beta1\032\031cosmos_proto/cosmos.proto\"c" +
      "\n\017MsgUpdateParams\0226\n\tauthority\030\001 \001(\tB\030\322\264" +
      "-\024cosmos.AddressStringR\tauthority\022\030\n\007pay" +
      "load\030\002 \001(\tR\007payload\"\031\n\027MsgUpdateParamsRe" +
      "sponse2i\n\003Msg\022b\n\014UpdateParams\022$.kyve.glo" +
      "bal.v1beta1.MsgUpdateParams\032,.kyve.globa" +
      "l.v1beta1.MsgUpdateParamsResponseB\277\001\n\027co" +
      "m.kyve.global.v1beta1B\007TxProtoP\001Z+github" +
      ".com/KYVENetwork/chain/x/global/types\242\002\003" +
      "KGX\252\002\023Kyve.Global.V1beta1\312\002\024Kyve\\Global_" +
      "\\V1beta1\342\002 Kyve\\Global_\\V1beta1\\GPBMetad" +
      "ata\352\002\025Kyve::Global::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_kyve_global_v1beta1_MsgUpdateParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kyve_global_v1beta1_MsgUpdateParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kyve_global_v1beta1_MsgUpdateParams_descriptor,
        new java.lang.String[] { "Authority", "Payload", });
    internal_static_kyve_global_v1beta1_MsgUpdateParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kyve_global_v1beta1_MsgUpdateParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kyve_global_v1beta1_MsgUpdateParamsResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
