// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/oracle/v1/query.proto

package com.umee.oracle.v1;

public interface QueryAggregateVotesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.oracle.v1.QueryAggregateVotesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * aggregate_votes defines all oracle aggregate votes submitted in the current
   * vote period
   * </pre>
   *
   * <code>repeated .umee.oracle.v1.AggregateExchangeRateVote aggregate_votes = 1 [json_name = "aggregateVotes", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.umee.oracle.v1.AggregateExchangeRateVote> 
      getAggregateVotesList();
  /**
   * <pre>
   * aggregate_votes defines all oracle aggregate votes submitted in the current
   * vote period
   * </pre>
   *
   * <code>repeated .umee.oracle.v1.AggregateExchangeRateVote aggregate_votes = 1 [json_name = "aggregateVotes", (.gogoproto.nullable) = false];</code>
   */
  com.umee.oracle.v1.AggregateExchangeRateVote getAggregateVotes(int index);
  /**
   * <pre>
   * aggregate_votes defines all oracle aggregate votes submitted in the current
   * vote period
   * </pre>
   *
   * <code>repeated .umee.oracle.v1.AggregateExchangeRateVote aggregate_votes = 1 [json_name = "aggregateVotes", (.gogoproto.nullable) = false];</code>
   */
  int getAggregateVotesCount();
  /**
   * <pre>
   * aggregate_votes defines all oracle aggregate votes submitted in the current
   * vote period
   * </pre>
   *
   * <code>repeated .umee.oracle.v1.AggregateExchangeRateVote aggregate_votes = 1 [json_name = "aggregateVotes", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.umee.oracle.v1.AggregateExchangeRateVoteOrBuilder> 
      getAggregateVotesOrBuilderList();
  /**
   * <pre>
   * aggregate_votes defines all oracle aggregate votes submitted in the current
   * vote period
   * </pre>
   *
   * <code>repeated .umee.oracle.v1.AggregateExchangeRateVote aggregate_votes = 1 [json_name = "aggregateVotes", (.gogoproto.nullable) = false];</code>
   */
  com.umee.oracle.v1.AggregateExchangeRateVoteOrBuilder getAggregateVotesOrBuilder(
      int index);
}
