// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/tx.proto

package com.comdex.vault.v1beta1;

public interface MsgCreateStableMintRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.vault.v1beta1.MsgCreateStableMintRequest)
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
   * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>uint64 extended_pair_vault_id = 3 [json_name = "extendedPairVaultId", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_vault_id&#92;""];</code>
   * @return The extendedPairVaultId.
   */
  long getExtendedPairVaultId();

  /**
   * <code>string amount = 4 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"Amount&#92;""];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 4 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"Amount&#92;""];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();
}
