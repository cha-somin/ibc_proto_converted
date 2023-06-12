// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v3/genesis.proto

package com.desmos.posts.v3;

/**
 * <pre>
 * ActivePollData contains the data of an active poll
 * </pre>
 *
 * Protobuf type {@code desmos.posts.v3.ActivePollData}
 */
public final class ActivePollData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.posts.v3.ActivePollData)
    ActivePollDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ActivePollData.newBuilder() to construct.
  private ActivePollData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActivePollData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ActivePollData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.posts.v3.GenesisProto.internal_static_desmos_posts_v3_ActivePollData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.posts.v3.GenesisProto.internal_static_desmos_posts_v3_ActivePollData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.posts.v3.ActivePollData.class, com.desmos.posts.v3.ActivePollData.Builder.class);
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

  public static final int POLL_ID_FIELD_NUMBER = 3;
  private int pollId_ = 0;
  /**
   * <code>uint32 poll_id = 3 [json_name = "pollId", (.gogoproto.customname) = "PollID"];</code>
   * @return The pollId.
   */
  @java.lang.Override
  public int getPollId() {
    return pollId_;
  }

  public static final int END_DATE_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp endDate_;
  /**
   * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the endDate field is set.
   */
  @java.lang.Override
  public boolean hasEndDate() {
    return endDate_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The endDate.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndDate() {
    return endDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endDate_;
  }
  /**
   * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder() {
    return endDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endDate_;
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
    if (pollId_ != 0) {
      output.writeUInt32(3, pollId_);
    }
    if (endDate_ != null) {
      output.writeMessage(4, getEndDate());
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
    if (endDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getEndDate());
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
    if (!(obj instanceof com.desmos.posts.v3.ActivePollData)) {
      return super.equals(obj);
    }
    com.desmos.posts.v3.ActivePollData other = (com.desmos.posts.v3.ActivePollData) obj;

    if (getSubspaceId()
        != other.getSubspaceId()) return false;
    if (getPostId()
        != other.getPostId()) return false;
    if (getPollId()
        != other.getPollId()) return false;
    if (hasEndDate() != other.hasEndDate()) return false;
    if (hasEndDate()) {
      if (!getEndDate()
          .equals(other.getEndDate())) return false;
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
    hash = (37 * hash) + SUBSPACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSubspaceId());
    hash = (37 * hash) + POST_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPostId());
    hash = (37 * hash) + POLL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPollId();
    if (hasEndDate()) {
      hash = (37 * hash) + END_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getEndDate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.posts.v3.ActivePollData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.ActivePollData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.ActivePollData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.ActivePollData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.ActivePollData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.posts.v3.ActivePollData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.posts.v3.ActivePollData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v3.ActivePollData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.posts.v3.ActivePollData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.posts.v3.ActivePollData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.posts.v3.ActivePollData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.posts.v3.ActivePollData parseFrom(
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
  public static Builder newBuilder(com.desmos.posts.v3.ActivePollData prototype) {
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
   * ActivePollData contains the data of an active poll
   * </pre>
   *
   * Protobuf type {@code desmos.posts.v3.ActivePollData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.posts.v3.ActivePollData)
      com.desmos.posts.v3.ActivePollDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.posts.v3.GenesisProto.internal_static_desmos_posts_v3_ActivePollData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.posts.v3.GenesisProto.internal_static_desmos_posts_v3_ActivePollData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.posts.v3.ActivePollData.class, com.desmos.posts.v3.ActivePollData.Builder.class);
    }

    // Construct using com.desmos.posts.v3.ActivePollData.newBuilder()
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
      endDate_ = null;
      if (endDateBuilder_ != null) {
        endDateBuilder_.dispose();
        endDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.posts.v3.GenesisProto.internal_static_desmos_posts_v3_ActivePollData_descriptor;
    }

    @java.lang.Override
    public com.desmos.posts.v3.ActivePollData getDefaultInstanceForType() {
      return com.desmos.posts.v3.ActivePollData.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.posts.v3.ActivePollData build() {
      com.desmos.posts.v3.ActivePollData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.posts.v3.ActivePollData buildPartial() {
      com.desmos.posts.v3.ActivePollData result = new com.desmos.posts.v3.ActivePollData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.posts.v3.ActivePollData result) {
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
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.endDate_ = endDateBuilder_ == null
            ? endDate_
            : endDateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.posts.v3.ActivePollData) {
        return mergeFrom((com.desmos.posts.v3.ActivePollData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.posts.v3.ActivePollData other) {
      if (other == com.desmos.posts.v3.ActivePollData.getDefaultInstance()) return this;
      if (other.getSubspaceId() != 0L) {
        setSubspaceId(other.getSubspaceId());
      }
      if (other.getPostId() != 0L) {
        setPostId(other.getPostId());
      }
      if (other.getPollId() != 0) {
        setPollId(other.getPollId());
      }
      if (other.hasEndDate()) {
        mergeEndDate(other.getEndDate());
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
            case 34: {
              input.readMessage(
                  getEndDateFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private int pollId_ ;
    /**
     * <code>uint32 poll_id = 3 [json_name = "pollId", (.gogoproto.customname) = "PollID"];</code>
     * @return The pollId.
     */
    @java.lang.Override
    public int getPollId() {
      return pollId_;
    }
    /**
     * <code>uint32 poll_id = 3 [json_name = "pollId", (.gogoproto.customname) = "PollID"];</code>
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
     * <code>uint32 poll_id = 3 [json_name = "pollId", (.gogoproto.customname) = "PollID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPollId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pollId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp endDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endDateBuilder_;
    /**
     * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the endDate field is set.
     */
    public boolean hasEndDate() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The endDate.
     */
    public com.google.protobuf.Timestamp getEndDate() {
      if (endDateBuilder_ == null) {
        return endDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endDate_;
      } else {
        return endDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setEndDate(com.google.protobuf.Timestamp value) {
      if (endDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endDate_ = value;
      } else {
        endDateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setEndDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endDateBuilder_ == null) {
        endDate_ = builderForValue.build();
      } else {
        endDateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeEndDate(com.google.protobuf.Timestamp value) {
      if (endDateBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          endDate_ != null &&
          endDate_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getEndDateBuilder().mergeFrom(value);
        } else {
          endDate_ = value;
        }
      } else {
        endDateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearEndDate() {
      bitField0_ = (bitField0_ & ~0x00000008);
      endDate_ = null;
      if (endDateBuilder_ != null) {
        endDateBuilder_.dispose();
        endDateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndDateBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getEndDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder() {
      if (endDateBuilder_ != null) {
        return endDateBuilder_.getMessageOrBuilder();
      } else {
        return endDate_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : endDate_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp end_date = 4 [json_name = "endDate", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getEndDateFieldBuilder() {
      if (endDateBuilder_ == null) {
        endDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getEndDate(),
                getParentForChildren(),
                isClean());
        endDate_ = null;
      }
      return endDateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:desmos.posts.v3.ActivePollData)
  }

  // @@protoc_insertion_point(class_scope:desmos.posts.v3.ActivePollData)
  private static final com.desmos.posts.v3.ActivePollData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.posts.v3.ActivePollData();
  }

  public static com.desmos.posts.v3.ActivePollData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActivePollData>
      PARSER = new com.google.protobuf.AbstractParser<ActivePollData>() {
    @java.lang.Override
    public ActivePollData parsePartialFrom(
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

  public static com.google.protobuf.Parser<ActivePollData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActivePollData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.posts.v3.ActivePollData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

