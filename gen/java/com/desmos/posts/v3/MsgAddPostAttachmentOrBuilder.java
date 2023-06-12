// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v3/msgs.proto

package com.desmos.posts.v3;

public interface MsgAddPostAttachmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.posts.v3.MsgAddPostAttachment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the subspace containing the post
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
   * @return The subspaceId.
   */
  long getSubspaceId();

  /**
   * <pre>
   * Id of the post to which to add the attachment
   * </pre>
   *
   * <code>uint64 post_id = 2 [json_name = "postId", (.gogoproto.customname) = "PostID", (.gogoproto.moretags) = "yaml:&#92;"post_id&#92;""];</code>
   * @return The postId.
   */
  long getPostId();

  /**
   * <pre>
   * Content of the attachment
   * </pre>
   *
   * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <pre>
   * Content of the attachment
   * </pre>
   *
   * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   * @return The content.
   */
  com.google.protobuf.Any getContent();
  /**
   * <pre>
   * Content of the attachment
   * </pre>
   *
   * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   */
  com.google.protobuf.AnyOrBuilder getContentOrBuilder();

  /**
   * <pre>
   * Editor of the post
   * </pre>
   *
   * <code>string editor = 4 [json_name = "editor", (.gogoproto.moretags) = "yaml:&#92;"editor&#92;""];</code>
   * @return The editor.
   */
  java.lang.String getEditor();
  /**
   * <pre>
   * Editor of the post
   * </pre>
   *
   * <code>string editor = 4 [json_name = "editor", (.gogoproto.moretags) = "yaml:&#92;"editor&#92;""];</code>
   * @return The bytes for editor.
   */
  com.google.protobuf.ByteString
      getEditorBytes();
}
