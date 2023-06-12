// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v3/genesis.proto

package com.desmos.posts.v3;

/**
 * <pre>
 * PostDataEntry contains the data of a given post
 * </pre>
 *
 * Protobuf type {@code desmos.posts.v3.PostDataEntry}
 */
public final class PostDataEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.posts.v3.PostDataEntry)
    PostDataEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostDataEntry.newBuilder() to construct.
  private PostDataEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostDataEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostDataEntry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.posts.v3.GenesisProto.internal_static_desmos_posts_v3_PostDataEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.posts.v3.GenesisProto.internal_static_desmos_posts_v3_PostDataEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.posts.v3.PostDataEntry.class, com.desmos.posts.v3.PostDataEntry.Builder.class);
  }

  public static final int SUBSPACE_ID_FIELD_NUMBER = 1;
  private long subspaceId_ = 0L;
  /**
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID"];</code>
   * @return The subspaceId.
   */
  @java.lang.Override
  public long getSubspaceId() {
    return subspaceId_;
  }

  public static final int POST_ID_FIELD_NUMBER = 2;
  private long postId_ = 0L;
  /**
   * <code>uint64 post_id = 2 [json_name = "postId", (.gogoproto.customname) = "PostID"];</code>
   * @return The postId.
   */
  @java.lang.Override
  public long getPostId() {
    return postId_;
  }

  public static final int INITIAL_ATTACHMENT_ID_FIELD_NUMBER = 3;
  private int initialAttachmentId_ = 0;
  /**
   * <code>uint32 initial_attachment_id = 3 [json_name = "initialAttachmentId", (.gogoproto.customname) = "InitialAttachmentID"];</code>
   * @return The initialAttachmentId.
   */
  @java.lang.Override
  public int getInitialAttachmentId() {
    return initialAttachmentId_;
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
    if (initialAttachmentId_ != 0) {
      output.writeUInt32(3, initialAttachmentId_);
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
    if (initialAttachmentId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, initialAttachmentId_);
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
    if (!(obj instanceof com.desmos.posts.v3.PostDataEntry)) {
      return super.equals(obj);
    }
    com.desmos.posts.v3.PostDataEntry other = (com.desmos.posts.v3.PostDataEntry) obj;

    if (getSubspaceId()
        != other.getSubspaceId()) return false;
    if (getPostId()
        != other.getPostId()) return false;
    if (getInitialAttachmentId()
        != other.getInitialAttachmentId()) return false;
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
    hash = (37 * hash) + INITIAL_ATTACHMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInitialAttachmentId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.posts.v3.PostDataEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.PostDataEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.PostDataEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.PostDataEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.PostDataEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.PostDataEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.PostDataEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v3.PostDataEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.posts.v3.PostDataEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.posts.v3.PostDataEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.posts.v3.PostDataEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v3.PostDataEntry parseFrom(
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
  public static Builder newBuilder(com.desmos.posts.v3.PostDataEntry prototype) {
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
   * PostDataEntry contains the data of a given post
   * </pre>
   *
   * Protobuf type {@code desmos.posts.v3.PostDataEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.posts.v3.PostDataEntry)
      com.desmos.posts.v3.PostDataEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.posts.v3.GenesisProto.internal_static_desmos_posts_v3_PostDataEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.posts.v3.GenesisProto.internal_static_desmos_posts_v3_PostDataEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.posts.v3.PostDataEntry.class, com.desmos.posts.v3.PostDataEntry.Builder.class);
    }

    // Construct using com.desmos.posts.v3.PostDataEntry.newBuilder()
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
      initialAttachmentId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.posts.v3.GenesisProto.internal_static_desmos_posts_v3_PostDataEntry_descriptor;
    }

    @java.lang.Override
    public com.desmos.posts.v3.PostDataEntry getDefaultInstanceForType() {
      return com.desmos.posts.v3.PostDataEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.posts.v3.PostDataEntry build() {
      com.desmos.posts.v3.PostDataEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.posts.v3.PostDataEntry buildPartial() {
      com.desmos.posts.v3.PostDataEntry result = new com.desmos.posts.v3.PostDataEntry(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.posts.v3.PostDataEntry result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subspaceId_ = subspaceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.postId_ = postId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.initialAttachmentId_ = initialAttachmentId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.posts.v3.PostDataEntry) {
        return mergeFrom((com.desmos.posts.v3.PostDataEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.posts.v3.PostDataEntry other) {
      if (other == com.desmos.posts.v3.PostDataEntry.getDefaultInstance()) return this;
      if (other.getSubspaceId() != 0L) {
        setSubspaceId(other.getSubspaceId());
      }
      if (other.getPostId() != 0L) {
        setPostId(other.getPostId());
      }
      if (other.getInitialAttachmentId() != 0) {
        setInitialAttachmentId(other.getInitialAttachmentId());
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
            case 24: {
              initialAttachmentId_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID"];</code>
     * @return The subspaceId.
     */
    @java.lang.Override
    public long getSubspaceId() {
      return subspaceId_;
    }
    /**
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID"];</code>
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
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID"];</code>
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
     * <code>uint64 post_id = 2 [json_name = "postId", (.gogoproto.customname) = "PostID"];</code>
     * @return The postId.
     */
    @java.lang.Override
    public long getPostId() {
      return postId_;
    }
    /**
     * <code>uint64 post_id = 2 [json_name = "postId", (.gogoproto.customname) = "PostID"];</code>
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
     * <code>uint64 post_id = 2 [json_name = "postId", (.gogoproto.customname) = "PostID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPostId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      postId_ = 0L;
      onChanged();
      return this;
    }

    private int initialAttachmentId_ ;
    /**
     * <code>uint32 initial_attachment_id = 3 [json_name = "initialAttachmentId", (.gogoproto.customname) = "InitialAttachmentID"];</code>
     * @return The initialAttachmentId.
     */
    @java.lang.Override
    public int getInitialAttachmentId() {
      return initialAttachmentId_;
    }
    /**
     * <code>uint32 initial_attachment_id = 3 [json_name = "initialAttachmentId", (.gogoproto.customname) = "InitialAttachmentID"];</code>
     * @param value The initialAttachmentId to set.
     * @return This builder for chaining.
     */
    public Builder setInitialAttachmentId(int value) {

      initialAttachmentId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 initial_attachment_id = 3 [json_name = "initialAttachmentId", (.gogoproto.customname) = "InitialAttachmentID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInitialAttachmentId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      initialAttachmentId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:desmos.posts.v3.PostDataEntry)
  }

  // @@protoc_insertion_point(class_scope:desmos.posts.v3.PostDataEntry)
  private static final com.desmos.posts.v3.PostDataEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.posts.v3.PostDataEntry();
  }

  public static com.desmos.posts.v3.PostDataEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostDataEntry>
      PARSER = new com.google.protobuf.AbstractParser<PostDataEntry>() {
    @java.lang.Override
    public PostDataEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<PostDataEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostDataEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.posts.v3.PostDataEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

