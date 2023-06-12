// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/compute/v1beta1/query.proto

package com.secret.compute.v1beta1;

public interface ContractInfoWithAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secret.compute.v1beta1.ContractInfoWithAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * contract_address is the bech32 human readable address of the contract
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <pre>
   * contract_address is the bech32 human readable address of the contract
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();

  /**
   * <code>.secret.compute.v1beta1.ContractInfo ContractInfo = 2 [json_name = "ContractInfo", (.gogoproto.embed) = true, (.gogoproto.jsontag) = ""];</code>
   * @return Whether the contractInfo field is set.
   */
  boolean hasContractInfo();
  /**
   * <code>.secret.compute.v1beta1.ContractInfo ContractInfo = 2 [json_name = "ContractInfo", (.gogoproto.embed) = true, (.gogoproto.jsontag) = ""];</code>
   * @return The contractInfo.
   */
  com.secret.compute.v1beta1.ContractInfo getContractInfo();
  /**
   * <code>.secret.compute.v1beta1.ContractInfo ContractInfo = 2 [json_name = "ContractInfo", (.gogoproto.embed) = true, (.gogoproto.jsontag) = ""];</code>
   */
  com.secret.compute.v1beta1.ContractInfoOrBuilder getContractInfoOrBuilder();
}
