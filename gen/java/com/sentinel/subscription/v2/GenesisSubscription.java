// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/subscription/v2/genesis.proto

package com.sentinel.subscription.v2;

/**
 * Protobuf type {@code sentinel.subscription.v2.GenesisSubscription}
 */
public final class GenesisSubscription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sentinel.subscription.v2.GenesisSubscription)
    GenesisSubscriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisSubscription.newBuilder() to construct.
  private GenesisSubscription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisSubscription() {
    allocations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisSubscription();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sentinel.subscription.v2.GenesisProto.internal_static_sentinel_subscription_v2_GenesisSubscription_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sentinel.subscription.v2.GenesisProto.internal_static_sentinel_subscription_v2_GenesisSubscription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sentinel.subscription.v2.GenesisSubscription.class, com.sentinel.subscription.v2.GenesisSubscription.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  private com.google.protobuf.Any subscription_;
  /**
   * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
   * @return Whether the subscription field is set.
   */
  @java.lang.Override
  public boolean hasSubscription() {
    return subscription_ != null;
  }
  /**
   * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
   * @return The subscription.
   */
  @java.lang.Override
  public com.google.protobuf.Any getSubscription() {
    return subscription_ == null ? com.google.protobuf.Any.getDefaultInstance() : subscription_;
  }
  /**
   * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getSubscriptionOrBuilder() {
    return subscription_ == null ? com.google.protobuf.Any.getDefaultInstance() : subscription_;
  }

  public static final int ALLOCATIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.sentinel.subscription.v2.Allocation> allocations_;
  /**
   * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.sentinel.subscription.v2.Allocation> getAllocationsList() {
    return allocations_;
  }
  /**
   * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sentinel.subscription.v2.AllocationOrBuilder> 
      getAllocationsOrBuilderList() {
    return allocations_;
  }
  /**
   * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getAllocationsCount() {
    return allocations_.size();
  }
  /**
   * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.sentinel.subscription.v2.Allocation getAllocations(int index) {
    return allocations_.get(index);
  }
  /**
   * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.sentinel.subscription.v2.AllocationOrBuilder getAllocationsOrBuilder(
      int index) {
    return allocations_.get(index);
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
    if (subscription_ != null) {
      output.writeMessage(1, getSubscription());
    }
    for (int i = 0; i < allocations_.size(); i++) {
      output.writeMessage(2, allocations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subscription_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSubscription());
    }
    for (int i = 0; i < allocations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, allocations_.get(i));
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
    if (!(obj instanceof com.sentinel.subscription.v2.GenesisSubscription)) {
      return super.equals(obj);
    }
    com.sentinel.subscription.v2.GenesisSubscription other = (com.sentinel.subscription.v2.GenesisSubscription) obj;

    if (hasSubscription() != other.hasSubscription()) return false;
    if (hasSubscription()) {
      if (!getSubscription()
          .equals(other.getSubscription())) return false;
    }
    if (!getAllocationsList()
        .equals(other.getAllocationsList())) return false;
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
    if (hasSubscription()) {
      hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getSubscription().hashCode();
    }
    if (getAllocationsCount() > 0) {
      hash = (37 * hash) + ALLOCATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAllocationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sentinel.subscription.v2.GenesisSubscription parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.subscription.v2.GenesisSubscription parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.subscription.v2.GenesisSubscription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.subscription.v2.GenesisSubscription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.subscription.v2.GenesisSubscription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.subscription.v2.GenesisSubscription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.subscription.v2.GenesisSubscription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.subscription.v2.GenesisSubscription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sentinel.subscription.v2.GenesisSubscription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sentinel.subscription.v2.GenesisSubscription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sentinel.subscription.v2.GenesisSubscription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.subscription.v2.GenesisSubscription parseFrom(
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
  public static Builder newBuilder(com.sentinel.subscription.v2.GenesisSubscription prototype) {
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
   * Protobuf type {@code sentinel.subscription.v2.GenesisSubscription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sentinel.subscription.v2.GenesisSubscription)
      com.sentinel.subscription.v2.GenesisSubscriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.subscription.v2.GenesisProto.internal_static_sentinel_subscription_v2_GenesisSubscription_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.subscription.v2.GenesisProto.internal_static_sentinel_subscription_v2_GenesisSubscription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.subscription.v2.GenesisSubscription.class, com.sentinel.subscription.v2.GenesisSubscription.Builder.class);
    }

    // Construct using com.sentinel.subscription.v2.GenesisSubscription.newBuilder()
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
      subscription_ = null;
      if (subscriptionBuilder_ != null) {
        subscriptionBuilder_.dispose();
        subscriptionBuilder_ = null;
      }
      if (allocationsBuilder_ == null) {
        allocations_ = java.util.Collections.emptyList();
      } else {
        allocations_ = null;
        allocationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sentinel.subscription.v2.GenesisProto.internal_static_sentinel_subscription_v2_GenesisSubscription_descriptor;
    }

    @java.lang.Override
    public com.sentinel.subscription.v2.GenesisSubscription getDefaultInstanceForType() {
      return com.sentinel.subscription.v2.GenesisSubscription.getDefaultInstance();
    }

    @java.lang.Override
    public com.sentinel.subscription.v2.GenesisSubscription build() {
      com.sentinel.subscription.v2.GenesisSubscription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sentinel.subscription.v2.GenesisSubscription buildPartial() {
      com.sentinel.subscription.v2.GenesisSubscription result = new com.sentinel.subscription.v2.GenesisSubscription(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.sentinel.subscription.v2.GenesisSubscription result) {
      if (allocationsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          allocations_ = java.util.Collections.unmodifiableList(allocations_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.allocations_ = allocations_;
      } else {
        result.allocations_ = allocationsBuilder_.build();
      }
    }

    private void buildPartial0(com.sentinel.subscription.v2.GenesisSubscription result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscription_ = subscriptionBuilder_ == null
            ? subscription_
            : subscriptionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sentinel.subscription.v2.GenesisSubscription) {
        return mergeFrom((com.sentinel.subscription.v2.GenesisSubscription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sentinel.subscription.v2.GenesisSubscription other) {
      if (other == com.sentinel.subscription.v2.GenesisSubscription.getDefaultInstance()) return this;
      if (other.hasSubscription()) {
        mergeSubscription(other.getSubscription());
      }
      if (allocationsBuilder_ == null) {
        if (!other.allocations_.isEmpty()) {
          if (allocations_.isEmpty()) {
            allocations_ = other.allocations_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAllocationsIsMutable();
            allocations_.addAll(other.allocations_);
          }
          onChanged();
        }
      } else {
        if (!other.allocations_.isEmpty()) {
          if (allocationsBuilder_.isEmpty()) {
            allocationsBuilder_.dispose();
            allocationsBuilder_ = null;
            allocations_ = other.allocations_;
            bitField0_ = (bitField0_ & ~0x00000002);
            allocationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAllocationsFieldBuilder() : null;
          } else {
            allocationsBuilder_.addAllMessages(other.allocations_);
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
              input.readMessage(
                  getSubscriptionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.sentinel.subscription.v2.Allocation m =
                  input.readMessage(
                      com.sentinel.subscription.v2.Allocation.parser(),
                      extensionRegistry);
              if (allocationsBuilder_ == null) {
                ensureAllocationsIsMutable();
                allocations_.add(m);
              } else {
                allocationsBuilder_.addMessage(m);
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

    private com.google.protobuf.Any subscription_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> subscriptionBuilder_;
    /**
     * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
     * @return Whether the subscription field is set.
     */
    public boolean hasSubscription() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
     * @return The subscription.
     */
    public com.google.protobuf.Any getSubscription() {
      if (subscriptionBuilder_ == null) {
        return subscription_ == null ? com.google.protobuf.Any.getDefaultInstance() : subscription_;
      } else {
        return subscriptionBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
     */
    public Builder setSubscription(com.google.protobuf.Any value) {
      if (subscriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subscription_ = value;
      } else {
        subscriptionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
     */
    public Builder setSubscription(
        com.google.protobuf.Any.Builder builderForValue) {
      if (subscriptionBuilder_ == null) {
        subscription_ = builderForValue.build();
      } else {
        subscriptionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
     */
    public Builder mergeSubscription(com.google.protobuf.Any value) {
      if (subscriptionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          subscription_ != null &&
          subscription_ != com.google.protobuf.Any.getDefaultInstance()) {
          getSubscriptionBuilder().mergeFrom(value);
        } else {
          subscription_ = value;
        }
      } else {
        subscriptionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
     */
    public Builder clearSubscription() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subscription_ = null;
      if (subscriptionBuilder_ != null) {
        subscriptionBuilder_.dispose();
        subscriptionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
     */
    public com.google.protobuf.Any.Builder getSubscriptionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSubscriptionFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getSubscriptionOrBuilder() {
      if (subscriptionBuilder_ != null) {
        return subscriptionBuilder_.getMessageOrBuilder();
      } else {
        return subscription_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : subscription_;
      }
    }
    /**
     * <code>.google.protobuf.Any subscription = 1 [json_name = "subscription"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getSubscriptionFieldBuilder() {
      if (subscriptionBuilder_ == null) {
        subscriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getSubscription(),
                getParentForChildren(),
                isClean());
        subscription_ = null;
      }
      return subscriptionBuilder_;
    }

    private java.util.List<com.sentinel.subscription.v2.Allocation> allocations_ =
      java.util.Collections.emptyList();
    private void ensureAllocationsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        allocations_ = new java.util.ArrayList<com.sentinel.subscription.v2.Allocation>(allocations_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sentinel.subscription.v2.Allocation, com.sentinel.subscription.v2.Allocation.Builder, com.sentinel.subscription.v2.AllocationOrBuilder> allocationsBuilder_;

    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.sentinel.subscription.v2.Allocation> getAllocationsList() {
      if (allocationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(allocations_);
      } else {
        return allocationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public int getAllocationsCount() {
      if (allocationsBuilder_ == null) {
        return allocations_.size();
      } else {
        return allocationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.subscription.v2.Allocation getAllocations(int index) {
      if (allocationsBuilder_ == null) {
        return allocations_.get(index);
      } else {
        return allocationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAllocations(
        int index, com.sentinel.subscription.v2.Allocation value) {
      if (allocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllocationsIsMutable();
        allocations_.set(index, value);
        onChanged();
      } else {
        allocationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAllocations(
        int index, com.sentinel.subscription.v2.Allocation.Builder builderForValue) {
      if (allocationsBuilder_ == null) {
        ensureAllocationsIsMutable();
        allocations_.set(index, builderForValue.build());
        onChanged();
      } else {
        allocationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllocations(com.sentinel.subscription.v2.Allocation value) {
      if (allocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllocationsIsMutable();
        allocations_.add(value);
        onChanged();
      } else {
        allocationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllocations(
        int index, com.sentinel.subscription.v2.Allocation value) {
      if (allocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllocationsIsMutable();
        allocations_.add(index, value);
        onChanged();
      } else {
        allocationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllocations(
        com.sentinel.subscription.v2.Allocation.Builder builderForValue) {
      if (allocationsBuilder_ == null) {
        ensureAllocationsIsMutable();
        allocations_.add(builderForValue.build());
        onChanged();
      } else {
        allocationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllocations(
        int index, com.sentinel.subscription.v2.Allocation.Builder builderForValue) {
      if (allocationsBuilder_ == null) {
        ensureAllocationsIsMutable();
        allocations_.add(index, builderForValue.build());
        onChanged();
      } else {
        allocationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllAllocations(
        java.lang.Iterable<? extends com.sentinel.subscription.v2.Allocation> values) {
      if (allocationsBuilder_ == null) {
        ensureAllocationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, allocations_);
        onChanged();
      } else {
        allocationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearAllocations() {
      if (allocationsBuilder_ == null) {
        allocations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        allocationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeAllocations(int index) {
      if (allocationsBuilder_ == null) {
        ensureAllocationsIsMutable();
        allocations_.remove(index);
        onChanged();
      } else {
        allocationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.subscription.v2.Allocation.Builder getAllocationsBuilder(
        int index) {
      return getAllocationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.subscription.v2.AllocationOrBuilder getAllocationsOrBuilder(
        int index) {
      if (allocationsBuilder_ == null) {
        return allocations_.get(index);  } else {
        return allocationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.sentinel.subscription.v2.AllocationOrBuilder> 
         getAllocationsOrBuilderList() {
      if (allocationsBuilder_ != null) {
        return allocationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(allocations_);
      }
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.subscription.v2.Allocation.Builder addAllocationsBuilder() {
      return getAllocationsFieldBuilder().addBuilder(
          com.sentinel.subscription.v2.Allocation.getDefaultInstance());
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.subscription.v2.Allocation.Builder addAllocationsBuilder(
        int index) {
      return getAllocationsFieldBuilder().addBuilder(
          index, com.sentinel.subscription.v2.Allocation.getDefaultInstance());
    }
    /**
     * <code>repeated .sentinel.subscription.v2.Allocation allocations = 2 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.sentinel.subscription.v2.Allocation.Builder> 
         getAllocationsBuilderList() {
      return getAllocationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sentinel.subscription.v2.Allocation, com.sentinel.subscription.v2.Allocation.Builder, com.sentinel.subscription.v2.AllocationOrBuilder> 
        getAllocationsFieldBuilder() {
      if (allocationsBuilder_ == null) {
        allocationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sentinel.subscription.v2.Allocation, com.sentinel.subscription.v2.Allocation.Builder, com.sentinel.subscription.v2.AllocationOrBuilder>(
                allocations_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        allocations_ = null;
      }
      return allocationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sentinel.subscription.v2.GenesisSubscription)
  }

  // @@protoc_insertion_point(class_scope:sentinel.subscription.v2.GenesisSubscription)
  private static final com.sentinel.subscription.v2.GenesisSubscription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sentinel.subscription.v2.GenesisSubscription();
  }

  public static com.sentinel.subscription.v2.GenesisSubscription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisSubscription>
      PARSER = new com.google.protobuf.AbstractParser<GenesisSubscription>() {
    @java.lang.Override
    public GenesisSubscription parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisSubscription> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisSubscription> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sentinel.subscription.v2.GenesisSubscription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

