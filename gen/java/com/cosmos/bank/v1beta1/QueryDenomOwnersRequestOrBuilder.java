// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package com.cosmos.bank.v1beta1;

public interface QueryDenomOwnersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.QueryDenomOwnersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * denom defines the coin denomination to query all account holders for.
   * </pre>
   *
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <pre>
   * denom defines the coin denomination to query all account holders for.
   * </pre>
   *
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

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
