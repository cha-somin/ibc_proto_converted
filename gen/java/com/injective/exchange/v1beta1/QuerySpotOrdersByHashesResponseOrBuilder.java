// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

public interface QuerySpotOrdersByHashesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
   */
  java.util.List<com.injective.exchange.v1beta1.TrimmedSpotLimitOrder> 
      getOrdersList();
  /**
   * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
   */
  com.injective.exchange.v1beta1.TrimmedSpotLimitOrder getOrders(int index);
  /**
   * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
   */
  int getOrdersCount();
  /**
   * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
   */
  java.util.List<? extends com.injective.exchange.v1beta1.TrimmedSpotLimitOrderOrBuilder> 
      getOrdersOrBuilderList();
  /**
   * <code>repeated .injective.exchange.v1beta1.TrimmedSpotLimitOrder orders = 1 [json_name = "orders"];</code>
   */
  com.injective.exchange.v1beta1.TrimmedSpotLimitOrderOrBuilder getOrdersOrBuilder(
      int index);
}
