// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/dfract/tx.proto

package com.lum.network.dfract;

public interface MsgDepositOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lum.network.dfract.MsgDeposit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
   * @return The depositorAddress.
   */
  java.lang.String getDepositorAddress();
  /**
   * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
   * @return The bytes for depositorAddress.
   */
  com.google.protobuf.ByteString
      getDepositorAddressBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();
}
