// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quasar/qoracle/query.proto

package com.quasarlabs.quasarnode.qoracle;

public interface QueryParamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:quasarlabs.quasarnode.qoracle.QueryParamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.quasarlabs.quasarnode.qoracle.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.quasarlabs.quasarnode.qoracle.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.quasarlabs.quasarnode.qoracle.Params getParams();
  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.quasarlabs.quasarnode.qoracle.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.quasarlabs.quasarnode.qoracle.ParamsOrBuilder getParamsOrBuilder();
}
