// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v3/solomachine.proto

package com.ibc.lightclients.solomachine.v3;

public interface TimestampedSignatureDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.solomachine.v3.TimestampedSignatureData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes signature_data = 1 [json_name = "signatureData"];</code>
   * @return The signatureData.
   */
  com.google.protobuf.ByteString getSignatureData();

  /**
   * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  long getTimestamp();
}
