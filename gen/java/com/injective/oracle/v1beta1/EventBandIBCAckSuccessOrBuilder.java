// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/events.proto

package com.injective.oracle.v1beta1;

public interface EventBandIBCAckSuccessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.oracle.v1beta1.EventBandIBCAckSuccess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ack_result = 1 [json_name = "ackResult"];</code>
   * @return The ackResult.
   */
  java.lang.String getAckResult();
  /**
   * <code>string ack_result = 1 [json_name = "ackResult"];</code>
   * @return The bytes for ackResult.
   */
  com.google.protobuf.ByteString
      getAckResultBytes();

  /**
   * <code>int64 client_id = 2 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  long getClientId();
}
