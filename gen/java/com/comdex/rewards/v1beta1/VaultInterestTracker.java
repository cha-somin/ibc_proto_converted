// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/rewards/v1beta1/rewards.proto

package com.comdex.rewards.v1beta1;

/**
 * Protobuf type {@code comdex.rewards.v1beta1.VaultInterestTracker}
 */
public final class VaultInterestTracker extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.rewards.v1beta1.VaultInterestTracker)
    VaultInterestTrackerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VaultInterestTracker.newBuilder() to construct.
  private VaultInterestTracker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VaultInterestTracker() {
    interestAccumulated_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VaultInterestTracker();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_VaultInterestTracker_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_VaultInterestTracker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.rewards.v1beta1.VaultInterestTracker.class, com.comdex.rewards.v1beta1.VaultInterestTracker.Builder.class);
  }

  public static final int VAULT_ID_FIELD_NUMBER = 1;
  private long vaultId_ = 0L;
  /**
   * <code>uint64 vault_id = 1 [json_name = "vaultId", (.gogoproto.moretags) = "yaml:&#92;"vault_id&#92;""];</code>
   * @return The vaultId.
   */
  @java.lang.Override
  public long getVaultId() {
    return vaultId_;
  }

  public static final int APP_MAPPING_ID_FIELD_NUMBER = 2;
  private long appMappingId_ = 0L;
  /**
   * <code>uint64 app_mapping_id = 2 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
   * @return The appMappingId.
   */
  @java.lang.Override
  public long getAppMappingId() {
    return appMappingId_;
  }

  public static final int INTEREST_ACCUMULATED_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object interestAccumulated_ = "";
  /**
   * <code>string interest_accumulated = 3 [json_name = "interestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
   * @return The interestAccumulated.
   */
  @java.lang.Override
  public java.lang.String getInterestAccumulated() {
    java.lang.Object ref = interestAccumulated_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      interestAccumulated_ = s;
      return s;
    }
  }
  /**
   * <code>string interest_accumulated = 3 [json_name = "interestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
   * @return The bytes for interestAccumulated.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInterestAccumulatedBytes() {
    java.lang.Object ref = interestAccumulated_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      interestAccumulated_ = b;
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
    if (vaultId_ != 0L) {
      output.writeUInt64(1, vaultId_);
    }
    if (appMappingId_ != 0L) {
      output.writeUInt64(2, appMappingId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interestAccumulated_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, interestAccumulated_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vaultId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, vaultId_);
    }
    if (appMappingId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, appMappingId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interestAccumulated_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, interestAccumulated_);
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
    if (!(obj instanceof com.comdex.rewards.v1beta1.VaultInterestTracker)) {
      return super.equals(obj);
    }
    com.comdex.rewards.v1beta1.VaultInterestTracker other = (com.comdex.rewards.v1beta1.VaultInterestTracker) obj;

    if (getVaultId()
        != other.getVaultId()) return false;
    if (getAppMappingId()
        != other.getAppMappingId()) return false;
    if (!getInterestAccumulated()
        .equals(other.getInterestAccumulated())) return false;
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
    hash = (37 * hash) + VAULT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVaultId());
    hash = (37 * hash) + APP_MAPPING_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppMappingId());
    hash = (37 * hash) + INTEREST_ACCUMULATED_FIELD_NUMBER;
    hash = (53 * hash) + getInterestAccumulated().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.rewards.v1beta1.VaultInterestTracker parseFrom(
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
  public static Builder newBuilder(com.comdex.rewards.v1beta1.VaultInterestTracker prototype) {
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
   * Protobuf type {@code comdex.rewards.v1beta1.VaultInterestTracker}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.rewards.v1beta1.VaultInterestTracker)
      com.comdex.rewards.v1beta1.VaultInterestTrackerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_VaultInterestTracker_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_VaultInterestTracker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.rewards.v1beta1.VaultInterestTracker.class, com.comdex.rewards.v1beta1.VaultInterestTracker.Builder.class);
    }

    // Construct using com.comdex.rewards.v1beta1.VaultInterestTracker.newBuilder()
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
      vaultId_ = 0L;
      appMappingId_ = 0L;
      interestAccumulated_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.rewards.v1beta1.RewardsProto.internal_static_comdex_rewards_v1beta1_VaultInterestTracker_descriptor;
    }

    @java.lang.Override
    public com.comdex.rewards.v1beta1.VaultInterestTracker getDefaultInstanceForType() {
      return com.comdex.rewards.v1beta1.VaultInterestTracker.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.rewards.v1beta1.VaultInterestTracker build() {
      com.comdex.rewards.v1beta1.VaultInterestTracker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.rewards.v1beta1.VaultInterestTracker buildPartial() {
      com.comdex.rewards.v1beta1.VaultInterestTracker result = new com.comdex.rewards.v1beta1.VaultInterestTracker(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.rewards.v1beta1.VaultInterestTracker result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vaultId_ = vaultId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.appMappingId_ = appMappingId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.interestAccumulated_ = interestAccumulated_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.rewards.v1beta1.VaultInterestTracker) {
        return mergeFrom((com.comdex.rewards.v1beta1.VaultInterestTracker)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.rewards.v1beta1.VaultInterestTracker other) {
      if (other == com.comdex.rewards.v1beta1.VaultInterestTracker.getDefaultInstance()) return this;
      if (other.getVaultId() != 0L) {
        setVaultId(other.getVaultId());
      }
      if (other.getAppMappingId() != 0L) {
        setAppMappingId(other.getAppMappingId());
      }
      if (!other.getInterestAccumulated().isEmpty()) {
        interestAccumulated_ = other.interestAccumulated_;
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
            case 8: {
              vaultId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              appMappingId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              interestAccumulated_ = input.readStringRequireUtf8();
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

    private long vaultId_ ;
    /**
     * <code>uint64 vault_id = 1 [json_name = "vaultId", (.gogoproto.moretags) = "yaml:&#92;"vault_id&#92;""];</code>
     * @return The vaultId.
     */
    @java.lang.Override
    public long getVaultId() {
      return vaultId_;
    }
    /**
     * <code>uint64 vault_id = 1 [json_name = "vaultId", (.gogoproto.moretags) = "yaml:&#92;"vault_id&#92;""];</code>
     * @param value The vaultId to set.
     * @return This builder for chaining.
     */
    public Builder setVaultId(long value) {

      vaultId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 vault_id = 1 [json_name = "vaultId", (.gogoproto.moretags) = "yaml:&#92;"vault_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearVaultId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      vaultId_ = 0L;
      onChanged();
      return this;
    }

    private long appMappingId_ ;
    /**
     * <code>uint64 app_mapping_id = 2 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
     * @return The appMappingId.
     */
    @java.lang.Override
    public long getAppMappingId() {
      return appMappingId_;
    }
    /**
     * <code>uint64 app_mapping_id = 2 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
     * @param value The appMappingId to set.
     * @return This builder for chaining.
     */
    public Builder setAppMappingId(long value) {

      appMappingId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 app_mapping_id = 2 [json_name = "appMappingId", (.gogoproto.moretags) = "yaml:&#92;"app_mapping_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppMappingId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      appMappingId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object interestAccumulated_ = "";
    /**
     * <code>string interest_accumulated = 3 [json_name = "interestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
     * @return The interestAccumulated.
     */
    public java.lang.String getInterestAccumulated() {
      java.lang.Object ref = interestAccumulated_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        interestAccumulated_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string interest_accumulated = 3 [json_name = "interestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
     * @return The bytes for interestAccumulated.
     */
    public com.google.protobuf.ByteString
        getInterestAccumulatedBytes() {
      java.lang.Object ref = interestAccumulated_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        interestAccumulated_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string interest_accumulated = 3 [json_name = "interestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
     * @param value The interestAccumulated to set.
     * @return This builder for chaining.
     */
    public Builder setInterestAccumulated(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      interestAccumulated_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string interest_accumulated = 3 [json_name = "interestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearInterestAccumulated() {
      interestAccumulated_ = getDefaultInstance().getInterestAccumulated();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string interest_accumulated = 3 [json_name = "interestAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
     * @param value The bytes for interestAccumulated to set.
     * @return This builder for chaining.
     */
    public Builder setInterestAccumulatedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      interestAccumulated_ = value;
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


    // @@protoc_insertion_point(builder_scope:comdex.rewards.v1beta1.VaultInterestTracker)
  }

  // @@protoc_insertion_point(class_scope:comdex.rewards.v1beta1.VaultInterestTracker)
  private static final com.comdex.rewards.v1beta1.VaultInterestTracker DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.rewards.v1beta1.VaultInterestTracker();
  }

  public static com.comdex.rewards.v1beta1.VaultInterestTracker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VaultInterestTracker>
      PARSER = new com.google.protobuf.AbstractParser<VaultInterestTracker>() {
    @java.lang.Override
    public VaultInterestTracker parsePartialFrom(
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

  public static com.google.protobuf.Parser<VaultInterestTracker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VaultInterestTracker> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.rewards.v1beta1.VaultInterestTracker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

