// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/oracle/v1/genesis.proto

package com.oracle.v1;

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
    internal_static_oracle_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_oracle_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034band/oracle/v1/genesis.proto\022\toracle.v" +
      "1\032\024gogoproto/gogo.proto\032\033band/oracle/v1/" +
      "oracle.proto\"\305\001\n\014GenesisState\022/\n\006params\030" +
      "\001 \001(\0132\021.oracle.v1.ParamsB\004\310\336\037\000R\006params\022>" +
      "\n\014data_sources\030\002 \003(\0132\025.oracle.v1.DataSou" +
      "rceB\004\310\336\037\000R\013dataSources\022D\n\016oracle_scripts" +
      "\030\003 \003(\0132\027.oracle.v1.OracleScriptB\004\310\336\037\000R\ro" +
      "racleScriptsB\223\001\n\rcom.oracle.v1B\014GenesisP" +
      "rotoP\001Z/github.com/bandprotocol/chain/v2" +
      "/x/oracle/types\242\002\003OXX\252\002\tOracle.V1\312\002\tOrac" +
      "le\\V1\342\002\025Oracle\\V1\\GPBMetadata\352\002\nOracle::" +
      "V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.oracle.v1.OracleProto.getDescriptor(),
        });
    internal_static_oracle_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_oracle_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_oracle_v1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "DataSources", "OracleScripts", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.oracle.v1.OracleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
