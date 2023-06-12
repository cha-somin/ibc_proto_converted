// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/mining/tx.proto

package com.stafihub.stafihub.mining;

public interface MsgAddRewardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.mining.MsgAddReward)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>uint32 stakePoolIndex = 2 [json_name = "stakePoolIndex", (.gogoproto.jsontag) = "stakePoolIndex"];</code>
   * @return The stakePoolIndex.
   */
  int getStakePoolIndex();

  /**
   * <code>uint32 rewardPoolIndex = 3 [json_name = "rewardPoolIndex", (.gogoproto.jsontag) = "rewardPoolIndex"];</code>
   * @return The rewardPoolIndex.
   */
  int getRewardPoolIndex();

  /**
   * <code>string addAmount = 4 [json_name = "addAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The addAmount.
   */
  java.lang.String getAddAmount();
  /**
   * <code>string addAmount = 4 [json_name = "addAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for addAmount.
   */
  com.google.protobuf.ByteString
      getAddAmountBytes();

  /**
   * <code>uint64 startTimestamp = 5 [json_name = "startTimestamp", (.gogoproto.jsontag) = "startTimestamp"];</code>
   * @return The startTimestamp.
   */
  long getStartTimestamp();

  /**
   * <code>string rewardPerSecond = 6 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The rewardPerSecond.
   */
  java.lang.String getRewardPerSecond();
  /**
   * <code>string rewardPerSecond = 6 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for rewardPerSecond.
   */
  com.google.protobuf.ByteString
      getRewardPerSecondBytes();
}
