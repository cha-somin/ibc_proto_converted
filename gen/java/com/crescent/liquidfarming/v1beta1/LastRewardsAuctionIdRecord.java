// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/liquidfarming/v1beta1/genesis.proto

package com.crescent.liquidfarming.v1beta1;

/**
 * Protobuf type {@code crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord}
 */
public final class LastRewardsAuctionIdRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord)
    LastRewardsAuctionIdRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LastRewardsAuctionIdRecord.newBuilder() to construct.
  private LastRewardsAuctionIdRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LastRewardsAuctionIdRecord() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LastRewardsAuctionIdRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.liquidfarming.v1beta1.GenesisProto.internal_static_crescent_liquidfarming_v1beta1_LastRewardsAuctionIdRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.liquidfarming.v1beta1.GenesisProto.internal_static_crescent_liquidfarming_v1beta1_LastRewardsAuctionIdRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord.class, com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord.Builder.class);
  }

  public static final int POOL_ID_FIELD_NUMBER = 1;
  private long poolId_ = 0L;
  /**
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
  }

  public static final int AUCTION_ID_FIELD_NUMBER = 2;
  private long auctionId_ = 0L;
  /**
   * <code>uint64 auction_id = 2 [json_name = "auctionId"];</code>
   * @return The auctionId.
   */
  @java.lang.Override
  public long getAuctionId() {
    return auctionId_;
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
    if (poolId_ != 0L) {
      output.writeUInt64(1, poolId_);
    }
    if (auctionId_ != 0L) {
      output.writeUInt64(2, auctionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (poolId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, poolId_);
    }
    if (auctionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, auctionId_);
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
    if (!(obj instanceof com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord)) {
      return super.equals(obj);
    }
    com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord other = (com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
    if (getAuctionId()
        != other.getAuctionId()) return false;
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
    hash = (37 * hash) + POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPoolId());
    hash = (37 * hash) + AUCTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAuctionId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord parseFrom(
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
  public static Builder newBuilder(com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord prototype) {
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
   * Protobuf type {@code crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord)
      com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.liquidfarming.v1beta1.GenesisProto.internal_static_crescent_liquidfarming_v1beta1_LastRewardsAuctionIdRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.liquidfarming.v1beta1.GenesisProto.internal_static_crescent_liquidfarming_v1beta1_LastRewardsAuctionIdRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord.class, com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord.Builder.class);
    }

    // Construct using com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord.newBuilder()
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
      poolId_ = 0L;
      auctionId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.crescent.liquidfarming.v1beta1.GenesisProto.internal_static_crescent_liquidfarming_v1beta1_LastRewardsAuctionIdRecord_descriptor;
    }

    @java.lang.Override
    public com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord getDefaultInstanceForType() {
      return com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord build() {
      com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord buildPartial() {
      com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord result = new com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.auctionId_ = auctionId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord) {
        return mergeFrom((com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord other) {
      if (other == com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (other.getAuctionId() != 0L) {
        setAuctionId(other.getAuctionId());
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
              poolId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              auctionId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long poolId_ ;
    /**
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @param value The poolId to set.
     * @return This builder for chaining.
     */
    public Builder setPoolId(long value) {

      poolId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      poolId_ = 0L;
      onChanged();
      return this;
    }

    private long auctionId_ ;
    /**
     * <code>uint64 auction_id = 2 [json_name = "auctionId"];</code>
     * @return The auctionId.
     */
    @java.lang.Override
    public long getAuctionId() {
      return auctionId_;
    }
    /**
     * <code>uint64 auction_id = 2 [json_name = "auctionId"];</code>
     * @param value The auctionId to set.
     * @return This builder for chaining.
     */
    public Builder setAuctionId(long value) {

      auctionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 auction_id = 2 [json_name = "auctionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuctionId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      auctionId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord)
  }

  // @@protoc_insertion_point(class_scope:crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord)
  private static final com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord();
  }

  public static com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LastRewardsAuctionIdRecord>
      PARSER = new com.google.protobuf.AbstractParser<LastRewardsAuctionIdRecord>() {
    @java.lang.Override
    public LastRewardsAuctionIdRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<LastRewardsAuctionIdRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LastRewardsAuctionIdRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

