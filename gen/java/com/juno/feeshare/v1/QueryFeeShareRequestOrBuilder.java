// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: juno/feeshare/v1/query.proto

package com.juno.feeshare.v1;

public interface QueryFeeShareRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:juno.feeshare.v1.QueryFeeShareRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * contract_address of a registered contract in bech32 format
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <pre>
   * contract_address of a registered contract in bech32 format
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();
}
