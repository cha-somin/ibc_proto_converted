// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/vesting/vesting.proto

package com.stride.vesting;

public interface PeriodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.vesting.Period)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 start_time = 1 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  long getStartTime();

  /**
   * <code>int64 length = 2 [json_name = "length"];</code>
   * @return The length.
   */
  long getLength();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getAmountList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getAmount(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getAmountCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getAmountOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder(
      int index);

  /**
   * <code>int32 action_type = 4 [json_name = "actionType"];</code>
   * @return The actionType.
   */
  int getActionType();
}
