// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/tx.proto

package com.coreum.asset.ft.v1;

/**
 * Protobuf type {@code coreum.asset.ft.v1.MsgUnfreeze}
 */
public final class MsgUnfreeze extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:coreum.asset.ft.v1.MsgUnfreeze)
    MsgUnfreezeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUnfreeze.newBuilder() to construct.
  private MsgUnfreeze(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUnfreeze() {
    sender_ = "";
    account_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUnfreeze();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coreum.asset.ft.v1.TxProto.internal_static_coreum_asset_ft_v1_MsgUnfreeze_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coreum.asset.ft.v1.TxProto.internal_static_coreum_asset_ft_v1_MsgUnfreeze_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.coreum.asset.ft.v1.MsgUnfreeze.class, com.coreum.asset.ft.v1.MsgUnfreeze.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sender_ = "";
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The sender.
   */
  @java.lang.Override
  public java.lang.String getSender() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sender_ = s;
      return s;
    }
  }
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSenderBytes() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sender_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object account_ = "";
  /**
   * <code>string account = 2 [json_name = "account"];</code>
   * @return The account.
   */
  @java.lang.Override
  public java.lang.String getAccount() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      account_ = s;
      return s;
    }
  }
  /**
   * <code>string account = 2 [json_name = "account"];</code>
   * @return The bytes for account.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountBytes() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      account_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COIN_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin coin_;
  /**
   * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
   * @return Whether the coin field is set.
   */
  @java.lang.Override
  public boolean hasCoin() {
    return coin_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
   * @return The coin.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getCoin() {
    return coin_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : coin_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getCoinOrBuilder() {
    return coin_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : coin_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(account_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, account_);
    }
    if (coin_ != null) {
      output.writeMessage(3, getCoin());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(account_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, account_);
    }
    if (coin_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCoin());
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
    if (!(obj instanceof com.coreum.asset.ft.v1.MsgUnfreeze)) {
      return super.equals(obj);
    }
    com.coreum.asset.ft.v1.MsgUnfreeze other = (com.coreum.asset.ft.v1.MsgUnfreeze) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getAccount()
        .equals(other.getAccount())) return false;
    if (hasCoin() != other.hasCoin()) return false;
    if (hasCoin()) {
      if (!getCoin()
          .equals(other.getCoin())) return false;
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
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAccount().hashCode();
    if (hasCoin()) {
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.coreum.asset.ft.v1.MsgUnfreeze parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.MsgUnfreeze parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.MsgUnfreeze parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.MsgUnfreeze parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.MsgUnfreeze parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.MsgUnfreeze parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.MsgUnfreeze parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreum.asset.ft.v1.MsgUnfreeze parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.coreum.asset.ft.v1.MsgUnfreeze parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.coreum.asset.ft.v1.MsgUnfreeze parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.MsgUnfreeze parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreum.asset.ft.v1.MsgUnfreeze parseFrom(
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
  public static Builder newBuilder(com.coreum.asset.ft.v1.MsgUnfreeze prototype) {
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
   * Protobuf type {@code coreum.asset.ft.v1.MsgUnfreeze}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:coreum.asset.ft.v1.MsgUnfreeze)
      com.coreum.asset.ft.v1.MsgUnfreezeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coreum.asset.ft.v1.TxProto.internal_static_coreum_asset_ft_v1_MsgUnfreeze_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coreum.asset.ft.v1.TxProto.internal_static_coreum_asset_ft_v1_MsgUnfreeze_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.coreum.asset.ft.v1.MsgUnfreeze.class, com.coreum.asset.ft.v1.MsgUnfreeze.Builder.class);
    }

    // Construct using com.coreum.asset.ft.v1.MsgUnfreeze.newBuilder()
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
      sender_ = "";
      account_ = "";
      coin_ = null;
      if (coinBuilder_ != null) {
        coinBuilder_.dispose();
        coinBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coreum.asset.ft.v1.TxProto.internal_static_coreum_asset_ft_v1_MsgUnfreeze_descriptor;
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.MsgUnfreeze getDefaultInstanceForType() {
      return com.coreum.asset.ft.v1.MsgUnfreeze.getDefaultInstance();
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.MsgUnfreeze build() {
      com.coreum.asset.ft.v1.MsgUnfreeze result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.MsgUnfreeze buildPartial() {
      com.coreum.asset.ft.v1.MsgUnfreeze result = new com.coreum.asset.ft.v1.MsgUnfreeze(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.coreum.asset.ft.v1.MsgUnfreeze result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.account_ = account_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.coin_ = coinBuilder_ == null
            ? coin_
            : coinBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.coreum.asset.ft.v1.MsgUnfreeze) {
        return mergeFrom((com.coreum.asset.ft.v1.MsgUnfreeze)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.coreum.asset.ft.v1.MsgUnfreeze other) {
      if (other == com.coreum.asset.ft.v1.MsgUnfreeze.getDefaultInstance()) return this;
      if (!other.getSender().isEmpty()) {
        sender_ = other.sender_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasCoin()) {
        mergeCoin(other.getCoin());
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
              sender_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              account_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getCoinFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object sender_ = "";
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return The sender.
     */
    public java.lang.String getSender() {
      java.lang.Object ref = sender_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return The bytes for sender.
     */
    public com.google.protobuf.ByteString
        getSenderBytes() {
      java.lang.Object ref = sender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      sender_ = getDefaultInstance().getSender();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @param value The bytes for sender to set.
     * @return This builder for chaining.
     */
    public Builder setSenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object account_ = "";
    /**
     * <code>string account = 2 [json_name = "account"];</code>
     * @return The account.
     */
    public java.lang.String getAccount() {
      java.lang.Object ref = account_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        account_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string account = 2 [json_name = "account"];</code>
     * @return The bytes for account.
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      java.lang.Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string account = 2 [json_name = "account"];</code>
     * @param value The account to set.
     * @return This builder for chaining.
     */
    public Builder setAccount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      account_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string account = 2 [json_name = "account"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccount() {
      account_ = getDefaultInstance().getAccount();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string account = 2 [json_name = "account"];</code>
     * @param value The bytes for account to set.
     * @return This builder for chaining.
     */
    public Builder setAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      account_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin coin_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> coinBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
     * @return Whether the coin field is set.
     */
    public boolean hasCoin() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
     * @return The coin.
     */
    public com.cosmos.base.v1beta1.Coin getCoin() {
      if (coinBuilder_ == null) {
        return coin_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : coin_;
      } else {
        return coinBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
     */
    public Builder setCoin(com.cosmos.base.v1beta1.Coin value) {
      if (coinBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coin_ = value;
      } else {
        coinBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
     */
    public Builder setCoin(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (coinBuilder_ == null) {
        coin_ = builderForValue.build();
      } else {
        coinBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeCoin(com.cosmos.base.v1beta1.Coin value) {
      if (coinBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          coin_ != null &&
          coin_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getCoinBuilder().mergeFrom(value);
        } else {
          coin_ = value;
        }
      } else {
        coinBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearCoin() {
      bitField0_ = (bitField0_ & ~0x00000004);
      coin_ = null;
      if (coinBuilder_ != null) {
        coinBuilder_.dispose();
        coinBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getCoinBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCoinFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getCoinOrBuilder() {
      if (coinBuilder_ != null) {
        return coinBuilder_.getMessageOrBuilder();
      } else {
        return coin_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : coin_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin coin = 3 [json_name = "coin", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getCoinFieldBuilder() {
      if (coinBuilder_ == null) {
        coinBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getCoin(),
                getParentForChildren(),
                isClean());
        coin_ = null;
      }
      return coinBuilder_;
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


    // @@protoc_insertion_point(builder_scope:coreum.asset.ft.v1.MsgUnfreeze)
  }

  // @@protoc_insertion_point(class_scope:coreum.asset.ft.v1.MsgUnfreeze)
  private static final com.coreum.asset.ft.v1.MsgUnfreeze DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.coreum.asset.ft.v1.MsgUnfreeze();
  }

  public static com.coreum.asset.ft.v1.MsgUnfreeze getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUnfreeze>
      PARSER = new com.google.protobuf.AbstractParser<MsgUnfreeze>() {
    @java.lang.Override
    public MsgUnfreeze parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUnfreeze> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUnfreeze> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.coreum.asset.ft.v1.MsgUnfreeze getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

