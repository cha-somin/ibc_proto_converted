// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/bank.proto

package com.cosmos.bank.v1beta1;

@java.lang.Deprecated public interface SupplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.Supply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total = 1 [json_name = "total", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getTotalList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total = 1 [json_name = "total", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.base.v1beta1.Coin getTotal(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total = 1 [json_name = "total", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  int getTotalCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total = 1 [json_name = "total", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getTotalOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total = 1 [json_name = "total", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTotalOrBuilder(
      int index);
}
