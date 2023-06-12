// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/incentives/gauge.proto

package com.osmosis.incentives;

public interface LockableDurationsInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.incentives.LockableDurationsInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of incentivised durations that gauges will pay out to
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  java.util.List<com.google.protobuf.Duration> 
      getLockableDurationsList();
  /**
   * <pre>
   * List of incentivised durations that gauges will pay out to
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.Duration getLockableDurations(int index);
  /**
   * <pre>
   * List of incentivised durations that gauges will pay out to
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  int getLockableDurationsCount();
  /**
   * <pre>
   * List of incentivised durations that gauges will pay out to
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getLockableDurationsOrBuilderList();
  /**
   * <pre>
   * List of incentivised durations that gauges will pay out to
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getLockableDurationsOrBuilder(
      int index);
}
