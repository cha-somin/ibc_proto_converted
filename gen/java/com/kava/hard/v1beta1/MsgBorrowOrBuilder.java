// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/hard/v1beta1/tx.proto

package com.kava.hard.v1beta1;

public interface MsgBorrowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.hard.v1beta1.MsgBorrow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The borrower.
   */
  java.lang.String getBorrower();
  /**
   * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for borrower.
   */
  com.google.protobuf.ByteString
      getBorrowerBytes();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getAmountList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getAmount(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getAmountCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getAmountOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder(
      int index);
}
