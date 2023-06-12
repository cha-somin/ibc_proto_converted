// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/market/v1beta1/query.proto

package com.comdex.market.v1beta1;

public interface QueryMarketsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.market.v1beta1.QueryMarketsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .comdex.market.v1beta1.TimeWeightedAverage timeWeightedAverage = 1 [json_name = "timeWeightedAverage", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"time_weighted_average&#92;""];</code>
   */
  java.util.List<com.comdex.market.v1beta1.TimeWeightedAverage> 
      getTimeWeightedAverageList();
  /**
   * <code>repeated .comdex.market.v1beta1.TimeWeightedAverage timeWeightedAverage = 1 [json_name = "timeWeightedAverage", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"time_weighted_average&#92;""];</code>
   */
  com.comdex.market.v1beta1.TimeWeightedAverage getTimeWeightedAverage(int index);
  /**
   * <code>repeated .comdex.market.v1beta1.TimeWeightedAverage timeWeightedAverage = 1 [json_name = "timeWeightedAverage", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"time_weighted_average&#92;""];</code>
   */
  int getTimeWeightedAverageCount();
  /**
   * <code>repeated .comdex.market.v1beta1.TimeWeightedAverage timeWeightedAverage = 1 [json_name = "timeWeightedAverage", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"time_weighted_average&#92;""];</code>
   */
  java.util.List<? extends com.comdex.market.v1beta1.TimeWeightedAverageOrBuilder> 
      getTimeWeightedAverageOrBuilderList();
  /**
   * <code>repeated .comdex.market.v1beta1.TimeWeightedAverage timeWeightedAverage = 1 [json_name = "timeWeightedAverage", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"time_weighted_average&#92;""];</code>
   */
  com.comdex.market.v1beta1.TimeWeightedAverageOrBuilder getTimeWeightedAverageOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
