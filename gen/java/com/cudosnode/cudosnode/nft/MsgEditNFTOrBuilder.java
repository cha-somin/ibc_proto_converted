// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/nft/tx.proto

package com.cudosnode.cudosnode.nft;

public interface MsgEditNFTOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cudosnode.cudosnode.nft.MsgEditNFT)
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
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string uri = 4 [json_name = "uri", (.gogoproto.customname) = "URI"];</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <code>string uri = 4 [json_name = "uri", (.gogoproto.customname) = "URI"];</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <code>string data = 5 [json_name = "data"];</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 5 [json_name = "data"];</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <code>string sender = 6 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 6 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>string contractAddressSigner = 7 [json_name = "contractAddressSigner"];</code>
   * @return The contractAddressSigner.
   */
  java.lang.String getContractAddressSigner();
  /**
   * <code>string contractAddressSigner = 7 [json_name = "contractAddressSigner"];</code>
   * @return The bytes for contractAddressSigner.
   */
  com.google.protobuf.ByteString
      getContractAddressSignerBytes();
}
