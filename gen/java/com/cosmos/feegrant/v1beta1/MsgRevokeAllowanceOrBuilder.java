// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/tx.proto

package com.cosmos.feegrant.v1beta1;

public interface MsgRevokeAllowanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.feegrant.v1beta1.MsgRevokeAllowance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * granter is the address of the user granting an allowance of their funds.
   * </pre>
   *
   * <code>string granter = 1 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The granter.
   */
  java.lang.String getGranter();
  /**
   * <pre>
   * granter is the address of the user granting an allowance of their funds.
   * </pre>
   *
   * <code>string granter = 1 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for granter.
   */
  com.google.protobuf.ByteString
      getGranterBytes();

  /**
   * <pre>
   * grantee is the address of the user being granted an allowance of another user's funds.
   * </pre>
   *
   * <code>string grantee = 2 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The grantee.
   */
  java.lang.String getGrantee();
  /**
   * <pre>
   * grantee is the address of the user being granted an allowance of another user's funds.
   * </pre>
   *
   * <code>string grantee = 2 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for grantee.
   */
  com.google.protobuf.ByteString
      getGranteeBytes();
}
