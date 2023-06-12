// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

public interface MsgDepositOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.MsgDeposit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <pre>
   * (Optional) bytes32 subaccount ID to deposit funds into. If empty, the coin
   * will be deposited to the sender's default subaccount address.
   * </pre>
   *
   * <code>string subaccount_id = 2 [json_name = "subaccountId"];</code>
   * @return The subaccountId.
   */
  java.lang.String getSubaccountId();
  /**
   * <pre>
   * (Optional) bytes32 subaccount ID to deposit funds into. If empty, the coin
   * will be deposited to the sender's default subaccount address.
   * </pre>
   *
   * <code>string subaccount_id = 2 [json_name = "subaccountId"];</code>
   * @return The bytes for subaccountId.
   */
  com.google.protobuf.ByteString
      getSubaccountIdBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();
}
