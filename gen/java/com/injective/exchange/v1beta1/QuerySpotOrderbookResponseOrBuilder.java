// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

public interface QuerySpotOrderbookResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.QuerySpotOrderbookResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .injective.exchange.v1beta1.Level buys_price_level = 1 [json_name = "buysPriceLevel"];</code>
   */
  java.util.List<com.injective.exchange.v1beta1.Level> 
      getBuysPriceLevelList();
  /**
   * <code>repeated .injective.exchange.v1beta1.Level buys_price_level = 1 [json_name = "buysPriceLevel"];</code>
   */
  com.injective.exchange.v1beta1.Level getBuysPriceLevel(int index);
  /**
   * <code>repeated .injective.exchange.v1beta1.Level buys_price_level = 1 [json_name = "buysPriceLevel"];</code>
   */
  int getBuysPriceLevelCount();
  /**
   * <code>repeated .injective.exchange.v1beta1.Level buys_price_level = 1 [json_name = "buysPriceLevel"];</code>
   */
  java.util.List<? extends com.injective.exchange.v1beta1.LevelOrBuilder> 
      getBuysPriceLevelOrBuilderList();
  /**
   * <code>repeated .injective.exchange.v1beta1.Level buys_price_level = 1 [json_name = "buysPriceLevel"];</code>
   */
  com.injective.exchange.v1beta1.LevelOrBuilder getBuysPriceLevelOrBuilder(
      int index);

  /**
   * <code>repeated .injective.exchange.v1beta1.Level sells_price_level = 2 [json_name = "sellsPriceLevel"];</code>
   */
  java.util.List<com.injective.exchange.v1beta1.Level> 
      getSellsPriceLevelList();
  /**
   * <code>repeated .injective.exchange.v1beta1.Level sells_price_level = 2 [json_name = "sellsPriceLevel"];</code>
   */
  com.injective.exchange.v1beta1.Level getSellsPriceLevel(int index);
  /**
   * <code>repeated .injective.exchange.v1beta1.Level sells_price_level = 2 [json_name = "sellsPriceLevel"];</code>
   */
  int getSellsPriceLevelCount();
  /**
   * <code>repeated .injective.exchange.v1beta1.Level sells_price_level = 2 [json_name = "sellsPriceLevel"];</code>
   */
  java.util.List<? extends com.injective.exchange.v1beta1.LevelOrBuilder> 
      getSellsPriceLevelOrBuilderList();
  /**
   * <code>repeated .injective.exchange.v1beta1.Level sells_price_level = 2 [json_name = "sellsPriceLevel"];</code>
   */
  com.injective.exchange.v1beta1.LevelOrBuilder getSellsPriceLevelOrBuilder(
      int index);
}
