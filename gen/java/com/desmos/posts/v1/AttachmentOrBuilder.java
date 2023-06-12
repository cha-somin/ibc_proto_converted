// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v1/models.proto

package com.desmos.posts.v1;

public interface AttachmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.posts.v1.Attachment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the subspace inside which the post to which this attachment should be
   * connected is
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID"];</code>
   * @return The subspaceId.
   */
  long getSubspaceId();

  /**
   * <pre>
   * Id of the subspace section inside which the post to which this attachment
   * should be connected is
   * </pre>
   *
   * <code>uint32 section_id = 2 [json_name = "sectionId", (.gogoproto.customname) = "SectionID"];</code>
   * @return The sectionId.
   */
  int getSectionId();

  /**
   * <pre>
   * Id of the post to which this attachment should be connected
   * </pre>
   *
   * <code>uint64 post_id = 3 [json_name = "postId", (.gogoproto.customname) = "PostID"];</code>
   * @return The postId.
   */
  long getPostId();

  /**
   * <pre>
   * Id of this attachment
   * </pre>
   *
   * <code>uint32 id = 4 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
   * @return The id.
   */
  int getId();

  /**
   * <pre>
   * Content of the attachment
   * </pre>
   *
   * <code>.google.protobuf.Any content = 5 [json_name = "content", (.cosmos_proto.accepts_interface) = "desmos.posts.v1.AttachmentContent"];</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <pre>
   * Content of the attachment
   * </pre>
   *
   * <code>.google.protobuf.Any content = 5 [json_name = "content", (.cosmos_proto.accepts_interface) = "desmos.posts.v1.AttachmentContent"];</code>
   * @return The content.
   */
  com.google.protobuf.Any getContent();
  /**
   * <pre>
   * Content of the attachment
   * </pre>
   *
   * <code>.google.protobuf.Any content = 5 [json_name = "content", (.cosmos_proto.accepts_interface) = "desmos.posts.v1.AttachmentContent"];</code>
   */
  com.google.protobuf.AnyOrBuilder getContentOrBuilder();
}
