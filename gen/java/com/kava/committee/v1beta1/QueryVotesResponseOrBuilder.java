// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/committee/v1beta1/query.proto

package com.kava.committee.v1beta1;

public interface QueryVotesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.committee.v1beta1.QueryVotesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * votes defined the queried votes.
   * </pre>
   *
   * <code>repeated .kava.committee.v1beta1.QueryVoteResponse votes = 1 [json_name = "votes", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.kava.committee.v1beta1.QueryVoteResponse> 
      getVotesList();
  /**
   * <pre>
   * votes defined the queried votes.
   * </pre>
   *
   * <code>repeated .kava.committee.v1beta1.QueryVoteResponse votes = 1 [json_name = "votes", (.gogoproto.nullable) = false];</code>
   */
  com.kava.committee.v1beta1.QueryVoteResponse getVotes(int index);
  /**
   * <pre>
   * votes defined the queried votes.
   * </pre>
   *
   * <code>repeated .kava.committee.v1beta1.QueryVoteResponse votes = 1 [json_name = "votes", (.gogoproto.nullable) = false];</code>
   */
  int getVotesCount();
  /**
   * <pre>
   * votes defined the queried votes.
   * </pre>
   *
   * <code>repeated .kava.committee.v1beta1.QueryVoteResponse votes = 1 [json_name = "votes", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.kava.committee.v1beta1.QueryVoteResponseOrBuilder> 
      getVotesOrBuilderList();
  /**
   * <pre>
   * votes defined the queried votes.
   * </pre>
   *
   * <code>repeated .kava.committee.v1beta1.QueryVoteResponse votes = 1 [json_name = "votes", (.gogoproto.nullable) = false];</code>
   */
  com.kava.committee.v1beta1.QueryVoteResponseOrBuilder getVotesOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
