// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/event.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.EventCreateBlindBoxContent}
 */
public final class EventCreateBlindBoxContent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.EventCreateBlindBoxContent)
    EventCreateBlindBoxContentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventCreateBlindBoxContent.newBuilder() to construct.
  private EventCreateBlindBoxContent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventCreateBlindBoxContent() {
    classId_ = "";
    contentId_ = "";
    classParentIscnIdPrefix_ = "";
    classParentAccount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventCreateBlindBoxContent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventCreateBlindBoxContent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventCreateBlindBoxContent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.EventCreateBlindBoxContent.class, com.likechain.likenft.v1.EventCreateBlindBoxContent.Builder.class);
  }

  public static final int CLASS_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object classId_ = "";
  /**
   * <code>string class_id = 1 [json_name = "classId"];</code>
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
   * <code>string class_id = 1 [json_name = "classId"];</code>
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

  public static final int CONTENT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contentId_ = "";
  /**
   * <code>string content_id = 2 [json_name = "contentId"];</code>
   * @return The contentId.
   */
  @java.lang.Override
  public java.lang.String getContentId() {
    java.lang.Object ref = contentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentId_ = s;
      return s;
    }
  }
  /**
   * <code>string content_id = 2 [json_name = "contentId"];</code>
   * @return The bytes for contentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentIdBytes() {
    java.lang.Object ref = contentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLASS_PARENT_ISCN_ID_PREFIX_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object classParentIscnIdPrefix_ = "";
  /**
   * <code>string class_parent_iscn_id_prefix = 3 [json_name = "classParentIscnIdPrefix"];</code>
   * @return The classParentIscnIdPrefix.
   */
  @java.lang.Override
  public java.lang.String getClassParentIscnIdPrefix() {
    java.lang.Object ref = classParentIscnIdPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      classParentIscnIdPrefix_ = s;
      return s;
    }
  }
  /**
   * <code>string class_parent_iscn_id_prefix = 3 [json_name = "classParentIscnIdPrefix"];</code>
   * @return The bytes for classParentIscnIdPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClassParentIscnIdPrefixBytes() {
    java.lang.Object ref = classParentIscnIdPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      classParentIscnIdPrefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLASS_PARENT_ACCOUNT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object classParentAccount_ = "";
  /**
   * <code>string class_parent_account = 4 [json_name = "classParentAccount"];</code>
   * @return The classParentAccount.
   */
  @java.lang.Override
  public java.lang.String getClassParentAccount() {
    java.lang.Object ref = classParentAccount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      classParentAccount_ = s;
      return s;
    }
  }
  /**
   * <code>string class_parent_account = 4 [json_name = "classParentAccount"];</code>
   * @return The bytes for classParentAccount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClassParentAccountBytes() {
    java.lang.Object ref = classParentAccount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      classParentAccount_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, classId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, contentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classParentIscnIdPrefix_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, classParentIscnIdPrefix_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classParentAccount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, classParentAccount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, classId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, contentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classParentIscnIdPrefix_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, classParentIscnIdPrefix_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classParentAccount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, classParentAccount_);
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
    if (!(obj instanceof com.likechain.likenft.v1.EventCreateBlindBoxContent)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.EventCreateBlindBoxContent other = (com.likechain.likenft.v1.EventCreateBlindBoxContent) obj;

    if (!getClassId()
        .equals(other.getClassId())) return false;
    if (!getContentId()
        .equals(other.getContentId())) return false;
    if (!getClassParentIscnIdPrefix()
        .equals(other.getClassParentIscnIdPrefix())) return false;
    if (!getClassParentAccount()
        .equals(other.getClassParentAccount())) return false;
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
    hash = (37 * hash) + CLASS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClassId().hashCode();
    hash = (37 * hash) + CONTENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getContentId().hashCode();
    hash = (37 * hash) + CLASS_PARENT_ISCN_ID_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getClassParentIscnIdPrefix().hashCode();
    hash = (37 * hash) + CLASS_PARENT_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getClassParentAccount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.EventCreateBlindBoxContent parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.EventCreateBlindBoxContent prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.EventCreateBlindBoxContent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.EventCreateBlindBoxContent)
      com.likechain.likenft.v1.EventCreateBlindBoxContentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventCreateBlindBoxContent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventCreateBlindBoxContent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.EventCreateBlindBoxContent.class, com.likechain.likenft.v1.EventCreateBlindBoxContent.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.EventCreateBlindBoxContent.newBuilder()
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
      classId_ = "";
      contentId_ = "";
      classParentIscnIdPrefix_ = "";
      classParentAccount_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventCreateBlindBoxContent_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.EventCreateBlindBoxContent getDefaultInstanceForType() {
      return com.likechain.likenft.v1.EventCreateBlindBoxContent.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.EventCreateBlindBoxContent build() {
      com.likechain.likenft.v1.EventCreateBlindBoxContent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.EventCreateBlindBoxContent buildPartial() {
      com.likechain.likenft.v1.EventCreateBlindBoxContent result = new com.likechain.likenft.v1.EventCreateBlindBoxContent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.likenft.v1.EventCreateBlindBoxContent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.classId_ = classId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.contentId_ = contentId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.classParentIscnIdPrefix_ = classParentIscnIdPrefix_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.classParentAccount_ = classParentAccount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.EventCreateBlindBoxContent) {
        return mergeFrom((com.likechain.likenft.v1.EventCreateBlindBoxContent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.EventCreateBlindBoxContent other) {
      if (other == com.likechain.likenft.v1.EventCreateBlindBoxContent.getDefaultInstance()) return this;
      if (!other.getClassId().isEmpty()) {
        classId_ = other.classId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getContentId().isEmpty()) {
        contentId_ = other.contentId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getClassParentIscnIdPrefix().isEmpty()) {
        classParentIscnIdPrefix_ = other.classParentIscnIdPrefix_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getClassParentAccount().isEmpty()) {
        classParentAccount_ = other.classParentAccount_;
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
            case 10: {
              classId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              contentId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              classParentIscnIdPrefix_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              classParentAccount_ = input.readStringRequireUtf8();
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

    private java.lang.Object classId_ = "";
    /**
     * <code>string class_id = 1 [json_name = "classId"];</code>
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
     * <code>string class_id = 1 [json_name = "classId"];</code>
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
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @param value The classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      classId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClassId() {
      classId_ = getDefaultInstance().getClassId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @param value The bytes for classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      classId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object contentId_ = "";
    /**
     * <code>string content_id = 2 [json_name = "contentId"];</code>
     * @return The contentId.
     */
    public java.lang.String getContentId() {
      java.lang.Object ref = contentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content_id = 2 [json_name = "contentId"];</code>
     * @return The bytes for contentId.
     */
    public com.google.protobuf.ByteString
        getContentIdBytes() {
      java.lang.Object ref = contentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content_id = 2 [json_name = "contentId"];</code>
     * @param value The contentId to set.
     * @return This builder for chaining.
     */
    public Builder setContentId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contentId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string content_id = 2 [json_name = "contentId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContentId() {
      contentId_ = getDefaultInstance().getContentId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string content_id = 2 [json_name = "contentId"];</code>
     * @param value The bytes for contentId to set.
     * @return This builder for chaining.
     */
    public Builder setContentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contentId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object classParentIscnIdPrefix_ = "";
    /**
     * <code>string class_parent_iscn_id_prefix = 3 [json_name = "classParentIscnIdPrefix"];</code>
     * @return The classParentIscnIdPrefix.
     */
    public java.lang.String getClassParentIscnIdPrefix() {
      java.lang.Object ref = classParentIscnIdPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        classParentIscnIdPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string class_parent_iscn_id_prefix = 3 [json_name = "classParentIscnIdPrefix"];</code>
     * @return The bytes for classParentIscnIdPrefix.
     */
    public com.google.protobuf.ByteString
        getClassParentIscnIdPrefixBytes() {
      java.lang.Object ref = classParentIscnIdPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        classParentIscnIdPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string class_parent_iscn_id_prefix = 3 [json_name = "classParentIscnIdPrefix"];</code>
     * @param value The classParentIscnIdPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setClassParentIscnIdPrefix(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      classParentIscnIdPrefix_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string class_parent_iscn_id_prefix = 3 [json_name = "classParentIscnIdPrefix"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClassParentIscnIdPrefix() {
      classParentIscnIdPrefix_ = getDefaultInstance().getClassParentIscnIdPrefix();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string class_parent_iscn_id_prefix = 3 [json_name = "classParentIscnIdPrefix"];</code>
     * @param value The bytes for classParentIscnIdPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setClassParentIscnIdPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      classParentIscnIdPrefix_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object classParentAccount_ = "";
    /**
     * <code>string class_parent_account = 4 [json_name = "classParentAccount"];</code>
     * @return The classParentAccount.
     */
    public java.lang.String getClassParentAccount() {
      java.lang.Object ref = classParentAccount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        classParentAccount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string class_parent_account = 4 [json_name = "classParentAccount"];</code>
     * @return The bytes for classParentAccount.
     */
    public com.google.protobuf.ByteString
        getClassParentAccountBytes() {
      java.lang.Object ref = classParentAccount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        classParentAccount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string class_parent_account = 4 [json_name = "classParentAccount"];</code>
     * @param value The classParentAccount to set.
     * @return This builder for chaining.
     */
    public Builder setClassParentAccount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      classParentAccount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string class_parent_account = 4 [json_name = "classParentAccount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClassParentAccount() {
      classParentAccount_ = getDefaultInstance().getClassParentAccount();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string class_parent_account = 4 [json_name = "classParentAccount"];</code>
     * @param value The bytes for classParentAccount to set.
     * @return This builder for chaining.
     */
    public Builder setClassParentAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      classParentAccount_ = value;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.EventCreateBlindBoxContent)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.EventCreateBlindBoxContent)
  private static final com.likechain.likenft.v1.EventCreateBlindBoxContent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.EventCreateBlindBoxContent();
  }

  public static com.likechain.likenft.v1.EventCreateBlindBoxContent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventCreateBlindBoxContent>
      PARSER = new com.google.protobuf.AbstractParser<EventCreateBlindBoxContent>() {
    @java.lang.Override
    public EventCreateBlindBoxContent parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventCreateBlindBoxContent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventCreateBlindBoxContent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.EventCreateBlindBoxContent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

