// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/farm/tx.proto

package com.irismod.farm;

public interface MsgStakeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.farm.MsgStakeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin reward = 2 [json_name = "reward", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getRewardList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin reward = 2 [json_name = "reward", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getReward(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin reward = 2 [json_name = "reward", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getRewardCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin reward = 2 [json_name = "reward", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getRewardOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin reward = 2 [json_name = "reward", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getRewardOrBuilder(
      int index);
}
