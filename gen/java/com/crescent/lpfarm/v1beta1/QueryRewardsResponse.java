// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/lpfarm/v1beta1/query.proto

package com.crescent.lpfarm.v1beta1;

/**
 * Protobuf type {@code crescent.lpfarm.v1beta1.QueryRewardsResponse}
 */
public final class QueryRewardsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.lpfarm.v1beta1.QueryRewardsResponse)
    QueryRewardsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRewardsResponse.newBuilder() to construct.
  private QueryRewardsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRewardsResponse() {
    rewards_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRewardsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.lpfarm.v1beta1.QueryProto.internal_static_crescent_lpfarm_v1beta1_QueryRewardsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.lpfarm.v1beta1.QueryProto.internal_static_crescent_lpfarm_v1beta1_QueryRewardsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.lpfarm.v1beta1.QueryRewardsResponse.class, com.crescent.lpfarm.v1beta1.QueryRewardsResponse.Builder.class);
  }

  public static final int REWARDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.DecCoin> rewards_;
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.DecCoin> getRewardsList() {
    return rewards_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.DecCoinOrBuilder> 
      getRewardsOrBuilderList() {
    return rewards_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public int getRewardsCount() {
    return rewards_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.DecCoin getRewards(int index) {
    return rewards_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.DecCoinOrBuilder getRewardsOrBuilder(
      int index) {
    return rewards_.get(index);
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
    for (int i = 0; i < rewards_.size(); i++) {
      output.writeMessage(1, rewards_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rewards_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rewards_.get(i));
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
    if (!(obj instanceof com.crescent.lpfarm.v1beta1.QueryRewardsResponse)) {
      return super.equals(obj);
    }
    com.crescent.lpfarm.v1beta1.QueryRewardsResponse other = (com.crescent.lpfarm.v1beta1.QueryRewardsResponse) obj;

    if (!getRewardsList()
        .equals(other.getRewardsList())) return false;
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
    if (getRewardsCount() > 0) {
      hash = (37 * hash) + REWARDS_FIELD_NUMBER;
      hash = (53 * hash) + getRewardsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse parseFrom(
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
  public static Builder newBuilder(com.crescent.lpfarm.v1beta1.QueryRewardsResponse prototype) {
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
   * Protobuf type {@code crescent.lpfarm.v1beta1.QueryRewardsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.lpfarm.v1beta1.QueryRewardsResponse)
      com.crescent.lpfarm.v1beta1.QueryRewardsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.lpfarm.v1beta1.QueryProto.internal_static_crescent_lpfarm_v1beta1_QueryRewardsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.lpfarm.v1beta1.QueryProto.internal_static_crescent_lpfarm_v1beta1_QueryRewardsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.lpfarm.v1beta1.QueryRewardsResponse.class, com.crescent.lpfarm.v1beta1.QueryRewardsResponse.Builder.class);
    }

    // Construct using com.crescent.lpfarm.v1beta1.QueryRewardsResponse.newBuilder()
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
      if (rewardsBuilder_ == null) {
        rewards_ = java.util.Collections.emptyList();
      } else {
        rewards_ = null;
        rewardsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.crescent.lpfarm.v1beta1.QueryProto.internal_static_crescent_lpfarm_v1beta1_QueryRewardsResponse_descriptor;
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.QueryRewardsResponse getDefaultInstanceForType() {
      return com.crescent.lpfarm.v1beta1.QueryRewardsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.QueryRewardsResponse build() {
      com.crescent.lpfarm.v1beta1.QueryRewardsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.QueryRewardsResponse buildPartial() {
      com.crescent.lpfarm.v1beta1.QueryRewardsResponse result = new com.crescent.lpfarm.v1beta1.QueryRewardsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.crescent.lpfarm.v1beta1.QueryRewardsResponse result) {
      if (rewardsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rewards_ = java.util.Collections.unmodifiableList(rewards_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rewards_ = rewards_;
      } else {
        result.rewards_ = rewardsBuilder_.build();
      }
    }

    private void buildPartial0(com.crescent.lpfarm.v1beta1.QueryRewardsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.lpfarm.v1beta1.QueryRewardsResponse) {
        return mergeFrom((com.crescent.lpfarm.v1beta1.QueryRewardsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.lpfarm.v1beta1.QueryRewardsResponse other) {
      if (other == com.crescent.lpfarm.v1beta1.QueryRewardsResponse.getDefaultInstance()) return this;
      if (rewardsBuilder_ == null) {
        if (!other.rewards_.isEmpty()) {
          if (rewards_.isEmpty()) {
            rewards_ = other.rewards_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRewardsIsMutable();
            rewards_.addAll(other.rewards_);
          }
          onChanged();
        }
      } else {
        if (!other.rewards_.isEmpty()) {
          if (rewardsBuilder_.isEmpty()) {
            rewardsBuilder_.dispose();
            rewardsBuilder_ = null;
            rewards_ = other.rewards_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rewardsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRewardsFieldBuilder() : null;
          } else {
            rewardsBuilder_.addAllMessages(other.rewards_);
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
              com.cosmos.base.v1beta1.DecCoin m =
                  input.readMessage(
                      com.cosmos.base.v1beta1.DecCoin.parser(),
                      extensionRegistry);
              if (rewardsBuilder_ == null) {
                ensureRewardsIsMutable();
                rewards_.add(m);
              } else {
                rewardsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.cosmos.base.v1beta1.DecCoin> rewards_ =
      java.util.Collections.emptyList();
    private void ensureRewardsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rewards_ = new java.util.ArrayList<com.cosmos.base.v1beta1.DecCoin>(rewards_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.DecCoin, com.cosmos.base.v1beta1.DecCoin.Builder, com.cosmos.base.v1beta1.DecCoinOrBuilder> rewardsBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.DecCoin> getRewardsList() {
      if (rewardsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rewards_);
      } else {
        return rewardsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public int getRewardsCount() {
      if (rewardsBuilder_ == null) {
        return rewards_.size();
      } else {
        return rewardsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoin getRewards(int index) {
      if (rewardsBuilder_ == null) {
        return rewards_.get(index);
      } else {
        return rewardsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder setRewards(
        int index, com.cosmos.base.v1beta1.DecCoin value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardsIsMutable();
        rewards_.set(index, value);
        onChanged();
      } else {
        rewardsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder setRewards(
        int index, com.cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.set(index, builderForValue.build());
        onChanged();
      } else {
        rewardsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addRewards(com.cosmos.base.v1beta1.DecCoin value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardsIsMutable();
        rewards_.add(value);
        onChanged();
      } else {
        rewardsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addRewards(
        int index, com.cosmos.base.v1beta1.DecCoin value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardsIsMutable();
        rewards_.add(index, value);
        onChanged();
      } else {
        rewardsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addRewards(
        com.cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.add(builderForValue.build());
        onChanged();
      } else {
        rewardsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addRewards(
        int index, com.cosmos.base.v1beta1.DecCoin.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.add(index, builderForValue.build());
        onChanged();
      } else {
        rewardsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder addAllRewards(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.DecCoin> values) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rewards_);
        onChanged();
      } else {
        rewardsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder clearRewards() {
      if (rewardsBuilder_ == null) {
        rewards_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rewardsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public Builder removeRewards(int index) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.remove(index);
        onChanged();
      } else {
        rewardsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoin.Builder getRewardsBuilder(
        int index) {
      return getRewardsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoinOrBuilder getRewardsOrBuilder(
        int index) {
      if (rewardsBuilder_ == null) {
        return rewards_.get(index);  } else {
        return rewardsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.DecCoinOrBuilder> 
         getRewardsOrBuilderList() {
      if (rewardsBuilder_ != null) {
        return rewardsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rewards_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoin.Builder addRewardsBuilder() {
      return getRewardsFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.DecCoin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public com.cosmos.base.v1beta1.DecCoin.Builder addRewardsBuilder(
        int index) {
      return getRewardsFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.DecCoin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.DecCoin.Builder> 
         getRewardsBuilderList() {
      return getRewardsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.DecCoin, com.cosmos.base.v1beta1.DecCoin.Builder, com.cosmos.base.v1beta1.DecCoinOrBuilder> 
        getRewardsFieldBuilder() {
      if (rewardsBuilder_ == null) {
        rewardsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.DecCoin, com.cosmos.base.v1beta1.DecCoin.Builder, com.cosmos.base.v1beta1.DecCoinOrBuilder>(
                rewards_,
                ((bitField0_ & 0x00000001) != 0),
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


    // @@protoc_insertion_point(builder_scope:crescent.lpfarm.v1beta1.QueryRewardsResponse)
  }

  // @@protoc_insertion_point(class_scope:crescent.lpfarm.v1beta1.QueryRewardsResponse)
  private static final com.crescent.lpfarm.v1beta1.QueryRewardsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.lpfarm.v1beta1.QueryRewardsResponse();
  }

  public static com.crescent.lpfarm.v1beta1.QueryRewardsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRewardsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryRewardsResponse>() {
    @java.lang.Override
    public QueryRewardsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryRewardsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRewardsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.lpfarm.v1beta1.QueryRewardsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

