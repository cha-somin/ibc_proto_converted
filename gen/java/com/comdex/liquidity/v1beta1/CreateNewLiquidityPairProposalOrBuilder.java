// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/gov.proto

package com.comdex.liquidity.v1beta1;

public interface CreateNewLiquidityPairProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidity.v1beta1.CreateNewLiquidityPairProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>uint64 app_id = 2 [json_name = "appId"];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>string base_coin_denom = 3 [json_name = "baseCoinDenom"];</code>
   * @return The baseCoinDenom.
   */
  java.lang.String getBaseCoinDenom();
  /**
   * <code>string base_coin_denom = 3 [json_name = "baseCoinDenom"];</code>
   * @return The bytes for baseCoinDenom.
   */
  com.google.protobuf.ByteString
      getBaseCoinDenomBytes();

  /**
   * <code>string quote_coin_denom = 4 [json_name = "quoteCoinDenom"];</code>
   * @return The quoteCoinDenom.
   */
  java.lang.String getQuoteCoinDenom();
  /**
   * <code>string quote_coin_denom = 4 [json_name = "quoteCoinDenom"];</code>
   * @return The bytes for quoteCoinDenom.
   */
  com.google.protobuf.ByteString
      getQuoteCoinDenomBytes();

  /**
   * <code>string title = 5 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 5 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 6 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 6 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
