// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/query.proto

package com.gravity.v1;

public interface QueryLastPendingBatchRequestByAddrResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gravity.v1.QueryLastPendingBatchRequestByAddrResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .gravity.v1.OutgoingTxBatch batch = 1 [json_name = "batch", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.gravity.v1.OutgoingTxBatch> 
      getBatchList();
  /**
   * <code>repeated .gravity.v1.OutgoingTxBatch batch = 1 [json_name = "batch", (.gogoproto.nullable) = false];</code>
   */
  com.gravity.v1.OutgoingTxBatch getBatch(int index);
  /**
   * <code>repeated .gravity.v1.OutgoingTxBatch batch = 1 [json_name = "batch", (.gogoproto.nullable) = false];</code>
   */
  int getBatchCount();
  /**
   * <code>repeated .gravity.v1.OutgoingTxBatch batch = 1 [json_name = "batch", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.gravity.v1.OutgoingTxBatchOrBuilder> 
      getBatchOrBuilderList();
  /**
   * <code>repeated .gravity.v1.OutgoingTxBatch batch = 1 [json_name = "batch", (.gogoproto.nullable) = false];</code>
   */
  com.gravity.v1.OutgoingTxBatchOrBuilder getBatchOrBuilder(
      int index);
}
