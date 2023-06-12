// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v3/query.proto

package com.desmos.posts.v3;

/**
 * <pre>
 * QuerySubspacePostsResponse is the response type for the Query/SubspacePosts
 * RPC method
 * </pre>
 *
 * Protobuf type {@code desmos.posts.v3.QuerySubspacePostsResponse}
 */
public final class QuerySubspacePostsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.posts.v3.QuerySubspacePostsResponse)
    QuerySubspacePostsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySubspacePostsResponse.newBuilder() to construct.
  private QuerySubspacePostsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySubspacePostsResponse() {
    posts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuerySubspacePostsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.posts.v3.QueryProto.internal_static_desmos_posts_v3_QuerySubspacePostsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.posts.v3.QueryProto.internal_static_desmos_posts_v3_QuerySubspacePostsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.posts.v3.QuerySubspacePostsResponse.class, com.desmos.posts.v3.QuerySubspacePostsResponse.Builder.class);
  }

  public static final int POSTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.desmos.posts.v3.Post> posts_;
  /**
   * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.desmos.posts.v3.Post> getPostsList() {
    return posts_;
  }
  /**
   * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.desmos.posts.v3.PostOrBuilder> 
      getPostsOrBuilderList() {
    return posts_;
  }
  /**
   * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getPostsCount() {
    return posts_.size();
  }
  /**
   * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.desmos.posts.v3.Post getPosts(int index) {
    return posts_.get(index);
  }
  /**
   * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.desmos.posts.v3.PostOrBuilder getPostsOrBuilder(
      int index) {
    return posts_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < posts_.size(); i++) {
      output.writeMessage(1, posts_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < posts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, posts_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.desmos.posts.v3.QuerySubspacePostsResponse)) {
      return super.equals(obj);
    }
    com.desmos.posts.v3.QuerySubspacePostsResponse other = (com.desmos.posts.v3.QuerySubspacePostsResponse) obj;

    if (!getPostsList()
        .equals(other.getPostsList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
    }
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
    if (getPostsCount() > 0) {
      hash = (37 * hash) + POSTS_FIELD_NUMBER;
      hash = (53 * hash) + getPostsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v3.QuerySubspacePostsResponse parseFrom(
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
  public static Builder newBuilder(com.desmos.posts.v3.QuerySubspacePostsResponse prototype) {
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
   * QuerySubspacePostsResponse is the response type for the Query/SubspacePosts
   * RPC method
   * </pre>
   *
   * Protobuf type {@code desmos.posts.v3.QuerySubspacePostsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.posts.v3.QuerySubspacePostsResponse)
      com.desmos.posts.v3.QuerySubspacePostsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.posts.v3.QueryProto.internal_static_desmos_posts_v3_QuerySubspacePostsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.posts.v3.QueryProto.internal_static_desmos_posts_v3_QuerySubspacePostsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.posts.v3.QuerySubspacePostsResponse.class, com.desmos.posts.v3.QuerySubspacePostsResponse.Builder.class);
    }

    // Construct using com.desmos.posts.v3.QuerySubspacePostsResponse.newBuilder()
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
      if (postsBuilder_ == null) {
        posts_ = java.util.Collections.emptyList();
      } else {
        posts_ = null;
        postsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.posts.v3.QueryProto.internal_static_desmos_posts_v3_QuerySubspacePostsResponse_descriptor;
    }

    @java.lang.Override
    public com.desmos.posts.v3.QuerySubspacePostsResponse getDefaultInstanceForType() {
      return com.desmos.posts.v3.QuerySubspacePostsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.posts.v3.QuerySubspacePostsResponse build() {
      com.desmos.posts.v3.QuerySubspacePostsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.posts.v3.QuerySubspacePostsResponse buildPartial() {
      com.desmos.posts.v3.QuerySubspacePostsResponse result = new com.desmos.posts.v3.QuerySubspacePostsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.desmos.posts.v3.QuerySubspacePostsResponse result) {
      if (postsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          posts_ = java.util.Collections.unmodifiableList(posts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.posts_ = posts_;
      } else {
        result.posts_ = postsBuilder_.build();
      }
    }

    private void buildPartial0(com.desmos.posts.v3.QuerySubspacePostsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.posts.v3.QuerySubspacePostsResponse) {
        return mergeFrom((com.desmos.posts.v3.QuerySubspacePostsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.posts.v3.QuerySubspacePostsResponse other) {
      if (other == com.desmos.posts.v3.QuerySubspacePostsResponse.getDefaultInstance()) return this;
      if (postsBuilder_ == null) {
        if (!other.posts_.isEmpty()) {
          if (posts_.isEmpty()) {
            posts_ = other.posts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePostsIsMutable();
            posts_.addAll(other.posts_);
          }
          onChanged();
        }
      } else {
        if (!other.posts_.isEmpty()) {
          if (postsBuilder_.isEmpty()) {
            postsBuilder_.dispose();
            postsBuilder_ = null;
            posts_ = other.posts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            postsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPostsFieldBuilder() : null;
          } else {
            postsBuilder_.addAllMessages(other.posts_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
            case 10: {
              com.desmos.posts.v3.Post m =
                  input.readMessage(
                      com.desmos.posts.v3.Post.parser(),
                      extensionRegistry);
              if (postsBuilder_ == null) {
                ensurePostsIsMutable();
                posts_.add(m);
              } else {
                postsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<com.desmos.posts.v3.Post> posts_ =
      java.util.Collections.emptyList();
    private void ensurePostsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        posts_ = new java.util.ArrayList<com.desmos.posts.v3.Post>(posts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.desmos.posts.v3.Post, com.desmos.posts.v3.Post.Builder, com.desmos.posts.v3.PostOrBuilder> postsBuilder_;

    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.desmos.posts.v3.Post> getPostsList() {
      if (postsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(posts_);
      } else {
        return postsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public int getPostsCount() {
      if (postsBuilder_ == null) {
        return posts_.size();
      } else {
        return postsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.posts.v3.Post getPosts(int index) {
      if (postsBuilder_ == null) {
        return posts_.get(index);
      } else {
        return postsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPosts(
        int index, com.desmos.posts.v3.Post value) {
      if (postsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostsIsMutable();
        posts_.set(index, value);
        onChanged();
      } else {
        postsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPosts(
        int index, com.desmos.posts.v3.Post.Builder builderForValue) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.set(index, builderForValue.build());
        onChanged();
      } else {
        postsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPosts(com.desmos.posts.v3.Post value) {
      if (postsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostsIsMutable();
        posts_.add(value);
        onChanged();
      } else {
        postsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPosts(
        int index, com.desmos.posts.v3.Post value) {
      if (postsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostsIsMutable();
        posts_.add(index, value);
        onChanged();
      } else {
        postsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPosts(
        com.desmos.posts.v3.Post.Builder builderForValue) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.add(builderForValue.build());
        onChanged();
      } else {
        postsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public Builder addPosts(
        int index, com.desmos.posts.v3.Post.Builder builderForValue) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.add(index, builderForValue.build());
        onChanged();
      } else {
        postsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllPosts(
        java.lang.Iterable<? extends com.desmos.posts.v3.Post> values) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, posts_);
        onChanged();
      } else {
        postsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearPosts() {
      if (postsBuilder_ == null) {
        posts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        postsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public Builder removePosts(int index) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.remove(index);
        onChanged();
      } else {
        postsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.posts.v3.Post.Builder getPostsBuilder(
        int index) {
      return getPostsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.posts.v3.PostOrBuilder getPostsOrBuilder(
        int index) {
      if (postsBuilder_ == null) {
        return posts_.get(index);  } else {
        return postsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.desmos.posts.v3.PostOrBuilder> 
         getPostsOrBuilderList() {
      if (postsBuilder_ != null) {
        return postsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(posts_);
      }
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.posts.v3.Post.Builder addPostsBuilder() {
      return getPostsFieldBuilder().addBuilder(
          com.desmos.posts.v3.Post.getDefaultInstance());
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.posts.v3.Post.Builder addPostsBuilder(
        int index) {
      return getPostsFieldBuilder().addBuilder(
          index, com.desmos.posts.v3.Post.getDefaultInstance());
    }
    /**
     * <code>repeated .desmos.posts.v3.Post posts = 1 [json_name = "posts", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.desmos.posts.v3.Post.Builder> 
         getPostsBuilderList() {
      return getPostsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.desmos.posts.v3.Post, com.desmos.posts.v3.Post.Builder, com.desmos.posts.v3.PostOrBuilder> 
        getPostsFieldBuilder() {
      if (postsBuilder_ == null) {
        postsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.desmos.posts.v3.Post, com.desmos.posts.v3.Post.Builder, com.desmos.posts.v3.PostOrBuilder>(
                posts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        posts_ = null;
      }
      return postsBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:desmos.posts.v3.QuerySubspacePostsResponse)
  }

  // @@protoc_insertion_point(class_scope:desmos.posts.v3.QuerySubspacePostsResponse)
  private static final com.desmos.posts.v3.QuerySubspacePostsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.posts.v3.QuerySubspacePostsResponse();
  }

  public static com.desmos.posts.v3.QuerySubspacePostsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySubspacePostsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QuerySubspacePostsResponse>() {
    @java.lang.Override
    public QuerySubspacePostsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuerySubspacePostsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySubspacePostsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.posts.v3.QuerySubspacePostsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

