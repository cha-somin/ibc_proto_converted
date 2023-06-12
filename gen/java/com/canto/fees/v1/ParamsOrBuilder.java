// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/fees/v1/genesis.proto

package com.canto.fees.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:canto.fees.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * parameter to enable fees
   * </pre>
   *
   * <code>bool enable_fees = 1 [json_name = "enableFees"];</code>
   * @return The enableFees.
   */
  boolean getEnableFees();

  /**
   * <pre>
   * developer_shares defines the proportion of the transaction fees to be
   * distributed to the registered contract owner
   * </pre>
   *
   * <code>string developer_shares = 2 [json_name = "developerShares", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The developerShares.
   */
  java.lang.String getDeveloperShares();
  /**
   * <pre>
   * developer_shares defines the proportion of the transaction fees to be
   * distributed to the registered contract owner
   * </pre>
   *
   * <code>string developer_shares = 2 [json_name = "developerShares", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for developerShares.
   */
  com.google.protobuf.ByteString
      getDeveloperSharesBytes();

  /**
   * <pre>
   * addr_derivation_cost_create defines the cost of address derivation for
   * verifying the contract deployer at fee registration
   * </pre>
   *
   * <code>uint64 addr_derivation_cost_create = 3 [json_name = "addrDerivationCostCreate"];</code>
   * @return The addrDerivationCostCreate.
   */
  long getAddrDerivationCostCreate();
}
