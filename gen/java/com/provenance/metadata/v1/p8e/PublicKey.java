// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/p8e/p8e.proto

package com.provenance.metadata.v1.p8e;

/**
 * <pre>
 * Deprecated: Do not use.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.p8e.PublicKey}
 */
@java.lang.Deprecated public final class PublicKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.p8e.PublicKey)
    PublicKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublicKey.newBuilder() to construct.
  private PublicKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublicKey() {
    publicKeyBytes_ = com.google.protobuf.ByteString.EMPTY;
    type_ = 0;
    curve_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublicKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_PublicKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_PublicKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.p8e.PublicKey.class, com.provenance.metadata.v1.p8e.PublicKey.Builder.class);
  }

  public static final int PUBLIC_KEY_BYTES_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString publicKeyBytes_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes public_key_bytes = 1 [json_name = "publicKeyBytes"];</code>
   * @return The publicKeyBytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPublicKeyBytes() {
    return publicKeyBytes_;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_ = 0;
  /**
   * <code>.provenance.metadata.v1.p8e.PublicKeyType type = 2 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.PublicKeyType type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public com.provenance.metadata.v1.p8e.PublicKeyType getType() {
    com.provenance.metadata.v1.p8e.PublicKeyType result = com.provenance.metadata.v1.p8e.PublicKeyType.forNumber(type_);
    return result == null ? com.provenance.metadata.v1.p8e.PublicKeyType.UNRECOGNIZED : result;
  }

  public static final int CURVE_FIELD_NUMBER = 3;
  private int curve_ = 0;
  /**
   * <code>.provenance.metadata.v1.p8e.PublicKeyCurve curve = 3 [json_name = "curve"];</code>
   * @return The enum numeric value on the wire for curve.
   */
  @java.lang.Override public int getCurveValue() {
    return curve_;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.PublicKeyCurve curve = 3 [json_name = "curve"];</code>
   * @return The curve.
   */
  @java.lang.Override public com.provenance.metadata.v1.p8e.PublicKeyCurve getCurve() {
    com.provenance.metadata.v1.p8e.PublicKeyCurve result = com.provenance.metadata.v1.p8e.PublicKeyCurve.forNumber(curve_);
    return result == null ? com.provenance.metadata.v1.p8e.PublicKeyCurve.UNRECOGNIZED : result;
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
    if (!publicKeyBytes_.isEmpty()) {
      output.writeBytes(1, publicKeyBytes_);
    }
    if (type_ != com.provenance.metadata.v1.p8e.PublicKeyType.ELLIPTIC.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (curve_ != com.provenance.metadata.v1.p8e.PublicKeyCurve.SECP256K1.getNumber()) {
      output.writeEnum(3, curve_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!publicKeyBytes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, publicKeyBytes_);
    }
    if (type_ != com.provenance.metadata.v1.p8e.PublicKeyType.ELLIPTIC.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (curve_ != com.provenance.metadata.v1.p8e.PublicKeyCurve.SECP256K1.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, curve_);
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
    if (!(obj instanceof com.provenance.metadata.v1.p8e.PublicKey)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.p8e.PublicKey other = (com.provenance.metadata.v1.p8e.PublicKey) obj;

    if (!getPublicKeyBytes()
        .equals(other.getPublicKeyBytes())) return false;
    if (type_ != other.type_) return false;
    if (curve_ != other.curve_) return false;
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
    hash = (37 * hash) + PUBLIC_KEY_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getPublicKeyBytes().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + CURVE_FIELD_NUMBER;
    hash = (53 * hash) + curve_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.p8e.PublicKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.p8e.PublicKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.PublicKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.p8e.PublicKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.PublicKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.p8e.PublicKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.PublicKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.p8e.PublicKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.p8e.PublicKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.p8e.PublicKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.PublicKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.p8e.PublicKey parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.p8e.PublicKey prototype) {
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
   * Deprecated: Do not use.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.p8e.PublicKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.p8e.PublicKey)
      com.provenance.metadata.v1.p8e.PublicKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_PublicKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_PublicKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.p8e.PublicKey.class, com.provenance.metadata.v1.p8e.PublicKey.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.p8e.PublicKey.newBuilder()
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
      publicKeyBytes_ = com.google.protobuf.ByteString.EMPTY;
      type_ = 0;
      curve_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_PublicKey_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.p8e.PublicKey getDefaultInstanceForType() {
      return com.provenance.metadata.v1.p8e.PublicKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.p8e.PublicKey build() {
      com.provenance.metadata.v1.p8e.PublicKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.p8e.PublicKey buildPartial() {
      com.provenance.metadata.v1.p8e.PublicKey result = new com.provenance.metadata.v1.p8e.PublicKey(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.metadata.v1.p8e.PublicKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.publicKeyBytes_ = publicKeyBytes_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.curve_ = curve_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.p8e.PublicKey) {
        return mergeFrom((com.provenance.metadata.v1.p8e.PublicKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.p8e.PublicKey other) {
      if (other == com.provenance.metadata.v1.p8e.PublicKey.getDefaultInstance()) return this;
      if (other.getPublicKeyBytes() != com.google.protobuf.ByteString.EMPTY) {
        setPublicKeyBytes(other.getPublicKeyBytes());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.curve_ != 0) {
        setCurveValue(other.getCurveValue());
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
              publicKeyBytes_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              curve_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.ByteString publicKeyBytes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes public_key_bytes = 1 [json_name = "publicKeyBytes"];</code>
     * @return The publicKeyBytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPublicKeyBytes() {
      return publicKeyBytes_;
    }
    /**
     * <code>bytes public_key_bytes = 1 [json_name = "publicKeyBytes"];</code>
     * @param value The publicKeyBytes to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      publicKeyBytes_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes public_key_bytes = 1 [json_name = "publicKeyBytes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPublicKeyBytes() {
      bitField0_ = (bitField0_ & ~0x00000001);
      publicKeyBytes_ = getDefaultInstance().getPublicKeyBytes();
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.provenance.metadata.v1.p8e.PublicKeyType type = 2 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.PublicKeyType type = 2 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.PublicKeyType type = 2 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.provenance.metadata.v1.p8e.PublicKeyType getType() {
      com.provenance.metadata.v1.p8e.PublicKeyType result = com.provenance.metadata.v1.p8e.PublicKeyType.forNumber(type_);
      return result == null ? com.provenance.metadata.v1.p8e.PublicKeyType.UNRECOGNIZED : result;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.PublicKeyType type = 2 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.provenance.metadata.v1.p8e.PublicKeyType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.PublicKeyType type = 2 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;
      onChanged();
      return this;
    }

    private int curve_ = 0;
    /**
     * <code>.provenance.metadata.v1.p8e.PublicKeyCurve curve = 3 [json_name = "curve"];</code>
     * @return The enum numeric value on the wire for curve.
     */
    @java.lang.Override public int getCurveValue() {
      return curve_;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.PublicKeyCurve curve = 3 [json_name = "curve"];</code>
     * @param value The enum numeric value on the wire for curve to set.
     * @return This builder for chaining.
     */
    public Builder setCurveValue(int value) {
      curve_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.PublicKeyCurve curve = 3 [json_name = "curve"];</code>
     * @return The curve.
     */
    @java.lang.Override
    public com.provenance.metadata.v1.p8e.PublicKeyCurve getCurve() {
      com.provenance.metadata.v1.p8e.PublicKeyCurve result = com.provenance.metadata.v1.p8e.PublicKeyCurve.forNumber(curve_);
      return result == null ? com.provenance.metadata.v1.p8e.PublicKeyCurve.UNRECOGNIZED : result;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.PublicKeyCurve curve = 3 [json_name = "curve"];</code>
     * @param value The curve to set.
     * @return This builder for chaining.
     */
    public Builder setCurve(com.provenance.metadata.v1.p8e.PublicKeyCurve value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      curve_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.PublicKeyCurve curve = 3 [json_name = "curve"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCurve() {
      bitField0_ = (bitField0_ & ~0x00000004);
      curve_ = 0;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.p8e.PublicKey)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.p8e.PublicKey)
  private static final com.provenance.metadata.v1.p8e.PublicKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.p8e.PublicKey();
  }

  public static com.provenance.metadata.v1.p8e.PublicKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublicKey>
      PARSER = new com.google.protobuf.AbstractParser<PublicKey>() {
    @java.lang.Override
    public PublicKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublicKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublicKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.p8e.PublicKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

