// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/genesis.proto

package com.axelar.evm.v1beta1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.evm.v1beta1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .axelar.evm.v1beta1.GenesisState.Chain chains = 3 [json_name = "chains", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.axelar.evm.v1beta1.GenesisState.Chain> 
      getChainsList();
  /**
   * <code>repeated .axelar.evm.v1beta1.GenesisState.Chain chains = 3 [json_name = "chains", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.evm.v1beta1.GenesisState.Chain getChains(int index);
  /**
   * <code>repeated .axelar.evm.v1beta1.GenesisState.Chain chains = 3 [json_name = "chains", (.gogoproto.nullable) = false];</code>
   */
  int getChainsCount();
  /**
   * <code>repeated .axelar.evm.v1beta1.GenesisState.Chain chains = 3 [json_name = "chains", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.axelar.evm.v1beta1.GenesisState.ChainOrBuilder> 
      getChainsOrBuilderList();
  /**
   * <code>repeated .axelar.evm.v1beta1.GenesisState.Chain chains = 3 [json_name = "chains", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.evm.v1beta1.GenesisState.ChainOrBuilder getChainsOrBuilder(
      int index);
}
