// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/claimsmanager/v1/query.proto

package com.quicksilver.claimsmanager.v1;

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
    internal_static_quicksilver_claimsmanager_v1_QueryClaimsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_claimsmanager_v1_QueryClaimsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_claimsmanager_v1_QueryClaimsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_claimsmanager_v1_QueryClaimsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(quicksilver/claimsmanager/v1/query.pro" +
      "to\022\034quicksilver.claimsmanager.v1\032\024gogopr" +
      "oto/gogo.proto\032\034google/api/annotations.p" +
      "roto\032*cosmos/base/query/v1beta1/paginati" +
      "on.proto\032\031cosmos_proto/cosmos.proto\0320qui" +
      "cksilver/claimsmanager/v1/claimsmanager." +
      "proto\"\300\001\n\022QueryClaimsRequest\022.\n\010chain_id" +
      "\030\001 \001(\tB\023\362\336\037\017yaml:\"chain_id\"R\007chainId\0222\n\007" +
      "address\030\002 \001(\tB\030\322\264-\024cosmos.AddressStringR" +
      "\007address\022F\n\npagination\030\003 \001(\0132&.cosmos.ba" +
      "se.query.v1beta1.PageRequestR\npagination" +
      "\"\241\001\n\023QueryClaimsResponse\022A\n\006claims\030\001 \003(\013" +
      "2#.quicksilver.claimsmanager.v1.ClaimB\004\310" +
      "\336\037\000R\006claims\022G\n\npagination\030\002 \001(\0132\'.cosmos" +
      ".base.query.v1beta1.PageResponseR\npagina" +
      "tion2\353\005\n\005Query\022\246\001\n\006Claims\0220.quicksilver." +
      "claimsmanager.v1.QueryClaimsRequest\0321.qu" +
      "icksilver.claimsmanager.v1.QueryClaimsRe" +
      "sponse\"7\202\323\344\223\0021\022//quicksilver/claimsmanag" +
      "er/v1/claims/{chain_id}\022\276\001\n\017LastEpochCla" +
      "ims\0220.quicksilver.claimsmanager.v1.Query" +
      "ClaimsRequest\0321.quicksilver.claimsmanage" +
      "r.v1.QueryClaimsResponse\"F\202\323\344\223\002@\022>/quick" +
      "silver/claimsmanager/v1/previous_epoch_c" +
      "laims/{chain_id}\022\256\001\n\nUserClaims\0220.quicks" +
      "ilver.claimsmanager.v1.QueryClaimsReques" +
      "t\0321.quicksilver.claimsmanager.v1.QueryCl" +
      "aimsResponse\";\202\323\344\223\0025\0223/quicksilver/claim" +
      "smanager/v1/user/{address}/claims\022\306\001\n\023Us" +
      "erLastEpochClaims\0220.quicksilver.claimsma" +
      "nager.v1.QueryClaimsRequest\0321.quicksilve" +
      "r.claimsmanager.v1.QueryClaimsResponse\"J" +
      "\202\323\344\223\002D\022B/quicksilver/claimsmanager/v1/us" +
      "er/{address}/previous_epoch_claimsB\376\001\n c" +
      "om.quicksilver.claimsmanager.v1B\nQueryPr" +
      "otoP\001Z<github.com/ingenuity-build/quicks" +
      "ilver/x/claimsmanager/types\242\002\003QCX\252\002\034Quic" +
      "ksilver.Claimsmanager.V1\312\002\034Quicksilver\\C" +
      "laimsmanager\\V1\342\002(Quicksilver\\Claimsmana" +
      "ger\\V1\\GPBMetadata\352\002\036Quicksilver::Claims" +
      "manager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.quicksilver.claimsmanager.v1.ClaimsmanagerProto.getDescriptor(),
        });
    internal_static_quicksilver_claimsmanager_v1_QueryClaimsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_quicksilver_claimsmanager_v1_QueryClaimsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_claimsmanager_v1_QueryClaimsRequest_descriptor,
        new java.lang.String[] { "ChainId", "Address", "Pagination", });
    internal_static_quicksilver_claimsmanager_v1_QueryClaimsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_quicksilver_claimsmanager_v1_QueryClaimsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_claimsmanager_v1_QueryClaimsResponse_descriptor,
        new java.lang.String[] { "Claims", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.quicksilver.claimsmanager.v1.ClaimsmanagerProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
