// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/claims/v1beta1/query.proto

package com.ixo.claims.v1beta1;

public interface QueryDisputeListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ixo.claims.v1beta1.QueryDisputeListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ixo.claims.v1beta1.Dispute disputes = 1 [json_name = "disputes", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.ixo.claims.v1beta1.Dispute> 
      getDisputesList();
  /**
   * <code>repeated .ixo.claims.v1beta1.Dispute disputes = 1 [json_name = "disputes", (.gogoproto.nullable) = false];</code>
   */
  com.ixo.claims.v1beta1.Dispute getDisputes(int index);
  /**
   * <code>repeated .ixo.claims.v1beta1.Dispute disputes = 1 [json_name = "disputes", (.gogoproto.nullable) = false];</code>
   */
  int getDisputesCount();
  /**
   * <code>repeated .ixo.claims.v1beta1.Dispute disputes = 1 [json_name = "disputes", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.ixo.claims.v1beta1.DisputeOrBuilder> 
      getDisputesOrBuilderList();
  /**
   * <code>repeated .ixo.claims.v1beta1.Dispute disputes = 1 [json_name = "disputes", (.gogoproto.nullable) = false];</code>
   */
  com.ixo.claims.v1beta1.DisputeOrBuilder getDisputesOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
