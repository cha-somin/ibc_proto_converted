// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/events.proto

package com.injective.exchange.v1beta1;

public interface EventBatchSpotExecutionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.EventBatchSpotExecution)
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
   * <code>bool is_buy = 2 [json_name = "isBuy"];</code>
   * @return The isBuy.
   */
  boolean getIsBuy();

  /**
   * <code>.injective.exchange.v1beta1.ExecutionType executionType = 3 [json_name = "executionType"];</code>
   * @return The enum numeric value on the wire for executionType.
   */
  int getExecutionTypeValue();
  /**
   * <code>.injective.exchange.v1beta1.ExecutionType executionType = 3 [json_name = "executionType"];</code>
   * @return The executionType.
   */
  com.injective.exchange.v1beta1.ExecutionType getExecutionType();

  /**
   * <code>repeated .injective.exchange.v1beta1.TradeLog trades = 4 [json_name = "trades"];</code>
   */
  java.util.List<com.injective.exchange.v1beta1.TradeLog> 
      getTradesList();
  /**
   * <code>repeated .injective.exchange.v1beta1.TradeLog trades = 4 [json_name = "trades"];</code>
   */
  com.injective.exchange.v1beta1.TradeLog getTrades(int index);
  /**
   * <code>repeated .injective.exchange.v1beta1.TradeLog trades = 4 [json_name = "trades"];</code>
   */
  int getTradesCount();
  /**
   * <code>repeated .injective.exchange.v1beta1.TradeLog trades = 4 [json_name = "trades"];</code>
   */
  java.util.List<? extends com.injective.exchange.v1beta1.TradeLogOrBuilder> 
      getTradesOrBuilderList();
  /**
   * <code>repeated .injective.exchange.v1beta1.TradeLog trades = 4 [json_name = "trades"];</code>
   */
  com.injective.exchange.v1beta1.TradeLogOrBuilder getTradesOrBuilder(
      int index);
}
