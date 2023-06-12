// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pstake/liquidstakeibc/v1beta1/msgs.proto

package com.pstake.liquidstakeibc.v1beta1;

/**
 * Protobuf type {@code pstake.liquidstakeibc.v1beta1.MsgRedeem}
 */
public final class MsgRedeem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pstake.liquidstakeibc.v1beta1.MsgRedeem)
    MsgRedeemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgRedeem.newBuilder() to construct.
  private MsgRedeem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgRedeem() {
    delegatorAddress_ = "";
    hostDenom_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgRedeem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pstake.liquidstakeibc.v1beta1.MsgsProto.internal_static_pstake_liquidstakeibc_v1beta1_MsgRedeem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pstake.liquidstakeibc.v1beta1.MsgsProto.internal_static_pstake_liquidstakeibc_v1beta1_MsgRedeem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pstake.liquidstakeibc.v1beta1.MsgRedeem.class, com.pstake.liquidstakeibc.v1beta1.MsgRedeem.Builder.class);
  }

  public static final int DELEGATOR_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object delegatorAddress_ = "";
  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The delegatorAddress.
   */
  @java.lang.Override
  public java.lang.String getDelegatorAddress() {
    java.lang.Object ref = delegatorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delegatorAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for delegatorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDelegatorAddressBytes() {
    java.lang.Object ref = delegatorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delegatorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private com.cosmos.base.v1beta1.Coin amount_;
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return amount_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAmount() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
  }

  public static final int HOST_DENOM_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hostDenom_ = "";
  /**
   * <code>string host_denom = 3 [json_name = "hostDenom"];</code>
   * @return The hostDenom.
   */
  @java.lang.Override
  public java.lang.String getHostDenom() {
    java.lang.Object ref = hostDenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostDenom_ = s;
      return s;
    }
  }
  /**
   * <code>string host_denom = 3 [json_name = "hostDenom"];</code>
   * @return The bytes for hostDenom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostDenomBytes() {
    java.lang.Object ref = hostDenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostDenom_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegatorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, delegatorAddress_);
    }
    if (amount_ != null) {
      output.writeMessage(2, getAmount());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostDenom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hostDenom_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegatorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, delegatorAddress_);
    }
    if (amount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAmount());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostDenom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hostDenom_);
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
    if (!(obj instanceof com.pstake.liquidstakeibc.v1beta1.MsgRedeem)) {
      return super.equals(obj);
    }
    com.pstake.liquidstakeibc.v1beta1.MsgRedeem other = (com.pstake.liquidstakeibc.v1beta1.MsgRedeem) obj;

    if (!getDelegatorAddress()
        .equals(other.getDelegatorAddress())) return false;
    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (!getAmount()
          .equals(other.getAmount())) return false;
    }
    if (!getHostDenom()
        .equals(other.getHostDenom())) return false;
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
    hash = (37 * hash) + DELEGATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getDelegatorAddress().hashCode();
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    hash = (37 * hash) + HOST_DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getHostDenom().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem parseFrom(
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
  public static Builder newBuilder(com.pstake.liquidstakeibc.v1beta1.MsgRedeem prototype) {
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
   * Protobuf type {@code pstake.liquidstakeibc.v1beta1.MsgRedeem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pstake.liquidstakeibc.v1beta1.MsgRedeem)
      com.pstake.liquidstakeibc.v1beta1.MsgRedeemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pstake.liquidstakeibc.v1beta1.MsgsProto.internal_static_pstake_liquidstakeibc_v1beta1_MsgRedeem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pstake.liquidstakeibc.v1beta1.MsgsProto.internal_static_pstake_liquidstakeibc_v1beta1_MsgRedeem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pstake.liquidstakeibc.v1beta1.MsgRedeem.class, com.pstake.liquidstakeibc.v1beta1.MsgRedeem.Builder.class);
    }

    // Construct using com.pstake.liquidstakeibc.v1beta1.MsgRedeem.newBuilder()
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
      delegatorAddress_ = "";
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      hostDenom_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pstake.liquidstakeibc.v1beta1.MsgsProto.internal_static_pstake_liquidstakeibc_v1beta1_MsgRedeem_descriptor;
    }

    @java.lang.Override
    public com.pstake.liquidstakeibc.v1beta1.MsgRedeem getDefaultInstanceForType() {
      return com.pstake.liquidstakeibc.v1beta1.MsgRedeem.getDefaultInstance();
    }

    @java.lang.Override
    public com.pstake.liquidstakeibc.v1beta1.MsgRedeem build() {
      com.pstake.liquidstakeibc.v1beta1.MsgRedeem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pstake.liquidstakeibc.v1beta1.MsgRedeem buildPartial() {
      com.pstake.liquidstakeibc.v1beta1.MsgRedeem result = new com.pstake.liquidstakeibc.v1beta1.MsgRedeem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.pstake.liquidstakeibc.v1beta1.MsgRedeem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.delegatorAddress_ = delegatorAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.amount_ = amountBuilder_ == null
            ? amount_
            : amountBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hostDenom_ = hostDenom_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pstake.liquidstakeibc.v1beta1.MsgRedeem) {
        return mergeFrom((com.pstake.liquidstakeibc.v1beta1.MsgRedeem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pstake.liquidstakeibc.v1beta1.MsgRedeem other) {
      if (other == com.pstake.liquidstakeibc.v1beta1.MsgRedeem.getDefaultInstance()) return this;
      if (!other.getDelegatorAddress().isEmpty()) {
        delegatorAddress_ = other.delegatorAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
      }
      if (!other.getHostDenom().isEmpty()) {
        hostDenom_ = other.hostDenom_;
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
              delegatorAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAmountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              hostDenom_ = input.readStringRequireUtf8();
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

    private java.lang.Object delegatorAddress_ = "";
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The delegatorAddress.
     */
    public java.lang.String getDelegatorAddress() {
      java.lang.Object ref = delegatorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delegatorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for delegatorAddress.
     */
    public com.google.protobuf.ByteString
        getDelegatorAddressBytes() {
      java.lang.Object ref = delegatorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delegatorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The delegatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDelegatorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      delegatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelegatorAddress() {
      delegatorAddress_ = getDefaultInstance().getDelegatorAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for delegatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDelegatorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      delegatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin amount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> amountBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     * @return Whether the amount field is set.
     */
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
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
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAmount(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          amount_ != null &&
          amount_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getAmountBuilder().mergeFrom(value);
        } else {
          amount_ = value;
        }
      } else {
        amountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAmountBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
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
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
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

    private java.lang.Object hostDenom_ = "";
    /**
     * <code>string host_denom = 3 [json_name = "hostDenom"];</code>
     * @return The hostDenom.
     */
    public java.lang.String getHostDenom() {
      java.lang.Object ref = hostDenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostDenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string host_denom = 3 [json_name = "hostDenom"];</code>
     * @return The bytes for hostDenom.
     */
    public com.google.protobuf.ByteString
        getHostDenomBytes() {
      java.lang.Object ref = hostDenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostDenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string host_denom = 3 [json_name = "hostDenom"];</code>
     * @param value The hostDenom to set.
     * @return This builder for chaining.
     */
    public Builder setHostDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hostDenom_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string host_denom = 3 [json_name = "hostDenom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHostDenom() {
      hostDenom_ = getDefaultInstance().getHostDenom();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string host_denom = 3 [json_name = "hostDenom"];</code>
     * @param value The bytes for hostDenom to set.
     * @return This builder for chaining.
     */
    public Builder setHostDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hostDenom_ = value;
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


    // @@protoc_insertion_point(builder_scope:pstake.liquidstakeibc.v1beta1.MsgRedeem)
  }

  // @@protoc_insertion_point(class_scope:pstake.liquidstakeibc.v1beta1.MsgRedeem)
  private static final com.pstake.liquidstakeibc.v1beta1.MsgRedeem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pstake.liquidstakeibc.v1beta1.MsgRedeem();
  }

  public static com.pstake.liquidstakeibc.v1beta1.MsgRedeem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgRedeem>
      PARSER = new com.google.protobuf.AbstractParser<MsgRedeem>() {
    @java.lang.Override
    public MsgRedeem parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgRedeem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgRedeem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pstake.liquidstakeibc.v1beta1.MsgRedeem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

