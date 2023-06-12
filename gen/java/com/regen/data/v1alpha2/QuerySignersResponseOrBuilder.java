// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/data/v1alpha2/query.proto

package com.regen.data.v1alpha2;

public interface QuerySignersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.data.v1alpha2.QuerySignersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * signers are the addresses of the signers.
   * </pre>
   *
   * <code>repeated string signers = 1 [json_name = "signers"];</code>
   * @return A list containing the signers.
   */
  java.util.List<java.lang.String>
      getSignersList();
  /**
   * <pre>
   * signers are the addresses of the signers.
   * </pre>
   *
   * <code>repeated string signers = 1 [json_name = "signers"];</code>
   * @return The count of signers.
   */
  int getSignersCount();
  /**
   * <pre>
   * signers are the addresses of the signers.
   * </pre>
   *
   * <code>repeated string signers = 1 [json_name = "signers"];</code>
   * @param index The index of the element to return.
   * @return The signers at the given index.
   */
  java.lang.String getSigners(int index);
  /**
   * <pre>
   * signers are the addresses of the signers.
   * </pre>
   *
   * <code>repeated string signers = 1 [json_name = "signers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the signers at the given index.
   */
  com.google.protobuf.ByteString
      getSignersBytes(int index);

  /**
   * <pre>
   * pagination is the pagination PageResponse.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination is the pagination PageResponse.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination is the pagination PageResponse.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
