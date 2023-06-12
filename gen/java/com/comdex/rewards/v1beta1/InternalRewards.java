// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/rewards/v1beta1/rewards.proto

package com.comdex.rewards.v1beta1;

/**
 * Protobuf type {@code comdex.rewards.v1beta1.InternalRewards}
 */
public final class InternalRewards extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.rewards.v1beta1.InternalRewards)
    InternalRewardsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InternalRewards.newBuilder() to construct.
  private InternalRewards(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InternalRewards() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InternalRewards();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_InternalRewards_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_InternalRewards_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.rewards.v1beta1.InternalRewards.class, com.comdex.rewards.v1beta1.InternalRewards.Builder.class);
  }

  public static final int APP_MAPPING_ID_FIELD_NUMBER = 1;
  private long appMappingId_ = 0L;
  /**
   * <code>uint64 app_mapping_id = 1 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
   * @return The appMappingId.
   */
  @java.lang.Override
  public long getAppMappingId() {
    return appMappingId_;
  }

  public static final int ASSET_ID_FIELD_NUMBER = 2;
  private long assetId_ = 0L;
  /**
   * <code>uint64 asset_id = 2 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return The assetId.
   */
  @java.lang.Override
  public long getAssetId() {
    return assetId_;
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
    if (appMappingId_ != 0L) {
      output.writeUInt64(1, appMappingId_);
    }
    if (assetId_ != 0L) {
      output.writeUInt64(2, assetId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (appMappingId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, appMappingId_);
    }
    if (assetId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, assetId_);
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
    if (!(obj instanceof com.comdex.rewards.v1beta1.InternalRewards)) {
      return super.equals(obj);
    }
    com.comdex.rewards.v1beta1.InternalRewards other = (com.comdex.rewards.v1beta1.InternalRewards) obj;

    if (getAppMappingId()
        != other.getAppMappingId()) return false;
    if (getAssetId()
        != other.getAssetId()) return false;
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
    hash = (37 * hash) + APP_MAPPING_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppMappingId());
    hash = (37 * hash) + ASSET_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAssetId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.rewards.v1beta1.InternalRewards parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.rewards.v1beta1.InternalRewards parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.InternalRewards parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.rewards.v1beta1.InternalRewards parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.InternalRewards parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.rewards.v1beta1.InternalRewards parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.InternalRewards parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.rewards.v1beta1.InternalRewards parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.rewards.v1beta1.InternalRewards parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.rewards.v1beta1.InternalRewards parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.InternalRewards parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.rewards.v1beta1.InternalRewards parseFrom(
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
  public static Builder newBuilder(com.comdex.rewards.v1beta1.InternalRewards prototype) {
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
   * Protobuf type {@code comdex.rewards.v1beta1.InternalRewards}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.rewards.v1beta1.InternalRewards)
      com.comdex.rewards.v1beta1.InternalRewardsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_InternalRewards_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_InternalRewards_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.rewards.v1beta1.InternalRewards.class, com.comdex.rewards.v1beta1.InternalRewards.Builder.class);
    }

    // Construct using com.comdex.rewards.v1beta1.InternalRewards.newBuilder()
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
      appMappingId_ = 0L;
      assetId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_InternalRewards_descriptor;
    }

    @java.lang.Override
    public com.comdex.rewards.v1beta1.InternalRewards getDefaultInstanceForType() {
      return com.comdex.rewards.v1beta1.InternalRewards.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.rewards.v1beta1.InternalRewards build() {
      com.comdex.rewards.v1beta1.InternalRewards result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.rewards.v1beta1.InternalRewards buildPartial() {
      com.comdex.rewards.v1beta1.InternalRewards result = new com.comdex.rewards.v1beta1.InternalRewards(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.rewards.v1beta1.InternalRewards result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.appMappingId_ = appMappingId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assetId_ = assetId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.rewards.v1beta1.InternalRewards) {
        return mergeFrom((com.comdex.rewards.v1beta1.InternalRewards)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.rewards.v1beta1.InternalRewards other) {
      if (other == com.comdex.rewards.v1beta1.InternalRewards.getDefaultInstance()) return this;
      if (other.getAppMappingId() != 0L) {
        setAppMappingId(other.getAppMappingId());
      }
      if (other.getAssetId() != 0L) {
        setAssetId(other.getAssetId());
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
              appMappingId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              assetId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long appMappingId_ ;
    /**
     * <code>uint64 app_mapping_id = 1 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
     * @return The appMappingId.
     */
    @java.lang.Override
    public long getAppMappingId() {
      return appMappingId_;
    }
    /**
     * <code>uint64 app_mapping_id = 1 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
     * @param value The appMappingId to set.
     * @return This builder for chaining.
     */
    public Builder setAppMappingId(long value) {

      appMappingId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 app_mapping_id = 1 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppMappingId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      appMappingId_ = 0L;
      onChanged();
      return this;
    }

    private long assetId_ ;
    /**
     * <code>uint64 asset_id = 2 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
     * @return The assetId.
     */
    @java.lang.Override
    public long getAssetId() {
      return assetId_;
    }
    /**
     * <code>uint64 asset_id = 2 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
     * @param value The assetId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetId(long value) {

      assetId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 asset_id = 2 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      assetId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:comdex.rewards.v1beta1.InternalRewards)
  }

  // @@protoc_insertion_point(class_scope:comdex.rewards.v1beta1.InternalRewards)
  private static final com.comdex.rewards.v1beta1.InternalRewards DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.rewards.v1beta1.InternalRewards();
  }

  public static com.comdex.rewards.v1beta1.InternalRewards getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InternalRewards>
      PARSER = new com.google.protobuf.AbstractParser<InternalRewards>() {
    @java.lang.Override
    public InternalRewards parsePartialFrom(
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

  public static com.google.protobuf.Parser<InternalRewards> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InternalRewards> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.rewards.v1beta1.InternalRewards getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

