// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/stakeibc/tx.proto

package com.stride.stakeibc;

public interface MsgRegisterHostZoneOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.stakeibc.MsgRegisterHostZone)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string connection_id = 2 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <code>string connection_id = 2 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();

  /**
   * <code>string bech32prefix = 12 [json_name = "bech32prefix"];</code>
   * @return The bech32prefix.
   */
  java.lang.String getBech32Prefix();
  /**
   * <code>string bech32prefix = 12 [json_name = "bech32prefix"];</code>
   * @return The bytes for bech32prefix.
   */
  com.google.protobuf.ByteString
      getBech32PrefixBytes();

  /**
   * <code>string host_denom = 4 [json_name = "hostDenom", (.gogoproto.moretags) = "yaml:&#92;"host_denom&#92;""];</code>
   * @return The hostDenom.
   */
  java.lang.String getHostDenom();
  /**
   * <code>string host_denom = 4 [json_name = "hostDenom", (.gogoproto.moretags) = "yaml:&#92;"host_denom&#92;""];</code>
   * @return The bytes for hostDenom.
   */
  com.google.protobuf.ByteString
      getHostDenomBytes();

  /**
   * <code>string ibc_denom = 5 [json_name = "ibcDenom", (.gogoproto.moretags) = "yaml:&#92;"ibc_denom&#92;""];</code>
   * @return The ibcDenom.
   */
  java.lang.String getIbcDenom();
  /**
   * <code>string ibc_denom = 5 [json_name = "ibcDenom", (.gogoproto.moretags) = "yaml:&#92;"ibc_denom&#92;""];</code>
   * @return The bytes for ibcDenom.
   */
  com.google.protobuf.ByteString
      getIbcDenomBytes();

  /**
   * <code>string creator = 6 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 6 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>string transfer_channel_id = 10 [json_name = "transferChannelId", (.gogoproto.moretags) = "yaml:&#92;"transfer_channel_id&#92;""];</code>
   * @return The transferChannelId.
   */
  java.lang.String getTransferChannelId();
  /**
   * <code>string transfer_channel_id = 10 [json_name = "transferChannelId", (.gogoproto.moretags) = "yaml:&#92;"transfer_channel_id&#92;""];</code>
   * @return The bytes for transferChannelId.
   */
  com.google.protobuf.ByteString
      getTransferChannelIdBytes();

  /**
   * <code>uint64 unbonding_frequency = 11 [json_name = "unbondingFrequency", (.gogoproto.moretags) = "yaml:&#92;"unbonding_frequency&#92;""];</code>
   * @return The unbondingFrequency.
   */
  long getUnbondingFrequency();

  /**
   * <code>string min_redemption_rate = 13 [json_name = "minRedemptionRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The minRedemptionRate.
   */
  java.lang.String getMinRedemptionRate();
  /**
   * <code>string min_redemption_rate = 13 [json_name = "minRedemptionRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for minRedemptionRate.
   */
  com.google.protobuf.ByteString
      getMinRedemptionRateBytes();

  /**
   * <code>string max_redemption_rate = 14 [json_name = "maxRedemptionRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The maxRedemptionRate.
   */
  java.lang.String getMaxRedemptionRate();
  /**
   * <code>string max_redemption_rate = 14 [json_name = "maxRedemptionRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for maxRedemptionRate.
   */
  com.google.protobuf.ByteString
      getMaxRedemptionRateBytes();
}
