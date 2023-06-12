// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package com.tendermint.abci;

public interface RequestPrepareProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.abci.RequestPrepareProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the modified transactions cannot exceed this size.
   * </pre>
   *
   * <code>int64 max_tx_bytes = 1 [json_name = "maxTxBytes"];</code>
   * @return The maxTxBytes.
   */
  long getMaxTxBytes();

  /**
   * <pre>
   * txs is an array of transactions that will be included in a block,
   * sent to the app for possible modifications.
   * </pre>
   *
   * <code>repeated bytes txs = 2 [json_name = "txs"];</code>
   * @return A list containing the txs.
   */
  java.util.List<com.google.protobuf.ByteString> getTxsList();
  /**
   * <pre>
   * txs is an array of transactions that will be included in a block,
   * sent to the app for possible modifications.
   * </pre>
   *
   * <code>repeated bytes txs = 2 [json_name = "txs"];</code>
   * @return The count of txs.
   */
  int getTxsCount();
  /**
   * <pre>
   * txs is an array of transactions that will be included in a block,
   * sent to the app for possible modifications.
   * </pre>
   *
   * <code>repeated bytes txs = 2 [json_name = "txs"];</code>
   * @param index The index of the element to return.
   * @return The txs at the given index.
   */
  com.google.protobuf.ByteString getTxs(int index);

  /**
   * <code>.tendermint.abci.ExtendedCommitInfo local_last_commit = 3 [json_name = "localLastCommit", (.gogoproto.nullable) = false];</code>
   * @return Whether the localLastCommit field is set.
   */
  boolean hasLocalLastCommit();
  /**
   * <code>.tendermint.abci.ExtendedCommitInfo local_last_commit = 3 [json_name = "localLastCommit", (.gogoproto.nullable) = false];</code>
   * @return The localLastCommit.
   */
  com.tendermint.abci.ExtendedCommitInfo getLocalLastCommit();
  /**
   * <code>.tendermint.abci.ExtendedCommitInfo local_last_commit = 3 [json_name = "localLastCommit", (.gogoproto.nullable) = false];</code>
   */
  com.tendermint.abci.ExtendedCommitInfoOrBuilder getLocalLastCommitOrBuilder();

  /**
   * <code>repeated .tendermint.abci.Misbehavior misbehavior = 4 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.tendermint.abci.Misbehavior> 
      getMisbehaviorList();
  /**
   * <code>repeated .tendermint.abci.Misbehavior misbehavior = 4 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
   */
  com.tendermint.abci.Misbehavior getMisbehavior(int index);
  /**
   * <code>repeated .tendermint.abci.Misbehavior misbehavior = 4 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
   */
  int getMisbehaviorCount();
  /**
   * <code>repeated .tendermint.abci.Misbehavior misbehavior = 4 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.tendermint.abci.MisbehaviorOrBuilder> 
      getMisbehaviorOrBuilderList();
  /**
   * <code>repeated .tendermint.abci.Misbehavior misbehavior = 4 [json_name = "misbehavior", (.gogoproto.nullable) = false];</code>
   */
  com.tendermint.abci.MisbehaviorOrBuilder getMisbehaviorOrBuilder(
      int index);

  /**
   * <code>int64 height = 5 [json_name = "height"];</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <code>.google.protobuf.Timestamp time = 6 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 6 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 6 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>bytes next_validators_hash = 7 [json_name = "nextValidatorsHash"];</code>
   * @return The nextValidatorsHash.
   */
  com.google.protobuf.ByteString getNextValidatorsHash();

  /**
   * <pre>
   * address of the public key of the validator proposing the block.
   * </pre>
   *
   * <code>bytes proposer_address = 8 [json_name = "proposerAddress"];</code>
   * @return The proposerAddress.
   */
  com.google.protobuf.ByteString getProposerAddress();
}
