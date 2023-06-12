// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/query.proto

package com.comdex.vault.v1beta1;

public interface QueryAllVaultsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.vault.v1beta1.QueryAllVaultsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .comdex.vault.v1beta1.Vault vault = 1 [json_name = "vault", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vault&#92;""];</code>
   */
  java.util.List<com.comdex.vault.v1beta1.Vault> 
      getVaultList();
  /**
   * <code>repeated .comdex.vault.v1beta1.Vault vault = 1 [json_name = "vault", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vault&#92;""];</code>
   */
  com.comdex.vault.v1beta1.Vault getVault(int index);
  /**
   * <code>repeated .comdex.vault.v1beta1.Vault vault = 1 [json_name = "vault", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vault&#92;""];</code>
   */
  int getVaultCount();
  /**
   * <code>repeated .comdex.vault.v1beta1.Vault vault = 1 [json_name = "vault", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vault&#92;""];</code>
   */
  java.util.List<? extends com.comdex.vault.v1beta1.VaultOrBuilder> 
      getVaultOrBuilderList();
  /**
   * <code>repeated .comdex.vault.v1beta1.Vault vault = 1 [json_name = "vault", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vault&#92;""];</code>
   */
  com.comdex.vault.v1beta1.VaultOrBuilder getVaultOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
