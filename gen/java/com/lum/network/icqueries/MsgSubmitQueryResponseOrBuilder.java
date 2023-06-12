// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/icqueries/tx.proto

package com.lum.network.icqueries;

public interface MsgSubmitQueryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lum.network.icqueries.MsgSubmitQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
   * @return The chainId.
   */
  java.lang.String getChainId();
  /**
   * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>string query_id = 2 [json_name = "queryId", (.gogoproto.moretags) = "yaml:&#92;"query_id&#92;""];</code>
   * @return The queryId.
   */
  java.lang.String getQueryId();
  /**
   * <code>string query_id = 2 [json_name = "queryId", (.gogoproto.moretags) = "yaml:&#92;"query_id&#92;""];</code>
   * @return The bytes for queryId.
   */
  com.google.protobuf.ByteString
      getQueryIdBytes();

  /**
   * <code>bytes result = 3 [json_name = "result", (.gogoproto.moretags) = "yaml:&#92;"result&#92;""];</code>
   * @return The result.
   */
  com.google.protobuf.ByteString getResult();

  /**
   * <code>.tendermint.crypto.ProofOps proof_ops = 4 [json_name = "proofOps", (.gogoproto.moretags) = "yaml:&#92;"proof_ops&#92;""];</code>
   * @return Whether the proofOps field is set.
   */
  boolean hasProofOps();
  /**
   * <code>.tendermint.crypto.ProofOps proof_ops = 4 [json_name = "proofOps", (.gogoproto.moretags) = "yaml:&#92;"proof_ops&#92;""];</code>
   * @return The proofOps.
   */
  com.tendermint.crypto.ProofOps getProofOps();
  /**
   * <code>.tendermint.crypto.ProofOps proof_ops = 4 [json_name = "proofOps", (.gogoproto.moretags) = "yaml:&#92;"proof_ops&#92;""];</code>
   */
  com.tendermint.crypto.ProofOpsOrBuilder getProofOpsOrBuilder();

  /**
   * <code>int64 height = 5 [json_name = "height", (.gogoproto.moretags) = "yaml:&#92;"height&#92;""];</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <code>string from_address = 6 [json_name = "fromAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The fromAddress.
   */
  java.lang.String getFromAddress();
  /**
   * <code>string from_address = 6 [json_name = "fromAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for fromAddress.
   */
  com.google.protobuf.ByteString
      getFromAddressBytes();
}
