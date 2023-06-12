// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/shield/v1alpha1/genesis.proto

package com.shentu.shield.v1alpha1;

public interface ReimbursementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:shentu.shield.v1alpha1.Reimbursement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getAmountList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getAmount(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getAmountCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getAmountOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 1 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder(
      int index);

  /**
   * <code>string beneficiary = 2 [json_name = "beneficiary", (.gogoproto.moretags) = "yaml:&#92;"beneficiary&#92;""];</code>
   * @return The beneficiary.
   */
  java.lang.String getBeneficiary();
  /**
   * <code>string beneficiary = 2 [json_name = "beneficiary", (.gogoproto.moretags) = "yaml:&#92;"beneficiary&#92;""];</code>
   * @return The bytes for beneficiary.
   */
  com.google.protobuf.ByteString
      getBeneficiaryBytes();

  /**
   * <code>.google.protobuf.Timestamp payout_time = 3 [json_name = "payoutTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"payout_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the payoutTime field is set.
   */
  boolean hasPayoutTime();
  /**
   * <code>.google.protobuf.Timestamp payout_time = 3 [json_name = "payoutTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"payout_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The payoutTime.
   */
  com.google.protobuf.Timestamp getPayoutTime();
  /**
   * <code>.google.protobuf.Timestamp payout_time = 3 [json_name = "payoutTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"payout_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getPayoutTimeOrBuilder();
}
