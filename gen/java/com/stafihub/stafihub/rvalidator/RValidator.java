// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rvalidator/genesis.proto

package com.stafihub.stafihub.rvalidator;

/**
 * Protobuf type {@code stafihub.stafihub.rvalidator.RValidator}
 */
public final class RValidator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.rvalidator.RValidator)
    RValidatorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RValidator.newBuilder() to construct.
  private RValidator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RValidator() {
    denom_ = "";
    poolAddress_ = "";
    valAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RValidator();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.rvalidator.GenesisProto.internal_static_stafihub_stafihub_rvalidator_RValidator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.rvalidator.GenesisProto.internal_static_stafihub_stafihub_rvalidator_RValidator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.rvalidator.RValidator.class, com.stafihub.stafihub.rvalidator.RValidator.Builder.class);
  }

  public static final int DENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
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
   * <code>string denom = 1 [json_name = "denom"];</code>
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

  public static final int POOLADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object poolAddress_ = "";
  /**
   * <code>string poolAddress = 2 [json_name = "poolAddress"];</code>
   * @return The poolAddress.
   */
  @java.lang.Override
  public java.lang.String getPoolAddress() {
    java.lang.Object ref = poolAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poolAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string poolAddress = 2 [json_name = "poolAddress"];</code>
   * @return The bytes for poolAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPoolAddressBytes() {
    java.lang.Object ref = poolAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poolAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object valAddress_ = "";
  /**
   * <code>string valAddress = 3 [json_name = "valAddress"];</code>
   * @return The valAddress.
   */
  @java.lang.Override
  public java.lang.String getValAddress() {
    java.lang.Object ref = valAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string valAddress = 3 [json_name = "valAddress"];</code>
   * @return The bytes for valAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValAddressBytes() {
    java.lang.Object ref = valAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poolAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, poolAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, valAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(poolAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, poolAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, valAddress_);
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
    if (!(obj instanceof com.stafihub.stafihub.rvalidator.RValidator)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.rvalidator.RValidator other = (com.stafihub.stafihub.rvalidator.RValidator) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getPoolAddress()
        .equals(other.getPoolAddress())) return false;
    if (!getValAddress()
        .equals(other.getValAddress())) return false;
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
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + POOLADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getPoolAddress().hashCode();
    hash = (37 * hash) + VALADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.rvalidator.RValidator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rvalidator.RValidator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rvalidator.RValidator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rvalidator.RValidator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rvalidator.RValidator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.rvalidator.RValidator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.rvalidator.RValidator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rvalidator.RValidator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.rvalidator.RValidator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.rvalidator.RValidator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.rvalidator.RValidator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.rvalidator.RValidator parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.rvalidator.RValidator prototype) {
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
   * Protobuf type {@code stafihub.stafihub.rvalidator.RValidator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.rvalidator.RValidator)
      com.stafihub.stafihub.rvalidator.RValidatorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.rvalidator.GenesisProto.internal_static_stafihub_stafihub_rvalidator_RValidator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.rvalidator.GenesisProto.internal_static_stafihub_stafihub_rvalidator_RValidator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.rvalidator.RValidator.class, com.stafihub.stafihub.rvalidator.RValidator.Builder.class);
    }

    // Construct using com.stafihub.stafihub.rvalidator.RValidator.newBuilder()
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
      denom_ = "";
      poolAddress_ = "";
      valAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.rvalidator.GenesisProto.internal_static_stafihub_stafihub_rvalidator_RValidator_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rvalidator.RValidator getDefaultInstanceForType() {
      return com.stafihub.stafihub.rvalidator.RValidator.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.rvalidator.RValidator build() {
      com.stafihub.stafihub.rvalidator.RValidator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.rvalidator.RValidator buildPartial() {
      com.stafihub.stafihub.rvalidator.RValidator result = new com.stafihub.stafihub.rvalidator.RValidator(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.rvalidator.RValidator result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.poolAddress_ = poolAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.valAddress_ = valAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.rvalidator.RValidator) {
        return mergeFrom((com.stafihub.stafihub.rvalidator.RValidator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.rvalidator.RValidator other) {
      if (other == com.stafihub.stafihub.rvalidator.RValidator.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPoolAddress().isEmpty()) {
        poolAddress_ = other.poolAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getValAddress().isEmpty()) {
        valAddress_ = other.valAddress_;
        bitField0_ |= 0x00000004;
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
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              poolAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              valAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
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
     * <code>string denom = 1 [json_name = "denom"];</code>
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
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object poolAddress_ = "";
    /**
     * <code>string poolAddress = 2 [json_name = "poolAddress"];</code>
     * @return The poolAddress.
     */
    public java.lang.String getPoolAddress() {
      java.lang.Object ref = poolAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poolAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string poolAddress = 2 [json_name = "poolAddress"];</code>
     * @return The bytes for poolAddress.
     */
    public com.google.protobuf.ByteString
        getPoolAddressBytes() {
      java.lang.Object ref = poolAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poolAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string poolAddress = 2 [json_name = "poolAddress"];</code>
     * @param value The poolAddress to set.
     * @return This builder for chaining.
     */
    public Builder setPoolAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      poolAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string poolAddress = 2 [json_name = "poolAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolAddress() {
      poolAddress_ = getDefaultInstance().getPoolAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string poolAddress = 2 [json_name = "poolAddress"];</code>
     * @param value The bytes for poolAddress to set.
     * @return This builder for chaining.
     */
    public Builder setPoolAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      poolAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object valAddress_ = "";
    /**
     * <code>string valAddress = 3 [json_name = "valAddress"];</code>
     * @return The valAddress.
     */
    public java.lang.String getValAddress() {
      java.lang.Object ref = valAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string valAddress = 3 [json_name = "valAddress"];</code>
     * @return The bytes for valAddress.
     */
    public com.google.protobuf.ByteString
        getValAddressBytes() {
      java.lang.Object ref = valAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string valAddress = 3 [json_name = "valAddress"];</code>
     * @param value The valAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string valAddress = 3 [json_name = "valAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValAddress() {
      valAddress_ = getDefaultInstance().getValAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string valAddress = 3 [json_name = "valAddress"];</code>
     * @param value The bytes for valAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valAddress_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.rvalidator.RValidator)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.rvalidator.RValidator)
  private static final com.stafihub.stafihub.rvalidator.RValidator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.rvalidator.RValidator();
  }

  public static com.stafihub.stafihub.rvalidator.RValidator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RValidator>
      PARSER = new com.google.protobuf.AbstractParser<RValidator>() {
    @java.lang.Override
    public RValidator parsePartialFrom(
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

  public static com.google.protobuf.Parser<RValidator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RValidator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.rvalidator.RValidator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

