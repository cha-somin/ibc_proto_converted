// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/events.proto

package com.injective.exchange.v1beta1;

public interface EventPerpetualMarketFundingUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.EventPerpetualMarketFundingUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string market_id = 1 [json_name = "marketId"];</code>
   * @return The marketId.
   */
  java.lang.String getMarketId();
  /**
   * <code>string market_id = 1 [json_name = "marketId"];</code>
   * @return The bytes for marketId.
   */
  com.google.protobuf.ByteString
      getMarketIdBytes();

  /**
   * <code>.injective.exchange.v1beta1.PerpetualMarketFunding funding = 2 [json_name = "funding", (.gogoproto.nullable) = false];</code>
   * @return Whether the funding field is set.
   */
  boolean hasFunding();
  /**
   * <code>.injective.exchange.v1beta1.PerpetualMarketFunding funding = 2 [json_name = "funding", (.gogoproto.nullable) = false];</code>
   * @return The funding.
   */
  com.injective.exchange.v1beta1.PerpetualMarketFunding getFunding();
  /**
   * <code>.injective.exchange.v1beta1.PerpetualMarketFunding funding = 2 [json_name = "funding", (.gogoproto.nullable) = false];</code>
   */
  com.injective.exchange.v1beta1.PerpetualMarketFundingOrBuilder getFundingOrBuilder();

  /**
   * <code>bool is_hourly_funding = 3 [json_name = "isHourlyFunding"];</code>
   * @return The isHourlyFunding.
   */
  boolean getIsHourlyFunding();

  /**
   * <code>string funding_rate = 4 [json_name = "fundingRate", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The fundingRate.
   */
  java.lang.String getFundingRate();
  /**
   * <code>string funding_rate = 4 [json_name = "fundingRate", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for fundingRate.
   */
  com.google.protobuf.ByteString
      getFundingRateBytes();

  /**
   * <code>string mark_price = 5 [json_name = "markPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The markPrice.
   */
  java.lang.String getMarkPrice();
  /**
   * <code>string mark_price = 5 [json_name = "markPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for markPrice.
   */
  com.google.protobuf.ByteString
      getMarkPriceBytes();
}
