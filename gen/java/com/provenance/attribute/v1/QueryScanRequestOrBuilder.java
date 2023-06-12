// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/attribute/v1/query.proto

package com.provenance.attribute.v1;

public interface QueryScanRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.attribute.v1.QueryScanRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * account defines the address to query for.
   * </pre>
   *
   * <code>string account = 1 [json_name = "account"];</code>
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   * <pre>
   * account defines the address to query for.
   * </pre>
   *
   * <code>string account = 1 [json_name = "account"];</code>
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <pre>
   * name defines the partial attribute name to search for base on names being in RDNS format.
   * </pre>
   *
   * <code>string suffix = 2 [json_name = "suffix"];</code>
   * @return The suffix.
   */
  java.lang.String getSuffix();
  /**
   * <pre>
   * name defines the partial attribute name to search for base on names being in RDNS format.
   * </pre>
   *
   * <code>string suffix = 2 [json_name = "suffix"];</code>
   * @return The bytes for suffix.
   */
  com.google.protobuf.ByteString
      getSuffixBytes();

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
