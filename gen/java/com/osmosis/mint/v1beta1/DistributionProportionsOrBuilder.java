// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/mint/v1beta1/mint.proto

package com.osmosis.mint.v1beta1;

public interface DistributionProportionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.mint.v1beta1.DistributionProportions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * staking defines the proportion of the minted mint_denom that is to be
   * allocated as staking rewards.
   * </pre>
   *
   * <code>string staking = 1 [json_name = "staking", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"staking&#92;""];</code>
   * @return The staking.
   */
  java.lang.String getStaking();
  /**
   * <pre>
   * staking defines the proportion of the minted mint_denom that is to be
   * allocated as staking rewards.
   * </pre>
   *
   * <code>string staking = 1 [json_name = "staking", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"staking&#92;""];</code>
   * @return The bytes for staking.
   */
  com.google.protobuf.ByteString
      getStakingBytes();

  /**
   * <pre>
   * pool_incentives defines the proportion of the minted mint_denom that is
   * to be allocated as pool incentives.
   * </pre>
   *
   * <code>string pool_incentives = 2 [json_name = "poolIncentives", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"pool_incentives&#92;""];</code>
   * @return The poolIncentives.
   */
  java.lang.String getPoolIncentives();
  /**
   * <pre>
   * pool_incentives defines the proportion of the minted mint_denom that is
   * to be allocated as pool incentives.
   * </pre>
   *
   * <code>string pool_incentives = 2 [json_name = "poolIncentives", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"pool_incentives&#92;""];</code>
   * @return The bytes for poolIncentives.
   */
  com.google.protobuf.ByteString
      getPoolIncentivesBytes();

  /**
   * <pre>
   * developer_rewards defines the proportion of the minted mint_denom that is
   * to be allocated to developer rewards address.
   * </pre>
   *
   * <code>string developer_rewards = 3 [json_name = "developerRewards", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"developer_rewards&#92;""];</code>
   * @return The developerRewards.
   */
  java.lang.String getDeveloperRewards();
  /**
   * <pre>
   * developer_rewards defines the proportion of the minted mint_denom that is
   * to be allocated to developer rewards address.
   * </pre>
   *
   * <code>string developer_rewards = 3 [json_name = "developerRewards", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"developer_rewards&#92;""];</code>
   * @return The bytes for developerRewards.
   */
  com.google.protobuf.ByteString
      getDeveloperRewardsBytes();

  /**
   * <pre>
   * community_pool defines the proportion of the minted mint_denom that is
   * to be allocated to the community pool.
   * </pre>
   *
   * <code>string community_pool = 4 [json_name = "communityPool", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"community_pool&#92;""];</code>
   * @return The communityPool.
   */
  java.lang.String getCommunityPool();
  /**
   * <pre>
   * community_pool defines the proportion of the minted mint_denom that is
   * to be allocated to the community pool.
   * </pre>
   *
   * <code>string community_pool = 4 [json_name = "communityPool", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"community_pool&#92;""];</code>
   * @return The bytes for communityPool.
   */
  com.google.protobuf.ByteString
      getCommunityPoolBytes();
}
