// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/asset/v1beta1/query.proto

package com.comdex.asset.v1beta1;

public interface QueryAllExtendedPairStableVaultsByAppRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.asset.v1beta1.QueryAllExtendedPairStableVaultsByAppRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 app_id = 1 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder();
}
