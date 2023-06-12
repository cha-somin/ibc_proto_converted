// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/lockup/query.proto

package com.osmosis.lockup;

/**
 * Protobuf type {@code osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse}
 */
public final class AccountLockedLongerDurationNotUnlockingOnlyResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse)
    AccountLockedLongerDurationNotUnlockingOnlyResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountLockedLongerDurationNotUnlockingOnlyResponse.newBuilder() to construct.
  private AccountLockedLongerDurationNotUnlockingOnlyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountLockedLongerDurationNotUnlockingOnlyResponse() {
    locks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccountLockedLongerDurationNotUnlockingOnlyResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.lockup.QueryProto.internal_static_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.lockup.QueryProto.internal_static_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse.class, com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse.Builder.class);
  }

  public static final int LOCKS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.osmosis.lockup.PeriodLock> locks_;
  /**
   * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.osmosis.lockup.PeriodLock> getLocksList() {
    return locks_;
  }
  /**
   * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.osmosis.lockup.PeriodLockOrBuilder> 
      getLocksOrBuilderList() {
    return locks_;
  }
  /**
   * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getLocksCount() {
    return locks_.size();
  }
  /**
   * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.osmosis.lockup.PeriodLock getLocks(int index) {
    return locks_.get(index);
  }
  /**
   * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.osmosis.lockup.PeriodLockOrBuilder getLocksOrBuilder(
      int index) {
    return locks_.get(index);
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
    for (int i = 0; i < locks_.size(); i++) {
      output.writeMessage(1, locks_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < locks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, locks_.get(i));
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
    if (!(obj instanceof com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse)) {
      return super.equals(obj);
    }
    com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse other = (com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse) obj;

    if (!getLocksList()
        .equals(other.getLocksList())) return false;
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
    if (getLocksCount() > 0) {
      hash = (37 * hash) + LOCKS_FIELD_NUMBER;
      hash = (53 * hash) + getLocksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse parseFrom(
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
  public static Builder newBuilder(com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse prototype) {
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
   * Protobuf type {@code osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse)
      com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.lockup.QueryProto.internal_static_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.lockup.QueryProto.internal_static_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse.class, com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse.Builder.class);
    }

    // Construct using com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse.newBuilder()
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
      if (locksBuilder_ == null) {
        locks_ = java.util.Collections.emptyList();
      } else {
        locks_ = null;
        locksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.lockup.QueryProto.internal_static_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse_descriptor;
    }

    @java.lang.Override
    public com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse getDefaultInstanceForType() {
      return com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse build() {
      com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse buildPartial() {
      com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse result = new com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse result) {
      if (locksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          locks_ = java.util.Collections.unmodifiableList(locks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.locks_ = locks_;
      } else {
        result.locks_ = locksBuilder_.build();
      }
    }

    private void buildPartial0(com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse) {
        return mergeFrom((com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse other) {
      if (other == com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse.getDefaultInstance()) return this;
      if (locksBuilder_ == null) {
        if (!other.locks_.isEmpty()) {
          if (locks_.isEmpty()) {
            locks_ = other.locks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLocksIsMutable();
            locks_.addAll(other.locks_);
          }
          onChanged();
        }
      } else {
        if (!other.locks_.isEmpty()) {
          if (locksBuilder_.isEmpty()) {
            locksBuilder_.dispose();
            locksBuilder_ = null;
            locks_ = other.locks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            locksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLocksFieldBuilder() : null;
          } else {
            locksBuilder_.addAllMessages(other.locks_);
          }
        }
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
              com.osmosis.lockup.PeriodLock m =
                  input.readMessage(
                      com.osmosis.lockup.PeriodLock.parser(),
                      extensionRegistry);
              if (locksBuilder_ == null) {
                ensureLocksIsMutable();
                locks_.add(m);
              } else {
                locksBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.osmosis.lockup.PeriodLock> locks_ =
      java.util.Collections.emptyList();
    private void ensureLocksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        locks_ = new java.util.ArrayList<com.osmosis.lockup.PeriodLock>(locks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.osmosis.lockup.PeriodLock, com.osmosis.lockup.PeriodLock.Builder, com.osmosis.lockup.PeriodLockOrBuilder> locksBuilder_;

    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.osmosis.lockup.PeriodLock> getLocksList() {
      if (locksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(locks_);
      } else {
        return locksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public int getLocksCount() {
      if (locksBuilder_ == null) {
        return locks_.size();
      } else {
        return locksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public com.osmosis.lockup.PeriodLock getLocks(int index) {
      if (locksBuilder_ == null) {
        return locks_.get(index);
      } else {
        return locksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public Builder setLocks(
        int index, com.osmosis.lockup.PeriodLock value) {
      if (locksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocksIsMutable();
        locks_.set(index, value);
        onChanged();
      } else {
        locksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public Builder setLocks(
        int index, com.osmosis.lockup.PeriodLock.Builder builderForValue) {
      if (locksBuilder_ == null) {
        ensureLocksIsMutable();
        locks_.set(index, builderForValue.build());
        onChanged();
      } else {
        locksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public Builder addLocks(com.osmosis.lockup.PeriodLock value) {
      if (locksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocksIsMutable();
        locks_.add(value);
        onChanged();
      } else {
        locksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public Builder addLocks(
        int index, com.osmosis.lockup.PeriodLock value) {
      if (locksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocksIsMutable();
        locks_.add(index, value);
        onChanged();
      } else {
        locksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public Builder addLocks(
        com.osmosis.lockup.PeriodLock.Builder builderForValue) {
      if (locksBuilder_ == null) {
        ensureLocksIsMutable();
        locks_.add(builderForValue.build());
        onChanged();
      } else {
        locksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public Builder addLocks(
        int index, com.osmosis.lockup.PeriodLock.Builder builderForValue) {
      if (locksBuilder_ == null) {
        ensureLocksIsMutable();
        locks_.add(index, builderForValue.build());
        onChanged();
      } else {
        locksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllLocks(
        java.lang.Iterable<? extends com.osmosis.lockup.PeriodLock> values) {
      if (locksBuilder_ == null) {
        ensureLocksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, locks_);
        onChanged();
      } else {
        locksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearLocks() {
      if (locksBuilder_ == null) {
        locks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        locksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeLocks(int index) {
      if (locksBuilder_ == null) {
        ensureLocksIsMutable();
        locks_.remove(index);
        onChanged();
      } else {
        locksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public com.osmosis.lockup.PeriodLock.Builder getLocksBuilder(
        int index) {
      return getLocksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public com.osmosis.lockup.PeriodLockOrBuilder getLocksOrBuilder(
        int index) {
      if (locksBuilder_ == null) {
        return locks_.get(index);  } else {
        return locksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.osmosis.lockup.PeriodLockOrBuilder> 
         getLocksOrBuilderList() {
      if (locksBuilder_ != null) {
        return locksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(locks_);
      }
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public com.osmosis.lockup.PeriodLock.Builder addLocksBuilder() {
      return getLocksFieldBuilder().addBuilder(
          com.osmosis.lockup.PeriodLock.getDefaultInstance());
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public com.osmosis.lockup.PeriodLock.Builder addLocksBuilder(
        int index) {
      return getLocksFieldBuilder().addBuilder(
          index, com.osmosis.lockup.PeriodLock.getDefaultInstance());
    }
    /**
     * <code>repeated .osmosis.lockup.PeriodLock locks = 1 [json_name = "locks", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.osmosis.lockup.PeriodLock.Builder> 
         getLocksBuilderList() {
      return getLocksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.osmosis.lockup.PeriodLock, com.osmosis.lockup.PeriodLock.Builder, com.osmosis.lockup.PeriodLockOrBuilder> 
        getLocksFieldBuilder() {
      if (locksBuilder_ == null) {
        locksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.osmosis.lockup.PeriodLock, com.osmosis.lockup.PeriodLock.Builder, com.osmosis.lockup.PeriodLockOrBuilder>(
                locks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        locks_ = null;
      }
      return locksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse)
  }

  // @@protoc_insertion_point(class_scope:osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse)
  private static final com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse();
  }

  public static com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountLockedLongerDurationNotUnlockingOnlyResponse>
      PARSER = new com.google.protobuf.AbstractParser<AccountLockedLongerDurationNotUnlockingOnlyResponse>() {
    @java.lang.Override
    public AccountLockedLongerDurationNotUnlockingOnlyResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccountLockedLongerDurationNotUnlockingOnlyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountLockedLongerDurationNotUnlockingOnlyResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

