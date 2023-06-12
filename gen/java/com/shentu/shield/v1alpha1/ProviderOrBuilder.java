// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/shield/v1alpha1/shield.proto

package com.shentu.shield.v1alpha1;

public interface ProviderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:shentu.shield.v1alpha1.Provider)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Address is the address of the provider.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * Address is the address of the provider.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * DelegationBonded is the amount of bonded delegation.
   * </pre>
   *
   * <code>string delegation_bonded = 2 [json_name = "delegationBonded", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"provider&#92;""];</code>
   * @return The delegationBonded.
   */
  java.lang.String getDelegationBonded();
  /**
   * <pre>
   * DelegationBonded is the amount of bonded delegation.
   * </pre>
   *
   * <code>string delegation_bonded = 2 [json_name = "delegationBonded", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"provider&#92;""];</code>
   * @return The bytes for delegationBonded.
   */
  com.google.protobuf.ByteString
      getDelegationBondedBytes();

  /**
   * <pre>
   * Collateral is amount of all collaterals for the provider, including
   * those in withdraw queue but excluding those currently locked, in all
   * pools.
   * </pre>
   *
   * <code>string collateral = 3 [json_name = "collateral", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral&#92;""];</code>
   * @return The collateral.
   */
  java.lang.String getCollateral();
  /**
   * <pre>
   * Collateral is amount of all collaterals for the provider, including
   * those in withdraw queue but excluding those currently locked, in all
   * pools.
   * </pre>
   *
   * <code>string collateral = 3 [json_name = "collateral", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral&#92;""];</code>
   * @return The bytes for collateral.
   */
  com.google.protobuf.ByteString
      getCollateralBytes();

  /**
   * <pre>
   * TotalLocked is the amount locked for pending claims.
   * </pre>
   *
   * <code>string total_locked = 4 [json_name = "totalLocked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"total_locked&#92;""];</code>
   * @return The totalLocked.
   */
  java.lang.String getTotalLocked();
  /**
   * <pre>
   * TotalLocked is the amount locked for pending claims.
   * </pre>
   *
   * <code>string total_locked = 4 [json_name = "totalLocked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"total_locked&#92;""];</code>
   * @return The bytes for totalLocked.
   */
  com.google.protobuf.ByteString
      getTotalLockedBytes();

  /**
   * <pre>
   * Withdrawing is the amount of collateral in withdraw queues.
   * </pre>
   *
   * <code>string withdrawing = 5 [json_name = "withdrawing", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"withdrawing&#92;""];</code>
   * @return The withdrawing.
   */
  java.lang.String getWithdrawing();
  /**
   * <pre>
   * Withdrawing is the amount of collateral in withdraw queues.
   * </pre>
   *
   * <code>string withdrawing = 5 [json_name = "withdrawing", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"withdrawing&#92;""];</code>
   * @return The bytes for withdrawing.
   */
  com.google.protobuf.ByteString
      getWithdrawingBytes();

  /**
   * <pre>
   * Rewards is the pooling rewards to be collected.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 6 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.DecCoin> 
      getRewardsList();
  /**
   * <pre>
   * Rewards is the pooling rewards to be collected.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 6 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  com.cosmos.base.v1beta1.DecCoin getRewards(int index);
  /**
   * <pre>
   * Rewards is the pooling rewards to be collected.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 6 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  int getRewardsCount();
  /**
   * <pre>
   * Rewards is the pooling rewards to be collected.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 6 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.DecCoinOrBuilder> 
      getRewardsOrBuilderList();
  /**
   * <pre>
   * Rewards is the pooling rewards to be collected.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 6 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  com.cosmos.base.v1beta1.DecCoinOrBuilder getRewardsOrBuilder(
      int index);
}
