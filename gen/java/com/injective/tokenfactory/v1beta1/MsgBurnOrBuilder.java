// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/tokenfactory/v1beta1/tx.proto

package com.injective.tokenfactory.v1beta1;

public interface MsgBurnOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.tokenfactory.v1beta1.MsgBurn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();
}
