// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/concentrated-liquidity/tx.proto

package com.osmosis.concentratedliquidity.v1beta1;

/**
 * <pre>
 * ===================== MsgCollectIncentives
 * </pre>
 *
 * Protobuf type {@code osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives}
 */
public final class MsgCollectIncentives extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives)
    MsgCollectIncentivesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCollectIncentives.newBuilder() to construct.
  private MsgCollectIncentives(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCollectIncentives() {
    positionIds_ = emptyLongList();
    sender_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCollectIncentives();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.concentratedliquidity.v1beta1.TxProto.internal_static_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentives_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.concentratedliquidity.v1beta1.TxProto.internal_static_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentives_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives.class, com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives.Builder.class);
  }

  public static final int POSITION_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList positionIds_;
  /**
   * <code>repeated uint64 position_ids = 1 [json_name = "positionIds", (.gogoproto.moretags) = "yaml:&#92;"position_ids&#92;""];</code>
   * @return A list containing the positionIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getPositionIdsList() {
    return positionIds_;
  }
  /**
   * <code>repeated uint64 position_ids = 1 [json_name = "positionIds", (.gogoproto.moretags) = "yaml:&#92;"position_ids&#92;""];</code>
   * @return The count of positionIds.
   */
  public int getPositionIdsCount() {
    return positionIds_.size();
  }
  /**
   * <code>repeated uint64 position_ids = 1 [json_name = "positionIds", (.gogoproto.moretags) = "yaml:&#92;"position_ids&#92;""];</code>
   * @param index The index of the element to return.
   * @return The positionIds at the given index.
   */
  public long getPositionIds(int index) {
    return positionIds_.getLong(index);
  }
  private int positionIdsMemoizedSerializedSize = -1;

  public static final int SENDER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sender_ = "";
  /**
   * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The sender.
   */
  @java.lang.Override
  public java.lang.String getSender() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sender_ = s;
      return s;
    }
  }
  /**
   * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The bytes for sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSenderBytes() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sender_ = b;
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
    getSerializedSize();
    if (getPositionIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(positionIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < positionIds_.size(); i++) {
      output.writeUInt64NoTag(positionIds_.getLong(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sender_);
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
      for (int i = 0; i < positionIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(positionIds_.getLong(i));
      }
      size += dataSize;
      if (!getPositionIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      positionIdsMemoizedSerializedSize = dataSize;
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sender_);
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
    if (!(obj instanceof com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives)) {
      return super.equals(obj);
    }
    com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives other = (com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives) obj;

    if (!getPositionIdsList()
        .equals(other.getPositionIdsList())) return false;
    if (!getSender()
        .equals(other.getSender())) return false;
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
    if (getPositionIdsCount() > 0) {
      hash = (37 * hash) + POSITION_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getPositionIdsList().hashCode();
    }
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives parseFrom(
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
  public static Builder newBuilder(com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives prototype) {
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
   * ===================== MsgCollectIncentives
   * </pre>
   *
   * Protobuf type {@code osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives)
      com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentivesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.concentratedliquidity.v1beta1.TxProto.internal_static_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentives_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.concentratedliquidity.v1beta1.TxProto.internal_static_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentives_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives.class, com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives.Builder.class);
    }

    // Construct using com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives.newBuilder()
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
      positionIds_ = emptyLongList();
      sender_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.concentratedliquidity.v1beta1.TxProto.internal_static_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentives_descriptor;
    }

    @java.lang.Override
    public com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives getDefaultInstanceForType() {
      return com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives build() {
      com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives buildPartial() {
      com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives result = new com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        positionIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.positionIds_ = positionIds_;
    }

    private void buildPartial0(com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sender_ = sender_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives) {
        return mergeFrom((com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives other) {
      if (other == com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives.getDefaultInstance()) return this;
      if (!other.positionIds_.isEmpty()) {
        if (positionIds_.isEmpty()) {
          positionIds_ = other.positionIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePositionIdsIsMutable();
          positionIds_.addAll(other.positionIds_);
        }
        onChanged();
      }
      if (!other.getSender().isEmpty()) {
        sender_ = other.sender_;
        bitField0_ |= 0x00000002;
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
              ensurePositionIdsIsMutable();
              positionIds_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensurePositionIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                positionIds_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 18: {
              sender_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private com.google.protobuf.Internal.LongList positionIds_ = emptyLongList();
    private void ensurePositionIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        positionIds_ = mutableCopy(positionIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated uint64 position_ids = 1 [json_name = "positionIds", (.gogoproto.moretags) = "yaml:&#92;"position_ids&#92;""];</code>
     * @return A list containing the positionIds.
     */
    public java.util.List<java.lang.Long>
        getPositionIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(positionIds_) : positionIds_;
    }
    /**
     * <code>repeated uint64 position_ids = 1 [json_name = "positionIds", (.gogoproto.moretags) = "yaml:&#92;"position_ids&#92;""];</code>
     * @return The count of positionIds.
     */
    public int getPositionIdsCount() {
      return positionIds_.size();
    }
    /**
     * <code>repeated uint64 position_ids = 1 [json_name = "positionIds", (.gogoproto.moretags) = "yaml:&#92;"position_ids&#92;""];</code>
     * @param index The index of the element to return.
     * @return The positionIds at the given index.
     */
    public long getPositionIds(int index) {
      return positionIds_.getLong(index);
    }
    /**
     * <code>repeated uint64 position_ids = 1 [json_name = "positionIds", (.gogoproto.moretags) = "yaml:&#92;"position_ids&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The positionIds to set.
     * @return This builder for chaining.
     */
    public Builder setPositionIds(
        int index, long value) {

      ensurePositionIdsIsMutable();
      positionIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 position_ids = 1 [json_name = "positionIds", (.gogoproto.moretags) = "yaml:&#92;"position_ids&#92;""];</code>
     * @param value The positionIds to add.
     * @return This builder for chaining.
     */
    public Builder addPositionIds(long value) {

      ensurePositionIdsIsMutable();
      positionIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 position_ids = 1 [json_name = "positionIds", (.gogoproto.moretags) = "yaml:&#92;"position_ids&#92;""];</code>
     * @param values The positionIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllPositionIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensurePositionIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, positionIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 position_ids = 1 [json_name = "positionIds", (.gogoproto.moretags) = "yaml:&#92;"position_ids&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearPositionIds() {
      positionIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object sender_ = "";
    /**
     * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     * @return The sender.
     */
    public java.lang.String getSender() {
      java.lang.Object ref = sender_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     * @return The bytes for sender.
     */
    public com.google.protobuf.ByteString
        getSenderBytes() {
      java.lang.Object ref = sender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      sender_ = getDefaultInstance().getSender();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 2 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     * @param value The bytes for sender to set.
     * @return This builder for chaining.
     */
    public Builder setSenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sender_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives)
  }

  // @@protoc_insertion_point(class_scope:osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives)
  private static final com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives();
  }

  public static com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCollectIncentives>
      PARSER = new com.google.protobuf.AbstractParser<MsgCollectIncentives>() {
    @java.lang.Override
    public MsgCollectIncentives parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCollectIncentives> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCollectIncentives> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

