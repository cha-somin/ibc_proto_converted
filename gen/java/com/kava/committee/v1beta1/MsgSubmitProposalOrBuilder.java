// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/committee/v1beta1/tx.proto

package com.kava.committee.v1beta1;

public interface MsgSubmitProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.committee.v1beta1.MsgSubmitProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Any pub_proposal = 1 [json_name = "pubProposal", (.cosmos_proto.accepts_interface) = "cosmos.gov.v1beta1.Content"];</code>
   * @return Whether the pubProposal field is set.
   */
  boolean hasPubProposal();
  /**
   * <code>.google.protobuf.Any pub_proposal = 1 [json_name = "pubProposal", (.cosmos_proto.accepts_interface) = "cosmos.gov.v1beta1.Content"];</code>
   * @return The pubProposal.
   */
  com.google.protobuf.Any getPubProposal();
  /**
   * <code>.google.protobuf.Any pub_proposal = 1 [json_name = "pubProposal", (.cosmos_proto.accepts_interface) = "cosmos.gov.v1beta1.Content"];</code>
   */
  com.google.protobuf.AnyOrBuilder getPubProposalOrBuilder();

  /**
   * <code>string proposer = 2 [json_name = "proposer"];</code>
   * @return The proposer.
   */
  java.lang.String getProposer();
  /**
   * <code>string proposer = 2 [json_name = "proposer"];</code>
   * @return The bytes for proposer.
   */
  com.google.protobuf.ByteString
      getProposerBytes();

  /**
   * <code>uint64 committee_id = 3 [json_name = "committeeId", (.gogoproto.customname) = "CommitteeID"];</code>
   * @return The committeeId.
   */
  long getCommitteeId();
}
