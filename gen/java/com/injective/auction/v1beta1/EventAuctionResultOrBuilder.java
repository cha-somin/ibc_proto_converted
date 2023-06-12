// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/auction/v1beta1/auction.proto

package com.injective.auction.v1beta1;

public interface EventAuctionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.auction.v1beta1.EventAuctionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * winner describes the address of the winner
   * </pre>
   *
   * <code>string winner = 1 [json_name = "winner"];</code>
   * @return The winner.
   */
  java.lang.String getWinner();
  /**
   * <pre>
   * winner describes the address of the winner
   * </pre>
   *
   * <code>string winner = 1 [json_name = "winner"];</code>
   * @return The bytes for winner.
   */
  com.google.protobuf.ByteString
      getWinnerBytes();

  /**
   * <pre>
   * amount describes the amount the winner get from the auction
   * </pre>
   *
   * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <pre>
   * amount describes the amount the winner get from the auction
   * </pre>
   *
   * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <pre>
   * round defines the round number of auction
   * </pre>
   *
   * <code>uint64 round = 3 [json_name = "round"];</code>
   * @return The round.
   */
  long getRound();
}
