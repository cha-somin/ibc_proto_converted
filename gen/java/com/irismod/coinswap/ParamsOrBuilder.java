// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/coinswap/coinswap.proto

package com.irismod.coinswap;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.coinswap.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.base.v1beta1.Coin fee = 1 [json_name = "fee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return Whether the fee field is set.
   */
  boolean hasFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin fee = 1 [json_name = "fee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The fee.
   */
  com.cosmos.base.v1beta1.Coin getFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin fee = 1 [json_name = "fee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getFeeOrBuilder();
}
