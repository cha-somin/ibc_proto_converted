// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

/**
 * Protobuf type {@code injective.exchange.v1beta1.Subaccount}
 */
public final class Subaccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.Subaccount)
    SubaccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Subaccount.newBuilder() to construct.
  private Subaccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Subaccount() {
    trader_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Subaccount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_Subaccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_Subaccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.Subaccount.class, com.injective.exchange.v1beta1.Subaccount.Builder.class);
  }

  public static final int TRADER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object trader_ = "";
  /**
   * <code>string trader = 1 [json_name = "trader"];</code>
   * @return The trader.
   */
  @java.lang.Override
  public java.lang.String getTrader() {
    java.lang.Object ref = trader_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trader_ = s;
      return s;
    }
  }
  /**
   * <code>string trader = 1 [json_name = "trader"];</code>
   * @return The bytes for trader.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTraderBytes() {
    java.lang.Object ref = trader_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      trader_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBACCOUNT_NONCE_FIELD_NUMBER = 2;
  private int subaccountNonce_ = 0;
  /**
   * <code>uint32 subaccount_nonce = 2 [json_name = "subaccountNonce"];</code>
   * @return The subaccountNonce.
   */
  @java.lang.Override
  public int getSubaccountNonce() {
    return subaccountNonce_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trader_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trader_);
    }
    if (subaccountNonce_ != 0) {
      output.writeUInt32(2, subaccountNonce_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trader_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trader_);
    }
    if (subaccountNonce_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, subaccountNonce_);
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
    if (!(obj instanceof com.injective.exchange.v1beta1.Subaccount)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.Subaccount other = (com.injective.exchange.v1beta1.Subaccount) obj;

    if (!getTrader()
        .equals(other.getTrader())) return false;
    if (getSubaccountNonce()
        != other.getSubaccountNonce()) return false;
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
    hash = (37 * hash) + TRADER_FIELD_NUMBER;
    hash = (53 * hash) + getTrader().hashCode();
    hash = (37 * hash) + SUBACCOUNT_NONCE_FIELD_NUMBER;
    hash = (53 * hash) + getSubaccountNonce();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.Subaccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.Subaccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.Subaccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.Subaccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.Subaccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.Subaccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.Subaccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.Subaccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.Subaccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.Subaccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.Subaccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.Subaccount parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.Subaccount prototype) {
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
   * Protobuf type {@code injective.exchange.v1beta1.Subaccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.Subaccount)
      com.injective.exchange.v1beta1.SubaccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_Subaccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_Subaccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.Subaccount.class, com.injective.exchange.v1beta1.Subaccount.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.Subaccount.newBuilder()
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
      trader_ = "";
      subaccountNonce_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_Subaccount_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.Subaccount getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.Subaccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.Subaccount build() {
      com.injective.exchange.v1beta1.Subaccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.Subaccount buildPartial() {
      com.injective.exchange.v1beta1.Subaccount result = new com.injective.exchange.v1beta1.Subaccount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.Subaccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.trader_ = trader_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subaccountNonce_ = subaccountNonce_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.Subaccount) {
        return mergeFrom((com.injective.exchange.v1beta1.Subaccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.Subaccount other) {
      if (other == com.injective.exchange.v1beta1.Subaccount.getDefaultInstance()) return this;
      if (!other.getTrader().isEmpty()) {
        trader_ = other.trader_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getSubaccountNonce() != 0) {
        setSubaccountNonce(other.getSubaccountNonce());
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
              trader_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              subaccountNonce_ = input.readUInt32();
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

    private java.lang.Object trader_ = "";
    /**
     * <code>string trader = 1 [json_name = "trader"];</code>
     * @return The trader.
     */
    public java.lang.String getTrader() {
      java.lang.Object ref = trader_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trader_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string trader = 1 [json_name = "trader"];</code>
     * @return The bytes for trader.
     */
    public com.google.protobuf.ByteString
        getTraderBytes() {
      java.lang.Object ref = trader_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trader_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string trader = 1 [json_name = "trader"];</code>
     * @param value The trader to set.
     * @return This builder for chaining.
     */
    public Builder setTrader(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      trader_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string trader = 1 [json_name = "trader"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTrader() {
      trader_ = getDefaultInstance().getTrader();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string trader = 1 [json_name = "trader"];</code>
     * @param value The bytes for trader to set.
     * @return This builder for chaining.
     */
    public Builder setTraderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      trader_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int subaccountNonce_ ;
    /**
     * <code>uint32 subaccount_nonce = 2 [json_name = "subaccountNonce"];</code>
     * @return The subaccountNonce.
     */
    @java.lang.Override
    public int getSubaccountNonce() {
      return subaccountNonce_;
    }
    /**
     * <code>uint32 subaccount_nonce = 2 [json_name = "subaccountNonce"];</code>
     * @param value The subaccountNonce to set.
     * @return This builder for chaining.
     */
    public Builder setSubaccountNonce(int value) {

      subaccountNonce_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 subaccount_nonce = 2 [json_name = "subaccountNonce"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubaccountNonce() {
      bitField0_ = (bitField0_ & ~0x00000002);
      subaccountNonce_ = 0;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.Subaccount)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.Subaccount)
  private static final com.injective.exchange.v1beta1.Subaccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.Subaccount();
  }

  public static com.injective.exchange.v1beta1.Subaccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Subaccount>
      PARSER = new com.google.protobuf.AbstractParser<Subaccount>() {
    @java.lang.Override
    public Subaccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<Subaccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Subaccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.Subaccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

