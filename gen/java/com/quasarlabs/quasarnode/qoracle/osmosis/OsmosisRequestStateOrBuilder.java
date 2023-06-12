// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quasar/qoracle/osmosis/osmosis.proto

package com.quasarlabs.quasarnode.qoracle.osmosis;

public interface OsmosisRequestStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 packet_sequence = 1 [json_name = "packetSequence"];</code>
   * @return The packetSequence.
   */
  long getPacketSequence();

  /**
   * <code>bool acknowledged = 2 [json_name = "acknowledged"];</code>
   * @return The acknowledged.
   */
  boolean getAcknowledged();

  /**
   * <code>bool failed = 3 [json_name = "failed"];</code>
   * @return The failed.
   */
  boolean getFailed();

  /**
   * <code>int64 updated_at_height = 4 [json_name = "updatedAtHeight"];</code>
   * @return The updatedAtHeight.
   */
  long getUpdatedAtHeight();
}
