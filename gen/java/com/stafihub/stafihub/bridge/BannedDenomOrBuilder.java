// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/bridge/genesis.proto

package com.stafihub.stafihub.bridge;

public interface BannedDenomOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.bridge.BannedDenom)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 chainId = 1 [json_name = "chainId"];</code>
   * @return The chainId.
   */
  int getChainId();

  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();
}
