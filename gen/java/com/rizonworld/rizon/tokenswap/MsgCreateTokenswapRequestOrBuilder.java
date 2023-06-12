// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rizon/tokenswap/tx.proto

package com.rizonworld.rizon.tokenswap;

public interface MsgCreateTokenswapRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * tx_hash is the tx hash of burn tx from legacy chain
   * tx_hash is used for store key
   * </pre>
   *
   * <code>string tx_hash = 1 [json_name = "txHash", (.gogoproto.moretags) = "yaml:&#92;"tx_hash&#92;""];</code>
   * @return The txHash.
   */
  java.lang.String getTxHash();
  /**
   * <pre>
   * tx_hash is the tx hash of burn tx from legacy chain
   * tx_hash is used for store key
   * </pre>
   *
   * <code>string tx_hash = 1 [json_name = "txHash", (.gogoproto.moretags) = "yaml:&#92;"tx_hash&#92;""];</code>
   * @return The bytes for txHash.
   */
  com.google.protobuf.ByteString
      getTxHashBytes();

  /**
   * <pre>
   * receiver is the target of tokenswap
   * </pre>
   *
   * <code>string receiver = 2 [json_name = "receiver", (.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
   * @return The receiver.
   */
  java.lang.String getReceiver();
  /**
   * <pre>
   * receiver is the target of tokenswap
   * </pre>
   *
   * <code>string receiver = 2 [json_name = "receiver", (.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
   * @return The bytes for receiver.
   */
  com.google.protobuf.ByteString
      getReceiverBytes();

  /**
   * <pre>
   * signer is who confirms the swap process
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <pre>
   * signer is who confirms the swap process
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();

  /**
   * <pre>
   * amount is the amount of swap process
   * </pre>
   *
   * <code>string amount = 4 [json_name = "amount", (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <pre>
   * amount is the amount of swap process
   * </pre>
   *
   * <code>string amount = 4 [json_name = "amount", (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();
}
