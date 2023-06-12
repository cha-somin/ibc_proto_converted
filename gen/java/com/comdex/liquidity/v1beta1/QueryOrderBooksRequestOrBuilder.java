// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/query.proto

package com.comdex.liquidity.v1beta1;

public interface QueryOrderBooksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidity.v1beta1.QueryOrderBooksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 app_id = 1 [json_name = "appId"];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>repeated uint64 pair_ids = 2 [json_name = "pairIds"];</code>
   * @return A list containing the pairIds.
   */
  java.util.List<java.lang.Long> getPairIdsList();
  /**
   * <code>repeated uint64 pair_ids = 2 [json_name = "pairIds"];</code>
   * @return The count of pairIds.
   */
  int getPairIdsCount();
  /**
   * <code>repeated uint64 pair_ids = 2 [json_name = "pairIds"];</code>
   * @param index The index of the element to return.
   * @return The pairIds at the given index.
   */
  long getPairIds(int index);

  /**
   * <code>repeated uint32 price_unit_powers = 3 [json_name = "priceUnitPowers"];</code>
   * @return A list containing the priceUnitPowers.
   */
  java.util.List<java.lang.Integer> getPriceUnitPowersList();
  /**
   * <code>repeated uint32 price_unit_powers = 3 [json_name = "priceUnitPowers"];</code>
   * @return The count of priceUnitPowers.
   */
  int getPriceUnitPowersCount();
  /**
   * <code>repeated uint32 price_unit_powers = 3 [json_name = "priceUnitPowers"];</code>
   * @param index The index of the element to return.
   * @return The priceUnitPowers at the given index.
   */
  int getPriceUnitPowers(int index);

  /**
   * <code>uint32 num_ticks = 4 [json_name = "numTicks"];</code>
   * @return The numTicks.
   */
  int getNumTicks();
}
