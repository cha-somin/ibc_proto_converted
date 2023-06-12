// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/leverage/v1/query.proto

package com.umee.leverage.v1;

/**
 * <pre>
 * QueryMaxBorrow defines the request structure for the MaxBorrow gRPC service handler.
 * </pre>
 *
 * Protobuf type {@code umee.leverage.v1.QueryMaxBorrow}
 */
public final class QueryMaxBorrow extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:umee.leverage.v1.QueryMaxBorrow)
    QueryMaxBorrowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryMaxBorrow.newBuilder() to construct.
  private QueryMaxBorrow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryMaxBorrow() {
    address_ = "";
    denom_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryMaxBorrow();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umee.leverage.v1.QueryProto.internal_static_umee_leverage_v1_QueryMaxBorrow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umee.leverage.v1.QueryProto.internal_static_umee_leverage_v1_QueryMaxBorrow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umee.leverage.v1.QueryMaxBorrow.class, com.umee.leverage.v1.QueryMaxBorrow.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <pre>
   * denom is the base token denom to borrow.
   * empty denom will query all registered tokens.
   * </pre>
   *
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * denom is the base token denom to borrow.
   * empty denom will query all registered tokens.
   * </pre>
   *
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, denom_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, denom_);
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
    if (!(obj instanceof com.umee.leverage.v1.QueryMaxBorrow)) {
      return super.equals(obj);
    }
    com.umee.leverage.v1.QueryMaxBorrow other = (com.umee.leverage.v1.QueryMaxBorrow) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getDenom()
        .equals(other.getDenom())) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umee.leverage.v1.QueryMaxBorrow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.QueryMaxBorrow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.QueryMaxBorrow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.QueryMaxBorrow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.QueryMaxBorrow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.QueryMaxBorrow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.QueryMaxBorrow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.leverage.v1.QueryMaxBorrow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umee.leverage.v1.QueryMaxBorrow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umee.leverage.v1.QueryMaxBorrow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umee.leverage.v1.QueryMaxBorrow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.leverage.v1.QueryMaxBorrow parseFrom(
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
  public static Builder newBuilder(com.umee.leverage.v1.QueryMaxBorrow prototype) {
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
   * QueryMaxBorrow defines the request structure for the MaxBorrow gRPC service handler.
   * </pre>
   *
   * Protobuf type {@code umee.leverage.v1.QueryMaxBorrow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:umee.leverage.v1.QueryMaxBorrow)
      com.umee.leverage.v1.QueryMaxBorrowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umee.leverage.v1.QueryProto.internal_static_umee_leverage_v1_QueryMaxBorrow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umee.leverage.v1.QueryProto.internal_static_umee_leverage_v1_QueryMaxBorrow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umee.leverage.v1.QueryMaxBorrow.class, com.umee.leverage.v1.QueryMaxBorrow.Builder.class);
    }

    // Construct using com.umee.leverage.v1.QueryMaxBorrow.newBuilder()
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
      address_ = "";
      denom_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.umee.leverage.v1.QueryProto.internal_static_umee_leverage_v1_QueryMaxBorrow_descriptor;
    }

    @java.lang.Override
    public com.umee.leverage.v1.QueryMaxBorrow getDefaultInstanceForType() {
      return com.umee.leverage.v1.QueryMaxBorrow.getDefaultInstance();
    }

    @java.lang.Override
    public com.umee.leverage.v1.QueryMaxBorrow build() {
      com.umee.leverage.v1.QueryMaxBorrow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umee.leverage.v1.QueryMaxBorrow buildPartial() {
      com.umee.leverage.v1.QueryMaxBorrow result = new com.umee.leverage.v1.QueryMaxBorrow(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.umee.leverage.v1.QueryMaxBorrow result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denom_ = denom_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umee.leverage.v1.QueryMaxBorrow) {
        return mergeFrom((com.umee.leverage.v1.QueryMaxBorrow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umee.leverage.v1.QueryMaxBorrow other) {
      if (other == com.umee.leverage.v1.QueryMaxBorrow.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000002;
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
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              denom_ = input.readStringRequireUtf8();
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

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
     * <pre>
     * denom is the base token denom to borrow.
     * empty denom will query all registered tokens.
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * denom is the base token denom to borrow.
     * empty denom will query all registered tokens.
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * denom is the base token denom to borrow.
     * empty denom will query all registered tokens.
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * denom is the base token denom to borrow.
     * empty denom will query all registered tokens.
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * denom is the base token denom to borrow.
     * empty denom will query all registered tokens.
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:umee.leverage.v1.QueryMaxBorrow)
  }

  // @@protoc_insertion_point(class_scope:umee.leverage.v1.QueryMaxBorrow)
  private static final com.umee.leverage.v1.QueryMaxBorrow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umee.leverage.v1.QueryMaxBorrow();
  }

  public static com.umee.leverage.v1.QueryMaxBorrow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryMaxBorrow>
      PARSER = new com.google.protobuf.AbstractParser<QueryMaxBorrow>() {
    @java.lang.Override
    public QueryMaxBorrow parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryMaxBorrow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryMaxBorrow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umee.leverage.v1.QueryMaxBorrow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

