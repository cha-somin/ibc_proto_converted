// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/oracle/v1/oracle.proto

package com.umee.oracle.v1;

public interface DenomOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.oracle.v1.Denom)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string base_denom = 1 [json_name = "baseDenom", (.gogoproto.moretags) = "yaml:&#92;"base_denom&#92;""];</code>
   * @return The baseDenom.
   */
  java.lang.String getBaseDenom();
  /**
   * <code>string base_denom = 1 [json_name = "baseDenom", (.gogoproto.moretags) = "yaml:&#92;"base_denom&#92;""];</code>
   * @return The bytes for baseDenom.
   */
  com.google.protobuf.ByteString
      getBaseDenomBytes();

  /**
   * <code>string symbol_denom = 2 [json_name = "symbolDenom", (.gogoproto.moretags) = "yaml:&#92;"symbol_denom&#92;""];</code>
   * @return The symbolDenom.
   */
  java.lang.String getSymbolDenom();
  /**
   * <code>string symbol_denom = 2 [json_name = "symbolDenom", (.gogoproto.moretags) = "yaml:&#92;"symbol_denom&#92;""];</code>
   * @return The bytes for symbolDenom.
   */
  com.google.protobuf.ByteString
      getSymbolDenomBytes();

  /**
   * <code>uint32 exponent = 3 [json_name = "exponent", (.gogoproto.moretags) = "yaml:&#92;"exponent&#92;""];</code>
   * @return The exponent.
   */
  int getExponent();
}
