// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/bridge/tx.proto

package com.stafihub.stafihub.bridge;

public interface MsgAddBannedDenomOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.bridge.MsgAddBannedDenom)
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
   * <code>uint32 chainId = 2 [json_name = "chainId", (.gogoproto.jsontag) = "chainId"];</code>
   * @return The chainId.
   */
  int getChainId();

  /**
   * <code>string denom = 3 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 3 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();
}
