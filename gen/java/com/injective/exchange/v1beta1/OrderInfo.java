// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/exchange.proto

package com.injective.exchange.v1beta1;

/**
 * Protobuf type {@code injective.exchange.v1beta1.OrderInfo}
 */
public final class OrderInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.OrderInfo)
    OrderInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderInfo.newBuilder() to construct.
  private OrderInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderInfo() {
    subaccountId_ = "";
    feeRecipient_ = "";
    price_ = "";
    quantity_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_OrderInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_OrderInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.OrderInfo.class, com.injective.exchange.v1beta1.OrderInfo.Builder.class);
  }

  public static final int SUBACCOUNT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subaccountId_ = "";
  /**
   * <pre>
   * bytes32 subaccount ID that created the order
   * </pre>
   *
   * <code>string subaccount_id = 1 [json_name = "subaccountId"];</code>
   * @return The subaccountId.
   */
  @java.lang.Override
  public java.lang.String getSubaccountId() {
    java.lang.Object ref = subaccountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subaccountId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * bytes32 subaccount ID that created the order
   * </pre>
   *
   * <code>string subaccount_id = 1 [json_name = "subaccountId"];</code>
   * @return The bytes for subaccountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubaccountIdBytes() {
    java.lang.Object ref = subaccountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subaccountId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEE_RECIPIENT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object feeRecipient_ = "";
  /**
   * <pre>
   * address fee_recipient address that will receive fees for the order
   * </pre>
   *
   * <code>string fee_recipient = 2 [json_name = "feeRecipient"];</code>
   * @return The feeRecipient.
   */
  @java.lang.Override
  public java.lang.String getFeeRecipient() {
    java.lang.Object ref = feeRecipient_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      feeRecipient_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * address fee_recipient address that will receive fees for the order
   * </pre>
   *
   * <code>string fee_recipient = 2 [json_name = "feeRecipient"];</code>
   * @return The bytes for feeRecipient.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeeRecipientBytes() {
    java.lang.Object ref = feeRecipient_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      feeRecipient_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object price_ = "";
  /**
   * <pre>
   * price of the order
   * </pre>
   *
   * <code>string price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The price.
   */
  @java.lang.Override
  public java.lang.String getPrice() {
    java.lang.Object ref = price_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      price_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * price of the order
   * </pre>
   *
   * <code>string price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for price.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPriceBytes() {
    java.lang.Object ref = price_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      price_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITY_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object quantity_ = "";
  /**
   * <pre>
   * quantity of the order
   * </pre>
   *
   * <code>string quantity = 4 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The quantity.
   */
  @java.lang.Override
  public java.lang.String getQuantity() {
    java.lang.Object ref = quantity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      quantity_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * quantity of the order
   * </pre>
   *
   * <code>string quantity = 4 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for quantity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQuantityBytes() {
    java.lang.Object ref = quantity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      quantity_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subaccountId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subaccountId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feeRecipient_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, feeRecipient_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(price_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, price_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(quantity_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, quantity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subaccountId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subaccountId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feeRecipient_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, feeRecipient_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(price_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, price_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(quantity_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, quantity_);
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
    if (!(obj instanceof com.injective.exchange.v1beta1.OrderInfo)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.OrderInfo other = (com.injective.exchange.v1beta1.OrderInfo) obj;

    if (!getSubaccountId()
        .equals(other.getSubaccountId())) return false;
    if (!getFeeRecipient()
        .equals(other.getFeeRecipient())) return false;
    if (!getPrice()
        .equals(other.getPrice())) return false;
    if (!getQuantity()
        .equals(other.getQuantity())) return false;
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
    hash = (37 * hash) + SUBACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubaccountId().hashCode();
    hash = (37 * hash) + FEE_RECIPIENT_FIELD_NUMBER;
    hash = (53 * hash) + getFeeRecipient().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.OrderInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.OrderInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.OrderInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.OrderInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.OrderInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.OrderInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.OrderInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.OrderInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.OrderInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.OrderInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.OrderInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.OrderInfo parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.OrderInfo prototype) {
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
   * Protobuf type {@code injective.exchange.v1beta1.OrderInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.OrderInfo)
      com.injective.exchange.v1beta1.OrderInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_OrderInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_OrderInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.OrderInfo.class, com.injective.exchange.v1beta1.OrderInfo.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.OrderInfo.newBuilder()
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
      subaccountId_ = "";
      feeRecipient_ = "";
      price_ = "";
      quantity_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_OrderInfo_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.OrderInfo getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.OrderInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.OrderInfo build() {
      com.injective.exchange.v1beta1.OrderInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.OrderInfo buildPartial() {
      com.injective.exchange.v1beta1.OrderInfo result = new com.injective.exchange.v1beta1.OrderInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.OrderInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subaccountId_ = subaccountId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.feeRecipient_ = feeRecipient_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.price_ = price_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.quantity_ = quantity_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.OrderInfo) {
        return mergeFrom((com.injective.exchange.v1beta1.OrderInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.OrderInfo other) {
      if (other == com.injective.exchange.v1beta1.OrderInfo.getDefaultInstance()) return this;
      if (!other.getSubaccountId().isEmpty()) {
        subaccountId_ = other.subaccountId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFeeRecipient().isEmpty()) {
        feeRecipient_ = other.feeRecipient_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getPrice().isEmpty()) {
        price_ = other.price_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getQuantity().isEmpty()) {
        quantity_ = other.quantity_;
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
              subaccountId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              feeRecipient_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              price_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              quantity_ = input.readStringRequireUtf8();
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

    private java.lang.Object subaccountId_ = "";
    /**
     * <pre>
     * bytes32 subaccount ID that created the order
     * </pre>
     *
     * <code>string subaccount_id = 1 [json_name = "subaccountId"];</code>
     * @return The subaccountId.
     */
    public java.lang.String getSubaccountId() {
      java.lang.Object ref = subaccountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subaccountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * bytes32 subaccount ID that created the order
     * </pre>
     *
     * <code>string subaccount_id = 1 [json_name = "subaccountId"];</code>
     * @return The bytes for subaccountId.
     */
    public com.google.protobuf.ByteString
        getSubaccountIdBytes() {
      java.lang.Object ref = subaccountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subaccountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * bytes32 subaccount ID that created the order
     * </pre>
     *
     * <code>string subaccount_id = 1 [json_name = "subaccountId"];</code>
     * @param value The subaccountId to set.
     * @return This builder for chaining.
     */
    public Builder setSubaccountId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subaccountId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bytes32 subaccount ID that created the order
     * </pre>
     *
     * <code>string subaccount_id = 1 [json_name = "subaccountId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubaccountId() {
      subaccountId_ = getDefaultInstance().getSubaccountId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bytes32 subaccount ID that created the order
     * </pre>
     *
     * <code>string subaccount_id = 1 [json_name = "subaccountId"];</code>
     * @param value The bytes for subaccountId to set.
     * @return This builder for chaining.
     */
    public Builder setSubaccountIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subaccountId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object feeRecipient_ = "";
    /**
     * <pre>
     * address fee_recipient address that will receive fees for the order
     * </pre>
     *
     * <code>string fee_recipient = 2 [json_name = "feeRecipient"];</code>
     * @return The feeRecipient.
     */
    public java.lang.String getFeeRecipient() {
      java.lang.Object ref = feeRecipient_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feeRecipient_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * address fee_recipient address that will receive fees for the order
     * </pre>
     *
     * <code>string fee_recipient = 2 [json_name = "feeRecipient"];</code>
     * @return The bytes for feeRecipient.
     */
    public com.google.protobuf.ByteString
        getFeeRecipientBytes() {
      java.lang.Object ref = feeRecipient_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feeRecipient_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * address fee_recipient address that will receive fees for the order
     * </pre>
     *
     * <code>string fee_recipient = 2 [json_name = "feeRecipient"];</code>
     * @param value The feeRecipient to set.
     * @return This builder for chaining.
     */
    public Builder setFeeRecipient(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      feeRecipient_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address fee_recipient address that will receive fees for the order
     * </pre>
     *
     * <code>string fee_recipient = 2 [json_name = "feeRecipient"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeeRecipient() {
      feeRecipient_ = getDefaultInstance().getFeeRecipient();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address fee_recipient address that will receive fees for the order
     * </pre>
     *
     * <code>string fee_recipient = 2 [json_name = "feeRecipient"];</code>
     * @param value The bytes for feeRecipient to set.
     * @return This builder for chaining.
     */
    public Builder setFeeRecipientBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      feeRecipient_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object price_ = "";
    /**
     * <pre>
     * price of the order
     * </pre>
     *
     * <code>string price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The price.
     */
    public java.lang.String getPrice() {
      java.lang.Object ref = price_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        price_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * price of the order
     * </pre>
     *
     * <code>string price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for price.
     */
    public com.google.protobuf.ByteString
        getPriceBytes() {
      java.lang.Object ref = price_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        price_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * price of the order
     * </pre>
     *
     * <code>string price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      price_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * price of the order
     * </pre>
     *
     * <code>string price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      price_ = getDefaultInstance().getPrice();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * price of the order
     * </pre>
     *
     * <code>string price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for price to set.
     * @return This builder for chaining.
     */
    public Builder setPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      price_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object quantity_ = "";
    /**
     * <pre>
     * quantity of the order
     * </pre>
     *
     * <code>string quantity = 4 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The quantity.
     */
    public java.lang.String getQuantity() {
      java.lang.Object ref = quantity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        quantity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * quantity of the order
     * </pre>
     *
     * <code>string quantity = 4 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for quantity.
     */
    public com.google.protobuf.ByteString
        getQuantityBytes() {
      java.lang.Object ref = quantity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        quantity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * quantity of the order
     * </pre>
     *
     * <code>string quantity = 4 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      quantity_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * quantity of the order
     * </pre>
     *
     * <code>string quantity = 4 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      quantity_ = getDefaultInstance().getQuantity();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * quantity of the order
     * </pre>
     *
     * <code>string quantity = 4 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      quantity_ = value;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.OrderInfo)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.OrderInfo)
  private static final com.injective.exchange.v1beta1.OrderInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.OrderInfo();
  }

  public static com.injective.exchange.v1beta1.OrderInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderInfo>
      PARSER = new com.google.protobuf.AbstractParser<OrderInfo>() {
    @java.lang.Override
    public OrderInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<OrderInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.OrderInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

