// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/base/v1beta1/resource.proto

package com.akash.base.v1beta1;

public interface MemoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.base.v1beta1.Memory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
   * @return Whether the quantity field is set.
   */
  boolean hasQuantity();
  /**
   * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
   * @return The quantity.
   */
  com.akash.base.v1beta1.ResourceValue getQuantity();
  /**
   * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
   */
  com.akash.base.v1beta1.ResourceValueOrBuilder getQuantityOrBuilder();

  /**
   * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
   */
  java.util.List<com.akash.base.v1beta1.Attribute> 
      getAttributesList();
  /**
   * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
   */
  com.akash.base.v1beta1.Attribute getAttributes(int index);
  /**
   * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
   */
  int getAttributesCount();
  /**
   * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
   */
  java.util.List<? extends com.akash.base.v1beta1.AttributeOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
   */
  com.akash.base.v1beta1.AttributeOrBuilder getAttributesOrBuilder(
      int index);
}
