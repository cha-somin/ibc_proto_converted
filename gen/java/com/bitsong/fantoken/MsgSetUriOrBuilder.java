// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/fantoken/v1beta1/tx.proto

package com.bitsong.fantoken;

public interface MsgSetUriOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bitsong.fantoken.MsgSetUri)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string authority = 1 [json_name = "authority"];</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <code>string authority = 1 [json_name = "authority"];</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string uri = 3 [json_name = "uri", (.gogoproto.customname) = "URI"];</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <code>string uri = 3 [json_name = "uri", (.gogoproto.customname) = "URI"];</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();
}
