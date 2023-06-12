// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/auction/v1/genesis.proto

package com.auction.v1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auction.v1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.auction.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.auction.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.auction.v1.Params getParams();
  /**
   * <code>.auction.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.auction.v1.ParamsOrBuilder getParamsOrBuilder();

  /**
   * <code>repeated .auction.v1.Auction auctions = 2 [json_name = "auctions"];</code>
   */
  java.util.List<com.auction.v1.Auction> 
      getAuctionsList();
  /**
   * <code>repeated .auction.v1.Auction auctions = 2 [json_name = "auctions"];</code>
   */
  com.auction.v1.Auction getAuctions(int index);
  /**
   * <code>repeated .auction.v1.Auction auctions = 2 [json_name = "auctions"];</code>
   */
  int getAuctionsCount();
  /**
   * <code>repeated .auction.v1.Auction auctions = 2 [json_name = "auctions"];</code>
   */
  java.util.List<? extends com.auction.v1.AuctionOrBuilder> 
      getAuctionsOrBuilderList();
  /**
   * <code>repeated .auction.v1.Auction auctions = 2 [json_name = "auctions"];</code>
   */
  com.auction.v1.AuctionOrBuilder getAuctionsOrBuilder(
      int index);

  /**
   * <code>repeated .auction.v1.Bid bids = 3 [json_name = "bids"];</code>
   */
  java.util.List<com.auction.v1.Bid> 
      getBidsList();
  /**
   * <code>repeated .auction.v1.Bid bids = 3 [json_name = "bids"];</code>
   */
  com.auction.v1.Bid getBids(int index);
  /**
   * <code>repeated .auction.v1.Bid bids = 3 [json_name = "bids"];</code>
   */
  int getBidsCount();
  /**
   * <code>repeated .auction.v1.Bid bids = 3 [json_name = "bids"];</code>
   */
  java.util.List<? extends com.auction.v1.BidOrBuilder> 
      getBidsOrBuilderList();
  /**
   * <code>repeated .auction.v1.Bid bids = 3 [json_name = "bids"];</code>
   */
  com.auction.v1.BidOrBuilder getBidsOrBuilder(
      int index);

  /**
   * <code>repeated .auction.v1.TokenPrice token_prices = 4 [json_name = "tokenPrices"];</code>
   */
  java.util.List<com.auction.v1.TokenPrice> 
      getTokenPricesList();
  /**
   * <code>repeated .auction.v1.TokenPrice token_prices = 4 [json_name = "tokenPrices"];</code>
   */
  com.auction.v1.TokenPrice getTokenPrices(int index);
  /**
   * <code>repeated .auction.v1.TokenPrice token_prices = 4 [json_name = "tokenPrices"];</code>
   */
  int getTokenPricesCount();
  /**
   * <code>repeated .auction.v1.TokenPrice token_prices = 4 [json_name = "tokenPrices"];</code>
   */
  java.util.List<? extends com.auction.v1.TokenPriceOrBuilder> 
      getTokenPricesOrBuilderList();
  /**
   * <code>repeated .auction.v1.TokenPrice token_prices = 4 [json_name = "tokenPrices"];</code>
   */
  com.auction.v1.TokenPriceOrBuilder getTokenPricesOrBuilder(
      int index);

  /**
   * <code>uint32 last_auction_id = 5 [json_name = "lastAuctionId"];</code>
   * @return The lastAuctionId.
   */
  int getLastAuctionId();

  /**
   * <code>uint64 last_bid_id = 6 [json_name = "lastBidId"];</code>
   * @return The lastBidId.
   */
  long getLastBidId();
}
