// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package com.tendermint.abci;

public interface ResponsePrepareProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.abci.ResponsePrepareProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
   * @return A list containing the txs.
   */
  java.util.List<com.google.protobuf.ByteString> getTxsList();
  /**
   * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
   * @return The count of txs.
   */
  int getTxsCount();
  /**
   * <code>repeated bytes txs = 1 [json_name = "txs"];</code>
   * @param index The index of the element to return.
   * @return The txs at the given index.
   */
  com.google.protobuf.ByteString getTxs(int index);
}
