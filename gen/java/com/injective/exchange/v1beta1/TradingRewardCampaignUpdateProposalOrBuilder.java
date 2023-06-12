// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

public interface TradingRewardCampaignUpdateProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal)
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
   * <code>.injective.exchange.v1beta1.TradingRewardCampaignInfo campaign_info = 3 [json_name = "campaignInfo"];</code>
   * @return Whether the campaignInfo field is set.
   */
  boolean hasCampaignInfo();
  /**
   * <code>.injective.exchange.v1beta1.TradingRewardCampaignInfo campaign_info = 3 [json_name = "campaignInfo"];</code>
   * @return The campaignInfo.
   */
  com.injective.exchange.v1beta1.TradingRewardCampaignInfo getCampaignInfo();
  /**
   * <code>.injective.exchange.v1beta1.TradingRewardCampaignInfo campaign_info = 3 [json_name = "campaignInfo"];</code>
   */
  com.injective.exchange.v1beta1.TradingRewardCampaignInfoOrBuilder getCampaignInfoOrBuilder();

  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool campaign_reward_pools_additions = 4 [json_name = "campaignRewardPoolsAdditions"];</code>
   */
  java.util.List<com.injective.exchange.v1beta1.CampaignRewardPool> 
      getCampaignRewardPoolsAdditionsList();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool campaign_reward_pools_additions = 4 [json_name = "campaignRewardPoolsAdditions"];</code>
   */
  com.injective.exchange.v1beta1.CampaignRewardPool getCampaignRewardPoolsAdditions(int index);
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool campaign_reward_pools_additions = 4 [json_name = "campaignRewardPoolsAdditions"];</code>
   */
  int getCampaignRewardPoolsAdditionsCount();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool campaign_reward_pools_additions = 4 [json_name = "campaignRewardPoolsAdditions"];</code>
   */
  java.util.List<? extends com.injective.exchange.v1beta1.CampaignRewardPoolOrBuilder> 
      getCampaignRewardPoolsAdditionsOrBuilderList();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool campaign_reward_pools_additions = 4 [json_name = "campaignRewardPoolsAdditions"];</code>
   */
  com.injective.exchange.v1beta1.CampaignRewardPoolOrBuilder getCampaignRewardPoolsAdditionsOrBuilder(
      int index);

  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool campaign_reward_pools_updates = 5 [json_name = "campaignRewardPoolsUpdates"];</code>
   */
  java.util.List<com.injective.exchange.v1beta1.CampaignRewardPool> 
      getCampaignRewardPoolsUpdatesList();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool campaign_reward_pools_updates = 5 [json_name = "campaignRewardPoolsUpdates"];</code>
   */
  com.injective.exchange.v1beta1.CampaignRewardPool getCampaignRewardPoolsUpdates(int index);
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool campaign_reward_pools_updates = 5 [json_name = "campaignRewardPoolsUpdates"];</code>
   */
  int getCampaignRewardPoolsUpdatesCount();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool campaign_reward_pools_updates = 5 [json_name = "campaignRewardPoolsUpdates"];</code>
   */
  java.util.List<? extends com.injective.exchange.v1beta1.CampaignRewardPoolOrBuilder> 
      getCampaignRewardPoolsUpdatesOrBuilderList();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool campaign_reward_pools_updates = 5 [json_name = "campaignRewardPoolsUpdates"];</code>
   */
  com.injective.exchange.v1beta1.CampaignRewardPoolOrBuilder getCampaignRewardPoolsUpdatesOrBuilder(
      int index);
}
