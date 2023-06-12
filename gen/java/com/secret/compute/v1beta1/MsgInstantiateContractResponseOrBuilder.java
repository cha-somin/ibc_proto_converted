// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/compute/v1beta1/msg.proto

package com.secret.compute.v1beta1;

public interface MsgInstantiateContractResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secret.compute.v1beta1.MsgInstantiateContractResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Address is the bech32 address of the new contract instance.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * Address is the bech32 address of the new contract instance.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * Data contains base64-encoded bytes to returned from the contract
   * </pre>
   *
   * <code>bytes data = 2 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
