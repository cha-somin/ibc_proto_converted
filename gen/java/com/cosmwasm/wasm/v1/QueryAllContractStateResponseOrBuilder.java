// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmwasm/wasm/v1/query.proto

package com.cosmwasm.wasm.v1;

public interface QueryAllContractStateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmwasm.wasm.v1.QueryAllContractStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmwasm.wasm.v1.Model models = 1 [json_name = "models", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.cosmwasm.wasm.v1.Model> 
      getModelsList();
  /**
   * <code>repeated .cosmwasm.wasm.v1.Model models = 1 [json_name = "models", (.gogoproto.nullable) = false];</code>
   */
  com.cosmwasm.wasm.v1.Model getModels(int index);
  /**
   * <code>repeated .cosmwasm.wasm.v1.Model models = 1 [json_name = "models", (.gogoproto.nullable) = false];</code>
   */
  int getModelsCount();
  /**
   * <code>repeated .cosmwasm.wasm.v1.Model models = 1 [json_name = "models", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.cosmwasm.wasm.v1.ModelOrBuilder> 
      getModelsOrBuilderList();
  /**
   * <code>repeated .cosmwasm.wasm.v1.Model models = 1 [json_name = "models", (.gogoproto.nullable) = false];</code>
   */
  com.cosmwasm.wasm.v1.ModelOrBuilder getModelsOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
