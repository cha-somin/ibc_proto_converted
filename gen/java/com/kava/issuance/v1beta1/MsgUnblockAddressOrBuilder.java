// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/issuance/v1beta1/tx.proto

package com.kava.issuance.v1beta1;

public interface MsgUnblockAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.issuance.v1beta1.MsgUnblockAddress)
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
   * <code>string blocked_address = 3 [json_name = "blockedAddress"];</code>
   * @return The blockedAddress.
   */
  java.lang.String getBlockedAddress();
  /**
   * <code>string blocked_address = 3 [json_name = "blockedAddress"];</code>
   * @return The bytes for blockedAddress.
   */
  com.google.protobuf.ByteString
      getBlockedAddressBytes();
}
