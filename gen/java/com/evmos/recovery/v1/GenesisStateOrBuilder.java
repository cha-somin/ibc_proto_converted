// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/recovery/v1/genesis.proto

package com.evmos.recovery.v1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:evmos.recovery.v1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params defines all the paramaters of the module.
   * </pre>
   *
   * <code>.evmos.recovery.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines all the paramaters of the module.
   * </pre>
   *
   * <code>.evmos.recovery.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.evmos.recovery.v1.Params getParams();
  /**
   * <pre>
   * params defines all the paramaters of the module.
   * </pre>
   *
   * <code>.evmos.recovery.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.evmos.recovery.v1.ParamsOrBuilder getParamsOrBuilder();
}
