// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rmintreward/models.proto

package com.stafihub.stafihub.rmintreward;

/**
 * Protobuf type {@code stafihub.stafihub.rmintreward.TokenRewardInfoPost}
 */
public final class TokenRewardInfoPost extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.rmintreward.TokenRewardInfoPost)
    TokenRewardInfoPostOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TokenRewardInfoPost.newBuilder() to construct.
  private TokenRewardInfoPost(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TokenRewardInfoPost() {
    denom_ = "";
    rewardRate_ = "";
    totalRewardAmount_ = "";
    userLimit_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TokenRewardInfoPost();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.rmintreward.ModelsProto.internal_static_stafihub_stafihub_rmintreward_TokenRewardInfoPost_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.rmintreward.ModelsProto.internal_static_stafihub_stafihub_rmintreward_TokenRewardInfoPost_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.rmintreward.TokenRewardInfoPost.class, com.stafihub.stafihub.rmintreward.TokenRewardInfoPost.Builder.class);
  }

  public static final int DENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REWARDRATE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rewardRate_ = "";
  /**
   * <code>string rewardRate = 2 [json_name = "rewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The rewardRate.
   */
  @java.lang.Override
  public java.lang.String getRewardRate() {
    java.lang.Object ref = rewardRate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardRate_ = s;
      return s;
    }
  }
  /**
   * <code>string rewardRate = 2 [json_name = "rewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for rewardRate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardRateBytes() {
    java.lang.Object ref = rewardRate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardRate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTALREWARDAMOUNT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object totalRewardAmount_ = "";
  /**
   * <code>string totalRewardAmount = 3 [json_name = "totalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The totalRewardAmount.
   */
  @java.lang.Override
  public java.lang.String getTotalRewardAmount() {
    java.lang.Object ref = totalRewardAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      totalRewardAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string totalRewardAmount = 3 [json_name = "totalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for totalRewardAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTotalRewardAmountBytes() {
    java.lang.Object ref = totalRewardAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      totalRewardAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERLIMIT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userLimit_ = "";
  /**
   * <code>string userLimit = 5 [json_name = "userLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The userLimit.
   */
  @java.lang.Override
  public java.lang.String getUserLimit() {
    java.lang.Object ref = userLimit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userLimit_ = s;
      return s;
    }
  }
  /**
   * <code>string userLimit = 5 [json_name = "userLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for userLimit.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserLimitBytes() {
    java.lang.Object ref = userLimit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userLimit_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardRate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, rewardRate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(totalRewardAmount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, totalRewardAmount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userLimit_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, userLimit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardRate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, rewardRate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(totalRewardAmount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, totalRewardAmount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userLimit_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, userLimit_);
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
    if (!(obj instanceof com.stafihub.stafihub.rmintreward.TokenRewardInfoPost)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.rmintreward.TokenRewardInfoPost other = (com.stafihub.stafihub.rmintreward.TokenRewardInfoPost) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getRewardRate()
        .equals(other.getRewardRate())) return false;
    if (!getTotalRewardAmount()
        .equals(other.getTotalRewardAmount())) return false;
    if (!getUserLimit()
        .equals(other.getUserLimit())) return false;
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
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + REWARDRATE_FIELD_NUMBER;
    hash = (53 * hash) + getRewardRate().hashCode();
    hash = (37 * hash) + TOTALREWARDAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTotalRewardAmount().hashCode();
    hash = (37 * hash) + USERLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getUserLimit().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.rmintreward.TokenRewardInfoPost prototype) {
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
   * Protobuf type {@code stafihub.stafihub.rmintreward.TokenRewardInfoPost}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.rmintreward.TokenRewardInfoPost)
      com.stafihub.stafihub.rmintreward.TokenRewardInfoPostOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.rmintreward.ModelsProto.internal_static_stafihub_stafihub_rmintreward_TokenRewardInfoPost_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.rmintreward.ModelsProto.internal_static_stafihub_stafihub_rmintreward_TokenRewardInfoPost_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.rmintreward.TokenRewardInfoPost.class, com.stafihub.stafihub.rmintreward.TokenRewardInfoPost.Builder.class);
    }

    // Construct using com.stafihub.stafihub.rmintreward.TokenRewardInfoPost.newBuilder()
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
      denom_ = "";
      rewardRate_ = "";
      totalRewardAmount_ = "";
      userLimit_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.rmintreward.ModelsProto.internal_static_stafihub_stafihub_rmintreward_TokenRewardInfoPost_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rmintreward.TokenRewardInfoPost getDefaultInstanceForType() {
      return com.stafihub.stafihub.rmintreward.TokenRewardInfoPost.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.rmintreward.TokenRewardInfoPost build() {
      com.stafihub.stafihub.rmintreward.TokenRewardInfoPost result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rmintreward.TokenRewardInfoPost buildPartial() {
      com.stafihub.stafihub.rmintreward.TokenRewardInfoPost result = new com.stafihub.stafihub.rmintreward.TokenRewardInfoPost(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.rmintreward.TokenRewardInfoPost result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rewardRate_ = rewardRate_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.totalRewardAmount_ = totalRewardAmount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.userLimit_ = userLimit_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.rmintreward.TokenRewardInfoPost) {
        return mergeFrom((com.stafihub.stafihub.rmintreward.TokenRewardInfoPost)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.rmintreward.TokenRewardInfoPost other) {
      if (other == com.stafihub.stafihub.rmintreward.TokenRewardInfoPost.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRewardRate().isEmpty()) {
        rewardRate_ = other.rewardRate_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTotalRewardAmount().isEmpty()) {
        totalRewardAmount_ = other.totalRewardAmount_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getUserLimit().isEmpty()) {
        userLimit_ = other.userLimit_;
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
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              rewardRate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              totalRewardAmount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 42: {
              userLimit_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 42
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

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object rewardRate_ = "";
    /**
     * <code>string rewardRate = 2 [json_name = "rewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The rewardRate.
     */
    public java.lang.String getRewardRate() {
      java.lang.Object ref = rewardRate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardRate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rewardRate = 2 [json_name = "rewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for rewardRate.
     */
    public com.google.protobuf.ByteString
        getRewardRateBytes() {
      java.lang.Object ref = rewardRate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardRate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rewardRate = 2 [json_name = "rewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The rewardRate to set.
     * @return This builder for chaining.
     */
    public Builder setRewardRate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rewardRate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string rewardRate = 2 [json_name = "rewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardRate() {
      rewardRate_ = getDefaultInstance().getRewardRate();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string rewardRate = 2 [json_name = "rewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for rewardRate to set.
     * @return This builder for chaining.
     */
    public Builder setRewardRateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rewardRate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object totalRewardAmount_ = "";
    /**
     * <code>string totalRewardAmount = 3 [json_name = "totalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The totalRewardAmount.
     */
    public java.lang.String getTotalRewardAmount() {
      java.lang.Object ref = totalRewardAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        totalRewardAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string totalRewardAmount = 3 [json_name = "totalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for totalRewardAmount.
     */
    public com.google.protobuf.ByteString
        getTotalRewardAmountBytes() {
      java.lang.Object ref = totalRewardAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        totalRewardAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string totalRewardAmount = 3 [json_name = "totalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The totalRewardAmount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalRewardAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      totalRewardAmount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string totalRewardAmount = 3 [json_name = "totalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalRewardAmount() {
      totalRewardAmount_ = getDefaultInstance().getTotalRewardAmount();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string totalRewardAmount = 3 [json_name = "totalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for totalRewardAmount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalRewardAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      totalRewardAmount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object userLimit_ = "";
    /**
     * <code>string userLimit = 5 [json_name = "userLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The userLimit.
     */
    public java.lang.String getUserLimit() {
      java.lang.Object ref = userLimit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userLimit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userLimit = 5 [json_name = "userLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for userLimit.
     */
    public com.google.protobuf.ByteString
        getUserLimitBytes() {
      java.lang.Object ref = userLimit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userLimit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userLimit = 5 [json_name = "userLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The userLimit to set.
     * @return This builder for chaining.
     */
    public Builder setUserLimit(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userLimit_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string userLimit = 5 [json_name = "userLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserLimit() {
      userLimit_ = getDefaultInstance().getUserLimit();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string userLimit = 5 [json_name = "userLimit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for userLimit to set.
     * @return This builder for chaining.
     */
    public Builder setUserLimitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userLimit_ = value;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.rmintreward.TokenRewardInfoPost)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.rmintreward.TokenRewardInfoPost)
  private static final com.stafihub.stafihub.rmintreward.TokenRewardInfoPost DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.rmintreward.TokenRewardInfoPost();
  }

  public static com.stafihub.stafihub.rmintreward.TokenRewardInfoPost getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TokenRewardInfoPost>
      PARSER = new com.google.protobuf.AbstractParser<TokenRewardInfoPost>() {
    @java.lang.Override
    public TokenRewardInfoPost parsePartialFrom(
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

  public static com.google.protobuf.Parser<TokenRewardInfoPost> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TokenRewardInfoPost> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.rmintreward.TokenRewardInfoPost getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

