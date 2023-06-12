// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/tx.proto

package com.provenance.marker.v1;

public interface MsgUpdateForcedTransferRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.marker.v1.MsgUpdateForcedTransferRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The denomination of the marker to update.
   * </pre>
   *
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <pre>
   * The denomination of the marker to update.
   * </pre>
   *
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <pre>
   * Whether an admin can transfer restricted coins from a 3rd-party account without their signature.
   * </pre>
   *
   * <code>bool allow_forced_transfer = 2 [json_name = "allowForcedTransfer"];</code>
   * @return The allowForcedTransfer.
   */
  boolean getAllowForcedTransfer();

  /**
   * <pre>
   * The signer of this message. Must be the governance module account address.
   * </pre>
   *
   * <code>string authority = 3 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * The signer of this message. Must be the governance module account address.
   * </pre>
   *
   * <code>string authority = 3 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();
}
