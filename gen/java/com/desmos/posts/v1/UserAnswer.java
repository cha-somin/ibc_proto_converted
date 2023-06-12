// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v1/models.proto

package com.desmos.posts.v1;

/**
 * <pre>
 * UserAnswer represents a user answer to a poll
 * </pre>
 *
 * Protobuf type {@code desmos.posts.v1.UserAnswer}
 */
public final class UserAnswer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.posts.v1.UserAnswer)
    UserAnswerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserAnswer.newBuilder() to construct.
  private UserAnswer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserAnswer() {
    answersIndexes_ = emptyIntList();
    user_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserAnswer();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.posts.v1.ModelsProto.internal_static_desmos_posts_v1_UserAnswer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.posts.v1.ModelsProto.internal_static_desmos_posts_v1_UserAnswer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.posts.v1.UserAnswer.class, com.desmos.posts.v1.UserAnswer.Builder.class);
  }

  public static final int SUBSPACE_ID_FIELD_NUMBER = 1;
  private long subspaceId_ = 0L;
  /**
   * <pre>
   * Subspace id inside which the post related to this attachment is located
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID"];</code>
   * @return The subspaceId.
   */
  @java.lang.Override
  public long getSubspaceId() {
    return subspaceId_;
  }

  public static final int SECTION_ID_FIELD_NUMBER = 2;
  private int sectionId_ = 0;
  /**
   * <pre>
   * Section id inside which the post related to this attachment is located
   * </pre>
   *
   * <code>uint32 section_id = 2 [json_name = "sectionId", (.gogoproto.customname) = "SectionID"];</code>
   * @return The sectionId.
   */
  @java.lang.Override
  public int getSectionId() {
    return sectionId_;
  }

  public static final int POST_ID_FIELD_NUMBER = 3;
  private long postId_ = 0L;
  /**
   * <pre>
   * Id of the post associated to this attachment
   * </pre>
   *
   * <code>uint64 post_id = 3 [json_name = "postId", (.gogoproto.customname) = "PostID"];</code>
   * @return The postId.
   */
  @java.lang.Override
  public long getPostId() {
    return postId_;
  }

  public static final int POLL_ID_FIELD_NUMBER = 4;
  private int pollId_ = 0;
  /**
   * <pre>
   * Id of the poll to which this answer is associated
   * </pre>
   *
   * <code>uint32 poll_id = 4 [json_name = "pollId", (.gogoproto.customname) = "PollID"];</code>
   * @return The pollId.
   */
  @java.lang.Override
  public int getPollId() {
    return pollId_;
  }

  public static final int ANSWERS_INDEXES_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList answersIndexes_;
  /**
   * <pre>
   * Indexes of the answers inside the ProvidedAnswers array
   * </pre>
   *
   * <code>repeated uint32 answers_indexes = 5 [json_name = "answersIndexes"];</code>
   * @return A list containing the answersIndexes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getAnswersIndexesList() {
    return answersIndexes_;
  }
  /**
   * <pre>
   * Indexes of the answers inside the ProvidedAnswers array
   * </pre>
   *
   * <code>repeated uint32 answers_indexes = 5 [json_name = "answersIndexes"];</code>
   * @return The count of answersIndexes.
   */
  public int getAnswersIndexesCount() {
    return answersIndexes_.size();
  }
  /**
   * <pre>
   * Indexes of the answers inside the ProvidedAnswers array
   * </pre>
   *
   * <code>repeated uint32 answers_indexes = 5 [json_name = "answersIndexes"];</code>
   * @param index The index of the element to return.
   * @return The answersIndexes at the given index.
   */
  public int getAnswersIndexes(int index) {
    return answersIndexes_.getInt(index);
  }
  private int answersIndexesMemoizedSerializedSize = -1;

  public static final int USER_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object user_ = "";
  /**
   * <pre>
   * Address of the user answering the poll
   * </pre>
   *
   * <code>string user = 6 [json_name = "user"];</code>
   * @return The user.
   */
  @java.lang.Override
  public java.lang.String getUser() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      user_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Address of the user answering the poll
   * </pre>
   *
   * <code>string user = 6 [json_name = "user"];</code>
   * @return The bytes for user.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserBytes() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      user_ = b;
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
    getSerializedSize();
    if (subspaceId_ != 0L) {
      output.writeUInt64(1, subspaceId_);
    }
    if (sectionId_ != 0) {
      output.writeUInt32(2, sectionId_);
    }
    if (postId_ != 0L) {
      output.writeUInt64(3, postId_);
    }
    if (pollId_ != 0) {
      output.writeUInt32(4, pollId_);
    }
    if (getAnswersIndexesList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(answersIndexesMemoizedSerializedSize);
    }
    for (int i = 0; i < answersIndexes_.size(); i++) {
      output.writeUInt32NoTag(answersIndexes_.getInt(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(user_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, user_);
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
    if (sectionId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, sectionId_);
    }
    if (postId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, postId_);
    }
    if (pollId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, pollId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < answersIndexes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(answersIndexes_.getInt(i));
      }
      size += dataSize;
      if (!getAnswersIndexesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      answersIndexesMemoizedSerializedSize = dataSize;
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(user_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, user_);
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
    if (!(obj instanceof com.desmos.posts.v1.UserAnswer)) {
      return super.equals(obj);
    }
    com.desmos.posts.v1.UserAnswer other = (com.desmos.posts.v1.UserAnswer) obj;

    if (getSubspaceId()
        != other.getSubspaceId()) return false;
    if (getSectionId()
        != other.getSectionId()) return false;
    if (getPostId()
        != other.getPostId()) return false;
    if (getPollId()
        != other.getPollId()) return false;
    if (!getAnswersIndexesList()
        .equals(other.getAnswersIndexesList())) return false;
    if (!getUser()
        .equals(other.getUser())) return false;
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
    hash = (37 * hash) + SECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSectionId();
    hash = (37 * hash) + POST_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPostId());
    hash = (37 * hash) + POLL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPollId();
    if (getAnswersIndexesCount() > 0) {
      hash = (37 * hash) + ANSWERS_INDEXES_FIELD_NUMBER;
      hash = (53 * hash) + getAnswersIndexesList().hashCode();
    }
    hash = (37 * hash) + USER_FIELD_NUMBER;
    hash = (53 * hash) + getUser().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.posts.v1.UserAnswer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v1.UserAnswer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v1.UserAnswer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v1.UserAnswer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v1.UserAnswer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v1.UserAnswer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v1.UserAnswer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v1.UserAnswer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.posts.v1.UserAnswer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.posts.v1.UserAnswer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.posts.v1.UserAnswer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v1.UserAnswer parseFrom(
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
  public static Builder newBuilder(com.desmos.posts.v1.UserAnswer prototype) {
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
   * UserAnswer represents a user answer to a poll
   * </pre>
   *
   * Protobuf type {@code desmos.posts.v1.UserAnswer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.posts.v1.UserAnswer)
      com.desmos.posts.v1.UserAnswerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.posts.v1.ModelsProto.internal_static_desmos_posts_v1_UserAnswer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.posts.v1.ModelsProto.internal_static_desmos_posts_v1_UserAnswer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.posts.v1.UserAnswer.class, com.desmos.posts.v1.UserAnswer.Builder.class);
    }

    // Construct using com.desmos.posts.v1.UserAnswer.newBuilder()
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
      sectionId_ = 0;
      postId_ = 0L;
      pollId_ = 0;
      answersIndexes_ = emptyIntList();
      user_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.posts.v1.ModelsProto.internal_static_desmos_posts_v1_UserAnswer_descriptor;
    }

    @java.lang.Override
    public com.desmos.posts.v1.UserAnswer getDefaultInstanceForType() {
      return com.desmos.posts.v1.UserAnswer.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.posts.v1.UserAnswer build() {
      com.desmos.posts.v1.UserAnswer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.posts.v1.UserAnswer buildPartial() {
      com.desmos.posts.v1.UserAnswer result = new com.desmos.posts.v1.UserAnswer(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.desmos.posts.v1.UserAnswer result) {
      if (((bitField0_ & 0x00000010) != 0)) {
        answersIndexes_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.answersIndexes_ = answersIndexes_;
    }

    private void buildPartial0(com.desmos.posts.v1.UserAnswer result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subspaceId_ = subspaceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sectionId_ = sectionId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.postId_ = postId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pollId_ = pollId_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.user_ = user_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.posts.v1.UserAnswer) {
        return mergeFrom((com.desmos.posts.v1.UserAnswer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.posts.v1.UserAnswer other) {
      if (other == com.desmos.posts.v1.UserAnswer.getDefaultInstance()) return this;
      if (other.getSubspaceId() != 0L) {
        setSubspaceId(other.getSubspaceId());
      }
      if (other.getSectionId() != 0) {
        setSectionId(other.getSectionId());
      }
      if (other.getPostId() != 0L) {
        setPostId(other.getPostId());
      }
      if (other.getPollId() != 0) {
        setPollId(other.getPollId());
      }
      if (!other.answersIndexes_.isEmpty()) {
        if (answersIndexes_.isEmpty()) {
          answersIndexes_ = other.answersIndexes_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureAnswersIndexesIsMutable();
          answersIndexes_.addAll(other.answersIndexes_);
        }
        onChanged();
      }
      if (!other.getUser().isEmpty()) {
        user_ = other.user_;
        bitField0_ |= 0x00000020;
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
              sectionId_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              postId_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              pollId_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              int v = input.readUInt32();
              ensureAnswersIndexesIsMutable();
              answersIndexes_.addInt(v);
              break;
            } // case 40
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureAnswersIndexesIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                answersIndexes_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            } // case 42
            case 50: {
              user_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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
     * Subspace id inside which the post related to this attachment is located
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID"];</code>
     * @return The subspaceId.
     */
    @java.lang.Override
    public long getSubspaceId() {
      return subspaceId_;
    }
    /**
     * <pre>
     * Subspace id inside which the post related to this attachment is located
     * </pre>
     *
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
     * <pre>
     * Subspace id inside which the post related to this attachment is located
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubspaceId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subspaceId_ = 0L;
      onChanged();
      return this;
    }

    private int sectionId_ ;
    /**
     * <pre>
     * Section id inside which the post related to this attachment is located
     * </pre>
     *
     * <code>uint32 section_id = 2 [json_name = "sectionId", (.gogoproto.customname) = "SectionID"];</code>
     * @return The sectionId.
     */
    @java.lang.Override
    public int getSectionId() {
      return sectionId_;
    }
    /**
     * <pre>
     * Section id inside which the post related to this attachment is located
     * </pre>
     *
     * <code>uint32 section_id = 2 [json_name = "sectionId", (.gogoproto.customname) = "SectionID"];</code>
     * @param value The sectionId to set.
     * @return This builder for chaining.
     */
    public Builder setSectionId(int value) {

      sectionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Section id inside which the post related to this attachment is located
     * </pre>
     *
     * <code>uint32 section_id = 2 [json_name = "sectionId", (.gogoproto.customname) = "SectionID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSectionId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sectionId_ = 0;
      onChanged();
      return this;
    }

    private long postId_ ;
    /**
     * <pre>
     * Id of the post associated to this attachment
     * </pre>
     *
     * <code>uint64 post_id = 3 [json_name = "postId", (.gogoproto.customname) = "PostID"];</code>
     * @return The postId.
     */
    @java.lang.Override
    public long getPostId() {
      return postId_;
    }
    /**
     * <pre>
     * Id of the post associated to this attachment
     * </pre>
     *
     * <code>uint64 post_id = 3 [json_name = "postId", (.gogoproto.customname) = "PostID"];</code>
     * @param value The postId to set.
     * @return This builder for chaining.
     */
    public Builder setPostId(long value) {

      postId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the post associated to this attachment
     * </pre>
     *
     * <code>uint64 post_id = 3 [json_name = "postId", (.gogoproto.customname) = "PostID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPostId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      postId_ = 0L;
      onChanged();
      return this;
    }

    private int pollId_ ;
    /**
     * <pre>
     * Id of the poll to which this answer is associated
     * </pre>
     *
     * <code>uint32 poll_id = 4 [json_name = "pollId", (.gogoproto.customname) = "PollID"];</code>
     * @return The pollId.
     */
    @java.lang.Override
    public int getPollId() {
      return pollId_;
    }
    /**
     * <pre>
     * Id of the poll to which this answer is associated
     * </pre>
     *
     * <code>uint32 poll_id = 4 [json_name = "pollId", (.gogoproto.customname) = "PollID"];</code>
     * @param value The pollId to set.
     * @return This builder for chaining.
     */
    public Builder setPollId(int value) {

      pollId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the poll to which this answer is associated
     * </pre>
     *
     * <code>uint32 poll_id = 4 [json_name = "pollId", (.gogoproto.customname) = "PollID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPollId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pollId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList answersIndexes_ = emptyIntList();
    private void ensureAnswersIndexesIsMutable() {
      if (!((bitField0_ & 0x00000010) != 0)) {
        answersIndexes_ = mutableCopy(answersIndexes_);
        bitField0_ |= 0x00000010;
      }
    }
    /**
     * <pre>
     * Indexes of the answers inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 5 [json_name = "answersIndexes"];</code>
     * @return A list containing the answersIndexes.
     */
    public java.util.List<java.lang.Integer>
        getAnswersIndexesList() {
      return ((bitField0_ & 0x00000010) != 0) ?
               java.util.Collections.unmodifiableList(answersIndexes_) : answersIndexes_;
    }
    /**
     * <pre>
     * Indexes of the answers inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 5 [json_name = "answersIndexes"];</code>
     * @return The count of answersIndexes.
     */
    public int getAnswersIndexesCount() {
      return answersIndexes_.size();
    }
    /**
     * <pre>
     * Indexes of the answers inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 5 [json_name = "answersIndexes"];</code>
     * @param index The index of the element to return.
     * @return The answersIndexes at the given index.
     */
    public int getAnswersIndexes(int index) {
      return answersIndexes_.getInt(index);
    }
    /**
     * <pre>
     * Indexes of the answers inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 5 [json_name = "answersIndexes"];</code>
     * @param index The index to set the value at.
     * @param value The answersIndexes to set.
     * @return This builder for chaining.
     */
    public Builder setAnswersIndexes(
        int index, int value) {

      ensureAnswersIndexesIsMutable();
      answersIndexes_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indexes of the answers inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 5 [json_name = "answersIndexes"];</code>
     * @param value The answersIndexes to add.
     * @return This builder for chaining.
     */
    public Builder addAnswersIndexes(int value) {

      ensureAnswersIndexesIsMutable();
      answersIndexes_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indexes of the answers inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 5 [json_name = "answersIndexes"];</code>
     * @param values The answersIndexes to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnswersIndexes(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureAnswersIndexesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, answersIndexes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indexes of the answers inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 5 [json_name = "answersIndexes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAnswersIndexes() {
      answersIndexes_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }

    private java.lang.Object user_ = "";
    /**
     * <pre>
     * Address of the user answering the poll
     * </pre>
     *
     * <code>string user = 6 [json_name = "user"];</code>
     * @return The user.
     */
    public java.lang.String getUser() {
      java.lang.Object ref = user_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        user_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Address of the user answering the poll
     * </pre>
     *
     * <code>string user = 6 [json_name = "user"];</code>
     * @return The bytes for user.
     */
    public com.google.protobuf.ByteString
        getUserBytes() {
      java.lang.Object ref = user_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        user_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Address of the user answering the poll
     * </pre>
     *
     * <code>string user = 6 [json_name = "user"];</code>
     * @param value The user to set.
     * @return This builder for chaining.
     */
    public Builder setUser(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      user_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the user answering the poll
     * </pre>
     *
     * <code>string user = 6 [json_name = "user"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUser() {
      user_ = getDefaultInstance().getUser();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the user answering the poll
     * </pre>
     *
     * <code>string user = 6 [json_name = "user"];</code>
     * @param value The bytes for user to set.
     * @return This builder for chaining.
     */
    public Builder setUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      user_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:desmos.posts.v1.UserAnswer)
  }

  // @@protoc_insertion_point(class_scope:desmos.posts.v1.UserAnswer)
  private static final com.desmos.posts.v1.UserAnswer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.posts.v1.UserAnswer();
  }

  public static com.desmos.posts.v1.UserAnswer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserAnswer>
      PARSER = new com.google.protobuf.AbstractParser<UserAnswer>() {
    @java.lang.Override
    public UserAnswer parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserAnswer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserAnswer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.posts.v1.UserAnswer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

