// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/oracle/oracle.proto

package com.irismod.oracle;

public interface FeedValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.oracle.FeedValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string data = 1 [json_name = "data"];</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 1 [json_name = "data"];</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();
}
