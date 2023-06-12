// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/events.proto

package com.axelar.evm.v1beta1;

@java.lang.Deprecated public interface ConfirmGatewayTxStartedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.evm.v1beta1.ConfirmGatewayTxStarted)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes tx_id = 1 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
   * @return The txId.
   */
  com.google.protobuf.ByteString getTxId();

  /**
   * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The chain.
   */
  java.lang.String getChain();
  /**
   * <code>string chain = 2 [json_name = "chain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for chain.
   */
  com.google.protobuf.ByteString
      getChainBytes();

  /**
   * <code>bytes gateway_address = 3 [json_name = "gatewayAddress", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
   * @return The gatewayAddress.
   */
  com.google.protobuf.ByteString getGatewayAddress();

  /**
   * <code>uint64 confirmation_height = 4 [json_name = "confirmationHeight"];</code>
   * @return The confirmationHeight.
   */
  long getConfirmationHeight();

  /**
   * <code>.axelar.vote.exported.v1beta1.PollParticipants participants = 5 [json_name = "participants", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   * @return Whether the participants field is set.
   */
  boolean hasParticipants();
  /**
   * <code>.axelar.vote.exported.v1beta1.PollParticipants participants = 5 [json_name = "participants", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   * @return The participants.
   */
  com.axelar.vote.exported.v1beta1.PollParticipants getParticipants();
  /**
   * <code>.axelar.vote.exported.v1beta1.PollParticipants participants = 5 [json_name = "participants", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  com.axelar.vote.exported.v1beta1.PollParticipantsOrBuilder getParticipantsOrBuilder();
}
