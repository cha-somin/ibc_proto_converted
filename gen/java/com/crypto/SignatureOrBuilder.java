// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/burrow/crypto.proto

package com.crypto;

public interface SignatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crypto.Signature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 CurveType = 1 [json_name = "CurveType", (.gogoproto.casttype) = "CurveType"];</code>
   * @return The curveType.
   */
  int getCurveType();

  /**
   * <code>bytes Signature = 2 [json_name = "Signature"];</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();
}
