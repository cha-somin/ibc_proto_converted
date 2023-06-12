// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/tx.proto

package com.ibc.core.connection.v1;

public interface MsgConnectionOpenInitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.MsgConnectionOpenInit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return Whether the counterparty field is set.
   */
  boolean hasCounterparty();
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return The counterparty.
   */
  com.ibc.core.connection.v1.Counterparty getCounterparty();
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 2 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.connection.v1.CounterpartyOrBuilder getCounterpartyOrBuilder();

  /**
   * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
   * @return The version.
   */
  com.ibc.core.connection.v1.Version getVersion();
  /**
   * <code>.ibc.core.connection.v1.Version version = 3 [json_name = "version"];</code>
   */
  com.ibc.core.connection.v1.VersionOrBuilder getVersionOrBuilder();

  /**
   * <code>uint64 delay_period = 4 [json_name = "delayPeriod"];</code>
   * @return The delayPeriod.
   */
  long getDelayPeriod();

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
