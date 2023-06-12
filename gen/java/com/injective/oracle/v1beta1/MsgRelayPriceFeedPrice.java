// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/tx.proto

package com.injective.oracle.v1beta1;

/**
 * <pre>
 * MsgRelayPriceFeedPrice defines a SDK message for setting a price through the
 * pricefeed oracle.
 * </pre>
 *
 * Protobuf type {@code injective.oracle.v1beta1.MsgRelayPriceFeedPrice}
 */
public final class MsgRelayPriceFeedPrice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.oracle.v1beta1.MsgRelayPriceFeedPrice)
    MsgRelayPriceFeedPriceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgRelayPriceFeedPrice.newBuilder() to construct.
  private MsgRelayPriceFeedPrice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgRelayPriceFeedPrice() {
    sender_ = "";
    base_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    quote_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    price_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgRelayPriceFeedPrice();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.oracle.v1beta1.TxProto.internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPrice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.oracle.v1beta1.TxProto.internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPrice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.class, com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sender_ = "";
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The sender.
   */
  @java.lang.Override
  public java.lang.String getSender() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sender_ = s;
      return s;
    }
  }
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSenderBytes() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sender_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BASE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList base_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string base = 2 [json_name = "base"];</code>
   * @return A list containing the base.
   */
  public com.google.protobuf.ProtocolStringList
      getBaseList() {
    return base_;
  }
  /**
   * <code>repeated string base = 2 [json_name = "base"];</code>
   * @return The count of base.
   */
  public int getBaseCount() {
    return base_.size();
  }
  /**
   * <code>repeated string base = 2 [json_name = "base"];</code>
   * @param index The index of the element to return.
   * @return The base at the given index.
   */
  public java.lang.String getBase(int index) {
    return base_.get(index);
  }
  /**
   * <code>repeated string base = 2 [json_name = "base"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the base at the given index.
   */
  public com.google.protobuf.ByteString
      getBaseBytes(int index) {
    return base_.getByteString(index);
  }

  public static final int QUOTE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList quote_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string quote = 3 [json_name = "quote"];</code>
   * @return A list containing the quote.
   */
  public com.google.protobuf.ProtocolStringList
      getQuoteList() {
    return quote_;
  }
  /**
   * <code>repeated string quote = 3 [json_name = "quote"];</code>
   * @return The count of quote.
   */
  public int getQuoteCount() {
    return quote_.size();
  }
  /**
   * <code>repeated string quote = 3 [json_name = "quote"];</code>
   * @param index The index of the element to return.
   * @return The quote at the given index.
   */
  public java.lang.String getQuote(int index) {
    return quote_.get(index);
  }
  /**
   * <code>repeated string quote = 3 [json_name = "quote"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the quote at the given index.
   */
  public com.google.protobuf.ByteString
      getQuoteBytes(int index) {
    return quote_.getByteString(index);
  }

  public static final int PRICE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList price_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * price defines the price of the oracle base and quote
   * </pre>
   *
   * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return A list containing the price.
   */
  public com.google.protobuf.ProtocolStringList
      getPriceList() {
    return price_;
  }
  /**
   * <pre>
   * price defines the price of the oracle base and quote
   * </pre>
   *
   * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The count of price.
   */
  public int getPriceCount() {
    return price_.size();
  }
  /**
   * <pre>
   * price defines the price of the oracle base and quote
   * </pre>
   *
   * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @param index The index of the element to return.
   * @return The price at the given index.
   */
  public java.lang.String getPrice(int index) {
    return price_.get(index);
  }
  /**
   * <pre>
   * price defines the price of the oracle base and quote
   * </pre>
   *
   * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the price at the given index.
   */
  public com.google.protobuf.ByteString
      getPriceBytes(int index) {
    return price_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sender_);
    }
    for (int i = 0; i < base_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, base_.getRaw(i));
    }
    for (int i = 0; i < quote_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, quote_.getRaw(i));
    }
    for (int i = 0; i < price_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, price_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sender_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < base_.size(); i++) {
        dataSize += computeStringSizeNoTag(base_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getBaseList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < quote_.size(); i++) {
        dataSize += computeStringSizeNoTag(quote_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getQuoteList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < price_.size(); i++) {
        dataSize += computeStringSizeNoTag(price_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPriceList().size();
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
    if (!(obj instanceof com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice)) {
      return super.equals(obj);
    }
    com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice other = (com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getBaseList()
        .equals(other.getBaseList())) return false;
    if (!getQuoteList()
        .equals(other.getQuoteList())) return false;
    if (!getPriceList()
        .equals(other.getPriceList())) return false;
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
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    if (getBaseCount() > 0) {
      hash = (37 * hash) + BASE_FIELD_NUMBER;
      hash = (53 * hash) + getBaseList().hashCode();
    }
    if (getQuoteCount() > 0) {
      hash = (37 * hash) + QUOTE_FIELD_NUMBER;
      hash = (53 * hash) + getQuoteList().hashCode();
    }
    if (getPriceCount() > 0) {
      hash = (37 * hash) + PRICE_FIELD_NUMBER;
      hash = (53 * hash) + getPriceList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice parseFrom(
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
  public static Builder newBuilder(com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice prototype) {
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
   * MsgRelayPriceFeedPrice defines a SDK message for setting a price through the
   * pricefeed oracle.
   * </pre>
   *
   * Protobuf type {@code injective.oracle.v1beta1.MsgRelayPriceFeedPrice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.oracle.v1beta1.MsgRelayPriceFeedPrice)
      com.injective.oracle.v1beta1.MsgRelayPriceFeedPriceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.oracle.v1beta1.TxProto.internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPrice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.oracle.v1beta1.TxProto.internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPrice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.class, com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.Builder.class);
    }

    // Construct using com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.newBuilder()
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
      sender_ = "";
      base_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      quote_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      price_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.oracle.v1beta1.TxProto.internal_static_injective_oracle_v1beta1_MsgRelayPriceFeedPrice_descriptor;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice getDefaultInstanceForType() {
      return com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice build() {
      com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice buildPartial() {
      com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice result = new com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        base_.makeImmutable();
        result.base_ = base_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        quote_.makeImmutable();
        result.quote_ = quote_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        price_.makeImmutable();
        result.price_ = price_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice) {
        return mergeFrom((com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice other) {
      if (other == com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.getDefaultInstance()) return this;
      if (!other.getSender().isEmpty()) {
        sender_ = other.sender_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.base_.isEmpty()) {
        if (base_.isEmpty()) {
          base_ = other.base_;
          bitField0_ |= 0x00000002;
        } else {
          ensureBaseIsMutable();
          base_.addAll(other.base_);
        }
        onChanged();
      }
      if (!other.quote_.isEmpty()) {
        if (quote_.isEmpty()) {
          quote_ = other.quote_;
          bitField0_ |= 0x00000004;
        } else {
          ensureQuoteIsMutable();
          quote_.addAll(other.quote_);
        }
        onChanged();
      }
      if (!other.price_.isEmpty()) {
        if (price_.isEmpty()) {
          price_ = other.price_;
          bitField0_ |= 0x00000008;
        } else {
          ensurePriceIsMutable();
          price_.addAll(other.price_);
        }
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
              sender_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureBaseIsMutable();
              base_.add(s);
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureQuoteIsMutable();
              quote_.add(s);
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensurePriceIsMutable();
              price_.add(s);
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

    private java.lang.Object sender_ = "";
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return The sender.
     */
    public java.lang.String getSender() {
      java.lang.Object ref = sender_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return The bytes for sender.
     */
    public com.google.protobuf.ByteString
        getSenderBytes() {
      java.lang.Object ref = sender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      sender_ = getDefaultInstance().getSender();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @param value The bytes for sender to set.
     * @return This builder for chaining.
     */
    public Builder setSenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList base_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureBaseIsMutable() {
      if (!base_.isModifiable()) {
        base_ = new com.google.protobuf.LazyStringArrayList(base_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string base = 2 [json_name = "base"];</code>
     * @return A list containing the base.
     */
    public com.google.protobuf.ProtocolStringList
        getBaseList() {
      base_.makeImmutable();
      return base_;
    }
    /**
     * <code>repeated string base = 2 [json_name = "base"];</code>
     * @return The count of base.
     */
    public int getBaseCount() {
      return base_.size();
    }
    /**
     * <code>repeated string base = 2 [json_name = "base"];</code>
     * @param index The index of the element to return.
     * @return The base at the given index.
     */
    public java.lang.String getBase(int index) {
      return base_.get(index);
    }
    /**
     * <code>repeated string base = 2 [json_name = "base"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the base at the given index.
     */
    public com.google.protobuf.ByteString
        getBaseBytes(int index) {
      return base_.getByteString(index);
    }
    /**
     * <code>repeated string base = 2 [json_name = "base"];</code>
     * @param index The index to set the value at.
     * @param value The base to set.
     * @return This builder for chaining.
     */
    public Builder setBase(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureBaseIsMutable();
      base_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string base = 2 [json_name = "base"];</code>
     * @param value The base to add.
     * @return This builder for chaining.
     */
    public Builder addBase(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureBaseIsMutable();
      base_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string base = 2 [json_name = "base"];</code>
     * @param values The base to add.
     * @return This builder for chaining.
     */
    public Builder addAllBase(
        java.lang.Iterable<java.lang.String> values) {
      ensureBaseIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, base_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string base = 2 [json_name = "base"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBase() {
      base_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string base = 2 [json_name = "base"];</code>
     * @param value The bytes of the base to add.
     * @return This builder for chaining.
     */
    public Builder addBaseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureBaseIsMutable();
      base_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList quote_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureQuoteIsMutable() {
      if (!quote_.isModifiable()) {
        quote_ = new com.google.protobuf.LazyStringArrayList(quote_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated string quote = 3 [json_name = "quote"];</code>
     * @return A list containing the quote.
     */
    public com.google.protobuf.ProtocolStringList
        getQuoteList() {
      quote_.makeImmutable();
      return quote_;
    }
    /**
     * <code>repeated string quote = 3 [json_name = "quote"];</code>
     * @return The count of quote.
     */
    public int getQuoteCount() {
      return quote_.size();
    }
    /**
     * <code>repeated string quote = 3 [json_name = "quote"];</code>
     * @param index The index of the element to return.
     * @return The quote at the given index.
     */
    public java.lang.String getQuote(int index) {
      return quote_.get(index);
    }
    /**
     * <code>repeated string quote = 3 [json_name = "quote"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the quote at the given index.
     */
    public com.google.protobuf.ByteString
        getQuoteBytes(int index) {
      return quote_.getByteString(index);
    }
    /**
     * <code>repeated string quote = 3 [json_name = "quote"];</code>
     * @param index The index to set the value at.
     * @param value The quote to set.
     * @return This builder for chaining.
     */
    public Builder setQuote(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureQuoteIsMutable();
      quote_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string quote = 3 [json_name = "quote"];</code>
     * @param value The quote to add.
     * @return This builder for chaining.
     */
    public Builder addQuote(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureQuoteIsMutable();
      quote_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string quote = 3 [json_name = "quote"];</code>
     * @param values The quote to add.
     * @return This builder for chaining.
     */
    public Builder addAllQuote(
        java.lang.Iterable<java.lang.String> values) {
      ensureQuoteIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, quote_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string quote = 3 [json_name = "quote"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuote() {
      quote_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string quote = 3 [json_name = "quote"];</code>
     * @param value The bytes of the quote to add.
     * @return This builder for chaining.
     */
    public Builder addQuoteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureQuoteIsMutable();
      quote_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList price_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensurePriceIsMutable() {
      if (!price_.isModifiable()) {
        price_ = new com.google.protobuf.LazyStringArrayList(price_);
      }
      bitField0_ |= 0x00000008;
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return A list containing the price.
     */
    public com.google.protobuf.ProtocolStringList
        getPriceList() {
      price_.makeImmutable();
      return price_;
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The count of price.
     */
    public int getPriceCount() {
      return price_.size();
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param index The index of the element to return.
     * @return The price at the given index.
     */
    public java.lang.String getPrice(int index) {
      return price_.get(index);
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the price at the given index.
     */
    public com.google.protobuf.ByteString
        getPriceBytes(int index) {
      return price_.getByteString(index);
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param index The index to set the value at.
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePriceIsMutable();
      price_.set(index, value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The price to add.
     * @return This builder for chaining.
     */
    public Builder addPrice(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePriceIsMutable();
      price_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param values The price to add.
     * @return This builder for chaining.
     */
    public Builder addAllPrice(
        java.lang.Iterable<java.lang.String> values) {
      ensurePriceIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, price_);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      price_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * price defines the price of the oracle base and quote
     * </pre>
     *
     * <code>repeated string price = 4 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes of the price to add.
     * @return This builder for chaining.
     */
    public Builder addPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePriceIsMutable();
      price_.add(value);
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


    // @@protoc_insertion_point(builder_scope:injective.oracle.v1beta1.MsgRelayPriceFeedPrice)
  }

  // @@protoc_insertion_point(class_scope:injective.oracle.v1beta1.MsgRelayPriceFeedPrice)
  private static final com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice();
  }

  public static com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgRelayPriceFeedPrice>
      PARSER = new com.google.protobuf.AbstractParser<MsgRelayPriceFeedPrice>() {
    @java.lang.Override
    public MsgRelayPriceFeedPrice parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgRelayPriceFeedPrice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgRelayPriceFeedPrice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.oracle.v1beta1.MsgRelayPriceFeedPrice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

