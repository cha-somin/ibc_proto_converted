// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/tx.proto

package com.cosmos.group.v1;

public interface MsgCreateGroupWithPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.group.v1.MsgCreateGroupWithPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * admin is the account address of the group and group policy admin.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The admin.
   */
  java.lang.String getAdmin();
  /**
   * <pre>
   * admin is the account address of the group and group policy admin.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for admin.
   */
  com.google.protobuf.ByteString
      getAdminBytes();

  /**
   * <pre>
   * members defines the group members.
   * </pre>
   *
   * <code>repeated .cosmos.group.v1.MemberRequest members = 2 [json_name = "members", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<com.cosmos.group.v1.MemberRequest> 
      getMembersList();
  /**
   * <pre>
   * members defines the group members.
   * </pre>
   *
   * <code>repeated .cosmos.group.v1.MemberRequest members = 2 [json_name = "members", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.group.v1.MemberRequest getMembers(int index);
  /**
   * <pre>
   * members defines the group members.
   * </pre>
   *
   * <code>repeated .cosmos.group.v1.MemberRequest members = 2 [json_name = "members", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * members defines the group members.
   * </pre>
   *
   * <code>repeated .cosmos.group.v1.MemberRequest members = 2 [json_name = "members", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<? extends com.cosmos.group.v1.MemberRequestOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <pre>
   * members defines the group members.
   * </pre>
   *
   * <code>repeated .cosmos.group.v1.MemberRequest members = 2 [json_name = "members", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.group.v1.MemberRequestOrBuilder getMembersOrBuilder(
      int index);

  /**
   * <pre>
   * group_metadata is any arbitrary metadata attached to the group.
   * </pre>
   *
   * <code>string group_metadata = 3 [json_name = "groupMetadata"];</code>
   * @return The groupMetadata.
   */
  java.lang.String getGroupMetadata();
  /**
   * <pre>
   * group_metadata is any arbitrary metadata attached to the group.
   * </pre>
   *
   * <code>string group_metadata = 3 [json_name = "groupMetadata"];</code>
   * @return The bytes for groupMetadata.
   */
  com.google.protobuf.ByteString
      getGroupMetadataBytes();

  /**
   * <pre>
   * group_policy_metadata is any arbitrary metadata attached to the group policy.
   * </pre>
   *
   * <code>string group_policy_metadata = 4 [json_name = "groupPolicyMetadata"];</code>
   * @return The groupPolicyMetadata.
   */
  java.lang.String getGroupPolicyMetadata();
  /**
   * <pre>
   * group_policy_metadata is any arbitrary metadata attached to the group policy.
   * </pre>
   *
   * <code>string group_policy_metadata = 4 [json_name = "groupPolicyMetadata"];</code>
   * @return The bytes for groupPolicyMetadata.
   */
  com.google.protobuf.ByteString
      getGroupPolicyMetadataBytes();

  /**
   * <pre>
   * group_policy_as_admin is a boolean field, if set to true, the group policy account address will be used as group
   * and group policy admin.
   * </pre>
   *
   * <code>bool group_policy_as_admin = 5 [json_name = "groupPolicyAsAdmin"];</code>
   * @return The groupPolicyAsAdmin.
   */
  boolean getGroupPolicyAsAdmin();

  /**
   * <pre>
   * decision_policy specifies the group policy's decision policy.
   * </pre>
   *
   * <code>.google.protobuf.Any decision_policy = 6 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "cosmos.group.v1.DecisionPolicy"];</code>
   * @return Whether the decisionPolicy field is set.
   */
  boolean hasDecisionPolicy();
  /**
   * <pre>
   * decision_policy specifies the group policy's decision policy.
   * </pre>
   *
   * <code>.google.protobuf.Any decision_policy = 6 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "cosmos.group.v1.DecisionPolicy"];</code>
   * @return The decisionPolicy.
   */
  com.google.protobuf.Any getDecisionPolicy();
  /**
   * <pre>
   * decision_policy specifies the group policy's decision policy.
   * </pre>
   *
   * <code>.google.protobuf.Any decision_policy = 6 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "cosmos.group.v1.DecisionPolicy"];</code>
   */
  com.google.protobuf.AnyOrBuilder getDecisionPolicyOrBuilder();
}
