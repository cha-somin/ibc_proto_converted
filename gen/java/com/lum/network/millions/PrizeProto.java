// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/prize.proto

package com.lum.network.millions;

public final class PrizeProto {
  private PrizeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lum_network_millions_Prize_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lum_network_millions_Prize_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lum_network_millions_PrizeIDs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lum_network_millions_PrizeIDs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lum_network_millions_PrizeIDsCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lum_network_millions_PrizeIDsCollection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n lum-network/millions/prize.proto\022\024lum." +
      "network.millions\032\024gogoproto/gogo.proto\032\037" +
      "google/protobuf/timestamp.proto\032\036cosmos/" +
      "base/v1beta1/coin.proto\032\031cosmos_proto/co" +
      "smos.proto\"\255\004\n\005Prize\022\027\n\007pool_id\030\001 \001(\004R\006p" +
      "oolId\022\027\n\007draw_id\030\002 \001(\004R\006drawId\022\031\n\010prize_" +
      "id\030\003 \001(\004R\007prizeId\0226\n\005state\030\004 \001(\0162 .lum.n" +
      "etwork.millions.PrizeStateR\005state\022?\n\016win" +
      "ner_address\030\005 \001(\tB\030\322\264-\024cosmos.AddressStr" +
      "ingR\rwinnerAddress\0227\n\006amount\030\006 \001(\0132\031.cos" +
      "mos.base.v1beta1.CoinB\004\310\336\037\000R\006amount\022*\n\021c" +
      "reated_at_height\030\007 \001(\003R\017createdAtHeight\022" +
      "*\n\021updated_at_height\030\010 \001(\003R\017updatedAtHei" +
      "ght\022C\n\nexpires_at\030\t \001(\0132\032.google.protobu" +
      "f.TimestampB\010\310\336\037\000\220\337\037\001R\texpiresAt\022C\n\ncrea" +
      "ted_at\030\n \001(\0132\032.google.protobuf.Timestamp" +
      "B\010\310\336\037\000\220\337\037\001R\tcreatedAt\022C\n\nupdated_at\030\013 \001(" +
      "\0132\032.google.protobuf.TimestampB\010\310\336\037\000\220\337\037\001R" +
      "\tupdatedAt\"W\n\010PrizeIDs\022\027\n\007pool_id\030\001 \001(\004R" +
      "\006poolId\022\027\n\007draw_id\030\002 \001(\004R\006drawId\022\031\n\010priz" +
      "e_id\030\003 \001(\004R\007prizeId\"Y\n\022PrizeIDsCollectio" +
      "n\022C\n\nprizes_ids\030\001 \003(\0132\036.lum.network.mill" +
      "ions.PrizeIDsB\004\310\336\037\000R\tprizesIds*f\n\nPrizeS" +
      "tate\022,\n\027PRIZE_STATE_UNSPECIFIED\020\000\032\017\212\235 \013U" +
      "nspecified\022$\n\023PRIZE_STATE_PENDING\020\001\032\013\212\235 " +
      "\007Pending\032\004\210\243\036\001B\307\001\n\030com.lum.network.milli" +
      "onsB\nPrizeProtoP\001Z-github.com/lum-networ" +
      "k/chain/x/millions/types\242\002\003LNM\252\002\024Lum.Net" +
      "work.Millions\312\002\024Lum\\Network\\Millions\342\002 L" +
      "um\\Network\\Millions\\GPBMetadata\352\002\026Lum::N" +
      "etwork::Millionsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_lum_network_millions_Prize_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lum_network_millions_Prize_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lum_network_millions_Prize_descriptor,
        new java.lang.String[] { "PoolId", "DrawId", "PrizeId", "State", "WinnerAddress", "Amount", "CreatedAtHeight", "UpdatedAtHeight", "ExpiresAt", "CreatedAt", "UpdatedAt", });
    internal_static_lum_network_millions_PrizeIDs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lum_network_millions_PrizeIDs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lum_network_millions_PrizeIDs_descriptor,
        new java.lang.String[] { "PoolId", "DrawId", "PrizeId", });
    internal_static_lum_network_millions_PrizeIDsCollection_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lum_network_millions_PrizeIDsCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lum_network_millions_PrizeIDsCollection_descriptor,
        new java.lang.String[] { "PrizesIds", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
