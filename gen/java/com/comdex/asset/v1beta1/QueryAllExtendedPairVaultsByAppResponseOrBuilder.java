// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/asset/v1beta1/query.proto

package com.comdex.asset.v1beta1;

public interface QueryAllExtendedPairVaultsByAppResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.asset.v1beta1.QueryAllExtendedPairVaultsByAppResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .comdex.asset.v1beta1.ExtendedPairVault extended_pair = 1 [json_name = "extendedPair", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"extended_pair&#92;""];</code>
   */
  java.util.List<com.comdex.asset.v1beta1.ExtendedPairVault> 
      getExtendedPairList();
  /**
   * <code>repeated .comdex.asset.v1beta1.ExtendedPairVault extended_pair = 1 [json_name = "extendedPair", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"extended_pair&#92;""];</code>
   */
  com.comdex.asset.v1beta1.ExtendedPairVault getExtendedPair(int index);
  /**
   * <code>repeated .comdex.asset.v1beta1.ExtendedPairVault extended_pair = 1 [json_name = "extendedPair", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"extended_pair&#92;""];</code>
   */
  int getExtendedPairCount();
  /**
   * <code>repeated .comdex.asset.v1beta1.ExtendedPairVault extended_pair = 1 [json_name = "extendedPair", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"extended_pair&#92;""];</code>
   */
  java.util.List<? extends com.comdex.asset.v1beta1.ExtendedPairVaultOrBuilder> 
      getExtendedPairOrBuilderList();
  /**
   * <code>repeated .comdex.asset.v1beta1.ExtendedPairVault extended_pair = 1 [json_name = "extendedPair", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"extended_pair&#92;""];</code>
   */
  com.comdex.asset.v1beta1.ExtendedPairVaultOrBuilder getExtendedPairOrBuilder(
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
