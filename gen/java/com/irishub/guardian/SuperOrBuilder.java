// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irishub/guardian/guardian.proto

package com.irishub.guardian;

public interface SuperOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irishub.guardian.Super)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string description = 1 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 1 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.irishub.guardian.AccountType account_type = 2 [json_name = "accountType", (.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
   * @return The enum numeric value on the wire for accountType.
   */
  int getAccountTypeValue();
  /**
   * <code>.irishub.guardian.AccountType account_type = 2 [json_name = "accountType", (.gogoproto.moretags) = "yaml:&#92;"account_type&#92;""];</code>
   * @return The accountType.
   */
  com.irishub.guardian.AccountType getAccountType();

  /**
   * <code>string address = 3 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 3 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>string added_by = 4 [json_name = "addedBy"];</code>
   * @return The addedBy.
   */
  java.lang.String getAddedBy();
  /**
   * <code>string added_by = 4 [json_name = "addedBy"];</code>
   * @return The bytes for addedBy.
   */
  com.google.protobuf.ByteString
      getAddedByBytes();
}
