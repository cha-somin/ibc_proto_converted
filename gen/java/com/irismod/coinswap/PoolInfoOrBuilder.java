// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/coinswap/query.proto

package com.irismod.coinswap;

public interface PoolInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.coinswap.PoolInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * escrow account for deposit tokens
   * </pre>
   *
   * <code>string escrow_address = 2 [json_name = "escrowAddress"];</code>
   * @return The escrowAddress.
   */
  java.lang.String getEscrowAddress();
  /**
   * <pre>
   * escrow account for deposit tokens
   * </pre>
   *
   * <code>string escrow_address = 2 [json_name = "escrowAddress"];</code>
   * @return The bytes for escrowAddress.
   */
  com.google.protobuf.ByteString
      getEscrowAddressBytes();

  /**
   * <pre>
   * main token balance
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin standard = 3 [json_name = "standard", (.gogoproto.nullable) = false];</code>
   * @return Whether the standard field is set.
   */
  boolean hasStandard();
  /**
   * <pre>
   * main token balance
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin standard = 3 [json_name = "standard", (.gogoproto.nullable) = false];</code>
   * @return The standard.
   */
  com.cosmos.base.v1beta1.Coin getStandard();
  /**
   * <pre>
   * main token balance
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin standard = 3 [json_name = "standard", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getStandardOrBuilder();

  /**
   * <pre>
   * counterparty token balance
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token = 4 [json_name = "token", (.gogoproto.nullable) = false];</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <pre>
   * counterparty token balance
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token = 4 [json_name = "token", (.gogoproto.nullable) = false];</code>
   * @return The token.
   */
  com.cosmos.base.v1beta1.Coin getToken();
  /**
   * <pre>
   * counterparty token balance
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token = 4 [json_name = "token", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTokenOrBuilder();

  /**
   * <pre>
   * liquidity token balance
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin lpt = 5 [json_name = "lpt", (.gogoproto.nullable) = false];</code>
   * @return Whether the lpt field is set.
   */
  boolean hasLpt();
  /**
   * <pre>
   * liquidity token balance
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin lpt = 5 [json_name = "lpt", (.gogoproto.nullable) = false];</code>
   * @return The lpt.
   */
  com.cosmos.base.v1beta1.Coin getLpt();
  /**
   * <pre>
   * liquidity token balance
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin lpt = 5 [json_name = "lpt", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getLptOrBuilder();

  /**
   * <pre>
   * liquidity pool fee
   * </pre>
   *
   * <code>string fee = 6 [json_name = "fee"];</code>
   * @return The fee.
   */
  java.lang.String getFee();
  /**
   * <pre>
   * liquidity pool fee
   * </pre>
   *
   * <code>string fee = 6 [json_name = "fee"];</code>
   * @return The bytes for fee.
   */
  com.google.protobuf.ByteString
      getFeeBytes();
}
