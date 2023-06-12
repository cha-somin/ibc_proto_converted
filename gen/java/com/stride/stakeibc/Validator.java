// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/stakeibc/validator.proto

package com.stride.stakeibc;

/**
 * Protobuf type {@code stride.stakeibc.Validator}
 */
public final class Validator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stride.stakeibc.Validator)
    ValidatorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Validator.newBuilder() to construct.
  private Validator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Validator() {
    name_ = "";
    address_ = "";
    delegationAmt_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Validator();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stride.stakeibc.ValidatorProto.internal_static_stride_stakeibc_Validator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stride.stakeibc.ValidatorProto.internal_static_stride_stakeibc_Validator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stride.stakeibc.Validator.class, com.stride.stakeibc.Validator.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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
   * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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

  public static final int DELEGATION_AMT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object delegationAmt_ = "";
  /**
   * <code>string delegation_amt = 5 [json_name = "delegationAmt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The delegationAmt.
   */
  @java.lang.Override
  public java.lang.String getDelegationAmt() {
    java.lang.Object ref = delegationAmt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delegationAmt_ = s;
      return s;
    }
  }
  /**
   * <code>string delegation_amt = 5 [json_name = "delegationAmt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for delegationAmt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDelegationAmtBytes() {
    java.lang.Object ref = delegationAmt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delegationAmt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEIGHT_FIELD_NUMBER = 6;
  private long weight_ = 0L;
  /**
   * <code>uint64 weight = 6 [json_name = "weight"];</code>
   * @return The weight.
   */
  @java.lang.Override
  public long getWeight() {
    return weight_;
  }

  public static final int INTERNAL_EXCHANGE_RATE_FIELD_NUMBER = 7;
  private com.stride.stakeibc.ValidatorExchangeRate internalExchangeRate_;
  /**
   * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
   * @return Whether the internalExchangeRate field is set.
   */
  @java.lang.Override
  public boolean hasInternalExchangeRate() {
    return internalExchangeRate_ != null;
  }
  /**
   * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
   * @return The internalExchangeRate.
   */
  @java.lang.Override
  public com.stride.stakeibc.ValidatorExchangeRate getInternalExchangeRate() {
    return internalExchangeRate_ == null ? com.stride.stakeibc.ValidatorExchangeRate.getDefaultInstance() : internalExchangeRate_;
  }
  /**
   * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
   */
  @java.lang.Override
  public com.stride.stakeibc.ValidatorExchangeRateOrBuilder getInternalExchangeRateOrBuilder() {
    return internalExchangeRate_ == null ? com.stride.stakeibc.ValidatorExchangeRate.getDefaultInstance() : internalExchangeRate_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegationAmt_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, delegationAmt_);
    }
    if (weight_ != 0L) {
      output.writeUInt64(6, weight_);
    }
    if (internalExchangeRate_ != null) {
      output.writeMessage(7, getInternalExchangeRate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegationAmt_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, delegationAmt_);
    }
    if (weight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, weight_);
    }
    if (internalExchangeRate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getInternalExchangeRate());
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
    if (!(obj instanceof com.stride.stakeibc.Validator)) {
      return super.equals(obj);
    }
    com.stride.stakeibc.Validator other = (com.stride.stakeibc.Validator) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getDelegationAmt()
        .equals(other.getDelegationAmt())) return false;
    if (getWeight()
        != other.getWeight()) return false;
    if (hasInternalExchangeRate() != other.hasInternalExchangeRate()) return false;
    if (hasInternalExchangeRate()) {
      if (!getInternalExchangeRate()
          .equals(other.getInternalExchangeRate())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + DELEGATION_AMT_FIELD_NUMBER;
    hash = (53 * hash) + getDelegationAmt().hashCode();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWeight());
    if (hasInternalExchangeRate()) {
      hash = (37 * hash) + INTERNAL_EXCHANGE_RATE_FIELD_NUMBER;
      hash = (53 * hash) + getInternalExchangeRate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stride.stakeibc.Validator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.Validator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.Validator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.Validator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.Validator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.Validator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.Validator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.stakeibc.Validator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stride.stakeibc.Validator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stride.stakeibc.Validator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stride.stakeibc.Validator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.stakeibc.Validator parseFrom(
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
  public static Builder newBuilder(com.stride.stakeibc.Validator prototype) {
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
   * Protobuf type {@code stride.stakeibc.Validator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stride.stakeibc.Validator)
      com.stride.stakeibc.ValidatorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.stakeibc.ValidatorProto.internal_static_stride_stakeibc_Validator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.stakeibc.ValidatorProto.internal_static_stride_stakeibc_Validator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.stakeibc.Validator.class, com.stride.stakeibc.Validator.Builder.class);
    }

    // Construct using com.stride.stakeibc.Validator.newBuilder()
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
      name_ = "";
      address_ = "";
      delegationAmt_ = "";
      weight_ = 0L;
      internalExchangeRate_ = null;
      if (internalExchangeRateBuilder_ != null) {
        internalExchangeRateBuilder_.dispose();
        internalExchangeRateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stride.stakeibc.ValidatorProto.internal_static_stride_stakeibc_Validator_descriptor;
    }

    @java.lang.Override
    public com.stride.stakeibc.Validator getDefaultInstanceForType() {
      return com.stride.stakeibc.Validator.getDefaultInstance();
    }

    @java.lang.Override
    public com.stride.stakeibc.Validator build() {
      com.stride.stakeibc.Validator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stride.stakeibc.Validator buildPartial() {
      com.stride.stakeibc.Validator result = new com.stride.stakeibc.Validator(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stride.stakeibc.Validator result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.delegationAmt_ = delegationAmt_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.weight_ = weight_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.internalExchangeRate_ = internalExchangeRateBuilder_ == null
            ? internalExchangeRate_
            : internalExchangeRateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stride.stakeibc.Validator) {
        return mergeFrom((com.stride.stakeibc.Validator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stride.stakeibc.Validator other) {
      if (other == com.stride.stakeibc.Validator.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDelegationAmt().isEmpty()) {
        delegationAmt_ = other.delegationAmt_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getWeight() != 0L) {
        setWeight(other.getWeight());
      }
      if (other.hasInternalExchangeRate()) {
        mergeInternalExchangeRate(other.getInternalExchangeRate());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 42: {
              delegationAmt_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 42
            case 48: {
              weight_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 48
            case 58: {
              input.readMessage(
                  getInternalExchangeRateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 58
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object delegationAmt_ = "";
    /**
     * <code>string delegation_amt = 5 [json_name = "delegationAmt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The delegationAmt.
     */
    public java.lang.String getDelegationAmt() {
      java.lang.Object ref = delegationAmt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delegationAmt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string delegation_amt = 5 [json_name = "delegationAmt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for delegationAmt.
     */
    public com.google.protobuf.ByteString
        getDelegationAmtBytes() {
      java.lang.Object ref = delegationAmt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delegationAmt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string delegation_amt = 5 [json_name = "delegationAmt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The delegationAmt to set.
     * @return This builder for chaining.
     */
    public Builder setDelegationAmt(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      delegationAmt_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string delegation_amt = 5 [json_name = "delegationAmt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelegationAmt() {
      delegationAmt_ = getDefaultInstance().getDelegationAmt();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string delegation_amt = 5 [json_name = "delegationAmt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for delegationAmt to set.
     * @return This builder for chaining.
     */
    public Builder setDelegationAmtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      delegationAmt_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long weight_ ;
    /**
     * <code>uint64 weight = 6 [json_name = "weight"];</code>
     * @return The weight.
     */
    @java.lang.Override
    public long getWeight() {
      return weight_;
    }
    /**
     * <code>uint64 weight = 6 [json_name = "weight"];</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(long value) {

      weight_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 weight = 6 [json_name = "weight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      bitField0_ = (bitField0_ & ~0x00000008);
      weight_ = 0L;
      onChanged();
      return this;
    }

    private com.stride.stakeibc.ValidatorExchangeRate internalExchangeRate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stride.stakeibc.ValidatorExchangeRate, com.stride.stakeibc.ValidatorExchangeRate.Builder, com.stride.stakeibc.ValidatorExchangeRateOrBuilder> internalExchangeRateBuilder_;
    /**
     * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
     * @return Whether the internalExchangeRate field is set.
     */
    public boolean hasInternalExchangeRate() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
     * @return The internalExchangeRate.
     */
    public com.stride.stakeibc.ValidatorExchangeRate getInternalExchangeRate() {
      if (internalExchangeRateBuilder_ == null) {
        return internalExchangeRate_ == null ? com.stride.stakeibc.ValidatorExchangeRate.getDefaultInstance() : internalExchangeRate_;
      } else {
        return internalExchangeRateBuilder_.getMessage();
      }
    }
    /**
     * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
     */
    public Builder setInternalExchangeRate(com.stride.stakeibc.ValidatorExchangeRate value) {
      if (internalExchangeRateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        internalExchangeRate_ = value;
      } else {
        internalExchangeRateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
     */
    public Builder setInternalExchangeRate(
        com.stride.stakeibc.ValidatorExchangeRate.Builder builderForValue) {
      if (internalExchangeRateBuilder_ == null) {
        internalExchangeRate_ = builderForValue.build();
      } else {
        internalExchangeRateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
     */
    public Builder mergeInternalExchangeRate(com.stride.stakeibc.ValidatorExchangeRate value) {
      if (internalExchangeRateBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          internalExchangeRate_ != null &&
          internalExchangeRate_ != com.stride.stakeibc.ValidatorExchangeRate.getDefaultInstance()) {
          getInternalExchangeRateBuilder().mergeFrom(value);
        } else {
          internalExchangeRate_ = value;
        }
      } else {
        internalExchangeRateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
     */
    public Builder clearInternalExchangeRate() {
      bitField0_ = (bitField0_ & ~0x00000010);
      internalExchangeRate_ = null;
      if (internalExchangeRateBuilder_ != null) {
        internalExchangeRateBuilder_.dispose();
        internalExchangeRateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
     */
    public com.stride.stakeibc.ValidatorExchangeRate.Builder getInternalExchangeRateBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getInternalExchangeRateFieldBuilder().getBuilder();
    }
    /**
     * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
     */
    public com.stride.stakeibc.ValidatorExchangeRateOrBuilder getInternalExchangeRateOrBuilder() {
      if (internalExchangeRateBuilder_ != null) {
        return internalExchangeRateBuilder_.getMessageOrBuilder();
      } else {
        return internalExchangeRate_ == null ?
            com.stride.stakeibc.ValidatorExchangeRate.getDefaultInstance() : internalExchangeRate_;
      }
    }
    /**
     * <code>.stride.stakeibc.ValidatorExchangeRate internal_exchange_rate = 7 [json_name = "internalExchangeRate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stride.stakeibc.ValidatorExchangeRate, com.stride.stakeibc.ValidatorExchangeRate.Builder, com.stride.stakeibc.ValidatorExchangeRateOrBuilder> 
        getInternalExchangeRateFieldBuilder() {
      if (internalExchangeRateBuilder_ == null) {
        internalExchangeRateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stride.stakeibc.ValidatorExchangeRate, com.stride.stakeibc.ValidatorExchangeRate.Builder, com.stride.stakeibc.ValidatorExchangeRateOrBuilder>(
                getInternalExchangeRate(),
                getParentForChildren(),
                isClean());
        internalExchangeRate_ = null;
      }
      return internalExchangeRateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:stride.stakeibc.Validator)
  }

  // @@protoc_insertion_point(class_scope:stride.stakeibc.Validator)
  private static final com.stride.stakeibc.Validator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stride.stakeibc.Validator();
  }

  public static com.stride.stakeibc.Validator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Validator>
      PARSER = new com.google.protobuf.AbstractParser<Validator>() {
    @java.lang.Override
    public Validator parsePartialFrom(
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

  public static com.google.protobuf.Parser<Validator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Validator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stride.stakeibc.Validator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

