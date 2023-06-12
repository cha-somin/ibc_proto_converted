// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/tx.proto

package com.axelar.evm.v1beta1;

@java.lang.Deprecated public interface CreateTransferOwnershipRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.evm.v1beta1.CreateTransferOwnershipRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  com.google.protobuf.ByteString getSender();

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
