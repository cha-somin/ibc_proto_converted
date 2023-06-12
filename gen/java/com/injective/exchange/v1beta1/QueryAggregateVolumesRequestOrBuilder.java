// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

public interface QueryAggregateVolumesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.QueryAggregateVolumesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
   * @return A list containing the accounts.
   */
  java.util.List<java.lang.String>
      getAccountsList();
  /**
   * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
   * @return The count of accounts.
   */
  int getAccountsCount();
  /**
   * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
   * @param index The index of the element to return.
   * @return The accounts at the given index.
   */
  java.lang.String getAccounts(int index);
  /**
   * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the accounts at the given index.
   */
  com.google.protobuf.ByteString
      getAccountsBytes(int index);

  /**
   * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
   * @return A list containing the marketIds.
   */
  java.util.List<java.lang.String>
      getMarketIdsList();
  /**
   * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
   * @return The count of marketIds.
   */
  int getMarketIdsCount();
  /**
   * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
   * @param index The index of the element to return.
   * @return The marketIds at the given index.
   */
  java.lang.String getMarketIds(int index);
  /**
   * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the marketIds at the given index.
   */
  com.google.protobuf.ByteString
      getMarketIdsBytes(int index);
}
