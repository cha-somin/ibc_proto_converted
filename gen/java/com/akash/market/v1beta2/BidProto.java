// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta2/bid.proto

package com.akash.market.v1beta2;

public final class BidProto {
  private BidProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_MsgCreateBid_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_MsgCreateBid_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_MsgCreateBidResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_MsgCreateBidResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_MsgCloseBid_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_MsgCloseBid_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_MsgCloseBidResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_MsgCloseBidResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_BidID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_BidID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_Bid_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_Bid_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_BidFilters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_BidFilters_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036akash/market/v1beta2/bid.proto\022\024akash." +
      "market.v1beta2\032\024gogoproto/gogo.proto\032 ak" +
      "ash/market/v1beta2/order.proto\032\036cosmos/b" +
      "ase/v1beta1/coin.proto\"\331\002\n\014MsgCreateBid\022" +
      "[\n\005order\030\001 \001(\0132\035.akash.market.v1beta2.Or" +
      "derIDB&\310\336\037\000\342\336\037\005Order\352\336\037\005order\362\336\037\014yaml:\"o" +
      "rder\"R\005order\022;\n\010provider\030\002 \001(\tB\037\352\336\037\010prov" +
      "ider\362\336\037\017yaml:\"provider\"R\010provider\022Q\n\005pri" +
      "ce\030\003 \001(\0132\034.cosmos.base.v1beta1.DecCoinB\035" +
      "\310\336\037\000\352\336\037\005price\362\336\037\014yaml:\"price\"R\005price\022V\n\007" +
      "deposit\030\004 \001(\0132\031.cosmos.base.v1beta1.Coin" +
      "B!\310\336\037\000\352\336\037\007deposit\362\336\037\016yaml:\"deposit\"R\007dep" +
      "osit:\004\350\240\037\000\"\026\n\024MsgCreateBidResponse\"i\n\013Ms" +
      "gCloseBid\022T\n\006bid_id\030\001 \001(\0132\033.akash.market" +
      ".v1beta2.BidIDB \310\336\037\000\342\336\037\005BidID\352\336\037\002id\362\336\037\ty" +
      "aml:\"id\"R\005bidId:\004\350\240\037\000\"\025\n\023MsgCloseBidResp" +
      "onse\"\236\002\n\005BidID\022/\n\005owner\030\001 \001(\tB\031\352\336\037\005owner" +
      "\362\336\037\014yaml:\"owner\"R\005owner\0223\n\004dseq\030\002 \001(\004B\037\342" +
      "\336\037\004DSeq\352\336\037\004dseq\362\336\037\013yaml:\"dseq\"R\004dseq\0223\n\004" +
      "gseq\030\003 \001(\rB\037\342\336\037\004GSeq\352\336\037\004gseq\362\336\037\013yaml:\"gs" +
      "eq\"R\004gseq\0223\n\004oseq\030\004 \001(\rB\037\342\336\037\004OSeq\352\336\037\004ose" +
      "q\362\336\037\013yaml:\"oseq\"R\004oseq\022;\n\010provider\030\005 \001(\t" +
      "B\037\352\336\037\010provider\362\336\037\017yaml:\"provider\"R\010provi" +
      "der:\010\230\240\037\000\350\240\037\000\"\277\003\n\003Bid\022T\n\006bid_id\030\001 \001(\0132\033." +
      "akash.market.v1beta2.BidIDB \310\336\037\000\342\336\037\005BidI" +
      "D\352\336\037\002id\362\336\037\tyaml:\"id\"R\005bidId\022P\n\005state\030\002 \001" +
      "(\0162\037.akash.market.v1beta2.Bid.StateB\031\352\336\037" +
      "\005state\362\336\037\014yaml:\"state\"R\005state\022Q\n\005price\030\003" +
      " \001(\0132\034.cosmos.base.v1beta1.DecCoinB\035\310\336\037\000" +
      "\352\336\037\005price\362\336\037\014yaml:\"price\"R\005price\022\035\n\ncrea" +
      "ted_at\030\004 \001(\003R\tcreatedAt\"\223\001\n\005State\022 \n\007inv" +
      "alid\020\000\032\023\212\235 \017BidStateInvalid\022\025\n\004open\020\001\032\013\212" +
      "\235 \007BidOpen\022\031\n\006active\020\002\032\r\212\235 \tBidActive\022\025\n" +
      "\004lost\020\003\032\013\212\235 \007BidLost\022\031\n\006closed\020\004\032\r\212\235 \tBi" +
      "dClosed\032\004\210\243\036\000:\010\230\240\037\000\350\240\037\000\"\320\002\n\nBidFilters\022/" +
      "\n\005owner\030\001 \001(\tB\031\352\336\037\005owner\362\336\037\014yaml:\"owner\"" +
      "R\005owner\0223\n\004dseq\030\002 \001(\004B\037\342\336\037\004DSeq\352\336\037\004dseq\362" +
      "\336\037\013yaml:\"dseq\"R\004dseq\0223\n\004gseq\030\003 \001(\rB\037\342\336\037\004" +
      "GSeq\352\336\037\004gseq\362\336\037\013yaml:\"gseq\"R\004gseq\0223\n\004ose" +
      "q\030\004 \001(\rB\037\342\336\037\004OSeq\352\336\037\004oseq\362\336\037\013yaml:\"oseq\"" +
      "R\004oseq\022;\n\010provider\030\005 \001(\tB\037\352\336\037\010provider\362\336" +
      "\037\017yaml:\"provider\"R\010provider\022/\n\005state\030\006 \001" +
      "(\tB\031\352\336\037\005state\362\336\037\014yaml:\"state\"R\005state:\004\350\240" +
      "\037\000B\321\001\n\030com.akash.market.v1beta2B\010BidProt" +
      "oP\001Z9github.com/akash-network/akash-api/" +
      "go/node/market/v1beta2\242\002\003AMX\252\002\024Akash.Mar" +
      "ket.V1beta2\312\002\024Akash\\Market\\V1beta2\342\002 Aka" +
      "sh\\Market\\V1beta2\\GPBMetadata\352\002\026Akash::M" +
      "arket::V1beta2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.market.v1beta2.OrderProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_akash_market_v1beta2_MsgCreateBid_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_market_v1beta2_MsgCreateBid_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_MsgCreateBid_descriptor,
        new java.lang.String[] { "Order", "Provider", "Price", "Deposit", });
    internal_static_akash_market_v1beta2_MsgCreateBidResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_akash_market_v1beta2_MsgCreateBidResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_MsgCreateBidResponse_descriptor,
        new java.lang.String[] { });
    internal_static_akash_market_v1beta2_MsgCloseBid_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_akash_market_v1beta2_MsgCloseBid_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_MsgCloseBid_descriptor,
        new java.lang.String[] { "BidId", });
    internal_static_akash_market_v1beta2_MsgCloseBidResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_akash_market_v1beta2_MsgCloseBidResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_MsgCloseBidResponse_descriptor,
        new java.lang.String[] { });
    internal_static_akash_market_v1beta2_BidID_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_akash_market_v1beta2_BidID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_BidID_descriptor,
        new java.lang.String[] { "Owner", "Dseq", "Gseq", "Oseq", "Provider", });
    internal_static_akash_market_v1beta2_Bid_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_akash_market_v1beta2_Bid_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_Bid_descriptor,
        new java.lang.String[] { "BidId", "State", "Price", "CreatedAt", });
    internal_static_akash_market_v1beta2_BidFilters_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_akash_market_v1beta2_BidFilters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_BidFilters_descriptor,
        new java.lang.String[] { "Owner", "Dseq", "Gseq", "Oseq", "Provider", "State", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.market.v1beta2.OrderProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
