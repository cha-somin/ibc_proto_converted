// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta3/params.proto

package com.akash.market.v1beta3;

/**
 * <pre>
 * Params is the params for the x/market module
 * </pre>
 *
 * Protobuf type {@code akash.market.v1beta3.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.market.v1beta3.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.market.v1beta3.ParamsProto.internal_static_akash_market_v1beta3_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.market.v1beta3.ParamsProto.internal_static_akash_market_v1beta3_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.market.v1beta3.Params.class, com.akash.market.v1beta3.Params.Builder.class);
  }

  public static final int BID_MIN_DEPOSIT_FIELD_NUMBER = 1;
  private com.cosmos.base.v1beta1.Coin bidMinDeposit_;
  /**
   * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
   * @return Whether the bidMinDeposit field is set.
   */
  @java.lang.Override
  public boolean hasBidMinDeposit() {
    return bidMinDeposit_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
   * @return The bidMinDeposit.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getBidMinDeposit() {
    return bidMinDeposit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : bidMinDeposit_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getBidMinDepositOrBuilder() {
    return bidMinDeposit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : bidMinDeposit_;
  }

  public static final int ORDER_MAX_BIDS_FIELD_NUMBER = 2;
  private int orderMaxBids_ = 0;
  /**
   * <code>uint32 order_max_bids = 2 [json_name = "orderMaxBids", (.gogoproto.customname) = "OrderMaxBids", (.gogoproto.jsontag) = "order_max_bids", (.gogoproto.moretags) = "yaml:&#92;"order_max_bids&#92;""];</code>
   * @return The orderMaxBids.
   */
  @java.lang.Override
  public int getOrderMaxBids() {
    return orderMaxBids_;
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
    if (bidMinDeposit_ != null) {
      output.writeMessage(1, getBidMinDeposit());
    }
    if (orderMaxBids_ != 0) {
      output.writeUInt32(2, orderMaxBids_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bidMinDeposit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBidMinDeposit());
    }
    if (orderMaxBids_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, orderMaxBids_);
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
    if (!(obj instanceof com.akash.market.v1beta3.Params)) {
      return super.equals(obj);
    }
    com.akash.market.v1beta3.Params other = (com.akash.market.v1beta3.Params) obj;

    if (hasBidMinDeposit() != other.hasBidMinDeposit()) return false;
    if (hasBidMinDeposit()) {
      if (!getBidMinDeposit()
          .equals(other.getBidMinDeposit())) return false;
    }
    if (getOrderMaxBids()
        != other.getOrderMaxBids()) return false;
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
    if (hasBidMinDeposit()) {
      hash = (37 * hash) + BID_MIN_DEPOSIT_FIELD_NUMBER;
      hash = (53 * hash) + getBidMinDeposit().hashCode();
    }
    hash = (37 * hash) + ORDER_MAX_BIDS_FIELD_NUMBER;
    hash = (53 * hash) + getOrderMaxBids();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.market.v1beta3.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta3.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta3.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta3.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta3.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta3.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta3.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.market.v1beta3.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.market.v1beta3.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.market.v1beta3.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.market.v1beta3.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.market.v1beta3.Params parseFrom(
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
  public static Builder newBuilder(com.akash.market.v1beta3.Params prototype) {
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
   * Params is the params for the x/market module
   * </pre>
   *
   * Protobuf type {@code akash.market.v1beta3.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.market.v1beta3.Params)
      com.akash.market.v1beta3.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.market.v1beta3.ParamsProto.internal_static_akash_market_v1beta3_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.market.v1beta3.ParamsProto.internal_static_akash_market_v1beta3_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.market.v1beta3.Params.class, com.akash.market.v1beta3.Params.Builder.class);
    }

    // Construct using com.akash.market.v1beta3.Params.newBuilder()
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
      bidMinDeposit_ = null;
      if (bidMinDepositBuilder_ != null) {
        bidMinDepositBuilder_.dispose();
        bidMinDepositBuilder_ = null;
      }
      orderMaxBids_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.market.v1beta3.ParamsProto.internal_static_akash_market_v1beta3_Params_descriptor;
    }

    @java.lang.Override
    public com.akash.market.v1beta3.Params getDefaultInstanceForType() {
      return com.akash.market.v1beta3.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.market.v1beta3.Params build() {
      com.akash.market.v1beta3.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.market.v1beta3.Params buildPartial() {
      com.akash.market.v1beta3.Params result = new com.akash.market.v1beta3.Params(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.market.v1beta3.Params result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bidMinDeposit_ = bidMinDepositBuilder_ == null
            ? bidMinDeposit_
            : bidMinDepositBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.orderMaxBids_ = orderMaxBids_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.market.v1beta3.Params) {
        return mergeFrom((com.akash.market.v1beta3.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.market.v1beta3.Params other) {
      if (other == com.akash.market.v1beta3.Params.getDefaultInstance()) return this;
      if (other.hasBidMinDeposit()) {
        mergeBidMinDeposit(other.getBidMinDeposit());
      }
      if (other.getOrderMaxBids() != 0) {
        setOrderMaxBids(other.getOrderMaxBids());
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
                  getBidMinDepositFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              orderMaxBids_ = input.readUInt32();
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

    private com.cosmos.base.v1beta1.Coin bidMinDeposit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> bidMinDepositBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
     * @return Whether the bidMinDeposit field is set.
     */
    public boolean hasBidMinDeposit() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
     * @return The bidMinDeposit.
     */
    public com.cosmos.base.v1beta1.Coin getBidMinDeposit() {
      if (bidMinDepositBuilder_ == null) {
        return bidMinDeposit_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : bidMinDeposit_;
      } else {
        return bidMinDepositBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
     */
    public Builder setBidMinDeposit(com.cosmos.base.v1beta1.Coin value) {
      if (bidMinDepositBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bidMinDeposit_ = value;
      } else {
        bidMinDepositBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
     */
    public Builder setBidMinDeposit(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (bidMinDepositBuilder_ == null) {
        bidMinDeposit_ = builderForValue.build();
      } else {
        bidMinDepositBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
     */
    public Builder mergeBidMinDeposit(com.cosmos.base.v1beta1.Coin value) {
      if (bidMinDepositBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          bidMinDeposit_ != null &&
          bidMinDeposit_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getBidMinDepositBuilder().mergeFrom(value);
        } else {
          bidMinDeposit_ = value;
        }
      } else {
        bidMinDepositBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
     */
    public Builder clearBidMinDeposit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bidMinDeposit_ = null;
      if (bidMinDepositBuilder_ != null) {
        bidMinDepositBuilder_.dispose();
        bidMinDepositBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getBidMinDepositBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBidMinDepositFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getBidMinDepositOrBuilder() {
      if (bidMinDepositBuilder_ != null) {
        return bidMinDepositBuilder_.getMessageOrBuilder();
      } else {
        return bidMinDeposit_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : bidMinDeposit_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin bid_min_deposit = 1 [json_name = "bidMinDeposit", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidMinDeposit", (.gogoproto.jsontag) = "bid_min_deposit", (.gogoproto.moretags) = "yaml:&#92;"bid_min_deposit&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getBidMinDepositFieldBuilder() {
      if (bidMinDepositBuilder_ == null) {
        bidMinDepositBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getBidMinDeposit(),
                getParentForChildren(),
                isClean());
        bidMinDeposit_ = null;
      }
      return bidMinDepositBuilder_;
    }

    private int orderMaxBids_ ;
    /**
     * <code>uint32 order_max_bids = 2 [json_name = "orderMaxBids", (.gogoproto.customname) = "OrderMaxBids", (.gogoproto.jsontag) = "order_max_bids", (.gogoproto.moretags) = "yaml:&#92;"order_max_bids&#92;""];</code>
     * @return The orderMaxBids.
     */
    @java.lang.Override
    public int getOrderMaxBids() {
      return orderMaxBids_;
    }
    /**
     * <code>uint32 order_max_bids = 2 [json_name = "orderMaxBids", (.gogoproto.customname) = "OrderMaxBids", (.gogoproto.jsontag) = "order_max_bids", (.gogoproto.moretags) = "yaml:&#92;"order_max_bids&#92;""];</code>
     * @param value The orderMaxBids to set.
     * @return This builder for chaining.
     */
    public Builder setOrderMaxBids(int value) {

      orderMaxBids_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 order_max_bids = 2 [json_name = "orderMaxBids", (.gogoproto.customname) = "OrderMaxBids", (.gogoproto.jsontag) = "order_max_bids", (.gogoproto.moretags) = "yaml:&#92;"order_max_bids&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderMaxBids() {
      bitField0_ = (bitField0_ & ~0x00000002);
      orderMaxBids_ = 0;
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


    // @@protoc_insertion_point(builder_scope:akash.market.v1beta3.Params)
  }

  // @@protoc_insertion_point(class_scope:akash.market.v1beta3.Params)
  private static final com.akash.market.v1beta3.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.market.v1beta3.Params();
  }

  public static com.akash.market.v1beta3.Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params>
      PARSER = new com.google.protobuf.AbstractParser<Params>() {
    @java.lang.Override
    public Params parsePartialFrom(
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

  public static com.google.protobuf.Parser<Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.market.v1beta3.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

