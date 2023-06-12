// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rmintreward/models.proto

package com.stafihub.stafihub.rmintreward;

public interface TokenRewardInfoPostOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.rmintreward.TokenRewardInfoPost)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string rewardRate = 2 [json_name = "rewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The rewardRate.
   */
  java.lang.String getRewardRate();
  /**
   * <code>string rewardRate = 2 [json_name = "rewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for rewardRate.
   */
  com.google.protobuf.ByteString
      getRewardRateBytes();

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
   * <code>string userLimit = 5 [json_name = "userLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The userLimit.
   */
  java.lang.String getUserLimit();
  /**
   * <code>string userLimit = 5 [json_name = "userLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for userLimit.
   */
  com.google.protobuf.ByteString
      getUserLimitBytes();
}
