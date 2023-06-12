// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/group/v1alpha1/genesis.proto

package com.regen.group.v1alpha1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.group.v1alpha1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * group_seq is the group table orm.Sequence,
   * it is used to get the next group ID.
   * </pre>
   *
   * <code>uint64 group_seq = 1 [json_name = "groupSeq"];</code>
   * @return The groupSeq.
   */
  long getGroupSeq();

  /**
   * <pre>
   * groups is the list of groups info.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupInfo groups = 2 [json_name = "groups"];</code>
   */
  java.util.List<com.regen.group.v1alpha1.GroupInfo> 
      getGroupsList();
  /**
   * <pre>
   * groups is the list of groups info.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupInfo groups = 2 [json_name = "groups"];</code>
   */
  com.regen.group.v1alpha1.GroupInfo getGroups(int index);
  /**
   * <pre>
   * groups is the list of groups info.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupInfo groups = 2 [json_name = "groups"];</code>
   */
  int getGroupsCount();
  /**
   * <pre>
   * groups is the list of groups info.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupInfo groups = 2 [json_name = "groups"];</code>
   */
  java.util.List<? extends com.regen.group.v1alpha1.GroupInfoOrBuilder> 
      getGroupsOrBuilderList();
  /**
   * <pre>
   * groups is the list of groups info.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupInfo groups = 2 [json_name = "groups"];</code>
   */
  com.regen.group.v1alpha1.GroupInfoOrBuilder getGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * group_members is the list of groups members.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupMember group_members = 3 [json_name = "groupMembers"];</code>
   */
  java.util.List<com.regen.group.v1alpha1.GroupMember> 
      getGroupMembersList();
  /**
   * <pre>
   * group_members is the list of groups members.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupMember group_members = 3 [json_name = "groupMembers"];</code>
   */
  com.regen.group.v1alpha1.GroupMember getGroupMembers(int index);
  /**
   * <pre>
   * group_members is the list of groups members.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupMember group_members = 3 [json_name = "groupMembers"];</code>
   */
  int getGroupMembersCount();
  /**
   * <pre>
   * group_members is the list of groups members.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupMember group_members = 3 [json_name = "groupMembers"];</code>
   */
  java.util.List<? extends com.regen.group.v1alpha1.GroupMemberOrBuilder> 
      getGroupMembersOrBuilderList();
  /**
   * <pre>
   * group_members is the list of groups members.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupMember group_members = 3 [json_name = "groupMembers"];</code>
   */
  com.regen.group.v1alpha1.GroupMemberOrBuilder getGroupMembersOrBuilder(
      int index);

  /**
   * <pre>
   * group_account_seq is the group account table orm.Sequence,
   * it is used to generate the next group account address.
   * </pre>
   *
   * <code>uint64 group_account_seq = 4 [json_name = "groupAccountSeq"];</code>
   * @return The groupAccountSeq.
   */
  long getGroupAccountSeq();

  /**
   * <pre>
   * group_accounts is the list of group accounts info.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupAccountInfo group_accounts = 5 [json_name = "groupAccounts"];</code>
   */
  java.util.List<com.regen.group.v1alpha1.GroupAccountInfo> 
      getGroupAccountsList();
  /**
   * <pre>
   * group_accounts is the list of group accounts info.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupAccountInfo group_accounts = 5 [json_name = "groupAccounts"];</code>
   */
  com.regen.group.v1alpha1.GroupAccountInfo getGroupAccounts(int index);
  /**
   * <pre>
   * group_accounts is the list of group accounts info.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupAccountInfo group_accounts = 5 [json_name = "groupAccounts"];</code>
   */
  int getGroupAccountsCount();
  /**
   * <pre>
   * group_accounts is the list of group accounts info.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupAccountInfo group_accounts = 5 [json_name = "groupAccounts"];</code>
   */
  java.util.List<? extends com.regen.group.v1alpha1.GroupAccountInfoOrBuilder> 
      getGroupAccountsOrBuilderList();
  /**
   * <pre>
   * group_accounts is the list of group accounts info.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.GroupAccountInfo group_accounts = 5 [json_name = "groupAccounts"];</code>
   */
  com.regen.group.v1alpha1.GroupAccountInfoOrBuilder getGroupAccountsOrBuilder(
      int index);

  /**
   * <pre>
   * proposal_seq is the proposal table orm.Sequence,
   * it is used to get the next proposal ID.
   * </pre>
   *
   * <code>uint64 proposal_seq = 6 [json_name = "proposalSeq"];</code>
   * @return The proposalSeq.
   */
  long getProposalSeq();

  /**
   * <pre>
   * proposals is the list of proposals.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Proposal proposals = 7 [json_name = "proposals"];</code>
   */
  java.util.List<com.regen.group.v1alpha1.Proposal> 
      getProposalsList();
  /**
   * <pre>
   * proposals is the list of proposals.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Proposal proposals = 7 [json_name = "proposals"];</code>
   */
  com.regen.group.v1alpha1.Proposal getProposals(int index);
  /**
   * <pre>
   * proposals is the list of proposals.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Proposal proposals = 7 [json_name = "proposals"];</code>
   */
  int getProposalsCount();
  /**
   * <pre>
   * proposals is the list of proposals.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Proposal proposals = 7 [json_name = "proposals"];</code>
   */
  java.util.List<? extends com.regen.group.v1alpha1.ProposalOrBuilder> 
      getProposalsOrBuilderList();
  /**
   * <pre>
   * proposals is the list of proposals.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Proposal proposals = 7 [json_name = "proposals"];</code>
   */
  com.regen.group.v1alpha1.ProposalOrBuilder getProposalsOrBuilder(
      int index);

  /**
   * <pre>
   * votes is the list of votes.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Vote votes = 8 [json_name = "votes"];</code>
   */
  java.util.List<com.regen.group.v1alpha1.Vote> 
      getVotesList();
  /**
   * <pre>
   * votes is the list of votes.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Vote votes = 8 [json_name = "votes"];</code>
   */
  com.regen.group.v1alpha1.Vote getVotes(int index);
  /**
   * <pre>
   * votes is the list of votes.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Vote votes = 8 [json_name = "votes"];</code>
   */
  int getVotesCount();
  /**
   * <pre>
   * votes is the list of votes.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Vote votes = 8 [json_name = "votes"];</code>
   */
  java.util.List<? extends com.regen.group.v1alpha1.VoteOrBuilder> 
      getVotesOrBuilderList();
  /**
   * <pre>
   * votes is the list of votes.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Vote votes = 8 [json_name = "votes"];</code>
   */
  com.regen.group.v1alpha1.VoteOrBuilder getVotesOrBuilder(
      int index);
}
