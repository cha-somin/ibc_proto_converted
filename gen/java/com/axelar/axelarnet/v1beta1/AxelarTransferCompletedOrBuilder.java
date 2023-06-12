// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/axelarnet/v1beta1/events.proto

package com.axelar.axelarnet.v1beta1;

public interface AxelarTransferCompletedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.axelarnet.v1beta1.AxelarTransferCompleted)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1 [json_name = "id", (.gogoproto.customname) = "ID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.TransferID"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string receipient = 2 [json_name = "receipient", deprecated = true];</code>
   * @deprecated axelar.axelarnet.v1beta1.AxelarTransferCompleted.receipient is deprecated.
   *     See axelar/axelarnet/v1beta1/events.proto;l=66
   * @return The receipient.
   */
  @java.lang.Deprecated java.lang.String getReceipient();
  /**
   * <code>string receipient = 2 [json_name = "receipient", deprecated = true];</code>
   * @deprecated axelar.axelarnet.v1beta1.AxelarTransferCompleted.receipient is deprecated.
   *     See axelar/axelarnet/v1beta1/events.proto;l=66
   * @return The bytes for receipient.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getReceipientBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin asset = 3 [json_name = "asset", (.gogoproto.nullable) = false];</code>
   * @return Whether the asset field is set.
   */
  boolean hasAsset();
  /**
   * <code>.cosmos.base.v1beta1.Coin asset = 3 [json_name = "asset", (.gogoproto.nullable) = false];</code>
   * @return The asset.
   */
  com.cosmos.base.v1beta1.Coin getAsset();
  /**
   * <code>.cosmos.base.v1beta1.Coin asset = 3 [json_name = "asset", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAssetOrBuilder();

  /**
   * <code>string recipient = 4 [json_name = "recipient"];</code>
   * @return The recipient.
   */
  java.lang.String getRecipient();
  /**
   * <code>string recipient = 4 [json_name = "recipient"];</code>
   * @return The bytes for recipient.
   */
  com.google.protobuf.ByteString
      getRecipientBytes();
}
