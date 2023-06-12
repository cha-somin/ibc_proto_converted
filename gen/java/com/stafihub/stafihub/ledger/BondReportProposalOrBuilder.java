// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/proposal.proto

package com.stafihub.stafihub.ledger;

public interface BondReportProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.ledger.BondReportProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string proposer = 1 [json_name = "proposer"];</code>
   * @return The proposer.
   */
  java.lang.String getProposer();
  /**
   * <code>string proposer = 1 [json_name = "proposer"];</code>
   * @return The bytes for proposer.
   */
  com.google.protobuf.ByteString
      getProposerBytes();

  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string shotId = 3 [json_name = "shotId"];</code>
   * @return The shotId.
   */
  java.lang.String getShotId();
  /**
   * <code>string shotId = 3 [json_name = "shotId"];</code>
   * @return The bytes for shotId.
   */
  com.google.protobuf.ByteString
      getShotIdBytes();

  /**
   * <code>.stafihub.stafihub.ledger.BondAction action = 4 [json_name = "action"];</code>
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   * <code>.stafihub.stafihub.ledger.BondAction action = 4 [json_name = "action"];</code>
   * @return The action.
   */
  com.stafihub.stafihub.ledger.BondAction getAction();

  /**
   * <code>string propId = 5 [json_name = "propId"];</code>
   * @return The propId.
   */
  java.lang.String getPropId();
  /**
   * <code>string propId = 5 [json_name = "propId"];</code>
   * @return The bytes for propId.
   */
  com.google.protobuf.ByteString
      getPropIdBytes();
}
