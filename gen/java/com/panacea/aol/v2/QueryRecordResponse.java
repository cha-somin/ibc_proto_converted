// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/aol/v2/query.proto

package com.panacea.aol.v2;

/**
 * <pre>
 * QueryRecordResponse is the response type for the Query/Record RPC method.
 * </pre>
 *
 * Protobuf type {@code panacea.aol.v2.QueryRecordResponse}
 */
public final class QueryRecordResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.aol.v2.QueryRecordResponse)
    QueryRecordResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRecordResponse.newBuilder() to construct.
  private QueryRecordResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRecordResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRecordResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.panacea.aol.v2.QueryProto.internal_static_panacea_aol_v2_QueryRecordResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.panacea.aol.v2.QueryProto.internal_static_panacea_aol_v2_QueryRecordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.panacea.aol.v2.QueryRecordResponse.class, com.panacea.aol.v2.QueryRecordResponse.Builder.class);
  }

  public static final int RECORD_FIELD_NUMBER = 1;
  private com.panacea.aol.v2.Record record_;
  /**
   * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
   * @return Whether the record field is set.
   */
  @java.lang.Override
  public boolean hasRecord() {
    return record_ != null;
  }
  /**
   * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
   * @return The record.
   */
  @java.lang.Override
  public com.panacea.aol.v2.Record getRecord() {
    return record_ == null ? com.panacea.aol.v2.Record.getDefaultInstance() : record_;
  }
  /**
   * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
   */
  @java.lang.Override
  public com.panacea.aol.v2.RecordOrBuilder getRecordOrBuilder() {
    return record_ == null ? com.panacea.aol.v2.Record.getDefaultInstance() : record_;
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.panacea.aol.v2.QueryRecordResponse)) {
      return super.equals(obj);
    }
    com.panacea.aol.v2.QueryRecordResponse other = (com.panacea.aol.v2.QueryRecordResponse) obj;

    if (hasRecord() != other.hasRecord()) return false;
    if (hasRecord()) {
      if (!getRecord()
          .equals(other.getRecord())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.panacea.aol.v2.QueryRecordResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.aol.v2.QueryRecordResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.aol.v2.QueryRecordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.aol.v2.QueryRecordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.aol.v2.QueryRecordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.aol.v2.QueryRecordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.aol.v2.QueryRecordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.aol.v2.QueryRecordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.panacea.aol.v2.QueryRecordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.panacea.aol.v2.QueryRecordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.panacea.aol.v2.QueryRecordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.aol.v2.QueryRecordResponse parseFrom(
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
  public static Builder newBuilder(com.panacea.aol.v2.QueryRecordResponse prototype) {
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
   * QueryRecordResponse is the response type for the Query/Record RPC method.
   * </pre>
   *
   * Protobuf type {@code panacea.aol.v2.QueryRecordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.aol.v2.QueryRecordResponse)
      com.panacea.aol.v2.QueryRecordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.panacea.aol.v2.QueryProto.internal_static_panacea_aol_v2_QueryRecordResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.panacea.aol.v2.QueryProto.internal_static_panacea_aol_v2_QueryRecordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.panacea.aol.v2.QueryRecordResponse.class, com.panacea.aol.v2.QueryRecordResponse.Builder.class);
    }

    // Construct using com.panacea.aol.v2.QueryRecordResponse.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.panacea.aol.v2.QueryProto.internal_static_panacea_aol_v2_QueryRecordResponse_descriptor;
    }

    @java.lang.Override
    public com.panacea.aol.v2.QueryRecordResponse getDefaultInstanceForType() {
      return com.panacea.aol.v2.QueryRecordResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.panacea.aol.v2.QueryRecordResponse build() {
      com.panacea.aol.v2.QueryRecordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.panacea.aol.v2.QueryRecordResponse buildPartial() {
      com.panacea.aol.v2.QueryRecordResponse result = new com.panacea.aol.v2.QueryRecordResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.panacea.aol.v2.QueryRecordResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.record_ = recordBuilder_ == null
            ? record_
            : recordBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.panacea.aol.v2.QueryRecordResponse) {
        return mergeFrom((com.panacea.aol.v2.QueryRecordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.panacea.aol.v2.QueryRecordResponse other) {
      if (other == com.panacea.aol.v2.QueryRecordResponse.getDefaultInstance()) return this;
      if (other.hasRecord()) {
        mergeRecord(other.getRecord());
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

    private com.panacea.aol.v2.Record record_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.panacea.aol.v2.Record, com.panacea.aol.v2.Record.Builder, com.panacea.aol.v2.RecordOrBuilder> recordBuilder_;
    /**
     * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
     * @return Whether the record field is set.
     */
    public boolean hasRecord() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
     * @return The record.
     */
    public com.panacea.aol.v2.Record getRecord() {
      if (recordBuilder_ == null) {
        return record_ == null ? com.panacea.aol.v2.Record.getDefaultInstance() : record_;
      } else {
        return recordBuilder_.getMessage();
      }
    }
    /**
     * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
     */
    public Builder setRecord(com.panacea.aol.v2.Record value) {
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
     * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
     */
    public Builder setRecord(
        com.panacea.aol.v2.Record.Builder builderForValue) {
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
     * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
     */
    public Builder mergeRecord(com.panacea.aol.v2.Record value) {
      if (recordBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          record_ != null &&
          record_ != com.panacea.aol.v2.Record.getDefaultInstance()) {
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
     * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
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
     * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
     */
    public com.panacea.aol.v2.Record.Builder getRecordBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRecordFieldBuilder().getBuilder();
    }
    /**
     * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
     */
    public com.panacea.aol.v2.RecordOrBuilder getRecordOrBuilder() {
      if (recordBuilder_ != null) {
        return recordBuilder_.getMessageOrBuilder();
      } else {
        return record_ == null ?
            com.panacea.aol.v2.Record.getDefaultInstance() : record_;
      }
    }
    /**
     * <code>.panacea.aol.v2.Record record = 1 [json_name = "record"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.panacea.aol.v2.Record, com.panacea.aol.v2.Record.Builder, com.panacea.aol.v2.RecordOrBuilder> 
        getRecordFieldBuilder() {
      if (recordBuilder_ == null) {
        recordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.panacea.aol.v2.Record, com.panacea.aol.v2.Record.Builder, com.panacea.aol.v2.RecordOrBuilder>(
                getRecord(),
                getParentForChildren(),
                isClean());
        record_ = null;
      }
      return recordBuilder_;
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


    // @@protoc_insertion_point(builder_scope:panacea.aol.v2.QueryRecordResponse)
  }

  // @@protoc_insertion_point(class_scope:panacea.aol.v2.QueryRecordResponse)
  private static final com.panacea.aol.v2.QueryRecordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.panacea.aol.v2.QueryRecordResponse();
  }

  public static com.panacea.aol.v2.QueryRecordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRecordResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryRecordResponse>() {
    @java.lang.Override
    public QueryRecordResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryRecordResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRecordResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.panacea.aol.v2.QueryRecordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

