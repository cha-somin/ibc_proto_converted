// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/fantoken/v1beta1/query.proto

package com.bitsong.fantoken.v1beta1;

public interface QueryFanTokensRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bitsong.fantoken.v1beta1.QueryFanTokensRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string authority = 1 [json_name = "authority"];</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <code>string authority = 1 [json_name = "authority"];</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
