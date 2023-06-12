// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/poolmanager/v1beta1/query.proto

package com.osmosis.poolmanager.v1beta1;

public interface EstimateSwapExactAmountInRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.poolmanager.v1beta1.EstimateSwapExactAmountInRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 pool_id = 2 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <code>string token_in = 3 [json_name = "tokenIn", (.gogoproto.moretags) = "yaml:&#92;"token_in&#92;""];</code>
   * @return The tokenIn.
   */
  java.lang.String getTokenIn();
  /**
   * <code>string token_in = 3 [json_name = "tokenIn", (.gogoproto.moretags) = "yaml:&#92;"token_in&#92;""];</code>
   * @return The bytes for tokenIn.
   */
  com.google.protobuf.ByteString
      getTokenInBytes();

  /**
   * <code>repeated .osmosis.poolmanager.v1beta1.SwapAmountInRoute routes = 4 [json_name = "routes", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"routes&#92;""];</code>
   */
  java.util.List<com.osmosis.poolmanager.v1beta1.SwapAmountInRoute> 
      getRoutesList();
  /**
   * <code>repeated .osmosis.poolmanager.v1beta1.SwapAmountInRoute routes = 4 [json_name = "routes", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"routes&#92;""];</code>
   */
  com.osmosis.poolmanager.v1beta1.SwapAmountInRoute getRoutes(int index);
  /**
   * <code>repeated .osmosis.poolmanager.v1beta1.SwapAmountInRoute routes = 4 [json_name = "routes", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"routes&#92;""];</code>
   */
  int getRoutesCount();
  /**
   * <code>repeated .osmosis.poolmanager.v1beta1.SwapAmountInRoute routes = 4 [json_name = "routes", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"routes&#92;""];</code>
   */
  java.util.List<? extends com.osmosis.poolmanager.v1beta1.SwapAmountInRouteOrBuilder> 
      getRoutesOrBuilderList();
  /**
   * <code>repeated .osmosis.poolmanager.v1beta1.SwapAmountInRoute routes = 4 [json_name = "routes", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"routes&#92;""];</code>
   */
  com.osmosis.poolmanager.v1beta1.SwapAmountInRouteOrBuilder getRoutesOrBuilder(
      int index);
}
