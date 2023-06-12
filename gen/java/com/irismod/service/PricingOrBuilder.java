// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/service/service.proto

package com.irismod.service;

public interface PricingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.service.Pricing)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin price = 6 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getPriceList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin price = 6 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getPrice(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin price = 6 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getPriceCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin price = 6 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getPriceOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin price = 6 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getPriceOrBuilder(
      int index);

  /**
   * <code>repeated .irismod.service.PromotionByTime promotions_by_time = 2 [json_name = "promotionsByTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"promotions_by_time&#92;""];</code>
   */
  java.util.List<com.irismod.service.PromotionByTime> 
      getPromotionsByTimeList();
  /**
   * <code>repeated .irismod.service.PromotionByTime promotions_by_time = 2 [json_name = "promotionsByTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"promotions_by_time&#92;""];</code>
   */
  com.irismod.service.PromotionByTime getPromotionsByTime(int index);
  /**
   * <code>repeated .irismod.service.PromotionByTime promotions_by_time = 2 [json_name = "promotionsByTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"promotions_by_time&#92;""];</code>
   */
  int getPromotionsByTimeCount();
  /**
   * <code>repeated .irismod.service.PromotionByTime promotions_by_time = 2 [json_name = "promotionsByTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"promotions_by_time&#92;""];</code>
   */
  java.util.List<? extends com.irismod.service.PromotionByTimeOrBuilder> 
      getPromotionsByTimeOrBuilderList();
  /**
   * <code>repeated .irismod.service.PromotionByTime promotions_by_time = 2 [json_name = "promotionsByTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"promotions_by_time&#92;""];</code>
   */
  com.irismod.service.PromotionByTimeOrBuilder getPromotionsByTimeOrBuilder(
      int index);

  /**
   * <code>repeated .irismod.service.PromotionByVolume promotions_by_volume = 3 [json_name = "promotionsByVolume", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"promotions_by_volume&#92;""];</code>
   */
  java.util.List<com.irismod.service.PromotionByVolume> 
      getPromotionsByVolumeList();
  /**
   * <code>repeated .irismod.service.PromotionByVolume promotions_by_volume = 3 [json_name = "promotionsByVolume", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"promotions_by_volume&#92;""];</code>
   */
  com.irismod.service.PromotionByVolume getPromotionsByVolume(int index);
  /**
   * <code>repeated .irismod.service.PromotionByVolume promotions_by_volume = 3 [json_name = "promotionsByVolume", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"promotions_by_volume&#92;""];</code>
   */
  int getPromotionsByVolumeCount();
  /**
   * <code>repeated .irismod.service.PromotionByVolume promotions_by_volume = 3 [json_name = "promotionsByVolume", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"promotions_by_volume&#92;""];</code>
   */
  java.util.List<? extends com.irismod.service.PromotionByVolumeOrBuilder> 
      getPromotionsByVolumeOrBuilderList();
  /**
   * <code>repeated .irismod.service.PromotionByVolume promotions_by_volume = 3 [json_name = "promotionsByVolume", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"promotions_by_volume&#92;""];</code>
   */
  com.irismod.service.PromotionByVolumeOrBuilder getPromotionsByVolumeOrBuilder(
      int index);
}
