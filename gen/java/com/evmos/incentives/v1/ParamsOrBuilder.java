// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/incentives/v1/genesis.proto

package com.evmos.incentives.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:evmos.incentives.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * enable_incentives is the parameter to enable incentives
   * </pre>
   *
   * <code>bool enable_incentives = 1 [json_name = "enableIncentives"];</code>
   * @return The enableIncentives.
   */
  boolean getEnableIncentives();

  /**
   * <pre>
   * allocation_limit is the maximum percentage an incentive can allocate per denomination
   * </pre>
   *
   * <code>string allocation_limit = 2 [json_name = "allocationLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The allocationLimit.
   */
  java.lang.String getAllocationLimit();
  /**
   * <pre>
   * allocation_limit is the maximum percentage an incentive can allocate per denomination
   * </pre>
   *
   * <code>string allocation_limit = 2 [json_name = "allocationLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for allocationLimit.
   */
  com.google.protobuf.ByteString
      getAllocationLimitBytes();

  /**
   * <pre>
   * incentives_epoch_identifier for the epochs module hooks
   * </pre>
   *
   * <code>string incentives_epoch_identifier = 3 [json_name = "incentivesEpochIdentifier"];</code>
   * @return The incentivesEpochIdentifier.
   */
  java.lang.String getIncentivesEpochIdentifier();
  /**
   * <pre>
   * incentives_epoch_identifier for the epochs module hooks
   * </pre>
   *
   * <code>string incentives_epoch_identifier = 3 [json_name = "incentivesEpochIdentifier"];</code>
   * @return The bytes for incentivesEpochIdentifier.
   */
  com.google.protobuf.ByteString
      getIncentivesEpochIdentifierBytes();

  /**
   * <pre>
   * reward_scaler is the scaling factor for capping rewards
   * </pre>
   *
   * <code>string reward_scaler = 4 [json_name = "rewardScaler", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The rewardScaler.
   */
  java.lang.String getRewardScaler();
  /**
   * <pre>
   * reward_scaler is the scaling factor for capping rewards
   * </pre>
   *
   * <code>string reward_scaler = 4 [json_name = "rewardScaler", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for rewardScaler.
   */
  com.google.protobuf.ByteString
      getRewardScalerBytes();
}
