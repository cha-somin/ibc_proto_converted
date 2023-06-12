// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/authz/v1beta1/query.proto

package com.cosmos.authz.v1beta1;

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
    internal_static_cosmos_authz_v1beta1_QueryGrantsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_authz_v1beta1_QueryGrantsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_authz_v1beta1_QueryGrantsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_authz_v1beta1_QueryGrantsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_authz_v1beta1_QueryGranterGrantsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_authz_v1beta1_QueryGranterGrantsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_authz_v1beta1_QueryGranterGrantsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_authz_v1beta1_QueryGranterGrantsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_authz_v1beta1_QueryGranteeGrantsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_authz_v1beta1_QueryGranteeGrantsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_authz_v1beta1_QueryGranteeGrantsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_authz_v1beta1_QueryGranteeGrantsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n cosmos/authz/v1beta1/query.proto\022\024cosm" +
      "os.authz.v1beta1\032\034google/api/annotations" +
      ".proto\032*cosmos/base/query/v1beta1/pagina" +
      "tion.proto\032 cosmos/authz/v1beta1/authz.p" +
      "roto\032\031cosmos_proto/cosmos.proto\"\346\001\n\022Quer" +
      "yGrantsRequest\0222\n\007granter\030\001 \001(\tB\030\322\264-\024cos" +
      "mos.AddressStringR\007granter\0222\n\007grantee\030\002 " +
      "\001(\tB\030\322\264-\024cosmos.AddressStringR\007grantee\022 " +
      "\n\014msg_type_url\030\003 \001(\tR\nmsgTypeUrl\022F\n\npagi" +
      "nation\030\004 \001(\0132&.cosmos.base.query.v1beta1" +
      ".PageRequestR\npagination\"\223\001\n\023QueryGrants" +
      "Response\0223\n\006grants\030\001 \003(\0132\033.cosmos.authz." +
      "v1beta1.GrantR\006grants\022G\n\npagination\030\002 \001(" +
      "\0132\'.cosmos.base.query.v1beta1.PageRespon" +
      "seR\npagination\"\227\001\n\031QueryGranterGrantsReq" +
      "uest\0222\n\007granter\030\001 \001(\tB\030\322\264-\024cosmos.Addres" +
      "sStringR\007granter\022F\n\npagination\030\002 \001(\0132&.c" +
      "osmos.base.query.v1beta1.PageRequestR\npa" +
      "gination\"\247\001\n\032QueryGranterGrantsResponse\022" +
      "@\n\006grants\030\001 \003(\0132(.cosmos.authz.v1beta1.G" +
      "rantAuthorizationR\006grants\022G\n\npagination\030" +
      "\002 \001(\0132\'.cosmos.base.query.v1beta1.PageRe" +
      "sponseR\npagination\"\227\001\n\031QueryGranteeGrant" +
      "sRequest\0222\n\007grantee\030\001 \001(\tB\030\322\264-\024cosmos.Ad" +
      "dressStringR\007grantee\022F\n\npagination\030\002 \001(\013" +
      "2&.cosmos.base.query.v1beta1.PageRequest" +
      "R\npagination\"\247\001\n\032QueryGranteeGrantsRespo" +
      "nse\022@\n\006grants\030\001 \003(\0132(.cosmos.authz.v1bet" +
      "a1.GrantAuthorizationR\006grants\022G\n\npaginat" +
      "ion\030\002 \001(\0132\'.cosmos.base.query.v1beta1.Pa" +
      "geResponseR\npagination2\347\003\n\005Query\022\203\001\n\006Gra" +
      "nts\022(.cosmos.authz.v1beta1.QueryGrantsRe" +
      "quest\032).cosmos.authz.v1beta1.QueryGrants" +
      "Response\"$\202\323\344\223\002\036\022\034/cosmos/authz/v1beta1/" +
      "grants\022\252\001\n\rGranterGrants\022/.cosmos.authz." +
      "v1beta1.QueryGranterGrantsRequest\0320.cosm" +
      "os.authz.v1beta1.QueryGranterGrantsRespo" +
      "nse\"6\202\323\344\223\0020\022./cosmos/authz/v1beta1/grant" +
      "s/granter/{granter}\022\252\001\n\rGranteeGrants\022/." +
      "cosmos.authz.v1beta1.QueryGranteeGrantsR" +
      "equest\0320.cosmos.authz.v1beta1.QueryGrant" +
      "eeGrantsResponse\"6\202\323\344\223\0020\022./cosmos/authz/" +
      "v1beta1/grants/grantee/{grantee}B\276\001\n\030com" +
      ".cosmos.authz.v1beta1B\nQueryProtoP\001Z$git" +
      "hub.com/cosmos/cosmos-sdk/x/authz\242\002\003CAX\252" +
      "\002\024Cosmos.Authz.V1beta1\312\002\024Cosmos\\Authz\\V1" +
      "beta1\342\002 Cosmos\\Authz\\V1beta1\\GPBMetadata" +
      "\352\002\026Cosmos::Authz::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.cosmos.authz.v1beta1.AuthzProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_cosmos_authz_v1beta1_QueryGrantsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_authz_v1beta1_QueryGrantsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_authz_v1beta1_QueryGrantsRequest_descriptor,
        new java.lang.String[] { "Granter", "Grantee", "MsgTypeUrl", "Pagination", });
    internal_static_cosmos_authz_v1beta1_QueryGrantsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_authz_v1beta1_QueryGrantsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_authz_v1beta1_QueryGrantsResponse_descriptor,
        new java.lang.String[] { "Grants", "Pagination", });
    internal_static_cosmos_authz_v1beta1_QueryGranterGrantsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_authz_v1beta1_QueryGranterGrantsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_authz_v1beta1_QueryGranterGrantsRequest_descriptor,
        new java.lang.String[] { "Granter", "Pagination", });
    internal_static_cosmos_authz_v1beta1_QueryGranterGrantsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_authz_v1beta1_QueryGranterGrantsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_authz_v1beta1_QueryGranterGrantsResponse_descriptor,
        new java.lang.String[] { "Grants", "Pagination", });
    internal_static_cosmos_authz_v1beta1_QueryGranteeGrantsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_authz_v1beta1_QueryGranteeGrantsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_authz_v1beta1_QueryGranteeGrantsRequest_descriptor,
        new java.lang.String[] { "Grantee", "Pagination", });
    internal_static_cosmos_authz_v1beta1_QueryGranteeGrantsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_authz_v1beta1_QueryGranteeGrantsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_authz_v1beta1_QueryGranteeGrantsResponse_descriptor,
        new java.lang.String[] { "Grants", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.cosmos.authz.v1beta1.AuthzProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
