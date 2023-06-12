// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/epochs/v1/genesis.proto

package com.canto.epochs.v1;

public interface EpochInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:canto.epochs.v1.EpochInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string identifier = 1 [json_name = "identifier"];</code>
   * @return The identifier.
   */
  java.lang.String getIdentifier();
  /**
   * <code>string identifier = 1 [json_name = "identifier"];</code>
   * @return The bytes for identifier.
   */
  com.google.protobuf.ByteString
      getIdentifierBytes();

  /**
   * <code>.google.protobuf.Timestamp start_time = 2 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 2 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 2 [json_name = "startTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Duration duration = 3 [json_name = "duration", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "duration,omitempty", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <code>.google.protobuf.Duration duration = 3 [json_name = "duration", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "duration,omitempty", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   * <code>.google.protobuf.Duration duration = 3 [json_name = "duration", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "duration,omitempty", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();

  /**
   * <code>int64 current_epoch = 4 [json_name = "currentEpoch"];</code>
   * @return The currentEpoch.
   */
  long getCurrentEpoch();

  /**
   * <code>.google.protobuf.Timestamp current_epoch_start_time = 5 [json_name = "currentEpochStartTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"current_epoch_start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the currentEpochStartTime field is set.
   */
  boolean hasCurrentEpochStartTime();
  /**
   * <code>.google.protobuf.Timestamp current_epoch_start_time = 5 [json_name = "currentEpochStartTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"current_epoch_start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The currentEpochStartTime.
   */
  com.google.protobuf.Timestamp getCurrentEpochStartTime();
  /**
   * <code>.google.protobuf.Timestamp current_epoch_start_time = 5 [json_name = "currentEpochStartTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"current_epoch_start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCurrentEpochStartTimeOrBuilder();

  /**
   * <code>bool epoch_counting_started = 6 [json_name = "epochCountingStarted"];</code>
   * @return The epochCountingStarted.
   */
  boolean getEpochCountingStarted();

  /**
   * <code>int64 current_epoch_start_height = 7 [json_name = "currentEpochStartHeight"];</code>
   * @return The currentEpochStartHeight.
   */
  long getCurrentEpochStartHeight();
}
