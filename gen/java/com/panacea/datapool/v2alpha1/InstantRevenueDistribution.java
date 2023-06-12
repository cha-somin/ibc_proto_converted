// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/datapool/v2alpha1/pool.proto

package com.panacea.datapool.v2alpha1;

/**
 * <pre>
 * InstantRevenueDistribution defines poolID information to distribution revenue.
 * </pre>
 *
 * Protobuf type {@code panacea.datapool.v2alpha1.InstantRevenueDistribution}
 */
public final class InstantRevenueDistribution extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.datapool.v2alpha1.InstantRevenueDistribution)
    InstantRevenueDistributionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstantRevenueDistribution.newBuilder() to construct.
  private InstantRevenueDistribution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstantRevenueDistribution() {
    poolIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstantRevenueDistribution();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.panacea.datapool.v2alpha1.PoolProto.internal_static_panacea_datapool_v2alpha1_InstantRevenueDistribution_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.panacea.datapool.v2alpha1.PoolProto.internal_static_panacea_datapool_v2alpha1_InstantRevenueDistribution_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.panacea.datapool.v2alpha1.InstantRevenueDistribution.class, com.panacea.datapool.v2alpha1.InstantRevenueDistribution.Builder.class);
  }

  public static final int POOL_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList poolIds_;
  /**
   * <pre>
   * Execute information for pool reward distribution
   * </pre>
   *
   * <code>repeated uint64 pool_ids = 1 [json_name = "poolIds"];</code>
   * @return A list containing the poolIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getPoolIdsList() {
    return poolIds_;
  }
  /**
   * <pre>
   * Execute information for pool reward distribution
   * </pre>
   *
   * <code>repeated uint64 pool_ids = 1 [json_name = "poolIds"];</code>
   * @return The count of poolIds.
   */
  public int getPoolIdsCount() {
    return poolIds_.size();
  }
  /**
   * <pre>
   * Execute information for pool reward distribution
   * </pre>
   *
   * <code>repeated uint64 pool_ids = 1 [json_name = "poolIds"];</code>
   * @param index The index of the element to return.
   * @return The poolIds at the given index.
   */
  public long getPoolIds(int index) {
    return poolIds_.getLong(index);
  }
  private int poolIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getPoolIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(poolIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < poolIds_.size(); i++) {
      output.writeUInt64NoTag(poolIds_.getLong(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < poolIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(poolIds_.getLong(i));
      }
      size += dataSize;
      if (!getPoolIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      poolIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.panacea.datapool.v2alpha1.InstantRevenueDistribution)) {
      return super.equals(obj);
    }
    com.panacea.datapool.v2alpha1.InstantRevenueDistribution other = (com.panacea.datapool.v2alpha1.InstantRevenueDistribution) obj;

    if (!getPoolIdsList()
        .equals(other.getPoolIdsList())) return false;
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
    if (getPoolIdsCount() > 0) {
      hash = (37 * hash) + POOL_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getPoolIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution parseFrom(
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
  public static Builder newBuilder(com.panacea.datapool.v2alpha1.InstantRevenueDistribution prototype) {
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
   * InstantRevenueDistribution defines poolID information to distribution revenue.
   * </pre>
   *
   * Protobuf type {@code panacea.datapool.v2alpha1.InstantRevenueDistribution}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.datapool.v2alpha1.InstantRevenueDistribution)
      com.panacea.datapool.v2alpha1.InstantRevenueDistributionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.panacea.datapool.v2alpha1.PoolProto.internal_static_panacea_datapool_v2alpha1_InstantRevenueDistribution_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.panacea.datapool.v2alpha1.PoolProto.internal_static_panacea_datapool_v2alpha1_InstantRevenueDistribution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.panacea.datapool.v2alpha1.InstantRevenueDistribution.class, com.panacea.datapool.v2alpha1.InstantRevenueDistribution.Builder.class);
    }

    // Construct using com.panacea.datapool.v2alpha1.InstantRevenueDistribution.newBuilder()
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
      poolIds_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.panacea.datapool.v2alpha1.PoolProto.internal_static_panacea_datapool_v2alpha1_InstantRevenueDistribution_descriptor;
    }

    @java.lang.Override
    public com.panacea.datapool.v2alpha1.InstantRevenueDistribution getDefaultInstanceForType() {
      return com.panacea.datapool.v2alpha1.InstantRevenueDistribution.getDefaultInstance();
    }

    @java.lang.Override
    public com.panacea.datapool.v2alpha1.InstantRevenueDistribution build() {
      com.panacea.datapool.v2alpha1.InstantRevenueDistribution result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.panacea.datapool.v2alpha1.InstantRevenueDistribution buildPartial() {
      com.panacea.datapool.v2alpha1.InstantRevenueDistribution result = new com.panacea.datapool.v2alpha1.InstantRevenueDistribution(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.panacea.datapool.v2alpha1.InstantRevenueDistribution result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        poolIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.poolIds_ = poolIds_;
    }

    private void buildPartial0(com.panacea.datapool.v2alpha1.InstantRevenueDistribution result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.panacea.datapool.v2alpha1.InstantRevenueDistribution) {
        return mergeFrom((com.panacea.datapool.v2alpha1.InstantRevenueDistribution)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.panacea.datapool.v2alpha1.InstantRevenueDistribution other) {
      if (other == com.panacea.datapool.v2alpha1.InstantRevenueDistribution.getDefaultInstance()) return this;
      if (!other.poolIds_.isEmpty()) {
        if (poolIds_.isEmpty()) {
          poolIds_ = other.poolIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePoolIdsIsMutable();
          poolIds_.addAll(other.poolIds_);
        }
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
              long v = input.readUInt64();
              ensurePoolIdsIsMutable();
              poolIds_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensurePoolIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                poolIds_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.Internal.LongList poolIds_ = emptyLongList();
    private void ensurePoolIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        poolIds_ = mutableCopy(poolIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Execute information for pool reward distribution
     * </pre>
     *
     * <code>repeated uint64 pool_ids = 1 [json_name = "poolIds"];</code>
     * @return A list containing the poolIds.
     */
    public java.util.List<java.lang.Long>
        getPoolIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(poolIds_) : poolIds_;
    }
    /**
     * <pre>
     * Execute information for pool reward distribution
     * </pre>
     *
     * <code>repeated uint64 pool_ids = 1 [json_name = "poolIds"];</code>
     * @return The count of poolIds.
     */
    public int getPoolIdsCount() {
      return poolIds_.size();
    }
    /**
     * <pre>
     * Execute information for pool reward distribution
     * </pre>
     *
     * <code>repeated uint64 pool_ids = 1 [json_name = "poolIds"];</code>
     * @param index The index of the element to return.
     * @return The poolIds at the given index.
     */
    public long getPoolIds(int index) {
      return poolIds_.getLong(index);
    }
    /**
     * <pre>
     * Execute information for pool reward distribution
     * </pre>
     *
     * <code>repeated uint64 pool_ids = 1 [json_name = "poolIds"];</code>
     * @param index The index to set the value at.
     * @param value The poolIds to set.
     * @return This builder for chaining.
     */
    public Builder setPoolIds(
        int index, long value) {

      ensurePoolIdsIsMutable();
      poolIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Execute information for pool reward distribution
     * </pre>
     *
     * <code>repeated uint64 pool_ids = 1 [json_name = "poolIds"];</code>
     * @param value The poolIds to add.
     * @return This builder for chaining.
     */
    public Builder addPoolIds(long value) {

      ensurePoolIdsIsMutable();
      poolIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Execute information for pool reward distribution
     * </pre>
     *
     * <code>repeated uint64 pool_ids = 1 [json_name = "poolIds"];</code>
     * @param values The poolIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllPoolIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensurePoolIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, poolIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Execute information for pool reward distribution
     * </pre>
     *
     * <code>repeated uint64 pool_ids = 1 [json_name = "poolIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolIds() {
      poolIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:panacea.datapool.v2alpha1.InstantRevenueDistribution)
  }

  // @@protoc_insertion_point(class_scope:panacea.datapool.v2alpha1.InstantRevenueDistribution)
  private static final com.panacea.datapool.v2alpha1.InstantRevenueDistribution DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.panacea.datapool.v2alpha1.InstantRevenueDistribution();
  }

  public static com.panacea.datapool.v2alpha1.InstantRevenueDistribution getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstantRevenueDistribution>
      PARSER = new com.google.protobuf.AbstractParser<InstantRevenueDistribution>() {
    @java.lang.Override
    public InstantRevenueDistribution parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstantRevenueDistribution> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstantRevenueDistribution> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.panacea.datapool.v2alpha1.InstantRevenueDistribution getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

