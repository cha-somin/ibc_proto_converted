// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package com.ibc.core.channel.v1;

public interface QueryUnreceivedAcksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.QueryUnreceivedAcksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of unreceived acknowledgement sequences
   * </pre>
   *
   * <code>repeated uint64 sequences = 1 [json_name = "sequences"];</code>
   * @return A list containing the sequences.
   */
  java.util.List<java.lang.Long> getSequencesList();
  /**
   * <pre>
   * list of unreceived acknowledgement sequences
   * </pre>
   *
   * <code>repeated uint64 sequences = 1 [json_name = "sequences"];</code>
   * @return The count of sequences.
   */
  int getSequencesCount();
  /**
   * <pre>
   * list of unreceived acknowledgement sequences
   * </pre>
   *
   * <code>repeated uint64 sequences = 1 [json_name = "sequences"];</code>
   * @param index The index of the element to return.
   * @return The sequences at the given index.
   */
  long getSequences(int index);

  /**
   * <pre>
   * query block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 2 [json_name = "height", (.gogoproto.nullable) = false];</code>
   * @return Whether the height field is set.
   */
  boolean hasHeight();
  /**
   * <pre>
   * query block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 2 [json_name = "height", (.gogoproto.nullable) = false];</code>
   * @return The height.
   */
  com.ibc.core.client.v1.Height getHeight();
  /**
   * <pre>
   * query block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 2 [json_name = "height", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getHeightOrBuilder();
}
