// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

/**
 * <pre>
 * QuerySpotMarketResponse is the response type for the Query/SpotMarket RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code injective.exchange.v1beta1.QueryFullSpotMarketResponse}
 */
public final class QueryFullSpotMarketResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.QueryFullSpotMarketResponse)
    QueryFullSpotMarketResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryFullSpotMarketResponse.newBuilder() to construct.
  private QueryFullSpotMarketResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryFullSpotMarketResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryFullSpotMarketResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryFullSpotMarketResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryFullSpotMarketResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.QueryFullSpotMarketResponse.class, com.injective.exchange.v1beta1.QueryFullSpotMarketResponse.Builder.class);
  }

  public static final int MARKET_FIELD_NUMBER = 1;
  private com.injective.exchange.v1beta1.FullSpotMarket market_;
  /**
   * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
   * @return Whether the market field is set.
   */
  @java.lang.Override
  public boolean hasMarket() {
    return market_ != null;
  }
  /**
   * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
   * @return The market.
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.FullSpotMarket getMarket() {
    return market_ == null ? com.injective.exchange.v1beta1.FullSpotMarket.getDefaultInstance() : market_;
  }
  /**
   * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.FullSpotMarketOrBuilder getMarketOrBuilder() {
    return market_ == null ? com.injective.exchange.v1beta1.FullSpotMarket.getDefaultInstance() : market_;
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
    if (market_ != null) {
      output.writeMessage(1, getMarket());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (market_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMarket());
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
    if (!(obj instanceof com.injective.exchange.v1beta1.QueryFullSpotMarketResponse)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.QueryFullSpotMarketResponse other = (com.injective.exchange.v1beta1.QueryFullSpotMarketResponse) obj;

    if (hasMarket() != other.hasMarket()) return false;
    if (hasMarket()) {
      if (!getMarket()
          .equals(other.getMarket())) return false;
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
    if (hasMarket()) {
      hash = (37 * hash) + MARKET_FIELD_NUMBER;
      hash = (53 * hash) + getMarket().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.QueryFullSpotMarketResponse prototype) {
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
   * QuerySpotMarketResponse is the response type for the Query/SpotMarket RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code injective.exchange.v1beta1.QueryFullSpotMarketResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.QueryFullSpotMarketResponse)
      com.injective.exchange.v1beta1.QueryFullSpotMarketResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryFullSpotMarketResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryFullSpotMarketResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.QueryFullSpotMarketResponse.class, com.injective.exchange.v1beta1.QueryFullSpotMarketResponse.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.QueryFullSpotMarketResponse.newBuilder()
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
      market_ = null;
      if (marketBuilder_ != null) {
        marketBuilder_.dispose();
        marketBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryFullSpotMarketResponse_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryFullSpotMarketResponse getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.QueryFullSpotMarketResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryFullSpotMarketResponse build() {
      com.injective.exchange.v1beta1.QueryFullSpotMarketResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryFullSpotMarketResponse buildPartial() {
      com.injective.exchange.v1beta1.QueryFullSpotMarketResponse result = new com.injective.exchange.v1beta1.QueryFullSpotMarketResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.QueryFullSpotMarketResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.market_ = marketBuilder_ == null
            ? market_
            : marketBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.QueryFullSpotMarketResponse) {
        return mergeFrom((com.injective.exchange.v1beta1.QueryFullSpotMarketResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.QueryFullSpotMarketResponse other) {
      if (other == com.injective.exchange.v1beta1.QueryFullSpotMarketResponse.getDefaultInstance()) return this;
      if (other.hasMarket()) {
        mergeMarket(other.getMarket());
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
                  getMarketFieldBuilder().getBuilder(),
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

    private com.injective.exchange.v1beta1.FullSpotMarket market_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.exchange.v1beta1.FullSpotMarket, com.injective.exchange.v1beta1.FullSpotMarket.Builder, com.injective.exchange.v1beta1.FullSpotMarketOrBuilder> marketBuilder_;
    /**
     * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
     * @return Whether the market field is set.
     */
    public boolean hasMarket() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
     * @return The market.
     */
    public com.injective.exchange.v1beta1.FullSpotMarket getMarket() {
      if (marketBuilder_ == null) {
        return market_ == null ? com.injective.exchange.v1beta1.FullSpotMarket.getDefaultInstance() : market_;
      } else {
        return marketBuilder_.getMessage();
      }
    }
    /**
     * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
     */
    public Builder setMarket(com.injective.exchange.v1beta1.FullSpotMarket value) {
      if (marketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        market_ = value;
      } else {
        marketBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
     */
    public Builder setMarket(
        com.injective.exchange.v1beta1.FullSpotMarket.Builder builderForValue) {
      if (marketBuilder_ == null) {
        market_ = builderForValue.build();
      } else {
        marketBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
     */
    public Builder mergeMarket(com.injective.exchange.v1beta1.FullSpotMarket value) {
      if (marketBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          market_ != null &&
          market_ != com.injective.exchange.v1beta1.FullSpotMarket.getDefaultInstance()) {
          getMarketBuilder().mergeFrom(value);
        } else {
          market_ = value;
        }
      } else {
        marketBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
     */
    public Builder clearMarket() {
      bitField0_ = (bitField0_ & ~0x00000001);
      market_ = null;
      if (marketBuilder_ != null) {
        marketBuilder_.dispose();
        marketBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
     */
    public com.injective.exchange.v1beta1.FullSpotMarket.Builder getMarketBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMarketFieldBuilder().getBuilder();
    }
    /**
     * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
     */
    public com.injective.exchange.v1beta1.FullSpotMarketOrBuilder getMarketOrBuilder() {
      if (marketBuilder_ != null) {
        return marketBuilder_.getMessageOrBuilder();
      } else {
        return market_ == null ?
            com.injective.exchange.v1beta1.FullSpotMarket.getDefaultInstance() : market_;
      }
    }
    /**
     * <code>.injective.exchange.v1beta1.FullSpotMarket market = 1 [json_name = "market"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.exchange.v1beta1.FullSpotMarket, com.injective.exchange.v1beta1.FullSpotMarket.Builder, com.injective.exchange.v1beta1.FullSpotMarketOrBuilder> 
        getMarketFieldBuilder() {
      if (marketBuilder_ == null) {
        marketBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.injective.exchange.v1beta1.FullSpotMarket, com.injective.exchange.v1beta1.FullSpotMarket.Builder, com.injective.exchange.v1beta1.FullSpotMarketOrBuilder>(
                getMarket(),
                getParentForChildren(),
                isClean());
        market_ = null;
      }
      return marketBuilder_;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.QueryFullSpotMarketResponse)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.QueryFullSpotMarketResponse)
  private static final com.injective.exchange.v1beta1.QueryFullSpotMarketResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.QueryFullSpotMarketResponse();
  }

  public static com.injective.exchange.v1beta1.QueryFullSpotMarketResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryFullSpotMarketResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryFullSpotMarketResponse>() {
    @java.lang.Override
    public QueryFullSpotMarketResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryFullSpotMarketResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryFullSpotMarketResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.QueryFullSpotMarketResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

