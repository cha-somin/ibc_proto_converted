// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/concentrated-liquidity/genesis.proto

package com.osmosis.concentratedliquidity.v1beta1;

/**
 * <pre>
 * FullTick contains tick index and pool id along with other tick model
 * information.
 * </pre>
 *
 * Protobuf type {@code osmosis.concentratedliquidity.v1beta1.FullTick}
 */
public final class FullTick extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.concentratedliquidity.v1beta1.FullTick)
    FullTickOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FullTick.newBuilder() to construct.
  private FullTick(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FullTick() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FullTick();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.concentratedliquidity.v1beta1.GenesisProto.internal_static_osmosis_concentratedliquidity_v1beta1_FullTick_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.concentratedliquidity.v1beta1.GenesisProto.internal_static_osmosis_concentratedliquidity_v1beta1_FullTick_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.concentratedliquidity.v1beta1.FullTick.class, com.osmosis.concentratedliquidity.v1beta1.FullTick.Builder.class);
  }

  public static final int POOL_ID_FIELD_NUMBER = 1;
  private long poolId_ = 0L;
  /**
   * <pre>
   * pool id associated with the tick.
   * </pre>
   *
   * <code>uint64 pool_id = 1 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
  }

  public static final int TICK_INDEX_FIELD_NUMBER = 2;
  private long tickIndex_ = 0L;
  /**
   * <pre>
   * tick's index.
   * </pre>
   *
   * <code>int64 tick_index = 2 [json_name = "tickIndex", (.gogoproto.moretags) = "yaml:&#92;"tick_index&#92;""];</code>
   * @return The tickIndex.
   */
  @java.lang.Override
  public long getTickIndex() {
    return tickIndex_;
  }

  public static final int INFO_FIELD_NUMBER = 3;
  private com.osmosis.concentratedliquidity.v1beta1.TickInfo info_;
  /**
   * <pre>
   * tick's info.
   * </pre>
   *
   * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <pre>
   * tick's info.
   * </pre>
   *
   * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
   * @return The info.
   */
  @java.lang.Override
  public com.osmosis.concentratedliquidity.v1beta1.TickInfo getInfo() {
    return info_ == null ? com.osmosis.concentratedliquidity.v1beta1.TickInfo.getDefaultInstance() : info_;
  }
  /**
   * <pre>
   * tick's info.
   * </pre>
   *
   * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
   */
  @java.lang.Override
  public com.osmosis.concentratedliquidity.v1beta1.TickInfoOrBuilder getInfoOrBuilder() {
    return info_ == null ? com.osmosis.concentratedliquidity.v1beta1.TickInfo.getDefaultInstance() : info_;
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
    if (tickIndex_ != 0L) {
      output.writeInt64(2, tickIndex_);
    }
    if (info_ != null) {
      output.writeMessage(3, getInfo());
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
    if (tickIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, tickIndex_);
    }
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getInfo());
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
    if (!(obj instanceof com.osmosis.concentratedliquidity.v1beta1.FullTick)) {
      return super.equals(obj);
    }
    com.osmosis.concentratedliquidity.v1beta1.FullTick other = (com.osmosis.concentratedliquidity.v1beta1.FullTick) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
    if (getTickIndex()
        != other.getTickIndex()) return false;
    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
    }
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
    hash = (37 * hash) + TICK_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTickIndex());
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.FullTick parseFrom(
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
  public static Builder newBuilder(com.osmosis.concentratedliquidity.v1beta1.FullTick prototype) {
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
   * FullTick contains tick index and pool id along with other tick model
   * information.
   * </pre>
   *
   * Protobuf type {@code osmosis.concentratedliquidity.v1beta1.FullTick}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.concentratedliquidity.v1beta1.FullTick)
      com.osmosis.concentratedliquidity.v1beta1.FullTickOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.concentratedliquidity.v1beta1.GenesisProto.internal_static_osmosis_concentratedliquidity_v1beta1_FullTick_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.concentratedliquidity.v1beta1.GenesisProto.internal_static_osmosis_concentratedliquidity_v1beta1_FullTick_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.concentratedliquidity.v1beta1.FullTick.class, com.osmosis.concentratedliquidity.v1beta1.FullTick.Builder.class);
    }

    // Construct using com.osmosis.concentratedliquidity.v1beta1.FullTick.newBuilder()
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
      tickIndex_ = 0L;
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.concentratedliquidity.v1beta1.GenesisProto.internal_static_osmosis_concentratedliquidity_v1beta1_FullTick_descriptor;
    }

    @java.lang.Override
    public com.osmosis.concentratedliquidity.v1beta1.FullTick getDefaultInstanceForType() {
      return com.osmosis.concentratedliquidity.v1beta1.FullTick.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.concentratedliquidity.v1beta1.FullTick build() {
      com.osmosis.concentratedliquidity.v1beta1.FullTick result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.concentratedliquidity.v1beta1.FullTick buildPartial() {
      com.osmosis.concentratedliquidity.v1beta1.FullTick result = new com.osmosis.concentratedliquidity.v1beta1.FullTick(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.concentratedliquidity.v1beta1.FullTick result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tickIndex_ = tickIndex_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.info_ = infoBuilder_ == null
            ? info_
            : infoBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.concentratedliquidity.v1beta1.FullTick) {
        return mergeFrom((com.osmosis.concentratedliquidity.v1beta1.FullTick)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.concentratedliquidity.v1beta1.FullTick other) {
      if (other == com.osmosis.concentratedliquidity.v1beta1.FullTick.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (other.getTickIndex() != 0L) {
        setTickIndex(other.getTickIndex());
      }
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
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
              tickIndex_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private long poolId_ ;
    /**
     * <pre>
     * pool id associated with the tick.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <pre>
     * pool id associated with the tick.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
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
     * <pre>
     * pool id associated with the tick.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId", (.gogoproto.moretags) = "yaml:&#92;"pool_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      poolId_ = 0L;
      onChanged();
      return this;
    }

    private long tickIndex_ ;
    /**
     * <pre>
     * tick's index.
     * </pre>
     *
     * <code>int64 tick_index = 2 [json_name = "tickIndex", (.gogoproto.moretags) = "yaml:&#92;"tick_index&#92;""];</code>
     * @return The tickIndex.
     */
    @java.lang.Override
    public long getTickIndex() {
      return tickIndex_;
    }
    /**
     * <pre>
     * tick's index.
     * </pre>
     *
     * <code>int64 tick_index = 2 [json_name = "tickIndex", (.gogoproto.moretags) = "yaml:&#92;"tick_index&#92;""];</code>
     * @param value The tickIndex to set.
     * @return This builder for chaining.
     */
    public Builder setTickIndex(long value) {

      tickIndex_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tick's index.
     * </pre>
     *
     * <code>int64 tick_index = 2 [json_name = "tickIndex", (.gogoproto.moretags) = "yaml:&#92;"tick_index&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearTickIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tickIndex_ = 0L;
      onChanged();
      return this;
    }

    private com.osmosis.concentratedliquidity.v1beta1.TickInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.osmosis.concentratedliquidity.v1beta1.TickInfo, com.osmosis.concentratedliquidity.v1beta1.TickInfo.Builder, com.osmosis.concentratedliquidity.v1beta1.TickInfoOrBuilder> infoBuilder_;
    /**
     * <pre>
     * tick's info.
     * </pre>
     *
     * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * tick's info.
     * </pre>
     *
     * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
     * @return The info.
     */
    public com.osmosis.concentratedliquidity.v1beta1.TickInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? com.osmosis.concentratedliquidity.v1beta1.TickInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * tick's info.
     * </pre>
     *
     * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
     */
    public Builder setInfo(com.osmosis.concentratedliquidity.v1beta1.TickInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
      } else {
        infoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tick's info.
     * </pre>
     *
     * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
     */
    public Builder setInfo(
        com.osmosis.concentratedliquidity.v1beta1.TickInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tick's info.
     * </pre>
     *
     * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
     */
    public Builder mergeInfo(com.osmosis.concentratedliquidity.v1beta1.TickInfo value) {
      if (infoBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          info_ != null &&
          info_ != com.osmosis.concentratedliquidity.v1beta1.TickInfo.getDefaultInstance()) {
          getInfoBuilder().mergeFrom(value);
        } else {
          info_ = value;
        }
      } else {
        infoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tick's info.
     * </pre>
     *
     * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
     */
    public Builder clearInfo() {
      bitField0_ = (bitField0_ & ~0x00000004);
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tick's info.
     * </pre>
     *
     * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
     */
    public com.osmosis.concentratedliquidity.v1beta1.TickInfo.Builder getInfoBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * tick's info.
     * </pre>
     *
     * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
     */
    public com.osmosis.concentratedliquidity.v1beta1.TickInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            com.osmosis.concentratedliquidity.v1beta1.TickInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <pre>
     * tick's info.
     * </pre>
     *
     * <code>.osmosis.concentratedliquidity.v1beta1.TickInfo info = 3 [json_name = "info", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tick_info&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.osmosis.concentratedliquidity.v1beta1.TickInfo, com.osmosis.concentratedliquidity.v1beta1.TickInfo.Builder, com.osmosis.concentratedliquidity.v1beta1.TickInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.osmosis.concentratedliquidity.v1beta1.TickInfo, com.osmosis.concentratedliquidity.v1beta1.TickInfo.Builder, com.osmosis.concentratedliquidity.v1beta1.TickInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.concentratedliquidity.v1beta1.FullTick)
  }

  // @@protoc_insertion_point(class_scope:osmosis.concentratedliquidity.v1beta1.FullTick)
  private static final com.osmosis.concentratedliquidity.v1beta1.FullTick DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.concentratedliquidity.v1beta1.FullTick();
  }

  public static com.osmosis.concentratedliquidity.v1beta1.FullTick getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FullTick>
      PARSER = new com.google.protobuf.AbstractParser<FullTick>() {
    @java.lang.Override
    public FullTick parsePartialFrom(
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

  public static com.google.protobuf.Parser<FullTick> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FullTick> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.concentratedliquidity.v1beta1.FullTick getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

