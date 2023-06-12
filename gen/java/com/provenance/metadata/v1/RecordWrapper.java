// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/query.proto

package com.provenance.metadata.v1;

/**
 * <pre>
 * RecordWrapper contains a single record and some extra identifiers for it.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.RecordWrapper}
 */
public final class RecordWrapper extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.RecordWrapper)
    RecordWrapperOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordWrapper.newBuilder() to construct.
  private RecordWrapper(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordWrapper() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecordWrapper();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.QueryProto.internal_static_provenance_metadata_v1_RecordWrapper_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.QueryProto.internal_static_provenance_metadata_v1_RecordWrapper_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.RecordWrapper.class, com.provenance.metadata.v1.RecordWrapper.Builder.class);
  }

  public static final int RECORD_FIELD_NUMBER = 1;
  private com.provenance.metadata.v1.Record record_;
  /**
   * <pre>
   * record is the on-chain record message.
   * </pre>
   *
   * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
   * @return Whether the record field is set.
   */
  @java.lang.Override
  public boolean hasRecord() {
    return record_ != null;
  }
  /**
   * <pre>
   * record is the on-chain record message.
   * </pre>
   *
   * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
   * @return The record.
   */
  @java.lang.Override
  public com.provenance.metadata.v1.Record getRecord() {
    return record_ == null ? com.provenance.metadata.v1.Record.getDefaultInstance() : record_;
  }
  /**
   * <pre>
   * record is the on-chain record message.
   * </pre>
   *
   * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
   */
  @java.lang.Override
  public com.provenance.metadata.v1.RecordOrBuilder getRecordOrBuilder() {
    return record_ == null ? com.provenance.metadata.v1.Record.getDefaultInstance() : record_;
  }

  public static final int RECORD_ID_INFO_FIELD_NUMBER = 2;
  private com.provenance.metadata.v1.RecordIdInfo recordIdInfo_;
  /**
   * <pre>
   * record_id_info contains information about the id/address of the record.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
   * @return Whether the recordIdInfo field is set.
   */
  @java.lang.Override
  public boolean hasRecordIdInfo() {
    return recordIdInfo_ != null;
  }
  /**
   * <pre>
   * record_id_info contains information about the id/address of the record.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
   * @return The recordIdInfo.
   */
  @java.lang.Override
  public com.provenance.metadata.v1.RecordIdInfo getRecordIdInfo() {
    return recordIdInfo_ == null ? com.provenance.metadata.v1.RecordIdInfo.getDefaultInstance() : recordIdInfo_;
  }
  /**
   * <pre>
   * record_id_info contains information about the id/address of the record.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
   */
  @java.lang.Override
  public com.provenance.metadata.v1.RecordIdInfoOrBuilder getRecordIdInfoOrBuilder() {
    return recordIdInfo_ == null ? com.provenance.metadata.v1.RecordIdInfo.getDefaultInstance() : recordIdInfo_;
  }

  public static final int RECORD_SPEC_ID_INFO_FIELD_NUMBER = 3;
  private com.provenance.metadata.v1.RecordSpecIdInfo recordSpecIdInfo_;
  /**
   * <pre>
   * record_spec_id_info contains information about the id/address of the record specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
   * @return Whether the recordSpecIdInfo field is set.
   */
  @java.lang.Override
  public boolean hasRecordSpecIdInfo() {
    return recordSpecIdInfo_ != null;
  }
  /**
   * <pre>
   * record_spec_id_info contains information about the id/address of the record specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
   * @return The recordSpecIdInfo.
   */
  @java.lang.Override
  public com.provenance.metadata.v1.RecordSpecIdInfo getRecordSpecIdInfo() {
    return recordSpecIdInfo_ == null ? com.provenance.metadata.v1.RecordSpecIdInfo.getDefaultInstance() : recordSpecIdInfo_;
  }
  /**
   * <pre>
   * record_spec_id_info contains information about the id/address of the record specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
   */
  @java.lang.Override
  public com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder getRecordSpecIdInfoOrBuilder() {
    return recordSpecIdInfo_ == null ? com.provenance.metadata.v1.RecordSpecIdInfo.getDefaultInstance() : recordSpecIdInfo_;
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
    if (record_ != null) {
      output.writeMessage(1, getRecord());
    }
    if (recordIdInfo_ != null) {
      output.writeMessage(2, getRecordIdInfo());
    }
    if (recordSpecIdInfo_ != null) {
      output.writeMessage(3, getRecordSpecIdInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (record_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRecord());
    }
    if (recordIdInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRecordIdInfo());
    }
    if (recordSpecIdInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRecordSpecIdInfo());
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
    if (!(obj instanceof com.provenance.metadata.v1.RecordWrapper)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.RecordWrapper other = (com.provenance.metadata.v1.RecordWrapper) obj;

    if (hasRecord() != other.hasRecord()) return false;
    if (hasRecord()) {
      if (!getRecord()
          .equals(other.getRecord())) return false;
    }
    if (hasRecordIdInfo() != other.hasRecordIdInfo()) return false;
    if (hasRecordIdInfo()) {
      if (!getRecordIdInfo()
          .equals(other.getRecordIdInfo())) return false;
    }
    if (hasRecordSpecIdInfo() != other.hasRecordSpecIdInfo()) return false;
    if (hasRecordSpecIdInfo()) {
      if (!getRecordSpecIdInfo()
          .equals(other.getRecordSpecIdInfo())) return false;
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
    if (hasRecord()) {
      hash = (37 * hash) + RECORD_FIELD_NUMBER;
      hash = (53 * hash) + getRecord().hashCode();
    }
    if (hasRecordIdInfo()) {
      hash = (37 * hash) + RECORD_ID_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getRecordIdInfo().hashCode();
    }
    if (hasRecordSpecIdInfo()) {
      hash = (37 * hash) + RECORD_SPEC_ID_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getRecordSpecIdInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.RecordWrapper parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.RecordWrapper parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.RecordWrapper parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.RecordWrapper parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.RecordWrapper parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.RecordWrapper parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.RecordWrapper parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.RecordWrapper parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.RecordWrapper parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.RecordWrapper parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.RecordWrapper parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.RecordWrapper parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.RecordWrapper prototype) {
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
   * RecordWrapper contains a single record and some extra identifiers for it.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.RecordWrapper}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.RecordWrapper)
      com.provenance.metadata.v1.RecordWrapperOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.QueryProto.internal_static_provenance_metadata_v1_RecordWrapper_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.QueryProto.internal_static_provenance_metadata_v1_RecordWrapper_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.RecordWrapper.class, com.provenance.metadata.v1.RecordWrapper.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.RecordWrapper.newBuilder()
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
      record_ = null;
      if (recordBuilder_ != null) {
        recordBuilder_.dispose();
        recordBuilder_ = null;
      }
      recordIdInfo_ = null;
      if (recordIdInfoBuilder_ != null) {
        recordIdInfoBuilder_.dispose();
        recordIdInfoBuilder_ = null;
      }
      recordSpecIdInfo_ = null;
      if (recordSpecIdInfoBuilder_ != null) {
        recordSpecIdInfoBuilder_.dispose();
        recordSpecIdInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.QueryProto.internal_static_provenance_metadata_v1_RecordWrapper_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.RecordWrapper getDefaultInstanceForType() {
      return com.provenance.metadata.v1.RecordWrapper.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.RecordWrapper build() {
      com.provenance.metadata.v1.RecordWrapper result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.RecordWrapper buildPartial() {
      com.provenance.metadata.v1.RecordWrapper result = new com.provenance.metadata.v1.RecordWrapper(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.metadata.v1.RecordWrapper result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.record_ = recordBuilder_ == null
            ? record_
            : recordBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.recordIdInfo_ = recordIdInfoBuilder_ == null
            ? recordIdInfo_
            : recordIdInfoBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.recordSpecIdInfo_ = recordSpecIdInfoBuilder_ == null
            ? recordSpecIdInfo_
            : recordSpecIdInfoBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.RecordWrapper) {
        return mergeFrom((com.provenance.metadata.v1.RecordWrapper)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.RecordWrapper other) {
      if (other == com.provenance.metadata.v1.RecordWrapper.getDefaultInstance()) return this;
      if (other.hasRecord()) {
        mergeRecord(other.getRecord());
      }
      if (other.hasRecordIdInfo()) {
        mergeRecordIdInfo(other.getRecordIdInfo());
      }
      if (other.hasRecordSpecIdInfo()) {
        mergeRecordSpecIdInfo(other.getRecordSpecIdInfo());
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
            case 10: {
              input.readMessage(
                  getRecordFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRecordIdInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRecordSpecIdInfoFieldBuilder().getBuilder(),
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

    private com.provenance.metadata.v1.Record record_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.Record, com.provenance.metadata.v1.Record.Builder, com.provenance.metadata.v1.RecordOrBuilder> recordBuilder_;
    /**
     * <pre>
     * record is the on-chain record message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
     * @return Whether the record field is set.
     */
    public boolean hasRecord() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * record is the on-chain record message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
     * @return The record.
     */
    public com.provenance.metadata.v1.Record getRecord() {
      if (recordBuilder_ == null) {
        return record_ == null ? com.provenance.metadata.v1.Record.getDefaultInstance() : record_;
      } else {
        return recordBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * record is the on-chain record message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
     */
    public Builder setRecord(com.provenance.metadata.v1.Record value) {
      if (recordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        record_ = value;
      } else {
        recordBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record is the on-chain record message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
     */
    public Builder setRecord(
        com.provenance.metadata.v1.Record.Builder builderForValue) {
      if (recordBuilder_ == null) {
        record_ = builderForValue.build();
      } else {
        recordBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record is the on-chain record message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
     */
    public Builder mergeRecord(com.provenance.metadata.v1.Record value) {
      if (recordBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          record_ != null &&
          record_ != com.provenance.metadata.v1.Record.getDefaultInstance()) {
          getRecordBuilder().mergeFrom(value);
        } else {
          record_ = value;
        }
      } else {
        recordBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record is the on-chain record message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
     */
    public Builder clearRecord() {
      bitField0_ = (bitField0_ & ~0x00000001);
      record_ = null;
      if (recordBuilder_ != null) {
        recordBuilder_.dispose();
        recordBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record is the on-chain record message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
     */
    public com.provenance.metadata.v1.Record.Builder getRecordBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRecordFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * record is the on-chain record message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
     */
    public com.provenance.metadata.v1.RecordOrBuilder getRecordOrBuilder() {
      if (recordBuilder_ != null) {
        return recordBuilder_.getMessageOrBuilder();
      } else {
        return record_ == null ?
            com.provenance.metadata.v1.Record.getDefaultInstance() : record_;
      }
    }
    /**
     * <pre>
     * record is the on-chain record message.
     * </pre>
     *
     * <code>.provenance.metadata.v1.Record record = 1 [json_name = "record"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.Record, com.provenance.metadata.v1.Record.Builder, com.provenance.metadata.v1.RecordOrBuilder> 
        getRecordFieldBuilder() {
      if (recordBuilder_ == null) {
        recordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.metadata.v1.Record, com.provenance.metadata.v1.Record.Builder, com.provenance.metadata.v1.RecordOrBuilder>(
                getRecord(),
                getParentForChildren(),
                isClean());
        record_ = null;
      }
      return recordBuilder_;
    }

    private com.provenance.metadata.v1.RecordIdInfo recordIdInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.RecordIdInfo, com.provenance.metadata.v1.RecordIdInfo.Builder, com.provenance.metadata.v1.RecordIdInfoOrBuilder> recordIdInfoBuilder_;
    /**
     * <pre>
     * record_id_info contains information about the id/address of the record.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
     * @return Whether the recordIdInfo field is set.
     */
    public boolean hasRecordIdInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * record_id_info contains information about the id/address of the record.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
     * @return The recordIdInfo.
     */
    public com.provenance.metadata.v1.RecordIdInfo getRecordIdInfo() {
      if (recordIdInfoBuilder_ == null) {
        return recordIdInfo_ == null ? com.provenance.metadata.v1.RecordIdInfo.getDefaultInstance() : recordIdInfo_;
      } else {
        return recordIdInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * record_id_info contains information about the id/address of the record.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
     */
    public Builder setRecordIdInfo(com.provenance.metadata.v1.RecordIdInfo value) {
      if (recordIdInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recordIdInfo_ = value;
      } else {
        recordIdInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_id_info contains information about the id/address of the record.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
     */
    public Builder setRecordIdInfo(
        com.provenance.metadata.v1.RecordIdInfo.Builder builderForValue) {
      if (recordIdInfoBuilder_ == null) {
        recordIdInfo_ = builderForValue.build();
      } else {
        recordIdInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_id_info contains information about the id/address of the record.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
     */
    public Builder mergeRecordIdInfo(com.provenance.metadata.v1.RecordIdInfo value) {
      if (recordIdInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          recordIdInfo_ != null &&
          recordIdInfo_ != com.provenance.metadata.v1.RecordIdInfo.getDefaultInstance()) {
          getRecordIdInfoBuilder().mergeFrom(value);
        } else {
          recordIdInfo_ = value;
        }
      } else {
        recordIdInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_id_info contains information about the id/address of the record.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
     */
    public Builder clearRecordIdInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      recordIdInfo_ = null;
      if (recordIdInfoBuilder_ != null) {
        recordIdInfoBuilder_.dispose();
        recordIdInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_id_info contains information about the id/address of the record.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
     */
    public com.provenance.metadata.v1.RecordIdInfo.Builder getRecordIdInfoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRecordIdInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * record_id_info contains information about the id/address of the record.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
     */
    public com.provenance.metadata.v1.RecordIdInfoOrBuilder getRecordIdInfoOrBuilder() {
      if (recordIdInfoBuilder_ != null) {
        return recordIdInfoBuilder_.getMessageOrBuilder();
      } else {
        return recordIdInfo_ == null ?
            com.provenance.metadata.v1.RecordIdInfo.getDefaultInstance() : recordIdInfo_;
      }
    }
    /**
     * <pre>
     * record_id_info contains information about the id/address of the record.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 2 [json_name = "recordIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.RecordIdInfo, com.provenance.metadata.v1.RecordIdInfo.Builder, com.provenance.metadata.v1.RecordIdInfoOrBuilder> 
        getRecordIdInfoFieldBuilder() {
      if (recordIdInfoBuilder_ == null) {
        recordIdInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.metadata.v1.RecordIdInfo, com.provenance.metadata.v1.RecordIdInfo.Builder, com.provenance.metadata.v1.RecordIdInfoOrBuilder>(
                getRecordIdInfo(),
                getParentForChildren(),
                isClean());
        recordIdInfo_ = null;
      }
      return recordIdInfoBuilder_;
    }

    private com.provenance.metadata.v1.RecordSpecIdInfo recordSpecIdInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.RecordSpecIdInfo, com.provenance.metadata.v1.RecordSpecIdInfo.Builder, com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder> recordSpecIdInfoBuilder_;
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     * @return Whether the recordSpecIdInfo field is set.
     */
    public boolean hasRecordSpecIdInfo() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     * @return The recordSpecIdInfo.
     */
    public com.provenance.metadata.v1.RecordSpecIdInfo getRecordSpecIdInfo() {
      if (recordSpecIdInfoBuilder_ == null) {
        return recordSpecIdInfo_ == null ? com.provenance.metadata.v1.RecordSpecIdInfo.getDefaultInstance() : recordSpecIdInfo_;
      } else {
        return recordSpecIdInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public Builder setRecordSpecIdInfo(com.provenance.metadata.v1.RecordSpecIdInfo value) {
      if (recordSpecIdInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recordSpecIdInfo_ = value;
      } else {
        recordSpecIdInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public Builder setRecordSpecIdInfo(
        com.provenance.metadata.v1.RecordSpecIdInfo.Builder builderForValue) {
      if (recordSpecIdInfoBuilder_ == null) {
        recordSpecIdInfo_ = builderForValue.build();
      } else {
        recordSpecIdInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public Builder mergeRecordSpecIdInfo(com.provenance.metadata.v1.RecordSpecIdInfo value) {
      if (recordSpecIdInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          recordSpecIdInfo_ != null &&
          recordSpecIdInfo_ != com.provenance.metadata.v1.RecordSpecIdInfo.getDefaultInstance()) {
          getRecordSpecIdInfoBuilder().mergeFrom(value);
        } else {
          recordSpecIdInfo_ = value;
        }
      } else {
        recordSpecIdInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public Builder clearRecordSpecIdInfo() {
      bitField0_ = (bitField0_ & ~0x00000004);
      recordSpecIdInfo_ = null;
      if (recordSpecIdInfoBuilder_ != null) {
        recordSpecIdInfoBuilder_.dispose();
        recordSpecIdInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public com.provenance.metadata.v1.RecordSpecIdInfo.Builder getRecordSpecIdInfoBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRecordSpecIdInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder getRecordSpecIdInfoOrBuilder() {
      if (recordSpecIdInfoBuilder_ != null) {
        return recordSpecIdInfoBuilder_.getMessageOrBuilder();
      } else {
        return recordSpecIdInfo_ == null ?
            com.provenance.metadata.v1.RecordSpecIdInfo.getDefaultInstance() : recordSpecIdInfo_;
      }
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 3 [json_name = "recordSpecIdInfo", (.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.RecordSpecIdInfo, com.provenance.metadata.v1.RecordSpecIdInfo.Builder, com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder> 
        getRecordSpecIdInfoFieldBuilder() {
      if (recordSpecIdInfoBuilder_ == null) {
        recordSpecIdInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.metadata.v1.RecordSpecIdInfo, com.provenance.metadata.v1.RecordSpecIdInfo.Builder, com.provenance.metadata.v1.RecordSpecIdInfoOrBuilder>(
                getRecordSpecIdInfo(),
                getParentForChildren(),
                isClean());
        recordSpecIdInfo_ = null;
      }
      return recordSpecIdInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.RecordWrapper)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.RecordWrapper)
  private static final com.provenance.metadata.v1.RecordWrapper DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.RecordWrapper();
  }

  public static com.provenance.metadata.v1.RecordWrapper getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordWrapper>
      PARSER = new com.google.protobuf.AbstractParser<RecordWrapper>() {
    @java.lang.Override
    public RecordWrapper parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecordWrapper> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordWrapper> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.RecordWrapper getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

