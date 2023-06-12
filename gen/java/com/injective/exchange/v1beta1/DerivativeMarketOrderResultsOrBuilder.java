// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

public interface DerivativeMarketOrderResultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.DerivativeMarketOrderResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The quantity.
   */
  java.lang.String getQuantity();
  /**
   * <code>string quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for quantity.
   */
  com.google.protobuf.ByteString
      getQuantityBytes();

  /**
   * <code>string price = 2 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The price.
   */
  java.lang.String getPrice();
  /**
   * <code>string price = 2 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for price.
   */
  com.google.protobuf.ByteString
      getPriceBytes();

  /**
   * <code>string fee = 3 [json_name = "fee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The fee.
   */
  java.lang.String getFee();
  /**
   * <code>string fee = 3 [json_name = "fee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for fee.
   */
  com.google.protobuf.ByteString
      getFeeBytes();

  /**
   * <code>.injective.exchange.v1beta1.PositionDelta position_delta = 4 [json_name = "positionDelta", (.gogoproto.nullable) = false];</code>
   * @return Whether the positionDelta field is set.
   */
  boolean hasPositionDelta();
  /**
   * <code>.injective.exchange.v1beta1.PositionDelta position_delta = 4 [json_name = "positionDelta", (.gogoproto.nullable) = false];</code>
   * @return The positionDelta.
   */
  com.injective.exchange.v1beta1.PositionDelta getPositionDelta();
  /**
   * <code>.injective.exchange.v1beta1.PositionDelta position_delta = 4 [json_name = "positionDelta", (.gogoproto.nullable) = false];</code>
   */
  com.injective.exchange.v1beta1.PositionDeltaOrBuilder getPositionDeltaOrBuilder();

  /**
   * <code>string payout = 5 [json_name = "payout", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The payout.
   */
  java.lang.String getPayout();
  /**
   * <code>string payout = 5 [json_name = "payout", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for payout.
   */
  com.google.protobuf.ByteString
      getPayoutBytes();
}
