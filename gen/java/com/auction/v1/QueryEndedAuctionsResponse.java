// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/auction/v1/query.proto

package com.auction.v1;

/**
 * Protobuf type {@code auction.v1.QueryEndedAuctionsResponse}
 */
public final class QueryEndedAuctionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:auction.v1.QueryEndedAuctionsResponse)
    QueryEndedAuctionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryEndedAuctionsResponse.newBuilder() to construct.
  private QueryEndedAuctionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryEndedAuctionsResponse() {
    auctions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryEndedAuctionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.auction.v1.QueryProto.internal_static_auction_v1_QueryEndedAuctionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.auction.v1.QueryProto.internal_static_auction_v1_QueryEndedAuctionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.auction.v1.QueryEndedAuctionsResponse.class, com.auction.v1.QueryEndedAuctionsResponse.Builder.class);
  }

  public static final int AUCTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.auction.v1.Auction> auctions_;
  /**
   * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.auction.v1.Auction> getAuctionsList() {
    return auctions_;
  }
  /**
   * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.auction.v1.AuctionOrBuilder> 
      getAuctionsOrBuilderList() {
    return auctions_;
  }
  /**
   * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
   */
  @java.lang.Override
  public int getAuctionsCount() {
    return auctions_.size();
  }
  /**
   * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
   */
  @java.lang.Override
  public com.auction.v1.Auction getAuctions(int index) {
    return auctions_.get(index);
  }
  /**
   * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
   */
  @java.lang.Override
  public com.auction.v1.AuctionOrBuilder getAuctionsOrBuilder(
      int index) {
    return auctions_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
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
    for (int i = 0; i < auctions_.size(); i++) {
      output.writeMessage(1, auctions_.get(i));
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
    for (int i = 0; i < auctions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, auctions_.get(i));
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
    if (!(obj instanceof com.auction.v1.QueryEndedAuctionsResponse)) {
      return super.equals(obj);
    }
    com.auction.v1.QueryEndedAuctionsResponse other = (com.auction.v1.QueryEndedAuctionsResponse) obj;

    if (!getAuctionsList()
        .equals(other.getAuctionsList())) return false;
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
    if (getAuctionsCount() > 0) {
      hash = (37 * hash) + AUCTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAuctionsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.auction.v1.QueryEndedAuctionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auction.v1.QueryEndedAuctionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auction.v1.QueryEndedAuctionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auction.v1.QueryEndedAuctionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auction.v1.QueryEndedAuctionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auction.v1.QueryEndedAuctionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auction.v1.QueryEndedAuctionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.auction.v1.QueryEndedAuctionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.auction.v1.QueryEndedAuctionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.auction.v1.QueryEndedAuctionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.auction.v1.QueryEndedAuctionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.auction.v1.QueryEndedAuctionsResponse parseFrom(
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
  public static Builder newBuilder(com.auction.v1.QueryEndedAuctionsResponse prototype) {
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
   * Protobuf type {@code auction.v1.QueryEndedAuctionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:auction.v1.QueryEndedAuctionsResponse)
      com.auction.v1.QueryEndedAuctionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.auction.v1.QueryProto.internal_static_auction_v1_QueryEndedAuctionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.auction.v1.QueryProto.internal_static_auction_v1_QueryEndedAuctionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.auction.v1.QueryEndedAuctionsResponse.class, com.auction.v1.QueryEndedAuctionsResponse.Builder.class);
    }

    // Construct using com.auction.v1.QueryEndedAuctionsResponse.newBuilder()
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
      if (auctionsBuilder_ == null) {
        auctions_ = java.util.Collections.emptyList();
      } else {
        auctions_ = null;
        auctionsBuilder_.clear();
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
      return com.auction.v1.QueryProto.internal_static_auction_v1_QueryEndedAuctionsResponse_descriptor;
    }

    @java.lang.Override
    public com.auction.v1.QueryEndedAuctionsResponse getDefaultInstanceForType() {
      return com.auction.v1.QueryEndedAuctionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.auction.v1.QueryEndedAuctionsResponse build() {
      com.auction.v1.QueryEndedAuctionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.auction.v1.QueryEndedAuctionsResponse buildPartial() {
      com.auction.v1.QueryEndedAuctionsResponse result = new com.auction.v1.QueryEndedAuctionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.auction.v1.QueryEndedAuctionsResponse result) {
      if (auctionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          auctions_ = java.util.Collections.unmodifiableList(auctions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.auctions_ = auctions_;
      } else {
        result.auctions_ = auctionsBuilder_.build();
      }
    }

    private void buildPartial0(com.auction.v1.QueryEndedAuctionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.auction.v1.QueryEndedAuctionsResponse) {
        return mergeFrom((com.auction.v1.QueryEndedAuctionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.auction.v1.QueryEndedAuctionsResponse other) {
      if (other == com.auction.v1.QueryEndedAuctionsResponse.getDefaultInstance()) return this;
      if (auctionsBuilder_ == null) {
        if (!other.auctions_.isEmpty()) {
          if (auctions_.isEmpty()) {
            auctions_ = other.auctions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAuctionsIsMutable();
            auctions_.addAll(other.auctions_);
          }
          onChanged();
        }
      } else {
        if (!other.auctions_.isEmpty()) {
          if (auctionsBuilder_.isEmpty()) {
            auctionsBuilder_.dispose();
            auctionsBuilder_ = null;
            auctions_ = other.auctions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            auctionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAuctionsFieldBuilder() : null;
          } else {
            auctionsBuilder_.addAllMessages(other.auctions_);
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
              com.auction.v1.Auction m =
                  input.readMessage(
                      com.auction.v1.Auction.parser(),
                      extensionRegistry);
              if (auctionsBuilder_ == null) {
                ensureAuctionsIsMutable();
                auctions_.add(m);
              } else {
                auctionsBuilder_.addMessage(m);
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

    private java.util.List<com.auction.v1.Auction> auctions_ =
      java.util.Collections.emptyList();
    private void ensureAuctionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        auctions_ = new java.util.ArrayList<com.auction.v1.Auction>(auctions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.auction.v1.Auction, com.auction.v1.Auction.Builder, com.auction.v1.AuctionOrBuilder> auctionsBuilder_;

    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public java.util.List<com.auction.v1.Auction> getAuctionsList() {
      if (auctionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(auctions_);
      } else {
        return auctionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public int getAuctionsCount() {
      if (auctionsBuilder_ == null) {
        return auctions_.size();
      } else {
        return auctionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public com.auction.v1.Auction getAuctions(int index) {
      if (auctionsBuilder_ == null) {
        return auctions_.get(index);
      } else {
        return auctionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public Builder setAuctions(
        int index, com.auction.v1.Auction value) {
      if (auctionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAuctionsIsMutable();
        auctions_.set(index, value);
        onChanged();
      } else {
        auctionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public Builder setAuctions(
        int index, com.auction.v1.Auction.Builder builderForValue) {
      if (auctionsBuilder_ == null) {
        ensureAuctionsIsMutable();
        auctions_.set(index, builderForValue.build());
        onChanged();
      } else {
        auctionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public Builder addAuctions(com.auction.v1.Auction value) {
      if (auctionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAuctionsIsMutable();
        auctions_.add(value);
        onChanged();
      } else {
        auctionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public Builder addAuctions(
        int index, com.auction.v1.Auction value) {
      if (auctionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAuctionsIsMutable();
        auctions_.add(index, value);
        onChanged();
      } else {
        auctionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public Builder addAuctions(
        com.auction.v1.Auction.Builder builderForValue) {
      if (auctionsBuilder_ == null) {
        ensureAuctionsIsMutable();
        auctions_.add(builderForValue.build());
        onChanged();
      } else {
        auctionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public Builder addAuctions(
        int index, com.auction.v1.Auction.Builder builderForValue) {
      if (auctionsBuilder_ == null) {
        ensureAuctionsIsMutable();
        auctions_.add(index, builderForValue.build());
        onChanged();
      } else {
        auctionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public Builder addAllAuctions(
        java.lang.Iterable<? extends com.auction.v1.Auction> values) {
      if (auctionsBuilder_ == null) {
        ensureAuctionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, auctions_);
        onChanged();
      } else {
        auctionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public Builder clearAuctions() {
      if (auctionsBuilder_ == null) {
        auctions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        auctionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public Builder removeAuctions(int index) {
      if (auctionsBuilder_ == null) {
        ensureAuctionsIsMutable();
        auctions_.remove(index);
        onChanged();
      } else {
        auctionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public com.auction.v1.Auction.Builder getAuctionsBuilder(
        int index) {
      return getAuctionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public com.auction.v1.AuctionOrBuilder getAuctionsOrBuilder(
        int index) {
      if (auctionsBuilder_ == null) {
        return auctions_.get(index);  } else {
        return auctionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public java.util.List<? extends com.auction.v1.AuctionOrBuilder> 
         getAuctionsOrBuilderList() {
      if (auctionsBuilder_ != null) {
        return auctionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(auctions_);
      }
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public com.auction.v1.Auction.Builder addAuctionsBuilder() {
      return getAuctionsFieldBuilder().addBuilder(
          com.auction.v1.Auction.getDefaultInstance());
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public com.auction.v1.Auction.Builder addAuctionsBuilder(
        int index) {
      return getAuctionsFieldBuilder().addBuilder(
          index, com.auction.v1.Auction.getDefaultInstance());
    }
    /**
     * <code>repeated .auction.v1.Auction auctions = 1 [json_name = "auctions"];</code>
     */
    public java.util.List<com.auction.v1.Auction.Builder> 
         getAuctionsBuilderList() {
      return getAuctionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.auction.v1.Auction, com.auction.v1.Auction.Builder, com.auction.v1.AuctionOrBuilder> 
        getAuctionsFieldBuilder() {
      if (auctionsBuilder_ == null) {
        auctionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.auction.v1.Auction, com.auction.v1.Auction.Builder, com.auction.v1.AuctionOrBuilder>(
                auctions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        auctions_ = null;
      }
      return auctionsBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.nullable) = false];</code>
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


    // @@protoc_insertion_point(builder_scope:auction.v1.QueryEndedAuctionsResponse)
  }

  // @@protoc_insertion_point(class_scope:auction.v1.QueryEndedAuctionsResponse)
  private static final com.auction.v1.QueryEndedAuctionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.auction.v1.QueryEndedAuctionsResponse();
  }

  public static com.auction.v1.QueryEndedAuctionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryEndedAuctionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryEndedAuctionsResponse>() {
    @java.lang.Override
    public QueryEndedAuctionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryEndedAuctionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryEndedAuctionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.auction.v1.QueryEndedAuctionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

