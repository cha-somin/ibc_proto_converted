// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/twasm/v1beta1/genesis.proto

package com.confio.twasm.v1beta1;

public interface ContractOrBuilder extends
    // @@protoc_insertion_point(interface_extends:confio.twasm.v1beta1.Contract)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();

  /**
   * <code>.cosmwasm.wasm.v1.ContractInfo contract_info = 2 [json_name = "contractInfo", (.gogoproto.nullable) = false];</code>
   * @return Whether the contractInfo field is set.
   */
  boolean hasContractInfo();
  /**
   * <code>.cosmwasm.wasm.v1.ContractInfo contract_info = 2 [json_name = "contractInfo", (.gogoproto.nullable) = false];</code>
   * @return The contractInfo.
   */
  com.cosmwasm.wasm.v1.ContractInfo getContractInfo();
  /**
   * <code>.cosmwasm.wasm.v1.ContractInfo contract_info = 2 [json_name = "contractInfo", (.gogoproto.nullable) = false];</code>
   */
  com.cosmwasm.wasm.v1.ContractInfoOrBuilder getContractInfoOrBuilder();

  /**
   * <code>.confio.twasm.v1beta1.KVModel kv_model = 3 [json_name = "kvModel"];</code>
   * @return Whether the kvModel field is set.
   */
  boolean hasKvModel();
  /**
   * <code>.confio.twasm.v1beta1.KVModel kv_model = 3 [json_name = "kvModel"];</code>
   * @return The kvModel.
   */
  com.confio.twasm.v1beta1.KVModel getKvModel();
  /**
   * <code>.confio.twasm.v1beta1.KVModel kv_model = 3 [json_name = "kvModel"];</code>
   */
  com.confio.twasm.v1beta1.KVModelOrBuilder getKvModelOrBuilder();

  /**
   * <code>.confio.twasm.v1beta1.CustomModel custom_model = 4 [json_name = "customModel"];</code>
   * @return Whether the customModel field is set.
   */
  boolean hasCustomModel();
  /**
   * <code>.confio.twasm.v1beta1.CustomModel custom_model = 4 [json_name = "customModel"];</code>
   * @return The customModel.
   */
  com.confio.twasm.v1beta1.CustomModel getCustomModel();
  /**
   * <code>.confio.twasm.v1beta1.CustomModel custom_model = 4 [json_name = "customModel"];</code>
   */
  com.confio.twasm.v1beta1.CustomModelOrBuilder getCustomModelOrBuilder();

  com.confio.twasm.v1beta1.Contract.ContractStateCase getContractStateCase();
}
