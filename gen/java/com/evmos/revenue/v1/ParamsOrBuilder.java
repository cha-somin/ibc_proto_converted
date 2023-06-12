// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/revenue/v1/genesis.proto

package com.evmos.revenue.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:evmos.revenue.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * enable_revenue defines a parameter to enable the revenue module
   * </pre>
   *
   * <code>bool enable_revenue = 1 [json_name = "enableRevenue"];</code>
   * @return The enableRevenue.
   */
  boolean getEnableRevenue();

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
