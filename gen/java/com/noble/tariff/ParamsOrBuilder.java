// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/tariff/params.proto

package com.noble.tariff;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:noble.tariff.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * share is % of tx fees or rewards allocated to distribution_entities 
   * </pre>
   *
   * <code>string share = 1 [json_name = "share", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"share&#92;""];</code>
   * @return The share.
   */
  java.lang.String getShare();
  /**
   * <pre>
   * share is % of tx fees or rewards allocated to distribution_entities 
   * </pre>
   *
   * <code>string share = 1 [json_name = "share", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"share&#92;""];</code>
   * @return The bytes for share.
   */
  com.google.protobuf.ByteString
      getShareBytes();

  /**
   * <pre>
   * % of tx fees or rewards allocated to a set of global distribution entities
   * these shares must add up to 1
   * </pre>
   *
   * <code>repeated .noble.tariff.DistributionEntity distribution_entities = 2 [json_name = "distributionEntities", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"distribution_entities&#92;""];</code>
   */
  java.util.List<com.noble.tariff.DistributionEntity> 
      getDistributionEntitiesList();
  /**
   * <pre>
   * % of tx fees or rewards allocated to a set of global distribution entities
   * these shares must add up to 1
   * </pre>
   *
   * <code>repeated .noble.tariff.DistributionEntity distribution_entities = 2 [json_name = "distributionEntities", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"distribution_entities&#92;""];</code>
   */
  com.noble.tariff.DistributionEntity getDistributionEntities(int index);
  /**
   * <pre>
   * % of tx fees or rewards allocated to a set of global distribution entities
   * these shares must add up to 1
   * </pre>
   *
   * <code>repeated .noble.tariff.DistributionEntity distribution_entities = 2 [json_name = "distributionEntities", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"distribution_entities&#92;""];</code>
   */
  int getDistributionEntitiesCount();
  /**
   * <pre>
   * % of tx fees or rewards allocated to a set of global distribution entities
   * these shares must add up to 1
   * </pre>
   *
   * <code>repeated .noble.tariff.DistributionEntity distribution_entities = 2 [json_name = "distributionEntities", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"distribution_entities&#92;""];</code>
   */
  java.util.List<? extends com.noble.tariff.DistributionEntityOrBuilder> 
      getDistributionEntitiesOrBuilderList();
  /**
   * <pre>
   * % of tx fees or rewards allocated to a set of global distribution entities
   * these shares must add up to 1
   * </pre>
   *
   * <code>repeated .noble.tariff.DistributionEntity distribution_entities = 2 [json_name = "distributionEntities", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"distribution_entities&#92;""];</code>
   */
  com.noble.tariff.DistributionEntityOrBuilder getDistributionEntitiesOrBuilder(
      int index);

  /**
   * <code>string transfer_fee_bps = 3 [json_name = "transferFeeBps", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"transfer_fee_bps&#92;""];</code>
   * @return The transferFeeBps.
   */
  java.lang.String getTransferFeeBps();
  /**
   * <code>string transfer_fee_bps = 3 [json_name = "transferFeeBps", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"transfer_fee_bps&#92;""];</code>
   * @return The bytes for transferFeeBps.
   */
  com.google.protobuf.ByteString
      getTransferFeeBpsBytes();

  /**
   * <code>string transfer_fee_max = 4 [json_name = "transferFeeMax", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"transfer_fee_max&#92;""];</code>
   * @return The transferFeeMax.
   */
  java.lang.String getTransferFeeMax();
  /**
   * <code>string transfer_fee_max = 4 [json_name = "transferFeeMax", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"transfer_fee_max&#92;""];</code>
   * @return The bytes for transferFeeMax.
   */
  com.google.protobuf.ByteString
      getTransferFeeMaxBytes();

  /**
   * <code>string transfer_fee_denom = 5 [json_name = "transferFeeDenom", (.gogoproto.moretags) = "yaml:&#92;"transfer_fee_denom&#92;""];</code>
   * @return The transferFeeDenom.
   */
  java.lang.String getTransferFeeDenom();
  /**
   * <code>string transfer_fee_denom = 5 [json_name = "transferFeeDenom", (.gogoproto.moretags) = "yaml:&#92;"transfer_fee_denom&#92;""];</code>
   * @return The bytes for transferFeeDenom.
   */
  com.google.protobuf.ByteString
      getTransferFeeDenomBytes();
}
