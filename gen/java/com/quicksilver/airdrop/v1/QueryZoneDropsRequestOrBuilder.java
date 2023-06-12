// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/airdrop/v1/query.proto

package com.quicksilver.airdrop.v1;

public interface QueryZoneDropsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:quicksilver.airdrop.v1.QueryZoneDropsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * status enables to query zone airdrops matching a given status:
   *  - Active
   *  - Future
   *  - Expired
   * </pre>
   *
   * <code>.quicksilver.airdrop.v1.Status status = 1 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * status enables to query zone airdrops matching a given status:
   *  - Active
   *  - Future
   *  - Expired
   * </pre>
   *
   * <code>.quicksilver.airdrop.v1.Status status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  com.quicksilver.airdrop.v1.Status getStatus();

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
