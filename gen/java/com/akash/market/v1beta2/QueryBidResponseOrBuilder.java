// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta2/query.proto

package com.akash.market.v1beta2;

public interface QueryBidResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.market.v1beta2.QueryBidResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.akash.market.v1beta2.Bid bid = 1 [json_name = "bid", (.gogoproto.nullable) = false];</code>
   * @return Whether the bid field is set.
   */
  boolean hasBid();
  /**
   * <code>.akash.market.v1beta2.Bid bid = 1 [json_name = "bid", (.gogoproto.nullable) = false];</code>
   * @return The bid.
   */
  com.akash.market.v1beta2.Bid getBid();
  /**
   * <code>.akash.market.v1beta2.Bid bid = 1 [json_name = "bid", (.gogoproto.nullable) = false];</code>
   */
  com.akash.market.v1beta2.BidOrBuilder getBidOrBuilder();

  /**
   * <code>.akash.escrow.v1beta2.Account escrow_account = 2 [json_name = "escrowAccount", (.gogoproto.nullable) = false];</code>
   * @return Whether the escrowAccount field is set.
   */
  boolean hasEscrowAccount();
  /**
   * <code>.akash.escrow.v1beta2.Account escrow_account = 2 [json_name = "escrowAccount", (.gogoproto.nullable) = false];</code>
   * @return The escrowAccount.
   */
  com.akash.escrow.v1beta2.Account getEscrowAccount();
  /**
   * <code>.akash.escrow.v1beta2.Account escrow_account = 2 [json_name = "escrowAccount", (.gogoproto.nullable) = false];</code>
   */
  com.akash.escrow.v1beta2.AccountOrBuilder getEscrowAccountOrBuilder();
}
