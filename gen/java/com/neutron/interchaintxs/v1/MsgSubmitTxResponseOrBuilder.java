// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/interchaintxs/v1/tx.proto

package com.neutron.interchaintxs.v1;

public interface MsgSubmitTxResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:neutron.interchaintxs.v1.MsgSubmitTxResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * channel's sequence_id for outgoing ibc packet. Unique per a channel.
   * </pre>
   *
   * <code>uint64 sequence_id = 1 [json_name = "sequenceId"];</code>
   * @return The sequenceId.
   */
  long getSequenceId();

  /**
   * <pre>
   * channel src channel on neutron side trasaction was submitted from
   * </pre>
   *
   * <code>string channel = 2 [json_name = "channel"];</code>
   * @return The channel.
   */
  java.lang.String getChannel();
  /**
   * <pre>
   * channel src channel on neutron side trasaction was submitted from
   * </pre>
   *
   * <code>string channel = 2 [json_name = "channel"];</code>
   * @return The bytes for channel.
   */
  com.google.protobuf.ByteString
      getChannelBytes();
}
