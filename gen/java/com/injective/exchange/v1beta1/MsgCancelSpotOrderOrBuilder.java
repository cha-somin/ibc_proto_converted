// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

public interface MsgCancelSpotOrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.MsgCancelSpotOrder)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>string market_id = 2 [json_name = "marketId"];</code>
   * @return The marketId.
   */
  java.lang.String getMarketId();
  /**
   * <code>string market_id = 2 [json_name = "marketId"];</code>
   * @return The bytes for marketId.
   */
  com.google.protobuf.ByteString
      getMarketIdBytes();

  /**
   * <code>string subaccount_id = 3 [json_name = "subaccountId"];</code>
   * @return The subaccountId.
   */
  java.lang.String getSubaccountId();
  /**
   * <code>string subaccount_id = 3 [json_name = "subaccountId"];</code>
   * @return The bytes for subaccountId.
   */
  com.google.protobuf.ByteString
      getSubaccountIdBytes();

  /**
   * <code>string order_hash = 4 [json_name = "orderHash"];</code>
   * @return The orderHash.
   */
  java.lang.String getOrderHash();
  /**
   * <code>string order_hash = 4 [json_name = "orderHash"];</code>
   * @return The bytes for orderHash.
   */
  com.google.protobuf.ByteString
      getOrderHashBytes();
}
