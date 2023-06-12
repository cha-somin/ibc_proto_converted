// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/exchange.proto

package com.injective.exchange.v1beta1;

/**
 * Protobuf type {@code injective.exchange.v1beta1.Position}
 */
public final class Position extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.Position)
    PositionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Position.newBuilder() to construct.
  private Position(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Position() {
    quantity_ = "";
    entryPrice_ = "";
    margin_ = "";
    cumulativeFundingEntry_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Position();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_Position_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_Position_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.Position.class, com.injective.exchange.v1beta1.Position.Builder.class);
  }

  public static final int ISLONG_FIELD_NUMBER = 1;
  private boolean isLong_ = false;
  /**
   * <code>bool isLong = 1 [json_name = "isLong"];</code>
   * @return The isLong.
   */
  @java.lang.Override
  public boolean getIsLong() {
    return isLong_;
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object quantity_ = "";
  /**
   * <code>string quantity = 2 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
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
   * <code>string quantity = 2 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
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

  public static final int ENTRY_PRICE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object entryPrice_ = "";
  /**
   * <code>string entry_price = 3 [json_name = "entryPrice", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The entryPrice.
   */
  @java.lang.Override
  public java.lang.String getEntryPrice() {
    java.lang.Object ref = entryPrice_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entryPrice_ = s;
      return s;
    }
  }
  /**
   * <code>string entry_price = 3 [json_name = "entryPrice", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for entryPrice.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntryPriceBytes() {
    java.lang.Object ref = entryPrice_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entryPrice_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MARGIN_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object margin_ = "";
  /**
   * <code>string margin = 4 [json_name = "margin", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The margin.
   */
  @java.lang.Override
  public java.lang.String getMargin() {
    java.lang.Object ref = margin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      margin_ = s;
      return s;
    }
  }
  /**
   * <code>string margin = 4 [json_name = "margin", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for margin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMarginBytes() {
    java.lang.Object ref = margin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      margin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUMULATIVE_FUNDING_ENTRY_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cumulativeFundingEntry_ = "";
  /**
   * <code>string cumulative_funding_entry = 5 [json_name = "cumulativeFundingEntry", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The cumulativeFundingEntry.
   */
  @java.lang.Override
  public java.lang.String getCumulativeFundingEntry() {
    java.lang.Object ref = cumulativeFundingEntry_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cumulativeFundingEntry_ = s;
      return s;
    }
  }
  /**
   * <code>string cumulative_funding_entry = 5 [json_name = "cumulativeFundingEntry", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for cumulativeFundingEntry.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCumulativeFundingEntryBytes() {
    java.lang.Object ref = cumulativeFundingEntry_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cumulativeFundingEntry_ = b;
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
    if (isLong_ != false) {
      output.writeBool(1, isLong_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(quantity_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, quantity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entryPrice_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, entryPrice_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(margin_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, margin_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cumulativeFundingEntry_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, cumulativeFundingEntry_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isLong_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isLong_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(quantity_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, quantity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entryPrice_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, entryPrice_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(margin_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, margin_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cumulativeFundingEntry_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, cumulativeFundingEntry_);
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
    if (!(obj instanceof com.injective.exchange.v1beta1.Position)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.Position other = (com.injective.exchange.v1beta1.Position) obj;

    if (getIsLong()
        != other.getIsLong()) return false;
    if (!getQuantity()
        .equals(other.getQuantity())) return false;
    if (!getEntryPrice()
        .equals(other.getEntryPrice())) return false;
    if (!getMargin()
        .equals(other.getMargin())) return false;
    if (!getCumulativeFundingEntry()
        .equals(other.getCumulativeFundingEntry())) return false;
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
    hash = (37 * hash) + ISLONG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsLong());
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity().hashCode();
    hash = (37 * hash) + ENTRY_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getEntryPrice().hashCode();
    hash = (37 * hash) + MARGIN_FIELD_NUMBER;
    hash = (53 * hash) + getMargin().hashCode();
    hash = (37 * hash) + CUMULATIVE_FUNDING_ENTRY_FIELD_NUMBER;
    hash = (53 * hash) + getCumulativeFundingEntry().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.Position parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.Position parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.Position parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.Position parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.Position parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.Position parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.Position parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.Position parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.Position parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.Position parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.Position parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.Position parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.Position prototype) {
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
   * Protobuf type {@code injective.exchange.v1beta1.Position}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.Position)
      com.injective.exchange.v1beta1.PositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_Position_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_Position_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.Position.class, com.injective.exchange.v1beta1.Position.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.Position.newBuilder()
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
      isLong_ = false;
      quantity_ = "";
      entryPrice_ = "";
      margin_ = "";
      cumulativeFundingEntry_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.ExchangeProto.internal_static_injective_exchange_v1beta1_Position_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.Position getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.Position.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.Position build() {
      com.injective.exchange.v1beta1.Position result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.Position buildPartial() {
      com.injective.exchange.v1beta1.Position result = new com.injective.exchange.v1beta1.Position(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.Position result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isLong_ = isLong_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.quantity_ = quantity_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.entryPrice_ = entryPrice_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.margin_ = margin_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.cumulativeFundingEntry_ = cumulativeFundingEntry_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.Position) {
        return mergeFrom((com.injective.exchange.v1beta1.Position)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.Position other) {
      if (other == com.injective.exchange.v1beta1.Position.getDefaultInstance()) return this;
      if (other.getIsLong() != false) {
        setIsLong(other.getIsLong());
      }
      if (!other.getQuantity().isEmpty()) {
        quantity_ = other.quantity_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getEntryPrice().isEmpty()) {
        entryPrice_ = other.entryPrice_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getMargin().isEmpty()) {
        margin_ = other.margin_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getCumulativeFundingEntry().isEmpty()) {
        cumulativeFundingEntry_ = other.cumulativeFundingEntry_;
        bitField0_ |= 0x00000010;
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
            case 8: {
              isLong_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              quantity_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              entryPrice_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              margin_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              cumulativeFundingEntry_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private boolean isLong_ ;
    /**
     * <code>bool isLong = 1 [json_name = "isLong"];</code>
     * @return The isLong.
     */
    @java.lang.Override
    public boolean getIsLong() {
      return isLong_;
    }
    /**
     * <code>bool isLong = 1 [json_name = "isLong"];</code>
     * @param value The isLong to set.
     * @return This builder for chaining.
     */
    public Builder setIsLong(boolean value) {

      isLong_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool isLong = 1 [json_name = "isLong"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsLong() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isLong_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object quantity_ = "";
    /**
     * <code>string quantity = 2 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
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
     * <code>string quantity = 2 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
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
     * <code>string quantity = 2 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      quantity_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string quantity = 2 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      quantity_ = getDefaultInstance().getQuantity();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string quantity = 2 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      quantity_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object entryPrice_ = "";
    /**
     * <code>string entry_price = 3 [json_name = "entryPrice", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The entryPrice.
     */
    public java.lang.String getEntryPrice() {
      java.lang.Object ref = entryPrice_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entryPrice_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string entry_price = 3 [json_name = "entryPrice", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for entryPrice.
     */
    public com.google.protobuf.ByteString
        getEntryPriceBytes() {
      java.lang.Object ref = entryPrice_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entryPrice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string entry_price = 3 [json_name = "entryPrice", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The entryPrice to set.
     * @return This builder for chaining.
     */
    public Builder setEntryPrice(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      entryPrice_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string entry_price = 3 [json_name = "entryPrice", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntryPrice() {
      entryPrice_ = getDefaultInstance().getEntryPrice();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string entry_price = 3 [json_name = "entryPrice", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for entryPrice to set.
     * @return This builder for chaining.
     */
    public Builder setEntryPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      entryPrice_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object margin_ = "";
    /**
     * <code>string margin = 4 [json_name = "margin", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The margin.
     */
    public java.lang.String getMargin() {
      java.lang.Object ref = margin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        margin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string margin = 4 [json_name = "margin", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for margin.
     */
    public com.google.protobuf.ByteString
        getMarginBytes() {
      java.lang.Object ref = margin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        margin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string margin = 4 [json_name = "margin", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The margin to set.
     * @return This builder for chaining.
     */
    public Builder setMargin(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      margin_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string margin = 4 [json_name = "margin", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMargin() {
      margin_ = getDefaultInstance().getMargin();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string margin = 4 [json_name = "margin", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for margin to set.
     * @return This builder for chaining.
     */
    public Builder setMarginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      margin_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object cumulativeFundingEntry_ = "";
    /**
     * <code>string cumulative_funding_entry = 5 [json_name = "cumulativeFundingEntry", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The cumulativeFundingEntry.
     */
    public java.lang.String getCumulativeFundingEntry() {
      java.lang.Object ref = cumulativeFundingEntry_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cumulativeFundingEntry_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cumulative_funding_entry = 5 [json_name = "cumulativeFundingEntry", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for cumulativeFundingEntry.
     */
    public com.google.protobuf.ByteString
        getCumulativeFundingEntryBytes() {
      java.lang.Object ref = cumulativeFundingEntry_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cumulativeFundingEntry_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cumulative_funding_entry = 5 [json_name = "cumulativeFundingEntry", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The cumulativeFundingEntry to set.
     * @return This builder for chaining.
     */
    public Builder setCumulativeFundingEntry(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cumulativeFundingEntry_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string cumulative_funding_entry = 5 [json_name = "cumulativeFundingEntry", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCumulativeFundingEntry() {
      cumulativeFundingEntry_ = getDefaultInstance().getCumulativeFundingEntry();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string cumulative_funding_entry = 5 [json_name = "cumulativeFundingEntry", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for cumulativeFundingEntry to set.
     * @return This builder for chaining.
     */
    public Builder setCumulativeFundingEntryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cumulativeFundingEntry_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.Position)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.Position)
  private static final com.injective.exchange.v1beta1.Position DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.Position();
  }

  public static com.injective.exchange.v1beta1.Position getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Position>
      PARSER = new com.google.protobuf.AbstractParser<Position>() {
    @java.lang.Override
    public Position parsePartialFrom(
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

  public static com.google.protobuf.Parser<Position> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Position> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.Position getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

