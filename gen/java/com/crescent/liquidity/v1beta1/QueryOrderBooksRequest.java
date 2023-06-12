// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/liquidity/v1beta1/query.proto

package com.crescent.liquidity.v1beta1;

/**
 * <pre>
 * QueryOrderBooksRequest is request type for the Query/OrderBooks RPC method.
 * </pre>
 *
 * Protobuf type {@code crescent.liquidity.v1beta1.QueryOrderBooksRequest}
 */
public final class QueryOrderBooksRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.liquidity.v1beta1.QueryOrderBooksRequest)
    QueryOrderBooksRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryOrderBooksRequest.newBuilder() to construct.
  private QueryOrderBooksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryOrderBooksRequest() {
    pairIds_ = emptyLongList();
    priceUnitPowers_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryOrderBooksRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.liquidity.v1beta1.QueryProto.internal_static_crescent_liquidity_v1beta1_QueryOrderBooksRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.liquidity.v1beta1.QueryProto.internal_static_crescent_liquidity_v1beta1_QueryOrderBooksRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.liquidity.v1beta1.QueryOrderBooksRequest.class, com.crescent.liquidity.v1beta1.QueryOrderBooksRequest.Builder.class);
  }

  public static final int PAIR_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList pairIds_;
  /**
   * <code>repeated uint64 pair_ids = 1 [json_name = "pairIds"];</code>
   * @return A list containing the pairIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getPairIdsList() {
    return pairIds_;
  }
  /**
   * <code>repeated uint64 pair_ids = 1 [json_name = "pairIds"];</code>
   * @return The count of pairIds.
   */
  public int getPairIdsCount() {
    return pairIds_.size();
  }
  /**
   * <code>repeated uint64 pair_ids = 1 [json_name = "pairIds"];</code>
   * @param index The index of the element to return.
   * @return The pairIds at the given index.
   */
  public long getPairIds(int index) {
    return pairIds_.getLong(index);
  }
  private int pairIdsMemoizedSerializedSize = -1;

  public static final int PRICE_UNIT_POWERS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList priceUnitPowers_;
  /**
   * <code>repeated uint32 price_unit_powers = 2 [json_name = "priceUnitPowers"];</code>
   * @return A list containing the priceUnitPowers.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getPriceUnitPowersList() {
    return priceUnitPowers_;
  }
  /**
   * <code>repeated uint32 price_unit_powers = 2 [json_name = "priceUnitPowers"];</code>
   * @return The count of priceUnitPowers.
   */
  public int getPriceUnitPowersCount() {
    return priceUnitPowers_.size();
  }
  /**
   * <code>repeated uint32 price_unit_powers = 2 [json_name = "priceUnitPowers"];</code>
   * @param index The index of the element to return.
   * @return The priceUnitPowers at the given index.
   */
  public int getPriceUnitPowers(int index) {
    return priceUnitPowers_.getInt(index);
  }
  private int priceUnitPowersMemoizedSerializedSize = -1;

  public static final int NUM_TICKS_FIELD_NUMBER = 3;
  private int numTicks_ = 0;
  /**
   * <code>uint32 num_ticks = 3 [json_name = "numTicks"];</code>
   * @return The numTicks.
   */
  @java.lang.Override
  public int getNumTicks() {
    return numTicks_;
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
    getSerializedSize();
    if (getPairIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(pairIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < pairIds_.size(); i++) {
      output.writeUInt64NoTag(pairIds_.getLong(i));
    }
    if (getPriceUnitPowersList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(priceUnitPowersMemoizedSerializedSize);
    }
    for (int i = 0; i < priceUnitPowers_.size(); i++) {
      output.writeUInt32NoTag(priceUnitPowers_.getInt(i));
    }
    if (numTicks_ != 0) {
      output.writeUInt32(3, numTicks_);
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
      for (int i = 0; i < pairIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(pairIds_.getLong(i));
      }
      size += dataSize;
      if (!getPairIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      pairIdsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < priceUnitPowers_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(priceUnitPowers_.getInt(i));
      }
      size += dataSize;
      if (!getPriceUnitPowersList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      priceUnitPowersMemoizedSerializedSize = dataSize;
    }
    if (numTicks_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, numTicks_);
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
    if (!(obj instanceof com.crescent.liquidity.v1beta1.QueryOrderBooksRequest)) {
      return super.equals(obj);
    }
    com.crescent.liquidity.v1beta1.QueryOrderBooksRequest other = (com.crescent.liquidity.v1beta1.QueryOrderBooksRequest) obj;

    if (!getPairIdsList()
        .equals(other.getPairIdsList())) return false;
    if (!getPriceUnitPowersList()
        .equals(other.getPriceUnitPowersList())) return false;
    if (getNumTicks()
        != other.getNumTicks()) return false;
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
    if (getPairIdsCount() > 0) {
      hash = (37 * hash) + PAIR_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getPairIdsList().hashCode();
    }
    if (getPriceUnitPowersCount() > 0) {
      hash = (37 * hash) + PRICE_UNIT_POWERS_FIELD_NUMBER;
      hash = (53 * hash) + getPriceUnitPowersList().hashCode();
    }
    hash = (37 * hash) + NUM_TICKS_FIELD_NUMBER;
    hash = (53 * hash) + getNumTicks();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest parseFrom(
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
  public static Builder newBuilder(com.crescent.liquidity.v1beta1.QueryOrderBooksRequest prototype) {
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
   * QueryOrderBooksRequest is request type for the Query/OrderBooks RPC method.
   * </pre>
   *
   * Protobuf type {@code crescent.liquidity.v1beta1.QueryOrderBooksRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.liquidity.v1beta1.QueryOrderBooksRequest)
      com.crescent.liquidity.v1beta1.QueryOrderBooksRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.liquidity.v1beta1.QueryProto.internal_static_crescent_liquidity_v1beta1_QueryOrderBooksRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.liquidity.v1beta1.QueryProto.internal_static_crescent_liquidity_v1beta1_QueryOrderBooksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.liquidity.v1beta1.QueryOrderBooksRequest.class, com.crescent.liquidity.v1beta1.QueryOrderBooksRequest.Builder.class);
    }

    // Construct using com.crescent.liquidity.v1beta1.QueryOrderBooksRequest.newBuilder()
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
      pairIds_ = emptyLongList();
      priceUnitPowers_ = emptyIntList();
      numTicks_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.crescent.liquidity.v1beta1.QueryProto.internal_static_crescent_liquidity_v1beta1_QueryOrderBooksRequest_descriptor;
    }

    @java.lang.Override
    public com.crescent.liquidity.v1beta1.QueryOrderBooksRequest getDefaultInstanceForType() {
      return com.crescent.liquidity.v1beta1.QueryOrderBooksRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.liquidity.v1beta1.QueryOrderBooksRequest build() {
      com.crescent.liquidity.v1beta1.QueryOrderBooksRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.liquidity.v1beta1.QueryOrderBooksRequest buildPartial() {
      com.crescent.liquidity.v1beta1.QueryOrderBooksRequest result = new com.crescent.liquidity.v1beta1.QueryOrderBooksRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.crescent.liquidity.v1beta1.QueryOrderBooksRequest result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        pairIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.pairIds_ = pairIds_;
      if (((bitField0_ & 0x00000002) != 0)) {
        priceUnitPowers_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.priceUnitPowers_ = priceUnitPowers_;
    }

    private void buildPartial0(com.crescent.liquidity.v1beta1.QueryOrderBooksRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.numTicks_ = numTicks_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.liquidity.v1beta1.QueryOrderBooksRequest) {
        return mergeFrom((com.crescent.liquidity.v1beta1.QueryOrderBooksRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.liquidity.v1beta1.QueryOrderBooksRequest other) {
      if (other == com.crescent.liquidity.v1beta1.QueryOrderBooksRequest.getDefaultInstance()) return this;
      if (!other.pairIds_.isEmpty()) {
        if (pairIds_.isEmpty()) {
          pairIds_ = other.pairIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePairIdsIsMutable();
          pairIds_.addAll(other.pairIds_);
        }
        onChanged();
      }
      if (!other.priceUnitPowers_.isEmpty()) {
        if (priceUnitPowers_.isEmpty()) {
          priceUnitPowers_ = other.priceUnitPowers_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensurePriceUnitPowersIsMutable();
          priceUnitPowers_.addAll(other.priceUnitPowers_);
        }
        onChanged();
      }
      if (other.getNumTicks() != 0) {
        setNumTicks(other.getNumTicks());
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
              ensurePairIdsIsMutable();
              pairIds_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensurePairIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                pairIds_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 16: {
              int v = input.readUInt32();
              ensurePriceUnitPowersIsMutable();
              priceUnitPowers_.addInt(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensurePriceUnitPowersIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                priceUnitPowers_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            } // case 18
            case 24: {
              numTicks_ = input.readUInt32();
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

    private com.google.protobuf.Internal.LongList pairIds_ = emptyLongList();
    private void ensurePairIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pairIds_ = mutableCopy(pairIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated uint64 pair_ids = 1 [json_name = "pairIds"];</code>
     * @return A list containing the pairIds.
     */
    public java.util.List<java.lang.Long>
        getPairIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(pairIds_) : pairIds_;
    }
    /**
     * <code>repeated uint64 pair_ids = 1 [json_name = "pairIds"];</code>
     * @return The count of pairIds.
     */
    public int getPairIdsCount() {
      return pairIds_.size();
    }
    /**
     * <code>repeated uint64 pair_ids = 1 [json_name = "pairIds"];</code>
     * @param index The index of the element to return.
     * @return The pairIds at the given index.
     */
    public long getPairIds(int index) {
      return pairIds_.getLong(index);
    }
    /**
     * <code>repeated uint64 pair_ids = 1 [json_name = "pairIds"];</code>
     * @param index The index to set the value at.
     * @param value The pairIds to set.
     * @return This builder for chaining.
     */
    public Builder setPairIds(
        int index, long value) {

      ensurePairIdsIsMutable();
      pairIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 pair_ids = 1 [json_name = "pairIds"];</code>
     * @param value The pairIds to add.
     * @return This builder for chaining.
     */
    public Builder addPairIds(long value) {

      ensurePairIdsIsMutable();
      pairIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 pair_ids = 1 [json_name = "pairIds"];</code>
     * @param values The pairIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllPairIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensurePairIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, pairIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 pair_ids = 1 [json_name = "pairIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPairIds() {
      pairIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList priceUnitPowers_ = emptyIntList();
    private void ensurePriceUnitPowersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        priceUnitPowers_ = mutableCopy(priceUnitPowers_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated uint32 price_unit_powers = 2 [json_name = "priceUnitPowers"];</code>
     * @return A list containing the priceUnitPowers.
     */
    public java.util.List<java.lang.Integer>
        getPriceUnitPowersList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(priceUnitPowers_) : priceUnitPowers_;
    }
    /**
     * <code>repeated uint32 price_unit_powers = 2 [json_name = "priceUnitPowers"];</code>
     * @return The count of priceUnitPowers.
     */
    public int getPriceUnitPowersCount() {
      return priceUnitPowers_.size();
    }
    /**
     * <code>repeated uint32 price_unit_powers = 2 [json_name = "priceUnitPowers"];</code>
     * @param index The index of the element to return.
     * @return The priceUnitPowers at the given index.
     */
    public int getPriceUnitPowers(int index) {
      return priceUnitPowers_.getInt(index);
    }
    /**
     * <code>repeated uint32 price_unit_powers = 2 [json_name = "priceUnitPowers"];</code>
     * @param index The index to set the value at.
     * @param value The priceUnitPowers to set.
     * @return This builder for chaining.
     */
    public Builder setPriceUnitPowers(
        int index, int value) {

      ensurePriceUnitPowersIsMutable();
      priceUnitPowers_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 price_unit_powers = 2 [json_name = "priceUnitPowers"];</code>
     * @param value The priceUnitPowers to add.
     * @return This builder for chaining.
     */
    public Builder addPriceUnitPowers(int value) {

      ensurePriceUnitPowersIsMutable();
      priceUnitPowers_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 price_unit_powers = 2 [json_name = "priceUnitPowers"];</code>
     * @param values The priceUnitPowers to add.
     * @return This builder for chaining.
     */
    public Builder addAllPriceUnitPowers(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensurePriceUnitPowersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, priceUnitPowers_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 price_unit_powers = 2 [json_name = "priceUnitPowers"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPriceUnitPowers() {
      priceUnitPowers_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private int numTicks_ ;
    /**
     * <code>uint32 num_ticks = 3 [json_name = "numTicks"];</code>
     * @return The numTicks.
     */
    @java.lang.Override
    public int getNumTicks() {
      return numTicks_;
    }
    /**
     * <code>uint32 num_ticks = 3 [json_name = "numTicks"];</code>
     * @param value The numTicks to set.
     * @return This builder for chaining.
     */
    public Builder setNumTicks(int value) {

      numTicks_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 num_ticks = 3 [json_name = "numTicks"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumTicks() {
      bitField0_ = (bitField0_ & ~0x00000004);
      numTicks_ = 0;
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


    // @@protoc_insertion_point(builder_scope:crescent.liquidity.v1beta1.QueryOrderBooksRequest)
  }

  // @@protoc_insertion_point(class_scope:crescent.liquidity.v1beta1.QueryOrderBooksRequest)
  private static final com.crescent.liquidity.v1beta1.QueryOrderBooksRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.liquidity.v1beta1.QueryOrderBooksRequest();
  }

  public static com.crescent.liquidity.v1beta1.QueryOrderBooksRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryOrderBooksRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryOrderBooksRequest>() {
    @java.lang.Override
    public QueryOrderBooksRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryOrderBooksRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryOrderBooksRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.liquidity.v1beta1.QueryOrderBooksRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

