// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/compute/v1beta1/types.proto

package com.secret.compute.v1beta1;

public interface ContractCustomInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secret.compute.v1beta1.ContractCustomInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes enclave_key = 1 [json_name = "enclaveKey", (.gogoproto.customname) = "EnclaveKey"];</code>
   * @return The enclaveKey.
   */
  com.google.protobuf.ByteString getEnclaveKey();

  /**
   * <code>string label = 2 [json_name = "label"];</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 2 [json_name = "label"];</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();
}
