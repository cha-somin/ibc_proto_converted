// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/query.proto

package com.comdex.lend.v1beta1;

public interface QueryPairsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.lend.v1beta1.QueryPairsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .comdex.lend.v1beta1.Extended_Pair extendedPairs = 1 [json_name = "extendedPairs", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"extended_pairs&#92;""];</code>
   */
  java.util.List<com.comdex.lend.v1beta1.Extended_Pair> 
      getExtendedPairsList();
  /**
   * <code>repeated .comdex.lend.v1beta1.Extended_Pair extendedPairs = 1 [json_name = "extendedPairs", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"extended_pairs&#92;""];</code>
   */
  com.comdex.lend.v1beta1.Extended_Pair getExtendedPairs(int index);
  /**
   * <code>repeated .comdex.lend.v1beta1.Extended_Pair extendedPairs = 1 [json_name = "extendedPairs", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"extended_pairs&#92;""];</code>
   */
  int getExtendedPairsCount();
  /**
   * <code>repeated .comdex.lend.v1beta1.Extended_Pair extendedPairs = 1 [json_name = "extendedPairs", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"extended_pairs&#92;""];</code>
   */
  java.util.List<? extends com.comdex.lend.v1beta1.Extended_PairOrBuilder> 
      getExtendedPairsOrBuilderList();
  /**
   * <code>repeated .comdex.lend.v1beta1.Extended_Pair extendedPairs = 1 [json_name = "extendedPairs", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"extended_pairs&#92;""];</code>
   */
  com.comdex.lend.v1beta1.Extended_PairOrBuilder getExtendedPairsOrBuilder(
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
