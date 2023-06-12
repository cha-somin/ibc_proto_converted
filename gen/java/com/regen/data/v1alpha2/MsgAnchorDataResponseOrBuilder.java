// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/data/v1alpha2/tx.proto

package com.regen.data.v1alpha2;

public interface MsgAnchorDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.data.v1alpha2.MsgAnchorDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * timestamp is the timestamp of the block at which the data was anchored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * timestamp is the timestamp of the block at which the data was anchored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * timestamp is the timestamp of the block at which the data was anchored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * iri is the IRI of the data that was anchored.
   * </pre>
   *
   * <code>string iri = 2 [json_name = "iri"];</code>
   * @return The iri.
   */
  java.lang.String getIri();
  /**
   * <pre>
   * iri is the IRI of the data that was anchored.
   * </pre>
   *
   * <code>string iri = 2 [json_name = "iri"];</code>
   * @return The bytes for iri.
   */
  com.google.protobuf.ByteString
      getIriBytes();
}
