// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/tx.proto

package com.coreum.asset.ft.v1;

public interface MsgGloballyFreezeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:coreum.asset.ft.v1.MsgGloballyFreeze)
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
}
