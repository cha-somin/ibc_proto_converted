// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta1/query.proto

package com.akash.deployment.v1beta1;

public interface QueryDeploymentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.deployment.v1beta1.QueryDeploymentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.akash.deployment.v1beta1.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();
  /**
   * <code>.akash.deployment.v1beta1.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
   * @return The deployment.
   */
  com.akash.deployment.v1beta1.Deployment getDeployment();
  /**
   * <code>.akash.deployment.v1beta1.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
   */
  com.akash.deployment.v1beta1.DeploymentOrBuilder getDeploymentOrBuilder();

  /**
   * <code>repeated .akash.deployment.v1beta1.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  java.util.List<com.akash.deployment.v1beta1.Group> 
      getGroupsList();
  /**
   * <code>repeated .akash.deployment.v1beta1.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  com.akash.deployment.v1beta1.Group getGroups(int index);
  /**
   * <code>repeated .akash.deployment.v1beta1.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  int getGroupsCount();
  /**
   * <code>repeated .akash.deployment.v1beta1.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  java.util.List<? extends com.akash.deployment.v1beta1.GroupOrBuilder> 
      getGroupsOrBuilderList();
  /**
   * <code>repeated .akash.deployment.v1beta1.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  com.akash.deployment.v1beta1.GroupOrBuilder getGroupsOrBuilder(
      int index);

  /**
   * <code>.akash.escrow.v1beta1.Account escrow_account = 3 [json_name = "escrowAccount", (.gogoproto.nullable) = false];</code>
   * @return Whether the escrowAccount field is set.
   */
  boolean hasEscrowAccount();
  /**
   * <code>.akash.escrow.v1beta1.Account escrow_account = 3 [json_name = "escrowAccount", (.gogoproto.nullable) = false];</code>
   * @return The escrowAccount.
   */
  com.akash.escrow.v1beta1.Account getEscrowAccount();
  /**
   * <code>.akash.escrow.v1beta1.Account escrow_account = 3 [json_name = "escrowAccount", (.gogoproto.nullable) = false];</code>
   */
  com.akash.escrow.v1beta1.AccountOrBuilder getEscrowAccountOrBuilder();
}
