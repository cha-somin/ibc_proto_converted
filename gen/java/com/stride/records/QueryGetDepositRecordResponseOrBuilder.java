// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/records/query.proto

package com.stride.records;

public interface QueryGetDepositRecordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.records.QueryGetDepositRecordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   * @return Whether the depositRecord field is set.
   */
  boolean hasDepositRecord();
  /**
   * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   * @return The depositRecord.
   */
  com.stride.records.DepositRecord getDepositRecord();
  /**
   * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   */
  com.stride.records.DepositRecordOrBuilder getDepositRecordOrBuilder();
}
