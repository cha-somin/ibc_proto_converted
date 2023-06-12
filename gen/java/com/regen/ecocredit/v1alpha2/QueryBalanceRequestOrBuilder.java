// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/query.proto

package com.regen.ecocredit.v1alpha2;

public interface QueryBalanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.ecocredit.v1alpha2.QueryBalanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * account is the address of the account whose balance is being queried.
   * </pre>
   *
   * <code>string account = 1 [json_name = "account"];</code>
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   * <pre>
   * account is the address of the account whose balance is being queried.
   * </pre>
   *
   * <code>string account = 1 [json_name = "account"];</code>
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <pre>
   * batch_denom is the unique ID of credit batch balance to query.
   * </pre>
   *
   * <code>string batch_denom = 2 [json_name = "batchDenom"];</code>
   * @return The batchDenom.
   */
  java.lang.String getBatchDenom();
  /**
   * <pre>
   * batch_denom is the unique ID of credit batch balance to query.
   * </pre>
   *
   * <code>string batch_denom = 2 [json_name = "batchDenom"];</code>
   * @return The bytes for batchDenom.
   */
  com.google.protobuf.ByteString
      getBatchDenomBytes();
}
