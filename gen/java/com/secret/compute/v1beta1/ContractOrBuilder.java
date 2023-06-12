// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/compute/v1beta1/genesis.proto

package com.secret.compute.v1beta1;

public interface ContractOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secret.compute.v1beta1.Contract)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes contract_address = 1 [json_name = "contractAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The contractAddress.
   */
  com.google.protobuf.ByteString getContractAddress();

  /**
   * <code>.secret.compute.v1beta1.ContractInfo contract_info = 2 [json_name = "contractInfo", (.gogoproto.nullable) = false];</code>
   * @return Whether the contractInfo field is set.
   */
  boolean hasContractInfo();
  /**
   * <code>.secret.compute.v1beta1.ContractInfo contract_info = 2 [json_name = "contractInfo", (.gogoproto.nullable) = false];</code>
   * @return The contractInfo.
   */
  com.secret.compute.v1beta1.ContractInfo getContractInfo();
  /**
   * <code>.secret.compute.v1beta1.ContractInfo contract_info = 2 [json_name = "contractInfo", (.gogoproto.nullable) = false];</code>
   */
  com.secret.compute.v1beta1.ContractInfoOrBuilder getContractInfoOrBuilder();

  /**
   * <code>repeated .secret.compute.v1beta1.Model contract_state = 3 [json_name = "contractState", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.secret.compute.v1beta1.Model> 
      getContractStateList();
  /**
   * <code>repeated .secret.compute.v1beta1.Model contract_state = 3 [json_name = "contractState", (.gogoproto.nullable) = false];</code>
   */
  com.secret.compute.v1beta1.Model getContractState(int index);
  /**
   * <code>repeated .secret.compute.v1beta1.Model contract_state = 3 [json_name = "contractState", (.gogoproto.nullable) = false];</code>
   */
  int getContractStateCount();
  /**
   * <code>repeated .secret.compute.v1beta1.Model contract_state = 3 [json_name = "contractState", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.secret.compute.v1beta1.ModelOrBuilder> 
      getContractStateOrBuilderList();
  /**
   * <code>repeated .secret.compute.v1beta1.Model contract_state = 3 [json_name = "contractState", (.gogoproto.nullable) = false];</code>
   */
  com.secret.compute.v1beta1.ModelOrBuilder getContractStateOrBuilder(
      int index);

  /**
   * <code>.secret.compute.v1beta1.ContractCustomInfo contract_custom_info = 4 [json_name = "contractCustomInfo"];</code>
   * @return Whether the contractCustomInfo field is set.
   */
  boolean hasContractCustomInfo();
  /**
   * <code>.secret.compute.v1beta1.ContractCustomInfo contract_custom_info = 4 [json_name = "contractCustomInfo"];</code>
   * @return The contractCustomInfo.
   */
  com.secret.compute.v1beta1.ContractCustomInfo getContractCustomInfo();
  /**
   * <code>.secret.compute.v1beta1.ContractCustomInfo contract_custom_info = 4 [json_name = "contractCustomInfo"];</code>
   */
  com.secret.compute.v1beta1.ContractCustomInfoOrBuilder getContractCustomInfoOrBuilder();
}
