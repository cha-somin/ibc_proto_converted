// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package com.ibc.core.channel.v1;

public interface MsgChannelCloseInitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.MsgChannelCloseInit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string port_id = 1 [json_name = "portId"];</code>
   * @return The portId.
   */
  java.lang.String getPortId();
  /**
   * <code>string port_id = 1 [json_name = "portId"];</code>
   * @return The bytes for portId.
   */
  com.google.protobuf.ByteString
      getPortIdBytes();

  /**
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   * @return The channelId.
   */
  java.lang.String getChannelId();
  /**
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
