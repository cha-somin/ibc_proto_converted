// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/multisig/v1beta1/query.proto

package com.axelar.multisig.v1beta1;

public interface KeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.multisig.v1beta1.KeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key_id = 1 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
   * @return The keyId.
   */
  java.lang.String getKeyId();
  /**
   * <code>string key_id = 1 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
   * @return The bytes for keyId.
   */
  com.google.protobuf.ByteString
      getKeyIdBytes();
}
