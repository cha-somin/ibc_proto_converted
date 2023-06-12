// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/liquidity/v1beta1/query.proto

package com.crescent.liquidity.v1beta1;

public interface QueryDepositRequestsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.liquidity.v1beta1.QueryDepositRequestsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .crescent.liquidity.v1beta1.DepositRequest deposit_requests = 1 [json_name = "depositRequests", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.crescent.liquidity.v1beta1.DepositRequest> 
      getDepositRequestsList();
  /**
   * <code>repeated .crescent.liquidity.v1beta1.DepositRequest deposit_requests = 1 [json_name = "depositRequests", (.gogoproto.nullable) = false];</code>
   */
  com.crescent.liquidity.v1beta1.DepositRequest getDepositRequests(int index);
  /**
   * <code>repeated .crescent.liquidity.v1beta1.DepositRequest deposit_requests = 1 [json_name = "depositRequests", (.gogoproto.nullable) = false];</code>
   */
  int getDepositRequestsCount();
  /**
   * <code>repeated .crescent.liquidity.v1beta1.DepositRequest deposit_requests = 1 [json_name = "depositRequests", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.crescent.liquidity.v1beta1.DepositRequestOrBuilder> 
      getDepositRequestsOrBuilderList();
  /**
   * <code>repeated .crescent.liquidity.v1beta1.DepositRequest deposit_requests = 1 [json_name = "depositRequests", (.gogoproto.nullable) = false];</code>
   */
  com.crescent.liquidity.v1beta1.DepositRequestOrBuilder getDepositRequestsOrBuilder(
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
