// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/lpfarm/v1beta1/tx.proto

package com.crescent.lpfarm.v1beta1;

public interface MsgFarmResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.lpfarm.v1beta1.MsgFarmResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin withdrawn_rewards = 1 [json_name = "withdrawnRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getWithdrawnRewardsList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin withdrawn_rewards = 1 [json_name = "withdrawnRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getWithdrawnRewards(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin withdrawn_rewards = 1 [json_name = "withdrawnRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getWithdrawnRewardsCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin withdrawn_rewards = 1 [json_name = "withdrawnRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getWithdrawnRewardsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin withdrawn_rewards = 1 [json_name = "withdrawnRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getWithdrawnRewardsOrBuilder(
      int index);
}
