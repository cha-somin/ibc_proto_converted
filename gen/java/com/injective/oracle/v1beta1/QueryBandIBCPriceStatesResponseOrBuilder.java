// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/query.proto

package com.injective.oracle.v1beta1;

public interface QueryBandIBCPriceStatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.oracle.v1beta1.QueryBandIBCPriceStatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .injective.oracle.v1beta1.BandPriceState price_states = 1 [json_name = "priceStates"];</code>
   */
  java.util.List<com.injective.oracle.v1beta1.BandPriceState> 
      getPriceStatesList();
  /**
   * <code>repeated .injective.oracle.v1beta1.BandPriceState price_states = 1 [json_name = "priceStates"];</code>
   */
  com.injective.oracle.v1beta1.BandPriceState getPriceStates(int index);
  /**
   * <code>repeated .injective.oracle.v1beta1.BandPriceState price_states = 1 [json_name = "priceStates"];</code>
   */
  int getPriceStatesCount();
  /**
   * <code>repeated .injective.oracle.v1beta1.BandPriceState price_states = 1 [json_name = "priceStates"];</code>
   */
  java.util.List<? extends com.injective.oracle.v1beta1.BandPriceStateOrBuilder> 
      getPriceStatesOrBuilderList();
  /**
   * <code>repeated .injective.oracle.v1beta1.BandPriceState price_states = 1 [json_name = "priceStates"];</code>
   */
  com.injective.oracle.v1beta1.BandPriceStateOrBuilder getPriceStatesOrBuilder(
      int index);
}
