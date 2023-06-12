// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/event.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.EventNewClass}
 */
public final class EventNewClass extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.EventNewClass)
    EventNewClassOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventNewClass.newBuilder() to construct.
  private EventNewClass(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventNewClass() {
    classId_ = "";
    parentIscnIdPrefix_ = "";
    parentAccount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventNewClass();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventNewClass_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventNewClass_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.EventNewClass.class, com.likechain.likenft.v1.EventNewClass.Builder.class);
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

  public static final int PARENT_ISCN_ID_PREFIX_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parentIscnIdPrefix_ = "";
  /**
   * <code>string parent_iscn_id_prefix = 2 [json_name = "parentIscnIdPrefix"];</code>
   * @return The parentIscnIdPrefix.
   */
  @java.lang.Override
  public java.lang.String getParentIscnIdPrefix() {
    java.lang.Object ref = parentIscnIdPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parentIscnIdPrefix_ = s;
      return s;
    }
  }
  /**
   * <code>string parent_iscn_id_prefix = 2 [json_name = "parentIscnIdPrefix"];</code>
   * @return The bytes for parentIscnIdPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentIscnIdPrefixBytes() {
    java.lang.Object ref = parentIscnIdPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parentIscnIdPrefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_ACCOUNT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parentAccount_ = "";
  /**
   * <code>string parent_account = 3 [json_name = "parentAccount"];</code>
   * @return The parentAccount.
   */
  @java.lang.Override
  public java.lang.String getParentAccount() {
    java.lang.Object ref = parentAccount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parentAccount_ = s;
      return s;
    }
  }
  /**
   * <code>string parent_account = 3 [json_name = "parentAccount"];</code>
   * @return The bytes for parentAccount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentAccountBytes() {
    java.lang.Object ref = parentAccount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parentAccount_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parentIscnIdPrefix_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, parentIscnIdPrefix_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parentAccount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, parentAccount_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parentIscnIdPrefix_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, parentIscnIdPrefix_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parentAccount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, parentAccount_);
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
    if (!(obj instanceof com.likechain.likenft.v1.EventNewClass)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.EventNewClass other = (com.likechain.likenft.v1.EventNewClass) obj;

    if (!getClassId()
        .equals(other.getClassId())) return false;
    if (!getParentIscnIdPrefix()
        .equals(other.getParentIscnIdPrefix())) return false;
    if (!getParentAccount()
        .equals(other.getParentAccount())) return false;
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
    hash = (37 * hash) + PARENT_ISCN_ID_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getParentIscnIdPrefix().hashCode();
    hash = (37 * hash) + PARENT_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getParentAccount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.EventNewClass parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.EventNewClass parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventNewClass parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.EventNewClass parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventNewClass parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.EventNewClass parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventNewClass parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.EventNewClass parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.EventNewClass parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.EventNewClass parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventNewClass parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.EventNewClass parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.EventNewClass prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.EventNewClass}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.EventNewClass)
      com.likechain.likenft.v1.EventNewClassOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventNewClass_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventNewClass_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.EventNewClass.class, com.likechain.likenft.v1.EventNewClass.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.EventNewClass.newBuilder()
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
      parentIscnIdPrefix_ = "";
      parentAccount_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventNewClass_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.EventNewClass getDefaultInstanceForType() {
      return com.likechain.likenft.v1.EventNewClass.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.EventNewClass build() {
      com.likechain.likenft.v1.EventNewClass result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.EventNewClass buildPartial() {
      com.likechain.likenft.v1.EventNewClass result = new com.likechain.likenft.v1.EventNewClass(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.likenft.v1.EventNewClass result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.classId_ = classId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parentIscnIdPrefix_ = parentIscnIdPrefix_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.parentAccount_ = parentAccount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.EventNewClass) {
        return mergeFrom((com.likechain.likenft.v1.EventNewClass)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.EventNewClass other) {
      if (other == com.likechain.likenft.v1.EventNewClass.getDefaultInstance()) return this;
      if (!other.getClassId().isEmpty()) {
        classId_ = other.classId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getParentIscnIdPrefix().isEmpty()) {
        parentIscnIdPrefix_ = other.parentIscnIdPrefix_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getParentAccount().isEmpty()) {
        parentAccount_ = other.parentAccount_;
        bitField0_ |= 0x00000004;
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
              parentIscnIdPrefix_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              parentAccount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object parentIscnIdPrefix_ = "";
    /**
     * <code>string parent_iscn_id_prefix = 2 [json_name = "parentIscnIdPrefix"];</code>
     * @return The parentIscnIdPrefix.
     */
    public java.lang.String getParentIscnIdPrefix() {
      java.lang.Object ref = parentIscnIdPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parentIscnIdPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string parent_iscn_id_prefix = 2 [json_name = "parentIscnIdPrefix"];</code>
     * @return The bytes for parentIscnIdPrefix.
     */
    public com.google.protobuf.ByteString
        getParentIscnIdPrefixBytes() {
      java.lang.Object ref = parentIscnIdPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parentIscnIdPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string parent_iscn_id_prefix = 2 [json_name = "parentIscnIdPrefix"];</code>
     * @param value The parentIscnIdPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setParentIscnIdPrefix(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parentIscnIdPrefix_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string parent_iscn_id_prefix = 2 [json_name = "parentIscnIdPrefix"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParentIscnIdPrefix() {
      parentIscnIdPrefix_ = getDefaultInstance().getParentIscnIdPrefix();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string parent_iscn_id_prefix = 2 [json_name = "parentIscnIdPrefix"];</code>
     * @param value The bytes for parentIscnIdPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setParentIscnIdPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parentIscnIdPrefix_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object parentAccount_ = "";
    /**
     * <code>string parent_account = 3 [json_name = "parentAccount"];</code>
     * @return The parentAccount.
     */
    public java.lang.String getParentAccount() {
      java.lang.Object ref = parentAccount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parentAccount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string parent_account = 3 [json_name = "parentAccount"];</code>
     * @return The bytes for parentAccount.
     */
    public com.google.protobuf.ByteString
        getParentAccountBytes() {
      java.lang.Object ref = parentAccount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parentAccount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string parent_account = 3 [json_name = "parentAccount"];</code>
     * @param value The parentAccount to set.
     * @return This builder for chaining.
     */
    public Builder setParentAccount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parentAccount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string parent_account = 3 [json_name = "parentAccount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParentAccount() {
      parentAccount_ = getDefaultInstance().getParentAccount();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string parent_account = 3 [json_name = "parentAccount"];</code>
     * @param value The bytes for parentAccount to set.
     * @return This builder for chaining.
     */
    public Builder setParentAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parentAccount_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.EventNewClass)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.EventNewClass)
  private static final com.likechain.likenft.v1.EventNewClass DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.EventNewClass();
  }

  public static com.likechain.likenft.v1.EventNewClass getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventNewClass>
      PARSER = new com.google.protobuf.AbstractParser<EventNewClass>() {
    @java.lang.Override
    public EventNewClass parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventNewClass> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventNewClass> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.EventNewClass getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

