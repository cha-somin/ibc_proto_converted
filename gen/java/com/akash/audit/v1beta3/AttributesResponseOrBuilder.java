// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/audit/v1beta3/audit.proto

package com.akash.audit.v1beta3;

public interface AttributesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.audit.v1beta3.AttributesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
   */
  java.util.List<com.akash.audit.v1beta3.AuditedAttributes> 
      getAttributesList();
  /**
   * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
   */
  com.akash.audit.v1beta3.AuditedAttributes getAttributes(int index);
  /**
   * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
   */
  int getAttributesCount();
  /**
   * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
   */
  java.util.List<? extends com.akash.audit.v1beta3.AuditedAttributesOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
   */
  com.akash.audit.v1beta3.AuditedAttributesOrBuilder getAttributesOrBuilder(
      int index);
}
