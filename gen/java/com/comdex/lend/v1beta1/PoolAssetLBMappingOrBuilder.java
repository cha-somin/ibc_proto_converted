// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/lend.proto

package com.comdex.lend.v1beta1;

public interface PoolAssetLBMappingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.lend.v1beta1.PoolAssetLBMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 pool_id = 1 [json_name = "poolId", (.gogoproto.customname) = "PoolID", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <code>uint64 asset_id = 2 [json_name = "assetId", (.gogoproto.customname) = "AssetID", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return The assetId.
   */
  long getAssetId();

  /**
   * <code>repeated uint64 lend_ids = 3 [json_name = "lendIds", (.gogoproto.moretags) = "yaml:&#92;"lend_ids&#92;""];</code>
   * @return A list containing the lendIds.
   */
  java.util.List<java.lang.Long> getLendIdsList();
  /**
   * <code>repeated uint64 lend_ids = 3 [json_name = "lendIds", (.gogoproto.moretags) = "yaml:&#92;"lend_ids&#92;""];</code>
   * @return The count of lendIds.
   */
  int getLendIdsCount();
  /**
   * <code>repeated uint64 lend_ids = 3 [json_name = "lendIds", (.gogoproto.moretags) = "yaml:&#92;"lend_ids&#92;""];</code>
   * @param index The index of the element to return.
   * @return The lendIds at the given index.
   */
  long getLendIds(int index);

  /**
   * <code>repeated uint64 borrow_ids = 4 [json_name = "borrowIds", (.gogoproto.moretags) = "yaml:&#92;"borrow_ids&#92;""];</code>
   * @return A list containing the borrowIds.
   */
  java.util.List<java.lang.Long> getBorrowIdsList();
  /**
   * <code>repeated uint64 borrow_ids = 4 [json_name = "borrowIds", (.gogoproto.moretags) = "yaml:&#92;"borrow_ids&#92;""];</code>
   * @return The count of borrowIds.
   */
  int getBorrowIdsCount();
  /**
   * <code>repeated uint64 borrow_ids = 4 [json_name = "borrowIds", (.gogoproto.moretags) = "yaml:&#92;"borrow_ids&#92;""];</code>
   * @param index The index of the element to return.
   * @return The borrowIds at the given index.
   */
  long getBorrowIds(int index);

  /**
   * <code>string total_borrowed = 5 [json_name = "totalBorrowed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"total_borrowed&#92;""];</code>
   * @return The totalBorrowed.
   */
  java.lang.String getTotalBorrowed();
  /**
   * <code>string total_borrowed = 5 [json_name = "totalBorrowed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"total_borrowed&#92;""];</code>
   * @return The bytes for totalBorrowed.
   */
  com.google.protobuf.ByteString
      getTotalBorrowedBytes();

  /**
   * <code>string total_stable_borrowed = 6 [json_name = "totalStableBorrowed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"total_stable_borrowed&#92;""];</code>
   * @return The totalStableBorrowed.
   */
  java.lang.String getTotalStableBorrowed();
  /**
   * <code>string total_stable_borrowed = 6 [json_name = "totalStableBorrowed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"total_stable_borrowed&#92;""];</code>
   * @return The bytes for totalStableBorrowed.
   */
  com.google.protobuf.ByteString
      getTotalStableBorrowedBytes();

  /**
   * <code>string total_lend = 7 [json_name = "totalLend", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"total_lend&#92;""];</code>
   * @return The totalLend.
   */
  java.lang.String getTotalLend();
  /**
   * <code>string total_lend = 7 [json_name = "totalLend", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"total_lend&#92;""];</code>
   * @return The bytes for totalLend.
   */
  com.google.protobuf.ByteString
      getTotalLendBytes();

  /**
   * <code>string total_interest_accumulated = 8 [json_name = "totalInterestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"total_interest_accumulated&#92;""];</code>
   * @return The totalInterestAccumulated.
   */
  java.lang.String getTotalInterestAccumulated();
  /**
   * <code>string total_interest_accumulated = 8 [json_name = "totalInterestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"total_interest_accumulated&#92;""];</code>
   * @return The bytes for totalInterestAccumulated.
   */
  com.google.protobuf.ByteString
      getTotalInterestAccumulatedBytes();

  /**
   * <code>string lend_apr = 9 [json_name = "lendApr", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"lend_apr&#92;""];</code>
   * @return The lendApr.
   */
  java.lang.String getLendApr();
  /**
   * <code>string lend_apr = 9 [json_name = "lendApr", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"lend_apr&#92;""];</code>
   * @return The bytes for lendApr.
   */
  com.google.protobuf.ByteString
      getLendAprBytes();

  /**
   * <code>string borrow_apr = 10 [json_name = "borrowApr", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"borrow_apr&#92;""];</code>
   * @return The borrowApr.
   */
  java.lang.String getBorrowApr();
  /**
   * <code>string borrow_apr = 10 [json_name = "borrowApr", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"borrow_apr&#92;""];</code>
   * @return The bytes for borrowApr.
   */
  com.google.protobuf.ByteString
      getBorrowAprBytes();

  /**
   * <code>string stable_borrow_apr = 11 [json_name = "stableBorrowApr", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"stable_borrow_apr&#92;""];</code>
   * @return The stableBorrowApr.
   */
  java.lang.String getStableBorrowApr();
  /**
   * <code>string stable_borrow_apr = 11 [json_name = "stableBorrowApr", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"stable_borrow_apr&#92;""];</code>
   * @return The bytes for stableBorrowApr.
   */
  com.google.protobuf.ByteString
      getStableBorrowAprBytes();

  /**
   * <code>string utilisation_ratio = 12 [json_name = "utilisationRatio", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"utilisation_ratio&#92;""];</code>
   * @return The utilisationRatio.
   */
  java.lang.String getUtilisationRatio();
  /**
   * <code>string utilisation_ratio = 12 [json_name = "utilisationRatio", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"utilisation_ratio&#92;""];</code>
   * @return The bytes for utilisationRatio.
   */
  com.google.protobuf.ByteString
      getUtilisationRatioBytes();
}
