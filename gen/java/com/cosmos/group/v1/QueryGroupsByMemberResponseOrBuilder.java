// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/query.proto

package com.cosmos.group.v1;

public interface QueryGroupsByMemberResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.group.v1.QueryGroupsByMemberResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * groups are the groups info with the provided group member.
   * </pre>
   *
   * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
   */
  java.util.List<com.cosmos.group.v1.GroupInfo> 
      getGroupsList();
  /**
   * <pre>
   * groups are the groups info with the provided group member.
   * </pre>
   *
   * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
   */
  com.cosmos.group.v1.GroupInfo getGroups(int index);
  /**
   * <pre>
   * groups are the groups info with the provided group member.
   * </pre>
   *
   * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
   */
  int getGroupsCount();
  /**
   * <pre>
   * groups are the groups info with the provided group member.
   * </pre>
   *
   * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
   */
  java.util.List<? extends com.cosmos.group.v1.GroupInfoOrBuilder> 
      getGroupsOrBuilderList();
  /**
   * <pre>
   * groups are the groups info with the provided group member.
   * </pre>
   *
   * <code>repeated .cosmos.group.v1.GroupInfo groups = 1 [json_name = "groups"];</code>
   */
  com.cosmos.group.v1.GroupInfoOrBuilder getGroupsOrBuilder(
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
