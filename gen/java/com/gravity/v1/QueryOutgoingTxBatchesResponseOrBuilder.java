// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/query.proto

package com.gravity.v1;

public interface QueryOutgoingTxBatchesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gravity.v1.QueryOutgoingTxBatchesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .gravity.v1.OutgoingTxBatch batches = 1 [json_name = "batches", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.gravity.v1.OutgoingTxBatch> 
      getBatchesList();
  /**
   * <code>repeated .gravity.v1.OutgoingTxBatch batches = 1 [json_name = "batches", (.gogoproto.nullable) = false];</code>
   */
  com.gravity.v1.OutgoingTxBatch getBatches(int index);
  /**
   * <code>repeated .gravity.v1.OutgoingTxBatch batches = 1 [json_name = "batches", (.gogoproto.nullable) = false];</code>
   */
  int getBatchesCount();
  /**
   * <code>repeated .gravity.v1.OutgoingTxBatch batches = 1 [json_name = "batches", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.gravity.v1.OutgoingTxBatchOrBuilder> 
      getBatchesOrBuilderList();
  /**
   * <code>repeated .gravity.v1.OutgoingTxBatch batches = 1 [json_name = "batches", (.gogoproto.nullable) = false];</code>
   */
  com.gravity.v1.OutgoingTxBatchOrBuilder getBatchesOrBuilder(
      int index);
}
