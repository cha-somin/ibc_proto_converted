// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/interchaintxs/v1/query.proto

package com.neutron.interchaintxs;

public interface QueryInterchainAccountAddressResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:neutron.interchaintxs.QueryInterchainAccountAddressResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The corresponding interchain account address on the host chain
   * </pre>
   *
   * <code>string interchain_account_address = 1 [json_name = "interchainAccountAddress"];</code>
   * @return The interchainAccountAddress.
   */
  java.lang.String getInterchainAccountAddress();
  /**
   * <pre>
   * The corresponding interchain account address on the host chain
   * </pre>
   *
   * <code>string interchain_account_address = 1 [json_name = "interchainAccountAddress"];</code>
   * @return The bytes for interchainAccountAddress.
   */
  com.google.protobuf.ByteString
      getInterchainAccountAddressBytes();
}
