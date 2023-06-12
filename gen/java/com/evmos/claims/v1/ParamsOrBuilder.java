// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/claims/v1/genesis.proto

package com.evmos.claims.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:evmos.claims.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * enable_claims is the parameter to enable the claiming process
   * </pre>
   *
   * <code>bool enable_claims = 1 [json_name = "enableClaims"];</code>
   * @return The enableClaims.
   */
  boolean getEnableClaims();

  /**
   * <pre>
   * airdrop_start_time defines the timestamp of the airdrop start
   * </pre>
   *
   * <code>.google.protobuf.Timestamp airdrop_start_time = 2 [json_name = "airdropStartTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the airdropStartTime field is set.
   */
  boolean hasAirdropStartTime();
  /**
   * <pre>
   * airdrop_start_time defines the timestamp of the airdrop start
   * </pre>
   *
   * <code>.google.protobuf.Timestamp airdrop_start_time = 2 [json_name = "airdropStartTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The airdropStartTime.
   */
  com.google.protobuf.Timestamp getAirdropStartTime();
  /**
   * <pre>
   * airdrop_start_time defines the timestamp of the airdrop start
   * </pre>
   *
   * <code>.google.protobuf.Timestamp airdrop_start_time = 2 [json_name = "airdropStartTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getAirdropStartTimeOrBuilder();

  /**
   * <pre>
   * duration_until_decay of claimable tokens begin
   * </pre>
   *
   * <code>.google.protobuf.Duration duration_until_decay = 3 [json_name = "durationUntilDecay", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return Whether the durationUntilDecay field is set.
   */
  boolean hasDurationUntilDecay();
  /**
   * <pre>
   * duration_until_decay of claimable tokens begin
   * </pre>
   *
   * <code>.google.protobuf.Duration duration_until_decay = 3 [json_name = "durationUntilDecay", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return The durationUntilDecay.
   */
  com.google.protobuf.Duration getDurationUntilDecay();
  /**
   * <pre>
   * duration_until_decay of claimable tokens begin
   * </pre>
   *
   * <code>.google.protobuf.Duration duration_until_decay = 3 [json_name = "durationUntilDecay", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationUntilDecayOrBuilder();

  /**
   * <pre>
   * duration_of_decay for token claim decay period
   * </pre>
   *
   * <code>.google.protobuf.Duration duration_of_decay = 4 [json_name = "durationOfDecay", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return Whether the durationOfDecay field is set.
   */
  boolean hasDurationOfDecay();
  /**
   * <pre>
   * duration_of_decay for token claim decay period
   * </pre>
   *
   * <code>.google.protobuf.Duration duration_of_decay = 4 [json_name = "durationOfDecay", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return The durationOfDecay.
   */
  com.google.protobuf.Duration getDurationOfDecay();
  /**
   * <pre>
   * duration_of_decay for token claim decay period
   * </pre>
   *
   * <code>.google.protobuf.Duration duration_of_decay = 4 [json_name = "durationOfDecay", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOfDecayOrBuilder();

  /**
   * <pre>
   * claims_denom is the denomination of the claimable coin
   * </pre>
   *
   * <code>string claims_denom = 5 [json_name = "claimsDenom"];</code>
   * @return The claimsDenom.
   */
  java.lang.String getClaimsDenom();
  /**
   * <pre>
   * claims_denom is the denomination of the claimable coin
   * </pre>
   *
   * <code>string claims_denom = 5 [json_name = "claimsDenom"];</code>
   * @return The bytes for claimsDenom.
   */
  com.google.protobuf.ByteString
      getClaimsDenomBytes();

  /**
   * <pre>
   * authorized_channels is the list of authorized channel identifiers that can perform address
   * attestations via IBC.
   * </pre>
   *
   * <code>repeated string authorized_channels = 6 [json_name = "authorizedChannels"];</code>
   * @return A list containing the authorizedChannels.
   */
  java.util.List<java.lang.String>
      getAuthorizedChannelsList();
  /**
   * <pre>
   * authorized_channels is the list of authorized channel identifiers that can perform address
   * attestations via IBC.
   * </pre>
   *
   * <code>repeated string authorized_channels = 6 [json_name = "authorizedChannels"];</code>
   * @return The count of authorizedChannels.
   */
  int getAuthorizedChannelsCount();
  /**
   * <pre>
   * authorized_channels is the list of authorized channel identifiers that can perform address
   * attestations via IBC.
   * </pre>
   *
   * <code>repeated string authorized_channels = 6 [json_name = "authorizedChannels"];</code>
   * @param index The index of the element to return.
   * @return The authorizedChannels at the given index.
   */
  java.lang.String getAuthorizedChannels(int index);
  /**
   * <pre>
   * authorized_channels is the list of authorized channel identifiers that can perform address
   * attestations via IBC.
   * </pre>
   *
   * <code>repeated string authorized_channels = 6 [json_name = "authorizedChannels"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the authorizedChannels at the given index.
   */
  com.google.protobuf.ByteString
      getAuthorizedChannelsBytes(int index);

  /**
   * <pre>
   * evm_channels is the list of channel identifiers from EVM compatible chains
   * </pre>
   *
   * <code>repeated string evm_channels = 7 [json_name = "evmChannels", (.gogoproto.customname) = "EVMChannels"];</code>
   * @return A list containing the evmChannels.
   */
  java.util.List<java.lang.String>
      getEvmChannelsList();
  /**
   * <pre>
   * evm_channels is the list of channel identifiers from EVM compatible chains
   * </pre>
   *
   * <code>repeated string evm_channels = 7 [json_name = "evmChannels", (.gogoproto.customname) = "EVMChannels"];</code>
   * @return The count of evmChannels.
   */
  int getEvmChannelsCount();
  /**
   * <pre>
   * evm_channels is the list of channel identifiers from EVM compatible chains
   * </pre>
   *
   * <code>repeated string evm_channels = 7 [json_name = "evmChannels", (.gogoproto.customname) = "EVMChannels"];</code>
   * @param index The index of the element to return.
   * @return The evmChannels at the given index.
   */
  java.lang.String getEvmChannels(int index);
  /**
   * <pre>
   * evm_channels is the list of channel identifiers from EVM compatible chains
   * </pre>
   *
   * <code>repeated string evm_channels = 7 [json_name = "evmChannels", (.gogoproto.customname) = "EVMChannels"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the evmChannels at the given index.
   */
  com.google.protobuf.ByteString
      getEvmChannelsBytes(int index);
}
