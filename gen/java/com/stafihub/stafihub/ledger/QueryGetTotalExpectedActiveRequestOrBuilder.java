// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/query.proto

package com.stafihub.stafihub.ledger;

public interface QueryGetTotalExpectedActiveRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>uint32 era = 2 [json_name = "era"];</code>
   * @return The era.
   */
  int getEra();
}
