// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/query.proto

package com.cosmos.group.v1;

public interface QueryProposalResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.group.v1.QueryProposalResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * proposal is the proposal info.
   * </pre>
   *
   * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
   * @return Whether the proposal field is set.
   */
  boolean hasProposal();
  /**
   * <pre>
   * proposal is the proposal info.
   * </pre>
   *
   * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
   * @return The proposal.
   */
  com.cosmos.group.v1.Proposal getProposal();
  /**
   * <pre>
   * proposal is the proposal info.
   * </pre>
   *
   * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
   */
  com.cosmos.group.v1.ProposalOrBuilder getProposalOrBuilder();
}
