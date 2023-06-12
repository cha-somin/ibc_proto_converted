// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/prize.proto

package com.lum.network.millions;

/**
 * Protobuf type {@code lum.network.millions.PrizeIDs}
 */
public final class PrizeIDs extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lum.network.millions.PrizeIDs)
    PrizeIDsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrizeIDs.newBuilder() to construct.
  private PrizeIDs(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrizeIDs() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrizeIDs();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lum.network.millions.PrizeProto.internal_static_lum_network_millions_PrizeIDs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lum.network.millions.PrizeProto.internal_static_lum_network_millions_PrizeIDs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lum.network.millions.PrizeIDs.class, com.lum.network.millions.PrizeIDs.Builder.class);
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

  public static final int DRAW_ID_FIELD_NUMBER = 2;
  private long drawId_ = 0L;
  /**
   * <code>uint64 draw_id = 2 [json_name = "drawId"];</code>
   * @return The drawId.
   */
  @java.lang.Override
  public long getDrawId() {
    return drawId_;
  }

  public static final int PRIZE_ID_FIELD_NUMBER = 3;
  private long prizeId_ = 0L;
  /**
   * <code>uint64 prize_id = 3 [json_name = "prizeId"];</code>
   * @return The prizeId.
   */
  @java.lang.Override
  public long getPrizeId() {
    return prizeId_;
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
    if (drawId_ != 0L) {
      output.writeUInt64(2, drawId_);
    }
    if (prizeId_ != 0L) {
      output.writeUInt64(3, prizeId_);
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
    if (drawId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, drawId_);
    }
    if (prizeId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, prizeId_);
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
    if (!(obj instanceof com.lum.network.millions.PrizeIDs)) {
      return super.equals(obj);
    }
    com.lum.network.millions.PrizeIDs other = (com.lum.network.millions.PrizeIDs) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
    if (getDrawId()
        != other.getDrawId()) return false;
    if (getPrizeId()
        != other.getPrizeId()) return false;
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
    hash = (37 * hash) + DRAW_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDrawId());
    hash = (37 * hash) + PRIZE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrizeId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lum.network.millions.PrizeIDs parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.PrizeIDs parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.PrizeIDs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.PrizeIDs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.PrizeIDs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.PrizeIDs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.PrizeIDs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.millions.PrizeIDs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.lum.network.millions.PrizeIDs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.lum.network.millions.PrizeIDs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lum.network.millions.PrizeIDs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.millions.PrizeIDs parseFrom(
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
  public static Builder newBuilder(com.lum.network.millions.PrizeIDs prototype) {
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
   * Protobuf type {@code lum.network.millions.PrizeIDs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lum.network.millions.PrizeIDs)
      com.lum.network.millions.PrizeIDsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lum.network.millions.PrizeProto.internal_static_lum_network_millions_PrizeIDs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lum.network.millions.PrizeProto.internal_static_lum_network_millions_PrizeIDs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lum.network.millions.PrizeIDs.class, com.lum.network.millions.PrizeIDs.Builder.class);
    }

    // Construct using com.lum.network.millions.PrizeIDs.newBuilder()
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
      drawId_ = 0L;
      prizeId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lum.network.millions.PrizeProto.internal_static_lum_network_millions_PrizeIDs_descriptor;
    }

    @java.lang.Override
    public com.lum.network.millions.PrizeIDs getDefaultInstanceForType() {
      return com.lum.network.millions.PrizeIDs.getDefaultInstance();
    }

    @java.lang.Override
    public com.lum.network.millions.PrizeIDs build() {
      com.lum.network.millions.PrizeIDs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.lum.network.millions.PrizeIDs buildPartial() {
      com.lum.network.millions.PrizeIDs result = new com.lum.network.millions.PrizeIDs(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.lum.network.millions.PrizeIDs result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.drawId_ = drawId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.prizeId_ = prizeId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lum.network.millions.PrizeIDs) {
        return mergeFrom((com.lum.network.millions.PrizeIDs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lum.network.millions.PrizeIDs other) {
      if (other == com.lum.network.millions.PrizeIDs.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (other.getDrawId() != 0L) {
        setDrawId(other.getDrawId());
      }
      if (other.getPrizeId() != 0L) {
        setPrizeId(other.getPrizeId());
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
              drawId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              prizeId_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private long drawId_ ;
    /**
     * <code>uint64 draw_id = 2 [json_name = "drawId"];</code>
     * @return The drawId.
     */
    @java.lang.Override
    public long getDrawId() {
      return drawId_;
    }
    /**
     * <code>uint64 draw_id = 2 [json_name = "drawId"];</code>
     * @param value The drawId to set.
     * @return This builder for chaining.
     */
    public Builder setDrawId(long value) {

      drawId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 draw_id = 2 [json_name = "drawId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDrawId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      drawId_ = 0L;
      onChanged();
      return this;
    }

    private long prizeId_ ;
    /**
     * <code>uint64 prize_id = 3 [json_name = "prizeId"];</code>
     * @return The prizeId.
     */
    @java.lang.Override
    public long getPrizeId() {
      return prizeId_;
    }
    /**
     * <code>uint64 prize_id = 3 [json_name = "prizeId"];</code>
     * @param value The prizeId to set.
     * @return This builder for chaining.
     */
    public Builder setPrizeId(long value) {

      prizeId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 prize_id = 3 [json_name = "prizeId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrizeId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      prizeId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:lum.network.millions.PrizeIDs)
  }

  // @@protoc_insertion_point(class_scope:lum.network.millions.PrizeIDs)
  private static final com.lum.network.millions.PrizeIDs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lum.network.millions.PrizeIDs();
  }

  public static com.lum.network.millions.PrizeIDs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrizeIDs>
      PARSER = new com.google.protobuf.AbstractParser<PrizeIDs>() {
    @java.lang.Override
    public PrizeIDs parsePartialFrom(
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

  public static com.google.protobuf.Parser<PrizeIDs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrizeIDs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.lum.network.millions.PrizeIDs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

