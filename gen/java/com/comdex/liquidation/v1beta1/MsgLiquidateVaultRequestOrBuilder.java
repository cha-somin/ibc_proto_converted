// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidation/v1beta1/tx.proto

package com.comdex.liquidation.v1beta1;

public interface MsgLiquidateVaultRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidation.v1beta1.MsgLiquidateVaultRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.customname) = "AppId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>uint64 vault_id = 3 [json_name = "vaultId", (.gogoproto.customname) = "VaultId", (.gogoproto.moretags) = "yaml:&#92;"vault_id&#92;""];</code>
   * @return The vaultId.
   */
  long getVaultId();
}
