// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/auction/v1beta1/auction.proto

package com.comdex.auction.v1beta1;

public interface DebtAuctionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.auction.v1beta1.DebtAuction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 auction_id = 1 [json_name = "auctionId", (.gogoproto.moretags) = "yaml:&#92;"auction_id&#92;""];</code>
   * @return The auctionId.
   */
  long getAuctionId();

  /**
   * <code>.cosmos.base.v1beta1.Coin auctioned_token = 2 [json_name = "auctionedToken", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"auctioned_token&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the auctionedToken field is set.
   */
  boolean hasAuctionedToken();
  /**
   * <code>.cosmos.base.v1beta1.Coin auctioned_token = 2 [json_name = "auctionedToken", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"auctioned_token&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The auctionedToken.
   */
  com.cosmos.base.v1beta1.Coin getAuctionedToken();
  /**
   * <code>.cosmos.base.v1beta1.Coin auctioned_token = 2 [json_name = "auctionedToken", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"auctioned_token&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAuctionedTokenOrBuilder();

  /**
   * <code>.cosmos.base.v1beta1.Coin expected_user_token = 3 [json_name = "expectedUserToken", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"expected_user_token&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the expectedUserToken field is set.
   */
  boolean hasExpectedUserToken();
  /**
   * <code>.cosmos.base.v1beta1.Coin expected_user_token = 3 [json_name = "expectedUserToken", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"expected_user_token&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The expectedUserToken.
   */
  com.cosmos.base.v1beta1.Coin getExpectedUserToken();
  /**
   * <code>.cosmos.base.v1beta1.Coin expected_user_token = 3 [json_name = "expectedUserToken", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"expected_user_token&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getExpectedUserTokenOrBuilder();

  /**
   * <code>.cosmos.base.v1beta1.Coin expected_minted_token = 4 [json_name = "expectedMintedToken", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"expected_minted_token&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the expectedMintedToken field is set.
   */
  boolean hasExpectedMintedToken();
  /**
   * <code>.cosmos.base.v1beta1.Coin expected_minted_token = 4 [json_name = "expectedMintedToken", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"expected_minted_token&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The expectedMintedToken.
   */
  com.cosmos.base.v1beta1.Coin getExpectedMintedToken();
  /**
   * <code>.cosmos.base.v1beta1.Coin expected_minted_token = 4 [json_name = "expectedMintedToken", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"expected_minted_token&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getExpectedMintedTokenOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <code>uint64 active_bidding_id = 6 [json_name = "activeBiddingId", (.gogoproto.moretags) = "yaml:&#92;"active_bidding_id&#92;""];</code>
   * @return The activeBiddingId.
   */
  long getActiveBiddingId();

  /**
   * <code>string bidder = 7 [json_name = "bidder", (.gogoproto.moretags) = "yaml:&#92;"bidder&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The bidder.
   */
  java.lang.String getBidder();
  /**
   * <code>string bidder = 7 [json_name = "bidder", (.gogoproto.moretags) = "yaml:&#92;"bidder&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The bytes for bidder.
   */
  com.google.protobuf.ByteString
      getBidderBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin current_bid_amount = 8 [json_name = "currentBidAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"current_bid_amount&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the currentBidAmount field is set.
   */
  boolean hasCurrentBidAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin current_bid_amount = 8 [json_name = "currentBidAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"current_bid_amount&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The currentBidAmount.
   */
  com.cosmos.base.v1beta1.Coin getCurrentBidAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin current_bid_amount = 8 [json_name = "currentBidAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"current_bid_amount&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getCurrentBidAmountOrBuilder();

  /**
   * <code>uint64 auction_status = 9 [json_name = "auctionStatus", (.gogoproto.moretags) = "yaml:&#92;"auction_status&#92;""];</code>
   * @return The auctionStatus.
   */
  long getAuctionStatus();

  /**
   * <code>uint64 app_id = 10 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>uint64 asset_id = 11 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return The assetId.
   */
  long getAssetId();

  /**
   * <code>repeated .comdex.auction.v1beta1.bidOwnerMapping bidding_ids = 12 [json_name = "biddingIds", (.gogoproto.moretags) = "yaml:&#92;"bidding_ids&#92;""];</code>
   */
  java.util.List<com.comdex.auction.v1beta1.bidOwnerMapping> 
      getBiddingIdsList();
  /**
   * <code>repeated .comdex.auction.v1beta1.bidOwnerMapping bidding_ids = 12 [json_name = "biddingIds", (.gogoproto.moretags) = "yaml:&#92;"bidding_ids&#92;""];</code>
   */
  com.comdex.auction.v1beta1.bidOwnerMapping getBiddingIds(int index);
  /**
   * <code>repeated .comdex.auction.v1beta1.bidOwnerMapping bidding_ids = 12 [json_name = "biddingIds", (.gogoproto.moretags) = "yaml:&#92;"bidding_ids&#92;""];</code>
   */
  int getBiddingIdsCount();
  /**
   * <code>repeated .comdex.auction.v1beta1.bidOwnerMapping bidding_ids = 12 [json_name = "biddingIds", (.gogoproto.moretags) = "yaml:&#92;"bidding_ids&#92;""];</code>
   */
  java.util.List<? extends com.comdex.auction.v1beta1.bidOwnerMappingOrBuilder> 
      getBiddingIdsOrBuilderList();
  /**
   * <code>repeated .comdex.auction.v1beta1.bidOwnerMapping bidding_ids = 12 [json_name = "biddingIds", (.gogoproto.moretags) = "yaml:&#92;"bidding_ids&#92;""];</code>
   */
  com.comdex.auction.v1beta1.bidOwnerMappingOrBuilder getBiddingIdsOrBuilder(
      int index);

  /**
   * <code>uint64 auction_mapping_id = 13 [json_name = "auctionMappingId", (.gogoproto.moretags) = "yaml:&#92;"auction_mapping_id&#92;""];</code>
   * @return The auctionMappingId.
   */
  long getAuctionMappingId();

  /**
   * <code>string bid_factor = 14 [json_name = "bidFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"bid_factor&#92;""];</code>
   * @return The bidFactor.
   */
  java.lang.String getBidFactor();
  /**
   * <code>string bid_factor = 14 [json_name = "bidFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"bid_factor&#92;""];</code>
   * @return The bytes for bidFactor.
   */
  com.google.protobuf.ByteString
      getBidFactorBytes();

  /**
   * <code>uint64 asset_in_id = 15 [json_name = "assetInId", (.gogoproto.moretags) = "yaml:&#92;"asset_in_id&#92;""];</code>
   * @return The assetInId.
   */
  long getAssetInId();

  /**
   * <code>uint64 asset_out_id = 16 [json_name = "assetOutId", (.gogoproto.moretags) = "yaml:&#92;"asset_out_id&#92;""];</code>
   * @return The assetOutId.
   */
  long getAssetOutId();

  /**
   * <code>.google.protobuf.Timestamp bid_end_time = 17 [json_name = "bidEndTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"bid_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the bidEndTime field is set.
   */
  boolean hasBidEndTime();
  /**
   * <code>.google.protobuf.Timestamp bid_end_time = 17 [json_name = "bidEndTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"bid_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The bidEndTime.
   */
  com.google.protobuf.Timestamp getBidEndTime();
  /**
   * <code>.google.protobuf.Timestamp bid_end_time = 17 [json_name = "bidEndTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"bid_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getBidEndTimeOrBuilder();
}
