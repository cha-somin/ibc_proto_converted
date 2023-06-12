// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/feemarket/v1/feemarket.proto

package com.ethermint.feemarket.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ethermint.feemarket.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * no_base_fee forces the EIP-1559 base fee to 0 (needed for 0 price calls)
   * </pre>
   *
   * <code>bool no_base_fee = 1 [json_name = "noBaseFee"];</code>
   * @return The noBaseFee.
   */
  boolean getNoBaseFee();

  /**
   * <pre>
   * base_fee_change_denominator bounds the amount the base fee can change
   * between blocks.
   * </pre>
   *
   * <code>uint32 base_fee_change_denominator = 2 [json_name = "baseFeeChangeDenominator"];</code>
   * @return The baseFeeChangeDenominator.
   */
  int getBaseFeeChangeDenominator();

  /**
   * <pre>
   * elasticity_multiplier bounds the maximum gas limit an EIP-1559 block may
   * have.
   * </pre>
   *
   * <code>uint32 elasticity_multiplier = 3 [json_name = "elasticityMultiplier"];</code>
   * @return The elasticityMultiplier.
   */
  int getElasticityMultiplier();

  /**
   * <pre>
   * enable_height defines at which block height the base fee calculation is enabled.
   * </pre>
   *
   * <code>int64 enable_height = 5 [json_name = "enableHeight"];</code>
   * @return The enableHeight.
   */
  long getEnableHeight();

  /**
   * <pre>
   * base_fee for EIP-1559 blocks.
   * </pre>
   *
   * <code>string base_fee = 6 [json_name = "baseFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The baseFee.
   */
  java.lang.String getBaseFee();
  /**
   * <pre>
   * base_fee for EIP-1559 blocks.
   * </pre>
   *
   * <code>string base_fee = 6 [json_name = "baseFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for baseFee.
   */
  com.google.protobuf.ByteString
      getBaseFeeBytes();

  /**
   * <pre>
   * min_gas_price defines the minimum gas price value for cosmos and eth transactions
   * </pre>
   *
   * <code>string min_gas_price = 7 [json_name = "minGasPrice", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The minGasPrice.
   */
  java.lang.String getMinGasPrice();
  /**
   * <pre>
   * min_gas_price defines the minimum gas price value for cosmos and eth transactions
   * </pre>
   *
   * <code>string min_gas_price = 7 [json_name = "minGasPrice", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for minGasPrice.
   */
  com.google.protobuf.ByteString
      getMinGasPriceBytes();

  /**
   * <pre>
   * min_gas_multiplier bounds the minimum gas used to be charged
   * to senders based on gas limit
   * </pre>
   *
   * <code>string min_gas_multiplier = 8 [json_name = "minGasMultiplier", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The minGasMultiplier.
   */
  java.lang.String getMinGasMultiplier();
  /**
   * <pre>
   * min_gas_multiplier bounds the minimum gas used to be charged
   * to senders based on gas limit
   * </pre>
   *
   * <code>string min_gas_multiplier = 8 [json_name = "minGasMultiplier", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for minGasMultiplier.
   */
  com.google.protobuf.ByteString
      getMinGasMultiplierBytes();
}
