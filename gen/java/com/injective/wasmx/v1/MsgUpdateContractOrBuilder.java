// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/wasmx/v1/tx.proto

package com.injective.wasmx.v1;

public interface MsgUpdateContractOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.wasmx.v1.MsgUpdateContract)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <pre>
   * Unique Identifier for contract instance to be registered.
   * </pre>
   *
   * <code>string contract_address = 2 [json_name = "contractAddress"];</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <pre>
   * Unique Identifier for contract instance to be registered.
   * </pre>
   *
   * <code>string contract_address = 2 [json_name = "contractAddress"];</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();

  /**
   * <pre>
   * Maximum gas to be used for the smart contract execution.
   * </pre>
   *
   * <code>uint64 gas_limit = 3 [json_name = "gasLimit"];</code>
   * @return The gasLimit.
   */
  long getGasLimit();

  /**
   * <pre>
   * gas price to be used for the smart contract execution.
   * </pre>
   *
   * <code>uint64 gas_price = 4 [json_name = "gasPrice"];</code>
   * @return The gasPrice.
   */
  long getGasPrice();

  /**
   * <pre>
   * optional - admin account that will be allowed to perform any changes
   * </pre>
   *
   * <code>string admin_address = 5 [json_name = "adminAddress", (.gogoproto.nullable) = true];</code>
   * @return The adminAddress.
   */
  java.lang.String getAdminAddress();
  /**
   * <pre>
   * optional - admin account that will be allowed to perform any changes
   * </pre>
   *
   * <code>string admin_address = 5 [json_name = "adminAddress", (.gogoproto.nullable) = true];</code>
   * @return The bytes for adminAddress.
   */
  com.google.protobuf.ByteString
      getAdminAddressBytes();
}
