// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/events.proto

package com.axelar.evm.v1beta1;

public interface MintCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.evm.v1beta1.MintCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string chain = 1 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The chain.
   */
  java.lang.String getChain();
  /**
   * <code>string chain = 1 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for chain.
   */
  com.google.protobuf.ByteString
      getChainBytes();

  /**
   * <code>uint64 transfer_id = 2 [json_name = "transferId", (.gogoproto.customname) = "TransferID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.TransferID"];</code>
   * @return The transferId.
   */
  long getTransferId();

  /**
   * <code>bytes command_id = 3 [json_name = "commandId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "CommandID", (.gogoproto.customname) = "CommandID"];</code>
   * @return The commandId.
   */
  com.google.protobuf.ByteString getCommandId();

  /**
   * <code>string destination_chain = 4 [json_name = "destinationChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The destinationChain.
   */
  java.lang.String getDestinationChain();
  /**
   * <code>string destination_chain = 4 [json_name = "destinationChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for destinationChain.
   */
  com.google.protobuf.ByteString
      getDestinationChainBytes();

  /**
   * <code>string destination_address = 5 [json_name = "destinationAddress"];</code>
   * @return The destinationAddress.
   */
  java.lang.String getDestinationAddress();
  /**
   * <code>string destination_address = 5 [json_name = "destinationAddress"];</code>
   * @return The bytes for destinationAddress.
   */
  com.google.protobuf.ByteString
      getDestinationAddressBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin asset = 6 [json_name = "asset", (.gogoproto.nullable) = false];</code>
   * @return Whether the asset field is set.
   */
  boolean hasAsset();
  /**
   * <code>.cosmos.base.v1beta1.Coin asset = 6 [json_name = "asset", (.gogoproto.nullable) = false];</code>
   * @return The asset.
   */
  com.cosmos.base.v1beta1.Coin getAsset();
  /**
   * <code>.cosmos.base.v1beta1.Coin asset = 6 [json_name = "asset", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAssetOrBuilder();
}
