// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/liquidityprovider/v1/query.proto

package com.em.liquidityprovider.v1;

public interface QueryListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:em.liquidityprovider.v1.QueryListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .em.liquidityprovider.v1.LiquidityProviderAccount liquidity_providers = 1 [json_name = "liquidityProviders", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"liquidity_providers&#92;""];</code>
   */
  java.util.List<com.em.liquidityprovider.v1.LiquidityProviderAccount> 
      getLiquidityProvidersList();
  /**
   * <code>repeated .em.liquidityprovider.v1.LiquidityProviderAccount liquidity_providers = 1 [json_name = "liquidityProviders", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"liquidity_providers&#92;""];</code>
   */
  com.em.liquidityprovider.v1.LiquidityProviderAccount getLiquidityProviders(int index);
  /**
   * <code>repeated .em.liquidityprovider.v1.LiquidityProviderAccount liquidity_providers = 1 [json_name = "liquidityProviders", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"liquidity_providers&#92;""];</code>
   */
  int getLiquidityProvidersCount();
  /**
   * <code>repeated .em.liquidityprovider.v1.LiquidityProviderAccount liquidity_providers = 1 [json_name = "liquidityProviders", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"liquidity_providers&#92;""];</code>
   */
  java.util.List<? extends com.em.liquidityprovider.v1.LiquidityProviderAccountOrBuilder> 
      getLiquidityProvidersOrBuilderList();
  /**
   * <code>repeated .em.liquidityprovider.v1.LiquidityProviderAccount liquidity_providers = 1 [json_name = "liquidityProviders", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"liquidity_providers&#92;""];</code>
   */
  com.em.liquidityprovider.v1.LiquidityProviderAccountOrBuilder getLiquidityProvidersOrBuilder(
      int index);
}
