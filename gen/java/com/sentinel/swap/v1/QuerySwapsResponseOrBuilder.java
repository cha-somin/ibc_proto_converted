// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/swap/v1/querier.proto

package com.sentinel.swap.v1;

public interface QuerySwapsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sentinel.swap.v1.QuerySwapsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .sentinel.swap.v1.Swap swaps = 1 [json_name = "swaps", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.sentinel.swap.v1.Swap> 
      getSwapsList();
  /**
   * <code>repeated .sentinel.swap.v1.Swap swaps = 1 [json_name = "swaps", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.swap.v1.Swap getSwaps(int index);
  /**
   * <code>repeated .sentinel.swap.v1.Swap swaps = 1 [json_name = "swaps", (.gogoproto.nullable) = false];</code>
   */
  int getSwapsCount();
  /**
   * <code>repeated .sentinel.swap.v1.Swap swaps = 1 [json_name = "swaps", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.sentinel.swap.v1.SwapOrBuilder> 
      getSwapsOrBuilderList();
  /**
   * <code>repeated .sentinel.swap.v1.Swap swaps = 1 [json_name = "swaps", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.swap.v1.SwapOrBuilder getSwapsOrBuilder(
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
