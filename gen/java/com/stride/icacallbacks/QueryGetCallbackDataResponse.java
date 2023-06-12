// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/icacallbacks/query.proto

package com.stride.icacallbacks;

/**
 * Protobuf type {@code stride.icacallbacks.QueryGetCallbackDataResponse}
 */
public final class QueryGetCallbackDataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stride.icacallbacks.QueryGetCallbackDataResponse)
    QueryGetCallbackDataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetCallbackDataResponse.newBuilder() to construct.
  private QueryGetCallbackDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetCallbackDataResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGetCallbackDataResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stride.icacallbacks.QueryProto.internal_static_stride_icacallbacks_QueryGetCallbackDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stride.icacallbacks.QueryProto.internal_static_stride_icacallbacks_QueryGetCallbackDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stride.icacallbacks.QueryGetCallbackDataResponse.class, com.stride.icacallbacks.QueryGetCallbackDataResponse.Builder.class);
  }

  public static final int CALLBACK_DATA_FIELD_NUMBER = 1;
  private com.stride.icacallbacks.CallbackData callbackData_;
  /**
   * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
   * @return Whether the callbackData field is set.
   */
  @java.lang.Override
  public boolean hasCallbackData() {
    return callbackData_ != null;
  }
  /**
   * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
   * @return The callbackData.
   */
  @java.lang.Override
  public com.stride.icacallbacks.CallbackData getCallbackData() {
    return callbackData_ == null ? com.stride.icacallbacks.CallbackData.getDefaultInstance() : callbackData_;
  }
  /**
   * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.stride.icacallbacks.CallbackDataOrBuilder getCallbackDataOrBuilder() {
    return callbackData_ == null ? com.stride.icacallbacks.CallbackData.getDefaultInstance() : callbackData_;
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
    if (callbackData_ != null) {
      output.writeMessage(1, getCallbackData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (callbackData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCallbackData());
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
    if (!(obj instanceof com.stride.icacallbacks.QueryGetCallbackDataResponse)) {
      return super.equals(obj);
    }
    com.stride.icacallbacks.QueryGetCallbackDataResponse other = (com.stride.icacallbacks.QueryGetCallbackDataResponse) obj;

    if (hasCallbackData() != other.hasCallbackData()) return false;
    if (hasCallbackData()) {
      if (!getCallbackData()
          .equals(other.getCallbackData())) return false;
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
    if (hasCallbackData()) {
      hash = (37 * hash) + CALLBACK_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getCallbackData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.icacallbacks.QueryGetCallbackDataResponse parseFrom(
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
  public static Builder newBuilder(com.stride.icacallbacks.QueryGetCallbackDataResponse prototype) {
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
   * Protobuf type {@code stride.icacallbacks.QueryGetCallbackDataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stride.icacallbacks.QueryGetCallbackDataResponse)
      com.stride.icacallbacks.QueryGetCallbackDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.icacallbacks.QueryProto.internal_static_stride_icacallbacks_QueryGetCallbackDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.icacallbacks.QueryProto.internal_static_stride_icacallbacks_QueryGetCallbackDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.icacallbacks.QueryGetCallbackDataResponse.class, com.stride.icacallbacks.QueryGetCallbackDataResponse.Builder.class);
    }

    // Construct using com.stride.icacallbacks.QueryGetCallbackDataResponse.newBuilder()
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
      callbackData_ = null;
      if (callbackDataBuilder_ != null) {
        callbackDataBuilder_.dispose();
        callbackDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stride.icacallbacks.QueryProto.internal_static_stride_icacallbacks_QueryGetCallbackDataResponse_descriptor;
    }

    @java.lang.Override
    public com.stride.icacallbacks.QueryGetCallbackDataResponse getDefaultInstanceForType() {
      return com.stride.icacallbacks.QueryGetCallbackDataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.stride.icacallbacks.QueryGetCallbackDataResponse build() {
      com.stride.icacallbacks.QueryGetCallbackDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stride.icacallbacks.QueryGetCallbackDataResponse buildPartial() {
      com.stride.icacallbacks.QueryGetCallbackDataResponse result = new com.stride.icacallbacks.QueryGetCallbackDataResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stride.icacallbacks.QueryGetCallbackDataResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.callbackData_ = callbackDataBuilder_ == null
            ? callbackData_
            : callbackDataBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stride.icacallbacks.QueryGetCallbackDataResponse) {
        return mergeFrom((com.stride.icacallbacks.QueryGetCallbackDataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stride.icacallbacks.QueryGetCallbackDataResponse other) {
      if (other == com.stride.icacallbacks.QueryGetCallbackDataResponse.getDefaultInstance()) return this;
      if (other.hasCallbackData()) {
        mergeCallbackData(other.getCallbackData());
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
                  getCallbackDataFieldBuilder().getBuilder(),
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

    private com.stride.icacallbacks.CallbackData callbackData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stride.icacallbacks.CallbackData, com.stride.icacallbacks.CallbackData.Builder, com.stride.icacallbacks.CallbackDataOrBuilder> callbackDataBuilder_;
    /**
     * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
     * @return Whether the callbackData field is set.
     */
    public boolean hasCallbackData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
     * @return The callbackData.
     */
    public com.stride.icacallbacks.CallbackData getCallbackData() {
      if (callbackDataBuilder_ == null) {
        return callbackData_ == null ? com.stride.icacallbacks.CallbackData.getDefaultInstance() : callbackData_;
      } else {
        return callbackDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
     */
    public Builder setCallbackData(com.stride.icacallbacks.CallbackData value) {
      if (callbackDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        callbackData_ = value;
      } else {
        callbackDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
     */
    public Builder setCallbackData(
        com.stride.icacallbacks.CallbackData.Builder builderForValue) {
      if (callbackDataBuilder_ == null) {
        callbackData_ = builderForValue.build();
      } else {
        callbackDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeCallbackData(com.stride.icacallbacks.CallbackData value) {
      if (callbackDataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          callbackData_ != null &&
          callbackData_ != com.stride.icacallbacks.CallbackData.getDefaultInstance()) {
          getCallbackDataBuilder().mergeFrom(value);
        } else {
          callbackData_ = value;
        }
      } else {
        callbackDataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearCallbackData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      callbackData_ = null;
      if (callbackDataBuilder_ != null) {
        callbackDataBuilder_.dispose();
        callbackDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
     */
    public com.stride.icacallbacks.CallbackData.Builder getCallbackDataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCallbackDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
     */
    public com.stride.icacallbacks.CallbackDataOrBuilder getCallbackDataOrBuilder() {
      if (callbackDataBuilder_ != null) {
        return callbackDataBuilder_.getMessageOrBuilder();
      } else {
        return callbackData_ == null ?
            com.stride.icacallbacks.CallbackData.getDefaultInstance() : callbackData_;
      }
    }
    /**
     * <code>.stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stride.icacallbacks.CallbackData, com.stride.icacallbacks.CallbackData.Builder, com.stride.icacallbacks.CallbackDataOrBuilder> 
        getCallbackDataFieldBuilder() {
      if (callbackDataBuilder_ == null) {
        callbackDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stride.icacallbacks.CallbackData, com.stride.icacallbacks.CallbackData.Builder, com.stride.icacallbacks.CallbackDataOrBuilder>(
                getCallbackData(),
                getParentForChildren(),
                isClean());
        callbackData_ = null;
      }
      return callbackDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:stride.icacallbacks.QueryGetCallbackDataResponse)
  }

  // @@protoc_insertion_point(class_scope:stride.icacallbacks.QueryGetCallbackDataResponse)
  private static final com.stride.icacallbacks.QueryGetCallbackDataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stride.icacallbacks.QueryGetCallbackDataResponse();
  }

  public static com.stride.icacallbacks.QueryGetCallbackDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetCallbackDataResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetCallbackDataResponse>() {
    @java.lang.Override
    public QueryGetCallbackDataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGetCallbackDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetCallbackDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stride.icacallbacks.QueryGetCallbackDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

