// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/node/v2/querier.proto

package com.sentinel.node.v2;

public interface QueryNodeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sentinel.node.v2.QueryNodeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.sentinel.node.v2.Node node = 1 [json_name = "node", (.gogoproto.nullable) = false];</code>
   * @return Whether the node field is set.
   */
  boolean hasNode();
  /**
   * <code>.sentinel.node.v2.Node node = 1 [json_name = "node", (.gogoproto.nullable) = false];</code>
   * @return The node.
   */
  com.sentinel.node.v2.Node getNode();
  /**
   * <code>.sentinel.node.v2.Node node = 1 [json_name = "node", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.node.v2.NodeOrBuilder getNodeOrBuilder();
}
