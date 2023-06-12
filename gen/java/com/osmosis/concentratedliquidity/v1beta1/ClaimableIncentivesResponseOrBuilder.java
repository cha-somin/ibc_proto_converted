// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/concentrated-liquidity/query.proto

package com.osmosis.concentratedliquidity.v1beta1;

public interface ClaimableIncentivesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin claimable_incentives = 1 [json_name = "claimableIncentives", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimable_incentives&#92;""];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getClaimableIncentivesList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin claimable_incentives = 1 [json_name = "claimableIncentives", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimable_incentives&#92;""];</code>
   */
  com.cosmos.base.v1beta1.Coin getClaimableIncentives(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin claimable_incentives = 1 [json_name = "claimableIncentives", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimable_incentives&#92;""];</code>
   */
  int getClaimableIncentivesCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin claimable_incentives = 1 [json_name = "claimableIncentives", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimable_incentives&#92;""];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getClaimableIncentivesOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin claimable_incentives = 1 [json_name = "claimableIncentives", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimable_incentives&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getClaimableIncentivesOrBuilder(
      int index);

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin forfeited_incentives = 2 [json_name = "forfeitedIncentives", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"forfeited_incentives&#92;""];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getForfeitedIncentivesList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin forfeited_incentives = 2 [json_name = "forfeitedIncentives", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"forfeited_incentives&#92;""];</code>
   */
  com.cosmos.base.v1beta1.Coin getForfeitedIncentives(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin forfeited_incentives = 2 [json_name = "forfeitedIncentives", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"forfeited_incentives&#92;""];</code>
   */
  int getForfeitedIncentivesCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin forfeited_incentives = 2 [json_name = "forfeitedIncentives", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"forfeited_incentives&#92;""];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getForfeitedIncentivesOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin forfeited_incentives = 2 [json_name = "forfeitedIncentives", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"forfeited_incentives&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getForfeitedIncentivesOrBuilder(
      int index);
}
