// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/hard/v1beta1/query.proto

package com.kava.hard.v1beta1;

public interface DepositResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.hard.v1beta1.DepositResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string depositor = 1 [json_name = "depositor", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The depositor.
   */
  java.lang.String getDepositor();
  /**
   * <code>string depositor = 1 [json_name = "depositor", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for depositor.
   */
  com.google.protobuf.ByteString
      getDepositorBytes();

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

  /**
   * <code>repeated .kava.hard.v1beta1.SupplyInterestFactorResponse index = 3 [json_name = "index", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "SupplyInterestFactorResponses"];</code>
   */
  java.util.List<com.kava.hard.v1beta1.SupplyInterestFactorResponse> 
      getIndexList();
  /**
   * <code>repeated .kava.hard.v1beta1.SupplyInterestFactorResponse index = 3 [json_name = "index", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "SupplyInterestFactorResponses"];</code>
   */
  com.kava.hard.v1beta1.SupplyInterestFactorResponse getIndex(int index);
  /**
   * <code>repeated .kava.hard.v1beta1.SupplyInterestFactorResponse index = 3 [json_name = "index", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "SupplyInterestFactorResponses"];</code>
   */
  int getIndexCount();
  /**
   * <code>repeated .kava.hard.v1beta1.SupplyInterestFactorResponse index = 3 [json_name = "index", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "SupplyInterestFactorResponses"];</code>
   */
  java.util.List<? extends com.kava.hard.v1beta1.SupplyInterestFactorResponseOrBuilder> 
      getIndexOrBuilderList();
  /**
   * <code>repeated .kava.hard.v1beta1.SupplyInterestFactorResponse index = 3 [json_name = "index", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "SupplyInterestFactorResponses"];</code>
   */
  com.kava.hard.v1beta1.SupplyInterestFactorResponseOrBuilder getIndexOrBuilder(
      int index);
}
