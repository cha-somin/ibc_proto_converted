// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

public interface MsgCreateBinaryOptionsMarketOrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.MsgCreateBinaryOptionsMarketOrder)
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
   * <code>.injective.exchange.v1beta1.DerivativeOrder order = 2 [json_name = "order", (.gogoproto.nullable) = false];</code>
   * @return Whether the order field is set.
   */
  boolean hasOrder();
  /**
   * <code>.injective.exchange.v1beta1.DerivativeOrder order = 2 [json_name = "order", (.gogoproto.nullable) = false];</code>
   * @return The order.
   */
  com.injective.exchange.v1beta1.DerivativeOrder getOrder();
  /**
   * <code>.injective.exchange.v1beta1.DerivativeOrder order = 2 [json_name = "order", (.gogoproto.nullable) = false];</code>
   */
  com.injective.exchange.v1beta1.DerivativeOrderOrBuilder getOrderOrBuilder();
}
