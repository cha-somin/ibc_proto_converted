// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/nft/tx.proto

package com.cudosnode.cudosnode.nft;

public interface MsgApproveNftOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cudosnode.cudosnode.nft.MsgApproveNft)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string denom_id = 2 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
   * @return The denomId.
   */
  java.lang.String getDenomId();
  /**
   * <code>string denom_id = 2 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
   * @return The bytes for denomId.
   */
  com.google.protobuf.ByteString
      getDenomIdBytes();

  /**
   * <code>string sender = 3 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 3 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>string approvedAddress = 4 [json_name = "approvedAddress"];</code>
   * @return The approvedAddress.
   */
  java.lang.String getApprovedAddress();
  /**
   * <code>string approvedAddress = 4 [json_name = "approvedAddress"];</code>
   * @return The bytes for approvedAddress.
   */
  com.google.protobuf.ByteString
      getApprovedAddressBytes();

  /**
   * <code>string contractAddressSigner = 5 [json_name = "contractAddressSigner"];</code>
   * @return The contractAddressSigner.
   */
  java.lang.String getContractAddressSigner();
  /**
   * <code>string contractAddressSigner = 5 [json_name = "contractAddressSigner"];</code>
   * @return The bytes for contractAddressSigner.
   */
  com.google.protobuf.ByteString
      getContractAddressSignerBytes();
}
