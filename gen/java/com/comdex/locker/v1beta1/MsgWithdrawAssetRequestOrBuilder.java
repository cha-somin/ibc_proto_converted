// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/locker/v1beta1/tx.proto

package com.comdex.locker.v1beta1;

public interface MsgWithdrawAssetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.locker.v1beta1.MsgWithdrawAssetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string depositor = 1 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
   * @return The depositor.
   */
  java.lang.String getDepositor();
  /**
   * <code>string depositor = 1 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
   * @return The bytes for depositor.
   */
  com.google.protobuf.ByteString
      getDepositorBytes();

  /**
   * <code>uint64 locker_id = 2 [json_name = "lockerId", (.gogoproto.moretags) = "yaml:&#92;"locker_id&#92;""];</code>
   * @return The lockerId.
   */
  long getLockerId();

  /**
   * <code>string amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>uint64 asset_id = 4 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return The assetId.
   */
  long getAssetId();

  /**
   * <code>uint64 app_id = 5 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
   * @return The appId.
   */
  long getAppId();
}
