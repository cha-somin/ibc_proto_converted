// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/bank.proto

package com.cosmos.bank.v1beta1;

public interface InputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.Input)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getCoinsList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.base.v1beta1.Coin getCoins(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  int getCoinsCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getCoinsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getCoinsOrBuilder(
      int index);
}
