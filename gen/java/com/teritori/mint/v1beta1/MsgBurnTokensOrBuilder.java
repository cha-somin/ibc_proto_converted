// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: teritori/mint/v1beta1/tx.proto

package com.teritori.mint.v1beta1;

public interface MsgBurnTokensOrBuilder extends
    // @@protoc_insertion_point(interface_extends:teritori.mint.v1beta1.MsgBurnTokens)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>repeated string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return A list containing the amount.
   */
  java.util.List<java.lang.String>
      getAmountList();
  /**
   * <code>repeated string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The count of amount.
   */
  int getAmountCount();
  /**
   * <code>repeated string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @param index The index of the element to return.
   * @return The amount at the given index.
   */
  java.lang.String getAmount(int index);
  /**
   * <code>repeated string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the amount at the given index.
   */
  com.google.protobuf.ByteString
      getAmountBytes(int index);
}
