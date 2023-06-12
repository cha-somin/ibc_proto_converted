// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/query.proto

package com.cosmos.group.v1;

public interface QueryGroupsByMemberRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.group.v1.QueryGroupsByMemberRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * address is the group member address.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * address is the group member address.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

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
