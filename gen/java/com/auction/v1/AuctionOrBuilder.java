// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/auction/v1/auction.proto

package com.auction.v1;

public interface AuctionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auction.v1.Auction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>.cosmos.base.v1beta1.Coin starting_tokens_for_sale = 2 [json_name = "startingTokensForSale", (.gogoproto.nullable) = false];</code>
   * @return Whether the startingTokensForSale field is set.
   */
  boolean hasStartingTokensForSale();
  /**
   * <code>.cosmos.base.v1beta1.Coin starting_tokens_for_sale = 2 [json_name = "startingTokensForSale", (.gogoproto.nullable) = false];</code>
   * @return The startingTokensForSale.
   */
  com.cosmos.base.v1beta1.Coin getStartingTokensForSale();
  /**
   * <code>.cosmos.base.v1beta1.Coin starting_tokens_for_sale = 2 [json_name = "startingTokensForSale", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getStartingTokensForSaleOrBuilder();

  /**
   * <code>uint64 start_block = 3 [json_name = "startBlock"];</code>
   * @return The startBlock.
   */
  long getStartBlock();

  /**
   * <code>uint64 end_block = 4 [json_name = "endBlock"];</code>
   * @return The endBlock.
   */
  long getEndBlock();

  /**
   * <code>string initial_price_decrease_rate = 5 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The initialPriceDecreaseRate.
   */
  java.lang.String getInitialPriceDecreaseRate();
  /**
   * <code>string initial_price_decrease_rate = 5 [json_name = "initialPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for initialPriceDecreaseRate.
   */
  com.google.protobuf.ByteString
      getInitialPriceDecreaseRateBytes();

  /**
   * <code>string current_price_decrease_rate = 6 [json_name = "currentPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The currentPriceDecreaseRate.
   */
  java.lang.String getCurrentPriceDecreaseRate();
  /**
   * <code>string current_price_decrease_rate = 6 [json_name = "currentPriceDecreaseRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for currentPriceDecreaseRate.
   */
  com.google.protobuf.ByteString
      getCurrentPriceDecreaseRateBytes();

  /**
   * <code>uint64 price_decrease_block_interval = 7 [json_name = "priceDecreaseBlockInterval"];</code>
   * @return The priceDecreaseBlockInterval.
   */
  long getPriceDecreaseBlockInterval();

  /**
   * <code>string initial_unit_price_in_usomm = 8 [json_name = "initialUnitPriceInUsomm", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The initialUnitPriceInUsomm.
   */
  java.lang.String getInitialUnitPriceInUsomm();
  /**
   * <code>string initial_unit_price_in_usomm = 8 [json_name = "initialUnitPriceInUsomm", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for initialUnitPriceInUsomm.
   */
  com.google.protobuf.ByteString
      getInitialUnitPriceInUsommBytes();

  /**
   * <code>string current_unit_price_in_usomm = 9 [json_name = "currentUnitPriceInUsomm", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The currentUnitPriceInUsomm.
   */
  java.lang.String getCurrentUnitPriceInUsomm();
  /**
   * <code>string current_unit_price_in_usomm = 9 [json_name = "currentUnitPriceInUsomm", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for currentUnitPriceInUsomm.
   */
  com.google.protobuf.ByteString
      getCurrentUnitPriceInUsommBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin remaining_tokens_for_sale = 10 [json_name = "remainingTokensForSale", (.gogoproto.nullable) = false];</code>
   * @return Whether the remainingTokensForSale field is set.
   */
  boolean hasRemainingTokensForSale();
  /**
   * <code>.cosmos.base.v1beta1.Coin remaining_tokens_for_sale = 10 [json_name = "remainingTokensForSale", (.gogoproto.nullable) = false];</code>
   * @return The remainingTokensForSale.
   */
  com.cosmos.base.v1beta1.Coin getRemainingTokensForSale();
  /**
   * <code>.cosmos.base.v1beta1.Coin remaining_tokens_for_sale = 10 [json_name = "remainingTokensForSale", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getRemainingTokensForSaleOrBuilder();

  /**
   * <code>string funding_module_account = 11 [json_name = "fundingModuleAccount"];</code>
   * @return The fundingModuleAccount.
   */
  java.lang.String getFundingModuleAccount();
  /**
   * <code>string funding_module_account = 11 [json_name = "fundingModuleAccount"];</code>
   * @return The bytes for fundingModuleAccount.
   */
  com.google.protobuf.ByteString
      getFundingModuleAccountBytes();

  /**
   * <code>string proceeds_module_account = 12 [json_name = "proceedsModuleAccount"];</code>
   * @return The proceedsModuleAccount.
   */
  java.lang.String getProceedsModuleAccount();
  /**
   * <code>string proceeds_module_account = 12 [json_name = "proceedsModuleAccount"];</code>
   * @return The bytes for proceedsModuleAccount.
   */
  com.google.protobuf.ByteString
      getProceedsModuleAccountBytes();
}
