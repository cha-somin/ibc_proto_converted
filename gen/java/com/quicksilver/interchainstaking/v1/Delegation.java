// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/interchainstaking/v1/interchainstaking.proto

package com.quicksilver.interchainstaking.v1;

/**
 * Protobuf type {@code quicksilver.interchainstaking.v1.Delegation}
 */
public final class Delegation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:quicksilver.interchainstaking.v1.Delegation)
    DelegationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Delegation.newBuilder() to construct.
  private Delegation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Delegation() {
    delegationAddress_ = "";
    validatorAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Delegation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.quicksilver.interchainstaking.v1.InterchainstakingProto.internal_static_quicksilver_interchainstaking_v1_Delegation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.quicksilver.interchainstaking.v1.InterchainstakingProto.internal_static_quicksilver_interchainstaking_v1_Delegation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.quicksilver.interchainstaking.v1.Delegation.class, com.quicksilver.interchainstaking.v1.Delegation.Builder.class);
  }

  public static final int DELEGATION_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object delegationAddress_ = "";
  /**
   * <code>string delegation_address = 1 [json_name = "delegationAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The delegationAddress.
   */
  @java.lang.Override
  public java.lang.String getDelegationAddress() {
    java.lang.Object ref = delegationAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delegationAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string delegation_address = 1 [json_name = "delegationAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for delegationAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDelegationAddressBytes() {
    java.lang.Object ref = delegationAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delegationAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object validatorAddress_ = "";
  /**
   * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The validatorAddress.
   */
  @java.lang.Override
  public java.lang.String getValidatorAddress() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validatorAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for validatorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValidatorAddressBytes() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validatorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin amount_;
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return amount_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAmount() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 4;
  private long height_ = 0L;
  /**
   * <code>int64 height = 4 [json_name = "height"];</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int REDELEGATION_END_FIELD_NUMBER = 5;
  private long redelegationEnd_ = 0L;
  /**
   * <code>int64 redelegation_end = 5 [json_name = "redelegationEnd"];</code>
   * @return The redelegationEnd.
   */
  @java.lang.Override
  public long getRedelegationEnd() {
    return redelegationEnd_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegationAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, delegationAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, validatorAddress_);
    }
    if (amount_ != null) {
      output.writeMessage(3, getAmount());
    }
    if (height_ != 0L) {
      output.writeInt64(4, height_);
    }
    if (redelegationEnd_ != 0L) {
      output.writeInt64(5, redelegationEnd_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegationAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, delegationAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, validatorAddress_);
    }
    if (amount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAmount());
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, height_);
    }
    if (redelegationEnd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, redelegationEnd_);
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
    if (!(obj instanceof com.quicksilver.interchainstaking.v1.Delegation)) {
      return super.equals(obj);
    }
    com.quicksilver.interchainstaking.v1.Delegation other = (com.quicksilver.interchainstaking.v1.Delegation) obj;

    if (!getDelegationAddress()
        .equals(other.getDelegationAddress())) return false;
    if (!getValidatorAddress()
        .equals(other.getValidatorAddress())) return false;
    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (!getAmount()
          .equals(other.getAmount())) return false;
    }
    if (getHeight()
        != other.getHeight()) return false;
    if (getRedelegationEnd()
        != other.getRedelegationEnd()) return false;
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
    hash = (37 * hash) + DELEGATION_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getDelegationAddress().hashCode();
    hash = (37 * hash) + VALIDATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorAddress().hashCode();
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + REDELEGATION_END_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRedelegationEnd());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.quicksilver.interchainstaking.v1.Delegation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.interchainstaking.v1.Delegation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.Delegation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.interchainstaking.v1.Delegation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.Delegation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.interchainstaking.v1.Delegation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.Delegation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.interchainstaking.v1.Delegation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.quicksilver.interchainstaking.v1.Delegation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.quicksilver.interchainstaking.v1.Delegation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.Delegation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.interchainstaking.v1.Delegation parseFrom(
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
  public static Builder newBuilder(com.quicksilver.interchainstaking.v1.Delegation prototype) {
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
   * Protobuf type {@code quicksilver.interchainstaking.v1.Delegation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:quicksilver.interchainstaking.v1.Delegation)
      com.quicksilver.interchainstaking.v1.DelegationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.quicksilver.interchainstaking.v1.InterchainstakingProto.internal_static_quicksilver_interchainstaking_v1_Delegation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.quicksilver.interchainstaking.v1.InterchainstakingProto.internal_static_quicksilver_interchainstaking_v1_Delegation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.quicksilver.interchainstaking.v1.Delegation.class, com.quicksilver.interchainstaking.v1.Delegation.Builder.class);
    }

    // Construct using com.quicksilver.interchainstaking.v1.Delegation.newBuilder()
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
      delegationAddress_ = "";
      validatorAddress_ = "";
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      height_ = 0L;
      redelegationEnd_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.quicksilver.interchainstaking.v1.InterchainstakingProto.internal_static_quicksilver_interchainstaking_v1_Delegation_descriptor;
    }

    @java.lang.Override
    public com.quicksilver.interchainstaking.v1.Delegation getDefaultInstanceForType() {
      return com.quicksilver.interchainstaking.v1.Delegation.getDefaultInstance();
    }

    @java.lang.Override
    public com.quicksilver.interchainstaking.v1.Delegation build() {
      com.quicksilver.interchainstaking.v1.Delegation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.quicksilver.interchainstaking.v1.Delegation buildPartial() {
      com.quicksilver.interchainstaking.v1.Delegation result = new com.quicksilver.interchainstaking.v1.Delegation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.quicksilver.interchainstaking.v1.Delegation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.delegationAddress_ = delegationAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validatorAddress_ = validatorAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.amount_ = amountBuilder_ == null
            ? amount_
            : amountBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.redelegationEnd_ = redelegationEnd_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.quicksilver.interchainstaking.v1.Delegation) {
        return mergeFrom((com.quicksilver.interchainstaking.v1.Delegation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.quicksilver.interchainstaking.v1.Delegation other) {
      if (other == com.quicksilver.interchainstaking.v1.Delegation.getDefaultInstance()) return this;
      if (!other.getDelegationAddress().isEmpty()) {
        delegationAddress_ = other.delegationAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getValidatorAddress().isEmpty()) {
        validatorAddress_ = other.validatorAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getRedelegationEnd() != 0L) {
        setRedelegationEnd(other.getRedelegationEnd());
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
              delegationAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              validatorAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAmountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              height_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              redelegationEnd_ = input.readInt64();
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

    private java.lang.Object delegationAddress_ = "";
    /**
     * <code>string delegation_address = 1 [json_name = "delegationAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The delegationAddress.
     */
    public java.lang.String getDelegationAddress() {
      java.lang.Object ref = delegationAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delegationAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string delegation_address = 1 [json_name = "delegationAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for delegationAddress.
     */
    public com.google.protobuf.ByteString
        getDelegationAddressBytes() {
      java.lang.Object ref = delegationAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delegationAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string delegation_address = 1 [json_name = "delegationAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The delegationAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDelegationAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      delegationAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string delegation_address = 1 [json_name = "delegationAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelegationAddress() {
      delegationAddress_ = getDefaultInstance().getDelegationAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string delegation_address = 1 [json_name = "delegationAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for delegationAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDelegationAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      delegationAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object validatorAddress_ = "";
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The validatorAddress.
     */
    public java.lang.String getValidatorAddress() {
      java.lang.Object ref = validatorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validatorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for validatorAddress.
     */
    public com.google.protobuf.ByteString
        getValidatorAddressBytes() {
      java.lang.Object ref = validatorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validatorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      validatorAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorAddress() {
      validatorAddress_ = getDefaultInstance().getValidatorAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      validatorAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin amount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> amountBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
     * @return Whether the amount field is set.
     */
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
     * @return The amount.
     */
    public com.cosmos.base.v1beta1.Coin getAmount() {
      if (amountBuilder_ == null) {
        return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
      } else {
        return amountBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
     */
    public Builder setAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amount_ = value;
      } else {
        amountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
     */
    public Builder setAmount(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
     */
    public Builder mergeAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          amount_ != null &&
          amount_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getAmountBuilder().mergeFrom(value);
        } else {
          amount_ = value;
        }
      } else {
        amountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAmountBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilder();
      } else {
        return amount_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin", (.cosmos_proto.scalar) = "cosmos.Coin"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getAmount(),
                getParentForChildren(),
                isClean());
        amount_ = null;
      }
      return amountBuilder_;
    }

    private long height_ ;
    /**
     * <code>int64 height = 4 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>int64 height = 4 [json_name = "height"];</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 height = 4 [json_name = "height"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000008);
      height_ = 0L;
      onChanged();
      return this;
    }

    private long redelegationEnd_ ;
    /**
     * <code>int64 redelegation_end = 5 [json_name = "redelegationEnd"];</code>
     * @return The redelegationEnd.
     */
    @java.lang.Override
    public long getRedelegationEnd() {
      return redelegationEnd_;
    }
    /**
     * <code>int64 redelegation_end = 5 [json_name = "redelegationEnd"];</code>
     * @param value The redelegationEnd to set.
     * @return This builder for chaining.
     */
    public Builder setRedelegationEnd(long value) {

      redelegationEnd_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int64 redelegation_end = 5 [json_name = "redelegationEnd"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRedelegationEnd() {
      bitField0_ = (bitField0_ & ~0x00000010);
      redelegationEnd_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:quicksilver.interchainstaking.v1.Delegation)
  }

  // @@protoc_insertion_point(class_scope:quicksilver.interchainstaking.v1.Delegation)
  private static final com.quicksilver.interchainstaking.v1.Delegation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.quicksilver.interchainstaking.v1.Delegation();
  }

  public static com.quicksilver.interchainstaking.v1.Delegation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Delegation>
      PARSER = new com.google.protobuf.AbstractParser<Delegation>() {
    @java.lang.Override
    public Delegation parsePartialFrom(
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

  public static com.google.protobuf.Parser<Delegation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Delegation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.quicksilver.interchainstaking.v1.Delegation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

