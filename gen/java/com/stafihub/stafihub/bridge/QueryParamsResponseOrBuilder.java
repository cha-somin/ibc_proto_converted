// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/bridge/query.proto

package com.stafihub.stafihub.bridge;

public interface QueryParamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.bridge.QueryParamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.stafihub.stafihub.bridge.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.stafihub.stafihub.bridge.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.stafihub.stafihub.bridge.Params getParams();
  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.stafihub.stafihub.bridge.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.stafihub.stafihub.bridge.ParamsOrBuilder getParamsOrBuilder();
}
