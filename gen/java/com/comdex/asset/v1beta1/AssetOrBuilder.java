// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/asset/v1beta1/asset.proto

package com.comdex.asset.v1beta1;

public interface AssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.asset.v1beta1.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string name = 2 [json_name = "name", (.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name", (.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string denom = 3 [json_name = "denom", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 3 [json_name = "denom", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string decimals = 4 [json_name = "decimals", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"decimals&#92;""];</code>
   * @return The decimals.
   */
  java.lang.String getDecimals();
  /**
   * <code>string decimals = 4 [json_name = "decimals", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"decimals&#92;""];</code>
   * @return The bytes for decimals.
   */
  com.google.protobuf.ByteString
      getDecimalsBytes();

  /**
   * <code>bool is_on_chain = 5 [json_name = "isOnChain", (.gogoproto.moretags) = "yaml:&#92;"is_on_chain&#92;""];</code>
   * @return The isOnChain.
   */
  boolean getIsOnChain();

  /**
   * <code>bool is_oracle_price_required = 6 [json_name = "isOraclePriceRequired", (.gogoproto.moretags) = "yaml:&#92;"is_oracle_price_required&#92;""];</code>
   * @return The isOraclePriceRequired.
   */
  boolean getIsOraclePriceRequired();

  /**
   * <code>bool is_cdp_mintable = 7 [json_name = "isCdpMintable", (.gogoproto.moretags) = "yaml:&#92;"is_cdp_mintable&#92;""];</code>
   * @return The isCdpMintable.
   */
  boolean getIsCdpMintable();
}
