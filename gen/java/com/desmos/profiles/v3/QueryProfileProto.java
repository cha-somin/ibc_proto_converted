// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/query_profile.proto

package com.desmos.profiles.v3;

public final class QueryProfileProto {
  private QueryProfileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_profiles_v3_QueryProfileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_profiles_v3_QueryProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_profiles_v3_QueryProfileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_profiles_v3_QueryProfileResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&desmos/profiles/v3/query_profile.proto" +
      "\022\022desmos.profiles.v3\032\024gogoproto/gogo.pro" +
      "to\032\031google/protobuf/any.proto\032\031cosmos_pr" +
      "oto/cosmos.proto\"3\n\023QueryProfileRequest\022" +
      "\022\n\004user\030\001 \001(\tR\004user:\010\210\240\037\000\350\240\037\000\"h\n\024QueryPr" +
      "ofileResponse\022P\n\007profile\030\001 \001(\0132\024.google." +
      "protobuf.AnyB \312\264-\034cosmos.auth.v1beta1.Ac" +
      "countIR\007profileB\310\001\n\026com.desmos.profiles." +
      "v3B\021QueryProfileProtoP\001Z1github.com/desm" +
      "os-labs/desmos/v5/x/profiles/types\242\002\003DPX" +
      "\252\002\022Desmos.Profiles.V3\312\002\022Desmos\\Profiles\\" +
      "V3\342\002\036Desmos\\Profiles\\V3\\GPBMetadata\352\002\024De" +
      "smos::Profiles::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_desmos_profiles_v3_QueryProfileRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_desmos_profiles_v3_QueryProfileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_profiles_v3_QueryProfileRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_desmos_profiles_v3_QueryProfileResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_desmos_profiles_v3_QueryProfileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_profiles_v3_QueryProfileResponse_descriptor,
        new java.lang.String[] { "Profile", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
