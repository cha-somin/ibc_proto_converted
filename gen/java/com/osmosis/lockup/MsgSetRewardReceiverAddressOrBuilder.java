// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/lockup/tx.proto

package com.osmosis.lockup;

public interface MsgSetRewardReceiverAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.lockup.MsgSetRewardReceiverAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>uint64 lockID = 2 [json_name = "lockID"];</code>
   * @return The lockID.
   */
  long getLockID();

  /**
   * <code>string reward_receiver = 3 [json_name = "rewardReceiver", (.gogoproto.moretags) = "yaml:&#92;"reward_receiver&#92;""];</code>
   * @return The rewardReceiver.
   */
  java.lang.String getRewardReceiver();
  /**
   * <code>string reward_receiver = 3 [json_name = "rewardReceiver", (.gogoproto.moretags) = "yaml:&#92;"reward_receiver&#92;""];</code>
   * @return The bytes for rewardReceiver.
   */
  com.google.protobuf.ByteString
      getRewardReceiverBytes();
}
