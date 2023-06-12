// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/superfluid/superfluid.proto

package com.osmosis.superfluid;

/**
 * Protobuf type {@code osmosis.superfluid.UnpoolWhitelistedPools}
 */
public final class UnpoolWhitelistedPools extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.superfluid.UnpoolWhitelistedPools)
    UnpoolWhitelistedPoolsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnpoolWhitelistedPools.newBuilder() to construct.
  private UnpoolWhitelistedPools(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnpoolWhitelistedPools() {
    ids_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnpoolWhitelistedPools();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.superfluid.SuperfluidProto.internal_static_osmosis_superfluid_UnpoolWhitelistedPools_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.superfluid.SuperfluidProto.internal_static_osmosis_superfluid_UnpoolWhitelistedPools_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.superfluid.UnpoolWhitelistedPools.class, com.osmosis.superfluid.UnpoolWhitelistedPools.Builder.class);
  }

  public static final int IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList ids_;
  /**
   * <code>repeated uint64 ids = 1 [json_name = "ids"];</code>
   * @return A list containing the ids.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getIdsList() {
    return ids_;
  }
  /**
   * <code>repeated uint64 ids = 1 [json_name = "ids"];</code>
   * @return The count of ids.
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <code>repeated uint64 ids = 1 [json_name = "ids"];</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  public long getIds(int index) {
    return ids_.getLong(index);
  }
  private int idsMemoizedSerializedSize = -1;

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
    if (getIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(idsMemoizedSerializedSize);
    }
    for (int i = 0; i < ids_.size(); i++) {
      output.writeUInt64NoTag(ids_.getLong(i));
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
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(ids_.getLong(i));
      }
      size += dataSize;
      if (!getIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      idsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.osmosis.superfluid.UnpoolWhitelistedPools)) {
      return super.equals(obj);
    }
    com.osmosis.superfluid.UnpoolWhitelistedPools other = (com.osmosis.superfluid.UnpoolWhitelistedPools) obj;

    if (!getIdsList()
        .equals(other.getIdsList())) return false;
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
    if (getIdsCount() > 0) {
      hash = (37 * hash) + IDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.superfluid.UnpoolWhitelistedPools parseFrom(
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
  public static Builder newBuilder(com.osmosis.superfluid.UnpoolWhitelistedPools prototype) {
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
   * Protobuf type {@code osmosis.superfluid.UnpoolWhitelistedPools}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.superfluid.UnpoolWhitelistedPools)
      com.osmosis.superfluid.UnpoolWhitelistedPoolsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.superfluid.SuperfluidProto.internal_static_osmosis_superfluid_UnpoolWhitelistedPools_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.superfluid.SuperfluidProto.internal_static_osmosis_superfluid_UnpoolWhitelistedPools_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.superfluid.UnpoolWhitelistedPools.class, com.osmosis.superfluid.UnpoolWhitelistedPools.Builder.class);
    }

    // Construct using com.osmosis.superfluid.UnpoolWhitelistedPools.newBuilder()
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
      ids_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.superfluid.SuperfluidProto.internal_static_osmosis_superfluid_UnpoolWhitelistedPools_descriptor;
    }

    @java.lang.Override
    public com.osmosis.superfluid.UnpoolWhitelistedPools getDefaultInstanceForType() {
      return com.osmosis.superfluid.UnpoolWhitelistedPools.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.superfluid.UnpoolWhitelistedPools build() {
      com.osmosis.superfluid.UnpoolWhitelistedPools result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.superfluid.UnpoolWhitelistedPools buildPartial() {
      com.osmosis.superfluid.UnpoolWhitelistedPools result = new com.osmosis.superfluid.UnpoolWhitelistedPools(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.osmosis.superfluid.UnpoolWhitelistedPools result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        ids_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ids_ = ids_;
    }

    private void buildPartial0(com.osmosis.superfluid.UnpoolWhitelistedPools result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.superfluid.UnpoolWhitelistedPools) {
        return mergeFrom((com.osmosis.superfluid.UnpoolWhitelistedPools)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.superfluid.UnpoolWhitelistedPools other) {
      if (other == com.osmosis.superfluid.UnpoolWhitelistedPools.getDefaultInstance()) return this;
      if (!other.ids_.isEmpty()) {
        if (ids_.isEmpty()) {
          ids_ = other.ids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdsIsMutable();
          ids_.addAll(other.ids_);
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
              ensureIdsIsMutable();
              ids_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                ids_.addLong(input.readUInt64());
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

    private com.google.protobuf.Internal.LongList ids_ = emptyLongList();
    private void ensureIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ids_ = mutableCopy(ids_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated uint64 ids = 1 [json_name = "ids"];</code>
     * @return A list containing the ids.
     */
    public java.util.List<java.lang.Long>
        getIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(ids_) : ids_;
    }
    /**
     * <code>repeated uint64 ids = 1 [json_name = "ids"];</code>
     * @return The count of ids.
     */
    public int getIdsCount() {
      return ids_.size();
    }
    /**
     * <code>repeated uint64 ids = 1 [json_name = "ids"];</code>
     * @param index The index of the element to return.
     * @return The ids at the given index.
     */
    public long getIds(int index) {
      return ids_.getLong(index);
    }
    /**
     * <code>repeated uint64 ids = 1 [json_name = "ids"];</code>
     * @param index The index to set the value at.
     * @param value The ids to set.
     * @return This builder for chaining.
     */
    public Builder setIds(
        int index, long value) {

      ensureIdsIsMutable();
      ids_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 ids = 1 [json_name = "ids"];</code>
     * @param value The ids to add.
     * @return This builder for chaining.
     */
    public Builder addIds(long value) {

      ensureIdsIsMutable();
      ids_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 ids = 1 [json_name = "ids"];</code>
     * @param values The ids to add.
     * @return This builder for chaining.
     */
    public Builder addAllIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ids_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 ids = 1 [json_name = "ids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIds() {
      ids_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:osmosis.superfluid.UnpoolWhitelistedPools)
  }

  // @@protoc_insertion_point(class_scope:osmosis.superfluid.UnpoolWhitelistedPools)
  private static final com.osmosis.superfluid.UnpoolWhitelistedPools DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.superfluid.UnpoolWhitelistedPools();
  }

  public static com.osmosis.superfluid.UnpoolWhitelistedPools getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnpoolWhitelistedPools>
      PARSER = new com.google.protobuf.AbstractParser<UnpoolWhitelistedPools>() {
    @java.lang.Override
    public UnpoolWhitelistedPools parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnpoolWhitelistedPools> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnpoolWhitelistedPools> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.superfluid.UnpoolWhitelistedPools getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

