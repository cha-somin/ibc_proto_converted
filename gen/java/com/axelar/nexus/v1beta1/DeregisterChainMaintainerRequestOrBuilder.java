// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/tx.proto

package com.axelar.nexus.v1beta1;

public interface DeregisterChainMaintainerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.nexus.v1beta1.DeregisterChainMaintainerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  com.google.protobuf.ByteString getSender();

  /**
   * <code>repeated string chains = 2 [json_name = "chains", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return A list containing the chains.
   */
  java.util.List<java.lang.String>
      getChainsList();
  /**
   * <code>repeated string chains = 2 [json_name = "chains", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The count of chains.
   */
  int getChainsCount();
  /**
   * <code>repeated string chains = 2 [json_name = "chains", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @param index The index of the element to return.
   * @return The chains at the given index.
   */
  java.lang.String getChains(int index);
  /**
   * <code>repeated string chains = 2 [json_name = "chains", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the chains at the given index.
   */
  com.google.protobuf.ByteString
      getChainsBytes(int index);
}
