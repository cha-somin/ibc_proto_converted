// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rbank/genesis.proto

package com.stafihub.stafihub.rbank;

public interface AddressPrefixOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.rbank.AddressPrefix)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string accAddressPrefix = 2 [json_name = "accAddressPrefix"];</code>
   * @return The accAddressPrefix.
   */
  java.lang.String getAccAddressPrefix();
  /**
   * <code>string accAddressPrefix = 2 [json_name = "accAddressPrefix"];</code>
   * @return The bytes for accAddressPrefix.
   */
  com.google.protobuf.ByteString
      getAccAddressPrefixBytes();

  /**
   * <code>string valAddressPrefix = 3 [json_name = "valAddressPrefix"];</code>
   * @return The valAddressPrefix.
   */
  java.lang.String getValAddressPrefix();
  /**
   * <code>string valAddressPrefix = 3 [json_name = "valAddressPrefix"];</code>
   * @return The bytes for valAddressPrefix.
   */
  com.google.protobuf.ByteString
      getValAddressPrefixBytes();
}
