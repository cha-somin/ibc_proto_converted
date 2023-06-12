// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v3/msgs.proto

package com.desmos.posts.v3;

/**
 * <pre>
 * MsgAnswerPoll represents the message used to answer a poll
 * </pre>
 *
 * Protobuf type {@code desmos.posts.v3.MsgAnswerPoll}
 */
public final class MsgAnswerPoll extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.posts.v3.MsgAnswerPoll)
    MsgAnswerPollOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAnswerPoll.newBuilder() to construct.
  private MsgAnswerPoll(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAnswerPoll() {
    answersIndexes_ = emptyIntList();
    signer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAnswerPoll();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.posts.v3.MsgsProto.internal_static_desmos_posts_v3_MsgAnswerPoll_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.posts.v3.MsgsProto.internal_static_desmos_posts_v3_MsgAnswerPoll_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.posts.v3.MsgAnswerPoll.class, com.desmos.posts.v3.MsgAnswerPoll.Builder.class);
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
   * Id of the post that contains the poll to be answered
   * </pre>
   *
   * <code>uint64 post_id = 2 [json_name = "postId", (.gogoproto.customname) = "PostID", (.gogoproto.moretags) = "yaml:&#92;"post_id&#92;""];</code>
   * @return The postId.
   */
  @java.lang.Override
  public long getPostId() {
    return postId_;
  }

  public static final int POLL_ID_FIELD_NUMBER = 3;
  private int pollId_ = 0;
  /**
   * <pre>
   * Id of the poll to be answered
   * </pre>
   *
   * <code>uint32 poll_id = 3 [json_name = "pollId", (.gogoproto.customname) = "PollID", (.gogoproto.moretags) = "yaml:&#92;"poll_id&#92;""];</code>
   * @return The pollId.
   */
  @java.lang.Override
  public int getPollId() {
    return pollId_;
  }

  public static final int ANSWERS_INDEXES_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList answersIndexes_;
  /**
   * <pre>
   * Indexes of the answer inside the ProvidedAnswers array
   * </pre>
   *
   * <code>repeated uint32 answers_indexes = 4 [json_name = "answersIndexes", (.gogoproto.moretags) = "yaml:&#92;"answers_indexes&#92;""];</code>
   * @return A list containing the answersIndexes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getAnswersIndexesList() {
    return answersIndexes_;
  }
  /**
   * <pre>
   * Indexes of the answer inside the ProvidedAnswers array
   * </pre>
   *
   * <code>repeated uint32 answers_indexes = 4 [json_name = "answersIndexes", (.gogoproto.moretags) = "yaml:&#92;"answers_indexes&#92;""];</code>
   * @return The count of answersIndexes.
   */
  public int getAnswersIndexesCount() {
    return answersIndexes_.size();
  }
  /**
   * <pre>
   * Indexes of the answer inside the ProvidedAnswers array
   * </pre>
   *
   * <code>repeated uint32 answers_indexes = 4 [json_name = "answersIndexes", (.gogoproto.moretags) = "yaml:&#92;"answers_indexes&#92;""];</code>
   * @param index The index of the element to return.
   * @return The answersIndexes at the given index.
   */
  public int getAnswersIndexes(int index) {
    return answersIndexes_.getInt(index);
  }
  private int answersIndexesMemoizedSerializedSize = -1;

  public static final int SIGNER_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signer_ = "";
  /**
   * <pre>
   * Address of the user answering the poll
   * </pre>
   *
   * <code>string signer = 5 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
   * @return The signer.
   */
  @java.lang.Override
  public java.lang.String getSigner() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Address of the user answering the poll
   * </pre>
   *
   * <code>string signer = 5 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
   * @return The bytes for signer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignerBytes() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signer_ = b;
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
    if (postId_ != 0L) {
      output.writeUInt64(2, postId_);
    }
    if (pollId_ != 0) {
      output.writeUInt32(3, pollId_);
    }
    if (getAnswersIndexesList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(answersIndexesMemoizedSerializedSize);
    }
    for (int i = 0; i < answersIndexes_.size(); i++) {
      output.writeUInt32NoTag(answersIndexes_.getInt(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, signer_);
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
    if (pollId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, pollId_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, signer_);
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
    if (!(obj instanceof com.desmos.posts.v3.MsgAnswerPoll)) {
      return super.equals(obj);
    }
    com.desmos.posts.v3.MsgAnswerPoll other = (com.desmos.posts.v3.MsgAnswerPoll) obj;

    if (getSubspaceId()
        != other.getSubspaceId()) return false;
    if (getPostId()
        != other.getPostId()) return false;
    if (getPollId()
        != other.getPollId()) return false;
    if (!getAnswersIndexesList()
        .equals(other.getAnswersIndexesList())) return false;
    if (!getSigner()
        .equals(other.getSigner())) return false;
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
    hash = (37 * hash) + POLL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPollId();
    if (getAnswersIndexesCount() > 0) {
      hash = (37 * hash) + ANSWERS_INDEXES_FIELD_NUMBER;
      hash = (53 * hash) + getAnswersIndexesList().hashCode();
    }
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.posts.v3.MsgAnswerPoll parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.MsgAnswerPoll parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.MsgAnswerPoll parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.MsgAnswerPoll parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.MsgAnswerPoll parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.MsgAnswerPoll parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.MsgAnswerPoll parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v3.MsgAnswerPoll parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.posts.v3.MsgAnswerPoll parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.posts.v3.MsgAnswerPoll parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.posts.v3.MsgAnswerPoll parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v3.MsgAnswerPoll parseFrom(
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
  public static Builder newBuilder(com.desmos.posts.v3.MsgAnswerPoll prototype) {
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
   * MsgAnswerPoll represents the message used to answer a poll
   * </pre>
   *
   * Protobuf type {@code desmos.posts.v3.MsgAnswerPoll}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.posts.v3.MsgAnswerPoll)
      com.desmos.posts.v3.MsgAnswerPollOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.posts.v3.MsgsProto.internal_static_desmos_posts_v3_MsgAnswerPoll_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.posts.v3.MsgsProto.internal_static_desmos_posts_v3_MsgAnswerPoll_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.posts.v3.MsgAnswerPoll.class, com.desmos.posts.v3.MsgAnswerPoll.Builder.class);
    }

    // Construct using com.desmos.posts.v3.MsgAnswerPoll.newBuilder()
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
      pollId_ = 0;
      answersIndexes_ = emptyIntList();
      signer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.posts.v3.MsgsProto.internal_static_desmos_posts_v3_MsgAnswerPoll_descriptor;
    }

    @java.lang.Override
    public com.desmos.posts.v3.MsgAnswerPoll getDefaultInstanceForType() {
      return com.desmos.posts.v3.MsgAnswerPoll.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.posts.v3.MsgAnswerPoll build() {
      com.desmos.posts.v3.MsgAnswerPoll result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.posts.v3.MsgAnswerPoll buildPartial() {
      com.desmos.posts.v3.MsgAnswerPoll result = new com.desmos.posts.v3.MsgAnswerPoll(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.desmos.posts.v3.MsgAnswerPoll result) {
      if (((bitField0_ & 0x00000008) != 0)) {
        answersIndexes_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.answersIndexes_ = answersIndexes_;
    }

    private void buildPartial0(com.desmos.posts.v3.MsgAnswerPoll result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subspaceId_ = subspaceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.postId_ = postId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pollId_ = pollId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.signer_ = signer_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.posts.v3.MsgAnswerPoll) {
        return mergeFrom((com.desmos.posts.v3.MsgAnswerPoll)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.posts.v3.MsgAnswerPoll other) {
      if (other == com.desmos.posts.v3.MsgAnswerPoll.getDefaultInstance()) return this;
      if (other.getSubspaceId() != 0L) {
        setSubspaceId(other.getSubspaceId());
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
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureAnswersIndexesIsMutable();
          answersIndexes_.addAll(other.answersIndexes_);
        }
        onChanged();
      }
      if (!other.getSigner().isEmpty()) {
        signer_ = other.signer_;
        bitField0_ |= 0x00000010;
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
            case 24: {
              pollId_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              int v = input.readUInt32();
              ensureAnswersIndexesIsMutable();
              answersIndexes_.addInt(v);
              break;
            } // case 32
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureAnswersIndexesIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                answersIndexes_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            } // case 34
            case 42: {
              signer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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
     * Id of the post that contains the poll to be answered
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
     * Id of the post that contains the poll to be answered
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
     * Id of the post that contains the poll to be answered
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

    private int pollId_ ;
    /**
     * <pre>
     * Id of the poll to be answered
     * </pre>
     *
     * <code>uint32 poll_id = 3 [json_name = "pollId", (.gogoproto.customname) = "PollID", (.gogoproto.moretags) = "yaml:&#92;"poll_id&#92;""];</code>
     * @return The pollId.
     */
    @java.lang.Override
    public int getPollId() {
      return pollId_;
    }
    /**
     * <pre>
     * Id of the poll to be answered
     * </pre>
     *
     * <code>uint32 poll_id = 3 [json_name = "pollId", (.gogoproto.customname) = "PollID", (.gogoproto.moretags) = "yaml:&#92;"poll_id&#92;""];</code>
     * @param value The pollId to set.
     * @return This builder for chaining.
     */
    public Builder setPollId(int value) {

      pollId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the poll to be answered
     * </pre>
     *
     * <code>uint32 poll_id = 3 [json_name = "pollId", (.gogoproto.customname) = "PollID", (.gogoproto.moretags) = "yaml:&#92;"poll_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearPollId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pollId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList answersIndexes_ = emptyIntList();
    private void ensureAnswersIndexesIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        answersIndexes_ = mutableCopy(answersIndexes_);
        bitField0_ |= 0x00000008;
      }
    }
    /**
     * <pre>
     * Indexes of the answer inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 4 [json_name = "answersIndexes", (.gogoproto.moretags) = "yaml:&#92;"answers_indexes&#92;""];</code>
     * @return A list containing the answersIndexes.
     */
    public java.util.List<java.lang.Integer>
        getAnswersIndexesList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(answersIndexes_) : answersIndexes_;
    }
    /**
     * <pre>
     * Indexes of the answer inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 4 [json_name = "answersIndexes", (.gogoproto.moretags) = "yaml:&#92;"answers_indexes&#92;""];</code>
     * @return The count of answersIndexes.
     */
    public int getAnswersIndexesCount() {
      return answersIndexes_.size();
    }
    /**
     * <pre>
     * Indexes of the answer inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 4 [json_name = "answersIndexes", (.gogoproto.moretags) = "yaml:&#92;"answers_indexes&#92;""];</code>
     * @param index The index of the element to return.
     * @return The answersIndexes at the given index.
     */
    public int getAnswersIndexes(int index) {
      return answersIndexes_.getInt(index);
    }
    /**
     * <pre>
     * Indexes of the answer inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 4 [json_name = "answersIndexes", (.gogoproto.moretags) = "yaml:&#92;"answers_indexes&#92;""];</code>
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
     * Indexes of the answer inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 4 [json_name = "answersIndexes", (.gogoproto.moretags) = "yaml:&#92;"answers_indexes&#92;""];</code>
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
     * Indexes of the answer inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 4 [json_name = "answersIndexes", (.gogoproto.moretags) = "yaml:&#92;"answers_indexes&#92;""];</code>
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
     * Indexes of the answer inside the ProvidedAnswers array
     * </pre>
     *
     * <code>repeated uint32 answers_indexes = 4 [json_name = "answersIndexes", (.gogoproto.moretags) = "yaml:&#92;"answers_indexes&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAnswersIndexes() {
      answersIndexes_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    private java.lang.Object signer_ = "";
    /**
     * <pre>
     * Address of the user answering the poll
     * </pre>
     *
     * <code>string signer = 5 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @return The signer.
     */
    public java.lang.String getSigner() {
      java.lang.Object ref = signer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signer_ = s;
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
     * <code>string signer = 5 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @return The bytes for signer.
     */
    public com.google.protobuf.ByteString
        getSignerBytes() {
      java.lang.Object ref = signer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signer_ = b;
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
     * <code>string signer = 5 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @param value The signer to set.
     * @return This builder for chaining.
     */
    public Builder setSigner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signer_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the user answering the poll
     * </pre>
     *
     * <code>string signer = 5 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSigner() {
      signer_ = getDefaultInstance().getSigner();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the user answering the poll
     * </pre>
     *
     * <code>string signer = 5 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @param value The bytes for signer to set.
     * @return This builder for chaining.
     */
    public Builder setSignerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signer_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:desmos.posts.v3.MsgAnswerPoll)
  }

  // @@protoc_insertion_point(class_scope:desmos.posts.v3.MsgAnswerPoll)
  private static final com.desmos.posts.v3.MsgAnswerPoll DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.posts.v3.MsgAnswerPoll();
  }

  public static com.desmos.posts.v3.MsgAnswerPoll getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAnswerPoll>
      PARSER = new com.google.protobuf.AbstractParser<MsgAnswerPoll>() {
    @java.lang.Override
    public MsgAnswerPoll parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgAnswerPoll> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAnswerPoll> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.posts.v3.MsgAnswerPoll getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

