// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1/tx.proto

package com.cosmos.gov.v1;

public interface MsgVoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1.MsgVote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * proposal_id defines the unique id of the proposal.
   * </pre>
   *
   * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.jsontag) = "proposal_id", (.amino.dont_omitempty) = true];</code>
   * @return The proposalId.
   */
  long getProposalId();

  /**
   * <pre>
   * voter is the voter address for the proposal.
   * </pre>
   *
   * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The voter.
   */
  java.lang.String getVoter();
  /**
   * <pre>
   * voter is the voter address for the proposal.
   * </pre>
   *
   * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for voter.
   */
  com.google.protobuf.ByteString
      getVoterBytes();

  /**
   * <pre>
   * option defines the vote option.
   * </pre>
   *
   * <code>.cosmos.gov.v1.VoteOption option = 3 [json_name = "option"];</code>
   * @return The enum numeric value on the wire for option.
   */
  int getOptionValue();
  /**
   * <pre>
   * option defines the vote option.
   * </pre>
   *
   * <code>.cosmos.gov.v1.VoteOption option = 3 [json_name = "option"];</code>
   * @return The option.
   */
  com.cosmos.gov.v1.VoteOption getOption();

  /**
   * <pre>
   * metadata is any arbitrary metadata attached to the Vote.
   * </pre>
   *
   * <code>string metadata = 4 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  java.lang.String getMetadata();
  /**
   * <pre>
   * metadata is any arbitrary metadata attached to the Vote.
   * </pre>
   *
   * <code>string metadata = 4 [json_name = "metadata"];</code>
   * @return The bytes for metadata.
   */
  com.google.protobuf.ByteString
      getMetadataBytes();
}
