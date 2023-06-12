// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mars/incentives/v1beta1/query.proto

package com.mars.incentives.v1beta1;

public interface QuerySchedulesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mars.incentives.v1beta1.QuerySchedulesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Pagination defines an optional pagination for the request
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * Pagination defines an optional pagination for the request
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <pre>
   * Pagination defines an optional pagination for the request
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
