// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/relayers/query.proto

package com.stafihub.stafihub.relayers;

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
    internal_static_stafihub_stafihub_relayers_QueryRelayersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_relayers_QueryRelayersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_relayers_QueryRelayersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_relayers_QueryRelayersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_relayers_QueryThresholdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_relayers_QueryThresholdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_relayers_QueryThresholdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_relayers_QueryThresholdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035stafihub/relayers/query.proto\022\032stafihu" +
      "b.stafihub.relayers\032\034google/api/annotati" +
      "ons.proto\032*cosmos/base/query/v1beta1/pag" +
      "ination.proto\032\024gogoproto/gogo.proto\"B\n\024Q" +
      "ueryRelayersRequest\022\024\n\005arena\030\001 \001(\tR\005aren" +
      "a\022\024\n\005denom\030\002 \001(\tR\005denom\"9\n\025QueryRelayers" +
      "Response\022 \n\010relayers\030\001 \003(\tB\004\310\336\037\000R\010relaye" +
      "rs\"C\n\025QueryThresholdRequest\022\024\n\005arena\030\001 \001" +
      "(\tR\005arena\022\024\n\005denom\030\002 \001(\tR\005denom\"6\n\026Query" +
      "ThresholdResponse\022\034\n\tthreshold\030\001 \001(\rR\tth" +
      "reshold2\342\002\n\005Query\022\244\001\n\010Relayers\0220.stafihu" +
      "b.stafihub.relayers.QueryRelayersRequest" +
      "\0321.stafihub.stafihub.relayers.QueryRelay" +
      "ersResponse\"3\202\323\344\223\002-\022+/stafihub/stafihub/" +
      "relayers/{arena}/{denom}\022\261\001\n\tThreshold\0221" +
      ".stafihub.stafihub.relayers.QueryThresho" +
      "ldRequest\0322.stafihub.stafihub.relayers.Q" +
      "ueryThresholdResponse\"=\202\323\344\223\0027\0225/stafihub" +
      "/stafihub/relayers/threshold/{arena}/{de" +
      "nom}B\345\001\n\036com.stafihub.stafihub.relayersB" +
      "\nQueryProtoP\001Z-github.com/stafihub/stafi" +
      "hub/x/relayers/types\242\002\003SSR\252\002\032Stafihub.St" +
      "afihub.Relayers\312\002\032Stafihub\\Stafihub\\Rela" +
      "yers\342\002&Stafihub\\Stafihub\\Relayers\\GPBMet" +
      "adata\352\002\034Stafihub::Stafihub::Relayersb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_stafihub_stafihub_relayers_QueryRelayersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stafihub_stafihub_relayers_QueryRelayersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_relayers_QueryRelayersRequest_descriptor,
        new java.lang.String[] { "Arena", "Denom", });
    internal_static_stafihub_stafihub_relayers_QueryRelayersResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stafihub_stafihub_relayers_QueryRelayersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_relayers_QueryRelayersResponse_descriptor,
        new java.lang.String[] { "Relayers", });
    internal_static_stafihub_stafihub_relayers_QueryThresholdRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_stafihub_stafihub_relayers_QueryThresholdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_relayers_QueryThresholdRequest_descriptor,
        new java.lang.String[] { "Arena", "Denom", });
    internal_static_stafihub_stafihub_relayers_QueryThresholdResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_stafihub_stafihub_relayers_QueryThresholdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_relayers_QueryThresholdResponse_descriptor,
        new java.lang.String[] { "Threshold", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
