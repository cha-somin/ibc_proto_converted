// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/events.proto

package com.axelar.nexus.v1beta1;

public interface FeeDeductedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.nexus.v1beta1.FeeDeducted)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 transfer_id = 1 [json_name = "transferId", (.gogoproto.customname) = "TransferID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.TransferID"];</code>
   * @return The transferId.
   */
  long getTransferId();

  /**
   * <code>string recipient_chain = 2 [json_name = "recipientChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The recipientChain.
   */
  java.lang.String getRecipientChain();
  /**
   * <code>string recipient_chain = 2 [json_name = "recipientChain", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for recipientChain.
   */
  com.google.protobuf.ByteString
      getRecipientChainBytes();

  /**
   * <code>string recipient_address = 3 [json_name = "recipientAddress"];</code>
   * @return The recipientAddress.
   */
  java.lang.String getRecipientAddress();
  /**
   * <code>string recipient_address = 3 [json_name = "recipientAddress"];</code>
   * @return The bytes for recipientAddress.
   */
  com.google.protobuf.ByteString
      getRecipientAddressBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();

  /**
   * <code>.cosmos.base.v1beta1.Coin fee = 5 [json_name = "fee", (.gogoproto.nullable) = false];</code>
   * @return Whether the fee field is set.
   */
  boolean hasFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin fee = 5 [json_name = "fee", (.gogoproto.nullable) = false];</code>
   * @return The fee.
   */
  com.cosmos.base.v1beta1.Coin getFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin fee = 5 [json_name = "fee", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getFeeOrBuilder();
}
