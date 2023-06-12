// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/tx.proto

package com.regen.ecocredit.v1alpha2;

public interface MsgCreateClassOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.ecocredit.v1alpha2.MsgCreateClass)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * admin is the address of the account that created the credit class.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The admin.
   */
  java.lang.String getAdmin();
  /**
   * <pre>
   * admin is the address of the account that created the credit class.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The bytes for admin.
   */
  com.google.protobuf.ByteString
      getAdminBytes();

  /**
   * <pre>
   * issuers are the account addresses of the approved issuers.
   * </pre>
   *
   * <code>repeated string issuers = 2 [json_name = "issuers"];</code>
   * @return A list containing the issuers.
   */
  java.util.List<java.lang.String>
      getIssuersList();
  /**
   * <pre>
   * issuers are the account addresses of the approved issuers.
   * </pre>
   *
   * <code>repeated string issuers = 2 [json_name = "issuers"];</code>
   * @return The count of issuers.
   */
  int getIssuersCount();
  /**
   * <pre>
   * issuers are the account addresses of the approved issuers.
   * </pre>
   *
   * <code>repeated string issuers = 2 [json_name = "issuers"];</code>
   * @param index The index of the element to return.
   * @return The issuers at the given index.
   */
  java.lang.String getIssuers(int index);
  /**
   * <pre>
   * issuers are the account addresses of the approved issuers.
   * </pre>
   *
   * <code>repeated string issuers = 2 [json_name = "issuers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the issuers at the given index.
   */
  com.google.protobuf.ByteString
      getIssuersBytes(int index);

  /**
   * <pre>
   * metadata is any arbitrary metadata to attached to the credit class.
   * </pre>
   *
   * <code>bytes metadata = 3 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.google.protobuf.ByteString getMetadata();

  /**
   * <pre>
   * credit_type_name describes the type of credit (e.g. "carbon", "biodiversity").
   * </pre>
   *
   * <code>string credit_type_name = 4 [json_name = "creditTypeName"];</code>
   * @return The creditTypeName.
   */
  java.lang.String getCreditTypeName();
  /**
   * <pre>
   * credit_type_name describes the type of credit (e.g. "carbon", "biodiversity").
   * </pre>
   *
   * <code>string credit_type_name = 4 [json_name = "creditTypeName"];</code>
   * @return The bytes for creditTypeName.
   */
  com.google.protobuf.ByteString
      getCreditTypeNameBytes();
}
