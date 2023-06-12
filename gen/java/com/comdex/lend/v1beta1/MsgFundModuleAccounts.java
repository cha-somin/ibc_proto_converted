// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/tx.proto

package com.comdex.lend.v1beta1;

/**
 * Protobuf type {@code comdex.lend.v1beta1.MsgFundModuleAccounts}
 */
public final class MsgFundModuleAccounts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.lend.v1beta1.MsgFundModuleAccounts)
    MsgFundModuleAccountsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgFundModuleAccounts.newBuilder() to construct.
  private MsgFundModuleAccounts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgFundModuleAccounts() {
    lender_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgFundModuleAccounts();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.lend.v1beta1.TxProto.internal_static_comdex_lend_v1beta1_MsgFundModuleAccounts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.lend.v1beta1.TxProto.internal_static_comdex_lend_v1beta1_MsgFundModuleAccounts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.lend.v1beta1.MsgFundModuleAccounts.class, com.comdex.lend.v1beta1.MsgFundModuleAccounts.Builder.class);
  }

  public static final int POOLID_FIELD_NUMBER = 1;
  private long poolId_ = 0L;
  /**
   * <code>uint64 poolId = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
  }

  public static final int ASSETID_FIELD_NUMBER = 2;
  private long assetId_ = 0L;
  /**
   * <code>uint64 assetId = 2 [json_name = "assetId"];</code>
   * @return The assetId.
   */
  @java.lang.Override
  public long getAssetId() {
    return assetId_;
  }

  public static final int LENDER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object lender_ = "";
  /**
   * <code>string lender = 3 [json_name = "lender"];</code>
   * @return The lender.
   */
  @java.lang.Override
  public java.lang.String getLender() {
    java.lang.Object ref = lender_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lender_ = s;
      return s;
    }
  }
  /**
   * <code>string lender = 3 [json_name = "lender"];</code>
   * @return The bytes for lender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLenderBytes() {
    java.lang.Object ref = lender_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lender_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 4;
  private com.cosmos.base.v1beta1.Coin amount_;
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return amount_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   * @return The amount.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAmount() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder() {
    return amount_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amount_;
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
    if (assetId_ != 0L) {
      output.writeUInt64(2, assetId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lender_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lender_);
    }
    if (amount_ != null) {
      output.writeMessage(4, getAmount());
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
    if (assetId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, assetId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lender_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lender_);
    }
    if (amount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAmount());
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
    if (!(obj instanceof com.comdex.lend.v1beta1.MsgFundModuleAccounts)) {
      return super.equals(obj);
    }
    com.comdex.lend.v1beta1.MsgFundModuleAccounts other = (com.comdex.lend.v1beta1.MsgFundModuleAccounts) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
    if (getAssetId()
        != other.getAssetId()) return false;
    if (!getLender()
        .equals(other.getLender())) return false;
    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (!getAmount()
          .equals(other.getAmount())) return false;
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
    hash = (37 * hash) + POOLID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPoolId());
    hash = (37 * hash) + ASSETID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAssetId());
    hash = (37 * hash) + LENDER_FIELD_NUMBER;
    hash = (53 * hash) + getLender().hashCode();
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts parseFrom(
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
  public static Builder newBuilder(com.comdex.lend.v1beta1.MsgFundModuleAccounts prototype) {
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
   * Protobuf type {@code comdex.lend.v1beta1.MsgFundModuleAccounts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.lend.v1beta1.MsgFundModuleAccounts)
      com.comdex.lend.v1beta1.MsgFundModuleAccountsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.lend.v1beta1.TxProto.internal_static_comdex_lend_v1beta1_MsgFundModuleAccounts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.lend.v1beta1.TxProto.internal_static_comdex_lend_v1beta1_MsgFundModuleAccounts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.lend.v1beta1.MsgFundModuleAccounts.class, com.comdex.lend.v1beta1.MsgFundModuleAccounts.Builder.class);
    }

    // Construct using com.comdex.lend.v1beta1.MsgFundModuleAccounts.newBuilder()
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
      assetId_ = 0L;
      lender_ = "";
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.lend.v1beta1.TxProto.internal_static_comdex_lend_v1beta1_MsgFundModuleAccounts_descriptor;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.MsgFundModuleAccounts getDefaultInstanceForType() {
      return com.comdex.lend.v1beta1.MsgFundModuleAccounts.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.MsgFundModuleAccounts build() {
      com.comdex.lend.v1beta1.MsgFundModuleAccounts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.MsgFundModuleAccounts buildPartial() {
      com.comdex.lend.v1beta1.MsgFundModuleAccounts result = new com.comdex.lend.v1beta1.MsgFundModuleAccounts(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.lend.v1beta1.MsgFundModuleAccounts result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assetId_ = assetId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lender_ = lender_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.amount_ = amountBuilder_ == null
            ? amount_
            : amountBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.lend.v1beta1.MsgFundModuleAccounts) {
        return mergeFrom((com.comdex.lend.v1beta1.MsgFundModuleAccounts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.lend.v1beta1.MsgFundModuleAccounts other) {
      if (other == com.comdex.lend.v1beta1.MsgFundModuleAccounts.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (other.getAssetId() != 0L) {
        setAssetId(other.getAssetId());
      }
      if (!other.getLender().isEmpty()) {
        lender_ = other.lender_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
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
              assetId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              lender_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getAmountFieldBuilder().getBuilder(),
                  extensionRegistry);
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
     * <code>uint64 poolId = 1 [json_name = "poolId"];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <code>uint64 poolId = 1 [json_name = "poolId"];</code>
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
     * <code>uint64 poolId = 1 [json_name = "poolId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      poolId_ = 0L;
      onChanged();
      return this;
    }

    private long assetId_ ;
    /**
     * <code>uint64 assetId = 2 [json_name = "assetId"];</code>
     * @return The assetId.
     */
    @java.lang.Override
    public long getAssetId() {
      return assetId_;
    }
    /**
     * <code>uint64 assetId = 2 [json_name = "assetId"];</code>
     * @param value The assetId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetId(long value) {

      assetId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 assetId = 2 [json_name = "assetId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      assetId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object lender_ = "";
    /**
     * <code>string lender = 3 [json_name = "lender"];</code>
     * @return The lender.
     */
    public java.lang.String getLender() {
      java.lang.Object ref = lender_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lender_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lender = 3 [json_name = "lender"];</code>
     * @return The bytes for lender.
     */
    public com.google.protobuf.ByteString
        getLenderBytes() {
      java.lang.Object ref = lender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lender = 3 [json_name = "lender"];</code>
     * @param value The lender to set.
     * @return This builder for chaining.
     */
    public Builder setLender(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      lender_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string lender = 3 [json_name = "lender"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLender() {
      lender_ = getDefaultInstance().getLender();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string lender = 3 [json_name = "lender"];</code>
     * @param value The bytes for lender to set.
     * @return This builder for chaining.
     */
    public Builder setLenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      lender_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin amount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> amountBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     * @return Whether the amount field is set.
     */
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
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
     * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
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
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAmount(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeAmount(com.cosmos.base.v1beta1.Coin value) {
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          amount_ != null &&
          amount_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getAmountBuilder().mergeFrom(value);
        } else {
          amount_ = value;
        }
      } else {
        amountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAmountBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
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
     * <code>.cosmos.base.v1beta1.Coin amount = 4 [json_name = "amount", (.gogoproto.nullable) = false];</code>
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


    // @@protoc_insertion_point(builder_scope:comdex.lend.v1beta1.MsgFundModuleAccounts)
  }

  // @@protoc_insertion_point(class_scope:comdex.lend.v1beta1.MsgFundModuleAccounts)
  private static final com.comdex.lend.v1beta1.MsgFundModuleAccounts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.lend.v1beta1.MsgFundModuleAccounts();
  }

  public static com.comdex.lend.v1beta1.MsgFundModuleAccounts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgFundModuleAccounts>
      PARSER = new com.google.protobuf.AbstractParser<MsgFundModuleAccounts>() {
    @java.lang.Override
    public MsgFundModuleAccounts parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgFundModuleAccounts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgFundModuleAccounts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.lend.v1beta1.MsgFundModuleAccounts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

