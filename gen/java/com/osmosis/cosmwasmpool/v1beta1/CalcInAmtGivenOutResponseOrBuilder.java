// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/cosmwasmpool/v1beta1/model/module_query_msg.proto

package com.osmosis.cosmwasmpool.v1beta1;

public interface CalcInAmtGivenOutResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.cosmwasmpool.v1beta1.CalcInAmtGivenOutResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * token_in is the token in computed from this swap estimate call.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_in = 1 [json_name = "tokenIn", (.gogoproto.nullable) = false];</code>
   * @return Whether the tokenIn field is set.
   */
  boolean hasTokenIn();
  /**
   * <pre>
   * token_in is the token in computed from this swap estimate call.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_in = 1 [json_name = "tokenIn", (.gogoproto.nullable) = false];</code>
   * @return The tokenIn.
   */
  com.cosmos.base.v1beta1.Coin getTokenIn();
  /**
   * <pre>
   * token_in is the token in computed from this swap estimate call.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_in = 1 [json_name = "tokenIn", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTokenInOrBuilder();
}
