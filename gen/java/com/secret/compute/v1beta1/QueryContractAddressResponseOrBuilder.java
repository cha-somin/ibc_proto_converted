// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/compute/v1beta1/query.proto

package com.secret.compute.v1beta1;

public interface QueryContractAddressResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secret.compute.v1beta1.QueryContractAddressResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * address is the bech32 human readable address of the contract
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <pre>
   * address is the bech32 human readable address of the contract
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();
}
