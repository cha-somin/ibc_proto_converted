// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/query.proto

package com.axelar.evm.v1beta1;

/**
 * Protobuf type {@code axelar.evm.v1beta1.TokenInfoRequest}
 */
public final class TokenInfoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.evm.v1beta1.TokenInfoRequest)
    TokenInfoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TokenInfoRequest.newBuilder() to construct.
  private TokenInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TokenInfoRequest() {
    chain_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TokenInfoRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.evm.v1beta1.QueryProto.internal_static_axelar_evm_v1beta1_TokenInfoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.evm.v1beta1.QueryProto.internal_static_axelar_evm_v1beta1_TokenInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.evm.v1beta1.TokenInfoRequest.class, com.axelar.evm.v1beta1.TokenInfoRequest.Builder.class);
  }

  private int findByCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object findBy_;
  public enum FindByCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ASSET(2),
    SYMBOL(3),
    ADDRESS(4),
    FINDBY_NOT_SET(0);
    private final int value;
    private FindByCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FindByCase valueOf(int value) {
      return forNumber(value);
    }

    public static FindByCase forNumber(int value) {
      switch (value) {
        case 2: return ASSET;
        case 3: return SYMBOL;
        case 4: return ADDRESS;
        case 0: return FINDBY_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FindByCase
  getFindByCase() {
    return FindByCase.forNumber(
        findByCase_);
  }

  public static final int CHAIN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object chain_ = "";
  /**
   * <code>string chain = 1 [json_name = "chain"];</code>
   * @return The chain.
   */
  @java.lang.Override
  public java.lang.String getChain() {
    java.lang.Object ref = chain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chain_ = s;
      return s;
    }
  }
  /**
   * <code>string chain = 1 [json_name = "chain"];</code>
   * @return The bytes for chain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChainBytes() {
    java.lang.Object ref = chain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_FIELD_NUMBER = 2;
  /**
   * <code>string asset = 2 [json_name = "asset"];</code>
   * @return Whether the asset field is set.
   */
  public boolean hasAsset() {
    return findByCase_ == 2;
  }
  /**
   * <code>string asset = 2 [json_name = "asset"];</code>
   * @return The asset.
   */
  public java.lang.String getAsset() {
    java.lang.Object ref = "";
    if (findByCase_ == 2) {
      ref = findBy_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (findByCase_ == 2) {
        findBy_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string asset = 2 [json_name = "asset"];</code>
   * @return The bytes for asset.
   */
  public com.google.protobuf.ByteString
      getAssetBytes() {
    java.lang.Object ref = "";
    if (findByCase_ == 2) {
      ref = findBy_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (findByCase_ == 2) {
        findBy_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SYMBOL_FIELD_NUMBER = 3;
  /**
   * <code>string symbol = 3 [json_name = "symbol"];</code>
   * @return Whether the symbol field is set.
   */
  public boolean hasSymbol() {
    return findByCase_ == 3;
  }
  /**
   * <code>string symbol = 3 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  public java.lang.String getSymbol() {
    java.lang.Object ref = "";
    if (findByCase_ == 3) {
      ref = findBy_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (findByCase_ == 3) {
        findBy_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string symbol = 3 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  public com.google.protobuf.ByteString
      getSymbolBytes() {
    java.lang.Object ref = "";
    if (findByCase_ == 3) {
      ref = findBy_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (findByCase_ == 3) {
        findBy_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESS_FIELD_NUMBER = 4;
  /**
   * <code>string address = 4 [json_name = "address"];</code>
   * @return Whether the address field is set.
   */
  public boolean hasAddress() {
    return findByCase_ == 4;
  }
  /**
   * <code>string address = 4 [json_name = "address"];</code>
   * @return The address.
   */
  public java.lang.String getAddress() {
    java.lang.Object ref = "";
    if (findByCase_ == 4) {
      ref = findBy_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (findByCase_ == 4) {
        findBy_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string address = 4 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = "";
    if (findByCase_ == 4) {
      ref = findBy_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (findByCase_ == 4) {
        findBy_ = b;
      }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, chain_);
    }
    if (findByCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, findBy_);
    }
    if (findByCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, findBy_);
    }
    if (findByCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, findBy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, chain_);
    }
    if (findByCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, findBy_);
    }
    if (findByCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, findBy_);
    }
    if (findByCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, findBy_);
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
    if (!(obj instanceof com.axelar.evm.v1beta1.TokenInfoRequest)) {
      return super.equals(obj);
    }
    com.axelar.evm.v1beta1.TokenInfoRequest other = (com.axelar.evm.v1beta1.TokenInfoRequest) obj;

    if (!getChain()
        .equals(other.getChain())) return false;
    if (!getFindByCase().equals(other.getFindByCase())) return false;
    switch (findByCase_) {
      case 2:
        if (!getAsset()
            .equals(other.getAsset())) return false;
        break;
      case 3:
        if (!getSymbol()
            .equals(other.getSymbol())) return false;
        break;
      case 4:
        if (!getAddress()
            .equals(other.getAddress())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + CHAIN_FIELD_NUMBER;
    hash = (53 * hash) + getChain().hashCode();
    switch (findByCase_) {
      case 2:
        hash = (37 * hash) + ASSET_FIELD_NUMBER;
        hash = (53 * hash) + getAsset().hashCode();
        break;
      case 3:
        hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
        hash = (53 * hash) + getSymbol().hashCode();
        break;
      case 4:
        hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
        hash = (53 * hash) + getAddress().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.evm.v1beta1.TokenInfoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.TokenInfoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.TokenInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.TokenInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.TokenInfoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.TokenInfoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.TokenInfoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.TokenInfoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.evm.v1beta1.TokenInfoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.evm.v1beta1.TokenInfoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.TokenInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.TokenInfoRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.evm.v1beta1.TokenInfoRequest prototype) {
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
   * Protobuf type {@code axelar.evm.v1beta1.TokenInfoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.evm.v1beta1.TokenInfoRequest)
      com.axelar.evm.v1beta1.TokenInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.evm.v1beta1.QueryProto.internal_static_axelar_evm_v1beta1_TokenInfoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.evm.v1beta1.QueryProto.internal_static_axelar_evm_v1beta1_TokenInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.evm.v1beta1.TokenInfoRequest.class, com.axelar.evm.v1beta1.TokenInfoRequest.Builder.class);
    }

    // Construct using com.axelar.evm.v1beta1.TokenInfoRequest.newBuilder()
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
      chain_ = "";
      findByCase_ = 0;
      findBy_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.evm.v1beta1.QueryProto.internal_static_axelar_evm_v1beta1_TokenInfoRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.TokenInfoRequest getDefaultInstanceForType() {
      return com.axelar.evm.v1beta1.TokenInfoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.TokenInfoRequest build() {
      com.axelar.evm.v1beta1.TokenInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.TokenInfoRequest buildPartial() {
      com.axelar.evm.v1beta1.TokenInfoRequest result = new com.axelar.evm.v1beta1.TokenInfoRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.evm.v1beta1.TokenInfoRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.chain_ = chain_;
      }
    }

    private void buildPartialOneofs(com.axelar.evm.v1beta1.TokenInfoRequest result) {
      result.findByCase_ = findByCase_;
      result.findBy_ = this.findBy_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.evm.v1beta1.TokenInfoRequest) {
        return mergeFrom((com.axelar.evm.v1beta1.TokenInfoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.evm.v1beta1.TokenInfoRequest other) {
      if (other == com.axelar.evm.v1beta1.TokenInfoRequest.getDefaultInstance()) return this;
      if (!other.getChain().isEmpty()) {
        chain_ = other.chain_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getFindByCase()) {
        case ASSET: {
          findByCase_ = 2;
          findBy_ = other.findBy_;
          onChanged();
          break;
        }
        case SYMBOL: {
          findByCase_ = 3;
          findBy_ = other.findBy_;
          onChanged();
          break;
        }
        case ADDRESS: {
          findByCase_ = 4;
          findBy_ = other.findBy_;
          onChanged();
          break;
        }
        case FINDBY_NOT_SET: {
          break;
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
              chain_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              findByCase_ = 2;
              findBy_ = s;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              findByCase_ = 3;
              findBy_ = s;
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              findByCase_ = 4;
              findBy_ = s;
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
    private int findByCase_ = 0;
    private java.lang.Object findBy_;
    public FindByCase
        getFindByCase() {
      return FindByCase.forNumber(
          findByCase_);
    }

    public Builder clearFindBy() {
      findByCase_ = 0;
      findBy_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object chain_ = "";
    /**
     * <code>string chain = 1 [json_name = "chain"];</code>
     * @return The chain.
     */
    public java.lang.String getChain() {
      java.lang.Object ref = chain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string chain = 1 [json_name = "chain"];</code>
     * @return The bytes for chain.
     */
    public com.google.protobuf.ByteString
        getChainBytes() {
      java.lang.Object ref = chain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string chain = 1 [json_name = "chain"];</code>
     * @param value The chain to set.
     * @return This builder for chaining.
     */
    public Builder setChain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      chain_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string chain = 1 [json_name = "chain"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChain() {
      chain_ = getDefaultInstance().getChain();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string chain = 1 [json_name = "chain"];</code>
     * @param value The bytes for chain to set.
     * @return This builder for chaining.
     */
    public Builder setChainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      chain_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @return Whether the asset field is set.
     */
    @java.lang.Override
    public boolean hasAsset() {
      return findByCase_ == 2;
    }
    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @return The asset.
     */
    @java.lang.Override
    public java.lang.String getAsset() {
      java.lang.Object ref = "";
      if (findByCase_ == 2) {
        ref = findBy_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (findByCase_ == 2) {
          findBy_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @return The bytes for asset.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAssetBytes() {
      java.lang.Object ref = "";
      if (findByCase_ == 2) {
        ref = findBy_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (findByCase_ == 2) {
          findBy_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @param value The asset to set.
     * @return This builder for chaining.
     */
    public Builder setAsset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      findByCase_ = 2;
      findBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAsset() {
      if (findByCase_ == 2) {
        findByCase_ = 0;
        findBy_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @param value The bytes for asset to set.
     * @return This builder for chaining.
     */
    public Builder setAssetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      findByCase_ = 2;
      findBy_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string symbol = 3 [json_name = "symbol"];</code>
     * @return Whether the symbol field is set.
     */
    @java.lang.Override
    public boolean hasSymbol() {
      return findByCase_ == 3;
    }
    /**
     * <code>string symbol = 3 [json_name = "symbol"];</code>
     * @return The symbol.
     */
    @java.lang.Override
    public java.lang.String getSymbol() {
      java.lang.Object ref = "";
      if (findByCase_ == 3) {
        ref = findBy_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (findByCase_ == 3) {
          findBy_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string symbol = 3 [json_name = "symbol"];</code>
     * @return The bytes for symbol.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = "";
      if (findByCase_ == 3) {
        ref = findBy_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (findByCase_ == 3) {
          findBy_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string symbol = 3 [json_name = "symbol"];</code>
     * @param value The symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbol(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      findByCase_ = 3;
      findBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 3 [json_name = "symbol"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSymbol() {
      if (findByCase_ == 3) {
        findByCase_ = 0;
        findBy_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string symbol = 3 [json_name = "symbol"];</code>
     * @param value The bytes for symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      findByCase_ = 3;
      findBy_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string address = 4 [json_name = "address"];</code>
     * @return Whether the address field is set.
     */
    @java.lang.Override
    public boolean hasAddress() {
      return findByCase_ == 4;
    }
    /**
     * <code>string address = 4 [json_name = "address"];</code>
     * @return The address.
     */
    @java.lang.Override
    public java.lang.String getAddress() {
      java.lang.Object ref = "";
      if (findByCase_ == 4) {
        ref = findBy_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (findByCase_ == 4) {
          findBy_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 4 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = "";
      if (findByCase_ == 4) {
        ref = findBy_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (findByCase_ == 4) {
          findBy_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 4 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      findByCase_ = 4;
      findBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 4 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      if (findByCase_ == 4) {
        findByCase_ = 0;
        findBy_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string address = 4 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      findByCase_ = 4;
      findBy_ = value;
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


    // @@protoc_insertion_point(builder_scope:axelar.evm.v1beta1.TokenInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.evm.v1beta1.TokenInfoRequest)
  private static final com.axelar.evm.v1beta1.TokenInfoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.evm.v1beta1.TokenInfoRequest();
  }

  public static com.axelar.evm.v1beta1.TokenInfoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TokenInfoRequest>
      PARSER = new com.google.protobuf.AbstractParser<TokenInfoRequest>() {
    @java.lang.Override
    public TokenInfoRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<TokenInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TokenInfoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.evm.v1beta1.TokenInfoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

