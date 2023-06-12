// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta1/group.proto

package com.akash.deployment.v1beta1;

public interface GroupSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.deployment.v1beta1.GroupSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name", (.gogoproto.jsontag) = "name", (.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name", (.gogoproto.jsontag) = "name", (.gogoproto.moretags) = "yaml:&#92;"name&#92;""];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.akash.base.v1beta1.PlacementRequirements requirements = 2 [json_name = "requirements", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "requirements", (.gogoproto.moretags) = "yaml:&#92;"requirements&#92;""];</code>
   * @return Whether the requirements field is set.
   */
  boolean hasRequirements();
  /**
   * <code>.akash.base.v1beta1.PlacementRequirements requirements = 2 [json_name = "requirements", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "requirements", (.gogoproto.moretags) = "yaml:&#92;"requirements&#92;""];</code>
   * @return The requirements.
   */
  com.akash.base.v1beta1.PlacementRequirements getRequirements();
  /**
   * <code>.akash.base.v1beta1.PlacementRequirements requirements = 2 [json_name = "requirements", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "requirements", (.gogoproto.moretags) = "yaml:&#92;"requirements&#92;""];</code>
   */
  com.akash.base.v1beta1.PlacementRequirementsOrBuilder getRequirementsOrBuilder();

  /**
   * <code>repeated .akash.deployment.v1beta1.Resource resources = 3 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "resources", (.gogoproto.moretags) = "yaml:&#92;"resources&#92;""];</code>
   */
  java.util.List<com.akash.deployment.v1beta1.Resource> 
      getResourcesList();
  /**
   * <code>repeated .akash.deployment.v1beta1.Resource resources = 3 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "resources", (.gogoproto.moretags) = "yaml:&#92;"resources&#92;""];</code>
   */
  com.akash.deployment.v1beta1.Resource getResources(int index);
  /**
   * <code>repeated .akash.deployment.v1beta1.Resource resources = 3 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "resources", (.gogoproto.moretags) = "yaml:&#92;"resources&#92;""];</code>
   */
  int getResourcesCount();
  /**
   * <code>repeated .akash.deployment.v1beta1.Resource resources = 3 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "resources", (.gogoproto.moretags) = "yaml:&#92;"resources&#92;""];</code>
   */
  java.util.List<? extends com.akash.deployment.v1beta1.ResourceOrBuilder> 
      getResourcesOrBuilderList();
  /**
   * <code>repeated .akash.deployment.v1beta1.Resource resources = 3 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "resources", (.gogoproto.moretags) = "yaml:&#92;"resources&#92;""];</code>
   */
  com.akash.deployment.v1beta1.ResourceOrBuilder getResourcesOrBuilder(
      int index);
}
