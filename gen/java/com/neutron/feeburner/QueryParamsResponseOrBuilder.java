// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/feeburner/query.proto

package com.neutron.feeburner;

public interface QueryParamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:neutron.feeburner.QueryParamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.neutron.feeburner.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.neutron.feeburner.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.neutron.feeburner.Params getParams();
  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.neutron.feeburner.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.neutron.feeburner.ParamsOrBuilder getParamsOrBuilder();
}
