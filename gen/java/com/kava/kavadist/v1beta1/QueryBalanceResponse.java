// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/kavadist/v1beta1/query.proto

package com.kava.kavadist.v1beta1;

/**
 * <pre>
 * QueryBalanceResponse defines the response type for querying x/kavadist balance.
 * </pre>
 *
 * Protobuf type {@code kava.kavadist.v1beta1.QueryBalanceResponse}
 */
public final class QueryBalanceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.kavadist.v1beta1.QueryBalanceResponse)
    QueryBalanceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryBalanceResponse.newBuilder() to construct.
  private QueryBalanceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryBalanceResponse() {
    coins_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryBalanceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.kavadist.v1beta1.QueryProto.internal_static_kava_kavadist_v1beta1_QueryBalanceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.kavadist.v1beta1.QueryProto.internal_static_kava_kavadist_v1beta1_QueryBalanceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.kavadist.v1beta1.QueryBalanceResponse.class, com.kava.kavadist.v1beta1.QueryBalanceResponse.Builder.class);
  }

  public static final int COINS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> coins_;
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getCoinsList() {
    return coins_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getCoinsOrBuilderList() {
    return coins_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public int getCoinsCount() {
    return coins_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getCoins(int index) {
    return coins_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getCoinsOrBuilder(
      int index) {
    return coins_.get(index);
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
    for (int i = 0; i < coins_.size(); i++) {
      output.writeMessage(1, coins_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < coins_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, coins_.get(i));
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
    if (!(obj instanceof com.kava.kavadist.v1beta1.QueryBalanceResponse)) {
      return super.equals(obj);
    }
    com.kava.kavadist.v1beta1.QueryBalanceResponse other = (com.kava.kavadist.v1beta1.QueryBalanceResponse) obj;

    if (!getCoinsList()
        .equals(other.getCoinsList())) return false;
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
    if (getCoinsCount() > 0) {
      hash = (37 * hash) + COINS_FIELD_NUMBER;
      hash = (53 * hash) + getCoinsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.kavadist.v1beta1.QueryBalanceResponse parseFrom(
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
  public static Builder newBuilder(com.kava.kavadist.v1beta1.QueryBalanceResponse prototype) {
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
   * QueryBalanceResponse defines the response type for querying x/kavadist balance.
   * </pre>
   *
   * Protobuf type {@code kava.kavadist.v1beta1.QueryBalanceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.kavadist.v1beta1.QueryBalanceResponse)
      com.kava.kavadist.v1beta1.QueryBalanceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.kavadist.v1beta1.QueryProto.internal_static_kava_kavadist_v1beta1_QueryBalanceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.kavadist.v1beta1.QueryProto.internal_static_kava_kavadist_v1beta1_QueryBalanceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.kavadist.v1beta1.QueryBalanceResponse.class, com.kava.kavadist.v1beta1.QueryBalanceResponse.Builder.class);
    }

    // Construct using com.kava.kavadist.v1beta1.QueryBalanceResponse.newBuilder()
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
      if (coinsBuilder_ == null) {
        coins_ = java.util.Collections.emptyList();
      } else {
        coins_ = null;
        coinsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.kavadist.v1beta1.QueryProto.internal_static_kava_kavadist_v1beta1_QueryBalanceResponse_descriptor;
    }

    @java.lang.Override
    public com.kava.kavadist.v1beta1.QueryBalanceResponse getDefaultInstanceForType() {
      return com.kava.kavadist.v1beta1.QueryBalanceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.kavadist.v1beta1.QueryBalanceResponse build() {
      com.kava.kavadist.v1beta1.QueryBalanceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.kavadist.v1beta1.QueryBalanceResponse buildPartial() {
      com.kava.kavadist.v1beta1.QueryBalanceResponse result = new com.kava.kavadist.v1beta1.QueryBalanceResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.kava.kavadist.v1beta1.QueryBalanceResponse result) {
      if (coinsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          coins_ = java.util.Collections.unmodifiableList(coins_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.coins_ = coins_;
      } else {
        result.coins_ = coinsBuilder_.build();
      }
    }

    private void buildPartial0(com.kava.kavadist.v1beta1.QueryBalanceResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.kavadist.v1beta1.QueryBalanceResponse) {
        return mergeFrom((com.kava.kavadist.v1beta1.QueryBalanceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.kavadist.v1beta1.QueryBalanceResponse other) {
      if (other == com.kava.kavadist.v1beta1.QueryBalanceResponse.getDefaultInstance()) return this;
      if (coinsBuilder_ == null) {
        if (!other.coins_.isEmpty()) {
          if (coins_.isEmpty()) {
            coins_ = other.coins_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCoinsIsMutable();
            coins_.addAll(other.coins_);
          }
          onChanged();
        }
      } else {
        if (!other.coins_.isEmpty()) {
          if (coinsBuilder_.isEmpty()) {
            coinsBuilder_.dispose();
            coinsBuilder_ = null;
            coins_ = other.coins_;
            bitField0_ = (bitField0_ & ~0x00000001);
            coinsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCoinsFieldBuilder() : null;
          } else {
            coinsBuilder_.addAllMessages(other.coins_);
          }
        }
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
              com.cosmos.base.v1beta1.Coin m =
                  input.readMessage(
                      com.cosmos.base.v1beta1.Coin.parser(),
                      extensionRegistry);
              if (coinsBuilder_ == null) {
                ensureCoinsIsMutable();
                coins_.add(m);
              } else {
                coinsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.cosmos.base.v1beta1.Coin> coins_ =
      java.util.Collections.emptyList();
    private void ensureCoinsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        coins_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(coins_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> coinsBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getCoinsList() {
      if (coinsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(coins_);
      } else {
        return coinsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public int getCoinsCount() {
      if (coinsBuilder_ == null) {
        return coins_.size();
      } else {
        return coinsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin getCoins(int index) {
      if (coinsBuilder_ == null) {
        return coins_.get(index);
      } else {
        return coinsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setCoins(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (coinsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoinsIsMutable();
        coins_.set(index, value);
        onChanged();
      } else {
        coinsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setCoins(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (coinsBuilder_ == null) {
        ensureCoinsIsMutable();
        coins_.set(index, builderForValue.build());
        onChanged();
      } else {
        coinsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addCoins(com.cosmos.base.v1beta1.Coin value) {
      if (coinsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoinsIsMutable();
        coins_.add(value);
        onChanged();
      } else {
        coinsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addCoins(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (coinsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoinsIsMutable();
        coins_.add(index, value);
        onChanged();
      } else {
        coinsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addCoins(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (coinsBuilder_ == null) {
        ensureCoinsIsMutable();
        coins_.add(builderForValue.build());
        onChanged();
      } else {
        coinsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addCoins(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (coinsBuilder_ == null) {
        ensureCoinsIsMutable();
        coins_.add(index, builderForValue.build());
        onChanged();
      } else {
        coinsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAllCoins(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (coinsBuilder_ == null) {
        ensureCoinsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, coins_);
        onChanged();
      } else {
        coinsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearCoins() {
      if (coinsBuilder_ == null) {
        coins_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        coinsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder removeCoins(int index) {
      if (coinsBuilder_ == null) {
        ensureCoinsIsMutable();
        coins_.remove(index);
        onChanged();
      } else {
        coinsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getCoinsBuilder(
        int index) {
      return getCoinsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getCoinsOrBuilder(
        int index) {
      if (coinsBuilder_ == null) {
        return coins_.get(index);  } else {
        return coinsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getCoinsOrBuilderList() {
      if (coinsBuilder_ != null) {
        return coinsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(coins_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addCoinsBuilder() {
      return getCoinsFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addCoinsBuilder(
        int index) {
      return getCoinsFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin coins = 1 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getCoinsBuilderList() {
      return getCoinsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getCoinsFieldBuilder() {
      if (coinsBuilder_ == null) {
        coinsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                coins_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        coins_ = null;
      }
      return coinsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.kavadist.v1beta1.QueryBalanceResponse)
  }

  // @@protoc_insertion_point(class_scope:kava.kavadist.v1beta1.QueryBalanceResponse)
  private static final com.kava.kavadist.v1beta1.QueryBalanceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.kavadist.v1beta1.QueryBalanceResponse();
  }

  public static com.kava.kavadist.v1beta1.QueryBalanceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryBalanceResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryBalanceResponse>() {
    @java.lang.Override
    public QueryBalanceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryBalanceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryBalanceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.kavadist.v1beta1.QueryBalanceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

