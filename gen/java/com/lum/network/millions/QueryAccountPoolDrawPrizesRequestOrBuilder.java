// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/query.proto

package com.lum.network.millions;

public interface QueryAccountPoolDrawPrizesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lum.network.millions.QueryAccountPoolDrawPrizesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string winner_address = 1 [json_name = "winnerAddress"];</code>
   * @return The winnerAddress.
   */
  java.lang.String getWinnerAddress();
  /**
   * <code>string winner_address = 1 [json_name = "winnerAddress"];</code>
   * @return The bytes for winnerAddress.
   */
  com.google.protobuf.ByteString
      getWinnerAddressBytes();

  /**
   * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <code>uint64 draw_id = 3 [json_name = "drawId"];</code>
   * @return The drawId.
   */
  long getDrawId();

  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
