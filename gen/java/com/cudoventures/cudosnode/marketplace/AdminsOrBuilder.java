// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/marketplace/admins.proto

package com.cudoventures.cudosnode.marketplace;

public interface AdminsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cudoventures.cudosnode.marketplace.Admins)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
   * @return A list containing the addresses.
   */
  java.util.List<java.lang.String>
      getAddressesList();
  /**
   * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
   * @return The count of addresses.
   */
  int getAddressesCount();
  /**
   * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  java.lang.String getAddresses(int index);
  /**
   * <code>repeated string addresses = 1 [json_name = "addresses", (.gogoproto.nullable) = false];</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  com.google.protobuf.ByteString
      getAddressesBytes(int index);
}
