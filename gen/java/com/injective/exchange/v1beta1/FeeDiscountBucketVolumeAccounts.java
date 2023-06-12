// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/genesis.proto

package com.injective.exchange.v1beta1;

/**
 * Protobuf type {@code injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts}
 */
public final class FeeDiscountBucketVolumeAccounts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts)
    FeeDiscountBucketVolumeAccountsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeeDiscountBucketVolumeAccounts.newBuilder() to construct.
  private FeeDiscountBucketVolumeAccounts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeeDiscountBucketVolumeAccounts() {
    accountVolume_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeeDiscountBucketVolumeAccounts();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.GenesisProto.internal_static_injective_exchange_v1beta1_FeeDiscountBucketVolumeAccounts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.GenesisProto.internal_static_injective_exchange_v1beta1_FeeDiscountBucketVolumeAccounts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.class, com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.Builder.class);
  }

  public static final int BUCKET_START_TIMESTAMP_FIELD_NUMBER = 1;
  private long bucketStartTimestamp_ = 0L;
  /**
   * <code>int64 bucket_start_timestamp = 1 [json_name = "bucketStartTimestamp"];</code>
   * @return The bucketStartTimestamp.
   */
  @java.lang.Override
  public long getBucketStartTimestamp() {
    return bucketStartTimestamp_;
  }

  public static final int ACCOUNT_VOLUME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.injective.exchange.v1beta1.AccountVolume> accountVolume_;
  /**
   * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
   */
  @java.lang.Override
  public java.util.List<com.injective.exchange.v1beta1.AccountVolume> getAccountVolumeList() {
    return accountVolume_;
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.injective.exchange.v1beta1.AccountVolumeOrBuilder> 
      getAccountVolumeOrBuilderList() {
    return accountVolume_;
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
   */
  @java.lang.Override
  public int getAccountVolumeCount() {
    return accountVolume_.size();
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.AccountVolume getAccountVolume(int index) {
    return accountVolume_.get(index);
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.AccountVolumeOrBuilder getAccountVolumeOrBuilder(
      int index) {
    return accountVolume_.get(index);
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
    if (bucketStartTimestamp_ != 0L) {
      output.writeInt64(1, bucketStartTimestamp_);
    }
    for (int i = 0; i < accountVolume_.size(); i++) {
      output.writeMessage(2, accountVolume_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bucketStartTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, bucketStartTimestamp_);
    }
    for (int i = 0; i < accountVolume_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, accountVolume_.get(i));
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
    if (!(obj instanceof com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts other = (com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts) obj;

    if (getBucketStartTimestamp()
        != other.getBucketStartTimestamp()) return false;
    if (!getAccountVolumeList()
        .equals(other.getAccountVolumeList())) return false;
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
    hash = (37 * hash) + BUCKET_START_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBucketStartTimestamp());
    if (getAccountVolumeCount() > 0) {
      hash = (37 * hash) + ACCOUNT_VOLUME_FIELD_NUMBER;
      hash = (53 * hash) + getAccountVolumeList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts prototype) {
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
   * Protobuf type {@code injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts)
      com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccountsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.GenesisProto.internal_static_injective_exchange_v1beta1_FeeDiscountBucketVolumeAccounts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.GenesisProto.internal_static_injective_exchange_v1beta1_FeeDiscountBucketVolumeAccounts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.class, com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.newBuilder()
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
      bucketStartTimestamp_ = 0L;
      if (accountVolumeBuilder_ == null) {
        accountVolume_ = java.util.Collections.emptyList();
      } else {
        accountVolume_ = null;
        accountVolumeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.GenesisProto.internal_static_injective_exchange_v1beta1_FeeDiscountBucketVolumeAccounts_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts build() {
      com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts buildPartial() {
      com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts result = new com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts result) {
      if (accountVolumeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          accountVolume_ = java.util.Collections.unmodifiableList(accountVolume_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.accountVolume_ = accountVolume_;
      } else {
        result.accountVolume_ = accountVolumeBuilder_.build();
      }
    }

    private void buildPartial0(com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bucketStartTimestamp_ = bucketStartTimestamp_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts) {
        return mergeFrom((com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts other) {
      if (other == com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts.getDefaultInstance()) return this;
      if (other.getBucketStartTimestamp() != 0L) {
        setBucketStartTimestamp(other.getBucketStartTimestamp());
      }
      if (accountVolumeBuilder_ == null) {
        if (!other.accountVolume_.isEmpty()) {
          if (accountVolume_.isEmpty()) {
            accountVolume_ = other.accountVolume_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAccountVolumeIsMutable();
            accountVolume_.addAll(other.accountVolume_);
          }
          onChanged();
        }
      } else {
        if (!other.accountVolume_.isEmpty()) {
          if (accountVolumeBuilder_.isEmpty()) {
            accountVolumeBuilder_.dispose();
            accountVolumeBuilder_ = null;
            accountVolume_ = other.accountVolume_;
            bitField0_ = (bitField0_ & ~0x00000002);
            accountVolumeBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccountVolumeFieldBuilder() : null;
          } else {
            accountVolumeBuilder_.addAllMessages(other.accountVolume_);
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
            case 8: {
              bucketStartTimestamp_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.injective.exchange.v1beta1.AccountVolume m =
                  input.readMessage(
                      com.injective.exchange.v1beta1.AccountVolume.parser(),
                      extensionRegistry);
              if (accountVolumeBuilder_ == null) {
                ensureAccountVolumeIsMutable();
                accountVolume_.add(m);
              } else {
                accountVolumeBuilder_.addMessage(m);
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

    private long bucketStartTimestamp_ ;
    /**
     * <code>int64 bucket_start_timestamp = 1 [json_name = "bucketStartTimestamp"];</code>
     * @return The bucketStartTimestamp.
     */
    @java.lang.Override
    public long getBucketStartTimestamp() {
      return bucketStartTimestamp_;
    }
    /**
     * <code>int64 bucket_start_timestamp = 1 [json_name = "bucketStartTimestamp"];</code>
     * @param value The bucketStartTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setBucketStartTimestamp(long value) {

      bucketStartTimestamp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 bucket_start_timestamp = 1 [json_name = "bucketStartTimestamp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBucketStartTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bucketStartTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.injective.exchange.v1beta1.AccountVolume> accountVolume_ =
      java.util.Collections.emptyList();
    private void ensureAccountVolumeIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        accountVolume_ = new java.util.ArrayList<com.injective.exchange.v1beta1.AccountVolume>(accountVolume_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.injective.exchange.v1beta1.AccountVolume, com.injective.exchange.v1beta1.AccountVolume.Builder, com.injective.exchange.v1beta1.AccountVolumeOrBuilder> accountVolumeBuilder_;

    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public java.util.List<com.injective.exchange.v1beta1.AccountVolume> getAccountVolumeList() {
      if (accountVolumeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accountVolume_);
      } else {
        return accountVolumeBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public int getAccountVolumeCount() {
      if (accountVolumeBuilder_ == null) {
        return accountVolume_.size();
      } else {
        return accountVolumeBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public com.injective.exchange.v1beta1.AccountVolume getAccountVolume(int index) {
      if (accountVolumeBuilder_ == null) {
        return accountVolume_.get(index);
      } else {
        return accountVolumeBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public Builder setAccountVolume(
        int index, com.injective.exchange.v1beta1.AccountVolume value) {
      if (accountVolumeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountVolumeIsMutable();
        accountVolume_.set(index, value);
        onChanged();
      } else {
        accountVolumeBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public Builder setAccountVolume(
        int index, com.injective.exchange.v1beta1.AccountVolume.Builder builderForValue) {
      if (accountVolumeBuilder_ == null) {
        ensureAccountVolumeIsMutable();
        accountVolume_.set(index, builderForValue.build());
        onChanged();
      } else {
        accountVolumeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public Builder addAccountVolume(com.injective.exchange.v1beta1.AccountVolume value) {
      if (accountVolumeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountVolumeIsMutable();
        accountVolume_.add(value);
        onChanged();
      } else {
        accountVolumeBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public Builder addAccountVolume(
        int index, com.injective.exchange.v1beta1.AccountVolume value) {
      if (accountVolumeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountVolumeIsMutable();
        accountVolume_.add(index, value);
        onChanged();
      } else {
        accountVolumeBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public Builder addAccountVolume(
        com.injective.exchange.v1beta1.AccountVolume.Builder builderForValue) {
      if (accountVolumeBuilder_ == null) {
        ensureAccountVolumeIsMutable();
        accountVolume_.add(builderForValue.build());
        onChanged();
      } else {
        accountVolumeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public Builder addAccountVolume(
        int index, com.injective.exchange.v1beta1.AccountVolume.Builder builderForValue) {
      if (accountVolumeBuilder_ == null) {
        ensureAccountVolumeIsMutable();
        accountVolume_.add(index, builderForValue.build());
        onChanged();
      } else {
        accountVolumeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public Builder addAllAccountVolume(
        java.lang.Iterable<? extends com.injective.exchange.v1beta1.AccountVolume> values) {
      if (accountVolumeBuilder_ == null) {
        ensureAccountVolumeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accountVolume_);
        onChanged();
      } else {
        accountVolumeBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public Builder clearAccountVolume() {
      if (accountVolumeBuilder_ == null) {
        accountVolume_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        accountVolumeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public Builder removeAccountVolume(int index) {
      if (accountVolumeBuilder_ == null) {
        ensureAccountVolumeIsMutable();
        accountVolume_.remove(index);
        onChanged();
      } else {
        accountVolumeBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public com.injective.exchange.v1beta1.AccountVolume.Builder getAccountVolumeBuilder(
        int index) {
      return getAccountVolumeFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public com.injective.exchange.v1beta1.AccountVolumeOrBuilder getAccountVolumeOrBuilder(
        int index) {
      if (accountVolumeBuilder_ == null) {
        return accountVolume_.get(index);  } else {
        return accountVolumeBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public java.util.List<? extends com.injective.exchange.v1beta1.AccountVolumeOrBuilder> 
         getAccountVolumeOrBuilderList() {
      if (accountVolumeBuilder_ != null) {
        return accountVolumeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accountVolume_);
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public com.injective.exchange.v1beta1.AccountVolume.Builder addAccountVolumeBuilder() {
      return getAccountVolumeFieldBuilder().addBuilder(
          com.injective.exchange.v1beta1.AccountVolume.getDefaultInstance());
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public com.injective.exchange.v1beta1.AccountVolume.Builder addAccountVolumeBuilder(
        int index) {
      return getAccountVolumeFieldBuilder().addBuilder(
          index, com.injective.exchange.v1beta1.AccountVolume.getDefaultInstance());
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.AccountVolume account_volume = 2 [json_name = "accountVolume"];</code>
     */
    public java.util.List<com.injective.exchange.v1beta1.AccountVolume.Builder> 
         getAccountVolumeBuilderList() {
      return getAccountVolumeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.injective.exchange.v1beta1.AccountVolume, com.injective.exchange.v1beta1.AccountVolume.Builder, com.injective.exchange.v1beta1.AccountVolumeOrBuilder> 
        getAccountVolumeFieldBuilder() {
      if (accountVolumeBuilder_ == null) {
        accountVolumeBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.injective.exchange.v1beta1.AccountVolume, com.injective.exchange.v1beta1.AccountVolume.Builder, com.injective.exchange.v1beta1.AccountVolumeOrBuilder>(
                accountVolume_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        accountVolume_ = null;
      }
      return accountVolumeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts)
  private static final com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts();
  }

  public static com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeeDiscountBucketVolumeAccounts>
      PARSER = new com.google.protobuf.AbstractParser<FeeDiscountBucketVolumeAccounts>() {
    @java.lang.Override
    public FeeDiscountBucketVolumeAccounts parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeeDiscountBucketVolumeAccounts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeeDiscountBucketVolumeAccounts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

