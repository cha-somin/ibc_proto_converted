// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/store/v1beta1/commit_info.proto

package com.cosmos.store.v1beta1;

public interface StoreInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.store.v1beta1.StoreInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.cosmos.store.v1beta1.CommitID commit_id = 2 [json_name = "commitId", (.gogoproto.nullable) = false];</code>
   * @return Whether the commitId field is set.
   */
  boolean hasCommitId();
  /**
   * <code>.cosmos.store.v1beta1.CommitID commit_id = 2 [json_name = "commitId", (.gogoproto.nullable) = false];</code>
   * @return The commitId.
   */
  com.cosmos.store.v1beta1.CommitID getCommitId();
  /**
   * <code>.cosmos.store.v1beta1.CommitID commit_id = 2 [json_name = "commitId", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.store.v1beta1.CommitIDOrBuilder getCommitIdOrBuilder();
}
