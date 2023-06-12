// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

/**
 * <pre>
 * MsgBatchCancelSpotOrdersResponse defines the Msg/BatchCancelSpotOrders
 * response type.
 * </pre>
 *
 * Protobuf type {@code injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse}
 */
public final class MsgBatchCancelSpotOrdersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse)
    MsgBatchCancelSpotOrdersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgBatchCancelSpotOrdersResponse.newBuilder() to construct.
  private MsgBatchCancelSpotOrdersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgBatchCancelSpotOrdersResponse() {
    success_ = emptyBooleanList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgBatchCancelSpotOrdersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_MsgBatchCancelSpotOrdersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_MsgBatchCancelSpotOrdersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse.class, com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.BooleanList success_;
  /**
   * <code>repeated bool success = 1 [json_name = "success"];</code>
   * @return A list containing the success.
   */
  @java.lang.Override
  public java.util.List<java.lang.Boolean>
      getSuccessList() {
    return success_;
  }
  /**
   * <code>repeated bool success = 1 [json_name = "success"];</code>
   * @return The count of success.
   */
  public int getSuccessCount() {
    return success_.size();
  }
  /**
   * <code>repeated bool success = 1 [json_name = "success"];</code>
   * @param index The index of the element to return.
   * @return The success at the given index.
   */
  public boolean getSuccess(int index) {
    return success_.getBoolean(index);
  }
  private int successMemoizedSerializedSize = -1;

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
    if (getSuccessList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(successMemoizedSerializedSize);
    }
    for (int i = 0; i < success_.size(); i++) {
      output.writeBoolNoTag(success_.getBoolean(i));
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
      dataSize = 1 * getSuccessList().size();
      size += dataSize;
      if (!getSuccessList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      successMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse other = (com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse) obj;

    if (!getSuccessList()
        .equals(other.getSuccessList())) return false;
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
    if (getSuccessCount() > 0) {
      hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + getSuccessList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse prototype) {
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
   * MsgBatchCancelSpotOrdersResponse defines the Msg/BatchCancelSpotOrders
   * response type.
   * </pre>
   *
   * Protobuf type {@code injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse)
      com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_MsgBatchCancelSpotOrdersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_MsgBatchCancelSpotOrdersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse.class, com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse.newBuilder()
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
      success_ = emptyBooleanList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_MsgBatchCancelSpotOrdersResponse_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse build() {
      com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse buildPartial() {
      com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse result = new com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        success_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.success_ = success_;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse) {
        return mergeFrom((com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse other) {
      if (other == com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse.getDefaultInstance()) return this;
      if (!other.success_.isEmpty()) {
        if (success_.isEmpty()) {
          success_ = other.success_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSuccessIsMutable();
          success_.addAll(other.success_);
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
              boolean v = input.readBool();
              ensureSuccessIsMutable();
              success_.addBoolean(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureSuccessIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                success_.addBoolean(input.readBool());
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

    private com.google.protobuf.Internal.BooleanList success_ = emptyBooleanList();
    private void ensureSuccessIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        success_ = mutableCopy(success_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated bool success = 1 [json_name = "success"];</code>
     * @return A list containing the success.
     */
    public java.util.List<java.lang.Boolean>
        getSuccessList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(success_) : success_;
    }
    /**
     * <code>repeated bool success = 1 [json_name = "success"];</code>
     * @return The count of success.
     */
    public int getSuccessCount() {
      return success_.size();
    }
    /**
     * <code>repeated bool success = 1 [json_name = "success"];</code>
     * @param index The index of the element to return.
     * @return The success at the given index.
     */
    public boolean getSuccess(int index) {
      return success_.getBoolean(index);
    }
    /**
     * <code>repeated bool success = 1 [json_name = "success"];</code>
     * @param index The index to set the value at.
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(
        int index, boolean value) {

      ensureSuccessIsMutable();
      success_.setBoolean(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bool success = 1 [json_name = "success"];</code>
     * @param value The success to add.
     * @return This builder for chaining.
     */
    public Builder addSuccess(boolean value) {

      ensureSuccessIsMutable();
      success_.addBoolean(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bool success = 1 [json_name = "success"];</code>
     * @param values The success to add.
     * @return This builder for chaining.
     */
    public Builder addAllSuccess(
        java.lang.Iterable<? extends java.lang.Boolean> values) {
      ensureSuccessIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, success_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bool success = 1 [json_name = "success"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      success_ = emptyBooleanList();
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse)
  private static final com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse();
  }

  public static com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgBatchCancelSpotOrdersResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgBatchCancelSpotOrdersResponse>() {
    @java.lang.Override
    public MsgBatchCancelSpotOrdersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgBatchCancelSpotOrdersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgBatchCancelSpotOrdersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

