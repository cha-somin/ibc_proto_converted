// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/classifications/queries/classification/query_response.proto

package com.assetmantle.modules.classifications.queries.classification;

public interface QueryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.modules.classifications.queries.classification.QueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .assetmantle.modules.classifications.mappable.Mappable list = 1 [json_name = "list"];</code>
   */
  java.util.List<com.assetmantle.modules.classifications.mappable.Mappable> 
      getListList();
  /**
   * <code>repeated .assetmantle.modules.classifications.mappable.Mappable list = 1 [json_name = "list"];</code>
   */
  com.assetmantle.modules.classifications.mappable.Mappable getList(int index);
  /**
   * <code>repeated .assetmantle.modules.classifications.mappable.Mappable list = 1 [json_name = "list"];</code>
   */
  int getListCount();
  /**
   * <code>repeated .assetmantle.modules.classifications.mappable.Mappable list = 1 [json_name = "list"];</code>
   */
  java.util.List<? extends com.assetmantle.modules.classifications.mappable.MappableOrBuilder> 
      getListOrBuilderList();
  /**
   * <code>repeated .assetmantle.modules.classifications.mappable.Mappable list = 1 [json_name = "list"];</code>
   */
  com.assetmantle.modules.classifications.mappable.MappableOrBuilder getListOrBuilder(
      int index);
}
