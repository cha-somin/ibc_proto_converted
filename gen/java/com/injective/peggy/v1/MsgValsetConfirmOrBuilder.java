// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/msgs.proto

package com.injective.peggy.v1;

public interface MsgValsetConfirmOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.peggy.v1.MsgValsetConfirm)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 nonce = 1 [json_name = "nonce"];</code>
   * @return The nonce.
   */
  long getNonce();

  /**
   * <code>string orchestrator = 2 [json_name = "orchestrator"];</code>
   * @return The orchestrator.
   */
  java.lang.String getOrchestrator();
  /**
   * <code>string orchestrator = 2 [json_name = "orchestrator"];</code>
   * @return The bytes for orchestrator.
   */
  com.google.protobuf.ByteString
      getOrchestratorBytes();

  /**
   * <code>string eth_address = 3 [json_name = "ethAddress"];</code>
   * @return The ethAddress.
   */
  java.lang.String getEthAddress();
  /**
   * <code>string eth_address = 3 [json_name = "ethAddress"];</code>
   * @return The bytes for ethAddress.
   */
  com.google.protobuf.ByteString
      getEthAddressBytes();

  /**
   * <code>string signature = 4 [json_name = "signature"];</code>
   * @return The signature.
   */
  java.lang.String getSignature();
  /**
   * <code>string signature = 4 [json_name = "signature"];</code>
   * @return The bytes for signature.
   */
  com.google.protobuf.ByteString
      getSignatureBytes();
}
