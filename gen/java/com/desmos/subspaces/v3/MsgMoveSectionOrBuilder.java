// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/subspaces/v3/msgs.proto

package com.desmos.subspaces.v3;

public interface MsgMoveSectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.subspaces.v3.MsgMoveSection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the subspace inside which the section lies
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
   * @return The subspaceId.
   */
  long getSubspaceId();

  /**
   * <pre>
   * Id of the section to be moved
   * </pre>
   *
   * <code>uint32 section_id = 2 [json_name = "sectionId", (.gogoproto.customname) = "SectionID", (.gogoproto.moretags) = "yaml:&#92;"section_id&#92;""];</code>
   * @return The sectionId.
   */
  int getSectionId();

  /**
   * <pre>
   * Id of the new parent
   * </pre>
   *
   * <code>uint32 new_parent_id = 3 [json_name = "newParentId", (.gogoproto.customname) = "NewParentID", (.gogoproto.moretags) = "yaml:&#92;"new_parent_id&#92;""];</code>
   * @return The newParentId.
   */
  int getNewParentId();

  /**
   * <pre>
   * Signer of the message
   * </pre>
   *
   * <code>string signer = 4 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <pre>
   * Signer of the message
   * </pre>
   *
   * <code>string signer = 4 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
