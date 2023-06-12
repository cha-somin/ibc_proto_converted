// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/market/v1beta1/market.proto

package com.comdex.market.v1beta1;

public interface TimeWeightedAverageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.market.v1beta1.TimeWeightedAverage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 asset_id = 1 [json_name = "assetId", (.gogoproto.customname) = "AssetID", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return The assetId.
   */
  long getAssetId();

  /**
   * <code>uint64 script_id = 2 [json_name = "scriptId", (.gogoproto.customname) = "ScriptID", (.gogoproto.moretags) = "yaml:&#92;"script_id&#92;""];</code>
   * @return The scriptId.
   */
  long getScriptId();

  /**
   * <code>uint64 twa = 3 [json_name = "twa", (.gogoproto.customname) = "Twa", (.gogoproto.moretags) = "yaml:&#92;"twa&#92;""];</code>
   * @return The twa.
   */
  long getTwa();

  /**
   * <code>uint64 current_index = 4 [json_name = "currentIndex", (.gogoproto.customname) = "CurrentIndex", (.gogoproto.moretags) = "yaml:&#92;"current_index&#92;""];</code>
   * @return The currentIndex.
   */
  long getCurrentIndex();

  /**
   * <code>bool is_price_active = 5 [json_name = "isPriceActive", (.gogoproto.moretags) = "yaml:&#92;"is_price_active&#92;""];</code>
   * @return The isPriceActive.
   */
  boolean getIsPriceActive();

  /**
   * <code>repeated uint64 price_value = 6 [json_name = "priceValue", (.gogoproto.customname) = "PriceValue", (.gogoproto.moretags) = "yaml:&#92;"price_value&#92;""];</code>
   * @return A list containing the priceValue.
   */
  java.util.List<java.lang.Long> getPriceValueList();
  /**
   * <code>repeated uint64 price_value = 6 [json_name = "priceValue", (.gogoproto.customname) = "PriceValue", (.gogoproto.moretags) = "yaml:&#92;"price_value&#92;""];</code>
   * @return The count of priceValue.
   */
  int getPriceValueCount();
  /**
   * <code>repeated uint64 price_value = 6 [json_name = "priceValue", (.gogoproto.customname) = "PriceValue", (.gogoproto.moretags) = "yaml:&#92;"price_value&#92;""];</code>
   * @param index The index of the element to return.
   * @return The priceValue at the given index.
   */
  long getPriceValue(int index);

  /**
   * <code>int64 discarded_height_diff = 7 [json_name = "discardedHeightDiff", (.gogoproto.moretags) = "yaml:&#92;"discarded_height_diff&#92;""];</code>
   * @return The discardedHeightDiff.
   */
  long getDiscardedHeightDiff();
}
