// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/query/v1beta1/delegation.proto

package com.kyve.query.v1beta1;

public interface QueryStakersByDelegatorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kyve.query.v1beta1.QueryStakersByDelegatorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();

  /**
   * <pre>
   * delegator ...
   * </pre>
   *
   * <code>string delegator = 2 [json_name = "delegator"];</code>
   * @return The delegator.
   */
  java.lang.String getDelegator();
  /**
   * <pre>
   * delegator ...
   * </pre>
   *
   * <code>string delegator = 2 [json_name = "delegator"];</code>
   * @return The bytes for delegator.
   */
  com.google.protobuf.ByteString
      getDelegatorBytes();
}
