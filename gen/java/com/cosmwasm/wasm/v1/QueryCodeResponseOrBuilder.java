// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmwasm/wasm/v1/query.proto

package com.cosmwasm.wasm.v1;

public interface QueryCodeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmwasm.wasm.v1.QueryCodeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmwasm.wasm.v1.CodeInfoResponse code_info = 1 [json_name = "codeInfo", (.gogoproto.embed) = true, (.gogoproto.jsontag) = ""];</code>
   * @return Whether the codeInfo field is set.
   */
  boolean hasCodeInfo();
  /**
   * <code>.cosmwasm.wasm.v1.CodeInfoResponse code_info = 1 [json_name = "codeInfo", (.gogoproto.embed) = true, (.gogoproto.jsontag) = ""];</code>
   * @return The codeInfo.
   */
  com.cosmwasm.wasm.v1.CodeInfoResponse getCodeInfo();
  /**
   * <code>.cosmwasm.wasm.v1.CodeInfoResponse code_info = 1 [json_name = "codeInfo", (.gogoproto.embed) = true, (.gogoproto.jsontag) = ""];</code>
   */
  com.cosmwasm.wasm.v1.CodeInfoResponseOrBuilder getCodeInfoOrBuilder();

  /**
   * <code>bytes data = 2 [json_name = "data", (.gogoproto.jsontag) = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
