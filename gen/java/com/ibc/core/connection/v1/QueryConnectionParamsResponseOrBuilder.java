// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package com.ibc.core.connection.v1;

public interface QueryConnectionParamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.QueryConnectionParamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.core.connection.v1.Params params = 1 [json_name = "params"];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.core.connection.v1.Params params = 1 [json_name = "params"];</code>
   * @return The params.
   */
  com.ibc.core.connection.v1.Params getParams();
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.core.connection.v1.Params params = 1 [json_name = "params"];</code>
   */
  com.ibc.core.connection.v1.ParamsOrBuilder getParamsOrBuilder();
}
