// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/poolmanager/v1beta1/query.proto

package com.osmosis.poolmanager.v1beta1;

public interface TotalPoolLiquidityResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.poolmanager.v1beta1.TotalPoolLiquidityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin liquidity = 1 [json_name = "liquidity", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"liquidity&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getLiquidityList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin liquidity = 1 [json_name = "liquidity", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"liquidity&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getLiquidity(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin liquidity = 1 [json_name = "liquidity", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"liquidity&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getLiquidityCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin liquidity = 1 [json_name = "liquidity", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"liquidity&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getLiquidityOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin liquidity = 1 [json_name = "liquidity", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"liquidity&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getLiquidityOrBuilder(
      int index);
}
