// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/exchange.proto

package com.injective.exchange.v1beta1;

public interface SubaccountOrderDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.SubaccountOrderData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.injective.exchange.v1beta1.SubaccountOrder order = 1 [json_name = "order"];</code>
   * @return Whether the order field is set.
   */
  boolean hasOrder();
  /**
   * <code>.injective.exchange.v1beta1.SubaccountOrder order = 1 [json_name = "order"];</code>
   * @return The order.
   */
  com.injective.exchange.v1beta1.SubaccountOrder getOrder();
  /**
   * <code>.injective.exchange.v1beta1.SubaccountOrder order = 1 [json_name = "order"];</code>
   */
  com.injective.exchange.v1beta1.SubaccountOrderOrBuilder getOrderOrBuilder();

  /**
   * <code>bytes order_hash = 2 [json_name = "orderHash"];</code>
   * @return The orderHash.
   */
  com.google.protobuf.ByteString getOrderHash();
}
