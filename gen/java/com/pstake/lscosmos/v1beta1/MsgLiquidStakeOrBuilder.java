// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pstake/lscosmos/v1beta1/msgs.proto

package com.pstake.lscosmos.v1beta1;

public interface MsgLiquidStakeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pstake.lscosmos.v1beta1.MsgLiquidStake)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The delegatorAddress.
   */
  java.lang.String getDelegatorAddress();
  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for delegatorAddress.
   */
  com.google.protobuf.ByteString
      getDelegatorAddressBytes();

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
