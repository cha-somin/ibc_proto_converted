// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/tokenmint/v1beta1/mint.proto

package com.comdex.tokenmint.v1beta1;

public interface MintedTokensOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.tokenmint.v1beta1.MintedTokens)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 asset_id = 1 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return The assetId.
   */
  long getAssetId();

  /**
   * <code>string genesis_supply = 2 [json_name = "genesisSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"genesis_supply&#92;""];</code>
   * @return The genesisSupply.
   */
  java.lang.String getGenesisSupply();
  /**
   * <code>string genesis_supply = 2 [json_name = "genesisSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"genesis_supply&#92;""];</code>
   * @return The bytes for genesisSupply.
   */
  com.google.protobuf.ByteString
      getGenesisSupplyBytes();

  /**
   * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"created_at&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"created_at&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"created_at&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>string current_supply = 4 [json_name = "currentSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"current_supply&#92;""];</code>
   * @return The currentSupply.
   */
  java.lang.String getCurrentSupply();
  /**
   * <code>string current_supply = 4 [json_name = "currentSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"current_supply&#92;""];</code>
   * @return The bytes for currentSupply.
   */
  com.google.protobuf.ByteString
      getCurrentSupplyBytes();
}
