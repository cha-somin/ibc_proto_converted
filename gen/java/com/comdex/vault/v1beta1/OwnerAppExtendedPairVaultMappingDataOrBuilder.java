// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/vault.proto

package com.comdex.vault.v1beta1;

public interface OwnerAppExtendedPairVaultMappingDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.vault.v1beta1.OwnerAppExtendedPairVaultMappingData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>uint64 app_id = 2 [json_name = "appId"];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>uint64 extended_pair_id = 3 [json_name = "extendedPairId"];</code>
   * @return The extendedPairId.
   */
  long getExtendedPairId();

  /**
   * <code>uint64 vault_id = 4 [json_name = "vaultId", (.gogoproto.moretags) = "yaml:&#92;"vault_id&#92;""];</code>
   * @return The vaultId.
   */
  long getVaultId();
}
