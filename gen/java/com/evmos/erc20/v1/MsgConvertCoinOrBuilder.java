// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/erc20/v1/tx.proto

package com.evmos.erc20.v1;

public interface MsgConvertCoinOrBuilder extends
    // @@protoc_insertion_point(interface_extends:evmos.erc20.v1.MsgConvertCoin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * coin is a Cosmos coin whose denomination is registered in a token pair. The coin
   * amount defines the amount of coins to convert.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin coin = 1 [json_name = "coin", (.gogoproto.nullable) = false];</code>
   * @return Whether the coin field is set.
   */
  boolean hasCoin();
  /**
   * <pre>
   * coin is a Cosmos coin whose denomination is registered in a token pair. The coin
   * amount defines the amount of coins to convert.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin coin = 1 [json_name = "coin", (.gogoproto.nullable) = false];</code>
   * @return The coin.
   */
  com.cosmos.base.v1beta1.Coin getCoin();
  /**
   * <pre>
   * coin is a Cosmos coin whose denomination is registered in a token pair. The coin
   * amount defines the amount of coins to convert.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin coin = 1 [json_name = "coin", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getCoinOrBuilder();

  /**
   * <pre>
   * receiver is the hex address to receive ERC20 token
   * </pre>
   *
   * <code>string receiver = 2 [json_name = "receiver"];</code>
   * @return The receiver.
   */
  java.lang.String getReceiver();
  /**
   * <pre>
   * receiver is the hex address to receive ERC20 token
   * </pre>
   *
   * <code>string receiver = 2 [json_name = "receiver"];</code>
   * @return The bytes for receiver.
   */
  com.google.protobuf.ByteString
      getReceiverBytes();

  /**
   * <pre>
   * sender is the cosmos bech32 address from the owner of the given Cosmos coins
   * </pre>
   *
   * <code>string sender = 3 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <pre>
   * sender is the cosmos bech32 address from the owner of the given Cosmos coins
   * </pre>
   *
   * <code>string sender = 3 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();
}
