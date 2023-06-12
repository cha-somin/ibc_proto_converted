// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/concentrated-liquidity/genesis.proto

package com.osmosis.concentratedliquidity.v1beta1;

public interface AccumObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.concentratedliquidity.v1beta1.AccumObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Accumulator's name (pulled from AccumulatorContent)
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", (.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Accumulator's name (pulled from AccumulatorContent)
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", (.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.osmosis.accum.v1beta1.AccumulatorContent accum_content = 2 [json_name = "accumContent"];</code>
   * @return Whether the accumContent field is set.
   */
  boolean hasAccumContent();
  /**
   * <code>.osmosis.accum.v1beta1.AccumulatorContent accum_content = 2 [json_name = "accumContent"];</code>
   * @return The accumContent.
   */
  com.osmosis.accum.v1beta1.AccumulatorContent getAccumContent();
  /**
   * <code>.osmosis.accum.v1beta1.AccumulatorContent accum_content = 2 [json_name = "accumContent"];</code>
   */
  com.osmosis.accum.v1beta1.AccumulatorContentOrBuilder getAccumContentOrBuilder();
}
