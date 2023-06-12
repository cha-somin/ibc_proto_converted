// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

public interface QueryDelegatorValidatorsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * delegator_addr defines the delegator address to query for.
   * </pre>
   *
   * <code>string delegator_addr = 1 [json_name = "delegatorAddr", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The delegatorAddr.
   */
  java.lang.String getDelegatorAddr();
  /**
   * <pre>
   * delegator_addr defines the delegator address to query for.
   * </pre>
   *
   * <code>string delegator_addr = 1 [json_name = "delegatorAddr", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for delegatorAddr.
   */
  com.google.protobuf.ByteString
      getDelegatorAddrBytes();

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
