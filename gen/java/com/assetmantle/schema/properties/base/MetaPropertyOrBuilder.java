// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/properties/base/meta_property.proto

package com.assetmantle.schema.properties.base;

public interface MetaPropertyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.schema.properties.base.MetaProperty)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.assetmantle.schema.ids.base.PropertyID i_d = 1 [json_name = "iD"];</code>
   * @return Whether the iD field is set.
   */
  boolean hasID();
  /**
   * <code>.assetmantle.schema.ids.base.PropertyID i_d = 1 [json_name = "iD"];</code>
   * @return The iD.
   */
  com.assetmantle.schema.ids.base.PropertyID getID();
  /**
   * <code>.assetmantle.schema.ids.base.PropertyID i_d = 1 [json_name = "iD"];</code>
   */
  com.assetmantle.schema.ids.base.PropertyIDOrBuilder getIDOrBuilder();

  /**
   * <code>.assetmantle.schema.data.base.AnyData data = 2 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.assetmantle.schema.data.base.AnyData data = 2 [json_name = "data"];</code>
   * @return The data.
   */
  com.assetmantle.schema.data.base.AnyData getData();
  /**
   * <code>.assetmantle.schema.data.base.AnyData data = 2 [json_name = "data"];</code>
   */
  com.assetmantle.schema.data.base.AnyDataOrBuilder getDataOrBuilder();
}
