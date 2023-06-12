// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/vault.proto

package com.comdex.vault.v1beta1;

/**
 * Protobuf type {@code comdex.vault.v1beta1.PairStatisticData}
 */
public final class PairStatisticData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.vault.v1beta1.PairStatisticData)
    PairStatisticDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PairStatisticData.newBuilder() to construct.
  private PairStatisticData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PairStatisticData() {
    assetInDenom_ = "";
    assetOutDenom_ = "";
    collateralAmount_ = "";
    mintedAmount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PairStatisticData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.vault.v1beta1.VaultProto.internal_static_comdex_vault_v1beta1_PairStatisticData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.vault.v1beta1.VaultProto.internal_static_comdex_vault_v1beta1_PairStatisticData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.vault.v1beta1.PairStatisticData.class, com.comdex.vault.v1beta1.PairStatisticData.Builder.class);
  }

  public static final int ASSET_IN_DENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object assetInDenom_ = "";
  /**
   * <code>string asset_in_denom = 1 [json_name = "assetInDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_in_denom&#92;""];</code>
   * @return The assetInDenom.
   */
  @java.lang.Override
  public java.lang.String getAssetInDenom() {
    java.lang.Object ref = assetInDenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetInDenom_ = s;
      return s;
    }
  }
  /**
   * <code>string asset_in_denom = 1 [json_name = "assetInDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_in_denom&#92;""];</code>
   * @return The bytes for assetInDenom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetInDenomBytes() {
    java.lang.Object ref = assetInDenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetInDenom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_OUT_DENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object assetOutDenom_ = "";
  /**
   * <code>string asset_out_denom = 2 [json_name = "assetOutDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_out_denom&#92;""];</code>
   * @return The assetOutDenom.
   */
  @java.lang.Override
  public java.lang.String getAssetOutDenom() {
    java.lang.Object ref = assetOutDenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetOutDenom_ = s;
      return s;
    }
  }
  /**
   * <code>string asset_out_denom = 2 [json_name = "assetOutDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_out_denom&#92;""];</code>
   * @return The bytes for assetOutDenom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetOutDenomBytes() {
    java.lang.Object ref = assetOutDenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetOutDenom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLLATERAL_AMOUNT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object collateralAmount_ = "";
  /**
   * <code>string collateral_amount = 3 [json_name = "collateralAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_amount&#92;""];</code>
   * @return The collateralAmount.
   */
  @java.lang.Override
  public java.lang.String getCollateralAmount() {
    java.lang.Object ref = collateralAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collateralAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string collateral_amount = 3 [json_name = "collateralAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_amount&#92;""];</code>
   * @return The bytes for collateralAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCollateralAmountBytes() {
    java.lang.Object ref = collateralAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      collateralAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MINTED_AMOUNT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object mintedAmount_ = "";
  /**
   * <code>string minted_amount = 4 [json_name = "mintedAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"minted_amount&#92;""];</code>
   * @return The mintedAmount.
   */
  @java.lang.Override
  public java.lang.String getMintedAmount() {
    java.lang.Object ref = mintedAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mintedAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string minted_amount = 4 [json_name = "mintedAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"minted_amount&#92;""];</code>
   * @return The bytes for mintedAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMintedAmountBytes() {
    java.lang.Object ref = mintedAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mintedAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTENDED_PAIR_VAULT_ID_FIELD_NUMBER = 5;
  private long extendedPairVaultId_ = 0L;
  /**
   * <code>uint64 extended_pair_vault_id = 5 [json_name = "extendedPairVaultId", (.gogoproto.customname) = "ExtendedPairVaultID", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_vault_id&#92;""];</code>
   * @return The extendedPairVaultId.
   */
  @java.lang.Override
  public long getExtendedPairVaultId() {
    return extendedPairVaultId_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetInDenom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, assetInDenom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetOutDenom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, assetOutDenom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collateralAmount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, collateralAmount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mintedAmount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, mintedAmount_);
    }
    if (extendedPairVaultId_ != 0L) {
      output.writeUInt64(5, extendedPairVaultId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetInDenom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, assetInDenom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetOutDenom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, assetOutDenom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collateralAmount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, collateralAmount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mintedAmount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, mintedAmount_);
    }
    if (extendedPairVaultId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, extendedPairVaultId_);
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
    if (!(obj instanceof com.comdex.vault.v1beta1.PairStatisticData)) {
      return super.equals(obj);
    }
    com.comdex.vault.v1beta1.PairStatisticData other = (com.comdex.vault.v1beta1.PairStatisticData) obj;

    if (!getAssetInDenom()
        .equals(other.getAssetInDenom())) return false;
    if (!getAssetOutDenom()
        .equals(other.getAssetOutDenom())) return false;
    if (!getCollateralAmount()
        .equals(other.getCollateralAmount())) return false;
    if (!getMintedAmount()
        .equals(other.getMintedAmount())) return false;
    if (getExtendedPairVaultId()
        != other.getExtendedPairVaultId()) return false;
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
    hash = (37 * hash) + ASSET_IN_DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getAssetInDenom().hashCode();
    hash = (37 * hash) + ASSET_OUT_DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getAssetOutDenom().hashCode();
    hash = (37 * hash) + COLLATERAL_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCollateralAmount().hashCode();
    hash = (37 * hash) + MINTED_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMintedAmount().hashCode();
    hash = (37 * hash) + EXTENDED_PAIR_VAULT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExtendedPairVaultId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.vault.v1beta1.PairStatisticData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.PairStatisticData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.PairStatisticData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.PairStatisticData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.PairStatisticData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.PairStatisticData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.PairStatisticData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.vault.v1beta1.PairStatisticData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.vault.v1beta1.PairStatisticData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.vault.v1beta1.PairStatisticData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.PairStatisticData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.vault.v1beta1.PairStatisticData parseFrom(
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
  public static Builder newBuilder(com.comdex.vault.v1beta1.PairStatisticData prototype) {
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
   * Protobuf type {@code comdex.vault.v1beta1.PairStatisticData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.vault.v1beta1.PairStatisticData)
      com.comdex.vault.v1beta1.PairStatisticDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.vault.v1beta1.VaultProto.internal_static_comdex_vault_v1beta1_PairStatisticData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.vault.v1beta1.VaultProto.internal_static_comdex_vault_v1beta1_PairStatisticData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.vault.v1beta1.PairStatisticData.class, com.comdex.vault.v1beta1.PairStatisticData.Builder.class);
    }

    // Construct using com.comdex.vault.v1beta1.PairStatisticData.newBuilder()
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
      assetInDenom_ = "";
      assetOutDenom_ = "";
      collateralAmount_ = "";
      mintedAmount_ = "";
      extendedPairVaultId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.vault.v1beta1.VaultProto.internal_static_comdex_vault_v1beta1_PairStatisticData_descriptor;
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.PairStatisticData getDefaultInstanceForType() {
      return com.comdex.vault.v1beta1.PairStatisticData.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.PairStatisticData build() {
      com.comdex.vault.v1beta1.PairStatisticData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.PairStatisticData buildPartial() {
      com.comdex.vault.v1beta1.PairStatisticData result = new com.comdex.vault.v1beta1.PairStatisticData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.vault.v1beta1.PairStatisticData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.assetInDenom_ = assetInDenom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assetOutDenom_ = assetOutDenom_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.collateralAmount_ = collateralAmount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.mintedAmount_ = mintedAmount_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.extendedPairVaultId_ = extendedPairVaultId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.vault.v1beta1.PairStatisticData) {
        return mergeFrom((com.comdex.vault.v1beta1.PairStatisticData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.vault.v1beta1.PairStatisticData other) {
      if (other == com.comdex.vault.v1beta1.PairStatisticData.getDefaultInstance()) return this;
      if (!other.getAssetInDenom().isEmpty()) {
        assetInDenom_ = other.assetInDenom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAssetOutDenom().isEmpty()) {
        assetOutDenom_ = other.assetOutDenom_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCollateralAmount().isEmpty()) {
        collateralAmount_ = other.collateralAmount_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getMintedAmount().isEmpty()) {
        mintedAmount_ = other.mintedAmount_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getExtendedPairVaultId() != 0L) {
        setExtendedPairVaultId(other.getExtendedPairVaultId());
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
              assetInDenom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              assetOutDenom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              collateralAmount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              mintedAmount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              extendedPairVaultId_ = input.readUInt64();
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

    private java.lang.Object assetInDenom_ = "";
    /**
     * <code>string asset_in_denom = 1 [json_name = "assetInDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_in_denom&#92;""];</code>
     * @return The assetInDenom.
     */
    public java.lang.String getAssetInDenom() {
      java.lang.Object ref = assetInDenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetInDenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string asset_in_denom = 1 [json_name = "assetInDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_in_denom&#92;""];</code>
     * @return The bytes for assetInDenom.
     */
    public com.google.protobuf.ByteString
        getAssetInDenomBytes() {
      java.lang.Object ref = assetInDenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetInDenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string asset_in_denom = 1 [json_name = "assetInDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_in_denom&#92;""];</code>
     * @param value The assetInDenom to set.
     * @return This builder for chaining.
     */
    public Builder setAssetInDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      assetInDenom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string asset_in_denom = 1 [json_name = "assetInDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_in_denom&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetInDenom() {
      assetInDenom_ = getDefaultInstance().getAssetInDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string asset_in_denom = 1 [json_name = "assetInDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_in_denom&#92;""];</code>
     * @param value The bytes for assetInDenom to set.
     * @return This builder for chaining.
     */
    public Builder setAssetInDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      assetInDenom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object assetOutDenom_ = "";
    /**
     * <code>string asset_out_denom = 2 [json_name = "assetOutDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_out_denom&#92;""];</code>
     * @return The assetOutDenom.
     */
    public java.lang.String getAssetOutDenom() {
      java.lang.Object ref = assetOutDenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetOutDenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string asset_out_denom = 2 [json_name = "assetOutDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_out_denom&#92;""];</code>
     * @return The bytes for assetOutDenom.
     */
    public com.google.protobuf.ByteString
        getAssetOutDenomBytes() {
      java.lang.Object ref = assetOutDenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetOutDenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string asset_out_denom = 2 [json_name = "assetOutDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_out_denom&#92;""];</code>
     * @param value The assetOutDenom to set.
     * @return This builder for chaining.
     */
    public Builder setAssetOutDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      assetOutDenom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string asset_out_denom = 2 [json_name = "assetOutDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_out_denom&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetOutDenom() {
      assetOutDenom_ = getDefaultInstance().getAssetOutDenom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string asset_out_denom = 2 [json_name = "assetOutDenom", (.gogoproto.moretags) = "yaml:&#92;"asset_out_denom&#92;""];</code>
     * @param value The bytes for assetOutDenom to set.
     * @return This builder for chaining.
     */
    public Builder setAssetOutDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      assetOutDenom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object collateralAmount_ = "";
    /**
     * <code>string collateral_amount = 3 [json_name = "collateralAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_amount&#92;""];</code>
     * @return The collateralAmount.
     */
    public java.lang.String getCollateralAmount() {
      java.lang.Object ref = collateralAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collateralAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string collateral_amount = 3 [json_name = "collateralAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_amount&#92;""];</code>
     * @return The bytes for collateralAmount.
     */
    public com.google.protobuf.ByteString
        getCollateralAmountBytes() {
      java.lang.Object ref = collateralAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        collateralAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string collateral_amount = 3 [json_name = "collateralAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_amount&#92;""];</code>
     * @param value The collateralAmount to set.
     * @return This builder for chaining.
     */
    public Builder setCollateralAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      collateralAmount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string collateral_amount = 3 [json_name = "collateralAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_amount&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearCollateralAmount() {
      collateralAmount_ = getDefaultInstance().getCollateralAmount();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string collateral_amount = 3 [json_name = "collateralAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_amount&#92;""];</code>
     * @param value The bytes for collateralAmount to set.
     * @return This builder for chaining.
     */
    public Builder setCollateralAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      collateralAmount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object mintedAmount_ = "";
    /**
     * <code>string minted_amount = 4 [json_name = "mintedAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"minted_amount&#92;""];</code>
     * @return The mintedAmount.
     */
    public java.lang.String getMintedAmount() {
      java.lang.Object ref = mintedAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mintedAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string minted_amount = 4 [json_name = "mintedAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"minted_amount&#92;""];</code>
     * @return The bytes for mintedAmount.
     */
    public com.google.protobuf.ByteString
        getMintedAmountBytes() {
      java.lang.Object ref = mintedAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mintedAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string minted_amount = 4 [json_name = "mintedAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"minted_amount&#92;""];</code>
     * @param value The mintedAmount to set.
     * @return This builder for chaining.
     */
    public Builder setMintedAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      mintedAmount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string minted_amount = 4 [json_name = "mintedAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"minted_amount&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearMintedAmount() {
      mintedAmount_ = getDefaultInstance().getMintedAmount();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string minted_amount = 4 [json_name = "mintedAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"minted_amount&#92;""];</code>
     * @param value The bytes for mintedAmount to set.
     * @return This builder for chaining.
     */
    public Builder setMintedAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      mintedAmount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long extendedPairVaultId_ ;
    /**
     * <code>uint64 extended_pair_vault_id = 5 [json_name = "extendedPairVaultId", (.gogoproto.customname) = "ExtendedPairVaultID", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_vault_id&#92;""];</code>
     * @return The extendedPairVaultId.
     */
    @java.lang.Override
    public long getExtendedPairVaultId() {
      return extendedPairVaultId_;
    }
    /**
     * <code>uint64 extended_pair_vault_id = 5 [json_name = "extendedPairVaultId", (.gogoproto.customname) = "ExtendedPairVaultID", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_vault_id&#92;""];</code>
     * @param value The extendedPairVaultId to set.
     * @return This builder for chaining.
     */
    public Builder setExtendedPairVaultId(long value) {

      extendedPairVaultId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 extended_pair_vault_id = 5 [json_name = "extendedPairVaultId", (.gogoproto.customname) = "ExtendedPairVaultID", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_vault_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearExtendedPairVaultId() {
      bitField0_ = (bitField0_ & ~0x00000010);
      extendedPairVaultId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:comdex.vault.v1beta1.PairStatisticData)
  }

  // @@protoc_insertion_point(class_scope:comdex.vault.v1beta1.PairStatisticData)
  private static final com.comdex.vault.v1beta1.PairStatisticData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.vault.v1beta1.PairStatisticData();
  }

  public static com.comdex.vault.v1beta1.PairStatisticData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PairStatisticData>
      PARSER = new com.google.protobuf.AbstractParser<PairStatisticData>() {
    @java.lang.Override
    public PairStatisticData parsePartialFrom(
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

  public static com.google.protobuf.Parser<PairStatisticData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PairStatisticData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.vault.v1beta1.PairStatisticData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

