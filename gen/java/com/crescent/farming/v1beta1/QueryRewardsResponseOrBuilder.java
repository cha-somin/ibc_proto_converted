// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/farming/v1beta1/query.proto

package com.crescent.farming.v1beta1;

public interface QueryRewardsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.farming.v1beta1.QueryRewardsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .crescent.farming.v1beta1.RewardsResponse rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.crescent.farming.v1beta1.RewardsResponse> 
      getRewardsList();
  /**
   * <code>repeated .crescent.farming.v1beta1.RewardsResponse rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
   */
  com.crescent.farming.v1beta1.RewardsResponse getRewards(int index);
  /**
   * <code>repeated .crescent.farming.v1beta1.RewardsResponse rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
   */
  int getRewardsCount();
  /**
   * <code>repeated .crescent.farming.v1beta1.RewardsResponse rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.crescent.farming.v1beta1.RewardsResponseOrBuilder> 
      getRewardsOrBuilderList();
  /**
   * <code>repeated .crescent.farming.v1beta1.RewardsResponse rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
   */
  com.crescent.farming.v1beta1.RewardsResponseOrBuilder getRewardsOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
