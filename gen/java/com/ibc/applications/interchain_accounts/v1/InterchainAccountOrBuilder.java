// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/interchain_accounts/v1/account.proto

package com.ibc.applications.interchain_accounts.v1;

public interface InterchainAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.applications.interchain_accounts.v1.InterchainAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true];</code>
   * @return Whether the baseAccount field is set.
   */
  boolean hasBaseAccount();
  /**
   * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true];</code>
   * @return The baseAccount.
   */
  com.cosmos.auth.v1beta1.BaseAccount getBaseAccount();
  /**
   * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true];</code>
   */
  com.cosmos.auth.v1beta1.BaseAccountOrBuilder getBaseAccountOrBuilder();

  /**
   * <code>string account_owner = 2 [json_name = "accountOwner"];</code>
   * @return The accountOwner.
   */
  java.lang.String getAccountOwner();
  /**
   * <code>string account_owner = 2 [json_name = "accountOwner"];</code>
   * @return The bytes for accountOwner.
   */
  com.google.protobuf.ByteString
      getAccountOwnerBytes();
}
