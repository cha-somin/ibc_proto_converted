// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/committee/v1beta1/committee.proto

package com.kava.committee.v1beta1;

public interface BaseCommitteeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.committee.v1beta1.BaseCommittee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
   * @return The id.
   */
  long getId();

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
   * <code>repeated bytes members = 3 [json_name = "members", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress", (.cosmos_proto.scalar) = "cosmos.AddressBytes"];</code>
   * @return A list containing the members.
   */
  java.util.List<com.google.protobuf.ByteString> getMembersList();
  /**
   * <code>repeated bytes members = 3 [json_name = "members", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress", (.cosmos_proto.scalar) = "cosmos.AddressBytes"];</code>
   * @return The count of members.
   */
  int getMembersCount();
  /**
   * <code>repeated bytes members = 3 [json_name = "members", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress", (.cosmos_proto.scalar) = "cosmos.AddressBytes"];</code>
   * @param index The index of the element to return.
   * @return The members at the given index.
   */
  com.google.protobuf.ByteString getMembers(int index);

  /**
   * <code>repeated .google.protobuf.Any permissions = 4 [json_name = "permissions", (.cosmos_proto.accepts_interface) = "Permission"];</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getPermissionsList();
  /**
   * <code>repeated .google.protobuf.Any permissions = 4 [json_name = "permissions", (.cosmos_proto.accepts_interface) = "Permission"];</code>
   */
  com.google.protobuf.Any getPermissions(int index);
  /**
   * <code>repeated .google.protobuf.Any permissions = 4 [json_name = "permissions", (.cosmos_proto.accepts_interface) = "Permission"];</code>
   */
  int getPermissionsCount();
  /**
   * <code>repeated .google.protobuf.Any permissions = 4 [json_name = "permissions", (.cosmos_proto.accepts_interface) = "Permission"];</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getPermissionsOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Any permissions = 4 [json_name = "permissions", (.cosmos_proto.accepts_interface) = "Permission"];</code>
   */
  com.google.protobuf.AnyOrBuilder getPermissionsOrBuilder(
      int index);

  /**
   * <pre>
   * Smallest percentage that must vote for a proposal to pass
   * </pre>
   *
   * <code>string vote_threshold = 5 [json_name = "voteThreshold", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The voteThreshold.
   */
  java.lang.String getVoteThreshold();
  /**
   * <pre>
   * Smallest percentage that must vote for a proposal to pass
   * </pre>
   *
   * <code>string vote_threshold = 5 [json_name = "voteThreshold", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for voteThreshold.
   */
  com.google.protobuf.ByteString
      getVoteThresholdBytes();

  /**
   * <pre>
   * The length of time a proposal remains active for. Proposals will close earlier if they get enough votes.
   * </pre>
   *
   * <code>.google.protobuf.Duration proposal_duration = 6 [json_name = "proposalDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return Whether the proposalDuration field is set.
   */
  boolean hasProposalDuration();
  /**
   * <pre>
   * The length of time a proposal remains active for. Proposals will close earlier if they get enough votes.
   * </pre>
   *
   * <code>.google.protobuf.Duration proposal_duration = 6 [json_name = "proposalDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return The proposalDuration.
   */
  com.google.protobuf.Duration getProposalDuration();
  /**
   * <pre>
   * The length of time a proposal remains active for. Proposals will close earlier if they get enough votes.
   * </pre>
   *
   * <code>.google.protobuf.Duration proposal_duration = 6 [json_name = "proposalDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getProposalDurationOrBuilder();

  /**
   * <code>.kava.committee.v1beta1.TallyOption tally_option = 7 [json_name = "tallyOption"];</code>
   * @return The enum numeric value on the wire for tallyOption.
   */
  int getTallyOptionValue();
  /**
   * <code>.kava.committee.v1beta1.TallyOption tally_option = 7 [json_name = "tallyOption"];</code>
   * @return The tallyOption.
   */
  com.kava.committee.v1beta1.TallyOption getTallyOption();
}
