// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/locker/v1beta1/locker.proto

package com.comdex.locker.v1beta1;

public interface UserTxDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.locker.v1beta1.UserTxData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tx_type = 1 [json_name = "txType", (.gogoproto.moretags) = "yaml:&#92;"tx_type&#92;""];</code>
   * @return The txType.
   */
  java.lang.String getTxType();
  /**
   * <code>string tx_type = 1 [json_name = "txType", (.gogoproto.moretags) = "yaml:&#92;"tx_type&#92;""];</code>
   * @return The bytes for txType.
   */
  com.google.protobuf.ByteString
      getTxTypeBytes();

  /**
   * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>string balance = 3 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"balance&#92;""];</code>
   * @return The balance.
   */
  java.lang.String getBalance();
  /**
   * <code>string balance = 3 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"balance&#92;""];</code>
   * @return The bytes for balance.
   */
  com.google.protobuf.ByteString
      getBalanceBytes();

  /**
   * <code>.google.protobuf.Timestamp tx_time = 4 [json_name = "txTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tx_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the txTime field is set.
   */
  boolean hasTxTime();
  /**
   * <code>.google.protobuf.Timestamp tx_time = 4 [json_name = "txTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tx_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The txTime.
   */
  com.google.protobuf.Timestamp getTxTime();
  /**
   * <code>.google.protobuf.Timestamp tx_time = 4 [json_name = "txTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tx_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTxTimeOrBuilder();
}
