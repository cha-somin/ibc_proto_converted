// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/query.proto

package com.coreum.asset.ft.v1;

/**
 * Protobuf type {@code coreum.asset.ft.v1.QueryBalanceResponse}
 */
public final class QueryBalanceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:coreum.asset.ft.v1.QueryBalanceResponse)
    QueryBalanceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryBalanceResponse.newBuilder() to construct.
  private QueryBalanceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryBalanceResponse() {
    balance_ = "";
    whitelisted_ = "";
    frozen_ = "";
    locked_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryBalanceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coreum.asset.ft.v1.QueryProto.internal_static_coreum_asset_ft_v1_QueryBalanceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coreum.asset.ft.v1.QueryProto.internal_static_coreum_asset_ft_v1_QueryBalanceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.coreum.asset.ft.v1.QueryBalanceResponse.class, com.coreum.asset.ft.v1.QueryBalanceResponse.Builder.class);
  }

  public static final int BALANCE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object balance_ = "";
  /**
   * <pre>
   * balance contains the balance with the queried account and denom
   * </pre>
   *
   * <code>string balance = 1 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The balance.
   */
  @java.lang.Override
  public java.lang.String getBalance() {
    java.lang.Object ref = balance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      balance_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * balance contains the balance with the queried account and denom
   * </pre>
   *
   * <code>string balance = 1 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for balance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBalanceBytes() {
    java.lang.Object ref = balance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      balance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WHITELISTED_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object whitelisted_ = "";
  /**
   * <pre>
   * whitelisted is the whitelisted amount of the denom on the account.
   * </pre>
   *
   * <code>string whitelisted = 2 [json_name = "whitelisted", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The whitelisted.
   */
  @java.lang.Override
  public java.lang.String getWhitelisted() {
    java.lang.Object ref = whitelisted_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      whitelisted_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * whitelisted is the whitelisted amount of the denom on the account.
   * </pre>
   *
   * <code>string whitelisted = 2 [json_name = "whitelisted", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for whitelisted.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWhitelistedBytes() {
    java.lang.Object ref = whitelisted_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      whitelisted_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROZEN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object frozen_ = "";
  /**
   * <pre>
   * frozen is the frozen amount of the denom on the account.
   * </pre>
   *
   * <code>string frozen = 3 [json_name = "frozen", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The frozen.
   */
  @java.lang.Override
  public java.lang.String getFrozen() {
    java.lang.Object ref = frozen_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      frozen_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * frozen is the frozen amount of the denom on the account.
   * </pre>
   *
   * <code>string frozen = 3 [json_name = "frozen", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for frozen.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFrozenBytes() {
    java.lang.Object ref = frozen_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      frozen_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCKED_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object locked_ = "";
  /**
   * <pre>
   * locked is the balance locked by vesting.
   * </pre>
   *
   * <code>string locked = 4 [json_name = "locked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The locked.
   */
  @java.lang.Override
  public java.lang.String getLocked() {
    java.lang.Object ref = locked_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      locked_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * locked is the balance locked by vesting.
   * </pre>
   *
   * <code>string locked = 4 [json_name = "locked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for locked.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLockedBytes() {
    java.lang.Object ref = locked_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      locked_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(balance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, balance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(whitelisted_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, whitelisted_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(frozen_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, frozen_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locked_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, locked_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(balance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, balance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(whitelisted_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, whitelisted_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(frozen_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, frozen_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locked_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, locked_);
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
    if (!(obj instanceof com.coreum.asset.ft.v1.QueryBalanceResponse)) {
      return super.equals(obj);
    }
    com.coreum.asset.ft.v1.QueryBalanceResponse other = (com.coreum.asset.ft.v1.QueryBalanceResponse) obj;

    if (!getBalance()
        .equals(other.getBalance())) return false;
    if (!getWhitelisted()
        .equals(other.getWhitelisted())) return false;
    if (!getFrozen()
        .equals(other.getFrozen())) return false;
    if (!getLocked()
        .equals(other.getLocked())) return false;
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
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getBalance().hashCode();
    hash = (37 * hash) + WHITELISTED_FIELD_NUMBER;
    hash = (53 * hash) + getWhitelisted().hashCode();
    hash = (37 * hash) + FROZEN_FIELD_NUMBER;
    hash = (53 * hash) + getFrozen().hashCode();
    hash = (37 * hash) + LOCKED_FIELD_NUMBER;
    hash = (53 * hash) + getLocked().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreum.asset.ft.v1.QueryBalanceResponse parseFrom(
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
  public static Builder newBuilder(com.coreum.asset.ft.v1.QueryBalanceResponse prototype) {
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
   * Protobuf type {@code coreum.asset.ft.v1.QueryBalanceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:coreum.asset.ft.v1.QueryBalanceResponse)
      com.coreum.asset.ft.v1.QueryBalanceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coreum.asset.ft.v1.QueryProto.internal_static_coreum_asset_ft_v1_QueryBalanceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coreum.asset.ft.v1.QueryProto.internal_static_coreum_asset_ft_v1_QueryBalanceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.coreum.asset.ft.v1.QueryBalanceResponse.class, com.coreum.asset.ft.v1.QueryBalanceResponse.Builder.class);
    }

    // Construct using com.coreum.asset.ft.v1.QueryBalanceResponse.newBuilder()
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
      balance_ = "";
      whitelisted_ = "";
      frozen_ = "";
      locked_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coreum.asset.ft.v1.QueryProto.internal_static_coreum_asset_ft_v1_QueryBalanceResponse_descriptor;
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.QueryBalanceResponse getDefaultInstanceForType() {
      return com.coreum.asset.ft.v1.QueryBalanceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.QueryBalanceResponse build() {
      com.coreum.asset.ft.v1.QueryBalanceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.QueryBalanceResponse buildPartial() {
      com.coreum.asset.ft.v1.QueryBalanceResponse result = new com.coreum.asset.ft.v1.QueryBalanceResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.coreum.asset.ft.v1.QueryBalanceResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.balance_ = balance_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.whitelisted_ = whitelisted_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.frozen_ = frozen_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.locked_ = locked_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.coreum.asset.ft.v1.QueryBalanceResponse) {
        return mergeFrom((com.coreum.asset.ft.v1.QueryBalanceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.coreum.asset.ft.v1.QueryBalanceResponse other) {
      if (other == com.coreum.asset.ft.v1.QueryBalanceResponse.getDefaultInstance()) return this;
      if (!other.getBalance().isEmpty()) {
        balance_ = other.balance_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getWhitelisted().isEmpty()) {
        whitelisted_ = other.whitelisted_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFrozen().isEmpty()) {
        frozen_ = other.frozen_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getLocked().isEmpty()) {
        locked_ = other.locked_;
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
            case 10: {
              balance_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              whitelisted_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              frozen_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              locked_ = input.readStringRequireUtf8();
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

    private java.lang.Object balance_ = "";
    /**
     * <pre>
     * balance contains the balance with the queried account and denom
     * </pre>
     *
     * <code>string balance = 1 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The balance.
     */
    public java.lang.String getBalance() {
      java.lang.Object ref = balance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        balance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * balance contains the balance with the queried account and denom
     * </pre>
     *
     * <code>string balance = 1 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for balance.
     */
    public com.google.protobuf.ByteString
        getBalanceBytes() {
      java.lang.Object ref = balance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        balance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * balance contains the balance with the queried account and denom
     * </pre>
     *
     * <code>string balance = 1 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The balance to set.
     * @return This builder for chaining.
     */
    public Builder setBalance(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      balance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * balance contains the balance with the queried account and denom
     * </pre>
     *
     * <code>string balance = 1 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBalance() {
      balance_ = getDefaultInstance().getBalance();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * balance contains the balance with the queried account and denom
     * </pre>
     *
     * <code>string balance = 1 [json_name = "balance", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for balance to set.
     * @return This builder for chaining.
     */
    public Builder setBalanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      balance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object whitelisted_ = "";
    /**
     * <pre>
     * whitelisted is the whitelisted amount of the denom on the account.
     * </pre>
     *
     * <code>string whitelisted = 2 [json_name = "whitelisted", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The whitelisted.
     */
    public java.lang.String getWhitelisted() {
      java.lang.Object ref = whitelisted_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        whitelisted_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * whitelisted is the whitelisted amount of the denom on the account.
     * </pre>
     *
     * <code>string whitelisted = 2 [json_name = "whitelisted", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for whitelisted.
     */
    public com.google.protobuf.ByteString
        getWhitelistedBytes() {
      java.lang.Object ref = whitelisted_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        whitelisted_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * whitelisted is the whitelisted amount of the denom on the account.
     * </pre>
     *
     * <code>string whitelisted = 2 [json_name = "whitelisted", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The whitelisted to set.
     * @return This builder for chaining.
     */
    public Builder setWhitelisted(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      whitelisted_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * whitelisted is the whitelisted amount of the denom on the account.
     * </pre>
     *
     * <code>string whitelisted = 2 [json_name = "whitelisted", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWhitelisted() {
      whitelisted_ = getDefaultInstance().getWhitelisted();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * whitelisted is the whitelisted amount of the denom on the account.
     * </pre>
     *
     * <code>string whitelisted = 2 [json_name = "whitelisted", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for whitelisted to set.
     * @return This builder for chaining.
     */
    public Builder setWhitelistedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      whitelisted_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object frozen_ = "";
    /**
     * <pre>
     * frozen is the frozen amount of the denom on the account.
     * </pre>
     *
     * <code>string frozen = 3 [json_name = "frozen", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The frozen.
     */
    public java.lang.String getFrozen() {
      java.lang.Object ref = frozen_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        frozen_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * frozen is the frozen amount of the denom on the account.
     * </pre>
     *
     * <code>string frozen = 3 [json_name = "frozen", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for frozen.
     */
    public com.google.protobuf.ByteString
        getFrozenBytes() {
      java.lang.Object ref = frozen_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        frozen_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * frozen is the frozen amount of the denom on the account.
     * </pre>
     *
     * <code>string frozen = 3 [json_name = "frozen", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The frozen to set.
     * @return This builder for chaining.
     */
    public Builder setFrozen(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      frozen_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * frozen is the frozen amount of the denom on the account.
     * </pre>
     *
     * <code>string frozen = 3 [json_name = "frozen", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFrozen() {
      frozen_ = getDefaultInstance().getFrozen();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * frozen is the frozen amount of the denom on the account.
     * </pre>
     *
     * <code>string frozen = 3 [json_name = "frozen", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for frozen to set.
     * @return This builder for chaining.
     */
    public Builder setFrozenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      frozen_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object locked_ = "";
    /**
     * <pre>
     * locked is the balance locked by vesting.
     * </pre>
     *
     * <code>string locked = 4 [json_name = "locked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The locked.
     */
    public java.lang.String getLocked() {
      java.lang.Object ref = locked_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        locked_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * locked is the balance locked by vesting.
     * </pre>
     *
     * <code>string locked = 4 [json_name = "locked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for locked.
     */
    public com.google.protobuf.ByteString
        getLockedBytes() {
      java.lang.Object ref = locked_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        locked_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * locked is the balance locked by vesting.
     * </pre>
     *
     * <code>string locked = 4 [json_name = "locked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The locked to set.
     * @return This builder for chaining.
     */
    public Builder setLocked(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      locked_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * locked is the balance locked by vesting.
     * </pre>
     *
     * <code>string locked = 4 [json_name = "locked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocked() {
      locked_ = getDefaultInstance().getLocked();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * locked is the balance locked by vesting.
     * </pre>
     *
     * <code>string locked = 4 [json_name = "locked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for locked to set.
     * @return This builder for chaining.
     */
    public Builder setLockedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      locked_ = value;
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


    // @@protoc_insertion_point(builder_scope:coreum.asset.ft.v1.QueryBalanceResponse)
  }

  // @@protoc_insertion_point(class_scope:coreum.asset.ft.v1.QueryBalanceResponse)
  private static final com.coreum.asset.ft.v1.QueryBalanceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.coreum.asset.ft.v1.QueryBalanceResponse();
  }

  public static com.coreum.asset.ft.v1.QueryBalanceResponse getDefaultInstance() {
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
  public com.coreum.asset.ft.v1.QueryBalanceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

