// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/cosmwasmpool/v1beta1/model/module_query_msg.proto

package com.osmosis.cosmwasmpool.v1beta1;

public interface CalcOutAmtGivenInResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * token_out is the token out computed from this swap estimate call.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
   * @return Whether the tokenOut field is set.
   */
  boolean hasTokenOut();
  /**
   * <pre>
   * token_out is the token out computed from this swap estimate call.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
   * @return The tokenOut.
   */
  com.cosmos.base.v1beta1.Coin getTokenOut();
  /**
   * <pre>
   * token_out is the token out computed from this swap estimate call.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTokenOutOrBuilder();
}
