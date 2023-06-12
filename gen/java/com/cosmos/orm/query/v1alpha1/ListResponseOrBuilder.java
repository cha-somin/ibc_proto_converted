// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/orm/query/v1alpha1/query.proto

package com.cosmos.orm.query.v1alpha1;

public interface ListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.orm.query.v1alpha1.ListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * results are the results of the query.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any results = 1 [json_name = "results"];</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getResultsList();
  /**
   * <pre>
   * results are the results of the query.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any results = 1 [json_name = "results"];</code>
   */
  com.google.protobuf.Any getResults(int index);
  /**
   * <pre>
   * results are the results of the query.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any results = 1 [json_name = "results"];</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * results are the results of the query.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any results = 1 [json_name = "results"];</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * results are the results of the query.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any results = 1 [json_name = "results"];</code>
   */
  com.google.protobuf.AnyOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * pagination is the pagination response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 5 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination is the pagination response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 5 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination is the pagination response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 5 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
