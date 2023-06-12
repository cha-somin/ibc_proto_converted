// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/liquidity/v1beta1/liquidity.proto

package com.crescent.liquidity.v1beta1;

public interface PairOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.liquidity.v1beta1.Pair)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string base_coin_denom = 2 [json_name = "baseCoinDenom"];</code>
   * @return The baseCoinDenom.
   */
  java.lang.String getBaseCoinDenom();
  /**
   * <code>string base_coin_denom = 2 [json_name = "baseCoinDenom"];</code>
   * @return The bytes for baseCoinDenom.
   */
  com.google.protobuf.ByteString
      getBaseCoinDenomBytes();

  /**
   * <code>string quote_coin_denom = 3 [json_name = "quoteCoinDenom"];</code>
   * @return The quoteCoinDenom.
   */
  java.lang.String getQuoteCoinDenom();
  /**
   * <code>string quote_coin_denom = 3 [json_name = "quoteCoinDenom"];</code>
   * @return The bytes for quoteCoinDenom.
   */
  com.google.protobuf.ByteString
      getQuoteCoinDenomBytes();

  /**
   * <code>string escrow_address = 4 [json_name = "escrowAddress"];</code>
   * @return The escrowAddress.
   */
  java.lang.String getEscrowAddress();
  /**
   * <code>string escrow_address = 4 [json_name = "escrowAddress"];</code>
   * @return The bytes for escrowAddress.
   */
  com.google.protobuf.ByteString
      getEscrowAddressBytes();

  /**
   * <code>uint64 last_order_id = 5 [json_name = "lastOrderId"];</code>
   * @return The lastOrderId.
   */
  long getLastOrderId();

  /**
   * <code>string last_price = 6 [json_name = "lastPrice", (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The lastPrice.
   */
  java.lang.String getLastPrice();
  /**
   * <code>string last_price = 6 [json_name = "lastPrice", (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for lastPrice.
   */
  com.google.protobuf.ByteString
      getLastPriceBytes();

  /**
   * <code>uint64 current_batch_id = 7 [json_name = "currentBatchId"];</code>
   * @return The currentBatchId.
   */
  long getCurrentBatchId();
}
