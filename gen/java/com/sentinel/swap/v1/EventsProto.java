// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/swap/v1/events.proto

package com.sentinel.swap.v1;

public final class EventsProto {
  private EventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_swap_v1_EventSwap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_swap_v1_EventSwap_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035sentinel/swap/v1/events.proto\022\020sentine" +
      "l.swap.v1\032\024gogoproto/gogo.proto\"i\n\tEvent" +
      "Swap\022+\n\007tx_hash\030\001 \001(\014B\022\362\336\037\016yaml:\"tx_hash" +
      "\"R\006txHash\022/\n\010receiver\030\002 \001(\tB\023\362\336\037\017yaml:\"r" +
      "eceiver\"R\010receiverB\274\001\n\024com.sentinel.swap" +
      ".v1B\013EventsProtoP\001Z-github.com/sentinel-" +
      "official/hub/x/swap/types\242\002\003SSX\252\002\020Sentin" +
      "el.Swap.V1\312\002\020Sentinel\\Swap\\V1\342\002\034Sentinel" +
      "\\Swap\\V1\\GPBMetadata\352\002\022Sentinel::Swap::V" +
      "1\310\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_sentinel_swap_v1_EventSwap_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_swap_v1_EventSwap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_swap_v1_EventSwap_descriptor,
        new java.lang.String[] { "TxHash", "Receiver", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
