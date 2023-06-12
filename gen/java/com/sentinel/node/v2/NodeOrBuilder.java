// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/node/v2/node.proto

package com.sentinel.node.v2;

public interface NodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sentinel.node.v2.Node)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin gigabyte_prices = 2 [json_name = "gigabytePrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getGigabytePricesList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin gigabyte_prices = 2 [json_name = "gigabytePrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getGigabytePrices(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin gigabyte_prices = 2 [json_name = "gigabytePrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getGigabytePricesCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin gigabyte_prices = 2 [json_name = "gigabytePrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getGigabytePricesOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin gigabyte_prices = 2 [json_name = "gigabytePrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getGigabytePricesOrBuilder(
      int index);

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin hourly_prices = 3 [json_name = "hourlyPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getHourlyPricesList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin hourly_prices = 3 [json_name = "hourlyPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getHourlyPrices(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin hourly_prices = 3 [json_name = "hourlyPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getHourlyPricesCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin hourly_prices = 3 [json_name = "hourlyPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getHourlyPricesOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin hourly_prices = 3 [json_name = "hourlyPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getHourlyPricesOrBuilder(
      int index);

  /**
   * <code>string remote_url = 4 [json_name = "remoteUrl", (.gogoproto.customname) = "RemoteURL"];</code>
   * @return The remoteUrl.
   */
  java.lang.String getRemoteUrl();
  /**
   * <code>string remote_url = 4 [json_name = "remoteUrl", (.gogoproto.customname) = "RemoteURL"];</code>
   * @return The bytes for remoteUrl.
   */
  com.google.protobuf.ByteString
      getRemoteUrlBytes();

  /**
   * <code>.google.protobuf.Timestamp expiry_at = 5 [json_name = "expiryAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the expiryAt field is set.
   */
  boolean hasExpiryAt();
  /**
   * <code>.google.protobuf.Timestamp expiry_at = 5 [json_name = "expiryAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The expiryAt.
   */
  com.google.protobuf.Timestamp getExpiryAt();
  /**
   * <code>.google.protobuf.Timestamp expiry_at = 5 [json_name = "expiryAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpiryAtOrBuilder();

  /**
   * <code>.sentinel.types.v1.Status status = 6 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.sentinel.types.v1.Status status = 6 [json_name = "status"];</code>
   * @return The status.
   */
  com.sentinel.types.v1.Status getStatus();

  /**
   * <code>.google.protobuf.Timestamp status_at = 7 [json_name = "statusAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the statusAt field is set.
   */
  boolean hasStatusAt();
  /**
   * <code>.google.protobuf.Timestamp status_at = 7 [json_name = "statusAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The statusAt.
   */
  com.google.protobuf.Timestamp getStatusAt();
  /**
   * <code>.google.protobuf.Timestamp status_at = 7 [json_name = "statusAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStatusAtOrBuilder();
}
