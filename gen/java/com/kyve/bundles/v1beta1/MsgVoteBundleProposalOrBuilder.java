// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/bundles/v1beta1/tx.proto

package com.kyve.bundles.v1beta1;

public interface MsgVoteBundleProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kyve.bundles.v1beta1.MsgVoteBundleProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * creator ...
   * </pre>
   *
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <pre>
   * creator ...
   * </pre>
   *
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The staker.
   */
  java.lang.String getStaker();
  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The bytes for staker.
   */
  com.google.protobuf.ByteString
      getStakerBytes();

  /**
   * <pre>
   * id ...
   * </pre>
   *
   * <code>uint64 pool_id = 3 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <pre>
   * storage_id ...
   * </pre>
   *
   * <code>string storage_id = 4 [json_name = "storageId"];</code>
   * @return The storageId.
   */
  java.lang.String getStorageId();
  /**
   * <pre>
   * storage_id ...
   * </pre>
   *
   * <code>string storage_id = 4 [json_name = "storageId"];</code>
   * @return The bytes for storageId.
   */
  com.google.protobuf.ByteString
      getStorageIdBytes();

  /**
   * <pre>
   * vote ...
   * </pre>
   *
   * <code>.kyve.bundles.v1beta1.VoteType vote = 5 [json_name = "vote"];</code>
   * @return The enum numeric value on the wire for vote.
   */
  int getVoteValue();
  /**
   * <pre>
   * vote ...
   * </pre>
   *
   * <code>.kyve.bundles.v1beta1.VoteType vote = 5 [json_name = "vote"];</code>
   * @return The vote.
   */
  com.kyve.bundles.v1beta1.VoteType getVote();
}
