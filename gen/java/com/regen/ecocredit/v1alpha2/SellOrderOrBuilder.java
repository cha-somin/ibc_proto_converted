// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/types.proto

package com.regen.ecocredit.v1alpha2;

public interface SellOrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.ecocredit.v1alpha2.SellOrder)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * order_id is the unique ID of sell order.
   * </pre>
   *
   * <code>uint64 order_id = 1 [json_name = "orderId"];</code>
   * @return The orderId.
   */
  long getOrderId();

  /**
   * <pre>
   * owner is the address of the owner of the credits being sold.
   * </pre>
   *
   * <code>string owner = 2 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <pre>
   * owner is the address of the owner of the credits being sold.
   * </pre>
   *
   * <code>string owner = 2 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <pre>
   * batch_denom is the credit batch being sold.
   * </pre>
   *
   * <code>string batch_denom = 3 [json_name = "batchDenom"];</code>
   * @return The batchDenom.
   */
  java.lang.String getBatchDenom();
  /**
   * <pre>
   * batch_denom is the credit batch being sold.
   * </pre>
   *
   * <code>string batch_denom = 3 [json_name = "batchDenom"];</code>
   * @return The bytes for batchDenom.
   */
  com.google.protobuf.ByteString
      getBatchDenomBytes();

  /**
   * <pre>
   * quantity is the quantity of credits being sold.
   * </pre>
   *
   * <code>string quantity = 4 [json_name = "quantity"];</code>
   * @return The quantity.
   */
  java.lang.String getQuantity();
  /**
   * <pre>
   * quantity is the quantity of credits being sold.
   * </pre>
   *
   * <code>string quantity = 4 [json_name = "quantity"];</code>
   * @return The bytes for quantity.
   */
  com.google.protobuf.ByteString
      getQuantityBytes();

  /**
   * <pre>
   * ask_price is the price the seller is asking for each unit of the
   * batch_denom. Each credit unit of the batch will be sold for at least the
   * ask_price or more.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin ask_price = 5 [json_name = "askPrice"];</code>
   * @return Whether the askPrice field is set.
   */
  boolean hasAskPrice();
  /**
   * <pre>
   * ask_price is the price the seller is asking for each unit of the
   * batch_denom. Each credit unit of the batch will be sold for at least the
   * ask_price or more.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin ask_price = 5 [json_name = "askPrice"];</code>
   * @return The askPrice.
   */
  com.cosmos.base.v1beta1.Coin getAskPrice();
  /**
   * <pre>
   * ask_price is the price the seller is asking for each unit of the
   * batch_denom. Each credit unit of the batch will be sold for at least the
   * ask_price or more.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin ask_price = 5 [json_name = "askPrice"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAskPriceOrBuilder();

  /**
   * <pre>
   * disable_auto_retire disables auto-retirement of credits which allows a
   * buyer to disable auto-retirement in their buy order enabling them to
   * resell the credits to another buyer.
   * </pre>
   *
   * <code>bool disable_auto_retire = 6 [json_name = "disableAutoRetire"];</code>
   * @return The disableAutoRetire.
   */
  boolean getDisableAutoRetire();
}
