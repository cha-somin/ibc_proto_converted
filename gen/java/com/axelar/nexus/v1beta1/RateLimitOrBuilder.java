// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/types.proto

package com.axelar.nexus.v1beta1;

public interface RateLimitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.nexus.v1beta1.RateLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string chain = 1 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The chain.
   */
  java.lang.String getChain();
  /**
   * <code>string chain = 1 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for chain.
   */
  com.google.protobuf.ByteString
      getChainBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin limit = 2 [json_name = "limit", (.gogoproto.nullable) = false];</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <code>.cosmos.base.v1beta1.Coin limit = 2 [json_name = "limit", (.gogoproto.nullable) = false];</code>
   * @return The limit.
   */
  com.cosmos.base.v1beta1.Coin getLimit();
  /**
   * <code>.cosmos.base.v1beta1.Coin limit = 2 [json_name = "limit", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getLimitOrBuilder();

  /**
   * <code>.google.protobuf.Duration window = 3 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return Whether the window field is set.
   */
  boolean hasWindow();
  /**
   * <code>.google.protobuf.Duration window = 3 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return The window.
   */
  com.google.protobuf.Duration getWindow();
  /**
   * <code>.google.protobuf.Duration window = 3 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getWindowOrBuilder();
}
