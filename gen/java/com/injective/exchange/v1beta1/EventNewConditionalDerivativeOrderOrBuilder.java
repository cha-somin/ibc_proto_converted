// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/events.proto

package com.injective.exchange.v1beta1;

public interface EventNewConditionalDerivativeOrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.EventNewConditionalDerivativeOrder)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string market_id = 1 [json_name = "marketId"];</code>
   * @return The marketId.
   */
  java.lang.String getMarketId();
  /**
   * <code>string market_id = 1 [json_name = "marketId"];</code>
   * @return The bytes for marketId.
   */
  com.google.protobuf.ByteString
      getMarketIdBytes();

  /**
   * <code>.injective.exchange.v1beta1.DerivativeOrder order = 2 [json_name = "order"];</code>
   * @return Whether the order field is set.
   */
  boolean hasOrder();
  /**
   * <code>.injective.exchange.v1beta1.DerivativeOrder order = 2 [json_name = "order"];</code>
   * @return The order.
   */
  com.injective.exchange.v1beta1.DerivativeOrder getOrder();
  /**
   * <code>.injective.exchange.v1beta1.DerivativeOrder order = 2 [json_name = "order"];</code>
   */
  com.injective.exchange.v1beta1.DerivativeOrderOrBuilder getOrderOrBuilder();

  /**
   * <code>bytes hash = 3 [json_name = "hash"];</code>
   * @return The hash.
   */
  com.google.protobuf.ByteString getHash();

  /**
   * <code>bool is_market = 4 [json_name = "isMarket"];</code>
   * @return The isMarket.
   */
  boolean getIsMarket();
}
