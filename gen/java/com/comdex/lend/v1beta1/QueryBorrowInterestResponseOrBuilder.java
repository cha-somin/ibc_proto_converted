// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/query.proto

package com.comdex.lend.v1beta1;

public interface QueryBorrowInterestResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.lend.v1beta1.QueryBorrowInterestResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .comdex.lend.v1beta1.PoolInterestB pool_interest = 1 [json_name = "poolInterest", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_interest&#92;""];</code>
   */
  java.util.List<com.comdex.lend.v1beta1.PoolInterestB> 
      getPoolInterestList();
  /**
   * <code>repeated .comdex.lend.v1beta1.PoolInterestB pool_interest = 1 [json_name = "poolInterest", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_interest&#92;""];</code>
   */
  com.comdex.lend.v1beta1.PoolInterestB getPoolInterest(int index);
  /**
   * <code>repeated .comdex.lend.v1beta1.PoolInterestB pool_interest = 1 [json_name = "poolInterest", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_interest&#92;""];</code>
   */
  int getPoolInterestCount();
  /**
   * <code>repeated .comdex.lend.v1beta1.PoolInterestB pool_interest = 1 [json_name = "poolInterest", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_interest&#92;""];</code>
   */
  java.util.List<? extends com.comdex.lend.v1beta1.PoolInterestBOrBuilder> 
      getPoolInterestOrBuilderList();
  /**
   * <code>repeated .comdex.lend.v1beta1.PoolInterestB pool_interest = 1 [json_name = "poolInterest", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pool_interest&#92;""];</code>
   */
  com.comdex.lend.v1beta1.PoolInterestBOrBuilder getPoolInterestOrBuilder(
      int index);
}
