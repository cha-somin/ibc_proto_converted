// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/tx.proto

package com.comdex.lend.v1beta1;

public interface MsgFundModuleAccountsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.lend.v1beta1.MsgFundModuleAccounts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 poolId = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <code>uint64 assetId = 2 [json_name = "assetId"];</code>
   * @return The assetId.
   */
  long getAssetId();

  /**
   * <code>string lender = 3 [json_name = "lender"];</code>
   * @return The lender.
   */
  java.lang.String getLender();
  /**
   * <code>string lender = 3 [json_name = "lender"];</code>
   * @return The bytes for lender.
   */
  com.google.protobuf.ByteString
      getLenderBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();
}
