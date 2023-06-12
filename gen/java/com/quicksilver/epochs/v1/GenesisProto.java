// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/epochs/v1/genesis.proto

package com.quicksilver.epochs.v1;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_epochs_v1_EpochInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_epochs_v1_EpochInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_epochs_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_epochs_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#quicksilver/epochs/v1/genesis.proto\022\025q" +
      "uicksilver.epochs.v1\032\024gogoproto/gogo.pro" +
      "to\032\036google/protobuf/duration.proto\032\037goog" +
      "le/protobuf/timestamp.proto\"\212\004\n\tEpochInf" +
      "o\022\036\n\nidentifier\030\001 \001(\tR\nidentifier\022X\n\nsta" +
      "rt_time\030\002 \001(\0132\032.google.protobuf.Timestam" +
      "pB\035\310\336\037\000\362\336\037\021yaml:\"start_time\"\220\337\037\001R\tstartT" +
      "ime\022h\n\010duration\030\003 \001(\0132\031.google.protobuf." +
      "DurationB1\310\336\037\000\352\336\037\022duration,omitempty\362\336\037\017" +
      "yaml:\"duration\"\230\337\037\001R\010duration\022#\n\rcurrent" +
      "_epoch\030\004 \001(\003R\014currentEpoch\022\200\001\n\030current_e" +
      "poch_start_time\030\005 \001(\0132\032.google.protobuf." +
      "TimestampB+\310\336\037\000\362\336\037\037yaml:\"current_epoch_s" +
      "tart_time\"\220\337\037\001R\025currentEpochStartTime\0224\n" +
      "\026epoch_counting_started\030\006 \001(\010R\024epochCoun" +
      "tingStarted\022;\n\032current_epoch_start_heigh" +
      "t\030\007 \001(\003R\027currentEpochStartHeight\"N\n\014Gene" +
      "sisState\022>\n\006epochs\030\001 \003(\0132 .quicksilver.e" +
      "pochs.v1.EpochInfoB\004\310\336\037\000R\006epochsB\326\001\n\031com" +
      ".quicksilver.epochs.v1B\014GenesisProtoP\001Z5" +
      "github.com/ingenuity-build/quicksilver/x" +
      "/epochs/types\242\002\003QEX\252\002\025Quicksilver.Epochs" +
      ".V1\312\002\025Quicksilver\\Epochs\\V1\342\002!Quicksilve" +
      "r\\Epochs\\V1\\GPBMetadata\352\002\027Quicksilver::E" +
      "pochs::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_quicksilver_epochs_v1_EpochInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_quicksilver_epochs_v1_EpochInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_epochs_v1_EpochInfo_descriptor,
        new java.lang.String[] { "Identifier", "StartTime", "Duration", "CurrentEpoch", "CurrentEpochStartTime", "EpochCountingStarted", "CurrentEpochStartHeight", });
    internal_static_quicksilver_epochs_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_quicksilver_epochs_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_epochs_v1_GenesisState_descriptor,
        new java.lang.String[] { "Epochs", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
