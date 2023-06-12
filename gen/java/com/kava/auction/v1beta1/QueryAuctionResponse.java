// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/auction/v1beta1/query.proto

package com.kava.auction.v1beta1;

/**
 * <pre>
 * QueryAuctionResponse is the response type for the Query/Auction RPC method.
 * </pre>
 *
 * Protobuf type {@code kava.auction.v1beta1.QueryAuctionResponse}
 */
public final class QueryAuctionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.auction.v1beta1.QueryAuctionResponse)
    QueryAuctionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAuctionResponse.newBuilder() to construct.
  private QueryAuctionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAuctionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAuctionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.auction.v1beta1.QueryProto.internal_static_kava_auction_v1beta1_QueryAuctionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.auction.v1beta1.QueryProto.internal_static_kava_auction_v1beta1_QueryAuctionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.auction.v1beta1.QueryAuctionResponse.class, com.kava.auction.v1beta1.QueryAuctionResponse.Builder.class);
  }

  public static final int AUCTION_FIELD_NUMBER = 1;
  private com.google.protobuf.Any auction_;
  /**
   * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
   * @return Whether the auction field is set.
   */
  @java.lang.Override
  public boolean hasAuction() {
    return auction_ != null;
  }
  /**
   * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
   * @return The auction.
   */
  @java.lang.Override
  public com.google.protobuf.Any getAuction() {
    return auction_ == null ? com.google.protobuf.Any.getDefaultInstance() : auction_;
  }
  /**
   * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getAuctionOrBuilder() {
    return auction_ == null ? com.google.protobuf.Any.getDefaultInstance() : auction_;
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
    if (auction_ != null) {
      output.writeMessage(1, getAuction());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (auction_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAuction());
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
    if (!(obj instanceof com.kava.auction.v1beta1.QueryAuctionResponse)) {
      return super.equals(obj);
    }
    com.kava.auction.v1beta1.QueryAuctionResponse other = (com.kava.auction.v1beta1.QueryAuctionResponse) obj;

    if (hasAuction() != other.hasAuction()) return false;
    if (hasAuction()) {
      if (!getAuction()
          .equals(other.getAuction())) return false;
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
    if (hasAuction()) {
      hash = (37 * hash) + AUCTION_FIELD_NUMBER;
      hash = (53 * hash) + getAuction().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.auction.v1beta1.QueryAuctionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.auction.v1beta1.QueryAuctionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.QueryAuctionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.auction.v1beta1.QueryAuctionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.QueryAuctionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.auction.v1beta1.QueryAuctionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.QueryAuctionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.auction.v1beta1.QueryAuctionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.auction.v1beta1.QueryAuctionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.auction.v1beta1.QueryAuctionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.QueryAuctionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.auction.v1beta1.QueryAuctionResponse parseFrom(
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
  public static Builder newBuilder(com.kava.auction.v1beta1.QueryAuctionResponse prototype) {
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
   * QueryAuctionResponse is the response type for the Query/Auction RPC method.
   * </pre>
   *
   * Protobuf type {@code kava.auction.v1beta1.QueryAuctionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.auction.v1beta1.QueryAuctionResponse)
      com.kava.auction.v1beta1.QueryAuctionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.auction.v1beta1.QueryProto.internal_static_kava_auction_v1beta1_QueryAuctionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.auction.v1beta1.QueryProto.internal_static_kava_auction_v1beta1_QueryAuctionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.auction.v1beta1.QueryAuctionResponse.class, com.kava.auction.v1beta1.QueryAuctionResponse.Builder.class);
    }

    // Construct using com.kava.auction.v1beta1.QueryAuctionResponse.newBuilder()
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
      auction_ = null;
      if (auctionBuilder_ != null) {
        auctionBuilder_.dispose();
        auctionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.auction.v1beta1.QueryProto.internal_static_kava_auction_v1beta1_QueryAuctionResponse_descriptor;
    }

    @java.lang.Override
    public com.kava.auction.v1beta1.QueryAuctionResponse getDefaultInstanceForType() {
      return com.kava.auction.v1beta1.QueryAuctionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.auction.v1beta1.QueryAuctionResponse build() {
      com.kava.auction.v1beta1.QueryAuctionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.auction.v1beta1.QueryAuctionResponse buildPartial() {
      com.kava.auction.v1beta1.QueryAuctionResponse result = new com.kava.auction.v1beta1.QueryAuctionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kava.auction.v1beta1.QueryAuctionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.auction_ = auctionBuilder_ == null
            ? auction_
            : auctionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.auction.v1beta1.QueryAuctionResponse) {
        return mergeFrom((com.kava.auction.v1beta1.QueryAuctionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.auction.v1beta1.QueryAuctionResponse other) {
      if (other == com.kava.auction.v1beta1.QueryAuctionResponse.getDefaultInstance()) return this;
      if (other.hasAuction()) {
        mergeAuction(other.getAuction());
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
                  getAuctionFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Any auction_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> auctionBuilder_;
    /**
     * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
     * @return Whether the auction field is set.
     */
    public boolean hasAuction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
     * @return The auction.
     */
    public com.google.protobuf.Any getAuction() {
      if (auctionBuilder_ == null) {
        return auction_ == null ? com.google.protobuf.Any.getDefaultInstance() : auction_;
      } else {
        return auctionBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
     */
    public Builder setAuction(com.google.protobuf.Any value) {
      if (auctionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        auction_ = value;
      } else {
        auctionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
     */
    public Builder setAuction(
        com.google.protobuf.Any.Builder builderForValue) {
      if (auctionBuilder_ == null) {
        auction_ = builderForValue.build();
      } else {
        auctionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
     */
    public Builder mergeAuction(com.google.protobuf.Any value) {
      if (auctionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          auction_ != null &&
          auction_ != com.google.protobuf.Any.getDefaultInstance()) {
          getAuctionBuilder().mergeFrom(value);
        } else {
          auction_ = value;
        }
      } else {
        auctionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
     */
    public Builder clearAuction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      auction_ = null;
      if (auctionBuilder_ != null) {
        auctionBuilder_.dispose();
        auctionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
     */
    public com.google.protobuf.Any.Builder getAuctionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAuctionFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getAuctionOrBuilder() {
      if (auctionBuilder_ != null) {
        return auctionBuilder_.getMessageOrBuilder();
      } else {
        return auction_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : auction_;
      }
    }
    /**
     * <code>.google.protobuf.Any auction = 1 [json_name = "auction"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getAuctionFieldBuilder() {
      if (auctionBuilder_ == null) {
        auctionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getAuction(),
                getParentForChildren(),
                isClean());
        auction_ = null;
      }
      return auctionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.auction.v1beta1.QueryAuctionResponse)
  }

  // @@protoc_insertion_point(class_scope:kava.auction.v1beta1.QueryAuctionResponse)
  private static final com.kava.auction.v1beta1.QueryAuctionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.auction.v1beta1.QueryAuctionResponse();
  }

  public static com.kava.auction.v1beta1.QueryAuctionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAuctionResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAuctionResponse>() {
    @java.lang.Override
    public QueryAuctionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAuctionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAuctionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.auction.v1beta1.QueryAuctionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

