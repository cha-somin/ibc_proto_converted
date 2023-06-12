// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package com.cosmos.distribution.v1beta1;

/**
 * <pre>
 * ValidatorCurrentRewardsRecord is used for import / export via genesis json.
 * </pre>
 *
 * Protobuf type {@code cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord}
 */
public final class ValidatorCurrentRewardsRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord)
    ValidatorCurrentRewardsRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidatorCurrentRewardsRecord.newBuilder() to construct.
  private ValidatorCurrentRewardsRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidatorCurrentRewardsRecord() {
    validatorAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValidatorCurrentRewardsRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.distribution.v1beta1.GenesisProto.internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewardsRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.distribution.v1beta1.GenesisProto.internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewardsRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord.class, com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord.Builder.class);
  }

  public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object validatorAddress_ = "";
  /**
   * <pre>
   * validator_address is the address of the validator.
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
   * @return The validatorAddress.
   */
  @java.lang.Override
  public java.lang.String getValidatorAddress() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validatorAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * validator_address is the address of the validator.
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
   * @return The bytes for validatorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValidatorAddressBytes() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validatorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REWARDS_FIELD_NUMBER = 2;
  private com.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards_;
  /**
   * <pre>
   * rewards defines the current rewards of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return Whether the rewards field is set.
   */
  @java.lang.Override
  public boolean hasRewards() {
    return rewards_ != null;
  }
  /**
   * <pre>
   * rewards defines the current rewards of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return The rewards.
   */
  @java.lang.Override
  public com.cosmos.distribution.v1beta1.ValidatorCurrentRewards getRewards() {
    return rewards_ == null ? com.cosmos.distribution.v1beta1.ValidatorCurrentRewards.getDefaultInstance() : rewards_;
  }
  /**
   * <pre>
   * rewards defines the current rewards of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsOrBuilder getRewardsOrBuilder() {
    return rewards_ == null ? com.cosmos.distribution.v1beta1.ValidatorCurrentRewards.getDefaultInstance() : rewards_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, validatorAddress_);
    }
    if (rewards_ != null) {
      output.writeMessage(2, getRewards());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, validatorAddress_);
    }
    if (rewards_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRewards());
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
    if (!(obj instanceof com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord)) {
      return super.equals(obj);
    }
    com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord other = (com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord) obj;

    if (!getValidatorAddress()
        .equals(other.getValidatorAddress())) return false;
    if (hasRewards() != other.hasRewards()) return false;
    if (hasRewards()) {
      if (!getRewards()
          .equals(other.getRewards())) return false;
    }
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
    hash = (37 * hash) + VALIDATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorAddress().hashCode();
    if (hasRewards()) {
      hash = (37 * hash) + REWARDS_FIELD_NUMBER;
      hash = (53 * hash) + getRewards().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord parseFrom(
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
  public static Builder newBuilder(com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord prototype) {
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
   * ValidatorCurrentRewardsRecord is used for import / export via genesis json.
   * </pre>
   *
   * Protobuf type {@code cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord)
      com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.distribution.v1beta1.GenesisProto.internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewardsRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.distribution.v1beta1.GenesisProto.internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewardsRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord.class, com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord.Builder.class);
    }

    // Construct using com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord.newBuilder()
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
      validatorAddress_ = "";
      rewards_ = null;
      if (rewardsBuilder_ != null) {
        rewardsBuilder_.dispose();
        rewardsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.distribution.v1beta1.GenesisProto.internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewardsRecord_descriptor;
    }

    @java.lang.Override
    public com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord getDefaultInstanceForType() {
      return com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord build() {
      com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord buildPartial() {
      com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord result = new com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.validatorAddress_ = validatorAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rewards_ = rewardsBuilder_ == null
            ? rewards_
            : rewardsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord) {
        return mergeFrom((com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord other) {
      if (other == com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord.getDefaultInstance()) return this;
      if (!other.getValidatorAddress().isEmpty()) {
        validatorAddress_ = other.validatorAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRewards()) {
        mergeRewards(other.getRewards());
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
              validatorAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRewardsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object validatorAddress_ = "";
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     * @return The validatorAddress.
     */
    public java.lang.String getValidatorAddress() {
      java.lang.Object ref = validatorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validatorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     * @return The bytes for validatorAddress.
     */
    public com.google.protobuf.ByteString
        getValidatorAddressBytes() {
      java.lang.Object ref = validatorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validatorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     * @param value The validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      validatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorAddress() {
      validatorAddress_ = getDefaultInstance().getValidatorAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.ValidatorAddressString"];</code>
     * @param value The bytes for validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      validatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.distribution.v1beta1.ValidatorCurrentRewards, com.cosmos.distribution.v1beta1.ValidatorCurrentRewards.Builder, com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsOrBuilder> rewardsBuilder_;
    /**
     * <pre>
     * rewards defines the current rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return Whether the rewards field is set.
     */
    public boolean hasRewards() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * rewards defines the current rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     * @return The rewards.
     */
    public com.cosmos.distribution.v1beta1.ValidatorCurrentRewards getRewards() {
      if (rewardsBuilder_ == null) {
        return rewards_ == null ? com.cosmos.distribution.v1beta1.ValidatorCurrentRewards.getDefaultInstance() : rewards_;
      } else {
        return rewardsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * rewards defines the current rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setRewards(com.cosmos.distribution.v1beta1.ValidatorCurrentRewards value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rewards_ = value;
      } else {
        rewardsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * rewards defines the current rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setRewards(
        com.cosmos.distribution.v1beta1.ValidatorCurrentRewards.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        rewards_ = builderForValue.build();
      } else {
        rewardsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * rewards defines the current rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder mergeRewards(com.cosmos.distribution.v1beta1.ValidatorCurrentRewards value) {
      if (rewardsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          rewards_ != null &&
          rewards_ != com.cosmos.distribution.v1beta1.ValidatorCurrentRewards.getDefaultInstance()) {
          getRewardsBuilder().mergeFrom(value);
        } else {
          rewards_ = value;
        }
      } else {
        rewardsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * rewards defines the current rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder clearRewards() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rewards_ = null;
      if (rewardsBuilder_ != null) {
        rewardsBuilder_.dispose();
        rewardsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * rewards defines the current rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.distribution.v1beta1.ValidatorCurrentRewards.Builder getRewardsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRewardsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * rewards defines the current rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsOrBuilder getRewardsOrBuilder() {
      if (rewardsBuilder_ != null) {
        return rewardsBuilder_.getMessageOrBuilder();
      } else {
        return rewards_ == null ?
            com.cosmos.distribution.v1beta1.ValidatorCurrentRewards.getDefaultInstance() : rewards_;
      }
    }
    /**
     * <pre>
     * rewards defines the current rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.distribution.v1beta1.ValidatorCurrentRewards, com.cosmos.distribution.v1beta1.ValidatorCurrentRewards.Builder, com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsOrBuilder> 
        getRewardsFieldBuilder() {
      if (rewardsBuilder_ == null) {
        rewardsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.distribution.v1beta1.ValidatorCurrentRewards, com.cosmos.distribution.v1beta1.ValidatorCurrentRewards.Builder, com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsOrBuilder>(
                getRewards(),
                getParentForChildren(),
                isClean());
        rewards_ = null;
      }
      return rewardsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord)
  }

  // @@protoc_insertion_point(class_scope:cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord)
  private static final com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord();
  }

  public static com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidatorCurrentRewardsRecord>
      PARSER = new com.google.protobuf.AbstractParser<ValidatorCurrentRewardsRecord>() {
    @java.lang.Override
    public ValidatorCurrentRewardsRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<ValidatorCurrentRewardsRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidatorCurrentRewardsRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

