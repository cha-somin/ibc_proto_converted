// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/reward/v1beta1/tx.proto

package com.axelar.reward.v1beta1;

public interface RefundMsgRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.reward.v1beta1.RefundMsgRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  com.google.protobuf.ByteString getSender();

  /**
   * <code>.google.protobuf.Any inner_message = 2 [json_name = "innerMessage", (.cosmos_proto.accepts_interface) = "Refundable"];</code>
   * @return Whether the innerMessage field is set.
   */
  boolean hasInnerMessage();
  /**
   * <code>.google.protobuf.Any inner_message = 2 [json_name = "innerMessage", (.cosmos_proto.accepts_interface) = "Refundable"];</code>
   * @return The innerMessage.
   */
  com.google.protobuf.Any getInnerMessage();
  /**
   * <code>.google.protobuf.Any inner_message = 2 [json_name = "innerMessage", (.cosmos_proto.accepts_interface) = "Refundable"];</code>
   */
  com.google.protobuf.AnyOrBuilder getInnerMessageOrBuilder();
}
