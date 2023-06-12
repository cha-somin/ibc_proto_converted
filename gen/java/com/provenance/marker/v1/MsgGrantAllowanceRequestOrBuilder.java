// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/tx.proto

package com.provenance.marker.v1;

public interface MsgGrantAllowanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.marker.v1.MsgGrantAllowanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string administrator = 2 [json_name = "administrator"];</code>
   * @return The administrator.
   */
  java.lang.String getAdministrator();
  /**
   * <code>string administrator = 2 [json_name = "administrator"];</code>
   * @return The bytes for administrator.
   */
  com.google.protobuf.ByteString
      getAdministratorBytes();

  /**
   * <pre>
   * grantee is the address of the user being granted an allowance of another user's funds.
   * </pre>
   *
   * <code>string grantee = 3 [json_name = "grantee"];</code>
   * @return The grantee.
   */
  java.lang.String getGrantee();
  /**
   * <pre>
   * grantee is the address of the user being granted an allowance of another user's funds.
   * </pre>
   *
   * <code>string grantee = 3 [json_name = "grantee"];</code>
   * @return The bytes for grantee.
   */
  com.google.protobuf.ByteString
      getGranteeBytes();

  /**
   * <pre>
   * allowance can be any of basic and filtered fee allowance (fee FeeGrant module).
   * </pre>
   *
   * <code>.google.protobuf.Any allowance = 4 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
   * @return Whether the allowance field is set.
   */
  boolean hasAllowance();
  /**
   * <pre>
   * allowance can be any of basic and filtered fee allowance (fee FeeGrant module).
   * </pre>
   *
   * <code>.google.protobuf.Any allowance = 4 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
   * @return The allowance.
   */
  com.google.protobuf.Any getAllowance();
  /**
   * <pre>
   * allowance can be any of basic and filtered fee allowance (fee FeeGrant module).
   * </pre>
   *
   * <code>.google.protobuf.Any allowance = 4 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
   */
  com.google.protobuf.AnyOrBuilder getAllowanceOrBuilder();
}
