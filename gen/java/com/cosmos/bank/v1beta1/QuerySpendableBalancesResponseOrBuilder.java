// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package com.cosmos.bank.v1beta1;

public interface QuerySpendableBalancesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.QuerySpendableBalancesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * balances is the spendable balances of all the coins.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [json_name = "balances", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getBalancesList();
  /**
   * <pre>
   * balances is the spendable balances of all the coins.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [json_name = "balances", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.base.v1beta1.Coin getBalances(int index);
  /**
   * <pre>
   * balances is the spendable balances of all the coins.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [json_name = "balances", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  int getBalancesCount();
  /**
   * <pre>
   * balances is the spendable balances of all the coins.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [json_name = "balances", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getBalancesOrBuilderList();
  /**
   * <pre>
   * balances is the spendable balances of all the coins.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [json_name = "balances", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getBalancesOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
