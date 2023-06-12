// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/interchainquery/v1/query.proto

package com.quicksilver.interchainquery.v1;

public interface QueryRequestsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:quicksilver.interchainquery.v1.QueryRequestsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();

  /**
   * <code>string chain_id = 2 [json_name = "chainId"];</code>
   * @return The chainId.
   */
  java.lang.String getChainId();
  /**
   * <code>string chain_id = 2 [json_name = "chainId"];</code>
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString
      getChainIdBytes();
}
