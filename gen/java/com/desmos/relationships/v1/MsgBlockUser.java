// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/relationships/v1/msgs.proto

package com.desmos.relationships.v1;

/**
 * <pre>
 * MsgBlockUser represents a message to block another user specifying an
 * optional reason.
 * </pre>
 *
 * Protobuf type {@code desmos.relationships.v1.MsgBlockUser}
 */
public final class MsgBlockUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.relationships.v1.MsgBlockUser)
    MsgBlockUserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgBlockUser.newBuilder() to construct.
  private MsgBlockUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgBlockUser() {
    blocker_ = "";
    blocked_ = "";
    reason_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgBlockUser();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.relationships.v1.MsgsProto.internal_static_desmos_relationships_v1_MsgBlockUser_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.relationships.v1.MsgsProto.internal_static_desmos_relationships_v1_MsgBlockUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.relationships.v1.MsgBlockUser.class, com.desmos.relationships.v1.MsgBlockUser.Builder.class);
  }

  public static final int BLOCKER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object blocker_ = "";
  /**
   * <pre>
   * Address of the user blocking the other user
   * </pre>
   *
   * <code>string blocker = 1 [json_name = "blocker", (.gogoproto.moretags) = "yaml:&#92;"blocker&#92;""];</code>
   * @return The blocker.
   */
  @java.lang.Override
  public java.lang.String getBlocker() {
    java.lang.Object ref = blocker_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      blocker_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Address of the user blocking the other user
   * </pre>
   *
   * <code>string blocker = 1 [json_name = "blocker", (.gogoproto.moretags) = "yaml:&#92;"blocker&#92;""];</code>
   * @return The bytes for blocker.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBlockerBytes() {
    java.lang.Object ref = blocker_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      blocker_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BLOCKED_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object blocked_ = "";
  /**
   * <pre>
   * Address of the user that should be blocked
   * </pre>
   *
   * <code>string blocked = 2 [json_name = "blocked", (.gogoproto.moretags) = "yaml:&#92;"blocked&#92;""];</code>
   * @return The blocked.
   */
  @java.lang.Override
  public java.lang.String getBlocked() {
    java.lang.Object ref = blocked_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      blocked_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Address of the user that should be blocked
   * </pre>
   *
   * <code>string blocked = 2 [json_name = "blocked", (.gogoproto.moretags) = "yaml:&#92;"blocked&#92;""];</code>
   * @return The bytes for blocked.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBlockedBytes() {
    java.lang.Object ref = blocked_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      blocked_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REASON_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object reason_ = "";
  /**
   * <pre>
   * (optional) Reason why the user has been blocked
   * </pre>
   *
   * <code>string reason = 3 [json_name = "reason", (.gogoproto.moretags) = "yaml:&#92;"reason&#92;""];</code>
   * @return The reason.
   */
  @java.lang.Override
  public java.lang.String getReason() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reason_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (optional) Reason why the user has been blocked
   * </pre>
   *
   * <code>string reason = 3 [json_name = "reason", (.gogoproto.moretags) = "yaml:&#92;"reason&#92;""];</code>
   * @return The bytes for reason.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReasonBytes() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reason_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBSPACE_ID_FIELD_NUMBER = 4;
  private long subspaceId_ = 0L;
  /**
   * <pre>
   * Id of the subspace inside which the user should be blocked
   * </pre>
   *
   * <code>uint64 subspace_id = 4 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
   * @return The subspaceId.
   */
  @java.lang.Override
  public long getSubspaceId() {
    return subspaceId_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(blocker_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, blocker_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(blocked_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, blocked_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reason_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, reason_);
    }
    if (subspaceId_ != 0L) {
      output.writeUInt64(4, subspaceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(blocker_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, blocker_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(blocked_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, blocked_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reason_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, reason_);
    }
    if (subspaceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, subspaceId_);
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
    if (!(obj instanceof com.desmos.relationships.v1.MsgBlockUser)) {
      return super.equals(obj);
    }
    com.desmos.relationships.v1.MsgBlockUser other = (com.desmos.relationships.v1.MsgBlockUser) obj;

    if (!getBlocker()
        .equals(other.getBlocker())) return false;
    if (!getBlocked()
        .equals(other.getBlocked())) return false;
    if (!getReason()
        .equals(other.getReason())) return false;
    if (getSubspaceId()
        != other.getSubspaceId()) return false;
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
    hash = (37 * hash) + BLOCKER_FIELD_NUMBER;
    hash = (53 * hash) + getBlocker().hashCode();
    hash = (37 * hash) + BLOCKED_FIELD_NUMBER;
    hash = (53 * hash) + getBlocked().hashCode();
    hash = (37 * hash) + REASON_FIELD_NUMBER;
    hash = (53 * hash) + getReason().hashCode();
    hash = (37 * hash) + SUBSPACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSubspaceId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.relationships.v1.MsgBlockUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.relationships.v1.MsgBlockUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.relationships.v1.MsgBlockUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.relationships.v1.MsgBlockUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.relationships.v1.MsgBlockUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.relationships.v1.MsgBlockUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.relationships.v1.MsgBlockUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.relationships.v1.MsgBlockUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.relationships.v1.MsgBlockUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.relationships.v1.MsgBlockUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.relationships.v1.MsgBlockUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.relationships.v1.MsgBlockUser parseFrom(
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
  public static Builder newBuilder(com.desmos.relationships.v1.MsgBlockUser prototype) {
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
   * MsgBlockUser represents a message to block another user specifying an
   * optional reason.
   * </pre>
   *
   * Protobuf type {@code desmos.relationships.v1.MsgBlockUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.relationships.v1.MsgBlockUser)
      com.desmos.relationships.v1.MsgBlockUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.relationships.v1.MsgsProto.internal_static_desmos_relationships_v1_MsgBlockUser_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.relationships.v1.MsgsProto.internal_static_desmos_relationships_v1_MsgBlockUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.relationships.v1.MsgBlockUser.class, com.desmos.relationships.v1.MsgBlockUser.Builder.class);
    }

    // Construct using com.desmos.relationships.v1.MsgBlockUser.newBuilder()
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
      blocker_ = "";
      blocked_ = "";
      reason_ = "";
      subspaceId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.relationships.v1.MsgsProto.internal_static_desmos_relationships_v1_MsgBlockUser_descriptor;
    }

    @java.lang.Override
    public com.desmos.relationships.v1.MsgBlockUser getDefaultInstanceForType() {
      return com.desmos.relationships.v1.MsgBlockUser.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.relationships.v1.MsgBlockUser build() {
      com.desmos.relationships.v1.MsgBlockUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.relationships.v1.MsgBlockUser buildPartial() {
      com.desmos.relationships.v1.MsgBlockUser result = new com.desmos.relationships.v1.MsgBlockUser(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.relationships.v1.MsgBlockUser result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.blocker_ = blocker_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.blocked_ = blocked_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.reason_ = reason_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.subspaceId_ = subspaceId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.relationships.v1.MsgBlockUser) {
        return mergeFrom((com.desmos.relationships.v1.MsgBlockUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.relationships.v1.MsgBlockUser other) {
      if (other == com.desmos.relationships.v1.MsgBlockUser.getDefaultInstance()) return this;
      if (!other.getBlocker().isEmpty()) {
        blocker_ = other.blocker_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBlocked().isEmpty()) {
        blocked_ = other.blocked_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getReason().isEmpty()) {
        reason_ = other.reason_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getSubspaceId() != 0L) {
        setSubspaceId(other.getSubspaceId());
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
              blocker_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              blocked_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              reason_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              subspaceId_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object blocker_ = "";
    /**
     * <pre>
     * Address of the user blocking the other user
     * </pre>
     *
     * <code>string blocker = 1 [json_name = "blocker", (.gogoproto.moretags) = "yaml:&#92;"blocker&#92;""];</code>
     * @return The blocker.
     */
    public java.lang.String getBlocker() {
      java.lang.Object ref = blocker_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        blocker_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Address of the user blocking the other user
     * </pre>
     *
     * <code>string blocker = 1 [json_name = "blocker", (.gogoproto.moretags) = "yaml:&#92;"blocker&#92;""];</code>
     * @return The bytes for blocker.
     */
    public com.google.protobuf.ByteString
        getBlockerBytes() {
      java.lang.Object ref = blocker_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        blocker_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Address of the user blocking the other user
     * </pre>
     *
     * <code>string blocker = 1 [json_name = "blocker", (.gogoproto.moretags) = "yaml:&#92;"blocker&#92;""];</code>
     * @param value The blocker to set.
     * @return This builder for chaining.
     */
    public Builder setBlocker(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      blocker_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the user blocking the other user
     * </pre>
     *
     * <code>string blocker = 1 [json_name = "blocker", (.gogoproto.moretags) = "yaml:&#92;"blocker&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearBlocker() {
      blocker_ = getDefaultInstance().getBlocker();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the user blocking the other user
     * </pre>
     *
     * <code>string blocker = 1 [json_name = "blocker", (.gogoproto.moretags) = "yaml:&#92;"blocker&#92;""];</code>
     * @param value The bytes for blocker to set.
     * @return This builder for chaining.
     */
    public Builder setBlockerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      blocker_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object blocked_ = "";
    /**
     * <pre>
     * Address of the user that should be blocked
     * </pre>
     *
     * <code>string blocked = 2 [json_name = "blocked", (.gogoproto.moretags) = "yaml:&#92;"blocked&#92;""];</code>
     * @return The blocked.
     */
    public java.lang.String getBlocked() {
      java.lang.Object ref = blocked_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        blocked_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Address of the user that should be blocked
     * </pre>
     *
     * <code>string blocked = 2 [json_name = "blocked", (.gogoproto.moretags) = "yaml:&#92;"blocked&#92;""];</code>
     * @return The bytes for blocked.
     */
    public com.google.protobuf.ByteString
        getBlockedBytes() {
      java.lang.Object ref = blocked_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        blocked_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Address of the user that should be blocked
     * </pre>
     *
     * <code>string blocked = 2 [json_name = "blocked", (.gogoproto.moretags) = "yaml:&#92;"blocked&#92;""];</code>
     * @param value The blocked to set.
     * @return This builder for chaining.
     */
    public Builder setBlocked(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      blocked_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the user that should be blocked
     * </pre>
     *
     * <code>string blocked = 2 [json_name = "blocked", (.gogoproto.moretags) = "yaml:&#92;"blocked&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearBlocked() {
      blocked_ = getDefaultInstance().getBlocked();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the user that should be blocked
     * </pre>
     *
     * <code>string blocked = 2 [json_name = "blocked", (.gogoproto.moretags) = "yaml:&#92;"blocked&#92;""];</code>
     * @param value The bytes for blocked to set.
     * @return This builder for chaining.
     */
    public Builder setBlockedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      blocked_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object reason_ = "";
    /**
     * <pre>
     * (optional) Reason why the user has been blocked
     * </pre>
     *
     * <code>string reason = 3 [json_name = "reason", (.gogoproto.moretags) = "yaml:&#92;"reason&#92;""];</code>
     * @return The reason.
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reason_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (optional) Reason why the user has been blocked
     * </pre>
     *
     * <code>string reason = 3 [json_name = "reason", (.gogoproto.moretags) = "yaml:&#92;"reason&#92;""];</code>
     * @return The bytes for reason.
     */
    public com.google.protobuf.ByteString
        getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (optional) Reason why the user has been blocked
     * </pre>
     *
     * <code>string reason = 3 [json_name = "reason", (.gogoproto.moretags) = "yaml:&#92;"reason&#92;""];</code>
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      reason_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (optional) Reason why the user has been blocked
     * </pre>
     *
     * <code>string reason = 3 [json_name = "reason", (.gogoproto.moretags) = "yaml:&#92;"reason&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      reason_ = getDefaultInstance().getReason();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (optional) Reason why the user has been blocked
     * </pre>
     *
     * <code>string reason = 3 [json_name = "reason", (.gogoproto.moretags) = "yaml:&#92;"reason&#92;""];</code>
     * @param value The bytes for reason to set.
     * @return This builder for chaining.
     */
    public Builder setReasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      reason_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long subspaceId_ ;
    /**
     * <pre>
     * Id of the subspace inside which the user should be blocked
     * </pre>
     *
     * <code>uint64 subspace_id = 4 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @return The subspaceId.
     */
    @java.lang.Override
    public long getSubspaceId() {
      return subspaceId_;
    }
    /**
     * <pre>
     * Id of the subspace inside which the user should be blocked
     * </pre>
     *
     * <code>uint64 subspace_id = 4 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @param value The subspaceId to set.
     * @return This builder for chaining.
     */
    public Builder setSubspaceId(long value) {

      subspaceId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the subspace inside which the user should be blocked
     * </pre>
     *
     * <code>uint64 subspace_id = 4 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubspaceId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      subspaceId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:desmos.relationships.v1.MsgBlockUser)
  }

  // @@protoc_insertion_point(class_scope:desmos.relationships.v1.MsgBlockUser)
  private static final com.desmos.relationships.v1.MsgBlockUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.relationships.v1.MsgBlockUser();
  }

  public static com.desmos.relationships.v1.MsgBlockUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgBlockUser>
      PARSER = new com.google.protobuf.AbstractParser<MsgBlockUser>() {
    @java.lang.Override
    public MsgBlockUser parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgBlockUser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgBlockUser> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.relationships.v1.MsgBlockUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

