// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/node/v2/events.proto

package com.sentinel.node.v2;

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
    internal_static_sentinel_node_v2_EventRegister_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_node_v2_EventRegister_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_node_v2_EventUpdateDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_node_v2_EventUpdateDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_node_v2_EventUpdateStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_node_v2_EventUpdateStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_node_v2_EventCreateSubscription_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_node_v2_EventCreateSubscription_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035sentinel/node/v2/events.proto\022\020sentine" +
      "l.node.v2\032\024gogoproto/gogo.proto\032\036sentine" +
      "l/types/v1/status.proto\"=\n\rEventRegister" +
      "\022,\n\007address\030\001 \001(\tB\022\362\336\037\016yaml:\"address\"R\007a" +
      "ddress\"B\n\022EventUpdateDetails\022,\n\007address\030" +
      "\001 \001(\tB\022\362\336\037\016yaml:\"address\"R\007address\"\207\001\n\021E" +
      "ventUpdateStatus\022,\n\007address\030\001 \001(\tB\022\362\336\037\016y" +
      "aml:\"address\"R\007address\022D\n\006status\030\002 \001(\0162\031" +
      ".sentinel.types.v1.StatusB\021\362\336\037\ryaml:\"sta" +
      "tus\"R\006status\"z\n\027EventCreateSubscription\022" +
      "#\n\002id\030\001 \001(\004B\023\342\336\037\002ID\362\336\037\tyaml:\"id\"R\002id\022:\n\014" +
      "node_address\030\002 \001(\tB\027\362\336\037\023yaml:\"node_addre" +
      "ss\"R\013nodeAddressB\274\001\n\024com.sentinel.node.v" +
      "2B\013EventsProtoP\001Z-github.com/sentinel-of" +
      "ficial/hub/x/node/types\242\002\003SNX\252\002\020Sentinel" +
      ".Node.V2\312\002\020Sentinel\\Node\\V2\342\002\034Sentinel\\N" +
      "ode\\V2\\GPBMetadata\352\002\022Sentinel::Node::V2\310" +
      "\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.sentinel.types.v1.StatusProto.getDescriptor(),
        });
    internal_static_sentinel_node_v2_EventRegister_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_node_v2_EventRegister_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_node_v2_EventRegister_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_sentinel_node_v2_EventUpdateDetails_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sentinel_node_v2_EventUpdateDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_node_v2_EventUpdateDetails_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_sentinel_node_v2_EventUpdateStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sentinel_node_v2_EventUpdateStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_node_v2_EventUpdateStatus_descriptor,
        new java.lang.String[] { "Address", "Status", });
    internal_static_sentinel_node_v2_EventCreateSubscription_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sentinel_node_v2_EventCreateSubscription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_node_v2_EventCreateSubscription_descriptor,
        new java.lang.String[] { "Id", "NodeAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.sentinel.types.v1.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
