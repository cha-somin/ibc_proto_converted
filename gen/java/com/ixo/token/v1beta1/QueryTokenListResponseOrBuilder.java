// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/token/v1beta1/query.proto

package com.ixo.token.v1beta1;

public interface QueryTokenListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ixo.token.v1beta1.QueryTokenListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 1 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 1 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 1 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();

  /**
   * <code>repeated .ixo.token.v1beta1.Token tokenDocs = 2 [json_name = "tokenDocs", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.ixo.token.v1beta1.Token> 
      getTokenDocsList();
  /**
   * <code>repeated .ixo.token.v1beta1.Token tokenDocs = 2 [json_name = "tokenDocs", (.gogoproto.nullable) = false];</code>
   */
  com.ixo.token.v1beta1.Token getTokenDocs(int index);
  /**
   * <code>repeated .ixo.token.v1beta1.Token tokenDocs = 2 [json_name = "tokenDocs", (.gogoproto.nullable) = false];</code>
   */
  int getTokenDocsCount();
  /**
   * <code>repeated .ixo.token.v1beta1.Token tokenDocs = 2 [json_name = "tokenDocs", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.ixo.token.v1beta1.TokenOrBuilder> 
      getTokenDocsOrBuilderList();
  /**
   * <code>repeated .ixo.token.v1beta1.Token tokenDocs = 2 [json_name = "tokenDocs", (.gogoproto.nullable) = false];</code>
   */
  com.ixo.token.v1beta1.TokenOrBuilder getTokenDocsOrBuilder(
      int index);
}
