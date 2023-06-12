// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/gamm/v1beta1/tx.proto

package com.osmosis.gamm.v1beta1;

public interface MsgExitSwapExternAmountOutOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut)
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
   * <code>uint64 pool_id = 2 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <code>.cosmos.base.v1beta1.Coin token_out = 3 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
   * @return Whether the tokenOut field is set.
   */
  boolean hasTokenOut();
  /**
   * <code>.cosmos.base.v1beta1.Coin token_out = 3 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
   * @return The tokenOut.
   */
  com.cosmos.base.v1beta1.Coin getTokenOut();
  /**
   * <code>.cosmos.base.v1beta1.Coin token_out = 3 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTokenOutOrBuilder();

  /**
   * <code>string share_in_max_amount = 4 [json_name = "shareInMaxAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"share_in_max_amount&#92;""];</code>
   * @return The shareInMaxAmount.
   */
  java.lang.String getShareInMaxAmount();
  /**
   * <code>string share_in_max_amount = 4 [json_name = "shareInMaxAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"share_in_max_amount&#92;""];</code>
   * @return The bytes for shareInMaxAmount.
   */
  com.google.protobuf.ByteString
      getShareInMaxAmountBytes();
}
