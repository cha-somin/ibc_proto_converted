// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/query.proto

package com.injective.oracle.v1beta1;

/**
 * <pre>
 * QueryProviderPriceStatesResponse is the response type for the
 * Query/ProviderPriceStates RPC method.
 * </pre>
 *
 * Protobuf type {@code injective.oracle.v1beta1.QueryProviderPriceStateResponse}
 */
public final class QueryProviderPriceStateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.oracle.v1beta1.QueryProviderPriceStateResponse)
    QueryProviderPriceStateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryProviderPriceStateResponse.newBuilder() to construct.
  private QueryProviderPriceStateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryProviderPriceStateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryProviderPriceStateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.oracle.v1beta1.QueryProto.internal_static_injective_oracle_v1beta1_QueryProviderPriceStateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.oracle.v1beta1.QueryProto.internal_static_injective_oracle_v1beta1_QueryProviderPriceStateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.oracle.v1beta1.QueryProviderPriceStateResponse.class, com.injective.oracle.v1beta1.QueryProviderPriceStateResponse.Builder.class);
  }

  public static final int PRICE_STATE_FIELD_NUMBER = 1;
  private com.injective.oracle.v1beta1.PriceState priceState_;
  /**
   * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
   * @return Whether the priceState field is set.
   */
  @java.lang.Override
  public boolean hasPriceState() {
    return priceState_ != null;
  }
  /**
   * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
   * @return The priceState.
   */
  @java.lang.Override
  public com.injective.oracle.v1beta1.PriceState getPriceState() {
    return priceState_ == null ? com.injective.oracle.v1beta1.PriceState.getDefaultInstance() : priceState_;
  }
  /**
   * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
   */
  @java.lang.Override
  public com.injective.oracle.v1beta1.PriceStateOrBuilder getPriceStateOrBuilder() {
    return priceState_ == null ? com.injective.oracle.v1beta1.PriceState.getDefaultInstance() : priceState_;
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
    if (priceState_ != null) {
      output.writeMessage(1, getPriceState());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (priceState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPriceState());
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
    if (!(obj instanceof com.injective.oracle.v1beta1.QueryProviderPriceStateResponse)) {
      return super.equals(obj);
    }
    com.injective.oracle.v1beta1.QueryProviderPriceStateResponse other = (com.injective.oracle.v1beta1.QueryProviderPriceStateResponse) obj;

    if (hasPriceState() != other.hasPriceState()) return false;
    if (hasPriceState()) {
      if (!getPriceState()
          .equals(other.getPriceState())) return false;
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
    if (hasPriceState()) {
      hash = (37 * hash) + PRICE_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getPriceState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse parseFrom(
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
  public static Builder newBuilder(com.injective.oracle.v1beta1.QueryProviderPriceStateResponse prototype) {
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
   * QueryProviderPriceStatesResponse is the response type for the
   * Query/ProviderPriceStates RPC method.
   * </pre>
   *
   * Protobuf type {@code injective.oracle.v1beta1.QueryProviderPriceStateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.oracle.v1beta1.QueryProviderPriceStateResponse)
      com.injective.oracle.v1beta1.QueryProviderPriceStateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.oracle.v1beta1.QueryProto.internal_static_injective_oracle_v1beta1_QueryProviderPriceStateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.oracle.v1beta1.QueryProto.internal_static_injective_oracle_v1beta1_QueryProviderPriceStateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.oracle.v1beta1.QueryProviderPriceStateResponse.class, com.injective.oracle.v1beta1.QueryProviderPriceStateResponse.Builder.class);
    }

    // Construct using com.injective.oracle.v1beta1.QueryProviderPriceStateResponse.newBuilder()
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
      priceState_ = null;
      if (priceStateBuilder_ != null) {
        priceStateBuilder_.dispose();
        priceStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.oracle.v1beta1.QueryProto.internal_static_injective_oracle_v1beta1_QueryProviderPriceStateResponse_descriptor;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.QueryProviderPriceStateResponse getDefaultInstanceForType() {
      return com.injective.oracle.v1beta1.QueryProviderPriceStateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.QueryProviderPriceStateResponse build() {
      com.injective.oracle.v1beta1.QueryProviderPriceStateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.QueryProviderPriceStateResponse buildPartial() {
      com.injective.oracle.v1beta1.QueryProviderPriceStateResponse result = new com.injective.oracle.v1beta1.QueryProviderPriceStateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.oracle.v1beta1.QueryProviderPriceStateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.priceState_ = priceStateBuilder_ == null
            ? priceState_
            : priceStateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.oracle.v1beta1.QueryProviderPriceStateResponse) {
        return mergeFrom((com.injective.oracle.v1beta1.QueryProviderPriceStateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.oracle.v1beta1.QueryProviderPriceStateResponse other) {
      if (other == com.injective.oracle.v1beta1.QueryProviderPriceStateResponse.getDefaultInstance()) return this;
      if (other.hasPriceState()) {
        mergePriceState(other.getPriceState());
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
                  getPriceStateFieldBuilder().getBuilder(),
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

    private com.injective.oracle.v1beta1.PriceState priceState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.oracle.v1beta1.PriceState, com.injective.oracle.v1beta1.PriceState.Builder, com.injective.oracle.v1beta1.PriceStateOrBuilder> priceStateBuilder_;
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
     * @return Whether the priceState field is set.
     */
    public boolean hasPriceState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
     * @return The priceState.
     */
    public com.injective.oracle.v1beta1.PriceState getPriceState() {
      if (priceStateBuilder_ == null) {
        return priceState_ == null ? com.injective.oracle.v1beta1.PriceState.getDefaultInstance() : priceState_;
      } else {
        return priceStateBuilder_.getMessage();
      }
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
     */
    public Builder setPriceState(com.injective.oracle.v1beta1.PriceState value) {
      if (priceStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        priceState_ = value;
      } else {
        priceStateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
     */
    public Builder setPriceState(
        com.injective.oracle.v1beta1.PriceState.Builder builderForValue) {
      if (priceStateBuilder_ == null) {
        priceState_ = builderForValue.build();
      } else {
        priceStateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
     */
    public Builder mergePriceState(com.injective.oracle.v1beta1.PriceState value) {
      if (priceStateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          priceState_ != null &&
          priceState_ != com.injective.oracle.v1beta1.PriceState.getDefaultInstance()) {
          getPriceStateBuilder().mergeFrom(value);
        } else {
          priceState_ = value;
        }
      } else {
        priceStateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
     */
    public Builder clearPriceState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      priceState_ = null;
      if (priceStateBuilder_ != null) {
        priceStateBuilder_.dispose();
        priceStateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
     */
    public com.injective.oracle.v1beta1.PriceState.Builder getPriceStateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPriceStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
     */
    public com.injective.oracle.v1beta1.PriceStateOrBuilder getPriceStateOrBuilder() {
      if (priceStateBuilder_ != null) {
        return priceStateBuilder_.getMessageOrBuilder();
      } else {
        return priceState_ == null ?
            com.injective.oracle.v1beta1.PriceState.getDefaultInstance() : priceState_;
      }
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 1 [json_name = "priceState"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.oracle.v1beta1.PriceState, com.injective.oracle.v1beta1.PriceState.Builder, com.injective.oracle.v1beta1.PriceStateOrBuilder> 
        getPriceStateFieldBuilder() {
      if (priceStateBuilder_ == null) {
        priceStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.injective.oracle.v1beta1.PriceState, com.injective.oracle.v1beta1.PriceState.Builder, com.injective.oracle.v1beta1.PriceStateOrBuilder>(
                getPriceState(),
                getParentForChildren(),
                isClean());
        priceState_ = null;
      }
      return priceStateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:injective.oracle.v1beta1.QueryProviderPriceStateResponse)
  }

  // @@protoc_insertion_point(class_scope:injective.oracle.v1beta1.QueryProviderPriceStateResponse)
  private static final com.injective.oracle.v1beta1.QueryProviderPriceStateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.oracle.v1beta1.QueryProviderPriceStateResponse();
  }

  public static com.injective.oracle.v1beta1.QueryProviderPriceStateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryProviderPriceStateResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryProviderPriceStateResponse>() {
    @java.lang.Override
    public QueryProviderPriceStateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryProviderPriceStateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryProviderPriceStateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.oracle.v1beta1.QueryProviderPriceStateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

