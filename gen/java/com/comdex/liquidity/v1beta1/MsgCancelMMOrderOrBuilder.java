// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/tx.proto

package com.comdex.liquidity.v1beta1;

public interface MsgCancelMMOrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidity.v1beta1.MsgCancelMMOrder)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * orderer specifies the bech32-encoded address that makes an order
   * </pre>
   *
   * <code>string orderer = 1 [json_name = "orderer"];</code>
   * @return The orderer.
   */
  java.lang.String getOrderer();
  /**
   * <pre>
   * orderer specifies the bech32-encoded address that makes an order
   * </pre>
   *
   * <code>string orderer = 1 [json_name = "orderer"];</code>
   * @return The bytes for orderer.
   */
  com.google.protobuf.ByteString
      getOrdererBytes();

  /**
   * <code>uint64 app_id = 2 [json_name = "appId"];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <pre>
   * pair_id specifies the pair id to cancel orders
   * </pre>
   *
   * <code>uint64 pair_id = 3 [json_name = "pairId"];</code>
   * @return The pairId.
   */
  long getPairId();
}
