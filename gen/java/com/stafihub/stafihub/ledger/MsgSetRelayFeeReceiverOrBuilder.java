// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/tx.proto

package com.stafihub.stafihub.ledger;

public interface MsgSetRelayFeeReceiverOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.ledger.MsgSetRelayFeeReceiver)
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
}
