// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/provider/v1beta2/query.proto

package com.akash.provider.v1beta2;

public interface QueryProvidersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.provider.v1beta2.QueryProvidersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .akash.provider.v1beta2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
   */
  java.util.List<com.akash.provider.v1beta2.Provider> 
      getProvidersList();
  /**
   * <code>repeated .akash.provider.v1beta2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
   */
  com.akash.provider.v1beta2.Provider getProviders(int index);
  /**
   * <code>repeated .akash.provider.v1beta2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
   */
  int getProvidersCount();
  /**
   * <code>repeated .akash.provider.v1beta2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
   */
  java.util.List<? extends com.akash.provider.v1beta2.ProviderOrBuilder> 
      getProvidersOrBuilderList();
  /**
   * <code>repeated .akash.provider.v1beta2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
   */
  com.akash.provider.v1beta2.ProviderOrBuilder getProvidersOrBuilder(
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
