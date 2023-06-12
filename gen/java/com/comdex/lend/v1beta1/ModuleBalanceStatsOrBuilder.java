// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/lend.proto

package com.comdex.lend.v1beta1;

public interface ModuleBalanceStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.lend.v1beta1.ModuleBalanceStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 asset_id = 1 [json_name = "assetId", (.gogoproto.customname) = "AssetID", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return The assetId.
   */
  long getAssetId();

  /**
   * <code>.cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"balance&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the balance field is set.
   */
  boolean hasBalance();
  /**
   * <code>.cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"balance&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The balance.
   */
  com.cosmos.base.v1beta1.Coin getBalance();
  /**
   * <code>.cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"balance&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getBalanceOrBuilder();
}
