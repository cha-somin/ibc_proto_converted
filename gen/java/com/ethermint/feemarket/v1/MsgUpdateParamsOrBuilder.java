// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/feemarket/v1/tx.proto

package com.ethermint.feemarket.v1;

public interface MsgUpdateParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ethermint.feemarket.v1.MsgUpdateParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * authority is the address of the governance account.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * authority is the address of the governance account.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <pre>
   * params defines the x/feemarket parameters to update.
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.ethermint.feemarket.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines the x/feemarket parameters to update.
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.ethermint.feemarket.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.ethermint.feemarket.v1.Params getParams();
  /**
   * <pre>
   * params defines the x/feemarket parameters to update.
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.ethermint.feemarket.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.ethermint.feemarket.v1.ParamsOrBuilder getParamsOrBuilder();
}
