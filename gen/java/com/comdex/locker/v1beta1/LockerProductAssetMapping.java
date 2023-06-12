// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/locker/v1beta1/locker.proto

package com.comdex.locker.v1beta1;

/**
 * <pre>
 *Key is app_mapping_id
 * </pre>
 *
 * Protobuf type {@code comdex.locker.v1beta1.LockerProductAssetMapping}
 */
public final class LockerProductAssetMapping extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.locker.v1beta1.LockerProductAssetMapping)
    LockerProductAssetMappingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LockerProductAssetMapping.newBuilder() to construct.
  private LockerProductAssetMapping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LockerProductAssetMapping() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LockerProductAssetMapping();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.locker.v1beta1.LockerProto.internal_static_comdex_locker_v1beta1_LockerProductAssetMapping_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.locker.v1beta1.LockerProto.internal_static_comdex_locker_v1beta1_LockerProductAssetMapping_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.locker.v1beta1.LockerProductAssetMapping.class, com.comdex.locker.v1beta1.LockerProductAssetMapping.Builder.class);
  }

  public static final int APP_ID_FIELD_NUMBER = 1;
  private long appId_ = 0L;
  /**
   * <code>uint64 app_id = 1 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
   * @return The appId.
   */
  @java.lang.Override
  public long getAppId() {
    return appId_;
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
    if (appId_ != 0L) {
      output.writeUInt64(1, appId_);
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
    if (appId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, appId_);
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
    if (!(obj instanceof com.comdex.locker.v1beta1.LockerProductAssetMapping)) {
      return super.equals(obj);
    }
    com.comdex.locker.v1beta1.LockerProductAssetMapping other = (com.comdex.locker.v1beta1.LockerProductAssetMapping) obj;

    if (getAppId()
        != other.getAppId()) return false;
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
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppId());
    hash = (37 * hash) + ASSET_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAssetId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.locker.v1beta1.LockerProductAssetMapping parseFrom(
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
  public static Builder newBuilder(com.comdex.locker.v1beta1.LockerProductAssetMapping prototype) {
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
   *Key is app_mapping_id
   * </pre>
   *
   * Protobuf type {@code comdex.locker.v1beta1.LockerProductAssetMapping}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.locker.v1beta1.LockerProductAssetMapping)
      com.comdex.locker.v1beta1.LockerProductAssetMappingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.locker.v1beta1.LockerProto.internal_static_comdex_locker_v1beta1_LockerProductAssetMapping_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.locker.v1beta1.LockerProto.internal_static_comdex_locker_v1beta1_LockerProductAssetMapping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.locker.v1beta1.LockerProductAssetMapping.class, com.comdex.locker.v1beta1.LockerProductAssetMapping.Builder.class);
    }

    // Construct using com.comdex.locker.v1beta1.LockerProductAssetMapping.newBuilder()
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
      appId_ = 0L;
      assetId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.locker.v1beta1.LockerProto.internal_static_comdex_locker_v1beta1_LockerProductAssetMapping_descriptor;
    }

    @java.lang.Override
    public com.comdex.locker.v1beta1.LockerProductAssetMapping getDefaultInstanceForType() {
      return com.comdex.locker.v1beta1.LockerProductAssetMapping.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.locker.v1beta1.LockerProductAssetMapping build() {
      com.comdex.locker.v1beta1.LockerProductAssetMapping result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.locker.v1beta1.LockerProductAssetMapping buildPartial() {
      com.comdex.locker.v1beta1.LockerProductAssetMapping result = new com.comdex.locker.v1beta1.LockerProductAssetMapping(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.locker.v1beta1.LockerProductAssetMapping result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.appId_ = appId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assetId_ = assetId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.locker.v1beta1.LockerProductAssetMapping) {
        return mergeFrom((com.comdex.locker.v1beta1.LockerProductAssetMapping)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.locker.v1beta1.LockerProductAssetMapping other) {
      if (other == com.comdex.locker.v1beta1.LockerProductAssetMapping.getDefaultInstance()) return this;
      if (other.getAppId() != 0L) {
        setAppId(other.getAppId());
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
              appId_ = input.readUInt64();
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

    private long appId_ ;
    /**
     * <code>uint64 app_id = 1 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
     * @return The appId.
     */
    @java.lang.Override
    public long getAppId() {
      return appId_;
    }
    /**
     * <code>uint64 app_id = 1 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(long value) {

      appId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 app_id = 1 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      appId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:comdex.locker.v1beta1.LockerProductAssetMapping)
  }

  // @@protoc_insertion_point(class_scope:comdex.locker.v1beta1.LockerProductAssetMapping)
  private static final com.comdex.locker.v1beta1.LockerProductAssetMapping DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.locker.v1beta1.LockerProductAssetMapping();
  }

  public static com.comdex.locker.v1beta1.LockerProductAssetMapping getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LockerProductAssetMapping>
      PARSER = new com.google.protobuf.AbstractParser<LockerProductAssetMapping>() {
    @java.lang.Override
    public LockerProductAssetMapping parsePartialFrom(
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

  public static com.google.protobuf.Parser<LockerProductAssetMapping> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LockerProductAssetMapping> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.locker.v1beta1.LockerProductAssetMapping getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

