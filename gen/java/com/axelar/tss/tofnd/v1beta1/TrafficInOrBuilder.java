// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/tss/tofnd/v1beta1/tofnd.proto

package com.axelar.tss.tofnd.v1beta1;

public interface TrafficInOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.tss.tofnd.v1beta1.TrafficIn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from_party_uid = 1 [json_name = "fromPartyUid"];</code>
   * @return The fromPartyUid.
   */
  java.lang.String getFromPartyUid();
  /**
   * <code>string from_party_uid = 1 [json_name = "fromPartyUid"];</code>
   * @return The bytes for fromPartyUid.
   */
  com.google.protobuf.ByteString
      getFromPartyUidBytes();

  /**
   * <code>bytes payload = 2 [json_name = "payload"];</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>bool is_broadcast = 3 [json_name = "isBroadcast"];</code>
   * @return The isBroadcast.
   */
  boolean getIsBroadcast();
}
