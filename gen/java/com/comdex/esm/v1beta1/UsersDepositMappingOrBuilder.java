// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/esm/v1beta1/esm.proto

package com.comdex.esm.v1beta1;

public interface UsersDepositMappingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.esm.v1beta1.UsersDepositMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 app_id = 1 [json_name = "appId", (.gogoproto.customname) = "AppId", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>string depositor = 2 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
   * @return The depositor.
   */
  java.lang.String getDepositor();
  /**
   * <code>string depositor = 2 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
   * @return The bytes for depositor.
   */
  com.google.protobuf.ByteString
      getDepositorBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin deposits = 3 [json_name = "deposits", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposits&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the deposits field is set.
   */
  boolean hasDeposits();
  /**
   * <code>.cosmos.base.v1beta1.Coin deposits = 3 [json_name = "deposits", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposits&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The deposits.
   */
  com.cosmos.base.v1beta1.Coin getDeposits();
  /**
   * <code>.cosmos.base.v1beta1.Coin deposits = 3 [json_name = "deposits", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposits&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getDepositsOrBuilder();
}
