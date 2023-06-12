// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/beam/query.proto

package com.lum.network.beam;

public interface QueryFetchBeamsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lum.network.beam.QueryFetchBeamsRequest)
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
   * <code>.lum.network.beam.BeamState state = 2 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <code>.lum.network.beam.BeamState state = 2 [json_name = "state"];</code>
   * @return The state.
   */
  com.lum.network.beam.BeamState getState();
}
