// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/ibc-rate-limit/v1beta1/query.proto

package com.osmosis.ibcratelimit.v1beta1;

public interface ParamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.ibcratelimit.v1beta1.ParamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.osmosis.ibcratelimit.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.osmosis.ibcratelimit.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.osmosis.ibcratelimit.v1beta1.Params getParams();
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.osmosis.ibcratelimit.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.osmosis.ibcratelimit.v1beta1.ParamsOrBuilder getParamsOrBuilder();
}
