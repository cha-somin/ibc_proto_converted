// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: onomyprotocol/dao/v1/query.proto

package com.onomyprotocol.dao.v1;

public interface QueryTreasuryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:onomyprotocol.dao.v1.QueryTreasuryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getTreasuryBalanceList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getTreasuryBalance(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getTreasuryBalanceCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getTreasuryBalanceOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin treasury_balance = 1 [json_name = "treasuryBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"treasury_balance&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTreasuryBalanceOrBuilder(
      int index);
}
