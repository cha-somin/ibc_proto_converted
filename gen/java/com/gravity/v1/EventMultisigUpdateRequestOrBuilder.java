// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/msgs.proto

package com.gravity.v1;

public interface EventMultisigUpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gravity.v1.EventMultisigUpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string bridge_contract = 1 [json_name = "bridgeContract"];</code>
   * @return The bridgeContract.
   */
  java.lang.String getBridgeContract();
  /**
   * <code>string bridge_contract = 1 [json_name = "bridgeContract"];</code>
   * @return The bytes for bridgeContract.
   */
  com.google.protobuf.ByteString
      getBridgeContractBytes();

  /**
   * <code>string bridge_chain_id = 2 [json_name = "bridgeChainId"];</code>
   * @return The bridgeChainId.
   */
  java.lang.String getBridgeChainId();
  /**
   * <code>string bridge_chain_id = 2 [json_name = "bridgeChainId"];</code>
   * @return The bytes for bridgeChainId.
   */
  com.google.protobuf.ByteString
      getBridgeChainIdBytes();

  /**
   * <code>string multisig_id = 3 [json_name = "multisigId"];</code>
   * @return The multisigId.
   */
  java.lang.String getMultisigId();
  /**
   * <code>string multisig_id = 3 [json_name = "multisigId"];</code>
   * @return The bytes for multisigId.
   */
  com.google.protobuf.ByteString
      getMultisigIdBytes();

  /**
   * <code>string nonce = 4 [json_name = "nonce"];</code>
   * @return The nonce.
   */
  java.lang.String getNonce();
  /**
   * <code>string nonce = 4 [json_name = "nonce"];</code>
   * @return The bytes for nonce.
   */
  com.google.protobuf.ByteString
      getNonceBytes();
}
