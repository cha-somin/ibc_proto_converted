// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/registration/v1beta1/remote_attestation/types.proto

package com.secret.registration.remote_attestation.v1beta1;

public interface SGXEC256SignatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secret.registration.remote_attestation.v1beta1.SGXEC256Signature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string gx = 1 [json_name = "gx"];</code>
   * @return The gx.
   */
  java.lang.String getGx();
  /**
   * <code>string gx = 1 [json_name = "gx"];</code>
   * @return The bytes for gx.
   */
  com.google.protobuf.ByteString
      getGxBytes();

  /**
   * <code>string gy = 2 [json_name = "gy"];</code>
   * @return The gy.
   */
  java.lang.String getGy();
  /**
   * <code>string gy = 2 [json_name = "gy"];</code>
   * @return The bytes for gy.
   */
  com.google.protobuf.ByteString
      getGyBytes();
}
