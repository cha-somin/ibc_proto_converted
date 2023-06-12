// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/liquidstaking/v1beta1/liquidstaking.proto

package com.crescent.liquidstaking.v1beta1;

public interface VotingPowerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crescent.liquidstaking.v1beta1.VotingPower)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * voter defines the address of the voter; bech encoded in JSON.
   * </pre>
   *
   * <code>string voter = 1 [json_name = "voter"];</code>
   * @return The voter.
   */
  java.lang.String getVoter();
  /**
   * <pre>
   * voter defines the address of the voter; bech encoded in JSON.
   * </pre>
   *
   * <code>string voter = 1 [json_name = "voter"];</code>
   * @return The bytes for voter.
   */
  com.google.protobuf.ByteString
      getVoterBytes();

  /**
   * <pre>
   * staking_voting_power return the voting power of staking that can be exercised.
   * </pre>
   *
   * <code>string staking_voting_power = 2 [json_name = "stakingVotingPower", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The stakingVotingPower.
   */
  java.lang.String getStakingVotingPower();
  /**
   * <pre>
   * staking_voting_power return the voting power of staking that can be exercised.
   * </pre>
   *
   * <code>string staking_voting_power = 2 [json_name = "stakingVotingPower", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for stakingVotingPower.
   */
  com.google.protobuf.ByteString
      getStakingVotingPowerBytes();

  /**
   * <pre>
   * liquid_staking_voting_power return the voting power of liquid staking that can be exercised.
   * </pre>
   *
   * <code>string liquid_staking_voting_power = 3 [json_name = "liquidStakingVotingPower", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The liquidStakingVotingPower.
   */
  java.lang.String getLiquidStakingVotingPower();
  /**
   * <pre>
   * liquid_staking_voting_power return the voting power of liquid staking that can be exercised.
   * </pre>
   *
   * <code>string liquid_staking_voting_power = 3 [json_name = "liquidStakingVotingPower", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for liquidStakingVotingPower.
   */
  com.google.protobuf.ByteString
      getLiquidStakingVotingPowerBytes();

  /**
   * <pre>
   * validator_voting_power return the voting power of the validator if the voter is the validator operator that can be
   * exercised.
   * </pre>
   *
   * <code>string validator_voting_power = 4 [json_name = "validatorVotingPower", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The validatorVotingPower.
   */
  java.lang.String getValidatorVotingPower();
  /**
   * <pre>
   * validator_voting_power return the voting power of the validator if the voter is the validator operator that can be
   * exercised.
   * </pre>
   *
   * <code>string validator_voting_power = 4 [json_name = "validatorVotingPower", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for validatorVotingPower.
   */
  com.google.protobuf.ByteString
      getValidatorVotingPowerBytes();
}
