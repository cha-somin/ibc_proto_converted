// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package com.provenance.metadata.v1;

public interface MsgBindOSLocatorResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.MsgBindOSLocatorResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
   * @return Whether the locator field is set.
   */
  boolean hasLocator();
  /**
   * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
   * @return The locator.
   */
  com.provenance.metadata.v1.ObjectStoreLocator getLocator();
  /**
   * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [json_name = "locator", (.gogoproto.nullable) = false];</code>
   */
  com.provenance.metadata.v1.ObjectStoreLocatorOrBuilder getLocatorOrBuilder();
}
