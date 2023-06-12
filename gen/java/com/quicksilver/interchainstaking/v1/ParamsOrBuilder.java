// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/interchainstaking/v1/genesis.proto

package com.quicksilver.interchainstaking.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:quicksilver.interchainstaking.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 deposit_interval = 1 [json_name = "depositInterval"];</code>
   * @return The depositInterval.
   */
  long getDepositInterval();

  /**
   * <code>uint64 validatorset_interval = 2 [json_name = "validatorsetInterval"];</code>
   * @return The validatorsetInterval.
   */
  long getValidatorsetInterval();

  /**
   * <code>string commission_rate = 3 [json_name = "commissionRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The commissionRate.
   */
  java.lang.String getCommissionRate();
  /**
   * <code>string commission_rate = 3 [json_name = "commissionRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for commissionRate.
   */
  com.google.protobuf.ByteString
      getCommissionRateBytes();

  /**
   * <code>bool unbonding_enabled = 4 [json_name = "unbondingEnabled"];</code>
   * @return The unbondingEnabled.
   */
  boolean getUnbondingEnabled();
}
