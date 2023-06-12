// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/incentive/v1/genesis.proto

package com.umee.incentive.v1;

public interface RewardTrackerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.incentive.v1.RewardTracker)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string account = 1 [json_name = "account"];</code>
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   * <code>string account = 1 [json_name = "account"];</code>
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <code>string uToken = 2 [json_name = "uToken"];</code>
   * @return The uToken.
   */
  java.lang.String getUToken();
  /**
   * <code>string uToken = 2 [json_name = "uToken"];</code>
   * @return The bytes for uToken.
   */
  com.google.protobuf.ByteString
      getUTokenBytes();

  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 3 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.DecCoin> 
      getRewardsList();
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 3 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  com.cosmos.base.v1beta1.DecCoin getRewards(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 3 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  int getRewardsCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 3 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.DecCoinOrBuilder> 
      getRewardsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 3 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  com.cosmos.base.v1beta1.DecCoinOrBuilder getRewardsOrBuilder(
      int index);
}
