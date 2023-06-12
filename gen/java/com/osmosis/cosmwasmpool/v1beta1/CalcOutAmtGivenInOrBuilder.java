// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/cosmwasmpool/v1beta1/model/module_query_msg.proto

package com.osmosis.cosmwasmpool.v1beta1;

public interface CalcOutAmtGivenInOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenIn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * token_in is the token to be sent to the pool.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_in = 1 [json_name = "tokenIn", (.gogoproto.nullable) = false];</code>
   * @return Whether the tokenIn field is set.
   */
  boolean hasTokenIn();
  /**
   * <pre>
   * token_in is the token to be sent to the pool.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_in = 1 [json_name = "tokenIn", (.gogoproto.nullable) = false];</code>
   * @return The tokenIn.
   */
  com.cosmos.base.v1beta1.Coin getTokenIn();
  /**
   * <pre>
   * token_in is the token to be sent to the pool.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_in = 1 [json_name = "tokenIn", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTokenInOrBuilder();

  /**
   * <pre>
   * token_out_denom is the token denom to be received from the pool.
   * </pre>
   *
   * <code>string token_out_denom = 2 [json_name = "tokenOutDenom"];</code>
   * @return The tokenOutDenom.
   */
  java.lang.String getTokenOutDenom();
  /**
   * <pre>
   * token_out_denom is the token denom to be received from the pool.
   * </pre>
   *
   * <code>string token_out_denom = 2 [json_name = "tokenOutDenom"];</code>
   * @return The bytes for tokenOutDenom.
   */
  com.google.protobuf.ByteString
      getTokenOutDenomBytes();

  /**
   * <pre>
   * swap_fee is the swap fee for this swap estimate.
   * </pre>
   *
   * <code>string swap_fee = 3 [json_name = "swapFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The swapFee.
   */
  java.lang.String getSwapFee();
  /**
   * <pre>
   * swap_fee is the swap fee for this swap estimate.
   * </pre>
   *
   * <code>string swap_fee = 3 [json_name = "swapFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for swapFee.
   */
  com.google.protobuf.ByteString
      getSwapFeeBytes();
}
