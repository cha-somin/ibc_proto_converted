// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/burrow/crypto.proto

package com.crypto;

public interface PublicKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crypto.PublicKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 CurveType = 1 [json_name = "CurveType", (.gogoproto.casttype) = "CurveType"];</code>
   * @return The curveType.
   */
  int getCurveType();

  /**
   * <code>bytes PublicKey = 2 [json_name = "PublicKey", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/binary.HexBytes"];</code>
   * @return The publicKey.
   */
  com.google.protobuf.ByteString getPublicKey();
}
