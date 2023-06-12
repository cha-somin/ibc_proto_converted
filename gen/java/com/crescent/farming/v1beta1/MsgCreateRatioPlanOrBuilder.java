// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/farming/v1beta1/tx.proto

package com.crescent.farming.v1beta1;

public interface MsgCreateRatioPlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.farming.v1beta1.MsgCreateRatioPlan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name specifies the name for the plan
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name specifies the name for the plan
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * creator defines the bech32-encoded address of the creator for the private plan, termination address is also set to
   * this creator.
   * </pre>
   *
   * <code>string creator = 2 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <pre>
   * creator defines the bech32-encoded address of the creator for the private plan, termination address is also set to
   * this creator.
   * </pre>
   *
   * <code>string creator = 2 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <pre>
   * staking_coin_weights specifies coins weight for the plan
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin staking_coin_weights = 3 [json_name = "stakingCoinWeights", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coin_weights&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.DecCoin> 
      getStakingCoinWeightsList();
  /**
   * <pre>
   * staking_coin_weights specifies coins weight for the plan
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin staking_coin_weights = 3 [json_name = "stakingCoinWeights", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coin_weights&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  com.cosmos.base.v1beta1.DecCoin getStakingCoinWeights(int index);
  /**
   * <pre>
   * staking_coin_weights specifies coins weight for the plan
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin staking_coin_weights = 3 [json_name = "stakingCoinWeights", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coin_weights&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  int getStakingCoinWeightsCount();
  /**
   * <pre>
   * staking_coin_weights specifies coins weight for the plan
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin staking_coin_weights = 3 [json_name = "stakingCoinWeights", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coin_weights&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.DecCoinOrBuilder> 
      getStakingCoinWeightsOrBuilderList();
  /**
   * <pre>
   * staking_coin_weights specifies coins weight for the plan
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin staking_coin_weights = 3 [json_name = "stakingCoinWeights", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coin_weights&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  com.cosmos.base.v1beta1.DecCoinOrBuilder getStakingCoinWeightsOrBuilder(
      int index);

  /**
   * <pre>
   * start_time specifies the start time of the plan
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * start_time specifies the start time of the plan
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * start_time specifies the start time of the plan
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * end_time specifies the end time of the plan
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * end_time specifies the end time of the plan
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * end_time specifies the end time of the plan
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * epoch_ratio specifies the distributing amount by ratio
   * </pre>
   *
   * <code>string epoch_ratio = 6 [json_name = "epochRatio", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"epoch_ratio&#92;""];</code>
   * @return The epochRatio.
   */
  java.lang.String getEpochRatio();
  /**
   * <pre>
   * epoch_ratio specifies the distributing amount by ratio
   * </pre>
   *
   * <code>string epoch_ratio = 6 [json_name = "epochRatio", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"epoch_ratio&#92;""];</code>
   * @return The bytes for epochRatio.
   */
  com.google.protobuf.ByteString
      getEpochRatioBytes();
}
