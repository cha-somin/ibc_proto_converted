// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/tokenfactory/minters.proto

package com.noble.tokenfactory;

public interface MintersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:noble.tokenfactory.Minters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
   * @return Whether the allowance field is set.
   */
  boolean hasAllowance();
  /**
   * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
   * @return The allowance.
   */
  com.cosmos.base.v1beta1.Coin getAllowance();
  /**
   * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAllowanceOrBuilder();
}
