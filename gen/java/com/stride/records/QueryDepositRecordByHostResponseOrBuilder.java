// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/records/query.proto

package com.stride.records;

public interface QueryDepositRecordByHostResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.records.QueryDepositRecordByHostResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.stride.records.DepositRecord> 
      getDepositRecordList();
  /**
   * <code>repeated .stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   */
  com.stride.records.DepositRecord getDepositRecord(int index);
  /**
   * <code>repeated .stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   */
  int getDepositRecordCount();
  /**
   * <code>repeated .stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.stride.records.DepositRecordOrBuilder> 
      getDepositRecordOrBuilderList();
  /**
   * <code>repeated .stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   */
  com.stride.records.DepositRecordOrBuilder getDepositRecordOrBuilder(
      int index);
}
