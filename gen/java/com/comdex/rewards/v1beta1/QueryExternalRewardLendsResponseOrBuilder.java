// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/rewards/v1beta1/query.proto

package com.comdex.rewards.v1beta1;

public interface QueryExternalRewardLendsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.rewards.v1beta1.QueryExternalRewardLendsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .comdex.rewards.v1beta1.LendExternalRewards lend_external_rewards = 1 [json_name = "lendExternalRewards", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lend_external_rewards&#92;""];</code>
   */
  java.util.List<com.comdex.rewards.v1beta1.LendExternalRewards> 
      getLendExternalRewardsList();
  /**
   * <code>repeated .comdex.rewards.v1beta1.LendExternalRewards lend_external_rewards = 1 [json_name = "lendExternalRewards", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lend_external_rewards&#92;""];</code>
   */
  com.comdex.rewards.v1beta1.LendExternalRewards getLendExternalRewards(int index);
  /**
   * <code>repeated .comdex.rewards.v1beta1.LendExternalRewards lend_external_rewards = 1 [json_name = "lendExternalRewards", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lend_external_rewards&#92;""];</code>
   */
  int getLendExternalRewardsCount();
  /**
   * <code>repeated .comdex.rewards.v1beta1.LendExternalRewards lend_external_rewards = 1 [json_name = "lendExternalRewards", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lend_external_rewards&#92;""];</code>
   */
  java.util.List<? extends com.comdex.rewards.v1beta1.LendExternalRewardsOrBuilder> 
      getLendExternalRewardsOrBuilderList();
  /**
   * <code>repeated .comdex.rewards.v1beta1.LendExternalRewards lend_external_rewards = 1 [json_name = "lendExternalRewards", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lend_external_rewards&#92;""];</code>
   */
  com.comdex.rewards.v1beta1.LendExternalRewardsOrBuilder getLendExternalRewardsOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
