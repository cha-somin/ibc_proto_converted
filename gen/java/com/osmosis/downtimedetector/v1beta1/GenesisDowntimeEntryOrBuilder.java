// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/downtime-detector/v1beta1/genesis.proto

package com.osmosis.downtimedetector.v1beta1;

public interface GenesisDowntimeEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.downtimedetector.v1beta1.GenesisDowntimeEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.osmosis.downtimedetector.v1beta1.Downtime duration = 1 [json_name = "duration", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;""];</code>
   * @return The enum numeric value on the wire for duration.
   */
  int getDurationValue();
  /**
   * <code>.osmosis.downtimedetector.v1beta1.Downtime duration = 1 [json_name = "duration", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;""];</code>
   * @return The duration.
   */
  com.osmosis.downtimedetector.v1beta1.Downtime getDuration();

  /**
   * <code>.google.protobuf.Timestamp last_downtime = 2 [json_name = "lastDowntime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"last_downtime&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the lastDowntime field is set.
   */
  boolean hasLastDowntime();
  /**
   * <code>.google.protobuf.Timestamp last_downtime = 2 [json_name = "lastDowntime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"last_downtime&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The lastDowntime.
   */
  com.google.protobuf.Timestamp getLastDowntime();
  /**
   * <code>.google.protobuf.Timestamp last_downtime = 2 [json_name = "lastDowntime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"last_downtime&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastDowntimeOrBuilder();
}
