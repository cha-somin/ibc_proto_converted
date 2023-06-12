// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/feemarket/v1/query.proto

package com.ethermint.feemarket.v1;

public interface QueryBaseFeeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ethermint.feemarket.v1.QueryBaseFeeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * base_fee is the EIP1559 base fee
   * </pre>
   *
   * <code>string base_fee = 1 [json_name = "baseFee", (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The baseFee.
   */
  java.lang.String getBaseFee();
  /**
   * <pre>
   * base_fee is the EIP1559 base fee
   * </pre>
   *
   * <code>string base_fee = 1 [json_name = "baseFee", (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for baseFee.
   */
  com.google.protobuf.ByteString
      getBaseFeeBytes();
}
