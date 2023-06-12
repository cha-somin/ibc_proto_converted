// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

/**
 * Protobuf type {@code injective.exchange.v1beta1.OracleParams}
 */
public final class OracleParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.OracleParams)
    OracleParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OracleParams.newBuilder() to construct.
  private OracleParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OracleParams() {
    oracleBase_ = "";
    oracleQuote_ = "";
    oracleType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OracleParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_OracleParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_OracleParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.OracleParams.class, com.injective.exchange.v1beta1.OracleParams.Builder.class);
  }

  public static final int ORACLE_BASE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object oracleBase_ = "";
  /**
   * <pre>
   * Oracle base currency
   * </pre>
   *
   * <code>string oracle_base = 1 [json_name = "oracleBase"];</code>
   * @return The oracleBase.
   */
  @java.lang.Override
  public java.lang.String getOracleBase() {
    java.lang.Object ref = oracleBase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oracleBase_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Oracle base currency
   * </pre>
   *
   * <code>string oracle_base = 1 [json_name = "oracleBase"];</code>
   * @return The bytes for oracleBase.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOracleBaseBytes() {
    java.lang.Object ref = oracleBase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oracleBase_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORACLE_QUOTE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object oracleQuote_ = "";
  /**
   * <pre>
   * Oracle quote currency
   * </pre>
   *
   * <code>string oracle_quote = 2 [json_name = "oracleQuote"];</code>
   * @return The oracleQuote.
   */
  @java.lang.Override
  public java.lang.String getOracleQuote() {
    java.lang.Object ref = oracleQuote_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oracleQuote_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Oracle quote currency
   * </pre>
   *
   * <code>string oracle_quote = 2 [json_name = "oracleQuote"];</code>
   * @return The bytes for oracleQuote.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOracleQuoteBytes() {
    java.lang.Object ref = oracleQuote_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oracleQuote_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORACLE_SCALE_FACTOR_FIELD_NUMBER = 3;
  private int oracleScaleFactor_ = 0;
  /**
   * <pre>
   * Scale factor for oracle prices.
   * </pre>
   *
   * <code>uint32 oracle_scale_factor = 3 [json_name = "oracleScaleFactor"];</code>
   * @return The oracleScaleFactor.
   */
  @java.lang.Override
  public int getOracleScaleFactor() {
    return oracleScaleFactor_;
  }

  public static final int ORACLE_TYPE_FIELD_NUMBER = 4;
  private int oracleType_ = 0;
  /**
   * <pre>
   * Oracle type
   * </pre>
   *
   * <code>.injective.oracle.v1beta1.OracleType oracle_type = 4 [json_name = "oracleType"];</code>
   * @return The enum numeric value on the wire for oracleType.
   */
  @java.lang.Override public int getOracleTypeValue() {
    return oracleType_;
  }
  /**
   * <pre>
   * Oracle type
   * </pre>
   *
   * <code>.injective.oracle.v1beta1.OracleType oracle_type = 4 [json_name = "oracleType"];</code>
   * @return The oracleType.
   */
  @java.lang.Override public com.injective.oracle.v1beta1.OracleType getOracleType() {
    com.injective.oracle.v1beta1.OracleType result = com.injective.oracle.v1beta1.OracleType.forNumber(oracleType_);
    return result == null ? com.injective.oracle.v1beta1.OracleType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oracleBase_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, oracleBase_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oracleQuote_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, oracleQuote_);
    }
    if (oracleScaleFactor_ != 0) {
      output.writeUInt32(3, oracleScaleFactor_);
    }
    if (oracleType_ != com.injective.oracle.v1beta1.OracleType.Unspecified.getNumber()) {
      output.writeEnum(4, oracleType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oracleBase_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, oracleBase_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oracleQuote_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, oracleQuote_);
    }
    if (oracleScaleFactor_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, oracleScaleFactor_);
    }
    if (oracleType_ != com.injective.oracle.v1beta1.OracleType.Unspecified.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, oracleType_);
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
    if (!(obj instanceof com.injective.exchange.v1beta1.OracleParams)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.OracleParams other = (com.injective.exchange.v1beta1.OracleParams) obj;

    if (!getOracleBase()
        .equals(other.getOracleBase())) return false;
    if (!getOracleQuote()
        .equals(other.getOracleQuote())) return false;
    if (getOracleScaleFactor()
        != other.getOracleScaleFactor()) return false;
    if (oracleType_ != other.oracleType_) return false;
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
    hash = (37 * hash) + ORACLE_BASE_FIELD_NUMBER;
    hash = (53 * hash) + getOracleBase().hashCode();
    hash = (37 * hash) + ORACLE_QUOTE_FIELD_NUMBER;
    hash = (53 * hash) + getOracleQuote().hashCode();
    hash = (37 * hash) + ORACLE_SCALE_FACTOR_FIELD_NUMBER;
    hash = (53 * hash) + getOracleScaleFactor();
    hash = (37 * hash) + ORACLE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + oracleType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.OracleParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.OracleParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.OracleParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.OracleParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.OracleParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.OracleParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.OracleParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.OracleParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.OracleParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.OracleParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.OracleParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.OracleParams parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.OracleParams prototype) {
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
   * Protobuf type {@code injective.exchange.v1beta1.OracleParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.OracleParams)
      com.injective.exchange.v1beta1.OracleParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_OracleParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_OracleParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.OracleParams.class, com.injective.exchange.v1beta1.OracleParams.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.OracleParams.newBuilder()
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
      oracleBase_ = "";
      oracleQuote_ = "";
      oracleScaleFactor_ = 0;
      oracleType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.TxProto.internal_static_injective_exchange_v1beta1_OracleParams_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.OracleParams getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.OracleParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.OracleParams build() {
      com.injective.exchange.v1beta1.OracleParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.OracleParams buildPartial() {
      com.injective.exchange.v1beta1.OracleParams result = new com.injective.exchange.v1beta1.OracleParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.OracleParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.oracleBase_ = oracleBase_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.oracleQuote_ = oracleQuote_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.oracleScaleFactor_ = oracleScaleFactor_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.oracleType_ = oracleType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.OracleParams) {
        return mergeFrom((com.injective.exchange.v1beta1.OracleParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.OracleParams other) {
      if (other == com.injective.exchange.v1beta1.OracleParams.getDefaultInstance()) return this;
      if (!other.getOracleBase().isEmpty()) {
        oracleBase_ = other.oracleBase_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOracleQuote().isEmpty()) {
        oracleQuote_ = other.oracleQuote_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getOracleScaleFactor() != 0) {
        setOracleScaleFactor(other.getOracleScaleFactor());
      }
      if (other.oracleType_ != 0) {
        setOracleTypeValue(other.getOracleTypeValue());
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
              oracleBase_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              oracleQuote_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              oracleScaleFactor_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              oracleType_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object oracleBase_ = "";
    /**
     * <pre>
     * Oracle base currency
     * </pre>
     *
     * <code>string oracle_base = 1 [json_name = "oracleBase"];</code>
     * @return The oracleBase.
     */
    public java.lang.String getOracleBase() {
      java.lang.Object ref = oracleBase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oracleBase_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Oracle base currency
     * </pre>
     *
     * <code>string oracle_base = 1 [json_name = "oracleBase"];</code>
     * @return The bytes for oracleBase.
     */
    public com.google.protobuf.ByteString
        getOracleBaseBytes() {
      java.lang.Object ref = oracleBase_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oracleBase_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Oracle base currency
     * </pre>
     *
     * <code>string oracle_base = 1 [json_name = "oracleBase"];</code>
     * @param value The oracleBase to set.
     * @return This builder for chaining.
     */
    public Builder setOracleBase(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      oracleBase_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Oracle base currency
     * </pre>
     *
     * <code>string oracle_base = 1 [json_name = "oracleBase"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOracleBase() {
      oracleBase_ = getDefaultInstance().getOracleBase();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Oracle base currency
     * </pre>
     *
     * <code>string oracle_base = 1 [json_name = "oracleBase"];</code>
     * @param value The bytes for oracleBase to set.
     * @return This builder for chaining.
     */
    public Builder setOracleBaseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      oracleBase_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object oracleQuote_ = "";
    /**
     * <pre>
     * Oracle quote currency
     * </pre>
     *
     * <code>string oracle_quote = 2 [json_name = "oracleQuote"];</code>
     * @return The oracleQuote.
     */
    public java.lang.String getOracleQuote() {
      java.lang.Object ref = oracleQuote_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oracleQuote_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Oracle quote currency
     * </pre>
     *
     * <code>string oracle_quote = 2 [json_name = "oracleQuote"];</code>
     * @return The bytes for oracleQuote.
     */
    public com.google.protobuf.ByteString
        getOracleQuoteBytes() {
      java.lang.Object ref = oracleQuote_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oracleQuote_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Oracle quote currency
     * </pre>
     *
     * <code>string oracle_quote = 2 [json_name = "oracleQuote"];</code>
     * @param value The oracleQuote to set.
     * @return This builder for chaining.
     */
    public Builder setOracleQuote(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      oracleQuote_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Oracle quote currency
     * </pre>
     *
     * <code>string oracle_quote = 2 [json_name = "oracleQuote"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOracleQuote() {
      oracleQuote_ = getDefaultInstance().getOracleQuote();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Oracle quote currency
     * </pre>
     *
     * <code>string oracle_quote = 2 [json_name = "oracleQuote"];</code>
     * @param value The bytes for oracleQuote to set.
     * @return This builder for chaining.
     */
    public Builder setOracleQuoteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      oracleQuote_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int oracleScaleFactor_ ;
    /**
     * <pre>
     * Scale factor for oracle prices.
     * </pre>
     *
     * <code>uint32 oracle_scale_factor = 3 [json_name = "oracleScaleFactor"];</code>
     * @return The oracleScaleFactor.
     */
    @java.lang.Override
    public int getOracleScaleFactor() {
      return oracleScaleFactor_;
    }
    /**
     * <pre>
     * Scale factor for oracle prices.
     * </pre>
     *
     * <code>uint32 oracle_scale_factor = 3 [json_name = "oracleScaleFactor"];</code>
     * @param value The oracleScaleFactor to set.
     * @return This builder for chaining.
     */
    public Builder setOracleScaleFactor(int value) {

      oracleScaleFactor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scale factor for oracle prices.
     * </pre>
     *
     * <code>uint32 oracle_scale_factor = 3 [json_name = "oracleScaleFactor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOracleScaleFactor() {
      bitField0_ = (bitField0_ & ~0x00000004);
      oracleScaleFactor_ = 0;
      onChanged();
      return this;
    }

    private int oracleType_ = 0;
    /**
     * <pre>
     * Oracle type
     * </pre>
     *
     * <code>.injective.oracle.v1beta1.OracleType oracle_type = 4 [json_name = "oracleType"];</code>
     * @return The enum numeric value on the wire for oracleType.
     */
    @java.lang.Override public int getOracleTypeValue() {
      return oracleType_;
    }
    /**
     * <pre>
     * Oracle type
     * </pre>
     *
     * <code>.injective.oracle.v1beta1.OracleType oracle_type = 4 [json_name = "oracleType"];</code>
     * @param value The enum numeric value on the wire for oracleType to set.
     * @return This builder for chaining.
     */
    public Builder setOracleTypeValue(int value) {
      oracleType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Oracle type
     * </pre>
     *
     * <code>.injective.oracle.v1beta1.OracleType oracle_type = 4 [json_name = "oracleType"];</code>
     * @return The oracleType.
     */
    @java.lang.Override
    public com.injective.oracle.v1beta1.OracleType getOracleType() {
      com.injective.oracle.v1beta1.OracleType result = com.injective.oracle.v1beta1.OracleType.forNumber(oracleType_);
      return result == null ? com.injective.oracle.v1beta1.OracleType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Oracle type
     * </pre>
     *
     * <code>.injective.oracle.v1beta1.OracleType oracle_type = 4 [json_name = "oracleType"];</code>
     * @param value The oracleType to set.
     * @return This builder for chaining.
     */
    public Builder setOracleType(com.injective.oracle.v1beta1.OracleType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      oracleType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Oracle type
     * </pre>
     *
     * <code>.injective.oracle.v1beta1.OracleType oracle_type = 4 [json_name = "oracleType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOracleType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      oracleType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.OracleParams)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.OracleParams)
  private static final com.injective.exchange.v1beta1.OracleParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.OracleParams();
  }

  public static com.injective.exchange.v1beta1.OracleParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OracleParams>
      PARSER = new com.google.protobuf.AbstractParser<OracleParams>() {
    @java.lang.Override
    public OracleParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<OracleParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OracleParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.OracleParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

