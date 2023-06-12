// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/exchange.proto

package com.injective.exchange.v1beta1;

/**
 * Protobuf type {@code injective.exchange.v1beta1.SpotOrder}
 */
public final class SpotOrder extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.SpotOrder)
    SpotOrderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpotOrder.newBuilder() to construct.
  private SpotOrder(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpotOrder() {
    marketId_ = "";
    orderType_ = 0;
    triggerPrice_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpotOrder();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_SpotOrder_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_SpotOrder_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.SpotOrder.class, com.injective.exchange.v1beta1.SpotOrder.Builder.class);
  }

  public static final int MARKET_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object marketId_ = "";
  /**
   * <pre>
   * market_id represents the unique ID of the market
   * </pre>
   *
   * <code>string market_id = 1 [json_name = "marketId"];</code>
   * @return The marketId.
   */
  @java.lang.Override
  public java.lang.String getMarketId() {
    java.lang.Object ref = marketId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      marketId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * market_id represents the unique ID of the market
   * </pre>
   *
   * <code>string market_id = 1 [json_name = "marketId"];</code>
   * @return The bytes for marketId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMarketIdBytes() {
    java.lang.Object ref = marketId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      marketId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDER_INFO_FIELD_NUMBER = 2;
  private com.injective.exchange.v1beta1.OrderInfo orderInfo_;
  /**
   * <pre>
   * order_info contains the information of the order
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
   * @return Whether the orderInfo field is set.
   */
  @java.lang.Override
  public boolean hasOrderInfo() {
    return orderInfo_ != null;
  }
  /**
   * <pre>
   * order_info contains the information of the order
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
   * @return The orderInfo.
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.OrderInfo getOrderInfo() {
    return orderInfo_ == null ? com.injective.exchange.v1beta1.OrderInfo.getDefaultInstance() : orderInfo_;
  }
  /**
   * <pre>
   * order_info contains the information of the order
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.OrderInfoOrBuilder getOrderInfoOrBuilder() {
    return orderInfo_ == null ? com.injective.exchange.v1beta1.OrderInfo.getDefaultInstance() : orderInfo_;
  }

  public static final int ORDER_TYPE_FIELD_NUMBER = 3;
  private int orderType_ = 0;
  /**
   * <pre>
   * order types
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.OrderType order_type = 3 [json_name = "orderType"];</code>
   * @return The enum numeric value on the wire for orderType.
   */
  @java.lang.Override public int getOrderTypeValue() {
    return orderType_;
  }
  /**
   * <pre>
   * order types
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.OrderType order_type = 3 [json_name = "orderType"];</code>
   * @return The orderType.
   */
  @java.lang.Override public com.injective.exchange.v1beta1.OrderType getOrderType() {
    com.injective.exchange.v1beta1.OrderType result = com.injective.exchange.v1beta1.OrderType.forNumber(orderType_);
    return result == null ? com.injective.exchange.v1beta1.OrderType.UNRECOGNIZED : result;
  }

  public static final int TRIGGER_PRICE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object triggerPrice_ = "";
  /**
   * <pre>
   * trigger_price is the trigger price used by stop/take orders
   * </pre>
   *
   * <code>string trigger_price = 4 [json_name = "triggerPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The triggerPrice.
   */
  @java.lang.Override
  public java.lang.String getTriggerPrice() {
    java.lang.Object ref = triggerPrice_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      triggerPrice_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * trigger_price is the trigger price used by stop/take orders
   * </pre>
   *
   * <code>string trigger_price = 4 [json_name = "triggerPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for triggerPrice.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTriggerPriceBytes() {
    java.lang.Object ref = triggerPrice_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      triggerPrice_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(marketId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, marketId_);
    }
    if (orderInfo_ != null) {
      output.writeMessage(2, getOrderInfo());
    }
    if (orderType_ != com.injective.exchange.v1beta1.OrderType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, orderType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(triggerPrice_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, triggerPrice_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(marketId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, marketId_);
    }
    if (orderInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOrderInfo());
    }
    if (orderType_ != com.injective.exchange.v1beta1.OrderType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, orderType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(triggerPrice_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, triggerPrice_);
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
    if (!(obj instanceof com.injective.exchange.v1beta1.SpotOrder)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.SpotOrder other = (com.injective.exchange.v1beta1.SpotOrder) obj;

    if (!getMarketId()
        .equals(other.getMarketId())) return false;
    if (hasOrderInfo() != other.hasOrderInfo()) return false;
    if (hasOrderInfo()) {
      if (!getOrderInfo()
          .equals(other.getOrderInfo())) return false;
    }
    if (orderType_ != other.orderType_) return false;
    if (!getTriggerPrice()
        .equals(other.getTriggerPrice())) return false;
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
    hash = (37 * hash) + MARKET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMarketId().hashCode();
    if (hasOrderInfo()) {
      hash = (37 * hash) + ORDER_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getOrderInfo().hashCode();
    }
    hash = (37 * hash) + ORDER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + orderType_;
    hash = (37 * hash) + TRIGGER_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getTriggerPrice().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.SpotOrder parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.SpotOrder parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.SpotOrder parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.SpotOrder parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.SpotOrder parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.SpotOrder parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.SpotOrder parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.SpotOrder parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.SpotOrder parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.SpotOrder parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.SpotOrder parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.SpotOrder parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.SpotOrder prototype) {
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
   * Protobuf type {@code injective.exchange.v1beta1.SpotOrder}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.SpotOrder)
      com.injective.exchange.v1beta1.SpotOrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_SpotOrder_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_SpotOrder_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.SpotOrder.class, com.injective.exchange.v1beta1.SpotOrder.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.SpotOrder.newBuilder()
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
      marketId_ = "";
      orderInfo_ = null;
      if (orderInfoBuilder_ != null) {
        orderInfoBuilder_.dispose();
        orderInfoBuilder_ = null;
      }
      orderType_ = 0;
      triggerPrice_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_SpotOrder_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.SpotOrder getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.SpotOrder.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.SpotOrder build() {
      com.injective.exchange.v1beta1.SpotOrder result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.SpotOrder buildPartial() {
      com.injective.exchange.v1beta1.SpotOrder result = new com.injective.exchange.v1beta1.SpotOrder(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.SpotOrder result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.marketId_ = marketId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.orderInfo_ = orderInfoBuilder_ == null
            ? orderInfo_
            : orderInfoBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.orderType_ = orderType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.triggerPrice_ = triggerPrice_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.SpotOrder) {
        return mergeFrom((com.injective.exchange.v1beta1.SpotOrder)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.SpotOrder other) {
      if (other == com.injective.exchange.v1beta1.SpotOrder.getDefaultInstance()) return this;
      if (!other.getMarketId().isEmpty()) {
        marketId_ = other.marketId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasOrderInfo()) {
        mergeOrderInfo(other.getOrderInfo());
      }
      if (other.orderType_ != 0) {
        setOrderTypeValue(other.getOrderTypeValue());
      }
      if (!other.getTriggerPrice().isEmpty()) {
        triggerPrice_ = other.triggerPrice_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              marketId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getOrderInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              orderType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              triggerPrice_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object marketId_ = "";
    /**
     * <pre>
     * market_id represents the unique ID of the market
     * </pre>
     *
     * <code>string market_id = 1 [json_name = "marketId"];</code>
     * @return The marketId.
     */
    public java.lang.String getMarketId() {
      java.lang.Object ref = marketId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        marketId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * market_id represents the unique ID of the market
     * </pre>
     *
     * <code>string market_id = 1 [json_name = "marketId"];</code>
     * @return The bytes for marketId.
     */
    public com.google.protobuf.ByteString
        getMarketIdBytes() {
      java.lang.Object ref = marketId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        marketId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * market_id represents the unique ID of the market
     * </pre>
     *
     * <code>string market_id = 1 [json_name = "marketId"];</code>
     * @param value The marketId to set.
     * @return This builder for chaining.
     */
    public Builder setMarketId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      marketId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * market_id represents the unique ID of the market
     * </pre>
     *
     * <code>string market_id = 1 [json_name = "marketId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMarketId() {
      marketId_ = getDefaultInstance().getMarketId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * market_id represents the unique ID of the market
     * </pre>
     *
     * <code>string market_id = 1 [json_name = "marketId"];</code>
     * @param value The bytes for marketId to set.
     * @return This builder for chaining.
     */
    public Builder setMarketIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      marketId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.injective.exchange.v1beta1.OrderInfo orderInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.exchange.v1beta1.OrderInfo, com.injective.exchange.v1beta1.OrderInfo.Builder, com.injective.exchange.v1beta1.OrderInfoOrBuilder> orderInfoBuilder_;
    /**
     * <pre>
     * order_info contains the information of the order
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
     * @return Whether the orderInfo field is set.
     */
    public boolean hasOrderInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * order_info contains the information of the order
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
     * @return The orderInfo.
     */
    public com.injective.exchange.v1beta1.OrderInfo getOrderInfo() {
      if (orderInfoBuilder_ == null) {
        return orderInfo_ == null ? com.injective.exchange.v1beta1.OrderInfo.getDefaultInstance() : orderInfo_;
      } else {
        return orderInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * order_info contains the information of the order
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
     */
    public Builder setOrderInfo(com.injective.exchange.v1beta1.OrderInfo value) {
      if (orderInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        orderInfo_ = value;
      } else {
        orderInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * order_info contains the information of the order
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
     */
    public Builder setOrderInfo(
        com.injective.exchange.v1beta1.OrderInfo.Builder builderForValue) {
      if (orderInfoBuilder_ == null) {
        orderInfo_ = builderForValue.build();
      } else {
        orderInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * order_info contains the information of the order
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeOrderInfo(com.injective.exchange.v1beta1.OrderInfo value) {
      if (orderInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          orderInfo_ != null &&
          orderInfo_ != com.injective.exchange.v1beta1.OrderInfo.getDefaultInstance()) {
          getOrderInfoBuilder().mergeFrom(value);
        } else {
          orderInfo_ = value;
        }
      } else {
        orderInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * order_info contains the information of the order
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearOrderInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      orderInfo_ = null;
      if (orderInfoBuilder_ != null) {
        orderInfoBuilder_.dispose();
        orderInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * order_info contains the information of the order
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
     */
    public com.injective.exchange.v1beta1.OrderInfo.Builder getOrderInfoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOrderInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * order_info contains the information of the order
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
     */
    public com.injective.exchange.v1beta1.OrderInfoOrBuilder getOrderInfoOrBuilder() {
      if (orderInfoBuilder_ != null) {
        return orderInfoBuilder_.getMessageOrBuilder();
      } else {
        return orderInfo_ == null ?
            com.injective.exchange.v1beta1.OrderInfo.getDefaultInstance() : orderInfo_;
      }
    }
    /**
     * <pre>
     * order_info contains the information of the order
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderInfo order_info = 2 [json_name = "orderInfo", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.exchange.v1beta1.OrderInfo, com.injective.exchange.v1beta1.OrderInfo.Builder, com.injective.exchange.v1beta1.OrderInfoOrBuilder> 
        getOrderInfoFieldBuilder() {
      if (orderInfoBuilder_ == null) {
        orderInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.injective.exchange.v1beta1.OrderInfo, com.injective.exchange.v1beta1.OrderInfo.Builder, com.injective.exchange.v1beta1.OrderInfoOrBuilder>(
                getOrderInfo(),
                getParentForChildren(),
                isClean());
        orderInfo_ = null;
      }
      return orderInfoBuilder_;
    }

    private int orderType_ = 0;
    /**
     * <pre>
     * order types
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderType order_type = 3 [json_name = "orderType"];</code>
     * @return The enum numeric value on the wire for orderType.
     */
    @java.lang.Override public int getOrderTypeValue() {
      return orderType_;
    }
    /**
     * <pre>
     * order types
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderType order_type = 3 [json_name = "orderType"];</code>
     * @param value The enum numeric value on the wire for orderType to set.
     * @return This builder for chaining.
     */
    public Builder setOrderTypeValue(int value) {
      orderType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * order types
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderType order_type = 3 [json_name = "orderType"];</code>
     * @return The orderType.
     */
    @java.lang.Override
    public com.injective.exchange.v1beta1.OrderType getOrderType() {
      com.injective.exchange.v1beta1.OrderType result = com.injective.exchange.v1beta1.OrderType.forNumber(orderType_);
      return result == null ? com.injective.exchange.v1beta1.OrderType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * order types
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderType order_type = 3 [json_name = "orderType"];</code>
     * @param value The orderType to set.
     * @return This builder for chaining.
     */
    public Builder setOrderType(com.injective.exchange.v1beta1.OrderType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      orderType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * order types
     * </pre>
     *
     * <code>.injective.exchange.v1beta1.OrderType order_type = 3 [json_name = "orderType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      orderType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object triggerPrice_ = "";
    /**
     * <pre>
     * trigger_price is the trigger price used by stop/take orders
     * </pre>
     *
     * <code>string trigger_price = 4 [json_name = "triggerPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The triggerPrice.
     */
    public java.lang.String getTriggerPrice() {
      java.lang.Object ref = triggerPrice_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        triggerPrice_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * trigger_price is the trigger price used by stop/take orders
     * </pre>
     *
     * <code>string trigger_price = 4 [json_name = "triggerPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for triggerPrice.
     */
    public com.google.protobuf.ByteString
        getTriggerPriceBytes() {
      java.lang.Object ref = triggerPrice_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        triggerPrice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * trigger_price is the trigger price used by stop/take orders
     * </pre>
     *
     * <code>string trigger_price = 4 [json_name = "triggerPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The triggerPrice to set.
     * @return This builder for chaining.
     */
    public Builder setTriggerPrice(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      triggerPrice_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * trigger_price is the trigger price used by stop/take orders
     * </pre>
     *
     * <code>string trigger_price = 4 [json_name = "triggerPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTriggerPrice() {
      triggerPrice_ = getDefaultInstance().getTriggerPrice();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * trigger_price is the trigger price used by stop/take orders
     * </pre>
     *
     * <code>string trigger_price = 4 [json_name = "triggerPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for triggerPrice to set.
     * @return This builder for chaining.
     */
    public Builder setTriggerPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      triggerPrice_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.SpotOrder)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.SpotOrder)
  private static final com.injective.exchange.v1beta1.SpotOrder DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.SpotOrder();
  }

  public static com.injective.exchange.v1beta1.SpotOrder getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpotOrder>
      PARSER = new com.google.protobuf.AbstractParser<SpotOrder>() {
    @java.lang.Override
    public SpotOrder parsePartialFrom(
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

  public static com.google.protobuf.Parser<SpotOrder> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpotOrder> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.SpotOrder getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

