// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/poolmanager/v1beta1/tx.proto

package com.osmosis.poolmanager.v1beta1;

public interface MsgSwapExactAmountInResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.poolmanager.v1beta1.MsgSwapExactAmountInResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string token_out_amount = 1 [json_name = "tokenOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_out_amount&#92;""];</code>
   * @return The tokenOutAmount.
   */
  java.lang.String getTokenOutAmount();
  /**
   * <code>string token_out_amount = 1 [json_name = "tokenOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_out_amount&#92;""];</code>
   * @return The bytes for tokenOutAmount.
   */
  com.google.protobuf.ByteString
      getTokenOutAmountBytes();
}
