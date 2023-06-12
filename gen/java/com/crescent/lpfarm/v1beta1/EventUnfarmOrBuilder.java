// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/lpfarm/v1beta1/events.proto

package com.crescent.lpfarm.v1beta1;

public interface EventUnfarmOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.lpfarm.v1beta1.EventUnfarm)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string farmer = 1 [json_name = "farmer"];</code>
   * @return The farmer.
   */
  java.lang.String getFarmer();
  /**
   * <code>string farmer = 1 [json_name = "farmer"];</code>
   * @return The bytes for farmer.
   */
  com.google.protobuf.ByteString
      getFarmerBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin coin = 2 [json_name = "coin", (.gogoproto.nullable) = false];</code>
   * @return Whether the coin field is set.
   */
  boolean hasCoin();
  /**
   * <code>.cosmos.base.v1beta1.Coin coin = 2 [json_name = "coin", (.gogoproto.nullable) = false];</code>
   * @return The coin.
   */
  com.cosmos.base.v1beta1.Coin getCoin();
  /**
   * <code>.cosmos.base.v1beta1.Coin coin = 2 [json_name = "coin", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getCoinOrBuilder();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin withdrawn_rewards = 3 [json_name = "withdrawnRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getWithdrawnRewardsList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin withdrawn_rewards = 3 [json_name = "withdrawnRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getWithdrawnRewards(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin withdrawn_rewards = 3 [json_name = "withdrawnRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getWithdrawnRewardsCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin withdrawn_rewards = 3 [json_name = "withdrawnRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getWithdrawnRewardsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin withdrawn_rewards = 3 [json_name = "withdrawnRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getWithdrawnRewardsOrBuilder(
      int index);
}
