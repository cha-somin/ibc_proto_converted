// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/gamm/v1beta1/genesis.proto

package com.osmosis.gamm.v1beta1;

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
    internal_static_osmosis_gamm_v1beta1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_gamm_v1beta1_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_gamm_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_gamm_v1beta1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_gamm_v1beta1_MigrationRecords_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_gamm_v1beta1_MigrationRecords_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_gamm_v1beta1_BalancerToConcentratedPoolLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_gamm_v1beta1_BalancerToConcentratedPoolLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"osmosis/gamm/v1beta1/genesis.proto\022\024os" +
      "mosis.gamm.v1beta1\032\024gogoproto/gogo.proto" +
      "\032\031google/protobuf/any.proto\032\031cosmos_prot" +
      "o/cosmos.proto\032\036cosmos/base/v1beta1/coin" +
      ".proto\"\236\001\n\006Params\022\223\001\n\021pool_creation_fee\030" +
      "\001 \003(\0132\031.cosmos.base.v1beta1.CoinBL\310\336\037\000\362\336" +
      "\037\030yaml:\"pool_creation_fee\"\252\337\037(github.com" +
      "/cosmos/cosmos-sdk/types.CoinsR\017poolCrea" +
      "tionFee\"\200\002\n\014GenesisState\0225\n\005pools\030\001 \003(\0132" +
      "\024.google.protobuf.AnyB\t\312\264-\005PoolIR\005pools\022" +
      "(\n\020next_pool_number\030\002 \001(\004R\016nextPoolNumbe" +
      "r\022:\n\006params\030\003 \001(\0132\034.osmosis.gamm.v1beta1" +
      ".ParamsB\004\310\336\037\000R\006params\022S\n\021migration_recor" +
      "ds\030\004 \001(\0132&.osmosis.gamm.v1beta1.Migratio" +
      "nRecordsR\020migrationRecords\"\235\001\n\020Migration" +
      "Records\022\210\001\n#balancer_to_concentrated_poo" +
      "l_links\030\001 \003(\01324.osmosis.gamm.v1beta1.Bal" +
      "ancerToConcentratedPoolLinkB\004\310\336\037\000R\037balan" +
      "cerToConcentratedPoolLinks\"n\n\036BalancerTo" +
      "ConcentratedPoolLink\022(\n\020balancer_pool_id" +
      "\030\001 \001(\004R\016balancerPoolId\022\034\n\ncl_pool_id\030\002 \001" +
      "(\004R\010clPoolId:\004\350\240\037\001B\314\001\n\030com.osmosis.gamm." +
      "v1beta1B\014GenesisProtoP\001Z0github.com/osmo" +
      "sis-labs/osmosis/v15/x/gamm/types\242\002\003OGX\252" +
      "\002\024Osmosis.Gamm.V1beta1\312\002\024Osmosis\\Gamm\\V1" +
      "beta1\342\002 Osmosis\\Gamm\\V1beta1\\GPBMetadata" +
      "\352\002\026Osmosis::Gamm::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_osmosis_gamm_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_osmosis_gamm_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_gamm_v1beta1_Params_descriptor,
        new java.lang.String[] { "PoolCreationFee", });
    internal_static_osmosis_gamm_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_osmosis_gamm_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_gamm_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Pools", "NextPoolNumber", "Params", "MigrationRecords", });
    internal_static_osmosis_gamm_v1beta1_MigrationRecords_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_osmosis_gamm_v1beta1_MigrationRecords_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_gamm_v1beta1_MigrationRecords_descriptor,
        new java.lang.String[] { "BalancerToConcentratedPoolLinks", });
    internal_static_osmosis_gamm_v1beta1_BalancerToConcentratedPoolLink_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_osmosis_gamm_v1beta1_BalancerToConcentratedPoolLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_gamm_v1beta1_BalancerToConcentratedPoolLink_descriptor,
        new java.lang.String[] { "BalancerPoolId", "ClPoolId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
