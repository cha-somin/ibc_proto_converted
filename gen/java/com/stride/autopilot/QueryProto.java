// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/autopilot/query.proto

package com.stride.autopilot;

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
    internal_static_stride_autopilot_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_autopilot_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_autopilot_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_autopilot_QueryParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034stride/autopilot/query.proto\022\020stride.a" +
      "utopilot\032\024gogoproto/gogo.proto\032\034google/a" +
      "pi/annotations.proto\032\035stride/autopilot/p" +
      "arams.proto\"\024\n\022QueryParamsRequest\"M\n\023Que" +
      "ryParamsResponse\0226\n\006params\030\001 \001(\0132\030.strid" +
      "e.autopilot.ParamsB\004\310\336\037\000R\006params2\215\001\n\005Que" +
      "ry\022\203\001\n\006Params\022$.stride.autopilot.QueryPa" +
      "ramsRequest\032%.stride.autopilot.QueryPara" +
      "msResponse\",\202\323\344\223\002&\022$/Stride-Labs/stride/" +
      "autopilot/paramsB\267\001\n\024com.stride.autopilo" +
      "tB\nQueryProtoP\001Z2github.com/Stride-Labs/" +
      "stride/v9/x/autopilot/types\242\002\003SAX\252\002\020Stri" +
      "de.Autopilot\312\002\020Stride\\Autopilot\342\002\034Stride" +
      "\\Autopilot\\GPBMetadata\352\002\021Stride::Autopil" +
      "otb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.stride.autopilot.ParamsProto.getDescriptor(),
        });
    internal_static_stride_autopilot_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stride_autopilot_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_autopilot_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_stride_autopilot_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stride_autopilot_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_autopilot_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.stride.autopilot.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
