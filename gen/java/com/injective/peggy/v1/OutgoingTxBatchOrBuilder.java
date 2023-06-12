// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/batch.proto

package com.injective.peggy.v1;

public interface OutgoingTxBatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.peggy.v1.OutgoingTxBatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 batch_nonce = 1 [json_name = "batchNonce"];</code>
   * @return The batchNonce.
   */
  long getBatchNonce();

  /**
   * <code>uint64 batch_timeout = 2 [json_name = "batchTimeout"];</code>
   * @return The batchTimeout.
   */
  long getBatchTimeout();

  /**
   * <code>repeated .injective.peggy.v1.OutgoingTransferTx transactions = 3 [json_name = "transactions"];</code>
   */
  java.util.List<com.injective.peggy.v1.OutgoingTransferTx> 
      getTransactionsList();
  /**
   * <code>repeated .injective.peggy.v1.OutgoingTransferTx transactions = 3 [json_name = "transactions"];</code>
   */
  com.injective.peggy.v1.OutgoingTransferTx getTransactions(int index);
  /**
   * <code>repeated .injective.peggy.v1.OutgoingTransferTx transactions = 3 [json_name = "transactions"];</code>
   */
  int getTransactionsCount();
  /**
   * <code>repeated .injective.peggy.v1.OutgoingTransferTx transactions = 3 [json_name = "transactions"];</code>
   */
  java.util.List<? extends com.injective.peggy.v1.OutgoingTransferTxOrBuilder> 
      getTransactionsOrBuilderList();
  /**
   * <code>repeated .injective.peggy.v1.OutgoingTransferTx transactions = 3 [json_name = "transactions"];</code>
   */
  com.injective.peggy.v1.OutgoingTransferTxOrBuilder getTransactionsOrBuilder(
      int index);

  /**
   * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
   * @return The tokenContract.
   */
  java.lang.String getTokenContract();
  /**
   * <code>string token_contract = 4 [json_name = "tokenContract"];</code>
   * @return The bytes for tokenContract.
   */
  com.google.protobuf.ByteString
      getTokenContractBytes();

  /**
   * <code>uint64 block = 5 [json_name = "block"];</code>
   * @return The block.
   */
  long getBlock();
}
