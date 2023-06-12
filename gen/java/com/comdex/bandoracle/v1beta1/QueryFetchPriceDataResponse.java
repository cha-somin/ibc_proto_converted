// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/bandoracle/v1beta1/query.proto

package com.comdex.bandoracle.v1beta1;

/**
 * Protobuf type {@code comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse}
 */
public final class QueryFetchPriceDataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse)
    QueryFetchPriceDataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryFetchPriceDataResponse.newBuilder() to construct.
  private QueryFetchPriceDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryFetchPriceDataResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryFetchPriceDataResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.bandoracle.v1beta1.QueryProto.internal_static_comdex_bandoracle_v1beta1_QueryFetchPriceDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.bandoracle.v1beta1.QueryProto.internal_static_comdex_bandoracle_v1beta1_QueryFetchPriceDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse.class, com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse.Builder.class);
  }

  public static final int MSGFETCHPRICEDATA_FIELD_NUMBER = 1;
  private com.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData_;
  /**
   * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
   * @return Whether the msgFetchPriceData field is set.
   */
  @java.lang.Override
  public boolean hasMsgFetchPriceData() {
    return msgFetchPriceData_ != null;
  }
  /**
   * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
   * @return The msgFetchPriceData.
   */
  @java.lang.Override
  public com.comdex.bandoracle.v1beta1.MsgFetchPriceData getMsgFetchPriceData() {
    return msgFetchPriceData_ == null ? com.comdex.bandoracle.v1beta1.MsgFetchPriceData.getDefaultInstance() : msgFetchPriceData_;
  }
  /**
   * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
   */
  @java.lang.Override
  public com.comdex.bandoracle.v1beta1.MsgFetchPriceDataOrBuilder getMsgFetchPriceDataOrBuilder() {
    return msgFetchPriceData_ == null ? com.comdex.bandoracle.v1beta1.MsgFetchPriceData.getDefaultInstance() : msgFetchPriceData_;
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
    if (msgFetchPriceData_ != null) {
      output.writeMessage(1, getMsgFetchPriceData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (msgFetchPriceData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMsgFetchPriceData());
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
    if (!(obj instanceof com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse)) {
      return super.equals(obj);
    }
    com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse other = (com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse) obj;

    if (hasMsgFetchPriceData() != other.hasMsgFetchPriceData()) return false;
    if (hasMsgFetchPriceData()) {
      if (!getMsgFetchPriceData()
          .equals(other.getMsgFetchPriceData())) return false;
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
    if (hasMsgFetchPriceData()) {
      hash = (37 * hash) + MSGFETCHPRICEDATA_FIELD_NUMBER;
      hash = (53 * hash) + getMsgFetchPriceData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse parseFrom(
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
  public static Builder newBuilder(com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse prototype) {
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
   * Protobuf type {@code comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse)
      com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.bandoracle.v1beta1.QueryProto.internal_static_comdex_bandoracle_v1beta1_QueryFetchPriceDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.bandoracle.v1beta1.QueryProto.internal_static_comdex_bandoracle_v1beta1_QueryFetchPriceDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse.class, com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse.Builder.class);
    }

    // Construct using com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse.newBuilder()
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
      msgFetchPriceData_ = null;
      if (msgFetchPriceDataBuilder_ != null) {
        msgFetchPriceDataBuilder_.dispose();
        msgFetchPriceDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.bandoracle.v1beta1.QueryProto.internal_static_comdex_bandoracle_v1beta1_QueryFetchPriceDataResponse_descriptor;
    }

    @java.lang.Override
    public com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse getDefaultInstanceForType() {
      return com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse build() {
      com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse buildPartial() {
      com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse result = new com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.msgFetchPriceData_ = msgFetchPriceDataBuilder_ == null
            ? msgFetchPriceData_
            : msgFetchPriceDataBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse) {
        return mergeFrom((com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse other) {
      if (other == com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse.getDefaultInstance()) return this;
      if (other.hasMsgFetchPriceData()) {
        mergeMsgFetchPriceData(other.getMsgFetchPriceData());
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
                  getMsgFetchPriceDataFieldBuilder().getBuilder(),
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

    private com.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.comdex.bandoracle.v1beta1.MsgFetchPriceData, com.comdex.bandoracle.v1beta1.MsgFetchPriceData.Builder, com.comdex.bandoracle.v1beta1.MsgFetchPriceDataOrBuilder> msgFetchPriceDataBuilder_;
    /**
     * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
     * @return Whether the msgFetchPriceData field is set.
     */
    public boolean hasMsgFetchPriceData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
     * @return The msgFetchPriceData.
     */
    public com.comdex.bandoracle.v1beta1.MsgFetchPriceData getMsgFetchPriceData() {
      if (msgFetchPriceDataBuilder_ == null) {
        return msgFetchPriceData_ == null ? com.comdex.bandoracle.v1beta1.MsgFetchPriceData.getDefaultInstance() : msgFetchPriceData_;
      } else {
        return msgFetchPriceDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
     */
    public Builder setMsgFetchPriceData(com.comdex.bandoracle.v1beta1.MsgFetchPriceData value) {
      if (msgFetchPriceDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msgFetchPriceData_ = value;
      } else {
        msgFetchPriceDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
     */
    public Builder setMsgFetchPriceData(
        com.comdex.bandoracle.v1beta1.MsgFetchPriceData.Builder builderForValue) {
      if (msgFetchPriceDataBuilder_ == null) {
        msgFetchPriceData_ = builderForValue.build();
      } else {
        msgFetchPriceDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
     */
    public Builder mergeMsgFetchPriceData(com.comdex.bandoracle.v1beta1.MsgFetchPriceData value) {
      if (msgFetchPriceDataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          msgFetchPriceData_ != null &&
          msgFetchPriceData_ != com.comdex.bandoracle.v1beta1.MsgFetchPriceData.getDefaultInstance()) {
          getMsgFetchPriceDataBuilder().mergeFrom(value);
        } else {
          msgFetchPriceData_ = value;
        }
      } else {
        msgFetchPriceDataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
     */
    public Builder clearMsgFetchPriceData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      msgFetchPriceData_ = null;
      if (msgFetchPriceDataBuilder_ != null) {
        msgFetchPriceDataBuilder_.dispose();
        msgFetchPriceDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
     */
    public com.comdex.bandoracle.v1beta1.MsgFetchPriceData.Builder getMsgFetchPriceDataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMsgFetchPriceDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
     */
    public com.comdex.bandoracle.v1beta1.MsgFetchPriceDataOrBuilder getMsgFetchPriceDataOrBuilder() {
      if (msgFetchPriceDataBuilder_ != null) {
        return msgFetchPriceDataBuilder_.getMessageOrBuilder();
      } else {
        return msgFetchPriceData_ == null ?
            com.comdex.bandoracle.v1beta1.MsgFetchPriceData.getDefaultInstance() : msgFetchPriceData_;
      }
    }
    /**
     * <code>.comdex.bandoracle.v1beta1.MsgFetchPriceData msgFetchPriceData = 1 [json_name = "msgFetchPriceData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"msgFetchPriceData&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.comdex.bandoracle.v1beta1.MsgFetchPriceData, com.comdex.bandoracle.v1beta1.MsgFetchPriceData.Builder, com.comdex.bandoracle.v1beta1.MsgFetchPriceDataOrBuilder> 
        getMsgFetchPriceDataFieldBuilder() {
      if (msgFetchPriceDataBuilder_ == null) {
        msgFetchPriceDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.comdex.bandoracle.v1beta1.MsgFetchPriceData, com.comdex.bandoracle.v1beta1.MsgFetchPriceData.Builder, com.comdex.bandoracle.v1beta1.MsgFetchPriceDataOrBuilder>(
                getMsgFetchPriceData(),
                getParentForChildren(),
                isClean());
        msgFetchPriceData_ = null;
      }
      return msgFetchPriceDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse)
  }

  // @@protoc_insertion_point(class_scope:comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse)
  private static final com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse();
  }

  public static com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryFetchPriceDataResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryFetchPriceDataResponse>() {
    @java.lang.Override
    public QueryFetchPriceDataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryFetchPriceDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryFetchPriceDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

