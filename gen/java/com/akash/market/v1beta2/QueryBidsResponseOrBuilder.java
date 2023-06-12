// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta2/query.proto

package com.akash.market.v1beta2;

public interface QueryBidsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.market.v1beta2.QueryBidsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .akash.market.v1beta2.QueryBidResponse bids = 1 [json_name = "bids", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.akash.market.v1beta2.QueryBidResponse> 
      getBidsList();
  /**
   * <code>repeated .akash.market.v1beta2.QueryBidResponse bids = 1 [json_name = "bids", (.gogoproto.nullable) = false];</code>
   */
  com.akash.market.v1beta2.QueryBidResponse getBids(int index);
  /**
   * <code>repeated .akash.market.v1beta2.QueryBidResponse bids = 1 [json_name = "bids", (.gogoproto.nullable) = false];</code>
   */
  int getBidsCount();
  /**
   * <code>repeated .akash.market.v1beta2.QueryBidResponse bids = 1 [json_name = "bids", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.akash.market.v1beta2.QueryBidResponseOrBuilder> 
      getBidsOrBuilderList();
  /**
   * <code>repeated .akash.market.v1beta2.QueryBidResponse bids = 1 [json_name = "bids", (.gogoproto.nullable) = false];</code>
   */
  com.akash.market.v1beta2.QueryBidResponseOrBuilder getBidsOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
