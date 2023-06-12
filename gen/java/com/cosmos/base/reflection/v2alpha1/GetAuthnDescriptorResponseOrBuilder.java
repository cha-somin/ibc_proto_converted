// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package com.cosmos.base.reflection.v2alpha1;

public interface GetAuthnDescriptorResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.reflection.v2alpha1.GetAuthnDescriptorResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * authn describes how to authenticate to the application when sending transactions
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.AuthnDescriptor authn = 1 [json_name = "authn"];</code>
   * @return Whether the authn field is set.
   */
  boolean hasAuthn();
  /**
   * <pre>
   * authn describes how to authenticate to the application when sending transactions
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.AuthnDescriptor authn = 1 [json_name = "authn"];</code>
   * @return The authn.
   */
  com.cosmos.base.reflection.v2alpha1.AuthnDescriptor getAuthn();
  /**
   * <pre>
   * authn describes how to authenticate to the application when sending transactions
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.AuthnDescriptor authn = 1 [json_name = "authn"];</code>
   */
  com.cosmos.base.reflection.v2alpha1.AuthnDescriptorOrBuilder getAuthnOrBuilder();
}
