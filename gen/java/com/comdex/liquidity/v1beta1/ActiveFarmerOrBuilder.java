// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/liquidity.proto

package com.comdex.liquidity.v1beta1;

public interface ActiveFarmerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidity.v1beta1.ActiveFarmer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 app_id = 1 [json_name = "appId"];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <code>string farmer = 3 [json_name = "farmer"];</code>
   * @return The farmer.
   */
  java.lang.String getFarmer();
  /**
   * <code>string farmer = 3 [json_name = "farmer"];</code>
   * @return The bytes for farmer.
   */
  com.google.protobuf.ByteString
      getFarmerBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin farmed_pool_coin = 4 [json_name = "farmedPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the farmedPoolCoin field is set.
   */
  boolean hasFarmedPoolCoin();
  /**
   * <code>.cosmos.base.v1beta1.Coin farmed_pool_coin = 4 [json_name = "farmedPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The farmedPoolCoin.
   */
  com.cosmos.base.v1beta1.Coin getFarmedPoolCoin();
  /**
   * <code>.cosmos.base.v1beta1.Coin farmed_pool_coin = 4 [json_name = "farmedPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getFarmedPoolCoinOrBuilder();
}
