// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/multisig/v1beta1/events.proto

package com.axelar.multisig.v1beta1;

public interface SigningExpiredOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.multisig.v1beta1.SigningExpired)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string module = 1 [json_name = "module"];</code>
   * @return The module.
   */
  java.lang.String getModule();
  /**
   * <code>string module = 1 [json_name = "module"];</code>
   * @return The bytes for module.
   */
  com.google.protobuf.ByteString
      getModuleBytes();

  /**
   * <code>uint64 sig_id = 2 [json_name = "sigId", (.gogoproto.customname) = "SigID"];</code>
   * @return The sigId.
   */
  long getSigId();
}
