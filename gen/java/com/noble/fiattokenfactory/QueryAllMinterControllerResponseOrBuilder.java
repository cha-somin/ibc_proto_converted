// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/fiattokenfactory/query.proto

package com.noble.fiattokenfactory;

public interface QueryAllMinterControllerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:noble.fiattokenfactory.QueryAllMinterControllerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .noble.fiattokenfactory.MinterController minterController = 1 [json_name = "minterController", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.noble.fiattokenfactory.MinterController> 
      getMinterControllerList();
  /**
   * <code>repeated .noble.fiattokenfactory.MinterController minterController = 1 [json_name = "minterController", (.gogoproto.nullable) = false];</code>
   */
  com.noble.fiattokenfactory.MinterController getMinterController(int index);
  /**
   * <code>repeated .noble.fiattokenfactory.MinterController minterController = 1 [json_name = "minterController", (.gogoproto.nullable) = false];</code>
   */
  int getMinterControllerCount();
  /**
   * <code>repeated .noble.fiattokenfactory.MinterController minterController = 1 [json_name = "minterController", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.noble.fiattokenfactory.MinterControllerOrBuilder> 
      getMinterControllerOrBuilderList();
  /**
   * <code>repeated .noble.fiattokenfactory.MinterController minterController = 1 [json_name = "minterController", (.gogoproto.nullable) = false];</code>
   */
  com.noble.fiattokenfactory.MinterControllerOrBuilder getMinterControllerOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
