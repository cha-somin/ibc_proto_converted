// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/query.proto

package com.coreum.asset.ft.v1;

public interface QueryFrozenBalanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:coreum.asset.ft.v1.QueryFrozenBalanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * account specifies the account onto which we query frozen balances
   * </pre>
   *
   * <code>string account = 1 [json_name = "account"];</code>
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   * <pre>
   * account specifies the account onto which we query frozen balances
   * </pre>
   *
   * <code>string account = 1 [json_name = "account"];</code>
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <pre>
   * denom specifies frozen balances on a specific denom
   * </pre>
   *
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <pre>
   * denom specifies frozen balances on a specific denom
   * </pre>
   *
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();
}
