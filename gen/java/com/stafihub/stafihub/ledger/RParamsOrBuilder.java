// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/ledger.proto

package com.stafihub.stafihub.ledger;

public interface RParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.ledger.RParams)
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
   * <code>string gasPrice = 2 [json_name = "gasPrice"];</code>
   * @return The gasPrice.
   */
  java.lang.String getGasPrice();
  /**
   * <code>string gasPrice = 2 [json_name = "gasPrice"];</code>
   * @return The bytes for gasPrice.
   */
  com.google.protobuf.ByteString
      getGasPriceBytes();

  /**
   * <code>uint32 eraSeconds = 3 [json_name = "eraSeconds"];</code>
   * @return The eraSeconds.
   */
  int getEraSeconds();

  /**
   * <code>int32 offset = 4 [json_name = "offset"];</code>
   * @return The offset.
   */
  int getOffset();

  /**
   * <code>uint32 bondingDuration = 5 [json_name = "bondingDuration"];</code>
   * @return The bondingDuration.
   */
  int getBondingDuration();

  /**
   * <code>string leastBond = 6 [json_name = "leastBond"];</code>
   * @return The leastBond.
   */
  java.lang.String getLeastBond();
  /**
   * <code>string leastBond = 6 [json_name = "leastBond"];</code>
   * @return The bytes for leastBond.
   */
  com.google.protobuf.ByteString
      getLeastBondBytes();
}
