// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v3/query.proto

package com.desmos.posts.v3;

public interface QuerySectionPostsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.posts.v3.QuerySectionPostsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the subspace to query the posts for
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId"];</code>
   * @return The subspaceId.
   */
  long getSubspaceId();

  /**
   * <pre>
   * Id of the section to query the posts for
   * </pre>
   *
   * <code>uint32 section_id = 2 [json_name = "sectionId"];</code>
   * @return The sectionId.
   */
  int getSectionId();

  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
