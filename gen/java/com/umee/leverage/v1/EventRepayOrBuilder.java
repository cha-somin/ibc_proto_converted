// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/leverage/v1/events.proto

package com.umee.leverage.v1;

public interface EventRepayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.leverage.v1.EventRepay)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Borrower bech32 address.
   * </pre>
   *
   * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The borrower.
   */
  java.lang.String getBorrower();
  /**
   * <pre>
   * Borrower bech32 address.
   * </pre>
   *
   * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for borrower.
   */
  com.google.protobuf.ByteString
      getBorrowerBytes();

  /**
   * <pre>
   * Asset repaid
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin repaid = 2 [json_name = "repaid", (.gogoproto.nullable) = false];</code>
   * @return Whether the repaid field is set.
   */
  boolean hasRepaid();
  /**
   * <pre>
   * Asset repaid
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin repaid = 2 [json_name = "repaid", (.gogoproto.nullable) = false];</code>
   * @return The repaid.
   */
  com.cosmos.base.v1beta1.Coin getRepaid();
  /**
   * <pre>
   * Asset repaid
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin repaid = 2 [json_name = "repaid", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getRepaidOrBuilder();
}
