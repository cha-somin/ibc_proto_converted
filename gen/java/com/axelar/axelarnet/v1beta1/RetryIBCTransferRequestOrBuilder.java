// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/axelarnet/v1beta1/tx.proto

package com.axelar.axelarnet.v1beta1;

public interface RetryIBCTransferRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.axelarnet.v1beta1.RetryIBCTransferRequest)
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
   * <code>uint64 id = 3 [json_name = "id", (.gogoproto.customname) = "ID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.TransferID"];</code>
   * @return The id.
   */
  long getId();
}
