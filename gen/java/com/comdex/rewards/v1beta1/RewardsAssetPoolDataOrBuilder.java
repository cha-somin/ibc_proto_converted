// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/rewards/v1beta1/rewards.proto

package com.comdex.rewards.v1beta1;

public interface RewardsAssetPoolDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.rewards.v1beta1.RewardsAssetPoolData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 c_pool_id = 1 [json_name = "cPoolId", (.gogoproto.moretags) = "yaml:&#92;"c_pool_id&#92;""];</code>
   * @return The cPoolId.
   */
  long getCPoolId();

  /**
   * <code>repeated uint64 asset_id = 2 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return A list containing the assetId.
   */
  java.util.List<java.lang.Long> getAssetIdList();
  /**
   * <code>repeated uint64 asset_id = 2 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return The count of assetId.
   */
  int getAssetIdCount();
  /**
   * <code>repeated uint64 asset_id = 2 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @param index The index of the element to return.
   * @return The assetId at the given index.
   */
  long getAssetId(int index);

  /**
   * <code>uint64 c_swap_app_id = 3 [json_name = "cSwapAppId", (.gogoproto.moretags) = "yaml:&#92;"c_swap_app_id&#92;""];</code>
   * @return The cSwapAppId.
   */
  long getCSwapAppId();

  /**
   * <code>uint64 c_swap_min_lock_amount = 4 [json_name = "cSwapMinLockAmount", (.gogoproto.moretags) = "yaml:&#92;"c_swap_min_lock_amount&#92;""];</code>
   * @return The cSwapMinLockAmount.
   */
  long getCSwapMinLockAmount();
}
