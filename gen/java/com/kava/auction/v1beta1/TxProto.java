// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/auction/v1beta1/tx.proto

package com.kava.auction.v1beta1;

public final class TxProto {
  private TxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_auction_v1beta1_MsgPlaceBid_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_auction_v1beta1_MsgPlaceBid_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_auction_v1beta1_MsgPlaceBidResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_auction_v1beta1_MsgPlaceBidResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035kava/auction/v1beta1/tx.proto\022\024kava.au" +
      "ction.v1beta1\032\036cosmos/base/v1beta1/coin." +
      "proto\032\024gogoproto/gogo.proto\"\207\001\n\013MsgPlace" +
      "Bid\022\035\n\nauction_id\030\001 \001(\004R\tauctionId\022\026\n\006bi" +
      "dder\030\002 \001(\tR\006bidder\0227\n\006amount\030\003 \001(\0132\031.cos" +
      "mos.base.v1beta1.CoinB\004\310\336\037\000R\006amount:\010\210\240\037" +
      "\000\350\240\037\000\"\025\n\023MsgPlaceBidResponse2_\n\003Msg\022X\n\010P" +
      "laceBid\022!.kava.auction.v1beta1.MsgPlaceB" +
      "id\032).kava.auction.v1beta1.MsgPlaceBidRes" +
      "ponseB\300\001\n\030com.kava.auction.v1beta1B\007TxPr" +
      "otoP\001Z)github.com/kava-labs/kava/x/aucti" +
      "on/types\242\002\003KAX\252\002\024Kava.Auction.V1beta1\312\002\024" +
      "Kava\\Auction\\V1beta1\342\002 Kava\\Auction\\V1be" +
      "ta1\\GPBMetadata\352\002\026Kava::Auction::V1beta1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_kava_auction_v1beta1_MsgPlaceBid_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kava_auction_v1beta1_MsgPlaceBid_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_auction_v1beta1_MsgPlaceBid_descriptor,
        new java.lang.String[] { "AuctionId", "Bidder", "Amount", });
    internal_static_kava_auction_v1beta1_MsgPlaceBidResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kava_auction_v1beta1_MsgPlaceBidResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_auction_v1beta1_MsgPlaceBidResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
