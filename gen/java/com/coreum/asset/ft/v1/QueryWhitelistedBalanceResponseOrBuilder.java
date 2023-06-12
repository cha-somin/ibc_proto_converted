// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/query.proto

package com.coreum.asset.ft.v1;

public interface QueryWhitelistedBalanceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:coreum.asset.ft.v1.QueryWhitelistedBalanceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * balance contains the whitelisted balance with the queried account and denom
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance", (.gogoproto.nullable) = false];</code>
   * @return Whether the balance field is set.
   */
  boolean hasBalance();
  /**
   * <pre>
   * balance contains the whitelisted balance with the queried account and denom
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance", (.gogoproto.nullable) = false];</code>
   * @return The balance.
   */
  com.cosmos.base.v1beta1.Coin getBalance();
  /**
   * <pre>
   * balance contains the whitelisted balance with the queried account and denom
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1 [json_name = "balance", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getBalanceOrBuilder();
}
