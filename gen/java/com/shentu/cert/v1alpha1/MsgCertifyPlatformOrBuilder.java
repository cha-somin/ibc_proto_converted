// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/cert/v1alpha1/tx.proto

package com.shentu.cert.v1alpha1;

public interface MsgCertifyPlatformOrBuilder extends
    // @@protoc_insertion_point(interface_extends:shentu.cert.v1alpha1.MsgCertifyPlatform)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string certifier = 1 [json_name = "certifier", (.gogoproto.moretags) = "yaml:&#92;"certifier&#92;""];</code>
   * @return The certifier.
   */
  java.lang.String getCertifier();
  /**
   * <code>string certifier = 1 [json_name = "certifier", (.gogoproto.moretags) = "yaml:&#92;"certifier&#92;""];</code>
   * @return The bytes for certifier.
   */
  com.google.protobuf.ByteString
      getCertifierBytes();

  /**
   * <code>.google.protobuf.Any validator_pubkey = 2 [json_name = "validatorPubkey", (.cosmos_proto.accepts_interface) = "cosmos.crypto.PubKey"];</code>
   * @return Whether the validatorPubkey field is set.
   */
  boolean hasValidatorPubkey();
  /**
   * <code>.google.protobuf.Any validator_pubkey = 2 [json_name = "validatorPubkey", (.cosmos_proto.accepts_interface) = "cosmos.crypto.PubKey"];</code>
   * @return The validatorPubkey.
   */
  com.google.protobuf.Any getValidatorPubkey();
  /**
   * <code>.google.protobuf.Any validator_pubkey = 2 [json_name = "validatorPubkey", (.cosmos_proto.accepts_interface) = "cosmos.crypto.PubKey"];</code>
   */
  com.google.protobuf.AnyOrBuilder getValidatorPubkeyOrBuilder();

  /**
   * <code>string platform = 3 [json_name = "platform", (.gogoproto.moretags) = "yaml:&#92;"platform&#92;""];</code>
   * @return The platform.
   */
  java.lang.String getPlatform();
  /**
   * <code>string platform = 3 [json_name = "platform", (.gogoproto.moretags) = "yaml:&#92;"platform&#92;""];</code>
   * @return The bytes for platform.
   */
  com.google.protobuf.ByteString
      getPlatformBytes();
}
