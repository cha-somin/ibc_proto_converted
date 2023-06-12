// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/concentrated-liquidity/pool.proto

package com.osmosis.concentratedliquidity.v1beta1;

public final class PoolProto {
  private PoolProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_concentratedliquidity_v1beta1_Pool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_concentratedliquidity_v1beta1_Pool_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)osmosis/concentrated-liquidity/pool.pr" +
      "oto\022%osmosis.concentratedliquidity.v1bet" +
      "a1\032\031cosmos_proto/cosmos.proto\032\024gogoproto" +
      "/gogo.proto\032\037google/protobuf/timestamp.p" +
      "roto\"\335\007\n\004Pool\022,\n\007address\030\001 \001(\tB\022\362\336\037\016yaml" +
      ":\"address\"R\007address\022L\n\022incentives_addres" +
      "s\030\002 \001(\tB\035\362\336\037\031yaml:\"incentives_address\"R\021" +
      "incentivesAddress\022W\n\026spread_rewards_addr" +
      "ess\030\003 \001(\tB!\362\336\037\035yaml:\"spread_rewards_addr" +
      "ess\"R\024spreadRewardsAddress\022\016\n\002id\030\004 \001(\004R\002" +
      "id\022\205\001\n\026current_tick_liquidity\030\005 \001(\tBO\310\336\037" +
      "\000\332\336\037&github.com/cosmos/cosmos-sdk/types." +
      "Dec\362\336\037\035yaml:\"current_tick_liquidity\"R\024cu" +
      "rrentTickLiquidity\022\026\n\006token0\030\006 \001(\tR\006toke" +
      "n0\022\026\n\006token1\030\007 \001(\tR\006token1\022q\n\022current_sq" +
      "rt_price\030\010 \001(\tBC\310\336\037\000\332\336\037&github.com/cosmo" +
      "s/cosmos-sdk/types.Dec\362\336\037\021yaml:\"spot_pri" +
      "ce\"R\020currentSqrtPrice\022:\n\014current_tick\030\t " +
      "\001(\003B\027\362\336\037\023yaml:\"current_tick\"R\013currentTic" +
      "k\022:\n\014tick_spacing\030\n \001(\004B\027\362\336\037\023yaml:\"tick_" +
      "spacing\"R\013tickSpacing\022S\n\025exponent_at_pri" +
      "ce_one\030\013 \001(\003B \362\336\037\034yaml:\"exponent_at_pric" +
      "e_one\"R\022exponentAtPriceOne\022k\n\rspread_fac" +
      "tor\030\014 \001(\tBF\310\336\037\000\332\336\037&github.com/cosmos/cos" +
      "mos-sdk/types.Dec\362\336\037\024yaml:\"spread_factor" +
      "\"R\014spreadFactor\022x\n\025last_liquidity_update" +
      "\030\r \001(\0132\032.google.protobuf.TimestampB(\310\336\037\000" +
      "\362\336\037\034yaml:\"last_liquidity_update\"\220\337\037\001R\023la" +
      "stLiquidityUpdate:\021\210\240\037\000\230\240\037\000\312\264-\005PoolIB\260\002\n" +
      ")com.osmosis.concentratedliquidity.v1bet" +
      "a1B\tPoolProtoP\001ZBgithub.com/osmosis-labs" +
      "/osmosis/v15/x/concentrated-liquidity/mo" +
      "del\242\002\003OCX\252\002%Osmosis.Concentratedliquidit" +
      "y.V1beta1\312\002%Osmosis\\Concentratedliquidit" +
      "y\\V1beta1\342\0021Osmosis\\Concentratedliquidit" +
      "y\\V1beta1\\GPBMetadata\352\002\'Osmosis::Concent" +
      "ratedliquidity::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_osmosis_concentratedliquidity_v1beta1_Pool_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_osmosis_concentratedliquidity_v1beta1_Pool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_concentratedliquidity_v1beta1_Pool_descriptor,
        new java.lang.String[] { "Address", "IncentivesAddress", "SpreadRewardsAddress", "Id", "CurrentTickLiquidity", "Token0", "Token1", "CurrentSqrtPrice", "CurrentTick", "TickSpacing", "ExponentAtPriceOne", "SpreadFactor", "LastLiquidityUpdate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
