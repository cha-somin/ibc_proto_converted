// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/leverage/v1/tx.proto

package com.umee.leverage.v1;

/**
 * <pre>
 * MsgSupplyCollateral represents a user's request to supply and collateralize assets to the module.
 * </pre>
 *
 * Protobuf type {@code umee.leverage.v1.MsgSupplyCollateral}
 */
public final class MsgSupplyCollateral extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:umee.leverage.v1.MsgSupplyCollateral)
    MsgSupplyCollateralOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSupplyCollateral.newBuilder() to construct.
  private MsgSupplyCollateral(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSupplyCollateral() {
    supplier_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSupplyCollateral();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umee.leverage.v1.TxProto.internal_static_umee_leverage_v1_MsgSupplyCollateral_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umee.leverage.v1.TxProto.internal_static_umee_leverage_v1_MsgSupplyCollateral_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umee.leverage.v1.MsgSupplyCollateral.class, com.umee.leverage.v1.MsgSupplyCollateral.Builder.class);
  }

  public static final int SUPPLIER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object supplier_ = "";
  /**
   * <pre>
   * Supplier is the account address supplying assets and the signer of the message.
   * </pre>
   *
   * <code>string supplier = 1 [json_name = "supplier"];</code>
   * @return The supplier.
   */
  @java.lang.Override
  public java.lang.String getSupplier() {
    java.lang.Object ref = supplier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      supplier_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Supplier is the account address supplying assets and the signer of the message.
   * </pre>
   *
   * <code>string supplier = 1 [json_name = "supplier"];</code>
   * @return The bytes for supplier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSupplierBytes() {
    java.lang.Object ref = supplier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      supplier_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(supplier_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, supplier_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(supplier_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, supplier_);
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
    if (!(obj instanceof com.umee.leverage.v1.MsgSupplyCollateral)) {
      return super.equals(obj);
    }
    com.umee.leverage.v1.MsgSupplyCollateral other = (com.umee.leverage.v1.MsgSupplyCollateral) obj;

    if (!getSupplier()
        .equals(other.getSupplier())) return false;
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
    hash = (37 * hash) + SUPPLIER_FIELD_NUMBER;
    hash = (53 * hash) + getSupplier().hashCode();
    if (hasAsset()) {
      hash = (37 * hash) + ASSET_FIELD_NUMBER;
      hash = (53 * hash) + getAsset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umee.leverage.v1.MsgSupplyCollateral parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.MsgSupplyCollateral parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.MsgSupplyCollateral parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.MsgSupplyCollateral parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.MsgSupplyCollateral parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.leverage.v1.MsgSupplyCollateral parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.leverage.v1.MsgSupplyCollateral parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.leverage.v1.MsgSupplyCollateral parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umee.leverage.v1.MsgSupplyCollateral parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umee.leverage.v1.MsgSupplyCollateral parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umee.leverage.v1.MsgSupplyCollateral parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.leverage.v1.MsgSupplyCollateral parseFrom(
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
  public static Builder newBuilder(com.umee.leverage.v1.MsgSupplyCollateral prototype) {
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
   * MsgSupplyCollateral represents a user's request to supply and collateralize assets to the module.
   * </pre>
   *
   * Protobuf type {@code umee.leverage.v1.MsgSupplyCollateral}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:umee.leverage.v1.MsgSupplyCollateral)
      com.umee.leverage.v1.MsgSupplyCollateralOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umee.leverage.v1.TxProto.internal_static_umee_leverage_v1_MsgSupplyCollateral_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umee.leverage.v1.TxProto.internal_static_umee_leverage_v1_MsgSupplyCollateral_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umee.leverage.v1.MsgSupplyCollateral.class, com.umee.leverage.v1.MsgSupplyCollateral.Builder.class);
    }

    // Construct using com.umee.leverage.v1.MsgSupplyCollateral.newBuilder()
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
      supplier_ = "";
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
      return com.umee.leverage.v1.TxProto.internal_static_umee_leverage_v1_MsgSupplyCollateral_descriptor;
    }

    @java.lang.Override
    public com.umee.leverage.v1.MsgSupplyCollateral getDefaultInstanceForType() {
      return com.umee.leverage.v1.MsgSupplyCollateral.getDefaultInstance();
    }

    @java.lang.Override
    public com.umee.leverage.v1.MsgSupplyCollateral build() {
      com.umee.leverage.v1.MsgSupplyCollateral result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umee.leverage.v1.MsgSupplyCollateral buildPartial() {
      com.umee.leverage.v1.MsgSupplyCollateral result = new com.umee.leverage.v1.MsgSupplyCollateral(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.umee.leverage.v1.MsgSupplyCollateral result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.supplier_ = supplier_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.asset_ = assetBuilder_ == null
            ? asset_
            : assetBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umee.leverage.v1.MsgSupplyCollateral) {
        return mergeFrom((com.umee.leverage.v1.MsgSupplyCollateral)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umee.leverage.v1.MsgSupplyCollateral other) {
      if (other == com.umee.leverage.v1.MsgSupplyCollateral.getDefaultInstance()) return this;
      if (!other.getSupplier().isEmpty()) {
        supplier_ = other.supplier_;
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
              supplier_ = input.readStringRequireUtf8();
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

    private java.lang.Object supplier_ = "";
    /**
     * <pre>
     * Supplier is the account address supplying assets and the signer of the message.
     * </pre>
     *
     * <code>string supplier = 1 [json_name = "supplier"];</code>
     * @return The supplier.
     */
    public java.lang.String getSupplier() {
      java.lang.Object ref = supplier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        supplier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Supplier is the account address supplying assets and the signer of the message.
     * </pre>
     *
     * <code>string supplier = 1 [json_name = "supplier"];</code>
     * @return The bytes for supplier.
     */
    public com.google.protobuf.ByteString
        getSupplierBytes() {
      java.lang.Object ref = supplier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        supplier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Supplier is the account address supplying assets and the signer of the message.
     * </pre>
     *
     * <code>string supplier = 1 [json_name = "supplier"];</code>
     * @param value The supplier to set.
     * @return This builder for chaining.
     */
    public Builder setSupplier(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      supplier_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supplier is the account address supplying assets and the signer of the message.
     * </pre>
     *
     * <code>string supplier = 1 [json_name = "supplier"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSupplier() {
      supplier_ = getDefaultInstance().getSupplier();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supplier is the account address supplying assets and the signer of the message.
     * </pre>
     *
     * <code>string supplier = 1 [json_name = "supplier"];</code>
     * @param value The bytes for supplier to set.
     * @return This builder for chaining.
     */
    public Builder setSupplierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      supplier_ = value;
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


    // @@protoc_insertion_point(builder_scope:umee.leverage.v1.MsgSupplyCollateral)
  }

  // @@protoc_insertion_point(class_scope:umee.leverage.v1.MsgSupplyCollateral)
  private static final com.umee.leverage.v1.MsgSupplyCollateral DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umee.leverage.v1.MsgSupplyCollateral();
  }

  public static com.umee.leverage.v1.MsgSupplyCollateral getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSupplyCollateral>
      PARSER = new com.google.protobuf.AbstractParser<MsgSupplyCollateral>() {
    @java.lang.Override
    public MsgSupplyCollateral parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSupplyCollateral> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSupplyCollateral> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umee.leverage.v1.MsgSupplyCollateral getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

