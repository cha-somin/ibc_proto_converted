// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/escrow/v1beta2/query.proto

package com.akash.escrow.v1beta2;

public interface QueryAccountsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.escrow.v1beta2.QueryAccountsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .akash.escrow.v1beta2.Account accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.akash.escrow.v1beta2.Account> 
      getAccountsList();
  /**
   * <code>repeated .akash.escrow.v1beta2.Account accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
   */
  com.akash.escrow.v1beta2.Account getAccounts(int index);
  /**
   * <code>repeated .akash.escrow.v1beta2.Account accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
   */
  int getAccountsCount();
  /**
   * <code>repeated .akash.escrow.v1beta2.Account accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.akash.escrow.v1beta2.AccountOrBuilder> 
      getAccountsOrBuilderList();
  /**
   * <code>repeated .akash.escrow.v1beta2.Account accounts = 1 [json_name = "accounts", (.gogoproto.nullable) = false];</code>
   */
  com.akash.escrow.v1beta2.AccountOrBuilder getAccountsOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
