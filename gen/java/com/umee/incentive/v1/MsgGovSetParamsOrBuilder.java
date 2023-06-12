// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/incentive/v1/tx.proto

package com.umee.incentive.v1;

public interface MsgGovSetParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.incentive.v1.MsgGovSetParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * authority must be the address of the governance account.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * authority must be the address of the governance account.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <code>.umee.incentive.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.umee.incentive.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.umee.incentive.v1.Params getParams();
  /**
   * <code>.umee.incentive.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.umee.incentive.v1.ParamsOrBuilder getParamsOrBuilder();
}
