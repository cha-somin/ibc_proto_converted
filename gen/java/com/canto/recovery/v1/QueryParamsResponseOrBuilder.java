// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/recovery/v1/query.proto

package com.canto.recovery.v1;

public interface QueryParamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:canto.recovery.v1.QueryParamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.canto.recovery.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.canto.recovery.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.canto.recovery.v1.Params getParams();
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.canto.recovery.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.canto.recovery.v1.ParamsOrBuilder getParamsOrBuilder();
}
