// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/incentive/v1/tx.proto

package com.umee.incentive.v1;

public interface MsgEmergencyUnbondOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.incentive.v1.MsgEmergencyUnbond)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string account = 1 [json_name = "account"];</code>
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   * <code>string account = 1 [json_name = "account"];</code>
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin uToken = 2 [json_name = "uToken", (.gogoproto.nullable) = false];</code>
   * @return Whether the uToken field is set.
   */
  boolean hasUToken();
  /**
   * <code>.cosmos.base.v1beta1.Coin uToken = 2 [json_name = "uToken", (.gogoproto.nullable) = false];</code>
   * @return The uToken.
   */
  com.cosmos.base.v1beta1.Coin getUToken();
  /**
   * <code>.cosmos.base.v1beta1.Coin uToken = 2 [json_name = "uToken", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getUTokenOrBuilder();
}
