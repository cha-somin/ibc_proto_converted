// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/events.proto

package com.provenance.metadata.v1;

public interface EventRecordCreatedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.EventRecordCreated)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * record_addr is the bech32 address string of the record id that was created.
   * </pre>
   *
   * <code>string record_addr = 1 [json_name = "recordAddr"];</code>
   * @return The recordAddr.
   */
  java.lang.String getRecordAddr();
  /**
   * <pre>
   * record_addr is the bech32 address string of the record id that was created.
   * </pre>
   *
   * <code>string record_addr = 1 [json_name = "recordAddr"];</code>
   * @return The bytes for recordAddr.
   */
  com.google.protobuf.ByteString
      getRecordAddrBytes();

  /**
   * <pre>
   * session_addr is the bech32 address string of the session id this record belongs to.
   * </pre>
   *
   * <code>string session_addr = 2 [json_name = "sessionAddr"];</code>
   * @return The sessionAddr.
   */
  java.lang.String getSessionAddr();
  /**
   * <pre>
   * session_addr is the bech32 address string of the session id this record belongs to.
   * </pre>
   *
   * <code>string session_addr = 2 [json_name = "sessionAddr"];</code>
   * @return The bytes for sessionAddr.
   */
  com.google.protobuf.ByteString
      getSessionAddrBytes();

  /**
   * <pre>
   * scope_addr is the bech32 address string of the scope id this record belongs to.
   * </pre>
   *
   * <code>string scope_addr = 3 [json_name = "scopeAddr"];</code>
   * @return The scopeAddr.
   */
  java.lang.String getScopeAddr();
  /**
   * <pre>
   * scope_addr is the bech32 address string of the scope id this record belongs to.
   * </pre>
   *
   * <code>string scope_addr = 3 [json_name = "scopeAddr"];</code>
   * @return The bytes for scopeAddr.
   */
  com.google.protobuf.ByteString
      getScopeAddrBytes();
}
