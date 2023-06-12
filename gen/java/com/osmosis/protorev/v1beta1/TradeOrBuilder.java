// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/protorev/v1beta1/protorev.proto

package com.osmosis.protorev.v1beta1;

public interface TradeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.protorev.v1beta1.Trade)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The pool id of the pool that is traded on
   * </pre>
   *
   * <code>uint64 pool = 1 [json_name = "pool", (.gogoproto.moretags) = "yaml:&#92;"pool&#92;""];</code>
   * @return The pool.
   */
  long getPool();

  /**
   * <pre>
   * The denom of the token that is traded
   * </pre>
   *
   * <code>string token_in = 2 [json_name = "tokenIn", (.gogoproto.moretags) = "yaml:&#92;"token_in&#92;""];</code>
   * @return The tokenIn.
   */
  java.lang.String getTokenIn();
  /**
   * <pre>
   * The denom of the token that is traded
   * </pre>
   *
   * <code>string token_in = 2 [json_name = "tokenIn", (.gogoproto.moretags) = "yaml:&#92;"token_in&#92;""];</code>
   * @return The bytes for tokenIn.
   */
  com.google.protobuf.ByteString
      getTokenInBytes();

  /**
   * <pre>
   * The denom of the token that is received
   * </pre>
   *
   * <code>string token_out = 3 [json_name = "tokenOut", (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
   * @return The tokenOut.
   */
  java.lang.String getTokenOut();
  /**
   * <pre>
   * The denom of the token that is received
   * </pre>
   *
   * <code>string token_out = 3 [json_name = "tokenOut", (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
   * @return The bytes for tokenOut.
   */
  com.google.protobuf.ByteString
      getTokenOutBytes();
}
