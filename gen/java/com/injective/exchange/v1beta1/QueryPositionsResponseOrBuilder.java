// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

public interface QueryPositionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.QueryPositionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .injective.exchange.v1beta1.DerivativePosition state = 1 [json_name = "state", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.injective.exchange.v1beta1.DerivativePosition> 
      getStateList();
  /**
   * <code>repeated .injective.exchange.v1beta1.DerivativePosition state = 1 [json_name = "state", (.gogoproto.nullable) = false];</code>
   */
  com.injective.exchange.v1beta1.DerivativePosition getState(int index);
  /**
   * <code>repeated .injective.exchange.v1beta1.DerivativePosition state = 1 [json_name = "state", (.gogoproto.nullable) = false];</code>
   */
  int getStateCount();
  /**
   * <code>repeated .injective.exchange.v1beta1.DerivativePosition state = 1 [json_name = "state", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.injective.exchange.v1beta1.DerivativePositionOrBuilder> 
      getStateOrBuilderList();
  /**
   * <code>repeated .injective.exchange.v1beta1.DerivativePosition state = 1 [json_name = "state", (.gogoproto.nullable) = false];</code>
   */
  com.injective.exchange.v1beta1.DerivativePositionOrBuilder getStateOrBuilder(
      int index);
}
