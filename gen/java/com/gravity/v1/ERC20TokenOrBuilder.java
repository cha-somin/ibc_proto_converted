// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/attestation.proto

package com.gravity.v1;

public interface ERC20TokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gravity.v1.ERC20Token)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string contract = 1 [json_name = "contract"];</code>
   * @return The contract.
   */
  java.lang.String getContract();
  /**
   * <code>string contract = 1 [json_name = "contract"];</code>
   * @return The bytes for contract.
   */
  com.google.protobuf.ByteString
      getContractBytes();

  /**
   * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();
}
