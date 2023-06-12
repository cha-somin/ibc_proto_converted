// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/lockup/tx.proto

package com.osmosis.lockup;

public interface MsgLockTokensOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.lockup.MsgLockTokens)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>.google.protobuf.Duration duration = 2 [json_name = "duration", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "duration,omitempty", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <code>.google.protobuf.Duration duration = 2 [json_name = "duration", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "duration,omitempty", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   * <code>.google.protobuf.Duration duration = 2 [json_name = "duration", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "duration,omitempty", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 3 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getCoinsList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 3 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getCoins(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 3 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getCoinsCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 3 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getCoinsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 3 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getCoinsOrBuilder(
      int index);
}
