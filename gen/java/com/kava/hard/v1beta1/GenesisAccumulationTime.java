// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/hard/v1beta1/genesis.proto

package com.kava.hard.v1beta1;

/**
 * <pre>
 * GenesisAccumulationTime stores the previous distribution time and its corresponding denom.
 * </pre>
 *
 * Protobuf type {@code kava.hard.v1beta1.GenesisAccumulationTime}
 */
public final class GenesisAccumulationTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.hard.v1beta1.GenesisAccumulationTime)
    GenesisAccumulationTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisAccumulationTime.newBuilder() to construct.
  private GenesisAccumulationTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisAccumulationTime() {
    collateralType_ = "";
    supplyInterestFactor_ = "";
    borrowInterestFactor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisAccumulationTime();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.hard.v1beta1.GenesisProto.internal_static_kava_hard_v1beta1_GenesisAccumulationTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.hard.v1beta1.GenesisProto.internal_static_kava_hard_v1beta1_GenesisAccumulationTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.hard.v1beta1.GenesisAccumulationTime.class, com.kava.hard.v1beta1.GenesisAccumulationTime.Builder.class);
  }

  public static final int COLLATERAL_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object collateralType_ = "";
  /**
   * <code>string collateral_type = 1 [json_name = "collateralType"];</code>
   * @return The collateralType.
   */
  @java.lang.Override
  public java.lang.String getCollateralType() {
    java.lang.Object ref = collateralType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collateralType_ = s;
      return s;
    }
  }
  /**
   * <code>string collateral_type = 1 [json_name = "collateralType"];</code>
   * @return The bytes for collateralType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCollateralTypeBytes() {
    java.lang.Object ref = collateralType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      collateralType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREVIOUS_ACCUMULATION_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp previousAccumulationTime_;
  /**
   * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the previousAccumulationTime field is set.
   */
  @java.lang.Override
  public boolean hasPreviousAccumulationTime() {
    return previousAccumulationTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The previousAccumulationTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getPreviousAccumulationTime() {
    return previousAccumulationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : previousAccumulationTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getPreviousAccumulationTimeOrBuilder() {
    return previousAccumulationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : previousAccumulationTime_;
  }

  public static final int SUPPLY_INTEREST_FACTOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object supplyInterestFactor_ = "";
  /**
   * <code>string supply_interest_factor = 3 [json_name = "supplyInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The supplyInterestFactor.
   */
  @java.lang.Override
  public java.lang.String getSupplyInterestFactor() {
    java.lang.Object ref = supplyInterestFactor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      supplyInterestFactor_ = s;
      return s;
    }
  }
  /**
   * <code>string supply_interest_factor = 3 [json_name = "supplyInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for supplyInterestFactor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSupplyInterestFactorBytes() {
    java.lang.Object ref = supplyInterestFactor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      supplyInterestFactor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BORROW_INTEREST_FACTOR_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object borrowInterestFactor_ = "";
  /**
   * <code>string borrow_interest_factor = 4 [json_name = "borrowInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The borrowInterestFactor.
   */
  @java.lang.Override
  public java.lang.String getBorrowInterestFactor() {
    java.lang.Object ref = borrowInterestFactor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      borrowInterestFactor_ = s;
      return s;
    }
  }
  /**
   * <code>string borrow_interest_factor = 4 [json_name = "borrowInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for borrowInterestFactor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBorrowInterestFactorBytes() {
    java.lang.Object ref = borrowInterestFactor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      borrowInterestFactor_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collateralType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, collateralType_);
    }
    if (previousAccumulationTime_ != null) {
      output.writeMessage(2, getPreviousAccumulationTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(supplyInterestFactor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, supplyInterestFactor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(borrowInterestFactor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, borrowInterestFactor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collateralType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, collateralType_);
    }
    if (previousAccumulationTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPreviousAccumulationTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(supplyInterestFactor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, supplyInterestFactor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(borrowInterestFactor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, borrowInterestFactor_);
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
    if (!(obj instanceof com.kava.hard.v1beta1.GenesisAccumulationTime)) {
      return super.equals(obj);
    }
    com.kava.hard.v1beta1.GenesisAccumulationTime other = (com.kava.hard.v1beta1.GenesisAccumulationTime) obj;

    if (!getCollateralType()
        .equals(other.getCollateralType())) return false;
    if (hasPreviousAccumulationTime() != other.hasPreviousAccumulationTime()) return false;
    if (hasPreviousAccumulationTime()) {
      if (!getPreviousAccumulationTime()
          .equals(other.getPreviousAccumulationTime())) return false;
    }
    if (!getSupplyInterestFactor()
        .equals(other.getSupplyInterestFactor())) return false;
    if (!getBorrowInterestFactor()
        .equals(other.getBorrowInterestFactor())) return false;
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
    hash = (37 * hash) + COLLATERAL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getCollateralType().hashCode();
    if (hasPreviousAccumulationTime()) {
      hash = (37 * hash) + PREVIOUS_ACCUMULATION_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPreviousAccumulationTime().hashCode();
    }
    hash = (37 * hash) + SUPPLY_INTEREST_FACTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSupplyInterestFactor().hashCode();
    hash = (37 * hash) + BORROW_INTEREST_FACTOR_FIELD_NUMBER;
    hash = (53 * hash) + getBorrowInterestFactor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.hard.v1beta1.GenesisAccumulationTime parseFrom(
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
  public static Builder newBuilder(com.kava.hard.v1beta1.GenesisAccumulationTime prototype) {
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
   * GenesisAccumulationTime stores the previous distribution time and its corresponding denom.
   * </pre>
   *
   * Protobuf type {@code kava.hard.v1beta1.GenesisAccumulationTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.hard.v1beta1.GenesisAccumulationTime)
      com.kava.hard.v1beta1.GenesisAccumulationTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.hard.v1beta1.GenesisProto.internal_static_kava_hard_v1beta1_GenesisAccumulationTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.hard.v1beta1.GenesisProto.internal_static_kava_hard_v1beta1_GenesisAccumulationTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.hard.v1beta1.GenesisAccumulationTime.class, com.kava.hard.v1beta1.GenesisAccumulationTime.Builder.class);
    }

    // Construct using com.kava.hard.v1beta1.GenesisAccumulationTime.newBuilder()
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
      collateralType_ = "";
      previousAccumulationTime_ = null;
      if (previousAccumulationTimeBuilder_ != null) {
        previousAccumulationTimeBuilder_.dispose();
        previousAccumulationTimeBuilder_ = null;
      }
      supplyInterestFactor_ = "";
      borrowInterestFactor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.hard.v1beta1.GenesisProto.internal_static_kava_hard_v1beta1_GenesisAccumulationTime_descriptor;
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.GenesisAccumulationTime getDefaultInstanceForType() {
      return com.kava.hard.v1beta1.GenesisAccumulationTime.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.GenesisAccumulationTime build() {
      com.kava.hard.v1beta1.GenesisAccumulationTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.GenesisAccumulationTime buildPartial() {
      com.kava.hard.v1beta1.GenesisAccumulationTime result = new com.kava.hard.v1beta1.GenesisAccumulationTime(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kava.hard.v1beta1.GenesisAccumulationTime result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.collateralType_ = collateralType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.previousAccumulationTime_ = previousAccumulationTimeBuilder_ == null
            ? previousAccumulationTime_
            : previousAccumulationTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.supplyInterestFactor_ = supplyInterestFactor_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.borrowInterestFactor_ = borrowInterestFactor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.hard.v1beta1.GenesisAccumulationTime) {
        return mergeFrom((com.kava.hard.v1beta1.GenesisAccumulationTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.hard.v1beta1.GenesisAccumulationTime other) {
      if (other == com.kava.hard.v1beta1.GenesisAccumulationTime.getDefaultInstance()) return this;
      if (!other.getCollateralType().isEmpty()) {
        collateralType_ = other.collateralType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPreviousAccumulationTime()) {
        mergePreviousAccumulationTime(other.getPreviousAccumulationTime());
      }
      if (!other.getSupplyInterestFactor().isEmpty()) {
        supplyInterestFactor_ = other.supplyInterestFactor_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getBorrowInterestFactor().isEmpty()) {
        borrowInterestFactor_ = other.borrowInterestFactor_;
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
              collateralType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPreviousAccumulationTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              supplyInterestFactor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              borrowInterestFactor_ = input.readStringRequireUtf8();
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

    private java.lang.Object collateralType_ = "";
    /**
     * <code>string collateral_type = 1 [json_name = "collateralType"];</code>
     * @return The collateralType.
     */
    public java.lang.String getCollateralType() {
      java.lang.Object ref = collateralType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collateralType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string collateral_type = 1 [json_name = "collateralType"];</code>
     * @return The bytes for collateralType.
     */
    public com.google.protobuf.ByteString
        getCollateralTypeBytes() {
      java.lang.Object ref = collateralType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        collateralType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string collateral_type = 1 [json_name = "collateralType"];</code>
     * @param value The collateralType to set.
     * @return This builder for chaining.
     */
    public Builder setCollateralType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      collateralType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string collateral_type = 1 [json_name = "collateralType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCollateralType() {
      collateralType_ = getDefaultInstance().getCollateralType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string collateral_type = 1 [json_name = "collateralType"];</code>
     * @param value The bytes for collateralType to set.
     * @return This builder for chaining.
     */
    public Builder setCollateralTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      collateralType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp previousAccumulationTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> previousAccumulationTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the previousAccumulationTime field is set.
     */
    public boolean hasPreviousAccumulationTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The previousAccumulationTime.
     */
    public com.google.protobuf.Timestamp getPreviousAccumulationTime() {
      if (previousAccumulationTimeBuilder_ == null) {
        return previousAccumulationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : previousAccumulationTime_;
      } else {
        return previousAccumulationTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setPreviousAccumulationTime(com.google.protobuf.Timestamp value) {
      if (previousAccumulationTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        previousAccumulationTime_ = value;
      } else {
        previousAccumulationTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setPreviousAccumulationTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (previousAccumulationTimeBuilder_ == null) {
        previousAccumulationTime_ = builderForValue.build();
      } else {
        previousAccumulationTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergePreviousAccumulationTime(com.google.protobuf.Timestamp value) {
      if (previousAccumulationTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          previousAccumulationTime_ != null &&
          previousAccumulationTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getPreviousAccumulationTimeBuilder().mergeFrom(value);
        } else {
          previousAccumulationTime_ = value;
        }
      } else {
        previousAccumulationTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearPreviousAccumulationTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      previousAccumulationTime_ = null;
      if (previousAccumulationTimeBuilder_ != null) {
        previousAccumulationTimeBuilder_.dispose();
        previousAccumulationTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getPreviousAccumulationTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPreviousAccumulationTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getPreviousAccumulationTimeOrBuilder() {
      if (previousAccumulationTimeBuilder_ != null) {
        return previousAccumulationTimeBuilder_.getMessageOrBuilder();
      } else {
        return previousAccumulationTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : previousAccumulationTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp previous_accumulation_time = 2 [json_name = "previousAccumulationTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getPreviousAccumulationTimeFieldBuilder() {
      if (previousAccumulationTimeBuilder_ == null) {
        previousAccumulationTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getPreviousAccumulationTime(),
                getParentForChildren(),
                isClean());
        previousAccumulationTime_ = null;
      }
      return previousAccumulationTimeBuilder_;
    }

    private java.lang.Object supplyInterestFactor_ = "";
    /**
     * <code>string supply_interest_factor = 3 [json_name = "supplyInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The supplyInterestFactor.
     */
    public java.lang.String getSupplyInterestFactor() {
      java.lang.Object ref = supplyInterestFactor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        supplyInterestFactor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string supply_interest_factor = 3 [json_name = "supplyInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The bytes for supplyInterestFactor.
     */
    public com.google.protobuf.ByteString
        getSupplyInterestFactorBytes() {
      java.lang.Object ref = supplyInterestFactor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        supplyInterestFactor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string supply_interest_factor = 3 [json_name = "supplyInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The supplyInterestFactor to set.
     * @return This builder for chaining.
     */
    public Builder setSupplyInterestFactor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      supplyInterestFactor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string supply_interest_factor = 3 [json_name = "supplyInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSupplyInterestFactor() {
      supplyInterestFactor_ = getDefaultInstance().getSupplyInterestFactor();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string supply_interest_factor = 3 [json_name = "supplyInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The bytes for supplyInterestFactor to set.
     * @return This builder for chaining.
     */
    public Builder setSupplyInterestFactorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      supplyInterestFactor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object borrowInterestFactor_ = "";
    /**
     * <code>string borrow_interest_factor = 4 [json_name = "borrowInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The borrowInterestFactor.
     */
    public java.lang.String getBorrowInterestFactor() {
      java.lang.Object ref = borrowInterestFactor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        borrowInterestFactor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string borrow_interest_factor = 4 [json_name = "borrowInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The bytes for borrowInterestFactor.
     */
    public com.google.protobuf.ByteString
        getBorrowInterestFactorBytes() {
      java.lang.Object ref = borrowInterestFactor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        borrowInterestFactor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string borrow_interest_factor = 4 [json_name = "borrowInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The borrowInterestFactor to set.
     * @return This builder for chaining.
     */
    public Builder setBorrowInterestFactor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      borrowInterestFactor_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string borrow_interest_factor = 4 [json_name = "borrowInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBorrowInterestFactor() {
      borrowInterestFactor_ = getDefaultInstance().getBorrowInterestFactor();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string borrow_interest_factor = 4 [json_name = "borrowInterestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The bytes for borrowInterestFactor to set.
     * @return This builder for chaining.
     */
    public Builder setBorrowInterestFactorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      borrowInterestFactor_ = value;
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


    // @@protoc_insertion_point(builder_scope:kava.hard.v1beta1.GenesisAccumulationTime)
  }

  // @@protoc_insertion_point(class_scope:kava.hard.v1beta1.GenesisAccumulationTime)
  private static final com.kava.hard.v1beta1.GenesisAccumulationTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.hard.v1beta1.GenesisAccumulationTime();
  }

  public static com.kava.hard.v1beta1.GenesisAccumulationTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisAccumulationTime>
      PARSER = new com.google.protobuf.AbstractParser<GenesisAccumulationTime>() {
    @java.lang.Override
    public GenesisAccumulationTime parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisAccumulationTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisAccumulationTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.hard.v1beta1.GenesisAccumulationTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

