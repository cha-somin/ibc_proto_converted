// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/identities/transactions/provision/message.proto

package com.assetmantle.modules.identities.transactions.provision;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.modules.identities.transactions.provision.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>string to = 2 [json_name = "to"];</code>
   * @return The to.
   */
  java.lang.String getTo();
  /**
   * <code>string to = 2 [json_name = "to"];</code>
   * @return The bytes for to.
   */
  com.google.protobuf.ByteString
      getToBytes();

  /**
   * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
   * @return Whether the identityID field is set.
   */
  boolean hasIdentityID();
  /**
   * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
   * @return The identityID.
   */
  com.assetmantle.schema.ids.base.IdentityID getIdentityID();
  /**
   * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
   */
  com.assetmantle.schema.ids.base.IdentityIDOrBuilder getIdentityIDOrBuilder();
}
