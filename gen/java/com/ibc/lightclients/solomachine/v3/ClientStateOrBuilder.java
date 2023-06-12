// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v3/solomachine.proto

package com.ibc.lightclients.solomachine.v3;

public interface ClientStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.solomachine.v3.ClientState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * latest sequence of the client state
   * </pre>
   *
   * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  long getSequence();

  /**
   * <pre>
   * frozen sequence of the solo machine
   * </pre>
   *
   * <code>bool is_frozen = 2 [json_name = "isFrozen"];</code>
   * @return The isFrozen.
   */
  boolean getIsFrozen();

  /**
   * <code>.ibc.lightclients.solomachine.v3.ConsensusState consensus_state = 3 [json_name = "consensusState"];</code>
   * @return Whether the consensusState field is set.
   */
  boolean hasConsensusState();
  /**
   * <code>.ibc.lightclients.solomachine.v3.ConsensusState consensus_state = 3 [json_name = "consensusState"];</code>
   * @return The consensusState.
   */
  com.ibc.lightclients.solomachine.v3.ConsensusState getConsensusState();
  /**
   * <code>.ibc.lightclients.solomachine.v3.ConsensusState consensus_state = 3 [json_name = "consensusState"];</code>
   */
  com.ibc.lightclients.solomachine.v3.ConsensusStateOrBuilder getConsensusStateOrBuilder();
}
