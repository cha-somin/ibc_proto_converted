// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/lpfarm/v1beta1/query.proto

package com.crescent.lpfarm.v1beta1;

public interface QueryPositionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.lpfarm.v1beta1.QueryPositionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string farmer = 1 [json_name = "farmer"];</code>
   * @return The farmer.
   */
  java.lang.String getFarmer();
  /**
   * <code>string farmer = 1 [json_name = "farmer"];</code>
   * @return The bytes for farmer.
   */
  com.google.protobuf.ByteString
      getFarmerBytes();

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
