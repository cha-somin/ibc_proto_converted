// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/draw.proto

package com.lum.network.millions;

public interface DrawOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lum.network.millions.Draw)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Draw IDs
   * </pre>
   *
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <code>uint64 draw_id = 2 [json_name = "drawId"];</code>
   * @return The drawId.
   */
  long getDrawId();

  /**
   * <pre>
   * Draw states
   * error_state is only set in case of failure
   * </pre>
   *
   * <code>.lum.network.millions.DrawState state = 3 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Draw states
   * error_state is only set in case of failure
   * </pre>
   *
   * <code>.lum.network.millions.DrawState state = 3 [json_name = "state"];</code>
   * @return The state.
   */
  com.lum.network.millions.DrawState getState();

  /**
   * <code>.lum.network.millions.DrawState error_state = 4 [json_name = "errorState"];</code>
   * @return The enum numeric value on the wire for errorState.
   */
  int getErrorStateValue();
  /**
   * <code>.lum.network.millions.DrawState error_state = 4 [json_name = "errorState"];</code>
   * @return The errorState.
   */
  com.lum.network.millions.DrawState getErrorState();

  /**
   * <pre>
   * Draw state done data
   * </pre>
   *
   * <code>int64 rand_seed = 5 [json_name = "randSeed"];</code>
   * @return The randSeed.
   */
  long getRandSeed();

  /**
   * <code>.cosmos.base.v1beta1.Coin prize_pool = 6 [json_name = "prizePool", (.gogoproto.nullable) = false];</code>
   * @return Whether the prizePool field is set.
   */
  boolean hasPrizePool();
  /**
   * <code>.cosmos.base.v1beta1.Coin prize_pool = 6 [json_name = "prizePool", (.gogoproto.nullable) = false];</code>
   * @return The prizePool.
   */
  com.cosmos.base.v1beta1.Coin getPrizePool();
  /**
   * <code>.cosmos.base.v1beta1.Coin prize_pool = 6 [json_name = "prizePool", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getPrizePoolOrBuilder();

  /**
   * <code>string prize_pool_fresh_amount = 7 [json_name = "prizePoolFreshAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The prizePoolFreshAmount.
   */
  java.lang.String getPrizePoolFreshAmount();
  /**
   * <code>string prize_pool_fresh_amount = 7 [json_name = "prizePoolFreshAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for prizePoolFreshAmount.
   */
  com.google.protobuf.ByteString
      getPrizePoolFreshAmountBytes();

  /**
   * <code>string prize_pool_remains_amount = 8 [json_name = "prizePoolRemainsAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The prizePoolRemainsAmount.
   */
  java.lang.String getPrizePoolRemainsAmount();
  /**
   * <code>string prize_pool_remains_amount = 8 [json_name = "prizePoolRemainsAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for prizePoolRemainsAmount.
   */
  com.google.protobuf.ByteString
      getPrizePoolRemainsAmountBytes();

  /**
   * <code>repeated .lum.network.millions.PrizeRef prizes_refs = 11 [json_name = "prizesRefs", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.lum.network.millions.PrizeRef> 
      getPrizesRefsList();
  /**
   * <code>repeated .lum.network.millions.PrizeRef prizes_refs = 11 [json_name = "prizesRefs", (.gogoproto.nullable) = false];</code>
   */
  com.lum.network.millions.PrizeRef getPrizesRefs(int index);
  /**
   * <code>repeated .lum.network.millions.PrizeRef prizes_refs = 11 [json_name = "prizesRefs", (.gogoproto.nullable) = false];</code>
   */
  int getPrizesRefsCount();
  /**
   * <code>repeated .lum.network.millions.PrizeRef prizes_refs = 11 [json_name = "prizesRefs", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.lum.network.millions.PrizeRefOrBuilder> 
      getPrizesRefsOrBuilderList();
  /**
   * <code>repeated .lum.network.millions.PrizeRef prizes_refs = 11 [json_name = "prizesRefs", (.gogoproto.nullable) = false];</code>
   */
  com.lum.network.millions.PrizeRefOrBuilder getPrizesRefsOrBuilder(
      int index);

  /**
   * <code>uint64 total_win_count = 12 [json_name = "totalWinCount"];</code>
   * @return The totalWinCount.
   */
  long getTotalWinCount();

  /**
   * <code>string total_win_amount = 13 [json_name = "totalWinAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The totalWinAmount.
   */
  java.lang.String getTotalWinAmount();
  /**
   * <code>string total_win_amount = 13 [json_name = "totalWinAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for totalWinAmount.
   */
  com.google.protobuf.ByteString
      getTotalWinAmountBytes();

  /**
   * <pre>
   * Draw creation and updates
   * </pre>
   *
   * <code>int64 created_at_height = 15 [json_name = "createdAtHeight"];</code>
   * @return The createdAtHeight.
   */
  long getCreatedAtHeight();

  /**
   * <code>int64 updated_at_height = 16 [json_name = "updatedAtHeight"];</code>
   * @return The updatedAtHeight.
   */
  long getUpdatedAtHeight();

  /**
   * <code>.google.protobuf.Timestamp created_at = 17 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 17 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 17 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 18 [json_name = "updatedAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 18 [json_name = "updatedAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 18 [json_name = "updatedAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();
}
