// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/query.proto

package com.injective.peggy.v1;

public interface QueryDelegateKeysByEthAddressResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.peggy.v1.QueryDelegateKeysByEthAddressResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
   * @return The validatorAddress.
   */
  java.lang.String getValidatorAddress();
  /**
   * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
   * @return The bytes for validatorAddress.
   */
  com.google.protobuf.ByteString
      getValidatorAddressBytes();

  /**
   * <code>string orchestrator_address = 2 [json_name = "orchestratorAddress"];</code>
   * @return The orchestratorAddress.
   */
  java.lang.String getOrchestratorAddress();
  /**
   * <code>string orchestrator_address = 2 [json_name = "orchestratorAddress"];</code>
   * @return The bytes for orchestratorAddress.
   */
  com.google.protobuf.ByteString
      getOrchestratorAddressBytes();
}
