// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/feerefunder/genesis.proto

package com.neutron.feerefunder;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:neutron.feerefunder.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.neutron.feerefunder.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.neutron.feerefunder.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.neutron.feerefunder.Params getParams();
  /**
   * <code>.neutron.feerefunder.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.neutron.feerefunder.ParamsOrBuilder getParamsOrBuilder();

  /**
   * <pre>
   * this line is used by starport scaffolding # genesis/proto/state
   * </pre>
   *
   * <code>repeated .neutron.feerefunder.FeeInfo fee_infos = 2 [json_name = "feeInfos", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.neutron.feerefunder.FeeInfo> 
      getFeeInfosList();
  /**
   * <pre>
   * this line is used by starport scaffolding # genesis/proto/state
   * </pre>
   *
   * <code>repeated .neutron.feerefunder.FeeInfo fee_infos = 2 [json_name = "feeInfos", (.gogoproto.nullable) = false];</code>
   */
  com.neutron.feerefunder.FeeInfo getFeeInfos(int index);
  /**
   * <pre>
   * this line is used by starport scaffolding # genesis/proto/state
   * </pre>
   *
   * <code>repeated .neutron.feerefunder.FeeInfo fee_infos = 2 [json_name = "feeInfos", (.gogoproto.nullable) = false];</code>
   */
  int getFeeInfosCount();
  /**
   * <pre>
   * this line is used by starport scaffolding # genesis/proto/state
   * </pre>
   *
   * <code>repeated .neutron.feerefunder.FeeInfo fee_infos = 2 [json_name = "feeInfos", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.neutron.feerefunder.FeeInfoOrBuilder> 
      getFeeInfosOrBuilderList();
  /**
   * <pre>
   * this line is used by starport scaffolding # genesis/proto/state
   * </pre>
   *
   * <code>repeated .neutron.feerefunder.FeeInfo fee_infos = 2 [json_name = "feeInfos", (.gogoproto.nullable) = false];</code>
   */
  com.neutron.feerefunder.FeeInfoOrBuilder getFeeInfosOrBuilder(
      int index);
}
