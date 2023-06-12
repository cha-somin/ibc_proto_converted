// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/query_app_links.proto

package com.desmos.profiles.v3;

public interface QueryApplicationLinkOwnersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.profiles.v3.QueryApplicationLinkOwnersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Optional) Application name to search link owners of. If not specified, all
   * links stored will be searched instead.
   * </pre>
   *
   * <code>string application = 1 [json_name = "application"];</code>
   * @return The application.
   */
  java.lang.String getApplication();
  /**
   * <pre>
   * (Optional) Application name to search link owners of. If not specified, all
   * links stored will be searched instead.
   * </pre>
   *
   * <code>string application = 1 [json_name = "application"];</code>
   * @return The bytes for application.
   */
  com.google.protobuf.ByteString
      getApplicationBytes();

  /**
   * <pre>
   * (Optional) Username to search for. This will only be used if the
   * application is specified as well
   * </pre>
   *
   * <code>string username = 2 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * (Optional) Username to search for. This will only be used if the
   * application is specified as well
   * </pre>
   *
   * <code>string username = 2 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * Pagination defines an optional pagination for the request
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * Pagination defines an optional pagination for the request
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <pre>
   * Pagination defines an optional pagination for the request
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 3 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
