// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mars/envoy/v1beta1/query.proto

package com.mars.envoy.v1beta1;

public interface QueryAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mars.envoy.v1beta1.QueryAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ConnectionId identified the connection associated with the interchain
   * account.
   * </pre>
   *
   * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <pre>
   * ConnectionId identified the connection associated with the interchain
   * account.
   * </pre>
   *
   * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();
}
