// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/query.proto

package com.comdex.liquidity.v1beta1;

public interface QueuedPoolCoinOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidity.v1beta1.QueuedPoolCoin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.base.v1beta1.Coin pool_coin = 1 [json_name = "poolCoin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the poolCoin field is set.
   */
  boolean hasPoolCoin();
  /**
   * <code>.cosmos.base.v1beta1.Coin pool_coin = 1 [json_name = "poolCoin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The poolCoin.
   */
  com.cosmos.base.v1beta1.Coin getPoolCoin();
  /**
   * <code>.cosmos.base.v1beta1.Coin pool_coin = 1 [json_name = "poolCoin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getPoolCoinOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp deque_at = 2 [json_name = "dequeAt", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deque_at&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the dequeAt field is set.
   */
  boolean hasDequeAt();
  /**
   * <code>.google.protobuf.Timestamp deque_at = 2 [json_name = "dequeAt", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deque_at&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The dequeAt.
   */
  com.google.protobuf.Timestamp getDequeAt();
  /**
   * <code>.google.protobuf.Timestamp deque_at = 2 [json_name = "dequeAt", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deque_at&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDequeAtOrBuilder();
}
