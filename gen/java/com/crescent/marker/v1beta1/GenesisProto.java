// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/marker/v1beta1/genesis.proto

package com.crescent.marker.v1beta1;

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
    internal_static_crescent_marker_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_marker_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%crescent/marker/v1beta1/genesis.proto\022" +
      "\027crescent.marker.v1beta1\032\024gogoproto/gogo" +
      ".proto\032\037google/protobuf/timestamp.proto\032" +
      "$crescent/marker/v1beta1/marker.proto\"\227\001" +
      "\n\014GenesisState\022=\n\006params\030\001 \001(\0132\037.crescen" +
      "t.marker.v1beta1.ParamsB\004\310\336\037\000R\006params\022H\n" +
      "\017last_block_time\030\002 \001(\0132\032.google.protobuf" +
      ".TimestampB\004\220\337\037\001R\rlastBlockTimeB\345\001\n\033com." +
      "crescent.marker.v1beta1B\014GenesisProtoP\001Z" +
      "6github.com/crescent-network/crescent/v5" +
      "/x/marker/types\242\002\003CMX\252\002\027Crescent.Marker." +
      "V1beta1\312\002\027Crescent\\Marker\\V1beta1\342\002#Cres" +
      "cent\\Marker\\V1beta1\\GPBMetadata\352\002\031Cresce" +
      "nt::Marker::V1beta1\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.crescent.marker.v1beta1.MarkerProto.getDescriptor(),
        });
    internal_static_crescent_marker_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_crescent_marker_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_marker_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "LastBlockTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.crescent.marker.v1beta1.MarkerProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
