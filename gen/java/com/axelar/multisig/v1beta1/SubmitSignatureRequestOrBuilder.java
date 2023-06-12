// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/multisig/v1beta1/tx.proto

package com.axelar.multisig.v1beta1;

public interface SubmitSignatureRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.multisig.v1beta1.SubmitSignatureRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>uint64 sig_id = 2 [json_name = "sigId", (.gogoproto.customname) = "SigID"];</code>
   * @return The sigId.
   */
  long getSigId();

  /**
   * <code>bytes signature = 3 [json_name = "signature", (.gogoproto.casttype) = "Signature"];</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();
}
