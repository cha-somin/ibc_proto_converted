// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/oracle.proto

package com.injective.oracle.v1beta1;

public interface PriceFeedStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.oracle.v1beta1.PriceFeedState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string base = 1 [json_name = "base"];</code>
   * @return The base.
   */
  java.lang.String getBase();
  /**
   * <code>string base = 1 [json_name = "base"];</code>
   * @return The bytes for base.
   */
  com.google.protobuf.ByteString
      getBaseBytes();

  /**
   * <code>string quote = 2 [json_name = "quote"];</code>
   * @return The quote.
   */
  java.lang.String getQuote();
  /**
   * <code>string quote = 2 [json_name = "quote"];</code>
   * @return The bytes for quote.
   */
  com.google.protobuf.ByteString
      getQuoteBytes();

  /**
   * <code>.injective.oracle.v1beta1.PriceState price_state = 3 [json_name = "priceState"];</code>
   * @return Whether the priceState field is set.
   */
  boolean hasPriceState();
  /**
   * <code>.injective.oracle.v1beta1.PriceState price_state = 3 [json_name = "priceState"];</code>
   * @return The priceState.
   */
  com.injective.oracle.v1beta1.PriceState getPriceState();
  /**
   * <code>.injective.oracle.v1beta1.PriceState price_state = 3 [json_name = "priceState"];</code>
   */
  com.injective.oracle.v1beta1.PriceStateOrBuilder getPriceStateOrBuilder();

  /**
   * <code>repeated string relayers = 4 [json_name = "relayers"];</code>
   * @return A list containing the relayers.
   */
  java.util.List<java.lang.String>
      getRelayersList();
  /**
   * <code>repeated string relayers = 4 [json_name = "relayers"];</code>
   * @return The count of relayers.
   */
  int getRelayersCount();
  /**
   * <code>repeated string relayers = 4 [json_name = "relayers"];</code>
   * @param index The index of the element to return.
   * @return The relayers at the given index.
   */
  java.lang.String getRelayers(int index);
  /**
   * <code>repeated string relayers = 4 [json_name = "relayers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the relayers at the given index.
   */
  com.google.protobuf.ByteString
      getRelayersBytes(int index);
}
