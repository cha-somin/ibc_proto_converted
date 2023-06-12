// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v3/msgs.proto

package com.desmos.posts.v3;

public interface MsgCreatePostOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.posts.v3.MsgCreatePost)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the subspace inside which the post must be created
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
   * @return The subspaceId.
   */
  long getSubspaceId();

  /**
   * <pre>
   * Id of the section inside which the post must be created
   * </pre>
   *
   * <code>uint32 section_id = 2 [json_name = "sectionId", (.gogoproto.customname) = "SectionID", (.gogoproto.moretags) = "yaml:&#92;"section_id&#92;""];</code>
   * @return The sectionId.
   */
  int getSectionId();

  /**
   * <pre>
   * (optional) External id for this post
   * </pre>
   *
   * <code>string external_id = 3 [json_name = "externalId", (.gogoproto.customname) = "ExternalID", (.gogoproto.moretags) = "yaml:&#92;"external_id&#92;""];</code>
   * @return The externalId.
   */
  java.lang.String getExternalId();
  /**
   * <pre>
   * (optional) External id for this post
   * </pre>
   *
   * <code>string external_id = 3 [json_name = "externalId", (.gogoproto.customname) = "ExternalID", (.gogoproto.moretags) = "yaml:&#92;"external_id&#92;""];</code>
   * @return The bytes for externalId.
   */
  com.google.protobuf.ByteString
      getExternalIdBytes();

  /**
   * <pre>
   * (optional) Text of the post
   * </pre>
   *
   * <code>string text = 4 [json_name = "text", (.gogoproto.moretags) = "yaml:&#92;"text&#92;""];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * (optional) Text of the post
   * </pre>
   *
   * <code>string text = 4 [json_name = "text", (.gogoproto.moretags) = "yaml:&#92;"text&#92;""];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * (optional) Entities connected to this post
   * </pre>
   *
   * <code>.desmos.posts.v3.Entities entities = 5 [json_name = "entities", (.gogoproto.moretags) = "yaml:&#92;"entities&#92;""];</code>
   * @return Whether the entities field is set.
   */
  boolean hasEntities();
  /**
   * <pre>
   * (optional) Entities connected to this post
   * </pre>
   *
   * <code>.desmos.posts.v3.Entities entities = 5 [json_name = "entities", (.gogoproto.moretags) = "yaml:&#92;"entities&#92;""];</code>
   * @return The entities.
   */
  com.desmos.posts.v3.Entities getEntities();
  /**
   * <pre>
   * (optional) Entities connected to this post
   * </pre>
   *
   * <code>.desmos.posts.v3.Entities entities = 5 [json_name = "entities", (.gogoproto.moretags) = "yaml:&#92;"entities&#92;""];</code>
   */
  com.desmos.posts.v3.EntitiesOrBuilder getEntitiesOrBuilder();

  /**
   * <pre>
   * Tags connected to this post
   * </pre>
   *
   * <code>repeated string tags = 6 [json_name = "tags", (.gogoproto.moretags) = "yaml:&#92;"tags&#92;""];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   * Tags connected to this post
   * </pre>
   *
   * <code>repeated string tags = 6 [json_name = "tags", (.gogoproto.moretags) = "yaml:&#92;"tags&#92;""];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <pre>
   * Tags connected to this post
   * </pre>
   *
   * <code>repeated string tags = 6 [json_name = "tags", (.gogoproto.moretags) = "yaml:&#92;"tags&#92;""];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   * Tags connected to this post
   * </pre>
   *
   * <code>repeated string tags = 6 [json_name = "tags", (.gogoproto.moretags) = "yaml:&#92;"tags&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   * Attachments of the post
   * </pre>
   *
   * <code>repeated .google.protobuf.Any attachments = 7 [json_name = "attachments", (.gogoproto.moretags) = "yaml:&#92;"attachments&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getAttachmentsList();
  /**
   * <pre>
   * Attachments of the post
   * </pre>
   *
   * <code>repeated .google.protobuf.Any attachments = 7 [json_name = "attachments", (.gogoproto.moretags) = "yaml:&#92;"attachments&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   */
  com.google.protobuf.Any getAttachments(int index);
  /**
   * <pre>
   * Attachments of the post
   * </pre>
   *
   * <code>repeated .google.protobuf.Any attachments = 7 [json_name = "attachments", (.gogoproto.moretags) = "yaml:&#92;"attachments&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   */
  int getAttachmentsCount();
  /**
   * <pre>
   * Attachments of the post
   * </pre>
   *
   * <code>repeated .google.protobuf.Any attachments = 7 [json_name = "attachments", (.gogoproto.moretags) = "yaml:&#92;"attachments&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getAttachmentsOrBuilderList();
  /**
   * <pre>
   * Attachments of the post
   * </pre>
   *
   * <code>repeated .google.protobuf.Any attachments = 7 [json_name = "attachments", (.gogoproto.moretags) = "yaml:&#92;"attachments&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   */
  com.google.protobuf.AnyOrBuilder getAttachmentsOrBuilder(
      int index);

  /**
   * <pre>
   * Author of the post
   * </pre>
   *
   * <code>string author = 8 [json_name = "author", (.gogoproto.moretags) = "yaml:&#92;"author&#92;""];</code>
   * @return The author.
   */
  java.lang.String getAuthor();
  /**
   * <pre>
   * Author of the post
   * </pre>
   *
   * <code>string author = 8 [json_name = "author", (.gogoproto.moretags) = "yaml:&#92;"author&#92;""];</code>
   * @return The bytes for author.
   */
  com.google.protobuf.ByteString
      getAuthorBytes();

  /**
   * <pre>
   * (optional) Id of the original post of the conversation
   * </pre>
   *
   * <code>uint64 conversation_id = 9 [json_name = "conversationId", (.gogoproto.customname) = "ConversationID", (.gogoproto.moretags) = "yaml:&#92;"conversation_id&#92;""];</code>
   * @return The conversationId.
   */
  long getConversationId();

  /**
   * <pre>
   * Reply settings of this post
   * </pre>
   *
   * <code>.desmos.posts.v3.ReplySetting reply_settings = 10 [json_name = "replySettings", (.gogoproto.moretags) = "yaml:&#92;"reply_settings&#92;""];</code>
   * @return The enum numeric value on the wire for replySettings.
   */
  int getReplySettingsValue();
  /**
   * <pre>
   * Reply settings of this post
   * </pre>
   *
   * <code>.desmos.posts.v3.ReplySetting reply_settings = 10 [json_name = "replySettings", (.gogoproto.moretags) = "yaml:&#92;"reply_settings&#92;""];</code>
   * @return The replySettings.
   */
  com.desmos.posts.v3.ReplySetting getReplySettings();

  /**
   * <pre>
   * A list this posts references (either as a reply, repost or quote)
   * </pre>
   *
   * <code>repeated .desmos.posts.v3.PostReference referenced_posts = 11 [json_name = "referencedPosts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"referenced_posts&#92;""];</code>
   */
  java.util.List<com.desmos.posts.v3.PostReference> 
      getReferencedPostsList();
  /**
   * <pre>
   * A list this posts references (either as a reply, repost or quote)
   * </pre>
   *
   * <code>repeated .desmos.posts.v3.PostReference referenced_posts = 11 [json_name = "referencedPosts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"referenced_posts&#92;""];</code>
   */
  com.desmos.posts.v3.PostReference getReferencedPosts(int index);
  /**
   * <pre>
   * A list this posts references (either as a reply, repost or quote)
   * </pre>
   *
   * <code>repeated .desmos.posts.v3.PostReference referenced_posts = 11 [json_name = "referencedPosts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"referenced_posts&#92;""];</code>
   */
  int getReferencedPostsCount();
  /**
   * <pre>
   * A list this posts references (either as a reply, repost or quote)
   * </pre>
   *
   * <code>repeated .desmos.posts.v3.PostReference referenced_posts = 11 [json_name = "referencedPosts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"referenced_posts&#92;""];</code>
   */
  java.util.List<? extends com.desmos.posts.v3.PostReferenceOrBuilder> 
      getReferencedPostsOrBuilderList();
  /**
   * <pre>
   * A list this posts references (either as a reply, repost or quote)
   * </pre>
   *
   * <code>repeated .desmos.posts.v3.PostReference referenced_posts = 11 [json_name = "referencedPosts", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"referenced_posts&#92;""];</code>
   */
  com.desmos.posts.v3.PostReferenceOrBuilder getReferencedPostsOrBuilder(
      int index);
}
