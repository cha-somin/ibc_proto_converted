// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/query.proto

package com.provenance.metadata.v1;

public interface OSLocatorsByScopeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.OSLocatorsByScopeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .provenance.metadata.v1.ObjectStoreLocator locators = 1 [json_name = "locators", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.provenance.metadata.v1.ObjectStoreLocator> 
      getLocatorsList();
  /**
   * <code>repeated .provenance.metadata.v1.ObjectStoreLocator locators = 1 [json_name = "locators", (.gogoproto.nullable) = false];</code>
   */
  com.provenance.metadata.v1.ObjectStoreLocator getLocators(int index);
  /**
   * <code>repeated .provenance.metadata.v1.ObjectStoreLocator locators = 1 [json_name = "locators", (.gogoproto.nullable) = false];</code>
   */
  int getLocatorsCount();
  /**
   * <code>repeated .provenance.metadata.v1.ObjectStoreLocator locators = 1 [json_name = "locators", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.provenance.metadata.v1.ObjectStoreLocatorOrBuilder> 
      getLocatorsOrBuilderList();
  /**
   * <code>repeated .provenance.metadata.v1.ObjectStoreLocator locators = 1 [json_name = "locators", (.gogoproto.nullable) = false];</code>
   */
  com.provenance.metadata.v1.ObjectStoreLocatorOrBuilder getLocatorsOrBuilder(
      int index);

  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.OSLocatorsByScopeRequest request = 98 [json_name = "request"];</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.OSLocatorsByScopeRequest request = 98 [json_name = "request"];</code>
   * @return The request.
   */
  com.provenance.metadata.v1.OSLocatorsByScopeRequest getRequest();
  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.OSLocatorsByScopeRequest request = 98 [json_name = "request"];</code>
   */
  com.provenance.metadata.v1.OSLocatorsByScopeRequestOrBuilder getRequestOrBuilder();
}
