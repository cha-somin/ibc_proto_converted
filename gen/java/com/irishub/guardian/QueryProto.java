// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irishub/guardian/query.proto

package com.irishub.guardian;

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
    internal_static_irishub_guardian_QuerySupersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_irishub_guardian_QuerySupersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_irishub_guardian_QuerySupersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_irishub_guardian_QuerySupersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034irishub/guardian/query.proto\022\020irishub." +
      "guardian\032\024gogoproto/gogo.proto\032\037irishub/" +
      "guardian/guardian.proto\032\034google/api/anno" +
      "tations.proto\032*cosmos/base/query/v1beta1" +
      "/pagination.proto\"\\\n\022QuerySupersRequest\022" +
      "F\n\npagination\030\001 \001(\0132&.cosmos.base.query." +
      "v1beta1.PageRequestR\npagination\"\225\001\n\023Quer" +
      "ySupersResponse\0225\n\006supers\030\001 \003(\0132\027.irishu" +
      "b.guardian.SuperB\004\310\336\037\000R\006supers\022G\n\npagina" +
      "tion\030\002 \001(\0132\'.cosmos.base.query.v1beta1.P" +
      "ageResponseR\npagination2\200\001\n\005Query\022w\n\006Sup" +
      "ers\022$.irishub.guardian.QuerySupersReques" +
      "t\032%.irishub.guardian.QuerySupersResponse" +
      "\" \202\323\344\223\002\032\022\030/irishub/guardian/supersB\266\001\n\024c" +
      "om.irishub.guardianB\nQueryProtoP\001Z1githu" +
      "b.com/irisnet/irishub/modules/guardian/t" +
      "ypes\242\002\003IGX\252\002\020Irishub.Guardian\312\002\020Irishub\\" +
      "Guardian\342\002\034Irishub\\Guardian\\GPBMetadata\352" +
      "\002\021Irishub::Guardianb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.irishub.guardian.GuardianProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
        });
    internal_static_irishub_guardian_QuerySupersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_irishub_guardian_QuerySupersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_irishub_guardian_QuerySupersRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_irishub_guardian_QuerySupersResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_irishub_guardian_QuerySupersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_irishub_guardian_QuerySupersResponse_descriptor,
        new java.lang.String[] { "Supers", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.irishub.guardian.GuardianProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
