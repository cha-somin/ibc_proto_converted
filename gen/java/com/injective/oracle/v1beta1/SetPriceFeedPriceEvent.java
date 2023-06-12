// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/events.proto

package com.injective.oracle.v1beta1;

/**
 * Protobuf type {@code injective.oracle.v1beta1.SetPriceFeedPriceEvent}
 */
public final class SetPriceFeedPriceEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.oracle.v1beta1.SetPriceFeedPriceEvent)
    SetPriceFeedPriceEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetPriceFeedPriceEvent.newBuilder() to construct.
  private SetPriceFeedPriceEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetPriceFeedPriceEvent() {
    relayer_ = "";
    base_ = "";
    quote_ = "";
    price_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetPriceFeedPriceEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.oracle.v1beta1.EventsProto.internal_static_injective_oracle_v1beta1_SetPriceFeedPriceEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.oracle.v1beta1.EventsProto.internal_static_injective_oracle_v1beta1_SetPriceFeedPriceEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.oracle.v1beta1.SetPriceFeedPriceEvent.class, com.injective.oracle.v1beta1.SetPriceFeedPriceEvent.Builder.class);
  }

  public static final int RELAYER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object relayer_ = "";
  /**
   * <code>string relayer = 1 [json_name = "relayer"];</code>
   * @return The relayer.
   */
  @java.lang.Override
  public java.lang.String getRelayer() {
    java.lang.Object ref = relayer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      relayer_ = s;
      return s;
    }
  }
  /**
   * <code>string relayer = 1 [json_name = "relayer"];</code>
   * @return The bytes for relayer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRelayerBytes() {
    java.lang.Object ref = relayer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      relayer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BASE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object base_ = "";
  /**
   * <code>string base = 2 [json_name = "base"];</code>
   * @return The base.
   */
  @java.lang.Override
  public java.lang.String getBase() {
    java.lang.Object ref = base_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      base_ = s;
      return s;
    }
  }
  /**
   * <code>string base = 2 [json_name = "base"];</code>
   * @return The bytes for base.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBaseBytes() {
    java.lang.Object ref = base_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      base_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUOTE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object quote_ = "";
  /**
   * <code>string quote = 3 [json_name = "quote"];</code>
   * @return The quote.
   */
  @java.lang.Override
  public java.lang.String getQuote() {
    java.lang.Object ref = quote_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      quote_ = s;
      return s;
    }
  }
  /**
   * <code>string quote = 3 [json_name = "quote"];</code>
   * @return The bytes for quote.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQuoteBytes() {
    java.lang.Object ref = quote_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      quote_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object price_ = "";
  /**
   * <pre>
   * price defines the price of the oracle base and quote
   * </pre>
   *
   * <code>string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
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
   * price defines the price of the oracle base and quote
   * </pre>
   *
   * <code>string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relayer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, relayer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(base_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, base_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(quote_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, quote_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(price_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, price_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relayer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, relayer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(base_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, base_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(quote_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, quote_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(price_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, price_);
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
    if (!(obj instanceof com.injective.oracle.v1beta1.SetPriceFeedPriceEvent)) {
      return super.equals(obj);
    }
    com.injective.oracle.v1beta1.SetPriceFeedPriceEvent other = (com.injective.oracle.v1beta1.SetPriceFeedPriceEvent) obj;

    if (!getRelayer()
        .equals(other.getRelayer())) return false;
    if (!getBase()
        .equals(other.getBase())) return false;
    if (!getQuote()
        .equals(other.getQuote())) return false;
    if (!getPrice()
        .equals(other.getPrice())) return false;
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
    hash = (37 * hash) + RELAYER_FIELD_NUMBER;
    hash = (53 * hash) + getRelayer().hashCode();
    hash = (37 * hash) + BASE_FIELD_NUMBER;
    hash = (53 * hash) + getBase().hashCode();
    hash = (37 * hash) + QUOTE_FIELD_NUMBER;
    hash = (53 * hash) + getQuote().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent parseFrom(
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
  public static Builder newBuilder(com.injective.oracle.v1beta1.SetPriceFeedPriceEvent prototype) {
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
   * Protobuf type {@code injective.oracle.v1beta1.SetPriceFeedPriceEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.oracle.v1beta1.SetPriceFeedPriceEvent)
      com.injective.oracle.v1beta1.SetPriceFeedPriceEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.oracle.v1beta1.EventsProto.internal_static_injective_oracle_v1beta1_SetPriceFeedPriceEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.oracle.v1beta1.EventsProto.internal_static_injective_oracle_v1beta1_SetPriceFeedPriceEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.oracle.v1beta1.SetPriceFeedPriceEvent.class, com.injective.oracle.v1beta1.SetPriceFeedPriceEvent.Builder.class);
    }

    // Construct using com.injective.oracle.v1beta1.SetPriceFeedPriceEvent.newBuilder()
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
      relayer_ = "";
      base_ = "";
      quote_ = "";
      price_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.oracle.v1beta1.EventsProto.internal_static_injective_oracle_v1beta1_SetPriceFeedPriceEvent_descriptor;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.SetPriceFeedPriceEvent getDefaultInstanceForType() {
      return com.injective.oracle.v1beta1.SetPriceFeedPriceEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.SetPriceFeedPriceEvent build() {
      com.injective.oracle.v1beta1.SetPriceFeedPriceEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.SetPriceFeedPriceEvent buildPartial() {
      com.injective.oracle.v1beta1.SetPriceFeedPriceEvent result = new com.injective.oracle.v1beta1.SetPriceFeedPriceEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.oracle.v1beta1.SetPriceFeedPriceEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.relayer_ = relayer_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.base_ = base_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.quote_ = quote_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.price_ = price_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.oracle.v1beta1.SetPriceFeedPriceEvent) {
        return mergeFrom((com.injective.oracle.v1beta1.SetPriceFeedPriceEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.oracle.v1beta1.SetPriceFeedPriceEvent other) {
      if (other == com.injective.oracle.v1beta1.SetPriceFeedPriceEvent.getDefaultInstance()) return this;
      if (!other.getRelayer().isEmpty()) {
        relayer_ = other.relayer_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBase().isEmpty()) {
        base_ = other.base_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getQuote().isEmpty()) {
        quote_ = other.quote_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getPrice().isEmpty()) {
        price_ = other.price_;
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
              relayer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              base_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              quote_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              price_ = input.readStringRequireUtf8();
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

    private java.lang.Object relayer_ = "";
    /**
     * <code>string relayer = 1 [json_name = "relayer"];</code>
     * @return The relayer.
     */
    public java.lang.String getRelayer() {
      java.lang.Object ref = relayer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        relayer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string relayer = 1 [json_name = "relayer"];</code>
     * @return The bytes for relayer.
     */
    public com.google.protobuf.ByteString
        getRelayerBytes() {
      java.lang.Object ref = relayer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        relayer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string relayer = 1 [json_name = "relayer"];</code>
     * @param value The relayer to set.
     * @return This builder for chaining.
     */
    public Builder setRelayer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      relayer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string relayer = 1 [json_name = "relayer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRelayer() {
      relayer_ = getDefaultInstance().getRelayer();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string relayer = 1 [json_name = "relayer"];</code>
     * @param value The bytes for relayer to set.
     * @return This builder for chaining.
     */
    public Builder setRelayerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      relayer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object base_ = "";
    /**
     * <code>string base = 2 [json_name = "base"];</code>
     * @return The base.
     */
    public java.lang.String getBase() {
      java.lang.Object ref = base_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        base_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string base = 2 [json_name = "base"];</code>
     * @return The bytes for base.
     */
    public com.google.protobuf.ByteString
        getBaseBytes() {
      java.lang.Object ref = base_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        base_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string base = 2 [json_name = "base"];</code>
     * @param value The base to set.
     * @return This builder for chaining.
     */
    public Builder setBase(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      base_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string base = 2 [json_name = "base"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBase() {
      base_ = getDefaultInstance().getBase();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string base = 2 [json_name = "base"];</code>
     * @param value The bytes for base to set.
     * @return This builder for chaining.
     */
    public Builder setBaseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      base_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object quote_ = "";
    /**
     * <code>string quote = 3 [json_name = "quote"];</code>
     * @return The quote.
     */
    public java.lang.String getQuote() {
      java.lang.Object ref = quote_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        quote_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string quote = 3 [json_name = "quote"];</code>
     * @return The bytes for quote.
     */
    public com.google.protobuf.ByteString
        getQuoteBytes() {
      java.lang.Object ref = quote_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        quote_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string quote = 3 [json_name = "quote"];</code>
     * @param value The quote to set.
     * @return This builder for chaining.
     */
    public Builder setQuote(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      quote_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string quote = 3 [json_name = "quote"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuote() {
      quote_ = getDefaultInstance().getQuote();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string quote = 3 [json_name = "quote"];</code>
     * @param value The bytes for quote to set.
     * @return This builder for chaining.
     */
    public Builder setQuoteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      quote_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object price_ = "";
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
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
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
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
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      price_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      price_ = getDefaultInstance().getPrice();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for price to set.
     * @return This builder for chaining.
     */
    public Builder setPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      price_ = value;
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


    // @@protoc_insertion_point(builder_scope:injective.oracle.v1beta1.SetPriceFeedPriceEvent)
  }

  // @@protoc_insertion_point(class_scope:injective.oracle.v1beta1.SetPriceFeedPriceEvent)
  private static final com.injective.oracle.v1beta1.SetPriceFeedPriceEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.oracle.v1beta1.SetPriceFeedPriceEvent();
  }

  public static com.injective.oracle.v1beta1.SetPriceFeedPriceEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetPriceFeedPriceEvent>
      PARSER = new com.google.protobuf.AbstractParser<SetPriceFeedPriceEvent>() {
    @java.lang.Override
    public SetPriceFeedPriceEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetPriceFeedPriceEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetPriceFeedPriceEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.oracle.v1beta1.SetPriceFeedPriceEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

