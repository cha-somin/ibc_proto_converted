// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/node/v1/node.proto

package com.sentinel.node.v1;

public interface NodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sentinel.node.v1.Node)
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
   * <code>string provider = 2 [json_name = "provider"];</code>
   * @return The provider.
   */
  java.lang.String getProvider();
  /**
   * <code>string provider = 2 [json_name = "provider"];</code>
   * @return The bytes for provider.
   */
  com.google.protobuf.ByteString
      getProviderBytes();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getPriceList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getPrice(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getPriceCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getPriceOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getPriceOrBuilder(
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
   * <code>.sentinel.types.v1.Status status = 5 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.sentinel.types.v1.Status status = 5 [json_name = "status"];</code>
   * @return The status.
   */
  com.sentinel.types.v1.Status getStatus();

  /**
   * <code>.google.protobuf.Timestamp status_at = 6 [json_name = "statusAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the statusAt field is set.
   */
  boolean hasStatusAt();
  /**
   * <code>.google.protobuf.Timestamp status_at = 6 [json_name = "statusAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The statusAt.
   */
  com.google.protobuf.Timestamp getStatusAt();
  /**
   * <code>.google.protobuf.Timestamp status_at = 6 [json_name = "statusAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStatusAtOrBuilder();
}
