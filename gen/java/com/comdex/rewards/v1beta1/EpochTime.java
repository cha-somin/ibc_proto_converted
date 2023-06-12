// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/rewards/v1beta1/rewards.proto

package com.comdex.rewards.v1beta1;

/**
 * Protobuf type {@code comdex.rewards.v1beta1.EpochTime}
 */
public final class EpochTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.rewards.v1beta1.EpochTime)
    EpochTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EpochTime.newBuilder() to construct.
  private EpochTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EpochTime() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EpochTime();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_EpochTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_EpochTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.rewards.v1beta1.EpochTime.class, com.comdex.rewards.v1beta1.EpochTime.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>uint64 id = 1 [json_name = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int APP_MAPPING_ID_FIELD_NUMBER = 2;
  private long appMappingId_ = 0L;
  /**
   * <code>uint64 app_mapping_id = 2 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
   * @return The appMappingId.
   */
  @java.lang.Override
  public long getAppMappingId() {
    return appMappingId_;
  }

  public static final int STARTING_TIME_FIELD_NUMBER = 3;
  private long startingTime_ = 0L;
  /**
   * <code>int64 starting_time = 3 [json_name = "startingTime", (.gogoproto.moretags) = "yaml:&#92;"time&#92;""];</code>
   * @return The startingTime.
   */
  @java.lang.Override
  public long getStartingTime() {
    return startingTime_;
  }

  public static final int COUNT_FIELD_NUMBER = 4;
  private long count_ = 0L;
  /**
   * <code>uint64 count = 4 [json_name = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
   * @return The count.
   */
  @java.lang.Override
  public long getCount() {
    return count_;
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
    if (id_ != 0L) {
      output.writeUInt64(1, id_);
    }
    if (appMappingId_ != 0L) {
      output.writeUInt64(2, appMappingId_);
    }
    if (startingTime_ != 0L) {
      output.writeInt64(3, startingTime_);
    }
    if (count_ != 0L) {
      output.writeUInt64(4, count_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, id_);
    }
    if (appMappingId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, appMappingId_);
    }
    if (startingTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, startingTime_);
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, count_);
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
    if (!(obj instanceof com.comdex.rewards.v1beta1.EpochTime)) {
      return super.equals(obj);
    }
    com.comdex.rewards.v1beta1.EpochTime other = (com.comdex.rewards.v1beta1.EpochTime) obj;

    if (getId()
        != other.getId()) return false;
    if (getAppMappingId()
        != other.getAppMappingId()) return false;
    if (getStartingTime()
        != other.getStartingTime()) return false;
    if (getCount()
        != other.getCount()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + APP_MAPPING_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppMappingId());
    hash = (37 * hash) + STARTING_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartingTime());
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.rewards.v1beta1.EpochTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.rewards.v1beta1.EpochTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.EpochTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.rewards.v1beta1.EpochTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.EpochTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.rewards.v1beta1.EpochTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.EpochTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.rewards.v1beta1.EpochTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.rewards.v1beta1.EpochTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.rewards.v1beta1.EpochTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.EpochTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.rewards.v1beta1.EpochTime parseFrom(
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
  public static Builder newBuilder(com.comdex.rewards.v1beta1.EpochTime prototype) {
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
   * Protobuf type {@code comdex.rewards.v1beta1.EpochTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.rewards.v1beta1.EpochTime)
      com.comdex.rewards.v1beta1.EpochTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_EpochTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_EpochTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.rewards.v1beta1.EpochTime.class, com.comdex.rewards.v1beta1.EpochTime.Builder.class);
    }

    // Construct using com.comdex.rewards.v1beta1.EpochTime.newBuilder()
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
      id_ = 0L;
      appMappingId_ = 0L;
      startingTime_ = 0L;
      count_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_EpochTime_descriptor;
    }

    @java.lang.Override
    public com.comdex.rewards.v1beta1.EpochTime getDefaultInstanceForType() {
      return com.comdex.rewards.v1beta1.EpochTime.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.rewards.v1beta1.EpochTime build() {
      com.comdex.rewards.v1beta1.EpochTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.rewards.v1beta1.EpochTime buildPartial() {
      com.comdex.rewards.v1beta1.EpochTime result = new com.comdex.rewards.v1beta1.EpochTime(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.rewards.v1beta1.EpochTime result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.appMappingId_ = appMappingId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.startingTime_ = startingTime_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.count_ = count_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.rewards.v1beta1.EpochTime) {
        return mergeFrom((com.comdex.rewards.v1beta1.EpochTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.rewards.v1beta1.EpochTime other) {
      if (other == com.comdex.rewards.v1beta1.EpochTime.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getAppMappingId() != 0L) {
        setAppMappingId(other.getAppMappingId());
      }
      if (other.getStartingTime() != 0L) {
        setStartingTime(other.getStartingTime());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
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
              id_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              appMappingId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              startingTime_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              count_ = input.readUInt64();
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

    private long id_ ;
    /**
     * <code>uint64 id = 1 [json_name = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1 [json_name = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1 [json_name = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private long appMappingId_ ;
    /**
     * <code>uint64 app_mapping_id = 2 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
     * @return The appMappingId.
     */
    @java.lang.Override
    public long getAppMappingId() {
      return appMappingId_;
    }
    /**
     * <code>uint64 app_mapping_id = 2 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
     * @param value The appMappingId to set.
     * @return This builder for chaining.
     */
    public Builder setAppMappingId(long value) {

      appMappingId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 app_mapping_id = 2 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppMappingId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      appMappingId_ = 0L;
      onChanged();
      return this;
    }

    private long startingTime_ ;
    /**
     * <code>int64 starting_time = 3 [json_name = "startingTime", (.gogoproto.moretags) = "yaml:&#92;"time&#92;""];</code>
     * @return The startingTime.
     */
    @java.lang.Override
    public long getStartingTime() {
      return startingTime_;
    }
    /**
     * <code>int64 starting_time = 3 [json_name = "startingTime", (.gogoproto.moretags) = "yaml:&#92;"time&#92;""];</code>
     * @param value The startingTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartingTime(long value) {

      startingTime_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 starting_time = 3 [json_name = "startingTime", (.gogoproto.moretags) = "yaml:&#92;"time&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartingTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      startingTime_ = 0L;
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <code>uint64 count = 4 [json_name = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
     * @return The count.
     */
    @java.lang.Override
    public long getCount() {
      return count_;
    }
    /**
     * <code>uint64 count = 4 [json_name = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {

      count_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 count = 4 [json_name = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      count_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:comdex.rewards.v1beta1.EpochTime)
  }

  // @@protoc_insertion_point(class_scope:comdex.rewards.v1beta1.EpochTime)
  private static final com.comdex.rewards.v1beta1.EpochTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.rewards.v1beta1.EpochTime();
  }

  public static com.comdex.rewards.v1beta1.EpochTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EpochTime>
      PARSER = new com.google.protobuf.AbstractParser<EpochTime>() {
    @java.lang.Override
    public EpochTime parsePartialFrom(
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

  public static com.google.protobuf.Parser<EpochTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EpochTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.rewards.v1beta1.EpochTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

