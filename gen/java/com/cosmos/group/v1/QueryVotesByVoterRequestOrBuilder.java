// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/query.proto

package com.cosmos.group.v1;

public interface QueryVotesByVoterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.group.v1.QueryVotesByVoterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * voter is a proposal voter account address.
   * </pre>
   *
   * <code>string voter = 1 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The voter.
   */
  java.lang.String getVoter();
  /**
   * <pre>
   * voter is a proposal voter account address.
   * </pre>
   *
   * <code>string voter = 1 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for voter.
   */
  com.google.protobuf.ByteString
      getVoterBytes();

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
