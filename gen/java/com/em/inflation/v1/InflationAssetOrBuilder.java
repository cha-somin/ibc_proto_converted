// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/inflation/v1/inflation.proto

package com.em.inflation.v1;

public interface InflationAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:em.inflation.v1.InflationAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string inflation = 2 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"inflation&#92;""];</code>
   * @return The inflation.
   */
  java.lang.String getInflation();
  /**
   * <code>string inflation = 2 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"inflation&#92;""];</code>
   * @return The bytes for inflation.
   */
  com.google.protobuf.ByteString
      getInflationBytes();

  /**
   * <code>string accum = 3 [json_name = "accum", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"accum&#92;""];</code>
   * @return The accum.
   */
  java.lang.String getAccum();
  /**
   * <code>string accum = 3 [json_name = "accum", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"accum&#92;""];</code>
   * @return The bytes for accum.
   */
  com.google.protobuf.ByteString
      getAccumBytes();
}
