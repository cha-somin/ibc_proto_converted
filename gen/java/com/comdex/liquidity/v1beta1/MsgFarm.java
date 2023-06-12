// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/tx.proto

package com.comdex.liquidity.v1beta1;

/**
 * <pre>
 * MsgFarm defines a SDK message for farming coins (i.e without bonding) for incentivisation.
 * </pre>
 *
 * Protobuf type {@code comdex.liquidity.v1beta1.MsgFarm}
 */
public final class MsgFarm extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.liquidity.v1beta1.MsgFarm)
    MsgFarmOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgFarm.newBuilder() to construct.
  private MsgFarm(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgFarm() {
    farmer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgFarm();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.liquidity.v1beta1.TxProto.internal_static_comdex_liquidity_v1beta1_MsgFarm_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.liquidity.v1beta1.TxProto.internal_static_comdex_liquidity_v1beta1_MsgFarm_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.liquidity.v1beta1.MsgFarm.class, com.comdex.liquidity.v1beta1.MsgFarm.Builder.class);
  }

  public static final int APP_ID_FIELD_NUMBER = 1;
  private long appId_ = 0L;
  /**
   * <code>uint64 app_id = 1 [json_name = "appId"];</code>
   * @return The appId.
   */
  @java.lang.Override
  public long getAppId() {
    return appId_;
  }

  public static final int POOL_ID_FIELD_NUMBER = 2;
  private long poolId_ = 0L;
  /**
   * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
  }

  public static final int FARMER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object farmer_ = "";
  /**
   * <code>string farmer = 3 [json_name = "farmer"];</code>
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
   * <code>string farmer = 3 [json_name = "farmer"];</code>
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

  public static final int FARMING_POOL_COIN_FIELD_NUMBER = 4;
  private com.cosmos.base.v1beta1.Coin farmingPoolCoin_;
  /**
   * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the farmingPoolCoin field is set.
   */
  @java.lang.Override
  public boolean hasFarmingPoolCoin() {
    return farmingPoolCoin_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The farmingPoolCoin.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getFarmingPoolCoin() {
    return farmingPoolCoin_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : farmingPoolCoin_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getFarmingPoolCoinOrBuilder() {
    return farmingPoolCoin_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : farmingPoolCoin_;
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
    if (appId_ != 0L) {
      output.writeUInt64(1, appId_);
    }
    if (poolId_ != 0L) {
      output.writeUInt64(2, poolId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(farmer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, farmer_);
    }
    if (farmingPoolCoin_ != null) {
      output.writeMessage(4, getFarmingPoolCoin());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (appId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, appId_);
    }
    if (poolId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, poolId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(farmer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, farmer_);
    }
    if (farmingPoolCoin_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFarmingPoolCoin());
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
    if (!(obj instanceof com.comdex.liquidity.v1beta1.MsgFarm)) {
      return super.equals(obj);
    }
    com.comdex.liquidity.v1beta1.MsgFarm other = (com.comdex.liquidity.v1beta1.MsgFarm) obj;

    if (getAppId()
        != other.getAppId()) return false;
    if (getPoolId()
        != other.getPoolId()) return false;
    if (!getFarmer()
        .equals(other.getFarmer())) return false;
    if (hasFarmingPoolCoin() != other.hasFarmingPoolCoin()) return false;
    if (hasFarmingPoolCoin()) {
      if (!getFarmingPoolCoin()
          .equals(other.getFarmingPoolCoin())) return false;
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
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppId());
    hash = (37 * hash) + POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPoolId());
    hash = (37 * hash) + FARMER_FIELD_NUMBER;
    hash = (53 * hash) + getFarmer().hashCode();
    if (hasFarmingPoolCoin()) {
      hash = (37 * hash) + FARMING_POOL_COIN_FIELD_NUMBER;
      hash = (53 * hash) + getFarmingPoolCoin().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.liquidity.v1beta1.MsgFarm parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.liquidity.v1beta1.MsgFarm parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.MsgFarm parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.liquidity.v1beta1.MsgFarm parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.MsgFarm parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.liquidity.v1beta1.MsgFarm parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.MsgFarm parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.liquidity.v1beta1.MsgFarm parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.liquidity.v1beta1.MsgFarm parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.liquidity.v1beta1.MsgFarm parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.MsgFarm parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.liquidity.v1beta1.MsgFarm parseFrom(
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
  public static Builder newBuilder(com.comdex.liquidity.v1beta1.MsgFarm prototype) {
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
   * MsgFarm defines a SDK message for farming coins (i.e without bonding) for incentivisation.
   * </pre>
   *
   * Protobuf type {@code comdex.liquidity.v1beta1.MsgFarm}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.liquidity.v1beta1.MsgFarm)
      com.comdex.liquidity.v1beta1.MsgFarmOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.liquidity.v1beta1.TxProto.internal_static_comdex_liquidity_v1beta1_MsgFarm_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.liquidity.v1beta1.TxProto.internal_static_comdex_liquidity_v1beta1_MsgFarm_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.liquidity.v1beta1.MsgFarm.class, com.comdex.liquidity.v1beta1.MsgFarm.Builder.class);
    }

    // Construct using com.comdex.liquidity.v1beta1.MsgFarm.newBuilder()
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
      appId_ = 0L;
      poolId_ = 0L;
      farmer_ = "";
      farmingPoolCoin_ = null;
      if (farmingPoolCoinBuilder_ != null) {
        farmingPoolCoinBuilder_.dispose();
        farmingPoolCoinBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.liquidity.v1beta1.TxProto.internal_static_comdex_liquidity_v1beta1_MsgFarm_descriptor;
    }

    @java.lang.Override
    public com.comdex.liquidity.v1beta1.MsgFarm getDefaultInstanceForType() {
      return com.comdex.liquidity.v1beta1.MsgFarm.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.liquidity.v1beta1.MsgFarm build() {
      com.comdex.liquidity.v1beta1.MsgFarm result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.liquidity.v1beta1.MsgFarm buildPartial() {
      com.comdex.liquidity.v1beta1.MsgFarm result = new com.comdex.liquidity.v1beta1.MsgFarm(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.liquidity.v1beta1.MsgFarm result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.appId_ = appId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.farmer_ = farmer_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.farmingPoolCoin_ = farmingPoolCoinBuilder_ == null
            ? farmingPoolCoin_
            : farmingPoolCoinBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.liquidity.v1beta1.MsgFarm) {
        return mergeFrom((com.comdex.liquidity.v1beta1.MsgFarm)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.liquidity.v1beta1.MsgFarm other) {
      if (other == com.comdex.liquidity.v1beta1.MsgFarm.getDefaultInstance()) return this;
      if (other.getAppId() != 0L) {
        setAppId(other.getAppId());
      }
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (!other.getFarmer().isEmpty()) {
        farmer_ = other.farmer_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasFarmingPoolCoin()) {
        mergeFarmingPoolCoin(other.getFarmingPoolCoin());
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
              appId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              poolId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              farmer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getFarmingPoolCoinFieldBuilder().getBuilder(),
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

    private long appId_ ;
    /**
     * <code>uint64 app_id = 1 [json_name = "appId"];</code>
     * @return The appId.
     */
    @java.lang.Override
    public long getAppId() {
      return appId_;
    }
    /**
     * <code>uint64 app_id = 1 [json_name = "appId"];</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(long value) {

      appId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 app_id = 1 [json_name = "appId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      appId_ = 0L;
      onChanged();
      return this;
    }

    private long poolId_ ;
    /**
     * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
     * @param value The poolId to set.
     * @return This builder for chaining.
     */
    public Builder setPoolId(long value) {

      poolId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      poolId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object farmer_ = "";
    /**
     * <code>string farmer = 3 [json_name = "farmer"];</code>
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
     * <code>string farmer = 3 [json_name = "farmer"];</code>
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
     * <code>string farmer = 3 [json_name = "farmer"];</code>
     * @param value The farmer to set.
     * @return This builder for chaining.
     */
    public Builder setFarmer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      farmer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string farmer = 3 [json_name = "farmer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFarmer() {
      farmer_ = getDefaultInstance().getFarmer();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string farmer = 3 [json_name = "farmer"];</code>
     * @param value The bytes for farmer to set.
     * @return This builder for chaining.
     */
    public Builder setFarmerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      farmer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin farmingPoolCoin_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> farmingPoolCoinBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return Whether the farmingPoolCoin field is set.
     */
    public boolean hasFarmingPoolCoin() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     * @return The farmingPoolCoin.
     */
    public com.cosmos.base.v1beta1.Coin getFarmingPoolCoin() {
      if (farmingPoolCoinBuilder_ == null) {
        return farmingPoolCoin_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : farmingPoolCoin_;
      } else {
        return farmingPoolCoinBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setFarmingPoolCoin(com.cosmos.base.v1beta1.Coin value) {
      if (farmingPoolCoinBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        farmingPoolCoin_ = value;
      } else {
        farmingPoolCoinBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder setFarmingPoolCoin(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (farmingPoolCoinBuilder_ == null) {
        farmingPoolCoin_ = builderForValue.build();
      } else {
        farmingPoolCoinBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder mergeFarmingPoolCoin(com.cosmos.base.v1beta1.Coin value) {
      if (farmingPoolCoinBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          farmingPoolCoin_ != null &&
          farmingPoolCoin_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getFarmingPoolCoinBuilder().mergeFrom(value);
        } else {
          farmingPoolCoin_ = value;
        }
      } else {
        farmingPoolCoinBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public Builder clearFarmingPoolCoin() {
      bitField0_ = (bitField0_ & ~0x00000008);
      farmingPoolCoin_ = null;
      if (farmingPoolCoinBuilder_ != null) {
        farmingPoolCoinBuilder_.dispose();
        farmingPoolCoinBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getFarmingPoolCoinBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getFarmingPoolCoinFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getFarmingPoolCoinOrBuilder() {
      if (farmingPoolCoinBuilder_ != null) {
        return farmingPoolCoinBuilder_.getMessageOrBuilder();
      } else {
        return farmingPoolCoin_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : farmingPoolCoin_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin farming_pool_coin = 4 [json_name = "farmingPoolCoin", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"farming_pool_coin&#92;"", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getFarmingPoolCoinFieldBuilder() {
      if (farmingPoolCoinBuilder_ == null) {
        farmingPoolCoinBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getFarmingPoolCoin(),
                getParentForChildren(),
                isClean());
        farmingPoolCoin_ = null;
      }
      return farmingPoolCoinBuilder_;
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


    // @@protoc_insertion_point(builder_scope:comdex.liquidity.v1beta1.MsgFarm)
  }

  // @@protoc_insertion_point(class_scope:comdex.liquidity.v1beta1.MsgFarm)
  private static final com.comdex.liquidity.v1beta1.MsgFarm DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.liquidity.v1beta1.MsgFarm();
  }

  public static com.comdex.liquidity.v1beta1.MsgFarm getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgFarm>
      PARSER = new com.google.protobuf.AbstractParser<MsgFarm>() {
    @java.lang.Override
    public MsgFarm parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgFarm> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgFarm> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.liquidity.v1beta1.MsgFarm getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

