// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/auction/v1beta1/tx.proto

package com.kava.auction.v1beta1;

public interface MsgPlaceBidOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.auction.v1beta1.MsgPlaceBid)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 auction_id = 1 [json_name = "auctionId"];</code>
   * @return The auctionId.
   */
  long getAuctionId();

  /**
   * <code>string bidder = 2 [json_name = "bidder"];</code>
   * @return The bidder.
   */
  java.lang.String getBidder();
  /**
   * <code>string bidder = 2 [json_name = "bidder"];</code>
   * @return The bytes for bidder.
   */
  com.google.protobuf.ByteString
      getBidderBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();
}
