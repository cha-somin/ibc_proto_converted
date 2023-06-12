// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/royalty_config.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.RoyaltyConfig}
 */
public final class RoyaltyConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.RoyaltyConfig)
    RoyaltyConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoyaltyConfig.newBuilder() to construct.
  private RoyaltyConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoyaltyConfig() {
    stakeholders_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RoyaltyConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.RoyaltyConfigProto.internal_static_likechain_likenft_v1_RoyaltyConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.RoyaltyConfigProto.internal_static_likechain_likenft_v1_RoyaltyConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.RoyaltyConfig.class, com.likechain.likenft.v1.RoyaltyConfig.Builder.class);
  }

  public static final int RATE_BASIS_POINTS_FIELD_NUMBER = 1;
  private long rateBasisPoints_ = 0L;
  /**
   * <code>uint64 rate_basis_points = 1 [json_name = "rateBasisPoints"];</code>
   * @return The rateBasisPoints.
   */
  @java.lang.Override
  public long getRateBasisPoints() {
    return rateBasisPoints_;
  }

  public static final int STAKEHOLDERS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.likechain.likenft.v1.RoyaltyStakeholder> stakeholders_;
  /**
   * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.likechain.likenft.v1.RoyaltyStakeholder> getStakeholdersList() {
    return stakeholders_;
  }
  /**
   * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.likechain.likenft.v1.RoyaltyStakeholderOrBuilder> 
      getStakeholdersOrBuilderList() {
    return stakeholders_;
  }
  /**
   * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getStakeholdersCount() {
    return stakeholders_.size();
  }
  /**
   * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.likechain.likenft.v1.RoyaltyStakeholder getStakeholders(int index) {
    return stakeholders_.get(index);
  }
  /**
   * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.likechain.likenft.v1.RoyaltyStakeholderOrBuilder getStakeholdersOrBuilder(
      int index) {
    return stakeholders_.get(index);
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
    if (rateBasisPoints_ != 0L) {
      output.writeUInt64(1, rateBasisPoints_);
    }
    for (int i = 0; i < stakeholders_.size(); i++) {
      output.writeMessage(2, stakeholders_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rateBasisPoints_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, rateBasisPoints_);
    }
    for (int i = 0; i < stakeholders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, stakeholders_.get(i));
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
    if (!(obj instanceof com.likechain.likenft.v1.RoyaltyConfig)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.RoyaltyConfig other = (com.likechain.likenft.v1.RoyaltyConfig) obj;

    if (getRateBasisPoints()
        != other.getRateBasisPoints()) return false;
    if (!getStakeholdersList()
        .equals(other.getStakeholdersList())) return false;
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
    hash = (37 * hash) + RATE_BASIS_POINTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRateBasisPoints());
    if (getStakeholdersCount() > 0) {
      hash = (37 * hash) + STAKEHOLDERS_FIELD_NUMBER;
      hash = (53 * hash) + getStakeholdersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.RoyaltyConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.RoyaltyConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.RoyaltyConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.RoyaltyConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.RoyaltyConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.RoyaltyConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.RoyaltyConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.RoyaltyConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.RoyaltyConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.RoyaltyConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.RoyaltyConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.RoyaltyConfig parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.RoyaltyConfig prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.RoyaltyConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.RoyaltyConfig)
      com.likechain.likenft.v1.RoyaltyConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.RoyaltyConfigProto.internal_static_likechain_likenft_v1_RoyaltyConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.RoyaltyConfigProto.internal_static_likechain_likenft_v1_RoyaltyConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.RoyaltyConfig.class, com.likechain.likenft.v1.RoyaltyConfig.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.RoyaltyConfig.newBuilder()
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
      rateBasisPoints_ = 0L;
      if (stakeholdersBuilder_ == null) {
        stakeholders_ = java.util.Collections.emptyList();
      } else {
        stakeholders_ = null;
        stakeholdersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.likenft.v1.RoyaltyConfigProto.internal_static_likechain_likenft_v1_RoyaltyConfig_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.RoyaltyConfig getDefaultInstanceForType() {
      return com.likechain.likenft.v1.RoyaltyConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.RoyaltyConfig build() {
      com.likechain.likenft.v1.RoyaltyConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.RoyaltyConfig buildPartial() {
      com.likechain.likenft.v1.RoyaltyConfig result = new com.likechain.likenft.v1.RoyaltyConfig(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.likechain.likenft.v1.RoyaltyConfig result) {
      if (stakeholdersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          stakeholders_ = java.util.Collections.unmodifiableList(stakeholders_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.stakeholders_ = stakeholders_;
      } else {
        result.stakeholders_ = stakeholdersBuilder_.build();
      }
    }

    private void buildPartial0(com.likechain.likenft.v1.RoyaltyConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rateBasisPoints_ = rateBasisPoints_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.RoyaltyConfig) {
        return mergeFrom((com.likechain.likenft.v1.RoyaltyConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.RoyaltyConfig other) {
      if (other == com.likechain.likenft.v1.RoyaltyConfig.getDefaultInstance()) return this;
      if (other.getRateBasisPoints() != 0L) {
        setRateBasisPoints(other.getRateBasisPoints());
      }
      if (stakeholdersBuilder_ == null) {
        if (!other.stakeholders_.isEmpty()) {
          if (stakeholders_.isEmpty()) {
            stakeholders_ = other.stakeholders_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureStakeholdersIsMutable();
            stakeholders_.addAll(other.stakeholders_);
          }
          onChanged();
        }
      } else {
        if (!other.stakeholders_.isEmpty()) {
          if (stakeholdersBuilder_.isEmpty()) {
            stakeholdersBuilder_.dispose();
            stakeholdersBuilder_ = null;
            stakeholders_ = other.stakeholders_;
            bitField0_ = (bitField0_ & ~0x00000002);
            stakeholdersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStakeholdersFieldBuilder() : null;
          } else {
            stakeholdersBuilder_.addAllMessages(other.stakeholders_);
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
              rateBasisPoints_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.likechain.likenft.v1.RoyaltyStakeholder m =
                  input.readMessage(
                      com.likechain.likenft.v1.RoyaltyStakeholder.parser(),
                      extensionRegistry);
              if (stakeholdersBuilder_ == null) {
                ensureStakeholdersIsMutable();
                stakeholders_.add(m);
              } else {
                stakeholdersBuilder_.addMessage(m);
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

    private long rateBasisPoints_ ;
    /**
     * <code>uint64 rate_basis_points = 1 [json_name = "rateBasisPoints"];</code>
     * @return The rateBasisPoints.
     */
    @java.lang.Override
    public long getRateBasisPoints() {
      return rateBasisPoints_;
    }
    /**
     * <code>uint64 rate_basis_points = 1 [json_name = "rateBasisPoints"];</code>
     * @param value The rateBasisPoints to set.
     * @return This builder for chaining.
     */
    public Builder setRateBasisPoints(long value) {

      rateBasisPoints_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 rate_basis_points = 1 [json_name = "rateBasisPoints"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRateBasisPoints() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rateBasisPoints_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.likechain.likenft.v1.RoyaltyStakeholder> stakeholders_ =
      java.util.Collections.emptyList();
    private void ensureStakeholdersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        stakeholders_ = new java.util.ArrayList<com.likechain.likenft.v1.RoyaltyStakeholder>(stakeholders_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.likechain.likenft.v1.RoyaltyStakeholder, com.likechain.likenft.v1.RoyaltyStakeholder.Builder, com.likechain.likenft.v1.RoyaltyStakeholderOrBuilder> stakeholdersBuilder_;

    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.likechain.likenft.v1.RoyaltyStakeholder> getStakeholdersList() {
      if (stakeholdersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stakeholders_);
      } else {
        return stakeholdersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public int getStakeholdersCount() {
      if (stakeholdersBuilder_ == null) {
        return stakeholders_.size();
      } else {
        return stakeholdersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.RoyaltyStakeholder getStakeholders(int index) {
      if (stakeholdersBuilder_ == null) {
        return stakeholders_.get(index);
      } else {
        return stakeholdersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public Builder setStakeholders(
        int index, com.likechain.likenft.v1.RoyaltyStakeholder value) {
      if (stakeholdersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStakeholdersIsMutable();
        stakeholders_.set(index, value);
        onChanged();
      } else {
        stakeholdersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public Builder setStakeholders(
        int index, com.likechain.likenft.v1.RoyaltyStakeholder.Builder builderForValue) {
      if (stakeholdersBuilder_ == null) {
        ensureStakeholdersIsMutable();
        stakeholders_.set(index, builderForValue.build());
        onChanged();
      } else {
        stakeholdersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public Builder addStakeholders(com.likechain.likenft.v1.RoyaltyStakeholder value) {
      if (stakeholdersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStakeholdersIsMutable();
        stakeholders_.add(value);
        onChanged();
      } else {
        stakeholdersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public Builder addStakeholders(
        int index, com.likechain.likenft.v1.RoyaltyStakeholder value) {
      if (stakeholdersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStakeholdersIsMutable();
        stakeholders_.add(index, value);
        onChanged();
      } else {
        stakeholdersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public Builder addStakeholders(
        com.likechain.likenft.v1.RoyaltyStakeholder.Builder builderForValue) {
      if (stakeholdersBuilder_ == null) {
        ensureStakeholdersIsMutable();
        stakeholders_.add(builderForValue.build());
        onChanged();
      } else {
        stakeholdersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public Builder addStakeholders(
        int index, com.likechain.likenft.v1.RoyaltyStakeholder.Builder builderForValue) {
      if (stakeholdersBuilder_ == null) {
        ensureStakeholdersIsMutable();
        stakeholders_.add(index, builderForValue.build());
        onChanged();
      } else {
        stakeholdersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllStakeholders(
        java.lang.Iterable<? extends com.likechain.likenft.v1.RoyaltyStakeholder> values) {
      if (stakeholdersBuilder_ == null) {
        ensureStakeholdersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stakeholders_);
        onChanged();
      } else {
        stakeholdersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearStakeholders() {
      if (stakeholdersBuilder_ == null) {
        stakeholders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        stakeholdersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeStakeholders(int index) {
      if (stakeholdersBuilder_ == null) {
        ensureStakeholdersIsMutable();
        stakeholders_.remove(index);
        onChanged();
      } else {
        stakeholdersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.RoyaltyStakeholder.Builder getStakeholdersBuilder(
        int index) {
      return getStakeholdersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.RoyaltyStakeholderOrBuilder getStakeholdersOrBuilder(
        int index) {
      if (stakeholdersBuilder_ == null) {
        return stakeholders_.get(index);  } else {
        return stakeholdersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.likechain.likenft.v1.RoyaltyStakeholderOrBuilder> 
         getStakeholdersOrBuilderList() {
      if (stakeholdersBuilder_ != null) {
        return stakeholdersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stakeholders_);
      }
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.RoyaltyStakeholder.Builder addStakeholdersBuilder() {
      return getStakeholdersFieldBuilder().addBuilder(
          com.likechain.likenft.v1.RoyaltyStakeholder.getDefaultInstance());
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.RoyaltyStakeholder.Builder addStakeholdersBuilder(
        int index) {
      return getStakeholdersFieldBuilder().addBuilder(
          index, com.likechain.likenft.v1.RoyaltyStakeholder.getDefaultInstance());
    }
    /**
     * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.likechain.likenft.v1.RoyaltyStakeholder.Builder> 
         getStakeholdersBuilderList() {
      return getStakeholdersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.likechain.likenft.v1.RoyaltyStakeholder, com.likechain.likenft.v1.RoyaltyStakeholder.Builder, com.likechain.likenft.v1.RoyaltyStakeholderOrBuilder> 
        getStakeholdersFieldBuilder() {
      if (stakeholdersBuilder_ == null) {
        stakeholdersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.likechain.likenft.v1.RoyaltyStakeholder, com.likechain.likenft.v1.RoyaltyStakeholder.Builder, com.likechain.likenft.v1.RoyaltyStakeholderOrBuilder>(
                stakeholders_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        stakeholders_ = null;
      }
      return stakeholdersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.RoyaltyConfig)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.RoyaltyConfig)
  private static final com.likechain.likenft.v1.RoyaltyConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.RoyaltyConfig();
  }

  public static com.likechain.likenft.v1.RoyaltyConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoyaltyConfig>
      PARSER = new com.google.protobuf.AbstractParser<RoyaltyConfig>() {
    @java.lang.Override
    public RoyaltyConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<RoyaltyConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoyaltyConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.RoyaltyConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

