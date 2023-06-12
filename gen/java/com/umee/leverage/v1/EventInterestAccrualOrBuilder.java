// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/leverage/v1/events.proto

package com.umee.leverage.v1;

public interface EventInterestAccrualOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.leverage.v1.EventInterestAccrual)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 block_height = 1 [json_name = "blockHeight"];</code>
   * @return The blockHeight.
   */
  long getBlockHeight();

  /**
   * <pre>
   * Unix timestamp (in seconds)
   * </pre>
   *
   * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total_interest = 3 [json_name = "totalInterest", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getTotalInterestList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total_interest = 3 [json_name = "totalInterest", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.Coin getTotalInterest(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total_interest = 3 [json_name = "totalInterest", (.gogoproto.nullable) = false];</code>
   */
  int getTotalInterestCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total_interest = 3 [json_name = "totalInterest", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getTotalInterestOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin total_interest = 3 [json_name = "totalInterest", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTotalInterestOrBuilder(
      int index);

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin reserved = 4 [json_name = "reserved", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getReservedList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin reserved = 4 [json_name = "reserved", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.Coin getReserved(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin reserved = 4 [json_name = "reserved", (.gogoproto.nullable) = false];</code>
   */
  int getReservedCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin reserved = 4 [json_name = "reserved", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getReservedOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin reserved = 4 [json_name = "reserved", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getReservedOrBuilder(
      int index);
}
