// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

public interface QueryTradeRewardCampaignResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.QueryTradeRewardCampaignResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.injective.exchange.v1beta1.TradingRewardCampaignInfo trading_reward_campaign_info = 1 [json_name = "tradingRewardCampaignInfo"];</code>
   * @return Whether the tradingRewardCampaignInfo field is set.
   */
  boolean hasTradingRewardCampaignInfo();
  /**
   * <code>.injective.exchange.v1beta1.TradingRewardCampaignInfo trading_reward_campaign_info = 1 [json_name = "tradingRewardCampaignInfo"];</code>
   * @return The tradingRewardCampaignInfo.
   */
  com.injective.exchange.v1beta1.TradingRewardCampaignInfo getTradingRewardCampaignInfo();
  /**
   * <code>.injective.exchange.v1beta1.TradingRewardCampaignInfo trading_reward_campaign_info = 1 [json_name = "tradingRewardCampaignInfo"];</code>
   */
  com.injective.exchange.v1beta1.TradingRewardCampaignInfoOrBuilder getTradingRewardCampaignInfoOrBuilder();

  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool trading_reward_pool_campaign_schedule = 2 [json_name = "tradingRewardPoolCampaignSchedule"];</code>
   */
  java.util.List<com.injective.exchange.v1beta1.CampaignRewardPool> 
      getTradingRewardPoolCampaignScheduleList();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool trading_reward_pool_campaign_schedule = 2 [json_name = "tradingRewardPoolCampaignSchedule"];</code>
   */
  com.injective.exchange.v1beta1.CampaignRewardPool getTradingRewardPoolCampaignSchedule(int index);
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool trading_reward_pool_campaign_schedule = 2 [json_name = "tradingRewardPoolCampaignSchedule"];</code>
   */
  int getTradingRewardPoolCampaignScheduleCount();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool trading_reward_pool_campaign_schedule = 2 [json_name = "tradingRewardPoolCampaignSchedule"];</code>
   */
  java.util.List<? extends com.injective.exchange.v1beta1.CampaignRewardPoolOrBuilder> 
      getTradingRewardPoolCampaignScheduleOrBuilderList();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool trading_reward_pool_campaign_schedule = 2 [json_name = "tradingRewardPoolCampaignSchedule"];</code>
   */
  com.injective.exchange.v1beta1.CampaignRewardPoolOrBuilder getTradingRewardPoolCampaignScheduleOrBuilder(
      int index);

  /**
   * <code>string total_trade_reward_points = 3 [json_name = "totalTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The totalTradeRewardPoints.
   */
  java.lang.String getTotalTradeRewardPoints();
  /**
   * <code>string total_trade_reward_points = 3 [json_name = "totalTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for totalTradeRewardPoints.
   */
  com.google.protobuf.ByteString
      getTotalTradeRewardPointsBytes();

  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool pending_trading_reward_pool_campaign_schedule = 4 [json_name = "pendingTradingRewardPoolCampaignSchedule"];</code>
   */
  java.util.List<com.injective.exchange.v1beta1.CampaignRewardPool> 
      getPendingTradingRewardPoolCampaignScheduleList();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool pending_trading_reward_pool_campaign_schedule = 4 [json_name = "pendingTradingRewardPoolCampaignSchedule"];</code>
   */
  com.injective.exchange.v1beta1.CampaignRewardPool getPendingTradingRewardPoolCampaignSchedule(int index);
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool pending_trading_reward_pool_campaign_schedule = 4 [json_name = "pendingTradingRewardPoolCampaignSchedule"];</code>
   */
  int getPendingTradingRewardPoolCampaignScheduleCount();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool pending_trading_reward_pool_campaign_schedule = 4 [json_name = "pendingTradingRewardPoolCampaignSchedule"];</code>
   */
  java.util.List<? extends com.injective.exchange.v1beta1.CampaignRewardPoolOrBuilder> 
      getPendingTradingRewardPoolCampaignScheduleOrBuilderList();
  /**
   * <code>repeated .injective.exchange.v1beta1.CampaignRewardPool pending_trading_reward_pool_campaign_schedule = 4 [json_name = "pendingTradingRewardPoolCampaignSchedule"];</code>
   */
  com.injective.exchange.v1beta1.CampaignRewardPoolOrBuilder getPendingTradingRewardPoolCampaignScheduleOrBuilder(
      int index);

  /**
   * <code>repeated string pending_total_trade_reward_points = 5 [json_name = "pendingTotalTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return A list containing the pendingTotalTradeRewardPoints.
   */
  java.util.List<java.lang.String>
      getPendingTotalTradeRewardPointsList();
  /**
   * <code>repeated string pending_total_trade_reward_points = 5 [json_name = "pendingTotalTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The count of pendingTotalTradeRewardPoints.
   */
  int getPendingTotalTradeRewardPointsCount();
  /**
   * <code>repeated string pending_total_trade_reward_points = 5 [json_name = "pendingTotalTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @param index The index of the element to return.
   * @return The pendingTotalTradeRewardPoints at the given index.
   */
  java.lang.String getPendingTotalTradeRewardPoints(int index);
  /**
   * <code>repeated string pending_total_trade_reward_points = 5 [json_name = "pendingTotalTradeRewardPoints", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the pendingTotalTradeRewardPoints at the given index.
   */
  com.google.protobuf.ByteString
      getPendingTotalTradeRewardPointsBytes(int index);
}
