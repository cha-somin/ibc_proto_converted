// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta1/query.proto

package com.akash.deployment.v1beta1;

public interface QueryDeploymentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.deployment.v1beta1.QueryDeploymentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .akash.deployment.v1beta1.QueryDeploymentResponse deployments = 1 [json_name = "deployments", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DeploymentResponses"];</code>
   */
  java.util.List<com.akash.deployment.v1beta1.QueryDeploymentResponse> 
      getDeploymentsList();
  /**
   * <code>repeated .akash.deployment.v1beta1.QueryDeploymentResponse deployments = 1 [json_name = "deployments", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DeploymentResponses"];</code>
   */
  com.akash.deployment.v1beta1.QueryDeploymentResponse getDeployments(int index);
  /**
   * <code>repeated .akash.deployment.v1beta1.QueryDeploymentResponse deployments = 1 [json_name = "deployments", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DeploymentResponses"];</code>
   */
  int getDeploymentsCount();
  /**
   * <code>repeated .akash.deployment.v1beta1.QueryDeploymentResponse deployments = 1 [json_name = "deployments", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DeploymentResponses"];</code>
   */
  java.util.List<? extends com.akash.deployment.v1beta1.QueryDeploymentResponseOrBuilder> 
      getDeploymentsOrBuilderList();
  /**
   * <code>repeated .akash.deployment.v1beta1.QueryDeploymentResponse deployments = 1 [json_name = "deployments", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DeploymentResponses"];</code>
   */
  com.akash.deployment.v1beta1.QueryDeploymentResponseOrBuilder getDeploymentsOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
