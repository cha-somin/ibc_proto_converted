// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/models_dtag_requests.proto

package com.desmos.profiles.v3;

public interface DTagTransferRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.profiles.v3.DTagTransferRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DTagToTrade contains the value of the DTag that should be transferred from
   * the receiver of the request to the sender
   * </pre>
   *
   * <code>string dtag_to_trade = 1 [json_name = "dtagToTrade", (.gogoproto.customname) = "DTagToTrade", (.gogoproto.moretags) = "yaml:&#92;"dtag_to_trade&#92;""];</code>
   * @return The dtagToTrade.
   */
  java.lang.String getDtagToTrade();
  /**
   * <pre>
   * DTagToTrade contains the value of the DTag that should be transferred from
   * the receiver of the request to the sender
   * </pre>
   *
   * <code>string dtag_to_trade = 1 [json_name = "dtagToTrade", (.gogoproto.customname) = "DTagToTrade", (.gogoproto.moretags) = "yaml:&#92;"dtag_to_trade&#92;""];</code>
   * @return The bytes for dtagToTrade.
   */
  com.google.protobuf.ByteString
      getDtagToTradeBytes();

  /**
   * <pre>
   * Sender represents the address of the account that sent the request
   * </pre>
   *
   * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <pre>
   * Sender represents the address of the account that sent the request
   * </pre>
   *
   * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <pre>
   * Receiver represents the receiver of the request that, if accepted, will
   * give to the sender their DTag
   * </pre>
   *
   * <code>string receiver = 3 [json_name = "receiver", (.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
   * @return The receiver.
   */
  java.lang.String getReceiver();
  /**
   * <pre>
   * Receiver represents the receiver of the request that, if accepted, will
   * give to the sender their DTag
   * </pre>
   *
   * <code>string receiver = 3 [json_name = "receiver", (.gogoproto.moretags) = "yaml:&#92;"receiver&#92;""];</code>
   * @return The bytes for receiver.
   */
  com.google.protobuf.ByteString
      getReceiverBytes();
}
