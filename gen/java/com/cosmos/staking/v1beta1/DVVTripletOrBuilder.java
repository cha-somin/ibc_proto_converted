// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package com.cosmos.staking.v1beta1;

public interface DVVTripletOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.DVVTriplet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The delegatorAddress.
   */
  java.lang.String getDelegatorAddress();
  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for delegatorAddress.
   */
  com.google.protobuf.ByteString
      getDelegatorAddressBytes();

  /**
   * <code>string validator_src_address = 2 [json_name = "validatorSrcAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The validatorSrcAddress.
   */
  java.lang.String getValidatorSrcAddress();
  /**
   * <code>string validator_src_address = 2 [json_name = "validatorSrcAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for validatorSrcAddress.
   */
  com.google.protobuf.ByteString
      getValidatorSrcAddressBytes();

  /**
   * <code>string validator_dst_address = 3 [json_name = "validatorDstAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The validatorDstAddress.
   */
  java.lang.String getValidatorDstAddress();
  /**
   * <code>string validator_dst_address = 3 [json_name = "validatorDstAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for validatorDstAddress.
   */
  com.google.protobuf.ByteString
      getValidatorDstAddressBytes();
}
