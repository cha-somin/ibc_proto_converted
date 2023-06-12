// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/leverage/v1/events.proto

package com.umee.leverage.v1;

/**
 * <pre>
 * EventDecollaterize is emitted on Msg/Decollateralize
 * </pre>
 *
 * Protobuf type {@code umee.leverage.v1.EventDecollaterize}
 */
public final class EventDecollaterize extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:umee.leverage.v1.EventDecollaterize)
    EventDecollaterizeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventDecollaterize.newBuilder() to construct.
  private EventDecollaterize(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventDecollaterize() {
    borrower_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventDecollaterize();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umee.leverage.v1.EventsProto.internal_static_umee_leverage_v1_EventDecollaterize_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umee.leverage.v1.EventsProto.internal_static_umee_leverage_v1_EventDecollaterize_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umee.leverage.v1.EventDecollaterize.class, com.umee.leverage.v1.EventDecollaterize.Builder.class);
  }

  public static final int BORROWER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object borrower_ = "";
  /**
   * <pre>
   * Borrower bech32 address.
   * </pre>
   *
   * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The borrower.
   */
  @java.lang.Override
  public java.lang.String getBorrower() {
    java.lang.Object ref = borrower_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      borrower_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Borrower bech32 address.
   * </pre>
   *
   * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for borrower.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBorrowerBytes() {
    java.lang.Object ref = borrower_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      borrower_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UTOKEN_FIELD_NUMBER = 2;
  private com.cosmos.base.v1beta1.Coin utoken_;
  /**
   * <pre>
   * utoken removed from collateral.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
   * @return Whether the utoken field is set.
   */
  @java.lang.Override
  public boolean hasUtoken() {
    return utoken_ != null;
  }
  /**
   * <pre>
   * utoken removed from collateral.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
   * @return The utoken.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getUtoken() {
    return utoken_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : utoken_;
  }
  /**
   * <pre>
   * utoken removed from collateral.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getUtokenOrBuilder() {
    return utoken_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : utoken_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(borrower_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, borrower_);
    }
    if (utoken_ != null) {
      output.writeMessage(2, getUtoken());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(borrower_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, borrower_);
    }
    if (utoken_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUtoken());
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
    if (!(obj instanceof com.umee.leverage.v1.EventDecollaterize)) {
      return super.equals(obj);
    }
    com.umee.leverage.v1.EventDecollaterize other = (com.umee.leverage.v1.EventDecollaterize) obj;

    if (!getBorrower()
        .equals(other.getBorrower())) return false;
    if (hasUtoken() != other.hasUtoken()) return false;
    if (hasUtoken()) {
      if (!getUtoken()
          .equals(other.getUtoken())) return false;
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
    hash = (37 * hash) + BORROWER_FIELD_NUMBER;
    hash = (53 * hash) + getBorrower().hashCode();
    if (hasUtoken()) {
      hash = (37 * hash) + UTOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getUtoken().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umee.leverage.v1.EventDecollaterize parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.EventDecollaterize parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.EventDecollaterize parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.EventDecollaterize parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.EventDecollaterize parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.EventDecollaterize parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.EventDecollaterize parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.leverage.v1.EventDecollaterize parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umee.leverage.v1.EventDecollaterize parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umee.leverage.v1.EventDecollaterize parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umee.leverage.v1.EventDecollaterize parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.leverage.v1.EventDecollaterize parseFrom(
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
  public static Builder newBuilder(com.umee.leverage.v1.EventDecollaterize prototype) {
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
   * EventDecollaterize is emitted on Msg/Decollateralize
   * </pre>
   *
   * Protobuf type {@code umee.leverage.v1.EventDecollaterize}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:umee.leverage.v1.EventDecollaterize)
      com.umee.leverage.v1.EventDecollaterizeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umee.leverage.v1.EventsProto.internal_static_umee_leverage_v1_EventDecollaterize_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umee.leverage.v1.EventsProto.internal_static_umee_leverage_v1_EventDecollaterize_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umee.leverage.v1.EventDecollaterize.class, com.umee.leverage.v1.EventDecollaterize.Builder.class);
    }

    // Construct using com.umee.leverage.v1.EventDecollaterize.newBuilder()
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
      borrower_ = "";
      utoken_ = null;
      if (utokenBuilder_ != null) {
        utokenBuilder_.dispose();
        utokenBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.umee.leverage.v1.EventsProto.internal_static_umee_leverage_v1_EventDecollaterize_descriptor;
    }

    @java.lang.Override
    public com.umee.leverage.v1.EventDecollaterize getDefaultInstanceForType() {
      return com.umee.leverage.v1.EventDecollaterize.getDefaultInstance();
    }

    @java.lang.Override
    public com.umee.leverage.v1.EventDecollaterize build() {
      com.umee.leverage.v1.EventDecollaterize result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umee.leverage.v1.EventDecollaterize buildPartial() {
      com.umee.leverage.v1.EventDecollaterize result = new com.umee.leverage.v1.EventDecollaterize(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.umee.leverage.v1.EventDecollaterize result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.borrower_ = borrower_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.utoken_ = utokenBuilder_ == null
            ? utoken_
            : utokenBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umee.leverage.v1.EventDecollaterize) {
        return mergeFrom((com.umee.leverage.v1.EventDecollaterize)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umee.leverage.v1.EventDecollaterize other) {
      if (other == com.umee.leverage.v1.EventDecollaterize.getDefaultInstance()) return this;
      if (!other.getBorrower().isEmpty()) {
        borrower_ = other.borrower_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasUtoken()) {
        mergeUtoken(other.getUtoken());
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
              borrower_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUtokenFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object borrower_ = "";
    /**
     * <pre>
     * Borrower bech32 address.
     * </pre>
     *
     * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The borrower.
     */
    public java.lang.String getBorrower() {
      java.lang.Object ref = borrower_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        borrower_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Borrower bech32 address.
     * </pre>
     *
     * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for borrower.
     */
    public com.google.protobuf.ByteString
        getBorrowerBytes() {
      java.lang.Object ref = borrower_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        borrower_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Borrower bech32 address.
     * </pre>
     *
     * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The borrower to set.
     * @return This builder for chaining.
     */
    public Builder setBorrower(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      borrower_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Borrower bech32 address.
     * </pre>
     *
     * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBorrower() {
      borrower_ = getDefaultInstance().getBorrower();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Borrower bech32 address.
     * </pre>
     *
     * <code>string borrower = 1 [json_name = "borrower", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for borrower to set.
     * @return This builder for chaining.
     */
    public Builder setBorrowerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      borrower_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin utoken_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> utokenBuilder_;
    /**
     * <pre>
     * utoken removed from collateral.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
     * @return Whether the utoken field is set.
     */
    public boolean hasUtoken() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * utoken removed from collateral.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
     * @return The utoken.
     */
    public com.cosmos.base.v1beta1.Coin getUtoken() {
      if (utokenBuilder_ == null) {
        return utoken_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : utoken_;
      } else {
        return utokenBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * utoken removed from collateral.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
     */
    public Builder setUtoken(com.cosmos.base.v1beta1.Coin value) {
      if (utokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        utoken_ = value;
      } else {
        utokenBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * utoken removed from collateral.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
     */
    public Builder setUtoken(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (utokenBuilder_ == null) {
        utoken_ = builderForValue.build();
      } else {
        utokenBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * utoken removed from collateral.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeUtoken(com.cosmos.base.v1beta1.Coin value) {
      if (utokenBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          utoken_ != null &&
          utoken_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getUtokenBuilder().mergeFrom(value);
        } else {
          utoken_ = value;
        }
      } else {
        utokenBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * utoken removed from collateral.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearUtoken() {
      bitField0_ = (bitField0_ & ~0x00000002);
      utoken_ = null;
      if (utokenBuilder_ != null) {
        utokenBuilder_.dispose();
        utokenBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * utoken removed from collateral.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getUtokenBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUtokenFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * utoken removed from collateral.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getUtokenOrBuilder() {
      if (utokenBuilder_ != null) {
        return utokenBuilder_.getMessageOrBuilder();
      } else {
        return utoken_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : utoken_;
      }
    }
    /**
     * <pre>
     * utoken removed from collateral.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin utoken = 2 [json_name = "utoken", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getUtokenFieldBuilder() {
      if (utokenBuilder_ == null) {
        utokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getUtoken(),
                getParentForChildren(),
                isClean());
        utoken_ = null;
      }
      return utokenBuilder_;
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


    // @@protoc_insertion_point(builder_scope:umee.leverage.v1.EventDecollaterize)
  }

  // @@protoc_insertion_point(class_scope:umee.leverage.v1.EventDecollaterize)
  private static final com.umee.leverage.v1.EventDecollaterize DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umee.leverage.v1.EventDecollaterize();
  }

  public static com.umee.leverage.v1.EventDecollaterize getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventDecollaterize>
      PARSER = new com.google.protobuf.AbstractParser<EventDecollaterize>() {
    @java.lang.Override
    public EventDecollaterize parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventDecollaterize> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventDecollaterize> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umee.leverage.v1.EventDecollaterize getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

