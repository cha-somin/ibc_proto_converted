// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/mining/tx.proto

package com.stafihub.stafihub.mining;

public interface MsgEmergencyWithdrawOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.mining.MsgEmergencyWithdraw)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>uint32 stakePoolIndex = 2 [json_name = "stakePoolIndex", (.gogoproto.jsontag) = "stakePoolIndex"];</code>
   * @return The stakePoolIndex.
   */
  int getStakePoolIndex();

  /**
   * <code>uint32 stakeRecordIndex = 3 [json_name = "stakeRecordIndex", (.gogoproto.jsontag) = "stakeRecordIndex"];</code>
   * @return The stakeRecordIndex.
   */
  int getStakeRecordIndex();
}
