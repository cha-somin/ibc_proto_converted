// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/auction/v1/query.proto

package com.auction.v1;

public interface QueryBidResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auction.v1.QueryBidResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.auction.v1.Bid bid = 1 [json_name = "bid"];</code>
   * @return Whether the bid field is set.
   */
  boolean hasBid();
  /**
   * <code>.auction.v1.Bid bid = 1 [json_name = "bid"];</code>
   * @return The bid.
   */
  com.auction.v1.Bid getBid();
  /**
   * <code>.auction.v1.Bid bid = 1 [json_name = "bid"];</code>
   */
  com.auction.v1.BidOrBuilder getBidOrBuilder();
}
