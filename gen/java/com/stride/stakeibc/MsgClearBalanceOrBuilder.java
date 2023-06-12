// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/stakeibc/tx.proto

package com.stride.stakeibc;

public interface MsgClearBalanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.stakeibc.MsgClearBalance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>string chain_id = 2 [json_name = "chainId"];</code>
   * @return The chainId.
   */
  java.lang.String getChainId();
  /**
   * <code>string chain_id = 2 [json_name = "chainId"];</code>
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>string amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>string channel = 4 [json_name = "channel"];</code>
   * @return The channel.
   */
  java.lang.String getChannel();
  /**
   * <code>string channel = 4 [json_name = "channel"];</code>
   * @return The bytes for channel.
   */
  com.google.protobuf.ByteString
      getChannelBytes();
}
