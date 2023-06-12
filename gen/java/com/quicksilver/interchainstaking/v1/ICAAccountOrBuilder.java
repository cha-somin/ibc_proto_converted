// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/interchainstaking/v1/interchainstaking.proto

package com.quicksilver.interchainstaking.v1;

public interface ICAAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:quicksilver.interchainstaking.v1.ICAAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * balance defines the different coins this balance holds.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getBalanceList();
  /**
   * <pre>
   * balance defines the different coins this balance holds.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getBalance(int index);
  /**
   * <pre>
   * balance defines the different coins this balance holds.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getBalanceCount();
  /**
   * <pre>
   * balance defines the different coins this balance holds.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getBalanceOrBuilderList();
  /**
   * <pre>
   * balance defines the different coins this balance holds.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin balance = 2 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getBalanceOrBuilder(
      int index);

  /**
   * <code>string port_name = 3 [json_name = "portName"];</code>
   * @return The portName.
   */
  java.lang.String getPortName();
  /**
   * <code>string port_name = 3 [json_name = "portName"];</code>
   * @return The bytes for portName.
   */
  com.google.protobuf.ByteString
      getPortNameBytes();

  /**
   * <code>string withdrawal_address = 4 [json_name = "withdrawalAddress"];</code>
   * @return The withdrawalAddress.
   */
  java.lang.String getWithdrawalAddress();
  /**
   * <code>string withdrawal_address = 4 [json_name = "withdrawalAddress"];</code>
   * @return The bytes for withdrawalAddress.
   */
  com.google.protobuf.ByteString
      getWithdrawalAddressBytes();

  /**
   * <code>uint32 balance_waitgroup = 5 [json_name = "balanceWaitgroup"];</code>
   * @return The balanceWaitgroup.
   */
  int getBalanceWaitgroup();
}
