// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/data/v1alpha2/genesis.proto

package com.regen.data.v1alpha2;

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
    internal_static_regen_data_v1alpha2_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_data_v1alpha2_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_regen_data_v1alpha2_GenesisContentEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_data_v1alpha2_GenesisContentEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!regen/data/v1alpha2/genesis.proto\022\023reg" +
      "en.data.v1alpha2\032\037regen/data/v1alpha2/ty" +
      "pes.proto\032\037google/protobuf/timestamp.pro" +
      "to\"R\n\014GenesisState\022B\n\007entries\030\001 \003(\0132(.re" +
      "gen.data.v1alpha2.GenesisContentEntryR\007e" +
      "ntries\"\301\001\n\023GenesisContentEntry\0224\n\004hash\030\001" +
      " \001(\0132 .regen.data.v1alpha2.ContentHashR\004" +
      "hash\0228\n\ttimestamp\030\002 \001(\0132\032.google.protobu" +
      "f.TimestampR\ttimestamp\022:\n\007signers\030\003 \003(\0132" +
      " .regen.data.v1alpha2.SignerEntryR\007signe" +
      "rsB\303\001\n\027com.regen.data.v1alpha2B\014GenesisP" +
      "rotoP\001Z,github.com/regen-network/regen-l" +
      "edger/x/data\242\002\003RDX\252\002\023Regen.Data.V1alpha2" +
      "\312\002\023Regen\\Data\\V1alpha2\342\002\037Regen\\Data\\V1al" +
      "pha2\\GPBMetadata\352\002\025Regen::Data::V1alpha2" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.regen.data.v1alpha2.TypesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_regen_data_v1alpha2_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_regen_data_v1alpha2_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_data_v1alpha2_GenesisState_descriptor,
        new java.lang.String[] { "Entries", });
    internal_static_regen_data_v1alpha2_GenesisContentEntry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_regen_data_v1alpha2_GenesisContentEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_data_v1alpha2_GenesisContentEntry_descriptor,
        new java.lang.String[] { "Hash", "Timestamp", "Signers", });
    com.regen.data.v1alpha2.TypesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
