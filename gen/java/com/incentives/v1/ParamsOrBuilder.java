// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/incentives/v1/genesis.proto

package com.incentives.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:incentives.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DistributionPerBlock defines the coin to be sent to the distribution module from the community pool every block
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin distribution_per_block = 1 [json_name = "distributionPerBlock", (.gogoproto.nullable) = false];</code>
   * @return Whether the distributionPerBlock field is set.
   */
  boolean hasDistributionPerBlock();
  /**
   * <pre>
   * DistributionPerBlock defines the coin to be sent to the distribution module from the community pool every block
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin distribution_per_block = 1 [json_name = "distributionPerBlock", (.gogoproto.nullable) = false];</code>
   * @return The distributionPerBlock.
   */
  com.cosmos.base.v1beta1.Coin getDistributionPerBlock();
  /**
   * <pre>
   * DistributionPerBlock defines the coin to be sent to the distribution module from the community pool every block
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin distribution_per_block = 1 [json_name = "distributionPerBlock", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getDistributionPerBlockOrBuilder();

  /**
   * <pre>
   * IncentivesCutoffHeight defines the block height after which the incentives module will stop sending coins to the distribution module from
   * the community pool
   * </pre>
   *
   * <code>uint64 incentives_cutoff_height = 2 [json_name = "incentivesCutoffHeight"];</code>
   * @return The incentivesCutoffHeight.
   */
  long getIncentivesCutoffHeight();
}
