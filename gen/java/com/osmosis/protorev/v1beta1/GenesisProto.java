// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/protorev/v1beta1/genesis.proto

package com.osmosis.protorev.v1beta1;

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
    internal_static_osmosis_protorev_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_protorev_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&osmosis/protorev/v1beta1/genesis.proto" +
      "\022\030osmosis.protorev.v1beta1\032\024gogoproto/go" +
      "go.proto\032\'osmosis/protorev/v1beta1/proto" +
      "rev.proto\032%osmosis/protorev/v1beta1/para" +
      "ms.proto\032\031cosmos_proto/cosmos.proto\032\036cos" +
      "mos/base/v1beta1/coin.proto\"\232\010\n\014GenesisS" +
      "tate\022>\n\006params\030\001 \001(\0132 .osmosis.protorev." +
      "v1beta1.ParamsB\004\310\336\037\000R\006params\022\205\001\n\025token_p" +
      "air_arb_routes\030\002 \003(\0132,.osmosis.protorev." +
      "v1beta1.TokenPairArbRoutesB$\310\336\037\000\362\336\037\034yaml" +
      ":\"token_pair_arb_routes\"R\022tokenPairArbRo" +
      "utes\022`\n\013base_denoms\030\003 \003(\0132#.osmosis.prot" +
      "orev.v1beta1.BaseDenomB\032\310\336\037\000\362\336\037\022yaml:\"ba" +
      "se_denoms\"R\nbaseDenoms\022e\n\014pool_weights\030\004" +
      " \001(\0132%.osmosis.protorev.v1beta1.PoolWeig" +
      "htsB\033\310\336\037\000\362\336\037\023yaml:\"pool_weights\"R\013poolWe" +
      "ights\022_\n\031days_since_module_genesis\030\005 \001(\004" +
      "B$\362\336\037 yaml:\"days_since_module_genesis\"R\026" +
      "daysSinceModuleGenesis\022_\n\016developer_fees" +
      "\030\006 \003(\0132\031.cosmos.base.v1beta1.CoinB\035\310\336\037\000\362" +
      "\336\037\025yaml:\"developer_fees\"R\rdeveloperFees\022" +
      "N\n\023latest_block_height\030\007 \001(\004B\036\362\336\037\032yaml:\"" +
      "latest_block_height\"R\021latestBlockHeight\022" +
      "[\n\021developer_address\030\010 \001(\tB.\362\336\037\030yaml:\"de" +
      "veloper_address\"\322\264-\016cosmos.AddressR\020deve" +
      "loperAddress\022^\n\031max_pool_points_per_bloc" +
      "k\030\t \001(\004B$\362\336\037 yaml:\"max_pool_points_per_b" +
      "lock\"R\025maxPoolPointsPerBlock\022U\n\026max_pool" +
      "_points_per_tx\030\n \001(\004B!\362\336\037\035yaml:\"max_pool" +
      "_points_per_tx\"R\022maxPoolPointsPerTx\022S\n\025p" +
      "oint_count_for_block\030\013 \001(\004B \362\336\037\034yaml:\"po" +
      "int_count_for_block\"R\022pointCountForBlock" +
      "B\344\001\n\034com.osmosis.protorev.v1beta1B\014Genes" +
      "isProtoP\001Z4github.com/osmosis-labs/osmos" +
      "is/v15/x/protorev/types\242\002\003OPX\252\002\030Osmosis." +
      "Protorev.V1beta1\312\002\030Osmosis\\Protorev\\V1be" +
      "ta1\342\002$Osmosis\\Protorev\\V1beta1\\GPBMetada" +
      "ta\352\002\032Osmosis::Protorev::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.osmosis.protorev.v1beta1.ProtorevProto.getDescriptor(),
          com.osmosis.protorev.v1beta1.ParamsProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_osmosis_protorev_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_osmosis_protorev_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_protorev_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "TokenPairArbRoutes", "BaseDenoms", "PoolWeights", "DaysSinceModuleGenesis", "DeveloperFees", "LatestBlockHeight", "DeveloperAddress", "MaxPoolPointsPerBlock", "MaxPoolPointsPerTx", "PointCountForBlock", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.osmosis.protorev.v1beta1.ProtorevProto.getDescriptor();
    com.osmosis.protorev.v1beta1.ParamsProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
