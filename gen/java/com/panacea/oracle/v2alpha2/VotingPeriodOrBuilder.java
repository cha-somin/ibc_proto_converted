// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/oracle/v2alpha2/oracle.proto

package com.panacea.oracle.v2alpha2;

public interface VotingPeriodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.oracle.v2alpha2.VotingPeriod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp voting_start_time = 1 [json_name = "votingStartTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the votingStartTime field is set.
   */
  boolean hasVotingStartTime();
  /**
   * <code>.google.protobuf.Timestamp voting_start_time = 1 [json_name = "votingStartTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The votingStartTime.
   */
  com.google.protobuf.Timestamp getVotingStartTime();
  /**
   * <code>.google.protobuf.Timestamp voting_start_time = 1 [json_name = "votingStartTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_start_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getVotingStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp voting_end_time = 2 [json_name = "votingEndTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the votingEndTime field is set.
   */
  boolean hasVotingEndTime();
  /**
   * <code>.google.protobuf.Timestamp voting_end_time = 2 [json_name = "votingEndTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The votingEndTime.
   */
  com.google.protobuf.Timestamp getVotingEndTime();
  /**
   * <code>.google.protobuf.Timestamp voting_end_time = 2 [json_name = "votingEndTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"voting_end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getVotingEndTimeOrBuilder();
}
