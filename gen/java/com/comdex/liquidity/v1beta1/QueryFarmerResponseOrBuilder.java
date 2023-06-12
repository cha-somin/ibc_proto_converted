// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/query.proto

package com.comdex.liquidity.v1beta1;

public interface QueryFarmerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidity.v1beta1.QueryFarmerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.base.v1beta1.Coin active_pool_coin = 1 [json_name = "activePoolCoin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the activePoolCoin field is set.
   */
  boolean hasActivePoolCoin();
  /**
   * <code>.cosmos.base.v1beta1.Coin active_pool_coin = 1 [json_name = "activePoolCoin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The activePoolCoin.
   */
  com.cosmos.base.v1beta1.Coin getActivePoolCoin();
  /**
   * <code>.cosmos.base.v1beta1.Coin active_pool_coin = 1 [json_name = "activePoolCoin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getActivePoolCoinOrBuilder();

  /**
   * <code>repeated .comdex.liquidity.v1beta1.QueuedPoolCoin queued_pool_coin = 2 [json_name = "queuedPoolCoin", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.comdex.liquidity.v1beta1.QueuedPoolCoin> 
      getQueuedPoolCoinList();
  /**
   * <code>repeated .comdex.liquidity.v1beta1.QueuedPoolCoin queued_pool_coin = 2 [json_name = "queuedPoolCoin", (.gogoproto.nullable) = false];</code>
   */
  com.comdex.liquidity.v1beta1.QueuedPoolCoin getQueuedPoolCoin(int index);
  /**
   * <code>repeated .comdex.liquidity.v1beta1.QueuedPoolCoin queued_pool_coin = 2 [json_name = "queuedPoolCoin", (.gogoproto.nullable) = false];</code>
   */
  int getQueuedPoolCoinCount();
  /**
   * <code>repeated .comdex.liquidity.v1beta1.QueuedPoolCoin queued_pool_coin = 2 [json_name = "queuedPoolCoin", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.comdex.liquidity.v1beta1.QueuedPoolCoinOrBuilder> 
      getQueuedPoolCoinOrBuilderList();
  /**
   * <code>repeated .comdex.liquidity.v1beta1.QueuedPoolCoin queued_pool_coin = 2 [json_name = "queuedPoolCoin", (.gogoproto.nullable) = false];</code>
   */
  com.comdex.liquidity.v1beta1.QueuedPoolCoinOrBuilder getQueuedPoolCoinOrBuilder(
      int index);
}
