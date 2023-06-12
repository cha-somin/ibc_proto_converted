// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/concentrated-liquidity/gov.proto

package com.osmosis.concentratedliquidity.v1beta1;

/**
 * Protobuf type {@code osmosis.concentratedliquidity.v1beta1.PoolRecord}
 */
public final class PoolRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.concentratedliquidity.v1beta1.PoolRecord)
    PoolRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PoolRecord.newBuilder() to construct.
  private PoolRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PoolRecord() {
    denom0_ = "";
    denom1_ = "";
    exponentAtPriceOne_ = "";
    spreadFactor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PoolRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.concentratedliquidity.v1beta1.GovProto.internal_static_osmosis_concentratedliquidity_v1beta1_PoolRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.concentratedliquidity.v1beta1.GovProto.internal_static_osmosis_concentratedliquidity_v1beta1_PoolRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.concentratedliquidity.v1beta1.PoolRecord.class, com.osmosis.concentratedliquidity.v1beta1.PoolRecord.Builder.class);
  }

  public static final int DENOM0_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom0_ = "";
  /**
   * <code>string denom0 = 1 [json_name = "denom0", (.gogoproto.moretags) = "yaml:&#92;"denom0&#92;""];</code>
   * @return The denom0.
   */
  @java.lang.Override
  public java.lang.String getDenom0() {
    java.lang.Object ref = denom0_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom0_ = s;
      return s;
    }
  }
  /**
   * <code>string denom0 = 1 [json_name = "denom0", (.gogoproto.moretags) = "yaml:&#92;"denom0&#92;""];</code>
   * @return The bytes for denom0.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenom0Bytes() {
    java.lang.Object ref = denom0_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom0_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DENOM1_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom1_ = "";
  /**
   * <code>string denom1 = 2 [json_name = "denom1", (.gogoproto.moretags) = "yaml:&#92;"denom1&#92;""];</code>
   * @return The denom1.
   */
  @java.lang.Override
  public java.lang.String getDenom1() {
    java.lang.Object ref = denom1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom1_ = s;
      return s;
    }
  }
  /**
   * <code>string denom1 = 2 [json_name = "denom1", (.gogoproto.moretags) = "yaml:&#92;"denom1&#92;""];</code>
   * @return The bytes for denom1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenom1Bytes() {
    java.lang.Object ref = denom1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TICK_SPACING_FIELD_NUMBER = 3;
  private long tickSpacing_ = 0L;
  /**
   * <code>uint64 tick_spacing = 3 [json_name = "tickSpacing", (.gogoproto.moretags) = "yaml:&#92;"tick_spacing&#92;""];</code>
   * @return The tickSpacing.
   */
  @java.lang.Override
  public long getTickSpacing() {
    return tickSpacing_;
  }

  public static final int EXPONENT_AT_PRICE_ONE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object exponentAtPriceOne_ = "";
  /**
   * <code>string exponent_at_price_one = 4 [json_name = "exponentAtPriceOne", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"exponent_at_price_one&#92;""];</code>
   * @return The exponentAtPriceOne.
   */
  @java.lang.Override
  public java.lang.String getExponentAtPriceOne() {
    java.lang.Object ref = exponentAtPriceOne_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exponentAtPriceOne_ = s;
      return s;
    }
  }
  /**
   * <code>string exponent_at_price_one = 4 [json_name = "exponentAtPriceOne", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"exponent_at_price_one&#92;""];</code>
   * @return The bytes for exponentAtPriceOne.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExponentAtPriceOneBytes() {
    java.lang.Object ref = exponentAtPriceOne_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      exponentAtPriceOne_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPREAD_FACTOR_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object spreadFactor_ = "";
  /**
   * <code>string spread_factor = 5 [json_name = "spreadFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"spread_factor&#92;""];</code>
   * @return The spreadFactor.
   */
  @java.lang.Override
  public java.lang.String getSpreadFactor() {
    java.lang.Object ref = spreadFactor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spreadFactor_ = s;
      return s;
    }
  }
  /**
   * <code>string spread_factor = 5 [json_name = "spreadFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"spread_factor&#92;""];</code>
   * @return The bytes for spreadFactor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpreadFactorBytes() {
    java.lang.Object ref = spreadFactor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spreadFactor_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom0_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom0_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, denom1_);
    }
    if (tickSpacing_ != 0L) {
      output.writeUInt64(3, tickSpacing_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exponentAtPriceOne_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, exponentAtPriceOne_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spreadFactor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, spreadFactor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom0_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom0_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, denom1_);
    }
    if (tickSpacing_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, tickSpacing_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exponentAtPriceOne_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, exponentAtPriceOne_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spreadFactor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, spreadFactor_);
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
    if (!(obj instanceof com.osmosis.concentratedliquidity.v1beta1.PoolRecord)) {
      return super.equals(obj);
    }
    com.osmosis.concentratedliquidity.v1beta1.PoolRecord other = (com.osmosis.concentratedliquidity.v1beta1.PoolRecord) obj;

    if (!getDenom0()
        .equals(other.getDenom0())) return false;
    if (!getDenom1()
        .equals(other.getDenom1())) return false;
    if (getTickSpacing()
        != other.getTickSpacing()) return false;
    if (!getExponentAtPriceOne()
        .equals(other.getExponentAtPriceOne())) return false;
    if (!getSpreadFactor()
        .equals(other.getSpreadFactor())) return false;
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
    hash = (37 * hash) + DENOM0_FIELD_NUMBER;
    hash = (53 * hash) + getDenom0().hashCode();
    hash = (37 * hash) + DENOM1_FIELD_NUMBER;
    hash = (53 * hash) + getDenom1().hashCode();
    hash = (37 * hash) + TICK_SPACING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTickSpacing());
    hash = (37 * hash) + EXPONENT_AT_PRICE_ONE_FIELD_NUMBER;
    hash = (53 * hash) + getExponentAtPriceOne().hashCode();
    hash = (37 * hash) + SPREAD_FACTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSpreadFactor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord parseFrom(
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
  public static Builder newBuilder(com.osmosis.concentratedliquidity.v1beta1.PoolRecord prototype) {
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
   * Protobuf type {@code osmosis.concentratedliquidity.v1beta1.PoolRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.concentratedliquidity.v1beta1.PoolRecord)
      com.osmosis.concentratedliquidity.v1beta1.PoolRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.concentratedliquidity.v1beta1.GovProto.internal_static_osmosis_concentratedliquidity_v1beta1_PoolRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.concentratedliquidity.v1beta1.GovProto.internal_static_osmosis_concentratedliquidity_v1beta1_PoolRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.concentratedliquidity.v1beta1.PoolRecord.class, com.osmosis.concentratedliquidity.v1beta1.PoolRecord.Builder.class);
    }

    // Construct using com.osmosis.concentratedliquidity.v1beta1.PoolRecord.newBuilder()
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
      denom0_ = "";
      denom1_ = "";
      tickSpacing_ = 0L;
      exponentAtPriceOne_ = "";
      spreadFactor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.concentratedliquidity.v1beta1.GovProto.internal_static_osmosis_concentratedliquidity_v1beta1_PoolRecord_descriptor;
    }

    @java.lang.Override
    public com.osmosis.concentratedliquidity.v1beta1.PoolRecord getDefaultInstanceForType() {
      return com.osmosis.concentratedliquidity.v1beta1.PoolRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.concentratedliquidity.v1beta1.PoolRecord build() {
      com.osmosis.concentratedliquidity.v1beta1.PoolRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.concentratedliquidity.v1beta1.PoolRecord buildPartial() {
      com.osmosis.concentratedliquidity.v1beta1.PoolRecord result = new com.osmosis.concentratedliquidity.v1beta1.PoolRecord(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.concentratedliquidity.v1beta1.PoolRecord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.denom0_ = denom0_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denom1_ = denom1_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tickSpacing_ = tickSpacing_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.exponentAtPriceOne_ = exponentAtPriceOne_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.spreadFactor_ = spreadFactor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.concentratedliquidity.v1beta1.PoolRecord) {
        return mergeFrom((com.osmosis.concentratedliquidity.v1beta1.PoolRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.concentratedliquidity.v1beta1.PoolRecord other) {
      if (other == com.osmosis.concentratedliquidity.v1beta1.PoolRecord.getDefaultInstance()) return this;
      if (!other.getDenom0().isEmpty()) {
        denom0_ = other.denom0_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDenom1().isEmpty()) {
        denom1_ = other.denom1_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getTickSpacing() != 0L) {
        setTickSpacing(other.getTickSpacing());
      }
      if (!other.getExponentAtPriceOne().isEmpty()) {
        exponentAtPriceOne_ = other.exponentAtPriceOne_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getSpreadFactor().isEmpty()) {
        spreadFactor_ = other.spreadFactor_;
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
            case 10: {
              denom0_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              denom1_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              tickSpacing_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              exponentAtPriceOne_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              spreadFactor_ = input.readStringRequireUtf8();
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

    private java.lang.Object denom0_ = "";
    /**
     * <code>string denom0 = 1 [json_name = "denom0", (.gogoproto.moretags) = "yaml:&#92;"denom0&#92;""];</code>
     * @return The denom0.
     */
    public java.lang.String getDenom0() {
      java.lang.Object ref = denom0_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom0_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom0 = 1 [json_name = "denom0", (.gogoproto.moretags) = "yaml:&#92;"denom0&#92;""];</code>
     * @return The bytes for denom0.
     */
    public com.google.protobuf.ByteString
        getDenom0Bytes() {
      java.lang.Object ref = denom0_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom0_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom0 = 1 [json_name = "denom0", (.gogoproto.moretags) = "yaml:&#92;"denom0&#92;""];</code>
     * @param value The denom0 to set.
     * @return This builder for chaining.
     */
    public Builder setDenom0(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom0_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string denom0 = 1 [json_name = "denom0", (.gogoproto.moretags) = "yaml:&#92;"denom0&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom0() {
      denom0_ = getDefaultInstance().getDenom0();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string denom0 = 1 [json_name = "denom0", (.gogoproto.moretags) = "yaml:&#92;"denom0&#92;""];</code>
     * @param value The bytes for denom0 to set.
     * @return This builder for chaining.
     */
    public Builder setDenom0Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom0_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object denom1_ = "";
    /**
     * <code>string denom1 = 2 [json_name = "denom1", (.gogoproto.moretags) = "yaml:&#92;"denom1&#92;""];</code>
     * @return The denom1.
     */
    public java.lang.String getDenom1() {
      java.lang.Object ref = denom1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom1 = 2 [json_name = "denom1", (.gogoproto.moretags) = "yaml:&#92;"denom1&#92;""];</code>
     * @return The bytes for denom1.
     */
    public com.google.protobuf.ByteString
        getDenom1Bytes() {
      java.lang.Object ref = denom1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom1 = 2 [json_name = "denom1", (.gogoproto.moretags) = "yaml:&#92;"denom1&#92;""];</code>
     * @param value The denom1 to set.
     * @return This builder for chaining.
     */
    public Builder setDenom1(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom1_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string denom1 = 2 [json_name = "denom1", (.gogoproto.moretags) = "yaml:&#92;"denom1&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom1() {
      denom1_ = getDefaultInstance().getDenom1();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string denom1 = 2 [json_name = "denom1", (.gogoproto.moretags) = "yaml:&#92;"denom1&#92;""];</code>
     * @param value The bytes for denom1 to set.
     * @return This builder for chaining.
     */
    public Builder setDenom1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom1_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long tickSpacing_ ;
    /**
     * <code>uint64 tick_spacing = 3 [json_name = "tickSpacing", (.gogoproto.moretags) = "yaml:&#92;"tick_spacing&#92;""];</code>
     * @return The tickSpacing.
     */
    @java.lang.Override
    public long getTickSpacing() {
      return tickSpacing_;
    }
    /**
     * <code>uint64 tick_spacing = 3 [json_name = "tickSpacing", (.gogoproto.moretags) = "yaml:&#92;"tick_spacing&#92;""];</code>
     * @param value The tickSpacing to set.
     * @return This builder for chaining.
     */
    public Builder setTickSpacing(long value) {

      tickSpacing_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 tick_spacing = 3 [json_name = "tickSpacing", (.gogoproto.moretags) = "yaml:&#92;"tick_spacing&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearTickSpacing() {
      bitField0_ = (bitField0_ & ~0x00000004);
      tickSpacing_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object exponentAtPriceOne_ = "";
    /**
     * <code>string exponent_at_price_one = 4 [json_name = "exponentAtPriceOne", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"exponent_at_price_one&#92;""];</code>
     * @return The exponentAtPriceOne.
     */
    public java.lang.String getExponentAtPriceOne() {
      java.lang.Object ref = exponentAtPriceOne_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exponentAtPriceOne_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string exponent_at_price_one = 4 [json_name = "exponentAtPriceOne", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"exponent_at_price_one&#92;""];</code>
     * @return The bytes for exponentAtPriceOne.
     */
    public com.google.protobuf.ByteString
        getExponentAtPriceOneBytes() {
      java.lang.Object ref = exponentAtPriceOne_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exponentAtPriceOne_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string exponent_at_price_one = 4 [json_name = "exponentAtPriceOne", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"exponent_at_price_one&#92;""];</code>
     * @param value The exponentAtPriceOne to set.
     * @return This builder for chaining.
     */
    public Builder setExponentAtPriceOne(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      exponentAtPriceOne_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string exponent_at_price_one = 4 [json_name = "exponentAtPriceOne", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"exponent_at_price_one&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearExponentAtPriceOne() {
      exponentAtPriceOne_ = getDefaultInstance().getExponentAtPriceOne();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string exponent_at_price_one = 4 [json_name = "exponentAtPriceOne", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"exponent_at_price_one&#92;""];</code>
     * @param value The bytes for exponentAtPriceOne to set.
     * @return This builder for chaining.
     */
    public Builder setExponentAtPriceOneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      exponentAtPriceOne_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object spreadFactor_ = "";
    /**
     * <code>string spread_factor = 5 [json_name = "spreadFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"spread_factor&#92;""];</code>
     * @return The spreadFactor.
     */
    public java.lang.String getSpreadFactor() {
      java.lang.Object ref = spreadFactor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spreadFactor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string spread_factor = 5 [json_name = "spreadFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"spread_factor&#92;""];</code>
     * @return The bytes for spreadFactor.
     */
    public com.google.protobuf.ByteString
        getSpreadFactorBytes() {
      java.lang.Object ref = spreadFactor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spreadFactor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string spread_factor = 5 [json_name = "spreadFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"spread_factor&#92;""];</code>
     * @param value The spreadFactor to set.
     * @return This builder for chaining.
     */
    public Builder setSpreadFactor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      spreadFactor_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string spread_factor = 5 [json_name = "spreadFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"spread_factor&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSpreadFactor() {
      spreadFactor_ = getDefaultInstance().getSpreadFactor();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string spread_factor = 5 [json_name = "spreadFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"spread_factor&#92;""];</code>
     * @param value The bytes for spreadFactor to set.
     * @return This builder for chaining.
     */
    public Builder setSpreadFactorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      spreadFactor_ = value;
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


    // @@protoc_insertion_point(builder_scope:osmosis.concentratedliquidity.v1beta1.PoolRecord)
  }

  // @@protoc_insertion_point(class_scope:osmosis.concentratedliquidity.v1beta1.PoolRecord)
  private static final com.osmosis.concentratedliquidity.v1beta1.PoolRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.concentratedliquidity.v1beta1.PoolRecord();
  }

  public static com.osmosis.concentratedliquidity.v1beta1.PoolRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PoolRecord>
      PARSER = new com.google.protobuf.AbstractParser<PoolRecord>() {
    @java.lang.Override
    public PoolRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<PoolRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PoolRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.concentratedliquidity.v1beta1.PoolRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

