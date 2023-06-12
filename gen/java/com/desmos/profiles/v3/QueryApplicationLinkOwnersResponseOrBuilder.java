// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/query_app_links.proto

package com.desmos.profiles.v3;

public interface QueryApplicationLinkOwnersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.profiles.v3.QueryApplicationLinkOwnersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Addresses of the application links owners
   * </pre>
   *
   * <code>repeated .desmos.profiles.v3.QueryApplicationLinkOwnersResponse.ApplicationLinkOwnerDetails owners = 1 [json_name = "owners", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse.ApplicationLinkOwnerDetails> 
      getOwnersList();
  /**
   * <pre>
   * Addresses of the application links owners
   * </pre>
   *
   * <code>repeated .desmos.profiles.v3.QueryApplicationLinkOwnersResponse.ApplicationLinkOwnerDetails owners = 1 [json_name = "owners", (.gogoproto.nullable) = false];</code>
   */
  com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse.ApplicationLinkOwnerDetails getOwners(int index);
  /**
   * <pre>
   * Addresses of the application links owners
   * </pre>
   *
   * <code>repeated .desmos.profiles.v3.QueryApplicationLinkOwnersResponse.ApplicationLinkOwnerDetails owners = 1 [json_name = "owners", (.gogoproto.nullable) = false];</code>
   */
  int getOwnersCount();
  /**
   * <pre>
   * Addresses of the application links owners
   * </pre>
   *
   * <code>repeated .desmos.profiles.v3.QueryApplicationLinkOwnersResponse.ApplicationLinkOwnerDetails owners = 1 [json_name = "owners", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse.ApplicationLinkOwnerDetailsOrBuilder> 
      getOwnersOrBuilderList();
  /**
   * <pre>
   * Addresses of the application links owners
   * </pre>
   *
   * <code>repeated .desmos.profiles.v3.QueryApplicationLinkOwnersResponse.ApplicationLinkOwnerDetails owners = 1 [json_name = "owners", (.gogoproto.nullable) = false];</code>
   */
  com.desmos.profiles.v3.QueryApplicationLinkOwnersResponse.ApplicationLinkOwnerDetailsOrBuilder getOwnersOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination defines the pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * Pagination defines the pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * Pagination defines the pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
