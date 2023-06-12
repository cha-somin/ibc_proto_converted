// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/concentrated-liquidity/query.proto

package com.osmosis.concentratedliquidity.v1beta1;

public interface LiquidityNetInDirectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .osmosis.concentratedliquidity.v1beta1.TickLiquidityNet liquidity_depths = 1 [json_name = "liquidityDepths", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.osmosis.concentratedliquidity.v1beta1.TickLiquidityNet> 
      getLiquidityDepthsList();
  /**
   * <code>repeated .osmosis.concentratedliquidity.v1beta1.TickLiquidityNet liquidity_depths = 1 [json_name = "liquidityDepths", (.gogoproto.nullable) = false];</code>
   */
  com.osmosis.concentratedliquidity.v1beta1.TickLiquidityNet getLiquidityDepths(int index);
  /**
   * <code>repeated .osmosis.concentratedliquidity.v1beta1.TickLiquidityNet liquidity_depths = 1 [json_name = "liquidityDepths", (.gogoproto.nullable) = false];</code>
   */
  int getLiquidityDepthsCount();
  /**
   * <code>repeated .osmosis.concentratedliquidity.v1beta1.TickLiquidityNet liquidity_depths = 1 [json_name = "liquidityDepths", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.osmosis.concentratedliquidity.v1beta1.TickLiquidityNetOrBuilder> 
      getLiquidityDepthsOrBuilderList();
  /**
   * <code>repeated .osmosis.concentratedliquidity.v1beta1.TickLiquidityNet liquidity_depths = 1 [json_name = "liquidityDepths", (.gogoproto.nullable) = false];</code>
   */
  com.osmosis.concentratedliquidity.v1beta1.TickLiquidityNetOrBuilder getLiquidityDepthsOrBuilder(
      int index);

  /**
   * <code>int64 current_tick = 2 [json_name = "currentTick"];</code>
   * @return The currentTick.
   */
  long getCurrentTick();

  /**
   * <code>string current_liquidity = 3 [json_name = "currentLiquidity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"current_liquidity&#92;""];</code>
   * @return The currentLiquidity.
   */
  java.lang.String getCurrentLiquidity();
  /**
   * <code>string current_liquidity = 3 [json_name = "currentLiquidity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"current_liquidity&#92;""];</code>
   * @return The bytes for currentLiquidity.
   */
  com.google.protobuf.ByteString
      getCurrentLiquidityBytes();
}
