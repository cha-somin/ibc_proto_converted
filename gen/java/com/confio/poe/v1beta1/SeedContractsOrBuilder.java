// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/poe/v1beta1/genesis.proto

package com.confio.poe.v1beta1;

public interface SeedContractsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:confio.poe.v1beta1.SeedContracts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * GenTxs defines the genesis transactions to create a validator.
   * </pre>
   *
   * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
   * @return A list containing the genTxs.
   */
  java.util.List<com.google.protobuf.ByteString> getGenTxsList();
  /**
   * <pre>
   * GenTxs defines the genesis transactions to create a validator.
   * </pre>
   *
   * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
   * @return The count of genTxs.
   */
  int getGenTxsCount();
  /**
   * <pre>
   * GenTxs defines the genesis transactions to create a validator.
   * </pre>
   *
   * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
   * @param index The index of the element to return.
   * @return The genTxs at the given index.
   */
  com.google.protobuf.ByteString getGenTxs(int index);

  /**
   * <pre>
   * BootstrapAccountAddress single address that is set as bootstrap-account for
   * the PoE contracts in seed mode.
   * </pre>
   *
   * <code>string bootstrap_account_address = 2 [json_name = "bootstrapAccountAddress"];</code>
   * @return The bootstrapAccountAddress.
   */
  java.lang.String getBootstrapAccountAddress();
  /**
   * <pre>
   * BootstrapAccountAddress single address that is set as bootstrap-account for
   * the PoE contracts in seed mode.
   * </pre>
   *
   * <code>string bootstrap_account_address = 2 [json_name = "bootstrapAccountAddress"];</code>
   * @return The bytes for bootstrapAccountAddress.
   */
  com.google.protobuf.ByteString
      getBootstrapAccountAddressBytes();

  /**
   * <pre>
   * Engagement weighted members of the engagement group. Validators should be
   * in here.
   * </pre>
   *
   * <code>repeated .confio.poe.v1beta1.TG4Member engagement = 3 [json_name = "engagement", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "engagement,omitempty"];</code>
   */
  java.util.List<com.confio.poe.v1beta1.TG4Member> 
      getEngagementList();
  /**
   * <pre>
   * Engagement weighted members of the engagement group. Validators should be
   * in here.
   * </pre>
   *
   * <code>repeated .confio.poe.v1beta1.TG4Member engagement = 3 [json_name = "engagement", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "engagement,omitempty"];</code>
   */
  com.confio.poe.v1beta1.TG4Member getEngagement(int index);
  /**
   * <pre>
   * Engagement weighted members of the engagement group. Validators should be
   * in here.
   * </pre>
   *
   * <code>repeated .confio.poe.v1beta1.TG4Member engagement = 3 [json_name = "engagement", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "engagement,omitempty"];</code>
   */
  int getEngagementCount();
  /**
   * <pre>
   * Engagement weighted members of the engagement group. Validators should be
   * in here.
   * </pre>
   *
   * <code>repeated .confio.poe.v1beta1.TG4Member engagement = 3 [json_name = "engagement", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "engagement,omitempty"];</code>
   */
  java.util.List<? extends com.confio.poe.v1beta1.TG4MemberOrBuilder> 
      getEngagementOrBuilderList();
  /**
   * <pre>
   * Engagement weighted members of the engagement group. Validators should be
   * in here.
   * </pre>
   *
   * <code>repeated .confio.poe.v1beta1.TG4Member engagement = 3 [json_name = "engagement", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "engagement,omitempty"];</code>
   */
  com.confio.poe.v1beta1.TG4MemberOrBuilder getEngagementOrBuilder(
      int index);

  /**
   * <code>.confio.poe.v1beta1.StakeContractConfig stake_contract_config = 4 [json_name = "stakeContractConfig", (.gogoproto.jsontag) = "stake_contract_config,omitempty"];</code>
   * @return Whether the stakeContractConfig field is set.
   */
  boolean hasStakeContractConfig();
  /**
   * <code>.confio.poe.v1beta1.StakeContractConfig stake_contract_config = 4 [json_name = "stakeContractConfig", (.gogoproto.jsontag) = "stake_contract_config,omitempty"];</code>
   * @return The stakeContractConfig.
   */
  com.confio.poe.v1beta1.StakeContractConfig getStakeContractConfig();
  /**
   * <code>.confio.poe.v1beta1.StakeContractConfig stake_contract_config = 4 [json_name = "stakeContractConfig", (.gogoproto.jsontag) = "stake_contract_config,omitempty"];</code>
   */
  com.confio.poe.v1beta1.StakeContractConfigOrBuilder getStakeContractConfigOrBuilder();

  /**
   * <code>.confio.poe.v1beta1.ValsetContractConfig valset_contract_config = 5 [json_name = "valsetContractConfig", (.gogoproto.jsontag) = "valset_contract_config,omitempty"];</code>
   * @return Whether the valsetContractConfig field is set.
   */
  boolean hasValsetContractConfig();
  /**
   * <code>.confio.poe.v1beta1.ValsetContractConfig valset_contract_config = 5 [json_name = "valsetContractConfig", (.gogoproto.jsontag) = "valset_contract_config,omitempty"];</code>
   * @return The valsetContractConfig.
   */
  com.confio.poe.v1beta1.ValsetContractConfig getValsetContractConfig();
  /**
   * <code>.confio.poe.v1beta1.ValsetContractConfig valset_contract_config = 5 [json_name = "valsetContractConfig", (.gogoproto.jsontag) = "valset_contract_config,omitempty"];</code>
   */
  com.confio.poe.v1beta1.ValsetContractConfigOrBuilder getValsetContractConfigOrBuilder();

  /**
   * <code>.confio.poe.v1beta1.EngagementContractConfig engagement_contract_config = 6 [json_name = "engagementContractConfig", (.gogoproto.jsontag) = "engagement_contract_config,omitempty"];</code>
   * @return Whether the engagementContractConfig field is set.
   */
  boolean hasEngagementContractConfig();
  /**
   * <code>.confio.poe.v1beta1.EngagementContractConfig engagement_contract_config = 6 [json_name = "engagementContractConfig", (.gogoproto.jsontag) = "engagement_contract_config,omitempty"];</code>
   * @return The engagementContractConfig.
   */
  com.confio.poe.v1beta1.EngagementContractConfig getEngagementContractConfig();
  /**
   * <code>.confio.poe.v1beta1.EngagementContractConfig engagement_contract_config = 6 [json_name = "engagementContractConfig", (.gogoproto.jsontag) = "engagement_contract_config,omitempty"];</code>
   */
  com.confio.poe.v1beta1.EngagementContractConfigOrBuilder getEngagementContractConfigOrBuilder();

  /**
   * <pre>
   * BondDenom defines the bondable coin denomination.
   * </pre>
   *
   * <code>string bond_denom = 7 [json_name = "bondDenom", (.gogoproto.moretags) = "yaml:&#92;"bond_denom&#92;""];</code>
   * @return The bondDenom.
   */
  java.lang.String getBondDenom();
  /**
   * <pre>
   * BondDenom defines the bondable coin denomination.
   * </pre>
   *
   * <code>string bond_denom = 7 [json_name = "bondDenom", (.gogoproto.moretags) = "yaml:&#92;"bond_denom&#92;""];</code>
   * @return The bytes for bondDenom.
   */
  com.google.protobuf.ByteString
      getBondDenomBytes();

  /**
   * <code>.confio.poe.v1beta1.OversightCommitteeContractConfig oversight_committee_contract_config = 8 [json_name = "oversightCommitteeContractConfig", (.gogoproto.jsontag) = "oversight_committee_contract_config,omitempty"];</code>
   * @return Whether the oversightCommitteeContractConfig field is set.
   */
  boolean hasOversightCommitteeContractConfig();
  /**
   * <code>.confio.poe.v1beta1.OversightCommitteeContractConfig oversight_committee_contract_config = 8 [json_name = "oversightCommitteeContractConfig", (.gogoproto.jsontag) = "oversight_committee_contract_config,omitempty"];</code>
   * @return The oversightCommitteeContractConfig.
   */
  com.confio.poe.v1beta1.OversightCommitteeContractConfig getOversightCommitteeContractConfig();
  /**
   * <code>.confio.poe.v1beta1.OversightCommitteeContractConfig oversight_committee_contract_config = 8 [json_name = "oversightCommitteeContractConfig", (.gogoproto.jsontag) = "oversight_committee_contract_config,omitempty"];</code>
   */
  com.confio.poe.v1beta1.OversightCommitteeContractConfigOrBuilder getOversightCommitteeContractConfigOrBuilder();

  /**
   * <code>.confio.poe.v1beta1.CommunityPoolContractConfig community_pool_contract_config = 9 [json_name = "communityPoolContractConfig", (.gogoproto.jsontag) = "community_pool_contract_config,omitempty"];</code>
   * @return Whether the communityPoolContractConfig field is set.
   */
  boolean hasCommunityPoolContractConfig();
  /**
   * <code>.confio.poe.v1beta1.CommunityPoolContractConfig community_pool_contract_config = 9 [json_name = "communityPoolContractConfig", (.gogoproto.jsontag) = "community_pool_contract_config,omitempty"];</code>
   * @return The communityPoolContractConfig.
   */
  com.confio.poe.v1beta1.CommunityPoolContractConfig getCommunityPoolContractConfig();
  /**
   * <code>.confio.poe.v1beta1.CommunityPoolContractConfig community_pool_contract_config = 9 [json_name = "communityPoolContractConfig", (.gogoproto.jsontag) = "community_pool_contract_config,omitempty"];</code>
   */
  com.confio.poe.v1beta1.CommunityPoolContractConfigOrBuilder getCommunityPoolContractConfigOrBuilder();

  /**
   * <code>.confio.poe.v1beta1.ValidatorVotingContractConfig validator_voting_contract_config = 10 [json_name = "validatorVotingContractConfig", (.gogoproto.jsontag) = "validator_voting_contract_config,omitempty"];</code>
   * @return Whether the validatorVotingContractConfig field is set.
   */
  boolean hasValidatorVotingContractConfig();
  /**
   * <code>.confio.poe.v1beta1.ValidatorVotingContractConfig validator_voting_contract_config = 10 [json_name = "validatorVotingContractConfig", (.gogoproto.jsontag) = "validator_voting_contract_config,omitempty"];</code>
   * @return The validatorVotingContractConfig.
   */
  com.confio.poe.v1beta1.ValidatorVotingContractConfig getValidatorVotingContractConfig();
  /**
   * <code>.confio.poe.v1beta1.ValidatorVotingContractConfig validator_voting_contract_config = 10 [json_name = "validatorVotingContractConfig", (.gogoproto.jsontag) = "validator_voting_contract_config,omitempty"];</code>
   */
  com.confio.poe.v1beta1.ValidatorVotingContractConfigOrBuilder getValidatorVotingContractConfigOrBuilder();

  /**
   * <code>repeated string oversight_community_members = 11 [json_name = "oversightCommunityMembers", (.gogoproto.jsontag) = "oversight_community_members,omitempty"];</code>
   * @return A list containing the oversightCommunityMembers.
   */
  java.util.List<java.lang.String>
      getOversightCommunityMembersList();
  /**
   * <code>repeated string oversight_community_members = 11 [json_name = "oversightCommunityMembers", (.gogoproto.jsontag) = "oversight_community_members,omitempty"];</code>
   * @return The count of oversightCommunityMembers.
   */
  int getOversightCommunityMembersCount();
  /**
   * <code>repeated string oversight_community_members = 11 [json_name = "oversightCommunityMembers", (.gogoproto.jsontag) = "oversight_community_members,omitempty"];</code>
   * @param index The index of the element to return.
   * @return The oversightCommunityMembers at the given index.
   */
  java.lang.String getOversightCommunityMembers(int index);
  /**
   * <code>repeated string oversight_community_members = 11 [json_name = "oversightCommunityMembers", (.gogoproto.jsontag) = "oversight_community_members,omitempty"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the oversightCommunityMembers at the given index.
   */
  com.google.protobuf.ByteString
      getOversightCommunityMembersBytes(int index);

  /**
   * <code>repeated string arbiter_pool_members = 12 [json_name = "arbiterPoolMembers", (.gogoproto.jsontag) = "arbiter_pool_members,omitempty"];</code>
   * @return A list containing the arbiterPoolMembers.
   */
  java.util.List<java.lang.String>
      getArbiterPoolMembersList();
  /**
   * <code>repeated string arbiter_pool_members = 12 [json_name = "arbiterPoolMembers", (.gogoproto.jsontag) = "arbiter_pool_members,omitempty"];</code>
   * @return The count of arbiterPoolMembers.
   */
  int getArbiterPoolMembersCount();
  /**
   * <code>repeated string arbiter_pool_members = 12 [json_name = "arbiterPoolMembers", (.gogoproto.jsontag) = "arbiter_pool_members,omitempty"];</code>
   * @param index The index of the element to return.
   * @return The arbiterPoolMembers at the given index.
   */
  java.lang.String getArbiterPoolMembers(int index);
  /**
   * <code>repeated string arbiter_pool_members = 12 [json_name = "arbiterPoolMembers", (.gogoproto.jsontag) = "arbiter_pool_members,omitempty"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the arbiterPoolMembers at the given index.
   */
  com.google.protobuf.ByteString
      getArbiterPoolMembersBytes(int index);

  /**
   * <code>.confio.poe.v1beta1.ArbiterPoolContractConfig arbiter_pool_contract_config = 13 [json_name = "arbiterPoolContractConfig", (.gogoproto.jsontag) = "arbiter_pool_contract_config,omitempty"];</code>
   * @return Whether the arbiterPoolContractConfig field is set.
   */
  boolean hasArbiterPoolContractConfig();
  /**
   * <code>.confio.poe.v1beta1.ArbiterPoolContractConfig arbiter_pool_contract_config = 13 [json_name = "arbiterPoolContractConfig", (.gogoproto.jsontag) = "arbiter_pool_contract_config,omitempty"];</code>
   * @return The arbiterPoolContractConfig.
   */
  com.confio.poe.v1beta1.ArbiterPoolContractConfig getArbiterPoolContractConfig();
  /**
   * <code>.confio.poe.v1beta1.ArbiterPoolContractConfig arbiter_pool_contract_config = 13 [json_name = "arbiterPoolContractConfig", (.gogoproto.jsontag) = "arbiter_pool_contract_config,omitempty"];</code>
   */
  com.confio.poe.v1beta1.ArbiterPoolContractConfigOrBuilder getArbiterPoolContractConfigOrBuilder();

  /**
   * <code>.confio.poe.v1beta1.MixerContractConfig mixer_contract_config = 14 [json_name = "mixerContractConfig", (.gogoproto.jsontag) = "mixer_contract_config,omitempty"];</code>
   * @return Whether the mixerContractConfig field is set.
   */
  boolean hasMixerContractConfig();
  /**
   * <code>.confio.poe.v1beta1.MixerContractConfig mixer_contract_config = 14 [json_name = "mixerContractConfig", (.gogoproto.jsontag) = "mixer_contract_config,omitempty"];</code>
   * @return The mixerContractConfig.
   */
  com.confio.poe.v1beta1.MixerContractConfig getMixerContractConfig();
  /**
   * <code>.confio.poe.v1beta1.MixerContractConfig mixer_contract_config = 14 [json_name = "mixerContractConfig", (.gogoproto.jsontag) = "mixer_contract_config,omitempty"];</code>
   */
  com.confio.poe.v1beta1.MixerContractConfigOrBuilder getMixerContractConfigOrBuilder();
}
