// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package com.cosmos.staking.v1beta1;

public interface MsgUndelegateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.MsgUndelegateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true, (.amino.dont_omitempty) = true];</code>
   * @return Whether the completionTime field is set.
   */
  boolean hasCompletionTime();
  /**
   * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true, (.amino.dont_omitempty) = true];</code>
   * @return The completionTime.
   */
  com.google.protobuf.Timestamp getCompletionTime();
  /**
   * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true, (.amino.dont_omitempty) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCompletionTimeOrBuilder();

  /**
   * <pre>
   * amount returns the amount of undelegated coins
   *
   * Since: cosmos-sdk 0.50
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <pre>
   * amount returns the amount of undelegated coins
   *
   * Since: cosmos-sdk 0.50
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <pre>
   * amount returns the amount of undelegated coins
   *
   * Since: cosmos-sdk 0.50
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();
}
