// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package com.ibc.core.channel.v1;

public interface MsgAcknowledgementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.MsgAcknowledgement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
   * @return Whether the packet field is set.
   */
  boolean hasPacket();
  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
   * @return The packet.
   */
  com.ibc.core.channel.v1.Packet getPacket();
  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.channel.v1.PacketOrBuilder getPacketOrBuilder();

  /**
   * <code>bytes acknowledgement = 2 [json_name = "acknowledgement"];</code>
   * @return The acknowledgement.
   */
  com.google.protobuf.ByteString getAcknowledgement();

  /**
   * <code>bytes proof_acked = 3 [json_name = "proofAcked"];</code>
   * @return The proofAcked.
   */
  com.google.protobuf.ByteString getProofAcked();

  /**
   * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   * @return Whether the proofHeight field is set.
   */
  boolean hasProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   * @return The proofHeight.
   */
  com.ibc.core.client.v1.Height getProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder();

  /**
   * <code>string signer = 5 [json_name = "signer"];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <code>string signer = 5 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
