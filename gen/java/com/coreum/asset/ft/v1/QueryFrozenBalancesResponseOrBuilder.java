// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/query.proto

package com.coreum.asset.ft.v1;

public interface QueryFrozenBalancesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:coreum.asset.ft.v1.QueryFrozenBalancesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 1 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 1 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 1 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();

  /**
   * <pre>
   * balances contains the frozen balances on the queried account
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balances = 2 [json_name = "balances", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getBalancesList();
  /**
   * <pre>
   * balances contains the frozen balances on the queried account
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balances = 2 [json_name = "balances", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getBalances(int index);
  /**
   * <pre>
   * balances contains the frozen balances on the queried account
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balances = 2 [json_name = "balances", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getBalancesCount();
  /**
   * <pre>
   * balances contains the frozen balances on the queried account
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balances = 2 [json_name = "balances", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getBalancesOrBuilderList();
  /**
   * <pre>
   * balances contains the frozen balances on the queried account
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balances = 2 [json_name = "balances", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getBalancesOrBuilder(
      int index);
}
