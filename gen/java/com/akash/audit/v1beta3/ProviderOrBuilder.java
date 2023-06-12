// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/audit/v1beta3/audit.proto

package com.akash.audit.v1beta3;

public interface ProviderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.audit.v1beta3.Provider)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string auditor = 2 [json_name = "auditor", (.gogoproto.jsontag) = "auditor", (.gogoproto.moretags) = "yaml:&#92;"auditor&#92;""];</code>
   * @return The auditor.
   */
  java.lang.String getAuditor();
  /**
   * <code>string auditor = 2 [json_name = "auditor", (.gogoproto.jsontag) = "auditor", (.gogoproto.moretags) = "yaml:&#92;"auditor&#92;""];</code>
   * @return The bytes for auditor.
   */
  com.google.protobuf.ByteString
      getAuditorBytes();

  /**
   * <code>repeated .akash.base.v1beta3.Attribute attributes = 4 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;"", (.gogoproto.castrepeated) = "github.com/akash-network/akash-api/go/node/types/v1beta3.Attributes"];</code>
   */
  java.util.List<com.akash.base.v1beta3.Attribute> 
      getAttributesList();
  /**
   * <code>repeated .akash.base.v1beta3.Attribute attributes = 4 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;"", (.gogoproto.castrepeated) = "github.com/akash-network/akash-api/go/node/types/v1beta3.Attributes"];</code>
   */
  com.akash.base.v1beta3.Attribute getAttributes(int index);
  /**
   * <code>repeated .akash.base.v1beta3.Attribute attributes = 4 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;"", (.gogoproto.castrepeated) = "github.com/akash-network/akash-api/go/node/types/v1beta3.Attributes"];</code>
   */
  int getAttributesCount();
  /**
   * <code>repeated .akash.base.v1beta3.Attribute attributes = 4 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;"", (.gogoproto.castrepeated) = "github.com/akash-network/akash-api/go/node/types/v1beta3.Attributes"];</code>
   */
  java.util.List<? extends com.akash.base.v1beta3.AttributeOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <code>repeated .akash.base.v1beta3.Attribute attributes = 4 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;"", (.gogoproto.castrepeated) = "github.com/akash-network/akash-api/go/node/types/v1beta3.Attributes"];</code>
   */
  com.akash.base.v1beta3.AttributeOrBuilder getAttributesOrBuilder(
      int index);
}
