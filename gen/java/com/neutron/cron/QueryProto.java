// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/cron/query.proto

package com.neutron.cron;

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
    internal_static_neutron_cron_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_cron_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_neutron_cron_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_cron_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_neutron_cron_QueryGetScheduleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_cron_QueryGetScheduleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_neutron_cron_QueryGetScheduleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_cron_QueryGetScheduleResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_neutron_cron_QuerySchedulesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_cron_QuerySchedulesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_neutron_cron_QuerySchedulesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_cron_QuerySchedulesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030neutron/cron/query.proto\022\014neutron.cron" +
      "\032\024gogoproto/gogo.proto\032\034google/api/annot" +
      "ations.proto\032*cosmos/base/query/v1beta1/" +
      "pagination.proto\032\031neutron/cron/params.pr" +
      "oto\032\033neutron/cron/schedule.proto\"\024\n\022Quer" +
      "yParamsRequest\"I\n\023QueryParamsResponse\0222\n" +
      "\006params\030\001 \001(\0132\024.neutron.cron.ParamsB\004\310\336\037" +
      "\000R\006params\"-\n\027QueryGetScheduleRequest\022\022\n\004" +
      "name\030\001 \001(\tR\004name\"T\n\030QueryGetScheduleResp" +
      "onse\0228\n\010schedule\030\001 \001(\0132\026.neutron.cron.Sc" +
      "heduleB\004\310\336\037\000R\010schedule\"_\n\025QuerySchedules" +
      "Request\022F\n\npagination\030\001 \001(\0132&.cosmos.bas" +
      "e.query.v1beta1.PageRequestR\npagination\"" +
      "\235\001\n\026QuerySchedulesResponse\022:\n\tschedules\030" +
      "\001 \003(\0132\026.neutron.cron.ScheduleB\004\310\336\037\000R\tsch" +
      "edules\022G\n\npagination\030\002 \001(\0132\'.cosmos.base" +
      ".query.v1beta1.PageResponseR\npagination2" +
      "\357\002\n\005Query\022k\n\006Params\022 .neutron.cron.Query" +
      "ParamsRequest\032!.neutron.cron.QueryParams" +
      "Response\"\034\202\323\344\223\002\026\022\024/neutron/cron/params\022\200" +
      "\001\n\010Schedule\022%.neutron.cron.QueryGetSched" +
      "uleRequest\032&.neutron.cron.QueryGetSchedu" +
      "leResponse\"%\202\323\344\223\002\037\022\035/neutron/cron/schedu" +
      "le/{name}\022v\n\tSchedules\022#.neutron.cron.Qu" +
      "erySchedulesRequest\032$.neutron.cron.Query" +
      "SchedulesResponse\"\036\202\323\344\223\002\030\022\026/neutron/cron" +
      "/scheduleB\234\001\n\020com.neutron.cronB\nQueryPro" +
      "toP\001Z+github.com/neutron-org/neutron/x/c" +
      "ron/types\242\002\003NCX\252\002\014Neutron.Cron\312\002\014Neutron" +
      "\\Cron\342\002\030Neutron\\Cron\\GPBMetadata\352\002\rNeutr" +
      "on::Cronb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.neutron.cron.ParamsProto.getDescriptor(),
          com.neutron.cron.ScheduleProto.getDescriptor(),
        });
    internal_static_neutron_cron_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_neutron_cron_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_cron_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_neutron_cron_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_neutron_cron_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_cron_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_neutron_cron_QueryGetScheduleRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_neutron_cron_QueryGetScheduleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_cron_QueryGetScheduleRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_neutron_cron_QueryGetScheduleResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_neutron_cron_QueryGetScheduleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_cron_QueryGetScheduleResponse_descriptor,
        new java.lang.String[] { "Schedule", });
    internal_static_neutron_cron_QuerySchedulesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_neutron_cron_QuerySchedulesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_cron_QuerySchedulesRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_neutron_cron_QuerySchedulesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_neutron_cron_QuerySchedulesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_cron_QuerySchedulesResponse_descriptor,
        new java.lang.String[] { "Schedules", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.neutron.cron.ParamsProto.getDescriptor();
    com.neutron.cron.ScheduleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
