// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/cert/v1beta3/query.proto

package com.akash.cert.v1beta3;

/**
 * <pre>
 * CertificateResponse contains a single X509 certificate and its serial number
 * </pre>
 *
 * Protobuf type {@code akash.cert.v1beta3.CertificateResponse}
 */
public final class CertificateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.cert.v1beta3.CertificateResponse)
    CertificateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CertificateResponse.newBuilder() to construct.
  private CertificateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CertificateResponse() {
    serial_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CertificateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.cert.v1beta3.QueryProto.internal_static_akash_cert_v1beta3_CertificateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.cert.v1beta3.QueryProto.internal_static_akash_cert_v1beta3_CertificateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.cert.v1beta3.CertificateResponse.class, com.akash.cert.v1beta3.CertificateResponse.Builder.class);
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 1;
  private com.akash.cert.v1beta3.Certificate certificate_;
  /**
   * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
   * @return Whether the certificate field is set.
   */
  @java.lang.Override
  public boolean hasCertificate() {
    return certificate_ != null;
  }
  /**
   * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
   * @return The certificate.
   */
  @java.lang.Override
  public com.akash.cert.v1beta3.Certificate getCertificate() {
    return certificate_ == null ? com.akash.cert.v1beta3.Certificate.getDefaultInstance() : certificate_;
  }
  /**
   * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.cert.v1beta3.CertificateOrBuilder getCertificateOrBuilder() {
    return certificate_ == null ? com.akash.cert.v1beta3.Certificate.getDefaultInstance() : certificate_;
  }

  public static final int SERIAL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object serial_ = "";
  /**
   * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
   * @return The serial.
   */
  @java.lang.Override
  public java.lang.String getSerial() {
    java.lang.Object ref = serial_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serial_ = s;
      return s;
    }
  }
  /**
   * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
   * @return The bytes for serial.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSerialBytes() {
    java.lang.Object ref = serial_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serial_ = b;
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
    if (certificate_ != null) {
      output.writeMessage(1, getCertificate());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serial_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serial_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (certificate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCertificate());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serial_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serial_);
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
    if (!(obj instanceof com.akash.cert.v1beta3.CertificateResponse)) {
      return super.equals(obj);
    }
    com.akash.cert.v1beta3.CertificateResponse other = (com.akash.cert.v1beta3.CertificateResponse) obj;

    if (hasCertificate() != other.hasCertificate()) return false;
    if (hasCertificate()) {
      if (!getCertificate()
          .equals(other.getCertificate())) return false;
    }
    if (!getSerial()
        .equals(other.getSerial())) return false;
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
    if (hasCertificate()) {
      hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
      hash = (53 * hash) + getCertificate().hashCode();
    }
    hash = (37 * hash) + SERIAL_FIELD_NUMBER;
    hash = (53 * hash) + getSerial().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.cert.v1beta3.CertificateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta3.CertificateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta3.CertificateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta3.CertificateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta3.CertificateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta3.CertificateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta3.CertificateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.cert.v1beta3.CertificateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.cert.v1beta3.CertificateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.cert.v1beta3.CertificateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.cert.v1beta3.CertificateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.cert.v1beta3.CertificateResponse parseFrom(
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
  public static Builder newBuilder(com.akash.cert.v1beta3.CertificateResponse prototype) {
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
   * CertificateResponse contains a single X509 certificate and its serial number
   * </pre>
   *
   * Protobuf type {@code akash.cert.v1beta3.CertificateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.cert.v1beta3.CertificateResponse)
      com.akash.cert.v1beta3.CertificateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.cert.v1beta3.QueryProto.internal_static_akash_cert_v1beta3_CertificateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.cert.v1beta3.QueryProto.internal_static_akash_cert_v1beta3_CertificateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.cert.v1beta3.CertificateResponse.class, com.akash.cert.v1beta3.CertificateResponse.Builder.class);
    }

    // Construct using com.akash.cert.v1beta3.CertificateResponse.newBuilder()
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
      certificate_ = null;
      if (certificateBuilder_ != null) {
        certificateBuilder_.dispose();
        certificateBuilder_ = null;
      }
      serial_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.cert.v1beta3.QueryProto.internal_static_akash_cert_v1beta3_CertificateResponse_descriptor;
    }

    @java.lang.Override
    public com.akash.cert.v1beta3.CertificateResponse getDefaultInstanceForType() {
      return com.akash.cert.v1beta3.CertificateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.cert.v1beta3.CertificateResponse build() {
      com.akash.cert.v1beta3.CertificateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.cert.v1beta3.CertificateResponse buildPartial() {
      com.akash.cert.v1beta3.CertificateResponse result = new com.akash.cert.v1beta3.CertificateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.cert.v1beta3.CertificateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.certificate_ = certificateBuilder_ == null
            ? certificate_
            : certificateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.serial_ = serial_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.cert.v1beta3.CertificateResponse) {
        return mergeFrom((com.akash.cert.v1beta3.CertificateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.cert.v1beta3.CertificateResponse other) {
      if (other == com.akash.cert.v1beta3.CertificateResponse.getDefaultInstance()) return this;
      if (other.hasCertificate()) {
        mergeCertificate(other.getCertificate());
      }
      if (!other.getSerial().isEmpty()) {
        serial_ = other.serial_;
        bitField0_ |= 0x00000002;
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
              input.readMessage(
                  getCertificateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              serial_ = input.readStringRequireUtf8();
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

    private com.akash.cert.v1beta3.Certificate certificate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.cert.v1beta3.Certificate, com.akash.cert.v1beta3.Certificate.Builder, com.akash.cert.v1beta3.CertificateOrBuilder> certificateBuilder_;
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     * @return Whether the certificate field is set.
     */
    public boolean hasCertificate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
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
     * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    public Builder setCertificate(
        com.akash.cert.v1beta3.Certificate.Builder builderForValue) {
      if (certificateBuilder_ == null) {
        certificate_ = builderForValue.build();
      } else {
        certificateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    public Builder mergeCertificate(com.akash.cert.v1beta3.Certificate value) {
      if (certificateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          certificate_ != null &&
          certificate_ != com.akash.cert.v1beta3.Certificate.getDefaultInstance()) {
          getCertificateBuilder().mergeFrom(value);
        } else {
          certificate_ = value;
        }
      } else {
        certificateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    public Builder clearCertificate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      certificate_ = null;
      if (certificateBuilder_ != null) {
        certificateBuilder_.dispose();
        certificateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
     */
    public com.akash.cert.v1beta3.Certificate.Builder getCertificateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCertificateFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
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
     * <code>.akash.cert.v1beta3.Certificate certificate = 1 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
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

    private java.lang.Object serial_ = "";
    /**
     * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
     * @return The serial.
     */
    public java.lang.String getSerial() {
      java.lang.Object ref = serial_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serial_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
     * @return The bytes for serial.
     */
    public com.google.protobuf.ByteString
        getSerialBytes() {
      java.lang.Object ref = serial_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serial_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
     * @param value The serial to set.
     * @return This builder for chaining.
     */
    public Builder setSerial(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      serial_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSerial() {
      serial_ = getDefaultInstance().getSerial();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
     * @param value The bytes for serial to set.
     * @return This builder for chaining.
     */
    public Builder setSerialBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      serial_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:akash.cert.v1beta3.CertificateResponse)
  }

  // @@protoc_insertion_point(class_scope:akash.cert.v1beta3.CertificateResponse)
  private static final com.akash.cert.v1beta3.CertificateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.cert.v1beta3.CertificateResponse();
  }

  public static com.akash.cert.v1beta3.CertificateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CertificateResponse>
      PARSER = new com.google.protobuf.AbstractParser<CertificateResponse>() {
    @java.lang.Override
    public CertificateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CertificateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CertificateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.cert.v1beta3.CertificateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

