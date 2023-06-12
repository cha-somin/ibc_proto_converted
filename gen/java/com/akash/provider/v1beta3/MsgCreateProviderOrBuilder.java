// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/provider/v1beta3/provider.proto

package com.akash.provider.v1beta3;

public interface MsgCreateProviderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.provider.v1beta3.MsgCreateProvider)
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
   * <code>string host_uri = 2 [json_name = "hostUri", (.gogoproto.customname) = "HostURI", (.gogoproto.jsontag) = "host_uri", (.gogoproto.moretags) = "yaml:&#92;"host_uri&#92;""];</code>
   * @return The hostUri.
   */
  java.lang.String getHostUri();
  /**
   * <code>string host_uri = 2 [json_name = "hostUri", (.gogoproto.customname) = "HostURI", (.gogoproto.jsontag) = "host_uri", (.gogoproto.moretags) = "yaml:&#92;"host_uri&#92;""];</code>
   * @return The bytes for hostUri.
   */
  com.google.protobuf.ByteString
      getHostUriBytes();

  /**
   * <code>repeated .akash.base.v1beta3.Attribute attributes = 3 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;"", (.gogoproto.castrepeated) = "github.com/akash-network/akash-api/go/node/types/v1beta3.Attributes"];</code>
   */
  java.util.List<com.akash.base.v1beta3.Attribute> 
      getAttributesList();
  /**
   * <code>repeated .akash.base.v1beta3.Attribute attributes = 3 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;"", (.gogoproto.castrepeated) = "github.com/akash-network/akash-api/go/node/types/v1beta3.Attributes"];</code>
   */
  com.akash.base.v1beta3.Attribute getAttributes(int index);
  /**
   * <code>repeated .akash.base.v1beta3.Attribute attributes = 3 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;"", (.gogoproto.castrepeated) = "github.com/akash-network/akash-api/go/node/types/v1beta3.Attributes"];</code>
   */
  int getAttributesCount();
  /**
   * <code>repeated .akash.base.v1beta3.Attribute attributes = 3 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;"", (.gogoproto.castrepeated) = "github.com/akash-network/akash-api/go/node/types/v1beta3.Attributes"];</code>
   */
  java.util.List<? extends com.akash.base.v1beta3.AttributeOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <code>repeated .akash.base.v1beta3.Attribute attributes = 3 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;"", (.gogoproto.castrepeated) = "github.com/akash-network/akash-api/go/node/types/v1beta3.Attributes"];</code>
   */
  com.akash.base.v1beta3.AttributeOrBuilder getAttributesOrBuilder(
      int index);

  /**
   * <code>.akash.provider.v1beta3.ProviderInfo info = 4 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "info", (.gogoproto.moretags) = "yaml:&#92;"info&#92;""];</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.akash.provider.v1beta3.ProviderInfo info = 4 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "info", (.gogoproto.moretags) = "yaml:&#92;"info&#92;""];</code>
   * @return The info.
   */
  com.akash.provider.v1beta3.ProviderInfo getInfo();
  /**
   * <code>.akash.provider.v1beta3.ProviderInfo info = 4 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "info", (.gogoproto.moretags) = "yaml:&#92;"info&#92;""];</code>
   */
  com.akash.provider.v1beta3.ProviderInfoOrBuilder getInfoOrBuilder();
}
