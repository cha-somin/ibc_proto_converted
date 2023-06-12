// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/escrow/v1beta1/query.proto

package com.akash.escrow.v1beta1;

public interface QueryPaymentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.escrow.v1beta1.QueryPaymentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string scope = 1 [json_name = "scope"];</code>
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   * <code>string scope = 1 [json_name = "scope"];</code>
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString
      getScopeBytes();

  /**
   * <code>string xid = 2 [json_name = "xid"];</code>
   * @return The xid.
   */
  java.lang.String getXid();
  /**
   * <code>string xid = 2 [json_name = "xid"];</code>
   * @return The bytes for xid.
   */
  com.google.protobuf.ByteString
      getXidBytes();

  /**
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string owner = 4 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 4 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string state = 5 [json_name = "state"];</code>
   * @return The state.
   */
  java.lang.String getState();
  /**
   * <code>string state = 5 [json_name = "state"];</code>
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 6 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 6 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 6 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
