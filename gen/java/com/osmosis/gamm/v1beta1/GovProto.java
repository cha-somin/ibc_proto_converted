// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/gamm/v1beta1/gov.proto

package com.osmosis.gamm.v1beta1;

public final class GovProto {
  private GovProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_gamm_v1beta1_ReplaceMigrationRecordsProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_gamm_v1beta1_ReplaceMigrationRecordsProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_gamm_v1beta1_UpdateMigrationRecordsProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_gamm_v1beta1_UpdateMigrationRecordsProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036osmosis/gamm/v1beta1/gov.proto\022\024osmosi" +
      "s.gamm.v1beta1\032\024gogoproto/gogo.proto\032\"os" +
      "mosis/gamm/v1beta1/genesis.proto\032\031cosmos" +
      "_proto/cosmos.proto\032\021amino/amino.proto\"\207" +
      "\002\n\037ReplaceMigrationRecordsProposal\022\024\n\005ti" +
      "tle\030\001 \001(\tR\005title\022 \n\013description\030\002 \001(\tR\013d" +
      "escription\022T\n\007records\030\003 \003(\01324.osmosis.ga" +
      "mm.v1beta1.BalancerToConcentratedPoolLin" +
      "kB\004\310\336\037\000R\007records:V\210\240\037\000\230\240\037\000\350\240\037\001\312\264-\032cosmos" +
      ".gov.v1beta1.Content\212\347\260*\'osmosis/Replace" +
      "MigrationRecordsProposal\"\205\002\n\036UpdateMigra" +
      "tionRecordsProposal\022\024\n\005title\030\001 \001(\tR\005titl" +
      "e\022 \n\013description\030\002 \001(\tR\013description\022T\n\007r" +
      "ecords\030\003 \003(\01324.osmosis.gamm.v1beta1.Bala" +
      "ncerToConcentratedPoolLinkB\004\310\336\037\000R\007record" +
      "s:U\210\240\037\000\230\240\037\000\350\240\037\001\312\264-\032cosmos.gov.v1beta1.Co" +
      "ntent\212\347\260*&osmosis/UpdateMigrationRecords" +
      "ProposalB\310\001\n\030com.osmosis.gamm.v1beta1B\010G" +
      "ovProtoP\001Z0github.com/osmosis-labs/osmos" +
      "is/v15/x/gamm/types\242\002\003OGX\252\002\024Osmosis.Gamm" +
      ".V1beta1\312\002\024Osmosis\\Gamm\\V1beta1\342\002 Osmosi" +
      "s\\Gamm\\V1beta1\\GPBMetadata\352\002\026Osmosis::Ga" +
      "mm::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.osmosis.gamm.v1beta1.GenesisProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.amino.AminoProto.getDescriptor(),
        });
    internal_static_osmosis_gamm_v1beta1_ReplaceMigrationRecordsProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_osmosis_gamm_v1beta1_ReplaceMigrationRecordsProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_gamm_v1beta1_ReplaceMigrationRecordsProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Records", });
    internal_static_osmosis_gamm_v1beta1_UpdateMigrationRecordsProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_osmosis_gamm_v1beta1_UpdateMigrationRecordsProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_gamm_v1beta1_UpdateMigrationRecordsProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Records", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.name);
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.osmosis.gamm.v1beta1.GenesisProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.amino.AminoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
