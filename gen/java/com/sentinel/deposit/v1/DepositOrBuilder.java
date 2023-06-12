// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/deposit/v1/deposit.proto

package com.sentinel.deposit.v1;

public interface DepositOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sentinel.deposit.v1.Deposit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getCoinsList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getCoins(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getCoinsCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getCoinsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getCoinsOrBuilder(
      int index);
}
