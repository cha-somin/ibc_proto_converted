// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/interchainqueries/params.proto

package com.neutron.interchainqueries;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:neutron.interchainqueries.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Defines amount of blocks required before query becomes available for
   * removal by anybody
   * </pre>
   *
   * <code>uint64 query_submit_timeout = 1 [json_name = "querySubmitTimeout"];</code>
   * @return The querySubmitTimeout.
   */
  long getQuerySubmitTimeout();

  /**
   * <pre>
   * Amount of coins deposited for the query.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin query_deposit = 2 [json_name = "queryDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getQueryDepositList();
  /**
   * <pre>
   * Amount of coins deposited for the query.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin query_deposit = 2 [json_name = "queryDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getQueryDeposit(int index);
  /**
   * <pre>
   * Amount of coins deposited for the query.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin query_deposit = 2 [json_name = "queryDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getQueryDepositCount();
  /**
   * <pre>
   * Amount of coins deposited for the query.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin query_deposit = 2 [json_name = "queryDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getQueryDepositOrBuilderList();
  /**
   * <pre>
   * Amount of coins deposited for the query.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin query_deposit = 2 [json_name = "queryDeposit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getQueryDepositOrBuilder(
      int index);

  /**
   * <pre>
   * Amount of tx hashes to be removed during a single EndBlock. Can vary to
   * balance between network cleaning speed and EndBlock duration. A zero value
   * means no limit.
   * </pre>
   *
   * <code>uint64 tx_query_removal_limit = 3 [json_name = "txQueryRemovalLimit"];</code>
   * @return The txQueryRemovalLimit.
   */
  long getTxQueryRemovalLimit();
}
