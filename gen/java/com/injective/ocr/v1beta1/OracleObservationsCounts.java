// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/ocr/v1beta1/ocr.proto

package com.injective.ocr.v1beta1;

/**
 * Protobuf type {@code injective.ocr.v1beta1.OracleObservationsCounts}
 */
public final class OracleObservationsCounts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.ocr.v1beta1.OracleObservationsCounts)
    OracleObservationsCountsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OracleObservationsCounts.newBuilder() to construct.
  private OracleObservationsCounts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OracleObservationsCounts() {
    counts_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OracleObservationsCounts();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.ocr.v1beta1.OcrProto.internal_static_injective_ocr_v1beta1_OracleObservationsCounts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.ocr.v1beta1.OcrProto.internal_static_injective_ocr_v1beta1_OracleObservationsCounts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.ocr.v1beta1.OracleObservationsCounts.class, com.injective.ocr.v1beta1.OracleObservationsCounts.Builder.class);
  }

  public static final int COUNTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList counts_;
  /**
   * <code>repeated uint32 counts = 1 [json_name = "counts"];</code>
   * @return A list containing the counts.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getCountsList() {
    return counts_;
  }
  /**
   * <code>repeated uint32 counts = 1 [json_name = "counts"];</code>
   * @return The count of counts.
   */
  public int getCountsCount() {
    return counts_.size();
  }
  /**
   * <code>repeated uint32 counts = 1 [json_name = "counts"];</code>
   * @param index The index of the element to return.
   * @return The counts at the given index.
   */
  public int getCounts(int index) {
    return counts_.getInt(index);
  }
  private int countsMemoizedSerializedSize = -1;

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
    if (getCountsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(countsMemoizedSerializedSize);
    }
    for (int i = 0; i < counts_.size(); i++) {
      output.writeUInt32NoTag(counts_.getInt(i));
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
      for (int i = 0; i < counts_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(counts_.getInt(i));
      }
      size += dataSize;
      if (!getCountsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      countsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.injective.ocr.v1beta1.OracleObservationsCounts)) {
      return super.equals(obj);
    }
    com.injective.ocr.v1beta1.OracleObservationsCounts other = (com.injective.ocr.v1beta1.OracleObservationsCounts) obj;

    if (!getCountsList()
        .equals(other.getCountsList())) return false;
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
    if (getCountsCount() > 0) {
      hash = (37 * hash) + COUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getCountsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.ocr.v1beta1.OracleObservationsCounts parseFrom(
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
  public static Builder newBuilder(com.injective.ocr.v1beta1.OracleObservationsCounts prototype) {
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
   * Protobuf type {@code injective.ocr.v1beta1.OracleObservationsCounts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.ocr.v1beta1.OracleObservationsCounts)
      com.injective.ocr.v1beta1.OracleObservationsCountsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.ocr.v1beta1.OcrProto.internal_static_injective_ocr_v1beta1_OracleObservationsCounts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.ocr.v1beta1.OcrProto.internal_static_injective_ocr_v1beta1_OracleObservationsCounts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.ocr.v1beta1.OracleObservationsCounts.class, com.injective.ocr.v1beta1.OracleObservationsCounts.Builder.class);
    }

    // Construct using com.injective.ocr.v1beta1.OracleObservationsCounts.newBuilder()
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
      counts_ = emptyIntList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.ocr.v1beta1.OcrProto.internal_static_injective_ocr_v1beta1_OracleObservationsCounts_descriptor;
    }

    @java.lang.Override
    public com.injective.ocr.v1beta1.OracleObservationsCounts getDefaultInstanceForType() {
      return com.injective.ocr.v1beta1.OracleObservationsCounts.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.ocr.v1beta1.OracleObservationsCounts build() {
      com.injective.ocr.v1beta1.OracleObservationsCounts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.ocr.v1beta1.OracleObservationsCounts buildPartial() {
      com.injective.ocr.v1beta1.OracleObservationsCounts result = new com.injective.ocr.v1beta1.OracleObservationsCounts(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.injective.ocr.v1beta1.OracleObservationsCounts result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        counts_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.counts_ = counts_;
    }

    private void buildPartial0(com.injective.ocr.v1beta1.OracleObservationsCounts result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.ocr.v1beta1.OracleObservationsCounts) {
        return mergeFrom((com.injective.ocr.v1beta1.OracleObservationsCounts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.ocr.v1beta1.OracleObservationsCounts other) {
      if (other == com.injective.ocr.v1beta1.OracleObservationsCounts.getDefaultInstance()) return this;
      if (!other.counts_.isEmpty()) {
        if (counts_.isEmpty()) {
          counts_ = other.counts_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCountsIsMutable();
          counts_.addAll(other.counts_);
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
              int v = input.readUInt32();
              ensureCountsIsMutable();
              counts_.addInt(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureCountsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                counts_.addInt(input.readUInt32());
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

    private com.google.protobuf.Internal.IntList counts_ = emptyIntList();
    private void ensureCountsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        counts_ = mutableCopy(counts_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated uint32 counts = 1 [json_name = "counts"];</code>
     * @return A list containing the counts.
     */
    public java.util.List<java.lang.Integer>
        getCountsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(counts_) : counts_;
    }
    /**
     * <code>repeated uint32 counts = 1 [json_name = "counts"];</code>
     * @return The count of counts.
     */
    public int getCountsCount() {
      return counts_.size();
    }
    /**
     * <code>repeated uint32 counts = 1 [json_name = "counts"];</code>
     * @param index The index of the element to return.
     * @return The counts at the given index.
     */
    public int getCounts(int index) {
      return counts_.getInt(index);
    }
    /**
     * <code>repeated uint32 counts = 1 [json_name = "counts"];</code>
     * @param index The index to set the value at.
     * @param value The counts to set.
     * @return This builder for chaining.
     */
    public Builder setCounts(
        int index, int value) {

      ensureCountsIsMutable();
      counts_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 counts = 1 [json_name = "counts"];</code>
     * @param value The counts to add.
     * @return This builder for chaining.
     */
    public Builder addCounts(int value) {

      ensureCountsIsMutable();
      counts_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 counts = 1 [json_name = "counts"];</code>
     * @param values The counts to add.
     * @return This builder for chaining.
     */
    public Builder addAllCounts(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureCountsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, counts_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 counts = 1 [json_name = "counts"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCounts() {
      counts_ = emptyIntList();
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


    // @@protoc_insertion_point(builder_scope:injective.ocr.v1beta1.OracleObservationsCounts)
  }

  // @@protoc_insertion_point(class_scope:injective.ocr.v1beta1.OracleObservationsCounts)
  private static final com.injective.ocr.v1beta1.OracleObservationsCounts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.ocr.v1beta1.OracleObservationsCounts();
  }

  public static com.injective.ocr.v1beta1.OracleObservationsCounts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OracleObservationsCounts>
      PARSER = new com.google.protobuf.AbstractParser<OracleObservationsCounts>() {
    @java.lang.Override
    public OracleObservationsCounts parsePartialFrom(
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

  public static com.google.protobuf.Parser<OracleObservationsCounts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OracleObservationsCounts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.ocr.v1beta1.OracleObservationsCounts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

