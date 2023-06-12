// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/interchainquery/v1/genesis.proto

package com.stride.interchainquery.v1;

public interface QueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.interchainquery.v1.Query)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string connection_id = 2 [json_name = "connectionId"];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <code>string connection_id = 2 [json_name = "connectionId"];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();

  /**
   * <code>string chain_id = 3 [json_name = "chainId"];</code>
   * @return The chainId.
   */
  java.lang.String getChainId();
  /**
   * <code>string chain_id = 3 [json_name = "chainId"];</code>
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>string query_type = 4 [json_name = "queryType"];</code>
   * @return The queryType.
   */
  java.lang.String getQueryType();
  /**
   * <code>string query_type = 4 [json_name = "queryType"];</code>
   * @return The bytes for queryType.
   */
  com.google.protobuf.ByteString
      getQueryTypeBytes();

  /**
   * <code>bytes request = 5 [json_name = "request"];</code>
   * @return The request.
   */
  com.google.protobuf.ByteString getRequest();

  /**
   * <code>string callback_id = 8 [json_name = "callbackId"];</code>
   * @return The callbackId.
   */
  java.lang.String getCallbackId();
  /**
   * <code>string callback_id = 8 [json_name = "callbackId"];</code>
   * @return The bytes for callbackId.
   */
  com.google.protobuf.ByteString
      getCallbackIdBytes();

  /**
   * <code>uint64 ttl = 9 [json_name = "ttl"];</code>
   * @return The ttl.
   */
  long getTtl();

  /**
   * <code>bool request_sent = 11 [json_name = "requestSent"];</code>
   * @return The requestSent.
   */
  boolean getRequestSent();
}
