// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/records/query.proto

package com.stride.records;

/**
 * Protobuf type {@code stride.records.QueryGetDepositRecordResponse}
 */
public final class QueryGetDepositRecordResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stride.records.QueryGetDepositRecordResponse)
    QueryGetDepositRecordResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetDepositRecordResponse.newBuilder() to construct.
  private QueryGetDepositRecordResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetDepositRecordResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGetDepositRecordResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stride.records.QueryProto.internal_static_stride_records_QueryGetDepositRecordResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stride.records.QueryProto.internal_static_stride_records_QueryGetDepositRecordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stride.records.QueryGetDepositRecordResponse.class, com.stride.records.QueryGetDepositRecordResponse.Builder.class);
  }

  public static final int DEPOSIT_RECORD_FIELD_NUMBER = 1;
  private com.stride.records.DepositRecord depositRecord_;
  /**
   * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   * @return Whether the depositRecord field is set.
   */
  @java.lang.Override
  public boolean hasDepositRecord() {
    return depositRecord_ != null;
  }
  /**
   * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   * @return The depositRecord.
   */
  @java.lang.Override
  public com.stride.records.DepositRecord getDepositRecord() {
    return depositRecord_ == null ? com.stride.records.DepositRecord.getDefaultInstance() : depositRecord_;
  }
  /**
   * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.stride.records.DepositRecordOrBuilder getDepositRecordOrBuilder() {
    return depositRecord_ == null ? com.stride.records.DepositRecord.getDefaultInstance() : depositRecord_;
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
    if (depositRecord_ != null) {
      output.writeMessage(1, getDepositRecord());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (depositRecord_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDepositRecord());
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
    if (!(obj instanceof com.stride.records.QueryGetDepositRecordResponse)) {
      return super.equals(obj);
    }
    com.stride.records.QueryGetDepositRecordResponse other = (com.stride.records.QueryGetDepositRecordResponse) obj;

    if (hasDepositRecord() != other.hasDepositRecord()) return false;
    if (hasDepositRecord()) {
      if (!getDepositRecord()
          .equals(other.getDepositRecord())) return false;
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
    if (hasDepositRecord()) {
      hash = (37 * hash) + DEPOSIT_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + getDepositRecord().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stride.records.QueryGetDepositRecordResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.records.QueryGetDepositRecordResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.records.QueryGetDepositRecordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.records.QueryGetDepositRecordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.records.QueryGetDepositRecordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.records.QueryGetDepositRecordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.records.QueryGetDepositRecordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.records.QueryGetDepositRecordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stride.records.QueryGetDepositRecordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stride.records.QueryGetDepositRecordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stride.records.QueryGetDepositRecordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.records.QueryGetDepositRecordResponse parseFrom(
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
  public static Builder newBuilder(com.stride.records.QueryGetDepositRecordResponse prototype) {
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
   * Protobuf type {@code stride.records.QueryGetDepositRecordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stride.records.QueryGetDepositRecordResponse)
      com.stride.records.QueryGetDepositRecordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.records.QueryProto.internal_static_stride_records_QueryGetDepositRecordResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.records.QueryProto.internal_static_stride_records_QueryGetDepositRecordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.records.QueryGetDepositRecordResponse.class, com.stride.records.QueryGetDepositRecordResponse.Builder.class);
    }

    // Construct using com.stride.records.QueryGetDepositRecordResponse.newBuilder()
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
      depositRecord_ = null;
      if (depositRecordBuilder_ != null) {
        depositRecordBuilder_.dispose();
        depositRecordBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stride.records.QueryProto.internal_static_stride_records_QueryGetDepositRecordResponse_descriptor;
    }

    @java.lang.Override
    public com.stride.records.QueryGetDepositRecordResponse getDefaultInstanceForType() {
      return com.stride.records.QueryGetDepositRecordResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.stride.records.QueryGetDepositRecordResponse build() {
      com.stride.records.QueryGetDepositRecordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stride.records.QueryGetDepositRecordResponse buildPartial() {
      com.stride.records.QueryGetDepositRecordResponse result = new com.stride.records.QueryGetDepositRecordResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stride.records.QueryGetDepositRecordResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.depositRecord_ = depositRecordBuilder_ == null
            ? depositRecord_
            : depositRecordBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stride.records.QueryGetDepositRecordResponse) {
        return mergeFrom((com.stride.records.QueryGetDepositRecordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stride.records.QueryGetDepositRecordResponse other) {
      if (other == com.stride.records.QueryGetDepositRecordResponse.getDefaultInstance()) return this;
      if (other.hasDepositRecord()) {
        mergeDepositRecord(other.getDepositRecord());
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
                  getDepositRecordFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.stride.records.DepositRecord depositRecord_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stride.records.DepositRecord, com.stride.records.DepositRecord.Builder, com.stride.records.DepositRecordOrBuilder> depositRecordBuilder_;
    /**
     * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
     * @return Whether the depositRecord field is set.
     */
    public boolean hasDepositRecord() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
     * @return The depositRecord.
     */
    public com.stride.records.DepositRecord getDepositRecord() {
      if (depositRecordBuilder_ == null) {
        return depositRecord_ == null ? com.stride.records.DepositRecord.getDefaultInstance() : depositRecord_;
      } else {
        return depositRecordBuilder_.getMessage();
      }
    }
    /**
     * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
     */
    public Builder setDepositRecord(com.stride.records.DepositRecord value) {
      if (depositRecordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        depositRecord_ = value;
      } else {
        depositRecordBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
     */
    public Builder setDepositRecord(
        com.stride.records.DepositRecord.Builder builderForValue) {
      if (depositRecordBuilder_ == null) {
        depositRecord_ = builderForValue.build();
      } else {
        depositRecordBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeDepositRecord(com.stride.records.DepositRecord value) {
      if (depositRecordBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          depositRecord_ != null &&
          depositRecord_ != com.stride.records.DepositRecord.getDefaultInstance()) {
          getDepositRecordBuilder().mergeFrom(value);
        } else {
          depositRecord_ = value;
        }
      } else {
        depositRecordBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearDepositRecord() {
      bitField0_ = (bitField0_ & ~0x00000001);
      depositRecord_ = null;
      if (depositRecordBuilder_ != null) {
        depositRecordBuilder_.dispose();
        depositRecordBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
     */
    public com.stride.records.DepositRecord.Builder getDepositRecordBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDepositRecordFieldBuilder().getBuilder();
    }
    /**
     * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
     */
    public com.stride.records.DepositRecordOrBuilder getDepositRecordOrBuilder() {
      if (depositRecordBuilder_ != null) {
        return depositRecordBuilder_.getMessageOrBuilder();
      } else {
        return depositRecord_ == null ?
            com.stride.records.DepositRecord.getDefaultInstance() : depositRecord_;
      }
    }
    /**
     * <code>.stride.records.DepositRecord deposit_record = 1 [json_name = "depositRecord", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stride.records.DepositRecord, com.stride.records.DepositRecord.Builder, com.stride.records.DepositRecordOrBuilder> 
        getDepositRecordFieldBuilder() {
      if (depositRecordBuilder_ == null) {
        depositRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stride.records.DepositRecord, com.stride.records.DepositRecord.Builder, com.stride.records.DepositRecordOrBuilder>(
                getDepositRecord(),
                getParentForChildren(),
                isClean());
        depositRecord_ = null;
      }
      return depositRecordBuilder_;
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


    // @@protoc_insertion_point(builder_scope:stride.records.QueryGetDepositRecordResponse)
  }

  // @@protoc_insertion_point(class_scope:stride.records.QueryGetDepositRecordResponse)
  private static final com.stride.records.QueryGetDepositRecordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stride.records.QueryGetDepositRecordResponse();
  }

  public static com.stride.records.QueryGetDepositRecordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetDepositRecordResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetDepositRecordResponse>() {
    @java.lang.Override
    public QueryGetDepositRecordResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGetDepositRecordResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetDepositRecordResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stride.records.QueryGetDepositRecordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

