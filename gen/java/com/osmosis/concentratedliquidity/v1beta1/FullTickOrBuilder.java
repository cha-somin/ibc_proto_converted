// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/concentrated-liquidity/genesis.proto

package com.osmosis.concentratedliquidity.v1beta1;

public interface FullTickOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.concentratedliquidity.v1beta1.FullTick)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pool id associated with the tick.
   * </pre>
   *
   * <code>uint64 pool_id = 1 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <pre>
   * tick's index.
   * </pre>
   *
   * <code>int64 tick_index = 2 [json_name = "tickIndex", (.gogoproto.moretags) = "yaml:&#92;"tick_index&#92;""];</code>
   * @return The tickIndex.
   */
  long getTickIndex();

  /**
   * <pre>
   * tick's info.
   * </pre>
   *
   * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <pre>
   * tick's info.
   * </pre>
   *
   * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
   * @return The info.
   */
  com.osmosis.concentratedliquidity.v1beta1.TickInfo getInfo();
  /**
   * <pre>
   * tick's info.
   * </pre>
   *
   * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
   */
  com.osmosis.concentratedliquidity.v1beta1.TickInfoOrBuilder getInfoOrBuilder();
}
