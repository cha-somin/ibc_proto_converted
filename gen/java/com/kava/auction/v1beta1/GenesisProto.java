// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/auction/v1beta1/genesis.proto

package com.kava.auction.v1beta1;

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
    internal_static_kava_auction_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_auction_v1beta1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_auction_v1beta1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_auction_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"kava/auction/v1beta1/genesis.proto\022\024ka" +
      "va.auction.v1beta1\032\031cosmos_proto/cosmos." +
      "proto\032\024gogoproto/gogo.proto\032\031google/prot" +
      "obuf/any.proto\032\036google/protobuf/duration" +
      ".proto\"\270\001\n\014GenesisState\022&\n\017next_auction_" +
      "id\030\001 \001(\004R\rnextAuctionId\022:\n\006params\030\002 \001(\0132" +
      "\034.kava.auction.v1beta1.ParamsB\004\310\336\037\000R\006par" +
      "ams\022D\n\010auctions\030\003 \003(\0132\024.google.protobuf." +
      "AnyB\022\312\264-\016GenesisAuctionR\010auctions\"\270\004\n\006Pa" +
      "rams\022U\n\024max_auction_duration\030\001 \001(\0132\031.goo" +
      "gle.protobuf.DurationB\010\310\336\037\000\230\337\037\001R\022maxAuct" +
      "ionDuration\022U\n\024forward_bid_duration\030\006 \001(" +
      "\0132\031.google.protobuf.DurationB\010\310\336\037\000\230\337\037\001R\022" +
      "forwardBidDuration\022U\n\024reverse_bid_durati" +
      "on\030\007 \001(\0132\031.google.protobuf.DurationB\010\310\336\037" +
      "\000\230\337\037\001R\022reverseBidDuration\022[\n\021increment_s" +
      "urplus\030\003 \001(\014B.\310\336\037\000\332\336\037&github.com/cosmos/" +
      "cosmos-sdk/types.DecR\020incrementSurplus\022U" +
      "\n\016increment_debt\030\004 \001(\014B.\310\336\037\000\332\336\037&github.c" +
      "om/cosmos/cosmos-sdk/types.DecR\rincremen" +
      "tDebt\022a\n\024increment_collateral\030\005 \001(\014B.\310\336\037" +
      "\000\332\336\037&github.com/cosmos/cosmos-sdk/types." +
      "DecR\023incrementCollateralJ\004\010\002\020\003R\014bid_dura" +
      "tionB\311\001\n\030com.kava.auction.v1beta1B\014Genes" +
      "isProtoP\001Z)github.com/kava-labs/kava/x/a" +
      "uction/types\242\002\003KAX\252\002\024Kava.Auction.V1beta" +
      "1\312\002\024Kava\\Auction\\V1beta1\342\002 Kava\\Auction\\" +
      "V1beta1\\GPBMetadata\352\002\026Kava::Auction::V1b" +
      "eta1\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_kava_auction_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kava_auction_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_auction_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "NextAuctionId", "Params", "Auctions", });
    internal_static_kava_auction_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kava_auction_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_auction_v1beta1_Params_descriptor,
        new java.lang.String[] { "MaxAuctionDuration", "ForwardBidDuration", "ReverseBidDuration", "IncrementSurplus", "IncrementDebt", "IncrementCollateral", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
