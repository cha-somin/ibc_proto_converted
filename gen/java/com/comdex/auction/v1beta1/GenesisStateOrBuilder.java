// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/auction/v1beta1/genesis.proto

package com.comdex.auction.v1beta1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.auction.v1beta1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .comdex.auction.v1beta1.SurplusAuction surplusAuction = 1 [json_name = "surplusAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"surplusAuction&#92;""];</code>
   */
  java.util.List<com.comdex.auction.v1beta1.SurplusAuction> 
      getSurplusAuctionList();
  /**
   * <code>repeated .comdex.auction.v1beta1.SurplusAuction surplusAuction = 1 [json_name = "surplusAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"surplusAuction&#92;""];</code>
   */
  com.comdex.auction.v1beta1.SurplusAuction getSurplusAuction(int index);
  /**
   * <code>repeated .comdex.auction.v1beta1.SurplusAuction surplusAuction = 1 [json_name = "surplusAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"surplusAuction&#92;""];</code>
   */
  int getSurplusAuctionCount();
  /**
   * <code>repeated .comdex.auction.v1beta1.SurplusAuction surplusAuction = 1 [json_name = "surplusAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"surplusAuction&#92;""];</code>
   */
  java.util.List<? extends com.comdex.auction.v1beta1.SurplusAuctionOrBuilder> 
      getSurplusAuctionOrBuilderList();
  /**
   * <code>repeated .comdex.auction.v1beta1.SurplusAuction surplusAuction = 1 [json_name = "surplusAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"surplusAuction&#92;""];</code>
   */
  com.comdex.auction.v1beta1.SurplusAuctionOrBuilder getSurplusAuctionOrBuilder(
      int index);

  /**
   * <code>repeated .comdex.auction.v1beta1.DebtAuction debtAuction = 2 [json_name = "debtAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"debtAuction&#92;""];</code>
   */
  java.util.List<com.comdex.auction.v1beta1.DebtAuction> 
      getDebtAuctionList();
  /**
   * <code>repeated .comdex.auction.v1beta1.DebtAuction debtAuction = 2 [json_name = "debtAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"debtAuction&#92;""];</code>
   */
  com.comdex.auction.v1beta1.DebtAuction getDebtAuction(int index);
  /**
   * <code>repeated .comdex.auction.v1beta1.DebtAuction debtAuction = 2 [json_name = "debtAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"debtAuction&#92;""];</code>
   */
  int getDebtAuctionCount();
  /**
   * <code>repeated .comdex.auction.v1beta1.DebtAuction debtAuction = 2 [json_name = "debtAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"debtAuction&#92;""];</code>
   */
  java.util.List<? extends com.comdex.auction.v1beta1.DebtAuctionOrBuilder> 
      getDebtAuctionOrBuilderList();
  /**
   * <code>repeated .comdex.auction.v1beta1.DebtAuction debtAuction = 2 [json_name = "debtAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"debtAuction&#92;""];</code>
   */
  com.comdex.auction.v1beta1.DebtAuctionOrBuilder getDebtAuctionOrBuilder(
      int index);

  /**
   * <code>repeated .comdex.auction.v1beta1.DutchAuction dutchAuction = 3 [json_name = "dutchAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"dutchAuction&#92;""];</code>
   */
  java.util.List<com.comdex.auction.v1beta1.DutchAuction> 
      getDutchAuctionList();
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchAuction dutchAuction = 3 [json_name = "dutchAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"dutchAuction&#92;""];</code>
   */
  com.comdex.auction.v1beta1.DutchAuction getDutchAuction(int index);
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchAuction dutchAuction = 3 [json_name = "dutchAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"dutchAuction&#92;""];</code>
   */
  int getDutchAuctionCount();
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchAuction dutchAuction = 3 [json_name = "dutchAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"dutchAuction&#92;""];</code>
   */
  java.util.List<? extends com.comdex.auction.v1beta1.DutchAuctionOrBuilder> 
      getDutchAuctionOrBuilderList();
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchAuction dutchAuction = 3 [json_name = "dutchAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"dutchAuction&#92;""];</code>
   */
  com.comdex.auction.v1beta1.DutchAuctionOrBuilder getDutchAuctionOrBuilder(
      int index);

  /**
   * <code>repeated .comdex.auction.v1beta1.ProtocolStatistics protocolStatistics = 4 [json_name = "protocolStatistics", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"protocolStatistics&#92;""];</code>
   */
  java.util.List<com.comdex.auction.v1beta1.ProtocolStatistics> 
      getProtocolStatisticsList();
  /**
   * <code>repeated .comdex.auction.v1beta1.ProtocolStatistics protocolStatistics = 4 [json_name = "protocolStatistics", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"protocolStatistics&#92;""];</code>
   */
  com.comdex.auction.v1beta1.ProtocolStatistics getProtocolStatistics(int index);
  /**
   * <code>repeated .comdex.auction.v1beta1.ProtocolStatistics protocolStatistics = 4 [json_name = "protocolStatistics", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"protocolStatistics&#92;""];</code>
   */
  int getProtocolStatisticsCount();
  /**
   * <code>repeated .comdex.auction.v1beta1.ProtocolStatistics protocolStatistics = 4 [json_name = "protocolStatistics", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"protocolStatistics&#92;""];</code>
   */
  java.util.List<? extends com.comdex.auction.v1beta1.ProtocolStatisticsOrBuilder> 
      getProtocolStatisticsOrBuilderList();
  /**
   * <code>repeated .comdex.auction.v1beta1.ProtocolStatistics protocolStatistics = 4 [json_name = "protocolStatistics", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"protocolStatistics&#92;""];</code>
   */
  com.comdex.auction.v1beta1.ProtocolStatisticsOrBuilder getProtocolStatisticsOrBuilder(
      int index);

  /**
   * <code>repeated .comdex.auction.v1beta1.AuctionParams auctionParams = 5 [json_name = "auctionParams", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"auctionParams&#92;""];</code>
   */
  java.util.List<com.comdex.auction.v1beta1.AuctionParams> 
      getAuctionParamsList();
  /**
   * <code>repeated .comdex.auction.v1beta1.AuctionParams auctionParams = 5 [json_name = "auctionParams", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"auctionParams&#92;""];</code>
   */
  com.comdex.auction.v1beta1.AuctionParams getAuctionParams(int index);
  /**
   * <code>repeated .comdex.auction.v1beta1.AuctionParams auctionParams = 5 [json_name = "auctionParams", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"auctionParams&#92;""];</code>
   */
  int getAuctionParamsCount();
  /**
   * <code>repeated .comdex.auction.v1beta1.AuctionParams auctionParams = 5 [json_name = "auctionParams", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"auctionParams&#92;""];</code>
   */
  java.util.List<? extends com.comdex.auction.v1beta1.AuctionParamsOrBuilder> 
      getAuctionParamsOrBuilderList();
  /**
   * <code>repeated .comdex.auction.v1beta1.AuctionParams auctionParams = 5 [json_name = "auctionParams", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"auctionParams&#92;""];</code>
   */
  com.comdex.auction.v1beta1.AuctionParamsOrBuilder getAuctionParamsOrBuilder(
      int index);

  /**
   * <code>repeated .comdex.auction.v1beta1.DutchAuction dutchLendAuction = 6 [json_name = "dutchLendAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"dutchLendAuction&#92;""];</code>
   */
  java.util.List<com.comdex.auction.v1beta1.DutchAuction> 
      getDutchLendAuctionList();
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchAuction dutchLendAuction = 6 [json_name = "dutchLendAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"dutchLendAuction&#92;""];</code>
   */
  com.comdex.auction.v1beta1.DutchAuction getDutchLendAuction(int index);
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchAuction dutchLendAuction = 6 [json_name = "dutchLendAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"dutchLendAuction&#92;""];</code>
   */
  int getDutchLendAuctionCount();
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchAuction dutchLendAuction = 6 [json_name = "dutchLendAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"dutchLendAuction&#92;""];</code>
   */
  java.util.List<? extends com.comdex.auction.v1beta1.DutchAuctionOrBuilder> 
      getDutchLendAuctionOrBuilderList();
  /**
   * <code>repeated .comdex.auction.v1beta1.DutchAuction dutchLendAuction = 6 [json_name = "dutchLendAuction", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"dutchLendAuction&#92;""];</code>
   */
  com.comdex.auction.v1beta1.DutchAuctionOrBuilder getDutchLendAuctionOrBuilder(
      int index);

  /**
   * <code>.comdex.auction.v1beta1.Params params = 7 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.comdex.auction.v1beta1.Params params = 7 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.comdex.auction.v1beta1.Params getParams();
  /**
   * <code>.comdex.auction.v1beta1.Params params = 7 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.comdex.auction.v1beta1.ParamsOrBuilder getParamsOrBuilder();

  /**
   * <code>uint64 UserBiddingID = 8 [json_name = "UserBiddingID"];</code>
   * @return The userBiddingID.
   */
  long getUserBiddingID();
}
