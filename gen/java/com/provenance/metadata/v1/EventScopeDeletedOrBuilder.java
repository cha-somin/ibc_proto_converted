// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/events.proto

package com.provenance.metadata.v1;

public interface EventScopeDeletedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.EventScopeDeleted)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * scope_addr is the bech32 address string of the scope id that was deleted.
   * </pre>
   *
   * <code>string scope_addr = 1 [json_name = "scopeAddr"];</code>
   * @return The scopeAddr.
   */
  java.lang.String getScopeAddr();
  /**
   * <pre>
   * scope_addr is the bech32 address string of the scope id that was deleted.
   * </pre>
   *
   * <code>string scope_addr = 1 [json_name = "scopeAddr"];</code>
   * @return The bytes for scopeAddr.
   */
  com.google.protobuf.ByteString
      getScopeAddrBytes();
}
