// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/inflation/v1/query.proto

package com.canto.inflation.v1;

public interface QueryInflationRateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:canto.inflation.v1.QueryInflationRateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * rate by which the total supply increases within one period
   * </pre>
   *
   * <code>string inflation_rate = 1 [json_name = "inflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The inflationRate.
   */
  java.lang.String getInflationRate();
  /**
   * <pre>
   * rate by which the total supply increases within one period
   * </pre>
   *
   * <code>string inflation_rate = 1 [json_name = "inflationRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for inflationRate.
   */
  com.google.protobuf.ByteString
      getInflationRateBytes();
}
