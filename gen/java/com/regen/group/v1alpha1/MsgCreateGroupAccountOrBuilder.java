// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/group/v1alpha1/tx.proto

package com.regen.group.v1alpha1;

public interface MsgCreateGroupAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.group.v1alpha1.MsgCreateGroupAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * admin is the account address of the group admin.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The admin.
   */
  java.lang.String getAdmin();
  /**
   * <pre>
   * admin is the account address of the group admin.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The bytes for admin.
   */
  com.google.protobuf.ByteString
      getAdminBytes();

  /**
   * <pre>
   * group_id is the unique ID of the group.
   * </pre>
   *
   * <code>uint64 group_id = 2 [json_name = "groupId"];</code>
   * @return The groupId.
   */
  long getGroupId();

  /**
   * <pre>
   * metadata is any arbitrary metadata to attached to the group account.
   * </pre>
   *
   * <code>bytes metadata = 3 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.google.protobuf.ByteString getMetadata();

  /**
   * <pre>
   * decision_policy specifies the group account's decision policy.
   * </pre>
   *
   * <code>.google.protobuf.Any decision_policy = 4 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "DecisionPolicy"];</code>
   * @return Whether the decisionPolicy field is set.
   */
  boolean hasDecisionPolicy();
  /**
   * <pre>
   * decision_policy specifies the group account's decision policy.
   * </pre>
   *
   * <code>.google.protobuf.Any decision_policy = 4 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "DecisionPolicy"];</code>
   * @return The decisionPolicy.
   */
  com.google.protobuf.Any getDecisionPolicy();
  /**
   * <pre>
   * decision_policy specifies the group account's decision policy.
   * </pre>
   *
   * <code>.google.protobuf.Any decision_policy = 4 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "DecisionPolicy"];</code>
   */
  com.google.protobuf.AnyOrBuilder getDecisionPolicyOrBuilder();
}
