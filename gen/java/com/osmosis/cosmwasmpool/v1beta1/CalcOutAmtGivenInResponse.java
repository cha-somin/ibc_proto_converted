// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/cosmwasmpool/v1beta1/model/module_query_msg.proto

package com.osmosis.cosmwasmpool.v1beta1;

/**
 * Protobuf type {@code osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse}
 */
public final class CalcOutAmtGivenInResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse)
    CalcOutAmtGivenInResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalcOutAmtGivenInResponse.newBuilder() to construct.
  private CalcOutAmtGivenInResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalcOutAmtGivenInResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalcOutAmtGivenInResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.cosmwasmpool.v1beta1.ModuleQueryMsgProto.internal_static_osmosis_cosmwasmpool_v1beta1_CalcOutAmtGivenInResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.cosmwasmpool.v1beta1.ModuleQueryMsgProto.internal_static_osmosis_cosmwasmpool_v1beta1_CalcOutAmtGivenInResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse.class, com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse.Builder.class);
  }

  public static final int TOKEN_OUT_FIELD_NUMBER = 1;
  private com.cosmos.base.v1beta1.Coin tokenOut_;
  /**
   * <pre>
   * token_out is the token out computed from this swap estimate call.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
   * @return Whether the tokenOut field is set.
   */
  @java.lang.Override
  public boolean hasTokenOut() {
    return tokenOut_ != null;
  }
  /**
   * <pre>
   * token_out is the token out computed from this swap estimate call.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
   * @return The tokenOut.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getTokenOut() {
    return tokenOut_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenOut_;
  }
  /**
   * <pre>
   * token_out is the token out computed from this swap estimate call.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getTokenOutOrBuilder() {
    return tokenOut_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenOut_;
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
    if (tokenOut_ != null) {
      output.writeMessage(1, getTokenOut());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tokenOut_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTokenOut());
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
    if (!(obj instanceof com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse)) {
      return super.equals(obj);
    }
    com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse other = (com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse) obj;

    if (hasTokenOut() != other.hasTokenOut()) return false;
    if (hasTokenOut()) {
      if (!getTokenOut()
          .equals(other.getTokenOut())) return false;
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
    if (hasTokenOut()) {
      hash = (37 * hash) + TOKEN_OUT_FIELD_NUMBER;
      hash = (53 * hash) + getTokenOut().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse parseFrom(
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
  public static Builder newBuilder(com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse prototype) {
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
   * Protobuf type {@code osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse)
      com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.cosmwasmpool.v1beta1.ModuleQueryMsgProto.internal_static_osmosis_cosmwasmpool_v1beta1_CalcOutAmtGivenInResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.cosmwasmpool.v1beta1.ModuleQueryMsgProto.internal_static_osmosis_cosmwasmpool_v1beta1_CalcOutAmtGivenInResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse.class, com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse.Builder.class);
    }

    // Construct using com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse.newBuilder()
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
      tokenOut_ = null;
      if (tokenOutBuilder_ != null) {
        tokenOutBuilder_.dispose();
        tokenOutBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.cosmwasmpool.v1beta1.ModuleQueryMsgProto.internal_static_osmosis_cosmwasmpool_v1beta1_CalcOutAmtGivenInResponse_descriptor;
    }

    @java.lang.Override
    public com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse getDefaultInstanceForType() {
      return com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse build() {
      com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse buildPartial() {
      com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse result = new com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tokenOut_ = tokenOutBuilder_ == null
            ? tokenOut_
            : tokenOutBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse) {
        return mergeFrom((com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse other) {
      if (other == com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse.getDefaultInstance()) return this;
      if (other.hasTokenOut()) {
        mergeTokenOut(other.getTokenOut());
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
                  getTokenOutFieldBuilder().getBuilder(),
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

    private com.cosmos.base.v1beta1.Coin tokenOut_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> tokenOutBuilder_;
    /**
     * <pre>
     * token_out is the token out computed from this swap estimate call.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
     * @return Whether the tokenOut field is set.
     */
    public boolean hasTokenOut() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * token_out is the token out computed from this swap estimate call.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
     * @return The tokenOut.
     */
    public com.cosmos.base.v1beta1.Coin getTokenOut() {
      if (tokenOutBuilder_ == null) {
        return tokenOut_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenOut_;
      } else {
        return tokenOutBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * token_out is the token out computed from this swap estimate call.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
     */
    public Builder setTokenOut(com.cosmos.base.v1beta1.Coin value) {
      if (tokenOutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokenOut_ = value;
      } else {
        tokenOutBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * token_out is the token out computed from this swap estimate call.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
     */
    public Builder setTokenOut(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (tokenOutBuilder_ == null) {
        tokenOut_ = builderForValue.build();
      } else {
        tokenOutBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * token_out is the token out computed from this swap estimate call.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeTokenOut(com.cosmos.base.v1beta1.Coin value) {
      if (tokenOutBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tokenOut_ != null &&
          tokenOut_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getTokenOutBuilder().mergeFrom(value);
        } else {
          tokenOut_ = value;
        }
      } else {
        tokenOutBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * token_out is the token out computed from this swap estimate call.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearTokenOut() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tokenOut_ = null;
      if (tokenOutBuilder_ != null) {
        tokenOutBuilder_.dispose();
        tokenOutBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * token_out is the token out computed from this swap estimate call.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getTokenOutBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTokenOutFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * token_out is the token out computed from this swap estimate call.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getTokenOutOrBuilder() {
      if (tokenOutBuilder_ != null) {
        return tokenOutBuilder_.getMessageOrBuilder();
      } else {
        return tokenOut_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : tokenOut_;
      }
    }
    /**
     * <pre>
     * token_out is the token out computed from this swap estimate call.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getTokenOutFieldBuilder() {
      if (tokenOutBuilder_ == null) {
        tokenOutBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getTokenOut(),
                getParentForChildren(),
                isClean());
        tokenOut_ = null;
      }
      return tokenOutBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse)
  }

  // @@protoc_insertion_point(class_scope:osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse)
  private static final com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse();
  }

  public static com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalcOutAmtGivenInResponse>
      PARSER = new com.google.protobuf.AbstractParser<CalcOutAmtGivenInResponse>() {
    @java.lang.Override
    public CalcOutAmtGivenInResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CalcOutAmtGivenInResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalcOutAmtGivenInResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

