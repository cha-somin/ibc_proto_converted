// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/query.proto

package com.lum.network.millions;

public interface QueryWithdrawalsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lum.network.millions.QueryWithdrawalsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
