// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/params/v1beta1/query.proto

package com.cosmos.params.v1beta1;

public final class QueryProto {
  private QueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_params_v1beta1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_params_v1beta1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_params_v1beta1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_params_v1beta1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_params_v1beta1_QuerySubspacesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_params_v1beta1_QuerySubspacesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_params_v1beta1_QuerySubspacesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_params_v1beta1_QuerySubspacesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_params_v1beta1_Subspace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_params_v1beta1_Subspace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!cosmos/params/v1beta1/query.proto\022\025cos" +
      "mos.params.v1beta1\032\024gogoproto/gogo.proto" +
      "\032\034google/api/annotations.proto\032\"cosmos/p" +
      "arams/v1beta1/params.proto\032\021amino/amino." +
      "proto\"B\n\022QueryParamsRequest\022\032\n\010subspace\030" +
      "\001 \001(\tR\010subspace\022\020\n\003key\030\002 \001(\tR\003key\"Z\n\023Que" +
      "ryParamsResponse\022C\n\005param\030\001 \001(\0132\".cosmos" +
      ".params.v1beta1.ParamChangeB\t\310\336\037\000\250\347\260*\001R\005" +
      "param\"\027\n\025QuerySubspacesRequest\"W\n\026QueryS" +
      "ubspacesResponse\022=\n\tsubspaces\030\001 \003(\0132\037.co" +
      "smos.params.v1beta1.SubspaceR\tsubspaces\"" +
      ":\n\010Subspace\022\032\n\010subspace\030\001 \001(\tR\010subspace\022" +
      "\022\n\004keys\030\002 \003(\tR\004keys2\245\002\n\005Query\022\206\001\n\006Params" +
      "\022).cosmos.params.v1beta1.QueryParamsRequ" +
      "est\032*.cosmos.params.v1beta1.QueryParamsR" +
      "esponse\"%\202\323\344\223\002\037\022\035/cosmos/params/v1beta1/" +
      "params\022\222\001\n\tSubspaces\022,.cosmos.params.v1b" +
      "eta1.QuerySubspacesRequest\032-.cosmos.para" +
      "ms.v1beta1.QuerySubspacesResponse\"(\202\323\344\223\002" +
      "\"\022 /cosmos/params/v1beta1/subspacesB\323\001\n\031" +
      "com.cosmos.params.v1beta1B\nQueryProtoP\001Z" +
      "4github.com/cosmos/cosmos-sdk/x/params/t" +
      "ypes/proposal\242\002\003CPX\252\002\025Cosmos.Params.V1be" +
      "ta1\312\002\025Cosmos\\Params\\V1beta1\342\002!Cosmos\\Par" +
      "ams\\V1beta1\\GPBMetadata\352\002\027Cosmos::Params" +
      "::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.params.v1beta1.ParamsProto.getDescriptor(),
          com.amino.AminoProto.getDescriptor(),
        });
    internal_static_cosmos_params_v1beta1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_params_v1beta1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_params_v1beta1_QueryParamsRequest_descriptor,
        new java.lang.String[] { "Subspace", "Key", });
    internal_static_cosmos_params_v1beta1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_params_v1beta1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_params_v1beta1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Param", });
    internal_static_cosmos_params_v1beta1_QuerySubspacesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_params_v1beta1_QuerySubspacesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_params_v1beta1_QuerySubspacesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_cosmos_params_v1beta1_QuerySubspacesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_params_v1beta1_QuerySubspacesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_params_v1beta1_QuerySubspacesResponse_descriptor,
        new java.lang.String[] { "Subspaces", });
    internal_static_cosmos_params_v1beta1_Subspace_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_params_v1beta1_Subspace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_params_v1beta1_Subspace_descriptor,
        new java.lang.String[] { "Subspace", "Keys", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.dontOmitempty);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.params.v1beta1.ParamsProto.getDescriptor();
    com.amino.AminoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
