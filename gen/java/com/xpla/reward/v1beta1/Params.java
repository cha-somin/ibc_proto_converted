// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xpla/reward/v1beta1/reward.proto

package com.xpla.reward.v1beta1;

/**
 * <pre>
 * Params defines the set of params for the reward module.
 * </pre>
 *
 * Protobuf type {@code xpla.reward.v1beta1.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xpla.reward.v1beta1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
    feePoolRate_ = "";
    communityPoolRate_ = "";
    reserveRate_ = "";
    reserveAccount_ = "";
    rewardDistributeAccount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xpla.reward.v1beta1.RewardProto.internal_static_xpla_reward_v1beta1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xpla.reward.v1beta1.RewardProto.internal_static_xpla_reward_v1beta1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xpla.reward.v1beta1.Params.class, com.xpla.reward.v1beta1.Params.Builder.class);
  }

  public static final int FEE_POOL_RATE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object feePoolRate_ = "";
  /**
   * <code>string fee_pool_rate = 1 [json_name = "feePoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"fee_pool_rate&#92;""];</code>
   * @return The feePoolRate.
   */
  @java.lang.Override
  public java.lang.String getFeePoolRate() {
    java.lang.Object ref = feePoolRate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      feePoolRate_ = s;
      return s;
    }
  }
  /**
   * <code>string fee_pool_rate = 1 [json_name = "feePoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"fee_pool_rate&#92;""];</code>
   * @return The bytes for feePoolRate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeePoolRateBytes() {
    java.lang.Object ref = feePoolRate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      feePoolRate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMUNITY_POOL_RATE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object communityPoolRate_ = "";
  /**
   * <code>string community_pool_rate = 2 [json_name = "communityPoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"community_pool_rate&#92;""];</code>
   * @return The communityPoolRate.
   */
  @java.lang.Override
  public java.lang.String getCommunityPoolRate() {
    java.lang.Object ref = communityPoolRate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      communityPoolRate_ = s;
      return s;
    }
  }
  /**
   * <code>string community_pool_rate = 2 [json_name = "communityPoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"community_pool_rate&#92;""];</code>
   * @return The bytes for communityPoolRate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommunityPoolRateBytes() {
    java.lang.Object ref = communityPoolRate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      communityPoolRate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESERVE_RATE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object reserveRate_ = "";
  /**
   * <code>string reserve_rate = 3 [json_name = "reserveRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"reserve_rate&#92;""];</code>
   * @return The reserveRate.
   */
  @java.lang.Override
  public java.lang.String getReserveRate() {
    java.lang.Object ref = reserveRate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reserveRate_ = s;
      return s;
    }
  }
  /**
   * <code>string reserve_rate = 3 [json_name = "reserveRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"reserve_rate&#92;""];</code>
   * @return The bytes for reserveRate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReserveRateBytes() {
    java.lang.Object ref = reserveRate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reserveRate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESERVE_ACCOUNT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object reserveAccount_ = "";
  /**
   * <code>string reserve_account = 4 [json_name = "reserveAccount"];</code>
   * @return The reserveAccount.
   */
  @java.lang.Override
  public java.lang.String getReserveAccount() {
    java.lang.Object ref = reserveAccount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reserveAccount_ = s;
      return s;
    }
  }
  /**
   * <code>string reserve_account = 4 [json_name = "reserveAccount"];</code>
   * @return The bytes for reserveAccount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReserveAccountBytes() {
    java.lang.Object ref = reserveAccount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reserveAccount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REWARD_DISTRIBUTE_ACCOUNT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rewardDistributeAccount_ = "";
  /**
   * <code>string reward_distribute_account = 5 [json_name = "rewardDistributeAccount"];</code>
   * @return The rewardDistributeAccount.
   */
  @java.lang.Override
  public java.lang.String getRewardDistributeAccount() {
    java.lang.Object ref = rewardDistributeAccount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardDistributeAccount_ = s;
      return s;
    }
  }
  /**
   * <code>string reward_distribute_account = 5 [json_name = "rewardDistributeAccount"];</code>
   * @return The bytes for rewardDistributeAccount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardDistributeAccountBytes() {
    java.lang.Object ref = rewardDistributeAccount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardDistributeAccount_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feePoolRate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, feePoolRate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(communityPoolRate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, communityPoolRate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reserveRate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, reserveRate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reserveAccount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, reserveAccount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardDistributeAccount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, rewardDistributeAccount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feePoolRate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, feePoolRate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(communityPoolRate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, communityPoolRate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reserveRate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, reserveRate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reserveAccount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, reserveAccount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardDistributeAccount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, rewardDistributeAccount_);
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
    if (!(obj instanceof com.xpla.reward.v1beta1.Params)) {
      return super.equals(obj);
    }
    com.xpla.reward.v1beta1.Params other = (com.xpla.reward.v1beta1.Params) obj;

    if (!getFeePoolRate()
        .equals(other.getFeePoolRate())) return false;
    if (!getCommunityPoolRate()
        .equals(other.getCommunityPoolRate())) return false;
    if (!getReserveRate()
        .equals(other.getReserveRate())) return false;
    if (!getReserveAccount()
        .equals(other.getReserveAccount())) return false;
    if (!getRewardDistributeAccount()
        .equals(other.getRewardDistributeAccount())) return false;
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
    hash = (37 * hash) + FEE_POOL_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getFeePoolRate().hashCode();
    hash = (37 * hash) + COMMUNITY_POOL_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getCommunityPoolRate().hashCode();
    hash = (37 * hash) + RESERVE_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getReserveRate().hashCode();
    hash = (37 * hash) + RESERVE_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getReserveAccount().hashCode();
    hash = (37 * hash) + REWARD_DISTRIBUTE_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getRewardDistributeAccount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xpla.reward.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xpla.reward.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xpla.reward.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xpla.reward.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xpla.reward.v1beta1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xpla.reward.v1beta1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xpla.reward.v1beta1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xpla.reward.v1beta1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.xpla.reward.v1beta1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.xpla.reward.v1beta1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xpla.reward.v1beta1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xpla.reward.v1beta1.Params parseFrom(
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
  public static Builder newBuilder(com.xpla.reward.v1beta1.Params prototype) {
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
   * Params defines the set of params for the reward module.
   * </pre>
   *
   * Protobuf type {@code xpla.reward.v1beta1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xpla.reward.v1beta1.Params)
      com.xpla.reward.v1beta1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xpla.reward.v1beta1.RewardProto.internal_static_xpla_reward_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xpla.reward.v1beta1.RewardProto.internal_static_xpla_reward_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xpla.reward.v1beta1.Params.class, com.xpla.reward.v1beta1.Params.Builder.class);
    }

    // Construct using com.xpla.reward.v1beta1.Params.newBuilder()
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
      feePoolRate_ = "";
      communityPoolRate_ = "";
      reserveRate_ = "";
      reserveAccount_ = "";
      rewardDistributeAccount_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xpla.reward.v1beta1.RewardProto.internal_static_xpla_reward_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    public com.xpla.reward.v1beta1.Params getDefaultInstanceForType() {
      return com.xpla.reward.v1beta1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.xpla.reward.v1beta1.Params build() {
      com.xpla.reward.v1beta1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xpla.reward.v1beta1.Params buildPartial() {
      com.xpla.reward.v1beta1.Params result = new com.xpla.reward.v1beta1.Params(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.xpla.reward.v1beta1.Params result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.feePoolRate_ = feePoolRate_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.communityPoolRate_ = communityPoolRate_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.reserveRate_ = reserveRate_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.reserveAccount_ = reserveAccount_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.rewardDistributeAccount_ = rewardDistributeAccount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xpla.reward.v1beta1.Params) {
        return mergeFrom((com.xpla.reward.v1beta1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xpla.reward.v1beta1.Params other) {
      if (other == com.xpla.reward.v1beta1.Params.getDefaultInstance()) return this;
      if (!other.getFeePoolRate().isEmpty()) {
        feePoolRate_ = other.feePoolRate_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCommunityPoolRate().isEmpty()) {
        communityPoolRate_ = other.communityPoolRate_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getReserveRate().isEmpty()) {
        reserveRate_ = other.reserveRate_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getReserveAccount().isEmpty()) {
        reserveAccount_ = other.reserveAccount_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getRewardDistributeAccount().isEmpty()) {
        rewardDistributeAccount_ = other.rewardDistributeAccount_;
        bitField0_ |= 0x00000010;
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
              feePoolRate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              communityPoolRate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              reserveRate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              reserveAccount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              rewardDistributeAccount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
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

    private java.lang.Object feePoolRate_ = "";
    /**
     * <code>string fee_pool_rate = 1 [json_name = "feePoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"fee_pool_rate&#92;""];</code>
     * @return The feePoolRate.
     */
    public java.lang.String getFeePoolRate() {
      java.lang.Object ref = feePoolRate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feePoolRate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fee_pool_rate = 1 [json_name = "feePoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"fee_pool_rate&#92;""];</code>
     * @return The bytes for feePoolRate.
     */
    public com.google.protobuf.ByteString
        getFeePoolRateBytes() {
      java.lang.Object ref = feePoolRate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feePoolRate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fee_pool_rate = 1 [json_name = "feePoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"fee_pool_rate&#92;""];</code>
     * @param value The feePoolRate to set.
     * @return This builder for chaining.
     */
    public Builder setFeePoolRate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      feePoolRate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string fee_pool_rate = 1 [json_name = "feePoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"fee_pool_rate&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeePoolRate() {
      feePoolRate_ = getDefaultInstance().getFeePoolRate();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string fee_pool_rate = 1 [json_name = "feePoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"fee_pool_rate&#92;""];</code>
     * @param value The bytes for feePoolRate to set.
     * @return This builder for chaining.
     */
    public Builder setFeePoolRateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      feePoolRate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object communityPoolRate_ = "";
    /**
     * <code>string community_pool_rate = 2 [json_name = "communityPoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"community_pool_rate&#92;""];</code>
     * @return The communityPoolRate.
     */
    public java.lang.String getCommunityPoolRate() {
      java.lang.Object ref = communityPoolRate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        communityPoolRate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string community_pool_rate = 2 [json_name = "communityPoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"community_pool_rate&#92;""];</code>
     * @return The bytes for communityPoolRate.
     */
    public com.google.protobuf.ByteString
        getCommunityPoolRateBytes() {
      java.lang.Object ref = communityPoolRate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        communityPoolRate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string community_pool_rate = 2 [json_name = "communityPoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"community_pool_rate&#92;""];</code>
     * @param value The communityPoolRate to set.
     * @return This builder for chaining.
     */
    public Builder setCommunityPoolRate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      communityPoolRate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string community_pool_rate = 2 [json_name = "communityPoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"community_pool_rate&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearCommunityPoolRate() {
      communityPoolRate_ = getDefaultInstance().getCommunityPoolRate();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string community_pool_rate = 2 [json_name = "communityPoolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"community_pool_rate&#92;""];</code>
     * @param value The bytes for communityPoolRate to set.
     * @return This builder for chaining.
     */
    public Builder setCommunityPoolRateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      communityPoolRate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object reserveRate_ = "";
    /**
     * <code>string reserve_rate = 3 [json_name = "reserveRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"reserve_rate&#92;""];</code>
     * @return The reserveRate.
     */
    public java.lang.String getReserveRate() {
      java.lang.Object ref = reserveRate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reserveRate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reserve_rate = 3 [json_name = "reserveRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"reserve_rate&#92;""];</code>
     * @return The bytes for reserveRate.
     */
    public com.google.protobuf.ByteString
        getReserveRateBytes() {
      java.lang.Object ref = reserveRate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reserveRate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reserve_rate = 3 [json_name = "reserveRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"reserve_rate&#92;""];</code>
     * @param value The reserveRate to set.
     * @return This builder for chaining.
     */
    public Builder setReserveRate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      reserveRate_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string reserve_rate = 3 [json_name = "reserveRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"reserve_rate&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearReserveRate() {
      reserveRate_ = getDefaultInstance().getReserveRate();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string reserve_rate = 3 [json_name = "reserveRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"reserve_rate&#92;""];</code>
     * @param value The bytes for reserveRate to set.
     * @return This builder for chaining.
     */
    public Builder setReserveRateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      reserveRate_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object reserveAccount_ = "";
    /**
     * <code>string reserve_account = 4 [json_name = "reserveAccount"];</code>
     * @return The reserveAccount.
     */
    public java.lang.String getReserveAccount() {
      java.lang.Object ref = reserveAccount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reserveAccount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reserve_account = 4 [json_name = "reserveAccount"];</code>
     * @return The bytes for reserveAccount.
     */
    public com.google.protobuf.ByteString
        getReserveAccountBytes() {
      java.lang.Object ref = reserveAccount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reserveAccount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reserve_account = 4 [json_name = "reserveAccount"];</code>
     * @param value The reserveAccount to set.
     * @return This builder for chaining.
     */
    public Builder setReserveAccount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      reserveAccount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string reserve_account = 4 [json_name = "reserveAccount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReserveAccount() {
      reserveAccount_ = getDefaultInstance().getReserveAccount();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string reserve_account = 4 [json_name = "reserveAccount"];</code>
     * @param value The bytes for reserveAccount to set.
     * @return This builder for chaining.
     */
    public Builder setReserveAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      reserveAccount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object rewardDistributeAccount_ = "";
    /**
     * <code>string reward_distribute_account = 5 [json_name = "rewardDistributeAccount"];</code>
     * @return The rewardDistributeAccount.
     */
    public java.lang.String getRewardDistributeAccount() {
      java.lang.Object ref = rewardDistributeAccount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardDistributeAccount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reward_distribute_account = 5 [json_name = "rewardDistributeAccount"];</code>
     * @return The bytes for rewardDistributeAccount.
     */
    public com.google.protobuf.ByteString
        getRewardDistributeAccountBytes() {
      java.lang.Object ref = rewardDistributeAccount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardDistributeAccount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reward_distribute_account = 5 [json_name = "rewardDistributeAccount"];</code>
     * @param value The rewardDistributeAccount to set.
     * @return This builder for chaining.
     */
    public Builder setRewardDistributeAccount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rewardDistributeAccount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string reward_distribute_account = 5 [json_name = "rewardDistributeAccount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardDistributeAccount() {
      rewardDistributeAccount_ = getDefaultInstance().getRewardDistributeAccount();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string reward_distribute_account = 5 [json_name = "rewardDistributeAccount"];</code>
     * @param value The bytes for rewardDistributeAccount to set.
     * @return This builder for chaining.
     */
    public Builder setRewardDistributeAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rewardDistributeAccount_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:xpla.reward.v1beta1.Params)
  }

  // @@protoc_insertion_point(class_scope:xpla.reward.v1beta1.Params)
  private static final com.xpla.reward.v1beta1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xpla.reward.v1beta1.Params();
  }

  public static com.xpla.reward.v1beta1.Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params>
      PARSER = new com.google.protobuf.AbstractParser<Params>() {
    @java.lang.Override
    public Params parsePartialFrom(
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

  public static com.google.protobuf.Parser<Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xpla.reward.v1beta1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

