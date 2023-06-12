// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/fantoken/v1beta1/tx.proto

package com.bitsong.fantoken;

public interface MsgSetAuthorityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bitsong.fantoken.MsgSetAuthority)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * denom the fan token denom
   * </pre>
   *
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <pre>
   * denom the fan token denom
   * </pre>
   *
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <pre>
   * old_authority, the actual metadata authority
   * </pre>
   *
   * <code>string old_authority = 2 [json_name = "oldAuthority", (.gogoproto.moretags) = "yaml:&#92;"old_authority&#92;""];</code>
   * @return The oldAuthority.
   */
  java.lang.String getOldAuthority();
  /**
   * <pre>
   * old_authority, the actual metadata authority
   * </pre>
   *
   * <code>string old_authority = 2 [json_name = "oldAuthority", (.gogoproto.moretags) = "yaml:&#92;"old_authority&#92;""];</code>
   * @return The bytes for oldAuthority.
   */
  com.google.protobuf.ByteString
      getOldAuthorityBytes();

  /**
   * <pre>
   * new_authority, the new fan token metadata authority
   * </pre>
   *
   * <code>string new_authority = 3 [json_name = "newAuthority", (.gogoproto.moretags) = "yaml:&#92;"new_authority&#92;""];</code>
   * @return The newAuthority.
   */
  java.lang.String getNewAuthority();
  /**
   * <pre>
   * new_authority, the new fan token metadata authority
   * </pre>
   *
   * <code>string new_authority = 3 [json_name = "newAuthority", (.gogoproto.moretags) = "yaml:&#92;"new_authority&#92;""];</code>
   * @return The bytes for newAuthority.
   */
  com.google.protobuf.ByteString
      getNewAuthorityBytes();
}
