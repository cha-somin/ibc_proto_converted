// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta3/params.proto

package com.akash.market.v1beta3;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.market.v1beta3.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
   * @return Whether the bidMinDeposit field is set.
   */
  boolean hasBidMinDeposit();
  /**
   * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
   * @return The bidMinDeposit.
   */
  com.cosmos.base.v1beta1.Coin getBidMinDeposit();
  /**
   * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getBidMinDepositOrBuilder();

  /**
   * <code>uint32 order_max_bids = 2 [json_name = "orderMaxBids", (.gogoproto.customname) = "OrderMaxBids", (.gogoproto.jsontag) = "order_max_bids", (.gogoproto.moretags) = "yaml:&#92;"order_max_bids&#92;""];</code>
   * @return The orderMaxBids.
   */
  int getOrderMaxBids();
}
