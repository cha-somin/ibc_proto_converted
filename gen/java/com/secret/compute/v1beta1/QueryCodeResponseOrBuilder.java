// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/compute/v1beta1/query.proto

package com.secret.compute.v1beta1;

public interface QueryCodeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secret.compute.v1beta1.QueryCodeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.secret.compute.v1beta1.CodeInfoResponse code_info = 1 [json_name = "codeInfo", (.gogoproto.embed) = true, (.gogoproto.jsontag) = ""];</code>
   * @return Whether the codeInfo field is set.
   */
  boolean hasCodeInfo();
  /**
   * <code>.secret.compute.v1beta1.CodeInfoResponse code_info = 1 [json_name = "codeInfo", (.gogoproto.embed) = true, (.gogoproto.jsontag) = ""];</code>
   * @return The codeInfo.
   */
  com.secret.compute.v1beta1.CodeInfoResponse getCodeInfo();
  /**
   * <code>.secret.compute.v1beta1.CodeInfoResponse code_info = 1 [json_name = "codeInfo", (.gogoproto.embed) = true, (.gogoproto.jsontag) = ""];</code>
   */
  com.secret.compute.v1beta1.CodeInfoResponseOrBuilder getCodeInfoOrBuilder();

  /**
   * <code>bytes wasm = 2 [json_name = "wasm"];</code>
   * @return The wasm.
   */
  com.google.protobuf.ByteString getWasm();
}
