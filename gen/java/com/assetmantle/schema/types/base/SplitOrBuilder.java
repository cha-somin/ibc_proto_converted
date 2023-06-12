// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/types/base/split.proto

package com.assetmantle.schema.types.base;

public interface SplitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.schema.types.base.Split)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 1 [json_name = "ownerID"];</code>
   * @return Whether the ownerID field is set.
   */
  boolean hasOwnerID();
  /**
   * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 1 [json_name = "ownerID"];</code>
   * @return The ownerID.
   */
  com.assetmantle.schema.ids.base.IdentityID getOwnerID();
  /**
   * <code>.assetmantle.schema.ids.base.IdentityID owner_i_d = 1 [json_name = "ownerID"];</code>
   */
  com.assetmantle.schema.ids.base.IdentityIDOrBuilder getOwnerIDOrBuilder();

  /**
   * <code>.assetmantle.schema.ids.base.AnyOwnableID ownable_i_d = 2 [json_name = "ownableID"];</code>
   * @return Whether the ownableID field is set.
   */
  boolean hasOwnableID();
  /**
   * <code>.assetmantle.schema.ids.base.AnyOwnableID ownable_i_d = 2 [json_name = "ownableID"];</code>
   * @return The ownableID.
   */
  com.assetmantle.schema.ids.base.AnyOwnableID getOwnableID();
  /**
   * <code>.assetmantle.schema.ids.base.AnyOwnableID ownable_i_d = 2 [json_name = "ownableID"];</code>
   */
  com.assetmantle.schema.ids.base.AnyOwnableIDOrBuilder getOwnableIDOrBuilder();

  /**
   * <code>string value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 3 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
