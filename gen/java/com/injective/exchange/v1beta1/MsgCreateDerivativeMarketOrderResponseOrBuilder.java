// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

public interface MsgCreateDerivativeMarketOrderResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.MsgCreateDerivativeMarketOrderResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string order_hash = 1 [json_name = "orderHash"];</code>
   * @return The orderHash.
   */
  java.lang.String getOrderHash();
  /**
   * <code>string order_hash = 1 [json_name = "orderHash"];</code>
   * @return The bytes for orderHash.
   */
  com.google.protobuf.ByteString
      getOrderHashBytes();

  /**
   * <code>.injective.exchange.v1beta1.DerivativeMarketOrderResults results = 2 [json_name = "results", (.gogoproto.nullable) = true];</code>
   * @return Whether the results field is set.
   */
  boolean hasResults();
  /**
   * <code>.injective.exchange.v1beta1.DerivativeMarketOrderResults results = 2 [json_name = "results", (.gogoproto.nullable) = true];</code>
   * @return The results.
   */
  com.injective.exchange.v1beta1.DerivativeMarketOrderResults getResults();
  /**
   * <code>.injective.exchange.v1beta1.DerivativeMarketOrderResults results = 2 [json_name = "results", (.gogoproto.nullable) = true];</code>
   */
  com.injective.exchange.v1beta1.DerivativeMarketOrderResultsOrBuilder getResultsOrBuilder();
}
