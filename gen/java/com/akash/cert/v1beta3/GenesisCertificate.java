// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/cert/v1beta3/genesis.proto

package com.akash.cert.v1beta3;

/**
 * <pre>
 * GenesisCertificate defines certificate entry at genesis
 * </pre>
 *
 * Protobuf type {@code akash.cert.v1beta3.GenesisCertificate}
 */
public final class GenesisCertificate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.cert.v1beta3.GenesisCertificate)
    GenesisCertificateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisCertificate.newBuilder() to construct.
  private GenesisCertificate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisCertificate() {
    owner_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisCertificate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.cert.v1beta3.GenesisProto.internal_static_akash_cert_v1beta3_GenesisCertificate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.cert.v1beta3.GenesisProto.internal_static_akash_cert_v1beta3_GenesisCertificate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.cert.v1beta3.GenesisCertificate.class, com.akash.cert.v1beta3.GenesisCertificate.Builder.class);
  }

  public static final int OWNER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object owner_ = "";
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  @java.lang.Override
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      owner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 2;
  private com.akash.cert.v1beta3.Certificate certificate_;
  /**
   * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
   * @return Whether the certificate field is set.
   */
  @java.lang.Override
  public boolean hasCertificate() {
    return certificate_ != null;
  }
  /**
   * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
   * @return The certificate.
   */
  @java.lang.Override
  public com.akash.cert.v1beta3.Certificate getCertificate() {
    return certificate_ == null ? com.akash.cert.v1beta3.Certificate.getDefaultInstance() : certificate_;
  }
  /**
   * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.cert.v1beta3.CertificateOrBuilder getCertificateOrBuilder() {
    return certificate_ == null ? com.akash.cert.v1beta3.Certificate.getDefaultInstance() : certificate_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, owner_);
    }
    if (certificate_ != null) {
      output.writeMessage(2, getCertificate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, owner_);
    }
    if (certificate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCertificate());
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
    if (!(obj instanceof com.akash.cert.v1beta3.GenesisCertificate)) {
      return super.equals(obj);
    }
    com.akash.cert.v1beta3.GenesisCertificate other = (com.akash.cert.v1beta3.GenesisCertificate) obj;

    if (!getOwner()
        .equals(other.getOwner())) return false;
    if (hasCertificate() != other.hasCertificate()) return false;
    if (hasCertificate()) {
      if (!getCertificate()
          .equals(other.getCertificate())) return false;
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
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    if (hasCertificate()) {
      hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
      hash = (53 * hash) + getCertificate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.cert.v1beta3.GenesisCertificate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta3.GenesisCertificate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta3.GenesisCertificate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta3.GenesisCertificate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta3.GenesisCertificate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta3.GenesisCertificate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta3.GenesisCertificate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.cert.v1beta3.GenesisCertificate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.cert.v1beta3.GenesisCertificate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.cert.v1beta3.GenesisCertificate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.cert.v1beta3.GenesisCertificate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.cert.v1beta3.GenesisCertificate parseFrom(
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
  public static Builder newBuilder(com.akash.cert.v1beta3.GenesisCertificate prototype) {
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
   * GenesisCertificate defines certificate entry at genesis
   * </pre>
   *
   * Protobuf type {@code akash.cert.v1beta3.GenesisCertificate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.cert.v1beta3.GenesisCertificate)
      com.akash.cert.v1beta3.GenesisCertificateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.cert.v1beta3.GenesisProto.internal_static_akash_cert_v1beta3_GenesisCertificate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.cert.v1beta3.GenesisProto.internal_static_akash_cert_v1beta3_GenesisCertificate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.cert.v1beta3.GenesisCertificate.class, com.akash.cert.v1beta3.GenesisCertificate.Builder.class);
    }

    // Construct using com.akash.cert.v1beta3.GenesisCertificate.newBuilder()
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
      owner_ = "";
      certificate_ = null;
      if (certificateBuilder_ != null) {
        certificateBuilder_.dispose();
        certificateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.cert.v1beta3.GenesisProto.internal_static_akash_cert_v1beta3_GenesisCertificate_descriptor;
    }

    @java.lang.Override
    public com.akash.cert.v1beta3.GenesisCertificate getDefaultInstanceForType() {
      return com.akash.cert.v1beta3.GenesisCertificate.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.cert.v1beta3.GenesisCertificate build() {
      com.akash.cert.v1beta3.GenesisCertificate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.cert.v1beta3.GenesisCertificate buildPartial() {
      com.akash.cert.v1beta3.GenesisCertificate result = new com.akash.cert.v1beta3.GenesisCertificate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.cert.v1beta3.GenesisCertificate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.owner_ = owner_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.certificate_ = certificateBuilder_ == null
            ? certificate_
            : certificateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.cert.v1beta3.GenesisCertificate) {
        return mergeFrom((com.akash.cert.v1beta3.GenesisCertificate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.cert.v1beta3.GenesisCertificate other) {
      if (other == com.akash.cert.v1beta3.GenesisCertificate.getDefaultInstance()) return this;
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCertificate()) {
        mergeCertificate(other.getCertificate());
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
              owner_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCertificateFieldBuilder().getBuilder(),
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

    private java.lang.Object owner_ = "";
    /**
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @return The owner.
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @return The bytes for owner.
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      owner_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      owner_ = getDefaultInstance().getOwner();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @param value The bytes for owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      owner_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.akash.cert.v1beta3.Certificate certificate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.cert.v1beta3.Certificate, com.akash.cert.v1beta3.Certificate.Builder, com.akash.cert.v1beta3.CertificateOrBuilder> certificateBuilder_;
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     * @return Whether the certificate field is set.
     */
    public boolean hasCertificate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     * @return The certificate.
     */
    public com.akash.cert.v1beta3.Certificate getCertificate() {
      if (certificateBuilder_ == null) {
        return certificate_ == null ? com.akash.cert.v1beta3.Certificate.getDefaultInstance() : certificate_;
      } else {
        return certificateBuilder_.getMessage();
      }
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    public Builder setCertificate(com.akash.cert.v1beta3.Certificate value) {
      if (certificateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        certificate_ = value;
      } else {
        certificateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    public Builder setCertificate(
        com.akash.cert.v1beta3.Certificate.Builder builderForValue) {
      if (certificateBuilder_ == null) {
        certificate_ = builderForValue.build();
      } else {
        certificateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    public Builder mergeCertificate(com.akash.cert.v1beta3.Certificate value) {
      if (certificateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          certificate_ != null &&
          certificate_ != com.akash.cert.v1beta3.Certificate.getDefaultInstance()) {
          getCertificateBuilder().mergeFrom(value);
        } else {
          certificate_ = value;
        }
      } else {
        certificateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    public Builder clearCertificate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      certificate_ = null;
      if (certificateBuilder_ != null) {
        certificateBuilder_.dispose();
        certificateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    public com.akash.cert.v1beta3.Certificate.Builder getCertificateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCertificateFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    public com.akash.cert.v1beta3.CertificateOrBuilder getCertificateOrBuilder() {
      if (certificateBuilder_ != null) {
        return certificateBuilder_.getMessageOrBuilder();
      } else {
        return certificate_ == null ?
            com.akash.cert.v1beta3.Certificate.getDefaultInstance() : certificate_;
      }
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.cert.v1beta3.Certificate, com.akash.cert.v1beta3.Certificate.Builder, com.akash.cert.v1beta3.CertificateOrBuilder> 
        getCertificateFieldBuilder() {
      if (certificateBuilder_ == null) {
        certificateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.akash.cert.v1beta3.Certificate, com.akash.cert.v1beta3.Certificate.Builder, com.akash.cert.v1beta3.CertificateOrBuilder>(
                getCertificate(),
                getParentForChildren(),
                isClean());
        certificate_ = null;
      }
      return certificateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:akash.cert.v1beta3.GenesisCertificate)
  }

  // @@protoc_insertion_point(class_scope:akash.cert.v1beta3.GenesisCertificate)
  private static final com.akash.cert.v1beta3.GenesisCertificate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.cert.v1beta3.GenesisCertificate();
  }

  public static com.akash.cert.v1beta3.GenesisCertificate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisCertificate>
      PARSER = new com.google.protobuf.AbstractParser<GenesisCertificate>() {
    @java.lang.Override
    public GenesisCertificate parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisCertificate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisCertificate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.cert.v1beta3.GenesisCertificate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

