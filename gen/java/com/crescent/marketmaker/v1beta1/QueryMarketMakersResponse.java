// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/marketmaker/v1beta1/query.proto

package com.crescent.marketmaker.v1beta1;

/**
 * <pre>
 * QueryMarketMakersResponse is the response type for the Query/MarketMakers RPC method.
 * </pre>
 *
 * Protobuf type {@code crescent.marketmaker.v1beta1.QueryMarketMakersResponse}
 */
public final class QueryMarketMakersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.marketmaker.v1beta1.QueryMarketMakersResponse)
    QueryMarketMakersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryMarketMakersResponse.newBuilder() to construct.
  private QueryMarketMakersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryMarketMakersResponse() {
    marketmakers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryMarketMakersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.marketmaker.v1beta1.QueryProto.internal_static_crescent_marketmaker_v1beta1_QueryMarketMakersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.marketmaker.v1beta1.QueryProto.internal_static_crescent_marketmaker_v1beta1_QueryMarketMakersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse.class, com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse.Builder.class);
  }

  public static final int MARKETMAKERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.crescent.marketmaker.v1beta1.MarketMaker> marketmakers_;
  /**
   * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.crescent.marketmaker.v1beta1.MarketMaker> getMarketmakersList() {
    return marketmakers_;
  }
  /**
   * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.crescent.marketmaker.v1beta1.MarketMakerOrBuilder> 
      getMarketmakersOrBuilderList() {
    return marketmakers_;
  }
  /**
   * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getMarketmakersCount() {
    return marketmakers_.size();
  }
  /**
   * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.crescent.marketmaker.v1beta1.MarketMaker getMarketmakers(int index) {
    return marketmakers_.get(index);
  }
  /**
   * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.crescent.marketmaker.v1beta1.MarketMakerOrBuilder getMarketmakersOrBuilder(
      int index) {
    return marketmakers_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < marketmakers_.size(); i++) {
      output.writeMessage(1, marketmakers_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < marketmakers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, marketmakers_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse)) {
      return super.equals(obj);
    }
    com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse other = (com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse) obj;

    if (!getMarketmakersList()
        .equals(other.getMarketmakersList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (getMarketmakersCount() > 0) {
      hash = (37 * hash) + MARKETMAKERS_FIELD_NUMBER;
      hash = (53 * hash) + getMarketmakersList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse parseFrom(
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
  public static Builder newBuilder(com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse prototype) {
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
   * QueryMarketMakersResponse is the response type for the Query/MarketMakers RPC method.
   * </pre>
   *
   * Protobuf type {@code crescent.marketmaker.v1beta1.QueryMarketMakersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.marketmaker.v1beta1.QueryMarketMakersResponse)
      com.crescent.marketmaker.v1beta1.QueryMarketMakersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.marketmaker.v1beta1.QueryProto.internal_static_crescent_marketmaker_v1beta1_QueryMarketMakersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.marketmaker.v1beta1.QueryProto.internal_static_crescent_marketmaker_v1beta1_QueryMarketMakersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse.class, com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse.Builder.class);
    }

    // Construct using com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse.newBuilder()
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
      if (marketmakersBuilder_ == null) {
        marketmakers_ = java.util.Collections.emptyList();
      } else {
        marketmakers_ = null;
        marketmakersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.crescent.marketmaker.v1beta1.QueryProto.internal_static_crescent_marketmaker_v1beta1_QueryMarketMakersResponse_descriptor;
    }

    @java.lang.Override
    public com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse getDefaultInstanceForType() {
      return com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse build() {
      com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse buildPartial() {
      com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse result = new com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse result) {
      if (marketmakersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          marketmakers_ = java.util.Collections.unmodifiableList(marketmakers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.marketmakers_ = marketmakers_;
      } else {
        result.marketmakers_ = marketmakersBuilder_.build();
      }
    }

    private void buildPartial0(com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse) {
        return mergeFrom((com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse other) {
      if (other == com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse.getDefaultInstance()) return this;
      if (marketmakersBuilder_ == null) {
        if (!other.marketmakers_.isEmpty()) {
          if (marketmakers_.isEmpty()) {
            marketmakers_ = other.marketmakers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMarketmakersIsMutable();
            marketmakers_.addAll(other.marketmakers_);
          }
          onChanged();
        }
      } else {
        if (!other.marketmakers_.isEmpty()) {
          if (marketmakersBuilder_.isEmpty()) {
            marketmakersBuilder_.dispose();
            marketmakersBuilder_ = null;
            marketmakers_ = other.marketmakers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            marketmakersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMarketmakersFieldBuilder() : null;
          } else {
            marketmakersBuilder_.addAllMessages(other.marketmakers_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              com.crescent.marketmaker.v1beta1.MarketMaker m =
                  input.readMessage(
                      com.crescent.marketmaker.v1beta1.MarketMaker.parser(),
                      extensionRegistry);
              if (marketmakersBuilder_ == null) {
                ensureMarketmakersIsMutable();
                marketmakers_.add(m);
              } else {
                marketmakersBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<com.crescent.marketmaker.v1beta1.MarketMaker> marketmakers_ =
      java.util.Collections.emptyList();
    private void ensureMarketmakersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        marketmakers_ = new java.util.ArrayList<com.crescent.marketmaker.v1beta1.MarketMaker>(marketmakers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.crescent.marketmaker.v1beta1.MarketMaker, com.crescent.marketmaker.v1beta1.MarketMaker.Builder, com.crescent.marketmaker.v1beta1.MarketMakerOrBuilder> marketmakersBuilder_;

    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.crescent.marketmaker.v1beta1.MarketMaker> getMarketmakersList() {
      if (marketmakersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(marketmakers_);
      } else {
        return marketmakersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public int getMarketmakersCount() {
      if (marketmakersBuilder_ == null) {
        return marketmakers_.size();
      } else {
        return marketmakersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public com.crescent.marketmaker.v1beta1.MarketMaker getMarketmakers(int index) {
      if (marketmakersBuilder_ == null) {
        return marketmakers_.get(index);
      } else {
        return marketmakersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMarketmakers(
        int index, com.crescent.marketmaker.v1beta1.MarketMaker value) {
      if (marketmakersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMarketmakersIsMutable();
        marketmakers_.set(index, value);
        onChanged();
      } else {
        marketmakersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMarketmakers(
        int index, com.crescent.marketmaker.v1beta1.MarketMaker.Builder builderForValue) {
      if (marketmakersBuilder_ == null) {
        ensureMarketmakersIsMutable();
        marketmakers_.set(index, builderForValue.build());
        onChanged();
      } else {
        marketmakersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMarketmakers(com.crescent.marketmaker.v1beta1.MarketMaker value) {
      if (marketmakersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMarketmakersIsMutable();
        marketmakers_.add(value);
        onChanged();
      } else {
        marketmakersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMarketmakers(
        int index, com.crescent.marketmaker.v1beta1.MarketMaker value) {
      if (marketmakersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMarketmakersIsMutable();
        marketmakers_.add(index, value);
        onChanged();
      } else {
        marketmakersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMarketmakers(
        com.crescent.marketmaker.v1beta1.MarketMaker.Builder builderForValue) {
      if (marketmakersBuilder_ == null) {
        ensureMarketmakersIsMutable();
        marketmakers_.add(builderForValue.build());
        onChanged();
      } else {
        marketmakersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMarketmakers(
        int index, com.crescent.marketmaker.v1beta1.MarketMaker.Builder builderForValue) {
      if (marketmakersBuilder_ == null) {
        ensureMarketmakersIsMutable();
        marketmakers_.add(index, builderForValue.build());
        onChanged();
      } else {
        marketmakersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllMarketmakers(
        java.lang.Iterable<? extends com.crescent.marketmaker.v1beta1.MarketMaker> values) {
      if (marketmakersBuilder_ == null) {
        ensureMarketmakersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, marketmakers_);
        onChanged();
      } else {
        marketmakersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearMarketmakers() {
      if (marketmakersBuilder_ == null) {
        marketmakers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        marketmakersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeMarketmakers(int index) {
      if (marketmakersBuilder_ == null) {
        ensureMarketmakersIsMutable();
        marketmakers_.remove(index);
        onChanged();
      } else {
        marketmakersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public com.crescent.marketmaker.v1beta1.MarketMaker.Builder getMarketmakersBuilder(
        int index) {
      return getMarketmakersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public com.crescent.marketmaker.v1beta1.MarketMakerOrBuilder getMarketmakersOrBuilder(
        int index) {
      if (marketmakersBuilder_ == null) {
        return marketmakers_.get(index);  } else {
        return marketmakersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.crescent.marketmaker.v1beta1.MarketMakerOrBuilder> 
         getMarketmakersOrBuilderList() {
      if (marketmakersBuilder_ != null) {
        return marketmakersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(marketmakers_);
      }
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public com.crescent.marketmaker.v1beta1.MarketMaker.Builder addMarketmakersBuilder() {
      return getMarketmakersFieldBuilder().addBuilder(
          com.crescent.marketmaker.v1beta1.MarketMaker.getDefaultInstance());
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public com.crescent.marketmaker.v1beta1.MarketMaker.Builder addMarketmakersBuilder(
        int index) {
      return getMarketmakersFieldBuilder().addBuilder(
          index, com.crescent.marketmaker.v1beta1.MarketMaker.getDefaultInstance());
    }
    /**
     * <code>repeated .crescent.marketmaker.v1beta1.MarketMaker marketmakers = 1 [json_name = "marketmakers", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.crescent.marketmaker.v1beta1.MarketMaker.Builder> 
         getMarketmakersBuilderList() {
      return getMarketmakersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.crescent.marketmaker.v1beta1.MarketMaker, com.crescent.marketmaker.v1beta1.MarketMaker.Builder, com.crescent.marketmaker.v1beta1.MarketMakerOrBuilder> 
        getMarketmakersFieldBuilder() {
      if (marketmakersBuilder_ == null) {
        marketmakersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.crescent.marketmaker.v1beta1.MarketMaker, com.crescent.marketmaker.v1beta1.MarketMaker.Builder, com.crescent.marketmaker.v1beta1.MarketMakerOrBuilder>(
                marketmakers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        marketmakers_ = null;
      }
      return marketmakersBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:crescent.marketmaker.v1beta1.QueryMarketMakersResponse)
  }

  // @@protoc_insertion_point(class_scope:crescent.marketmaker.v1beta1.QueryMarketMakersResponse)
  private static final com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse();
  }

  public static com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryMarketMakersResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryMarketMakersResponse>() {
    @java.lang.Override
    public QueryMarketMakersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryMarketMakersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryMarketMakersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.marketmaker.v1beta1.QueryMarketMakersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

