// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/ratelimit/ratelimit.proto

package com.stride.ratelimit;

public final class RatelimitProto {
  private RatelimitProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_ratelimit_Path_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_ratelimit_Path_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_ratelimit_Quota_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_ratelimit_Quota_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_ratelimit_Flow_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_ratelimit_Flow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_ratelimit_RateLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_ratelimit_RateLimit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n stride/ratelimit/ratelimit.proto\022\020stri" +
      "de.ratelimit\032\024gogoproto/gogo.proto\";\n\004Pa" +
      "th\022\024\n\005denom\030\001 \001(\tR\005denom\022\035\n\nchannel_id\030\002" +
      " \001(\tR\tchannelId\"\342\001\n\005Quota\022X\n\020max_percent" +
      "_send\030\001 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/c" +
      "osmos-sdk/types.IntR\016maxPercentSend\022X\n\020m" +
      "ax_percent_recv\030\002 \001(\tB.\310\336\037\000\332\336\037&github.co" +
      "m/cosmos/cosmos-sdk/types.IntR\016maxPercen" +
      "tRecv\022%\n\016duration_hours\030\003 \001(\004R\rdurationH" +
      "ours\"\355\001\n\004Flow\022F\n\006inflow\030\001 \001(\tB.\310\336\037\000\332\336\037&g" +
      "ithub.com/cosmos/cosmos-sdk/types.IntR\006i" +
      "nflow\022H\n\007outflow\030\002 \001(\tB.\310\336\037\000\332\336\037&github.c" +
      "om/cosmos/cosmos-sdk/types.IntR\007outflow\022" +
      "S\n\rchannel_value\030\003 \001(\tB.\310\336\037\000\332\336\037&github.c" +
      "om/cosmos/cosmos-sdk/types.IntR\014channelV" +
      "alue\"\222\001\n\tRateLimit\022*\n\004path\030\001 \001(\0132\026.strid" +
      "e.ratelimit.PathR\004path\022-\n\005quota\030\002 \001(\0132\027." +
      "stride.ratelimit.QuotaR\005quota\022*\n\004flow\030\003 " +
      "\001(\0132\026.stride.ratelimit.FlowR\004flow*9\n\017Pac" +
      "ketDirection\022\017\n\013PACKET_SEND\020\000\022\017\n\013PACKET_" +
      "RECV\020\001\032\004\210\243\036\000B\273\001\n\024com.stride.ratelimitB\016R" +
      "atelimitProtoP\001Z2github.com/Stride-Labs/" +
      "stride/v9/x/ratelimit/types\242\002\003SRX\252\002\020Stri" +
      "de.Ratelimit\312\002\020Stride\\Ratelimit\342\002\034Stride" +
      "\\Ratelimit\\GPBMetadata\352\002\021Stride::Ratelim" +
      "itb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_stride_ratelimit_Path_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stride_ratelimit_Path_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_ratelimit_Path_descriptor,
        new java.lang.String[] { "Denom", "ChannelId", });
    internal_static_stride_ratelimit_Quota_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stride_ratelimit_Quota_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_ratelimit_Quota_descriptor,
        new java.lang.String[] { "MaxPercentSend", "MaxPercentRecv", "DurationHours", });
    internal_static_stride_ratelimit_Flow_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_stride_ratelimit_Flow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_ratelimit_Flow_descriptor,
        new java.lang.String[] { "Inflow", "Outflow", "ChannelValue", });
    internal_static_stride_ratelimit_RateLimit_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_stride_ratelimit_RateLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_ratelimit_RateLimit_descriptor,
        new java.lang.String[] { "Path", "Quota", "Flow", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
