// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/swap/v1beta1/tx.proto

package com.kava.swap.v1beta1;

public interface MsgSwapForExactTokensOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.swap.v1beta1.MsgSwapForExactTokens)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * represents the address swaping the tokens
   * </pre>
   *
   * <code>string requester = 1 [json_name = "requester", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The requester.
   */
  java.lang.String getRequester();
  /**
   * <pre>
   * represents the address swaping the tokens
   * </pre>
   *
   * <code>string requester = 1 [json_name = "requester", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for requester.
   */
  com.google.protobuf.ByteString
      getRequesterBytes();

  /**
   * <pre>
   * token_a represents the desired token_a to swap for
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_a = 2 [json_name = "tokenA", (.gogoproto.nullable) = false];</code>
   * @return Whether the tokenA field is set.
   */
  boolean hasTokenA();
  /**
   * <pre>
   * token_a represents the desired token_a to swap for
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_a = 2 [json_name = "tokenA", (.gogoproto.nullable) = false];</code>
   * @return The tokenA.
   */
  com.cosmos.base.v1beta1.Coin getTokenA();
  /**
   * <pre>
   * token_a represents the desired token_a to swap for
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_a = 2 [json_name = "tokenA", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTokenAOrBuilder();

  /**
   * <pre>
   * exact_token_b represents the exact token b amount to swap for token a
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin exact_token_b = 3 [json_name = "exactTokenB", (.gogoproto.nullable) = false];</code>
   * @return Whether the exactTokenB field is set.
   */
  boolean hasExactTokenB();
  /**
   * <pre>
   * exact_token_b represents the exact token b amount to swap for token a
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin exact_token_b = 3 [json_name = "exactTokenB", (.gogoproto.nullable) = false];</code>
   * @return The exactTokenB.
   */
  com.cosmos.base.v1beta1.Coin getExactTokenB();
  /**
   * <pre>
   * exact_token_b represents the exact token b amount to swap for token a
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin exact_token_b = 3 [json_name = "exactTokenB", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getExactTokenBOrBuilder();

  /**
   * <pre>
   * slippage represents the maximum change in token_a allowed
   * </pre>
   *
   * <code>string slippage = 4 [json_name = "slippage", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The slippage.
   */
  java.lang.String getSlippage();
  /**
   * <pre>
   * slippage represents the maximum change in token_a allowed
   * </pre>
   *
   * <code>string slippage = 4 [json_name = "slippage", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for slippage.
   */
  com.google.protobuf.ByteString
      getSlippageBytes();

  /**
   * <pre>
   * deadline represents the unix timestamp to complete the swap by
   * </pre>
   *
   * <code>int64 deadline = 5 [json_name = "deadline"];</code>
   * @return The deadline.
   */
  long getDeadline();
}
