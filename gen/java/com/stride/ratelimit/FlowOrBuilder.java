// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/ratelimit/ratelimit.proto

package com.stride.ratelimit;

public interface FlowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.ratelimit.Flow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string inflow = 1 [json_name = "inflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The inflow.
   */
  java.lang.String getInflow();
  /**
   * <code>string inflow = 1 [json_name = "inflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for inflow.
   */
  com.google.protobuf.ByteString
      getInflowBytes();

  /**
   * <code>string outflow = 2 [json_name = "outflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The outflow.
   */
  java.lang.String getOutflow();
  /**
   * <code>string outflow = 2 [json_name = "outflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for outflow.
   */
  com.google.protobuf.ByteString
      getOutflowBytes();

  /**
   * <code>string channel_value = 3 [json_name = "channelValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The channelValue.
   */
  java.lang.String getChannelValue();
  /**
   * <code>string channel_value = 3 [json_name = "channelValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for channelValue.
   */
  com.google.protobuf.ByteString
      getChannelValueBytes();
}
