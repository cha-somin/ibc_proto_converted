// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/tx.proto

package com.regen.ecocredit.v1alpha2;

public interface MsgUpdateClassAdminOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.ecocredit.v1alpha2.MsgUpdateClassAdmin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * admin is the address of the account that is the admin of the credit class.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The admin.
   */
  java.lang.String getAdmin();
  /**
   * <pre>
   * admin is the address of the account that is the admin of the credit class.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The bytes for admin.
   */
  com.google.protobuf.ByteString
      getAdminBytes();

  /**
   * <pre>
   * class_id is the unique ID of the credit class.
   * </pre>
   *
   * <code>string class_id = 2 [json_name = "classId"];</code>
   * @return The classId.
   */
  java.lang.String getClassId();
  /**
   * <pre>
   * class_id is the unique ID of the credit class.
   * </pre>
   *
   * <code>string class_id = 2 [json_name = "classId"];</code>
   * @return The bytes for classId.
   */
  com.google.protobuf.ByteString
      getClassIdBytes();

  /**
   * <pre>
   * new_admin is the address of the new admin of the credit class.
   * </pre>
   *
   * <code>string new_admin = 3 [json_name = "newAdmin"];</code>
   * @return The newAdmin.
   */
  java.lang.String getNewAdmin();
  /**
   * <pre>
   * new_admin is the address of the new admin of the credit class.
   * </pre>
   *
   * <code>string new_admin = 3 [json_name = "newAdmin"];</code>
   * @return The bytes for newAdmin.
   */
  com.google.protobuf.ByteString
      getNewAdminBytes();
}
