// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/query_chain_links.proto

package com.desmos.profiles.v3;

public interface QueryChainLinksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.profiles.v3.QueryChainLinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .desmos.profiles.v3.ChainLink links = 1 [json_name = "links", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.desmos.profiles.v3.ChainLink> 
      getLinksList();
  /**
   * <code>repeated .desmos.profiles.v3.ChainLink links = 1 [json_name = "links", (.gogoproto.nullable) = false];</code>
   */
  com.desmos.profiles.v3.ChainLink getLinks(int index);
  /**
   * <code>repeated .desmos.profiles.v3.ChainLink links = 1 [json_name = "links", (.gogoproto.nullable) = false];</code>
   */
  int getLinksCount();
  /**
   * <code>repeated .desmos.profiles.v3.ChainLink links = 1 [json_name = "links", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.desmos.profiles.v3.ChainLinkOrBuilder> 
      getLinksOrBuilderList();
  /**
   * <code>repeated .desmos.profiles.v3.ChainLink links = 1 [json_name = "links", (.gogoproto.nullable) = false];</code>
   */
  com.desmos.profiles.v3.ChainLinkOrBuilder getLinksOrBuilder(
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
