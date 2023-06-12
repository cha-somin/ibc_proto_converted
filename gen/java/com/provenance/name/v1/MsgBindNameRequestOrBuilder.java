// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/name/v1/tx.proto

package com.provenance.name.v1;

public interface MsgBindNameRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.name.v1.MsgBindNameRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent record to bind this name under.
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   * <pre>
   * The parent record to bind this name under.
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
   * @return The parent.
   */
  com.provenance.name.v1.NameRecord getParent();
  /**
   * <pre>
   * The parent record to bind this name under.
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord parent = 1 [json_name = "parent", (.gogoproto.nullable) = false];</code>
   */
  com.provenance.name.v1.NameRecordOrBuilder getParentOrBuilder();

  /**
   * <pre>
   * The name record to bind under the parent
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
   * @return Whether the record field is set.
   */
  boolean hasRecord();
  /**
   * <pre>
   * The name record to bind under the parent
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
   * @return The record.
   */
  com.provenance.name.v1.NameRecord getRecord();
  /**
   * <pre>
   * The name record to bind under the parent
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord record = 2 [json_name = "record", (.gogoproto.nullable) = false];</code>
   */
  com.provenance.name.v1.NameRecordOrBuilder getRecordOrBuilder();
}
