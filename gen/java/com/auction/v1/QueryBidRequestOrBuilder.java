// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/auction/v1/query.proto

package com.auction.v1;

public interface QueryBidRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auction.v1.QueryBidRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 bid_id = 1 [json_name = "bidId"];</code>
   * @return The bidId.
   */
  long getBidId();

  /**
   * <code>uint32 auction_id = 2 [json_name = "auctionId"];</code>
   * @return The auctionId.
   */
  int getAuctionId();
}
