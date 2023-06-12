// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v3/msgs.proto

package com.desmos.posts.v3;

public interface MsgUpdateParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.posts.v3.MsgUpdateParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * authority is the address that controls the module (defaults to x/gov unless
   * overwritten).
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * authority is the address that controls the module (defaults to x/gov unless
   * overwritten).
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <pre>
   * params defines the parameters to update.
   *
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.desmos.posts.v3.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines the parameters to update.
   *
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.desmos.posts.v3.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.desmos.posts.v3.Params getParams();
  /**
   * <pre>
   * params defines the parameters to update.
   *
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.desmos.posts.v3.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.desmos.posts.v3.ParamsOrBuilder getParamsOrBuilder();
}
