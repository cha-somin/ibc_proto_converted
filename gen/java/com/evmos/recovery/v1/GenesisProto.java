// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/recovery/v1/genesis.proto

package com.evmos.recovery.v1;

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
    internal_static_evmos_recovery_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_recovery_v1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_recovery_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_recovery_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037evmos/recovery/v1/genesis.proto\022\021evmos" +
      ".recovery.v1\032\024gogoproto/gogo.proto\032\036goog" +
      "le/protobuf/duration.proto\"G\n\014GenesisSta" +
      "te\0227\n\006params\030\001 \001(\0132\031.evmos.recovery.v1.P" +
      "aramsB\004\310\336\037\000R\006params\"\216\001\n\006Params\022\'\n\017enable" +
      "_recovery\030\001 \001(\010R\016enableRecovery\022[\n\027packe" +
      "t_timeout_duration\030\002 \001(\0132\031.google.protob" +
      "uf.DurationB\010\310\336\037\000\230\337\037\001R\025packetTimeoutDura" +
      "tionB\270\001\n\025com.evmos.recovery.v1B\014GenesisP" +
      "rotoP\001Z+github.com/evmos/evmos/v13/x/rec" +
      "overy/types\242\002\003ERX\252\002\021Evmos.Recovery.V1\312\002\021" +
      "Evmos\\Recovery\\V1\342\002\035Evmos\\Recovery\\V1\\GP" +
      "BMetadata\352\002\023Evmos::Recovery::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_evmos_recovery_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_evmos_recovery_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_recovery_v1_GenesisState_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_evmos_recovery_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_evmos_recovery_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_recovery_v1_Params_descriptor,
        new java.lang.String[] { "EnableRecovery", "PacketTimeoutDuration", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
