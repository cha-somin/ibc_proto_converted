// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta2/genesis.proto

package com.akash.deployment.v1beta2;

public interface GenesisDeploymentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.deployment.v1beta2.GenesisDeployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.akash.deployment.v1beta2.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();
  /**
   * <code>.akash.deployment.v1beta2.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
   * @return The deployment.
   */
  com.akash.deployment.v1beta2.Deployment getDeployment();
  /**
   * <code>.akash.deployment.v1beta2.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
   */
  com.akash.deployment.v1beta2.DeploymentOrBuilder getDeploymentOrBuilder();

  /**
   * <code>repeated .akash.deployment.v1beta2.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  java.util.List<com.akash.deployment.v1beta2.Group> 
      getGroupsList();
  /**
   * <code>repeated .akash.deployment.v1beta2.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  com.akash.deployment.v1beta2.Group getGroups(int index);
  /**
   * <code>repeated .akash.deployment.v1beta2.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  int getGroupsCount();
  /**
   * <code>repeated .akash.deployment.v1beta2.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  java.util.List<? extends com.akash.deployment.v1beta2.GroupOrBuilder> 
      getGroupsOrBuilderList();
  /**
   * <code>repeated .akash.deployment.v1beta2.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  com.akash.deployment.v1beta2.GroupOrBuilder getGroupsOrBuilder(
      int index);
}
