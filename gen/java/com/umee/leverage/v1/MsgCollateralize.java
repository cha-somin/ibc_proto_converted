// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/leverage/v1/tx.proto

package com.umee.leverage.v1;

/**
 * <pre>
 * MsgCollateralize represents a user's request to enable selected
 * uTokens as collateral.
 * </pre>
 *
 * Protobuf type {@code umee.leverage.v1.MsgCollateralize}
 */
public final class MsgCollateralize extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:umee.leverage.v1.MsgCollateralize)
    MsgCollateralizeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCollateralize.newBuilder() to construct.
  private MsgCollateralize(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCollateralize() {
    borrower_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCollateralize();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umee.leverage.v1.TxProto.internal_static_umee_leverage_v1_MsgCollateralize_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umee.leverage.v1.TxProto.internal_static_umee_leverage_v1_MsgCollateralize_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umee.leverage.v1.MsgCollateralize.class, com.umee.leverage.v1.MsgCollateralize.Builder.class);
  }

  public static final int BORROWER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object borrower_ = "";
  /**
   * <pre>
   * Borrower is the account address adding collateral and the signer of the message.
   * </pre>
   *
   * <code>string borrower = 1 [json_name = "borrower"];</code>
   * @return The borrower.
   */
  @java.lang.Override
  public java.lang.String getBorrower() {
    java.lang.Object ref = borrower_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      borrower_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Borrower is the account address adding collateral and the signer of the message.
   * </pre>
   *
   * <code>string borrower = 1 [json_name = "borrower"];</code>
   * @return The bytes for borrower.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBorrowerBytes() {
    java.lang.Object ref = borrower_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      borrower_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_FIELD_NUMBER = 2;
  private com.cosmos.base.v1beta1.Coin asset_;
  /**
   * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
   * @return Whether the asset field is set.
   */
  @java.lang.Override
  public boolean hasAsset() {
    return asset_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
   * @return The asset.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAsset() {
    return asset_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : asset_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAssetOrBuilder() {
    return asset_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : asset_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(borrower_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, borrower_);
    }
    if (asset_ != null) {
      output.writeMessage(2, getAsset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(borrower_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, borrower_);
    }
    if (asset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAsset());
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
    if (!(obj instanceof com.umee.leverage.v1.MsgCollateralize)) {
      return super.equals(obj);
    }
    com.umee.leverage.v1.MsgCollateralize other = (com.umee.leverage.v1.MsgCollateralize) obj;

    if (!getBorrower()
        .equals(other.getBorrower())) return false;
    if (hasAsset() != other.hasAsset()) return false;
    if (hasAsset()) {
      if (!getAsset()
          .equals(other.getAsset())) return false;
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
    hash = (37 * hash) + BORROWER_FIELD_NUMBER;
    hash = (53 * hash) + getBorrower().hashCode();
    if (hasAsset()) {
      hash = (37 * hash) + ASSET_FIELD_NUMBER;
      hash = (53 * hash) + getAsset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umee.leverage.v1.MsgCollateralize parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.MsgCollateralize parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.MsgCollateralize parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.MsgCollateralize parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.MsgCollateralize parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.MsgCollateralize parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.MsgCollateralize parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.leverage.v1.MsgCollateralize parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umee.leverage.v1.MsgCollateralize parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umee.leverage.v1.MsgCollateralize parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umee.leverage.v1.MsgCollateralize parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.leverage.v1.MsgCollateralize parseFrom(
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
  public static Builder newBuilder(com.umee.leverage.v1.MsgCollateralize prototype) {
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
   * MsgCollateralize represents a user's request to enable selected
   * uTokens as collateral.
   * </pre>
   *
   * Protobuf type {@code umee.leverage.v1.MsgCollateralize}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:umee.leverage.v1.MsgCollateralize)
      com.umee.leverage.v1.MsgCollateralizeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umee.leverage.v1.TxProto.internal_static_umee_leverage_v1_MsgCollateralize_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umee.leverage.v1.TxProto.internal_static_umee_leverage_v1_MsgCollateralize_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umee.leverage.v1.MsgCollateralize.class, com.umee.leverage.v1.MsgCollateralize.Builder.class);
    }

    // Construct using com.umee.leverage.v1.MsgCollateralize.newBuilder()
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
      borrower_ = "";
      asset_ = null;
      if (assetBuilder_ != null) {
        assetBuilder_.dispose();
        assetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.umee.leverage.v1.TxProto.internal_static_umee_leverage_v1_MsgCollateralize_descriptor;
    }

    @java.lang.Override
    public com.umee.leverage.v1.MsgCollateralize getDefaultInstanceForType() {
      return com.umee.leverage.v1.MsgCollateralize.getDefaultInstance();
    }

    @java.lang.Override
    public com.umee.leverage.v1.MsgCollateralize build() {
      com.umee.leverage.v1.MsgCollateralize result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umee.leverage.v1.MsgCollateralize buildPartial() {
      com.umee.leverage.v1.MsgCollateralize result = new com.umee.leverage.v1.MsgCollateralize(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.umee.leverage.v1.MsgCollateralize result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.borrower_ = borrower_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.asset_ = assetBuilder_ == null
            ? asset_
            : assetBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umee.leverage.v1.MsgCollateralize) {
        return mergeFrom((com.umee.leverage.v1.MsgCollateralize)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umee.leverage.v1.MsgCollateralize other) {
      if (other == com.umee.leverage.v1.MsgCollateralize.getDefaultInstance()) return this;
      if (!other.getBorrower().isEmpty()) {
        borrower_ = other.borrower_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAsset()) {
        mergeAsset(other.getAsset());
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
              borrower_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAssetFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object borrower_ = "";
    /**
     * <pre>
     * Borrower is the account address adding collateral and the signer of the message.
     * </pre>
     *
     * <code>string borrower = 1 [json_name = "borrower"];</code>
     * @return The borrower.
     */
    public java.lang.String getBorrower() {
      java.lang.Object ref = borrower_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        borrower_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Borrower is the account address adding collateral and the signer of the message.
     * </pre>
     *
     * <code>string borrower = 1 [json_name = "borrower"];</code>
     * @return The bytes for borrower.
     */
    public com.google.protobuf.ByteString
        getBorrowerBytes() {
      java.lang.Object ref = borrower_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        borrower_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Borrower is the account address adding collateral and the signer of the message.
     * </pre>
     *
     * <code>string borrower = 1 [json_name = "borrower"];</code>
     * @param value The borrower to set.
     * @return This builder for chaining.
     */
    public Builder setBorrower(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      borrower_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Borrower is the account address adding collateral and the signer of the message.
     * </pre>
     *
     * <code>string borrower = 1 [json_name = "borrower"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBorrower() {
      borrower_ = getDefaultInstance().getBorrower();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Borrower is the account address adding collateral and the signer of the message.
     * </pre>
     *
     * <code>string borrower = 1 [json_name = "borrower"];</code>
     * @param value The bytes for borrower to set.
     * @return This builder for chaining.
     */
    public Builder setBorrowerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      borrower_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin asset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> assetBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
     * @return Whether the asset field is set.
     */
    public boolean hasAsset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
     * @return The asset.
     */
    public com.cosmos.base.v1beta1.Coin getAsset() {
      if (assetBuilder_ == null) {
        return asset_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : asset_;
      } else {
        return assetBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAsset(com.cosmos.base.v1beta1.Coin value) {
      if (assetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        asset_ = value;
      } else {
        assetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAsset(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (assetBuilder_ == null) {
        asset_ = builderForValue.build();
      } else {
        assetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeAsset(com.cosmos.base.v1beta1.Coin value) {
      if (assetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          asset_ != null &&
          asset_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getAssetBuilder().mergeFrom(value);
        } else {
          asset_ = value;
        }
      } else {
        assetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearAsset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      asset_ = null;
      if (assetBuilder_ != null) {
        assetBuilder_.dispose();
        assetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAssetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAssetFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getAssetOrBuilder() {
      if (assetBuilder_ != null) {
        return assetBuilder_.getMessageOrBuilder();
      } else {
        return asset_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : asset_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin asset = 2 [json_name = "asset", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getAssetFieldBuilder() {
      if (assetBuilder_ == null) {
        assetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getAsset(),
                getParentForChildren(),
                isClean());
        asset_ = null;
      }
      return assetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:umee.leverage.v1.MsgCollateralize)
  }

  // @@protoc_insertion_point(class_scope:umee.leverage.v1.MsgCollateralize)
  private static final com.umee.leverage.v1.MsgCollateralize DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umee.leverage.v1.MsgCollateralize();
  }

  public static com.umee.leverage.v1.MsgCollateralize getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCollateralize>
      PARSER = new com.google.protobuf.AbstractParser<MsgCollateralize>() {
    @java.lang.Override
    public MsgCollateralize parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCollateralize> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCollateralize> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umee.leverage.v1.MsgCollateralize getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

