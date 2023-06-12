// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidation/v1beta1/locked_vault.proto

package com.comdex.liquidation.v1beta1;

public interface LockedVaultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidation.v1beta1.LockedVault)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1 [json_name = "id", (.gogoproto.customname) = "LockedVaultId", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.customname) = "AppId", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>uint64 original_vault_id = 3 [json_name = "originalVaultId", (.gogoproto.customname) = "OriginalVaultId", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The originalVaultId.
   */
  long getOriginalVaultId();

  /**
   * <code>uint64 extended_pair_vault_id = 4 [json_name = "extendedPairVaultId", (.gogoproto.customname) = "ExtendedPairId", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_vault_id&#92;""];</code>
   * @return The extendedPairVaultId.
   */
  long getExtendedPairVaultId();

  /**
   * <code>string owner = 5 [json_name = "owner", (.gogoproto.customname) = "Owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 5 [json_name = "owner", (.gogoproto.customname) = "Owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string amount_in = 6 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.customname) = "AmountIn", (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;""];</code>
   * @return The amountIn.
   */
  java.lang.String getAmountIn();
  /**
   * <code>string amount_in = 6 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.customname) = "AmountIn", (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;""];</code>
   * @return The bytes for amountIn.
   */
  com.google.protobuf.ByteString
      getAmountInBytes();

  /**
   * <code>string amount_out = 7 [json_name = "amountOut", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.customname) = "AmountOut", (.gogoproto.moretags) = "yaml:&#92;"amount_out&#92;""];</code>
   * @return The amountOut.
   */
  java.lang.String getAmountOut();
  /**
   * <code>string amount_out = 7 [json_name = "amountOut", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.customname) = "AmountOut", (.gogoproto.moretags) = "yaml:&#92;"amount_out&#92;""];</code>
   * @return The bytes for amountOut.
   */
  com.google.protobuf.ByteString
      getAmountOutBytes();

  /**
   * <pre>
   *updated_amount_out = amount_out + interest_accumulated + opening_fee_accumulated
   * + closing_fee_accumulated
   * </pre>
   *
   * <code>string updated_amount_out = 8 [json_name = "updatedAmountOut", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.customname) = "UpdatedAmountOut", (.gogoproto.moretags) = "yaml:&#92;"updated_amount_out&#92;""];</code>
   * @return The updatedAmountOut.
   */
  java.lang.String getUpdatedAmountOut();
  /**
   * <pre>
   *updated_amount_out = amount_out + interest_accumulated + opening_fee_accumulated
   * + closing_fee_accumulated
   * </pre>
   *
   * <code>string updated_amount_out = 8 [json_name = "updatedAmountOut", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.customname) = "UpdatedAmountOut", (.gogoproto.moretags) = "yaml:&#92;"updated_amount_out&#92;""];</code>
   * @return The bytes for updatedAmountOut.
   */
  com.google.protobuf.ByteString
      getUpdatedAmountOutBytes();

  /**
   * <code>string initiator = 9 [json_name = "initiator", (.gogoproto.customname) = "Initiator", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
   * @return The initiator.
   */
  java.lang.String getInitiator();
  /**
   * <code>string initiator = 9 [json_name = "initiator", (.gogoproto.customname) = "Initiator", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
   * @return The bytes for initiator.
   */
  com.google.protobuf.ByteString
      getInitiatorBytes();

  /**
   * <code>bool is_auction_complete = 10 [json_name = "isAuctionComplete", (.gogoproto.customname) = "IsAuctionComplete", (.gogoproto.moretags) = "yaml:&#92;"is_auction_complete&#92;""];</code>
   * @return The isAuctionComplete.
   */
  boolean getIsAuctionComplete();

  /**
   * <code>bool is_auction_in_progress = 11 [json_name = "isAuctionInProgress", (.gogoproto.customname) = "IsAuctionInProgress", (.gogoproto.moretags) = "yaml:&#92;"is_auction_in_progress&#92;""];</code>
   * @return The isAuctionInProgress.
   */
  boolean getIsAuctionInProgress();

  /**
   * <code>string cr_at_liquidation = 12 [json_name = "crAtLiquidation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "CrAtLiquidation", (.gogoproto.moretags) = "yaml:&#92;"cr_at_liquidation&#92;""];</code>
   * @return The crAtLiquidation.
   */
  java.lang.String getCrAtLiquidation();
  /**
   * <code>string cr_at_liquidation = 12 [json_name = "crAtLiquidation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "CrAtLiquidation", (.gogoproto.moretags) = "yaml:&#92;"cr_at_liquidation&#92;""];</code>
   * @return The bytes for crAtLiquidation.
   */
  com.google.protobuf.ByteString
      getCrAtLiquidationBytes();

  /**
   * <code>string current_collateralisation_ratio = 13 [json_name = "currentCollateralisationRatio", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "CurrentCollaterlisationRatio", (.gogoproto.moretags) = "yaml:&#92;"current_collateralisation_ratio&#92;""];</code>
   * @return The currentCollateralisationRatio.
   */
  java.lang.String getCurrentCollateralisationRatio();
  /**
   * <code>string current_collateralisation_ratio = 13 [json_name = "currentCollateralisationRatio", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "CurrentCollaterlisationRatio", (.gogoproto.moretags) = "yaml:&#92;"current_collateralisation_ratio&#92;""];</code>
   * @return The bytes for currentCollateralisationRatio.
   */
  com.google.protobuf.ByteString
      getCurrentCollateralisationRatioBytes();

  /**
   * <code>string collateral_to_be_auctioned = 14 [json_name = "collateralToBeAuctioned", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "CollateralToBeAuctioned", (.gogoproto.moretags) = "yaml:&#92;"collateral_to_be_auctioned&#92;""];</code>
   * @return The collateralToBeAuctioned.
   */
  java.lang.String getCollateralToBeAuctioned();
  /**
   * <code>string collateral_to_be_auctioned = 14 [json_name = "collateralToBeAuctioned", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "CollateralToBeAuctioned", (.gogoproto.moretags) = "yaml:&#92;"collateral_to_be_auctioned&#92;""];</code>
   * @return The bytes for collateralToBeAuctioned.
   */
  com.google.protobuf.ByteString
      getCollateralToBeAuctionedBytes();

  /**
   * <code>.google.protobuf.Timestamp liquidation_timestamp = 15 [json_name = "liquidationTimestamp", (.gogoproto.nullable) = false, (.gogoproto.customname) = "LiquidationTimestamp", (.gogoproto.moretags) = "yaml:&#92;"liquidation_timestamp&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the liquidationTimestamp field is set.
   */
  boolean hasLiquidationTimestamp();
  /**
   * <code>.google.protobuf.Timestamp liquidation_timestamp = 15 [json_name = "liquidationTimestamp", (.gogoproto.nullable) = false, (.gogoproto.customname) = "LiquidationTimestamp", (.gogoproto.moretags) = "yaml:&#92;"liquidation_timestamp&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The liquidationTimestamp.
   */
  com.google.protobuf.Timestamp getLiquidationTimestamp();
  /**
   * <code>.google.protobuf.Timestamp liquidation_timestamp = 15 [json_name = "liquidationTimestamp", (.gogoproto.nullable) = false, (.gogoproto.customname) = "LiquidationTimestamp", (.gogoproto.moretags) = "yaml:&#92;"liquidation_timestamp&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLiquidationTimestampOrBuilder();

  /**
   * <code>repeated string selloff_history = 16 [json_name = "selloffHistory", (.gogoproto.customname) = "SellOffHistory", (.gogoproto.moretags) = "yaml:&#92;"selloff_history&#92;""];</code>
   * @return A list containing the selloffHistory.
   */
  java.util.List<java.lang.String>
      getSelloffHistoryList();
  /**
   * <code>repeated string selloff_history = 16 [json_name = "selloffHistory", (.gogoproto.customname) = "SellOffHistory", (.gogoproto.moretags) = "yaml:&#92;"selloff_history&#92;""];</code>
   * @return The count of selloffHistory.
   */
  int getSelloffHistoryCount();
  /**
   * <code>repeated string selloff_history = 16 [json_name = "selloffHistory", (.gogoproto.customname) = "SellOffHistory", (.gogoproto.moretags) = "yaml:&#92;"selloff_history&#92;""];</code>
   * @param index The index of the element to return.
   * @return The selloffHistory at the given index.
   */
  java.lang.String getSelloffHistory(int index);
  /**
   * <code>repeated string selloff_history = 16 [json_name = "selloffHistory", (.gogoproto.customname) = "SellOffHistory", (.gogoproto.moretags) = "yaml:&#92;"selloff_history&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the selloffHistory at the given index.
   */
  com.google.protobuf.ByteString
      getSelloffHistoryBytes(int index);

  /**
   * <code>string interest_accumulated = 17 [json_name = "interestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
   * @return The interestAccumulated.
   */
  java.lang.String getInterestAccumulated();
  /**
   * <code>string interest_accumulated = 17 [json_name = "interestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
   * @return The bytes for interestAccumulated.
   */
  com.google.protobuf.ByteString
      getInterestAccumulatedBytes();

  /**
   * <code>.comdex.liquidation.v1beta1.BorrowMetaData borrow_meta_data = 18 [json_name = "borrowMetaData"];</code>
   * @return Whether the borrowMetaData field is set.
   */
  boolean hasBorrowMetaData();
  /**
   * <code>.comdex.liquidation.v1beta1.BorrowMetaData borrow_meta_data = 18 [json_name = "borrowMetaData"];</code>
   * @return The borrowMetaData.
   */
  com.comdex.liquidation.v1beta1.BorrowMetaData getBorrowMetaData();
  /**
   * <code>.comdex.liquidation.v1beta1.BorrowMetaData borrow_meta_data = 18 [json_name = "borrowMetaData"];</code>
   */
  com.comdex.liquidation.v1beta1.BorrowMetaDataOrBuilder getBorrowMetaDataOrBuilder();

  com.comdex.liquidation.v1beta1.LockedVault.KindCase getKindCase();
}
