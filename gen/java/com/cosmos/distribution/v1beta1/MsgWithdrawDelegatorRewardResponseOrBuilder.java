// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package com.cosmos.distribution.v1beta1;

public interface MsgWithdrawDelegatorRewardResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Since: cosmos-sdk 0.46
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getAmountList();
  /**
   * <pre>
   * Since: cosmos-sdk 0.46
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.base.v1beta1.Coin getAmount(int index);
  /**
   * <pre>
   * Since: cosmos-sdk 0.46
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  int getAmountCount();
  /**
   * <pre>
   * Since: cosmos-sdk 0.46
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getAmountOrBuilderList();
  /**
   * <pre>
   * Since: cosmos-sdk 0.46
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins", (.amino.encoding) = "legacy_coins", (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder(
      int index);
}
