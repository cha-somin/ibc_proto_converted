// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/vpn/v1/genesis.proto

package com.sentinel.vpn.v1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sentinel.vpn.v1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .sentinel.deposit.v1.Deposit deposits = 1 [json_name = "deposits", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.sentinel.deposit.v1.Deposit> 
      getDepositsList();
  /**
   * <code>repeated .sentinel.deposit.v1.Deposit deposits = 1 [json_name = "deposits", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.deposit.v1.Deposit getDeposits(int index);
  /**
   * <code>repeated .sentinel.deposit.v1.Deposit deposits = 1 [json_name = "deposits", (.gogoproto.nullable) = false];</code>
   */
  int getDepositsCount();
  /**
   * <code>repeated .sentinel.deposit.v1.Deposit deposits = 1 [json_name = "deposits", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.sentinel.deposit.v1.DepositOrBuilder> 
      getDepositsOrBuilderList();
  /**
   * <code>repeated .sentinel.deposit.v1.Deposit deposits = 1 [json_name = "deposits", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.deposit.v1.DepositOrBuilder getDepositsOrBuilder(
      int index);

  /**
   * <code>.sentinel.node.v2.GenesisState nodes = 2 [json_name = "nodes"];</code>
   * @return Whether the nodes field is set.
   */
  boolean hasNodes();
  /**
   * <code>.sentinel.node.v2.GenesisState nodes = 2 [json_name = "nodes"];</code>
   * @return The nodes.
   */
  com.sentinel.node.v2.GenesisState getNodes();
  /**
   * <code>.sentinel.node.v2.GenesisState nodes = 2 [json_name = "nodes"];</code>
   */
  com.sentinel.node.v2.GenesisStateOrBuilder getNodesOrBuilder();

  /**
   * <code>repeated .sentinel.plan.v2.GenesisPlan plans = 3 [json_name = "plans", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.sentinel.plan.v2.GenesisPlan> 
      getPlansList();
  /**
   * <code>repeated .sentinel.plan.v2.GenesisPlan plans = 3 [json_name = "plans", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.plan.v2.GenesisPlan getPlans(int index);
  /**
   * <code>repeated .sentinel.plan.v2.GenesisPlan plans = 3 [json_name = "plans", (.gogoproto.nullable) = false];</code>
   */
  int getPlansCount();
  /**
   * <code>repeated .sentinel.plan.v2.GenesisPlan plans = 3 [json_name = "plans", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.sentinel.plan.v2.GenesisPlanOrBuilder> 
      getPlansOrBuilderList();
  /**
   * <code>repeated .sentinel.plan.v2.GenesisPlan plans = 3 [json_name = "plans", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.plan.v2.GenesisPlanOrBuilder getPlansOrBuilder(
      int index);

  /**
   * <code>.sentinel.provider.v2.GenesisState providers = 4 [json_name = "providers"];</code>
   * @return Whether the providers field is set.
   */
  boolean hasProviders();
  /**
   * <code>.sentinel.provider.v2.GenesisState providers = 4 [json_name = "providers"];</code>
   * @return The providers.
   */
  com.sentinel.provider.v2.GenesisState getProviders();
  /**
   * <code>.sentinel.provider.v2.GenesisState providers = 4 [json_name = "providers"];</code>
   */
  com.sentinel.provider.v2.GenesisStateOrBuilder getProvidersOrBuilder();

  /**
   * <code>.sentinel.session.v2.GenesisState sessions = 5 [json_name = "sessions"];</code>
   * @return Whether the sessions field is set.
   */
  boolean hasSessions();
  /**
   * <code>.sentinel.session.v2.GenesisState sessions = 5 [json_name = "sessions"];</code>
   * @return The sessions.
   */
  com.sentinel.session.v2.GenesisState getSessions();
  /**
   * <code>.sentinel.session.v2.GenesisState sessions = 5 [json_name = "sessions"];</code>
   */
  com.sentinel.session.v2.GenesisStateOrBuilder getSessionsOrBuilder();

  /**
   * <code>.sentinel.subscription.v2.GenesisState subscriptions = 6 [json_name = "subscriptions"];</code>
   * @return Whether the subscriptions field is set.
   */
  boolean hasSubscriptions();
  /**
   * <code>.sentinel.subscription.v2.GenesisState subscriptions = 6 [json_name = "subscriptions"];</code>
   * @return The subscriptions.
   */
  com.sentinel.subscription.v2.GenesisState getSubscriptions();
  /**
   * <code>.sentinel.subscription.v2.GenesisState subscriptions = 6 [json_name = "subscriptions"];</code>
   */
  com.sentinel.subscription.v2.GenesisStateOrBuilder getSubscriptionsOrBuilder();
}
