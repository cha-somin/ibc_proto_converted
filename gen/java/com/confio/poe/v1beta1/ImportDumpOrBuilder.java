// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/poe/v1beta1/genesis.proto

package com.confio.poe.v1beta1;

public interface ImportDumpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:confio.poe.v1beta1.ImportDump)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contracts PoE contract addresses and types
   * </pre>
   *
   * <code>repeated .confio.poe.v1beta1.PoEContract contracts = 1 [json_name = "contracts", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "contracts,omitempty"];</code>
   */
  java.util.List<com.confio.poe.v1beta1.PoEContract> 
      getContractsList();
  /**
   * <pre>
   * Contracts PoE contract addresses and types
   * </pre>
   *
   * <code>repeated .confio.poe.v1beta1.PoEContract contracts = 1 [json_name = "contracts", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "contracts,omitempty"];</code>
   */
  com.confio.poe.v1beta1.PoEContract getContracts(int index);
  /**
   * <pre>
   * Contracts PoE contract addresses and types
   * </pre>
   *
   * <code>repeated .confio.poe.v1beta1.PoEContract contracts = 1 [json_name = "contracts", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "contracts,omitempty"];</code>
   */
  int getContractsCount();
  /**
   * <pre>
   * Contracts PoE contract addresses and types
   * </pre>
   *
   * <code>repeated .confio.poe.v1beta1.PoEContract contracts = 1 [json_name = "contracts", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "contracts,omitempty"];</code>
   */
  java.util.List<? extends com.confio.poe.v1beta1.PoEContractOrBuilder> 
      getContractsOrBuilderList();
  /**
   * <pre>
   * Contracts PoE contract addresses and types
   * </pre>
   *
   * <code>repeated .confio.poe.v1beta1.PoEContract contracts = 1 [json_name = "contracts", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "contracts,omitempty"];</code>
   */
  com.confio.poe.v1beta1.PoEContractOrBuilder getContractsOrBuilder(
      int index);
}
