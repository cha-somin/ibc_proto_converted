// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidation/v1beta1/querier.proto

package com.comdex.liquidation.v1beta1;

public interface QueryLockedVaultsHistoryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .comdex.liquidation.v1beta1.LockedVault locked_vaults_history = 1 [json_name = "lockedVaultsHistory", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locked_vaults_history&#92;""];</code>
   */
  java.util.List<com.comdex.liquidation.v1beta1.LockedVault> 
      getLockedVaultsHistoryList();
  /**
   * <code>repeated .comdex.liquidation.v1beta1.LockedVault locked_vaults_history = 1 [json_name = "lockedVaultsHistory", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locked_vaults_history&#92;""];</code>
   */
  com.comdex.liquidation.v1beta1.LockedVault getLockedVaultsHistory(int index);
  /**
   * <code>repeated .comdex.liquidation.v1beta1.LockedVault locked_vaults_history = 1 [json_name = "lockedVaultsHistory", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locked_vaults_history&#92;""];</code>
   */
  int getLockedVaultsHistoryCount();
  /**
   * <code>repeated .comdex.liquidation.v1beta1.LockedVault locked_vaults_history = 1 [json_name = "lockedVaultsHistory", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locked_vaults_history&#92;""];</code>
   */
  java.util.List<? extends com.comdex.liquidation.v1beta1.LockedVaultOrBuilder> 
      getLockedVaultsHistoryOrBuilderList();
  /**
   * <code>repeated .comdex.liquidation.v1beta1.LockedVault locked_vaults_history = 1 [json_name = "lockedVaultsHistory", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"locked_vaults_history&#92;""];</code>
   */
  com.comdex.liquidation.v1beta1.LockedVaultOrBuilder getLockedVaultsHistoryOrBuilder(
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
