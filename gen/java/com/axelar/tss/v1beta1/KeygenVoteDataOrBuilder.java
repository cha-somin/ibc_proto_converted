// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/tss/v1beta1/types.proto

package com.axelar.tss.v1beta1;

public interface KeygenVoteDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.tss.v1beta1.KeygenVoteData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes pub_key = 1 [json_name = "pubKey"];</code>
   * @return The pubKey.
   */
  com.google.protobuf.ByteString getPubKey();

  /**
   * <code>bytes group_recovery_info = 2 [json_name = "groupRecoveryInfo"];</code>
   * @return The groupRecoveryInfo.
   */
  com.google.protobuf.ByteString getGroupRecoveryInfo();
}
