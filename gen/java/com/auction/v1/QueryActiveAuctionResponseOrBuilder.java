// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/auction/v1/query.proto

package com.auction.v1;

public interface QueryActiveAuctionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auction.v1.QueryActiveAuctionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.auction.v1.Auction auction = 1 [json_name = "auction"];</code>
   * @return Whether the auction field is set.
   */
  boolean hasAuction();
  /**
   * <code>.auction.v1.Auction auction = 1 [json_name = "auction"];</code>
   * @return The auction.
   */
  com.auction.v1.Auction getAuction();
  /**
   * <code>.auction.v1.Auction auction = 1 [json_name = "auction"];</code>
   */
  com.auction.v1.AuctionOrBuilder getAuctionOrBuilder();
}
