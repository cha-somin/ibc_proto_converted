// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/bridge/genesis.proto

package com.stafihub.stafihub.bridge;

public interface RelayFeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.bridge.RelayFee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 chainId = 1 [json_name = "chainId"];</code>
   * @return The chainId.
   */
  int getChainId();

  /**
   * <code>.cosmos.base.v1beta1.Coin value = 2 [json_name = "value", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.cosmos.base.v1beta1.Coin value = 2 [json_name = "value", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The value.
   */
  com.cosmos.base.v1beta1.Coin getValue();
  /**
   * <code>.cosmos.base.v1beta1.Coin value = 2 [json_name = "value", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getValueOrBuilder();
}
