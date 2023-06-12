// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/query.proto

package com.comdex.vault.v1beta1;

public interface QueryAllVaultIdsByAnOwnerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint64 vault_ids = 1 [json_name = "vaultIds", (.gogoproto.moretags) = "yaml:&#92;"vault_ids&#92;""];</code>
   * @return A list containing the vaultIds.
   */
  java.util.List<java.lang.Long> getVaultIdsList();
  /**
   * <code>repeated uint64 vault_ids = 1 [json_name = "vaultIds", (.gogoproto.moretags) = "yaml:&#92;"vault_ids&#92;""];</code>
   * @return The count of vaultIds.
   */
  int getVaultIdsCount();
  /**
   * <code>repeated uint64 vault_ids = 1 [json_name = "vaultIds", (.gogoproto.moretags) = "yaml:&#92;"vault_ids&#92;""];</code>
   * @param index The index of the element to return.
   * @return The vaultIds at the given index.
   */
  long getVaultIds(int index);

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
