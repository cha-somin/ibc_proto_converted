// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/locker/v1beta1/tx.proto

package com.comdex.locker.v1beta1;

/**
 * Protobuf type {@code comdex.locker.v1beta1.MsgCloseLockerRequest}
 */
public final class MsgCloseLockerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.locker.v1beta1.MsgCloseLockerRequest)
    MsgCloseLockerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCloseLockerRequest.newBuilder() to construct.
  private MsgCloseLockerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCloseLockerRequest() {
    depositor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCloseLockerRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.locker.v1beta1.TxProto.internal_static_comdex_locker_v1beta1_MsgCloseLockerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.locker.v1beta1.TxProto.internal_static_comdex_locker_v1beta1_MsgCloseLockerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.locker.v1beta1.MsgCloseLockerRequest.class, com.comdex.locker.v1beta1.MsgCloseLockerRequest.Builder.class);
  }

  public static final int DEPOSITOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object depositor_ = "";
  /**
   * <code>string depositor = 1 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
   * @return The depositor.
   */
  @java.lang.Override
  public java.lang.String getDepositor() {
    java.lang.Object ref = depositor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      depositor_ = s;
      return s;
    }
  }
  /**
   * <code>string depositor = 1 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
   * @return The bytes for depositor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepositorBytes() {
    java.lang.Object ref = depositor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      depositor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_ID_FIELD_NUMBER = 2;
  private long appId_ = 0L;
  /**
   * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
   * @return The appId.
   */
  @java.lang.Override
  public long getAppId() {
    return appId_;
  }

  public static final int ASSET_ID_FIELD_NUMBER = 3;
  private long assetId_ = 0L;
  /**
   * <code>uint64 asset_id = 3 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return The assetId.
   */
  @java.lang.Override
  public long getAssetId() {
    return assetId_;
  }

  public static final int LOCKER_ID_FIELD_NUMBER = 4;
  private long lockerId_ = 0L;
  /**
   * <code>uint64 locker_id = 4 [json_name = "lockerId", (.gogoproto.moretags) = "yaml:&#92;"locker_id&#92;""];</code>
   * @return The lockerId.
   */
  @java.lang.Override
  public long getLockerId() {
    return lockerId_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, depositor_);
    }
    if (appId_ != 0L) {
      output.writeUInt64(2, appId_);
    }
    if (assetId_ != 0L) {
      output.writeUInt64(3, assetId_);
    }
    if (lockerId_ != 0L) {
      output.writeUInt64(4, lockerId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, depositor_);
    }
    if (appId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, appId_);
    }
    if (assetId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, assetId_);
    }
    if (lockerId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, lockerId_);
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
    if (!(obj instanceof com.comdex.locker.v1beta1.MsgCloseLockerRequest)) {
      return super.equals(obj);
    }
    com.comdex.locker.v1beta1.MsgCloseLockerRequest other = (com.comdex.locker.v1beta1.MsgCloseLockerRequest) obj;

    if (!getDepositor()
        .equals(other.getDepositor())) return false;
    if (getAppId()
        != other.getAppId()) return false;
    if (getAssetId()
        != other.getAssetId()) return false;
    if (getLockerId()
        != other.getLockerId()) return false;
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
    hash = (37 * hash) + DEPOSITOR_FIELD_NUMBER;
    hash = (53 * hash) + getDepositor().hashCode();
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppId());
    hash = (37 * hash) + ASSET_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAssetId());
    hash = (37 * hash) + LOCKER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLockerId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest parseFrom(
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
  public static Builder newBuilder(com.comdex.locker.v1beta1.MsgCloseLockerRequest prototype) {
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
   * Protobuf type {@code comdex.locker.v1beta1.MsgCloseLockerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.locker.v1beta1.MsgCloseLockerRequest)
      com.comdex.locker.v1beta1.MsgCloseLockerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.locker.v1beta1.TxProto.internal_static_comdex_locker_v1beta1_MsgCloseLockerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.locker.v1beta1.TxProto.internal_static_comdex_locker_v1beta1_MsgCloseLockerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.locker.v1beta1.MsgCloseLockerRequest.class, com.comdex.locker.v1beta1.MsgCloseLockerRequest.Builder.class);
    }

    // Construct using com.comdex.locker.v1beta1.MsgCloseLockerRequest.newBuilder()
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
      depositor_ = "";
      appId_ = 0L;
      assetId_ = 0L;
      lockerId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.locker.v1beta1.TxProto.internal_static_comdex_locker_v1beta1_MsgCloseLockerRequest_descriptor;
    }

    @java.lang.Override
    public com.comdex.locker.v1beta1.MsgCloseLockerRequest getDefaultInstanceForType() {
      return com.comdex.locker.v1beta1.MsgCloseLockerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.locker.v1beta1.MsgCloseLockerRequest build() {
      com.comdex.locker.v1beta1.MsgCloseLockerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.locker.v1beta1.MsgCloseLockerRequest buildPartial() {
      com.comdex.locker.v1beta1.MsgCloseLockerRequest result = new com.comdex.locker.v1beta1.MsgCloseLockerRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.locker.v1beta1.MsgCloseLockerRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.depositor_ = depositor_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.appId_ = appId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.assetId_ = assetId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.lockerId_ = lockerId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.locker.v1beta1.MsgCloseLockerRequest) {
        return mergeFrom((com.comdex.locker.v1beta1.MsgCloseLockerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.locker.v1beta1.MsgCloseLockerRequest other) {
      if (other == com.comdex.locker.v1beta1.MsgCloseLockerRequest.getDefaultInstance()) return this;
      if (!other.getDepositor().isEmpty()) {
        depositor_ = other.depositor_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAppId() != 0L) {
        setAppId(other.getAppId());
      }
      if (other.getAssetId() != 0L) {
        setAssetId(other.getAssetId());
      }
      if (other.getLockerId() != 0L) {
        setLockerId(other.getLockerId());
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
              depositor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              appId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              assetId_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              lockerId_ = input.readUInt64();
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

    private java.lang.Object depositor_ = "";
    /**
     * <code>string depositor = 1 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
     * @return The depositor.
     */
    public java.lang.String getDepositor() {
      java.lang.Object ref = depositor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        depositor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string depositor = 1 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
     * @return The bytes for depositor.
     */
    public com.google.protobuf.ByteString
        getDepositorBytes() {
      java.lang.Object ref = depositor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        depositor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string depositor = 1 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
     * @param value The depositor to set.
     * @return This builder for chaining.
     */
    public Builder setDepositor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      depositor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string depositor = 1 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDepositor() {
      depositor_ = getDefaultInstance().getDepositor();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string depositor = 1 [json_name = "depositor", (.gogoproto.moretags) = "yaml:&#92;"depositor&#92;""];</code>
     * @param value The bytes for depositor to set.
     * @return This builder for chaining.
     */
    public Builder setDepositorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      depositor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long appId_ ;
    /**
     * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
     * @return The appId.
     */
    @java.lang.Override
    public long getAppId() {
      return appId_;
    }
    /**
     * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(long value) {

      appId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 app_id = 2 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      appId_ = 0L;
      onChanged();
      return this;
    }

    private long assetId_ ;
    /**
     * <code>uint64 asset_id = 3 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
     * @return The assetId.
     */
    @java.lang.Override
    public long getAssetId() {
      return assetId_;
    }
    /**
     * <code>uint64 asset_id = 3 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
     * @param value The assetId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetId(long value) {

      assetId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 asset_id = 3 [json_name = "assetId", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      assetId_ = 0L;
      onChanged();
      return this;
    }

    private long lockerId_ ;
    /**
     * <code>uint64 locker_id = 4 [json_name = "lockerId", (.gogoproto.moretags) = "yaml:&#92;"locker_id&#92;""];</code>
     * @return The lockerId.
     */
    @java.lang.Override
    public long getLockerId() {
      return lockerId_;
    }
    /**
     * <code>uint64 locker_id = 4 [json_name = "lockerId", (.gogoproto.moretags) = "yaml:&#92;"locker_id&#92;""];</code>
     * @param value The lockerId to set.
     * @return This builder for chaining.
     */
    public Builder setLockerId(long value) {

      lockerId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 locker_id = 4 [json_name = "lockerId", (.gogoproto.moretags) = "yaml:&#92;"locker_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearLockerId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      lockerId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:comdex.locker.v1beta1.MsgCloseLockerRequest)
  }

  // @@protoc_insertion_point(class_scope:comdex.locker.v1beta1.MsgCloseLockerRequest)
  private static final com.comdex.locker.v1beta1.MsgCloseLockerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.locker.v1beta1.MsgCloseLockerRequest();
  }

  public static com.comdex.locker.v1beta1.MsgCloseLockerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCloseLockerRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgCloseLockerRequest>() {
    @java.lang.Override
    public MsgCloseLockerRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCloseLockerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCloseLockerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.locker.v1beta1.MsgCloseLockerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

