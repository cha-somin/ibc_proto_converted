// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/provider/v1beta2/genesis.proto

package com.akash.provider.v1beta2;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.provider.v1beta2.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .akash.provider.v1beta2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
   */
  java.util.List<com.akash.provider.v1beta2.Provider> 
      getProvidersList();
  /**
   * <code>repeated .akash.provider.v1beta2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
   */
  com.akash.provider.v1beta2.Provider getProviders(int index);
  /**
   * <code>repeated .akash.provider.v1beta2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
   */
  int getProvidersCount();
  /**
   * <code>repeated .akash.provider.v1beta2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
   */
  java.util.List<? extends com.akash.provider.v1beta2.ProviderOrBuilder> 
      getProvidersOrBuilderList();
  /**
   * <code>repeated .akash.provider.v1beta2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "providers", (.gogoproto.moretags) = "yaml:&#92;"providers&#92;""];</code>
   */
  com.akash.provider.v1beta2.ProviderOrBuilder getProvidersOrBuilder(
      int index);
}
