// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/query.proto

package com.injective.oracle.v1beta1;

public interface QueryHistoricalPriceRecordsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.oracle.v1beta1.QueryHistoricalPriceRecordsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.injective.oracle.v1beta1.OracleType oracle = 1 [json_name = "oracle"];</code>
   * @return The enum numeric value on the wire for oracle.
   */
  int getOracleValue();
  /**
   * <code>.injective.oracle.v1beta1.OracleType oracle = 1 [json_name = "oracle"];</code>
   * @return The oracle.
   */
  com.injective.oracle.v1beta1.OracleType getOracle();

  /**
   * <code>string symbol_id = 2 [json_name = "symbolId"];</code>
   * @return The symbolId.
   */
  java.lang.String getSymbolId();
  /**
   * <code>string symbol_id = 2 [json_name = "symbolId"];</code>
   * @return The bytes for symbolId.
   */
  com.google.protobuf.ByteString
      getSymbolIdBytes();
}
