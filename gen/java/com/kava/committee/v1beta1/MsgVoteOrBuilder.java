// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/committee/v1beta1/tx.proto

package com.kava.committee.v1beta1;

public interface MsgVoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.committee.v1beta1.MsgVote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.customname) = "ProposalID"];</code>
   * @return The proposalId.
   */
  long getProposalId();

  /**
   * <code>string voter = 2 [json_name = "voter"];</code>
   * @return The voter.
   */
  java.lang.String getVoter();
  /**
   * <code>string voter = 2 [json_name = "voter"];</code>
   * @return The bytes for voter.
   */
  com.google.protobuf.ByteString
      getVoterBytes();

  /**
   * <code>.kava.committee.v1beta1.VoteType vote_type = 3 [json_name = "voteType"];</code>
   * @return The enum numeric value on the wire for voteType.
   */
  int getVoteTypeValue();
  /**
   * <code>.kava.committee.v1beta1.VoteType vote_type = 3 [json_name = "voteType"];</code>
   * @return The voteType.
   */
  com.kava.committee.v1beta1.VoteType getVoteType();
}
