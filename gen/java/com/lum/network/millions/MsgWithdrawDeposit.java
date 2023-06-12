// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/tx.proto

package com.lum.network.millions;

/**
 * Protobuf type {@code lum.network.millions.MsgWithdrawDeposit}
 */
public final class MsgWithdrawDeposit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lum.network.millions.MsgWithdrawDeposit)
    MsgWithdrawDepositOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgWithdrawDeposit.newBuilder() to construct.
  private MsgWithdrawDeposit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgWithdrawDeposit() {
    depositorAddress_ = "";
    toAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgWithdrawDeposit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lum.network.millions.TxProto.internal_static_lum_network_millions_MsgWithdrawDeposit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lum.network.millions.TxProto.internal_static_lum_network_millions_MsgWithdrawDeposit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lum.network.millions.MsgWithdrawDeposit.class, com.lum.network.millions.MsgWithdrawDeposit.Builder.class);
  }

  public static final int POOL_ID_FIELD_NUMBER = 1;
  private long poolId_ = 0L;
  /**
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
  }

  public static final int DEPOSIT_ID_FIELD_NUMBER = 2;
  private long depositId_ = 0L;
  /**
   * <code>uint64 deposit_id = 2 [json_name = "depositId"];</code>
   * @return The depositId.
   */
  @java.lang.Override
  public long getDepositId() {
    return depositId_;
  }

  public static final int DEPOSITOR_ADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object depositorAddress_ = "";
  /**
   * <code>string depositor_address = 3 [json_name = "depositorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The depositorAddress.
   */
  @java.lang.Override
  public java.lang.String getDepositorAddress() {
    java.lang.Object ref = depositorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      depositorAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string depositor_address = 3 [json_name = "depositorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for depositorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepositorAddressBytes() {
    java.lang.Object ref = depositorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      depositorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_ADDRESS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object toAddress_ = "";
  /**
   * <code>string to_address = 4 [json_name = "toAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The toAddress.
   */
  @java.lang.Override
  public java.lang.String getToAddress() {
    java.lang.Object ref = toAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string to_address = 4 [json_name = "toAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for toAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToAddressBytes() {
    java.lang.Object ref = toAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toAddress_ = b;
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
    if (poolId_ != 0L) {
      output.writeUInt64(1, poolId_);
    }
    if (depositId_ != 0L) {
      output.writeUInt64(2, depositId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, depositorAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, toAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (poolId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, poolId_);
    }
    if (depositId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, depositId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, depositorAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, toAddress_);
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
    if (!(obj instanceof com.lum.network.millions.MsgWithdrawDeposit)) {
      return super.equals(obj);
    }
    com.lum.network.millions.MsgWithdrawDeposit other = (com.lum.network.millions.MsgWithdrawDeposit) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
    if (getDepositId()
        != other.getDepositId()) return false;
    if (!getDepositorAddress()
        .equals(other.getDepositorAddress())) return false;
    if (!getToAddress()
        .equals(other.getToAddress())) return false;
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
    hash = (37 * hash) + POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPoolId());
    hash = (37 * hash) + DEPOSIT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDepositId());
    hash = (37 * hash) + DEPOSITOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getDepositorAddress().hashCode();
    hash = (37 * hash) + TO_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getToAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lum.network.millions.MsgWithdrawDeposit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.MsgWithdrawDeposit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.MsgWithdrawDeposit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.MsgWithdrawDeposit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.MsgWithdrawDeposit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.MsgWithdrawDeposit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.MsgWithdrawDeposit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.millions.MsgWithdrawDeposit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.lum.network.millions.MsgWithdrawDeposit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.lum.network.millions.MsgWithdrawDeposit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lum.network.millions.MsgWithdrawDeposit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.millions.MsgWithdrawDeposit parseFrom(
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
  public static Builder newBuilder(com.lum.network.millions.MsgWithdrawDeposit prototype) {
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
   * Protobuf type {@code lum.network.millions.MsgWithdrawDeposit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lum.network.millions.MsgWithdrawDeposit)
      com.lum.network.millions.MsgWithdrawDepositOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lum.network.millions.TxProto.internal_static_lum_network_millions_MsgWithdrawDeposit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lum.network.millions.TxProto.internal_static_lum_network_millions_MsgWithdrawDeposit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lum.network.millions.MsgWithdrawDeposit.class, com.lum.network.millions.MsgWithdrawDeposit.Builder.class);
    }

    // Construct using com.lum.network.millions.MsgWithdrawDeposit.newBuilder()
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
      poolId_ = 0L;
      depositId_ = 0L;
      depositorAddress_ = "";
      toAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lum.network.millions.TxProto.internal_static_lum_network_millions_MsgWithdrawDeposit_descriptor;
    }

    @java.lang.Override
    public com.lum.network.millions.MsgWithdrawDeposit getDefaultInstanceForType() {
      return com.lum.network.millions.MsgWithdrawDeposit.getDefaultInstance();
    }

    @java.lang.Override
    public com.lum.network.millions.MsgWithdrawDeposit build() {
      com.lum.network.millions.MsgWithdrawDeposit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.lum.network.millions.MsgWithdrawDeposit buildPartial() {
      com.lum.network.millions.MsgWithdrawDeposit result = new com.lum.network.millions.MsgWithdrawDeposit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.lum.network.millions.MsgWithdrawDeposit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.depositId_ = depositId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.depositorAddress_ = depositorAddress_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.toAddress_ = toAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lum.network.millions.MsgWithdrawDeposit) {
        return mergeFrom((com.lum.network.millions.MsgWithdrawDeposit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lum.network.millions.MsgWithdrawDeposit other) {
      if (other == com.lum.network.millions.MsgWithdrawDeposit.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (other.getDepositId() != 0L) {
        setDepositId(other.getDepositId());
      }
      if (!other.getDepositorAddress().isEmpty()) {
        depositorAddress_ = other.depositorAddress_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getToAddress().isEmpty()) {
        toAddress_ = other.toAddress_;
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
            case 8: {
              poolId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              depositId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              depositorAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              toAddress_ = input.readStringRequireUtf8();
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

    private long poolId_ ;
    /**
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @param value The poolId to set.
     * @return This builder for chaining.
     */
    public Builder setPoolId(long value) {

      poolId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      poolId_ = 0L;
      onChanged();
      return this;
    }

    private long depositId_ ;
    /**
     * <code>uint64 deposit_id = 2 [json_name = "depositId"];</code>
     * @return The depositId.
     */
    @java.lang.Override
    public long getDepositId() {
      return depositId_;
    }
    /**
     * <code>uint64 deposit_id = 2 [json_name = "depositId"];</code>
     * @param value The depositId to set.
     * @return This builder for chaining.
     */
    public Builder setDepositId(long value) {

      depositId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 deposit_id = 2 [json_name = "depositId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDepositId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      depositId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object depositorAddress_ = "";
    /**
     * <code>string depositor_address = 3 [json_name = "depositorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The depositorAddress.
     */
    public java.lang.String getDepositorAddress() {
      java.lang.Object ref = depositorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        depositorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string depositor_address = 3 [json_name = "depositorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for depositorAddress.
     */
    public com.google.protobuf.ByteString
        getDepositorAddressBytes() {
      java.lang.Object ref = depositorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        depositorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string depositor_address = 3 [json_name = "depositorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The depositorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDepositorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      depositorAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string depositor_address = 3 [json_name = "depositorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDepositorAddress() {
      depositorAddress_ = getDefaultInstance().getDepositorAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string depositor_address = 3 [json_name = "depositorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for depositorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDepositorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      depositorAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object toAddress_ = "";
    /**
     * <code>string to_address = 4 [json_name = "toAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The toAddress.
     */
    public java.lang.String getToAddress() {
      java.lang.Object ref = toAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to_address = 4 [json_name = "toAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for toAddress.
     */
    public com.google.protobuf.ByteString
        getToAddressBytes() {
      java.lang.Object ref = toAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to_address = 4 [json_name = "toAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The toAddress to set.
     * @return This builder for chaining.
     */
    public Builder setToAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      toAddress_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string to_address = 4 [json_name = "toAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToAddress() {
      toAddress_ = getDefaultInstance().getToAddress();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string to_address = 4 [json_name = "toAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for toAddress to set.
     * @return This builder for chaining.
     */
    public Builder setToAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      toAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:lum.network.millions.MsgWithdrawDeposit)
  }

  // @@protoc_insertion_point(class_scope:lum.network.millions.MsgWithdrawDeposit)
  private static final com.lum.network.millions.MsgWithdrawDeposit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lum.network.millions.MsgWithdrawDeposit();
  }

  public static com.lum.network.millions.MsgWithdrawDeposit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgWithdrawDeposit>
      PARSER = new com.google.protobuf.AbstractParser<MsgWithdrawDeposit>() {
    @java.lang.Override
    public MsgWithdrawDeposit parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgWithdrawDeposit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgWithdrawDeposit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.lum.network.millions.MsgWithdrawDeposit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

