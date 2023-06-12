// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package com.ibc.lightclients.solomachine.v2;

public interface ClientStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.solomachine.v2.ClientState)
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
   * <code>.ibc.lightclients.solomachine.v2.ConsensusState consensus_state = 3 [json_name = "consensusState"];</code>
   * @return Whether the consensusState field is set.
   */
  boolean hasConsensusState();
  /**
   * <code>.ibc.lightclients.solomachine.v2.ConsensusState consensus_state = 3 [json_name = "consensusState"];</code>
   * @return The consensusState.
   */
  com.ibc.lightclients.solomachine.v2.ConsensusState getConsensusState();
  /**
   * <code>.ibc.lightclients.solomachine.v2.ConsensusState consensus_state = 3 [json_name = "consensusState"];</code>
   */
  com.ibc.lightclients.solomachine.v2.ConsensusStateOrBuilder getConsensusStateOrBuilder();

  /**
   * <pre>
   * when set to true, will allow governance to update a solo machine client.
   * The client will be unfrozen if it is frozen.
   * </pre>
   *
   * <code>bool allow_update_after_proposal = 4 [json_name = "allowUpdateAfterProposal"];</code>
   * @return The allowUpdateAfterProposal.
   */
  boolean getAllowUpdateAfterProposal();
}
