// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/burrow/payload.proto

package com.payload;

public interface AnyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:payload.Any)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.payload.CallTx CallTx = 1 [json_name = "CallTx"];</code>
   * @return Whether the callTx field is set.
   */
  boolean hasCallTx();
  /**
   * <code>.payload.CallTx CallTx = 1 [json_name = "CallTx"];</code>
   * @return The callTx.
   */
  com.payload.CallTx getCallTx();
  /**
   * <code>.payload.CallTx CallTx = 1 [json_name = "CallTx"];</code>
   */
  com.payload.CallTxOrBuilder getCallTxOrBuilder();

  /**
   * <code>.payload.SendTx SendTx = 2 [json_name = "SendTx"];</code>
   * @return Whether the sendTx field is set.
   */
  boolean hasSendTx();
  /**
   * <code>.payload.SendTx SendTx = 2 [json_name = "SendTx"];</code>
   * @return The sendTx.
   */
  com.payload.SendTx getSendTx();
  /**
   * <code>.payload.SendTx SendTx = 2 [json_name = "SendTx"];</code>
   */
  com.payload.SendTxOrBuilder getSendTxOrBuilder();

  /**
   * <code>.payload.NameTx NameTx = 3 [json_name = "NameTx"];</code>
   * @return Whether the nameTx field is set.
   */
  boolean hasNameTx();
  /**
   * <code>.payload.NameTx NameTx = 3 [json_name = "NameTx"];</code>
   * @return The nameTx.
   */
  com.payload.NameTx getNameTx();
  /**
   * <code>.payload.NameTx NameTx = 3 [json_name = "NameTx"];</code>
   */
  com.payload.NameTxOrBuilder getNameTxOrBuilder();

  /**
   * <code>.payload.PermsTx PermsTx = 4 [json_name = "PermsTx"];</code>
   * @return Whether the permsTx field is set.
   */
  boolean hasPermsTx();
  /**
   * <code>.payload.PermsTx PermsTx = 4 [json_name = "PermsTx"];</code>
   * @return The permsTx.
   */
  com.payload.PermsTx getPermsTx();
  /**
   * <code>.payload.PermsTx PermsTx = 4 [json_name = "PermsTx"];</code>
   */
  com.payload.PermsTxOrBuilder getPermsTxOrBuilder();

  /**
   * <code>.payload.GovTx GovTx = 5 [json_name = "GovTx"];</code>
   * @return Whether the govTx field is set.
   */
  boolean hasGovTx();
  /**
   * <code>.payload.GovTx GovTx = 5 [json_name = "GovTx"];</code>
   * @return The govTx.
   */
  com.payload.GovTx getGovTx();
  /**
   * <code>.payload.GovTx GovTx = 5 [json_name = "GovTx"];</code>
   */
  com.payload.GovTxOrBuilder getGovTxOrBuilder();

  /**
   * <code>.payload.BondTx BondTx = 6 [json_name = "BondTx"];</code>
   * @return Whether the bondTx field is set.
   */
  boolean hasBondTx();
  /**
   * <code>.payload.BondTx BondTx = 6 [json_name = "BondTx"];</code>
   * @return The bondTx.
   */
  com.payload.BondTx getBondTx();
  /**
   * <code>.payload.BondTx BondTx = 6 [json_name = "BondTx"];</code>
   */
  com.payload.BondTxOrBuilder getBondTxOrBuilder();

  /**
   * <code>.payload.UnbondTx UnbondTx = 7 [json_name = "UnbondTx"];</code>
   * @return Whether the unbondTx field is set.
   */
  boolean hasUnbondTx();
  /**
   * <code>.payload.UnbondTx UnbondTx = 7 [json_name = "UnbondTx"];</code>
   * @return The unbondTx.
   */
  com.payload.UnbondTx getUnbondTx();
  /**
   * <code>.payload.UnbondTx UnbondTx = 7 [json_name = "UnbondTx"];</code>
   */
  com.payload.UnbondTxOrBuilder getUnbondTxOrBuilder();

  /**
   * <code>.payload.BatchTx BatchTx = 8 [json_name = "BatchTx"];</code>
   * @return Whether the batchTx field is set.
   */
  boolean hasBatchTx();
  /**
   * <code>.payload.BatchTx BatchTx = 8 [json_name = "BatchTx"];</code>
   * @return The batchTx.
   */
  com.payload.BatchTx getBatchTx();
  /**
   * <code>.payload.BatchTx BatchTx = 8 [json_name = "BatchTx"];</code>
   */
  com.payload.BatchTxOrBuilder getBatchTxOrBuilder();

  /**
   * <code>.payload.ProposalTx ProposalTx = 9 [json_name = "ProposalTx"];</code>
   * @return Whether the proposalTx field is set.
   */
  boolean hasProposalTx();
  /**
   * <code>.payload.ProposalTx ProposalTx = 9 [json_name = "ProposalTx"];</code>
   * @return The proposalTx.
   */
  com.payload.ProposalTx getProposalTx();
  /**
   * <code>.payload.ProposalTx ProposalTx = 9 [json_name = "ProposalTx"];</code>
   */
  com.payload.ProposalTxOrBuilder getProposalTxOrBuilder();

  /**
   * <code>.payload.IdentifyTx IdentifyTx = 10 [json_name = "IdentifyTx"];</code>
   * @return Whether the identifyTx field is set.
   */
  boolean hasIdentifyTx();
  /**
   * <code>.payload.IdentifyTx IdentifyTx = 10 [json_name = "IdentifyTx"];</code>
   * @return The identifyTx.
   */
  com.payload.IdentifyTx getIdentifyTx();
  /**
   * <code>.payload.IdentifyTx IdentifyTx = 10 [json_name = "IdentifyTx"];</code>
   */
  com.payload.IdentifyTxOrBuilder getIdentifyTxOrBuilder();
}
