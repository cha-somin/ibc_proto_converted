// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/token/v1beta1/tx.proto

package com.ixo.token.v1beta1;

public interface MsgStopTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ixo.token.v1beta1.MsgStopToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * address of minter
   * </pre>
   *
   * <code>string minter = 1 [json_name = "minter"];</code>
   * @return The minter.
   */
  java.lang.String getMinter();
  /**
   * <pre>
   * address of minter
   * </pre>
   *
   * <code>string minter = 1 [json_name = "minter"];</code>
   * @return The bytes for minter.
   */
  com.google.protobuf.ByteString
      getMinterBytes();

  /**
   * <code>string contract_address = 2 [json_name = "contractAddress"];</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <code>string contract_address = 2 [json_name = "contractAddress"];</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();
}
