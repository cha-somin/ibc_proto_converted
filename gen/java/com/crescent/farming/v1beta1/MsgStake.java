// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/farming/v1beta1/tx.proto

package com.crescent.farming.v1beta1;

/**
 * <pre>
 * MsgStake defines a SDK message for staking coins into the farming plan.
 * </pre>
 *
 * Protobuf type {@code crescent.farming.v1beta1.MsgStake}
 */
public final class MsgStake extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.farming.v1beta1.MsgStake)
    MsgStakeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgStake.newBuilder() to construct.
  private MsgStake(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgStake() {
    farmer_ = "";
    stakingCoins_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgStake();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.farming.v1beta1.TxProto.internal_static_crescent_farming_v1beta1_MsgStake_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.farming.v1beta1.TxProto.internal_static_crescent_farming_v1beta1_MsgStake_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.farming.v1beta1.MsgStake.class, com.crescent.farming.v1beta1.MsgStake.Builder.class);
  }

  public static final int FARMER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object farmer_ = "";
  /**
   * <pre>
   * farmer defines the bech32-encoded address of the farmer
   * </pre>
   *
   * <code>string farmer = 1 [json_name = "farmer"];</code>
   * @return The farmer.
   */
  @java.lang.Override
  public java.lang.String getFarmer() {
    java.lang.Object ref = farmer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      farmer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * farmer defines the bech32-encoded address of the farmer
   * </pre>
   *
   * <code>string farmer = 1 [json_name = "farmer"];</code>
   * @return The bytes for farmer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFarmerBytes() {
    java.lang.Object ref = farmer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      farmer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STAKING_COINS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> stakingCoins_;
  /**
   * <pre>
   * staking_coins specifies coins to stake
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getStakingCoinsList() {
    return stakingCoins_;
  }
  /**
   * <pre>
   * staking_coins specifies coins to stake
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getStakingCoinsOrBuilderList() {
    return stakingCoins_;
  }
  /**
   * <pre>
   * staking_coins specifies coins to stake
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public int getStakingCoinsCount() {
    return stakingCoins_.size();
  }
  /**
   * <pre>
   * staking_coins specifies coins to stake
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getStakingCoins(int index) {
    return stakingCoins_.get(index);
  }
  /**
   * <pre>
   * staking_coins specifies coins to stake
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getStakingCoinsOrBuilder(
      int index) {
    return stakingCoins_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(farmer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, farmer_);
    }
    for (int i = 0; i < stakingCoins_.size(); i++) {
      output.writeMessage(2, stakingCoins_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(farmer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, farmer_);
    }
    for (int i = 0; i < stakingCoins_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, stakingCoins_.get(i));
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
    if (!(obj instanceof com.crescent.farming.v1beta1.MsgStake)) {
      return super.equals(obj);
    }
    com.crescent.farming.v1beta1.MsgStake other = (com.crescent.farming.v1beta1.MsgStake) obj;

    if (!getFarmer()
        .equals(other.getFarmer())) return false;
    if (!getStakingCoinsList()
        .equals(other.getStakingCoinsList())) return false;
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
    hash = (37 * hash) + FARMER_FIELD_NUMBER;
    hash = (53 * hash) + getFarmer().hashCode();
    if (getStakingCoinsCount() > 0) {
      hash = (37 * hash) + STAKING_COINS_FIELD_NUMBER;
      hash = (53 * hash) + getStakingCoinsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.farming.v1beta1.MsgStake parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.farming.v1beta1.MsgStake parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.farming.v1beta1.MsgStake parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.farming.v1beta1.MsgStake parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.farming.v1beta1.MsgStake parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.farming.v1beta1.MsgStake parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.farming.v1beta1.MsgStake parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.farming.v1beta1.MsgStake parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.farming.v1beta1.MsgStake parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.farming.v1beta1.MsgStake parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.farming.v1beta1.MsgStake parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.farming.v1beta1.MsgStake parseFrom(
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
  public static Builder newBuilder(com.crescent.farming.v1beta1.MsgStake prototype) {
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
   * MsgStake defines a SDK message for staking coins into the farming plan.
   * </pre>
   *
   * Protobuf type {@code crescent.farming.v1beta1.MsgStake}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.farming.v1beta1.MsgStake)
      com.crescent.farming.v1beta1.MsgStakeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.farming.v1beta1.TxProto.internal_static_crescent_farming_v1beta1_MsgStake_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.farming.v1beta1.TxProto.internal_static_crescent_farming_v1beta1_MsgStake_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.farming.v1beta1.MsgStake.class, com.crescent.farming.v1beta1.MsgStake.Builder.class);
    }

    // Construct using com.crescent.farming.v1beta1.MsgStake.newBuilder()
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
      farmer_ = "";
      if (stakingCoinsBuilder_ == null) {
        stakingCoins_ = java.util.Collections.emptyList();
      } else {
        stakingCoins_ = null;
        stakingCoinsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.crescent.farming.v1beta1.TxProto.internal_static_crescent_farming_v1beta1_MsgStake_descriptor;
    }

    @java.lang.Override
    public com.crescent.farming.v1beta1.MsgStake getDefaultInstanceForType() {
      return com.crescent.farming.v1beta1.MsgStake.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.farming.v1beta1.MsgStake build() {
      com.crescent.farming.v1beta1.MsgStake result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.farming.v1beta1.MsgStake buildPartial() {
      com.crescent.farming.v1beta1.MsgStake result = new com.crescent.farming.v1beta1.MsgStake(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.crescent.farming.v1beta1.MsgStake result) {
      if (stakingCoinsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          stakingCoins_ = java.util.Collections.unmodifiableList(stakingCoins_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.stakingCoins_ = stakingCoins_;
      } else {
        result.stakingCoins_ = stakingCoinsBuilder_.build();
      }
    }

    private void buildPartial0(com.crescent.farming.v1beta1.MsgStake result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.farmer_ = farmer_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.farming.v1beta1.MsgStake) {
        return mergeFrom((com.crescent.farming.v1beta1.MsgStake)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.farming.v1beta1.MsgStake other) {
      if (other == com.crescent.farming.v1beta1.MsgStake.getDefaultInstance()) return this;
      if (!other.getFarmer().isEmpty()) {
        farmer_ = other.farmer_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (stakingCoinsBuilder_ == null) {
        if (!other.stakingCoins_.isEmpty()) {
          if (stakingCoins_.isEmpty()) {
            stakingCoins_ = other.stakingCoins_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureStakingCoinsIsMutable();
            stakingCoins_.addAll(other.stakingCoins_);
          }
          onChanged();
        }
      } else {
        if (!other.stakingCoins_.isEmpty()) {
          if (stakingCoinsBuilder_.isEmpty()) {
            stakingCoinsBuilder_.dispose();
            stakingCoinsBuilder_ = null;
            stakingCoins_ = other.stakingCoins_;
            bitField0_ = (bitField0_ & ~0x00000002);
            stakingCoinsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStakingCoinsFieldBuilder() : null;
          } else {
            stakingCoinsBuilder_.addAllMessages(other.stakingCoins_);
          }
        }
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
              farmer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.cosmos.base.v1beta1.Coin m =
                  input.readMessage(
                      com.cosmos.base.v1beta1.Coin.parser(),
                      extensionRegistry);
              if (stakingCoinsBuilder_ == null) {
                ensureStakingCoinsIsMutable();
                stakingCoins_.add(m);
              } else {
                stakingCoinsBuilder_.addMessage(m);
              }
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

    private java.lang.Object farmer_ = "";
    /**
     * <pre>
     * farmer defines the bech32-encoded address of the farmer
     * </pre>
     *
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @return The farmer.
     */
    public java.lang.String getFarmer() {
      java.lang.Object ref = farmer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        farmer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * farmer defines the bech32-encoded address of the farmer
     * </pre>
     *
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @return The bytes for farmer.
     */
    public com.google.protobuf.ByteString
        getFarmerBytes() {
      java.lang.Object ref = farmer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        farmer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * farmer defines the bech32-encoded address of the farmer
     * </pre>
     *
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @param value The farmer to set.
     * @return This builder for chaining.
     */
    public Builder setFarmer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      farmer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * farmer defines the bech32-encoded address of the farmer
     * </pre>
     *
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFarmer() {
      farmer_ = getDefaultInstance().getFarmer();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * farmer defines the bech32-encoded address of the farmer
     * </pre>
     *
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @param value The bytes for farmer to set.
     * @return This builder for chaining.
     */
    public Builder setFarmerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      farmer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.cosmos.base.v1beta1.Coin> stakingCoins_ =
      java.util.Collections.emptyList();
    private void ensureStakingCoinsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        stakingCoins_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(stakingCoins_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> stakingCoinsBuilder_;

    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getStakingCoinsList() {
      if (stakingCoinsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stakingCoins_);
      } else {
        return stakingCoinsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public int getStakingCoinsCount() {
      if (stakingCoinsBuilder_ == null) {
        return stakingCoins_.size();
      } else {
        return stakingCoinsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin getStakingCoins(int index) {
      if (stakingCoinsBuilder_ == null) {
        return stakingCoins_.get(index);
      } else {
        return stakingCoinsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setStakingCoins(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (stakingCoinsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStakingCoinsIsMutable();
        stakingCoins_.set(index, value);
        onChanged();
      } else {
        stakingCoinsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setStakingCoins(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (stakingCoinsBuilder_ == null) {
        ensureStakingCoinsIsMutable();
        stakingCoins_.set(index, builderForValue.build());
        onChanged();
      } else {
        stakingCoinsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addStakingCoins(com.cosmos.base.v1beta1.Coin value) {
      if (stakingCoinsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStakingCoinsIsMutable();
        stakingCoins_.add(value);
        onChanged();
      } else {
        stakingCoinsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addStakingCoins(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (stakingCoinsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStakingCoinsIsMutable();
        stakingCoins_.add(index, value);
        onChanged();
      } else {
        stakingCoinsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addStakingCoins(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (stakingCoinsBuilder_ == null) {
        ensureStakingCoinsIsMutable();
        stakingCoins_.add(builderForValue.build());
        onChanged();
      } else {
        stakingCoinsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addStakingCoins(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (stakingCoinsBuilder_ == null) {
        ensureStakingCoinsIsMutable();
        stakingCoins_.add(index, builderForValue.build());
        onChanged();
      } else {
        stakingCoinsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAllStakingCoins(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (stakingCoinsBuilder_ == null) {
        ensureStakingCoinsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stakingCoins_);
        onChanged();
      } else {
        stakingCoinsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearStakingCoins() {
      if (stakingCoinsBuilder_ == null) {
        stakingCoins_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        stakingCoinsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder removeStakingCoins(int index) {
      if (stakingCoinsBuilder_ == null) {
        ensureStakingCoinsIsMutable();
        stakingCoins_.remove(index);
        onChanged();
      } else {
        stakingCoinsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getStakingCoinsBuilder(
        int index) {
      return getStakingCoinsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getStakingCoinsOrBuilder(
        int index) {
      if (stakingCoinsBuilder_ == null) {
        return stakingCoins_.get(index);  } else {
        return stakingCoinsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getStakingCoinsOrBuilderList() {
      if (stakingCoinsBuilder_ != null) {
        return stakingCoinsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stakingCoins_);
      }
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addStakingCoinsBuilder() {
      return getStakingCoinsFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addStakingCoinsBuilder(
        int index) {
      return getStakingCoinsFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <pre>
     * staking_coins specifies coins to stake
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin staking_coins = 2 [json_name = "stakingCoins", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"staking_coins&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getStakingCoinsBuilderList() {
      return getStakingCoinsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getStakingCoinsFieldBuilder() {
      if (stakingCoinsBuilder_ == null) {
        stakingCoinsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                stakingCoins_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        stakingCoins_ = null;
      }
      return stakingCoinsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:crescent.farming.v1beta1.MsgStake)
  }

  // @@protoc_insertion_point(class_scope:crescent.farming.v1beta1.MsgStake)
  private static final com.crescent.farming.v1beta1.MsgStake DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.farming.v1beta1.MsgStake();
  }

  public static com.crescent.farming.v1beta1.MsgStake getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgStake>
      PARSER = new com.google.protobuf.AbstractParser<MsgStake>() {
    @java.lang.Override
    public MsgStake parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgStake> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgStake> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.farming.v1beta1.MsgStake getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

