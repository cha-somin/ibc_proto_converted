// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/types/v1beta1/tx_response.proto

package com.injective.types.v1beta1;

public interface TxResponseGenericMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.types.v1beta1.TxResponseGenericMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string header = 1 [json_name = "header"];</code>
   * @return The header.
   */
  java.lang.String getHeader();
  /**
   * <code>string header = 1 [json_name = "header"];</code>
   * @return The bytes for header.
   */
  com.google.protobuf.ByteString
      getHeaderBytes();

  /**
   * <code>bytes data = 2 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
