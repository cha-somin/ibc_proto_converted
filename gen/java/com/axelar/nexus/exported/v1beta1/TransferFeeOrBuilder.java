// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/exported/v1beta1/types.proto

package com.axelar.nexus.exported.v1beta1;

public interface TransferFeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.nexus.exported.v1beta1.TransferFee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getCoinsList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getCoins(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getCoinsCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getCoinsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getCoinsOrBuilder(
      int index);
}
