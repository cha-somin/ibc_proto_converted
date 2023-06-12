// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/models_profile.proto

package com.desmos.profiles.v3;

public final class ModelsProfileProto {
  private ModelsProfileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_profiles_v3_Profile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_profiles_v3_Profile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_profiles_v3_Pictures_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_profiles_v3_Pictures_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'desmos/profiles/v3/models_profile.prot" +
      "o\022\022desmos.profiles.v3\032\024gogoproto/gogo.pr" +
      "oto\032\031google/protobuf/any.proto\032\037google/p" +
      "rotobuf/timestamp.proto\032\031cosmos_proto/co" +
      "smos.proto\"\233\003\n\007Profile\022P\n\007account\030\001 \001(\0132" +
      "\024.google.protobuf.AnyB \312\264-\034cosmos.auth.v" +
      "1beta1.AccountIR\007account\022+\n\004dtag\030\002 \001(\tB\027" +
      "\342\336\037\004DTag\362\336\037\013yaml:\"dtag\"R\004dtag\022/\n\010nicknam" +
      "e\030\003 \001(\tB\023\362\336\037\017yaml:\"nickname\"R\010nickname\022 " +
      "\n\003bio\030\004 \001(\tB\016\362\336\037\nyaml:\"bio\"R\003bio\022Q\n\010pict" +
      "ures\030\005 \001(\0132\034.desmos.profiles.v3.Pictures" +
      "B\027\310\336\037\000\362\336\037\017yaml:\"pictures\"R\010pictures\022a\n\rc" +
      "reation_date\030\006 \001(\0132\032.google.protobuf.Tim" +
      "estampB \310\336\037\000\362\336\037\024yaml:\"creation_date\"\220\337\037\001" +
      "R\014creationDate:\010\210\240\037\000\230\240\037\000\"j\n\010Pictures\022,\n\007" +
      "profile\030\001 \001(\tB\022\362\336\037\016yaml:\"profile\"R\007profi" +
      "le\022&\n\005cover\030\002 \001(\tB\020\362\336\037\014yaml:\"cover\"R\005cov" +
      "er:\010\230\240\037\001\350\240\037\001B\311\001\n\026com.desmos.profiles.v3B" +
      "\022ModelsProfileProtoP\001Z1github.com/desmos" +
      "-labs/desmos/v5/x/profiles/types\242\002\003DPX\252\002" +
      "\022Desmos.Profiles.V3\312\002\022Desmos\\Profiles\\V3" +
      "\342\002\036Desmos\\Profiles\\V3\\GPBMetadata\352\002\024Desm" +
      "os::Profiles::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_desmos_profiles_v3_Profile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_desmos_profiles_v3_Profile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_profiles_v3_Profile_descriptor,
        new java.lang.String[] { "Account", "Dtag", "Nickname", "Bio", "Pictures", "CreationDate", });
    internal_static_desmos_profiles_v3_Pictures_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_desmos_profiles_v3_Pictures_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_profiles_v3_Pictures_descriptor,
        new java.lang.String[] { "Profile", "Cover", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
