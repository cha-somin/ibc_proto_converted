// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/query.proto

package com.regen.ecocredit.v1alpha2;

public interface QueryProjectsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.ecocredit.v1alpha2.QueryProjectsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * projects are the fetched projects.
   * </pre>
   *
   * <code>repeated .regen.ecocredit.v1alpha2.ProjectInfo projects = 1 [json_name = "projects"];</code>
   */
  java.util.List<com.regen.ecocredit.v1alpha2.ProjectInfo> 
      getProjectsList();
  /**
   * <pre>
   * projects are the fetched projects.
   * </pre>
   *
   * <code>repeated .regen.ecocredit.v1alpha2.ProjectInfo projects = 1 [json_name = "projects"];</code>
   */
  com.regen.ecocredit.v1alpha2.ProjectInfo getProjects(int index);
  /**
   * <pre>
   * projects are the fetched projects.
   * </pre>
   *
   * <code>repeated .regen.ecocredit.v1alpha2.ProjectInfo projects = 1 [json_name = "projects"];</code>
   */
  int getProjectsCount();
  /**
   * <pre>
   * projects are the fetched projects.
   * </pre>
   *
   * <code>repeated .regen.ecocredit.v1alpha2.ProjectInfo projects = 1 [json_name = "projects"];</code>
   */
  java.util.List<? extends com.regen.ecocredit.v1alpha2.ProjectInfoOrBuilder> 
      getProjectsOrBuilderList();
  /**
   * <pre>
   * projects are the fetched projects.
   * </pre>
   *
   * <code>repeated .regen.ecocredit.v1alpha2.ProjectInfo projects = 1 [json_name = "projects"];</code>
   */
  com.regen.ecocredit.v1alpha2.ProjectInfoOrBuilder getProjectsOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
