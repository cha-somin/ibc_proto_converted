// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/airdrop/v1/query.proto

package com.quicksilver.airdrop.v1;

public interface QueryClaimRecordsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:quicksilver.airdrop.v1.QueryClaimRecordsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
   * @return The chainId.
   */
  java.lang.String getChainId();
  /**
   * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
