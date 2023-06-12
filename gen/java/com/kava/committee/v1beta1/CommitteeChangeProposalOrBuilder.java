// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/committee/v1beta1/proposal.proto

package com.kava.committee.v1beta1;

public interface CommitteeChangeProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.committee.v1beta1.CommitteeChangeProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.google.protobuf.Any new_committee = 3 [json_name = "newCommittee", (.cosmos_proto.accepts_interface) = "Committee"];</code>
   * @return Whether the newCommittee field is set.
   */
  boolean hasNewCommittee();
  /**
   * <code>.google.protobuf.Any new_committee = 3 [json_name = "newCommittee", (.cosmos_proto.accepts_interface) = "Committee"];</code>
   * @return The newCommittee.
   */
  com.google.protobuf.Any getNewCommittee();
  /**
   * <code>.google.protobuf.Any new_committee = 3 [json_name = "newCommittee", (.cosmos_proto.accepts_interface) = "Committee"];</code>
   */
  com.google.protobuf.AnyOrBuilder getNewCommitteeOrBuilder();
}
