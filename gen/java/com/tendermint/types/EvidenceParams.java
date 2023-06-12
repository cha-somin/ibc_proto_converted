// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/params.proto

package com.tendermint.types;

/**
 * <pre>
 * EvidenceParams determine how we handle evidence of malfeasance.
 * </pre>
 *
 * Protobuf type {@code tendermint.types.EvidenceParams}
 */
public final class EvidenceParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.EvidenceParams)
    EvidenceParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EvidenceParams.newBuilder() to construct.
  private EvidenceParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EvidenceParams() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EvidenceParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.types.ParamsProto.internal_static_tendermint_types_EvidenceParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.types.ParamsProto.internal_static_tendermint_types_EvidenceParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.types.EvidenceParams.class, com.tendermint.types.EvidenceParams.Builder.class);
  }

  public static final int MAX_AGE_NUM_BLOCKS_FIELD_NUMBER = 1;
  private long maxAgeNumBlocks_ = 0L;
  /**
   * <pre>
   * Max age of evidence, in blocks.
   *
   * The basic formula for calculating this is: MaxAgeDuration / {average block
   * time}.
   * </pre>
   *
   * <code>int64 max_age_num_blocks = 1 [json_name = "maxAgeNumBlocks"];</code>
   * @return The maxAgeNumBlocks.
   */
  @java.lang.Override
  public long getMaxAgeNumBlocks() {
    return maxAgeNumBlocks_;
  }

  public static final int MAX_AGE_DURATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration maxAgeDuration_;
  /**
   * <pre>
   * Max age of evidence, in time.
   *
   * It should correspond with an app's "unbonding period" or other similar
   * mechanism for handling [Nothing-At-Stake
   * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return Whether the maxAgeDuration field is set.
   */
  @java.lang.Override
  public boolean hasMaxAgeDuration() {
    return maxAgeDuration_ != null;
  }
  /**
   * <pre>
   * Max age of evidence, in time.
   *
   * It should correspond with an app's "unbonding period" or other similar
   * mechanism for handling [Nothing-At-Stake
   * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return The maxAgeDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getMaxAgeDuration() {
    return maxAgeDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : maxAgeDuration_;
  }
  /**
   * <pre>
   * Max age of evidence, in time.
   *
   * It should correspond with an app's "unbonding period" or other similar
   * mechanism for handling [Nothing-At-Stake
   * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getMaxAgeDurationOrBuilder() {
    return maxAgeDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : maxAgeDuration_;
  }

  public static final int MAX_BYTES_FIELD_NUMBER = 3;
  private long maxBytes_ = 0L;
  /**
   * <pre>
   * This sets the maximum size of total evidence in bytes that can be committed in a single block.
   * and should fall comfortably under the max block bytes.
   * Default is 1048576 or 1MB
   * </pre>
   *
   * <code>int64 max_bytes = 3 [json_name = "maxBytes"];</code>
   * @return The maxBytes.
   */
  @java.lang.Override
  public long getMaxBytes() {
    return maxBytes_;
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
    if (maxAgeNumBlocks_ != 0L) {
      output.writeInt64(1, maxAgeNumBlocks_);
    }
    if (maxAgeDuration_ != null) {
      output.writeMessage(2, getMaxAgeDuration());
    }
    if (maxBytes_ != 0L) {
      output.writeInt64(3, maxBytes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxAgeNumBlocks_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, maxAgeNumBlocks_);
    }
    if (maxAgeDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMaxAgeDuration());
    }
    if (maxBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, maxBytes_);
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
    if (!(obj instanceof com.tendermint.types.EvidenceParams)) {
      return super.equals(obj);
    }
    com.tendermint.types.EvidenceParams other = (com.tendermint.types.EvidenceParams) obj;

    if (getMaxAgeNumBlocks()
        != other.getMaxAgeNumBlocks()) return false;
    if (hasMaxAgeDuration() != other.hasMaxAgeDuration()) return false;
    if (hasMaxAgeDuration()) {
      if (!getMaxAgeDuration()
          .equals(other.getMaxAgeDuration())) return false;
    }
    if (getMaxBytes()
        != other.getMaxBytes()) return false;
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
    hash = (37 * hash) + MAX_AGE_NUM_BLOCKS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxAgeNumBlocks());
    if (hasMaxAgeDuration()) {
      hash = (37 * hash) + MAX_AGE_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getMaxAgeDuration().hashCode();
    }
    hash = (37 * hash) + MAX_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxBytes());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.types.EvidenceParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.EvidenceParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.EvidenceParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.EvidenceParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.EvidenceParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.EvidenceParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.EvidenceParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.EvidenceParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tendermint.types.EvidenceParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tendermint.types.EvidenceParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.types.EvidenceParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.EvidenceParams parseFrom(
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
  public static Builder newBuilder(com.tendermint.types.EvidenceParams prototype) {
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
   * EvidenceParams determine how we handle evidence of malfeasance.
   * </pre>
   *
   * Protobuf type {@code tendermint.types.EvidenceParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.EvidenceParams)
      com.tendermint.types.EvidenceParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.types.ParamsProto.internal_static_tendermint_types_EvidenceParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.types.ParamsProto.internal_static_tendermint_types_EvidenceParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.types.EvidenceParams.class, com.tendermint.types.EvidenceParams.Builder.class);
    }

    // Construct using com.tendermint.types.EvidenceParams.newBuilder()
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
      maxAgeNumBlocks_ = 0L;
      maxAgeDuration_ = null;
      if (maxAgeDurationBuilder_ != null) {
        maxAgeDurationBuilder_.dispose();
        maxAgeDurationBuilder_ = null;
      }
      maxBytes_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.types.ParamsProto.internal_static_tendermint_types_EvidenceParams_descriptor;
    }

    @java.lang.Override
    public com.tendermint.types.EvidenceParams getDefaultInstanceForType() {
      return com.tendermint.types.EvidenceParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.types.EvidenceParams build() {
      com.tendermint.types.EvidenceParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.types.EvidenceParams buildPartial() {
      com.tendermint.types.EvidenceParams result = new com.tendermint.types.EvidenceParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tendermint.types.EvidenceParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxAgeNumBlocks_ = maxAgeNumBlocks_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxAgeDuration_ = maxAgeDurationBuilder_ == null
            ? maxAgeDuration_
            : maxAgeDurationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxBytes_ = maxBytes_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tendermint.types.EvidenceParams) {
        return mergeFrom((com.tendermint.types.EvidenceParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.types.EvidenceParams other) {
      if (other == com.tendermint.types.EvidenceParams.getDefaultInstance()) return this;
      if (other.getMaxAgeNumBlocks() != 0L) {
        setMaxAgeNumBlocks(other.getMaxAgeNumBlocks());
      }
      if (other.hasMaxAgeDuration()) {
        mergeMaxAgeDuration(other.getMaxAgeDuration());
      }
      if (other.getMaxBytes() != 0L) {
        setMaxBytes(other.getMaxBytes());
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
              maxAgeNumBlocks_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getMaxAgeDurationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              maxBytes_ = input.readInt64();
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

    private long maxAgeNumBlocks_ ;
    /**
     * <pre>
     * Max age of evidence, in blocks.
     *
     * The basic formula for calculating this is: MaxAgeDuration / {average block
     * time}.
     * </pre>
     *
     * <code>int64 max_age_num_blocks = 1 [json_name = "maxAgeNumBlocks"];</code>
     * @return The maxAgeNumBlocks.
     */
    @java.lang.Override
    public long getMaxAgeNumBlocks() {
      return maxAgeNumBlocks_;
    }
    /**
     * <pre>
     * Max age of evidence, in blocks.
     *
     * The basic formula for calculating this is: MaxAgeDuration / {average block
     * time}.
     * </pre>
     *
     * <code>int64 max_age_num_blocks = 1 [json_name = "maxAgeNumBlocks"];</code>
     * @param value The maxAgeNumBlocks to set.
     * @return This builder for chaining.
     */
    public Builder setMaxAgeNumBlocks(long value) {

      maxAgeNumBlocks_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max age of evidence, in blocks.
     *
     * The basic formula for calculating this is: MaxAgeDuration / {average block
     * time}.
     * </pre>
     *
     * <code>int64 max_age_num_blocks = 1 [json_name = "maxAgeNumBlocks"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxAgeNumBlocks() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxAgeNumBlocks_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration maxAgeDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> maxAgeDurationBuilder_;
    /**
     * <pre>
     * Max age of evidence, in time.
     *
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the maxAgeDuration field is set.
     */
    public boolean hasMaxAgeDuration() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Max age of evidence, in time.
     *
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The maxAgeDuration.
     */
    public com.google.protobuf.Duration getMaxAgeDuration() {
      if (maxAgeDurationBuilder_ == null) {
        return maxAgeDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : maxAgeDuration_;
      } else {
        return maxAgeDurationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Max age of evidence, in time.
     *
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder setMaxAgeDuration(com.google.protobuf.Duration value) {
      if (maxAgeDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxAgeDuration_ = value;
      } else {
        maxAgeDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max age of evidence, in time.
     *
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder setMaxAgeDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (maxAgeDurationBuilder_ == null) {
        maxAgeDuration_ = builderForValue.build();
      } else {
        maxAgeDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max age of evidence, in time.
     *
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder mergeMaxAgeDuration(com.google.protobuf.Duration value) {
      if (maxAgeDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          maxAgeDuration_ != null &&
          maxAgeDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getMaxAgeDurationBuilder().mergeFrom(value);
        } else {
          maxAgeDuration_ = value;
        }
      } else {
        maxAgeDurationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max age of evidence, in time.
     *
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder clearMaxAgeDuration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxAgeDuration_ = null;
      if (maxAgeDurationBuilder_ != null) {
        maxAgeDurationBuilder_.dispose();
        maxAgeDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max age of evidence, in time.
     *
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration.Builder getMaxAgeDurationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMaxAgeDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Max age of evidence, in time.
     *
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.DurationOrBuilder getMaxAgeDurationOrBuilder() {
      if (maxAgeDurationBuilder_ != null) {
        return maxAgeDurationBuilder_.getMessageOrBuilder();
      } else {
        return maxAgeDuration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : maxAgeDuration_;
      }
    }
    /**
     * <pre>
     * Max age of evidence, in time.
     *
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [json_name = "maxAgeDuration", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getMaxAgeDurationFieldBuilder() {
      if (maxAgeDurationBuilder_ == null) {
        maxAgeDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getMaxAgeDuration(),
                getParentForChildren(),
                isClean());
        maxAgeDuration_ = null;
      }
      return maxAgeDurationBuilder_;
    }

    private long maxBytes_ ;
    /**
     * <pre>
     * This sets the maximum size of total evidence in bytes that can be committed in a single block.
     * and should fall comfortably under the max block bytes.
     * Default is 1048576 or 1MB
     * </pre>
     *
     * <code>int64 max_bytes = 3 [json_name = "maxBytes"];</code>
     * @return The maxBytes.
     */
    @java.lang.Override
    public long getMaxBytes() {
      return maxBytes_;
    }
    /**
     * <pre>
     * This sets the maximum size of total evidence in bytes that can be committed in a single block.
     * and should fall comfortably under the max block bytes.
     * Default is 1048576 or 1MB
     * </pre>
     *
     * <code>int64 max_bytes = 3 [json_name = "maxBytes"];</code>
     * @param value The maxBytes to set.
     * @return This builder for chaining.
     */
    public Builder setMaxBytes(long value) {

      maxBytes_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This sets the maximum size of total evidence in bytes that can be committed in a single block.
     * and should fall comfortably under the max block bytes.
     * Default is 1048576 or 1MB
     * </pre>
     *
     * <code>int64 max_bytes = 3 [json_name = "maxBytes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxBytes() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxBytes_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.EvidenceParams)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.EvidenceParams)
  private static final com.tendermint.types.EvidenceParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.types.EvidenceParams();
  }

  public static com.tendermint.types.EvidenceParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvidenceParams>
      PARSER = new com.google.protobuf.AbstractParser<EvidenceParams>() {
    @java.lang.Override
    public EvidenceParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<EvidenceParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvidenceParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.types.EvidenceParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

