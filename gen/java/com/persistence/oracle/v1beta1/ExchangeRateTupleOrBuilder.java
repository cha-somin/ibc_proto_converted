// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: persistence/oracle/v1beta1/oracle.proto

package com.persistence.oracle.v1beta1;

public interface ExchangeRateTupleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:persistence.oracle.v1beta1.ExchangeRateTuple)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string exchange_rate = 2 [json_name = "exchangeRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"exchange_rate&#92;""];</code>
   * @return The exchangeRate.
   */
  java.lang.String getExchangeRate();
  /**
   * <code>string exchange_rate = 2 [json_name = "exchangeRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"exchange_rate&#92;""];</code>
   * @return The bytes for exchangeRate.
   */
  com.google.protobuf.ByteString
      getExchangeRateBytes();
}
