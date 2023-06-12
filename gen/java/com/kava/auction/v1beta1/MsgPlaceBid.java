// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/auction/v1beta1/tx.proto

package com.kava.auction.v1beta1;

/**
 * <pre>
 * MsgPlaceBid represents a message used by bidders to place bids on auctions
 * </pre>
 *
 * Protobuf type {@code kava.auction.v1beta1.MsgPlaceBid}
 */
public final class MsgPlaceBid extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.auction.v1beta1.MsgPlaceBid)
    MsgPlaceBidOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgPlaceBid.newBuilder() to construct.
  private MsgPlaceBid(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgPlaceBid() {
    bidder_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgPlaceBid();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.auction.v1beta1.TxProto.internal_static_kava_auction_v1beta1_MsgPlaceBid_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.auction.v1beta1.TxProto.internal_static_kava_auction_v1beta1_MsgPlaceBid_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.auction.v1beta1.MsgPlaceBid.class, com.kava.auction.v1beta1.MsgPlaceBid.Builder.class);
  }

  public static final int AUCTION_ID_FIELD_NUMBER = 1;
  private long auctionId_ = 0L;
  /**
   * <code>uint64 auction_id = 1 [json_name = "auctionId"];</code>
   * @return The auctionId.
   */
  @java.lang.Override
  public long getAuctionId() {
    return auctionId_;
  }

  public static final int BIDDER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bidder_ = "";
  /**
   * <code>string bidder = 2 [json_name = "bidder"];</code>
   * @return The bidder.
   */
  @java.lang.Override
  public java.lang.String getBidder() {
    java.lang.Object ref = bidder_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bidder_ = s;
      return s;
    }
  }
  /**
   * <code>string bidder = 2 [json_name = "bidder"];</code>
   * @return The bytes for bidder.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBidderBytes() {
    java.lang.Object ref = bidder_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bidder_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin amount_;
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return amount_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAmount() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
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
    if (auctionId_ != 0L) {
      output.writeUInt64(1, auctionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bidder_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bidder_);
    }
    if (amount_ != null) {
      output.writeMessage(3, getAmount());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (auctionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, auctionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bidder_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bidder_);
    }
    if (amount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAmount());
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
    if (!(obj instanceof com.kava.auction.v1beta1.MsgPlaceBid)) {
      return super.equals(obj);
    }
    com.kava.auction.v1beta1.MsgPlaceBid other = (com.kava.auction.v1beta1.MsgPlaceBid) obj;

    if (getAuctionId()
        != other.getAuctionId()) return false;
    if (!getBidder()
        .equals(other.getBidder())) return false;
    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (!getAmount()
          .equals(other.getAmount())) return false;
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
    hash = (37 * hash) + AUCTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAuctionId());
    hash = (37 * hash) + BIDDER_FIELD_NUMBER;
    hash = (53 * hash) + getBidder().hashCode();
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.auction.v1beta1.MsgPlaceBid parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.auction.v1beta1.MsgPlaceBid parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.MsgPlaceBid parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.auction.v1beta1.MsgPlaceBid parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.MsgPlaceBid parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.auction.v1beta1.MsgPlaceBid parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.MsgPlaceBid parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.auction.v1beta1.MsgPlaceBid parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.auction.v1beta1.MsgPlaceBid parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.auction.v1beta1.MsgPlaceBid parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.MsgPlaceBid parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.auction.v1beta1.MsgPlaceBid parseFrom(
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
  public static Builder newBuilder(com.kava.auction.v1beta1.MsgPlaceBid prototype) {
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
   * MsgPlaceBid represents a message used by bidders to place bids on auctions
   * </pre>
   *
   * Protobuf type {@code kava.auction.v1beta1.MsgPlaceBid}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.auction.v1beta1.MsgPlaceBid)
      com.kava.auction.v1beta1.MsgPlaceBidOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.auction.v1beta1.TxProto.internal_static_kava_auction_v1beta1_MsgPlaceBid_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.auction.v1beta1.TxProto.internal_static_kava_auction_v1beta1_MsgPlaceBid_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.auction.v1beta1.MsgPlaceBid.class, com.kava.auction.v1beta1.MsgPlaceBid.Builder.class);
    }

    // Construct using com.kava.auction.v1beta1.MsgPlaceBid.newBuilder()
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
      auctionId_ = 0L;
      bidder_ = "";
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.auction.v1beta1.TxProto.internal_static_kava_auction_v1beta1_MsgPlaceBid_descriptor;
    }

    @java.lang.Override
    public com.kava.auction.v1beta1.MsgPlaceBid getDefaultInstanceForType() {
      return com.kava.auction.v1beta1.MsgPlaceBid.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.auction.v1beta1.MsgPlaceBid build() {
      com.kava.auction.v1beta1.MsgPlaceBid result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.auction.v1beta1.MsgPlaceBid buildPartial() {
      com.kava.auction.v1beta1.MsgPlaceBid result = new com.kava.auction.v1beta1.MsgPlaceBid(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kava.auction.v1beta1.MsgPlaceBid result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.auctionId_ = auctionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bidder_ = bidder_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.amount_ = amountBuilder_ == null
            ? amount_
            : amountBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.auction.v1beta1.MsgPlaceBid) {
        return mergeFrom((com.kava.auction.v1beta1.MsgPlaceBid)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.auction.v1beta1.MsgPlaceBid other) {
      if (other == com.kava.auction.v1beta1.MsgPlaceBid.getDefaultInstance()) return this;
      if (other.getAuctionId() != 0L) {
        setAuctionId(other.getAuctionId());
      }
      if (!other.getBidder().isEmpty()) {
        bidder_ = other.bidder_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
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
              auctionId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              bidder_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAmountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private long auctionId_ ;
    /**
     * <code>uint64 auction_id = 1 [json_name = "auctionId"];</code>
     * @return The auctionId.
     */
    @java.lang.Override
    public long getAuctionId() {
      return auctionId_;
    }
    /**
     * <code>uint64 auction_id = 1 [json_name = "auctionId"];</code>
     * @param value The auctionId to set.
     * @return This builder for chaining.
     */
    public Builder setAuctionId(long value) {

      auctionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 auction_id = 1 [json_name = "auctionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuctionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      auctionId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object bidder_ = "";
    /**
     * <code>string bidder = 2 [json_name = "bidder"];</code>
     * @return The bidder.
     */
    public java.lang.String getBidder() {
      java.lang.Object ref = bidder_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bidder_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bidder = 2 [json_name = "bidder"];</code>
     * @return The bytes for bidder.
     */
    public com.google.protobuf.ByteString
        getBidderBytes() {
      java.lang.Object ref = bidder_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bidder_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bidder = 2 [json_name = "bidder"];</code>
     * @param value The bidder to set.
     * @return This builder for chaining.
     */
    public Builder setBidder(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bidder_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string bidder = 2 [json_name = "bidder"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBidder() {
      bidder_ = getDefaultInstance().getBidder();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string bidder = 2 [json_name = "bidder"];</code>
     * @param value The bytes for bidder to set.
     * @return This builder for chaining.
     */
    public Builder setBidderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bidder_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin amount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> amountBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     * @return Whether the amount field is set.
     */
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     * @return The amount.
     */
    public com.cosmos.base.v1beta1.Coin getAmount() {
      if (amountBuilder_ == null) {
        return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
      } else {
        return amountBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amount_ = value;
      } else {
        amountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAmount(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          amount_ != null &&
          amount_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getAmountBuilder().mergeFrom(value);
        } else {
          amount_ = value;
        }
      } else {
        amountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAmountBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilder();
      } else {
        return amount_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getAmount(),
                getParentForChildren(),
                isClean());
        amount_ = null;
      }
      return amountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.auction.v1beta1.MsgPlaceBid)
  }

  // @@protoc_insertion_point(class_scope:kava.auction.v1beta1.MsgPlaceBid)
  private static final com.kava.auction.v1beta1.MsgPlaceBid DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.auction.v1beta1.MsgPlaceBid();
  }

  public static com.kava.auction.v1beta1.MsgPlaceBid getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgPlaceBid>
      PARSER = new com.google.protobuf.AbstractParser<MsgPlaceBid>() {
    @java.lang.Override
    public MsgPlaceBid parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgPlaceBid> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgPlaceBid> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.auction.v1beta1.MsgPlaceBid getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

