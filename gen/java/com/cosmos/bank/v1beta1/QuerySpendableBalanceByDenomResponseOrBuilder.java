// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package com.cosmos.bank.v1beta1;

public interface QuerySpendableBalanceByDenomResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * balance is the balance of the coin.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
   * @return Whether the balance field is set.
   */
  boolean hasBalance();
  /**
   * <pre>
   * balance is the balance of the coin.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
   * @return The balance.
   */
  com.cosmos.base.v1beta1.Coin getBalance();
  /**
   * <pre>
   * balance is the balance of the coin.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getBalanceOrBuilder();
}
