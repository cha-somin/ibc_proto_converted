// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/subscription/v2/genesis.proto

package com.sentinel.subscription.v2;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sentinel.subscription.v2.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .sentinel.subscription.v2.GenesisSubscription subscriptions = 1 [json_name = "subscriptions", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.sentinel.subscription.v2.GenesisSubscription> 
      getSubscriptionsList();
  /**
   * <code>repeated .sentinel.subscription.v2.GenesisSubscription subscriptions = 1 [json_name = "subscriptions", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.subscription.v2.GenesisSubscription getSubscriptions(int index);
  /**
   * <code>repeated .sentinel.subscription.v2.GenesisSubscription subscriptions = 1 [json_name = "subscriptions", (.gogoproto.nullable) = false];</code>
   */
  int getSubscriptionsCount();
  /**
   * <code>repeated .sentinel.subscription.v2.GenesisSubscription subscriptions = 1 [json_name = "subscriptions", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.sentinel.subscription.v2.GenesisSubscriptionOrBuilder> 
      getSubscriptionsOrBuilderList();
  /**
   * <code>repeated .sentinel.subscription.v2.GenesisSubscription subscriptions = 1 [json_name = "subscriptions", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.subscription.v2.GenesisSubscriptionOrBuilder getSubscriptionsOrBuilder(
      int index);

  /**
   * <code>.sentinel.subscription.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.sentinel.subscription.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.sentinel.subscription.v2.Params getParams();
  /**
   * <code>.sentinel.subscription.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.subscription.v2.ParamsOrBuilder getParamsOrBuilder();
}
