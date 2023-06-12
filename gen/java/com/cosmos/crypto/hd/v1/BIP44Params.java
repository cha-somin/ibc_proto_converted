// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crypto/hd/v1/hd.proto

package com.cosmos.crypto.hd.v1;

/**
 * <pre>
 * BIP44Params is used as path field in ledger item in Record.
 * </pre>
 *
 * Protobuf type {@code cosmos.crypto.hd.v1.BIP44Params}
 */
public final class BIP44Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.crypto.hd.v1.BIP44Params)
    BIP44ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BIP44Params.newBuilder() to construct.
  private BIP44Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BIP44Params() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BIP44Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.crypto.hd.v1.HdProto.internal_static_cosmos_crypto_hd_v1_BIP44Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.crypto.hd.v1.HdProto.internal_static_cosmos_crypto_hd_v1_BIP44Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.crypto.hd.v1.BIP44Params.class, com.cosmos.crypto.hd.v1.BIP44Params.Builder.class);
  }

  public static final int PURPOSE_FIELD_NUMBER = 1;
  private int purpose_ = 0;
  /**
   * <pre>
   * purpose is a constant set to 44' (or 0x8000002C) following the BIP43 recommendation
   * </pre>
   *
   * <code>uint32 purpose = 1 [json_name = "purpose"];</code>
   * @return The purpose.
   */
  @java.lang.Override
  public int getPurpose() {
    return purpose_;
  }

  public static final int COIN_TYPE_FIELD_NUMBER = 2;
  private int coinType_ = 0;
  /**
   * <pre>
   * coin_type is a constant that improves privacy
   * </pre>
   *
   * <code>uint32 coin_type = 2 [json_name = "coinType"];</code>
   * @return The coinType.
   */
  @java.lang.Override
  public int getCoinType() {
    return coinType_;
  }

  public static final int ACCOUNT_FIELD_NUMBER = 3;
  private int account_ = 0;
  /**
   * <pre>
   * account splits the key space into independent user identities
   * </pre>
   *
   * <code>uint32 account = 3 [json_name = "account"];</code>
   * @return The account.
   */
  @java.lang.Override
  public int getAccount() {
    return account_;
  }

  public static final int CHANGE_FIELD_NUMBER = 4;
  private boolean change_ = false;
  /**
   * <pre>
   * change is a constant used for public derivation. Constant 0 is used for external chain and constant 1 for internal
   * chain.
   * </pre>
   *
   * <code>bool change = 4 [json_name = "change"];</code>
   * @return The change.
   */
  @java.lang.Override
  public boolean getChange() {
    return change_;
  }

  public static final int ADDRESS_INDEX_FIELD_NUMBER = 5;
  private int addressIndex_ = 0;
  /**
   * <pre>
   * address_index is used as child index in BIP32 derivation
   * </pre>
   *
   * <code>uint32 address_index = 5 [json_name = "addressIndex"];</code>
   * @return The addressIndex.
   */
  @java.lang.Override
  public int getAddressIndex() {
    return addressIndex_;
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
    if (purpose_ != 0) {
      output.writeUInt32(1, purpose_);
    }
    if (coinType_ != 0) {
      output.writeUInt32(2, coinType_);
    }
    if (account_ != 0) {
      output.writeUInt32(3, account_);
    }
    if (change_ != false) {
      output.writeBool(4, change_);
    }
    if (addressIndex_ != 0) {
      output.writeUInt32(5, addressIndex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (purpose_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, purpose_);
    }
    if (coinType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, coinType_);
    }
    if (account_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, account_);
    }
    if (change_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, change_);
    }
    if (addressIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, addressIndex_);
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
    if (!(obj instanceof com.cosmos.crypto.hd.v1.BIP44Params)) {
      return super.equals(obj);
    }
    com.cosmos.crypto.hd.v1.BIP44Params other = (com.cosmos.crypto.hd.v1.BIP44Params) obj;

    if (getPurpose()
        != other.getPurpose()) return false;
    if (getCoinType()
        != other.getCoinType()) return false;
    if (getAccount()
        != other.getAccount()) return false;
    if (getChange()
        != other.getChange()) return false;
    if (getAddressIndex()
        != other.getAddressIndex()) return false;
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
    hash = (37 * hash) + PURPOSE_FIELD_NUMBER;
    hash = (53 * hash) + getPurpose();
    hash = (37 * hash) + COIN_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getCoinType();
    hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAccount();
    hash = (37 * hash) + CHANGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getChange());
    hash = (37 * hash) + ADDRESS_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getAddressIndex();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.crypto.hd.v1.BIP44Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.crypto.hd.v1.BIP44Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.crypto.hd.v1.BIP44Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.crypto.hd.v1.BIP44Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.crypto.hd.v1.BIP44Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.crypto.hd.v1.BIP44Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.crypto.hd.v1.BIP44Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.crypto.hd.v1.BIP44Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.crypto.hd.v1.BIP44Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.crypto.hd.v1.BIP44Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.crypto.hd.v1.BIP44Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.crypto.hd.v1.BIP44Params parseFrom(
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
  public static Builder newBuilder(com.cosmos.crypto.hd.v1.BIP44Params prototype) {
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
   * BIP44Params is used as path field in ledger item in Record.
   * </pre>
   *
   * Protobuf type {@code cosmos.crypto.hd.v1.BIP44Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.crypto.hd.v1.BIP44Params)
      com.cosmos.crypto.hd.v1.BIP44ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.crypto.hd.v1.HdProto.internal_static_cosmos_crypto_hd_v1_BIP44Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.crypto.hd.v1.HdProto.internal_static_cosmos_crypto_hd_v1_BIP44Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.crypto.hd.v1.BIP44Params.class, com.cosmos.crypto.hd.v1.BIP44Params.Builder.class);
    }

    // Construct using com.cosmos.crypto.hd.v1.BIP44Params.newBuilder()
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
      purpose_ = 0;
      coinType_ = 0;
      account_ = 0;
      change_ = false;
      addressIndex_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.crypto.hd.v1.HdProto.internal_static_cosmos_crypto_hd_v1_BIP44Params_descriptor;
    }

    @java.lang.Override
    public com.cosmos.crypto.hd.v1.BIP44Params getDefaultInstanceForType() {
      return com.cosmos.crypto.hd.v1.BIP44Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.crypto.hd.v1.BIP44Params build() {
      com.cosmos.crypto.hd.v1.BIP44Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.crypto.hd.v1.BIP44Params buildPartial() {
      com.cosmos.crypto.hd.v1.BIP44Params result = new com.cosmos.crypto.hd.v1.BIP44Params(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.crypto.hd.v1.BIP44Params result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.purpose_ = purpose_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.coinType_ = coinType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.account_ = account_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.change_ = change_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.addressIndex_ = addressIndex_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.crypto.hd.v1.BIP44Params) {
        return mergeFrom((com.cosmos.crypto.hd.v1.BIP44Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.crypto.hd.v1.BIP44Params other) {
      if (other == com.cosmos.crypto.hd.v1.BIP44Params.getDefaultInstance()) return this;
      if (other.getPurpose() != 0) {
        setPurpose(other.getPurpose());
      }
      if (other.getCoinType() != 0) {
        setCoinType(other.getCoinType());
      }
      if (other.getAccount() != 0) {
        setAccount(other.getAccount());
      }
      if (other.getChange() != false) {
        setChange(other.getChange());
      }
      if (other.getAddressIndex() != 0) {
        setAddressIndex(other.getAddressIndex());
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
              purpose_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              coinType_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              account_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              change_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              addressIndex_ = input.readUInt32();
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

    private int purpose_ ;
    /**
     * <pre>
     * purpose is a constant set to 44' (or 0x8000002C) following the BIP43 recommendation
     * </pre>
     *
     * <code>uint32 purpose = 1 [json_name = "purpose"];</code>
     * @return The purpose.
     */
    @java.lang.Override
    public int getPurpose() {
      return purpose_;
    }
    /**
     * <pre>
     * purpose is a constant set to 44' (or 0x8000002C) following the BIP43 recommendation
     * </pre>
     *
     * <code>uint32 purpose = 1 [json_name = "purpose"];</code>
     * @param value The purpose to set.
     * @return This builder for chaining.
     */
    public Builder setPurpose(int value) {

      purpose_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * purpose is a constant set to 44' (or 0x8000002C) following the BIP43 recommendation
     * </pre>
     *
     * <code>uint32 purpose = 1 [json_name = "purpose"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPurpose() {
      bitField0_ = (bitField0_ & ~0x00000001);
      purpose_ = 0;
      onChanged();
      return this;
    }

    private int coinType_ ;
    /**
     * <pre>
     * coin_type is a constant that improves privacy
     * </pre>
     *
     * <code>uint32 coin_type = 2 [json_name = "coinType"];</code>
     * @return The coinType.
     */
    @java.lang.Override
    public int getCoinType() {
      return coinType_;
    }
    /**
     * <pre>
     * coin_type is a constant that improves privacy
     * </pre>
     *
     * <code>uint32 coin_type = 2 [json_name = "coinType"];</code>
     * @param value The coinType to set.
     * @return This builder for chaining.
     */
    public Builder setCoinType(int value) {

      coinType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * coin_type is a constant that improves privacy
     * </pre>
     *
     * <code>uint32 coin_type = 2 [json_name = "coinType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCoinType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      coinType_ = 0;
      onChanged();
      return this;
    }

    private int account_ ;
    /**
     * <pre>
     * account splits the key space into independent user identities
     * </pre>
     *
     * <code>uint32 account = 3 [json_name = "account"];</code>
     * @return The account.
     */
    @java.lang.Override
    public int getAccount() {
      return account_;
    }
    /**
     * <pre>
     * account splits the key space into independent user identities
     * </pre>
     *
     * <code>uint32 account = 3 [json_name = "account"];</code>
     * @param value The account to set.
     * @return This builder for chaining.
     */
    public Builder setAccount(int value) {

      account_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * account splits the key space into independent user identities
     * </pre>
     *
     * <code>uint32 account = 3 [json_name = "account"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      account_ = 0;
      onChanged();
      return this;
    }

    private boolean change_ ;
    /**
     * <pre>
     * change is a constant used for public derivation. Constant 0 is used for external chain and constant 1 for internal
     * chain.
     * </pre>
     *
     * <code>bool change = 4 [json_name = "change"];</code>
     * @return The change.
     */
    @java.lang.Override
    public boolean getChange() {
      return change_;
    }
    /**
     * <pre>
     * change is a constant used for public derivation. Constant 0 is used for external chain and constant 1 for internal
     * chain.
     * </pre>
     *
     * <code>bool change = 4 [json_name = "change"];</code>
     * @param value The change to set.
     * @return This builder for chaining.
     */
    public Builder setChange(boolean value) {

      change_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * change is a constant used for public derivation. Constant 0 is used for external chain and constant 1 for internal
     * chain.
     * </pre>
     *
     * <code>bool change = 4 [json_name = "change"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChange() {
      bitField0_ = (bitField0_ & ~0x00000008);
      change_ = false;
      onChanged();
      return this;
    }

    private int addressIndex_ ;
    /**
     * <pre>
     * address_index is used as child index in BIP32 derivation
     * </pre>
     *
     * <code>uint32 address_index = 5 [json_name = "addressIndex"];</code>
     * @return The addressIndex.
     */
    @java.lang.Override
    public int getAddressIndex() {
      return addressIndex_;
    }
    /**
     * <pre>
     * address_index is used as child index in BIP32 derivation
     * </pre>
     *
     * <code>uint32 address_index = 5 [json_name = "addressIndex"];</code>
     * @param value The addressIndex to set.
     * @return This builder for chaining.
     */
    public Builder setAddressIndex(int value) {

      addressIndex_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address_index is used as child index in BIP32 derivation
     * </pre>
     *
     * <code>uint32 address_index = 5 [json_name = "addressIndex"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddressIndex() {
      bitField0_ = (bitField0_ & ~0x00000010);
      addressIndex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:cosmos.crypto.hd.v1.BIP44Params)
  }

  // @@protoc_insertion_point(class_scope:cosmos.crypto.hd.v1.BIP44Params)
  private static final com.cosmos.crypto.hd.v1.BIP44Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.crypto.hd.v1.BIP44Params();
  }

  public static com.cosmos.crypto.hd.v1.BIP44Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BIP44Params>
      PARSER = new com.google.protobuf.AbstractParser<BIP44Params>() {
    @java.lang.Override
    public BIP44Params parsePartialFrom(
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

  public static com.google.protobuf.Parser<BIP44Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BIP44Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.crypto.hd.v1.BIP44Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

