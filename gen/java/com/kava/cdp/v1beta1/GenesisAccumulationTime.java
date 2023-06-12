// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/cdp/v1beta1/genesis.proto

package com.kava.cdp.v1beta1;

/**
 * <pre>
 * GenesisAccumulationTime defines the previous distribution time and its corresponding denom
 * </pre>
 *
 * Protobuf type {@code kava.cdp.v1beta1.GenesisAccumulationTime}
 */
public final class GenesisAccumulationTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.cdp.v1beta1.GenesisAccumulationTime)
    GenesisAccumulationTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisAccumulationTime.newBuilder() to construct.
  private GenesisAccumulationTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisAccumulationTime() {
    collateralType_ = "";
    interestFactor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisAccumulationTime();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.cdp.v1beta1.GenesisProto.internal_static_kava_cdp_v1beta1_GenesisAccumulationTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.cdp.v1beta1.GenesisProto.internal_static_kava_cdp_v1beta1_GenesisAccumulationTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.cdp.v1beta1.GenesisAccumulationTime.class, com.kava.cdp.v1beta1.GenesisAccumulationTime.Builder.class);
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

  public static final int INTEREST_FACTOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object interestFactor_ = "";
  /**
   * <code>string interest_factor = 3 [json_name = "interestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The interestFactor.
   */
  @java.lang.Override
  public java.lang.String getInterestFactor() {
    java.lang.Object ref = interestFactor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      interestFactor_ = s;
      return s;
    }
  }
  /**
   * <code>string interest_factor = 3 [json_name = "interestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
   * @return The bytes for interestFactor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInterestFactorBytes() {
    java.lang.Object ref = interestFactor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      interestFactor_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interestFactor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, interestFactor_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interestFactor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, interestFactor_);
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
    if (!(obj instanceof com.kava.cdp.v1beta1.GenesisAccumulationTime)) {
      return super.equals(obj);
    }
    com.kava.cdp.v1beta1.GenesisAccumulationTime other = (com.kava.cdp.v1beta1.GenesisAccumulationTime) obj;

    if (!getCollateralType()
        .equals(other.getCollateralType())) return false;
    if (hasPreviousAccumulationTime() != other.hasPreviousAccumulationTime()) return false;
    if (hasPreviousAccumulationTime()) {
      if (!getPreviousAccumulationTime()
          .equals(other.getPreviousAccumulationTime())) return false;
    }
    if (!getInterestFactor()
        .equals(other.getInterestFactor())) return false;
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
    hash = (37 * hash) + INTEREST_FACTOR_FIELD_NUMBER;
    hash = (53 * hash) + getInterestFactor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.cdp.v1beta1.GenesisAccumulationTime parseFrom(
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
  public static Builder newBuilder(com.kava.cdp.v1beta1.GenesisAccumulationTime prototype) {
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
   * GenesisAccumulationTime defines the previous distribution time and its corresponding denom
   * </pre>
   *
   * Protobuf type {@code kava.cdp.v1beta1.GenesisAccumulationTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.cdp.v1beta1.GenesisAccumulationTime)
      com.kava.cdp.v1beta1.GenesisAccumulationTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.cdp.v1beta1.GenesisProto.internal_static_kava_cdp_v1beta1_GenesisAccumulationTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.cdp.v1beta1.GenesisProto.internal_static_kava_cdp_v1beta1_GenesisAccumulationTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.cdp.v1beta1.GenesisAccumulationTime.class, com.kava.cdp.v1beta1.GenesisAccumulationTime.Builder.class);
    }

    // Construct using com.kava.cdp.v1beta1.GenesisAccumulationTime.newBuilder()
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
      interestFactor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.cdp.v1beta1.GenesisProto.internal_static_kava_cdp_v1beta1_GenesisAccumulationTime_descriptor;
    }

    @java.lang.Override
    public com.kava.cdp.v1beta1.GenesisAccumulationTime getDefaultInstanceForType() {
      return com.kava.cdp.v1beta1.GenesisAccumulationTime.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.cdp.v1beta1.GenesisAccumulationTime build() {
      com.kava.cdp.v1beta1.GenesisAccumulationTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.cdp.v1beta1.GenesisAccumulationTime buildPartial() {
      com.kava.cdp.v1beta1.GenesisAccumulationTime result = new com.kava.cdp.v1beta1.GenesisAccumulationTime(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kava.cdp.v1beta1.GenesisAccumulationTime result) {
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
        result.interestFactor_ = interestFactor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.cdp.v1beta1.GenesisAccumulationTime) {
        return mergeFrom((com.kava.cdp.v1beta1.GenesisAccumulationTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.cdp.v1beta1.GenesisAccumulationTime other) {
      if (other == com.kava.cdp.v1beta1.GenesisAccumulationTime.getDefaultInstance()) return this;
      if (!other.getCollateralType().isEmpty()) {
        collateralType_ = other.collateralType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPreviousAccumulationTime()) {
        mergePreviousAccumulationTime(other.getPreviousAccumulationTime());
      }
      if (!other.getInterestFactor().isEmpty()) {
        interestFactor_ = other.interestFactor_;
        bitField0_ |= 0x00000004;
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
              interestFactor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object interestFactor_ = "";
    /**
     * <code>string interest_factor = 3 [json_name = "interestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The interestFactor.
     */
    public java.lang.String getInterestFactor() {
      java.lang.Object ref = interestFactor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        interestFactor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string interest_factor = 3 [json_name = "interestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return The bytes for interestFactor.
     */
    public com.google.protobuf.ByteString
        getInterestFactorBytes() {
      java.lang.Object ref = interestFactor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        interestFactor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string interest_factor = 3 [json_name = "interestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The interestFactor to set.
     * @return This builder for chaining.
     */
    public Builder setInterestFactor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      interestFactor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string interest_factor = 3 [json_name = "interestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInterestFactor() {
      interestFactor_ = getDefaultInstance().getInterestFactor();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string interest_factor = 3 [json_name = "interestFactor", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.cosmos_proto.scalar) = "cosmos.Dec"];</code>
     * @param value The bytes for interestFactor to set.
     * @return This builder for chaining.
     */
    public Builder setInterestFactorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      interestFactor_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:kava.cdp.v1beta1.GenesisAccumulationTime)
  }

  // @@protoc_insertion_point(class_scope:kava.cdp.v1beta1.GenesisAccumulationTime)
  private static final com.kava.cdp.v1beta1.GenesisAccumulationTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.cdp.v1beta1.GenesisAccumulationTime();
  }

  public static com.kava.cdp.v1beta1.GenesisAccumulationTime getDefaultInstance() {
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
  public com.kava.cdp.v1beta1.GenesisAccumulationTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

