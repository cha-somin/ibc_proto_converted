// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/plan/v2/msg.proto

package com.sentinel.plan.v2;

public interface MsgLinkNodeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sentinel.plan.v2.MsgLinkNodeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>uint64 id = 2 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string address = 3 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 3 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();
}
