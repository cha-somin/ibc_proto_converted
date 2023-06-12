// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/erc20/v1/erc20.proto

package com.evmos.erc20.v1;

/**
 * <pre>
 * TokenPair defines an instance that records a pairing consisting of a native
 *  Cosmos Coin and an ERC20 token address.
 * </pre>
 *
 * Protobuf type {@code evmos.erc20.v1.TokenPair}
 */
public final class TokenPair extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:evmos.erc20.v1.TokenPair)
    TokenPairOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TokenPair.newBuilder() to construct.
  private TokenPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TokenPair() {
    erc20Address_ = "";
    denom_ = "";
    contractOwner_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TokenPair();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.evmos.erc20.v1.Erc20Proto.internal_static_evmos_erc20_v1_TokenPair_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.evmos.erc20.v1.Erc20Proto.internal_static_evmos_erc20_v1_TokenPair_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.evmos.erc20.v1.TokenPair.class, com.evmos.erc20.v1.TokenPair.Builder.class);
  }

  public static final int ERC20_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object erc20Address_ = "";
  /**
   * <pre>
   * erc20_address is the hex address of ERC20 contract token
   * </pre>
   *
   * <code>string erc20_address = 1 [json_name = "erc20Address"];</code>
   * @return The erc20Address.
   */
  @java.lang.Override
  public java.lang.String getErc20Address() {
    java.lang.Object ref = erc20Address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      erc20Address_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * erc20_address is the hex address of ERC20 contract token
   * </pre>
   *
   * <code>string erc20_address = 1 [json_name = "erc20Address"];</code>
   * @return The bytes for erc20Address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErc20AddressBytes() {
    java.lang.Object ref = erc20Address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      erc20Address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <pre>
   * denom defines the cosmos base denomination to be mapped to
   * </pre>
   *
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * denom defines the cosmos base denomination to be mapped to
   * </pre>
   *
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLED_FIELD_NUMBER = 3;
  private boolean enabled_ = false;
  /**
   * <pre>
   * enabled defines the token mapping enable status
   * </pre>
   *
   * <code>bool enabled = 3 [json_name = "enabled"];</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int CONTRACT_OWNER_FIELD_NUMBER = 4;
  private int contractOwner_ = 0;
  /**
   * <pre>
   * contract_owner is the an ENUM specifying the type of ERC20 owner (0 invalid, 1 ModuleAccount, 2 external address)
   * </pre>
   *
   * <code>.evmos.erc20.v1.Owner contract_owner = 4 [json_name = "contractOwner"];</code>
   * @return The enum numeric value on the wire for contractOwner.
   */
  @java.lang.Override public int getContractOwnerValue() {
    return contractOwner_;
  }
  /**
   * <pre>
   * contract_owner is the an ENUM specifying the type of ERC20 owner (0 invalid, 1 ModuleAccount, 2 external address)
   * </pre>
   *
   * <code>.evmos.erc20.v1.Owner contract_owner = 4 [json_name = "contractOwner"];</code>
   * @return The contractOwner.
   */
  @java.lang.Override public com.evmos.erc20.v1.Owner getContractOwner() {
    com.evmos.erc20.v1.Owner result = com.evmos.erc20.v1.Owner.forNumber(contractOwner_);
    return result == null ? com.evmos.erc20.v1.Owner.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(erc20Address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, erc20Address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, denom_);
    }
    if (enabled_ != false) {
      output.writeBool(3, enabled_);
    }
    if (contractOwner_ != com.evmos.erc20.v1.Owner.OWNER_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, contractOwner_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(erc20Address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, erc20Address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, denom_);
    }
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, enabled_);
    }
    if (contractOwner_ != com.evmos.erc20.v1.Owner.OWNER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, contractOwner_);
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
    if (!(obj instanceof com.evmos.erc20.v1.TokenPair)) {
      return super.equals(obj);
    }
    com.evmos.erc20.v1.TokenPair other = (com.evmos.erc20.v1.TokenPair) obj;

    if (!getErc20Address()
        .equals(other.getErc20Address())) return false;
    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (getEnabled()
        != other.getEnabled()) return false;
    if (contractOwner_ != other.contractOwner_) return false;
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
    hash = (37 * hash) + ERC20_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getErc20Address().hashCode();
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (37 * hash) + CONTRACT_OWNER_FIELD_NUMBER;
    hash = (53 * hash) + contractOwner_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.evmos.erc20.v1.TokenPair parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.erc20.v1.TokenPair parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.erc20.v1.TokenPair parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.erc20.v1.TokenPair parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.erc20.v1.TokenPair parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.erc20.v1.TokenPair parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.erc20.v1.TokenPair parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.erc20.v1.TokenPair parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.evmos.erc20.v1.TokenPair parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.evmos.erc20.v1.TokenPair parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.evmos.erc20.v1.TokenPair parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.erc20.v1.TokenPair parseFrom(
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
  public static Builder newBuilder(com.evmos.erc20.v1.TokenPair prototype) {
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
   * TokenPair defines an instance that records a pairing consisting of a native
   *  Cosmos Coin and an ERC20 token address.
   * </pre>
   *
   * Protobuf type {@code evmos.erc20.v1.TokenPair}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:evmos.erc20.v1.TokenPair)
      com.evmos.erc20.v1.TokenPairOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.evmos.erc20.v1.Erc20Proto.internal_static_evmos_erc20_v1_TokenPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.evmos.erc20.v1.Erc20Proto.internal_static_evmos_erc20_v1_TokenPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.evmos.erc20.v1.TokenPair.class, com.evmos.erc20.v1.TokenPair.Builder.class);
    }

    // Construct using com.evmos.erc20.v1.TokenPair.newBuilder()
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
      erc20Address_ = "";
      denom_ = "";
      enabled_ = false;
      contractOwner_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.evmos.erc20.v1.Erc20Proto.internal_static_evmos_erc20_v1_TokenPair_descriptor;
    }

    @java.lang.Override
    public com.evmos.erc20.v1.TokenPair getDefaultInstanceForType() {
      return com.evmos.erc20.v1.TokenPair.getDefaultInstance();
    }

    @java.lang.Override
    public com.evmos.erc20.v1.TokenPair build() {
      com.evmos.erc20.v1.TokenPair result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.evmos.erc20.v1.TokenPair buildPartial() {
      com.evmos.erc20.v1.TokenPair result = new com.evmos.erc20.v1.TokenPair(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.evmos.erc20.v1.TokenPair result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.erc20Address_ = erc20Address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.enabled_ = enabled_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.contractOwner_ = contractOwner_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.evmos.erc20.v1.TokenPair) {
        return mergeFrom((com.evmos.erc20.v1.TokenPair)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.evmos.erc20.v1.TokenPair other) {
      if (other == com.evmos.erc20.v1.TokenPair.getDefaultInstance()) return this;
      if (!other.getErc20Address().isEmpty()) {
        erc20Address_ = other.erc20Address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.contractOwner_ != 0) {
        setContractOwnerValue(other.getContractOwnerValue());
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
              erc20Address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              enabled_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              contractOwner_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object erc20Address_ = "";
    /**
     * <pre>
     * erc20_address is the hex address of ERC20 contract token
     * </pre>
     *
     * <code>string erc20_address = 1 [json_name = "erc20Address"];</code>
     * @return The erc20Address.
     */
    public java.lang.String getErc20Address() {
      java.lang.Object ref = erc20Address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        erc20Address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * erc20_address is the hex address of ERC20 contract token
     * </pre>
     *
     * <code>string erc20_address = 1 [json_name = "erc20Address"];</code>
     * @return The bytes for erc20Address.
     */
    public com.google.protobuf.ByteString
        getErc20AddressBytes() {
      java.lang.Object ref = erc20Address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        erc20Address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * erc20_address is the hex address of ERC20 contract token
     * </pre>
     *
     * <code>string erc20_address = 1 [json_name = "erc20Address"];</code>
     * @param value The erc20Address to set.
     * @return This builder for chaining.
     */
    public Builder setErc20Address(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      erc20Address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * erc20_address is the hex address of ERC20 contract token
     * </pre>
     *
     * <code>string erc20_address = 1 [json_name = "erc20Address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearErc20Address() {
      erc20Address_ = getDefaultInstance().getErc20Address();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * erc20_address is the hex address of ERC20 contract token
     * </pre>
     *
     * <code>string erc20_address = 1 [json_name = "erc20Address"];</code>
     * @param value The bytes for erc20Address to set.
     * @return This builder for chaining.
     */
    public Builder setErc20AddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      erc20Address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
     * <pre>
     * denom defines the cosmos base denomination to be mapped to
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * denom defines the cosmos base denomination to be mapped to
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * denom defines the cosmos base denomination to be mapped to
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * denom defines the cosmos base denomination to be mapped to
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * denom defines the cosmos base denomination to be mapped to
     * </pre>
     *
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean enabled_ ;
    /**
     * <pre>
     * enabled defines the token mapping enable status
     * </pre>
     *
     * <code>bool enabled = 3 [json_name = "enabled"];</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * enabled defines the token mapping enable status
     * </pre>
     *
     * <code>bool enabled = 3 [json_name = "enabled"];</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * enabled defines the token mapping enable status
     * </pre>
     *
     * <code>bool enabled = 3 [json_name = "enabled"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000004);
      enabled_ = false;
      onChanged();
      return this;
    }

    private int contractOwner_ = 0;
    /**
     * <pre>
     * contract_owner is the an ENUM specifying the type of ERC20 owner (0 invalid, 1 ModuleAccount, 2 external address)
     * </pre>
     *
     * <code>.evmos.erc20.v1.Owner contract_owner = 4 [json_name = "contractOwner"];</code>
     * @return The enum numeric value on the wire for contractOwner.
     */
    @java.lang.Override public int getContractOwnerValue() {
      return contractOwner_;
    }
    /**
     * <pre>
     * contract_owner is the an ENUM specifying the type of ERC20 owner (0 invalid, 1 ModuleAccount, 2 external address)
     * </pre>
     *
     * <code>.evmos.erc20.v1.Owner contract_owner = 4 [json_name = "contractOwner"];</code>
     * @param value The enum numeric value on the wire for contractOwner to set.
     * @return This builder for chaining.
     */
    public Builder setContractOwnerValue(int value) {
      contractOwner_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_owner is the an ENUM specifying the type of ERC20 owner (0 invalid, 1 ModuleAccount, 2 external address)
     * </pre>
     *
     * <code>.evmos.erc20.v1.Owner contract_owner = 4 [json_name = "contractOwner"];</code>
     * @return The contractOwner.
     */
    @java.lang.Override
    public com.evmos.erc20.v1.Owner getContractOwner() {
      com.evmos.erc20.v1.Owner result = com.evmos.erc20.v1.Owner.forNumber(contractOwner_);
      return result == null ? com.evmos.erc20.v1.Owner.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * contract_owner is the an ENUM specifying the type of ERC20 owner (0 invalid, 1 ModuleAccount, 2 external address)
     * </pre>
     *
     * <code>.evmos.erc20.v1.Owner contract_owner = 4 [json_name = "contractOwner"];</code>
     * @param value The contractOwner to set.
     * @return This builder for chaining.
     */
    public Builder setContractOwner(com.evmos.erc20.v1.Owner value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      contractOwner_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_owner is the an ENUM specifying the type of ERC20 owner (0 invalid, 1 ModuleAccount, 2 external address)
     * </pre>
     *
     * <code>.evmos.erc20.v1.Owner contract_owner = 4 [json_name = "contractOwner"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContractOwner() {
      bitField0_ = (bitField0_ & ~0x00000008);
      contractOwner_ = 0;
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


    // @@protoc_insertion_point(builder_scope:evmos.erc20.v1.TokenPair)
  }

  // @@protoc_insertion_point(class_scope:evmos.erc20.v1.TokenPair)
  private static final com.evmos.erc20.v1.TokenPair DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.evmos.erc20.v1.TokenPair();
  }

  public static com.evmos.erc20.v1.TokenPair getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TokenPair>
      PARSER = new com.google.protobuf.AbstractParser<TokenPair>() {
    @java.lang.Override
    public TokenPair parsePartialFrom(
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

  public static com.google.protobuf.Parser<TokenPair> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TokenPair> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.evmos.erc20.v1.TokenPair getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

