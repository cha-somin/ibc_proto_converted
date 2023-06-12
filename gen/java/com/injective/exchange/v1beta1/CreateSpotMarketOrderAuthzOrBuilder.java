// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/authz.proto

package com.injective.exchange.v1beta1;

public interface CreateSpotMarketOrderAuthzOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.CreateSpotMarketOrderAuthz)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string subaccount_id = 1 [json_name = "subaccountId"];</code>
   * @return The subaccountId.
   */
  java.lang.String getSubaccountId();
  /**
   * <code>string subaccount_id = 1 [json_name = "subaccountId"];</code>
   * @return The bytes for subaccountId.
   */
  com.google.protobuf.ByteString
      getSubaccountIdBytes();

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
