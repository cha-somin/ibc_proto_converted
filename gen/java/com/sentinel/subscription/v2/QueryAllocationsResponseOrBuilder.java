// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/subscription/v2/querier.proto

package com.sentinel.subscription.v2;

public interface QueryAllocationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sentinel.subscription.v2.QueryAllocationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .sentinel.subscription.v2.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.sentinel.subscription.v2.Allocation> 
      getAllocationsList();
  /**
   * <code>repeated .sentinel.subscription.v2.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.subscription.v2.Allocation getAllocations(int index);
  /**
   * <code>repeated .sentinel.subscription.v2.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  int getAllocationsCount();
  /**
   * <code>repeated .sentinel.subscription.v2.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.sentinel.subscription.v2.AllocationOrBuilder> 
      getAllocationsOrBuilderList();
  /**
   * <code>repeated .sentinel.subscription.v2.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.subscription.v2.AllocationOrBuilder getAllocationsOrBuilder(
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
