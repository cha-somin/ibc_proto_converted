// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/mining/models.proto

package com.stafihub.stafihub.mining;

public interface RewardPoolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.mining.RewardPool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 index = 1 [json_name = "index"];</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <code>string rewardTokenDenom = 2 [json_name = "rewardTokenDenom"];</code>
   * @return The rewardTokenDenom.
   */
  java.lang.String getRewardTokenDenom();
  /**
   * <code>string rewardTokenDenom = 2 [json_name = "rewardTokenDenom"];</code>
   * @return The bytes for rewardTokenDenom.
   */
  com.google.protobuf.ByteString
      getRewardTokenDenomBytes();

  /**
   * <code>string totalRewardAmount = 3 [json_name = "totalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The totalRewardAmount.
   */
  java.lang.String getTotalRewardAmount();
  /**
   * <code>string totalRewardAmount = 3 [json_name = "totalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for totalRewardAmount.
   */
  com.google.protobuf.ByteString
      getTotalRewardAmountBytes();

  /**
   * <code>string leftRewardAmount = 4 [json_name = "leftRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The leftRewardAmount.
   */
  java.lang.String getLeftRewardAmount();
  /**
   * <code>string leftRewardAmount = 4 [json_name = "leftRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for leftRewardAmount.
   */
  com.google.protobuf.ByteString
      getLeftRewardAmountBytes();

  /**
   * <code>string rewardPerSecond = 5 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The rewardPerSecond.
   */
  java.lang.String getRewardPerSecond();
  /**
   * <code>string rewardPerSecond = 5 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for rewardPerSecond.
   */
  com.google.protobuf.ByteString
      getRewardPerSecondBytes();

  /**
   * <code>uint64 startTimestamp = 6 [json_name = "startTimestamp"];</code>
   * @return The startTimestamp.
   */
  long getStartTimestamp();

  /**
   * <code>string rewardPerPower = 7 [json_name = "rewardPerPower", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The rewardPerPower.
   */
  java.lang.String getRewardPerPower();
  /**
   * <code>string rewardPerPower = 7 [json_name = "rewardPerPower", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for rewardPerPower.
   */
  com.google.protobuf.ByteString
      getRewardPerPowerBytes();

  /**
   * <code>uint64 lastRewardTimestamp = 8 [json_name = "lastRewardTimestamp"];</code>
   * @return The lastRewardTimestamp.
   */
  long getLastRewardTimestamp();

  /**
   * <code>string creator = 9 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 9 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>string totalClaimedAmount = 10 [json_name = "totalClaimedAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The totalClaimedAmount.
   */
  java.lang.String getTotalClaimedAmount();
  /**
   * <code>string totalClaimedAmount = 10 [json_name = "totalClaimedAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for totalClaimedAmount.
   */
  com.google.protobuf.ByteString
      getTotalClaimedAmountBytes();
}
