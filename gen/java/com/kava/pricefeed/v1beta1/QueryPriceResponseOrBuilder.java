// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/pricefeed/v1beta1/query.proto

package com.kava.pricefeed.v1beta1;

public interface QueryPriceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.pricefeed.v1beta1.QueryPriceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.kava.pricefeed.v1beta1.CurrentPriceResponse price = 1 [json_name = "price", (.gogoproto.nullable) = false];</code>
   * @return Whether the price field is set.
   */
  boolean hasPrice();
  /**
   * <code>.kava.pricefeed.v1beta1.CurrentPriceResponse price = 1 [json_name = "price", (.gogoproto.nullable) = false];</code>
   * @return The price.
   */
  com.kava.pricefeed.v1beta1.CurrentPriceResponse getPrice();
  /**
   * <code>.kava.pricefeed.v1beta1.CurrentPriceResponse price = 1 [json_name = "price", (.gogoproto.nullable) = false];</code>
   */
  com.kava.pricefeed.v1beta1.CurrentPriceResponseOrBuilder getPriceOrBuilder();
}
