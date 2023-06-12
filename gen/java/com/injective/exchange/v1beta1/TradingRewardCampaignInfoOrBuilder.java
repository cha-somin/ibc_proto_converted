// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/exchange.proto

package com.injective.exchange.v1beta1;

public interface TradingRewardCampaignInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.TradingRewardCampaignInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * number of seconds of the duration of each campaign
   * </pre>
   *
   * <code>int64 campaign_duration_seconds = 1 [json_name = "campaignDurationSeconds"];</code>
   * @return The campaignDurationSeconds.
   */
  long getCampaignDurationSeconds();

  /**
   * <pre>
   * the trading fee quote denoms which will be counted for the rewards
   * </pre>
   *
   * <code>repeated string quote_denoms = 2 [json_name = "quoteDenoms"];</code>
   * @return A list containing the quoteDenoms.
   */
  java.util.List<java.lang.String>
      getQuoteDenomsList();
  /**
   * <pre>
   * the trading fee quote denoms which will be counted for the rewards
   * </pre>
   *
   * <code>repeated string quote_denoms = 2 [json_name = "quoteDenoms"];</code>
   * @return The count of quoteDenoms.
   */
  int getQuoteDenomsCount();
  /**
   * <pre>
   * the trading fee quote denoms which will be counted for the rewards
   * </pre>
   *
   * <code>repeated string quote_denoms = 2 [json_name = "quoteDenoms"];</code>
   * @param index The index of the element to return.
   * @return The quoteDenoms at the given index.
   */
  java.lang.String getQuoteDenoms(int index);
  /**
   * <pre>
   * the trading fee quote denoms which will be counted for the rewards
   * </pre>
   *
   * <code>repeated string quote_denoms = 2 [json_name = "quoteDenoms"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the quoteDenoms at the given index.
   */
  com.google.protobuf.ByteString
      getQuoteDenomsBytes(int index);

  /**
   * <pre>
   * the optional boost info for markets
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo trading_reward_boost_info = 3 [json_name = "tradingRewardBoostInfo"];</code>
   * @return Whether the tradingRewardBoostInfo field is set.
   */
  boolean hasTradingRewardBoostInfo();
  /**
   * <pre>
   * the optional boost info for markets
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo trading_reward_boost_info = 3 [json_name = "tradingRewardBoostInfo"];</code>
   * @return The tradingRewardBoostInfo.
   */
  com.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo getTradingRewardBoostInfo();
  /**
   * <pre>
   * the optional boost info for markets
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo trading_reward_boost_info = 3 [json_name = "tradingRewardBoostInfo"];</code>
   */
  com.injective.exchange.v1beta1.TradingRewardCampaignBoostInfoOrBuilder getTradingRewardBoostInfoOrBuilder();

  /**
   * <pre>
   * the marketIDs which are disqualified from being rewarded
   * </pre>
   *
   * <code>repeated string disqualified_market_ids = 4 [json_name = "disqualifiedMarketIds"];</code>
   * @return A list containing the disqualifiedMarketIds.
   */
  java.util.List<java.lang.String>
      getDisqualifiedMarketIdsList();
  /**
   * <pre>
   * the marketIDs which are disqualified from being rewarded
   * </pre>
   *
   * <code>repeated string disqualified_market_ids = 4 [json_name = "disqualifiedMarketIds"];</code>
   * @return The count of disqualifiedMarketIds.
   */
  int getDisqualifiedMarketIdsCount();
  /**
   * <pre>
   * the marketIDs which are disqualified from being rewarded
   * </pre>
   *
   * <code>repeated string disqualified_market_ids = 4 [json_name = "disqualifiedMarketIds"];</code>
   * @param index The index of the element to return.
   * @return The disqualifiedMarketIds at the given index.
   */
  java.lang.String getDisqualifiedMarketIds(int index);
  /**
   * <pre>
   * the marketIDs which are disqualified from being rewarded
   * </pre>
   *
   * <code>repeated string disqualified_market_ids = 4 [json_name = "disqualifiedMarketIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the disqualifiedMarketIds at the given index.
   */
  com.google.protobuf.ByteString
      getDisqualifiedMarketIdsBytes(int index);
}
