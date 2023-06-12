// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/cdp/v1beta1/genesis.proto

package com.kava.cdp.v1beta1;

public interface CollateralParamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.cdp.v1beta1.CollateralParam)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string liquidation_ratio = 3 [json_name = "liquidationRatio", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The liquidationRatio.
   */
  java.lang.String getLiquidationRatio();
  /**
   * <code>string liquidation_ratio = 3 [json_name = "liquidationRatio", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for liquidationRatio.
   */
  com.google.protobuf.ByteString
      getLiquidationRatioBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin debt_limit = 4 [json_name = "debtLimit", (.gogoproto.nullable) = false];</code>
   * @return Whether the debtLimit field is set.
   */
  boolean hasDebtLimit();
  /**
   * <code>.cosmos.base.v1beta1.Coin debt_limit = 4 [json_name = "debtLimit", (.gogoproto.nullable) = false];</code>
   * @return The debtLimit.
   */
  com.cosmos.base.v1beta1.Coin getDebtLimit();
  /**
   * <code>.cosmos.base.v1beta1.Coin debt_limit = 4 [json_name = "debtLimit", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getDebtLimitOrBuilder();

  /**
   * <code>string stability_fee = 5 [json_name = "stabilityFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The stabilityFee.
   */
  java.lang.String getStabilityFee();
  /**
   * <code>string stability_fee = 5 [json_name = "stabilityFee", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for stabilityFee.
   */
  com.google.protobuf.ByteString
      getStabilityFeeBytes();

  /**
   * <code>string auction_size = 6 [json_name = "auctionSize", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.cosmos_proto.scalar) = "cosmos.Int"];</code>
   * @return The auctionSize.
   */
  java.lang.String getAuctionSize();
  /**
   * <code>string auction_size = 6 [json_name = "auctionSize", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.cosmos_proto.scalar) = "cosmos.Int"];</code>
   * @return The bytes for auctionSize.
   */
  com.google.protobuf.ByteString
      getAuctionSizeBytes();

  /**
   * <code>string liquidation_penalty = 7 [json_name = "liquidationPenalty", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The liquidationPenalty.
   */
  java.lang.String getLiquidationPenalty();
  /**
   * <code>string liquidation_penalty = 7 [json_name = "liquidationPenalty", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for liquidationPenalty.
   */
  com.google.protobuf.ByteString
      getLiquidationPenaltyBytes();

  /**
   * <code>string spot_market_id = 8 [json_name = "spotMarketId", (.gogoproto.customname) = "SpotMarketID"];</code>
   * @return The spotMarketId.
   */
  java.lang.String getSpotMarketId();
  /**
   * <code>string spot_market_id = 8 [json_name = "spotMarketId", (.gogoproto.customname) = "SpotMarketID"];</code>
   * @return The bytes for spotMarketId.
   */
  com.google.protobuf.ByteString
      getSpotMarketIdBytes();

  /**
   * <code>string liquidation_market_id = 9 [json_name = "liquidationMarketId", (.gogoproto.customname) = "LiquidationMarketID"];</code>
   * @return The liquidationMarketId.
   */
  java.lang.String getLiquidationMarketId();
  /**
   * <code>string liquidation_market_id = 9 [json_name = "liquidationMarketId", (.gogoproto.customname) = "LiquidationMarketID"];</code>
   * @return The bytes for liquidationMarketId.
   */
  com.google.protobuf.ByteString
      getLiquidationMarketIdBytes();

  /**
   * <code>string keeper_reward_percentage = 10 [json_name = "keeperRewardPercentage", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The keeperRewardPercentage.
   */
  java.lang.String getKeeperRewardPercentage();
  /**
   * <code>string keeper_reward_percentage = 10 [json_name = "keeperRewardPercentage", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for keeperRewardPercentage.
   */
  com.google.protobuf.ByteString
      getKeeperRewardPercentageBytes();

  /**
   * <code>string check_collateralization_index_count = 11 [json_name = "checkCollateralizationIndexCount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.cosmos_proto.scalar) = "cosmos.Int"];</code>
   * @return The checkCollateralizationIndexCount.
   */
  java.lang.String getCheckCollateralizationIndexCount();
  /**
   * <code>string check_collateralization_index_count = 11 [json_name = "checkCollateralizationIndexCount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.cosmos_proto.scalar) = "cosmos.Int"];</code>
   * @return The bytes for checkCollateralizationIndexCount.
   */
  com.google.protobuf.ByteString
      getCheckCollateralizationIndexCountBytes();

  /**
   * <code>string conversion_factor = 12 [json_name = "conversionFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.cosmos_proto.scalar) = "cosmos.Int"];</code>
   * @return The conversionFactor.
   */
  java.lang.String getConversionFactor();
  /**
   * <code>string conversion_factor = 12 [json_name = "conversionFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.cosmos_proto.scalar) = "cosmos.Int"];</code>
   * @return The bytes for conversionFactor.
   */
  com.google.protobuf.ByteString
      getConversionFactorBytes();
}
