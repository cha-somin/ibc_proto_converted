// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/query.proto

package com.stafihub.stafihub.ledger;

public interface QueryGetSignatureRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.ledger.QueryGetSignatureRequest)
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

  /**
   * <code>string pool = 3 [json_name = "pool"];</code>
   * @return The pool.
   */
  java.lang.String getPool();
  /**
   * <code>string pool = 3 [json_name = "pool"];</code>
   * @return The bytes for pool.
   */
  com.google.protobuf.ByteString
      getPoolBytes();

  /**
   * <code>.stafihub.stafihub.ledger.OriginalTxType txType = 4 [json_name = "txType"];</code>
   * @return The enum numeric value on the wire for txType.
   */
  int getTxTypeValue();
  /**
   * <code>.stafihub.stafihub.ledger.OriginalTxType txType = 4 [json_name = "txType"];</code>
   * @return The txType.
   */
  com.stafihub.stafihub.ledger.OriginalTxType getTxType();

  /**
   * <code>string propId = 5 [json_name = "propId"];</code>
   * @return The propId.
   */
  java.lang.String getPropId();
  /**
   * <code>string propId = 5 [json_name = "propId"];</code>
   * @return The bytes for propId.
   */
  com.google.protobuf.ByteString
      getPropIdBytes();
}
