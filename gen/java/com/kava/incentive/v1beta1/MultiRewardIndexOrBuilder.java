// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/incentive/v1beta1/claims.proto

package com.kava.incentive.v1beta1;

public interface MultiRewardIndexOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.incentive.v1beta1.MultiRewardIndex)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string collateral_type = 1 [json_name = "collateralType"];</code>
   * @return The collateralType.
   */
  java.lang.String getCollateralType();
  /**
   * <code>string collateral_type = 1 [json_name = "collateralType"];</code>
   * @return The bytes for collateralType.
   */
  com.google.protobuf.ByteString
      getCollateralTypeBytes();

  /**
   * <code>repeated .kava.incentive.v1beta1.RewardIndex reward_indexes = 2 [json_name = "rewardIndexes", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "RewardIndexes"];</code>
   */
  java.util.List<com.kava.incentive.v1beta1.RewardIndex> 
      getRewardIndexesList();
  /**
   * <code>repeated .kava.incentive.v1beta1.RewardIndex reward_indexes = 2 [json_name = "rewardIndexes", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "RewardIndexes"];</code>
   */
  com.kava.incentive.v1beta1.RewardIndex getRewardIndexes(int index);
  /**
   * <code>repeated .kava.incentive.v1beta1.RewardIndex reward_indexes = 2 [json_name = "rewardIndexes", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "RewardIndexes"];</code>
   */
  int getRewardIndexesCount();
  /**
   * <code>repeated .kava.incentive.v1beta1.RewardIndex reward_indexes = 2 [json_name = "rewardIndexes", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "RewardIndexes"];</code>
   */
  java.util.List<? extends com.kava.incentive.v1beta1.RewardIndexOrBuilder> 
      getRewardIndexesOrBuilderList();
  /**
   * <code>repeated .kava.incentive.v1beta1.RewardIndex reward_indexes = 2 [json_name = "rewardIndexes", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "RewardIndexes"];</code>
   */
  com.kava.incentive.v1beta1.RewardIndexOrBuilder getRewardIndexesOrBuilder(
      int index);
}
