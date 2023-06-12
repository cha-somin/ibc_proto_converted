// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/auction/v1/proposal.proto

package com.auction.v1;

public interface SetTokenPricesProposalWithDepositOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auction.v1.SetTokenPricesProposalWithDeposit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .auction.v1.ProposedTokenPrice token_prices = 3 [json_name = "tokenPrices"];</code>
   */
  java.util.List<com.auction.v1.ProposedTokenPrice> 
      getTokenPricesList();
  /**
   * <code>repeated .auction.v1.ProposedTokenPrice token_prices = 3 [json_name = "tokenPrices"];</code>
   */
  com.auction.v1.ProposedTokenPrice getTokenPrices(int index);
  /**
   * <code>repeated .auction.v1.ProposedTokenPrice token_prices = 3 [json_name = "tokenPrices"];</code>
   */
  int getTokenPricesCount();
  /**
   * <code>repeated .auction.v1.ProposedTokenPrice token_prices = 3 [json_name = "tokenPrices"];</code>
   */
  java.util.List<? extends com.auction.v1.ProposedTokenPriceOrBuilder> 
      getTokenPricesOrBuilderList();
  /**
   * <code>repeated .auction.v1.ProposedTokenPrice token_prices = 3 [json_name = "tokenPrices"];</code>
   */
  com.auction.v1.ProposedTokenPriceOrBuilder getTokenPricesOrBuilder(
      int index);

  /**
   * <code>string deposit = 4 [json_name = "deposit"];</code>
   * @return The deposit.
   */
  java.lang.String getDeposit();
  /**
   * <code>string deposit = 4 [json_name = "deposit"];</code>
   * @return The bytes for deposit.
   */
  com.google.protobuf.ByteString
      getDepositBytes();
}
