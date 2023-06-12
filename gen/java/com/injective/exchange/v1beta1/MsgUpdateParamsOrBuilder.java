// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

public interface MsgUpdateParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.MsgUpdateParams)
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
   * params defines the exchange parameters to update.
   *
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines the exchange parameters to update.
   *
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.injective.exchange.v1beta1.Params getParams();
  /**
   * <pre>
   * params defines the exchange parameters to update.
   *
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.injective.exchange.v1beta1.ParamsOrBuilder getParamsOrBuilder();
}
