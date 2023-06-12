// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/lpfarm/v1beta1/lpfarm.proto

package com.crescent.lpfarm.v1beta1;

/**
 * Protobuf type {@code crescent.lpfarm.v1beta1.Position}
 */
public final class Position extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.lpfarm.v1beta1.Position)
    PositionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Position.newBuilder() to construct.
  private Position(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Position() {
    farmer_ = "";
    denom_ = "";
    farmingAmount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Position();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.lpfarm.v1beta1.LpfarmProto.internal_static_crescent_lpfarm_v1beta1_Position_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.lpfarm.v1beta1.LpfarmProto.internal_static_crescent_lpfarm_v1beta1_Position_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.lpfarm.v1beta1.Position.class, com.crescent.lpfarm.v1beta1.Position.Builder.class);
  }

  public static final int FARMER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object farmer_ = "";
  /**
   * <code>string farmer = 1 [json_name = "farmer"];</code>
   * @return The farmer.
   */
  @java.lang.Override
  public java.lang.String getFarmer() {
    java.lang.Object ref = farmer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      farmer_ = s;
      return s;
    }
  }
  /**
   * <code>string farmer = 1 [json_name = "farmer"];</code>
   * @return The bytes for farmer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFarmerBytes() {
    java.lang.Object ref = farmer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      farmer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
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

  public static final int FARMING_AMOUNT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object farmingAmount_ = "";
  /**
   * <code>string farming_amount = 3 [json_name = "farmingAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The farmingAmount.
   */
  @java.lang.Override
  public java.lang.String getFarmingAmount() {
    java.lang.Object ref = farmingAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      farmingAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string farming_amount = 3 [json_name = "farmingAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for farmingAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFarmingAmountBytes() {
    java.lang.Object ref = farmingAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      farmingAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREVIOUS_PERIOD_FIELD_NUMBER = 4;
  private long previousPeriod_ = 0L;
  /**
   * <code>uint64 previous_period = 4 [json_name = "previousPeriod"];</code>
   * @return The previousPeriod.
   */
  @java.lang.Override
  public long getPreviousPeriod() {
    return previousPeriod_;
  }

  public static final int STARTING_BLOCK_HEIGHT_FIELD_NUMBER = 5;
  private long startingBlockHeight_ = 0L;
  /**
   * <code>int64 starting_block_height = 5 [json_name = "startingBlockHeight"];</code>
   * @return The startingBlockHeight.
   */
  @java.lang.Override
  public long getStartingBlockHeight() {
    return startingBlockHeight_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(farmer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, farmer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(farmingAmount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, farmingAmount_);
    }
    if (previousPeriod_ != 0L) {
      output.writeUInt64(4, previousPeriod_);
    }
    if (startingBlockHeight_ != 0L) {
      output.writeInt64(5, startingBlockHeight_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(farmer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, farmer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(farmingAmount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, farmingAmount_);
    }
    if (previousPeriod_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, previousPeriod_);
    }
    if (startingBlockHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, startingBlockHeight_);
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
    if (!(obj instanceof com.crescent.lpfarm.v1beta1.Position)) {
      return super.equals(obj);
    }
    com.crescent.lpfarm.v1beta1.Position other = (com.crescent.lpfarm.v1beta1.Position) obj;

    if (!getFarmer()
        .equals(other.getFarmer())) return false;
    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getFarmingAmount()
        .equals(other.getFarmingAmount())) return false;
    if (getPreviousPeriod()
        != other.getPreviousPeriod()) return false;
    if (getStartingBlockHeight()
        != other.getStartingBlockHeight()) return false;
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
    hash = (37 * hash) + FARMER_FIELD_NUMBER;
    hash = (53 * hash) + getFarmer().hashCode();
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + FARMING_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getFarmingAmount().hashCode();
    hash = (37 * hash) + PREVIOUS_PERIOD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPreviousPeriod());
    hash = (37 * hash) + STARTING_BLOCK_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartingBlockHeight());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.crescent.lpfarm.v1beta1.Position parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.Position parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.Position parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.Position parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.Position parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.lpfarm.v1beta1.Position parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.Position parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.lpfarm.v1beta1.Position parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.lpfarm.v1beta1.Position parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.lpfarm.v1beta1.Position parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.lpfarm.v1beta1.Position parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.lpfarm.v1beta1.Position parseFrom(
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
  public static Builder newBuilder(com.crescent.lpfarm.v1beta1.Position prototype) {
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
   * Protobuf type {@code crescent.lpfarm.v1beta1.Position}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.lpfarm.v1beta1.Position)
      com.crescent.lpfarm.v1beta1.PositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.lpfarm.v1beta1.LpfarmProto.internal_static_crescent_lpfarm_v1beta1_Position_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.lpfarm.v1beta1.LpfarmProto.internal_static_crescent_lpfarm_v1beta1_Position_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.lpfarm.v1beta1.Position.class, com.crescent.lpfarm.v1beta1.Position.Builder.class);
    }

    // Construct using com.crescent.lpfarm.v1beta1.Position.newBuilder()
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
      farmer_ = "";
      denom_ = "";
      farmingAmount_ = "";
      previousPeriod_ = 0L;
      startingBlockHeight_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.crescent.lpfarm.v1beta1.LpfarmProto.internal_static_crescent_lpfarm_v1beta1_Position_descriptor;
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.Position getDefaultInstanceForType() {
      return com.crescent.lpfarm.v1beta1.Position.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.Position build() {
      com.crescent.lpfarm.v1beta1.Position result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.lpfarm.v1beta1.Position buildPartial() {
      com.crescent.lpfarm.v1beta1.Position result = new com.crescent.lpfarm.v1beta1.Position(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.crescent.lpfarm.v1beta1.Position result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.farmer_ = farmer_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.farmingAmount_ = farmingAmount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.previousPeriod_ = previousPeriod_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.startingBlockHeight_ = startingBlockHeight_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.lpfarm.v1beta1.Position) {
        return mergeFrom((com.crescent.lpfarm.v1beta1.Position)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.lpfarm.v1beta1.Position other) {
      if (other == com.crescent.lpfarm.v1beta1.Position.getDefaultInstance()) return this;
      if (!other.getFarmer().isEmpty()) {
        farmer_ = other.farmer_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFarmingAmount().isEmpty()) {
        farmingAmount_ = other.farmingAmount_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getPreviousPeriod() != 0L) {
        setPreviousPeriod(other.getPreviousPeriod());
      }
      if (other.getStartingBlockHeight() != 0L) {
        setStartingBlockHeight(other.getStartingBlockHeight());
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
              farmer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              farmingAmount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              previousPeriod_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              startingBlockHeight_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object farmer_ = "";
    /**
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @return The farmer.
     */
    public java.lang.String getFarmer() {
      java.lang.Object ref = farmer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        farmer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @return The bytes for farmer.
     */
    public com.google.protobuf.ByteString
        getFarmerBytes() {
      java.lang.Object ref = farmer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        farmer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @param value The farmer to set.
     * @return This builder for chaining.
     */
    public Builder setFarmer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      farmer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFarmer() {
      farmer_ = getDefaultInstance().getFarmer();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string farmer = 1 [json_name = "farmer"];</code>
     * @param value The bytes for farmer to set.
     * @return This builder for chaining.
     */
    public Builder setFarmerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      farmer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
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

    private java.lang.Object farmingAmount_ = "";
    /**
     * <code>string farming_amount = 3 [json_name = "farmingAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The farmingAmount.
     */
    public java.lang.String getFarmingAmount() {
      java.lang.Object ref = farmingAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        farmingAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string farming_amount = 3 [json_name = "farmingAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for farmingAmount.
     */
    public com.google.protobuf.ByteString
        getFarmingAmountBytes() {
      java.lang.Object ref = farmingAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        farmingAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string farming_amount = 3 [json_name = "farmingAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The farmingAmount to set.
     * @return This builder for chaining.
     */
    public Builder setFarmingAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      farmingAmount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string farming_amount = 3 [json_name = "farmingAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFarmingAmount() {
      farmingAmount_ = getDefaultInstance().getFarmingAmount();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string farming_amount = 3 [json_name = "farmingAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for farmingAmount to set.
     * @return This builder for chaining.
     */
    public Builder setFarmingAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      farmingAmount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long previousPeriod_ ;
    /**
     * <code>uint64 previous_period = 4 [json_name = "previousPeriod"];</code>
     * @return The previousPeriod.
     */
    @java.lang.Override
    public long getPreviousPeriod() {
      return previousPeriod_;
    }
    /**
     * <code>uint64 previous_period = 4 [json_name = "previousPeriod"];</code>
     * @param value The previousPeriod to set.
     * @return This builder for chaining.
     */
    public Builder setPreviousPeriod(long value) {

      previousPeriod_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 previous_period = 4 [json_name = "previousPeriod"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPreviousPeriod() {
      bitField0_ = (bitField0_ & ~0x00000008);
      previousPeriod_ = 0L;
      onChanged();
      return this;
    }

    private long startingBlockHeight_ ;
    /**
     * <code>int64 starting_block_height = 5 [json_name = "startingBlockHeight"];</code>
     * @return The startingBlockHeight.
     */
    @java.lang.Override
    public long getStartingBlockHeight() {
      return startingBlockHeight_;
    }
    /**
     * <code>int64 starting_block_height = 5 [json_name = "startingBlockHeight"];</code>
     * @param value The startingBlockHeight to set.
     * @return This builder for chaining.
     */
    public Builder setStartingBlockHeight(long value) {

      startingBlockHeight_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int64 starting_block_height = 5 [json_name = "startingBlockHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartingBlockHeight() {
      bitField0_ = (bitField0_ & ~0x00000010);
      startingBlockHeight_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:crescent.lpfarm.v1beta1.Position)
  }

  // @@protoc_insertion_point(class_scope:crescent.lpfarm.v1beta1.Position)
  private static final com.crescent.lpfarm.v1beta1.Position DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.lpfarm.v1beta1.Position();
  }

  public static com.crescent.lpfarm.v1beta1.Position getDefaultInstance() {
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
  public com.crescent.lpfarm.v1beta1.Position getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

