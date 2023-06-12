// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package com.tendermint.abci;

public interface MisbehaviorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.abci.Misbehavior)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tendermint.abci.MisbehaviorType type = 1 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.tendermint.abci.MisbehaviorType type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  com.tendermint.abci.MisbehaviorType getType();

  /**
   * <pre>
   * The offending validator
   * </pre>
   *
   * <code>.tendermint.abci.Validator validator = 2 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   * @return Whether the validator field is set.
   */
  boolean hasValidator();
  /**
   * <pre>
   * The offending validator
   * </pre>
   *
   * <code>.tendermint.abci.Validator validator = 2 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   * @return The validator.
   */
  com.tendermint.abci.Validator getValidator();
  /**
   * <pre>
   * The offending validator
   * </pre>
   *
   * <code>.tendermint.abci.Validator validator = 2 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   */
  com.tendermint.abci.ValidatorOrBuilder getValidatorOrBuilder();

  /**
   * <pre>
   * The height when the offense occurred
   * </pre>
   *
   * <code>int64 height = 3 [json_name = "height"];</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <pre>
   * The corresponding time where the offense occurred
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <pre>
   * The corresponding time where the offense occurred
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <pre>
   * The corresponding time where the offense occurred
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <pre>
   * Total voting power of the validator set in case the ABCI application does
   * not store historical validators.
   * https://github.com/tendermint/tendermint/issues/4581
   * </pre>
   *
   * <code>int64 total_voting_power = 5 [json_name = "totalVotingPower"];</code>
   * @return The totalVotingPower.
   */
  long getTotalVotingPower();
}
