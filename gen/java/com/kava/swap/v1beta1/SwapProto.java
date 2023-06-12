// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/swap/v1beta1/swap.proto

package com.kava.swap.v1beta1;

public final class SwapProto {
  private SwapProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_swap_v1beta1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_swap_v1beta1_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_swap_v1beta1_AllowedPool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_swap_v1beta1_AllowedPool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_swap_v1beta1_PoolRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_swap_v1beta1_PoolRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_swap_v1beta1_ShareRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_swap_v1beta1_ShareRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034kava/swap/v1beta1/swap.proto\022\021kava.swa" +
      "p.v1beta1\032\036cosmos/base/v1beta1/coin.prot" +
      "o\032\031cosmos_proto/cosmos.proto\032\024gogoproto/" +
      "gogo.proto\"\302\001\n\006Params\022Y\n\rallowed_pools\030\001" +
      " \003(\0132\036.kava.swap.v1beta1.AllowedPoolB\024\310\336" +
      "\037\000\252\337\037\014AllowedPoolsR\014allowedPools\022W\n\010swap" +
      "_fee\030\002 \001(\tB<\310\336\037\000\332\336\037&github.com/cosmos/co" +
      "smos-sdk/types.Dec\322\264-\ncosmos.DecR\007swapFe" +
      "e:\004\230\240\037\000\"E\n\013AllowedPool\022\027\n\007token_a\030\001 \001(\tR" +
      "\006tokenA\022\027\n\007token_b\030\002 \001(\tR\006tokenB:\004\230\240\037\000\"\222" +
      "\002\n\nPoolRecord\022#\n\007pool_id\030\001 \001(\tB\n\342\336\037\006Pool" +
      "IDR\006poolId\022>\n\nreserves_a\030\002 \001(\0132\031.cosmos." +
      "base.v1beta1.CoinB\004\310\336\037\000R\treservesA\022>\n\nre" +
      "serves_b\030\003 \001(\0132\031.cosmos.base.v1beta1.Coi" +
      "nB\004\310\336\037\000R\treservesB\022_\n\014total_shares\030\004 \001(\t" +
      "B<\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/t" +
      "ypes.Int\322\264-\ncosmos.IntR\013totalShares\"\373\001\n\013" +
      "ShareRecord\022f\n\tdepositor\030\001 \001(\014BH\372\336\037-gith" +
      "ub.com/cosmos/cosmos-sdk/types.AccAddres" +
      "s\322\264-\023cosmos.AddressBytesR\tdepositor\022#\n\007p" +
      "ool_id\030\002 \001(\tB\n\342\336\037\006PoolIDR\006poolId\022_\n\014shar" +
      "es_owned\030\003 \001(\tB<\310\336\037\000\332\336\037&github.com/cosmo" +
      "s/cosmos-sdk/types.Int\322\264-\ncosmos.IntR\013sh" +
      "aresOwnedB\260\001\n\025com.kava.swap.v1beta1B\tSwa" +
      "pProtoP\001Z&github.com/kava-labs/kava/x/sw" +
      "ap/types\242\002\003KSX\252\002\021Kava.Swap.V1beta1\312\002\021Kav" +
      "a\\Swap\\V1beta1\342\002\035Kava\\Swap\\V1beta1\\GPBMe" +
      "tadata\352\002\023Kava::Swap::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_kava_swap_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kava_swap_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_swap_v1beta1_Params_descriptor,
        new java.lang.String[] { "AllowedPools", "SwapFee", });
    internal_static_kava_swap_v1beta1_AllowedPool_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kava_swap_v1beta1_AllowedPool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_swap_v1beta1_AllowedPool_descriptor,
        new java.lang.String[] { "TokenA", "TokenB", });
    internal_static_kava_swap_v1beta1_PoolRecord_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_kava_swap_v1beta1_PoolRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_swap_v1beta1_PoolRecord_descriptor,
        new java.lang.String[] { "PoolId", "ReservesA", "ReservesB", "TotalShares", });
    internal_static_kava_swap_v1beta1_ShareRecord_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_kava_swap_v1beta1_ShareRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_swap_v1beta1_ShareRecord_descriptor,
        new java.lang.String[] { "Depositor", "PoolId", "SharesOwned", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.casttype);
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
