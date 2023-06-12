// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/multisig/v1beta1/types.proto

package com.axelar.multisig.v1beta1;

public interface KeyEpochOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.multisig.v1beta1.KeyEpoch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 epoch = 1 [json_name = "epoch"];</code>
   * @return The epoch.
   */
  long getEpoch();

  /**
   * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The chain.
   */
  java.lang.String getChain();
  /**
   * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for chain.
   */
  com.google.protobuf.ByteString
      getChainBytes();

  /**
   * <code>string key_id = 3 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
   * @return The keyId.
   */
  java.lang.String getKeyId();
  /**
   * <code>string key_id = 3 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
   * @return The bytes for keyId.
   */
  com.google.protobuf.ByteString
      getKeyIdBytes();
}
