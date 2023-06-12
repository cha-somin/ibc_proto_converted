// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/relationships/v1/query.proto

package com.desmos.relationships.v1;

public interface QueryRelationshipsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.relationships.v1.QueryRelationshipsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * subspace to query the relationships for
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId"];</code>
   * @return The subspaceId.
   */
  long getSubspaceId();

  /**
   * <pre>
   * optional address of the user for which to query the relationships
   * </pre>
   *
   * <code>string user = 2 [json_name = "user"];</code>
   * @return The user.
   */
  java.lang.String getUser();
  /**
   * <pre>
   * optional address of the user for which to query the relationships
   * </pre>
   *
   * <code>string user = 2 [json_name = "user"];</code>
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <pre>
   * optional address of the counterparty of the relationships (used only if the
   * user is provided)
   * </pre>
   *
   * <code>string counterparty = 3 [json_name = "counterparty"];</code>
   * @return The counterparty.
   */
  java.lang.String getCounterparty();
  /**
   * <pre>
   * optional address of the counterparty of the relationships (used only if the
   * user is provided)
   * </pre>
   *
   * <code>string counterparty = 3 [json_name = "counterparty"];</code>
   * @return The bytes for counterparty.
   */
  com.google.protobuf.ByteString
      getCounterpartyBytes();

  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
