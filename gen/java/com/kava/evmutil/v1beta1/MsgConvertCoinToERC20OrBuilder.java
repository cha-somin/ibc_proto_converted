// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/evmutil/v1beta1/tx.proto

package com.kava.evmutil.v1beta1;

public interface MsgConvertCoinToERC20OrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.evmutil.v1beta1.MsgConvertCoinToERC20)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Kava bech32 address initiating the conversion.
   * </pre>
   *
   * <code>string initiator = 1 [json_name = "initiator", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The initiator.
   */
  java.lang.String getInitiator();
  /**
   * <pre>
   * Kava bech32 address initiating the conversion.
   * </pre>
   *
   * <code>string initiator = 1 [json_name = "initiator", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for initiator.
   */
  com.google.protobuf.ByteString
      getInitiatorBytes();

  /**
   * <pre>
   * EVM 0x hex address that will receive the converted Kava ERC20 tokens.
   * </pre>
   *
   * <code>string receiver = 2 [json_name = "receiver"];</code>
   * @return The receiver.
   */
  java.lang.String getReceiver();
  /**
   * <pre>
   * EVM 0x hex address that will receive the converted Kava ERC20 tokens.
   * </pre>
   *
   * <code>string receiver = 2 [json_name = "receiver"];</code>
   * @return The bytes for receiver.
   */
  com.google.protobuf.ByteString
      getReceiverBytes();

  /**
   * <pre>
   * Amount is the sdk.Coin amount to convert.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount"];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <pre>
   * Amount is the sdk.Coin amount to convert.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount"];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <pre>
   * Amount is the sdk.Coin amount to convert.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();
}
