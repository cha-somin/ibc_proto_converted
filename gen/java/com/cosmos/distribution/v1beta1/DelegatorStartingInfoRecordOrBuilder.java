// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package com.cosmos.distribution.v1beta1;

public interface DelegatorStartingInfoRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.DelegatorStartingInfoRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * delegator_address is the address of the delegator.
   * </pre>
   *
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The delegatorAddress.
   */
  java.lang.String getDelegatorAddress();
  /**
   * <pre>
   * delegator_address is the address of the delegator.
   * </pre>
   *
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for delegatorAddress.
   */
  com.google.protobuf.ByteString
      getDelegatorAddressBytes();

  /**
   * <pre>
   * validator_address is the address of the validator.
   * </pre>
   *
   * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
   * @return The validatorAddress.
   */
  java.lang.String getValidatorAddress();
  /**
   * <pre>
   * validator_address is the address of the validator.
   * </pre>
   *
   * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
   * @return The bytes for validatorAddress.
   */
  com.google.protobuf.ByteString
      getValidatorAddressBytes();

  /**
   * <pre>
   * starting_info defines the starting info of a delegator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.DelegatorStartingInfo starting_info = 3 [json_name = "startingInfo", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return Whether the startingInfo field is set.
   */
  boolean hasStartingInfo();
  /**
   * <pre>
   * starting_info defines the starting info of a delegator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.DelegatorStartingInfo starting_info = 3 [json_name = "startingInfo", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return The startingInfo.
   */
  com.cosmos.distribution.v1beta1.DelegatorStartingInfo getStartingInfo();
  /**
   * <pre>
   * starting_info defines the starting info of a delegator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.DelegatorStartingInfo starting_info = 3 [json_name = "startingInfo", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.distribution.v1beta1.DelegatorStartingInfoOrBuilder getStartingInfoOrBuilder();
}
