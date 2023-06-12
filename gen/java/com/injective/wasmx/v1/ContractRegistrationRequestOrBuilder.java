// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/wasmx/v1/proposal.proto

package com.injective.wasmx.v1;

public interface ContractRegistrationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.wasmx.v1.ContractRegistrationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique Identifier for contract instance to be registered.
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <pre>
   * Unique Identifier for contract instance to be registered.
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();

  /**
   * <pre>
   * Maximum gas to be used for the smart contract execution.
   * </pre>
   *
   * <code>uint64 gas_limit = 2 [json_name = "gasLimit"];</code>
   * @return The gasLimit.
   */
  long getGasLimit();

  /**
   * <pre>
   * gas price to be used for the smart contract execution.
   * </pre>
   *
   * <code>uint64 gas_price = 3 [json_name = "gasPrice"];</code>
   * @return The gasPrice.
   */
  long getGasPrice();

  /**
   * <code>bool should_pin_contract = 4 [json_name = "shouldPinContract"];</code>
   * @return The shouldPinContract.
   */
  boolean getShouldPinContract();

  /**
   * <pre>
   * if true contract owner can update it, if false only current code_id will be
   * allowed to be executed
   * </pre>
   *
   * <code>bool is_migration_allowed = 5 [json_name = "isMigrationAllowed"];</code>
   * @return The isMigrationAllowed.
   */
  boolean getIsMigrationAllowed();

  /**
   * <pre>
   * code_id of the contract being registered - will be verified upon every
   * execution but only if is_migration_allowed is false
   * </pre>
   *
   * <code>uint64 code_id = 6 [json_name = "codeId"];</code>
   * @return The codeId.
   */
  long getCodeId();

  /**
   * <pre>
   * Optional address of admin account (that will be allowed to pause or update
   * contract params)
   * </pre>
   *
   * <code>string admin_address = 7 [json_name = "adminAddress"];</code>
   * @return The adminAddress.
   */
  java.lang.String getAdminAddress();
  /**
   * <pre>
   * Optional address of admin account (that will be allowed to pause or update
   * contract params)
   * </pre>
   *
   * <code>string admin_address = 7 [json_name = "adminAddress"];</code>
   * @return The bytes for adminAddress.
   */
  com.google.protobuf.ByteString
      getAdminAddressBytes();

  /**
   * <pre>
   * Optional address of the contract that grants fees. Must be set if
   * funding_mode is other than SelfFunded
   * </pre>
   *
   * <code>string granter_address = 8 [json_name = "granterAddress"];</code>
   * @return The granterAddress.
   */
  java.lang.String getGranterAddress();
  /**
   * <pre>
   * Optional address of the contract that grants fees. Must be set if
   * funding_mode is other than SelfFunded
   * </pre>
   *
   * <code>string granter_address = 8 [json_name = "granterAddress"];</code>
   * @return The bytes for granterAddress.
   */
  com.google.protobuf.ByteString
      getGranterAddressBytes();

  /**
   * <pre>
   * Specifies how the contract will fund its execution
   * </pre>
   *
   * <code>.injective.wasmx.v1.FundingMode funding_mode = 9 [json_name = "fundingMode"];</code>
   * @return The enum numeric value on the wire for fundingMode.
   */
  int getFundingModeValue();
  /**
   * <pre>
   * Specifies how the contract will fund its execution
   * </pre>
   *
   * <code>.injective.wasmx.v1.FundingMode funding_mode = 9 [json_name = "fundingMode"];</code>
   * @return The fundingMode.
   */
  com.injective.wasmx.v1.FundingMode getFundingMode();
}
