// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

public interface QueryValidatorUnbondingDelegationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<com.cosmos.staking.v1beta1.UnbondingDelegation> 
      getUnbondingResponsesList();
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.staking.v1beta1.UnbondingDelegation getUnbondingResponses(int index);
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  int getUnbondingResponsesCount();
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<? extends com.cosmos.staking.v1beta1.UnbondingDelegationOrBuilder> 
      getUnbondingResponsesOrBuilderList();
  /**
   * <code>repeated .cosmos.staking.v1beta1.UnbondingDelegation unbonding_responses = 1 [json_name = "unbondingResponses", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.staking.v1beta1.UnbondingDelegationOrBuilder getUnbondingResponsesOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
