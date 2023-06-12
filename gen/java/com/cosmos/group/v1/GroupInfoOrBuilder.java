// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/types.proto

package com.cosmos.group.v1;

public interface GroupInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.group.v1.GroupInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id is the unique ID of the group.
   * </pre>
   *
   * <code>uint64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * admin is the account address of the group's admin.
   * </pre>
   *
   * <code>string admin = 2 [json_name = "admin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The admin.
   */
  java.lang.String getAdmin();
  /**
   * <pre>
   * admin is the account address of the group's admin.
   * </pre>
   *
   * <code>string admin = 2 [json_name = "admin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for admin.
   */
  com.google.protobuf.ByteString
      getAdminBytes();

  /**
   * <pre>
   * metadata is any arbitrary metadata to attached to the group.
   * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/group#group-1
   * </pre>
   *
   * <code>string metadata = 3 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  java.lang.String getMetadata();
  /**
   * <pre>
   * metadata is any arbitrary metadata to attached to the group.
   * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/group#group-1
   * </pre>
   *
   * <code>string metadata = 3 [json_name = "metadata"];</code>
   * @return The bytes for metadata.
   */
  com.google.protobuf.ByteString
      getMetadataBytes();

  /**
   * <pre>
   * version is used to track changes to a group's membership structure that
   * would break existing proposals. Whenever any members weight is changed,
   * or any member is added or removed this version is incremented and will
   * cause proposals based on older versions of this group to fail
   * </pre>
   *
   * <code>uint64 version = 4 [json_name = "version"];</code>
   * @return The version.
   */
  long getVersion();

  /**
   * <pre>
   * total_weight is the sum of the group members' weights.
   * </pre>
   *
   * <code>string total_weight = 5 [json_name = "totalWeight"];</code>
   * @return The totalWeight.
   */
  java.lang.String getTotalWeight();
  /**
   * <pre>
   * total_weight is the sum of the group members' weights.
   * </pre>
   *
   * <code>string total_weight = 5 [json_name = "totalWeight"];</code>
   * @return The bytes for totalWeight.
   */
  com.google.protobuf.ByteString
      getTotalWeightBytes();

  /**
   * <pre>
   * created_at is a timestamp specifying when a group was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true, (.amino.dont_omitempty) = true];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * created_at is a timestamp specifying when a group was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true, (.amino.dont_omitempty) = true];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * created_at is a timestamp specifying when a group was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 6 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true, (.amino.dont_omitempty) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();
}
