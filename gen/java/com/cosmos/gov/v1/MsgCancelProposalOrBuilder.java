// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1/tx.proto

package com.cosmos.gov.v1;

public interface MsgCancelProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1.MsgCancelProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.jsontag) = "proposal_id"];</code>
   * @return The proposalId.
   */
  long getProposalId();

  /**
   * <code>string proposer = 2 [json_name = "proposer", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The proposer.
   */
  java.lang.String getProposer();
  /**
   * <code>string proposer = 2 [json_name = "proposer", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for proposer.
   */
  com.google.protobuf.ByteString
      getProposerBytes();
}
