// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/poolmanager/v1beta1/tx.proto

package com.osmosis.poolmanager.v1beta1;

public interface MsgSplitRouteSwapExactAmountOutOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>repeated .osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute routes = 2 [json_name = "routes", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute> 
      getRoutesList();
  /**
   * <code>repeated .osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute routes = 2 [json_name = "routes", (.gogoproto.nullable) = false];</code>
   */
  com.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute getRoutes(int index);
  /**
   * <code>repeated .osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute routes = 2 [json_name = "routes", (.gogoproto.nullable) = false];</code>
   */
  int getRoutesCount();
  /**
   * <code>repeated .osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute routes = 2 [json_name = "routes", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRouteOrBuilder> 
      getRoutesOrBuilderList();
  /**
   * <code>repeated .osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute routes = 2 [json_name = "routes", (.gogoproto.nullable) = false];</code>
   */
  com.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRouteOrBuilder getRoutesOrBuilder(
      int index);

  /**
   * <code>string token_out_denom = 3 [json_name = "tokenOutDenom", (.gogoproto.moretags) = "yaml:&#92;"token_out_denom&#92;""];</code>
   * @return The tokenOutDenom.
   */
  java.lang.String getTokenOutDenom();
  /**
   * <code>string token_out_denom = 3 [json_name = "tokenOutDenom", (.gogoproto.moretags) = "yaml:&#92;"token_out_denom&#92;""];</code>
   * @return The bytes for tokenOutDenom.
   */
  com.google.protobuf.ByteString
      getTokenOutDenomBytes();

  /**
   * <code>string token_in_max_amount = 4 [json_name = "tokenInMaxAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_in_max_amount&#92;""];</code>
   * @return The tokenInMaxAmount.
   */
  java.lang.String getTokenInMaxAmount();
  /**
   * <code>string token_in_max_amount = 4 [json_name = "tokenInMaxAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_in_max_amount&#92;""];</code>
   * @return The bytes for tokenInMaxAmount.
   */
  com.google.protobuf.ByteString
      getTokenInMaxAmountBytes();
}
