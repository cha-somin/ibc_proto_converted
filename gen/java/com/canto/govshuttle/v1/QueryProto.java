// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/govshuttle/v1/query.proto

package com.canto.govshuttle.v1;

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
    internal_static_canto_govshuttle_v1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_govshuttle_v1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_govshuttle_v1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_govshuttle_v1_QueryParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037canto/govshuttle/v1/query.proto\022\023canto" +
      ".govshuttle.v1\032\024gogoproto/gogo.proto\032\034go" +
      "ogle/api/annotations.proto\032*cosmos/base/" +
      "query/v1beta1/pagination.proto\032$canto/go" +
      "vshuttle/v1/govshuttle.proto\"\024\n\022QueryPar" +
      "amsRequest\"P\n\023QueryParamsResponse\0229\n\006par" +
      "ams\030\001 \001(\0132\033.canto.govshuttle.v1.ParamsB\004" +
      "\310\336\037\000R\006params2\206\001\n\005Query\022}\n\006Params\022\'.canto" +
      ".govshuttle.v1.QueryParamsRequest\032(.cant" +
      "o.govshuttle.v1.QueryParamsResponse\" \202\323\344" +
      "\223\002\032\022\030/canto/govshuttle/paramsB\311\001\n\027com.ca" +
      "nto.govshuttle.v1B\nQueryProtoP\001Z4github." +
      "com/Canto-Network/Canto/v6/x/govshuttle/" +
      "types\242\002\003CGX\252\002\023Canto.Govshuttle.V1\312\002\023Cant" +
      "o\\Govshuttle\\V1\342\002\037Canto\\Govshuttle\\V1\\GP" +
      "BMetadata\352\002\025Canto::Govshuttle::V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.canto.govshuttle.v1.GovshuttleProto.getDescriptor(),
        });
    internal_static_canto_govshuttle_v1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_canto_govshuttle_v1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_govshuttle_v1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_canto_govshuttle_v1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_canto_govshuttle_v1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_govshuttle_v1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.canto.govshuttle.v1.GovshuttleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
