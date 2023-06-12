// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/liquidfarming/v1beta1/tx.proto

package com.crescent.liquidfarming.v1beta1;

public interface MsgLiquidFarmOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.liquidfarming.v1beta1.MsgLiquidFarm)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <code>string farmer = 2 [json_name = "farmer"];</code>
   * @return The farmer.
   */
  java.lang.String getFarmer();
  /**
   * <code>string farmer = 2 [json_name = "farmer"];</code>
   * @return The bytes for farmer.
   */
  com.google.protobuf.ByteString
      getFarmerBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin farming_coin = 3 [json_name = "farmingCoin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the farmingCoin field is set.
   */
  boolean hasFarmingCoin();
  /**
   * <code>.cosmos.base.v1beta1.Coin farming_coin = 3 [json_name = "farmingCoin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The farmingCoin.
   */
  com.cosmos.base.v1beta1.Coin getFarmingCoin();
  /**
   * <code>.cosmos.base.v1beta1.Coin farming_coin = 3 [json_name = "farmingCoin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getFarmingCoinOrBuilder();
}
