// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/query.proto

package com.comdex.vault.v1beta1;

public interface QueryAllVaultIdsByAnOwnerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest)
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
