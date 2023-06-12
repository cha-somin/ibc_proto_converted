// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/lend.proto

package com.comdex.lend.v1beta1;

/**
 * Protobuf type {@code comdex.lend.v1beta1.FundReserveBal}
 */
public final class FundReserveBal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.lend.v1beta1.FundReserveBal)
    FundReserveBalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FundReserveBal.newBuilder() to construct.
  private FundReserveBal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FundReserveBal() {
    funder_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FundReserveBal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.lend.v1beta1.LendProto.internal_static_comdex_lend_v1beta1_FundReserveBal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.lend.v1beta1.LendProto.internal_static_comdex_lend_v1beta1_FundReserveBal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.lend.v1beta1.FundReserveBal.class, com.comdex.lend.v1beta1.FundReserveBal.Builder.class);
  }

  public static final int ASSET_ID_FIELD_NUMBER = 1;
  private long assetId_ = 0L;
  /**
   * <code>uint64 asset_id = 1 [json_name = "assetId", (.gogoproto.customname) = "AssetID", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
   * @return The assetId.
   */
  @java.lang.Override
  public long getAssetId() {
    return assetId_;
  }

  public static final int AMOUNT_IN_FIELD_NUMBER = 2;
  private com.cosmos.base.v1beta1.Coin amountIn_;
  /**
   * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the amountIn field is set.
   */
  @java.lang.Override
  public boolean hasAmountIn() {
    return amountIn_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The amountIn.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAmountIn() {
    return amountIn_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amountIn_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAmountInOrBuilder() {
    return amountIn_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amountIn_;
  }

  public static final int DEPOSIT_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp depositTime_;
  /**
   * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the depositTime field is set.
   */
  @java.lang.Override
  public boolean hasDepositTime() {
    return depositTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The depositTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDepositTime() {
    return depositTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : depositTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getDepositTimeOrBuilder() {
    return depositTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : depositTime_;
  }

  public static final int FUNDER_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object funder_ = "";
  /**
   * <code>string funder = 4 [json_name = "funder", (.gogoproto.moretags) = "yaml:&#92;"funder&#92;""];</code>
   * @return The funder.
   */
  @java.lang.Override
  public java.lang.String getFunder() {
    java.lang.Object ref = funder_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      funder_ = s;
      return s;
    }
  }
  /**
   * <code>string funder = 4 [json_name = "funder", (.gogoproto.moretags) = "yaml:&#92;"funder&#92;""];</code>
   * @return The bytes for funder.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFunderBytes() {
    java.lang.Object ref = funder_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      funder_ = b;
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
    if (assetId_ != 0L) {
      output.writeUInt64(1, assetId_);
    }
    if (amountIn_ != null) {
      output.writeMessage(2, getAmountIn());
    }
    if (depositTime_ != null) {
      output.writeMessage(3, getDepositTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(funder_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, funder_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (assetId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, assetId_);
    }
    if (amountIn_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAmountIn());
    }
    if (depositTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDepositTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(funder_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, funder_);
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
    if (!(obj instanceof com.comdex.lend.v1beta1.FundReserveBal)) {
      return super.equals(obj);
    }
    com.comdex.lend.v1beta1.FundReserveBal other = (com.comdex.lend.v1beta1.FundReserveBal) obj;

    if (getAssetId()
        != other.getAssetId()) return false;
    if (hasAmountIn() != other.hasAmountIn()) return false;
    if (hasAmountIn()) {
      if (!getAmountIn()
          .equals(other.getAmountIn())) return false;
    }
    if (hasDepositTime() != other.hasDepositTime()) return false;
    if (hasDepositTime()) {
      if (!getDepositTime()
          .equals(other.getDepositTime())) return false;
    }
    if (!getFunder()
        .equals(other.getFunder())) return false;
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
    hash = (37 * hash) + ASSET_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAssetId());
    if (hasAmountIn()) {
      hash = (37 * hash) + AMOUNT_IN_FIELD_NUMBER;
      hash = (53 * hash) + getAmountIn().hashCode();
    }
    if (hasDepositTime()) {
      hash = (37 * hash) + DEPOSIT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getDepositTime().hashCode();
    }
    hash = (37 * hash) + FUNDER_FIELD_NUMBER;
    hash = (53 * hash) + getFunder().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.lend.v1beta1.FundReserveBal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.FundReserveBal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.FundReserveBal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.FundReserveBal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.FundReserveBal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.FundReserveBal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.FundReserveBal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.FundReserveBal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.lend.v1beta1.FundReserveBal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.lend.v1beta1.FundReserveBal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.FundReserveBal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.FundReserveBal parseFrom(
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
  public static Builder newBuilder(com.comdex.lend.v1beta1.FundReserveBal prototype) {
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
   * Protobuf type {@code comdex.lend.v1beta1.FundReserveBal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.lend.v1beta1.FundReserveBal)
      com.comdex.lend.v1beta1.FundReserveBalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.lend.v1beta1.LendProto.internal_static_comdex_lend_v1beta1_FundReserveBal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.lend.v1beta1.LendProto.internal_static_comdex_lend_v1beta1_FundReserveBal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.lend.v1beta1.FundReserveBal.class, com.comdex.lend.v1beta1.FundReserveBal.Builder.class);
    }

    // Construct using com.comdex.lend.v1beta1.FundReserveBal.newBuilder()
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
      assetId_ = 0L;
      amountIn_ = null;
      if (amountInBuilder_ != null) {
        amountInBuilder_.dispose();
        amountInBuilder_ = null;
      }
      depositTime_ = null;
      if (depositTimeBuilder_ != null) {
        depositTimeBuilder_.dispose();
        depositTimeBuilder_ = null;
      }
      funder_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.lend.v1beta1.LendProto.internal_static_comdex_lend_v1beta1_FundReserveBal_descriptor;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.FundReserveBal getDefaultInstanceForType() {
      return com.comdex.lend.v1beta1.FundReserveBal.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.FundReserveBal build() {
      com.comdex.lend.v1beta1.FundReserveBal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.FundReserveBal buildPartial() {
      com.comdex.lend.v1beta1.FundReserveBal result = new com.comdex.lend.v1beta1.FundReserveBal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.lend.v1beta1.FundReserveBal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.assetId_ = assetId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.amountIn_ = amountInBuilder_ == null
            ? amountIn_
            : amountInBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.depositTime_ = depositTimeBuilder_ == null
            ? depositTime_
            : depositTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.funder_ = funder_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.lend.v1beta1.FundReserveBal) {
        return mergeFrom((com.comdex.lend.v1beta1.FundReserveBal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.lend.v1beta1.FundReserveBal other) {
      if (other == com.comdex.lend.v1beta1.FundReserveBal.getDefaultInstance()) return this;
      if (other.getAssetId() != 0L) {
        setAssetId(other.getAssetId());
      }
      if (other.hasAmountIn()) {
        mergeAmountIn(other.getAmountIn());
      }
      if (other.hasDepositTime()) {
        mergeDepositTime(other.getDepositTime());
      }
      if (!other.getFunder().isEmpty()) {
        funder_ = other.funder_;
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
              assetId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getAmountInFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getDepositTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              funder_ = input.readStringRequireUtf8();
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

    private long assetId_ ;
    /**
     * <code>uint64 asset_id = 1 [json_name = "assetId", (.gogoproto.customname) = "AssetID", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
     * @return The assetId.
     */
    @java.lang.Override
    public long getAssetId() {
      return assetId_;
    }
    /**
     * <code>uint64 asset_id = 1 [json_name = "assetId", (.gogoproto.customname) = "AssetID", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
     * @param value The assetId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetId(long value) {

      assetId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 asset_id = 1 [json_name = "assetId", (.gogoproto.customname) = "AssetID", (.gogoproto.moretags) = "yaml:&#92;"asset_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      assetId_ = 0L;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin amountIn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> amountInBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return Whether the amountIn field is set.
     */
    public boolean hasAmountIn() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return The amountIn.
     */
    public com.cosmos.base.v1beta1.Coin getAmountIn() {
      if (amountInBuilder_ == null) {
        return amountIn_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amountIn_;
      } else {
        return amountInBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setAmountIn(com.cosmos.base.v1beta1.Coin value) {
      if (amountInBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amountIn_ = value;
      } else {
        amountInBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setAmountIn(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (amountInBuilder_ == null) {
        amountIn_ = builderForValue.build();
      } else {
        amountInBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder mergeAmountIn(com.cosmos.base.v1beta1.Coin value) {
      if (amountInBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          amountIn_ != null &&
          amountIn_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getAmountInBuilder().mergeFrom(value);
        } else {
          amountIn_ = value;
        }
      } else {
        amountInBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder clearAmountIn() {
      bitField0_ = (bitField0_ & ~0x00000002);
      amountIn_ = null;
      if (amountInBuilder_ != null) {
        amountInBuilder_.dispose();
        amountInBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAmountInBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAmountInFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getAmountInOrBuilder() {
      if (amountInBuilder_ != null) {
        return amountInBuilder_.getMessageOrBuilder();
      } else {
        return amountIn_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : amountIn_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount_in = 2 [json_name = "amountIn", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"amount_in&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getAmountInFieldBuilder() {
      if (amountInBuilder_ == null) {
        amountInBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getAmountIn(),
                getParentForChildren(),
                isClean());
        amountIn_ = null;
      }
      return amountInBuilder_;
    }

    private com.google.protobuf.Timestamp depositTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> depositTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
     * @return Whether the depositTime field is set.
     */
    public boolean hasDepositTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
     * @return The depositTime.
     */
    public com.google.protobuf.Timestamp getDepositTime() {
      if (depositTimeBuilder_ == null) {
        return depositTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : depositTime_;
      } else {
        return depositTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setDepositTime(com.google.protobuf.Timestamp value) {
      if (depositTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        depositTime_ = value;
      } else {
        depositTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setDepositTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (depositTimeBuilder_ == null) {
        depositTime_ = builderForValue.build();
      } else {
        depositTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeDepositTime(com.google.protobuf.Timestamp value) {
      if (depositTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          depositTime_ != null &&
          depositTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getDepositTimeBuilder().mergeFrom(value);
        } else {
          depositTime_ = value;
        }
      } else {
        depositTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearDepositTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      depositTime_ = null;
      if (depositTimeBuilder_ != null) {
        depositTimeBuilder_.dispose();
        depositTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getDepositTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDepositTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDepositTimeOrBuilder() {
      if (depositTimeBuilder_ != null) {
        return depositTimeBuilder_.getMessageOrBuilder();
      } else {
        return depositTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : depositTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp deposit_time = 3 [json_name = "depositTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"deposit_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDepositTimeFieldBuilder() {
      if (depositTimeBuilder_ == null) {
        depositTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDepositTime(),
                getParentForChildren(),
                isClean());
        depositTime_ = null;
      }
      return depositTimeBuilder_;
    }

    private java.lang.Object funder_ = "";
    /**
     * <code>string funder = 4 [json_name = "funder", (.gogoproto.moretags) = "yaml:&#92;"funder&#92;""];</code>
     * @return The funder.
     */
    public java.lang.String getFunder() {
      java.lang.Object ref = funder_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        funder_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string funder = 4 [json_name = "funder", (.gogoproto.moretags) = "yaml:&#92;"funder&#92;""];</code>
     * @return The bytes for funder.
     */
    public com.google.protobuf.ByteString
        getFunderBytes() {
      java.lang.Object ref = funder_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        funder_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string funder = 4 [json_name = "funder", (.gogoproto.moretags) = "yaml:&#92;"funder&#92;""];</code>
     * @param value The funder to set.
     * @return This builder for chaining.
     */
    public Builder setFunder(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      funder_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string funder = 4 [json_name = "funder", (.gogoproto.moretags) = "yaml:&#92;"funder&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearFunder() {
      funder_ = getDefaultInstance().getFunder();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string funder = 4 [json_name = "funder", (.gogoproto.moretags) = "yaml:&#92;"funder&#92;""];</code>
     * @param value The bytes for funder to set.
     * @return This builder for chaining.
     */
    public Builder setFunderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      funder_ = value;
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


    // @@protoc_insertion_point(builder_scope:comdex.lend.v1beta1.FundReserveBal)
  }

  // @@protoc_insertion_point(class_scope:comdex.lend.v1beta1.FundReserveBal)
  private static final com.comdex.lend.v1beta1.FundReserveBal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.lend.v1beta1.FundReserveBal();
  }

  public static com.comdex.lend.v1beta1.FundReserveBal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FundReserveBal>
      PARSER = new com.google.protobuf.AbstractParser<FundReserveBal>() {
    @java.lang.Override
    public FundReserveBal parsePartialFrom(
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

  public static com.google.protobuf.Parser<FundReserveBal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FundReserveBal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.lend.v1beta1.FundReserveBal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

