// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v3/msgs.proto

package com.desmos.posts.v3;

/**
 * <pre>
 * MsgAddPostAttachment represents the message that should be
 * used when adding an attachment to post
 * </pre>
 *
 * Protobuf type {@code desmos.posts.v3.MsgAddPostAttachment}
 */
public final class MsgAddPostAttachment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.posts.v3.MsgAddPostAttachment)
    MsgAddPostAttachmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAddPostAttachment.newBuilder() to construct.
  private MsgAddPostAttachment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAddPostAttachment() {
    editor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAddPostAttachment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.posts.v3.MsgsProto.internal_static_desmos_posts_v3_MsgAddPostAttachment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.posts.v3.MsgsProto.internal_static_desmos_posts_v3_MsgAddPostAttachment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.posts.v3.MsgAddPostAttachment.class, com.desmos.posts.v3.MsgAddPostAttachment.Builder.class);
  }

  public static final int SUBSPACE_ID_FIELD_NUMBER = 1;
  private long subspaceId_ = 0L;
  /**
   * <pre>
   * Id of the subspace containing the post
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
   * @return The subspaceId.
   */
  @java.lang.Override
  public long getSubspaceId() {
    return subspaceId_;
  }

  public static final int POST_ID_FIELD_NUMBER = 2;
  private long postId_ = 0L;
  /**
   * <pre>
   * Id of the post to which to add the attachment
   * </pre>
   *
   * <code>uint64 post_id = 2 [json_name = "postId", (.gogoproto.customname) = "PostID", (.gogoproto.moretags) = "yaml:&#92;"post_id&#92;""];</code>
   * @return The postId.
   */
  @java.lang.Override
  public long getPostId() {
    return postId_;
  }

  public static final int CONTENT_FIELD_NUMBER = 3;
  private com.google.protobuf.Any content_;
  /**
   * <pre>
   * Content of the attachment
   * </pre>
   *
   * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   * @return Whether the content field is set.
   */
  @java.lang.Override
  public boolean hasContent() {
    return content_ != null;
  }
  /**
   * <pre>
   * Content of the attachment
   * </pre>
   *
   * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   * @return The content.
   */
  @java.lang.Override
  public com.google.protobuf.Any getContent() {
    return content_ == null ? com.google.protobuf.Any.getDefaultInstance() : content_;
  }
  /**
   * <pre>
   * Content of the attachment
   * </pre>
   *
   * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getContentOrBuilder() {
    return content_ == null ? com.google.protobuf.Any.getDefaultInstance() : content_;
  }

  public static final int EDITOR_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object editor_ = "";
  /**
   * <pre>
   * Editor of the post
   * </pre>
   *
   * <code>string editor = 4 [json_name = "editor", (.gogoproto.moretags) = "yaml:&#92;"editor&#92;""];</code>
   * @return The editor.
   */
  @java.lang.Override
  public java.lang.String getEditor() {
    java.lang.Object ref = editor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      editor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Editor of the post
   * </pre>
   *
   * <code>string editor = 4 [json_name = "editor", (.gogoproto.moretags) = "yaml:&#92;"editor&#92;""];</code>
   * @return The bytes for editor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEditorBytes() {
    java.lang.Object ref = editor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      editor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (subspaceId_ != 0L) {
      output.writeUInt64(1, subspaceId_);
    }
    if (postId_ != 0L) {
      output.writeUInt64(2, postId_);
    }
    if (content_ != null) {
      output.writeMessage(3, getContent());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(editor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, editor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subspaceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, subspaceId_);
    }
    if (postId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, postId_);
    }
    if (content_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getContent());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(editor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, editor_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.desmos.posts.v3.MsgAddPostAttachment)) {
      return super.equals(obj);
    }
    com.desmos.posts.v3.MsgAddPostAttachment other = (com.desmos.posts.v3.MsgAddPostAttachment) obj;

    if (getSubspaceId()
        != other.getSubspaceId()) return false;
    if (getPostId()
        != other.getPostId()) return false;
    if (hasContent() != other.hasContent()) return false;
    if (hasContent()) {
      if (!getContent()
          .equals(other.getContent())) return false;
    }
    if (!getEditor()
        .equals(other.getEditor())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUBSPACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSubspaceId());
    hash = (37 * hash) + POST_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPostId());
    if (hasContent()) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
    }
    hash = (37 * hash) + EDITOR_FIELD_NUMBER;
    hash = (53 * hash) + getEditor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.posts.v3.MsgAddPostAttachment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.MsgAddPostAttachment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.MsgAddPostAttachment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.MsgAddPostAttachment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.MsgAddPostAttachment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.MsgAddPostAttachment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.MsgAddPostAttachment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v3.MsgAddPostAttachment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.posts.v3.MsgAddPostAttachment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.posts.v3.MsgAddPostAttachment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.posts.v3.MsgAddPostAttachment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v3.MsgAddPostAttachment parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.desmos.posts.v3.MsgAddPostAttachment prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * MsgAddPostAttachment represents the message that should be
   * used when adding an attachment to post
   * </pre>
   *
   * Protobuf type {@code desmos.posts.v3.MsgAddPostAttachment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.posts.v3.MsgAddPostAttachment)
      com.desmos.posts.v3.MsgAddPostAttachmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.posts.v3.MsgsProto.internal_static_desmos_posts_v3_MsgAddPostAttachment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.posts.v3.MsgsProto.internal_static_desmos_posts_v3_MsgAddPostAttachment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.posts.v3.MsgAddPostAttachment.class, com.desmos.posts.v3.MsgAddPostAttachment.Builder.class);
    }

    // Construct using com.desmos.posts.v3.MsgAddPostAttachment.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      subspaceId_ = 0L;
      postId_ = 0L;
      content_ = null;
      if (contentBuilder_ != null) {
        contentBuilder_.dispose();
        contentBuilder_ = null;
      }
      editor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.posts.v3.MsgsProto.internal_static_desmos_posts_v3_MsgAddPostAttachment_descriptor;
    }

    @java.lang.Override
    public com.desmos.posts.v3.MsgAddPostAttachment getDefaultInstanceForType() {
      return com.desmos.posts.v3.MsgAddPostAttachment.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.posts.v3.MsgAddPostAttachment build() {
      com.desmos.posts.v3.MsgAddPostAttachment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.posts.v3.MsgAddPostAttachment buildPartial() {
      com.desmos.posts.v3.MsgAddPostAttachment result = new com.desmos.posts.v3.MsgAddPostAttachment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.posts.v3.MsgAddPostAttachment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subspaceId_ = subspaceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.postId_ = postId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.content_ = contentBuilder_ == null
            ? content_
            : contentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.editor_ = editor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.posts.v3.MsgAddPostAttachment) {
        return mergeFrom((com.desmos.posts.v3.MsgAddPostAttachment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.posts.v3.MsgAddPostAttachment other) {
      if (other == com.desmos.posts.v3.MsgAddPostAttachment.getDefaultInstance()) return this;
      if (other.getSubspaceId() != 0L) {
        setSubspaceId(other.getSubspaceId());
      }
      if (other.getPostId() != 0L) {
        setPostId(other.getPostId());
      }
      if (other.hasContent()) {
        mergeContent(other.getContent());
      }
      if (!other.getEditor().isEmpty()) {
        editor_ = other.editor_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              subspaceId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              postId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getContentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              editor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long subspaceId_ ;
    /**
     * <pre>
     * Id of the subspace containing the post
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @return The subspaceId.
     */
    @java.lang.Override
    public long getSubspaceId() {
      return subspaceId_;
    }
    /**
     * <pre>
     * Id of the subspace containing the post
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @param value The subspaceId to set.
     * @return This builder for chaining.
     */
    public Builder setSubspaceId(long value) {

      subspaceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the subspace containing the post
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubspaceId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subspaceId_ = 0L;
      onChanged();
      return this;
    }

    private long postId_ ;
    /**
     * <pre>
     * Id of the post to which to add the attachment
     * </pre>
     *
     * <code>uint64 post_id = 2 [json_name = "postId", (.gogoproto.customname) = "PostID", (.gogoproto.moretags) = "yaml:&#92;"post_id&#92;""];</code>
     * @return The postId.
     */
    @java.lang.Override
    public long getPostId() {
      return postId_;
    }
    /**
     * <pre>
     * Id of the post to which to add the attachment
     * </pre>
     *
     * <code>uint64 post_id = 2 [json_name = "postId", (.gogoproto.customname) = "PostID", (.gogoproto.moretags) = "yaml:&#92;"post_id&#92;""];</code>
     * @param value The postId to set.
     * @return This builder for chaining.
     */
    public Builder setPostId(long value) {

      postId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the post to which to add the attachment
     * </pre>
     *
     * <code>uint64 post_id = 2 [json_name = "postId", (.gogoproto.customname) = "PostID", (.gogoproto.moretags) = "yaml:&#92;"post_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearPostId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      postId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any content_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> contentBuilder_;
    /**
     * <pre>
     * Content of the attachment
     * </pre>
     *
     * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
     * @return Whether the content field is set.
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Content of the attachment
     * </pre>
     *
     * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
     * @return The content.
     */
    public com.google.protobuf.Any getContent() {
      if (contentBuilder_ == null) {
        return content_ == null ? com.google.protobuf.Any.getDefaultInstance() : content_;
      } else {
        return contentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Content of the attachment
     * </pre>
     *
     * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
     */
    public Builder setContent(com.google.protobuf.Any value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
      } else {
        contentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Content of the attachment
     * </pre>
     *
     * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
     */
    public Builder setContent(
        com.google.protobuf.Any.Builder builderForValue) {
      if (contentBuilder_ == null) {
        content_ = builderForValue.build();
      } else {
        contentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Content of the attachment
     * </pre>
     *
     * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
     */
    public Builder mergeContent(com.google.protobuf.Any value) {
      if (contentBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          content_ != null &&
          content_ != com.google.protobuf.Any.getDefaultInstance()) {
          getContentBuilder().mergeFrom(value);
        } else {
          content_ = value;
        }
      } else {
        contentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Content of the attachment
     * </pre>
     *
     * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
     */
    public Builder clearContent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      content_ = null;
      if (contentBuilder_ != null) {
        contentBuilder_.dispose();
        contentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Content of the attachment
     * </pre>
     *
     * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
     */
    public com.google.protobuf.Any.Builder getContentBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getContentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Content of the attachment
     * </pre>
     *
     * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getContentOrBuilder() {
      if (contentBuilder_ != null) {
        return contentBuilder_.getMessageOrBuilder();
      } else {
        return content_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : content_;
      }
    }
    /**
     * <pre>
     * Content of the attachment
     * </pre>
     *
     * <code>.google.protobuf.Any content = 3 [json_name = "content", (.gogoproto.moretags) = "yaml:&#92;"content&#92;"", (.cosmos_proto.accepts_interface) = "desmos.posts.v3.AttachmentContent"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getContentFieldBuilder() {
      if (contentBuilder_ == null) {
        contentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getContent(),
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      return contentBuilder_;
    }

    private java.lang.Object editor_ = "";
    /**
     * <pre>
     * Editor of the post
     * </pre>
     *
     * <code>string editor = 4 [json_name = "editor", (.gogoproto.moretags) = "yaml:&#92;"editor&#92;""];</code>
     * @return The editor.
     */
    public java.lang.String getEditor() {
      java.lang.Object ref = editor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        editor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Editor of the post
     * </pre>
     *
     * <code>string editor = 4 [json_name = "editor", (.gogoproto.moretags) = "yaml:&#92;"editor&#92;""];</code>
     * @return The bytes for editor.
     */
    public com.google.protobuf.ByteString
        getEditorBytes() {
      java.lang.Object ref = editor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        editor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Editor of the post
     * </pre>
     *
     * <code>string editor = 4 [json_name = "editor", (.gogoproto.moretags) = "yaml:&#92;"editor&#92;""];</code>
     * @param value The editor to set.
     * @return This builder for chaining.
     */
    public Builder setEditor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      editor_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Editor of the post
     * </pre>
     *
     * <code>string editor = 4 [json_name = "editor", (.gogoproto.moretags) = "yaml:&#92;"editor&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearEditor() {
      editor_ = getDefaultInstance().getEditor();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Editor of the post
     * </pre>
     *
     * <code>string editor = 4 [json_name = "editor", (.gogoproto.moretags) = "yaml:&#92;"editor&#92;""];</code>
     * @param value The bytes for editor to set.
     * @return This builder for chaining.
     */
    public Builder setEditorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      editor_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:desmos.posts.v3.MsgAddPostAttachment)
  }

  // @@protoc_insertion_point(class_scope:desmos.posts.v3.MsgAddPostAttachment)
  private static final com.desmos.posts.v3.MsgAddPostAttachment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.posts.v3.MsgAddPostAttachment();
  }

  public static com.desmos.posts.v3.MsgAddPostAttachment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAddPostAttachment>
      PARSER = new com.google.protobuf.AbstractParser<MsgAddPostAttachment>() {
    @java.lang.Override
    public MsgAddPostAttachment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MsgAddPostAttachment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAddPostAttachment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.posts.v3.MsgAddPostAttachment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

