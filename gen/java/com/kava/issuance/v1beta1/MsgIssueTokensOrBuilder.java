// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/issuance/v1beta1/tx.proto

package com.kava.issuance.v1beta1;

public interface MsgIssueTokensOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.issuance.v1beta1.MsgIssueTokens)
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
   * <code>.cosmos.base.v1beta1.Coin tokens = 2 [json_name = "tokens", (.gogoproto.nullable) = false];</code>
   * @return Whether the tokens field is set.
   */
  boolean hasTokens();
  /**
   * <code>.cosmos.base.v1beta1.Coin tokens = 2 [json_name = "tokens", (.gogoproto.nullable) = false];</code>
   * @return The tokens.
   */
  com.cosmos.base.v1beta1.Coin getTokens();
  /**
   * <code>.cosmos.base.v1beta1.Coin tokens = 2 [json_name = "tokens", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTokensOrBuilder();

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
