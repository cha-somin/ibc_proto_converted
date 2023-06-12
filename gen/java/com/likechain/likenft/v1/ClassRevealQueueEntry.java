// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/class_reveal_queue.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.ClassRevealQueueEntry}
 */
public final class ClassRevealQueueEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.ClassRevealQueueEntry)
    ClassRevealQueueEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClassRevealQueueEntry.newBuilder() to construct.
  private ClassRevealQueueEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClassRevealQueueEntry() {
    classId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClassRevealQueueEntry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.ClassRevealQueueProto.internal_static_likechain_likenft_v1_ClassRevealQueueEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.ClassRevealQueueProto.internal_static_likechain_likenft_v1_ClassRevealQueueEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.ClassRevealQueueEntry.class, com.likechain.likenft.v1.ClassRevealQueueEntry.Builder.class);
  }

  public static final int REVEAL_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp revealTime_;
  /**
   * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the revealTime field is set.
   */
  @java.lang.Override
  public boolean hasRevealTime() {
    return revealTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The revealTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getRevealTime() {
    return revealTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : revealTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getRevealTimeOrBuilder() {
    return revealTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : revealTime_;
  }

  public static final int CLASS_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object classId_ = "";
  /**
   * <code>string class_id = 2 [json_name = "classId"];</code>
   * @return The classId.
   */
  @java.lang.Override
  public java.lang.String getClassId() {
    java.lang.Object ref = classId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      classId_ = s;
      return s;
    }
  }
  /**
   * <code>string class_id = 2 [json_name = "classId"];</code>
   * @return The bytes for classId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClassIdBytes() {
    java.lang.Object ref = classId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      classId_ = b;
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
    if (revealTime_ != null) {
      output.writeMessage(1, getRevealTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, classId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (revealTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRevealTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, classId_);
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
    if (!(obj instanceof com.likechain.likenft.v1.ClassRevealQueueEntry)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.ClassRevealQueueEntry other = (com.likechain.likenft.v1.ClassRevealQueueEntry) obj;

    if (hasRevealTime() != other.hasRevealTime()) return false;
    if (hasRevealTime()) {
      if (!getRevealTime()
          .equals(other.getRevealTime())) return false;
    }
    if (!getClassId()
        .equals(other.getClassId())) return false;
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
    if (hasRevealTime()) {
      hash = (37 * hash) + REVEAL_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getRevealTime().hashCode();
    }
    hash = (37 * hash) + CLASS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClassId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.ClassRevealQueueEntry parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.ClassRevealQueueEntry prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.ClassRevealQueueEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.ClassRevealQueueEntry)
      com.likechain.likenft.v1.ClassRevealQueueEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.ClassRevealQueueProto.internal_static_likechain_likenft_v1_ClassRevealQueueEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.ClassRevealQueueProto.internal_static_likechain_likenft_v1_ClassRevealQueueEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.ClassRevealQueueEntry.class, com.likechain.likenft.v1.ClassRevealQueueEntry.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.ClassRevealQueueEntry.newBuilder()
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
      revealTime_ = null;
      if (revealTimeBuilder_ != null) {
        revealTimeBuilder_.dispose();
        revealTimeBuilder_ = null;
      }
      classId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.likenft.v1.ClassRevealQueueProto.internal_static_likechain_likenft_v1_ClassRevealQueueEntry_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.ClassRevealQueueEntry getDefaultInstanceForType() {
      return com.likechain.likenft.v1.ClassRevealQueueEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.ClassRevealQueueEntry build() {
      com.likechain.likenft.v1.ClassRevealQueueEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.ClassRevealQueueEntry buildPartial() {
      com.likechain.likenft.v1.ClassRevealQueueEntry result = new com.likechain.likenft.v1.ClassRevealQueueEntry(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.likenft.v1.ClassRevealQueueEntry result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.revealTime_ = revealTimeBuilder_ == null
            ? revealTime_
            : revealTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.classId_ = classId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.ClassRevealQueueEntry) {
        return mergeFrom((com.likechain.likenft.v1.ClassRevealQueueEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.ClassRevealQueueEntry other) {
      if (other == com.likechain.likenft.v1.ClassRevealQueueEntry.getDefaultInstance()) return this;
      if (other.hasRevealTime()) {
        mergeRevealTime(other.getRevealTime());
      }
      if (!other.getClassId().isEmpty()) {
        classId_ = other.classId_;
        bitField0_ |= 0x00000002;
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
            case 10: {
              input.readMessage(
                  getRevealTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              classId_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.Timestamp revealTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> revealTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the revealTime field is set.
     */
    public boolean hasRevealTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The revealTime.
     */
    public com.google.protobuf.Timestamp getRevealTime() {
      if (revealTimeBuilder_ == null) {
        return revealTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : revealTime_;
      } else {
        return revealTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setRevealTime(com.google.protobuf.Timestamp value) {
      if (revealTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        revealTime_ = value;
      } else {
        revealTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setRevealTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (revealTimeBuilder_ == null) {
        revealTime_ = builderForValue.build();
      } else {
        revealTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeRevealTime(com.google.protobuf.Timestamp value) {
      if (revealTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          revealTime_ != null &&
          revealTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getRevealTimeBuilder().mergeFrom(value);
        } else {
          revealTime_ = value;
        }
      } else {
        revealTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearRevealTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      revealTime_ = null;
      if (revealTimeBuilder_ != null) {
        revealTimeBuilder_.dispose();
        revealTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getRevealTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRevealTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getRevealTimeOrBuilder() {
      if (revealTimeBuilder_ != null) {
        return revealTimeBuilder_.getMessageOrBuilder();
      } else {
        return revealTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : revealTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp reveal_time = 1 [json_name = "revealTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getRevealTimeFieldBuilder() {
      if (revealTimeBuilder_ == null) {
        revealTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getRevealTime(),
                getParentForChildren(),
                isClean());
        revealTime_ = null;
      }
      return revealTimeBuilder_;
    }

    private java.lang.Object classId_ = "";
    /**
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @return The classId.
     */
    public java.lang.String getClassId() {
      java.lang.Object ref = classId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        classId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @return The bytes for classId.
     */
    public com.google.protobuf.ByteString
        getClassIdBytes() {
      java.lang.Object ref = classId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        classId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @param value The classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      classId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClassId() {
      classId_ = getDefaultInstance().getClassId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @param value The bytes for classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      classId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.ClassRevealQueueEntry)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.ClassRevealQueueEntry)
  private static final com.likechain.likenft.v1.ClassRevealQueueEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.ClassRevealQueueEntry();
  }

  public static com.likechain.likenft.v1.ClassRevealQueueEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClassRevealQueueEntry>
      PARSER = new com.google.protobuf.AbstractParser<ClassRevealQueueEntry>() {
    @java.lang.Override
    public ClassRevealQueueEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClassRevealQueueEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClassRevealQueueEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.ClassRevealQueueEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

