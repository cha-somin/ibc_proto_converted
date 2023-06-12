// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/auction/v1beta1/auction.proto

package com.injective.auction.v1beta1;

/**
 * Protobuf type {@code injective.auction.v1beta1.EventBid}
 */
public final class EventBid extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.auction.v1beta1.EventBid)
    EventBidOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventBid.newBuilder() to construct.
  private EventBid(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventBid() {
    bidder_ = "";
    amount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventBid();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.auction.v1beta1.AuctionProto.internal_static_injective_auction_v1beta1_EventBid_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.auction.v1beta1.AuctionProto.internal_static_injective_auction_v1beta1_EventBid_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.auction.v1beta1.EventBid.class, com.injective.auction.v1beta1.EventBid.Builder.class);
  }

  public static final int BIDDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bidder_ = "";
  /**
   * <pre>
   * bidder describes the address of bidder
   * </pre>
   *
   * <code>string bidder = 1 [json_name = "bidder"];</code>
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
   * <pre>
   * bidder describes the address of bidder
   * </pre>
   *
   * <code>string bidder = 1 [json_name = "bidder"];</code>
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

  public static final int AMOUNT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object amount_ = "";
  /**
   * <pre>
   * amount describes the amount the bidder put on the auction
   * </pre>
   *
   * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * amount describes the amount the bidder put on the auction
   * </pre>
   *
   * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The bytes for amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROUND_FIELD_NUMBER = 3;
  private long round_ = 0L;
  /**
   * <pre>
   * round defines the round number of auction
   * </pre>
   *
   * <code>uint64 round = 3 [json_name = "round"];</code>
   * @return The round.
   */
  @java.lang.Override
  public long getRound() {
    return round_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bidder_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bidder_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, amount_);
    }
    if (round_ != 0L) {
      output.writeUInt64(3, round_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bidder_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bidder_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, amount_);
    }
    if (round_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, round_);
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
    if (!(obj instanceof com.injective.auction.v1beta1.EventBid)) {
      return super.equals(obj);
    }
    com.injective.auction.v1beta1.EventBid other = (com.injective.auction.v1beta1.EventBid) obj;

    if (!getBidder()
        .equals(other.getBidder())) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (getRound()
        != other.getRound()) return false;
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
    hash = (37 * hash) + BIDDER_FIELD_NUMBER;
    hash = (53 * hash) + getBidder().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + ROUND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRound());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.auction.v1beta1.EventBid parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.auction.v1beta1.EventBid parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.auction.v1beta1.EventBid parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.auction.v1beta1.EventBid parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.auction.v1beta1.EventBid parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.auction.v1beta1.EventBid parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.auction.v1beta1.EventBid parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.auction.v1beta1.EventBid parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.auction.v1beta1.EventBid parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.auction.v1beta1.EventBid parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.auction.v1beta1.EventBid parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.auction.v1beta1.EventBid parseFrom(
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
  public static Builder newBuilder(com.injective.auction.v1beta1.EventBid prototype) {
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
   * Protobuf type {@code injective.auction.v1beta1.EventBid}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.auction.v1beta1.EventBid)
      com.injective.auction.v1beta1.EventBidOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.auction.v1beta1.AuctionProto.internal_static_injective_auction_v1beta1_EventBid_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.auction.v1beta1.AuctionProto.internal_static_injective_auction_v1beta1_EventBid_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.auction.v1beta1.EventBid.class, com.injective.auction.v1beta1.EventBid.Builder.class);
    }

    // Construct using com.injective.auction.v1beta1.EventBid.newBuilder()
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
      bidder_ = "";
      amount_ = "";
      round_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.auction.v1beta1.AuctionProto.internal_static_injective_auction_v1beta1_EventBid_descriptor;
    }

    @java.lang.Override
    public com.injective.auction.v1beta1.EventBid getDefaultInstanceForType() {
      return com.injective.auction.v1beta1.EventBid.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.auction.v1beta1.EventBid build() {
      com.injective.auction.v1beta1.EventBid result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.auction.v1beta1.EventBid buildPartial() {
      com.injective.auction.v1beta1.EventBid result = new com.injective.auction.v1beta1.EventBid(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.auction.v1beta1.EventBid result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bidder_ = bidder_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.round_ = round_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.auction.v1beta1.EventBid) {
        return mergeFrom((com.injective.auction.v1beta1.EventBid)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.auction.v1beta1.EventBid other) {
      if (other == com.injective.auction.v1beta1.EventBid.getDefaultInstance()) return this;
      if (!other.getBidder().isEmpty()) {
        bidder_ = other.bidder_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getRound() != 0L) {
        setRound(other.getRound());
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
              bidder_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              amount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              round_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object bidder_ = "";
    /**
     * <pre>
     * bidder describes the address of bidder
     * </pre>
     *
     * <code>string bidder = 1 [json_name = "bidder"];</code>
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
     * <pre>
     * bidder describes the address of bidder
     * </pre>
     *
     * <code>string bidder = 1 [json_name = "bidder"];</code>
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
     * <pre>
     * bidder describes the address of bidder
     * </pre>
     *
     * <code>string bidder = 1 [json_name = "bidder"];</code>
     * @param value The bidder to set.
     * @return This builder for chaining.
     */
    public Builder setBidder(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bidder_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bidder describes the address of bidder
     * </pre>
     *
     * <code>string bidder = 1 [json_name = "bidder"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBidder() {
      bidder_ = getDefaultInstance().getBidder();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bidder describes the address of bidder
     * </pre>
     *
     * <code>string bidder = 1 [json_name = "bidder"];</code>
     * @param value The bytes for bidder to set.
     * @return This builder for chaining.
     */
    public Builder setBidderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bidder_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <pre>
     * amount describes the amount the bidder put on the auction
     * </pre>
     *
     * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return The amount.
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * amount describes the amount the bidder put on the auction
     * </pre>
     *
     * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return The bytes for amount.
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * amount describes the amount the bidder put on the auction
     * </pre>
     *
     * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * amount describes the amount the bidder put on the auction
     * </pre>
     *
     * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      amount_ = getDefaultInstance().getAmount();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * amount describes the amount the bidder put on the auction
     * </pre>
     *
     * <code>string amount = 2 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      amount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long round_ ;
    /**
     * <pre>
     * round defines the round number of auction
     * </pre>
     *
     * <code>uint64 round = 3 [json_name = "round"];</code>
     * @return The round.
     */
    @java.lang.Override
    public long getRound() {
      return round_;
    }
    /**
     * <pre>
     * round defines the round number of auction
     * </pre>
     *
     * <code>uint64 round = 3 [json_name = "round"];</code>
     * @param value The round to set.
     * @return This builder for chaining.
     */
    public Builder setRound(long value) {

      round_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * round defines the round number of auction
     * </pre>
     *
     * <code>uint64 round = 3 [json_name = "round"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRound() {
      bitField0_ = (bitField0_ & ~0x00000004);
      round_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:injective.auction.v1beta1.EventBid)
  }

  // @@protoc_insertion_point(class_scope:injective.auction.v1beta1.EventBid)
  private static final com.injective.auction.v1beta1.EventBid DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.auction.v1beta1.EventBid();
  }

  public static com.injective.auction.v1beta1.EventBid getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventBid>
      PARSER = new com.google.protobuf.AbstractParser<EventBid>() {
    @java.lang.Override
    public EventBid parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventBid> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventBid> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.auction.v1beta1.EventBid getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

