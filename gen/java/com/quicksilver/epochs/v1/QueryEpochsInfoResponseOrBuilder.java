// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/epochs/v1/query.proto

package com.quicksilver.epochs.v1;

public interface QueryEpochsInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:quicksilver.epochs.v1.QueryEpochsInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .quicksilver.epochs.v1.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.quicksilver.epochs.v1.EpochInfo> 
      getEpochsList();
  /**
   * <code>repeated .quicksilver.epochs.v1.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  com.quicksilver.epochs.v1.EpochInfo getEpochs(int index);
  /**
   * <code>repeated .quicksilver.epochs.v1.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  int getEpochsCount();
  /**
   * <code>repeated .quicksilver.epochs.v1.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.quicksilver.epochs.v1.EpochInfoOrBuilder> 
      getEpochsOrBuilderList();
  /**
   * <code>repeated .quicksilver.epochs.v1.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  com.quicksilver.epochs.v1.EpochInfoOrBuilder getEpochsOrBuilder(
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
