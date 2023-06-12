// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

public interface QueryFeeDiscountAccountInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 tier_level = 1 [json_name = "tierLevel"];</code>
   * @return The tierLevel.
   */
  long getTierLevel();

  /**
   * <code>.injective.exchange.v1beta1.FeeDiscountTierInfo account_info = 2 [json_name = "accountInfo"];</code>
   * @return Whether the accountInfo field is set.
   */
  boolean hasAccountInfo();
  /**
   * <code>.injective.exchange.v1beta1.FeeDiscountTierInfo account_info = 2 [json_name = "accountInfo"];</code>
   * @return The accountInfo.
   */
  com.injective.exchange.v1beta1.FeeDiscountTierInfo getAccountInfo();
  /**
   * <code>.injective.exchange.v1beta1.FeeDiscountTierInfo account_info = 2 [json_name = "accountInfo"];</code>
   */
  com.injective.exchange.v1beta1.FeeDiscountTierInfoOrBuilder getAccountInfoOrBuilder();

  /**
   * <code>.injective.exchange.v1beta1.FeeDiscountTierTTL account_ttl = 3 [json_name = "accountTtl"];</code>
   * @return Whether the accountTtl field is set.
   */
  boolean hasAccountTtl();
  /**
   * <code>.injective.exchange.v1beta1.FeeDiscountTierTTL account_ttl = 3 [json_name = "accountTtl"];</code>
   * @return The accountTtl.
   */
  com.injective.exchange.v1beta1.FeeDiscountTierTTL getAccountTtl();
  /**
   * <code>.injective.exchange.v1beta1.FeeDiscountTierTTL account_ttl = 3 [json_name = "accountTtl"];</code>
   */
  com.injective.exchange.v1beta1.FeeDiscountTierTTLOrBuilder getAccountTtlOrBuilder();
}
