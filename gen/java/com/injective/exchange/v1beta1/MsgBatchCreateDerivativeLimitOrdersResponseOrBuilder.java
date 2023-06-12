// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

public interface MsgBatchCreateDerivativeLimitOrdersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrdersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string order_hashes = 1 [json_name = "orderHashes"];</code>
   * @return A list containing the orderHashes.
   */
  java.util.List<java.lang.String>
      getOrderHashesList();
  /**
   * <code>repeated string order_hashes = 1 [json_name = "orderHashes"];</code>
   * @return The count of orderHashes.
   */
  int getOrderHashesCount();
  /**
   * <code>repeated string order_hashes = 1 [json_name = "orderHashes"];</code>
   * @param index The index of the element to return.
   * @return The orderHashes at the given index.
   */
  java.lang.String getOrderHashes(int index);
  /**
   * <code>repeated string order_hashes = 1 [json_name = "orderHashes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the orderHashes at the given index.
   */
  com.google.protobuf.ByteString
      getOrderHashesBytes(int index);
}
