// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/claim/genesis.proto

package com.stafihub.stafihub.claim;

public interface MerkleRootOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.claim.MerkleRoot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 round = 1 [json_name = "round"];</code>
   * @return The round.
   */
  long getRound();

  /**
   * <code>string rootHash = 2 [json_name = "rootHash"];</code>
   * @return The rootHash.
   */
  java.lang.String getRootHash();
  /**
   * <code>string rootHash = 2 [json_name = "rootHash"];</code>
   * @return The bytes for rootHash.
   */
  com.google.protobuf.ByteString
      getRootHashBytes();
}
