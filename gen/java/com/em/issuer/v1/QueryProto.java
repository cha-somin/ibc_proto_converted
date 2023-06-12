// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/issuer/v1/query.proto

package com.em.issuer.v1;

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
    internal_static_em_issuer_v1_QueryIssuersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_issuer_v1_QueryIssuersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_issuer_v1_QueryIssuersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_issuer_v1_QueryIssuersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030em/issuer/v1/query.proto\022\014em.issuer.v1" +
      "\032\024gogoproto/gogo.proto\032\036cosmos/base/v1be" +
      "ta1/coin.proto\032\034google/api/annotations.p" +
      "roto\032\031em/issuer/v1/issuer.proto\"\025\n\023Query" +
      "IssuersRequest\"^\n\024QueryIssuersResponse\022F" +
      "\n\007issuers\030\001 \003(\0132\024.em.issuer.v1.IssuerB\026\310" +
      "\336\037\000\362\336\037\016yaml:\"issuers\"R\007issuers2}\n\005Query\022" +
      "t\n\007Issuers\022!.em.issuer.v1.QueryIssuersRe" +
      "quest\032\".em.issuer.v1.QueryIssuersRespons" +
      "e\"\"\202\323\344\223\002\034\022\032/e-money/issuer/v1/issuersB\235\001" +
      "\n\020com.em.issuer.v1B\nQueryProtoP\001Z+github" +
      ".com/e-money/em-ledger/x/issuer/types\242\002\003" +
      "EIX\252\002\014Em.Issuer.V1\312\002\014Em\\Issuer\\V1\342\002\030Em\\I" +
      "ssuer\\V1\\GPBMetadata\352\002\016Em::Issuer::V1b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.em.issuer.v1.IssuerProto.getDescriptor(),
        });
    internal_static_em_issuer_v1_QueryIssuersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_em_issuer_v1_QueryIssuersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_issuer_v1_QueryIssuersRequest_descriptor,
        new java.lang.String[] { });
    internal_static_em_issuer_v1_QueryIssuersResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_em_issuer_v1_QueryIssuersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_issuer_v1_QueryIssuersResponse_descriptor,
        new java.lang.String[] { "Issuers", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.em.issuer.v1.IssuerProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
