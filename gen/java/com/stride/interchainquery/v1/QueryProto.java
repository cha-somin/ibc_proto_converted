// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/interchainquery/v1/query.proto

package com.stride.interchainquery.v1;

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
    internal_static_stride_interchainquery_v1_QueryPendingQueriesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_interchainquery_v1_QueryPendingQueriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_interchainquery_v1_QueryPendingQueriesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_interchainquery_v1_QueryPendingQueriesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%stride/interchainquery/v1/query.proto\022" +
      "\031stride.interchainquery.v1\032\'stride/inter" +
      "chainquery/v1/genesis.proto\032\034google/api/" +
      "annotations.proto\032\024gogoproto/gogo.proto\"" +
      "\034\n\032QueryPendingQueriesRequest\"n\n\033QueryPe" +
      "ndingQueriesResponse\022O\n\017pending_queries\030" +
      "\001 \003(\0132 .stride.interchainquery.v1.QueryB" +
      "\004\310\336\037\000R\016pendingQueries2\315\001\n\014QueryService\022\274" +
      "\001\n\016PendingQueries\0225.stride.interchainque" +
      "ry.v1.QueryPendingQueriesRequest\0326.strid" +
      "e.interchainquery.v1.QueryPendingQueries" +
      "Response\";\202\323\344\223\0025\0223/Stride-Labs/stride/in" +
      "terchainquery/pending_queriesB\353\001\n\035com.st" +
      "ride.interchainquery.v1B\nQueryProtoP\001Z8g" +
      "ithub.com/Stride-Labs/stride/v9/x/interc" +
      "hainquery/types\242\002\003SIX\252\002\031Stride.Interchai" +
      "nquery.V1\312\002\031Stride\\Interchainquery\\V1\342\002%" +
      "Stride\\Interchainquery\\V1\\GPBMetadata\352\002\033" +
      "Stride::Interchainquery::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.stride.interchainquery.v1.GenesisProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_stride_interchainquery_v1_QueryPendingQueriesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stride_interchainquery_v1_QueryPendingQueriesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_interchainquery_v1_QueryPendingQueriesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_stride_interchainquery_v1_QueryPendingQueriesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stride_interchainquery_v1_QueryPendingQueriesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_interchainquery_v1_QueryPendingQueriesResponse_descriptor,
        new java.lang.String[] { "PendingQueries", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.stride.interchainquery.v1.GenesisProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
