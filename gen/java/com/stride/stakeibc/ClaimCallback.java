// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/stakeibc/callbacks.proto

package com.stride.stakeibc;

/**
 * Protobuf type {@code stride.stakeibc.ClaimCallback}
 */
public final class ClaimCallback extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stride.stakeibc.ClaimCallback)
    ClaimCallbackOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClaimCallback.newBuilder() to construct.
  private ClaimCallback(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClaimCallback() {
    userRedemptionRecordId_ = "";
    chainId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClaimCallback();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stride.stakeibc.CallbacksProto.internal_static_stride_stakeibc_ClaimCallback_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stride.stakeibc.CallbacksProto.internal_static_stride_stakeibc_ClaimCallback_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stride.stakeibc.ClaimCallback.class, com.stride.stakeibc.ClaimCallback.Builder.class);
  }

  public static final int USER_REDEMPTION_RECORD_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userRedemptionRecordId_ = "";
  /**
   * <code>string user_redemption_record_id = 1 [json_name = "userRedemptionRecordId"];</code>
   * @return The userRedemptionRecordId.
   */
  @java.lang.Override
  public java.lang.String getUserRedemptionRecordId() {
    java.lang.Object ref = userRedemptionRecordId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userRedemptionRecordId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_redemption_record_id = 1 [json_name = "userRedemptionRecordId"];</code>
   * @return The bytes for userRedemptionRecordId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserRedemptionRecordIdBytes() {
    java.lang.Object ref = userRedemptionRecordId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userRedemptionRecordId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHAIN_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object chainId_ = "";
  /**
   * <code>string chain_id = 2 [json_name = "chainId"];</code>
   * @return The chainId.
   */
  @java.lang.Override
  public java.lang.String getChainId() {
    java.lang.Object ref = chainId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chainId_ = s;
      return s;
    }
  }
  /**
   * <code>string chain_id = 2 [json_name = "chainId"];</code>
   * @return The bytes for chainId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChainIdBytes() {
    java.lang.Object ref = chainId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chainId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EPOCH_NUMBER_FIELD_NUMBER = 3;
  private long epochNumber_ = 0L;
  /**
   * <code>uint64 epoch_number = 3 [json_name = "epochNumber"];</code>
   * @return The epochNumber.
   */
  @java.lang.Override
  public long getEpochNumber() {
    return epochNumber_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userRedemptionRecordId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userRedemptionRecordId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chainId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, chainId_);
    }
    if (epochNumber_ != 0L) {
      output.writeUInt64(3, epochNumber_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userRedemptionRecordId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userRedemptionRecordId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chainId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, chainId_);
    }
    if (epochNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, epochNumber_);
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
    if (!(obj instanceof com.stride.stakeibc.ClaimCallback)) {
      return super.equals(obj);
    }
    com.stride.stakeibc.ClaimCallback other = (com.stride.stakeibc.ClaimCallback) obj;

    if (!getUserRedemptionRecordId()
        .equals(other.getUserRedemptionRecordId())) return false;
    if (!getChainId()
        .equals(other.getChainId())) return false;
    if (getEpochNumber()
        != other.getEpochNumber()) return false;
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
    hash = (37 * hash) + USER_REDEMPTION_RECORD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserRedemptionRecordId().hashCode();
    hash = (37 * hash) + CHAIN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChainId().hashCode();
    hash = (37 * hash) + EPOCH_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEpochNumber());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stride.stakeibc.ClaimCallback parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.ClaimCallback parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.ClaimCallback parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.ClaimCallback parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.ClaimCallback parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.ClaimCallback parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.ClaimCallback parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.stakeibc.ClaimCallback parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stride.stakeibc.ClaimCallback parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stride.stakeibc.ClaimCallback parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stride.stakeibc.ClaimCallback parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.stakeibc.ClaimCallback parseFrom(
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
  public static Builder newBuilder(com.stride.stakeibc.ClaimCallback prototype) {
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
   * Protobuf type {@code stride.stakeibc.ClaimCallback}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stride.stakeibc.ClaimCallback)
      com.stride.stakeibc.ClaimCallbackOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.stakeibc.CallbacksProto.internal_static_stride_stakeibc_ClaimCallback_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.stakeibc.CallbacksProto.internal_static_stride_stakeibc_ClaimCallback_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.stakeibc.ClaimCallback.class, com.stride.stakeibc.ClaimCallback.Builder.class);
    }

    // Construct using com.stride.stakeibc.ClaimCallback.newBuilder()
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
      userRedemptionRecordId_ = "";
      chainId_ = "";
      epochNumber_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stride.stakeibc.CallbacksProto.internal_static_stride_stakeibc_ClaimCallback_descriptor;
    }

    @java.lang.Override
    public com.stride.stakeibc.ClaimCallback getDefaultInstanceForType() {
      return com.stride.stakeibc.ClaimCallback.getDefaultInstance();
    }

    @java.lang.Override
    public com.stride.stakeibc.ClaimCallback build() {
      com.stride.stakeibc.ClaimCallback result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stride.stakeibc.ClaimCallback buildPartial() {
      com.stride.stakeibc.ClaimCallback result = new com.stride.stakeibc.ClaimCallback(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stride.stakeibc.ClaimCallback result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userRedemptionRecordId_ = userRedemptionRecordId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.chainId_ = chainId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.epochNumber_ = epochNumber_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stride.stakeibc.ClaimCallback) {
        return mergeFrom((com.stride.stakeibc.ClaimCallback)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stride.stakeibc.ClaimCallback other) {
      if (other == com.stride.stakeibc.ClaimCallback.getDefaultInstance()) return this;
      if (!other.getUserRedemptionRecordId().isEmpty()) {
        userRedemptionRecordId_ = other.userRedemptionRecordId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getChainId().isEmpty()) {
        chainId_ = other.chainId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getEpochNumber() != 0L) {
        setEpochNumber(other.getEpochNumber());
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
              userRedemptionRecordId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              chainId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              epochNumber_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object userRedemptionRecordId_ = "";
    /**
     * <code>string user_redemption_record_id = 1 [json_name = "userRedemptionRecordId"];</code>
     * @return The userRedemptionRecordId.
     */
    public java.lang.String getUserRedemptionRecordId() {
      java.lang.Object ref = userRedemptionRecordId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userRedemptionRecordId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_redemption_record_id = 1 [json_name = "userRedemptionRecordId"];</code>
     * @return The bytes for userRedemptionRecordId.
     */
    public com.google.protobuf.ByteString
        getUserRedemptionRecordIdBytes() {
      java.lang.Object ref = userRedemptionRecordId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userRedemptionRecordId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_redemption_record_id = 1 [json_name = "userRedemptionRecordId"];</code>
     * @param value The userRedemptionRecordId to set.
     * @return This builder for chaining.
     */
    public Builder setUserRedemptionRecordId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userRedemptionRecordId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string user_redemption_record_id = 1 [json_name = "userRedemptionRecordId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserRedemptionRecordId() {
      userRedemptionRecordId_ = getDefaultInstance().getUserRedemptionRecordId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string user_redemption_record_id = 1 [json_name = "userRedemptionRecordId"];</code>
     * @param value The bytes for userRedemptionRecordId to set.
     * @return This builder for chaining.
     */
    public Builder setUserRedemptionRecordIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userRedemptionRecordId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object chainId_ = "";
    /**
     * <code>string chain_id = 2 [json_name = "chainId"];</code>
     * @return The chainId.
     */
    public java.lang.String getChainId() {
      java.lang.Object ref = chainId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chainId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string chain_id = 2 [json_name = "chainId"];</code>
     * @return The bytes for chainId.
     */
    public com.google.protobuf.ByteString
        getChainIdBytes() {
      java.lang.Object ref = chainId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chainId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string chain_id = 2 [json_name = "chainId"];</code>
     * @param value The chainId to set.
     * @return This builder for chaining.
     */
    public Builder setChainId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      chainId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string chain_id = 2 [json_name = "chainId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChainId() {
      chainId_ = getDefaultInstance().getChainId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string chain_id = 2 [json_name = "chainId"];</code>
     * @param value The bytes for chainId to set.
     * @return This builder for chaining.
     */
    public Builder setChainIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      chainId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long epochNumber_ ;
    /**
     * <code>uint64 epoch_number = 3 [json_name = "epochNumber"];</code>
     * @return The epochNumber.
     */
    @java.lang.Override
    public long getEpochNumber() {
      return epochNumber_;
    }
    /**
     * <code>uint64 epoch_number = 3 [json_name = "epochNumber"];</code>
     * @param value The epochNumber to set.
     * @return This builder for chaining.
     */
    public Builder setEpochNumber(long value) {

      epochNumber_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 epoch_number = 3 [json_name = "epochNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEpochNumber() {
      bitField0_ = (bitField0_ & ~0x00000004);
      epochNumber_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:stride.stakeibc.ClaimCallback)
  }

  // @@protoc_insertion_point(class_scope:stride.stakeibc.ClaimCallback)
  private static final com.stride.stakeibc.ClaimCallback DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stride.stakeibc.ClaimCallback();
  }

  public static com.stride.stakeibc.ClaimCallback getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClaimCallback>
      PARSER = new com.google.protobuf.AbstractParser<ClaimCallback>() {
    @java.lang.Override
    public ClaimCallback parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClaimCallback> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClaimCallback> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stride.stakeibc.ClaimCallback getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

