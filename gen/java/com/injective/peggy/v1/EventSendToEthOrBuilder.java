// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/events.proto

package com.injective.peggy.v1;

public interface EventSendToEthOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.peggy.v1.EventSendToEth)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 outgoing_tx_id = 1 [json_name = "outgoingTxId"];</code>
   * @return The outgoingTxId.
   */
  long getOutgoingTxId();

  /**
   * <code>string sender = 2 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 2 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>string receiver = 3 [json_name = "receiver"];</code>
   * @return The receiver.
   */
  java.lang.String getReceiver();
  /**
   * <code>string receiver = 3 [json_name = "receiver"];</code>
   * @return The bytes for receiver.
   */
  com.google.protobuf.ByteString
      getReceiverBytes();

  /**
   * <code>string amount = 4 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 4 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>string bridge_fee = 5 [json_name = "bridgeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The bridgeFee.
   */
  java.lang.String getBridgeFee();
  /**
   * <code>string bridge_fee = 5 [json_name = "bridgeFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The bytes for bridgeFee.
   */
  com.google.protobuf.ByteString
      getBridgeFeeBytes();
}
