// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/axelarnet/v1beta1/types.proto

package com.axelar.axelarnet.v1beta1;

@java.lang.Deprecated public interface AssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.axelarnet.v1beta1.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>bytes min_amount = 2 [json_name = "minAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The minAmount.
   */
  com.google.protobuf.ByteString getMinAmount();
}
