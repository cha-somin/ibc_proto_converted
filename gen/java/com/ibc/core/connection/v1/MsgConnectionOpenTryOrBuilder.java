// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/tx.proto

package com.ibc.core.connection.v1;

public interface MsgConnectionOpenTryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.MsgConnectionOpenTry)
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
   * <pre>
   * Deprecated: this field is unused. Crossing hellos are no longer supported in core IBC.
   * </pre>
   *
   * <code>string previous_connection_id = 2 [json_name = "previousConnectionId", deprecated = true];</code>
   * @deprecated ibc.core.connection.v1.MsgConnectionOpenTry.previous_connection_id is deprecated.
   *     See ibc/core/connection/v1/tx.proto;l=57
   * @return The previousConnectionId.
   */
  @java.lang.Deprecated java.lang.String getPreviousConnectionId();
  /**
   * <pre>
   * Deprecated: this field is unused. Crossing hellos are no longer supported in core IBC.
   * </pre>
   *
   * <code>string previous_connection_id = 2 [json_name = "previousConnectionId", deprecated = true];</code>
   * @deprecated ibc.core.connection.v1.MsgConnectionOpenTry.previous_connection_id is deprecated.
   *     See ibc/core/connection/v1/tx.proto;l=57
   * @return The bytes for previousConnectionId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getPreviousConnectionIdBytes();

  /**
   * <code>.google.protobuf.Any client_state = 3 [json_name = "clientState"];</code>
   * @return Whether the clientState field is set.
   */
  boolean hasClientState();
  /**
   * <code>.google.protobuf.Any client_state = 3 [json_name = "clientState"];</code>
   * @return The clientState.
   */
  com.google.protobuf.Any getClientState();
  /**
   * <code>.google.protobuf.Any client_state = 3 [json_name = "clientState"];</code>
   */
  com.google.protobuf.AnyOrBuilder getClientStateOrBuilder();

  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return Whether the counterparty field is set.
   */
  boolean hasCounterparty();
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return The counterparty.
   */
  com.ibc.core.connection.v1.Counterparty getCounterparty();
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.connection.v1.CounterpartyOrBuilder getCounterpartyOrBuilder();

  /**
   * <code>uint64 delay_period = 5 [json_name = "delayPeriod"];</code>
   * @return The delayPeriod.
   */
  long getDelayPeriod();

  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [json_name = "counterpartyVersions"];</code>
   */
  java.util.List<com.ibc.core.connection.v1.Version> 
      getCounterpartyVersionsList();
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [json_name = "counterpartyVersions"];</code>
   */
  com.ibc.core.connection.v1.Version getCounterpartyVersions(int index);
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [json_name = "counterpartyVersions"];</code>
   */
  int getCounterpartyVersionsCount();
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [json_name = "counterpartyVersions"];</code>
   */
  java.util.List<? extends com.ibc.core.connection.v1.VersionOrBuilder> 
      getCounterpartyVersionsOrBuilderList();
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [json_name = "counterpartyVersions"];</code>
   */
  com.ibc.core.connection.v1.VersionOrBuilder getCounterpartyVersionsOrBuilder(
      int index);

  /**
   * <code>.ibc.core.client.v1.Height proof_height = 7 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   * @return Whether the proofHeight field is set.
   */
  boolean hasProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 7 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   * @return The proofHeight.
   */
  com.ibc.core.client.v1.Height getProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 7 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder();

  /**
   * <pre>
   * proof of the initialization the connection on Chain A: `UNITIALIZED -&gt;
   * INIT`
   * </pre>
   *
   * <code>bytes proof_init = 8 [json_name = "proofInit"];</code>
   * @return The proofInit.
   */
  com.google.protobuf.ByteString getProofInit();

  /**
   * <pre>
   * proof of client state included in message
   * </pre>
   *
   * <code>bytes proof_client = 9 [json_name = "proofClient"];</code>
   * @return The proofClient.
   */
  com.google.protobuf.ByteString getProofClient();

  /**
   * <pre>
   * proof of client consensus state
   * </pre>
   *
   * <code>bytes proof_consensus = 10 [json_name = "proofConsensus"];</code>
   * @return The proofConsensus.
   */
  com.google.protobuf.ByteString getProofConsensus();

  /**
   * <code>.ibc.core.client.v1.Height consensus_height = 11 [json_name = "consensusHeight", (.gogoproto.nullable) = false];</code>
   * @return Whether the consensusHeight field is set.
   */
  boolean hasConsensusHeight();
  /**
   * <code>.ibc.core.client.v1.Height consensus_height = 11 [json_name = "consensusHeight", (.gogoproto.nullable) = false];</code>
   * @return The consensusHeight.
   */
  com.ibc.core.client.v1.Height getConsensusHeight();
  /**
   * <code>.ibc.core.client.v1.Height consensus_height = 11 [json_name = "consensusHeight", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getConsensusHeightOrBuilder();

  /**
   * <code>string signer = 12 [json_name = "signer"];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <code>string signer = 12 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();

  /**
   * <pre>
   * optional proof data for host state machines that are unable to introspect their own consensus state
   * </pre>
   *
   * <code>bytes host_consensus_state_proof = 13 [json_name = "hostConsensusStateProof"];</code>
   * @return The hostConsensusStateProof.
   */
  com.google.protobuf.ByteString getHostConsensusStateProof();
}
