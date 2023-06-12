// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/reports/v1/models.proto

package com.desmos.reports.v1;

public final class ModelsProto {
  private ModelsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_Report_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_Report_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_UserTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_UserTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_PostTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_PostTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_Reason_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_Reason_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_StandardReason_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_StandardReason_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036desmos/reports/v1/models.proto\022\021desmos" +
      ".reports.v1\032\024gogoproto/gogo.proto\032\031googl" +
      "e/protobuf/any.proto\032\037google/protobuf/ti" +
      "mestamp.proto\032\031cosmos_proto/cosmos.proto" +
      "\"\352\003\n\006Report\022E\n\013subspace_id\030\001 \001(\004B$\342\336\037\nSu" +
      "bspaceID\362\336\037\022yaml:\"subspace_id\"R\nsubspace" +
      "Id\022#\n\002id\030\002 \001(\004B\023\342\336\037\002ID\362\336\037\tyaml:\"id\"R\002id\022" +
      "E\n\013reasons_ids\030\003 \003(\rB$\342\336\037\nReasonsIDs\362\336\037\022" +
      "yaml:\"reasons_ids\"R\nreasonsIds\022,\n\007messag" +
      "e\030\004 \001(\tB\022\362\336\037\016yaml:\"message\"R\007message\022/\n\010" +
      "reporter\030\005 \001(\tB\023\362\336\037\017yaml:\"reporter\"R\010rep" +
      "orter\022a\n\006target\030\006 \001(\0132\024.google.protobuf." +
      "AnyB3\362\336\037\ryaml:\"target\"\312\264-\036desmos.reports" +
      ".v1.ReportTargetR\006target\022a\n\rcreation_dat" +
      "e\030\007 \001(\0132\032.google.protobuf.TimestampB \310\336\037" +
      "\000\362\336\037\024yaml:\"creation_date\"\220\337\037\001R\014creationD" +
      "ate:\010\230\240\037\001\350\240\037\001\"]\n\nUserTarget\022#\n\004user\030\001 \001(" +
      "\tB\017\362\336\037\013yaml:\"user\"R\004user:*\230\240\037\001\350\240\037\001\312\264-\036de" +
      "smos.reports.v1.ReportTarget\"o\n\nPostTarg" +
      "et\0225\n\007post_id\030\001 \001(\004B\034\342\336\037\006PostID\362\336\037\016yaml:" +
      "\"post_id\"R\006postId:*\230\240\037\001\350\240\037\001\312\264-\036desmos.re" +
      "ports.v1.ReportTarget\"\340\001\n\006Reason\022E\n\013subs" +
      "pace_id\030\001 \001(\004B$\342\336\037\nSubspaceID\362\336\037\022yaml:\"s" +
      "ubspace_id\"R\nsubspaceId\022#\n\002id\030\002 \001(\rB\023\342\336\037" +
      "\002ID\362\336\037\tyaml:\"id\"R\002id\022&\n\005title\030\003 \001(\tB\020\362\336\037" +
      "\014yaml:\"title\"R\005title\0228\n\013description\030\004 \001(" +
      "\tB\026\362\336\037\022yaml:\"description\"R\013description:\010" +
      "\230\240\037\001\350\240\037\001\"\201\001\n\006Params\022m\n\020standard_reasons\030" +
      "\001 \003(\0132!.desmos.reports.v1.StandardReason" +
      "B\037\310\336\037\000\362\336\037\027yaml:\"standard_reasons\"R\017stand" +
      "ardReasons:\010\230\240\037\001\350\240\037\001\"\241\001\n\016StandardReason\022" +
      "#\n\002id\030\001 \001(\rB\023\342\336\037\002ID\362\336\037\tyaml:\"id\"R\002id\022&\n\005" +
      "title\030\002 \001(\tB\020\362\336\037\014yaml:\"title\"R\005title\0228\n\013" +
      "description\030\003 \001(\tB\026\362\336\037\022yaml:\"description" +
      "\"R\013description:\010\230\240\037\001\350\240\037\001B\274\001\n\025com.desmos." +
      "reports.v1B\013ModelsProtoP\001Z0github.com/de" +
      "smos-labs/desmos/v5/x/reports/types\242\002\003DR" +
      "X\252\002\021Desmos.Reports.V1\312\002\021Desmos\\Reports\\V" +
      "1\342\002\035Desmos\\Reports\\V1\\GPBMetadata\352\002\023Desm" +
      "os::Reports::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_desmos_reports_v1_Report_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_desmos_reports_v1_Report_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_Report_descriptor,
        new java.lang.String[] { "SubspaceId", "Id", "ReasonsIds", "Message", "Reporter", "Target", "CreationDate", });
    internal_static_desmos_reports_v1_UserTarget_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_desmos_reports_v1_UserTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_UserTarget_descriptor,
        new java.lang.String[] { "User", });
    internal_static_desmos_reports_v1_PostTarget_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_desmos_reports_v1_PostTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_PostTarget_descriptor,
        new java.lang.String[] { "PostId", });
    internal_static_desmos_reports_v1_Reason_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_desmos_reports_v1_Reason_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_Reason_descriptor,
        new java.lang.String[] { "SubspaceId", "Id", "Title", "Description", });
    internal_static_desmos_reports_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_desmos_reports_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_Params_descriptor,
        new java.lang.String[] { "StandardReasons", });
    internal_static_desmos_reports_v1_StandardReason_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_desmos_reports_v1_StandardReason_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_StandardReason_descriptor,
        new java.lang.String[] { "Id", "Title", "Description", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.equal);
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
