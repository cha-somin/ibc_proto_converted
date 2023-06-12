// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/slashing/module/v1/module.proto

package com.cosmos.slashing.module.v1;

public interface ModuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.slashing.module.v1.Module)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * authority defines the custom module authority. If not set, defaults to the governance module.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority"];</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * authority defines the custom module authority. If not set, defaults to the governance module.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority"];</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();
}
