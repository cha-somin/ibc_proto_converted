// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta2/query.proto

package com.akash.market.v1beta2;

public interface QueryLeasesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.market.v1beta2.QueryLeasesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.akash.market.v1beta2.QueryLeaseResponse> 
      getLeasesList();
  /**
   * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
   */
  com.akash.market.v1beta2.QueryLeaseResponse getLeases(int index);
  /**
   * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
   */
  int getLeasesCount();
  /**
   * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.akash.market.v1beta2.QueryLeaseResponseOrBuilder> 
      getLeasesOrBuilderList();
  /**
   * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
   */
  com.akash.market.v1beta2.QueryLeaseResponseOrBuilder getLeasesOrBuilder(
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
