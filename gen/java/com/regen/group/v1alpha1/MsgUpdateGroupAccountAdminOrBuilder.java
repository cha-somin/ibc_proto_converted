// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/group/v1alpha1/tx.proto

package com.regen.group.v1alpha1;

public interface MsgUpdateGroupAccountAdminOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.group.v1alpha1.MsgUpdateGroupAccountAdmin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * admin is the account address of the group admin.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The admin.
   */
  java.lang.String getAdmin();
  /**
   * <pre>
   * admin is the account address of the group admin.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The bytes for admin.
   */
  com.google.protobuf.ByteString
      getAdminBytes();

  /**
   * <pre>
   * address is the group account address.
   * </pre>
   *
   * <code>string address = 2 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * address is the group account address.
   * </pre>
   *
   * <code>string address = 2 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * new_admin is the new group account admin.
   * </pre>
   *
   * <code>string new_admin = 3 [json_name = "newAdmin"];</code>
   * @return The newAdmin.
   */
  java.lang.String getNewAdmin();
  /**
   * <pre>
   * new_admin is the new group account admin.
   * </pre>
   *
   * <code>string new_admin = 3 [json_name = "newAdmin"];</code>
   * @return The bytes for newAdmin.
   */
  com.google.protobuf.ByteString
      getNewAdminBytes();
}
