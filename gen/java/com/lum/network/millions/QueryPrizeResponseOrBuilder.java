// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/query.proto

package com.lum.network.millions;

public interface QueryPrizeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lum.network.millions.QueryPrizeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.lum.network.millions.Prize prize = 1 [json_name = "prize", (.gogoproto.nullable) = false];</code>
   * @return Whether the prize field is set.
   */
  boolean hasPrize();
  /**
   * <code>.lum.network.millions.Prize prize = 1 [json_name = "prize", (.gogoproto.nullable) = false];</code>
   * @return The prize.
   */
  com.lum.network.millions.Prize getPrize();
  /**
   * <code>.lum.network.millions.Prize prize = 1 [json_name = "prize", (.gogoproto.nullable) = false];</code>
   */
  com.lum.network.millions.PrizeOrBuilder getPrizeOrBuilder();
}
