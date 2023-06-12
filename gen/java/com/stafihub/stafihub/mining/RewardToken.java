// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/mining/models.proto

package com.stafihub.stafihub.mining;

/**
 * Protobuf type {@code stafihub.stafihub.mining.RewardToken}
 */
public final class RewardToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.mining.RewardToken)
    RewardTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RewardToken.newBuilder() to construct.
  private RewardToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RewardToken() {
    rewardTokenDenom_ = "";
    minTotalRewardAmount_ = "";
    minRewardPerSecond_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RewardToken();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.mining.ModelsProto.internal_static_stafihub_stafihub_mining_RewardToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.mining.ModelsProto.internal_static_stafihub_stafihub_mining_RewardToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.mining.RewardToken.class, com.stafihub.stafihub.mining.RewardToken.Builder.class);
  }

  public static final int REWARDTOKENDENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rewardTokenDenom_ = "";
  /**
   * <code>string rewardTokenDenom = 1 [json_name = "rewardTokenDenom"];</code>
   * @return The rewardTokenDenom.
   */
  @java.lang.Override
  public java.lang.String getRewardTokenDenom() {
    java.lang.Object ref = rewardTokenDenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardTokenDenom_ = s;
      return s;
    }
  }
  /**
   * <code>string rewardTokenDenom = 1 [json_name = "rewardTokenDenom"];</code>
   * @return The bytes for rewardTokenDenom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardTokenDenomBytes() {
    java.lang.Object ref = rewardTokenDenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardTokenDenom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MINTOTALREWARDAMOUNT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object minTotalRewardAmount_ = "";
  /**
   * <code>string minTotalRewardAmount = 2 [json_name = "minTotalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The minTotalRewardAmount.
   */
  @java.lang.Override
  public java.lang.String getMinTotalRewardAmount() {
    java.lang.Object ref = minTotalRewardAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      minTotalRewardAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string minTotalRewardAmount = 2 [json_name = "minTotalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for minTotalRewardAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMinTotalRewardAmountBytes() {
    java.lang.Object ref = minTotalRewardAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      minTotalRewardAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MINREWARDPERSECOND_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object minRewardPerSecond_ = "";
  /**
   * <code>string minRewardPerSecond = 3 [json_name = "minRewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The minRewardPerSecond.
   */
  @java.lang.Override
  public java.lang.String getMinRewardPerSecond() {
    java.lang.Object ref = minRewardPerSecond_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      minRewardPerSecond_ = s;
      return s;
    }
  }
  /**
   * <code>string minRewardPerSecond = 3 [json_name = "minRewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for minRewardPerSecond.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMinRewardPerSecondBytes() {
    java.lang.Object ref = minRewardPerSecond_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      minRewardPerSecond_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardTokenDenom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rewardTokenDenom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minTotalRewardAmount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, minTotalRewardAmount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minRewardPerSecond_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, minRewardPerSecond_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardTokenDenom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rewardTokenDenom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minTotalRewardAmount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, minTotalRewardAmount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minRewardPerSecond_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, minRewardPerSecond_);
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
    if (!(obj instanceof com.stafihub.stafihub.mining.RewardToken)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.mining.RewardToken other = (com.stafihub.stafihub.mining.RewardToken) obj;

    if (!getRewardTokenDenom()
        .equals(other.getRewardTokenDenom())) return false;
    if (!getMinTotalRewardAmount()
        .equals(other.getMinTotalRewardAmount())) return false;
    if (!getMinRewardPerSecond()
        .equals(other.getMinRewardPerSecond())) return false;
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
    hash = (37 * hash) + REWARDTOKENDENOM_FIELD_NUMBER;
    hash = (53 * hash) + getRewardTokenDenom().hashCode();
    hash = (37 * hash) + MINTOTALREWARDAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMinTotalRewardAmount().hashCode();
    hash = (37 * hash) + MINREWARDPERSECOND_FIELD_NUMBER;
    hash = (53 * hash) + getMinRewardPerSecond().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.mining.RewardToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.mining.RewardToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.RewardToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.mining.RewardToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.RewardToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.mining.RewardToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.RewardToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.mining.RewardToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.mining.RewardToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.mining.RewardToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.RewardToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.mining.RewardToken parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.mining.RewardToken prototype) {
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
   * Protobuf type {@code stafihub.stafihub.mining.RewardToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.mining.RewardToken)
      com.stafihub.stafihub.mining.RewardTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.mining.ModelsProto.internal_static_stafihub_stafihub_mining_RewardToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.mining.ModelsProto.internal_static_stafihub_stafihub_mining_RewardToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.mining.RewardToken.class, com.stafihub.stafihub.mining.RewardToken.Builder.class);
    }

    // Construct using com.stafihub.stafihub.mining.RewardToken.newBuilder()
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
      rewardTokenDenom_ = "";
      minTotalRewardAmount_ = "";
      minRewardPerSecond_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.mining.ModelsProto.internal_static_stafihub_stafihub_mining_RewardToken_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.mining.RewardToken getDefaultInstanceForType() {
      return com.stafihub.stafihub.mining.RewardToken.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.mining.RewardToken build() {
      com.stafihub.stafihub.mining.RewardToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.mining.RewardToken buildPartial() {
      com.stafihub.stafihub.mining.RewardToken result = new com.stafihub.stafihub.mining.RewardToken(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.mining.RewardToken result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rewardTokenDenom_ = rewardTokenDenom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minTotalRewardAmount_ = minTotalRewardAmount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.minRewardPerSecond_ = minRewardPerSecond_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.mining.RewardToken) {
        return mergeFrom((com.stafihub.stafihub.mining.RewardToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.mining.RewardToken other) {
      if (other == com.stafihub.stafihub.mining.RewardToken.getDefaultInstance()) return this;
      if (!other.getRewardTokenDenom().isEmpty()) {
        rewardTokenDenom_ = other.rewardTokenDenom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMinTotalRewardAmount().isEmpty()) {
        minTotalRewardAmount_ = other.minTotalRewardAmount_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMinRewardPerSecond().isEmpty()) {
        minRewardPerSecond_ = other.minRewardPerSecond_;
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
              rewardTokenDenom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              minTotalRewardAmount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              minRewardPerSecond_ = input.readStringRequireUtf8();
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

    private java.lang.Object rewardTokenDenom_ = "";
    /**
     * <code>string rewardTokenDenom = 1 [json_name = "rewardTokenDenom"];</code>
     * @return The rewardTokenDenom.
     */
    public java.lang.String getRewardTokenDenom() {
      java.lang.Object ref = rewardTokenDenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardTokenDenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rewardTokenDenom = 1 [json_name = "rewardTokenDenom"];</code>
     * @return The bytes for rewardTokenDenom.
     */
    public com.google.protobuf.ByteString
        getRewardTokenDenomBytes() {
      java.lang.Object ref = rewardTokenDenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardTokenDenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rewardTokenDenom = 1 [json_name = "rewardTokenDenom"];</code>
     * @param value The rewardTokenDenom to set.
     * @return This builder for chaining.
     */
    public Builder setRewardTokenDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rewardTokenDenom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string rewardTokenDenom = 1 [json_name = "rewardTokenDenom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardTokenDenom() {
      rewardTokenDenom_ = getDefaultInstance().getRewardTokenDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string rewardTokenDenom = 1 [json_name = "rewardTokenDenom"];</code>
     * @param value The bytes for rewardTokenDenom to set.
     * @return This builder for chaining.
     */
    public Builder setRewardTokenDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rewardTokenDenom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object minTotalRewardAmount_ = "";
    /**
     * <code>string minTotalRewardAmount = 2 [json_name = "minTotalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The minTotalRewardAmount.
     */
    public java.lang.String getMinTotalRewardAmount() {
      java.lang.Object ref = minTotalRewardAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        minTotalRewardAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string minTotalRewardAmount = 2 [json_name = "minTotalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for minTotalRewardAmount.
     */
    public com.google.protobuf.ByteString
        getMinTotalRewardAmountBytes() {
      java.lang.Object ref = minTotalRewardAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        minTotalRewardAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string minTotalRewardAmount = 2 [json_name = "minTotalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The minTotalRewardAmount to set.
     * @return This builder for chaining.
     */
    public Builder setMinTotalRewardAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      minTotalRewardAmount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string minTotalRewardAmount = 2 [json_name = "minTotalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinTotalRewardAmount() {
      minTotalRewardAmount_ = getDefaultInstance().getMinTotalRewardAmount();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string minTotalRewardAmount = 2 [json_name = "minTotalRewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for minTotalRewardAmount to set.
     * @return This builder for chaining.
     */
    public Builder setMinTotalRewardAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      minTotalRewardAmount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object minRewardPerSecond_ = "";
    /**
     * <code>string minRewardPerSecond = 3 [json_name = "minRewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The minRewardPerSecond.
     */
    public java.lang.String getMinRewardPerSecond() {
      java.lang.Object ref = minRewardPerSecond_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        minRewardPerSecond_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string minRewardPerSecond = 3 [json_name = "minRewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for minRewardPerSecond.
     */
    public com.google.protobuf.ByteString
        getMinRewardPerSecondBytes() {
      java.lang.Object ref = minRewardPerSecond_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        minRewardPerSecond_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string minRewardPerSecond = 3 [json_name = "minRewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The minRewardPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setMinRewardPerSecond(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      minRewardPerSecond_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string minRewardPerSecond = 3 [json_name = "minRewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinRewardPerSecond() {
      minRewardPerSecond_ = getDefaultInstance().getMinRewardPerSecond();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string minRewardPerSecond = 3 [json_name = "minRewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for minRewardPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setMinRewardPerSecondBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      minRewardPerSecond_ = value;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.mining.RewardToken)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.mining.RewardToken)
  private static final com.stafihub.stafihub.mining.RewardToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.mining.RewardToken();
  }

  public static com.stafihub.stafihub.mining.RewardToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RewardToken>
      PARSER = new com.google.protobuf.AbstractParser<RewardToken>() {
    @java.lang.Override
    public RewardToken parsePartialFrom(
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

  public static com.google.protobuf.Parser<RewardToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RewardToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.mining.RewardToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

