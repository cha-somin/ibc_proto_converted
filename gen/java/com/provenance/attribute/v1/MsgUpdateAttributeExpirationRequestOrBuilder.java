// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/attribute/v1/tx.proto

package com.provenance.attribute.v1;

public interface MsgUpdateAttributeExpirationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.attribute.v1.MsgUpdateAttributeExpirationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The attribute name.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The attribute name.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The original attribute value.
   * </pre>
   *
   * <code>bytes value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <pre>
   * Time that an attribute will expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_date = 3 [json_name = "expirationDate", (.gogoproto.nullable) = true, (.gogoproto.stdtime) = true];</code>
   * @return Whether the expirationDate field is set.
   */
  boolean hasExpirationDate();
  /**
   * <pre>
   * Time that an attribute will expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_date = 3 [json_name = "expirationDate", (.gogoproto.nullable) = true, (.gogoproto.stdtime) = true];</code>
   * @return The expirationDate.
   */
  com.google.protobuf.Timestamp getExpirationDate();
  /**
   * <pre>
   * Time that an attribute will expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_date = 3 [json_name = "expirationDate", (.gogoproto.nullable) = true, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationDateOrBuilder();

  /**
   * <pre>
   * The account to add the attribute to.
   * </pre>
   *
   * <code>string account = 4 [json_name = "account"];</code>
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   * <pre>
   * The account to add the attribute to.
   * </pre>
   *
   * <code>string account = 4 [json_name = "account"];</code>
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <pre>
   * The address that the name must resolve to.
   * </pre>
   *
   * <code>string owner = 5 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <pre>
   * The address that the name must resolve to.
   * </pre>
   *
   * <code>string owner = 5 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();
}
