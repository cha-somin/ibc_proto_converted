// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cryptoorg/nft/v1/query.proto

package com.chainmain.nft.v1;

public interface QueryDenomsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chainmain.nft.v1.QueryDenomsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chainmain.nft.v1.Denom denoms = 1 [json_name = "denoms", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.chainmain.nft.v1.Denom> 
      getDenomsList();
  /**
   * <code>repeated .chainmain.nft.v1.Denom denoms = 1 [json_name = "denoms", (.gogoproto.nullable) = false];</code>
   */
  com.chainmain.nft.v1.Denom getDenoms(int index);
  /**
   * <code>repeated .chainmain.nft.v1.Denom denoms = 1 [json_name = "denoms", (.gogoproto.nullable) = false];</code>
   */
  int getDenomsCount();
  /**
   * <code>repeated .chainmain.nft.v1.Denom denoms = 1 [json_name = "denoms", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.chainmain.nft.v1.DenomOrBuilder> 
      getDenomsOrBuilderList();
  /**
   * <code>repeated .chainmain.nft.v1.Denom denoms = 1 [json_name = "denoms", (.gogoproto.nullable) = false];</code>
   */
  com.chainmain.nft.v1.DenomOrBuilder getDenomsOrBuilder(
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
