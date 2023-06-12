// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/marketmaker/v1beta1/marketmaker.proto

package com.crescent.marketmaker.v1beta1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.marketmaker.v1beta1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Address containing the funds used to distribute incentives
   * </pre>
   *
   * <code>string incentive_budget_address = 1 [json_name = "incentiveBudgetAddress", (.gogoproto.moretags) = "yaml:&#92;"incentive_budget_address&#92;""];</code>
   * @return The incentiveBudgetAddress.
   */
  java.lang.String getIncentiveBudgetAddress();
  /**
   * <pre>
   * Address containing the funds used to distribute incentives
   * </pre>
   *
   * <code>string incentive_budget_address = 1 [json_name = "incentiveBudgetAddress", (.gogoproto.moretags) = "yaml:&#92;"incentive_budget_address&#92;""];</code>
   * @return The bytes for incentiveBudgetAddress.
   */
  com.google.protobuf.ByteString
      getIncentiveBudgetAddressBytes();

  /**
   * <pre>
   * The amount of deposit to be applied to the market maker, which is calculated per pair and is refunded when the
   * market maker included or rejected through the MarketMaker Proposal
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin deposit_amount = 2 [json_name = "depositAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getDepositAmountList();
  /**
   * <pre>
   * The amount of deposit to be applied to the market maker, which is calculated per pair and is refunded when the
   * market maker included or rejected through the MarketMaker Proposal
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin deposit_amount = 2 [json_name = "depositAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getDepositAmount(int index);
  /**
   * <pre>
   * The amount of deposit to be applied to the market maker, which is calculated per pair and is refunded when the
   * market maker included or rejected through the MarketMaker Proposal
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin deposit_amount = 2 [json_name = "depositAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getDepositAmountCount();
  /**
   * <pre>
   * The amount of deposit to be applied to the market maker, which is calculated per pair and is refunded when the
   * market maker included or rejected through the MarketMaker Proposal
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin deposit_amount = 2 [json_name = "depositAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getDepositAmountOrBuilderList();
  /**
   * <pre>
   * The amount of deposit to be applied to the market maker, which is calculated per pair and is refunded when the
   * market maker included or rejected through the MarketMaker Proposal
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin deposit_amount = 2 [json_name = "depositAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getDepositAmountOrBuilder(
      int index);

  /**
   * <pre>
   * Common variables used in market maker scoring system
   * </pre>
   *
   * <code>.crescent.marketmaker.v1beta1.Common common = 3 [json_name = "common", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"common&#92;""];</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <pre>
   * Common variables used in market maker scoring system
   * </pre>
   *
   * <code>.crescent.marketmaker.v1beta1.Common common = 3 [json_name = "common", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"common&#92;""];</code>
   * @return The common.
   */
  com.crescent.marketmaker.v1beta1.Common getCommon();
  /**
   * <pre>
   * Common variables used in market maker scoring system
   * </pre>
   *
   * <code>.crescent.marketmaker.v1beta1.Common common = 3 [json_name = "common", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"common&#92;""];</code>
   */
  com.crescent.marketmaker.v1beta1.CommonOrBuilder getCommonOrBuilder();

  /**
   * <pre>
   * Include the pairs that are incentive target pairs and the variables used in market maker scoring system
   * </pre>
   *
   * <code>repeated .crescent.marketmaker.v1beta1.IncentivePair incentive_pairs = 4 [json_name = "incentivePairs", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"incentive_pairs&#92;""];</code>
   */
  java.util.List<com.crescent.marketmaker.v1beta1.IncentivePair> 
      getIncentivePairsList();
  /**
   * <pre>
   * Include the pairs that are incentive target pairs and the variables used in market maker scoring system
   * </pre>
   *
   * <code>repeated .crescent.marketmaker.v1beta1.IncentivePair incentive_pairs = 4 [json_name = "incentivePairs", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"incentive_pairs&#92;""];</code>
   */
  com.crescent.marketmaker.v1beta1.IncentivePair getIncentivePairs(int index);
  /**
   * <pre>
   * Include the pairs that are incentive target pairs and the variables used in market maker scoring system
   * </pre>
   *
   * <code>repeated .crescent.marketmaker.v1beta1.IncentivePair incentive_pairs = 4 [json_name = "incentivePairs", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"incentive_pairs&#92;""];</code>
   */
  int getIncentivePairsCount();
  /**
   * <pre>
   * Include the pairs that are incentive target pairs and the variables used in market maker scoring system
   * </pre>
   *
   * <code>repeated .crescent.marketmaker.v1beta1.IncentivePair incentive_pairs = 4 [json_name = "incentivePairs", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"incentive_pairs&#92;""];</code>
   */
  java.util.List<? extends com.crescent.marketmaker.v1beta1.IncentivePairOrBuilder> 
      getIncentivePairsOrBuilderList();
  /**
   * <pre>
   * Include the pairs that are incentive target pairs and the variables used in market maker scoring system
   * </pre>
   *
   * <code>repeated .crescent.marketmaker.v1beta1.IncentivePair incentive_pairs = 4 [json_name = "incentivePairs", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"incentive_pairs&#92;""];</code>
   */
  com.crescent.marketmaker.v1beta1.IncentivePairOrBuilder getIncentivePairsOrBuilder(
      int index);
}
