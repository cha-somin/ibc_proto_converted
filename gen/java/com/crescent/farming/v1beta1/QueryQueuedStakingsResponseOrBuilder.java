// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/farming/v1beta1/query.proto

package com.crescent.farming.v1beta1;

public interface QueryQueuedStakingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.farming.v1beta1.QueryQueuedStakingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .crescent.farming.v1beta1.QueuedStakingResponse queued_stakings = 1 [json_name = "queuedStakings", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.crescent.farming.v1beta1.QueuedStakingResponse> 
      getQueuedStakingsList();
  /**
   * <code>repeated .crescent.farming.v1beta1.QueuedStakingResponse queued_stakings = 1 [json_name = "queuedStakings", (.gogoproto.nullable) = false];</code>
   */
  com.crescent.farming.v1beta1.QueuedStakingResponse getQueuedStakings(int index);
  /**
   * <code>repeated .crescent.farming.v1beta1.QueuedStakingResponse queued_stakings = 1 [json_name = "queuedStakings", (.gogoproto.nullable) = false];</code>
   */
  int getQueuedStakingsCount();
  /**
   * <code>repeated .crescent.farming.v1beta1.QueuedStakingResponse queued_stakings = 1 [json_name = "queuedStakings", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.crescent.farming.v1beta1.QueuedStakingResponseOrBuilder> 
      getQueuedStakingsOrBuilderList();
  /**
   * <code>repeated .crescent.farming.v1beta1.QueuedStakingResponse queued_stakings = 1 [json_name = "queuedStakings", (.gogoproto.nullable) = false];</code>
   */
  com.crescent.farming.v1beta1.QueuedStakingResponseOrBuilder getQueuedStakingsOrBuilder(
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
