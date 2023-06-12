// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/msgs.proto

package com.gravity.v1;

public interface MsgBatchSendToEthClaimOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gravity.v1.MsgBatchSendToEthClaim)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 event_nonce = 1 [json_name = "eventNonce"];</code>
   * @return The eventNonce.
   */
  long getEventNonce();

  /**
   * <code>uint64 eth_block_height = 2 [json_name = "ethBlockHeight"];</code>
   * @return The ethBlockHeight.
   */
  long getEthBlockHeight();

  /**
   * <code>uint64 batch_nonce = 3 [json_name = "batchNonce"];</code>
   * @return The batchNonce.
   */
  long getBatchNonce();

  /**
   * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
   * @return The tokenContract.
   */
  java.lang.String getTokenContract();
  /**
   * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
   * @return The bytes for tokenContract.
   */
  com.google.protobuf.ByteString
      getTokenContractBytes();

  /**
   * <code>string orchestrator = 5 [json_name = "orchestrator"];</code>
   * @return The orchestrator.
   */
  java.lang.String getOrchestrator();
  /**
   * <code>string orchestrator = 5 [json_name = "orchestrator"];</code>
   * @return The bytes for orchestrator.
   */
  com.google.protobuf.ByteString
      getOrchestratorBytes();
}
