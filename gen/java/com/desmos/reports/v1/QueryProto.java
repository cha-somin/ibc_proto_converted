// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/reports/v1/query.proto

package com.desmos.reports.v1;

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
    internal_static_desmos_reports_v1_QueryReportsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_QueryReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_QueryReportsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_QueryReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_QueryReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_QueryReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_QueryReportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_QueryReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_QueryReasonsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_QueryReasonsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_QueryReasonsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_QueryReasonsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_QueryReasonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_QueryReasonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_QueryReasonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_QueryReasonResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_reports_v1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_reports_v1_QueryParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035desmos/reports/v1/query.proto\022\021desmos." +
      "reports.v1\032\024gogoproto/gogo.proto\032\034google" +
      "/api/annotations.proto\032\031google/protobuf/" +
      "any.proto\032\031cosmos_proto/cosmos.proto\032*co" +
      "smos/base/query/v1beta1/pagination.proto" +
      "\032\036desmos/reports/v1/models.proto\"\301\002\n\023Que" +
      "ryReportsRequest\0227\n\013subspace_id\030\001 \001(\004B\026\362" +
      "\336\037\022yaml:\"subspace_id\"R\nsubspaceId\022a\n\006tar" +
      "get\030\002 \001(\0132\024.google.protobuf.AnyB3\362\336\037\ryam" +
      "l:\"target\"\312\264-\036desmos.reports.v1.ReportTa" +
      "rgetR\006target\022/\n\010reporter\030\003 \001(\tB\023\362\336\037\017yaml" +
      ":\"reporter\"R\010reporter\022]\n\npagination\030\004 \001(" +
      "\0132&.cosmos.base.query.v1beta1.PageReques" +
      "tB\025\362\336\037\021yaml:\"pagination\"R\npagination\"\303\001\n" +
      "\024QueryReportsResponse\022K\n\007reports\030\001 \003(\0132\031" +
      ".desmos.reports.v1.ReportB\026\310\336\037\000\362\336\037\016yaml:" +
      "\"reports\"R\007reports\022^\n\npagination\030\002 \001(\0132\'" +
      ".cosmos.base.query.v1beta1.PageResponseB" +
      "\025\362\336\037\021yaml:\"pagination\"R\npagination\"\200\001\n\022Q" +
      "ueryReportRequest\0227\n\013subspace_id\030\001 \001(\004B\026" +
      "\362\336\037\022yaml:\"subspace_id\"R\nsubspaceId\0221\n\tre" +
      "port_id\030\002 \001(\004B\024\362\336\037\020yaml:\"report_id\"R\010rep" +
      "ortId\"_\n\023QueryReportResponse\022H\n\006report\030\001" +
      " \001(\0132\031.desmos.reports.v1.ReportB\025\310\336\037\000\362\336\037" +
      "\ryaml:\"report\"R\006report\"\255\001\n\023QueryReasonsR" +
      "equest\0227\n\013subspace_id\030\001 \001(\004B\026\362\336\037\022yaml:\"s" +
      "ubspace_id\"R\nsubspaceId\022]\n\npagination\030\003 " +
      "\001(\0132&.cosmos.base.query.v1beta1.PageRequ" +
      "estB\025\362\336\037\021yaml:\"pagination\"R\npagination\"\303" +
      "\001\n\024QueryReasonsResponse\022K\n\007reasons\030\001 \003(\013" +
      "2\031.desmos.reports.v1.ReasonB\026\310\336\037\000\362\336\037\016yam" +
      "l:\"reasons\"R\007reasons\022^\n\npagination\030\002 \001(\013" +
      "2\'.cosmos.base.query.v1beta1.PageRespons" +
      "eB\025\362\336\037\021yaml:\"pagination\"R\npagination\"\200\001\n" +
      "\022QueryReasonRequest\0227\n\013subspace_id\030\001 \001(\004" +
      "B\026\362\336\037\022yaml:\"subspace_id\"R\nsubspaceId\0221\n\t" +
      "reason_id\030\002 \001(\rB\024\362\336\037\020yaml:\"reason_id\"R\010r" +
      "easonId\"_\n\023QueryReasonResponse\022H\n\006reason" +
      "\030\001 \001(\0132\031.desmos.reports.v1.ReasonB\025\310\336\037\000\362" +
      "\336\037\ryaml:\"reason\"R\006reason\"\024\n\022QueryParamsR" +
      "equest\"_\n\023QueryParamsResponse\022H\n\006params\030" +
      "\001 \001(\0132\031.desmos.reports.v1.ParamsB\025\310\336\037\000\362\336" +
      "\037\ryaml:\"params\"R\006params2\371\005\n\005Query\022\226\001\n\007Re" +
      "ports\022&.desmos.reports.v1.QueryReportsRe" +
      "quest\032\'.desmos.reports.v1.QueryReportsRe" +
      "sponse\":\202\323\344\223\0024\0222/desmos/reports/v1/subsp" +
      "aces/{subspace_id}/reports\022\237\001\n\006Report\022%." +
      "desmos.reports.v1.QueryReportRequest\032&.d" +
      "esmos.reports.v1.QueryReportResponse\"F\202\323" +
      "\344\223\002@\022>/desmos/reports/v1/subspaces/{subs" +
      "pace_id}/reports/{report_id}\022\226\001\n\007Reasons" +
      "\022&.desmos.reports.v1.QueryReasonsRequest" +
      "\032\'.desmos.reports.v1.QueryReasonsRespons" +
      "e\":\202\323\344\223\0024\0222/desmos/reports/v1/subspaces/" +
      "{subspace_id}/reasons\022\237\001\n\006Reason\022%.desmo" +
      "s.reports.v1.QueryReasonRequest\032&.desmos" +
      ".reports.v1.QueryReasonResponse\"F\202\323\344\223\002@\022" +
      ">/desmos/reports/v1/subspaces/{subspace_" +
      "id}/reasons/{reason_id}\022z\n\006Params\022%.desm" +
      "os.reports.v1.QueryParamsRequest\032&.desmo" +
      "s.reports.v1.QueryParamsResponse\"!\202\323\344\223\002\033" +
      "\022\031/desmos/reports/v1/paramsB\273\001\n\025com.desm" +
      "os.reports.v1B\nQueryProtoP\001Z0github.com/" +
      "desmos-labs/desmos/v5/x/reports/types\242\002\003" +
      "DRX\252\002\021Desmos.Reports.V1\312\002\021Desmos\\Reports" +
      "\\V1\342\002\035Desmos\\Reports\\V1\\GPBMetadata\352\002\023De" +
      "smos::Reports::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.desmos.reports.v1.ModelsProto.getDescriptor(),
        });
    internal_static_desmos_reports_v1_QueryReportsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_desmos_reports_v1_QueryReportsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_QueryReportsRequest_descriptor,
        new java.lang.String[] { "SubspaceId", "Target", "Reporter", "Pagination", });
    internal_static_desmos_reports_v1_QueryReportsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_desmos_reports_v1_QueryReportsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_QueryReportsResponse_descriptor,
        new java.lang.String[] { "Reports", "Pagination", });
    internal_static_desmos_reports_v1_QueryReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_desmos_reports_v1_QueryReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_QueryReportRequest_descriptor,
        new java.lang.String[] { "SubspaceId", "ReportId", });
    internal_static_desmos_reports_v1_QueryReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_desmos_reports_v1_QueryReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_QueryReportResponse_descriptor,
        new java.lang.String[] { "Report", });
    internal_static_desmos_reports_v1_QueryReasonsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_desmos_reports_v1_QueryReasonsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_QueryReasonsRequest_descriptor,
        new java.lang.String[] { "SubspaceId", "Pagination", });
    internal_static_desmos_reports_v1_QueryReasonsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_desmos_reports_v1_QueryReasonsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_QueryReasonsResponse_descriptor,
        new java.lang.String[] { "Reasons", "Pagination", });
    internal_static_desmos_reports_v1_QueryReasonRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_desmos_reports_v1_QueryReasonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_QueryReasonRequest_descriptor,
        new java.lang.String[] { "SubspaceId", "ReasonId", });
    internal_static_desmos_reports_v1_QueryReasonResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_desmos_reports_v1_QueryReasonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_QueryReasonResponse_descriptor,
        new java.lang.String[] { "Reason", });
    internal_static_desmos_reports_v1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_desmos_reports_v1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_desmos_reports_v1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_desmos_reports_v1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_reports_v1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.desmos.reports.v1.ModelsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
