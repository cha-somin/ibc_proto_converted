// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/service/tx.proto

package com.irismod.service;

public interface MsgPauseRequestContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.service.MsgPauseRequestContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string request_context_id = 1 [json_name = "requestContextId", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
   * @return The requestContextId.
   */
  java.lang.String getRequestContextId();
  /**
   * <code>string request_context_id = 1 [json_name = "requestContextId", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
   * @return The bytes for requestContextId.
   */
  com.google.protobuf.ByteString
      getRequestContextIdBytes();

  /**
   * <code>string consumer = 2 [json_name = "consumer"];</code>
   * @return The consumer.
   */
  java.lang.String getConsumer();
  /**
   * <code>string consumer = 2 [json_name = "consumer"];</code>
   * @return The bytes for consumer.
   */
  com.google.protobuf.ByteString
      getConsumerBytes();
}
