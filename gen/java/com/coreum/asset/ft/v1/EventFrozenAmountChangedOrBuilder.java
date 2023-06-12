// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/event.proto

package com.coreum.asset.ft.v1;

public interface EventFrozenAmountChangedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:coreum.asset.ft.v1.EventFrozenAmountChanged)
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
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string previous_amount = 3 [json_name = "previousAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The previousAmount.
   */
  java.lang.String getPreviousAmount();
  /**
   * <code>string previous_amount = 3 [json_name = "previousAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for previousAmount.
   */
  com.google.protobuf.ByteString
      getPreviousAmountBytes();

  /**
   * <code>string current_amount = 4 [json_name = "currentAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The currentAmount.
   */
  java.lang.String getCurrentAmount();
  /**
   * <code>string current_amount = 4 [json_name = "currentAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for currentAmount.
   */
  com.google.protobuf.ByteString
      getCurrentAmountBytes();
}
