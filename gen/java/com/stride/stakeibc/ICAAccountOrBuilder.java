// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/stakeibc/ica_account.proto

package com.stride.stakeibc;

public interface ICAAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.stakeibc.ICAAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>.stride.stakeibc.ICAAccountType target = 3 [json_name = "target"];</code>
   * @return The enum numeric value on the wire for target.
   */
  int getTargetValue();
  /**
   * <code>.stride.stakeibc.ICAAccountType target = 3 [json_name = "target"];</code>
   * @return The target.
   */
  com.stride.stakeibc.ICAAccountType getTarget();
}
