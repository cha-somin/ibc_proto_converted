// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/query.proto

package com.injective.peggy.v1;

public interface QueryBatchFeeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.peggy.v1.QueryBatchFeeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .injective.peggy.v1.BatchFees batchFees = 1 [json_name = "batchFees"];</code>
   */
  java.util.List<com.injective.peggy.v1.BatchFees> 
      getBatchFeesList();
  /**
   * <code>repeated .injective.peggy.v1.BatchFees batchFees = 1 [json_name = "batchFees"];</code>
   */
  com.injective.peggy.v1.BatchFees getBatchFees(int index);
  /**
   * <code>repeated .injective.peggy.v1.BatchFees batchFees = 1 [json_name = "batchFees"];</code>
   */
  int getBatchFeesCount();
  /**
   * <code>repeated .injective.peggy.v1.BatchFees batchFees = 1 [json_name = "batchFees"];</code>
   */
  java.util.List<? extends com.injective.peggy.v1.BatchFeesOrBuilder> 
      getBatchFeesOrBuilderList();
  /**
   * <code>repeated .injective.peggy.v1.BatchFees batchFees = 1 [json_name = "batchFees"];</code>
   */
  com.injective.peggy.v1.BatchFeesOrBuilder getBatchFeesOrBuilder(
      int index);
}
