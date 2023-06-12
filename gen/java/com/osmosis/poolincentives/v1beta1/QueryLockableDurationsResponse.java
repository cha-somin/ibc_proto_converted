// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/pool-incentives/v1beta1/query.proto

package com.osmosis.poolincentives.v1beta1;

/**
 * Protobuf type {@code osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse}
 */
public final class QueryLockableDurationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse)
    QueryLockableDurationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryLockableDurationsResponse.newBuilder() to construct.
  private QueryLockableDurationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryLockableDurationsResponse() {
    lockableDurations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryLockableDurationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.poolincentives.v1beta1.QueryProto.internal_static_osmosis_poolincentives_v1beta1_QueryLockableDurationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.poolincentives.v1beta1.QueryProto.internal_static_osmosis_poolincentives_v1beta1_QueryLockableDurationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse.class, com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse.Builder.class);
  }

  public static final int LOCKABLE_DURATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.Duration> lockableDurations_;
  /**
   * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Duration> getLockableDurationsList() {
    return lockableDurations_;
  }
  /**
   * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getLockableDurationsOrBuilderList() {
    return lockableDurations_;
  }
  /**
   * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  @java.lang.Override
  public int getLockableDurationsCount() {
    return lockableDurations_.size();
  }
  /**
   * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Duration getLockableDurations(int index) {
    return lockableDurations_.get(index);
  }
  /**
   * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getLockableDurationsOrBuilder(
      int index) {
    return lockableDurations_.get(index);
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
    for (int i = 0; i < lockableDurations_.size(); i++) {
      output.writeMessage(1, lockableDurations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < lockableDurations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lockableDurations_.get(i));
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
    if (!(obj instanceof com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse)) {
      return super.equals(obj);
    }
    com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse other = (com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse) obj;

    if (!getLockableDurationsList()
        .equals(other.getLockableDurationsList())) return false;
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
    if (getLockableDurationsCount() > 0) {
      hash = (37 * hash) + LOCKABLE_DURATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getLockableDurationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse parseFrom(
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
  public static Builder newBuilder(com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse prototype) {
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
   * Protobuf type {@code osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse)
      com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.poolincentives.v1beta1.QueryProto.internal_static_osmosis_poolincentives_v1beta1_QueryLockableDurationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.poolincentives.v1beta1.QueryProto.internal_static_osmosis_poolincentives_v1beta1_QueryLockableDurationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse.class, com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse.Builder.class);
    }

    // Construct using com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse.newBuilder()
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
      if (lockableDurationsBuilder_ == null) {
        lockableDurations_ = java.util.Collections.emptyList();
      } else {
        lockableDurations_ = null;
        lockableDurationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.poolincentives.v1beta1.QueryProto.internal_static_osmosis_poolincentives_v1beta1_QueryLockableDurationsResponse_descriptor;
    }

    @java.lang.Override
    public com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse getDefaultInstanceForType() {
      return com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse build() {
      com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse buildPartial() {
      com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse result = new com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse result) {
      if (lockableDurationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lockableDurations_ = java.util.Collections.unmodifiableList(lockableDurations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lockableDurations_ = lockableDurations_;
      } else {
        result.lockableDurations_ = lockableDurationsBuilder_.build();
      }
    }

    private void buildPartial0(com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse) {
        return mergeFrom((com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse other) {
      if (other == com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse.getDefaultInstance()) return this;
      if (lockableDurationsBuilder_ == null) {
        if (!other.lockableDurations_.isEmpty()) {
          if (lockableDurations_.isEmpty()) {
            lockableDurations_ = other.lockableDurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLockableDurationsIsMutable();
            lockableDurations_.addAll(other.lockableDurations_);
          }
          onChanged();
        }
      } else {
        if (!other.lockableDurations_.isEmpty()) {
          if (lockableDurationsBuilder_.isEmpty()) {
            lockableDurationsBuilder_.dispose();
            lockableDurationsBuilder_ = null;
            lockableDurations_ = other.lockableDurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lockableDurationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLockableDurationsFieldBuilder() : null;
          } else {
            lockableDurationsBuilder_.addAllMessages(other.lockableDurations_);
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
              com.google.protobuf.Duration m =
                  input.readMessage(
                      com.google.protobuf.Duration.parser(),
                      extensionRegistry);
              if (lockableDurationsBuilder_ == null) {
                ensureLockableDurationsIsMutable();
                lockableDurations_.add(m);
              } else {
                lockableDurationsBuilder_.addMessage(m);
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

    private java.util.List<com.google.protobuf.Duration> lockableDurations_ =
      java.util.Collections.emptyList();
    private void ensureLockableDurationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lockableDurations_ = new java.util.ArrayList<com.google.protobuf.Duration>(lockableDurations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> lockableDurationsBuilder_;

    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public java.util.List<com.google.protobuf.Duration> getLockableDurationsList() {
      if (lockableDurationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lockableDurations_);
      } else {
        return lockableDurationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public int getLockableDurationsCount() {
      if (lockableDurationsBuilder_ == null) {
        return lockableDurations_.size();
      } else {
        return lockableDurationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration getLockableDurations(int index) {
      if (lockableDurationsBuilder_ == null) {
        return lockableDurations_.get(index);
      } else {
        return lockableDurationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder setLockableDurations(
        int index, com.google.protobuf.Duration value) {
      if (lockableDurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLockableDurationsIsMutable();
        lockableDurations_.set(index, value);
        onChanged();
      } else {
        lockableDurationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder setLockableDurations(
        int index, com.google.protobuf.Duration.Builder builderForValue) {
      if (lockableDurationsBuilder_ == null) {
        ensureLockableDurationsIsMutable();
        lockableDurations_.set(index, builderForValue.build());
        onChanged();
      } else {
        lockableDurationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder addLockableDurations(com.google.protobuf.Duration value) {
      if (lockableDurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLockableDurationsIsMutable();
        lockableDurations_.add(value);
        onChanged();
      } else {
        lockableDurationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder addLockableDurations(
        int index, com.google.protobuf.Duration value) {
      if (lockableDurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLockableDurationsIsMutable();
        lockableDurations_.add(index, value);
        onChanged();
      } else {
        lockableDurationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder addLockableDurations(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (lockableDurationsBuilder_ == null) {
        ensureLockableDurationsIsMutable();
        lockableDurations_.add(builderForValue.build());
        onChanged();
      } else {
        lockableDurationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder addLockableDurations(
        int index, com.google.protobuf.Duration.Builder builderForValue) {
      if (lockableDurationsBuilder_ == null) {
        ensureLockableDurationsIsMutable();
        lockableDurations_.add(index, builderForValue.build());
        onChanged();
      } else {
        lockableDurationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder addAllLockableDurations(
        java.lang.Iterable<? extends com.google.protobuf.Duration> values) {
      if (lockableDurationsBuilder_ == null) {
        ensureLockableDurationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lockableDurations_);
        onChanged();
      } else {
        lockableDurationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder clearLockableDurations() {
      if (lockableDurationsBuilder_ == null) {
        lockableDurations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lockableDurationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public Builder removeLockableDurations(int index) {
      if (lockableDurationsBuilder_ == null) {
        ensureLockableDurationsIsMutable();
        lockableDurations_.remove(index);
        onChanged();
      } else {
        lockableDurationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration.Builder getLockableDurationsBuilder(
        int index) {
      return getLockableDurationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.DurationOrBuilder getLockableDurationsOrBuilder(
        int index) {
      if (lockableDurationsBuilder_ == null) {
        return lockableDurations_.get(index);  } else {
        return lockableDurationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
         getLockableDurationsOrBuilderList() {
      if (lockableDurationsBuilder_ != null) {
        return lockableDurationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lockableDurations_);
      }
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration.Builder addLockableDurationsBuilder() {
      return getLockableDurationsFieldBuilder().addBuilder(
          com.google.protobuf.Duration.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration.Builder addLockableDurationsBuilder(
        int index) {
      return getLockableDurationsFieldBuilder().addBuilder(
          index, com.google.protobuf.Duration.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Duration lockable_durations = 1 [json_name = "lockableDurations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"lockable_durations&#92;"", (.gogoproto.stdduration) = true];</code>
     */
    public java.util.List<com.google.protobuf.Duration.Builder> 
         getLockableDurationsBuilderList() {
      return getLockableDurationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getLockableDurationsFieldBuilder() {
      if (lockableDurationsBuilder_ == null) {
        lockableDurationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                lockableDurations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lockableDurations_ = null;
      }
      return lockableDurationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse)
  }

  // @@protoc_insertion_point(class_scope:osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse)
  private static final com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse();
  }

  public static com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryLockableDurationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryLockableDurationsResponse>() {
    @java.lang.Override
    public QueryLockableDurationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryLockableDurationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryLockableDurationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

