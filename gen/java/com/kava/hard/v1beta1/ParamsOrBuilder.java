// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/hard/v1beta1/hard.proto

package com.kava.hard.v1beta1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.hard.v1beta1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .kava.hard.v1beta1.MoneyMarket money_markets = 1 [json_name = "moneyMarkets", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "MoneyMarkets"];</code>
   */
  java.util.List<com.kava.hard.v1beta1.MoneyMarket> 
      getMoneyMarketsList();
  /**
   * <code>repeated .kava.hard.v1beta1.MoneyMarket money_markets = 1 [json_name = "moneyMarkets", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "MoneyMarkets"];</code>
   */
  com.kava.hard.v1beta1.MoneyMarket getMoneyMarkets(int index);
  /**
   * <code>repeated .kava.hard.v1beta1.MoneyMarket money_markets = 1 [json_name = "moneyMarkets", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "MoneyMarkets"];</code>
   */
  int getMoneyMarketsCount();
  /**
   * <code>repeated .kava.hard.v1beta1.MoneyMarket money_markets = 1 [json_name = "moneyMarkets", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "MoneyMarkets"];</code>
   */
  java.util.List<? extends com.kava.hard.v1beta1.MoneyMarketOrBuilder> 
      getMoneyMarketsOrBuilderList();
  /**
   * <code>repeated .kava.hard.v1beta1.MoneyMarket money_markets = 1 [json_name = "moneyMarkets", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "MoneyMarkets"];</code>
   */
  com.kava.hard.v1beta1.MoneyMarketOrBuilder getMoneyMarketsOrBuilder(
      int index);

  /**
   * <code>string minimum_borrow_usd_value = 2 [json_name = "minimumBorrowUsdValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "MinimumBorrowUSDValue", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The minimumBorrowUsdValue.
   */
  java.lang.String getMinimumBorrowUsdValue();
  /**
   * <code>string minimum_borrow_usd_value = 2 [json_name = "minimumBorrowUsdValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "MinimumBorrowUSDValue", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for minimumBorrowUsdValue.
   */
  com.google.protobuf.ByteString
      getMinimumBorrowUsdValueBytes();
}
