// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/merkledrop/v1beta1/params.proto

package com.bitsong.merkledrop.v1beta1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bitsong.merkledrop.v1beta1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.base.v1beta1.Coin creation_fee = 1 [json_name = "creationFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.gogoproto.moretags) = "yaml:&#92;"creation_fee&#92;""];</code>
   * @return Whether the creationFee field is set.
   */
  boolean hasCreationFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin creation_fee = 1 [json_name = "creationFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.gogoproto.moretags) = "yaml:&#92;"creation_fee&#92;""];</code>
   * @return The creationFee.
   */
  com.cosmos.base.v1beta1.Coin getCreationFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin creation_fee = 1 [json_name = "creationFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.gogoproto.moretags) = "yaml:&#92;"creation_fee&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getCreationFeeOrBuilder();
}
