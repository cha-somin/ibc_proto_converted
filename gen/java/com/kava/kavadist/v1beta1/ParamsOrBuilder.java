// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/kavadist/v1beta1/params.proto

package com.kava.kavadist.v1beta1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.kavadist.v1beta1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool active = 1 [json_name = "active"];</code>
   * @return The active.
   */
  boolean getActive();

  /**
   * <code>repeated .kava.kavadist.v1beta1.Period periods = 3 [json_name = "periods", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.kava.kavadist.v1beta1.Period> 
      getPeriodsList();
  /**
   * <code>repeated .kava.kavadist.v1beta1.Period periods = 3 [json_name = "periods", (.gogoproto.nullable) = false];</code>
   */
  com.kava.kavadist.v1beta1.Period getPeriods(int index);
  /**
   * <code>repeated .kava.kavadist.v1beta1.Period periods = 3 [json_name = "periods", (.gogoproto.nullable) = false];</code>
   */
  int getPeriodsCount();
  /**
   * <code>repeated .kava.kavadist.v1beta1.Period periods = 3 [json_name = "periods", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.kava.kavadist.v1beta1.PeriodOrBuilder> 
      getPeriodsOrBuilderList();
  /**
   * <code>repeated .kava.kavadist.v1beta1.Period periods = 3 [json_name = "periods", (.gogoproto.nullable) = false];</code>
   */
  com.kava.kavadist.v1beta1.PeriodOrBuilder getPeriodsOrBuilder(
      int index);

  /**
   * <code>.kava.kavadist.v1beta1.InfrastructureParams infrastructure_params = 4 [json_name = "infrastructureParams", (.gogoproto.nullable) = false];</code>
   * @return Whether the infrastructureParams field is set.
   */
  boolean hasInfrastructureParams();
  /**
   * <code>.kava.kavadist.v1beta1.InfrastructureParams infrastructure_params = 4 [json_name = "infrastructureParams", (.gogoproto.nullable) = false];</code>
   * @return The infrastructureParams.
   */
  com.kava.kavadist.v1beta1.InfrastructureParams getInfrastructureParams();
  /**
   * <code>.kava.kavadist.v1beta1.InfrastructureParams infrastructure_params = 4 [json_name = "infrastructureParams", (.gogoproto.nullable) = false];</code>
   */
  com.kava.kavadist.v1beta1.InfrastructureParamsOrBuilder getInfrastructureParamsOrBuilder();
}
