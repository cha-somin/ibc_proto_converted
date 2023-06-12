// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/msgfees/v1/tx.proto

package com.provenance.msgfees.v1;

public interface MsgAssessCustomMsgFeeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.msgfees.v1.MsgAssessCustomMsgFeeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * optional short name for custom msg fee, this will be emitted as a property of the event
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * optional short name for custom msg fee, this will be emitted as a property of the event
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * amount of additional fee that must be paid
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <pre>
   * amount of additional fee that must be paid
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <pre>
   * amount of additional fee that must be paid
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();

  /**
   * <pre>
   * optional recipient address, the basis points amount is sent to the recipient
   * </pre>
   *
   * <code>string recipient = 3 [json_name = "recipient"];</code>
   * @return The recipient.
   */
  java.lang.String getRecipient();
  /**
   * <pre>
   * optional recipient address, the basis points amount is sent to the recipient
   * </pre>
   *
   * <code>string recipient = 3 [json_name = "recipient"];</code>
   * @return The bytes for recipient.
   */
  com.google.protobuf.ByteString
      getRecipientBytes();

  /**
   * <pre>
   * the signer of the msg
   * </pre>
   *
   * <code>string from = 4 [json_name = "from"];</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <pre>
   * the signer of the msg
   * </pre>
   *
   * <code>string from = 4 [json_name = "from"];</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <pre>
   * optional basis points 0 - 10,000 for recipient defaults to 10,000
   * </pre>
   *
   * <code>string recipient_basis_points = 5 [json_name = "recipientBasisPoints"];</code>
   * @return The recipientBasisPoints.
   */
  java.lang.String getRecipientBasisPoints();
  /**
   * <pre>
   * optional basis points 0 - 10,000 for recipient defaults to 10,000
   * </pre>
   *
   * <code>string recipient_basis_points = 5 [json_name = "recipientBasisPoints"];</code>
   * @return The bytes for recipientBasisPoints.
   */
  com.google.protobuf.ByteString
      getRecipientBasisPointsBytes();
}
