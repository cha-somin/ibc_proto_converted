// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/snapshot/v1beta1/query.proto

package com.axelar.snapshot.v1beta1;

public interface QueryValidatorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.snapshot.v1beta1.QueryValidatorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .axelar.snapshot.v1beta1.QueryValidatorsResponse.Validator validators = 1 [json_name = "validators"];</code>
   */
  java.util.List<com.axelar.snapshot.v1beta1.QueryValidatorsResponse.Validator> 
      getValidatorsList();
  /**
   * <code>repeated .axelar.snapshot.v1beta1.QueryValidatorsResponse.Validator validators = 1 [json_name = "validators"];</code>
   */
  com.axelar.snapshot.v1beta1.QueryValidatorsResponse.Validator getValidators(int index);
  /**
   * <code>repeated .axelar.snapshot.v1beta1.QueryValidatorsResponse.Validator validators = 1 [json_name = "validators"];</code>
   */
  int getValidatorsCount();
  /**
   * <code>repeated .axelar.snapshot.v1beta1.QueryValidatorsResponse.Validator validators = 1 [json_name = "validators"];</code>
   */
  java.util.List<? extends com.axelar.snapshot.v1beta1.QueryValidatorsResponse.ValidatorOrBuilder> 
      getValidatorsOrBuilderList();
  /**
   * <code>repeated .axelar.snapshot.v1beta1.QueryValidatorsResponse.Validator validators = 1 [json_name = "validators"];</code>
   */
  com.axelar.snapshot.v1beta1.QueryValidatorsResponse.ValidatorOrBuilder getValidatorsOrBuilder(
      int index);
}
