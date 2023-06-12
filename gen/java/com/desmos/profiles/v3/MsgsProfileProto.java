// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/msgs_profile.proto

package com.desmos.profiles.v3;

public final class MsgsProfileProto {
  private MsgsProfileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_profiles_v3_MsgSaveProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_profiles_v3_MsgSaveProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_profiles_v3_MsgSaveProfileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_profiles_v3_MsgSaveProfileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_profiles_v3_MsgDeleteProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_profiles_v3_MsgDeleteProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_profiles_v3_MsgDeleteProfileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_profiles_v3_MsgDeleteProfileResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%desmos/profiles/v3/msgs_profile.proto\022" +
      "\022desmos.profiles.v3\032\024gogoproto/gogo.prot" +
      "o\"\302\002\n\016MsgSaveProfile\022+\n\004dtag\030\001 \001(\tB\027\342\336\037\004" +
      "DTag\362\336\037\013yaml:\"dtag\"R\004dtag\022/\n\010nickname\030\002 " +
      "\001(\tB\023\362\336\037\017yaml:\"nickname\"R\010nickname\022 \n\003bi" +
      "o\030\003 \001(\tB\016\362\336\037\nyaml:\"bio\"R\003bio\022C\n\017profile_" +
      "picture\030\004 \001(\tB\032\362\336\037\026yaml:\"profile_picture" +
      "\"R\016profilePicture\022=\n\rcover_picture\030\005 \001(\t" +
      "B\030\362\336\037\024yaml:\"cover_picture\"R\014coverPicture" +
      "\022,\n\007creator\030\006 \001(\tB\022\362\336\037\016yaml:\"creator\"R\007c" +
      "reator\"\030\n\026MsgSaveProfileResponse\"@\n\020MsgD" +
      "eleteProfile\022,\n\007creator\030\001 \001(\tB\022\362\336\037\016yaml:" +
      "\"creator\"R\007creator\"\032\n\030MsgDeleteProfileRe" +
      "sponseB\307\001\n\026com.desmos.profiles.v3B\020MsgsP" +
      "rofileProtoP\001Z1github.com/desmos-labs/de" +
      "smos/v5/x/profiles/types\242\002\003DPX\252\002\022Desmos." +
      "Profiles.V3\312\002\022Desmos\\Profiles\\V3\342\002\036Desmo" +
      "s\\Profiles\\V3\\GPBMetadata\352\002\024Desmos::Prof" +
      "iles::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_desmos_profiles_v3_MsgSaveProfile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_desmos_profiles_v3_MsgSaveProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_profiles_v3_MsgSaveProfile_descriptor,
        new java.lang.String[] { "Dtag", "Nickname", "Bio", "ProfilePicture", "CoverPicture", "Creator", });
    internal_static_desmos_profiles_v3_MsgSaveProfileResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_desmos_profiles_v3_MsgSaveProfileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_profiles_v3_MsgSaveProfileResponse_descriptor,
        new java.lang.String[] { });
    internal_static_desmos_profiles_v3_MsgDeleteProfile_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_desmos_profiles_v3_MsgDeleteProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_profiles_v3_MsgDeleteProfile_descriptor,
        new java.lang.String[] { "Creator", });
    internal_static_desmos_profiles_v3_MsgDeleteProfileResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_desmos_profiles_v3_MsgDeleteProfileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_profiles_v3_MsgDeleteProfileResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
