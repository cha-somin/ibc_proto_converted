// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmwasm/wasm/v1/types.proto

package com.cosmwasm.wasm.v1;

public interface AccessConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmwasm.wasm.v1.AccessConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmwasm.wasm.v1.AccessType permission = 1 [json_name = "permission", (.gogoproto.moretags) = "yaml:&#92;"permission&#92;""];</code>
   * @return The enum numeric value on the wire for permission.
   */
  int getPermissionValue();
  /**
   * <code>.cosmwasm.wasm.v1.AccessType permission = 1 [json_name = "permission", (.gogoproto.moretags) = "yaml:&#92;"permission&#92;""];</code>
   * @return The permission.
   */
  com.cosmwasm.wasm.v1.AccessType getPermission();

  /**
   * <pre>
   * Address
   * Deprecated: replaced by addresses
   * </pre>
   *
   * <code>string address = 2 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * Address
   * Deprecated: replaced by addresses
   * </pre>
   *
   * <code>string address = 2 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>repeated string addresses = 3 [json_name = "addresses", (.gogoproto.moretags) = "yaml:&#92;"addresses&#92;""];</code>
   * @return A list containing the addresses.
   */
  java.util.List<java.lang.String>
      getAddressesList();
  /**
   * <code>repeated string addresses = 3 [json_name = "addresses", (.gogoproto.moretags) = "yaml:&#92;"addresses&#92;""];</code>
   * @return The count of addresses.
   */
  int getAddressesCount();
  /**
   * <code>repeated string addresses = 3 [json_name = "addresses", (.gogoproto.moretags) = "yaml:&#92;"addresses&#92;""];</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  java.lang.String getAddresses(int index);
  /**
   * <code>repeated string addresses = 3 [json_name = "addresses", (.gogoproto.moretags) = "yaml:&#92;"addresses&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  com.google.protobuf.ByteString
      getAddressesBytes(int index);
}
