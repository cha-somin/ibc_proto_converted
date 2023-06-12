// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/bridge/tx.proto

package com.stafihub.stafihub.bridge;

public interface MsgDepositOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.bridge.MsgDeposit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>uint32 destChainId = 2 [json_name = "destChainId", (.gogoproto.jsontag) = "destChainId"];</code>
   * @return The destChainId.
   */
  int getDestChainId();

  /**
   * <code>string denom = 3 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 3 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string amount = 4 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 4 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>string receiver = 5 [json_name = "receiver"];</code>
   * @return The receiver.
   */
  java.lang.String getReceiver();
  /**
   * <code>string receiver = 5 [json_name = "receiver"];</code>
   * @return The bytes for receiver.
   */
  com.google.protobuf.ByteString
      getReceiverBytes();
}
