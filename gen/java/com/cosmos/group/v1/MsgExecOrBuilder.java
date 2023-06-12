// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/tx.proto

package com.cosmos.group.v1;

public interface MsgExecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.group.v1.MsgExec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * proposal is the unique ID of the proposal.
   * </pre>
   *
   * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
   * @return The proposalId.
   */
  long getProposalId();

  /**
   * <pre>
   * executor is the account address used to execute the proposal.
   * </pre>
   *
   * <code>string executor = 2 [json_name = "executor", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The executor.
   */
  java.lang.String getExecutor();
  /**
   * <pre>
   * executor is the account address used to execute the proposal.
   * </pre>
   *
   * <code>string executor = 2 [json_name = "executor", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for executor.
   */
  com.google.protobuf.ByteString
      getExecutorBytes();
}
