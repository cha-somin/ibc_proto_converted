// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/revenue/v1/query.proto

package com.evmos.revenue.v1;

public interface QueryParamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:evmos.revenue.v1.QueryParamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params is the returned revenue parameter
   * </pre>
   *
   * <code>.evmos.revenue.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params is the returned revenue parameter
   * </pre>
   *
   * <code>.evmos.revenue.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.evmos.revenue.v1.Params getParams();
  /**
   * <pre>
   * params is the returned revenue parameter
   * </pre>
   *
   * <code>.evmos.revenue.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.evmos.revenue.v1.ParamsOrBuilder getParamsOrBuilder();
}
