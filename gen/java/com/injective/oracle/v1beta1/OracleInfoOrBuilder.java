// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/oracle.proto

package com.injective.oracle.v1beta1;

public interface OracleInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.oracle.v1beta1.OracleInfo)
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
   * <code>.injective.oracle.v1beta1.OracleType oracle_type = 2 [json_name = "oracleType"];</code>
   * @return The enum numeric value on the wire for oracleType.
   */
  int getOracleTypeValue();
  /**
   * <code>.injective.oracle.v1beta1.OracleType oracle_type = 2 [json_name = "oracleType"];</code>
   * @return The oracleType.
   */
  com.injective.oracle.v1beta1.OracleType getOracleType();

  /**
   * <code>uint32 scale_factor = 3 [json_name = "scaleFactor"];</code>
   * @return The scaleFactor.
   */
  int getScaleFactor();
}
