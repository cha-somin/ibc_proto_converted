// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/evm/v1/evm.proto

package com.ethermint.evm.v1;

public interface AccessTupleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ethermint.evm.v1.AccessTuple)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * address is a hex formatted ethereum address
   * </pre>
   *
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * address is a hex formatted ethereum address
   * </pre>
   *
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * storage_keys are hex formatted hashes of the storage keys
   * </pre>
   *
   * <code>repeated string storage_keys = 2 [json_name = "storageKeys", (.gogoproto.jsontag) = "storageKeys"];</code>
   * @return A list containing the storageKeys.
   */
  java.util.List<java.lang.String>
      getStorageKeysList();
  /**
   * <pre>
   * storage_keys are hex formatted hashes of the storage keys
   * </pre>
   *
   * <code>repeated string storage_keys = 2 [json_name = "storageKeys", (.gogoproto.jsontag) = "storageKeys"];</code>
   * @return The count of storageKeys.
   */
  int getStorageKeysCount();
  /**
   * <pre>
   * storage_keys are hex formatted hashes of the storage keys
   * </pre>
   *
   * <code>repeated string storage_keys = 2 [json_name = "storageKeys", (.gogoproto.jsontag) = "storageKeys"];</code>
   * @param index The index of the element to return.
   * @return The storageKeys at the given index.
   */
  java.lang.String getStorageKeys(int index);
  /**
   * <pre>
   * storage_keys are hex formatted hashes of the storage keys
   * </pre>
   *
   * <code>repeated string storage_keys = 2 [json_name = "storageKeys", (.gogoproto.jsontag) = "storageKeys"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the storageKeys at the given index.
   */
  com.google.protobuf.ByteString
      getStorageKeysBytes(int index);
}
