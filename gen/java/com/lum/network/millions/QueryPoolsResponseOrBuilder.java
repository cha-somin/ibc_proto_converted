// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/query.proto

package com.lum.network.millions;

public interface QueryPoolsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lum.network.millions.QueryPoolsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.lum.network.millions.Pool> 
      getPoolsList();
  /**
   * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
   */
  com.lum.network.millions.Pool getPools(int index);
  /**
   * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
   */
  int getPoolsCount();
  /**
   * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.lum.network.millions.PoolOrBuilder> 
      getPoolsOrBuilderList();
  /**
   * <code>repeated .lum.network.millions.Pool pools = 1 [json_name = "pools", (.gogoproto.nullable) = false];</code>
   */
  com.lum.network.millions.PoolOrBuilder getPoolsOrBuilder(
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
