// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crisis/v1beta1/tx.proto

package com.cosmos.crisis.v1beta1;

public interface MsgVerifyInvariantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.crisis.v1beta1.MsgVerifyInvariant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * sender is the account address of private key to send coins to fee collector account.
   * </pre>
   *
   * <code>string sender = 1 [json_name = "sender", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <pre>
   * sender is the account address of private key to send coins to fee collector account.
   * </pre>
   *
   * <code>string sender = 1 [json_name = "sender", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <pre>
   * name of the invariant module.
   * </pre>
   *
   * <code>string invariant_module_name = 2 [json_name = "invariantModuleName"];</code>
   * @return The invariantModuleName.
   */
  java.lang.String getInvariantModuleName();
  /**
   * <pre>
   * name of the invariant module.
   * </pre>
   *
   * <code>string invariant_module_name = 2 [json_name = "invariantModuleName"];</code>
   * @return The bytes for invariantModuleName.
   */
  com.google.protobuf.ByteString
      getInvariantModuleNameBytes();

  /**
   * <pre>
   * invariant_route is the msg's invariant route.
   * </pre>
   *
   * <code>string invariant_route = 3 [json_name = "invariantRoute"];</code>
   * @return The invariantRoute.
   */
  java.lang.String getInvariantRoute();
  /**
   * <pre>
   * invariant_route is the msg's invariant route.
   * </pre>
   *
   * <code>string invariant_route = 3 [json_name = "invariantRoute"];</code>
   * @return The bytes for invariantRoute.
   */
  com.google.protobuf.ByteString
      getInvariantRouteBytes();
}
