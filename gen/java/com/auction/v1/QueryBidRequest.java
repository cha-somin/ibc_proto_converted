// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/auction/v1/query.proto

package com.auction.v1;

/**
 * Protobuf type {@code auction.v1.QueryBidRequest}
 */
public final class QueryBidRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:auction.v1.QueryBidRequest)
    QueryBidRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryBidRequest.newBuilder() to construct.
  private QueryBidRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryBidRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryBidRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.auction.v1.QueryProto.internal_static_auction_v1_QueryBidRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.auction.v1.QueryProto.internal_static_auction_v1_QueryBidRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.auction.v1.QueryBidRequest.class, com.auction.v1.QueryBidRequest.Builder.class);
  }

  public static final int BID_ID_FIELD_NUMBER = 1;
  private long bidId_ = 0L;
  /**
   * <code>uint64 bid_id = 1 [json_name = "bidId"];</code>
   * @return The bidId.
   */
  @java.lang.Override
  public long getBidId() {
    return bidId_;
  }

  public static final int AUCTION_ID_FIELD_NUMBER = 2;
  private int auctionId_ = 0;
  /**
   * <code>uint32 auction_id = 2 [json_name = "auctionId"];</code>
   * @return The auctionId.
   */
  @java.lang.Override
  public int getAuctionId() {
    return auctionId_;
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
    if (bidId_ != 0L) {
      output.writeUInt64(1, bidId_);
    }
    if (auctionId_ != 0) {
      output.writeUInt32(2, auctionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bidId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, bidId_);
    }
    if (auctionId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, auctionId_);
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
    if (!(obj instanceof com.auction.v1.QueryBidRequest)) {
      return super.equals(obj);
    }
    com.auction.v1.QueryBidRequest other = (com.auction.v1.QueryBidRequest) obj;

    if (getBidId()
        != other.getBidId()) return false;
    if (getAuctionId()
        != other.getAuctionId()) return false;
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
    hash = (37 * hash) + BID_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBidId());
    hash = (37 * hash) + AUCTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAuctionId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.auction.v1.QueryBidRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auction.v1.QueryBidRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auction.v1.QueryBidRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auction.v1.QueryBidRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auction.v1.QueryBidRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.auction.v1.QueryBidRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.auction.v1.QueryBidRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.auction.v1.QueryBidRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.auction.v1.QueryBidRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.auction.v1.QueryBidRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.auction.v1.QueryBidRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.auction.v1.QueryBidRequest parseFrom(
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
  public static Builder newBuilder(com.auction.v1.QueryBidRequest prototype) {
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
   * Protobuf type {@code auction.v1.QueryBidRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:auction.v1.QueryBidRequest)
      com.auction.v1.QueryBidRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.auction.v1.QueryProto.internal_static_auction_v1_QueryBidRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.auction.v1.QueryProto.internal_static_auction_v1_QueryBidRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.auction.v1.QueryBidRequest.class, com.auction.v1.QueryBidRequest.Builder.class);
    }

    // Construct using com.auction.v1.QueryBidRequest.newBuilder()
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
      bidId_ = 0L;
      auctionId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.auction.v1.QueryProto.internal_static_auction_v1_QueryBidRequest_descriptor;
    }

    @java.lang.Override
    public com.auction.v1.QueryBidRequest getDefaultInstanceForType() {
      return com.auction.v1.QueryBidRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.auction.v1.QueryBidRequest build() {
      com.auction.v1.QueryBidRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.auction.v1.QueryBidRequest buildPartial() {
      com.auction.v1.QueryBidRequest result = new com.auction.v1.QueryBidRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.auction.v1.QueryBidRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bidId_ = bidId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.auctionId_ = auctionId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.auction.v1.QueryBidRequest) {
        return mergeFrom((com.auction.v1.QueryBidRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.auction.v1.QueryBidRequest other) {
      if (other == com.auction.v1.QueryBidRequest.getDefaultInstance()) return this;
      if (other.getBidId() != 0L) {
        setBidId(other.getBidId());
      }
      if (other.getAuctionId() != 0) {
        setAuctionId(other.getAuctionId());
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
              bidId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              auctionId_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long bidId_ ;
    /**
     * <code>uint64 bid_id = 1 [json_name = "bidId"];</code>
     * @return The bidId.
     */
    @java.lang.Override
    public long getBidId() {
      return bidId_;
    }
    /**
     * <code>uint64 bid_id = 1 [json_name = "bidId"];</code>
     * @param value The bidId to set.
     * @return This builder for chaining.
     */
    public Builder setBidId(long value) {

      bidId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 bid_id = 1 [json_name = "bidId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBidId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bidId_ = 0L;
      onChanged();
      return this;
    }

    private int auctionId_ ;
    /**
     * <code>uint32 auction_id = 2 [json_name = "auctionId"];</code>
     * @return The auctionId.
     */
    @java.lang.Override
    public int getAuctionId() {
      return auctionId_;
    }
    /**
     * <code>uint32 auction_id = 2 [json_name = "auctionId"];</code>
     * @param value The auctionId to set.
     * @return This builder for chaining.
     */
    public Builder setAuctionId(int value) {

      auctionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 auction_id = 2 [json_name = "auctionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuctionId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      auctionId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:auction.v1.QueryBidRequest)
  }

  // @@protoc_insertion_point(class_scope:auction.v1.QueryBidRequest)
  private static final com.auction.v1.QueryBidRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.auction.v1.QueryBidRequest();
  }

  public static com.auction.v1.QueryBidRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryBidRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryBidRequest>() {
    @java.lang.Override
    public QueryBidRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryBidRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryBidRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.auction.v1.QueryBidRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

