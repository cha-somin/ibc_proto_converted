// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/events.proto

package com.injective.oracle.v1beta1;

public interface SetCoinbasePriceEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.oracle.v1beta1.SetCoinbasePriceEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string symbol = 1 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <code>string symbol = 1 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

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
   * <code>uint64 timestamp = 3 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  long getTimestamp();
}
