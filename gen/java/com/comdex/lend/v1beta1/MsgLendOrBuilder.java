// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/tx.proto

package com.comdex.lend.v1beta1;

public interface MsgLendOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.lend.v1beta1.MsgLend)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string lender = 1 [json_name = "lender"];</code>
   * @return The lender.
   */
  java.lang.String getLender();
  /**
   * <code>string lender = 1 [json_name = "lender"];</code>
   * @return The bytes for lender.
   */
  com.google.protobuf.ByteString
      getLenderBytes();

  /**
   * <code>uint64 asset_id = 2 [json_name = "assetId"];</code>
   * @return The assetId.
   */
  long getAssetId();

  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();

  /**
   * <code>uint64 pool_id = 4 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <code>uint64 app_id = 5 [json_name = "appId"];</code>
   * @return The appId.
   */
  long getAppId();
}
