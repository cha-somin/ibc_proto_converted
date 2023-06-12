// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/reward/v1/reward.proto

package com.provenance.reward.v1;

/**
 * <pre>
 * ActionVote represents the voting action and its required eligibility criteria.
 * </pre>
 *
 * Protobuf type {@code provenance.reward.v1.ActionVote}
 */
public final class ActionVote extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.reward.v1.ActionVote)
    ActionVoteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ActionVote.newBuilder() to construct.
  private ActionVote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActionVote() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ActionVote();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.reward.v1.RewardProto.internal_static_provenance_reward_v1_ActionVote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.reward.v1.RewardProto.internal_static_provenance_reward_v1_ActionVote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.reward.v1.ActionVote.class, com.provenance.reward.v1.ActionVote.Builder.class);
  }

  public static final int MINIMUM_ACTIONS_FIELD_NUMBER = 1;
  private long minimumActions_ = 0L;
  /**
   * <pre>
   * Minimum number of successful votes.
   * </pre>
   *
   * <code>uint64 minimum_actions = 1 [json_name = "minimumActions"];</code>
   * @return The minimumActions.
   */
  @java.lang.Override
  public long getMinimumActions() {
    return minimumActions_;
  }

  public static final int MAXIMUM_ACTIONS_FIELD_NUMBER = 2;
  private long maximumActions_ = 0L;
  /**
   * <pre>
   * Maximum number of successful votes.
   * </pre>
   *
   * <code>uint64 maximum_actions = 2 [json_name = "maximumActions"];</code>
   * @return The maximumActions.
   */
  @java.lang.Override
  public long getMaximumActions() {
    return maximumActions_;
  }

  public static final int MINIMUM_DELEGATION_AMOUNT_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin minimumDelegationAmount_;
  /**
   * <pre>
   * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
   * @return Whether the minimumDelegationAmount field is set.
   */
  @java.lang.Override
  public boolean hasMinimumDelegationAmount() {
    return minimumDelegationAmount_ != null;
  }
  /**
   * <pre>
   * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
   * @return The minimumDelegationAmount.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getMinimumDelegationAmount() {
    return minimumDelegationAmount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : minimumDelegationAmount_;
  }
  /**
   * <pre>
   * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getMinimumDelegationAmountOrBuilder() {
    return minimumDelegationAmount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : minimumDelegationAmount_;
  }

  public static final int VALIDATOR_MULTIPLIER_FIELD_NUMBER = 4;
  private long validatorMultiplier_ = 0L;
  /**
   * <pre>
   * Positive multiplier that is applied to the shares awarded by the vote action when conditions
   * are met(for now the only condition is the current vote is a validator vote). A value of zero will behave the same
   * as one
   * </pre>
   *
   * <code>uint64 validator_multiplier = 4 [json_name = "validatorMultiplier"];</code>
   * @return The validatorMultiplier.
   */
  @java.lang.Override
  public long getValidatorMultiplier() {
    return validatorMultiplier_;
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
    if (minimumActions_ != 0L) {
      output.writeUInt64(1, minimumActions_);
    }
    if (maximumActions_ != 0L) {
      output.writeUInt64(2, maximumActions_);
    }
    if (minimumDelegationAmount_ != null) {
      output.writeMessage(3, getMinimumDelegationAmount());
    }
    if (validatorMultiplier_ != 0L) {
      output.writeUInt64(4, validatorMultiplier_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minimumActions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, minimumActions_);
    }
    if (maximumActions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, maximumActions_);
    }
    if (minimumDelegationAmount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMinimumDelegationAmount());
    }
    if (validatorMultiplier_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, validatorMultiplier_);
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
    if (!(obj instanceof com.provenance.reward.v1.ActionVote)) {
      return super.equals(obj);
    }
    com.provenance.reward.v1.ActionVote other = (com.provenance.reward.v1.ActionVote) obj;

    if (getMinimumActions()
        != other.getMinimumActions()) return false;
    if (getMaximumActions()
        != other.getMaximumActions()) return false;
    if (hasMinimumDelegationAmount() != other.hasMinimumDelegationAmount()) return false;
    if (hasMinimumDelegationAmount()) {
      if (!getMinimumDelegationAmount()
          .equals(other.getMinimumDelegationAmount())) return false;
    }
    if (getValidatorMultiplier()
        != other.getValidatorMultiplier()) return false;
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
    hash = (37 * hash) + MINIMUM_ACTIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMinimumActions());
    hash = (37 * hash) + MAXIMUM_ACTIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaximumActions());
    if (hasMinimumDelegationAmount()) {
      hash = (37 * hash) + MINIMUM_DELEGATION_AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMinimumDelegationAmount().hashCode();
    }
    hash = (37 * hash) + VALIDATOR_MULTIPLIER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValidatorMultiplier());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.reward.v1.ActionVote parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.reward.v1.ActionVote parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.reward.v1.ActionVote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.reward.v1.ActionVote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.reward.v1.ActionVote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.reward.v1.ActionVote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.reward.v1.ActionVote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.reward.v1.ActionVote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.reward.v1.ActionVote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.reward.v1.ActionVote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.reward.v1.ActionVote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.reward.v1.ActionVote parseFrom(
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
  public static Builder newBuilder(com.provenance.reward.v1.ActionVote prototype) {
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
   * ActionVote represents the voting action and its required eligibility criteria.
   * </pre>
   *
   * Protobuf type {@code provenance.reward.v1.ActionVote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.reward.v1.ActionVote)
      com.provenance.reward.v1.ActionVoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.reward.v1.RewardProto.internal_static_provenance_reward_v1_ActionVote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.reward.v1.RewardProto.internal_static_provenance_reward_v1_ActionVote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.reward.v1.ActionVote.class, com.provenance.reward.v1.ActionVote.Builder.class);
    }

    // Construct using com.provenance.reward.v1.ActionVote.newBuilder()
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
      minimumActions_ = 0L;
      maximumActions_ = 0L;
      minimumDelegationAmount_ = null;
      if (minimumDelegationAmountBuilder_ != null) {
        minimumDelegationAmountBuilder_.dispose();
        minimumDelegationAmountBuilder_ = null;
      }
      validatorMultiplier_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.reward.v1.RewardProto.internal_static_provenance_reward_v1_ActionVote_descriptor;
    }

    @java.lang.Override
    public com.provenance.reward.v1.ActionVote getDefaultInstanceForType() {
      return com.provenance.reward.v1.ActionVote.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.reward.v1.ActionVote build() {
      com.provenance.reward.v1.ActionVote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.reward.v1.ActionVote buildPartial() {
      com.provenance.reward.v1.ActionVote result = new com.provenance.reward.v1.ActionVote(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.reward.v1.ActionVote result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minimumActions_ = minimumActions_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maximumActions_ = maximumActions_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.minimumDelegationAmount_ = minimumDelegationAmountBuilder_ == null
            ? minimumDelegationAmount_
            : minimumDelegationAmountBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validatorMultiplier_ = validatorMultiplier_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.reward.v1.ActionVote) {
        return mergeFrom((com.provenance.reward.v1.ActionVote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.reward.v1.ActionVote other) {
      if (other == com.provenance.reward.v1.ActionVote.getDefaultInstance()) return this;
      if (other.getMinimumActions() != 0L) {
        setMinimumActions(other.getMinimumActions());
      }
      if (other.getMaximumActions() != 0L) {
        setMaximumActions(other.getMaximumActions());
      }
      if (other.hasMinimumDelegationAmount()) {
        mergeMinimumDelegationAmount(other.getMinimumDelegationAmount());
      }
      if (other.getValidatorMultiplier() != 0L) {
        setValidatorMultiplier(other.getValidatorMultiplier());
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
              minimumActions_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              maximumActions_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getMinimumDelegationAmountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              validatorMultiplier_ = input.readUInt64();
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

    private long minimumActions_ ;
    /**
     * <pre>
     * Minimum number of successful votes.
     * </pre>
     *
     * <code>uint64 minimum_actions = 1 [json_name = "minimumActions"];</code>
     * @return The minimumActions.
     */
    @java.lang.Override
    public long getMinimumActions() {
      return minimumActions_;
    }
    /**
     * <pre>
     * Minimum number of successful votes.
     * </pre>
     *
     * <code>uint64 minimum_actions = 1 [json_name = "minimumActions"];</code>
     * @param value The minimumActions to set.
     * @return This builder for chaining.
     */
    public Builder setMinimumActions(long value) {

      minimumActions_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum number of successful votes.
     * </pre>
     *
     * <code>uint64 minimum_actions = 1 [json_name = "minimumActions"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinimumActions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minimumActions_ = 0L;
      onChanged();
      return this;
    }

    private long maximumActions_ ;
    /**
     * <pre>
     * Maximum number of successful votes.
     * </pre>
     *
     * <code>uint64 maximum_actions = 2 [json_name = "maximumActions"];</code>
     * @return The maximumActions.
     */
    @java.lang.Override
    public long getMaximumActions() {
      return maximumActions_;
    }
    /**
     * <pre>
     * Maximum number of successful votes.
     * </pre>
     *
     * <code>uint64 maximum_actions = 2 [json_name = "maximumActions"];</code>
     * @param value The maximumActions to set.
     * @return This builder for chaining.
     */
    public Builder setMaximumActions(long value) {

      maximumActions_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of successful votes.
     * </pre>
     *
     * <code>uint64 maximum_actions = 2 [json_name = "maximumActions"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaximumActions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maximumActions_ = 0L;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin minimumDelegationAmount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> minimumDelegationAmountBuilder_;
    /**
     * <pre>
     * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
     * @return Whether the minimumDelegationAmount field is set.
     */
    public boolean hasMinimumDelegationAmount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
     * @return The minimumDelegationAmount.
     */
    public com.cosmos.base.v1beta1.Coin getMinimumDelegationAmount() {
      if (minimumDelegationAmountBuilder_ == null) {
        return minimumDelegationAmount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : minimumDelegationAmount_;
      } else {
        return minimumDelegationAmountBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMinimumDelegationAmount(com.cosmos.base.v1beta1.Coin value) {
      if (minimumDelegationAmountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minimumDelegationAmount_ = value;
      } else {
        minimumDelegationAmountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMinimumDelegationAmount(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (minimumDelegationAmountBuilder_ == null) {
        minimumDelegationAmount_ = builderForValue.build();
      } else {
        minimumDelegationAmountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeMinimumDelegationAmount(com.cosmos.base.v1beta1.Coin value) {
      if (minimumDelegationAmountBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          minimumDelegationAmount_ != null &&
          minimumDelegationAmount_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getMinimumDelegationAmountBuilder().mergeFrom(value);
        } else {
          minimumDelegationAmount_ = value;
        }
      } else {
        minimumDelegationAmountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearMinimumDelegationAmount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      minimumDelegationAmount_ = null;
      if (minimumDelegationAmountBuilder_ != null) {
        minimumDelegationAmountBuilder_.dispose();
        minimumDelegationAmountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getMinimumDelegationAmountBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getMinimumDelegationAmountFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getMinimumDelegationAmountOrBuilder() {
      if (minimumDelegationAmountBuilder_ != null) {
        return minimumDelegationAmountBuilder_.getMessageOrBuilder();
      } else {
        return minimumDelegationAmount_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : minimumDelegationAmount_;
      }
    }
    /**
     * <pre>
     * Minimum delegation amount the account must have across all validators, for the vote action to be counted.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin minimum_delegation_amount = 3 [json_name = "minimumDelegationAmount", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getMinimumDelegationAmountFieldBuilder() {
      if (minimumDelegationAmountBuilder_ == null) {
        minimumDelegationAmountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getMinimumDelegationAmount(),
                getParentForChildren(),
                isClean());
        minimumDelegationAmount_ = null;
      }
      return minimumDelegationAmountBuilder_;
    }

    private long validatorMultiplier_ ;
    /**
     * <pre>
     * Positive multiplier that is applied to the shares awarded by the vote action when conditions
     * are met(for now the only condition is the current vote is a validator vote). A value of zero will behave the same
     * as one
     * </pre>
     *
     * <code>uint64 validator_multiplier = 4 [json_name = "validatorMultiplier"];</code>
     * @return The validatorMultiplier.
     */
    @java.lang.Override
    public long getValidatorMultiplier() {
      return validatorMultiplier_;
    }
    /**
     * <pre>
     * Positive multiplier that is applied to the shares awarded by the vote action when conditions
     * are met(for now the only condition is the current vote is a validator vote). A value of zero will behave the same
     * as one
     * </pre>
     *
     * <code>uint64 validator_multiplier = 4 [json_name = "validatorMultiplier"];</code>
     * @param value The validatorMultiplier to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorMultiplier(long value) {

      validatorMultiplier_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Positive multiplier that is applied to the shares awarded by the vote action when conditions
     * are met(for now the only condition is the current vote is a validator vote). A value of zero will behave the same
     * as one
     * </pre>
     *
     * <code>uint64 validator_multiplier = 4 [json_name = "validatorMultiplier"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorMultiplier() {
      bitField0_ = (bitField0_ & ~0x00000008);
      validatorMultiplier_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:provenance.reward.v1.ActionVote)
  }

  // @@protoc_insertion_point(class_scope:provenance.reward.v1.ActionVote)
  private static final com.provenance.reward.v1.ActionVote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.reward.v1.ActionVote();
  }

  public static com.provenance.reward.v1.ActionVote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActionVote>
      PARSER = new com.google.protobuf.AbstractParser<ActionVote>() {
    @java.lang.Override
    public ActionVote parsePartialFrom(
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

  public static com.google.protobuf.Parser<ActionVote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActionVote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.reward.v1.ActionVote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

