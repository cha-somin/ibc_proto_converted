// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package com.cosmos.distribution.v1beta1;

public interface QueryValidatorOutstandingRewardsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * validator_address defines the validator address to query for.
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
   * @return The validatorAddress.
   */
  java.lang.String getValidatorAddress();
  /**
   * <pre>
   * validator_address defines the validator address to query for.
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
   * @return The bytes for validatorAddress.
   */
  com.google.protobuf.ByteString
      getValidatorAddressBytes();
}
