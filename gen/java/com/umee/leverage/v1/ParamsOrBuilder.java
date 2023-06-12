// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/leverage/v1/leverage.proto

package com.umee.leverage.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.leverage.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Complete Liquidation Threshold determines how far between
   * liquidation_threshold (LT) and collateral_value (CV) a borrower's
   * borrowed value must have progressed in order to allow a full liquidation.
   * 0.3 indicates 30% of the way from LT to CV.
   * See also `minimum_close_factor` for more information.
   * Valid values: 0-1.
   * </pre>
   *
   * <code>string complete_liquidation_threshold = 2 [json_name = "completeLiquidationThreshold", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"complete_liquidation_threshold&#92;""];</code>
   * @return The completeLiquidationThreshold.
   */
  java.lang.String getCompleteLiquidationThreshold();
  /**
   * <pre>
   * Complete Liquidation Threshold determines how far between
   * liquidation_threshold (LT) and collateral_value (CV) a borrower's
   * borrowed value must have progressed in order to allow a full liquidation.
   * 0.3 indicates 30% of the way from LT to CV.
   * See also `minimum_close_factor` for more information.
   * Valid values: 0-1.
   * </pre>
   *
   * <code>string complete_liquidation_threshold = 2 [json_name = "completeLiquidationThreshold", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"complete_liquidation_threshold&#92;""];</code>
   * @return The bytes for completeLiquidationThreshold.
   */
  com.google.protobuf.ByteString
      getCompleteLiquidationThresholdBytes();

  /**
   * <pre>
   * Close Factor determines the portion of a borrower's position that can be
   * liquidated in a single event. Minimum Close Factor is Close Factor at
   * liquidation_threshold. 0.1 means that that 10% of the borrower position can
   * be liquidated when the borrowed value passes the liquidation_threshold.
   * close_factor scales linearly between minimum_close_factor and 1.0,
   * reaching its maximum when borrowed value passes
   * complete_liquidation_threshold. We can put it into the picture:
   *
   *             borrowed          CV := collateral
   *             value                   value
   *  --- | ------- | ----- | -------- | -------&gt;
   *     LV                 CL
   *
   * LV = liquidation value = liquidation_threshold * CV
   * CL = LV + (CV-LV) * complete_liquidation_threshold
   *    is the borrowed value above which close factor will be 1.
   *
   * Valid values: 0-1.
   * </pre>
   *
   * <code>string minimum_close_factor = 3 [json_name = "minimumCloseFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"minimum_close_factor&#92;""];</code>
   * @return The minimumCloseFactor.
   */
  java.lang.String getMinimumCloseFactor();
  /**
   * <pre>
   * Close Factor determines the portion of a borrower's position that can be
   * liquidated in a single event. Minimum Close Factor is Close Factor at
   * liquidation_threshold. 0.1 means that that 10% of the borrower position can
   * be liquidated when the borrowed value passes the liquidation_threshold.
   * close_factor scales linearly between minimum_close_factor and 1.0,
   * reaching its maximum when borrowed value passes
   * complete_liquidation_threshold. We can put it into the picture:
   *
   *             borrowed          CV := collateral
   *             value                   value
   *  --- | ------- | ----- | -------- | -------&gt;
   *     LV                 CL
   *
   * LV = liquidation value = liquidation_threshold * CV
   * CL = LV + (CV-LV) * complete_liquidation_threshold
   *    is the borrowed value above which close factor will be 1.
   *
   * Valid values: 0-1.
   * </pre>
   *
   * <code>string minimum_close_factor = 3 [json_name = "minimumCloseFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"minimum_close_factor&#92;""];</code>
   * @return The bytes for minimumCloseFactor.
   */
  com.google.protobuf.ByteString
      getMinimumCloseFactorBytes();

  /**
   * <pre>
   * Oracle Reward Factor determines the portion of interest accrued on
   * borrows that is sent to the oracle module to fund its reward pool.
   * Valid values: 0-1.
   * </pre>
   *
   * <code>string oracle_reward_factor = 4 [json_name = "oracleRewardFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"oracle_reward_factor&#92;""];</code>
   * @return The oracleRewardFactor.
   */
  java.lang.String getOracleRewardFactor();
  /**
   * <pre>
   * Oracle Reward Factor determines the portion of interest accrued on
   * borrows that is sent to the oracle module to fund its reward pool.
   * Valid values: 0-1.
   * </pre>
   *
   * <code>string oracle_reward_factor = 4 [json_name = "oracleRewardFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"oracle_reward_factor&#92;""];</code>
   * @return The bytes for oracleRewardFactor.
   */
  com.google.protobuf.ByteString
      getOracleRewardFactorBytes();

  /**
   * <pre>
   * Small Liquidation Size determines the USD value at which a borrow is
   * considered small enough to be liquidated in a single transaction, bypassing
   * dynamic close factor.
   * </pre>
   *
   * <code>string small_liquidation_size = 5 [json_name = "smallLiquidationSize", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"small_liquidation_size&#92;""];</code>
   * @return The smallLiquidationSize.
   */
  java.lang.String getSmallLiquidationSize();
  /**
   * <pre>
   * Small Liquidation Size determines the USD value at which a borrow is
   * considered small enough to be liquidated in a single transaction, bypassing
   * dynamic close factor.
   * </pre>
   *
   * <code>string small_liquidation_size = 5 [json_name = "smallLiquidationSize", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"small_liquidation_size&#92;""];</code>
   * @return The bytes for smallLiquidationSize.
   */
  com.google.protobuf.ByteString
      getSmallLiquidationSizeBytes();

  /**
   * <pre>
   * Direct Liquidation Fee is a reduction factor in liquidation incentive
   * experienced by liquidators who choose to receive base assets instead of
   * uTokens as liquidation rewards.
   * Valid values: 0-1.
   * </pre>
   *
   * <code>string direct_liquidation_fee = 6 [json_name = "directLiquidationFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"direct_liquidation_fee&#92;""];</code>
   * @return The directLiquidationFee.
   */
  java.lang.String getDirectLiquidationFee();
  /**
   * <pre>
   * Direct Liquidation Fee is a reduction factor in liquidation incentive
   * experienced by liquidators who choose to receive base assets instead of
   * uTokens as liquidation rewards.
   * Valid values: 0-1.
   * </pre>
   *
   * <code>string direct_liquidation_fee = 6 [json_name = "directLiquidationFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"direct_liquidation_fee&#92;""];</code>
   * @return The bytes for directLiquidationFee.
   */
  com.google.protobuf.ByteString
      getDirectLiquidationFeeBytes();
}
